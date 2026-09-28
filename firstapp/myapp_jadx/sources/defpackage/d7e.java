package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class d7e {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.compose.runtime.b] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.runtime.a, androidx.compose.runtime.b] */
    public static final void a(final wrd wrdVar, final wg8 wg8Var, final vc8 vc8Var, final Function1 function1, final Function1 function2, final Function1 function3, final op8 op8Var, a aVar, final int i) {
        int i2;
        ?? r5;
        a.C0041a.C0042a c0042a;
        Context context;
        int i3;
        wg8Var.getClass();
        vc8Var.getClass();
        function1.getClass();
        function2.getClass();
        function3.getClass();
        b bVarI = aVar.i(1226473061);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(wrdVar) : bVarI.A(wrdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(wg8Var) : bVarI.A(wg8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(vc8Var) : bVarI.A(vc8Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function3) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 1048576 : 524288;
        }
        int i4 = i2;
        if (bVarI.q(i4 & 1, (i4 & 599187) != 599186)) {
            Context context2 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            int i5 = i4 & 14;
            boolean z = i5 == 4 || ((i4 & 8) != 0 && bVarI.A(wrdVar));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a2 = a.C0041a.a;
            if (z || objY == c0042a2) {
                c0042a = c0042a2;
                context = context2;
                i3 = 0;
                c7e c7eVar = new c7e(0, wrdVar, wrd.class, "onPause", "onPause()V", 0);
                bVarI.r(c7eVar);
                objY = c7eVar;
            } else {
                context = context2;
                i3 = 0;
                c0042a = c0042a2;
            }
            xfa.d((Function0) ((chp) objY), bVarI, i3);
            int i6 = i4 >> 3;
            ?? r6 = bVarI;
            o900.a(wrdVar, wg8Var, function1, function2, pp8.b(-1811383270, new Function2() { // from class: u6e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        op8Var.invoke(aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), r6, 24584 | i5 | (i4 & 112) | (i6 & 896) | (i6 & 7168));
            yzd yzdVar = vc8Var.a;
            mqv mqvVar = vc8Var.c;
            if (yzdVar != null) {
                r6.N(572998711);
                String strG = yzdVar.a.g(context);
                String string = yzdVar.b.e(context).toString();
                int i7 = (i4 & 458752) != 131072 ? i3 : 1;
                Object objY2 = r6.y();
                if (i7 != 0 || objY2 == c0042a) {
                    objY2 = new v6e(function3, i3);
                    r6.r(objY2);
                }
                ga2.a(strG, string, null, (Function0) objY2, null, null, r6, 0, 52);
                r6.X(i3);
                r5 = r6;
            } else {
                int i8 = i3;
                a.C0041a.C0042a c0042a3 = c0042a;
                if (vc8Var.b) {
                    r6.N(573396069);
                    String strA = cb40.a(R.string.page_payment__pending_request, new Object[i8], r6);
                    String strA2 = cb40.a(R.string.page_payment__deposit_pending_nuvei, new Object[i8], r6);
                    int i9 = i4 & 458752;
                    ?? r4 = i9 == 131072 ? 1 : i8;
                    Object objY3 = r6.y();
                    if (r4 != 0 || objY3 == c0042a3) {
                        objY3 = new w6e(function3, i8);
                        r6.r(objY3);
                    }
                    Function0 function0 = (Function0) objY3;
                    String strA3 = cb40.a(R.string.common_functions__transactions, new Object[i8], r6);
                    ?? r17 = i9 != 131072 ? i8 : 1;
                    Object objY4 = r6.y();
                    if (r17 != 0 || objY4 == c0042a3) {
                        objY4 = new x6e(function3, i8);
                        r6.r(objY4);
                    }
                    ga2.a(strA, strA2, null, function0, strA3, (Function0) objY4, r6, 0, 4);
                    r6.X(i8);
                    r5 = r6;
                } else if (mqvVar != null) {
                    r6.N(573960269);
                    String strA4 = cb40.a(R.string.page_payment__your_deposit_request_has_been_submitted_you_will_need_tier_vlevel_pending_on_provider_side, new Object[]{String.valueOf(mqvVar.a)}, r6);
                    ?? r18 = (i4 & 458752) != 131072 ? i8 : 1;
                    Object objY5 = r6.y();
                    if (r18 != 0 || objY5 == c0042a3) {
                        objY5 = new y6e(function3, i8);
                        r6.r(objY5);
                    }
                    k2l.a(R.drawable.ic_security, i8, r6, strA4, (Function0) objY5);
                    r6.X(i8);
                    r5 = r6;
                } else if (vc8Var.d) {
                    r6.N(574523880);
                    String strA5 = cb40.a(R.string.page_payment__you_have_a_deposit_that_is_pending_your_kyc_tip, new Object[i8], r6);
                    int i10 = i4 & 458752;
                    ?? r7 = i10 == 131072 ? 1 : i8;
                    Object objY6 = r6.y();
                    if (r7 != 0 || objY6 == c0042a3) {
                        objY6 = new z6e(function3, i8);
                        r6.r(objY6);
                    }
                    Function0 function4 = (Function0) objY6;
                    ?? r19 = i10 != 131072 ? i8 : 1;
                    Object objY7 = r6.y();
                    if (r19 != 0 || objY7 == c0042a3) {
                        objY7 = new a7e(function3, i8);
                        r6.r(objY7);
                    }
                    n1l.a(i8, r6, strA5, function4, (Function0) objY7);
                    r6.X(i8);
                    r5 = r6;
                } else {
                    r6.N(574857533);
                    r6.X(i8);
                    r5 = r6;
                }
            }
        } else {
            b bVar = bVarI;
            bVar.G();
            r5 = bVar;
        }
        e eVarZ = r5.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: b7e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d7e.a(wrdVar, wg8Var, vc8Var, function1, function2, function3, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
