package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ktu {
    public abstract int a();

    public final void b(OutputStream outputStream) throws IOException {
        r630 r630Var = new r630(outputStream);
        try {
            c(r630Var);
            r630Var.close();
        } catch (Throwable th) {
            try {
                r630Var.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void c(me80 me80Var);
}
