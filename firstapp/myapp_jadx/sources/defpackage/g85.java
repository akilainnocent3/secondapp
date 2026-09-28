package defpackage;

import com.appsflyer.internal.b0;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g85 {
    public final long a;
    public final String b;
    public final qcn<f85> c;
    public final boolean d;
    public final boolean e;
    public final UiText f;
    public final qcn<cuv> g;

    public g85(long j, String str, qcn<f85> qcnVar, boolean z, boolean z2, UiText uiText, qcn<cuv> qcnVar2) {
        str.getClass();
        qcnVar.getClass();
        uiText.getClass();
        qcnVar2.getClass();
        this.a = j;
        this.b = str;
        this.c = qcnVar;
        this.d = z;
        this.e = z2;
        this.f = uiText;
        this.g = qcnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g85)) {
            return false;
        }
        g85 g85Var = (g85) obj;
        return this.a == g85Var.a && Intrinsics.g(this.b, g85Var.b) && Intrinsics.g(this.c, g85Var.c) && this.d == g85Var.d && this.e == g85Var.e && Intrinsics.g(this.f, g85Var.f) && Intrinsics.g(this.g, g85Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + yvf.a(mtg0.a(mtg0.a(shu.a(this.c, gmf0.a(Long.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbA = b0.a(this.a, "BrRegistrationMissionUiModel(id=", ", title=", this.b);
        sbA.append(", tasks=");
        sbA.append(this.c);
        sbA.append(", isActive=");
        sbA.append(this.d);
        sbA.append(", canActivate=");
        sbA.append(this.e);
        sbA.append(", expiryDisplay=");
        sbA.append(this.f);
        sbA.append(", rewards=");
        sbA.append(this.g);
        sbA.append(")");
        return sbA.toString();
    }
}
