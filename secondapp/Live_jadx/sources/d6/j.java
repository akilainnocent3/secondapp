package d6;

import java.util.Arrays;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f78213g = 15;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @h1
    public static final long f78214h = 1000000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f78217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f78218d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f78220f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f78215a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f78216b = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f78219e = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f78221a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f78222b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f78223c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f78224d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f78225e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f78226f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean[] f78227g = new boolean[15];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f78228h;

        public static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f78225e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f78226f / j10;
        }

        public long b() {
            return this.f78226f;
        }

        public boolean d() {
            long j10 = this.f78224d;
            if (j10 == 0) {
                return false;
            }
            return this.f78227g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f78224d > 15 && this.f78228h == 0;
        }

        public void f(long j10) {
            long j11 = this.f78224d;
            if (j11 == 0) {
                this.f78221a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f78221a;
                this.f78222b = j12;
                this.f78226f = j12;
                this.f78225e = 1L;
            } else {
                long j13 = j10 - this.f78223c;
                int iC = c(j11);
                if (Math.abs(j13 - this.f78222b) <= 1000000) {
                    this.f78225e++;
                    this.f78226f += j13;
                    boolean[] zArr = this.f78227g;
                    if (zArr[iC]) {
                        zArr[iC] = false;
                        this.f78228h--;
                    }
                } else {
                    boolean[] zArr2 = this.f78227g;
                    if (!zArr2[iC]) {
                        zArr2[iC] = true;
                        this.f78228h++;
                    }
                }
            }
            this.f78224d++;
            this.f78223c = j10;
        }

        public void g() {
            this.f78224d = 0L;
            this.f78225e = 0L;
            this.f78226f = 0L;
            this.f78228h = 0;
            Arrays.fill(this.f78227g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f78215a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / this.f78215a.a());
        }
        return -1.0f;
    }

    public int c() {
        return this.f78220f;
    }

    public long d() {
        if (e()) {
            return this.f78215a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f78215a.e();
    }

    public void f(long j10) {
        this.f78215a.f(j10);
        if (this.f78215a.e() && !this.f78218d) {
            this.f78217c = false;
        } else if (this.f78219e != -9223372036854775807L) {
            if (!this.f78217c || this.f78216b.d()) {
                this.f78216b.g();
                this.f78216b.f(this.f78219e);
            }
            this.f78217c = true;
            this.f78216b.f(j10);
        }
        if (this.f78217c && this.f78216b.e()) {
            a aVar = this.f78215a;
            this.f78215a = this.f78216b;
            this.f78216b = aVar;
            this.f78217c = false;
            this.f78218d = false;
        }
        this.f78219e = j10;
        this.f78220f = this.f78215a.e() ? 0 : this.f78220f + 1;
    }

    public void g() {
        this.f78215a.g();
        this.f78216b.g();
        this.f78217c = false;
        this.f78219e = -9223372036854775807L;
        this.f78220f = 0;
    }
}
