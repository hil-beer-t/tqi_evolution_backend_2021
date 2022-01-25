import moment from 'moment';

export function validateLoanSimDate(day: any, monthYear: any) {

    const year : String = monthYear.split("-")[0]
    const month : String = monthYear.split("-")[1]

    /*
    * Using Date()
    * */
    const today = new Date();
    const loanDate = new Date(`${month}/${day}/${year}`);
    const diffTime = Math.abs((loanDate as any) - (today as any));
    const diffDays = Math.ceil(diffTime / (1000 * 60 * 60 * 24));

    if(diffDays > 91){

        alert("Primeira parcela não pode exceder 90 dias da data atual.")

        return false
    }

    /*
    * Using Moment.js
    * */
    // var today = moment(new Date(),'M/D/');
    // var loanDate = moment(`${month}/${day}/${YYYYyear}`,'M/D/YYYY');
    // var diffMonths = today.diff(loanDate, 'month');
    // alert(diffMonths);

    return true;

}