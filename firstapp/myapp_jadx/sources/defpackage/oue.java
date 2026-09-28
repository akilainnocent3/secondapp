package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oue extends qlr implements Function2<a, Integer, Unit> {
    public final /* synthetic */ ytw a;
    public final /* synthetic */ nwa b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ aue d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Function1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oue(ytw ytwVar, nwa nwaVar, Function0 function0, aue aueVar, long j, Function1 function1) {
        super(2);
        this.a = ytwVar;
        this.b = nwaVar;
        this.c = function0;
        this.d = aueVar;
        this.e = j;
        this.f = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(a aVar, Integer num) throws jm5 {
        a aVar2 = aVar;
        if ((num.intValue() & 3) == 2 && aVar2.j()) {
            aVar2.G();
        } else {
            this.a.setValue(Unit.a);
            nwa nwaVar = this.b;
            int i = nwaVar.b;
            nwaVar.g();
            aVar2.N(-242279733);
            float f = pue.a;
            int i2 = nwaVar.d;
            nwaVar.d = i2 + 1;
            Integer numValueOf = Integer.valueOf(i2);
            gtr gtrVar = new gtr(numValueOf);
            im5 im5VarA = nwaVar.a(gtrVar);
            im5VarA.w("vGuideline");
            im5VarA.v(f, "start");
            nwaVar.c(1);
            nwaVar.c(Float.hashCode(f));
            iwa.b bVar = new iwa.b(numValueOf, 0, gtrVar);
            nwa nwaVar2 = nwa.this;
            cwa cwaVarE = nwaVar2.e();
            cwa cwaVarE2 = nwaVar2.e();
            cwa cwaVarE3 = nwaVar2.e();
            d.a aVar3 = d.a.b;
            d dVarR = j.r(aVar3, 32.0f);
            boolean zM = aVar2.M(cwaVarE2);
            aue aueVar = this.d;
            boolean zM2 = zM | aVar2.M(aueVar);
            Object objY = aVar2.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zM2 || objY == c0042a) {
                objY = new hue(cwaVarE2, aueVar);
                aVar2.r(objY);
            }
            mw90.a("https://s.sporty.net/cms/party_popper_exploding_with_confetti_shape_stars_spirals_circles_2_1_ec25f1f7e8.png", "birthday gift", nwa.d(dVarR, cwaVarE, (Function1) objY), null, null, null, null, aVar2, 54, 2040);
            a aVar4 = aVar2;
            boolean zM3 = aVar4.M(bVar);
            Object objY2 = aVar4.y();
            if (zM3 || objY2 == c0042a) {
                objY2 = new iue(bVar);
                aVar4.r(objY2);
            }
            d dVarD = nwa.d(aVar3, cwaVarE2, (Function1) objY2);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, aVar4, 0);
            int iHashCode = Long.hashCode(aVar4.m());
            ne00 ne00VarO = aVar4.o();
            d dVarC = c.c(aVar4, dVarD);
            yka.k.getClass();
            tsr.a aVar5 = yka.a.b;
            zte zteVar = null;
            if (aVar4.k() == null) {
                l2a.b();
                throw null;
            }
            aVar4.D();
            if (aVar4.g()) {
                aVar4.F(aVar5);
            } else {
                aVar4.p();
            }
            hlh0.a(aVar4, i78VarA, yka.a.f);
            hlh0.a(aVar4, ne00VarO, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (aVar4.g() || !Intrinsics.g(aVar4.y(), Integer.valueOf(iHashCode))) {
                j3c.a(iHashCode, aVar4, iHashCode, c1350a);
            }
            hlh0.a(aVar4, dVarC, yka.a.d);
            if (aueVar instanceof aue.c) {
                aVar4.N(102536507);
                pue.e(uch0.a(bue.c(aueVar), aVar4), false, bue.b(aueVar), aVar4, 0, 2);
                pue.a(uch0.a(((aue.c) aueVar).a, aVar4), aVar4, 0);
                pue.d(uch0.a(bue.a(aueVar), aVar4), aVar4, 0);
                aVar4.H();
            } else if (aueVar instanceof aue.b) {
                aVar4.N(102918706);
                pue.e(uch0.a(bue.c(aueVar), aVar4), true, bue.b(aueVar), aVar4, 48, 0);
                pue.a(uch0.a(((aue.b) aueVar).a, aVar4), aVar4, 0);
                pue.d(uch0.a(bue.a(aueVar), aVar4), aVar4, 0);
                aVar4.H();
            } else if (aueVar instanceof aue.a) {
                aVar4.N(103369849);
                pue.e(uch0.a(bue.c(aueVar), aVar4), false, bue.b(aueVar), aVar4, 0, 2);
                aue.a aVar6 = (aue.a) aueVar;
                pue.a(uch0.a(aVar6.a, aVar4), aVar4, 0);
                ute.b(h.h(j.g(aVar3, 1.0f), 0.0f, 12.0f, 1), 0.5f, r58.b(871034095), aVar4, 438, 0);
                aVar4 = aVar4;
                StringUiText stringUiText = vch0.a;
                pue.e(uch0.a(new ResourceUiText(R.string.page_loyalty__birthday_gift), aVar4), false, false, aVar4, 384, 2);
                pue.a(uch0.a(aVar6.b, aVar4), aVar4, 0);
                pue.d(uch0.a(bue.a(aueVar), aVar4), aVar4, 0);
                aVar4.H();
            } else {
                if (!(aueVar instanceof aue.d)) {
                    throw rg.a(1942970001, aVar4);
                }
                aVar4.N(104310110);
                pue.e(uch0.a(bue.c(aueVar), aVar4), true, bue.b(aueVar), aVar4, 48, 0);
                pue.d(uch0.a(bue.a(aueVar), aVar4), aVar4, 0);
                aVar4.H();
            }
            aVar4.s();
            if (aueVar instanceof aue.a) {
                StringUiText stringUiText2 = vch0.a;
                zteVar = new zte(new ResourceUiText(R.string.page_loyalty__verify_dob), wae.DOB_VERIFICATION);
            } else if ((aueVar instanceof aue.d) || (aueVar instanceof aue.b)) {
                StringUiText stringUiText3 = vch0.a;
                zteVar = new zte(new ResourceUiText(R.string.component_betslip__place_bet), wae.HOME);
            }
            if (zteVar == null) {
                aVar4.N(-239220872);
                aVar4.H();
            } else {
                aVar4.N(-239220871);
                String strA = uch0.a(zteVar.a, aVar4);
                boolean zM4 = aVar4.M(bVar) | aVar4.M(cwaVarE2);
                Object objY3 = aVar4.y();
                if (zM4 || objY3 == c0042a) {
                    objY3 = new jue(bVar, cwaVarE2);
                    aVar4.r(objY3);
                }
                d dVarD2 = nwa.d(aVar3, cwaVarE3, (Function1) objY3);
                Function1 function1 = this.f;
                boolean zM5 = aVar4.M(function1) | aVar4.A(zteVar);
                Object objY4 = aVar4.y();
                if (zM5 || objY4 == c0042a) {
                    objY4 = new kue(function1, zteVar);
                    aVar4.r(objY4);
                }
                pue.b(0, this.e, aVar4, dVarD2, strA, (Function0) objY4);
                aVar4.H();
            }
            aVar4.H();
            if (nwaVar.b != i) {
                use useVar = xvf.a;
                aVar4.t(this.c);
            }
        }
        return Unit.a;
    }
}
