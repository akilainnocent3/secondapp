package cs;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class s extends Error {
    public s() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public s(@oy.m String str) {
        super(str);
    }

    public s(@oy.m String str, @oy.m Throwable th2) {
        super(str, th2);
    }

    public s(@oy.m Throwable th2) {
        super(th2);
    }
}
