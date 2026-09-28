package defpackage;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class gf4 extends l58 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    public gf4(long j, int i) {
        ColorFilter porterDuffColorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            if4.a();
            porterDuffColorFilter = hf4.a(r58.l(j), g40.a(i));
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(r58.l(j), g40.b(i));
        }
        super(porterDuffColorFilter);
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf4)) {
            return false;
        }
        gf4 gf4Var = (gf4) obj;
        long j = gf4Var.b;
        int i = j58.n;
        return nbh0.a(this.b, j) && this.c == gf4Var.c;
    }

    public final int hashCode() {
        int i = j58.n;
        nbh0.a aVar = nbh0.b;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlendModeColorFilter(color=");
        ofz.a(this.b, ", blendMode=", sb);
        sb.append((Object) ff4.a(this.c));
        sb.append(')');
        return sb.toString();
    }
}
