package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class dlh {
    public static void a(blh blhVar, cxz cxzVar) {
        if (blhVar.exists(cxzVar)) {
            return;
        }
        try {
            blhVar.sink(cxzVar).close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final void b(blh blhVar, cxz cxzVar) throws IOException {
        try {
            IOException iOException = null;
            for (cxz cxzVar2 : blhVar.list(cxzVar)) {
                try {
                    if (blhVar.metadata(cxzVar2).b) {
                        b(blhVar, cxzVar2);
                    }
                    blhVar.delete(cxzVar2);
                } catch (IOException e) {
                    if (iOException == null) {
                        iOException = e;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
