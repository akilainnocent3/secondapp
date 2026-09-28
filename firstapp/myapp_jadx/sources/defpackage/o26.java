package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o26 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o26(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                mm0.a(((q26.a) obj).b);
                break;
            default:
                tox.c cVar = (tox.c) obj;
                tox.b bVar = cVar.a.get();
                if (bVar != null) {
                    bVar.a(cVar.c.b());
                }
                break;
        }
    }
}
