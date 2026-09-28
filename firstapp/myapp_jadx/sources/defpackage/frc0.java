package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sporty.android.sportynews.ui.SportyMediaHostFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.ui.SportyMediaHostFragment$collectData$1$1", f = "SportyMediaHostFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class frc0 extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
    public /* synthetic */ boolean a;
    public final /* synthetic */ xxi b;
    public final /* synthetic */ SportyMediaHostFragment c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frc0(v1b v1bVar, xxi xxiVar, SportyMediaHostFragment sportyMediaHostFragment) {
        super(2, v1bVar);
        this.b = xxiVar;
        this.c = sportyMediaHostFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        frc0 frc0Var = new frc0(v1bVar, this.b, this.c);
        frc0Var.a = ((Boolean) obj).booleanValue();
        return frc0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((frc0) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        xxi xxiVar = this.b;
        int i = 8;
        xxiVar.b.a.setVisibility(!z ? 0 : 8);
        TabLayout tabLayout = xxiVar.c;
        if (!z && this.c.q0()) {
            i = 0;
        }
        tabLayout.setVisibility(i);
        return Unit.a;
    }
}
