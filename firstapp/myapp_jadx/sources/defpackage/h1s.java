package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
public final class h1s {
    public final int a;
    public final String b;
    public final UiText c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ h1s(int i, StringUiText stringUiText, String str, int i2) {
        this(i, stringUiText, "", str, (i2 & 16) == 0, (i2 & 32) == 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1s)) {
            return false;
        }
        h1s h1sVar = (h1s) obj;
        return this.a == h1sVar.a && Intrinsics.g(this.b, h1sVar.b) && Intrinsics.g(this.c, h1sVar.c) && Intrinsics.g(this.d, h1sVar.d) && this.e == h1sVar.e && this.f == h1sVar.f;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return Boolean.hashCode(this.f) + mtg0.a(gmf0.a(yvf.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbA = uqe0.a(this.a, "LeaderboardEntryUiModel(rank=", ", avatarUrl=", this.b, ", username=");
        sbA.append(this.c);
        sbA.append(", amount=");
        sbA.append(this.d);
        sbA.append(", isCurrentUser=");
        return lng.a(Chyeyik.LJEOf, ")", sbA, this.e, this.f);
    }

    public h1s(int i, UiText uiText, String str, String str2, boolean z, boolean z2) {
        uiText.getClass();
        str2.getClass();
        this.a = i;
        this.b = str;
        this.c = uiText;
        this.d = str2;
        this.e = z;
        this.f = z2;
    }
}
