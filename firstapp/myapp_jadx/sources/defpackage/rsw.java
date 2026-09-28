package defpackage;

import androidx.compose.foundation.lazy.layout.b;

/* JADX INFO: loaded from: classes.dex */
public final class rsw<T> {
    public final duw<jzo<T>> a = new duw<>(new jzo[16]);
    public int b;
    public jzo<? extends T> c;

    public final void a(int i, b.a aVar) {
        if (i < 0) {
            zkn.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        jzo jzoVar = new jzo(this.b, i, aVar);
        this.b += i;
        this.a.b(jzoVar);
    }

    public final jzo<T> b(int i) {
        if (i < 0 || i >= this.b) {
            StringBuilder sbA = efe0.a(i, "Index ", ", size ");
            sbA.append(this.b);
            zkn.e(sbA.toString());
        }
        jzo<? extends T> jzoVar = this.c;
        if (jzoVar != null) {
            int i2 = jzoVar.a;
            if (i < jzoVar.b + i2 && i2 <= i) {
                return jzoVar;
            }
        }
        duw<jzo<T>> duwVar = this.a;
        jzo jzoVar2 = (jzo<? extends T>) duwVar.a[kzo.a(i, duwVar)];
        this.c = jzoVar2;
        return jzoVar2;
    }
}
