package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.HintView;
import com.sportybet.feature.payment.impl.deposit.domain.model.DepositDropAlertStatus;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n200 {
    public static final o200 a(UiText uiText, DepositDropAlertStatus depositDropAlertStatus, boolean z, boolean z2) {
        boolean z3 = depositDropAlertStatus instanceof DepositDropAlertStatus.MaintenanceAlert;
        if (z3 && z2) {
            return b(depositDropAlertStatus, z);
        }
        if (uiText == null) {
            StringUiText stringUiText = vch0.a;
        } else if (!uiText.equals(vch0.a)) {
            return new o200(2, uiText);
        }
        if ((depositDropAlertStatus instanceof DepositDropAlertStatus.CustomHint) || (depositDropAlertStatus instanceof DepositDropAlertStatus.DropAlert)) {
            return b(depositDropAlertStatus, z);
        }
        if (z3 || Intrinsics.g(depositDropAlertStatus, DepositDropAlertStatus.Gone.a) || Intrinsics.g(depositDropAlertStatus, DepositDropAlertStatus.Unavailable.a)) {
            return new o200(2, (UiText) null);
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final o200 b(DepositDropAlertStatus depositDropAlertStatus, boolean z) {
        UiText a;
        HintView.a aVar;
        depositDropAlertStatus.getClass();
        if (depositDropAlertStatus instanceof DepositDropAlertStatus.a) {
            a = ((DepositDropAlertStatus.a) depositDropAlertStatus).getA();
            if (Intrinsics.g(a, vch0.a)) {
                a = null;
            }
            if (a == null) {
                a = new ResourceUiText(R.string.page_payment__channel_unstable_text__NG);
            }
        } else {
            a = vch0.a;
        }
        if (depositDropAlertStatus instanceof DepositDropAlertStatus.MaintenanceAlert) {
            aVar = HintView.a.b;
        } else {
            aVar = ((depositDropAlertStatus instanceof DepositDropAlertStatus.DropAlert) && z) ? HintView.a.b : HintView.a.a;
        }
        return new o200(a, aVar);
    }
}
