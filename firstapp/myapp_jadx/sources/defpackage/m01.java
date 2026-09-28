package defpackage;

import androidx.recyclerview.widget.b;

/* JADX INFO: loaded from: classes.dex */
public final class m01 extends znz.a {
    public final /* synthetic */ j01<Object> a;

    public m01(j01<Object> j01Var) {
        this.a = j01Var;
    }

    @Override // znz.a
    public final void a(int i, int i2) {
        ((b) this.a.c()).onChanged(i, i2, null);
    }

    @Override // znz.a
    public final void b(int i, int i2) {
        ((b) this.a.c()).onInserted(i, i2);
    }

    @Override // znz.a
    public final void c(int i, int i2) {
        ((b) this.a.c()).onRemoved(i, i2);
    }
}
