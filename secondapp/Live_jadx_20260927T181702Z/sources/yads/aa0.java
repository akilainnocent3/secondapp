package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aa0 extends ba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f146711a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(boolean z10) {
        super(0);
        z90 z90Var = z90.DEBUG_ERROR_INDICATOR;
        this.f146711a = z10;
    }

    @Override // yads.ba0
    public final boolean a(Object obj) {
        if (!(obj instanceof aa0) || !kotlin.jvm.internal.m0.g("Debug Error Indicator", "Debug Error Indicator")) {
            return false;
        }
        z90 z90Var = z90.DEBUG_ERROR_INDICATOR;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        if (!kotlin.jvm.internal.m0.g("Debug Error Indicator", "Debug Error Indicator")) {
            return false;
        }
        z90 z90Var = z90.DEBUG_ERROR_INDICATOR;
        return this.f146711a == aa0Var.f146711a;
    }

    public final int hashCode() {
        return g8.a.a(this.f146711a) + ((z90.DEBUG_ERROR_INDICATOR.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + z90.DEBUG_ERROR_INDICATOR + ", initialState=" + this.f146711a + gi.j.f86771d;
    }
}
