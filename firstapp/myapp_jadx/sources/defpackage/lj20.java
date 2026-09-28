package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.prematch.data.LiveEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchEventsRequestBody;
import com.sportybet.plugin.realsports.prematch.data.PreMatchWrappedData;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.prematch.usecase.PreMatchSectionUseCase$getLiveAndPreMatchEventsByOrder$fetchJob$1", f = "PreMatchSectionUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lj20 extends tje0 implements gaj<BaseResponse<PreMatchSportsData>, BaseResponse<PreMatchSportsData>, v1b<? super PreMatchWrappedData>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ BaseResponse b;
    public final /* synthetic */ LiveEventsRequestBody c;
    public final /* synthetic */ PreMatchEventsRequestBody d;
    public final /* synthetic */ RegularMarketRule e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj20(LiveEventsRequestBody liveEventsRequestBody, PreMatchEventsRequestBody preMatchEventsRequestBody, RegularMarketRule regularMarketRule, boolean z, v1b<? super lj20> v1bVar) {
        super(3, v1bVar);
        this.c = liveEventsRequestBody;
        this.d = preMatchEventsRequestBody;
        this.e = regularMarketRule;
        this.f = z;
    }

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<PreMatchSportsData> baseResponse, BaseResponse<PreMatchSportsData> baseResponse2, v1b<? super PreMatchWrappedData> v1bVar) {
        RegularMarketRule regularMarketRule = this.e;
        boolean z = this.f;
        lj20 lj20Var = new lj20(this.c, this.d, regularMarketRule, z, v1bVar);
        lj20Var.a = baseResponse;
        lj20Var.b = baseResponse2;
        return lj20Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = this.a;
        BaseResponse baseResponse2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return vi20.d(baseResponse, baseResponse2, this.c.getSportId(), this.d.getOddsFilter(), this.e, this.f);
    }
}
