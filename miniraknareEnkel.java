import javax.swing.*;
public class miniraknareEnkel {
    public static void main(String[] args){
        String inputUttryck = "tom";
        String operand1String = "tom";
        String operand2String = "tom";
        String operator = "tom";
        double operand1 = 0;
        double operand2 = 0;
    
        inputUttryck = JOptionPane.showInputDialog("Skriv ett matematisk uttryck: ");
        inputUttryck = inputUttryck.trim();
    
            if (inputUttryck.isEmpty()){
            JOptionPane.showMessageDialog(null, "Du har inte angett ett uttryck!");
            System.exit(0);
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
                System.exit(0);
            }
            else {
                JOptionPane.showMessageDialog(null, "Ingen korrekt operator i sikte!");
                System.exit(0);
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
                System.exit(0);
                }

            double sum = 0;
            //System.out.println(operand1String + " " + operand2String);
                if(inputUttryck.indexOf("*", 0) != -1){
                    sum = tal1*tal2;
                    JOptionPane.showMessageDialog(null, sum);
                }else if(inputUttryck.indexOf("/", 0) != -1){
                    if(tal2==0){
                        JOptionPane.showMessageDialog(null, "Får ej dela med 0!");
                    System.exit(0);
                    }
                    sum = tal1/tal2;
                    JOptionPane.showMessageDialog(null, sum);
                }else if(inputUttryck.indexOf("+", 0) != -1){
                    sum = tal1+tal2; 
                    JOptionPane.showMessageDialog(null, sum);
                }else if(inputUttryck.indexOf("-", 1) != -1){
                    sum = tal1-tal2;
                    JOptionPane.showMessageDialog(null, sum);
                }
        }
    }
