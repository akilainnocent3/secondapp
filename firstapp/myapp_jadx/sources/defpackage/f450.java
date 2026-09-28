package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f450 {
    public final String a;
    public final ConcatUiText b;
    public final List<w550> c;

    public f450(String str, ConcatUiText concatUiText, List list) {
        list.getClass();
        this.a = str;
        this.b = concatUiText;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f450)) {
            return false;
        }
        f450 f450Var = (f450) obj;
        return this.a.equals(f450Var.a) && this.b.equals(f450Var.b) && Intrinsics.g(this.c, f450Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemixBetPage(shareCode=");
        sb.append(this.a);
        sb.append(", headerText=");
        sb.append(this.b);
        sb.append(", picks=");
        return ng1.a(sb, this.c, ")");
    }
}
