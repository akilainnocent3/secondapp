package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class k1l {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;

    public static void a(r8w r8wVar, je80 je80Var, pse pseVar, hb30 hb30Var) {
        int iAddAndGet = 1;
        while (true) {
            boolean z = hb30Var.f;
            Object objPoll = r8wVar.poll();
            boolean z2 = objPoll == null;
            if (!hb30Var.e) {
                if (z && z2) {
                    je80Var.onComplete();
                    break;
                }
                if (z2) {
                    iAddAndGet = hb30Var.a.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    long j = hb30Var.b.get();
                    if (j == 0) {
                        r8wVar.clear();
                        if (pseVar != null) {
                            pseVar.dispose();
                        }
                        je80Var.onError(new sqv("Could not emit value due to lack of requests."));
                        return;
                    }
                    hb30Var.e(je80Var, objPoll);
                    if (j != Long.MAX_VALUE) {
                        hb30Var.b.addAndGet(-1L);
                    }
                }
            } else {
                r8wVar.clear();
                break;
            }
        }
        if (pseVar != null) {
            pseVar.dispose();
        }
    }
}
