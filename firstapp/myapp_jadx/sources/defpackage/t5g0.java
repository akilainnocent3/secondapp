package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t5g0 {
    public final UiText a;
    public final List<s5g0> b;

    public t5g0(UiText uiText, List<s5g0> list) {
        list.getClass();
        this.a = uiText;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t5g0)) {
            return false;
        }
        t5g0 t5g0Var = (t5g0) obj;
        return this.a.equals(t5g0Var.a) && Intrinsics.g(this.b, t5g0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TournamentBracketRound(title=" + this.a + ", matches=" + this.b + ")";
    }
}
