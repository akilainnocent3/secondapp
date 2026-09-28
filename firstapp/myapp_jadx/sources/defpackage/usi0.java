package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.wheelanddeal.ui.WDNumberPanelKt$WDNumberPanel$7$1", f = "WDNumberPanel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class usi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Function0<Unit> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public usi0(boolean z, Function0<Unit> function0, v1b<? super usi0> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new usi0(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((usi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!this.a) {
            this.b.invoke();
        }
        return Unit.a;
    }
}
