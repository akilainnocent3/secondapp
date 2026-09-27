package yads;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class md2 {

    @oy.l
    public static final ld2 Companion = new ld2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f152410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f152411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f152412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f152413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f152414e;

    public /* synthetic */ md2(int i10, Integer num, Integer num2, Integer num3, Integer num4, Integer num5) {
        if ((i10 & 1) == 0) {
            this.f152410a = null;
        } else {
            this.f152410a = num;
        }
        if ((i10 & 2) == 0) {
            this.f152411b = null;
        } else {
            this.f152411b = num2;
        }
        if ((i10 & 4) == 0) {
            this.f152412c = null;
        } else {
            this.f152412c = num3;
        }
        if ((i10 & 8) == 0) {
            this.f152413d = null;
        } else {
            this.f152413d = num4;
        }
        if ((i10 & 16) == 0) {
            this.f152414e = null;
        } else {
            this.f152414e = num5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof md2)) {
            return false;
        }
        md2 md2Var = (md2) obj;
        return kotlin.jvm.internal.m0.g(this.f152410a, md2Var.f152410a) && kotlin.jvm.internal.m0.g(this.f152411b, md2Var.f152411b) && kotlin.jvm.internal.m0.g(this.f152412c, md2Var.f152412c) && kotlin.jvm.internal.m0.g(this.f152413d, md2Var.f152413d) && kotlin.jvm.internal.m0.g(this.f152414e, md2Var.f152414e);
    }

    public final int hashCode() {
        Integer num = this.f152410a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f152411b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f152412c;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f152413d;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f152414e;
        return iHashCode4 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        return "PlayBackOptimizationConfig(minBufferMs=" + this.f152410a + ", maxBufferMs=" + this.f152411b + ", bufferForPlaybackMs=" + this.f152412c + ", bufferForPlaybackAfterRebufferMs=" + this.f152413d + ", targetBufferBytes=" + this.f152414e + gi.j.f86771d;
    }
}
