package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.internal.AnchoredDraggableKt$animateTo$2", f = "AnchoredDraggable.kt", l = {682}, m = "invokeSuspend")
public final class d10 extends tje0 implements iaj<s00, m9f<Object>, Object, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ s00 b;
    public /* synthetic */ m9f c;
    public /* synthetic */ Object d;
    public final /* synthetic */ c20<Object> e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d10(c20<Object> c20Var, float f, v1b<? super d10> v1bVar) {
        super(4, v1bVar);
        this.e = c20Var;
        this.f = f;
    }

    @Override // defpackage.iaj
    public final Object d(s00 s00Var, m9f<Object> m9fVar, Object obj, v1b<? super Unit> v1bVar) {
        d10 d10Var = new d10(this.e, this.f, v1bVar);
        d10Var.b = s00Var;
        d10Var.c = m9fVar;
        d10Var.d = obj;
        return d10Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final s00 s00Var = this.b;
            float fD = this.c.d(this.d);
            if (!Float.isNaN(fD)) {
                final aq40 aq40Var = new aq40();
                c20<Object> c20Var = this.e;
                float fJ = Float.isNaN(((t5a0) c20Var.j).j()) ? 0.0f : ((t5a0) c20Var.j).j();
                aq40Var.a = fJ;
                goh gohVar = c20Var.c.a.d;
                Function2 function2 = new Function2() { // from class: c10
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        float fFloatValue = ((Float) obj2).floatValue();
                        s00Var.a(fFloatValue, ((Float) obj3).floatValue());
                        aq40Var.a = fFloatValue;
                        return Unit.a;
                    }
                };
                this.b = null;
                this.c = null;
                this.a = 1;
                if (sje0.a(fJ, fD, this.f, gohVar, function2, this) == y5bVar) {
                    return y5bVar;
                }
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
