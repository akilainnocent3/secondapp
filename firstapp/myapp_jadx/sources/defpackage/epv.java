package defpackage;

import androidx.media3.common.a;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;

/* JADX INFO: loaded from: classes.dex */
public final class epv {
    public static odv a(uov uovVar, String str) {
        int i = 0;
        while (true) {
            uov.a[] aVarArr = uovVar.a;
            if (i >= aVarArr.length) {
                return null;
            }
            uov.a aVar = aVarArr[i];
            if (aVar instanceof odv) {
                odv odvVar = (odv) aVar;
                if (odvVar.a.equals(str)) {
                    return odvVar;
                }
            }
            i++;
        }
    }

    public static ep0 b(nsz nszVar) {
        String str;
        int iJ = nszVar.j();
        if (nszVar.j() != 1684108385) {
            cft.g("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iJ2 = nszVar.j();
        byte[] bArr = l75.a;
        int i = iJ2 & 16777215;
        if (i == 13) {
            str = "image/jpeg";
        } else {
            str = i == 14 ? "image/png" : null;
        }
        if (str == null) {
            h08.a(i, "Unrecognized cover art flags: ", "MetadataUtil");
            return null;
        }
        nszVar.J(4);
        int i2 = iJ - 16;
        byte[] bArr2 = new byte[i2];
        nszVar.h(bArr2, 0, i2);
        return new ep0(3, str, null, bArr2);
    }

    public static int d(nsz nszVar) {
        int iJ = nszVar.j();
        if (nszVar.j() == 1684108385) {
            nszVar.J(8);
            int i = iJ - 16;
            if (i == 1) {
                return nszVar.w();
            }
            if (i == 2) {
                return nszVar.C();
            }
            if (i == 3) {
                return nszVar.z();
            }
            if (i == 4 && (nszVar.a[nszVar.b] & 128) == 0) {
                return nszVar.A();
            }
        }
        cft.g("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static q6n e(int i, String str, nsz nszVar, boolean z, boolean z2) {
        int iD = d(nszVar);
        if (z2) {
            iD = Math.min(1, iD);
        }
        if (iD >= 0) {
            return z ? new qjf0(str, null, pcn.n(Integer.toString(iD))) : new a98("und", str, Integer.toString(iD));
        }
        cft.g("MetadataUtil", "Failed to parse uint8 attribute: ".concat(c8w.a(i)));
        return null;
    }

    public static qjf0 f(int i, nsz nszVar, String str) {
        int iJ = nszVar.j();
        if (nszVar.j() == 1684108385) {
            nszVar.J(8);
            return new qjf0(str, null, pcn.n(nszVar.s(iJ - 16)));
        }
        cft.g("MetadataUtil", "Failed to parse text attribute: ".concat(c8w.a(i)));
        return null;
    }

    public static void g(int i, uov uovVar, a.C0062a c0062a, uov uovVar2, uov... uovVarArr) {
        if (uovVar2 == null) {
            uovVar2 = new uov(new uov.a[0]);
        }
        if (uovVar != null) {
            int i2 = 0;
            while (true) {
                uov.a[] aVarArr = uovVar.a;
                if (i2 >= aVarArr.length) {
                    break;
                }
                uov.a aVar = aVarArr[i2];
                if (aVar instanceof odv) {
                    odv odvVar = (odv) aVar;
                    if (!odvVar.a.equals("com.android.capture.fps")) {
                        uovVar2 = uovVar2.a(odvVar);
                    } else if (i == 2) {
                        uovVar2 = uovVar2.a(odvVar);
                    }
                }
                i2++;
            }
        }
        for (uov uovVar3 : uovVarArr) {
            uovVar2 = uovVar2.b(uovVar3);
        }
        if (uovVar2.a.length > 0) {
            c0062a.k = uovVar2;
        }
    }

    public static qjf0 c(int i, nsz nszVar, String str) {
        int iJ = nszVar.j();
        if (nszVar.j() == 1684108385 && iJ >= 22) {
            nszVar.J(10);
            int iC = nszVar.C();
            if (iC > 0) {
                String strA = hce0.a(iC, "");
                int iC2 = nszVar.C();
                if (iC2 > 0) {
                    strA = strA + "/" + iC2;
                }
                return new qjf0(str, null, pcn.n(strA));
            }
        }
        cft.g(QQWMbKFOuTf.sriaHOVCYrFJ, "Failed to parse index/count attribute: ".concat(c8w.a(i)));
        return null;
    }
}
