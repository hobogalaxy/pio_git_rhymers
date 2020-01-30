package edu.kis.vh.nursery;

import edu.kis.vh.nursery.defaultCountingOutRhymer;

public class HanoiRhymer extends defaultCountingOutRhymer {

	int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
		totalRejected++;
	else
		super.countIn(in);
	}


//	alt + ← oraz alt + →. Te kombinacje umożliwiają przełączanie się między otwartymi w IDE plikami.
}
