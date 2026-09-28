package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.pingpong.remote.models.ChatRoomResponse;
import com.sportygames.pingpong.remote.models.DetailResponseData;
import com.sportygames.pingpong.remote.models.RoundResponse;
import com.sportygames.pingpong.remote.models.TopBets;
import com.sportygames.pingpong.remote.models.WalletInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljn1;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class jn1 extends j8i0 {
    public final i610 a = i610.a;
    public final ssw<LoadingState<HTTPResponse<DetailResponseData>>> b;
    public final ssw<LoadingState<HTTPResponse<ChatRoomResponse>>> c;
    public final ssw<LoadingState<HTTPResponse<WalletInfo>>> d;
    public final ssw<LoadingState<HTTPResponse<RoundResponse>>> e;
    public final ssw<LoadingState<HTTPResponse<List<TopBets>>>> f;
    public final ssw<LoadingState<HTTPResponse<List<TopBets>>>> i;
    public final ssw<LoadingState<HTTPResponse<List<TopBets>>>> v;
    public final ssw<WalletInfo> w;
    public final ssw<LoadingState<HTTPResponse<List<GameDetails>>>> y;

    @c0d(c = "com.sportygames.pingpong.viewmodels.AvailableViewModel$getRound$1", f = "AvailableViewModel.kt", l = {HttpStatusCodesKt.HTTP_EARLY_HINTS}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jn1.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jn1 jn1Var = jn1.this;
            ssw<LoadingState<HTTPResponse<RoundResponse>>> sswVar = jn1Var.e;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                i610 i610Var = jn1Var.a;
                this.a = 1;
                i610Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new b610(1, null), null), this);
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

    @c0d(c = "com.sportygames.pingpong.viewmodels.AvailableViewModel$walletInfo$1", f = "AvailableViewModel.kt", l = {411}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return jn1.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jn1 jn1Var = jn1.this;
            ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar = jn1Var.d;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                i610 i610Var = jn1Var.a;
                this.a = 1;
                i610Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new h610(1, null), null), this);
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
                jn1Var.w.m((WalletInfo) ((HTTPResponse) success.getValue()).getData());
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

    public jn1() {
        new ssw();
        new ssw();
        this.b = new ssw<>();
        this.c = new ssw<>();
        this.d = new ssw<>();
        this.e = new ssw<>();
        this.f = new ssw<>();
        this.i = new ssw<>();
        new ssw();
        new ssw();
        this.v = new ssw<>();
        this.w = new ssw<>();
        this.y = new ssw<>();
        new ssw();
    }

    public final void x1() {
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
    }
}
