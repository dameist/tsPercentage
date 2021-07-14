public class gameStats {
    private double points;
    private double fieldGoalAttempts;
    private double freeThrowAttempts;
    private double trueShootingPercentage;
    public gameStats(double points, double fieldGoalAttempts, double freeThrowAttempts){
        this.points = points;
        this.fieldGoalAttempts = fieldGoalAttempts;
        this.freeThrowAttempts = freeThrowAttempts;
    }

    public double getPoints() {
        return points;
    }

    public double getFieldGoalAttempts() {
        return fieldGoalAttempts;
    }

    public double getFreeThrowAttempts() {
        return freeThrowAttempts;
    }

    public double getTrueShootingPercentage() {
        trueShootingPercentage = points / (2* (fieldGoalAttempts + 0.44 * freeThrowAttempts));
        return trueShootingPercentage;
    }
}
