package chen.ImperialWalker;

import java.util.ArrayList;

import chen.ENUMS.StormTrooper;

public interface Transportable {
	abstract void embarkTroopers(ArrayList<StormTrooper> S);
	abstract void disembarkTroopers();
}

