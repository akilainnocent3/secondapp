package defpackage;

import android.util.Size;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class uj1 {
    public final Surface a;
    public final Size b;
    public final int c;

    public uj1(Surface surface, Size size, int i) {
        if (surface == null) {
            bmy.a("Null surface");
            throw null;
        }
        this.a = surface;
        if (size == null) {
            bmy.a("Null size");
            throw null;
        }
        this.b = size;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uj1)) {
            return false;
        }
        uj1 uj1Var = (uj1) obj;
        return this.a.equals(uj1Var.a) && this.b.equals(uj1Var.b) && this.c == uj1Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{surface=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", imageFormat=");
        return zk1.a(this.c, "}", sb);
    }
}
