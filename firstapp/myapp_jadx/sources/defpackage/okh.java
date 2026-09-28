package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class okh<T> implements o340<T> {
    public final File a;
    public final ne80<T> b;
    public final AtomicBoolean c;

    public okh(File file, ne80<T> ne80Var) {
        ne80Var.getClass();
        this.a = file;
        this.b = ne80Var;
        this.c = new AtomicBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [okh] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, okh] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [okh] */
    public static Object f(okh okhVar, x1b x1bVar) throws IOException {
        nkh nkhVar;
        Throwable th;
        Closeable closeable;
        FileInputStream fileInputStream;
        Throwable th2;
        if (x1bVar instanceof nkh) {
            nkhVar = (nkh) x1bVar;
            int i = nkhVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkhVar.e = i - Integer.MIN_VALUE;
            } else {
                nkhVar = new nkh(okhVar, x1bVar);
            }
        } else {
            nkhVar = new nkh(okhVar, x1bVar);
        }
        Object obj = nkhVar.c;
        y5b y5bVar = y5b.a;
        ?? r2 = nkhVar.e;
        try {
            if (r2 != 0) {
                if (r2 == 1) {
                    fileInputStream = nkhVar.b;
                    r2 = (okh) nkhVar.a;
                    try {
                        uj50.b(obj);
                        ft7.a(fileInputStream, null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            throw th2;
                        } catch (Throwable th4) {
                            ft7.a(fileInputStream, th2);
                            throw th4;
                        }
                    }
                }
                if (r2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) nkhVar.a;
                try {
                    uj50.b(obj);
                    ft7.a(closeable, null);
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        ft7.a(closeable, th);
                        throw th6;
                    }
                }
            }
            uj50.b(obj);
            if (okhVar.c.get()) {
                ib5.a("This scope has already been closed.");
                return null;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(okhVar.a);
                try {
                    ne80<T> ne80Var = okhVar.b;
                    nkhVar.a = okhVar;
                    nkhVar.b = fileInputStream2;
                    nkhVar.e = 1;
                    Object objB = ne80Var.b(fileInputStream2);
                    if (objB != y5bVar) {
                        fileInputStream = fileInputStream2;
                        obj = objB;
                        ft7.a(fileInputStream, null);
                        return obj;
                    }
                } catch (Throwable th7) {
                    r2 = okhVar;
                    fileInputStream = fileInputStream2;
                    th2 = th7;
                    throw th2;
                }
            } catch (FileNotFoundException unused) {
                File file = okhVar.a;
                ne80<T> ne80Var2 = okhVar.b;
                if (!file.exists()) {
                    return ne80Var2.getDefaultValue();
                }
                FileInputStream fileInputStream3 = new FileInputStream(okhVar.a);
                try {
                    nkhVar.a = fileInputStream3;
                    nkhVar.b = null;
                    nkhVar.e = 2;
                    Object objB2 = ne80Var2.b(fileInputStream3);
                    if (objB2 != y5bVar) {
                        obj = objB2;
                        closeable = fileInputStream3;
                        ft7.a(closeable, null);
                        return obj;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    closeable = fileInputStream3;
                    throw th;
                }
            }
            return y5bVar;
        } catch (FileNotFoundException unused2) {
            okhVar = r2;
        }
    }

    @Override // defpackage.o340
    public final Object c(m1e0 m1e0Var) {
        return f(this, m1e0Var);
    }

    @Override // defpackage.dt7
    public final void close() {
        this.c.set(true);
    }
}
