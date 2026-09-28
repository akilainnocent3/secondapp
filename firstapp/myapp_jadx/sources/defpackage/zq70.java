package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.ScrollableNode$drag$2$1", f = "Scrollable.kt", l = {340}, m = "invokeSuspend")
public final class zq70 extends tje0 implements Function2<olx, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ g9f.a c;
    public final /* synthetic */ wr70 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq70(g9f.a aVar, wr70 wr70Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = aVar;
        this.d = wr70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        zq70 zq70Var = new zq70(this.c, this.d, v1bVar);
        zq70Var.b = obj;
        return zq70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(olx olxVar, v1b<? super Unit> v1bVar) {
        return ((zq70) create(olxVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final olx olxVar = (olx) this.b;
            final wr70 wr70Var = this.d;
            Function1<? super v7f.b, ? extends Unit> function1 = new Function1() { // from class: yq70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((v7f.b) obj2).a;
                    olxVar.b(1, wr70Var.d == i3z.b ? gly.b(0.0f, 0.0f, 1, j) : gly.b(0.0f, 0.0f, 2, j));
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
