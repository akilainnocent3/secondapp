package j8;

import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import k.u0;
import k.y0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final String f99761a;

    public p(@oy.l String identifier) {
        m0.p(identifier, "identifier");
        this.f99761a = identifier;
    }

    @oy.l
    @u0.a({@u0(extension = 1000000, version = 4), @u0(extension = 31, version = 9)})
    @y0({y0.a.LIBRARY})
    public final AdTechIdentifier a() {
        AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(this.f99761a);
        m0.o(adTechIdentifierFromString, "fromString(identifier)");
        return adTechIdentifierFromString;
    }

    @oy.l
    public final String b() {
        return this.f99761a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return m0.g(this.f99761a, ((p) obj).f99761a);
        }
        return false;
    }

    public int hashCode() {
        return this.f99761a.hashCode();
    }

    @oy.l
    public String toString() {
        return String.valueOf(this.f99761a);
    }
}
