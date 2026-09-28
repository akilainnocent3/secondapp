package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x9o {
    public final qcn<i9o> a;
    public final Integer b;
    public final boolean c;
    public final UiText d;
    public final String e;
    public final boolean f;
    public final UiText g;

    public x9o(qcn qcnVar, Integer num, boolean z, ResourceUiText resourceUiText, String str, boolean z2, ResourceUiText resourceUiText2) {
        qcnVar.getClass();
        this.a = qcnVar;
        this.b = num;
        this.c = z;
        this.d = resourceUiText;
        this.e = str;
        this.f = z2;
        this.g = resourceUiText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9o)) {
            return false;
        }
        x9o x9oVar = (x9o) obj;
        return Intrinsics.g(this.a, x9oVar.a) && Intrinsics.g(this.b, x9oVar.b) && this.c == x9oVar.c && Intrinsics.g(this.d, x9oVar.d) && Intrinsics.g(this.e, x9oVar.e) && this.f == x9oVar.f && Intrinsics.g(this.g, x9oVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iA = mtg0.a((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        UiText uiText = this.d;
        int iHashCode2 = (iA + (uiText == null ? 0 : uiText.hashCode())) * 31;
        String str = this.e;
        int iA2 = mtg0.a((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        UiText uiText2 = this.g;
        return iA2 + (uiText2 != null ? uiText2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstantWinBetHistoryContentState(cellStates=");
        sb.append(this.a);
        sb.append(", loadNextPageThreshold=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        sb.append(this.c);
        sb.append(", snackbarMessageText=");
        sb.append(this.d);
        sb.append(", emptyImageUrl=");
        uts.b(this.e, ", shouldShowEmptyButton=", ", kickOffButtonUiText=", sb, this.f);
        return plf.a(sb, this.g, ")");
    }
}
