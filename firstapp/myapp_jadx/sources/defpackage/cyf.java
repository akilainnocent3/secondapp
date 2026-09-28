package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cyf {
    public static final void a(uf00<? extends UiText> uf00Var, Function0<Unit> function0, Function0<Unit> function1, Function0<Unit> function2, a aVar, final int i) {
        final Function0<Unit> function3;
        final Function0<Unit> function4;
        final Function0<Unit> function5;
        final uf00<? extends UiText> uf00Var2;
        uf00Var.getClass();
        function0.getClass();
        function1.getClass();
        function2.getClass();
        b bVarI = aVar.i(-1587117588);
        int i2 = (bVarI.M(uf00Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            b(uf00Var, function0, function1, function2, bVarI, i2 & 8190);
            uf00Var2 = uf00Var;
            function5 = function0;
            function4 = function1;
            function3 = function2;
        } else {
            function3 = function2;
            function4 = function1;
            function5 = function0;
            uf00Var2 = uf00Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function5, function4, function3, i) { // from class: yxf
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cyf.a(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final uf00<? extends UiText> uf00Var, final Function0<Unit> function0, final Function0<Unit> function1, final Function0<Unit> function2, a aVar, final int i) {
        b bVarI = aVar.i(1242707131);
        int i2 = (bVarI.M(uf00Var) ? 4 : 2) | i | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128) | (bVarI.A(function2) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            x8d0.a(null, pp8.b(1749680676, new Function2() { // from class: zxf
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        odd0.c(null, cb40.a(R.string.email_change__verified_email_change, new Object[0], aVar2), function0, function1, aVar2, 0, 1);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), null, null, pp8.b(-1170267030, new gaj() { // from class: ayf
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    tmz tmzVar = (tmz) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    tmzVar.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(tmzVar) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        d.a aVar3 = d.a.b;
                        d dVarI = h.i(h.e(j.e(aVar3, 1.0f), tmzVar), 32.0f, 94.0f, 32.0f, 24.0f);
                        i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar2, 48);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarI);
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
                        hlh0.a(aVar2, i78VarA, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        h9n.a(erz.a(R.drawable.account_activation_successful, 0, aVar2), "", j.r(aVar3, 120.0f), null, null, 0.0f, null, aVar2, 432, 120);
                        lkf0.d(cb40.a(R.string.email_change__notice_title, new Object[0], aVar2), h.h(aVar3, 0.0f, 24.0f, 1), c68.a(R.color.text_primary, aVar2), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mla.l(R.style.H1_B, aVar2), aVar2, 48, 0, 131064);
                        pj5.a(h.h(new LayoutWeightElement(1.0f, true), 8.0f, 0.0f, 2), uf00Var, null, null, null, aVar2, 0);
                        xya.a(j.g(aVar3, 1.0f), false, cb40.a(R.string.common_functions__verify, new Object[0], aVar2), "email_change_verify_button", null, null, null, null, null, function2, aVar2, 3078, 498);
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 24624, 13);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function0, function1, function2, i) { // from class: byf
                public final /* synthetic */ Function0 b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ Function0 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    cyf.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
