package d6;

import f0.j3;
import u4.o5;
import x4.f1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f78296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f78297b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d0 f78302g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f78307l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0.b f78298c = new c0.b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f1<o5> f78299d = new f1<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f1<Long> f78300e = new f1<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x4.f0 f78301f = new x4.f0();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f78303h = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public o5 f78306k = o5.f138738h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f78304i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f78305j = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(long j10, long j11, boolean z10);

        void b();

        void onVideoSizeChanged(o5 o5Var);
    }

    public m0(a aVar, c0 c0Var, d0 d0Var) {
        this.f78296a = aVar;
        this.f78297b = c0Var;
        this.f78302g = d0Var;
    }

    public static <T> T c(f1<T> f1Var) {
        zi.l0.d(f1Var.l() > 0);
        while (f1Var.l() > 1) {
            f1Var.i();
        }
        return (T) zi.l0.E(f1Var.i());
    }

    public final void a() {
        this.f78301f.g();
        this.f78296a.b();
    }

    public void b() {
        this.f78301f.c();
        this.f78303h = -9223372036854775807L;
        this.f78304i = -9223372036854775807L;
        this.f78305j = -9223372036854775807L;
        if (this.f78300e.l() > 0) {
            this.f78307l = ((Long) c(this.f78300e)).longValue();
        }
        if (this.f78299d.l() > 0) {
            this.f78299d.a(0L, (o5) c(this.f78299d));
        }
    }

    public boolean d() {
        long j10 = this.f78305j;
        return j10 != -9223372036854775807L && this.f78304i == j10;
    }

    public final boolean e(long j10) {
        Long lJ = this.f78300e.j(j10);
        if (lJ == null || lJ.longValue() == this.f78307l) {
            return false;
        }
        this.f78307l = lJ.longValue();
        return true;
    }

    public final boolean f(long j10) {
        o5 o5VarJ = this.f78299d.j(j10);
        if (o5VarJ == null || o5VarJ.equals(o5.f138738h) || o5VarJ.equals(this.f78306k)) {
            return false;
        }
        this.f78306k = o5VarJ;
        return true;
    }

    public void g(long j10) {
        this.f78301f.a(j10);
        this.f78303h = j10;
        this.f78305j = -9223372036854775807L;
    }

    public void h(int i10, long j10) {
        if (this.f78301f.f()) {
            this.f78297b.k(i10);
            this.f78307l = j10;
        } else {
            f1<Long> f1Var = this.f78300e;
            long j11 = this.f78303h;
            f1Var.a(j11 == -9223372036854775807L ? j3.f81977f : j11 + 1, Long.valueOf(j10));
        }
    }

    public void i(int i10, int i11) {
        f1<o5> f1Var = this.f78299d;
        long j10 = this.f78303h;
        f1Var.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new o5(i10, i11));
    }

    public void j(long j10, long j11) throws d5.h0 {
        while (!this.f78301f.f()) {
            long jE = this.f78301f.e();
            if (e(jE)) {
                this.f78297b.k(2);
            }
            int iD = this.f78297b.d(jE, j10, j11, this.f78307l, false, false, this.f78298c);
            if (iD != 5 && iD != 4) {
                this.f78302g.b(jE, this.f78298c.f());
            }
            if (iD == 0 || iD == 1) {
                this.f78304i = jE;
                k(iD == 0);
            } else if (iD == 2 || iD == 3) {
                this.f78304i = jE;
                a();
            } else {
                if (iD != 4) {
                    if (iD != 5) {
                        throw new IllegalStateException(String.valueOf(iD));
                    }
                    return;
                }
                this.f78304i = jE;
            }
        }
    }

    public final void k(boolean z10) {
        long jG = this.f78301f.g();
        if (f(jG)) {
            this.f78296a.onVideoSizeChanged(this.f78306k);
        }
        this.f78296a.a(z10 ? x4.l.f144348a.nanoTime() : this.f78298c.g(), jG, this.f78297b.h());
    }

    public void l() {
        if (this.f78303h == -9223372036854775807L) {
            this.f78303h = Long.MIN_VALUE;
            this.f78304i = Long.MIN_VALUE;
        }
        this.f78305j = this.f78303h;
    }
}
