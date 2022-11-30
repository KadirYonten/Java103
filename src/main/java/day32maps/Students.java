package day32maps;

public class Students {
    public String name;
    public String email;
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }

    @Override
    public String toString() {      //Note: toString() methodu objeleri konsola yazdirir.
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
   /* INTERWIEW QUESTIONS
                  MAP'LER ARASINDAKI FARKLAR
        1) HashMap ve TreeMap ve LinkedHashMap  synchronized ve thread-safe degildir.
           HashTable synchronized ve thread-safe dir.

        2) Treemap'ler natürel order yapar.
           LinkedHashMap giriş sırasına göre listeler.
           HashMap ve Hashtable sıralama yapmaz,rastgele sıralar.

        3) HashMap ve LinkedHashMap'lerde hem key hemde value için null değeri kullanılabilir.
           TreeMap'lerde key'ler icin "null" kullanılmaz.
           HashTable larda ikisi içinde null kullanılmaz.

    */