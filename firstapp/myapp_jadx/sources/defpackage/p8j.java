package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.fruithunt.network.models.FHPlaceBetRequest;
import com.sportygames.fruithunt.network.models.FHPlaceBetResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntViewModel$apiCallPlaceBet$1", f = "FruitHuntViewModel.kt", l = {182}, m = "invokeSuspend", v = 1)
public final class p8j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o8j b;
    public final /* synthetic */ FHPlaceBetRequest c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8j(o8j o8jVar, FHPlaceBetRequest fHPlaceBetRequest, v1b<? super p8j> v1bVar) {
        super(2, v1bVar);
        this.b = o8jVar;
        this.c = fHPlaceBetRequest;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p8j(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p8j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        o8j o8jVar = this.b;
        ssw<LoadingState<HTTPResponse<FHPlaceBetResponse>>> sswVar = o8jVar.R;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            r5h r5hVar = o8jVar.c;
            this.a = 1;
            r5hVar.getClass();
            pfd pfdVar = fse.a;
            obj = ej5.d(odd.b, new a52(new n5h(this.c, null), null), this);
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
        ResultWrapper resultWrapper = (ResultWrapper) obj;
        if (resultWrapper instanceof ResultWrapper.Success) {
            sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 28, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 22, null));
        } else {
            Status status = Status.FAILED;
            resultWrapper.getClass();
            sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 26, null));
        }
        return Unit.a;
    }
}
