package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class uxh0 {
    public final boolean a;
    public final String b;
    public final UiText c;
    public final String d;
    public final int e;
    public final boolean f;

    public uxh0(int i, UiText uiText, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        str2.getClass();
        this.a = z;
        this.b = str;
        this.c = uiText;
        this.d = str2;
        this.e = i;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxh0)) {
            return false;
        }
        uxh0 uxh0Var = (uxh0) obj;
        return this.a == uxh0Var.a && Intrinsics.g(this.b, uxh0Var.b) && this.c.equals(uxh0Var.c) && Intrinsics.g(this.d, uxh0Var.d) && this.e == uxh0Var.e && this.f == uxh0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + gpp.a(this.e, gmf0.a(yvf.a(gmf0.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sbA = t160.a("VerifiedInfoState(isDisplay=", ", requirementId=", this.b, ", requirementName=", this.a);
        sbA.append(this.c);
        sbA.append(", requirementValue=");
        sbA.append(this.d);
        sbA.append(", status=");
        sbA.append(this.e);
        sbA.append(", hasApproved=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }
}
