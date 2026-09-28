package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class vph0 {
    public final String a;
    public final UiText b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;

    public vph0(String str, UiText uiText, boolean z, String str2, String str3, String str4) {
        uiText.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = uiText;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vph0)) {
            return false;
        }
        vph0 vph0Var = (vph0) obj;
        return Intrinsics.g(this.a, vph0Var.a) && Intrinsics.g(this.b, vph0Var.b) && this.c == vph0Var.c && Intrinsics.g(this.d, vph0Var.d) && Intrinsics.g(this.e, vph0Var.e) && Intrinsics.g(this.f, vph0Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        return this.f.hashCode() + gmf0.a(gmf0.a(mtg0.a(yvf.a((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "UserRankingUiModel(avatarUrl=", this.a, ", displayName=", ", hasSetUpName=");
        mng.a(", rankText=", this.d, ", totalParticipants=", sbA, this.c);
        return kwi.a(sbA, this.e, ", recordText=", this.f, ")");
    }
}
