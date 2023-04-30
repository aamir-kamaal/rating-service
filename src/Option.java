import java.util.Objects;

public class Option implements Comparable{

    int optId;
    String option;
    int weightage;
    boolean isSelected;

    public Option(int optId, String option, int weightage, boolean isCorrect) {
        this.optId = optId;
        this.option = option;
        this.weightage = weightage;
    }

    public int getOptId() {
        return optId;
    }

    public void setOptId(int optId) {
        this.optId = optId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getWeightage() {
        return weightage;
    }

    public void setWeightage(int weightage) {
        this.weightage = weightage;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Option option = (Option) o;
        return optId == option.optId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(optId);
    }

    @Override
    public String toString() {
        return optId +
                ". " + option + '\n';
    }

    @Override
    public int compareTo(Object o) {
        Option o1 = (Option) o;
        return this.optId > o1.optId ? 1 : -1;
    }
}
