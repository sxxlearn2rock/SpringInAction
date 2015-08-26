package cn.sxx.springinaction.springidol;

import java.util.Collection;

public class OnemanBand implements Performer {

	private Collection<Instrument> instruments;
	
	public OnemanBand() {
	}
	
	@Override
	public void perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

}
