package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.sportynews.ui.SportyNewsListFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyNewsListFragment$collectData$3", f = "SportyNewsListFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class lsc0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ SportyNewsListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lsc0(SportyNewsListFragment sportyNewsListFragment, v1b<? super lsc0> v1bVar) {
        super(2, v1bVar);
        this.b = sportyNewsListFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lsc0 lsc0Var = new lsc0(this.b, v1bVar);
        lsc0Var.a = ((Boolean) obj).booleanValue();
        return lsc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((lsc0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ConstraintLayout constraintLayout = this.b.I;
        if (z) {
            if (constraintLayout == null) {
                Intrinsics.n("newsListLoading");
                throw null;
            }
            constraintLayout.setVisibility(0);
        } else {
            if (constraintLayout == null) {
                Intrinsics.n("newsListLoading");
                throw null;
            }
            constraintLayout.setVisibility(8);
        }
        return Unit.a;
    }
}
