package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
public final class rwr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ owr b;
    public final /* synthetic */ goh<Float> c;
    public final /* synthetic */ v6l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rwr(owr owrVar, goh<Float> gohVar, v6l v6lVar, v1b<? super rwr> v1bVar) {
        super(2, v1bVar);
        this.b = owrVar;
        this.c = gohVar;
        this.d = v6lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rwr(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rwr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final owr owrVar = this.b;
        ytw ytwVar = owrVar.j;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = owrVar.p;
                Float f = new Float(0.0f);
                goh<Float> gohVar = this.c;
                final v6l v6lVar = this.d;
                Function1 function1 = new Function1() { // from class: qwr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        v6lVar.g(((Number) ((wd0) obj2).d()).floatValue());
                        owrVar.c.invoke();
                        return Unit.a;
                    }
                };
                this.a = 1;
                if (wd0.a(wd0Var, f, gohVar, null, function1, this, 4) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            ((x5a0) owrVar.k).setValue(Boolean.TRUE);
            ((x5a0) ytwVar).setValue(Boolean.FALSE);
            return Unit.a;
        } catch (Throwable th) {
            ((x5a0) ytwVar).setValue(Boolean.FALSE);
            throw th;
        }
    }
}
