package defpackage;

import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.anTesting.presentation.viewmodel.ANTestingViewModel$sendConvertData$1", f = "ANTestingViewModel.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 1)
public final class e0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g0 b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, Integer num, String str, Integer num2, String str2, v1b v1bVar) {
        super(2, v1bVar);
        this.b = g0Var;
        this.c = num;
        this.d = str;
        this.e = num2;
        this.f = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e0(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB;
        y5b y5bVar = y5b.a;
        int i = this.a;
        g0 g0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            fc80 fc80Var = g0Var.c;
            Double dValueOf = Double.valueOf(1.0d);
            this.a = 1;
            objB = fc80Var.a.b(this.c, this.d, this.e, this.f, "betClicked", dValueOf, this);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB = obj;
        }
        ResultWrapper resultWrapper = (ResultWrapper) objB;
        if (resultWrapper instanceof ResultWrapper.Success) {
            g0Var.f.j(new LoadingState<>(Status.SUCCESS, null, null, null, null, 16, null));
        } else if (resultWrapper instanceof ResultWrapper.NetworkError) {
            g0Var.f.j(new LoadingState<>(Status.FAILED, null, null, (ResultWrapper.NetworkError) resultWrapper, null, 16, null));
        } else {
            if (!(resultWrapper instanceof ResultWrapper.GenericError)) {
                uhc.a();
                return null;
            }
            g0Var.f.j(new LoadingState<>(Status.FAILED, null, (ResultWrapper.GenericError) resultWrapper, null, null, 16, null));
        }
        return Unit.a;
    }
}
