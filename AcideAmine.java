@@ -0,0 +1,389 @@
//Rivemale Thomas RIVT02079205

package Tp1;

import java.util.ArrayList;
import java.util.Arrays;

public class AcideAmine extends ArrayList<String> {
    private ArrayList<String> abreviation;
    private ArrayList<ArrayList<String>> tabCodons;
    private ArrayList<String> ala;
    private ArrayList<String> arg;
    private ArrayList<String> asn;
    private ArrayList<String> asp;
    private ArrayList<String> cys;
    private ArrayList<String> glu;
    private ArrayList<String> gln;
    private ArrayList<String> gly;
    private ArrayList<String> his;
    private ArrayList<String> ile;
    private ArrayList<String> leu;
    private ArrayList<String> lys;
    private ArrayList<String> met;
    private ArrayList<String> phe;
    private ArrayList<String> pro;
    private ArrayList<String> pyl;
    private ArrayList<String> sec;
    private ArrayList<String> ser;
    private ArrayList<String> thr;
    private ArrayList<String> trp;
    private ArrayList<String> tyr;
    private ArrayList<String> val;

    /* =========================================================== */
    //Constructeur par default qui creer tous les arraylist dont on a besoin
    public AcideAmine() {
        super();
        abreviation = new ArrayList<String>(
                Arrays.asList("Ala", "Arg", "Asn", "Asp", "Cys", "Glu", "Gln", "Gly", "His", "Ile", "Leu", "Lys", "Met", "Phe", "Pro", "Pyl", "Sec", "Ser", "Thr", "Trp", "Tyr", "Val")
        );
        // 1
        ala = new ArrayList<String>(
                Arrays.asList("GCU", "GCC", "GCA", "GCG")
        );
        // 2
        arg = new ArrayList<String>(
                Arrays.asList("CGU", "CGC", "CGA", "CGG", "AGA", "AGG")
        );
        // 3
        asn = new ArrayList<String>(
                Arrays.asList("AAU", "AAC")
        );
        // 4
        asp = new ArrayList<String>(
                Arrays.asList("GAU", "GAC")
        );
        // 5
        cys = new ArrayList<String>(
                Arrays.asList("UGU", "UGC")
        );

        // 6
        glu = new ArrayList<String>(
                Arrays.asList("GAA", "GAG")
        );

        // 7
        gln = new ArrayList<String>(
                Arrays.asList("CAA", "CAG")
        );

        // 8
        gly = new ArrayList<String>(
                Arrays.asList("GGU", "GGC", "GGA", "GGG")
        );

        // 9
        his = new ArrayList<String>(
                Arrays.asList("CAU", "CAC")
        );
        // 10
        ile = new ArrayList<String>(
                Arrays.asList("AUU", "AUC", "AUA")
        );
        // 11
        leu = new ArrayList<String>(
                Arrays.asList("UUA", "UUG", "CUU", "CUC", "CUA", "CUG")
        );
        // 12
        lys = new ArrayList<String>(
                Arrays.asList("AAA", "AAG")
        );
        // 13
        met = new ArrayList<String>(
                Arrays.asList("AUG")
        );
        // 14
        phe = new ArrayList<String>(
                Arrays.asList("UUU", "UUC")
        );
        // 15
        pro = new ArrayList<String>(
                Arrays.asList("CCU", "CCC", "CCA", "CCG")
        );
        // 16
        pyl = new ArrayList<String>(
                Arrays.asList("UAG")
        );
        // 17
        sec = new ArrayList<String>(
                Arrays.asList("UGA")
        );
        // 18
        ser = new ArrayList<String>(
                Arrays.asList("UCU", "UCC", "UCA", "UCG", "AGU", "AGC")
        );
        // 19
        thr = new ArrayList<String>(
                Arrays.asList("ACU", "ACC", "ACA", "ACG")
        );
        // 20
        trp = new ArrayList<String>(
                Arrays.asList("UGG")
        );
        // 21
        tyr = new ArrayList<String>(
                Arrays.asList("UAU", "UAC")
        );
        // 22
        val = new ArrayList<String>(
                Arrays.asList("GUU", "GUC", "GUA", "GUG")
        );

        tabCodons = new ArrayList<ArrayList<String>>(
                Arrays.asList(ala, arg, asn, asp, cys, glu, gln, gly, his, ile, leu, lys, met, phe, pro, pyl, sec, ser, thr, trp, tyr, val)
        );

    }

    /* ===============Accesseurs & Mutateurs====================== */

