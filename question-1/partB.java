public String getShortenedName(){
  String shortened = "";
  int i = 0;
  while(i < username.length()) {
    if(i + 1 < username.length && username.substring(i + 1, i + 2).equals("-")) {
      i += 2;
    } else {
      shortened += usernmae.substring(i, i + 1);
      i++
    }
  }
  return shortened;
}  



