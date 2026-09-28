package defpackage;

import com.sporty.android.book.domain.entity.PopoverCategory;
import com.sporty.android.book.domain.entity.UIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$fetchPopoverCategories$1", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x220 extends tje0 implements Function2<myh<? super List<? extends PopoverCategory>>, v1b<? super Unit>, Object> {
    public final /* synthetic */ e320 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x220(e320 e320Var, v1b<? super x220> v1bVar) {
        super(2, v1bVar);
        this.a = e320Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new x220(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends PopoverCategory>> myhVar, v1b<? super Unit> v1bVar) {
        return ((x220) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.d;
        UIState.Loading loading = new UIState.Loading(null, 1, null);
        wwd0Var.getClass();
        wwd0Var.k(null, loading);
        return Unit.a;
    }
}
