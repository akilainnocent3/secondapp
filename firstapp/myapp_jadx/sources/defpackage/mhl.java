package defpackage;

import android.view.View;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes5.dex */
public final class mhl implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ qhl b;

    public mhl(cq40 cq40Var, qhl qhlVar) {
        this.a = cq40Var;
        this.b = qhlVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object bVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 500) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        try {
            zi50.a aVar = zi50.b;
            Object tag = view.getTag();
            tag.getClass();
            bVar = (String) tag;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_OPEN_BET);
            aVar3.o(thA);
        }
        if (bVar instanceof zi50.b) {
            return;
        }
        String str = (String) bVar;
        if (str.length() > 0) {
            this.b.c.c(str);
        }
    }
}
