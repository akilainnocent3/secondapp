package defpackage;

import android.util.Log;

/* JADX INFO: loaded from: classes8.dex */
public abstract class x2 implements yua {
    public final l830<bbs> a = new l830<>();
    public final l830<String> b = new l830<>();

    public abstract void a();

    public final im8 b() {
        return new im8(new ib() { // from class: w2
            @Override // defpackage.ib
            public final void run() {
                this.a.g();
            }
        });
    }

    public final void c(bbs bbsVar) {
        Log.d("x2", "Emit lifecycle event: " + bbsVar.a.name());
        this.a.onNext(bbsVar);
    }

    public final void d(String str) {
        Log.d("x2", "Receive STOMP message: " + str);
        this.b.onNext(str);
    }

    public abstract Object e();

    /* JADX WARN: Multi-variable type inference failed */
    public final ucy<String> f() {
        im8 im8Var = new im8(new ib() { // from class: v2
            @Override // defpackage.ib
            public final void run() {
                this.a.a();
            }
        });
        dey deyVarA = im8Var instanceof zaj ? ((zaj) im8Var).a() : new um8(im8Var);
        l830<String> l830Var = this.b;
        l830Var.getClass();
        return ucy.d(deyVarA, l830Var);
    }

    public abstract void g();

    public abstract void h(String str);

    public final jm8 i(String str) {
        return new jm8(new u2(this, str));
    }
}
