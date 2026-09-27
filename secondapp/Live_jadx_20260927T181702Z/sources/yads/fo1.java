package yads;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class fo1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.monetization.ads.mediation.base.a f149195a;

    public fo1(com.monetization.ads.mediation.base.a aVar) {
        this.f149195a = aVar;
    }

    public final MediatedAdObject a() {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(this.f149195a.getAdObject());
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.i(objB)) {
            objB = null;
        }
        return (MediatedAdObject) objB;
    }

    public final MediatedAdapterInfo b() {
        Object objB;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(this.f149195a.getAdapterInfo());
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        if (dr.i1.e(objB) != null) {
            objB = new MediatedAdapterInfo.Builder().setAdapterVersion(fw.b.f85379f).setNetworkName(fw.b.f85379f).setNetworkSdkVersion(fw.b.f85379f).build();
        }
        return (MediatedAdapterInfo) objB;
    }
}
