export type LoanSim = {
    "id": number,
    "cod": string,
    "status": string,
    "firstMonth": string,
    "numMonths": number,
    "moment": string,
    "bestDay": number,
    "value": number
}

export type Client = {
    "id": number,
    "name": string,
    "email": string,
    "income": number,
    "cpf": string,
    "rg": string,
    "address": string,
    "password": string,
    "loanSims": LoanSim[]
}