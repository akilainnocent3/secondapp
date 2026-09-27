package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gd implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pa2 f149530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f149531b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public hd f149532c;

    public gd(pa2 pa2Var) {
        this.f149530a = pa2Var;
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f149531b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
        } catch (URISyntaxException unused) {
            boolean z10 = ad1.f146762a;
        }
    }

    @Override // yads.n11
    public final void a(int i10) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i11 = 0; i11 < 4; i11++) {
            if (i10 == iArr[i11]) {
                hd hdVar = this.f149532c;
                if (hdVar != null) {
                    ng0.a(((bd) hdVar).f147140a.f147677a);
                    return;
                }
                return;
            }
        }
    }

    public final List a() {
        return fr.g0.l(new qd("noInterestAd", new fd(this)));
    }
}
