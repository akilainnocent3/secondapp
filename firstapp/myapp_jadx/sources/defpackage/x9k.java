package defpackage;

import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.welcomereward.NonFtdEngagement;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class x9k {
    public final w1j0 a;
    public final JsonSerializeService b;

    public x9k(w1j0 w1j0Var, JsonSerializeService jsonSerializeService) {
        w1j0Var.getClass();
        jsonSerializeService.getClass();
        this.a = w1j0Var;
        this.b = jsonSerializeService;
    }

    public final u9k a() {
        return new u9k(this.a.c().d(""), this);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object b(String str, x1b x1bVar) {
        v9k v9kVar;
        Object bVar;
        if (x1bVar instanceof v9k) {
            v9kVar = (v9k) x1bVar;
            int i = v9kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9kVar.c = i - Integer.MIN_VALUE;
            } else {
                v9kVar = new v9k(this, x1bVar);
            }
        } else {
            v9kVar = new v9k(this, x1bVar);
        }
        v9k v9kVar2 = v9kVar;
        Object obj = v9kVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = v9kVar2.c;
        Object obj2 = null;
        if (i2 == 0) {
            uj50.b(obj);
            if (StringsKt.U(str)) {
                return new NonFtdEngagement(false, null, null, null, 15, null);
            }
            try {
                zi50.a aVar = zi50.b;
                bVar = (NonFtdEngagement) this.b.fromJson(str, new w9k().getType());
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA == null) {
                obj2 = bVar;
            } else {
                itf0.a aVar3 = itf0.a;
                aVar3.q("GetNonFtdCache");
                aVar3.p(thA, "Corrupt non-FTD cache dropped", new Object[0]);
                wm20<String> wm20VarC = this.a.c();
                v9kVar2.c = 1;
                if (wm20VarC.a(v9kVar2) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        NonFtdEngagement nonFtdEngagement = (NonFtdEngagement) obj2;
        return nonFtdEngagement == null ? new NonFtdEngagement(false, null, null, null, 15, null) : nonFtdEngagement;
    }
}
