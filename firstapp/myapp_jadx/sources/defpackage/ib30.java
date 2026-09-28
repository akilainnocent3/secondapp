package defpackage;

import kotlin.ranges.f;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public class ib30 {
    public static final imf0 b(imf0 imf0Var, imf0 imf0Var2, float f) {
        sj10 sj10Var;
        ora0 ora0Var = imf0Var.a;
        ora0 ora0Var2 = imf0Var2.a;
        kjf0 kjf0Var = qra0.d;
        kjf0 kjf0Var2 = ora0Var.a;
        kjf0 kjf0Var3 = ora0Var2.a;
        boolean z = kjf0Var2 instanceof ab5;
        kjf0 ab5Var = kjf0.a.a;
        if (!z && !(kjf0Var3 instanceof ab5)) {
            long jI = r58.i(f, kjf0Var2.d(), kjf0Var3.d());
            if (jI != 16) {
                ab5Var = new z68(jI);
            }
        } else if (z && (kjf0Var3 instanceof ab5)) {
            ab5 ab5Var2 = (ab5) kjf0Var2;
            ab5 ab5Var3 = (ab5) kjf0Var3;
            ya5 ya5Var = (ya5) qra0.b(f, ab5Var2.a, ab5Var3.a);
            float fB = vcv.b(ab5Var2.b, ab5Var3.b, f);
            if (ya5Var != null) {
                if (ya5Var instanceof soa0) {
                    long jA = gff0.a(fB, ((soa0) ya5Var).b);
                    if (jA != 16) {
                        ab5Var = new z68(jA);
                    }
                } else {
                    if (!(ya5Var instanceof dx80)) {
                        uhc.a();
                        return null;
                    }
                    ab5Var = new ab5((dx80) ya5Var, fB);
                }
            }
        } else {
            ab5Var = (kjf0) qra0.b(f, kjf0Var2, kjf0Var3);
        }
        kjf0 kjf0Var4 = ab5Var;
        f8i f8iVar = (f8i) qra0.b(f, ora0Var.f, ora0Var2.f);
        long jC = qra0.c(f, ora0Var.b, ora0Var2.b);
        t9i t9iVar = ora0Var.c;
        if (t9iVar == null) {
            t9iVar = t9i.B;
        }
        t9i t9iVar2 = ora0Var2.c;
        if (t9iVar2 == null) {
            t9iVar2 = t9i.B;
        }
        t9i t9iVar3 = new t9i(f.e(vcv.c(f, t9iVar.a, t9iVar2.a), 1, 1000));
        n9i n9iVar = (n9i) qra0.b(f, ora0Var.d, ora0Var2.d);
        o9i o9iVar = (o9i) qra0.b(f, ora0Var.e, ora0Var2.e);
        String str = (String) qra0.b(f, ora0Var.g, ora0Var2.g);
        long jC2 = qra0.c(f, ora0Var.h, ora0Var2.h);
        t82 t82Var = ora0Var.i;
        float f2 = t82Var != null ? t82Var.a : 0.0f;
        t82 t82Var2 = ora0Var2.i;
        float fB2 = vcv.b(f2, t82Var2 != null ? t82Var2.a : 0.0f, f);
        ljf0 ljf0Var = ora0Var.j;
        ljf0 ljf0Var2 = ljf0.c;
        if (ljf0Var == null) {
            ljf0Var = ljf0Var2;
        }
        ljf0 ljf0Var3 = ora0Var2.j;
        if (ljf0Var3 != null) {
            ljf0Var2 = ljf0Var3;
        }
        ljf0 ljf0Var4 = new ljf0(vcv.b(ljf0Var.a, ljf0Var2.a, f), vcv.b(ljf0Var.b, ljf0Var2.b, f));
        cet cetVar = (cet) qra0.b(f, ora0Var.k, ora0Var2.k);
        long jI2 = r58.i(f, ora0Var.l, ora0Var2.l);
        yef0 yef0Var = (yef0) qra0.b(f, ora0Var.m, ora0Var2.m);
        ix80 ix80Var = ora0Var.n;
        if (ix80Var == null) {
            ix80Var = new ix80(0L, 7, 0L, 0.0f);
        }
        ix80 ix80Var2 = ora0Var2.n;
        if (ix80Var2 == null) {
            ix80Var2 = new ix80(0L, 7, 0L, 0.0f);
        }
        long jI3 = r58.i(f, ix80Var.a, ix80Var2.a);
        long j = ix80Var.b;
        long j2 = ix80Var2.b;
        ix80 ix80Var3 = new ix80(vcv.b(ix80Var.c, ix80Var2.c, f), jI3, (((long) Float.floatToRawIntBits(vcv.b(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f))) << 32) | (((long) Float.floatToRawIntBits(vcv.b(Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 & 4294967295L)), f))) & 4294967295L));
        kk10 kk10Var = ora0Var.o;
        kk10 kk10Var2 = ora0Var2.o;
        if (kk10Var == null && kk10Var2 == null) {
            kk10Var = null;
        } else if (kk10Var == null) {
            kk10Var = kk10.a;
        }
        ora0 ora0Var3 = new ora0(kjf0Var4, jC, t9iVar3, n9iVar, o9iVar, f8iVar, str, jC2, new t82(fB2), ljf0Var4, cetVar, jI2, yef0Var, ix80Var3, kk10Var, (wcf) qra0.b(f, ora0Var.p, ora0Var2.p));
        qrz qrzVar = imf0Var.b;
        qrz qrzVar2 = imf0Var2.b;
        int i = rrz.b;
        int i2 = ((gdf0) qra0.b(f, new gdf0(qrzVar.a), new gdf0(qrzVar2.a))).a;
        int i3 = ((dff0) qra0.b(f, new dff0(qrzVar.b), new dff0(qrzVar2.b))).a;
        long jC3 = qra0.c(f, qrzVar.c, qrzVar2.c);
        pjf0 pjf0Var = qrzVar.d;
        if (pjf0Var == null) {
            pjf0Var = pjf0.c;
        }
        pjf0 pjf0Var2 = qrzVar2.d;
        if (pjf0Var2 == null) {
            pjf0Var2 = pjf0.c;
        }
        pjf0 pjf0Var3 = new pjf0(qra0.c(f, pjf0Var.a, pjf0Var2.a), qra0.c(f, pjf0Var.b, pjf0Var2.b));
        sj10 sj10Var2 = qrzVar.e;
        sj10 sj10Var3 = qrzVar2.e;
        if (sj10Var2 == null && sj10Var3 == null) {
            sj10Var = null;
        } else {
            if (sj10Var2 == null) {
                sj10Var2 = sj10.b;
            }
            sj10 sj10Var4 = sj10Var2;
            if (sj10Var3 == null) {
                sj10Var3 = sj10.b;
            }
            if (sj10Var4.a == sj10Var3.a) {
                sj10Var = sj10Var4;
            } else {
                ((k1g) qra0.b(f, new k1g(), new k1g())).getClass();
                sj10Var = new sj10(((Boolean) qra0.b(f, Boolean.valueOf(sj10Var4.a), Boolean.valueOf(sj10Var3.a))).booleanValue());
            }
        }
        return new imf0(ora0Var3, new qrz(i2, i3, jC3, pjf0Var3, sj10Var, (afs) qra0.b(f, qrzVar.f, qrzVar2.f), ((yes) qra0.b(f, new yes(qrzVar.g), new yes(qrzVar2.g))).a, ((tqm) qra0.b(f, new tqm(qrzVar.h), new tqm(qrzVar2.h))).a, (qlf0) qra0.b(f, qrzVar.i, qrzVar2.i)));
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x0105  */
    /* JADX WARN: Code duplicated, block: B:79:0x010b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    public static final imf0 c(imf0 imf0Var, asr asrVar) {
        long j;
        pjf0 pjf0Var;
        int i;
        int i2;
        qlf0 qlf0Var;
        ora0 ora0Var = imf0Var.a;
        kjf0 kjf0Var = qra0.d;
        kjf0 kjf0VarB = ora0Var.a.b(new pra0());
        long j2 = ora0Var.b;
        pmf0[] pmf0VarArr = omf0.b;
        if ((j2 & 1095216660480L) == 0) {
            j2 = qra0.a;
        }
        long j3 = j2;
        t9i t9iVar = ora0Var.c;
        if (t9iVar == null) {
            t9iVar = t9i.B;
        }
        t9i t9iVar2 = t9iVar;
        n9i n9iVar = ora0Var.d;
        n9i n9iVar2 = new n9i(n9iVar != null ? n9iVar.a : 0);
        o9i o9iVar = ora0Var.e;
        o9i o9iVar2 = new o9i(o9iVar != null ? o9iVar.a : Settings.DEFAULT_INITIAL_WINDOW_SIZE);
        f8i f8iVar = ora0Var.f;
        if (f8iVar == null) {
            f8iVar = f8i.a;
        }
        f8i f8iVar2 = f8iVar;
        String str = ora0Var.g;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = ora0Var.h;
        if ((j4 & 1095216660480L) == 0) {
            j4 = qra0.b;
        }
        long j5 = j4;
        t82 t82Var = ora0Var.i;
        t82 t82Var2 = new t82(t82Var != null ? t82Var.a : 0.0f);
        ljf0 ljf0Var = ora0Var.j;
        if (ljf0Var == null) {
            ljf0Var = ljf0.c;
        }
        ljf0 ljf0Var2 = ljf0Var;
        cet cetVarA = ora0Var.k;
        if (cetVarA == null) {
            cet cetVar = cet.c;
            cetVarA = hj10.a.a();
        }
        cet cetVar2 = cetVarA;
        long j6 = ora0Var.l;
        if (j6 == 16) {
            j6 = qra0.c;
        }
        long j7 = j6;
        yef0 yef0Var = ora0Var.m;
        if (yef0Var == null) {
            yef0Var = yef0.b;
        }
        yef0 yef0Var2 = yef0Var;
        ix80 ix80Var = ora0Var.n;
        if (ix80Var == null) {
            ix80Var = ix80.d;
        }
        ix80 ix80Var2 = ix80Var;
        kk10 kk10Var = ora0Var.o;
        wcf wcfVar = ora0Var.p;
        if (wcfVar == null) {
            wcfVar = rlh.a;
        }
        ora0 ora0Var2 = new ora0(kjf0VarB, j3, t9iVar2, n9iVar2, o9iVar2, f8iVar2, str2, j5, t82Var2, ljf0Var2, cetVar2, j7, yef0Var2, ix80Var2, kk10Var, wcfVar);
        qrz qrzVar = imf0Var.b;
        int i3 = rrz.b;
        int i4 = qrzVar.a;
        int i5 = 5;
        if (i4 == Integer.MIN_VALUE) {
            i4 = 5;
        }
        int i6 = qrzVar.b;
        if (i6 != 3) {
            if (i6 == Integer.MIN_VALUE) {
                int iOrdinal = asrVar.ordinal();
                if (iOrdinal == 0) {
                    i6 = 1;
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = qrzVar.c;
            if ((j & 1095216660480L) == 0) {
                j = rrz.a;
            }
            pjf0Var = qrzVar.d;
            if (pjf0Var == null) {
                pjf0Var = pjf0.c;
            }
            sj10 sj10Var = qrzVar.e;
            afs afsVar = qrzVar.f;
            i = qrzVar.g;
            if (i == 0) {
                i = yes.b;
            }
            i2 = qrzVar.h;
            if (i2 == Integer.MIN_VALUE) {
                i2 = 1;
            }
            qlf0Var = qrzVar.i;
            if (qlf0Var == null) {
                qlf0Var = qlf0.c;
            }
            return new imf0(ora0Var2, new qrz(i4, i6, j, pjf0Var, sj10Var, afsVar, i, i2, qlf0Var), imf0Var.c);
        }
        int iOrdinal2 = asrVar.ordinal();
        if (iOrdinal2 == 0) {
            i5 = 4;
        } else if (iOrdinal2 != 1) {
            uhc.a();
            return null;
        }
        i6 = i5;
        j = qrzVar.c;
        if ((j & 1095216660480L) == 0) {
            j = rrz.a;
        }
        pjf0Var = qrzVar.d;
        if (pjf0Var == null) {
            pjf0Var = pjf0.c;
        }
        sj10 sj10Var2 = qrzVar.e;
        afs afsVar2 = qrzVar.f;
        i = qrzVar.g;
        if (i == 0) {
            i = yes.b;
        }
        i2 = qrzVar.h;
        if (i2 == Integer.MIN_VALUE) {
            i2 = 1;
        }
        qlf0Var = qrzVar.i;
        if (qlf0Var == null) {
            qlf0Var = qlf0.c;
        }
        return new imf0(ora0Var2, new qrz(i4, i6, j, pjf0Var, sj10Var2, afsVar2, i, i2, qlf0Var), imf0Var.c);
    }
}
