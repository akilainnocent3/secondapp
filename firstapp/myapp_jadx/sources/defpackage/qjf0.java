package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class qjf0 extends q6n {
    public final String b;
    public final pcn<String> c;

    public qjf0(String str, String str2, c150 c150Var) {
        super(str);
        ly0.b(!c150Var.isEmpty());
        this.b = str2;
        pcn<String> pcnVarJ = pcn.j(c150Var);
        this.c = pcnVarJ;
        pcnVarJ.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override // uov.a
    public final void b(qjv.a aVar) {
        byte b;
        switch (this.a) {
            case "TAL":
                b = 0;
                break;
            case "TCM":
                b = 1;
                break;
            case "TDA":
                b = 2;
                break;
            case "TP1":
                b = 3;
                break;
            case "TP2":
                b = 4;
                break;
            case "TP3":
                b = 5;
                break;
            case "TRK":
                b = 6;
                break;
            case "TT2":
                b = 7;
                break;
            case "TXT":
                b = 8;
                break;
            case "TYE":
                b = 9;
                break;
            case "TALB":
                b = 10;
                break;
            case "TCOM":
                b = 11;
                break;
            case "TCON":
                b = 12;
                break;
            case "TDAT":
                b = 13;
                break;
            case "TDRC":
                b = 14;
                break;
            case "TDRL":
                b = 15;
                break;
            case "TEXT":
                b = 16;
                break;
            case "TIT2":
                b = 17;
                break;
            case "TPE1":
                b = 18;
                break;
            case "TPE2":
                b = 19;
                break;
            case "TPE3":
                b = 20;
                break;
            case "TRCK":
                b = 21;
                break;
            case "TYER":
                b = 22;
                break;
            default:
                b = -1;
                break;
        }
        pcn<String> pcnVar = this.c;
        try {
            switch (b) {
                case 0:
                case 10:
                    aVar.c = pcnVar.get(0);
                    break;
                case 1:
                case 11:
                    aVar.s = pcnVar.get(0);
                    break;
                case 2:
                case 13:
                    String str = pcnVar.get(0);
                    int i = Integer.parseInt(str.substring(2, 4));
                    int i2 = Integer.parseInt(str.substring(0, 2));
                    aVar.m = Integer.valueOf(i);
                    aVar.n = Integer.valueOf(i2);
                    break;
                case 3:
                case 18:
                    aVar.b = pcnVar.get(0);
                    break;
                case 4:
                case 19:
                    aVar.d = pcnVar.get(0);
                    break;
                case 5:
                case 20:
                    aVar.t = pcnVar.get(0);
                    break;
                case 6:
                case 21:
                    String str2 = pcnVar.get(0);
                    String str3 = jrh0.a;
                    String[] strArrSplit = str2.split("/", -1);
                    int i3 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    aVar.h = Integer.valueOf(i3);
                    aVar.i = numValueOf;
                    break;
                case 7:
                case 17:
                    aVar.a = pcnVar.get(0);
                    break;
                case 8:
                case 16:
                    aVar.r = pcnVar.get(0);
                    break;
                case 9:
                case 22:
                    aVar.l = Integer.valueOf(Integer.parseInt(pcnVar.get(0)));
                    break;
                case 12:
                    Integer numU = c0p.u(pcnVar.get(0));
                    if (numU != null) {
                        String strA = t6n.a(numU.intValue());
                        if (strA != null) {
                            aVar.w = strA;
                        }
                    } else {
                        aVar.w = pcnVar.get(0);
                    }
                    break;
                case 14:
                    ArrayList arrayListD = d(pcnVar.get(0));
                    int size = arrayListD.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                aVar.n = (Integer) arrayListD.get(2);
                            }
                        }
                        aVar.m = (Integer) arrayListD.get(1);
                    }
                    aVar.l = (Integer) arrayListD.get(0);
                    break;
                case 15:
                    ArrayList arrayListD2 = d(pcnVar.get(0));
                    int size2 = arrayListD2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                aVar.q = (Integer) arrayListD2.get(2);
                            }
                        }
                        aVar.p = (Integer) arrayListD2.get(1);
                    }
                    aVar.o = (Integer) arrayListD2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qjf0.class != obj.getClass()) {
            return false;
        }
        qjf0 qjf0Var = (qjf0) obj;
        return this.a.equals(qjf0Var.a) && Objects.equals(this.b, qjf0Var.b) && this.c.equals(qjf0Var.c);
    }

    public final int hashCode() {
        int iA = gmf0.a(527, 31, this.a);
        String str = this.b;
        return this.c.hashCode() + ((iA + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // defpackage.q6n
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
