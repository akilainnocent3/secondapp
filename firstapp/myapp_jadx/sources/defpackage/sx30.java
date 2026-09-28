package defpackage;

import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class sx30 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final float f, final float f2, float f3, final int i, final float f4, final long j, a aVar, final int i2) {
        float f5;
        b bVar;
        Object obj;
        Object rx30Var;
        Unit unit;
        wd0 wd0Var;
        wd0 wd0Var2;
        wd0 wd0Var3;
        ytw ytwVar;
        b bVarI = aVar.i(572220114);
        int i3 = i2 | (bVarI.c(f) ? 4 : 2) | (bVarI.c(f2) ? 32 : 16) | (bVarI.c(f3) ? 256 : 128) | (bVarI.d(R.drawable.star) ? 2048 : 1024) | (bVarI.d(i) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.c(f4) ? 131072 : 65536) | (bVarI.e(j) ? 1048576 : 524288);
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                int i4 = i >> 31;
                int i5 = ~i;
                q8k0 q8k0Var = new q8k0();
                q8k0Var.c = i;
                q8k0Var.d = i4;
                q8k0Var.e = 0;
                q8k0Var.f = 0;
                q8k0Var.i = i5;
                q8k0Var.v = (i << 10) ^ (i4 >>> 4);
                if ((i | i4 | i5) == 0) {
                    obj = objY;
                    hb5.a("Initial state must have at least one non-zero element.");
                    return;
                }
                obj = objY;
                for (int i6 = 0; i6 < 64; i6++) {
                    q8k0Var.e();
                }
                bVarI.r(q8k0Var);
                obj = q8k0Var;
            }
            obj = objY;
            lx30 lx30Var = (lx30) obj;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = ee0.a(0.0f);
                bVarI.r(objY2);
            }
            wd0 wd0Var4 = (wd0) objY2;
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = ee0.a(0.0f);
                bVarI.r(objY3);
            }
            wd0 wd0Var5 = (wd0) objY3;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = ee0.a(0.0f);
                bVarI.r(objY4);
            }
            wd0 wd0Var6 = (wd0) objY4;
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Float.valueOf(0.0f));
                bVarI.r(objY5);
            }
            ytw ytwVar2 = (ytw) objY5;
            Unit unit2 = Unit.a;
            boolean zA = ((i3 & 896) == 256) | ((i3 & 3670016) == 1048576) | ((i3 & 14) == 4) | ((i3 & 112) == 32) | ((i3 & 458752) == 131072) | bVarI.A(lx30Var) | bVarI.A(wd0Var6) | bVarI.A(wd0Var5) | bVarI.A(wd0Var4);
            Object objY6 = bVarI.y();
            if (zA || objY6 == c0042a) {
                unit = unit2;
                wd0Var = wd0Var4;
                wd0Var2 = wd0Var5;
                wd0Var3 = wd0Var6;
                rx30Var = new rx30(j, f, f2, f3, f4, lx30Var, wd0Var3, wd0Var2, wd0Var, ytwVar2, null);
                ytwVar = ytwVar2;
                f5 = f3;
                bVarI.r(rx30Var);
            } else {
                f5 = f3;
                rx30Var = objY6;
                wd0Var = wd0Var4;
                ytwVar = ytwVar2;
                unit = unit2;
                wd0Var2 = wd0Var5;
                wd0Var3 = wd0Var6;
            }
            xvf.e(bVarI, unit, (Function2) rx30Var);
            crz crzVarA = erz.a(R.drawable.star, (i3 >> 9) & 14, bVarI);
            d dVarC = androidx.compose.ui.graphics.a.c(g.c(j.r(d.a.b, f5), ((Number) wd0Var3.d()).floatValue(), ((Number) ytwVar.getValue()).floatValue()), ((Number) wd0Var.d()).floatValue(), ((Number) wd0Var.d()).floatValue(), 0.0f, 0.0f, 0.0f, ((Number) wd0Var2.d()).floatValue(), 0L, null, 524028);
            b bVar2 = bVarI;
            h9n.a(crzVarA, null, dVarC, null, null, 0.0f, null, bVar2, 48, 120);
            bVar = bVar2;
        } else {
            f5 = f3;
            b bVar3 = bVarI;
            bVar3.G();
            bVar = bVar3;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final float f6 = f5;
            eVarZ.d = new Function2(f, f2, f6, i, f4, j, i2) { // from class: qx30
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ int d;
                public final /* synthetic */ float e;
                public final /* synthetic */ long f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(1);
                    sx30.a(this.a, this.b, this.c, this.d, this.e, this.f, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d dVar, final int i, float f, float f2, a aVar, final int i2) {
        final float f3;
        final float f4;
        b bVarI = aVar.i(-1704775416);
        int i3 = i2 | 384 | (bVarI.d(R.drawable.star) ? 2048 : 1024) | 24576;
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            final float f5 = 12.0f;
            final float f6 = 24.0f;
            q75.a(dVar, null, false, pp8.b(206044146, new gaj() { // from class: ox30
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        for (int i4 = 0; i4 < i; i4++) {
                            sx30.a(r75Var.d(), r75Var.e(), f5, i4, f6, (((long) i4) * 5000) + 5000, aVar2, 0);
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3078, 6);
            f3 = 12.0f;
            f4 = 24.0f;
        } else {
            bVarI.G();
            f3 = f;
            f4 = f2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, f3, f4, i2) { // from class: px30
                public final /* synthetic */ int b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(55);
                    sx30.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
