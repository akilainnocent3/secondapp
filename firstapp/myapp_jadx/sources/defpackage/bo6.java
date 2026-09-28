package defpackage;

import com.sportybet.android.cashoutphase3.h;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.CashOutViewModel$fetchEditBetInfo$1", f = "CashOutViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bo6 extends tje0 implements Function2<lk50<? extends wlf>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ h b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo6(h hVar, String str, v1b<? super bo6> v1bVar) {
        super(2, v1bVar);
        this.b = hVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bo6 bo6Var = new bo6(this.b, this.c, v1bVar);
        bo6Var.a = obj;
        return bo6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends wlf> lk50Var, v1b<? super Unit> v1bVar) {
        return ((bo6) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50<wlf> lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = lk50Var instanceof lk50.c;
        h hVar = this.b;
        if (z) {
            sfy sfyVar = hVar.D;
            Set<String> set = (Set) hVar.S.get(this.c);
            if (set == null) {
                set = t3g.a;
            }
            sfyVar.e(set);
        }
        hVar.Z.m(lk50Var);
        return Unit.a;
    }
}
