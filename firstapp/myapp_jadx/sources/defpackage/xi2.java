package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.presentation.betbuilder.BetBuilderViewKt$BetBuilderView$1$1", f = "BetBuilderView.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xi2 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ fj2 a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi2(fj2 fj2Var, ArrayList arrayList, v1b v1bVar) {
        super(2, v1bVar);
        this.a = fj2Var;
        this.b = arrayList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xi2(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xi2) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.x1(null, this.b);
        return Unit.a;
    }
}
