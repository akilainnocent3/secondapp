package defpackage;

import androidx.fragment.app.e;

/* JADX INFO: loaded from: classes4.dex */
public final class zr1 extends cny {
    public final /* synthetic */ dd7 d;
    public final /* synthetic */ ed7 e;
    public final /* synthetic */ e f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(dd7 dd7Var, ed7 ed7Var, e eVar) {
        super(true);
        this.d = dd7Var;
        this.e = ed7Var;
        this.f = eVar;
    }

    @Override // defpackage.cny
    public final void b() {
        if (((Boolean) this.d.invoke()).booleanValue()) {
            this.e.invoke();
            return;
        }
        f(false);
        this.f.getOnBackPressedDispatcher().d();
        f(true);
    }
}
