package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.BoostResult;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.base.BaseLiveViewModel$getTournaments$1", f = "BaseLiveViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w22 extends tje0 implements gaj<BaseResponse<List<? extends Tournament>>, BaseResponse<BoostInfo>, v1b<? super bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ BaseResponse b;

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<List<? extends Tournament>> baseResponse, BaseResponse<BoostInfo> baseResponse2, v1b<? super bxg0<? extends List<? extends Tournament>, ? extends List<? extends LiveBoostMatchItem>, ? extends Boolean>> v1bVar) {
        w22 w22Var = new w22(3, v1bVar);
        w22Var.a = baseResponse;
        w22Var.b = baseResponse2;
        return w22Var.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BoostResult boostResult;
        BaseResponse baseResponse = this.a;
        BaseResponse baseResponse2 = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        BoostInfo boostInfo = (BoostInfo) baseResponse2.data;
        if (boostInfo == null || (boostResult = t25.a(boostInfo)) == null) {
            boostResult = new BoostResult(false, null, 3, null);
        }
        T t = baseResponse.data;
        t.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) t) {
            List<Event> list = ((Tournament) obj2).events;
            if (list != null && !list.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        return new bxg0(arrayList, boostResult.getBoostMatchList(), Boolean.valueOf(boostResult.getShowUseBoost()));
    }
}
