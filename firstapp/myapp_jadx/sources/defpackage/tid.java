package defpackage;

import androidx.media3.common.a;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tid {
    public final int a;
    public final List<a> b;

    public tid(int i, List<a> list) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x005d  */
    public final wxg0 a(int i, wxg0.b bVar) {
        String str = bVar.a;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new or00(new j8w(str, bVar.a(), "video/mp2t"));
            }
            if (i == 21) {
                return new or00(new s6n());
            }
            if (i == 27) {
                if (c(4)) {
                    return null;
                }
                return new or00(new zal(new u580(b(bVar)), c(1), c(8)));
            }
            if (i == 36) {
                return new or00(new abl(new u580(b(bVar))));
            }
            if (i == 45) {
                return new or00(new l8w());
            }
            if (i == 89) {
                return new or00(new zgf(bVar.c));
            }
            if (i == 172) {
                return new or00(new s5(str, bVar.a(), "video/mp2t"));
            }
            if (i == 257) {
                return new i380(new tuz("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new or00(new sff(str, bVar.a(), 5408));
                }
                switch (i) {
                    case 15:
                        if (c(2)) {
                            return null;
                        }
                        return new or00(new fm(bVar.a(), str, "video/mp2t", false));
                    case 16:
                        return new or00(new yal(new roh0(b(bVar))));
                    case 17:
                        if (c(2)) {
                            return null;
                        }
                        return new or00(new yqr(str, bVar.a()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new or00(new o5(str, bVar.a(), "video/mp2t"));
                            case 130:
                                if (!c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (c(16)) {
                                            return null;
                                        }
                                        return new i380(new tuz("application/x-scte35"));
                                    case 135:
                                        return new or00(new o5(str, bVar.a(), "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new or00(new sff(str, bVar.a(), 4096));
        }
        return new or00(new xal(new roh0(b(bVar)), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public final List<a> b(wxg0.b bVar) {
        String str;
        int i;
        List<byte[]> listSingletonList;
        boolean zC = c(32);
        List<a> list = this.b;
        if (zC) {
            return list;
        }
        nsz nszVar = new nsz(bVar.d);
        ArrayList arrayList = list;
        while (nszVar.a() > 0) {
            int iW = nszVar.w();
            int iW2 = nszVar.b + nszVar.w();
            if (iW == 134) {
                arrayList = new ArrayList();
                int iW3 = nszVar.w() & 31;
                for (int i2 = 0; i2 < iW3; i2++) {
                    String strU = nszVar.u(3, StandardCharsets.UTF_8);
                    int iW4 = nszVar.w();
                    boolean z = (iW4 & 128) != 0;
                    if (z) {
                        i = iW4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bW = (byte) nszVar.w();
                    nszVar.J(1);
                    if (z) {
                        boolean z2 = (bW & 64) != 0;
                        byte[] bArr = j08.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    a.C0062a c0062a = new a.C0062a();
                    c0062a.m = gqv.m(str);
                    c0062a.d = strU;
                    c0062a.J = i;
                    c0062a.p = listSingletonList;
                    arrayList.add(new a(c0062a));
                }
            }
            nszVar.I(iW2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public final boolean c(int i) {
        return (this.a & i) != 0;
    }
}
