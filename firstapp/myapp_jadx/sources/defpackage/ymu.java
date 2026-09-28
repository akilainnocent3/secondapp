package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.bank.ManageAccountUiManagerImpl$onManageAccountAction$1", f = "ManageAccountUiManager.kt", l = {287}, m = "invokeSuspend", v = 2)
public final class ymu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ku90 a;
    public int b;
    public final /* synthetic */ xmu c;
    public final /* synthetic */ tmu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymu(xmu xmuVar, tmu tmuVar, v1b<? super ymu> v1bVar) {
        super(2, v1bVar);
        this.c = xmuVar;
        this.d = tmuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ymu(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ymu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ku90 ku90Var;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            xmu xmuVar = this.c;
            ku90 ku90Var2 = xmuVar.e;
            if (ku90Var2 == null) {
                Intrinsics.n("manageAccountUiManageEventFlow");
                throw null;
            }
            Object obj2 = ((tmu.e) this.d).a;
            this.a = ku90Var2;
            this.b = 1;
            Iterator it = ((List) xmuVar.k.getValue()).iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                }
                if (Intrinsics.g(((aoe0.b) it.next()).a, obj2)) {
                    break;
                }
                i2++;
            }
            obj = i2 == -1 ? v600.a.a : xmuVar.c(i2, 0, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            ku90Var = ku90Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ku90Var = this.a;
            uj50.b(obj);
        }
        ku90Var.a(obj);
        return Unit.a;
    }
}
