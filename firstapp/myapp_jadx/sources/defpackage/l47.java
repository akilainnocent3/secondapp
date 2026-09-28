package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.user.avatar.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.user.avatar.ChangeAvatarViewModel$updateAvatar$2", f = "ChangeAvatarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l47 extends tje0 implements Function2<lk50<? extends BaseResponse<Void>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l47(e eVar, v1b<? super l47> v1bVar) {
        super(2, v1bVar);
        this.b = eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l47 l47Var = new l47(this.b, v1bVar);
        l47Var.a = obj;
        return l47Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends BaseResponse<Void>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((l47) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        e eVar = this.b;
        if (z) {
            eVar.F.m(new lk50.c(null));
        } else if (lk50Var instanceof lk50.a) {
            eVar.F.m(new lk50.a(((lk50.a) lk50Var).a));
        } else {
            eVar.F.m(lk50.b.a);
        }
        return Unit.a;
    }
}
