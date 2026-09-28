package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ec5 {
    public final qcn<dc5> a;
    public final ResourceUiText b;

    public ec5(qcn qcnVar, ResourceUiText resourceUiText) {
        qcnVar.getClass();
        this.a = qcnVar;
        this.b = resourceUiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec5)) {
            return false;
        }
        ec5 ec5Var = (ec5) obj;
        return Intrinsics.g(this.a, ec5Var.a) && this.b.equals(ec5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BuildAndGoBetButtonState(summaryRows=" + this.a + ", placeBetButtonText=" + this.b + ")";
    }
}
