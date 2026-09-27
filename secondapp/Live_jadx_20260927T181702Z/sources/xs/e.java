package xs;

import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum e {
    FIELD(null, 1, null),
    FILE(null, 1, null),
    PROPERTY(null, 1, null),
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER(0 == true ? 1 : 0, 1, null),
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final String f145568b;

    e(String str) {
        this.f145568b = str == null ? wu.a.f(name()) : str;
    }

    @oy.l
    public final String g() {
        return this.f145568b;
    }

    /* synthetic */ e(String str, int i10, x xVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
