package qv;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f122954a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f122954a;
    }

    @oy.m
    public static final String b(@oy.l String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
