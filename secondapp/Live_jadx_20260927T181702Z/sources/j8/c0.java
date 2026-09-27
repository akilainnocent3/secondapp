package j8;

import android.adservices.common.KeyedFrequencyCap;
import java.time.Duration;
import k.u0;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@q.d
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f99748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f99749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Duration f99750c;

    public c0(int i10, int i11, @oy.l Duration interval) {
        m0.p(interval, "interval");
        this.f99748a = i10;
        this.f99749b = i11;
        this.f99750c = interval;
    }

    @oy.l
    @u0.a({@u0(extension = 1000000, version = 8), @u0(extension = 31, version = 9)})
    @y0({y0.a.LIBRARY})
    public final KeyedFrequencyCap a() {
        b0.a();
        KeyedFrequencyCap keyedFrequencyCapBuild = a0.a(this.f99748a, this.f99749b, this.f99750c).build();
        m0.o(keyedFrequencyCapBuild, "Builder(adCounterKey, ma…val)\n            .build()");
        return keyedFrequencyCapBuild;
    }

    public final int b() {
        return this.f99748a;
    }

    @oy.l
    public final Duration c() {
        return this.f99750c;
    }

    public final int d() {
        return this.f99749b;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f99748a == c0Var.f99748a && this.f99749b == c0Var.f99749b && m0.g(this.f99750c, c0Var.f99750c);
    }

    public int hashCode() {
        return (((this.f99748a * 31) + this.f99749b) * 31) + this.f99750c.hashCode();
    }

    @oy.l
    public String toString() {
        return "KeyedFrequencyCap: adCounterKey=" + this.f99748a + ", maxCount=" + this.f99749b + ", interval=" + this.f99750c;
    }
}
