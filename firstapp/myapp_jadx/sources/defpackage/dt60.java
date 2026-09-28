package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class dt60<T> implements wv60, j350 {
    public rv60<T, Object> a;
    public mt60 b;
    public String c;
    public T d;
    public Object[] e;
    public mt60.a f;
    public final ct60 i = new ct60(this);

    public dt60(rv60<T, Object> rv60Var, mt60 mt60Var, String str, T t, Object[] objArr) {
        this.a = rv60Var;
        this.b = mt60Var;
        this.c = str;
        this.d = t;
        this.e = objArr;
    }

    @Override // defpackage.wv60
    public final boolean a(Object obj) {
        mt60 mt60Var = this.b;
        return mt60Var == null || mt60Var.a(obj);
    }

    public final void b() {
        String strA;
        mt60 mt60Var = this.b;
        if (this.f != null) {
            efx.a(this.f, "entry(", ") is not null");
            return;
        }
        if (mt60Var != null) {
            ct60 ct60Var = this.i;
            Object objInvoke = ct60Var.invoke();
            if (objInvoke == null || mt60Var.a(objInvoke)) {
                this.f = mt60Var.b(this.c, ct60Var);
                return;
            }
            if (objInvoke instanceof w5a0) {
                w5a0 w5a0Var = (w5a0) objInvoke;
                if (w5a0Var.h() == epx.a || w5a0Var.h() == bbe0.b || w5a0Var.h() == gq40.b) {
                    strA = "MutableState containing " + w5a0Var.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = o350.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override // defpackage.j350
    public final void c() {
        b();
    }

    @Override // defpackage.j350
    public final void e() {
        mt60.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // defpackage.j350
    public final void f() {
        mt60.a aVar = this.f;
        if (aVar != null) {
            aVar.a();
        }
    }
}
