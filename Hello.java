class Hello {
    // static void testtry(int a){
    //     try{
    //         if(a==1) a = a/(a-a); //divide by zero
    //         if(a==2){
    //             int[] c = {1};
    //             c[42] = 99;
    //         }
    //     }
    //     catch(ArrayIndexOutOfBoundsException e){
    //         System.out.println("Array index out-of-bounds: " + e);
    //     }
    // }
    public static void main(String[] args){
        int i = -10;
        System.out.println(--i);
        System.out.println(i++);
        // try{
        //     int a = args.length;
        //     int b = 42/a;
        //     System.out.println("a = " + a);
        //     testtry(a);
        // }
        // catch(ArithmeticException e){
        //     System.out.println("Divide by 0: " + e);
        // }
        // int[] month_days = new int[12];
        // month_days[0] = 31;
        // month_days[1] = 28;
        // month_days[2] = 31;
        // month_days[3] = 30;
        // month_days[4] = 31;
        // month_days[5] = 30;
        // month_days[6] = 31;
        // month_days[7] = 31;
        // month_days[8] = 30;
        // month_days[9] = 31;
        // month_days[10] = 30;
        // month_days[11] = 31;
        // System.out.println("April has " + month_days[3] + " days.");
        // char ch = 'x';
        // System.out.println(ch);
        // ch++;
        // System.out.println(ch);
        // Demonstrate the basic arithmetic operators.

    // arithmetic using integers
//     System.out.println("Integer Arithmetic");
//     int a = 1 + 1;
//     int b = a * 3;
//     int c = b / 4;
//     int d = c - a;
//     int e = -d;
//     System.out.println("a = " + a); // a = 2
//     System.out.println("b = " + b); // b = 6
//     System.out.println("c = " + c); // c = 1
//     System.out.println("d = " + d); // d = -1
//     System.out.println("e = " + e); // e = 1
//     // arithmetic using doubles
//     System.out.println("\nFloating Point Arithmetic");
//     double da = 1 + 1;
//     double db = da * 3;
//     double dc = db / 4;
//     double dd = dc - a;
//     double de = -dd;
//     System.out.println("da = " + da); // da = 2.0
//     System.out.println("db = " + db); // db = 6.0
//     System.out.println("dc = " + dc); // dc = 1.5
//     System.out.println("dd = " + dd); // dd = -0.5
//     System.out.println("de = " + de); // de = 0.5
//     int x = 42;
// double y = 42.25;
// System.out.println("x mod 10 = " + x % 10); // x mod 10 = 2
// System.out.println("y mod 10 = " + y % 10); // y mod 10 = 2.25
// int a = 1;
// int b = 2;
// int c;
// int d;
// c = ++b;
// d = a++;
// c++;
// System.out.println("a = " + a); // a = 2
// System.out.println("b = " + b); // b = 3
// System.out.println("c = " + c); // c = 4
// System.out.println("d = " + d); // d = 1
// String[] binary = {
//     "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
//     "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
//     };
    // int a = 3; // 0 + 2 + 1 or 0011 in binary
    // int b = 6; // 4 + 2 + 0 or 0110 in binary
    // int c = a | b;
    // int d = a & b;
    // int e = a ^ b;
    // int f = (~a & b)|(a & ~b);
    // int g = ~a & 0x0f;
    // int h = 0x0f;
    
    // System.out.println(" a = " + binary[a]);
    // System.out.println(" b = " + binary[b]);
    // System.out.println(" a|b = " + binary[c]);
    // System.out.println(" a&b = " + binary[d]);
    // System.out.println(" a^b = " + binary[e]);
    // System.out.println("~a&b|a&~b = " + binary[f]);
    // System.out.println(" ~a = " + binary[g]);
    // System.out.println(g);
    // System.out.println(h);
    // byte a = 64, b;
    // int i;
    // i = a << 2;
    // b = (byte) (a << 2);
    // System.out.println(a);
    // System.out.println("i and b : " + i + " " + b);
    // int w =  2147483632 / 1073741816;
    // System.out.println(w);
    // char[] hex = {
    //     '0', '1', '2', '3', '4', '5', '6', '7',
    //     '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
    //     };
    //     byte b = (byte) 0xf1;
    //     System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    //     byte c = (byte)((b >> 4) & 0x0f);
    //     System.out.println(b);
    //     System.out.println(c);
    
    
        // if(args.length > 0){
        //     double a = Double.parseDouble(args[0]);
        //     double b = Double.parseDouble(args[1]);
        //     System.out.println(a);
            // System.out.println("The command line arguments are:");
            // for(String val : args)
            // System.out.println(val);
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < a; j++){
            //         if(i == 0 || j == 0 || i == a - 1 || j == a - 1)
            //             System.out.print("*");
            //         else
            //             System.out.print(" ");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 1; i <= a; i++){
            //     for(j = 1; j <= a; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j <= i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     // for(j = 0; j < i; j++){
            //     //     System.out.print(" ");
            //     // }
            //     for(j = 0; j <= i; j++){
                    
            //         if(i == 0 || j == 0 || j == i || i == a -1 || j == a - 1){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < i; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j < (2*a - 2*i - 1); j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < a - i; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j <= 2*i; j++){
            //         if(i == 0 || j == 0  ||i == a - 1 || j == 2*i){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j =  0; j < (a-i); j++){
            //         System.out.print(" ");
            //     }
            //     // for(j = 0; j <  (2*i+1); j++){
            //     //     System.out.print("*");
            //     // }
                
            //         for(j = 0; j <  (2*i+1); j++){
            //             if(i == 0 || j == 0 || j == 2*i){
            //             System.out.print("*");
            //             }
            //             else{
            //                 System.out.print(" ");
            //             }
            //         }
                
            //     System.out.println();
            // }
            // for(i = 0; i < a - 1; i++){
            //     for(j = 0; j <= i + 1; j++){
            //         System.out.print(" ");
            //     }
                
            //         for(j = 0; j < 2*(a - i) - 3; j++){
            //             if(j == 0 || j == 2*(a - i) - 4 || i == a - 2){
            //             System.out.print("*");
            //             }
            //             else{
            //                 System.out.print(" ");
            //             }
            //         }
                
            //     // for(j = 0; j < 2*(a - i) - 3; j++){
            //     //     System.out.print("*");
            //     // }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < i; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j < 2*(a - i) - 1; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(i = 1; i < a; i++){
            //     for(j = 1; j < a - i; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j < 2*i+1; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j <= i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(i = 1; i < a; i++){
            //     for(j = 0; j < a - i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < a - i; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j <= i; j++) {
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // for(i = 1; i < a; i++){
            //     for(j = 0; j <= i; j++) {
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j < a - i; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < a; j++){
            //         if(i == j || i + j == a - 1){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < a; j++){
            //         if((i==a/2) || (j == a/2)){
            //             System.out.print("*");
            //         }
            //         else{
            //             System.out.print(" ");
            //         }
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < a - i; j++){
            //         System.out.print(" ");
            //     }
            //     for(j = 0; j <= i; j++){
            //         System.out.print(j+1 + " ");
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 1; i <= a; i++){
            //     for(j = 1; j <= a - i; j++){
            //         System.out.print(" ");
            //     }
            //     int x = 1;
            //     for(j = 1; j <= i; j++){
            //         System.out.print(x + " ");
            //         x = x * (i - j)/j;
            //     }
            //     System.out.println();
            // }
            // int i, j;
            // for(i = 0; i < a; i++){
            //     for(j = 0; j < i; j++){
            //         System.out.print(" ");
            //     }
            //     for( j = 0; j < a - i; j++){
            //         System.out.print("*");
            //     }
            //     for(j = 0; j < a - i -1; j++){
            //         System.out.print("*");
            //     }
            //     System.out.println();
            // }
            
    //         double c = Math.sqrt(a * a + b * b);
    //         System.out.println(c);
    //     }
    //     else
    //         System.out.println("No command line arguments found.");
    }
}

//    1
//   1 1
//  1 2 1
// x = x * (i - j) / j