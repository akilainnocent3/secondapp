package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes.dex */
public abstract class q120<T> {
    public final int a;
    public int b;
    public final mw0<T> c;

    public interface a {
        void reset();
    }

    public q120(int i) {
        this.c = new mw0<>(i, false);
        this.a = Reader.READ_DONE;
    }

    public final void a(T t) {
        if (t == null) {
            hb5.a("object cannot be null.");
            return;
        }
        mw0<T> mw0Var = this.c;
        if (mw0Var.b >= this.a) {
            if (t instanceof a) {
                ((a) t).reset();
            }
        } else {
            mw0Var.a(t);
            this.b = Math.max(this.b, mw0Var.b);
            if (t instanceof a) {
                ((a) t).reset();
            }
        }
    }

    public final void b(mw0<T> mw0Var) {
        int i = mw0Var.b;
        int i2 = 0;
        while (true) {
            mw0<T> mw0Var2 = this.c;
            if (i2 >= i) {
                this.b = Math.max(this.b, mw0Var2.b);
                return;
            }
            T t = mw0Var.get(i2);
            if (t != null) {
                if (mw0Var2.b < this.a) {
                    mw0Var2.a(t);
                    if (t instanceof a) {
                        ((a) t).reset();
                    }
                } else if (t instanceof a) {
                    ((a) t).reset();
                }
            }
            i2++;
        }
    }

    public abstract T c();

    public final T d() {
        mw0<T> mw0Var = this.c;
        return mw0Var.b == 0 ? c() : mw0Var.pop();
    }

    public q120() {
        this(16);
    }
}
