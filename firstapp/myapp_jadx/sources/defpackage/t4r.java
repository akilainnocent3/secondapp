package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t4r {
    public final String a;
    public final UiText b;
    public final u4r c;

    public t4r(String str, UiText uiText, u4r u4rVar) {
        str.getClass();
        u4rVar.getClass();
        this.a = str;
        this.b = uiText;
        this.c = u4rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4r)) {
            return false;
        }
        t4r t4rVar = (t4r) obj;
        return Intrinsics.g(this.a, t4rVar.a) && this.b.equals(t4rVar.b) && Intrinsics.g(this.c, t4rVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + yvf.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "LNRecentDrawItem(id=", this.a, ", time=", ", content=");
        sbA.append(this.c);
        sbA.append(")");
        return sbA.toString();
    }
}
