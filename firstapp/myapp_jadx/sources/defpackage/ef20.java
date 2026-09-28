package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchMoreReplyComments$4", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ef20 extends tje0 implements gaj<myh<? super bi50<List<? extends CommentsData>>>, Throwable, v1b<? super Unit>, Object> {
    public final /* synthetic */ of20 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef20(of20 of20Var, int i, v1b<? super ef20> v1bVar) {
        super(3, v1bVar);
        this.a = of20Var;
        this.b = i;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super bi50<List<? extends CommentsData>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new ef20(this.a, this.b, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.p0.remove(new Integer(this.b));
        return Unit.a;
    }
}
