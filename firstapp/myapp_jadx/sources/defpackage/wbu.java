package defpackage;

import com.sporty.android.core.model.luckywheel.TicketInfo;

/* JADX INFO: loaded from: classes5.dex */
public final class wbu {
    public final h530 a;
    public final mgb0 b;

    public wbu(h530 h530Var, mgb0 mgb0Var) {
        h530Var.getClass();
        mgb0Var.getClass();
        this.a = h530Var;
        this.b = mgb0Var;
    }

    public final yzh a(int i) {
        return bm50.a(this.b.isLogin() ? new vbu(this.a.v(i)) : new gzh(new TicketInfo(0, null, 0, null, 0L, null, null, 127, null)));
    }
}
