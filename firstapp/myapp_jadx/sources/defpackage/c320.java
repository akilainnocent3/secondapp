package defpackage;

import com.sporty.android.book.domain.entity.PopoverCategory;
import com.sporty.android.book.domain.entity.UIState;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.popovers.PopoversViewModel$togglePopoverCategory$1", f = "PopoversViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c320 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ e320 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c320(e320 e320Var, String str, boolean z, v1b<? super c320> v1bVar) {
        super(2, v1bVar);
        this.a = e320Var;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c320(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((c320) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.a.d;
        Object data = ((UIState) wwd0Var.getValue()).getData();
        data.getClass();
        Iterable<PopoverCategory> iterable = (Iterable) data;
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        for (PopoverCategory popoverCategoryCopy$default : iterable) {
            if (Intrinsics.g(popoverCategoryCopy$default.getKey(), this.b)) {
                popoverCategoryCopy$default = PopoverCategory.copy$default(popoverCategoryCopy$default, null, null, this.c, 3, null);
            }
            arrayList.add(popoverCategoryCopy$default);
        }
        UIState.Success success = new UIState.Success(arrayList);
        wwd0Var.getClass();
        wwd0Var.k(null, success);
        return Unit.a;
    }
}
