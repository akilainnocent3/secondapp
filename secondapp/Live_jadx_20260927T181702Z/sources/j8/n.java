package j8;

import android.adservices.common.AdSelectionSignals;
import android.annotation.SuppressLint;
import k.u0;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f99760a;

    public n(@oy.l String signals) {
        m0.p(signals, "signals");
        this.f99760a = signals;
    }

    @oy.l
    @u0.a({@u0(extension = 1000000, version = 4), @u0(extension = 31, version = 9)})
    @y0({y0.a.LIBRARY})
    public final AdSelectionSignals a() {
        AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(this.f99760a);
        m0.o(adSelectionSignalsFromString, "fromString(signals)");
        return adSelectionSignalsFromString;
    }

    @oy.l
    public final String b() {
        return this.f99760a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            return m0.g(this.f99760a, ((n) obj).f99760a);
        }
        return false;
    }

    public int hashCode() {
        return this.f99760a.hashCode();
    }

    @oy.l
    public String toString() {
        return "AdSelectionSignals: " + this.f99760a;
    }
}
