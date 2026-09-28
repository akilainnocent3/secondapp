package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.sportyherov2.remote.models.BiggestResponse;
import com.sportygames.sportyherov2.remote.models.FairnessResponse;
import com.sportygames.sportyherov2.remote.models.PreviousMultiplierResponse;
import com.sportygames.sportyherov2.remote.models.TopWinResponse;
import com.sportygames.sportyherov2.remote.models.TopWinResponseV2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc28;", "Lj8i0;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c28 extends j8i0 {
    public final g5c0 a = g5c0.a;
    public final ssw<LoadingState<HTTPResponse<PreviousMultiplierResponse>>> b = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<TopWinResponse>>>> c = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<TopWinResponseV2>>>> d = new ssw<>();
    public ssw<LoadingState<HTTPResponse<TopWinResponse>>> e = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<List<BiggestResponse>>>> f = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<FairnessResponse>>> i = new ssw<>();
    public final ssw<LoadingState<HTTPResponse<String>>> v = new ssw<>();

    @c0d(c = "com.sportygames.sportyherov2.viewmodels.CoefficientViewModel$getFairness$1", f = "CoefficientViewModel.kt", l = {243}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c28.this.new a(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            c28 c28Var = c28.this;
            ssw<LoadingState<HTTPResponse<FairnessResponse>>> sswVar = c28Var.i;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
                g5c0 g5c0Var = c28Var.a;
                this.a = 1;
                g5c0Var.getClass();
                pfd pfdVar = fse.a;
                obj = ej5.d(odd.b, new a52(new d4c0(this.c, null), null), this);
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

    public final void x1(String str) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new a28(this, str, null), 3);
    }

    public final void y1(String str) {
        str.getClass();
        ej5.c(o8i0.d(this), null, null, new a(str, null), 3);
    }

    public final void z1(String str, String str2) {
        str.getClass();
        str2.getClass();
        ej5.c(o8i0.d(this), null, null, new g28(this, str, str2, null), 3);
    }
}
