package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.component.draggable.DraggableLazyItemScopeImpl$draggableHandle$1$4$1", f = "DraggableLazyItemScope.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class maf extends tje0 implements gaj<v5b, Float, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ v5b b;
    public /* synthetic */ float c;
    public final /* synthetic */ naf d;
    public final /* synthetic */ gaf e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public maf(naf nafVar, gaf gafVar, v1b v1bVar) {
        super(3, v1bVar);
        this.d = nafVar;
        this.e = gafVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(v5b v5bVar, Float f, v1b<? super Unit> v1bVar) {
        float fFloatValue = f.floatValue();
        maf mafVar = new maf(this.d, this.e, v1bVar);
        mafVar.b = v5bVar;
        mafVar.c = fFloatValue;
        return mafVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = this.b;
        float f = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            abf abfVar = this.d.a;
            zyr zyrVarA = abfVar.a();
            ytw ytwVar = abfVar.e;
            if ((zyrVarA != null ? Integer.valueOf(zyrVarA.getIndex()) : null) != null) {
                ((x5a0) abfVar.n).setValue(((x5a0) ytwVar).getValue());
                ej5.c(abfVar.b, null, null, new yaf(abfVar, abfVar.b(), null), 3);
            }
            ((t5a0) abfVar.g).A(0.0f);
            ((x5a0) ytwVar).setValue(null);
            ((u5a0) abfVar.h).k(0);
            k230 k230Var = abfVar.m;
            jvd0 jvd0Var = k230Var.f;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            k230Var.e = null;
            abfVar.i = null;
            abfVar.j = null;
            Float f2 = new Float(f);
            this.b = null;
            this.c = f;
            this.a = 1;
            if (this.e.invoke(v5bVar, f2, this) == y5bVar) {
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
