package defpackage;

import com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsVideoDetailFragment$collectData$3", f = "SportyNewsVideoDetailFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class juc0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ SportyNewsVideoDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public juc0(SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment, v1b<? super juc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsVideoDetailFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        juc0 juc0Var = new juc0(this.b, v1bVar);
        juc0Var.a = ((Boolean) obj).booleanValue();
        return juc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((juc0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        SportyNewsVideoDetailFragment sportyNewsVideoDetailFragment = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = SportyNewsVideoDetailFragment.X;
            sportyNewsVideoDetailFragment.n0().y.a.setVisibility(0);
        } else {
            ohp<Object>[] ohpVarArr2 = SportyNewsVideoDetailFragment.X;
            sportyNewsVideoDetailFragment.n0().y.a.setVisibility(8);
        }
        return Unit.a;
    }
}
