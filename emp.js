<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <script>
        class Person{
        constructor(name,age){

        this.name = name;
        this.age = age;
     }

}
class employee extends Person{
    constructor(name,age,role,phone){
        super(name,age);
        this.role = role;
        this.phone = phone;
    }
    getDetails(){
        document.write("Name: " + `${this.name}` + "<br></br>" + "Age:" + `${this.age}` + "<br></br>" +"Role:" + `${this.role}` + "<br></br>" + "Phone:" + `${this.phone}` + "<br></br>");
    
        

    }
}
let E = new employee("Beron",24,"Technology Anlogist",934256732);
E.getDetails();
    </script>
</body>
</html>
