package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchMoreReplyComments$3", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class df20 extends tje0 implements gaj<myh<? super bi50<List<? extends CommentsData>>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ of20 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df20(of20 of20Var, v1b<? super df20> v1bVar) {
        super(3, v1bVar);
        this.a = of20Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super bi50<List<? extends CommentsData>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new df20(this.a, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.U.j(null);
        return Unit.a;
    }
}
