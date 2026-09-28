package defpackage;

import com.sportybet.android.user.avatar.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$getAvatars$3", f = "ChangeAvatarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i47 extends tje0 implements Function2<lk50<? extends bp1>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i47(e eVar, v1b<? super i47> v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        i47 i47Var = new i47(this.b, v1bVar);
        i47Var.a = obj;
        return i47Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends bp1> lk50Var, v1b<? super Unit> v1bVar) {
        return ((i47) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<bp1> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.H.m(lk50Var);
        return Unit.a;
    }
}
