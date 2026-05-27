public int moreHistoryThanMathAbsences() {
  int count = 0;
  for(CourseRecord history : historList) {
    for(CourseRecord math : mathList) {
      if(history.getStudentID().equals(math.getStudentID()) && history.getAbsences() > math.getAbsences()) {
        count++
      }
    }
  }
  return count;
}
