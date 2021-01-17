public class Guitar extends Instrument implements IPlay{

//    Each class needs this to fulfil Iplay contract
    public void playInstrument(String sound){
        this.soundMade = sound;
    }
}
