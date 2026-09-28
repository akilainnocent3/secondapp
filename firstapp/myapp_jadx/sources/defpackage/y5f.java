package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class y5f {
    public static final int f;
    public final q5f a;
    public final j0f b;
    public final yfj0 c;
    public final g1f d;
    public final UiText e;

    static {
        int i = g1f.f;
        f = 8;
        new y5f(q5f.c, null, null, null, vch0.a);
    }

    public y5f(q5f q5fVar, j0f j0fVar, yfj0 yfj0Var, g1f g1fVar, UiText uiText) {
        uiText.getClass();
        this.a = q5fVar;
        this.b = j0fVar;
        this.c = yfj0Var;
        this.d = g1fVar;
        this.e = uiText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5f)) {
            return false;
        }
        y5f y5fVar = (y5f) obj;
        return this.a.equals(y5fVar.a) && Intrinsics.g(this.b, y5fVar.b) && Intrinsics.g(this.c, y5fVar.c) && Intrinsics.g(this.d, y5fVar.d) && Intrinsics.g(this.e, y5fVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        j0f j0fVar = this.b;
        int iHashCode2 = (iHashCode + (j0fVar == null ? 0 : j0fVar.hashCode())) * 31;
        yfj0 yfj0Var = this.c;
        int iHashCode3 = (iHashCode2 + (yfj0Var == null ? 0 : yfj0Var.hashCode())) * 31;
        g1f g1fVar = this.d;
        return this.e.hashCode() + ((iHashCode3 + (g1fVar != null ? g1fVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DoubleOrNothingUiState(timerBarState=");
        sb.append(this.a);
        sb.append(", animationState=");
        sb.append(this.b);
        sb.append(", winningPopupUiState=");
        sb.append(this.c);
        sb.append(", finalResultState=");
        sb.append(this.d);
        sb.append(", snackbarUiText=");
        return plf.a(sb, this.e, ")");
    }
}
