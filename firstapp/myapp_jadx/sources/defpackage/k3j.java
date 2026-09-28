package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.spindabottle.remote.models.DetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$setupBetChipSlider$2", f = "FruitHuntBase.kt", l = {1231}, m = "invokeSuspend", v = 1)
public final class k3j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u6j b;

    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$setupBetChipSlider$2$1", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<LoadingState<HTTPResponse<DetailResponse>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ u6j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u6j u6jVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = u6jVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LoadingState<HTTPResponse<DetailResponse>> loadingState, v1b<? super Unit> v1bVar) {
            return ((a) create(loadingState, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            LoadingState loadingState = (LoadingState) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (loadingState == null) {
                return Unit.a;
            }
            Status status = loadingState.getStatus();
            ResultWrapper.GenericError error = loadingState.getError();
            u6j u6jVar = this.b;
            u6jVar.w0(status, error, new ve0(1, loadingState, u6jVar));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3j(u6j u6jVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = u6jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k3j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k3j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            u6j u6jVar = this.b;
            wwd0 wwd0Var = u6jVar.t0().Y;
            a aVar = new a(u6jVar, null);
            this.a = 1;
            if (kzh.b(wwd0Var, aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
