package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.PreMatchSportsData;
import com.sportybet.plugin.realsports.data.Tournament;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class tyj0 {
    public final z7h a;

    public tyj0(z7h z7hVar) {
        z7hVar.getClass();
        this.a = z7hVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Serializable a(String str, String str2, String str3, x1b x1bVar) {
        syj0 syj0Var;
        if (x1bVar instanceof syj0) {
            syj0Var = (syj0) x1bVar;
            int i = syj0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                syj0Var.c = i - Integer.MIN_VALUE;
            } else {
                syj0Var = new syj0(this, x1bVar);
            }
        } else {
            syj0Var = new syj0(this, x1bVar);
        }
        syj0 syj0Var2 = syj0Var;
        Object objL = syj0Var2.a;
        y5b y5bVar = y5b.a;
        int i2 = syj0Var2.c;
        if (i2 == 0) {
            uj50.b(objL);
            syj0Var2.c = 1;
            objL = this.a.L(str, str3, str2, 5, 1, syj0Var2);
            if (objL == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objL);
        }
        List<Tournament> list = ((PreMatchSportsData) n52.b((BaseResponse) objL)).tournaments;
        ArrayList arrayListA = kw5.a(list);
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Event> list2 = ((Tournament) it.next()).events;
            list2.getClass();
            p48.w(list2, arrayListA);
        }
        return arrayListA;
    }
}
