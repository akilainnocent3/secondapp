package y6;

import f6.w0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public interface i extends w0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends w0.b implements i {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // y6.i
        public long a() {
            return -1L;
        }

        @Override // y6.i
        public long d() {
            return 0L;
        }

        @Override // y6.i
        public int g() {
            return -2147483647;
        }

        @Override // y6.i
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long a();

    long d();

    int g();

    long getTimeUs(long j10);
}
