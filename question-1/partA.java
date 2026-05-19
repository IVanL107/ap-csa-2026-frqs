public Account(String requestedName){
  username = requestedName;
  int i = 1;
  while(!(isAvailable(requestedName))){
    username = requestedName + i;
    i++;
  }
}
