package defpackage;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class ooi0 implements uov.a {
    public final String a;
    public final String b;

    public ooi0(String str, String str2) {
        this.a = fy0.c(str);
        this.b = str2;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // uov.a
    public final void b(qjv.a aVar) {
        String str = this.a;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS")) {
                    b = 0;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS")) {
                    b = 1;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER")) {
                    b = 2;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 3;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    b = 4;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 5;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 6;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER")) {
                    b = 7;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 8;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 9;
                }
                break;
        }
        String str2 = this.b;
        switch (b) {
            case 0:
                Integer numU = c0p.u(str2);
                if (numU != null) {
                    aVar.i = numU;
                }
                break;
            case 1:
                Integer numU2 = c0p.u(str2);
                if (numU2 != null) {
                    aVar.v = numU2;
                }
                break;
            case 2:
                Integer numU3 = c0p.u(str2);
                if (numU3 != null) {
                    aVar.h = numU3;
                }
                break;
            case 3:
                aVar.c = str2;
                break;
            case 4:
                aVar.w = str2;
                break;
            case 5:
                aVar.a = str2;
                break;
            case 6:
                aVar.e = str2;
                break;
            case 7:
                Integer numU4 = c0p.u(str2);
                if (numU4 != null) {
                    aVar.u = numU4;
                }
                break;
            case 8:
                aVar.d = str2;
                break;
            case 9:
                aVar.b = str2;
                break;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ooi0 ooi0Var = (ooi0) obj;
            if (this.a.equals(ooi0Var.a) && this.b.equals(ooi0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + gmf0.a(527, 31, this.a);
    }

    public final String toString() {
        return "VC: " + this.a + "=" + this.b;
    }
}
