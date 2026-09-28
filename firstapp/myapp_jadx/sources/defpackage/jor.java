package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sportybet.android.account.Qr.QQWMbKFOuTf;

/* JADX INFO: loaded from: classes2.dex */
public final class jor {
    public final int a;
    public final int b;
    public final ResourceUiText c;

    public jor(int i, int i2, ResourceUiText resourceUiText) {
        this.a = i;
        this.b = i2;
        this.c = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jor)) {
            return false;
        }
        jor jorVar = (jor) obj;
        return this.a == jorVar.a && this.b == jorVar.b && this.c.equals(jorVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + gpp.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbA = dy5.a(QQWMbKFOuTf.oWqKKpdLoZ, this.a, this.b, ", textColorResId=", ", uiText=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
