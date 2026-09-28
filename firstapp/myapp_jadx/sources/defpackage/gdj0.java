package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.handler.winningpopup.winningpopupdoubleornothing.WinningPopupDoubleOrNothingStakeInputHandlerImpl$init$2", f = "WinningPopupDoubleOrNothingStakeInputHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gdj0 extends tje0 implements iaj<j4f, Boolean, String, v1b<? super kdj0>, Object> {
    public /* synthetic */ j4f a;
    public /* synthetic */ boolean b;
    public /* synthetic */ String c;
    public final /* synthetic */ idj0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdj0(idj0 idj0Var, v1b<? super gdj0> v1bVar) {
        super(4, v1bVar);
        this.d = idj0Var;
    }

    @Override // defpackage.iaj
    public final Object d(j4f j4fVar, Boolean bool, String str, v1b<? super kdj0> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        gdj0 gdj0Var = new gdj0(this.d, v1bVar);
        gdj0Var.a = j4fVar;
        gdj0Var.b = zBooleanValue;
        gdj0Var.c = str;
        return gdj0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BigDecimal bigDecimalMultiply;
        ldj0 aVar;
        jdj0 jdj0Var;
        j4f j4fVar = this.a;
        boolean z = this.b;
        String str = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BigDecimal bigDecimalG = b.g(str);
        if (bigDecimalG != null) {
            BigDecimal bigDecimal = s5y.a;
            bigDecimal.getClass();
            bigDecimalMultiply = bigDecimalG.multiply(bigDecimal);
            bigDecimalMultiply.getClass();
        } else {
            bigDecimalMultiply = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = j4fVar.f;
        BigDecimal bigDecimal3 = j4fVar.g;
        BigDecimal bigDecimal4 = j4fVar.e;
        bigDecimalMultiply.getClass();
        if (bigDecimalMultiply.compareTo(bigDecimal4) > 0) {
            aVar = new ldj0.b(bigDecimal4);
        } else if (bigDecimalMultiply.compareTo(bigDecimal3) >= 0) {
            aVar = new ldj0.c(bigDecimal3, bigDecimal4);
        } else {
            aVar = bigDecimalMultiply.compareTo(bigDecimal2) < 0 ? new ldj0.a(bigDecimal2) : ldj0.d.a;
        }
        asd0.a aVar2 = z ? asd0.a.e : asd0.a.d;
        String string = s5y.a(j4fVar.f).toString();
        string.getClass();
        if ((aVar instanceof ldj0.b) || (aVar instanceof ldj0.a)) {
            aVar2 = asd0.a.f;
        }
        asd0 asd0Var = new asd0(string, str, aVar2);
        String strB = this.d.a.b();
        aVar.getClass();
        strB.getClass();
        if (aVar instanceof ldj0.b) {
            Object[] objArr = {bjb0.Y(s5y.a(((ldj0.b) aVar).a))};
            StringUiText stringUiText = vch0.a;
            jdj0Var = new jdj0(R.color.text_danger, new ResourceUiText(R.string.component_betslip__total_stake_cannot_exceed_vmaxstake, ay0.S(objArr)));
        } else if (aVar instanceof ldj0.a) {
            Object[] objArr2 = {bjb0.Y(s5y.a(((ldj0.a) aVar).a))};
            StringUiText stringUiText2 = vch0.a;
            jdj0Var = new jdj0(R.color.text_danger, new ResourceUiText(R.string.page_instant_virtual__don_total_stake_cannot_be_below_vminstake, ay0.S(objArr2)));
        } else if (aVar instanceof ldj0.c) {
            ldj0.c cVar = (ldj0.c) aVar;
            BigDecimal bigDecimal5 = cVar.a;
            String strY = bjb0.Y(s5y.a(bigDecimal5));
            BigDecimal bigDecimalSubtract = cVar.b.subtract(bigDecimal5);
            bigDecimalSubtract.getClass();
            Object[] objArr3 = {strY, tug.a(strB, " ", bjb0.Y(s5y.a(bigDecimalSubtract)))};
            StringUiText stringUiText3 = vch0.a;
            jdj0Var = new jdj0(R.color.text_warning, new ResourceUiText(R.string.page_instant_virtual__don_max_stake_vstake_vamount_cashed_out_automatically, ay0.S(objArr3)));
        } else {
            if (!aVar.equals(ldj0.d.a)) {
                uhc.a();
                return null;
            }
            jdj0Var = null;
        }
        return new kdj0(z, aVar, asd0Var, jdj0Var);
    }
}
