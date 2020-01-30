package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.defaultCountingOutRhymer;
import edu.kis.vh.nursery.FIFORhymer;
import edu.kis.vh.nursery.HanoiRhymer;
import edu.kis.vh.nursery.factory.Rhymersfactory;

public class DefaultRhymersFactory implements Rhymersfactory {
	/**
	 * Default class for accessing different Rhymers.
	 */

	@Override
	public defaultCountingOutRhymer GetStandardRhymer() {
		/**
		 * @return Default counting out rhymer.
		 */
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFalseRhymer() {
		/**
		 * @return Default counting out rhymer.
		 */
		return new defaultCountingOutRhymer();
	}

	@Override
	public defaultCountingOutRhymer GetFIFORhymer() {
		/**
		 * @return FIFO rhymer.
		 */
		return new FIFORhymer();
	}

	@Override
	public defaultCountingOutRhymer GetHanoiRhymer() {
		/**
		 * @return Hanoi rhymer.
		 */
		return new HanoiRhymer();
	}

}
