class GroovyTypes {
    static name
    static void main(String[] args) {
        String data = "String"
        name = "Ajinkya"
        println(name)
        data = 101
        char b = data.charAt(1)
        println(b)
        println(data.class.name)
        println(name.class.name)
        println("Name: " + name)
    }
}
