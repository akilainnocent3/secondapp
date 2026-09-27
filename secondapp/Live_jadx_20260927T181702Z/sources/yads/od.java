package yads;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class od implements n11 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dd f153444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f153445b = b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public pd f153446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f153447d;

    public od(dd ddVar) {
        this.f153444a = ddVar;
    }

    public final void a() {
        pd pdVar = this.f153446c;
        if (pdVar != null) {
            vc vcVar = (vc) pdVar;
            vcVar.f156900a.f157773b.a();
            ng0.a(vcVar.f156900a.f157772a);
        }
    }

    public final List b() {
        return fr.h0.Q(new qd("adtuneRendered", new nd(this)), new qd("adtuneClosed", new ld(this)), new qd("openOptOut", new md(this)));
    }

    public final void a(String str) {
        try {
            URI uri = new URI(str);
            String scheme = uri.getScheme();
            String host = uri.getHost();
            Iterator it = this.f153445b.iterator();
            while (it.hasNext()) {
                qd qdVar = (qd) ((jd) it.next());
                if (qdVar.a(scheme, host)) {
                    qdVar.a();
                    return;
                }
            }
            pd pdVar = this.f153446c;
            if (pdVar != null) {
                ((vc) pdVar).f156900a.f157774c.a(str);
            }
        } catch (URISyntaxException unused) {
            boolean z10 = ad1.f146762a;
            a();
        }
    }

    @Override // yads.n11
    public final void a(int i10) {
        int[] iArr = {-12, -6, -11, -2};
        for (int i11 = 0; i11 < 4; i11++) {
            if (i10 == iArr[i11]) {
                a();
                return;
            }
        }
    }
}
