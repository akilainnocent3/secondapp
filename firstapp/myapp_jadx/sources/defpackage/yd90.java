package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class yd90 {
    public final ResourceUiText a;
    public final ResourceUiText b;
    public final ResourceUiText c;
    public final ResourceUiText d;
    public final de90 e;
    public final de90 f;

    public yd90(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, ResourceUiText resourceUiText3, ResourceUiText resourceUiText4, de90 de90Var, de90 de90Var2) {
        de90Var.getClass();
        de90Var2.getClass();
        this.a = resourceUiText;
        this.b = resourceUiText2;
        this.c = resourceUiText3;
        this.d = resourceUiText4;
        this.e = de90Var;
        this.f = de90Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd90)) {
            return false;
        }
        yd90 yd90Var = (yd90) obj;
        return this.a.equals(yd90Var.a) && this.b.equals(yd90Var.b) && this.c.equals(yd90Var.c) && this.d.equals(yd90Var.d) && Intrinsics.g(this.e, yd90Var.e) && Intrinsics.g(this.f, yd90Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + wh8.a(wh8.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        return "SidePanelDialogContent(title=" + this.a + ", content=" + this.b + ", confirmButtonText=" + this.c + ", dismissButtonText=" + this.d + ", confirmButtonAction=" + this.e + ", dismissButtonAction=" + this.f + ")";
    }
}
