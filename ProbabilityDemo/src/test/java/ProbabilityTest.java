import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
    private Probability pro;

    @BeforeEach
    public void setup() {
        pro = new Probability();
    }

    @Test
    public void checkIfProbabilityOfGettingHeadAndTailIsEqual() {
        assertEquals(pro.probabilityOfEvent(1, 2), pro.probabilityOfEvent(1, 2));
    }

    @Test
    public void checkProbabilityOfHeadAndTailOccurringTogether() {
        double actualProbability = pro.probabilityOfEvent(1, 2) * pro.probabilityOfEvent(1, 2);
        assertEquals(0.25, actualProbability);

    }

    @Test
    public void checkProbabilityOfNotGettingAtleastOneHeadWhileTossingTwoCoins() {
        double actualProbability = 1 - pro.probabilityOfEvent(3, 4);
        assertEquals(0.25, actualProbability);
    }

    @Test
    public void checkProbabilityOfGettingEitherHeadOrTailWhileTossingOneCoin() {
        double actualProbability = pro.probabilityOfEvent(1, 2) + pro.probabilityOfEvent(1, 2);
        assertEquals(1, actualProbability);
    }

}
