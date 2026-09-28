package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsListFragment$collectData$4", f = "SportyNewsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class msc0 extends tje0 implements Function2<Integer, v1b<? super Unit>, Object> {
    public /* synthetic */ int a;
    public final /* synthetic */ SportyNewsListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public msc0(SportyNewsListFragment sportyNewsListFragment, v1b<? super msc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsListFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        msc0 msc0Var = new msc0(this.b, v1bVar);
        msc0Var.a = ((Number) obj).intValue();
        return msc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, v1b<? super Unit> v1bVar) {
        return ((msc0) create(Integer.valueOf(num.intValue()), v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
        SportyNewsListFragment sportyNewsListFragment = this.b;
        TabLayout tabLayout = sportyNewsListFragment.o0().c;
        tabLayout.postDelayed(new bd4(tabLayout, sportyNewsListFragment, i), 100L);
        return Unit.a;
    }
}
