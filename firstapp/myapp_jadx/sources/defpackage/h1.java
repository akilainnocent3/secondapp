package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.ads.RealSportsAdsData;
import com.sportybet.plugin.realsports.data.PopularAndSportData;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$loadAzMenuData$1", f = "AZMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class h1 extends tje0 implements iaj<BaseResponse<RealSportsAdsData>, BaseResponse<List<? extends Sport>>, PopularAndSportData, v1b<? super fq1>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ BaseResponse b;
    public /* synthetic */ PopularAndSportData c;

    @Override // defpackage.iaj
    public final Object d(BaseResponse<RealSportsAdsData> baseResponse, BaseResponse<List<? extends Sport>> baseResponse2, PopularAndSportData popularAndSportData, v1b<? super fq1> v1bVar) {
        h1 h1Var = new h1(4, v1bVar);
        h1Var.a = baseResponse;
        h1Var.b = baseResponse2;
        h1Var.c = popularAndSportData;
        return h1Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = this.a;
        BaseResponse baseResponse2 = this.b;
        PopularAndSportData popularAndSportData = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new fq1(((RealSportsAdsData) n52.b(baseResponse)).getAdSpots(), lfb0.d().f((List) baseResponse2.data), popularAndSportData);
    }
}
