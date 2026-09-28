package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.captcha.model.InHouseCaptchaImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class udn {
    public final boolean a;
    public final InHouseCaptchaImage b;
    public final ijf0 c;
    public final UiText d;
    public final boolean e;

    public udn(boolean z, InHouseCaptchaImage inHouseCaptchaImage, ijf0 ijf0Var, UiText uiText) {
        inHouseCaptchaImage.getClass();
        ijf0Var.getClass();
        uiText.getClass();
        this.a = z;
        this.b = inHouseCaptchaImage;
        this.c = ijf0Var;
        this.d = uiText;
        this.e = (inHouseCaptchaImage instanceof InHouseCaptchaImage.Image) && ijf0Var.a.b.length() > 0;
    }

    public static udn a(udn udnVar, boolean z, InHouseCaptchaImage inHouseCaptchaImage, ijf0 ijf0Var, UiText uiText, int i) {
        if ((i & 1) != 0) {
            z = udnVar.a;
        }
        if ((i & 2) != 0) {
            inHouseCaptchaImage = udnVar.b;
        }
        if ((i & 4) != 0) {
            ijf0Var = udnVar.c;
        }
        if ((i & 8) != 0) {
            uiText = udnVar.d;
        }
        udnVar.getClass();
        inHouseCaptchaImage.getClass();
        ijf0Var.getClass();
        uiText.getClass();
        return new udn(z, inHouseCaptchaImage, ijf0Var, uiText);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof udn)) {
            return false;
        }
        udn udnVar = (udn) obj;
        return this.a == udnVar.a && Intrinsics.g(this.b, udnVar.b) && Intrinsics.g(this.c, udnVar.c) && Intrinsics.g(this.d, udnVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ey1.b(this.c, (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, 31);
    }

    public final String toString() {
        return "InHouseCaptchaState(isLoading=" + this.a + ", image=" + this.b + ", answer=" + this.c + ", errorMessage=" + this.d + ")";
    }

    public udn() {
        this(0);
    }

    public udn(int i) {
        this(false, InHouseCaptchaImage.Empty.INSTANCE, new ijf0((String) null, 0L, 7), vch0.a);
    }
}
