package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q1j0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final float d;
    public final UiText e;
    public final boolean f;

    public q1j0(boolean z, int i, int i2, float f, UiText uiText, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = uiText;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1j0)) {
            return false;
        }
        q1j0 q1j0Var = (q1j0) obj;
        return this.a == q1j0Var.a && this.b == q1j0Var.b && this.c == q1j0Var.c && Float.compare(this.d, q1j0Var.d) == 0 && Intrinsics.g(this.e, q1j0Var.e) && this.f == q1j0Var.f;
    }

    public final int hashCode() {
        int iA = tvh.a(this.d, gpp.a(this.c, gpp.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31);
        UiText uiText = this.e;
        return Boolean.hashCode(this.f) + ((iA + (uiText == null ? 0 : uiText.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = zug0.a("WelcomeRewardBannerState(isEnable=", ", totalTasks=", ", completedTasks=", this.b, this.a);
        sbA.append(this.c);
        sbA.append(", progress=");
        sbA.append(this.d);
        sbA.append(", dayLeft=");
        sbA.append(this.e);
        sbA.append(", isTasksAllComplete=");
        sbA.append(this.f);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ q1j0(int i) {
        this(false, -1, -1, 0.0f, null, false);
    }

    public q1j0() {
        this(0);
    }
}
