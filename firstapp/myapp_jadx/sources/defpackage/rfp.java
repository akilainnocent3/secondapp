package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: classes8.dex */
public abstract class rfp implements Closeable, Flushable {
    public int a;
    public int[] b;
    public String[] c;
    public int[] d;
    public boolean e;
    public int f;

    public final int F() {
        int i = this.a;
        if (i != 0) {
            return this.b[i - 1];
        }
        ib5.a("JsonWriter is closed.");
        return 0;
    }

    public final void G(int i) {
        int[] iArr = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        iArr[i2] = i;
    }

    public abstract rfp H(double d);

    public abstract rfp J(long j);

    public abstract rfp P(Float f);

    public abstract rfp V(String str);

    public abstract rfp Y(boolean z);

    public abstract rfp d();

    public abstract rfp f();

    public abstract rfp g();

    public abstract rfp l();

    public final String m() {
        return lep.b(this.a, this.b, this.c, this.d);
    }

    public abstract rfp o(String str);

    public abstract rfp u();
}
