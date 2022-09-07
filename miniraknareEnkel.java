import javax.swing.*;
public class miniraknareEnkel {
    public static void main(String[] args){
        String inputUttryck = "tom";
        String operand1String = "tom";
        String operand2String = "tom";
        String operator = "tom";
        double operand1 = 0;
        double operand2 = 0;
        boolean loop = true;
        while(true){
        inputUttryck = JOptionPane.showInputDialog("Skriv ett matematisk uttryck: ");
        inputUttryck = inputUttryck.trim();
    
            if (inputUttryck.isEmpty()){
            JOptionPane.showMessageDialog(null, "Du har inte angett ett uttryck!");
            loop=true;
        }

            if(inputUttryck.indexOf("*", 0) != -1){
                operand1String = inputUttryck.substring(0, inputUttryck.indexOf("*"));
                operand2String = inputUttryck.substring(inputUttryck.indexOf("*")+1);
            }
            else if (inputUttryck.indexOf("/", 0) != -1){
                operand1String = inputUttryck.substring(0, inputUttryck.indexOf("/"));
                operand2String = inputUttryck.substring(inputUttryck.indexOf("/")+1);
            }
            else if (inputUttryck.indexOf("+", 0) != -1){
                operand1String = inputUttryck.substring(0, inputUttryck.indexOf("+"));
                operand2String = inputUttryck.substring(inputUttryck.indexOf("+")+1);
            }
            else if (inputUttryck.indexOf("-", 1) != -1){
                operand1String = inputUttryck.substring(0, inputUttryck.indexOf("-"));
                operand2String = inputUttryck.substring(inputUttryck.indexOf("-")+1);

            }
            else if (inputUttryck.indexOf("%")!=-1){
                JOptionPane.showMessageDialog(null, "Modulus ej tillåtet");
                loop=true;
                break;
            }
            else {
                JOptionPane.showMessageDialog(null, "Ingen korrekt operator i sikte!");
                loop=true;
                break;
            }
            
            double tal1 =-1;
            double tal2 =-1;
            
            try{ 
                tal1 = Double.parseDouble(operand1String.trim()); //vill ge användaren möjlighet att få rätt även om det finns mellanslag
                tal2 = Double.parseDouble(operand2String.trim());
                System.out.println(tal1 + " och " + tal2);
            }
                catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Ej korrekt angivna tal!");
                    loop=true;
                    break;
                }

            double sum = 0;
            //System.out.println(operand1String + " " + operand2String);
                if(inputUttryck.indexOf("*", 0) != -1){
                    sum = tal1*tal2;
                    JOptionPane.showMessageDialog(null, sum);
                    break;
                }else if(inputUttryck.indexOf("/", 0) != -1){
                    if(tal2==0){
                        JOptionPane.showMessageDialog(null, "Får ej dela med 0!");
                        break;
                    }
                    sum = tal1/tal2;
                    JOptionPane.showMessageDialog(null, sum);
                    break;
                }else if(inputUttryck.indexOf("+", 0) != -1){
                    sum = tal1+tal2; 
                    JOptionPane.showMessageDialog(null, sum);
                    break;
                }else if(inputUttryck.indexOf("-", 1) != -1){
                    sum = tal1-tal2;
                    JOptionPane.showMessageDialog(null, sum);
                    break;
                }else{
                JOptionPane.showMessageDialog(null, "De tal du angav är ogiltiga!");
                loop=true;
            }
        }
    }
    }
