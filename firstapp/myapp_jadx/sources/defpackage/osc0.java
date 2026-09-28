package defpackage;

import com.sporty.android.sportynews.data.SubArticleList;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsListFragment$collectData$6", f = "SportyNewsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class osc0 extends tje0 implements Function2<jce0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ SportyNewsListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osc0(SportyNewsListFragment sportyNewsListFragment, v1b<? super osc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsListFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        osc0 osc0Var = new osc0(this.b, v1bVar);
        osc0Var.a = obj;
        return osc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(jce0 jce0Var, v1b<? super Unit> v1bVar) {
        return ((osc0) create(jce0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        jce0 jce0Var = (jce0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = jce0Var instanceof jce0.a;
        SportyNewsListFragment sportyNewsListFragment = this.b;
        if (z) {
            ohp<Object>[] ohpVarArr = SportyNewsListFragment.R;
            sportyNewsListFragment.s0("", false, false);
            if (!sportyNewsListFragment.J) {
                SubArticleList subArticleList = ((jce0.a) jce0Var).a;
                String nextCursor = subArticleList.getNextCursor();
                sportyNewsListFragment.C = nextCursor != null ? nextCursor : "";
                sportyNewsListFragment.o0();
                sportyNewsListFragment.p0().k();
                a380 a380Var = sportyNewsListFragment.z;
                a380Var.r();
                sportyNewsListFragment.t0(subArticleList);
                sportyNewsListFragment.p0().i(a380Var);
            }
            sportyNewsListFragment.F = false;
        } else if (jce0Var instanceof jce0.b) {
            String strD = sn5.d(sportyNewsListFragment, R.string.sporty_news__no_articles_found, new Object[0]);
            ohp<Object>[] ohpVarArr2 = SportyNewsListFragment.R;
            sportyNewsListFragment.s0(strD, true, false);
            sportyNewsListFragment.F = false;
        } else if (jce0Var instanceof jce0.c) {
            String strD2 = sn5.d(sportyNewsListFragment, R.string.sporty_news__page_not_found, new Object[0]);
            ohp<Object>[] ohpVarArr3 = SportyNewsListFragment.R;
            sportyNewsListFragment.s0(strD2, true, false);
            sportyNewsListFragment.F = false;
        }
        return Unit.a;
    }
}
