package defpackage;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ujg0 {
    public final int a;
    public final d850[] b;
    public final oyg[] c;
    public final bkg0 d;
    public final Object e;

    public ujg0(d850[] d850VarArr, oyg[] oygVarArr, bkg0 bkg0Var, Object obj) {
        ly0.b(d850VarArr.length == oygVarArr.length);
        this.b = d850VarArr;
        this.c = (oyg[]) oygVarArr.clone();
        this.d = bkg0Var;
        this.e = obj;
        this.a = d850VarArr.length;
    }

    public final boolean a(ujg0 ujg0Var, int i) {
        return ujg0Var != null && Objects.equals(this.b[i], ujg0Var.b[i]) && Objects.equals(this.c[i], ujg0Var.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
