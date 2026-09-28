package defpackage;

import com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsArticleDetailFragment$collectData$3", f = "SportyNewsArticleDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wrc0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ SportyNewsArticleDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wrc0(SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment, v1b<? super wrc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsArticleDetailFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wrc0 wrc0Var = new wrc0(this.b, v1bVar);
        wrc0Var.a = ((Boolean) obj).booleanValue();
        return wrc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((wrc0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SportyNewsArticleDetailFragment sportyNewsArticleDetailFragment = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = SportyNewsArticleDetailFragment.N;
            sportyNewsArticleDetailFragment.m0().z.a.setVisibility(0);
        } else {
            ohp<Object>[] ohpVarArr2 = SportyNewsArticleDetailFragment.N;
            sportyNewsArticleDetailFragment.m0().z.a.setVisibility(8);
        }
        return Unit.a;
    }
}
