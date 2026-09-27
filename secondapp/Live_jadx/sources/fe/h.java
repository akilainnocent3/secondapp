package fe;

import com.google.auto.value.AutoValue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@AutoValue
public abstract class h {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static h a() {
        return new b(a.FATAL_ERROR, -1L);
    }

    public static h d() {
        return new b(a.INVALID_PAYLOAD, -1L);
    }

    public static h e(long j10) {
        return new b(a.OK, j10);
    }

    public static h f() {
        return new b(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
