class Contestant {
    private String name;
    private int score;

    public Contestant(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // TODO: Implement compareTo to compare by score (descending)
    // Return -1 if this contestant's score is higher, 1 if lower, 0 if equal
    public int compareTo(Contestant other) {
      if(this.getScore()<other.getScore()){
        return 1;
      }else if(this.getScore()>other.getScore()){
        return -1;
      } else{return 0;}
    }
}
