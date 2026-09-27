package tp;

import android.content.Context;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f137124a = "gmaScarBiddingRewardedSignal";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f137125b = "gmaScarBiddingInterstitialSignal";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f137126c = "gmaScarBiddingBannerSignal";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f137127a;

        static {
            int[] iArr = new int[sp.e.values().length];
            f137127a = iArr;
            try {
                iArr[sp.e.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137127a[sp.e.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137127a[sp.e.REWARDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public tp.b f137128b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f137129c;

        public b(tp.b bVar, f fVar) {
            this.f137128b = bVar;
            this.f137129c = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Map<String, String> mapC = this.f137129c.c();
            if (mapC.size() > 0) {
                this.f137128b.onSignalsCollected(new JSONObject(mapC).toString());
            } else if (this.f137129c.b() == null) {
                this.f137128b.onSignalsCollected("");
            } else {
                this.f137128b.onSignalsCollectionFailed(this.f137129c.b());
            }
        }
    }

    @Override // tp.c
    public void a(Context context, String str, sp.e eVar, tp.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        d(context, str, eVar, aVar, fVar);
        aVar.c(new b(bVar, fVar));
    }

    @Override // tp.c
    public void b(Context context, List<sp.e> list, tp.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        for (sp.e eVar : list) {
            aVar.a();
            e(context, eVar, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    @Override // tp.c
    public void c(Context context, boolean z10, tp.b bVar) {
        com.unity3d.scar.adapter.common.a aVar = new com.unity3d.scar.adapter.common.a();
        f fVar = new f();
        aVar.a();
        e(context, sp.e.INTERSTITIAL, aVar, fVar);
        aVar.a();
        e(context, sp.e.REWARDED, aVar, fVar);
        if (z10) {
            aVar.a();
            e(context, sp.e.BANNER, aVar, fVar);
        }
        aVar.c(new b(bVar, fVar));
    }

    public String f(sp.e eVar) {
        int i10 = a.f137127a[eVar.ordinal()];
        if (i10 == 1) {
            return f137126c;
        }
        if (i10 != 2) {
            return i10 != 3 ? "" : f137124a;
        }
        return f137125b;
    }

    public void g(String str, com.unity3d.scar.adapter.common.a aVar, f fVar) {
        fVar.d(String.format("Operation Not supported: %s.", str));
        aVar.b();
    }
}
