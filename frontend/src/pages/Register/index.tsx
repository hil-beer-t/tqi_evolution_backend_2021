import './assets/bootstrap/css/bootstrap.min.css'
import './assets/css/Registration-Form-with-Photo.css'
import './assets/css/styles.css'
import React from "react";
import {validateEmail} from "../../utils/validateEmail";
import axios, {AxiosRequestConfig} from "axios";
import {BASE_URL} from "../../utils/requests";
import {useNavigate} from "react-router-dom";


function Register(){

    const navigate = useNavigate();

    function handleSubmit (event: React.FormEvent<HTMLFormElement>){
        event.preventDefault();

        const name = (event.target as any).name.value;
        const email = (event.target as any).email.value;
        const cpf = (event.target as any).cpf.value;
        const rg = (event.target as any).rg.value;
        const password = (event.target as any).password.value;
        const address = (event.target as any).address.value;
        const income = (event.target as any).income.value;

        if (!validateEmail(email)){
            return;
        }

        const config: AxiosRequestConfig = {
            baseURL: BASE_URL,
            method: 'POST',
            url: '/clients',
            data: {
                name: name,
                email: email,
                cpf: cpf,
                rg: rg,
                password: password,
                address: address,
                income: income
            }
        }

        axios(config).then(response => {
            navigate("/login");
        })

    }

    return <>
        <section className="register-photo">
            <div className="form-container">
                <div className="image-holder" />
                <form onSubmit={handleSubmit}>
                    <h2 className="text-center"><strong>Crie&nbsp;</strong>uma conta.</h2>
                    <div className="mb-3"><input className="form-control" type="email" name="email" placeholder="Email" /></div>
                    <div className="mb-3"><input className="form-control" type="password" name="password" placeholder="Senha" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="name" placeholder="Nome" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="cpf" placeholder="Cpf" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="rg" placeholder="Rg" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="address" placeholder="Endereço" /></div>
                    <div className="mb-3"><input className="form-control" type="number" name="income" placeholder="Renda" /></div>
                    <div className="mb-3">
                        <div className="form-check"><label className="form-check-label"><input
                            className="form-check-input" type="checkbox"/>Eu aceito os termos de uso.</label></div>
                    </div>
                    <div className="mb-3"><button className="btn btn-primary d-block w-100" type="submit">Registrar</button></div><a className="already" href="#" >Já possui uma conta ? Entre aqui.</a>
                </form>
            </div>
        </section>
        <script src="assets/bootstrap/js/bootstrap.min.js"/>
    </>
}

export default Register;


