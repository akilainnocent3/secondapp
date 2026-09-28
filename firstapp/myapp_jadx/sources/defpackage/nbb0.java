package defpackage;

import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.spinmatch.model.response.ChatRoomResponse;
import com.sportygames.spinmatch.model.response.DetailResponse;
import com.sportygames.spinmatch.model.response.GameAvailableResponse;
import com.sportygames.spinmatch.model.response.MatchPlaceBetResponse;
import com.sportygames.spinmatch.model.response.UserValidateResponse;
import com.sportygames.spinmatch.model.response.WalletInfoResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnbb0;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nbb0 extends j8i0 {
    public Double b;
    public String c;
    public final mbb0 a = mbb0.a;
    public final ssw<LoadingState<HTTPResponse<WalletInfoResponse>>> d = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> e = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<UserValidateResponse>>> f = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<DetailResponse>>> i = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> v = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<MatchPlaceBetResponse>>> w = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> y = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> z = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> A = new ssw<>();

    @c0d(c = "com.sportygames.spinmatch.viewmodel.SpinMatchViewModel$gameAvailableStatus$1", f = "SpinMatchViewModel.kt", l = {75}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return nbb0.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nbb0 nbb0Var = nbb0.this;
            ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar = nbb0Var.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                mbb0 mbb0Var = nbb0Var.a;
                this.a = 1;
                mbb0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new hbb0(1, null), null), this);
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
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(new Integer(-11), null), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.spinmatch.viewmodel.SpinMatchViewModel$getPromotionalGifts$1", f = "SpinMatchViewModel.kt", l = {438}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return nbb0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            nbb0 nbb0Var = nbb0.this;
            ssw<LoadingState<HTTPResponse<PromotionGiftsResponse>>> sswVar = nbb0Var.y;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                mbb0 mbb0Var = nbb0Var.a;
                this.a = 1;
                mbb0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new gbb0(1, null), null), this);
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
                sswVar.j(new LoadingState<>(Status.SUCCESS, ((ResultWrapper.Success) resultWrapper).getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, new ResultWrapper.GenericError(new Integer(-11), null), (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new sbb0(this, null), 3);
    }
}
