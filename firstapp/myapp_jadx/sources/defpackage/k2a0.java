package defpackage;

import com.sportybet.android.bookingcode.presentation.smartremix.SmartRemixConfirmationUiState;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k2a0 {
    public final boolean a;
    public final SmartRemixConfirmationUiState b;

    public /* synthetic */ k2a0(SmartRemixConfirmationUiState smartRemixConfirmationUiState, int i) {
        this((i & 2) != 0 ? null : smartRemixConfirmationUiState, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2a0)) {
            return false;
        }
        k2a0 k2a0Var = (k2a0) obj;
        return this.a == k2a0Var.a && Intrinsics.g(this.b, k2a0Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        SmartRemixConfirmationUiState smartRemixConfirmationUiState = this.b;
        return iHashCode + (smartRemixConfirmationUiState == null ? 0 : smartRemixConfirmationUiState.hashCode());
    }

    public final String toString() {
        return "SmartRemixUiState(isLoading=" + this.a + ", confirmation=" + this.b + ")";
    }

    public k2a0() {
        this((SmartRemixConfirmationUiState) null, 3);
    }

    public k2a0(SmartRemixConfirmationUiState smartRemixConfirmationUiState, boolean z) {
        this.a = z;
        this.b = smartRemixConfirmationUiState;
    }
}
