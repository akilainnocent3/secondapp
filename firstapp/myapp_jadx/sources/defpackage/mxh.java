package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$1$1", f = "FloatingActionButton.kt", l = {641}, m = "invokeSuspend")
public final class mxh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sxh b;
    public final /* synthetic */ pxh c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mxh(sxh sxhVar, pxh pxhVar, v1b<? super mxh> v1bVar) {
        super(2, v1bVar);
        this.b = sxhVar;
        this.c = pxhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mxh(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mxh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            pxh pxhVar = this.c;
            float f = pxhVar.a;
            float f2 = pxhVar.b;
            float f3 = pxhVar.d;
            float f4 = pxhVar.c;
            this.a = 1;
            sxh sxhVar = this.b;
            sxhVar.a = f;
            sxhVar.b = f2;
            sxhVar.c = f3;
            sxhVar.d = f4;
            Object objB = sxhVar.b(this);
            if (objB != y5bVar) {
                objB = Unit.a;
            }
            if (objB == y5bVar) {
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
