package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class x8r {
    public final ResourceUiText a;
    public final String b;
    public final String c;
    public final boolean d;

    public x8r(ResourceUiText resourceUiText, String str, String str2, boolean z) {
        str.getClass();
        this.a = resourceUiText;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8r)) {
            return false;
        }
        x8r x8rVar = (x8r) obj;
        return this.a.equals(x8rVar.a) && Intrinsics.g(this.b, x8rVar.b) && Intrinsics.g(this.c, x8rVar.c) && this.d == x8rVar.d;
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iA + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LNScreenShot(title=");
        sb.append(this.a);
        sb.append(", localImgUrl=");
        sb.append(this.b);
        sb.append(", shareUrl=");
        return x9d.a(this.c, ", isSelected=", ")", sb, this.d);
    }
}
