package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.widget.TextView;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class x0b {
    public static final void a(int i, a aVar, final String str, Function0 function0) {
        b bVarA = mzj.a(-1205735993, aVar, str, function0);
        int i2 = (bVarA.M(str) ? 4 : 2) | i | (bVarA.A(function0) ? 32 : 16);
        if (bVarA.q(i2 & 1, (i2 & 19) != 18)) {
            long jA = c68.a(R.color.brand_tertiary, bVarA);
            long jA2 = c68.a(R.color.background_disable_type2_primary, bVarA);
            long jA3 = c68.a(R.color.brand_tertiary, bVarA);
            alb0 alb0Var = qdf0.a;
            ryj ryjVarA = syj.a(jA2, jA3, jA, qdf0.a(390, 2, r58.d(4292275164L), bVarA), null, bVarA, 16);
            bVarA = bVarA;
            nzj.a(null, null, null, ryjVarA, pp8.b(126404170, new gaj() { // from class: tvt
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, d.a.b);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar3);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new uvt();
                            aVar2.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        final String str2 = str;
                        boolean zM = aVar2.M(str2);
                        Object objY2 = aVar2.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new Function1() { // from class: vvt
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    TextView textView = (TextView) obj4;
                                    textView.getClass();
                                    Spanned spannedFromHtml = Html.fromHtml(str2, 0);
                                    spannedFromHtml.getClass();
                                    textView.setText(StringsKt.t0(spannedFromHtml));
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY2);
                        }
                        androidx.compose.ui.viewinterop.b.a(function1, null, (Function1) objY2, aVar2, 6, 2);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), null, null, null, null, null, function0, function0, null, bVarA, 24576, ((i2 >> 3) & 14) | (i2 & 112), 5095);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new ox6(str, i, 1, function0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x0b.b(int, int, int, boolean):int");
    }
}
