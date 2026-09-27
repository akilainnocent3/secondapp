package d6;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import x4.b2;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class c0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f78135q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f78136r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78137s = 2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f78138t = 3;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f78139u = 4;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f78140v = 5;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final long f78141w = 50000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f78142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f78143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f78144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78145d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f78148g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f78151j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f78154m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f78155n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f78156o;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f78146e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f78147f = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78149h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f78150i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f78152k = 1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public x4.l f78153l = x4.l.f144348a;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f78157p = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Target({ElementType.TYPE_USE})
    @m1
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f78158a = -9223372036854775807L;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f78159b = -9223372036854775807L;

        public long f() {
            return this.f78158a;
        }

        public long g() {
            return this.f78159b;
        }

        public final void h() {
            this.f78158a = -9223372036854775807L;
            this.f78159b = -9223372036854775807L;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        boolean h(long j10, long j11);

        boolean j(long j10, long j11, boolean z10);

        boolean m(long j10, long j11, long j12, boolean z10, boolean z11) throws d5.h0;
    }

    public c0(Context context, c cVar, long j10) {
        this.f78142a = cVar;
        this.f78144c = j10;
        this.f78143b = new e0(context);
    }

    public void a() {
        if (this.f78146e == 0) {
            this.f78146e = 1;
        }
    }

    public final long b(long j10, long j11, long j12) {
        long j13 = (long) ((j12 - j10) / ((double) this.f78152k));
        return this.f78145d ? j13 - (b2.N1(this.f78153l.elapsedRealtime()) - j11) : j13;
    }

    public void c() {
        this.f78156o = true;
    }

    public int d(long j10, long j11, long j12, long j13, boolean z10, boolean z11, b bVar) throws d5.h0 {
        bVar.h();
        if (this.f78145d && this.f78147f == -9223372036854775807L) {
            this.f78147f = j11;
        }
        if (this.f78149h != j10) {
            this.f78143b.f(j10);
            this.f78149h = j10;
        }
        bVar.f78158a = b(j11, j12, j10);
        if (z10 && !z11) {
            return 3;
        }
        if (!this.f78154m && this.f78157p) {
            if (this.f78142a.m(bVar.f78158a, j11, j12, z11, true)) {
                return 4;
            }
            if (this.f78145d && bVar.f78158a < 30000) {
                return 3;
            }
            this.f78155n = true;
            return 5;
        }
        if (!this.f78157p) {
            this.f78155n = true;
        }
        if (s(j11, bVar.f78158a, j13)) {
            return 0;
        }
        if (!this.f78145d || j11 == this.f78147f) {
            return 5;
        }
        long jNanoTime = this.f78153l.nanoTime();
        bVar.f78159b = this.f78143b.a((bVar.f78158a * 1000) + jNanoTime, j10);
        bVar.f78158a = (bVar.f78159b - jNanoTime) / 1000;
        boolean z12 = (this.f78150i == -9223372036854775807L || this.f78151j) ? false : true;
        if (this.f78142a.m(bVar.f78158a, j11, j12, z11, z12)) {
            return 4;
        }
        if (this.f78142a.j(bVar.f78158a, j12, z11)) {
            return z12 ? 3 : 2;
        }
        return bVar.f78158a > 50000 ? 5 : 1;
    }

    public boolean e(boolean z10) {
        if (z10 && (this.f78146e == 3 || (this.f78155n && (!this.f78154m || !this.f78157p)))) {
            this.f78150i = -9223372036854775807L;
            return true;
        }
        if (this.f78150i == -9223372036854775807L) {
            return false;
        }
        if (this.f78153l.elapsedRealtime() < this.f78150i) {
            return true;
        }
        this.f78150i = -9223372036854775807L;
        return false;
    }

    public void f(boolean z10) {
        this.f78151j = z10;
        this.f78150i = this.f78144c > 0 ? this.f78153l.elapsedRealtime() + this.f78144c : -9223372036854775807L;
    }

    public final void g(int i10) {
        this.f78146e = Math.min(this.f78146e, i10);
    }

    public boolean h() {
        boolean z10 = this.f78146e != 3;
        this.f78146e = 3;
        this.f78148g = b2.N1(this.f78153l.elapsedRealtime());
        return z10;
    }

    public void i() {
        this.f78145d = true;
        this.f78148g = b2.N1(this.f78153l.elapsedRealtime());
        this.f78143b.i();
    }

    public void j() {
        this.f78145d = false;
        this.f78150i = -9223372036854775807L;
        this.f78143b.j();
    }

    public void k(int i10) {
        if (i10 == 0) {
            this.f78146e = 1;
        } else if (i10 == 1) {
            this.f78146e = 0;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            g(2);
        }
        this.f78143b.h();
    }

    public void l() {
        this.f78143b.h();
        this.f78149h = -9223372036854775807L;
        this.f78147f = -9223372036854775807L;
        g(1);
        this.f78150i = -9223372036854775807L;
        this.f78155n = false;
    }

    public void m(int i10) {
        this.f78143b.m(i10);
    }

    public void n(x4.l lVar) {
        this.f78153l = lVar;
    }

    public void o(float f10) {
        this.f78143b.e(f10);
    }

    public void p(@Nullable Surface surface) {
        this.f78154m = surface != null;
        this.f78155n = false;
        this.f78143b.k(surface);
        g(1);
    }

    public void q(@k.w(from = 0.0d, fromInclusive = false) float f10) {
        zi.l0.d(f10 > 0.0f);
        if (f10 == this.f78152k) {
            return;
        }
        this.f78152k = f10;
        this.f78143b.g(f10);
    }

    public void r(boolean z10) {
        this.f78157p = z10;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045 A[RETURN] */
    public final boolean s(long j10, long j11, long j12) {
        if (this.f78150i != -9223372036854775807L && !this.f78151j) {
            return false;
        }
        int i10 = this.f78146e;
        if (i10 == 0) {
            return this.f78145d;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return j10 >= j12;
        }
        if (i10 != 3) {
            throw new IllegalStateException();
        }
        long jN1 = b2.N1(this.f78153l.elapsedRealtime()) - this.f78148g;
        if (this.f78145d) {
            if (!this.f78156o) {
                long j13 = this.f78147f;
                if (j13 != -9223372036854775807L && j13 != j10) {
                    if (this.f78142a.h(j11, jN1)) {
                        return true;
                    }
                }
            } else if (this.f78142a.h(j11, jN1)) {
                return true;
            }
        }
        return false;
    }
}
