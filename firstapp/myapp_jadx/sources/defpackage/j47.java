package defpackage;

import com.sportybet.android.user.avatar.e;
import com.sportybet.android.user.avatar.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$getUserFrame$3", f = "ChangeAvatarViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class j47 extends tje0 implements Function2<f, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j47(e eVar, v1b<? super j47> v1bVar) {
        super(2, v1bVar);
        this.c = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j47 j47Var = new j47(this.c, v1bVar);
        j47Var.b = obj;
        return j47Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(f fVar, v1b<? super Unit> v1bVar) {
        return ((j47) create(fVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        f fVar = (f) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.c.y;
            this.b = null;
            this.a = 1;
            wwd0Var.setValue(fVar);
            if (Unit.a == y5bVar) {
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
