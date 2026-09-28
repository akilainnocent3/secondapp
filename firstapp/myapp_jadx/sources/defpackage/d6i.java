package defpackage;

import android.accounts.Account;
import androidx.fragment.app.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class d6i implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d6i(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final n6i n6iVar = (n6i) obj;
                e activity = n6iVar.getActivity();
                if (activity != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    n6iVar.getAccountHelper().demandAccount(activity, new tit() { // from class: l6i
                        @Override // defpackage.tit
                        public final void w(Account account, boolean z) {
                            if (account != null) {
                                n6i n6iVar2 = n6iVar;
                                uqm uqmVar = n6iVar2.i;
                                if (uqmVar == null) {
                                    Intrinsics.n("accountHelper");
                                    throw null;
                                }
                                if (uqmVar.isLogin()) {
                                    u7i u7iVar = (u7i) n6iVar2.A.getValue();
                                    b6i.b bVar = b6i.b.a;
                                    bVar.getClass();
                                    u7iVar.w = new gzh(bVar);
                                }
                            }
                        }
                    });
                    Unit unit = Unit.a;
                }
                break;
            default:
                fd90 fd90Var = (fd90) obj;
                fd90Var.m = false;
                fd90Var.l = null;
                break;
        }
        return Unit.a;
    }
}
