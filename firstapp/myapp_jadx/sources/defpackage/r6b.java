package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class r6b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final String str, final String str2, final long j, final long j2, a aVar, final int i) {
        b bVar;
        str.getClass();
        b bVarI = aVar.i(428751243);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(str2) ? 32 : 16) | (bVarI.e(j2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b("");
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            boolean z = (i2 & 14) == 4;
            Object objY2 = bVarI.y();
            if (z || objY2 == c0042a) {
                objY2 = new q6b(null, ytwVar, str);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, str, (Function2) objY2);
            bVar = bVarI;
            lkf0.b(str2 + ' ' + ((String) ytwVar.getValue()), null, j, j2, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, bVar, i2 & 8064, 0, 131058);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, j, j2, str, str2) { // from class: o6b
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;

                {
                    this.a = str;
                    this.b = str2;
                    this.c = j;
                    this.d = j2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    r6b.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(Function0 function0, Function0 function1, final Function0 function2, a aVar, final int i) {
        int i2;
        final Function0 function3;
        final Function0 function4;
        b bVarA = yoh0.a(function0, function1, function2, aVar, 1261021312);
        if ((i & 6) == 0) {
            i2 = (bVarA.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.A(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function2) ? 256 : 128;
        }
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 << 3;
            function3 = function0;
            function4 = function1;
            hqf.a(cb40.a(R.string.page_limits__betting_limits, new Object[0], bVarA), function3, function4, pp8.b(2006348834, new Function2() { // from class: pnf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strA = cb40.a(R.string.page_limits__real_sports, new Object[0], aVar2);
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_mm_football);
                        final Function0 function5 = function2;
                        z0k.a(a4h.a(new m1f0(strA, numValueOf, pp8.b(972246009, new Function2() { // from class: rnf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ftf.b(scs.BETTING_LIMIT_TYPE, vfb0.REAL_SPORT, null, function5, aVar3, 54);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), 2), new m1f0(cb40.a(R.string.page_limits__casino, new Object[0], aVar2), Integer.valueOf(R.drawable.ic_games), pp8.b(1745287960, new snf(i4, function5), aVar2), 2)), 0, 0L, a4f0.b, aVar2, 3072, 22);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, (i3 & 112) | 3072 | (i3 & 896));
        } else {
            function3 = function0;
            function4 = function1;
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qnf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    r6b.b(function3, function4, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
