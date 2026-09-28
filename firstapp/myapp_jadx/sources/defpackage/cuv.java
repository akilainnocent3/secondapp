package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cuv {
    public final String a;
    public final UiText b;
    public final UiText c;
    public final wtv d;

    public cuv(String str, UiText uiText, UiText uiText2, wtv wtvVar) {
        str.getClass();
        this.a = str;
        this.b = uiText;
        this.c = uiText2;
        this.d = wtvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuv)) {
            return false;
        }
        cuv cuvVar = (cuv) obj;
        return Intrinsics.g(this.a, cuvVar.a) && this.b.equals(cuvVar.b) && Intrinsics.g(this.c, cuvVar.c) && this.d == cuvVar.d;
    }

    public final int hashCode() {
        int iA = yvf.a(this.a.hashCode() * 31, 31, this.b);
        UiText uiText = this.c;
        return this.d.hashCode() + ((iA + (uiText == null ? 0 : uiText.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "MissionRewardUiModel(iconUrl=", this.a, ", title=", ", description=");
        sbA.append(this.c);
        sbA.append(", kind=");
        sbA.append(this.d);
        sbA.append(")");
        return sbA.toString();
    }
}
