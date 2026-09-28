package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class d8e0 {
    public njg0 b;
    public m4h c;
    public xly d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final vly a = new vly();
    public a j = new a();

    public static class a {
        public androidx.media3.common.a a;
        public fuh.a b;
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(nsz nszVar);

    public abstract boolean c(nsz nszVar, long j, a aVar);

    public void d(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public static final class b implements xly {
        @Override // defpackage.xly
        public final long a(l4h l4hVar) {
            return -1L;
        }

        @Override // defpackage.xly
        public final p480 b() {
            return new p480.b(-9223372036854775807L);
        }

        @Override // defpackage.xly
        public final void c(long j) {
        }
    }
}
