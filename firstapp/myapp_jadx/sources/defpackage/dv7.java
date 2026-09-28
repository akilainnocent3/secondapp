package defpackage;

import androidx.transition.nfj.CaBJCMnsV;

/* JADX INFO: loaded from: classes2.dex */
public final class dv7 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public dv7(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv7)) {
            return false;
        }
        dv7 dv7Var = (dv7) obj;
        return this.a.equals(dv7Var.a) && this.b.equals(dv7Var.b) && this.c.equals(dv7Var.c) && this.d == dv7Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("CodeChatCommentUiModel(username=", this.a, ", message=", this.b, ", avatarUrl=");
        return x9d.a(this.c, CaBJCMnsV.nGrcn, ")", sbA, this.d);
    }
}
