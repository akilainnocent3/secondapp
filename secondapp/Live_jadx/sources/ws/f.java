package ws;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum f {
    CLASS(sc.c.f129750g),
    INTERFACE("interface"),
    ENUM_CLASS("enum class"),
    ENUM_ENTRY(null),
    ANNOTATION_CLASS("annotation class"),
    OBJECT("object");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.m
    public final String f143747b;

    f(String str) {
        this.f143747b = str;
    }

    public final boolean g() {
        return this == OBJECT || this == ENUM_ENTRY;
    }
}
