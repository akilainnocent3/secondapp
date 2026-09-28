package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bvk0 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ r12 c;

    public bvk0(r12 r12Var) {
        Boolean bool = Boolean.TRUE;
        this.c = r12Var;
        this.a = bool;
        this.b = false;
    }

    public abstract void a(Object obj);

    public final void b() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.l) {
            this.c.l.remove(this);
        }
    }
}
