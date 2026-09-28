package defpackage;

import com.sporty.android.book.domain.entity.PopoverCategory;
import com.sporty.android.book.domain.entity.UIState;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$fetchPopoverCategories$3", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class z220 extends tje0 implements gaj<myh<? super List<? extends PopoverCategory>>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ e320 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z220(e320 e320Var, v1b<? super z220> v1bVar) {
        super(3, v1bVar);
        this.b = e320Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends PopoverCategory>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        z220 z220Var = new z220(this.b, v1bVar);
        z220Var.a = th;
        return z220Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        UIState.Error error = new UIState.Error(th, null, 2, null);
        wwd0Var.getClass();
        wwd0Var.k(null, error);
        return Unit.a;
    }
}
