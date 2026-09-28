package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class iuf {
    public static final void a(final Function0 function0, final Function0 function1, final Function0 function2, muf mufVar, a aVar, final int i) {
        int i2;
        final muf mufVar2;
        final muf mufVar3;
        int i3;
        b bVarA = yoh0.a(function0, function1, function2, aVar, -1022621471);
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
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        int i4 = 0;
        if (bVarA.q(i2 & 1, (i2 & 1171) != 1170)) {
            bVarA.A0();
            if ((i & 1) == 0 || bVarA.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarA);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                j8i0 j8i0VarA = p8i0.a(jq40.a(muf.class), w8i0VarA, null, cll.a(w8i0VarA, bVarA), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarA);
                bVarA = bVarA;
                mufVar3 = (muf) j8i0VarA;
                i3 = i2 & (-7169);
            } else {
                bVarA.G();
                i3 = i2 & (-7169);
                mufVar3 = mufVar;
            }
            bVarA.Y();
            boolean zA = bVarA.A(mufVar3);
            Object objY = bVarA.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: buf
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        muf mufVar4 = mufVar3;
                        jvd0 jvd0Var = mufVar4.y;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                        mufVar4.y = mufVar4.y1(new kuf(mufVar4, null));
                        return Unit.a;
                    }
                };
                bVarA.r(objY);
            }
            xfa.e((Function0) objY, bVarA, 0);
            ftf.a(mufVar3.d, function2, bVarA, (i3 >> 3) & 112);
            int i5 = i3 << 3;
            hqf.a(cb40.a(R.string.page_limits__time_limits, new Object[0], bVarA), function0, function1, pp8.b(1842212867, new cuf(mufVar3, i4), bVarA), bVarA, (i5 & 112) | 3072 | (i5 & 896));
            mufVar2 = mufVar3;
        } else {
            bVarA.G();
            mufVar2 = mufVar;
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: duf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    iuf.a(function0, function1, function2, mufVar2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
