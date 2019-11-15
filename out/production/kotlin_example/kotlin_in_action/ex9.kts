package kotlin_in_action

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println("Address was changed for $name: $field -> $value")
            field = value
        }
}

val user = User("Alice")
user.address = "ADDRESS"
user.address = "MY_ADDRESS"