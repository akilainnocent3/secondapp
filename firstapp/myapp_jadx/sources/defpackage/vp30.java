package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$RCPointerView$2$1", f = "RCPointerView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class vp30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ ytw<Boolean> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp30(ytw<Boolean> ytwVar, v1b<? super vp30> v1bVar) {
        super(2, v1bVar);
        this.a = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vp30(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vp30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.a.setValue(Boolean.TRUE);
        return Unit.a;
    }
}
