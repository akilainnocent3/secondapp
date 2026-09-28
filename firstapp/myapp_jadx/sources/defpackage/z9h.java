package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class z9h implements uw90 {
    public final uw90 a;
    public final hy0 b;
    public boolean c;

    public z9h(uw90 uw90Var, hy0 hy0Var) {
        this.a = uw90Var;
        this.b = hy0Var;
    }

    @Override // defpackage.uw90, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.a.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.uw90, java.io.Flushable
    public final void flush() {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // defpackage.uw90
    public final sxf0 timeout() {
        return this.a.timeout();
    }

    @Override // defpackage.uw90
    public final void write(lb5 lb5Var, long j) throws EOFException {
        if (this.c) {
            lb5Var.skip(j);
            return;
        }
        try {
            this.a.write(lb5Var, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
