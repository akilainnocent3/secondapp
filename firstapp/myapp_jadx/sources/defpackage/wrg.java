package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.plugin.event.EventUseCase$fetchRemoteEvent$2", f = "EventUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wrg extends tje0 implements gaj<BaseResponse<Event>, Boolean, v1b<? super Pair<? extends BaseResponse<Event>, ? extends Boolean>>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<Event> baseResponse, Boolean bool, v1b<? super Pair<? extends BaseResponse<Event>, ? extends Boolean>> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        wrg wrgVar = new wrg(3, v1bVar);
        wrgVar.a = baseResponse;
        wrgVar.b = zBooleanValue;
        return wrgVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new Pair(baseResponse, Boolean.valueOf(z));
    }
}
