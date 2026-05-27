public Account(String requestedName) {
    String name = requestedName;
    int i = 1;

    while (!isAvailable(name)) {
        name = requestedName + i;
        i++;
    }

    username = name;
}
