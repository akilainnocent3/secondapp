package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rei {
    public final String a;
    public final qei b;
    public final boolean c;
    public final UiText d;
    public final String e;
    public final mei f;

    public rei(String str, qei qeiVar, boolean z, UiText uiText, String str2, mei meiVar) {
        this.a = str;
        this.b = qeiVar;
        this.c = z;
        this.d = uiText;
        this.e = str2;
        this.f = meiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rei)) {
            return false;
        }
        rei reiVar = (rei) obj;
        return this.a.equals(reiVar.a) && Intrinsics.g(this.b, reiVar.b) && this.c == reiVar.c && this.d.equals(reiVar.d) && Intrinsics.g(this.e, reiVar.e) && Intrinsics.g(this.f, reiVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        qei qeiVar = this.b;
        int iA = yvf.a(mtg0.a((iHashCode + (qeiVar == null ? 0 : qeiVar.hashCode())) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        mei meiVar = this.f;
        return iHashCode2 + (meiVar != null ? meiVar.hashCode() : 0);
    }

    public final String toString() {
        return "FootballFamilySettlementSelectionState(id=" + this.a + ", result=" + this.b + ", shouldShowResultTooltip=" + this.c + ", titleUiText=" + this.d + ", marketTitleText=" + this.e + ", pick=" + this.f + ")";
    }
}
