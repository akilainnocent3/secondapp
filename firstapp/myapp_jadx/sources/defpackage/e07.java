package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class e07 implements wvt {
    public final boolean a;
    public final ResourceUiText b;
    public final boolean c;

    public e07(boolean z, ResourceUiText resourceUiText, boolean z2) {
        this.a = z;
        this.b = resourceUiText;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e07)) {
            return false;
        }
        e07 e07Var = (e07) obj;
        return this.a == e07Var.a && this.b.equals(e07Var.b) && this.c == e07Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + wh8.a(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChallengeEntryBannerState(isDiamond=");
        sb.append(this.a);
        sb.append(", titleUiText=");
        sb.append(this.b);
        sb.append(", showNew=");
        return mq0.a(sb, this.c, ")");
    }
}
