import {ReactComponent as MoneyIcon} from "../../assets/img/money.svg";
import './styles.css';

function Navbar() {
    return(
        <header>
            <nav className="container">
                <div className="loansim-nav-content">
                    <h1>Company </h1>
                    <a className="a-navbar" href="https://github.com/hil-beer-t" target="_blank" rel="noreferrer">
                        <div className="loansim-contact-container">
                            <MoneyIcon />
                            <p className="loansim-contact-link">LoanSim</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;