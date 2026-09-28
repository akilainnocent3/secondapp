package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c880 implements g6w {
    public final /* synthetic */ zg8 a;
    public final /* synthetic */ g980 b;
    public final /* synthetic */ long c;

    public c880(zg8 zg8Var, g980 g980Var, long j) {
        this.a = zg8Var;
        this.b = g980Var;
        this.c = j;
    }

    @Override // defpackage.g6w
    public final void a() {
        this.b.i();
    }

    @Override // defpackage.g6w
    public final boolean b(long j, w780 w780Var) {
        urr urrVar = (urr) this.a.invoke();
        if (urrVar == null) {
            return true;
        }
        if (!urrVar.e()) {
            return false;
        }
        g980 g980Var = this.b;
        if (!i980.a(g980Var, this.c)) {
            return false;
        }
        g980Var.h();
        return true;
    }

    @Override // defpackage.g6w
    public final boolean c(long j, w780 w780Var, int i) {
        urr urrVar = (urr) this.a.invoke();
        if (urrVar == null || !urrVar.e()) {
            return false;
        }
        g980 g980Var = this.b;
        g980Var.b();
        return i980.a(g980Var, this.c);
    }
}
