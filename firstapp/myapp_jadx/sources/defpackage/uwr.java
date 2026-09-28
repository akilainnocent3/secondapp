package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {106}, m = "invokeSuspend")
public final class uwr extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ owr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwr(owr owrVar, v1b<? super uwr> v1bVar) {
        super(2, v1bVar);
        this.b = owrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uwr(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uwr) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        owr owrVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            wd0<iwo, jj0> wd0Var = owrVar.o;
            iwo iwoVar = new iwo(0L);
            this.a = 1;
            if (wd0Var.f(this, iwoVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        owrVar.d(0L);
        ((x5a0) owrVar.h).setValue(Boolean.FALSE);
        return Unit.a;
    }
}
