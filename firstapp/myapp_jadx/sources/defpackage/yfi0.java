package defpackage;

import com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.activity.VirtualLobbyActivity$ensureLoginForBuildAndGo$1", f = "VirtualLobbyActivity.kt", l = {242}, m = "invokeSuspend", v = 2)
public final class yfi0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ VirtualLobbyActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfi0(VirtualLobbyActivity virtualLobbyActivity, v1b<? super yfi0> v1bVar) {
        super(2, v1bVar);
        this.b = virtualLobbyActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yfi0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((yfi0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        VirtualLobbyActivity virtualLobbyActivity = this.b;
        if (i == 0) {
            uj50.b(obj);
            mgb0 accountManager = virtualLobbyActivity.getAccountManager();
            this.a = 1;
            if (accountManager.ensureLogin(virtualLobbyActivity, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (!virtualLobbyActivity.getAccountManager().isLogin()) {
            return Unit.a;
        }
        virtualLobbyActivity.z1().c0();
        virtualLobbyActivity.B1().x1(kli0.h.a);
        return Unit.a;
    }
}
