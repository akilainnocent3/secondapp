package defpackage;

import android.view.View;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes5.dex */
public final class tyg implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ uyg b;

    public tyg(cq40 cq40Var, uyg uygVar) {
        this.a = cq40Var;
        this.b = uygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        uyg uygVar = this.b;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 500) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        try {
            Object tag = uygVar.b.I.getTag();
            tag.getClass();
            String str = (String) tag;
            if (str.length() > 0) {
                uygVar.c.q(str);
            }
        } catch (Exception e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_DETAIL_VIEW);
            aVar.d(inm.a("Error while getting orderId from tag: ", e.getMessage()), new Object[0]);
        }
    }
}
