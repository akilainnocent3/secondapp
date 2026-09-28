package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.ads.AdSpots;
import com.sporty.android.core.model.ads.Ads;
import com.sporty.android.core.model.ads.AdsData;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.core.data.repository.ads.AdsRepositoryImpl$getAd$2", f = "AdsRepositoryImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class xl extends tje0 implements Function2<v5b, v1b<? super Ads>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl(String str, zl zlVar, v1b<? super xl> v1bVar) {
        super(2, v1bVar);
        this.c = str;
        this.d = zlVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xl xlVar = new xl(this.c, this.d, v1bVar);
        xlVar.b = obj;
        return xlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Ads> v1bVar) {
        return ((xl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        List<AdSpots> adSpots;
        AdSpots adSpots2;
        List<Ads> ads;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                AdsData adsData = new AdsData(null, null, 3, null);
                AdSpots adSpots3 = new AdSpots(null, null, 3, null);
                adSpots3.setSpotId(this.c);
                adsData.setAdSpots(a.c(adSpots3));
                zl zlVar = this.d;
                zi50.a aVar = zi50.b;
                String json = zlVar.b.toJson(adsData);
                x430 x430Var = zlVar.a;
                json.getClass();
                this.b = null;
                this.a = 1;
                obj = x430Var.D(json, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            bVar = (AdsData) n52.b((BaseResponse) obj);
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar4 = itf0.a;
            aVar4.q(MyLog.TAG_COMMON);
            aVar4.e(thA);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        AdsData adsData2 = (AdsData) bVar;
        if (adsData2 == null || (adSpots = adsData2.getAdSpots()) == null || (adSpots2 = (AdSpots) CollectionsKt.firstOrNull(adSpots)) == null || (ads = adSpots2.getAds()) == null) {
            return null;
        }
        return (Ads) CollectionsKt.firstOrNull(ads);
    }
}
