package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vde0 {
    public final String a;
    public final Date b;
    public final StringUiText c;
    public final boolean d;

    public vde0(String str, Date date, StringUiText stringUiText, boolean z) {
        str.getClass();
        this.a = str;
        this.b = date;
        this.c = stringUiText;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vde0)) {
            return false;
        }
        vde0 vde0Var = (vde0) obj;
        return Intrinsics.g(this.a, vde0Var.a) && this.b.equals(vde0Var.b) && this.c.equals(vde0Var.c) && this.d == vde0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.a.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SubscribedEventUiState(id=" + this.a + ", datetime=" + this.b + ", titleUiText=" + this.c + ", isEnabled=" + this.d + ")";
    }
}
