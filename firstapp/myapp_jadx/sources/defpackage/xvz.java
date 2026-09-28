package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xvz {
    public final UiText a;
    public final boolean b;
    public final String c;

    public xvz(UiText uiText, String str, boolean z) {
        this.a = uiText;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvz)) {
            return false;
        }
        xvz xvzVar = (xvz) obj;
        return Intrinsics.g(this.a, xvzVar.a) && this.b == xvzVar.b && Intrinsics.g(this.c, xvzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + mtg0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasswordRule(name=");
        sb.append(this.a);
        sb.append(", checked=");
        sb.append(this.b);
        sb.append(", id=");
        return uf80.a(sb, this.c, ")");
    }
}
