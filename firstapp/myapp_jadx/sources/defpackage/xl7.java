package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.component.chip.chipselector.ChipsSelectorKt$ChipsSelector$1$1", f = "ChipsSelector.kt", l = {}, m = "invokeSuspend", v = 1)
public final class xl7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ cm7 a;
    public final /* synthetic */ bm7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl7(cm7 cm7Var, bm7 bm7Var, v1b<? super xl7> v1bVar) {
        super(2, v1bVar);
        this.a = cm7Var;
        this.b = bm7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xl7(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xl7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bm7 bm7Var = this.b;
        bm7Var.getClass();
        wwd0 wwd0Var = this.a.b;
        wwd0Var.getClass();
        wwd0Var.k(null, bm7Var);
        return Unit.a;
    }
}
