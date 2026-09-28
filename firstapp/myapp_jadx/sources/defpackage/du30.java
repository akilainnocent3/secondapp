package defpackage;

import com.sportybet.plugin.realsports.data.RTicket;

/* JADX INFO: loaded from: classes5.dex */
public final class du30 extends hl30 {
    public final RTicket a;
    public final String b;
    public final boolean c;

    public du30(RTicket rTicket, String str, boolean z) {
        if (rTicket != null) {
            this.a = rTicket;
            this.b = str;
            this.c = z;
        }
    }

    @Override // defpackage.hl30
    public final int a() {
        return 3;
    }
}
