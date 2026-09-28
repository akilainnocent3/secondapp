package defpackage;

import com.sporty.android.core.model.account.CpfData;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mgk {
    public final lyz a;

    public mgk(lyz lyzVar) {
        lyzVar.getClass();
        this.a = lyzVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(x1b x1bVar) {
        lgk lgkVar;
        if (x1bVar instanceof lgk) {
            lgkVar = (lgk) x1bVar;
            int i = lgkVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                lgkVar.c = i - Integer.MIN_VALUE;
            } else {
                lgkVar = new lgk(this, x1bVar);
            }
        } else {
            lgkVar = new lgk(this, x1bVar);
        }
        Object objA = lgkVar.a;
        y5b y5bVar = y5b.a;
        int i2 = lgkVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                sl50 sl50Var = new sl50(bm50.b(this.a.j(null), vch0.b));
                lgkVar.c = 1;
                objA = s0i.a(sl50Var, lgkVar);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objA);
            }
            lk50 lk50Var = (lk50) objA;
            if (lk50Var instanceof lk50.a) {
                zi50.a aVar2 = zi50.b;
                return uj50.a(((lk50.a) lk50Var).a);
            }
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                zi50.a aVar3 = zi50.b;
                return new zi50.b(new RuntimeException("Invalid result state when getting CPF"));
            }
            if (!(lk50Var instanceof lk50.c)) {
                throw new uwx();
            }
            CpfData cpfData = (CpfData) ((lk50.c) lk50Var).a;
            s9e0 s9e0Var = s9e0.a;
            String cpf = cpfData.getCpf();
            s9e0Var.getClass();
            String strA = s9e0.a(cpf);
            if (strA == null) {
                zi50.a aVar4 = zi50.b;
                return new zi50.b(new RuntimeException("CPF is empty or null"));
            }
            zi50.a aVar5 = zi50.b;
            return strA;
        } catch (Throwable th) {
            zi50.a aVar6 = zi50.b;
            return new zi50.b(th);
        }
    }
}
