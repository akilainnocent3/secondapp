package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes4.dex */
public final class w280 {
    public static final void a(final int i, final int i2, a aVar, d dVar, final String str, final Function0 function0, boolean z, boolean z2) {
        d dVar2;
        int i3;
        final boolean z3;
        int i4;
        boolean z4;
        final d dVar3;
        final boolean z5;
        str.getClass();
        b bVarI = aVar.i(2098480971);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else if ((i & 6) == 0) {
            dVar2 = dVar;
            i3 = (bVarI.M(dVar2) ? 4 : 2) | i;
        } else {
            dVar2 = dVar;
            i3 = i;
        }
        int i6 = i3 | (bVarI.M(str) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            z3 = z;
        } else {
            z3 = z;
            i4 = i6 | (bVarI.b(z3) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 |= 3072;
            z4 = z2;
        } else if ((i & 3072) == 0) {
            z4 = z2;
            i4 |= bVarI.b(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        int i9 = i4 | (bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i9 & 1, (i9 & 9363) != 9362)) {
            d dVar4 = i5 != 0 ? d.a.b : dVar2;
            boolean z6 = i7 != 0 ? true : z3;
            if (i8 != 0) {
                z4 = false;
            }
            i060 i060VarC = j060.c(2.0f);
            l35 l35VarA = m35.a(1.0f, c68.a(z6 ? R.color.brand_quaternary : R.color.text_disable_type1_primary, bVarI));
            umz umzVar = ek5.a;
            d dVar5 = dVar4;
            final boolean z7 = z4;
            boolean z8 = z6;
            nk5.a(function0, dVar5, z8, i060VarC, ek5.a(c68.a(android.R.color.transparent, bVarI), c68.a(R.color.brand_quaternary, bVarI), c68.a(android.R.color.transparent, bVarI), c68.a(R.color.text_disable_type1_primary, bVarI), bVarI, 0), null, l35VarA, null, null, pp8.b(-487695013, new gaj() { // from class: u280
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    imf0 imf0Var;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        if (z7) {
                            aVar2.N(-523468922);
                            imf0Var = ((eah0) aVar2.O(gah0.a)).n;
                            aVar2.H();
                        } else {
                            aVar2.N(-523467067);
                            imf0Var = ((eah0) aVar2.O(gah0.a)).m;
                            aVar2.H();
                        }
                        lkf0.d(str, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, aVar2, 0, 0, 131070);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, (i9 & 896) | ((i9 >> 12) & 14) | 805306368 | ((i9 << 3) & 112), 416);
            bVarI = bVarI;
            dVar3 = dVar5;
            z3 = z8;
            z5 = z7;
        } else {
            bVarI.G();
            dVar3 = dVar2;
            z5 = z4;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: v280
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    w280.a(qj40.a(i | 1), i2, (a) obj, dVar3, str, function0, z3, z5);
                    return Unit.a;
                }
            };
        }
    }
}
