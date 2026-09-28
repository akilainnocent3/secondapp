package com.sporty.android.platform.features.captcha.model;

import android.content.Context;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import defpackage.fk50;
import defpackage.vch0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u000e\u000f\u0010\u0011B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0001\u0004\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/CaptchaError;", "Lfk50;", "Lcom/sporty/android/common_ui/uitext/UiText;", "errorText", "<init>", "(Lcom/sporty/android/common_ui/uitext/UiText;)V", "Landroid/content/Context;", "context", "", "getErrorString", "(Landroid/content/Context;)Ljava/lang/String;", "Lcom/sporty/android/common_ui/uitext/UiText;", "getErrorText", "()Lcom/sporty/android/common_ui/uitext/UiText;", "CaptchaAPIError", "CaptchaNeedRetry", "CaptchaSDKCancel", "CaptchaSDKFailure", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaAPIError;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaNeedRetry;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaSDKCancel;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaSDKFailure;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class CaptchaError extends fk50 {
    public static final int $stable = fk50.$stable;
    private final UiText errorText;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ê\u0001\f\b\u0007\u0012\b\b\b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaAPIError;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError;", "msg", "", "<init>", "(Ljava/lang/String;)V", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CaptchaAPIError extends CaptchaError {
        public static final int $stable = fk50.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptchaAPIError(String str) {
            super(vch0.d(str), null);
            str.getClass();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0004"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaSDKCancel;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError;", "<init>", "()V", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CaptchaSDKCancel extends CaptchaError {
        public static final int $stable = fk50.$stable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CaptchaSDKCancel() {
            super(new ResourceUiText(R.string.page_captcha__captcha_invalid), null);
            StringUiText stringUiText = vch0.a;
        }
    }

    private CaptchaError(UiText uiText) {
        super(uiText);
        this.errorText = uiText;
    }

    public final String getErrorString(Context context) {
        context.getClass();
        return this.errorText.g(context);
    }

    public final UiText getErrorText() {
        return this.errorText;
    }

    public /* synthetic */ CaptchaError(UiText uiText, DefaultConstructorMarker defaultConstructorMarker) {
        this(uiText);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ê\u0001\f\b\u0007\u0012\b\b\b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaNeedRetry;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError;", "msg", "", "<init>", "(Ljava/lang/String;)V", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CaptchaNeedRetry extends CaptchaError {
        public static final int $stable = fk50.$stable;

        public CaptchaNeedRetry(String str) {
            UiText resourceUiText;
            if (str != null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new StringUiText(str);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_feedback__captcha_is_incorrect);
            }
            super(resourceUiText, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CaptchaNeedRetry() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public /* synthetic */ CaptchaNeedRetry(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005Ê\u0001\f\b\u0007\u0012\b\b\b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0006"}, d2 = {"Lcom/sporty/android/platform/features/captcha/model/CaptchaError$CaptchaSDKFailure;", "Lcom/sporty/android/platform/features/captcha/model/CaptchaError;", "msg", "", "<init>", "(Ljava/lang/String;)V", "sportyplatform", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class CaptchaSDKFailure extends CaptchaError {
        public static final int $stable = fk50.$stable;

        public CaptchaSDKFailure(String str) {
            UiText resourceUiText;
            if (str != null) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new StringUiText(str);
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_feedback__captcha_is_incorrect);
            }
            super(resourceUiText, null);
        }

        public /* synthetic */ CaptchaSDKFailure(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CaptchaSDKFailure() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }
}
