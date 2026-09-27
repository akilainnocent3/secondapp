package fh;

import java.util.Arrays;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f84345g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @h1
    public static final long f84346h = 1000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f84349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f84350d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f84352f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f84347a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f84348b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f84351e = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f84353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f84354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f84355c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f84356d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f84357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f84358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f84359g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f84360h;

        public static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f84357e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f84358f / j10;
        }

        public long b() {
            return this.f84358f;
        }

        public boolean d() {
            long j10 = this.f84356d;
            if (j10 == 0) {
                return false;
            }
            return this.f84359g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f84356d > 15 && this.f84360h == 0;
        }

        public void f(long j10) {
            long j11 = this.f84356d;
            if (j11 == 0) {
                this.f84353a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f84353a;
                this.f84354b = j12;
                this.f84358f = j12;
                this.f84357e = 1L;
            } else {
                long j13 = j10 - this.f84355c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f84354b) <= 1000000) {
                    this.f84357e++;
                    this.f84358f += j13;
                    boolean[] zArr = this.f84359g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f84360h--;
                    }
                } else {
                    boolean[] zArr2 = this.f84359g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f84360h++;
                    }
                }
            }
            this.f84356d++;
            this.f84355c = j10;
        }

        public void g() {
            this.f84356d = 0L;
            this.f84357e = 0L;
            this.f84358f = 0L;
            this.f84360h = 0;
            Arrays.fill(this.f84359g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f84347a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f84347a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f84352f;
    }

    public long d() {
        if (e()) {
            return this.f84347a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f84347a.e();
    }

    public void f(long j10) {
        this.f84347a.f(j10);
        if (this.f84347a.e() && !this.f84350d) {
            this.f84349c = false;
        } else if (this.f84351e != -9223372036854775807L) {
            if (!this.f84349c || this.f84348b.d()) {
                this.f84348b.g();
                this.f84348b.f(this.f84351e);
            }
            this.f84349c = true;
            this.f84348b.f(j10);
        }
        if (this.f84349c && this.f84348b.e()) {
            a aVar = this.f84347a;
            this.f84347a = this.f84348b;
            this.f84348b = aVar;
            this.f84349c = false;
            this.f84350d = false;
        }
        this.f84351e = j10;
        this.f84352f = this.f84347a.e() ? 0 : this.f84352f + 1;
    }

    public void g() {
        this.f84347a.g();
        this.f84348b.g();
        this.f84349c = false;
        this.f84351e = -9223372036854775807L;
        this.f84352f = 0;
    }
}
