package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vii0 {
    public final gji0 a;
    public final String b;
    public final uii0 c;

    public vii0(gji0 gji0Var, String str, uii0 uii0Var) {
        this.a = gji0Var;
        this.b = str;
        this.c = uii0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vii0)) {
            return false;
        }
        vii0 vii0Var = (vii0) obj;
        return this.a == vii0Var.a && this.b.equals(vii0Var.b) && Intrinsics.g(this.c, vii0Var.c);
    }

    public final int hashCode() {
        int iA = gmf0.a(this.a.hashCode() * 31, 31, this.b);
        uii0 uii0Var = this.c;
        return iA + (uii0Var == null ? 0 : uii0Var.hashCode());
    }

    public final String toString() {
        return "VirtualLobbyGetStartedCmsContent(type=" + this.a + ", cmsValue=" + this.b + ", callToActionContext=" + this.c + ")";
    }
}
