package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class b64 {
    public final a a;
    public final f b;
    public c c;
    public final int d;

    public static class a implements p480 {
        public final d a;
        public final long b;
        public final long c;
        public final long d;
        public final long e;
        public final long f;

        public a(d dVar, long j, long j2, long j3, long j4, long j5) {
            this.a = dVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
        }

        @Override // defpackage.p480
        public final p480.a d(long j) {
            r480 r480Var = new r480(j, c.a(this.a.a(j), 0L, this.c, this.d, this.e, this.f));
            return new p480.a(r480Var, r480Var);
        }

        @Override // defpackage.p480
        public final boolean g() {
            return true;
        }

        @Override // defpackage.p480
        public final long k() {
            return this.b;
        }
    }

    public static class c {
        public final long a;
        public final long b;
        public final long c;
        public long d = 0;
        public long e;
        public long f;
        public long g;
        public long h;

        public c(long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = j;
            this.b = j2;
            this.e = j3;
            this.f = j4;
            this.g = j5;
            this.c = j6;
            this.h = a(j2, 0L, j3, j4, j5, j6);
        }

        public static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
            return jrh0.j(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }
    }

    public interface d {
        long a(long j);
    }

    public static final class e {
        public static final e d = new e(-3, -9223372036854775807L, -1);
        public final int a;
        public final long b;
        public final long c;

        public e(int i, long j, long j2) {
            this.a = i;
            this.b = j;
            this.c = j2;
        }
    }

    public b64(d dVar, f fVar, long j, long j2, long j3, long j4, long j5, int i) {
        this.b = fVar;
        this.d = i;
        this.a = new a(dVar, j, j2, j3, j4, j5);
    }

    public static int b(l4h l4hVar, long j, k620 k620Var) {
        if (j == l4hVar.getPosition()) {
            return 0;
        }
        k620Var.a = j;
        return 1;
    }

    public final int a(l4h l4hVar, k620 k620Var) {
        while (true) {
            c cVar = this.c;
            ly0.g(cVar);
            long j = cVar.f;
            long j2 = cVar.g;
            long j3 = cVar.h;
            long j4 = j2 - j;
            long j5 = this.d;
            f fVar = this.b;
            if (j4 <= j5) {
                this.c = null;
                fVar.b();
                return b(l4hVar, j, k620Var);
            }
            long position = j3 - l4hVar.getPosition();
            if (position < 0 || position > 262144) {
                return b(l4hVar, j3, k620Var);
            }
            l4hVar.l((int) position);
            l4hVar.e();
            e eVarA = fVar.a(l4hVar, cVar.b);
            int i = eVarA.a;
            long j6 = eVarA.b;
            long j7 = eVarA.c;
            if (i == -3) {
                this.c = null;
                fVar.b();
                return b(l4hVar, j3, k620Var);
            }
            if (i == -2) {
                cVar.d = j6;
                cVar.f = j7;
                cVar.h = c.a(cVar.b, j6, cVar.e, j7, cVar.g, cVar.c);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        ib5.a("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - l4hVar.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        l4hVar.l((int) position2);
                    }
                    this.c = null;
                    fVar.b();
                    return b(l4hVar, j7, k620Var);
                }
                cVar.e = j6;
                cVar.g = j7;
                cVar.h = c.a(cVar.b, cVar.d, j6, cVar.f, j7, cVar.c);
            }
        }
    }

    public final void c(long j) {
        c cVar = this.c;
        if (cVar == null || cVar.a != j) {
            a aVar = this.a;
            this.c = new c(j, aVar.a.a(j), aVar.c, aVar.d, aVar.e, aVar.f);
        }
    }

    public interface f {
        e a(l4h l4hVar, long j);

        default void b() {
        }
    }

    public static final class b implements d {
        @Override // b64.d
        public final long a(long j) {
            return j;
        }
    }
}
