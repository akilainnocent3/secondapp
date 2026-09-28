package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchMoreReplyComments$2", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cf20 extends tje0 implements Function2<bi50<List<? extends CommentsData>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ of20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf20(of20 of20Var, v1b<? super cf20> v1bVar) {
        super(2, v1bVar);
        this.b = of20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cf20 cf20Var = new cf20(this.b, v1bVar);
        cf20Var.a = obj;
        return cf20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bi50<List<? extends CommentsData>> bi50Var, v1b<? super Unit> v1bVar) {
        return ((cf20) create(bi50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        bi50<List<CommentsData>> bi50Var = (bi50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.U.j(bi50Var);
        return Unit.a;
    }
}
