package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ses {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[rcs.values().length];
            try {
                rcs.a aVar = rcs.b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                rcs.a aVar2 = rcs.b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                rcs.a aVar3 = rcs.b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    public static final void a(final rcs rcsVar, final Function0 function0, final Function0 function1, final Function1 function2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-896972899);
        int i3 = i | (bVarI.d(rcsVar == null ? -1 : rcsVar.ordinal()) ? 4 : 2) | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i3 & 1, (i3 & 1171) != 1170)) {
            d dVarE = j.e(d.a.b, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            odd0.c(null, cb40.a(R.string.page_limits__limits, new Object[0], bVarI), function0, function1, bVarI, (i3 << 3) & 8064, 1);
            bVarI = bVarI;
            int i4 = rcsVar != null ? a.a[rcsVar.ordinal()] : -1;
            if (i4 == 1) {
                i2 = 0;
            } else if (i4 == 2) {
                i2 = 1;
            } else if (i4 != 3) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            z0k.a(a4h.a(new m1f0(cb40.a(R.string.page_limits__betting_limits, new Object[0], bVarI), null, pp8.b(1486604, new oes(function2), bVarI), 6), new m1f0(cb40.a(R.string.page_limits__time_limits, new Object[0], bVarI), null, pp8.b(-999569267, new oun(1, function2), bVarI), 6), new m1f0(cb40.a(R.string.page_limits__loss_limits, new Object[0], bVarI), null, pp8.b(-2000625138, new Function2() { // from class: pes
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Function1 function3 = function2;
                        boolean zM = aVar3.M(function3);
                        Object objY = aVar3.y();
                        if (zM || objY == a.C0041a.a) {
                            objY = new run(1, function3);
                            aVar3.r(objY);
                        }
                        rlt.a(null, (Function0) objY, aVar3, 0);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), 6)), i2, 0L, a4f0.b, bVarI, 3072, 20);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: qes
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(385);
                    ses.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
