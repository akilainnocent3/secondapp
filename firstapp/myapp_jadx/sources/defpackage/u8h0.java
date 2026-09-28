package defpackage;

import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class u8h0 {
    public final String a;
    public final UiText b;

    public u8h0(UiText uiText, String str) {
        str.getClass();
        uiText.getClass();
        this.a = str;
        this.b = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8h0)) {
            return false;
        }
        u8h0 u8h0Var = (u8h0) obj;
        return Intrinsics.g(this.a, u8h0Var.a) && Intrinsics.g(this.b, u8h0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TxTypeUiTextPair(key=" + this.a + QWvyvNzGsBpRT.jxGs + this.b + ")";
    }
}
