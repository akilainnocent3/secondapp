package k8;

import android.net.Uri;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public final Uri f102115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final List<String> f102116b;

    public r0(@oy.l Uri trustedBiddingUri, @oy.l List<String> trustedBiddingKeys) {
        kotlin.jvm.internal.m0.p(trustedBiddingUri, "trustedBiddingUri");
        kotlin.jvm.internal.m0.p(trustedBiddingKeys, "trustedBiddingKeys");
        this.f102115a = trustedBiddingUri;
        this.f102116b = trustedBiddingKeys;
    }

    @oy.l
    public final List<String> a() {
        return this.f102116b;
    }

    @oy.l
    public final Uri b() {
        return this.f102115a;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return kotlin.jvm.internal.m0.g(this.f102115a, r0Var.f102115a) && kotlin.jvm.internal.m0.g(this.f102116b, r0Var.f102116b);
    }

    public int hashCode() {
        return (this.f102115a.hashCode() * 31) + this.f102116b.hashCode();
    }

    @oy.l
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.f102115a + " trustedBiddingKeys=" + this.f102116b;
    }
}
