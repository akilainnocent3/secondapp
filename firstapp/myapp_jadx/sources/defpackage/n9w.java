package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n9w {
    public static final void a(final int i, a aVar, final d dVar, Function0 function0) {
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(-1361476016);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            String strA = cb40.a(R.string.biometrics_authentication__biometrics_authentication, new Object[0], bVarI);
            c380[] c380VarArr = c380.a;
            d.a aVar2 = d.a.b;
            function1 = function0;
            arc0.a(aVar2, strA, null, true, null, function1, hf9.a, bVarI, 12782598 | ((i2 << 15) & 3670016), 20);
            dVar = aVar2;
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: k9w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n9w.a(qj40.a(i | 1), (a) obj, dVar, function1);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final int i, a aVar, final String str, final Function0 function0, final boolean z) {
        int i2;
        String strA;
        qyd0 qyd0Var;
        long j;
        b bVarA = mzj.a(1783270002, aVar, str, function0);
        if ((i & 6) == 0) {
            i2 = (bVarA.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarA.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarA.A(function0) ? 256 : 128;
        }
        if (bVarA.q(i2 & 1, (i2 & 147) != 146)) {
            String strA2 = cb40.a(R.string.wap_profile__email, new Object[0], bVarA);
            if (z) {
                bVarA.N(30527876);
                strA = cb40.a(R.string.common_functions__edit, new Object[0], bVarA);
                bVarA.X(false);
            } else {
                bVarA.N(30529623);
                bVarA.X(false);
                strA = str;
            }
            if (z) {
                bVarA.N(946553041);
                qyd0Var = oib0.a;
                j = ((lib0) bVarA.O(qyd0Var)).g;
                bVarA.X(false);
            } else {
                bVarA.N(946621148);
                qyd0Var = oib0.a;
                j = ((lib0) bVarA.O(qyd0Var)).b;
                bVarA.X(false);
            }
            yqc0 yqc0Var = new yqc0(((lib0) bVarA.O(qyd0Var)).i0, ((lib0) bVarA.O(qyd0Var)).a, j);
            c380[] c380VarArr = c380.a;
            arc0.a(null, strA2, strA, z, yqc0Var, function0, pp8.b(671491186, new gaj() { // from class: l9w
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        if (z) {
                            aVar2.N(-1563687305);
                            h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, aVar2), "more", j.r(aVar3, 16.0f), ((lib0) aVar2.O(oib0.a)).b, aVar2, 432, 0);
                            aVar2.H();
                        } else {
                            aVar2.N(-1563418566);
                            ty0.a(aVar2, j.w(aVar3, 4.0f));
                            h6n.b(erz.a(R.drawable.ic__successful, 0, aVar2), "verified", null, ((lib0) aVar2.O(oib0.a)).R, aVar2, 48, 4);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarA), bVarA, ((i2 << 6) & 7168) | 12779520 | ((i2 << 12) & 3670016), 1);
        } else {
            bVarA.G();
        }
        e eVarZ = bVarA.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: m9w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n9w.b(qj40.a(i | 1), (a) obj, str, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final o9w o9wVar, final Function1<? super b9w, Unit> function1, a aVar, final int i) {
        b bVar;
        boolean z;
        function1.getClass();
        b bVarI = aVar.i(-1561113041);
        int i2 = (bVarI.M(o9wVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16);
        if (!bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVar = bVarI;
            bVar.G();
        } else if (Intrinsics.g(o9wVar, o9w.c.a)) {
            bVarI.N(-1212543572);
            cys.a(null, bVarI, 0);
            bVarI.X(false);
            bVar = bVarI;
        } else {
            boolean z2 = o9wVar instanceof o9w.d;
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z2) {
                bVarI.N(-1212441086);
                o9w.d dVar = (o9w.d) o9wVar;
                String string = dVar.a.toString();
                UiText uiText = dVar.b;
                uiText.getClass();
                String strG = uiText.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                String strA = cb40.a(R.string.email_change__resend_email, new Object[0], bVarI);
                int i3 = i2 & 112;
                boolean z3 = i3 == 32;
                Object objY = bVarI.y();
                if (z3 || objY == c0042a) {
                    objY = new Function0() { // from class: e9w
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(c9w.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                Function0 function0 = (Function0) objY;
                z = i3 == 32;
                Object objY2 = bVarI.y();
                if (z || objY2 == c0042a) {
                    objY2 = new f9w(function1, 0);
                    bVarI.r(objY2);
                }
                nzj.d(string, strG, null, null, null, strA, null, null, null, null, null, function0, (Function0) objY2, null, bVarI, 0, 0, 20412);
                bVar = bVarI;
                bVar.X(false);
            } else {
                bVar = bVarI;
                if (o9wVar instanceof o9w.a) {
                    bVar.N(-1211906243);
                    o9w.a aVar2 = (o9w.a) o9wVar;
                    ResourceUiText resourceUiText = aVar2.a;
                    qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
                    String strG2 = resourceUiText.g((Context) bVar.O(qyd0Var));
                    UiText uiText2 = aVar2.b;
                    uiText2.getClass();
                    String strG3 = uiText2.g((Context) bVar.O(qyd0Var));
                    boolean z4 = (i2 & 112) == 32;
                    Object objY3 = bVar.y();
                    if (z4 || objY3 == c0042a) {
                        objY3 = new ish(function1, 1);
                        bVar.r(objY3);
                    }
                    nzj.b(null, strG2, strG3, null, null, null, null, null, null, null, null, null, (Function0) objY3, null, bVar, 0, 0, 12281);
                    bVar = bVar;
                    bVar.X(false);
                } else if (Intrinsics.g(o9wVar, o9w.b.a)) {
                    bVar.N(-1211578728);
                    String strA2 = cb40.a(R.string.common_functions__error, new Object[0], bVar);
                    String strA3 = cb40.a(R.string.common_feedback__something_went_wrong_please_try_again_later, new Object[0], bVar);
                    z = (i2 & 112) == 32;
                    Object objY4 = bVar.y();
                    if (z || objY4 == c0042a) {
                        objY4 = new Function0() { // from class: g9w
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function1.invoke(c9w.a);
                                return Unit.a;
                            }
                        };
                        bVar.r(objY4);
                    }
                    nzj.b(null, strA2, strA3, null, null, null, null, null, null, null, null, null, (Function0) objY4, null, bVar, 0, 0, 12281);
                    bVar = bVar;
                    bVar.X(false);
                } else {
                    if (o9wVar != null) {
                        throw igf0.a(bVar, -1286040704, false);
                    }
                    bVar.N(-1285995853);
                    bVar.X(false);
                }
            }
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, i) { // from class: h9w
                public final /* synthetic */ Function1 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    n9w.c(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(final int i, a aVar, final Function0 function0, final boolean z) {
        int i2;
        final Function0 function1;
        function0.getClass();
        b bVarI = aVar.i(-50338076);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(function0) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            String strA = cb40.a(R.string.component_two_fa__email_2fa, new Object[0], bVarI);
            c380[] c380VarArr = c380.a;
            function1 = function0;
            arc0.a(null, strA, null, true, null, function1, pp8.b(-155743004, new gaj() { // from class: i9w
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (!aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        aVar2.G();
                    } else if (z) {
                        aVar2.N(-1175091815);
                        d160 d160VarA = b160.a(new kw0.i(((cjb0) aVar2.O(ejb0.a)).c, true, new hw0()), ht.a.k, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d.a aVar3 = d.a.b;
                        d dVarC = c.c(aVar2, aVar3);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, d160VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        String strA2 = cb40.a(R.string.wap_setting__on, new Object[0], aVar2);
                        imf0 imf0VarB = imf0.b(((ijb0) aVar2.O(kjb0.a)).l, 0L, 0L, t9i.f, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211);
                        qyd0 qyd0Var = oib0.a;
                        lkf0.d(strA2, null, ((lib0) aVar2.O(qyd0Var)).g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0VarB, aVar2, 0, 0, 131066);
                        h6n.b(pib0.a(R.drawable.ic__arrow_chevron_right, 0, aVar2), "TwoFactorAuth", j.r(aVar3, 16.0f), ((lib0) aVar2.O(qyd0Var)).P, aVar2, 432, 0);
                        aVar2.s();
                        aVar2.H();
                    } else {
                        aVar2.N(-1174368616);
                        xya.a(null, false, cb40.a(R.string.wap_setting__set_up, new Object[0], aVar2), "set_up_two_factor_auth", alb0.a(sya.e, null, h.a(2, ((cjb0) aVar2.O(ejb0.a)).d, 0.0f), 0L, 0.0f, 27), null, null, null, null, function0, aVar2, 3072, 483);
                        aVar2.H();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, ((i2 << 15) & 3670016) | 12782592, 21);
        } else {
            function1 = function0;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j9w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n9w.d(qj40.a(i | 1), (a) obj, function1, z);
                    return Unit.a;
                }
            };
        }
    }
}
