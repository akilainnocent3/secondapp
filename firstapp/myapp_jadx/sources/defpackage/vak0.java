package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class vak0 {
    public final ResourceUiText a;
    public final ResourceUiText b;
    public final boolean c;
    public final wae d;
    public final t2k0 e;

    public vak0(ResourceUiText resourceUiText, ResourceUiText resourceUiText2, boolean z, wae waeVar, t2k0 t2k0Var) {
        this.a = resourceUiText;
        this.b = resourceUiText2;
        this.c = z;
        this.d = waeVar;
        this.e = t2k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vak0)) {
            return false;
        }
        vak0 vak0Var = (vak0) obj;
        return Intrinsics.g(this.a, vak0Var.a) && Intrinsics.g(this.b, vak0Var.b) && this.c == vak0Var.c && this.d == vak0Var.d && Intrinsics.g(this.e, vak0Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + mtg0.a(wh8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        t2k0 t2k0Var = this.e;
        return iHashCode + (t2k0Var == null ? 0 : t2k0Var.a.hashCode());
    }

    public final String toString() {
        return "ZASuccessfulRegistrationNotification(message=" + this.a + ", actionText=" + this.b + ", showSuccessfulStatus=" + this.c + ", actionDestination=" + this.d + ", worldCupPass=" + this.e + ")";
    }
}