    public AcideAmine(ArrayList<String> abreviation) {
        abreviation = abreviation;
    }

    public void setAbreviation(ArrayList<String> abreviation) {
        this.abreviation = abreviation;
    }

    public ArrayList<String> getAbreviation() {

        return abreviation;
    }

    public String getAbreviationAtIndex(int index) {
        return abreviation.get(index);
    }
    /* =========================================================== */

    public ArrayList<ArrayList<String>> getTabCodons() {
        return tabCodons;
    }

    public void setTabCodons(ArrayList<ArrayList<String>> tabCodons) {
        this.tabCodons = tabCodons;
    }

    /* =========================================================== */

    public ArrayList<String> getAla() {
        return ala;
    }

    public void setAla(ArrayList<String> ala) {
        this.ala = ala;
    }

    /* =========================================================== */

    public ArrayList<String> getArg() {
        return arg;
    }

    public void setArg(ArrayList<String> arg) {
        this.arg = arg;
    }

    /* =========================================================== */

    public ArrayList<String> getAsn() {
        return asn;
    }

    public void setAsn(ArrayList<String> asn) {
        this.asn = asn;
    }

    /* =========================================================== */

    public ArrayList<String> getAsp() {
        return asp;
    }

    public void setAsp(ArrayList<String> asp) {
        this.asp = asp;
    }

    /* =========================================================== */

    public ArrayList<String> getCys() {
        return cys;
    }

    public void setCys(ArrayList<String> cys) {
        this.cys = cys;
    }

    /* =========================================================== */

    public ArrayList<String> getGlu() {
        return glu;
    }

    public void setGlu(ArrayList<String> glu) {
        this.glu = glu;
    }

    /* =========================================================== */

    public ArrayList<String> getGln() {
        return gln;
    }

    public void setGln(ArrayList<String> gln) {
        this.gln = gln;
    }

    /* =========================================================== */

    public ArrayList<String> getGly() {
        return gly;
    }

    public void setGly(ArrayList<String> gly) {
        this.gly = gly;
    }

    /* =========================================================== */

    public ArrayList<String> getHis() {
        return his;
    }

    public void setHis(ArrayList<String> his) {
        this.his = his;
    }

    /* =========================================================== */

    public ArrayList<String> getIle() {
        return ile;
    }

    public void setIle(ArrayList<String> ile) {
        this.ile = ile;
    }

    /* =========================================================== */

    public ArrayList<String> getLeu() {
        return leu;
    }

    public void setLeu(ArrayList<String> leu) {
        this.leu = leu;
    }

    /* =========================================================== */

    public ArrayList<String> getLys() {
        return lys;
    }

    public void setLys(ArrayList<String> lys) {
        this.lys = lys;
    }

    /* =========================================================== */

    public ArrayList<String> getMet() {
        return met;
    }

    public void setMet(ArrayList<String> met) {
        this.met = met;
    }

    /* =========================================================== */

    public ArrayList<String> getPhe() {
        return phe;
    }

    public void setPhe(ArrayList<String> phe) {
        this.phe = phe;
    }

    /* =========================================================== */

    public ArrayList<String> getPro() {
        return pro;
    }

    public void setPro(ArrayList<String> pro) {
        this.pro = pro;
    }

    /* =========================================================== */

    public ArrayList<String> getPyl() {
        return pyl;
    }

    public void setPil(ArrayList<String> pyl) {
        this.pyl = pyl;
    }

    /* =========================================================== */

    public ArrayList<String> getSec() {
        return sec;
    }

    public void setSec(ArrayList<String> sec) {
        this.sec = sec;
    }

    /* =========================================================== */

    public ArrayList<String> getSer() {
        return ser;
    }

    public void setSer(ArrayList<String> ser) {
        this.ser = ser;
    }

    /* =========================================================== */

    public ArrayList<String> getThr() {
        return thr;
    }

    public void setThr(ArrayList<String> thr) {
        this.thr = thr;
    }

    /* =========================================================== */

    public ArrayList<String> getTrp() {
        return trp;
    }

    public void setTrp(ArrayList<String> trp) {
        this.trp = trp;
    }

    /* =========================================================== */

    public ArrayList<String> getTyr() {
        return tyr;
    }

    public void setTyr(ArrayList<String> tyr) {
        this.tyr = tyr;
    }

    /* =========================================================== */

    public ArrayList<String> getVal() {
        return val;
    }

    public void setVal(ArrayList<String> val) {
        this.val = val;
    }

    /* =========================================================== */
}
