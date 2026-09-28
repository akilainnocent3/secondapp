package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class vuh0<K, A> extends u12<K, A> {
    public final A i;

    public vuh0(cpt<A> cptVar, A a) {
        super(Collections.EMPTY_LIST);
        j(cptVar);
        this.i = a;
    }

    @Override // defpackage.u12
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.u12
    public final A e() {
        cpt<A> cptVar = this.e;
        A a = this.i;
        float f = this.d;
        return cptVar.b(0.0f, 0.0f, a, a, f, f, f);
    }

    @Override // defpackage.u12
    public final A f(cpp<K> cppVar, float f) {
        return e();
    }

    @Override // defpackage.u12
    public final void h() {
        if (this.e != null) {
            super.h();
        }
    }

    @Override // defpackage.u12
    public final void i(float f) {
        this.d = f;
    }
}
