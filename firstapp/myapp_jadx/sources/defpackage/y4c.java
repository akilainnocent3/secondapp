package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y4c implements wvt {
    public final String a;
    public final UiText b;
    public final String c;

    public y4c(String str, StringUiText stringUiText, String str2) {
        stringUiText.getClass();
        this.a = str;
        this.b = stringUiText;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4c)) {
            return false;
        }
        y4c y4cVar = (y4c) obj;
        return this.a.equals(y4cVar.a) && Intrinsics.g(this.b, y4cVar.b) && this.c.equals(y4cVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return uf80.a(x45.a(this.b, "CS(name=", this.a, ", phone=", ", imgUrl="), this.c, ")");
    }
}
