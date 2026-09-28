package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;

/* JADX INFO: loaded from: classes6.dex */
public enum fcu {
    SEND_TWO_FA_CODE_SUCCESS,
    RE_SEND_TWO_FA_CODE_SUCCESS,
    SEND_TWO_FA_CODE_EXCEED_RATE_LIMIT,
    TWO_FA_CODE_IS_INCORRECT,
    TWO_FA_RATE_LIMIT_EXCEEDED,
    VERIFY_TWO_FA_CODE_SUCCESS,
    RETRY_LOGIN,
    CUSTOM_ERROR,
    NETWORK_ERROR,
    FACIAL_RECOGNITION_CANCELED_BY_USER,
    FACIAL_RECOGNITION_ERROR,
    FACIAL_RECOGNITION_SUCCESS;

    public UiText a = vch0.a;

    fcu() {
    }

    public final void a(String str) {
        str.getClass();
        StringUiText stringUiText = vch0.a;
        this.a = new StringUiText(str);
    }
}
