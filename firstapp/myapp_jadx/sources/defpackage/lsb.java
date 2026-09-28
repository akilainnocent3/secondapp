package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lsb implements Runnable {
    public final /* synthetic */ qsb a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ lsb(qsb qsbVar, long j, String str) {
        this.a = qsbVar;
        this.b = j;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final qsb qsbVar = this.a;
        iub iubVar = qsbVar.o.b;
        final long j = this.b;
        final String str = this.c;
        iubVar.a(new Runnable() { // from class: psb
            @Override // java.lang.Runnable
            public final void run() {
                esb esbVar = qsbVar.g;
                fub fubVar = esbVar.n;
                if (fubVar == null || !fubVar.e.get()) {
                    esbVar.i.b.c(j, str);
                }
            }
        });
    }
}
