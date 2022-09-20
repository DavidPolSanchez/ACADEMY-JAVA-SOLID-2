package isp.bad;

public class EarningsReport {

    private Isender _sender;

    public EarningsReport(Isender sender){
        _sender = sender;
    }
    public void SendMessage(){
        _sender.Send();
    }

}