package entidades;

public class Data {
    private int dia;
    private int mes;
    private int ano;



    public Data(String dataString){
        if(dataString.length() != 10){
            throw new DataInvalidaException();
        }


        //Verificando cada caractere da data para validação dos dados
        if(!Character.isDigit(dataString.charAt(0)) || !Character.isDigit(dataString.charAt(1))){
            throw new DataInvalidaException();
        }
        if(dataString.charAt(2) != '/'){
            throw  new DataInvalidaException();
        }
        if(!Character.isDigit(dataString.charAt(3)) || !Character.isDigit(dataString.charAt(4))){
            throw  new DataInvalidaException();
        }
        if(dataString.charAt(5) != '/'){
            throw new DataInvalidaException();
        }
        if(!Character.isDigit(dataString.charAt(6)) || !Character.isDigit(dataString.charAt(7))
                || !Character.isDigit(dataString.charAt(8)) || !Character.isDigit(dataString.charAt(9))){
            throw new DataInvalidaException();
        }

        //Delimitando os espaços do dia, mes e ano
        String diaStr = dataString.substring(0, 2);
        this.dia = Integer.parseInt(diaStr);

        String mesStr = dataString.substring(3, 5);
        this.mes = Integer.parseInt(mesStr);

        String anoStr = dataString.substring(6, 10);
        this.ano = Integer.parseInt(anoStr);

        //Validando o ano com 12 meses
        if(mes < 1 || mes > 12){
            throw new DataInvalidaException();
        }

        //Validando os meses que terminam em 31
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
            if (dia < 1 || dia > 31){
                throw new DataInvalidaException();
            }
        }

        //Validando os meses que terminam em 30
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            if (dia < 1 || dia > 30){
                throw new DataInvalidaException();
            }
        }
        //Validando o mês de fevereiro
        if (mes == 2){
            if (isBissexto()){
                if (dia<1 || dia>29){
                    throw new DataInvalidaException();
                }
            }else{
                if (dia<1 || dia>28){
                    throw new DataInvalidaException();
                }
            }
        }
    }
//Getters e Setters das variaveis
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Verificando se o ano é Bissexto
    public boolean isBissexto(){
        if (ano%400 == 0){
            return true;
        }else{
            if (ano% 4 == 0 && ano % 100 != 0){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "dia = " + dia +
                "mes = " + mes +
                "ano = " + ano;
    }
}
