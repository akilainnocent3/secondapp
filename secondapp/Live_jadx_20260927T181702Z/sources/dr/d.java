package dr;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class d {
    @l1(version = "1.5")
    @ur.f
    public static final char a(int i10) {
        if (i10 >= 0 && i10 <= 65535) {
            return (char) i10;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i10);
    }

    public static final int b(char c10) {
        return c10;
    }

    @l1(version = "1.5")
    @ur.f
    @ur.g
    public static /* synthetic */ void c(char c10) {
    }
}
