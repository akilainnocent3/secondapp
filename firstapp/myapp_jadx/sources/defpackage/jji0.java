package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.instantwin.newtork.model.response.getstarted.NetworkVirtualLobbyGetStarted;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class jji0 {
    public final e0t a;

    public jji0(e0t e0tVar) {
        this.a = e0tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(x1b x1bVar) {
        iji0 iji0Var;
        if (x1bVar instanceof iji0) {
            iji0Var = (iji0) x1bVar;
            int i = iji0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                iji0Var.c = i - Integer.MIN_VALUE;
            } else {
                iji0Var = new iji0(this, x1bVar);
            }
        } else {
            iji0Var = new iji0(this, x1bVar);
        }
        Object objA = iji0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = iji0Var.c;
        try {
            if (i2 == 0) {
                uj50.b(objA);
                zi50.a aVar = zi50.b;
                e0t e0tVar = this.a;
                iji0Var.c = 1;
                objA = e0tVar.a(iji0Var);
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
            Iterable iterable = (Iterable) n52.b((BaseResponse) objA);
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                bii0 bii0VarA = hji0.a((NetworkVirtualLobbyGetStarted) it.next());
                if (bii0VarA != null) {
                    arrayList.add(bii0VarA);
                }
            }
            zi50.a aVar2 = zi50.b;
            return arrayList;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
