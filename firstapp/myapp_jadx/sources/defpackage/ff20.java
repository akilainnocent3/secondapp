package defpackage;

import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.RecommendCodeResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.PreMatchEventViewModel$fetchRecommendCodeComment$1", f = "PreMatchEventViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ff20 extends tje0 implements Function2<RecommendCodeResponse, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ of20 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ff20(of20 of20Var, v1b<? super ff20> v1bVar) {
        super(2, v1bVar);
        this.b = of20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ff20 ff20Var = new ff20(this.b, v1bVar);
        ff20Var.a = obj;
        return ff20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(RecommendCodeResponse recommendCodeResponse, v1b<? super Unit> v1bVar) {
        return ((ff20) create(recommendCodeResponse, v1bVar)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff20.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
