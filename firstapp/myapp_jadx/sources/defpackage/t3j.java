package defpackage;

import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.fruithunt.network.models.FHIsAvailable;
import com.sportygames.fruithunt.network.models.FHUserDataResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lt3j;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class t3j extends j8i0 {
    public GiftItem a;
    public Double b;
    public final r5h c = r5h.a;
    public final ssw<LoadingState<HTTPResponse<FHIsAvailable>>> d = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<FHUserDataResponse>>> e = new ssw<>();
    public final wwd0 f;
    public final wwd0 i;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> v;
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> w;

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntBaseViewModel$getPromotionalGifts$1", f = "FruitHuntBaseViewModel.kt", l = {104}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return t3j.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            t3j t3jVar = t3j.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = t3jVar.v;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 30, null));
                r5h r5hVar = t3jVar.c;
                this.a = 1;
                r5hVar.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new l5h(1, null), null), this);
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

    @c0d(c = "com.sportygames.fruithunt.viewmodels.FruitHuntBaseViewModel$walletInfo$1", f = "FruitHuntBaseViewModel.kt", l = {78}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return t3j.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objD;
            t3j t3jVar = t3j.this;
            wwd0 wwd0Var = t3jVar.f;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                LoadingState loadingState = new LoadingState(Status.RUNNING, null, null, null, null, 30, null);
                wwd0Var.getClass();
                wwd0Var.k(null, loadingState);
                r5h r5hVar = t3jVar.c;
                this.a = 1;
                r5hVar.getClass();
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new a52(new q5h(1, null), null), this);
                if (objD == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objD = obj;
            }
            ResultWrapper resultWrapper = (ResultWrapper) objD;
            if (resultWrapper instanceof ResultWrapper.Success) {
                LoadingState loadingState2 = new LoadingState(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 28, null);
                wwd0Var.getClass();
                wwd0Var.k(null, loadingState2);
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                LoadingState loadingState3 = new LoadingState(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 22, null);
                wwd0Var.getClass();
                wwd0Var.k(null, loadingState3);
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                LoadingState loadingState4 = new LoadingState(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 26, null);
                wwd0Var.getClass();
                wwd0Var.k(null, loadingState4);
            }
            return Unit.a;
        }
    }

    public t3j() {
        wwd0 wwd0VarA = xwd0.a(null);
        this.f = wwd0VarA;
        this.i = wwd0VarA;
        this.v = new ssw<>();
        this.w = new ssw<>();
    }

    public final void x1() {
        this.a = null;
        this.b = null;
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }
}
