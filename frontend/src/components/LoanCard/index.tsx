import '../../pages/Feed/assets/bootstrap/css/bootstrap.min.css';
import '../../pages/Feed/assets/css/List-item.css';
import '../../pages/Feed/assets/css/styles.css';
import {LoanSim} from "../../types/loanSimApi";
import {Collapse} from "react-bootstrap";
import {useState} from "react";

type Props = {
    loanSim: LoanSim;
}

function MovieCard({ loanSim } : Props) {

    const [open, setOpen] = useState(false);

    var status: string;
    if (loanSim.status === "WAITING_FOR_APPROVAL")
      status = "esperando aprovação"
    else
        status = "aprovado"

    return (
        <div className="card card-feed">
            <div className="card-body card-body-feed">
                <h4 className="card-title card-title-feed">Cód: {loanSim.cod} </h4>
                <p className="card-text">Valor: {loanSim.value} </p>
                <div className="accordion" role="tablist" id="accordion-1">
                    <div className="accordion-item">
                        <h2 className="accordion-header" role="tab">
                            <button onClick={() => setOpen(!open)} className="accordion-button"
                                    data-bs-toggle="collapse"
                                    data-bs-target="#accordion-1 .item-1" aria-expanded={open}
                                    aria-controls="accordion-1 .item-1">Detalhes
                            </button>
                        </h2>
                        <Collapse in={open}>
                            <div id="accordion-1 .item-1" role="tabpanel"
                                 data-bs-parent="#accordion-1">
                                <div className="accordion-body">
                                    <p className="p-accordion-feed">Qtd. parcelas: {loanSim.numMonths} </p>
                                    <p className="p-accordion-feed">Primeira parcela: {`${loanSim.bestDay}/${loanSim.firstMonth}`} </p>
                                    <p className="p-accordion-feed">Status: {`${status}`} </p>
                                </div>
                            </div>
                        </Collapse>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default MovieCard;