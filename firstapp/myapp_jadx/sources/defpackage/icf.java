package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {303}, m = "invokeSuspend")
public final class icf extends tje0 implements Function2<l9f, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g9f.a c;
    public final /* synthetic */ jcf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public icf(g9f.a aVar, jcf jcfVar, v1b v1bVar) {
        super(2, v1bVar);
        this.c = aVar;
        this.d = jcfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        icf icfVar = new icf(this.c, this.d, v1bVar);
        icfVar.b = obj;
        return icfVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(l9f l9fVar, v1b<? super Unit> v1bVar) {
        return ((icf) create(l9fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final l9f l9fVar = (l9f) this.b;
            final jcf jcfVar = this.d;
            Function1<? super v7f.b, ? extends Unit> function1 = new Function1() { // from class: hcf
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((v7f.b) obj2).a;
                    jcf jcfVar2 = jcfVar;
                    long jG = gly.g(jcfVar2.T ? -1.0f : 1.0f, j);
                    i3z i3zVar = jcfVar2.P;
                    y9f.a aVar = y9f.a;
                    l9fVar.a(Float.intBitsToFloat((int) (i3zVar == i3z.a ? jG & 4294967295L : jG >> 32)));
                    return Unit.a;
                }
            };
            this.a = 1;
            if (this.c.invoke(function1, this) == y5bVar) {
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
