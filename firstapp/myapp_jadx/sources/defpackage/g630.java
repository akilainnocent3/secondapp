package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public abstract class g630 extends fv5 implements ohp {
    public final boolean a;

    public g630(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.a = false;
    }

    @Override // defpackage.fv5
    public final xgp compute() {
        return this.a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g630) {
            g630 g630Var = (g630) obj;
            return getOwner().equals(g630Var.getOwner()) && getName().equals(g630Var.getName()) && getSignature().equals(g630Var.getSignature()) && Intrinsics.g(getBoundReceiver(), g630Var.getBoundReceiver());
        }
        if (obj instanceof ohp) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // defpackage.fv5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ohp getReflected() {
        if (!this.a) {
            return (ohp) super.getReflected();
        }
        zkh.a("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        return null;
    }

    public final String toString() {
        xgp xgpVarCompute = compute();
        if (xgpVarCompute != this) {
            return xgpVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    public g630() {
        this.a = false;
    }
}
