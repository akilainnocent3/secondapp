package defpackage;

import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ug30 {
    public final boolean a;
    public final QuickInputItem b;

    public ug30(boolean z, QuickInputItem quickInputItem) {
        quickInputItem.getClass();
        this.a = z;
        this.b = quickInputItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug30)) {
            return false;
        }
        ug30 ug30Var = (ug30) obj;
        return this.a == ug30Var.a && Intrinsics.g(this.b, ug30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "QuickInputItemUiState(selected=" + this.a + ", quickInputItem=" + this.b + ")";
    }
}
