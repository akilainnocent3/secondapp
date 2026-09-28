package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.realsports.StakeConfig;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class em00 extends saj implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        Object value;
        Object value2;
        pm00 pm00Var = (pm00) this.receiver;
        wwd0 wwd0Var = pm00Var.a;
        hm00 hm00Var = (hm00) wwd0Var.getValue();
        StakeConfig stakeConfigY = pm00Var.C.y();
        BigDecimal minStake = stakeConfigY.getMinStake();
        BigDecimal maxStake = stakeConfigY.getMaxStake();
        gx40 gx40Var = pm00Var.A;
        String str = hm00Var.k.a.b;
        gx40Var.getClass();
        str.getClass();
        muh0 muh0VarA = b22.a(gx40Var, str, minStake, maxStake);
        String str2 = hm00Var.n.a.b;
        str2.getClass();
        muh0 muh0VarA2 = b22.a(gx40Var, str2, minStake, maxStake);
        qnc qncVar = pm00Var.B;
        String str3 = hm00Var.q.a.b;
        int i = pm00Var.E;
        int i2 = pm00Var.F;
        qncVar.getClass();
        cwf0 cwf0VarA = qnc.a(i, i2, str3);
        muh0.a aVar = muh0VarA instanceof muh0.a ? (muh0.a) muh0VarA : null;
        if (aVar != null) {
            int i3 = aVar.a;
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(i3);
        } else {
            resourceUiText = null;
        }
        muh0.a aVar2 = muh0VarA2 instanceof muh0.a ? (muh0.a) muh0VarA2 : null;
        if (aVar2 != null) {
            int i4 = aVar2.a;
            StringUiText stringUiText2 = vch0.a;
            resourceUiText2 = new ResourceUiText(i4);
        } else {
            resourceUiText2 = null;
        }
        cwf0.a aVar3 = cwf0VarA instanceof cwf0.a ? (cwf0.a) cwf0VarA : null;
        ResourceUiText resourceUiText3 = aVar3 != null ? aVar3.a : null;
        boolean z = resourceUiText == null && resourceUiText2 == null && resourceUiText3 == null;
        if (!z) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, hm00.a((hm00) value2, null, null, null, null, null, null, null, false, false, true, null, null, resourceUiText, null, null, resourceUiText2, null, null, resourceUiText3, 224767)));
        }
        if (z) {
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, hm00.a((hm00) value, null, null, null, null, null, null, null, false, true, false, null, null, null, null, null, null, null, null, null, 524031)));
            ej5.c(o8i0.d(pm00Var), null, null, new nm00(pm00Var, null), 3);
        }
        return Unit.a;
    }
}
