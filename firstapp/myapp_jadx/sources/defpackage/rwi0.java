package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.esotericsoftware.spine.android.SpineView;
import com.sportybet.android.gp.tz.R;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class rwi0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final File file, final File file2, final String str, final boolean z, a aVar, final int i) {
        b bVar;
        Object obj;
        String str2;
        float fA;
        float f;
        float f2;
        str.getClass();
        b bVarI = aVar.i(-1841852852);
        int i2 = i | (bVarI.A(file) ? 4 : 2) | (bVarI.A(file2) ? 32 : 16) | (bVarI.M(str) ? 2048 : 1024) | (bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            chf chfVar = AndroidCompositionLocals_androidKt.a;
            float f3 = ((Configuration) bVarI.O(chfVar)).screenHeightDp;
            if (str.equals("ROUND_WAITING") || str.equals("ROUND_PRE_START")) {
                bVarI.N(1864641524);
                int i3 = i2 & 7168;
                boolean z2 = i3 == 2048;
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    objY2 = new nwi0(null, ytwVar, str);
                    bVarI.r(objY2);
                }
                xvf.e(bVarI, str, (Function2) objY2);
                final boolean z3 = true;
                boolean zB = ((i2 & 57344) == 16384) | (i3 == 2048) | bVarI.b(true) | bVarI.A(ibsVar);
                Object objY3 = bVarI.y();
                if (zB || objY3 == c0042a) {
                    obj = new Function1() { // from class: hwi0
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v2, types: [hbs, mwi0] */
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            ((use) obj2).getClass();
                            final boolean z4 = z;
                            final ytw ytwVar2 = ytwVar;
                            final String str3 = str;
                            final boolean z5 = z3;
                            ?? r5 = new cbs() { // from class: mwi0
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.cbs
                                public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                    if (aVar2 == s9s.a.ON_RESUME) {
                                        boolean z6 = z4;
                                        ytw ytwVar3 = ytwVar2;
                                        if (z6) {
                                            com.esotericsoftware.spine.android.b bVar2 = (com.esotericsoftware.spine.android.b) ytwVar3.getValue();
                                            if (bVar2 != null) {
                                                bVar2.b().c("SB_fugu");
                                            }
                                        } else {
                                            com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar3.getValue();
                                            if (bVar3 != null) {
                                                bVar3.b().c("SB");
                                            }
                                        }
                                        com.esotericsoftware.spine.android.b bVar4 = (com.esotericsoftware.spine.android.b) ytwVar3.getValue();
                                        if (bVar4 != null) {
                                            bVar4.a().m(0, Intrinsics.g(str3, "ROUND_PRE_START") ? "kick-sb" : "idle-sb", z5);
                                        }
                                    }
                                }
                            };
                            s9s lifecycle = ibsVar.getLifecycle();
                            lifecycle.a(r5);
                            return new qwi0(lifecycle, r5);
                        }
                    };
                    str2 = str;
                    bVarI.r(obj);
                } else {
                    obj = objY3;
                    str2 = str;
                }
                xvf.c(ibsVar, (Function1) obj, bVarI);
                Object objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = m.b(Float.valueOf(-1.0f));
                    bVarI.r(objY4);
                }
                ytw ytwVar2 = (ytw) objY4;
                Object objY5 = bVarI.y();
                if (objY5 == c0042a) {
                    objY5 = m.b(Float.valueOf(3.0f));
                    bVarI.r(objY5);
                }
                ytw ytwVar3 = (ytw) objY5;
                boolean z4 = i3 == 2048;
                Object objY6 = bVarI.y();
                if (z4 || objY6 == c0042a) {
                    objY6 = new owi0(null, ytwVar2, ytwVar3, str2);
                    bVarI.r(objY6);
                }
                xvf.e(bVarI, str2, (Function2) objY6);
                Object objY7 = bVarI.y();
                if (objY7 == c0042a) {
                    objY7 = ee0.a(1.0f);
                    bVarI.r(objY7);
                }
                final wd0 wd0Var = (wd0) objY7;
                Boolean boolValueOf = Boolean.valueOf(str2.equals(r4));
                boolean zA = bVarI.A(wd0Var) | (i3 == 2048);
                Object objY8 = bVarI.y();
                if (zA || objY8 == c0042a) {
                    objY8 = new pwi0(wd0Var, null, str2);
                    bVarI.r(objY8);
                }
                xvf.e(bVarI, boolValueOf, (Function2) objY8);
                String str3 = str2;
                xe0.b(((Number) ytwVar2.getValue()).floatValue(), str2.equals(r4) ? yi0.e(500, 550, null, 4) : yi0.e(0, 0, null, 6), null, null, bVarI, 0, 28);
                xe0.b(((Number) ytwVar3.getValue()).floatValue(), str3.equals("ROUND_PRE_START") ? yi0.e(500, 550, null, 4) : yi0.e(0, 0, null, 6), null, null, bVarI, 0, 28);
                d.a aVar2 = d.a.b;
                d dVarJ = h.j(j.g(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, f3 * 0.13f, 7);
                aiv aivVarC = g75.c(ht.a.d, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarJ);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                Configuration configuration = (Configuration) bVarI.O(chfVar);
                int i4 = configuration.screenHeightDp;
                int i5 = configuration.screenWidthDp;
                final aq40 aq40Var = new aq40();
                aq40Var.a = 0.8f;
                float f4 = i4;
                Math.abs(f4 - 667.0f);
                if (i4 >= 880) {
                    bVarI.N(-404154443);
                    fA = fw20.a(R.dimen._220sdp, bVarI);
                    bVarI.X(false);
                } else {
                    bVarI.N(-404082461);
                    fA = fw20.a(R.dimen._200sdp, bVarI);
                    bVarI.X(false);
                }
                if (i4 >= 880) {
                    f = i5;
                    f2 = 2.5f;
                } else {
                    f = i5;
                    f2 = 2.7f;
                }
                float f5 = -(f / f2);
                aq40Var.a = f.d(hxa.a(f4 / 667.0f, 1.0f, 0.15f, aq40Var.a), 0.5f, 0.8f);
                d dVarB = androidx.compose.foundation.layout.d.a.b(s3w.a(g.d(j.g(h.j(j.i(j.g(aVar2, 1.0f), fA), 0.0f, 0.0f, 0.0f, fw20.a(R.dimen._10sdp, bVarI), 7), 1.0f), f5, 0.0f, 2), "sk_player_view"), ht.a.a);
                boolean zA2 = bVarI.A(wd0Var);
                Object objY9 = bVarI.y();
                if (zA2 || objY9 == c0042a) {
                    objY9 = new Function1() { // from class: iwi0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            a7l a7lVar = (a7l) obj2;
                            a7lVar.getClass();
                            wd0 wd0Var2 = wd0Var;
                            a7lVar.v(((Number) wd0Var2.d()).floatValue());
                            a7lVar.k(((Number) wd0Var2.d()).floatValue());
                            a7lVar.z0(n09.a(3.0f, -1.0f));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY9);
                }
                androidx.compose.ui.viewinterop.b.a(new Function1() { // from class: jwi0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Context context = (Context) obj2;
                        context.getClass();
                        final ytw ytwVar4 = ytwVar;
                        final boolean z5 = z;
                        final aq40 aq40Var2 = aq40Var;
                        final boolean z6 = z3;
                        return SpineView.a(file, file2, context, new com.esotericsoftware.spine.android.b(new hcb0() { // from class: lwi0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.hcb0
                            public final void b(com.esotericsoftware.spine.android.b bVar2) {
                                ytw ytwVar5 = ytwVar4;
                                ytwVar5.setValue(bVar2);
                                if (z5) {
                                    com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar5.getValue();
                                    if (bVar3 != null) {
                                        bVar3.b().c("SB_fugu");
                                    }
                                } else {
                                    com.esotericsoftware.spine.android.b bVar4 = (com.esotericsoftware.spine.android.b) ytwVar5.getValue();
                                    if (bVar4 != null) {
                                        bVar4.b().c("SB");
                                    }
                                }
                                mx90 mx90VarB = bVar2.b();
                                float f6 = aq40Var2.a;
                                mx90VarB.n = f6;
                                mx90VarB.o = f6;
                                bVar2.a().m(0, "idle-sb", z6);
                            }
                        }));
                    }
                }, androidx.compose.ui.graphics.a.a(dVarB, (Function1) objY9), null, bVarI, 0, 4);
                bVar = bVarI;
                bVar.X(true);
                bVar.X(false);
            } else {
                bVarI.N(1862165430);
                bVarI.X(false);
                bVar = bVarI;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(file, file2, str, z, i) { // from class: kwi0
                public final /* synthetic */ File a;
                public final /* synthetic */ File b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(385);
                    rwi0.a(this.a, this.b, this.c, this.d, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }
}
