package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.viewmodel.CodeHubEntryViewModel$displayCreatorCreditsHint$1", f = "CodeHubEntryViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
public final class bx7 extends tje0 implements Function1<v1b<? super Boolean>, Object> {
    public boolean a;
    public boolean b;
    public boolean c;
    public int d;
    public final /* synthetic */ ex7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx7(ex7 ex7Var, v1b<? super bx7> v1bVar) {
        super(1, v1bVar);
        this.e = ex7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new bx7(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super Boolean> v1bVar) {
        return ((bx7) create(v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ex7 ex7Var = this.e;
        uqm uqmVar = ex7Var.e;
        lq1 lq1Var = ex7Var.f;
        y5b y5bVar = y5b.a;
        int i = this.d;
        if (i == 0) {
            uj50.b(obj);
            boolean zA = qq1.a(lq1Var, BOConfigParam.EnableCodeHubCustomCodes, false);
            boolean zA2 = qq1.a(lq1Var, BOConfigParam.EnableCreatorCredits, false);
            try {
                zi50.a aVar = zi50.b;
                if (uqmVar.isLogin()) {
                    AccountInfo accountInfo = uqmVar.getAccountInfo();
                    if (accountInfo != null ? Intrinsics.g(accountInfo.isCreator(), Boolean.TRUE) : false) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                bVar = Boolean.valueOf(z4);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (zi50.a(bVar) != null) {
                bVar = Boolean.FALSE;
            }
            boolean zBooleanValue = ((Boolean) bVar).booleanValue();
            m2l m2lVar = ex7Var.d;
            this.a = zA;
            this.b = zA2;
            this.c = zBooleanValue;
            this.d = 1;
            Object obj2 = m2lVar.a.getBoolean("key_code_hub_creator_credits_entry_hint_watched", false, this);
            if (obj2 == y5bVar) {
                return y5bVar;
            }
            obj = obj2;
            z = zA;
            z2 = zBooleanValue;
            z3 = zA2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = this.c;
            z3 = this.b;
            z = this.a;
            uj50.b(obj);
        }
        return Boolean.valueOf(z && z3 && z2 && !((Boolean) obj).booleanValue());
    }
}
