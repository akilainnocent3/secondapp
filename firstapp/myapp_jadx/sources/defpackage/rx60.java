package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.AdSpots;
import com.sporty.android.core.model.ads.AdsData;
import com.sportybet.android.home.SplashActivity;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rx60 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ rx60(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List<AdSpots> adSpots;
        AdSpots adSpots2;
        switch (this.a) {
            case 0:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                qlf0.a aVar = obj2 != null ? (qlf0.a) obj2 : null;
                aVar.getClass();
                int i = aVar.a;
                Object obj3 = list.get(1);
                Boolean bool = obj3 != null ? (Boolean) obj3 : null;
                bool.getClass();
                return new qlf0(i, bool.booleanValue());
            default:
                BaseResponse baseResponse = (BaseResponse) obj;
                int i2 = SplashActivity.O;
                baseResponse.getClass();
                if (!baseResponse.hasData() || (adSpots = ((AdsData) baseResponse.data).getAdSpots()) == null || (adSpots2 = adSpots.get(0)) == null) {
                    return null;
                }
                return adSpots2.getFirstAd();
        }
    }
}
