package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.data.TagItem;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsListFragment$collectData$5", f = "SportyNewsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nsc0 extends tje0 implements Function2<TagItem, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsc0(SportyNewsListFragment sportyNewsListFragment, v1b<? super nsc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsListFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nsc0 nsc0Var = new nsc0(this.b, v1bVar);
        nsc0Var.a = obj;
        return nsc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TagItem tagItem, v1b<? super Unit> v1bVar) {
        return ((nsc0) create(tagItem, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        TagItem tagItem = (TagItem) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (tagItem != null) {
            SportyNewsListFragment sportyNewsListFragment = this.b;
            sportyNewsListFragment.B = tagItem;
            alv alvVar = (alv) sportyNewsListFragment.v.getValue();
            alvVar.f.a(String.valueOf(tagItem.getName()));
            leb0 leb0VarO0 = sportyNewsListFragment.o0();
            TabLayout tabLayout = leb0VarO0.c;
            tabLayout.s(tabLayout.k(-1), true);
            tabLayout.setSelectedTabIndicatorHeight(0);
            leb0VarO0.b.setExpanded(true, true);
            sportyNewsListFragment.m0();
            sportyNewsListFragment.q0().y1(tagItem.getId(), "");
        }
        return Unit.a;
    }
}
