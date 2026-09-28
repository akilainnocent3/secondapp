package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DefaultDraggableState$drag$2", f = "Draggable.kt", l = {643}, m = "invokeSuspend")
public final class wbd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ xbd b;
    public final /* synthetic */ icf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbd(xbd xbdVar, icf icfVar, v1b v1bVar) {
        super(2, v1bVar);
        huw huwVar = huw.a;
        this.b = xbdVar;
        this.c = icfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        huw huwVar = huw.a;
        return new wbd(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((wbd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            xbd xbdVar = this.b;
            puw puwVar = xbdVar.c;
            xbd.a aVar = xbdVar.b;
            huw huwVar = huw.b;
            this.a = 1;
            puwVar.getClass();
            if (w5b.d(new ouw(huwVar, puwVar, this.c, aVar, null), this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
