package bh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface d extends a.b {
    void onCacheInitialized();

    void onStartFile(a aVar, String str, long j10, long j11);

    boolean requiresCacheSpanTouches();
}
