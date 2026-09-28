package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class p52 {
    public static final void a(Function0 function0, Function0 function1, final Function0 function2, a aVar, final int i) {
        int i2;
        final Function0 function3;
        final Function0 function4;
        b bVarA = yoh0.a(function0, function1, function2, aVar, 541775896);
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
            hqf.a(cb40.a(R.string.page_limits__loss_limits, new Object[0], bVarA), function3, function4, pp8.b(580486458, new Function2() { // from class: iqf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        String strA = cb40.a(R.string.page_limits__real_sports, new Object[0], aVar2);
                        Integer numValueOf = Integer.valueOf(R.drawable.ic_mm_football);
                        final Function0 function5 = function2;
                        z0k.a(a4h.a(new m1f0(strA, numValueOf, pp8.b(1108265553, new Function2() { // from class: kqf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ftf.b(scs.LOSS_LIMIT_TYPE, vfb0.REAL_SPORT, null, function5, aVar3, 54);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), 2), new m1f0(cb40.a(R.string.page_limits__casino, new Object[0], aVar2), Integer.valueOf(R.drawable.ic_games), pp8.b(937426096, new Function2() { // from class: lqf
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                a aVar3 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    ftf.b(scs.LOSS_LIMIT_TYPE, vfb0.CASINO, null, function5, aVar3, 54);
                                } else {
                                    aVar3.G();
                                }
                                return Unit.a;
                            }
                        }, aVar2), 2)), 0, 0L, null, aVar2, 0, 30);
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
            eVarZ.d = new Function2() { // from class: jqf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iA = qj40.a(i | 1);
                    p52.a(function3, function4, function2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
