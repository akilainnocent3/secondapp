package defpackage;

import android.content.Context;
import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment$renderUi$1$1", f = "SportyNewsArticleDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xrc0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ SportyNewsArticleDetailFragment a;
    public final /* synthetic */ nan b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrc0(SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment, nan nanVar, v1b<? super xrc0> v1bVar) {
        super(2, v1bVar);
        this.a = sportyNewsArticleDetailFragment;
        this.b = nanVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xrc0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xrc0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Context contextRequireContext = this.a.requireContext();
        contextRequireContext.getClass();
        qw90.a(contextRequireContext).a(this.b);
        return Unit.a;
    }
}
