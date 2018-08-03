public class Triangle {



    public String determineShape(int sideA, int sideB, int sideC){

        if(sideA+sideB>sideC && sideB+sideC>sideA && sideC+sideA>sideB){
            if(sideA == sideB && sideA == sideC){
                return "Equilateral";
            }
            if(sideA == sideB || sideA == sideC || sideB ==sideC){
                return "Isosceles";
            }else {

                return "Irregular";
            }

        }else{

            return "Impossible";
        }

    }

}
