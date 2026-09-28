package defpackage;

import com.sporty.android.book.domain.entity.PopoverCategory;
import com.sporty.android.book.domain.entity.UIState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$fetchPopoverCategories$2", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y220 extends tje0 implements Function2<List<? extends PopoverCategory>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e320 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y220(e320 e320Var, v1b<? super y220> v1bVar) {
        super(2, v1bVar);
        this.b = e320Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y220 y220Var = new y220(this.b, v1bVar);
        y220Var.a = obj;
        return y220Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends PopoverCategory> list, v1b<? super Unit> v1bVar) {
        return ((y220) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.d;
        UIState.Success success = new UIState.Success(list);
        wwd0Var.getClass();
        wwd0Var.k(null, success);
        return Unit.a;
    }
}
