package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.legends.component.SportyLegendsScreenRootKt$Screen$1$6$40$1", f = "SportyLegendsScreenRoot.kt", l = {324}, m = "invokeSuspend", v = 2)
public final class zic0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ v3a0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function1<b, Unit> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zic0(v3a0 v3a0Var, String str, Function1<? super b, Unit> function1, v1b<? super zic0> v1bVar) {
        super(2, v1bVar);
        this.b = v3a0Var;
        this.c = str;
        this.d = function1;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zic0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zic0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        zic0 zic0Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            zic0Var = this;
            if (v3a0.b(this.b, this.c, null, true, null, zic0Var, 10) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            zic0Var = this;
        }
        zic0Var.d.invoke(b.q.a.a);
        return Unit.a;
    }
}
