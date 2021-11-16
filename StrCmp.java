//Takes two strings and compares degree of similarity
public class StrCmp {
    
    public double Cmp(String UserInput, String FileName){
        int i, j, counter = 0, inputLength, cmpLimit, compared = 0;
        

        inputLength = UserInput.length();
        if(inputLength > FileName.length())
            inputLength = FileName.length();

        if(FileName.contains(UserInput)){
            return 1.0;
        }else{
            return 0;
        }
            

        // for(i = 0; i < inputLength; i++){

        //     if(FileName.substring(i, i + 1).equals(UserInput.substring(0, 1))){
                
        //         cmpLimit = i + inputLength;

        //         if(cmpLimit > FileName.length()){
        //             cmpLimit = FileName.length();
        //         }

        //         compared = 0;

        //         for(j = i; j < cmpLimit; j++){
        //             if(UserInput.substring(compared, compared + 1).equals(FileName.substring(j, j + 1))){
        //                 counter++;
        //             }
        //             compared++;
        //         }

        //     }

        // }

        //return (double) counter / (double) compared;
    }

}
