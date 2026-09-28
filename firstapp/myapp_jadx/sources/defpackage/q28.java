package defpackage;

import androidx.recyclerview.widget.r;

/* JADX INFO: loaded from: classes7.dex */
public final class q28 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final float e;
    public final float f;
    public final int g;

    public q28(long j, long j2, long j3, long j4, float f, float f2, int i) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = f;
        this.f = f2;
        this.g = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q28)) {
            return false;
        }
        q28 q28Var = (q28) obj;
        return this.a == q28Var.a && this.b == q28Var.b && gly.c(this.c, q28Var.c) && gly.c(this.d, q28Var.d) && Float.compare(this.e, q28Var.e) == 0 && Float.compare(this.f, q28Var.f) == 0 && this.g == q28Var.g;
    }

    public final int hashCode() {
        return Integer.hashCode(r.d.DEFAULT_DRAG_ANIMATION_DURATION) + gpp.a(this.g, tvh.a(this.f, tvh.a(this.e, f87.a(f87.a(f87.a(Long.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoinFlightAnimation(id=");
        sb.append(this.a);
        sb.append(", targetPlayerId=");
        sb.append(this.b);
        sb.append(", start=");
        sb.append((Object) gly.h(this.c));
        sb.append(", end=");
        sb.append((Object) gly.h(this.d));
        sb.append(", coinSizePx=");
        sb.append(this.e);
        sb.append(", arcLiftPx=");
        sb.append(this.f);
        sb.append(", durationMs=");
        return zk1.a(this.g, ", fadeInMs=200)", sb);
    }
}
