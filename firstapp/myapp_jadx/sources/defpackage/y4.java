package defpackage;

import com.google.protobuf.Reader;
import defpackage.a5;
import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public abstract class y4<S extends a5<?>> {
    public S[] a;
    public int b;
    public int c;
    public cee0 d;

    public final uwd0<Integer> b() {
        cee0 cee0Var;
        synchronized (this) {
            cee0Var = this.d;
            if (cee0Var == null) {
                int i = this.b;
                cee0Var = new cee0(1, Reader.READ_DONE, pb5.b);
                cee0Var.a(Integer.valueOf(i));
                this.d = cee0Var;
            }
        }
        return cee0Var;
    }

    public final S e() {
        S s;
        cee0 cee0Var;
        synchronized (this) {
            try {
                S[] sArr = this.a;
                if (sArr == null) {
                    sArr = (S[]) i();
                    this.a = sArr;
                } else if (this.b >= sArr.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(sArr, sArr.length * 2);
                    this.a = (S[]) ((a5[]) objArrCopyOf);
                    sArr = (S[]) ((a5[]) objArrCopyOf);
                }
                int i = this.c;
                do {
                    s = sArr[i];
                    if (s == null) {
                        s = (S) f();
                        sArr[i] = s;
                    }
                    i++;
                    if (i >= sArr.length) {
                        i = 0;
                    }
                } while (!s.a(this));
                this.c = i;
                this.b++;
                cee0Var = this.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (cee0Var != null) {
            cee0Var.x(1);
        }
        return s;
    }

    public abstract S f();

    public abstract a5[] i();

    public final void j(S s) {
        cee0 cee0Var;
        int i;
        v1b[] v1bVarArrB;
        synchronized (this) {
            try {
                int i2 = this.b - 1;
                this.b = i2;
                cee0Var = this.d;
                if (i2 == 0) {
                    this.c = 0;
                }
                s.getClass();
                v1bVarArrB = s.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (v1b v1bVar : v1bVarArrB) {
            if (v1bVar != null) {
                zi50.a aVar = zi50.b;
                v1bVar.resumeWith(Unit.a);
            }
        }
        if (cee0Var != null) {
            cee0Var.x(-1);
        }
    }
}
