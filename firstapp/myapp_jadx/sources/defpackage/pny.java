package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;

/* JADX INFO: loaded from: classes6.dex */
public final class pny {
    public final b6u a;
    public final ResourceUiText b;
    public final long c;

    public pny(b6u b6uVar, ResourceUiText resourceUiText, long j) {
        b6uVar.getClass();
        this.a = b6uVar;
        this.b = resourceUiText;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pny)) {
            return false;
        }
        pny pnyVar = (pny) obj;
        return this.a == pnyVar.a && this.b.equals(pnyVar.b) && j7f.b(this.c, pnyVar.c);
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + wh8.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        String strE = j7f.e(this.c);
        StringBuilder sb = new StringBuilder("OnBoardingData(imageRes=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", handOffset=");
        return uf80.a(sb, strE, ")");
    }
}
