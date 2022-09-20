class Main{
    static void main(String[] args){
        //dependencies

        Isender sender = new CSVService();

        EarningsReport earningReport = new EarningsReport(sender);
        earningReport.SendMessage();
    }
}