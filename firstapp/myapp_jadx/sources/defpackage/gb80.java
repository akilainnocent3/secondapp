package defpackage;

import android.graphics.Region;
import android.os.Trace;
import androidx.compose.ui.d;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class gb80 {
    public static final lk40 a = new lk40(0.0f, 0.0f, 10.0f, 10.0f);

    public static final js1 a(int i, float f) {
        float f2 = i / f;
        js1 js1Var = new js1(1.45f, 1.5f, -0.55f, -0.235f, 1.6f, 1.8f, -0.4f, -0.26f, 0.25f, 3.0f, 3.0f, 0.12f, 3.0f, 0.4f, 0.9f, 0.4f, 2.0f, -0.28f, 1.1f, -0.075f, 0.01f, -0.24f, 0.05f, -1.2f, 0.95f, 0.49f, 0.2f, 0.04f, 500.0f, 400.0f, 50.0f, 300.0f, 3000);
        if (f2 >= 2.1f) {
            return js1.a(js1Var, -0.25f, 0.12f, 4.5f, 0.45f, 0.38f, -0.15f, 1.05f, 0.1f, 0.02f, -1.2f, 0.75f, 0.45f, 0.25f, 0.01f, 500.0f, 536870980, 0);
        }
        if (f2 >= 2.0f) {
            return js1.a(js1Var, -0.25f, 0.12f, 4.8f, 0.42f, 0.38f, -0.18f, 1.05f, 0.08f, 0.03f, -1.25f, 0.75f, 0.47f, 0.25f, 0.03f, 500.0f, 536870980, 0);
        }
        if (f2 >= 1.89f) {
            return js1.a(js1Var, -0.26f, 0.12f, 3.0f, 0.4f, 0.4f, -0.28f, 1.1f, 0.04f, 0.05f, 0.0f, 0.8f, 0.0f, 0.25f, 0.0f, 0.0f, -1166016512, 0);
        }
        if (f2 >= 1.7f) {
            return js1.a(js1Var, 0.0f, 0.12f, 0.0f, 0.0f, 0.0f, -0.3f, 1.15f, 0.0f, 0.05f, 0.0f, 0.85f, 0.0f, 0.23f, 0.06f, 150.0f, -1027999745, 0);
        }
        if (f2 >= 1.64f) {
            return js1.a(js1Var, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.09f, -1.1f, 0.0f, 0.0f, 0.0f, 0.06f, 300.0f, -415238145, 1);
        }
        if (f2 >= 1.6f) {
            return js1.a(js1Var, 0.0f, 0.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.09f, -1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -12584961, 1);
        }
        return f2 >= 1.5f ? js1.a(js1Var, 0.0f, 0.095f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.09f, -1.1f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -14682113, 1) : js1Var;
    }

    public static final msw b(fb80 fb80Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            bb80 bb80VarA = fb80Var.a();
            tsr tsrVar = bb80VarA.c;
            if (tsrVar.i() && tsrVar.e()) {
                msw mswVar = new msw(48);
                qa80 qa80Var = new qa80();
                qa80Var.b(pwo.d(bb80VarA.g()));
                c(qa80Var, bb80VarA, mswVar, bb80VarA, new qa80());
                return mswVar;
            }
            msw mswVar2 = hwo.a;
            mswVar2.getClass();
            return mswVar2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void c(qa80 qa80Var, bb80 bb80Var, msw mswVar, bb80 bb80Var2, qa80 qa80Var2) {
        lk40 lk40VarP2;
        tsr tsrVar;
        Region region = qa80Var.a;
        int i = bb80Var.g;
        tsr tsrVar2 = bb80Var2.c;
        int i2 = bb80Var2.g;
        boolean z = (tsrVar2.i() && tsrVar2.e()) ? false : true;
        if (!region.isEmpty() || i2 == i) {
            if (!z || bb80Var2.e) {
                ya80 ya80VarF = bb80Var2.f();
                if (ya80VarF == null) {
                    lk40VarP2 = tsrVar2.U.c.p2();
                } else {
                    d.c cVarI = ya80VarF.i();
                    boolean z2 = ta80.a(bb80Var2.d, ra80.b) != null;
                    if (!cVarI.a.C) {
                        lk40VarP2 = lk40.e;
                    } else if (z2) {
                        lk40VarP2 = pkd.d(cVarI, 8).p2();
                    } else {
                        ywx ywxVarD = pkd.d(cVarI, 8);
                        lk40VarP2 = eb9.c(ywxVarD).P(ywxVarD, true);
                    }
                }
                owo owoVarD = pwo.d(lk40VarP2);
                qa80Var2.b(owoVarD);
                if (i2 == i) {
                    i2 = -1;
                }
                if (!qa80Var2.a.op(region, Region.Op.INTERSECT)) {
                    if (bb80Var2.e) {
                        bb80 bb80VarL = bb80Var2.l();
                        mswVar.h(i2, new eb80(bb80Var2, pwo.d((bb80VarL == null || (tsrVar = bb80VarL.c) == null || !tsrVar.i()) ? a : bb80VarL.g())));
                        return;
                    } else {
                        if (i2 == -1) {
                            mswVar.h(i2, new eb80(bb80Var2, qa80Var2.a()));
                            return;
                        }
                        return;
                    }
                }
                mswVar.h(i2, new eb80(bb80Var2, qa80Var2.a()));
                List listJ = bb80.j(4, bb80Var2);
                for (int size = listJ.size() - 1; -1 < size; size--) {
                    if (!((bb80) listJ.get(size)).k().a.b(hb80.z)) {
                        c(qa80Var, bb80Var, mswVar, (bb80) listJ.get(size), qa80Var2);
                    }
                }
                if (e(bb80Var2)) {
                    region.op(owoVarD.a, owoVarD.b, owoVarD.c, owoVarD.d, Region.Op.DIFFERENCE);
                }
            }
        }
    }

    public static final boolean d(bb80 bb80Var) {
        ywx ywxVarD = bb80Var.d();
        rtw<ob80<?>, Object> rtwVar = bb80Var.d.a;
        return (ywxVarD != null ? ywxVarD.c2() : false) || rtwVar.b(hb80.p) || rtwVar.b(hb80.o);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[LOOP:0: B:9:0x001b->B:21:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x005b A[SYNTHETIC] */
    public static final boolean e(bb80 bb80Var) {
        if (!d(bb80Var)) {
            sa80 sa80Var = bb80Var.d;
            if (sa80Var.c) {
                return true;
            }
            rtw<ob80<?>, Object> rtwVar = sa80Var.a;
            Object[] objArr = rtwVar.b;
            Object[] objArr2 = rtwVar.c;
            long[] jArr = rtwVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj = objArr[i4];
                                Object obj2 = objArr2[i4];
                                if (((ob80) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
        }
        return false;
    }
}
