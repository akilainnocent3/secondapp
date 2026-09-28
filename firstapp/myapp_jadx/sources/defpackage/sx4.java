package defpackage;

import androidx.camera.core.impl.utils.TP.sgwpmp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class sx4 {
    public final px4 a;
    public final rx4 b;

    public sx4(px4 px4Var, rx4 rx4Var) {
        px4Var.getClass();
        rx4Var.getClass();
        this.a = px4Var;
        this.b = rx4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx4)) {
            return false;
        }
        sx4 sx4Var = (sx4) obj;
        return Intrinsics.g(this.a, sx4Var.a) && this.b == sx4Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BookingCodeEmptyGuideUiState(guide=" + this.a + ", action=" + this.b + sgwpmp.KbOQZHCoN;
    }
}
