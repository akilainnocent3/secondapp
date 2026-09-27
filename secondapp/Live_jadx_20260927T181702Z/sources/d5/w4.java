package d5;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w4 {
    public static long b(androidx.media3.exoplayer.q qVar, long j10, long j11) {
        if (qVar.getState() == 1) {
            return (qVar.isReady() || qVar.isEnded()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    public static boolean e(androidx.media3.exoplayer.q qVar, long j10) {
        return false;
    }

    public static void a(androidx.media3.exoplayer.q qVar) {
    }

    public static void c(androidx.media3.exoplayer.q qVar) {
    }

    public static void d(androidx.media3.exoplayer.q qVar, float f10, float f11) throws h0 {
    }
}
