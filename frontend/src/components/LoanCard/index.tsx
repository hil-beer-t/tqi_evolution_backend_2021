import '../../pages/Feed/assets/bootstrap/css/bootstrap.min.css';
import '../../pages/Feed/assets/css/List-item.css';
import '../../pages/Feed/assets/css/styles.css';
import {LoanSim} from "../../types/loanSimApi";

type Props = {
    loanSim: LoanSim;
}

function MovieCard({ loanSim } : Props) {

    return (
        <div className="card card-feed">
            <div  key={loanSim.id} className="card-body card-body-feed">
                <h4 className="card-title h4-feed" >Código: {loanSim.cod}</h4>
                <p className="card-text">Valor: {loanSim.value}</p>
                <p className="card-text p-feed" >Prestações: {loanSim.numMonths}&nbsp;</p>
                <button className="btn-feed btn btn-primary" type="button" >
                    Detalhes
                </button>
            </div>
        </div>
    );
}

export default MovieCard;