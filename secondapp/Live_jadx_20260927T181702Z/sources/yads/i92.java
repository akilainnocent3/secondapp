package yads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class i92 extends wi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lq2 f150481a;

    public i92(lq2 lq2Var) {
        this.f150481a = lq2Var;
    }

    @Override // yads.wi
    public final oi a(Object obj, String str) throws IOException {
        String strA = (String) obj;
        if (kotlin.jvm.internal.m0.g("review_count", str)) {
            try {
                strA = this.f150481a.a(strA);
            } catch (z02 unused) {
            }
        }
        return wi.a(str, "string", strA);
    }
}
