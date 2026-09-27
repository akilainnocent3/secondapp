package d5;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s5.s0.b f78094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f78095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f78097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f78098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f78099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f78100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f78101h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f78102i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f78103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f78104k;

    public y3(s5.s0.b bVar, long j10, long j11, long j12, long j13, long j14, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15 = true;
        zi.l0.d(!z14 || z12);
        zi.l0.d(!z13 || z12);
        if (z11 && (z12 || z13 || z14)) {
            z15 = false;
        }
        zi.l0.d(z15);
        this.f78094a = bVar;
        this.f78095b = j10;
        this.f78096c = j11;
        this.f78097d = j12;
        this.f78098e = j13;
        this.f78099f = j14;
        this.f78100g = z10;
        this.f78101h = z11;
        this.f78102i = z12;
        this.f78103j = z13;
        this.f78104k = z14;
    }

    public y3 a(long j10) {
        return j10 == this.f78097d ? this : new y3(this.f78094a, this.f78095b, this.f78096c, j10, this.f78098e, this.f78099f, this.f78100g, this.f78101h, this.f78102i, this.f78103j, this.f78104k);
    }

    public y3 b(long j10, long j11) {
        return (j10 == this.f78095b && j11 == this.f78096c) ? this : new y3(this.f78094a, j10, j11, this.f78097d, this.f78098e, this.f78099f, this.f78100g, this.f78101h, this.f78102i, this.f78103j, this.f78104k);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y3.class == obj.getClass()) {
            y3 y3Var = (y3) obj;
            if (this.f78095b == y3Var.f78095b && this.f78097d == y3Var.f78097d && this.f78098e == y3Var.f78098e && this.f78099f == y3Var.f78099f && this.f78100g == y3Var.f78100g && this.f78101h == y3Var.f78101h && this.f78102i == y3Var.f78102i && this.f78103j == y3Var.f78103j && this.f78104k == y3Var.f78104k && Objects.equals(this.f78094a, y3Var.f78094a)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f78094a.hashCode()) * 31) + ((int) this.f78095b)) * 31) + ((int) this.f78097d)) * 31) + ((int) this.f78098e)) * 31) + ((int) this.f78099f)) * 31) + (this.f78100g ? 1 : 0)) * 31) + (this.f78101h ? 1 : 0)) * 31) + (this.f78102i ? 1 : 0)) * 31) + (this.f78103j ? 1 : 0)) * 31) + (this.f78104k ? 1 : 0);
    }
}
