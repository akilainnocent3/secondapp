package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$onResponseGetExitRecommendations$1", f = "FruitHuntBase.kt", l = {1021}, m = "invokeSuspend", v = 1)
public final class j3j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ n2j b;

    @c0d(c = "com.sportygames.fruithunt.views.FruitHuntBase$onResponseGetExitRecommendations$1$1", f = "FruitHuntBase.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<LoadingState<HTTPResponse<List<? extends GameDetails>>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ n2j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2j n2jVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = n2jVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LoadingState<HTTPResponse<List<? extends GameDetails>>> loadingState, v1b<? super Unit> v1bVar) {
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
            Status status2 = Status.SUCCESS;
            n2j n2jVar = this.b;
            if (status == status2) {
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                List list = hTTPResponse != null ? (List) hTTPResponse.getData() : null;
                if (list != null && !list.isEmpty()) {
                    n2jVar.V = (ArrayList) list;
                }
                o8j o8jVarT0 = n2jVar.t0();
                ej5.c(o8i0.d(o8jVarT0), null, null, new s3j(o8jVarT0, null), 3);
            }
            if (loadingState.getStatus() == Status.FAILED) {
                o8j o8jVarT1 = n2jVar.t0();
                ej5.c(o8i0.d(o8jVarT1), null, null, new s3j(o8jVarT1, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3j(n2j n2jVar, v1b<? super j3j> v1bVar) {
        super(2, v1bVar);
        this.b = n2jVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j3j(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j3j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            n2j n2jVar = this.b;
            wwd0 wwd0Var = n2jVar.u0().e;
            a aVar = new a(n2jVar, null);
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
