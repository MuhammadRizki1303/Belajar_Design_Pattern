# analisa praktikum
Pada program ini terdapat 2 interface yaitu QuackBehavior yang memiliki abstrack method quack dan FlyBehavior yang memiliki abstrack method fly. Dan terdapat 6 subclass  untuk mengimplamentasi dari quackbahavior (Quack, Squeak, dan MuteQuack)  dan flybehavior (FlywithWing, FlynoWay, dan FlywithRocketPower) dan setiap subclass mengimplementasi abstrack method yang ada di QuackBehavior dan FlyBehavior. Dan terdapat abstrack class yaitu duck, class duck memiliki dua atribut yaitu quackBehavior dan flyBehavior yang merupakan objek dari interface QuackBehavior dan FlyBehavior supaya dapat diubah pada saat runtime dengan memberikan objek yang sesuai dengan interface yang telah ditentukan. Dan terdapat abstrack void display supaya menunjukkan bahwa setiap subclass dari Duck harus mengimplementasikan method ini walaupun implementasinya berbeda-beda atau bisa dibilang sebagai kontrak untuk setiap subclass harus memiliki method ini. Method swim() adalah method konkrit yang mengimplementasikan perilaku berenang untuk setiap Duck. Ini bisa langsung dipanggil dari instance/objek Duck. Method performQuack() dan performFly() adalah method konkrit lainnya yang memanggil method quack() dan fly() yang diimplementasikan oleh objek yang disimpan dalam atribut quackBehavior dan flyBehavior. Dengan cara ini, perilaku quack dan fly dari setiap Duck dapat diubah dengan memasukkan objek yang sesuai saat runtime. Method setFlyBehavior(FlyBehavior fb) dan setQuackBehavior(QuackBehavior qb) adalah setter yang memungkinkan perilaku terbang dan bunyi dari Duck diubah secara dinamis dengan memberikan objek FlyBehavior dan QuackBehavior yang baru. Lalu ada 5 class turunan yang mengimplementasi dari Class Duck. Di masing-masing kelas tersebut ada dibuat constructor yang berisi pembuatan 2 objek dan mengimplementasi abstrack method dengan nama “display” yang merupakan kontrak method yang wajib ada disetiap subclass.