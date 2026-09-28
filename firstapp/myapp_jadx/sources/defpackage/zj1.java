package defpackage;

import android.util.Size;
import com.google.android.gms.common.annotation.LjLk.llGRV;

/* JADX INFO: loaded from: classes.dex */
public final class zj1 {
    public final Size a;
    public final int b;

    public zj1(Size size, int i) {
        if (size == null) {
            bmy.a("Null resolution");
            throw null;
        }
        this.a = size;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final Size b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zj1)) {
            return false;
        }
        zj1 zj1Var = (zj1) obj;
        return this.a.equals(zj1Var.b()) && this.b == zj1Var.a();
    }

    public final int hashCode() {
        return this.b ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostviewSettings{resolution=");
        sb.append(this.a);
        sb.append(", inputFormat=");
        return zk1.a(this.b, llGRV.jqwBj, sb);
    }
}
