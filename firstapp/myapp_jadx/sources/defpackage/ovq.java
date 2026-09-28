package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ovq {
    public final UiText a;
    public final UiText b;
    public final UiText c;
    public final boolean d;
    public final evq e;
    public final evq f;

    public ovq(UiText uiText, UiText uiText2, UiText uiText3, boolean z, evq evqVar, evq evqVar2) {
        evqVar2.getClass();
        this.a = uiText;
        this.b = uiText2;
        this.c = uiText3;
        this.d = z;
        this.e = evqVar;
        this.f = evqVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovq)) {
            return false;
        }
        ovq ovqVar = (ovq) obj;
        return this.a.equals(ovqVar.a) && this.b.equals(ovqVar.b) && this.c.equals(ovqVar.c) && this.d == ovqVar.d && this.e.equals(ovqVar.e) && Intrinsics.g(this.f, ovqVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + mtg0.a(yvf.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = uh8.a(this.a, this.b, "LNMyNumberDialogState(title=", ", content=", ", actionButtonText=");
        sbA.append(this.c);
        sbA.append(", isLoading=");
        sbA.append(this.d);
        sbA.append(", onActionClick=");
        sbA.append(this.e);
        sbA.append(", onCancelClick=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
