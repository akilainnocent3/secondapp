package yads;

import com.yandex.mobile.ads.instream.InstreamAdBreak;
import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rr3 implements InstreamAdBreak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o00 f155135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as3 f155136b;

    public /* synthetic */ rr3(o00 o00Var) {
        this(o00Var, new as3());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof rr3) && kotlin.jvm.internal.m0.g(((rr3) obj).f155135a, this.f155135a);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final InstreamAdBreakPosition getAdBreakPosition() {
        InstreamAdBreakPosition.Type type;
        as3 as3Var = this.f155136b;
        q00 q00Var = this.f155135a.f153285f;
        as3Var.getClass();
        int iOrdinal = q00Var.f154213a.ordinal();
        if (iOrdinal == 0) {
            type = InstreamAdBreakPosition.Type.PERCENTS;
        } else if (iOrdinal == 1) {
            type = InstreamAdBreakPosition.Type.MILLISECONDS;
        } else {
            if (iOrdinal != 2) {
                throw new dr.o0();
            }
            type = InstreamAdBreakPosition.Type.POSITION;
        }
        return new InstreamAdBreakPosition(type, q00Var.f154214b);
    }

    @Override // com.yandex.mobile.ads.instream.InstreamAdBreak
    public final String getType() {
        return this.f155135a.f153283d;
    }

    public final int hashCode() {
        return this.f155135a.hashCode();
    }

    public rr3(o00 o00Var, as3 as3Var) {
        this.f155135a = o00Var;
        this.f155136b = as3Var;
    }
}
