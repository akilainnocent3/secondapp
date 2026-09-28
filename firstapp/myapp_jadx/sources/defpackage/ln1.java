package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.ChatRoomResponse;
import com.sportygames.crash.remote.models.DetailResponseData;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.crash.remote.models.WalletInfo;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final class ln1 extends j8i0 {
    public final rsm a;
    public final ssw<LoadingState<HTTPResponse<DetailResponseData>>> b;
    public final ssw<LoadingState<HTTPResponse<DetailResponseData>>> c;
    public final ssw<LoadingState<HTTPResponse<ChatRoomResponse>>> d;
    public final ssw<LoadingState<HTTPResponse<WalletInfo>>> e;
    public final ssw<LoadingState<HTTPResponse<RoundResponse>>> f;
    public final ssw<LoadingState<HTTPResponse<List<TopBets>>>> i;
    public final ssw<WalletInfo> v;
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> w;

    @c0d(c = "com.sportygames.crash.viewmodel.AvailableViewModel$getRound$1", f = "AvailableViewModel.kt", l = {57}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ln1.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ln1 ln1Var = ln1.this;
            ssw<LoadingState<HTTPResponse<RoundResponse>>> sswVar = ln1Var.f;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                rsm rsmVar = ln1Var.a;
                this.a = 1;
                obj = rsmVar.e(this);
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
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.crash.viewmodel.AvailableViewModel$walletInfo$1", f = "AvailableViewModel.kt", l = {255}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ln1.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ln1 ln1Var = ln1.this;
            ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar = ln1Var.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                rsm rsmVar = ln1Var.a;
                this.a = 1;
                obj = rsmVar.m(this);
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
                ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
                ln1Var.v.m((WalletInfo) ((HTTPResponse) success.getValue()).getData());
                sswVar.j(new LoadingState<>(Status.SUCCESS, success.getValue(), null, null, null, 16, null));
            } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
                sswVar.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
            } else {
                Status status = Status.FAILED;
                resultWrapper.getClass();
                sswVar.j(new LoadingState<>(status, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
            }
            return Unit.a;
        }
    }

    public ln1(rsm rsmVar) {
        rsmVar.getClass();
        this.a = rsmVar;
        this.b = new ssw<>();
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        this.f = new ssw<>();
        new ssw();
        this.i = new ssw<>();
        new ssw();
        new ssw();
        new ssw();
        this.v = new ssw<>();
        this.w = new ssw<>();
        new ssw();
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new mm1(this, null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void z1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }
}
