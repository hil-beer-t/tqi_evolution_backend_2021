import './assets/bootstrap/css/bootstrap.min.css';
import './assets/css/List-item.css';
import './assets/css/styles.css';
import {useEffect, useState} from "react";
import axios from "axios";
import {Client} from "../../types/loanSimApi";
import {BASE_URL} from "../../utils/requests";
import LoanCard from "../../components/LoanCard";


function Listing() {

    const [page, setPage] = useState<Client>({
        address: "", cpf: "", email: "", id: 0, income: 0, loanSims: [], name: "", password: "", rg: ""
    });

    useEffect(() => {
        axios.get(`${BASE_URL}/clients/1`)
            .then(response => {
                const data = response.data as Client;
                setPage(data);
                console.log(data);
            });
    }, []);

    return <>

        <nav className="navbar navbar-light navbar-expand-md">
            <div className="container-fluid">
                <button data-bs-toggle="collapse" className="navbar-toggler" data-bs-target="#navcol-1"><span
                    className="visually-hidden">Toggle navigation</span><span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navcol-1">
                    <ul className="navbar-nav">
                        <li className="nav-item">
                            <a className="nav-link active a-feed" href="#">
                                Nova simulação
                                <svg xmlns="http://www.w3.org/2000/svg" width="1em" height="1em" fill="currentColor"
                                     viewBox="0 0 16 16" className="bi bi-plus svg-feed"
                                >
                                    <path
                                        d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z"></path>
                                </svg>
                            </a></li>
                        <li className="nav-item"></li>
                        <li className="nav-item"></li>
                    </ul>
                </div>
            </div>
        </nav>
        <h1 className="h1-1-feed">Suas simulações</h1>
        <div className="row">
            <div className="col">
                {page.loanSims.map(loan =>
                    <div key={loan.id}>
                        <LoanCard loanSim={loan}/>
                    </div>
                )}
            </div>
        </div>
        <script src="assets/bootstrap/js/bootstrap.min.js"/>
    </>
}

export default Listing;