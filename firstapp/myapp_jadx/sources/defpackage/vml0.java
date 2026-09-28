package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vml0 extends lml0 {
    public boolean c;

    public vml0(iol0 iol0Var) {
        super(iol0Var);
        this.b.r++;
    }

    public final void h() {
        if (this.c) {
            return;
        }
        ib5.a("Not initialized");
    }

    public final void i() {
        if (this.c) {
            ib5.a("Can't initialize twice");
            return;
        }
        j();
        this.b.s++;
        this.c = true;
    }

    public abstract void j();
}
