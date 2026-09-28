package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$fetchLiveSportList$2", f = "AZMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class e1 extends tje0 implements Function2<BaseResponse<List<? extends Sport>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ c1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var, v1b<? super e1> v1bVar) {
        super(2, v1bVar);
        this.b = c1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        e1 e1Var = new e1(this.b, v1bVar);
        e1Var.a = obj;
        return e1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BaseResponse<List<? extends Sport>> baseResponse, v1b<? super Unit> v1bVar) {
        return ((e1) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseResponse baseResponse = (BaseResponse) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.B.m(new UIState.Success(lfb0.d().f((List) baseResponse.data)));
        return Unit.a;
    }
}
