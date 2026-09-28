package defpackage;

import androidx.compose.foundation.layout.h;
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
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class z2h0 {
    public static final void a(final d dVar, final x0h0 x0h0Var, final Function0 function0, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVar;
        int i3;
        boolean z;
        final String str = x0h0Var.a;
        b bVarI = aVar.i(1684588625);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(x0h0Var) : bVarI.A(x0h0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarJ = h.j(dVar, 0.0f, 16.0f, 0.0f, 4.0f, 5);
            i78 i78VarA = g78.a(kw0.c, ht.a.n, bVarI, 48);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarJ);
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
            imf0 imf0Var = imf0.d;
            bVarI.N(1636534431);
            nk0.b bVar2 = new nk0.b((Object) null);
            String strA = cb40.a(R.string.common_functions__customer_service, new Object[0], bVarI);
            String strA2 = cb40.a(R.string.page_transaction__need_help_reach_out_to_vservice, new Object[]{strA}, bVarI);
            int iL = bVar2.l(imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.text_type1_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a);
            try {
                bVar2.g(strA2);
                Unit unit = Unit.a;
                bVar2.i(iL);
                jlf0 jlf0Var = new jlf0(imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a, 14);
                boolean z2 = (i2 & 896) == 256;
                Object objY = bVarI.y();
                boolean z3 = z2;
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (z3 || objY == c0042a) {
                    objY = new ufs() { // from class: v2h0
                        @Override // defpackage.ufs
                        public final void a(rfs rfsVar) {
                            rfsVar.getClass();
                            function0.invoke();
                        }
                    };
                    bVarI.r(objY);
                }
                bVar2.a(new rfs.a("onCustomerService", jlf0Var, (ufs) objY), StringsKt.T(strA2, strA, 0, false, 6), strA.length() + StringsKt.T(strA2, strA, 0, false, 6));
                int i4 = i2;
                nk0 nk0VarM = bVar2.m();
                bVarI.X(false);
                lkf0.e(nk0VarM, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0Var, bVarI, 0, 100663296, 262142);
                int length = str.length();
                d.a aVar3 = d.a.b;
                if (length == 0) {
                    hnw.a(bVarI, -805488019, aVar3, 8.0f, bVarI);
                    bVarI.N(1636589274);
                    nk0.b bVar3 = new nk0.b((Object) null);
                    String str2 = x0h0Var.c;
                    String strA3 = cb40.a(R.string.page_transaction__or_email_vmail, new Object[]{str2}, bVarI);
                    ora0 ora0Var = imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.text_type1_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a;
                    ora0 ora0Var2 = imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a;
                    int iT = StringsKt.T(strA3, str2, 0, false, 6);
                    int length2 = str2.length() + iT;
                    int iL2 = bVar3.l(ora0Var);
                    try {
                        bVar3.g(strA3.substring(0, iT));
                        bVar3.i(iL2);
                        int iL3 = bVar3.l(ora0Var2);
                        try {
                            bVar3.g(strA3.substring(iT, length2));
                            bVar3.i(iL3);
                            int iL4 = bVar3.l(ora0Var);
                            try {
                                bVar3.g(strA3.substring(length2));
                                bVar3.i(iL4);
                                nk0 nk0VarM2 = bVar3.m();
                                bVarI.X(false);
                                lkf0.e(nk0VarM2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0Var, bVarI, 0, 100663296, 262142);
                                bVar = bVarI;
                                bVar.X(false);
                            } catch (Throwable th) {
                                bVar3.i(iL4);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            bVar3.i(iL3);
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        bVar3.i(iL2);
                        throw th3;
                    }
                } else {
                    hnw.a(bVarI, -803994749, aVar3, 8.0f, bVarI);
                    bVarI.N(1636637074);
                    nk0.b bVar4 = new nk0.b((Object) null);
                    final String str3 = x0h0Var.b;
                    String strA4 = cb40.a(R.string.page_transaction__or_call_vphone, new Object[]{(str3 == null || str3.length() == 0) ? str : tug.a(str, " / ", str3)}, bVarI);
                    int iL5 = bVar4.l(imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.text_type1_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a);
                    try {
                        bVar4.g(strA4);
                        bVar4.i(iL5);
                        jlf0 jlf0Var2 = new jlf0(imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a, 14);
                        int i5 = i4 & 7168;
                        boolean zM = (i5 == 2048) | bVarI.M(str);
                        Object objY2 = bVarI.y();
                        if (zM || objY2 == c0042a) {
                            objY2 = new ufs() { // from class: w2h0
                                @Override // defpackage.ufs
                                public final void a(rfs rfsVar) {
                                    rfsVar.getClass();
                                    function1.invoke(str);
                                }
                            };
                            bVarI.r(objY2);
                        }
                        bVar4.a(new rfs.a("onCall", jlf0Var2, (ufs) objY2), StringsKt.T(strA4, str, 0, false, 6), str.length() + StringsKt.T(strA4, str, 0, false, 6));
                        if (str3 == null || str3.length() == 0) {
                            i3 = R.style.B2_R;
                            z = false;
                            bVarI.N(-96837774);
                            bVarI.X(false);
                        } else {
                            bVarI.N(-97773788);
                            i3 = R.style.B2_R;
                            jlf0 jlf0Var3 = new jlf0(imf0.b(mla.l(R.style.B2_R, bVarI), c68.a(R.color.brand_secondary, bVarI), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214).a, 14);
                            boolean zM2 = bVarI.M(str3) | (i5 == 2048);
                            Object objY3 = bVarI.y();
                            if (zM2 || objY3 == c0042a) {
                                objY3 = new ufs() { // from class: x2h0
                                    @Override // defpackage.ufs
                                    public final void a(rfs rfsVar) {
                                        rfsVar.getClass();
                                        function1.invoke(str3);
                                    }
                                };
                                bVarI.r(objY3);
                            }
                            rfs.a aVar4 = new rfs.a("onCall", jlf0Var3, (ufs) objY3);
                            z = false;
                            bVar4.a(aVar4, StringsKt.T(strA4, str3, 0, false, 6), str3.length() + StringsKt.T(strA4, str3, 0, false, 6));
                            bVarI.X(false);
                        }
                        nk0 nk0VarM3 = bVar4.m();
                        bVarI.X(z);
                        lkf0.e(nk0VarM3, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, imf0Var, bVarI, 0, 100663296, 262142);
                        ty0.a(bVarI, j.i(aVar3, 8.0f));
                        lkf0.d(cb40.a(R.string.page_transaction__call_charges_may_apply_as_per_your_service_provider, new Object[0], bVarI), null, c68.a(R.color.text_type1_secondary, bVarI), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(i3, bVarI), bVarI, 0, 0, 131066);
                        bVar = bVarI;
                        bVar.X(false);
                    } catch (Throwable th4) {
                        bVar4.i(iL5);
                        throw th4;
                    }
                }
                bVar.X(true);
            } catch (Throwable th5) {
                bVar2.i(iL);
                throw th5;
            }
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: y2h0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z2h0.a(dVar, x0h0Var, function0, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
