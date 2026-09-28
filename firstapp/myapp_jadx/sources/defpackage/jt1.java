package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crazyrider.components.BackgroundViewKt$GameScreenBackground$2$1", f = "BackgroundView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class jt1 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ inj a;
    public final /* synthetic */ ytw<Boolean> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt1(inj injVar, ytw<Boolean> ytwVar, v1b<? super jt1> v1bVar) {
        super(2, v1bVar);
        this.a = injVar;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jt1(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jt1) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        inj injVar = inj.c;
        inj injVar2 = this.a;
        this.b.setValue(Boolean.valueOf(injVar2 == injVar || injVar2 == inj.d || injVar2 == inj.e));
        return Unit.a;
    }
}
