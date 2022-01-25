import './assets/bootstrap/css/bootstrap.min.css';
import './assets/css/Registration-Form-with-Photo.css';
import './assets/css/styles.css';
import {useNavigate} from "react-router-dom";
import React from "react";
import axios, {AxiosRequestConfig} from "axios";
import {BASE_URL} from "../../utils/requests";
import {useParams} from "react-router";
import {validateLoanSimDate} from "../../utils/validateLoanSimDate";
import momentZ from 'moment';

function LoanSim() {

    let {clientId} = useParams();

    const navigate = useNavigate();

    function handleSubmit (event: React.FormEvent<HTMLFormElement>){

        event.preventDefault();

        const value = (event.target as any).value.value;
        const numMonths = (event.target as any).numMonths.value;
        const bestDay = (event.target as any).bestDay.value;
        const month = (event.target as any).month.value;
        const newMonthString : string = month.split("-")[1];
        const newMonthNumber : number = parseInt(newMonthString)-1;

        const moment = momentZ().toISOString(false);

        if(!validateLoanSimDate(bestDay, month)){
            return;
        }

        const config: AxiosRequestConfig = {
            baseURL: BASE_URL,
            method: 'POST',
            url: `clients/${clientId}/create-loan-sim`,
            data: {
                value:value,
                numMonths:numMonths,
                bestDay:bestDay,
                firstMonth:newMonthNumber,
                moment:moment
            }
        }

        axios(config).then(response => {
            navigate(`../${clientId}`)
        })

    }

    return <>
        <section className="register-photo">
            <div className="form-container">
                <form onSubmit={handleSubmit} className="form">
                    <h2 className="text-center h2-loan" ><strong>Simule&nbsp;</strong>um
                        empréstimo.</h2>
                    <div className="mb-3"><label className="form-label">Valor</label>
                        <input required
                        className="border rounded form-control" type="number" placeholder="R$ 0,00" name="value"/></div>
                    <div className="mb-3"><label className="form-label">Número de parcelas</label><input required
                        className="border rounded form-control" type="number" name="numMonths" data-bs-toggle="tooltip"
                        data-bss-tooltip="" data-bs-placement="right" min="0" max="60" placeholder="60"
                        title="Máximo 60 parcelas" /></div>
                    <div className="mb-3"><label className="form-label">Dia de vencimento<br/></label><select
                        className="border rounded form-select" name="bestDay">
                        <option value="1" >01</option>
                        <option value="5">05</option>
                        <option value="10">10</option>
                        <option value="15">15</option>
                        <option value="20">20</option>
                        <option value="25">25</option>
                        <option value="30">30</option>
                    </select></div>
                    <div><label className="form-label mb-3" >Data primeira parcela<input required
                        className="form-control d-inline" data-bs-toggle="tooltip" data-bss-tooltip=""
                        data-bs-placement="right" type="month" title="Máximo 3 meses da data atual" name="month"/></label></div>
                    <div className="mb-3">
                        <button className="btn btn-primary d-block w-100 btn-loan" type="submit"
                                >Enviar
                        </button>
                    </div>
                </form>
                <div className="image-holder image-loan"> </div>
            </div>
        </section>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/bs-init.js"></script>
    </>
}


export default LoanSim;