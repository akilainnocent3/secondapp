package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes5.dex */
public final class g1f {
    public static final /* synthetic */ int f = 0;
    public final boolean a;
    public final ResourceUiText b;
    public final int c;
    public final ResourceUiText d;
    public final u4f e;

    static {
        int i = u4f.d;
    }

    public g1f(boolean z, ResourceUiText resourceUiText, int i, ResourceUiText resourceUiText2, u4f u4fVar) {
        this.a = z;
        this.b = resourceUiText;
        this.c = i;
        this.d = resourceUiText2;
        this.e = u4fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1f)) {
            return false;
        }
        g1f g1fVar = (g1f) obj;
        return this.a == g1fVar.a && this.b.equals(g1fVar.b) && this.c == g1fVar.c && this.d.equals(g1fVar.d) && this.e.equals(g1fVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + wh8.a(gpp.a(this.c, wh8.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31, this.d);
    }

    public final String toString() {
        return "DoubleOrNothingFinalResultState(isWon=" + this.a + ", statusText=" + this.b + ", statusIconResId=" + this.c + ", amountSummaryText=" + this.d + ", stepperState=" + this.e + ")";
    }
}
