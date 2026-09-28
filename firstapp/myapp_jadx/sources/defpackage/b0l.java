package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b0l implements c0l<Object> {
    public volatile Object a;
    public final /* synthetic */ c0l b;

    public b0l(c0l c0lVar) {
        this.b = c0lVar;
    }

    @Override // defpackage.c0l
    public final Object get() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        Object obj = this.b.get();
                        gm20.c(obj, "Argument must not be null");
                        this.a = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }
}
