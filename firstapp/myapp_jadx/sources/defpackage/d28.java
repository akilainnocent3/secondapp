package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.remote.models.FairnessResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.viewmodel.CoefficientViewModel$getFairness$1", f = "CoefficientViewModel.kt", l = {170}, m = "invokeSuspend", v = 1)
public final class d28 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ m28 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d28(m28 m28Var, String str, boolean z, v1b<? super d28> v1bVar) {
        super(2, v1bVar);
        this.b = m28Var;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d28(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d28) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m28 m28Var = this.b;
        ssw<LoadingState<HTTPResponse<FairnessResponse>>> sswVar = m28Var.d;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sswVar.j(new LoadingState<>(Status.RUNNING, null, null, null, null, 16, null));
            String str = this.c;
            m28Var.v = str;
            rsm rsmVar = m28Var.a;
            this.a = 1;
            obj = rsmVar.o(str, this);
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
            ssw<String> sswVar2 = m28Var.i;
            ResultWrapper.Success success = (ResultWrapper.Success) resultWrapper;
            FairnessResponse fairnessResponse = (FairnessResponse) ((HTTPResponse) success.getValue()).getData();
            sswVar2.m(fairnessResponse != null ? fairnessResponse.getClientSeed() : null);
            ssw<String> sswVar3 = m28Var.B;
            FairnessResponse fairnessResponse2 = (FairnessResponse) ((HTTPResponse) success.getValue()).getData();
            sswVar3.m(fairnessResponse2 != null ? fairnessResponse2.getClientSeed() : null);
            if (this.d) {
                ssw<Integer> sswVar4 = m28Var.z;
                FairnessResponse fairnessResponse3 = (FairnessResponse) ((HTTPResponse) success.getValue()).getData();
                sswVar4.m(fairnessResponse3 != null ? Intrinsics.g(fairnessResponse3.getSeedRandom(), Boolean.TRUE) : false ? new Integer(0) : new Integer(1));
            }
            ssw<String> sswVar5 = m28Var.w;
            FairnessResponse fairnessResponse4 = (FairnessResponse) ((HTTPResponse) success.getValue()).getData();
            sswVar5.m(fairnessResponse4 != null ? fairnessResponse4.getServerSeed() : null);
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
