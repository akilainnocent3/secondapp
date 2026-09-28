package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class u75 {
    public final ResourceUiText a;
    public final List<t75> b;
    public final ResourceUiText c;
    public final List<t75> d;

    public u75(ResourceUiText resourceUiText, List list, ResourceUiText resourceUiText2, List list2) {
        list.getClass();
        list2.getClass();
        this.a = resourceUiText;
        this.b = list;
        this.c = resourceUiText2;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u75)) {
            return false;
        }
        u75 u75Var = (u75) obj;
        return this.a.equals(u75Var.a) && Intrinsics.g(this.b, u75Var.b) && this.c.equals(u75Var.c) && Intrinsics.g(this.d, u75Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wh8.a(ai50.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "BrCustomerSupportState(contactTitle=" + this.a + ", contactItems=" + this.b + ", ouvidoriaTitle=" + this.c + ", ouvidoriaItems=" + this.d + ")";
    }
}
