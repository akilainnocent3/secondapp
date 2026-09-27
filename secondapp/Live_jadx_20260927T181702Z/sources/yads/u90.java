package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class u90 extends ba0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90() {
        super(0);
        t90 t90Var = t90.TEST_MODE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u90) || !kotlin.jvm.internal.m0.g("Enable Test mode", "Enable Test mode")) {
            return false;
        }
        t90 t90Var = t90.TEST_MODE;
        return true;
    }

    public final int hashCode() {
        return t90.TEST_MODE.hashCode() - 120198036;
    }

    public final String toString() {
        return "Button(text=Enable Test mode, actionType=" + t90.TEST_MODE + gi.j.f86771d;
    }
}
