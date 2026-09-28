package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.model.OTPVerifyState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class au20 extends saj implements Function2<Integer, UiText, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, UiText uiText) {
        Object value;
        int iIntValue = num.intValue();
        UiText uiText2 = uiText;
        uiText2.getClass();
        cu20 cu20Var = (cu20) this.receiver;
        cu20Var.getClass();
        wwd0 wwd0Var = cu20Var.B;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ((OTPVerifyState) value).copy(iIntValue, uiText2)));
        return Unit.a;
    }
}
