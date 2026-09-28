package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class mhr {
    public final UiText a;
    public final boolean b;
    public final boolean c;
    public final z3r d;

    public mhr(UiText uiText, boolean z, boolean z2, z3r z3rVar) {
        uiText.getClass();
        z3rVar.getClass();
        this.a = uiText;
        this.b = z;
        this.c = z2;
        this.d = z3rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mhr)) {
            return false;
        }
        mhr mhrVar = (mhr) obj;
        return Intrinsics.g(this.a, mhrVar.a) && this.b == mhrVar.b && this.c == mhrVar.c && Intrinsics.g(this.d, mhrVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "LNStreamUiState(title=" + this.a + ", isOnline=" + this.b + ", isLive=" + this.c + ", isExpand=" + this.d + ")";
    }
}
