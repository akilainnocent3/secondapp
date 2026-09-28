package defpackage;

import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;

/* JADX INFO: loaded from: classes2.dex */
public final class cl60 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public cl60(long j) {
        this.a = j;
        this.b = j;
        this.c = j;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cl60)) {
            return false;
        }
        cl60 cl60Var = (cl60) obj;
        long j = cl60Var.a;
        int i = j58.n;
        return nbh0.a(this.a, j) && nbh0.a(this.b, cl60Var.b) && nbh0.a(this.c, cl60Var.c) && nbh0.a(this.d, cl60Var.d);
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Long.hashCode(this.d) + f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(YAzniTbXHYQ.XJszdi);
        ofz.a(this.a, ", activeColor=", sb);
        ofz.a(this.b, ", activeDisableColor=", sb);
        ofz.a(this.c, ", disabledColor=", sb);
        sb.append((Object) j58.i(this.d));
        sb.append(')');
        return sb.toString();
    }
}
