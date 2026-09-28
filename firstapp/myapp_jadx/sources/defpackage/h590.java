package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.SheetState$animateTo$2", f = "SheetDefaults.kt", l = {245}, m = "invokeSuspend")
public final class h590 extends tje0 implements iaj<s00, m9f<k590>, k590, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ s00 b;
    public /* synthetic */ m9f c;
    public /* synthetic */ k590 d;
    public final /* synthetic */ j590 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ goh<Float> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h590(j590 j590Var, float f, goh<Float> gohVar, v1b<? super h590> v1bVar) {
        super(4, v1bVar);
        this.e = j590Var;
        this.f = f;
        this.i = gohVar;
    }

    @Override // defpackage.iaj
    public final Object d(s00 s00Var, m9f<k590> m9fVar, k590 k590Var, v1b<? super Unit> v1bVar) {
        float f = this.f;
        goh<Float> gohVar = this.i;
        h590 h590Var = new h590(this.e, f, gohVar, v1bVar);
        h590Var.b = s00Var;
        h590Var.c = m9fVar;
        h590Var.d = k590Var;
        return h590Var.invokeSuspend(Unit.a);
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
                j590 j590Var = this.e;
                float fJ = Float.isNaN(((t5a0) j590Var.e.j).j()) ? 0.0f : ((t5a0) j590Var.e.j).j();
                aq40Var.a = fJ;
                Function2 function2 = new Function2() { // from class: g590
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
                if (sje0.a(fJ, fD, this.f, this.i, function2, this) == y5bVar) {
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
