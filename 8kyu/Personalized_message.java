//Create a function that gives a personalized greeting. This function takes two parameters: name and owner.
//
//Use conditionals to return the proper message:
//
//        case					return
//name equals owner	'Hello boss'
//otherwise			'Hello guest'

//Minha solução

class Personalized_message {
    static String greet(String name, String owner) {
        //Se valor da variavel name e valor da varial owner forem iguais, retorna Hello boss
        if(name.equals(owner)){
            return "Hello boss";
        }
        //qualquer outra combinação de valores, retorna Hello guest
        return "Hello guest";
    }
}