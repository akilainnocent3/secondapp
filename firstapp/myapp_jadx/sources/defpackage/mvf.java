package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameViewModel$checkEditPermission$2", f = "EditUsernameViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
public final class mvf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lvf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvf(v1b v1bVar, lvf lvfVar) {
        super(2, v1bVar);
        this.b = lvfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mvf(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mvf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object value;
        kvf kvfVarA;
        y5b y5bVar = y5b.a;
        int i = this.a;
        lvf lvfVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            ogk ogkVar = lvfVar.i;
            this.a = 1;
            objA = ogkVar.a(this);
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objA = ((zi50) obj).a;
        }
        zi50.a aVar = zi50.b;
        if (!(objA instanceof zi50.b)) {
            mqh0 mqh0Var = (mqh0) objA;
            wwd0 wwd0Var = lvfVar.a;
            do {
                value = wwd0Var.getValue();
                kvf kvfVar = (kvf) value;
                if (Intrinsics.g(mqh0Var, mqh0.b.a)) {
                    kvfVarA = kvf.a(kvfVar, null, false, false, null, null, lqh0.c, 0, 191);
                } else if (Intrinsics.g(mqh0Var, mqh0.a.a)) {
                    kvfVarA = kvf.a(kvfVar, null, false, false, null, null, lqh0.b, 0, 191);
                } else {
                    if (!(mqh0Var instanceof mqh0.c)) {
                        uhc.a();
                        return null;
                    }
                    kvfVarA = kvf.a(kvfVar, null, false, false, null, null, lqh0.d, ((mqh0.c) mqh0Var).a, 63);
                }
            } while (!wwd0Var.g(value, kvfVarA));
        }
        if (zi50.a(objA) != null) {
            lvfVar.x1(jvf.b.a);
        }
        return Unit.a;
    }
}
