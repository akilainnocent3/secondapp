package hf;

import af.d0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface g extends d0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends d0.b implements g {
        public a() {
            super(-9223372036854775807L);
        }

        @Override // hf.g
        public long a() {
            return -1L;
        }

        @Override // hf.g
        public long getTimeUs(long j10) {
            return 0L;
        }
    }

    long a();

    long getTimeUs(long j10);
}
