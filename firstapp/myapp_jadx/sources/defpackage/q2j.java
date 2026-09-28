package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$observeApiGameDetails$2", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
public final class q2j extends tje0 implements Function2<LoadingState<HTTPResponse<DetailResponse>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ n2j b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2j(n2j n2jVar, v1b<? super q2j> v1bVar) {
        super(2, v1bVar);
        this.b = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        q2j q2jVar = new q2j(this.b, v1bVar);
        q2jVar.a = obj;
        return q2jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(LoadingState<HTTPResponse<DetailResponse>> loadingState, v1b<? super Unit> v1bVar) {
        return ((q2j) create(loadingState, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final LoadingState loadingState = (LoadingState) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (loadingState == null) {
            return Unit.a;
        }
        Status status = loadingState.getStatus();
        ResultWrapper.GenericError error = loadingState.getError();
        final n2j n2jVar = this.b;
        n2jVar.w0(status, error, new Function0() { // from class: p2j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                if (hTTPResponse != null && ((DetailResponse) hTTPResponse.getData()) != null) {
                    n2j n2jVar2 = n2jVar;
                    n2jVar2.X0(true);
                    if (n2jVar2.g0) {
                        n2jVar2.t0().x1();
                    } else {
                        n2jVar2.X0(true);
                        n2jVar2.g0 = true;
                    }
                    o8j o8jVarT0 = n2jVar2.t0();
                    ej5.c(o8i0.d(o8jVarT0), null, null, new u3j(o8jVarT0, null), 3);
                }
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
