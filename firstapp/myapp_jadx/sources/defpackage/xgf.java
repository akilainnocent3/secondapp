package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.w;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xgf {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final float f, final float f2, a aVar, final int i) {
        boolean z;
        boolean z2;
        str.getClass();
        b bVarI = aVar.i(893781105);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.c(f) ? 256 : 128) | (bVarI.c(f2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(0);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            float fC1 = mmdVar.C1(500.0f);
            final float f3 = fC1;
            b bVar = bVarI;
            a.C0041a.C0042a c0042a2 = c0042a;
            final egn.a aVarA = kgn.a(kgn.b("DustLoop", bVarI, 0), 0.0f, -fC1, yi0.a(yi0.e((int) ((fC1 / f) * 1000.0f), 0, xkf.d, 2), l850.a, 0L, 4), "Offset", bVar, 28728, 0);
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            Object objY2 = bVar.y();
            if (objY2 == c0042a2) {
                z = false;
                objY2 = new ugf(ytwVar, 0);
                bVar.r(objY2);
            } else {
                z = false;
            }
            d dVarA = w.a(dVarE, (Function1) objY2);
            aiv aivVarC = g75.c(ht.a.a, z);
            int iHashCode = Long.hashCode(bVar.T);
            ne00 ne00VarS = bVar.S();
            d dVarC = c.c(bVar, dVarA);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVar.D();
            if (bVar.S) {
                bVar.F(aVar3);
            } else {
                bVar.p();
            }
            hlh0.a(bVar, aivVarC, yka.a.f);
            hlh0.a(bVar, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar.S || !Intrinsics.g(bVar.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar, iHashCode, c1350a);
            }
            hlh0.a(bVar, dVarC, yka.a.d);
            if (((Number) ytwVar.getValue()).intValue() > 0) {
                bVar.N(-1755759860);
                float fIntValue = ((Number) ytwVar.getValue()).intValue();
                chf chfVar = AndroidCompositionLocals_androidKt.a;
                final int iB = ycv.b((1.0f - f2) * (((Configuration) bVar.O(chfVar)).screenHeightDp / ((Configuration) bVar.O(chfVar)).screenWidthDp) * fIntValue);
                final int i3 = 0;
                for (int iCeil = ((Number) ytwVar.getValue()).intValue() <= 0 ? 2 : ((int) Math.ceil(((Number) ytwVar.getValue()).intValue() / fC1)) + 1; i3 < iCeil; iCeil = iCeil) {
                    nan.a aVar4 = new nan.a(context);
                    aVar4.c = str;
                    abn.a(aVar4, false);
                    nan nanVarA = aVar4.a();
                    d dVarR = j.r(aVar2, 500.0f);
                    boolean zM = bVar.M(aVarA) | bVar.d(i3) | bVar.c(f3) | bVar.d(iB);
                    Object objY3 = bVar.y();
                    if (zM || objY3 == c0042a2) {
                        objY3 = new Function1() { // from class: vgf
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                ((mmd) obj).getClass();
                                return new iwo((((long) iB) & 4294967295L) | (((long) ycv.b(((f3 - 1.0f) * i3) + ((Number) aVarA.getValue()).floatValue())) << 32));
                            }
                        };
                        bVar.r(objY3);
                    }
                    float f4 = f3;
                    b bVar2 = bVar;
                    fn80.a(nanVarA, null, g.b(dVarR, (Function1) objY3), d0b.a.d, null, 0.0f, null, null, null, bVar2, 3120, 2032);
                    i3++;
                    bVar = bVar2;
                    aVar2 = aVar2;
                    c0042a2 = c0042a2;
                    aVarA = aVarA;
                    f3 = f4;
                    iB = iB;
                }
                bVarI = bVar;
                z2 = false;
            } else {
                bVarI = bVar;
                z2 = false;
                bVarI.N(-1758116821);
            }
            bVarI.X(z2);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(f, f2, i, str) { // from class: wgf
                public final /* synthetic */ String a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;

                {
                    this.a = str;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(49);
                    xgf.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
