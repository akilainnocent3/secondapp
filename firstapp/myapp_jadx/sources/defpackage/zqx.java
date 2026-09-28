package defpackage;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes8.dex */
public final class zqx extends qm70 {
    public static final p760 d = new p760("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())), false);
    public final ThreadFactory c = d;

    @Override // defpackage.qm70
    public final qm70.c b() {
        return new arx(this.c);
    }
}
