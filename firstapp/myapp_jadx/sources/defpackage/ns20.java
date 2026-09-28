package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.model.OTPVerifyState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ns20 extends saj implements Function2<Integer, UiText, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Integer num, UiText uiText) {
        Object value;
        int iIntValue = num.intValue();
        UiText uiText2 = uiText;
        uiText2.getClass();
        qs20 qs20Var = (qs20) this.receiver;
        qs20Var.getClass();
        wwd0 wwd0Var = qs20Var.e;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, ((OTPVerifyState) value).copy(iIntValue, uiText2)));
        return Unit.a;
    }
}
