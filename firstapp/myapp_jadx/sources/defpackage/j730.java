package defpackage;

import androidx.compose.runtime.c;
import androidx.compose.runtime.d;

/* JADX INFO: loaded from: classes.dex */
public final class j730<T> {
    public final d a;
    public final boolean b;
    public final y5a0<T> c;
    public final boolean d;
    public final T e;
    public boolean f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public j730(d dVar, Object obj, boolean z, y5a0 y5a0Var, boolean z2) {
        this.a = dVar;
        this.b = z;
        this.c = y5a0Var;
        this.d = z2;
        this.e = obj;
    }

    public final T a() {
        if (this.b) {
            return null;
        }
        T t = this.e;
        if (t != null) {
            return t;
        }
        c.c("Unexpected form of a provided value");
        fkd.a();
        return null;
    }
}
