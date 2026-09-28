package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.RCPointerViewKt$RCPointerView$4$1", f = "RCPointerView.kt", l = {}, m = "invokeSuspend", v = 1)
public final class xp30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ rp30.a a;
    public final /* synthetic */ isw b;
    public final /* synthetic */ ytw<Float> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xp30(rp30.a aVar, isw iswVar, ytw<Float> ytwVar, v1b<? super xp30> v1bVar) {
        super(2, v1bVar);
        this.a = aVar;
        this.b = iswVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xp30(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xp30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        rp30.c cVar = rp30.c.a;
        rp30.a aVar = this.a;
        Float f = null;
        if (!Intrinsics.g(aVar, cVar)) {
            if (!(aVar instanceof rp30.b)) {
                uhc.a();
                return null;
            }
            isw iswVar = this.b;
            f = new Float(iswVar.j() + (360.0f - (iswVar.j() > 360.0f ? iswVar.j() % 360.0f : iswVar.j())) + 360.0f + ((rp30.b) aVar).a);
        }
        this.c.setValue(f);
        return Unit.a;
    }
}
