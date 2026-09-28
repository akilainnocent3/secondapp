package defpackage;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class z740 implements ere {
    public final blh a;
    public final lre b;

    public static final class a implements ere.b {
        public final lre.a a;

        public a(lre.a aVar) {
            this.a = aVar;
        }

        @Override // ere.b
        public final b a() {
            lre.c cVarG;
            lre.a aVar = this.a;
            lre lreVar = lre.this;
            synchronized (lreVar.v) {
                aVar.a(true);
                cVarG = lreVar.g(aVar.a.a);
            }
            if (cVarG != null) {
                return new b(cVarG);
            }
            return null;
        }

        @Override // ere.b
        public final void abort() {
            this.a.a(false);
        }
    }

    public static final class b implements ere.c {
        public final lre.c a;

        public b(lre.c cVar) {
            this.a = cVar;
        }

        @Override // ere.c
        public final a Y0() {
            lre.a aVarF;
            lre.c cVar = this.a;
            lre lreVar = lre.this;
            synchronized (lreVar.v) {
                cVar.close();
                aVarF = lreVar.f(cVar.a.a);
            }
            if (aVarF != null) {
                return new a(aVarF);
            }
            return null;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.a.close();
        }

        @Override // ere.c
        public final cxz k() {
            lre.c cVar = this.a;
            if (!cVar.b) {
                return cVar.a.c.get(1);
            }
            ib5.a("snapshot is closed");
            return null;
        }

        @Override // ere.c
        public final cxz p() {
            lre.c cVar = this.a;
            if (!cVar.b) {
                return cVar.a.c.get(0);
            }
            ib5.a("snapshot is closed");
            return null;
        }
    }

    public z740(long j, blh blhVar, cxz cxzVar, CoroutineContext coroutineContext) {
        this.a = blhVar;
        this.b = new lre(j, blhVar, cxzVar, coroutineContext);
    }

    @Override // defpackage.ere
    public final a a(String str) {
        rl5 rl5Var = rl5.d;
        lre.a aVarF = this.b.f(rl5.a.c(str).c("SHA-256").e());
        if (aVarF != null) {
            return new a(aVarF);
        }
        return null;
    }

    @Override // defpackage.ere
    public final b b(String str) {
        rl5 rl5Var = rl5.d;
        lre.c cVarG = this.b.g(rl5.a.c(str).c("SHA-256").e());
        if (cVarG != null) {
            return new b(cVarG);
        }
        return null;
    }

    @Override // defpackage.ere
    public final blh getFileSystem() {
        return this.a;
    }
}
