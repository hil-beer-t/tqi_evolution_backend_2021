import './assets/bootstrap/css/bootstrap.min.css'
import './assets/css/Registration-Form-with-Photo.css'
import './assets/css/styles.css'

function Register(){
    return <>
        <section className="register-photo">
            <div className="form-container">
                <div className="image-holder" />
                <form method="post">
                    <h2 className="text-center"><strong>Crie&nbsp;</strong>uma conta.</h2>
                    <div className="mb-3"><input className="form-control" type="email" name="email" placeholder="Email" /></div>
                    <div className="mb-3"><input className="form-control" type="password" name="password" placeholder="Senha" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="name" placeholder="Nome" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="cpf" placeholder="Cpf" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="rg" placeholder="Rg" /></div>
                    <div className="mb-3"><input className="form-control" type="text" name="address" placeholder="Endereço" /></div>
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


