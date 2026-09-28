package defpackage;

import com.sporty.android.book.domain.entity.UIState;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Sport;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.common.AZMenuViewModel$fetchLiveSportList$1", f = "AZMenuViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class d1 extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Sport>>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ c1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c1 c1Var, v1b<? super d1> v1bVar) {
        super(2, v1bVar);
        this.a = c1Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d1(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super BaseResponse<List<? extends Sport>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((d1) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.B.m(new UIState.Loading(null, 1, null));
        return Unit.a;
    }
}
