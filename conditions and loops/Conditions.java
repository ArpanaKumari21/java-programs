class Conditions{
    public static void main(String arg[]){
        /*
        if {}
        else{}
        */
        int salary=25400;
        if(salary>10000){
            salary=salary + 2000;
        }else{
            salary=salary+1000;
        }
        System.out.println(salary);
        //multiple if else statement
        if(salary>20000){
            salary+=2000;
        }else if(salary>10000){
            salary+=1000;
        }else{
            salary+=500;
        }
        System.out.println(salary);
    }
}