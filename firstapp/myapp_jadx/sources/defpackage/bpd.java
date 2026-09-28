package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bpd implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bpd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                jpd jpdVar = (jpd) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    ytw ytwVarC = wyh.c(jpdVar.P0().I0, aVar, 0, 7);
                    uxs uxsVarB = aza.b((c330) ytwVarC.getValue());
                    c330 c330Var = (c330) ytwVarC.getValue();
                    c330.a aVar2 = c330Var instanceof c330.a ? (c330.a) c330Var : null;
                    UiText uiText = aVar2 != null ? aVar2.b : null;
                    if (uiText == null) {
                        uiText = vch0.a;
                    } else {
                        StringUiText stringUiText = vch0.a;
                    }
                    UiText uiText2 = uiText;
                    boolean zA = aVar.A(jpdVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        objY = new fpd(jpdVar, i2);
                        aVar.r(objY);
                    }
                    i7e.a(null, uiText2, uxsVarB, (Function0) objY, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                String str = (String) obj3;
                a aVar3 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    d.a aVar4 = d.a.b;
                    d dVarG = j.g(aVar4, 1.0f);
                    i78 i78VarA = g78.a(kw0.c, ht.a.n, aVar3, 48);
                    int iHashCode = Long.hashCode(aVar3.m());
                    ne00 ne00VarO = aVar3.o();
                    d dVarC = c.c(aVar3, dVarG);
                    yka.k.getClass();
                    tsr.a aVar5 = yka.a.b;
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar5);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, i78VarA, yka.a.f);
                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                    }
                    hlh0.a(aVar3, dVarC, yka.a.d);
                    lkf0.d(str, h.j(aVar4, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.brand_secondary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(21.0f, aVar3), 0, false, 0, 0, null, mla.l(R.style.H3_B, aVar3), aVar3, 48, 0, 127992);
                    lkf0.d(cb40.a(R.string.personal_page__confirm_your_username_message, new Object[0], aVar3), h.j(aVar4, 0.0f, 16.0f, 0.0f, 0.0f, 13), c68.a(R.color.text_type1_primary, aVar3), null, 0L, null, null, null, 0L, null, new gdf0(3), mla.m(21.0f, aVar3), 0, false, 0, 0, null, mla.l(R.style.B1_R, aVar3), aVar3, 48, 0, 127992);
                    aVar3.s();
                } else {
                    aVar3.G();
                }
                return Unit.a;
        }
    }
}
