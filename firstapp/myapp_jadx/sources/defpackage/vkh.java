package defpackage;

import android.os.Build;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class vkh<T> implements l1e0<T> {
    public final File a;
    public final ne80<T> b;
    public final wxo c;
    public final zqc d;
    public final AtomicBoolean e;
    public final tuw f;

    public vkh(File file, ne80 ne80Var, wxo wxoVar, zqc zqcVar) {
        ne80Var.getClass();
        wxoVar.getClass();
        this.a = file;
        this.b = ne80Var;
        this.c = wxoVar;
        this.d = zqcVar;
        this.e = new AtomicBoolean(false);
        this.f = uuw.a();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d0 A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TryCatch #4 {all -> 0x010b, blocks: (B:43:0x00d0, B:45:0x00d6, B:47:0x00de, B:51:0x00ea, B:52:0x010a, B:48:0x00e3, B:57:0x0112, B:60:0x011a, B:67:0x0128, B:66:0x0125), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d6 A[Catch: all -> 0x010b, IOException -> 0x010e, TryCatch #4 {all -> 0x010b, blocks: (B:43:0x00d0, B:45:0x00d6, B:47:0x00de, B:51:0x00ea, B:52:0x010a, B:48:0x00e3, B:57:0x0112, B:60:0x011a, B:67:0x0128, B:66:0x0125), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00de A[Catch: all -> 0x010b, IOException -> 0x010e, TryCatch #4 {all -> 0x010b, blocks: (B:43:0x00d0, B:45:0x00d6, B:47:0x00de, B:51:0x00ea, B:52:0x010a, B:48:0x00e3, B:57:0x0112, B:60:0x011a, B:67:0x0128, B:66:0x0125), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e3 A[Catch: all -> 0x010b, IOException -> 0x010e, TryCatch #4 {all -> 0x010b, blocks: (B:43:0x00d0, B:45:0x00d6, B:47:0x00de, B:51:0x00ea, B:52:0x010a, B:48:0x00e3, B:57:0x0112, B:60:0x011a, B:67:0x0128, B:66:0x0125), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ea A[Catch: all -> 0x010b, IOException -> 0x010e, TryCatch #4 {all -> 0x010b, blocks: (B:43:0x00d0, B:45:0x00d6, B:47:0x00de, B:51:0x00ea, B:52:0x010a, B:48:0x00e3, B:57:0x0112, B:60:0x011a, B:67:0x0128, B:66:0x0125), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x011a A[Catch: all -> 0x010b, IOException -> 0x010e, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x010b, blocks: (B:43:0x00d0, B:45:0x00d6, B:47:0x00de, B:51:0x00ea, B:52:0x010a, B:48:0x00e3, B:57:0x0112, B:60:0x011a, B:67:0x0128, B:66:0x0125), top: B:81:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ea, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.io.File, java.lang.Object] */
    @Override // defpackage.l1e0
    public final Object a(rrc rrcVar, x1b x1bVar) throws Throwable {
        ukh ukhVar;
        ?? file;
        quw quwVar;
        Function2 function2;
        klh klhVar;
        Throwable th;
        klh klhVar2;
        vkh<T> vkhVar;
        quw quwVar2;
        ?? r9;
        File file2;
        boolean zRenameTo;
        if (x1bVar instanceof ukh) {
            ukhVar = (ukh) x1bVar;
            int i = ukhVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ukhVar.i = i - Integer.MIN_VALUE;
            } else {
                ukhVar = new ukh(this, x1bVar);
            }
        } else {
            ukhVar = new ukh(this, x1bVar);
        }
        ?? r10 = ukhVar.e;
        y5b y5bVar = y5b.a;
        int i2 = ukhVar.i;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                uj50.b(r10);
                                if (this.e.get()) {
                                    ib5.a("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File file3 = this.a;
                                File parentFile = file3.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        jre.a(file3, "Unable to create parent directories of ");
                                        return null;
                                    }
                                }
                                ukhVar.a = this;
                                ukhVar.b = rrcVar;
                                quwVar = this.f;
                                ukhVar.c = quwVar;
                                ukhVar.i = 1;
                                function2 = rrcVar;
                                if (quwVar.d(ukhVar) != y5bVar) {
                                }
                                return y5bVar;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                klhVar2 = ukhVar.d;
                                File file4 = (File) ukhVar.c;
                                quwVar2 = (quw) ukhVar.b;
                                vkhVar = ukhVar.a;
                                try {
                                    uj50.b(r10);
                                    r9 = file4;
                                    Unit unit = Unit.a;
                                    try {
                                        klhVar2.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r9.exists()) {
                                        file2 = vkhVar.a;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                            zRenameTo = ul0.a(r9, file2);
                                        } else {
                                            zRenameTo = r9.renameTo(file2);
                                        }
                                        if (zRenameTo) {
                                            throw new IOException("Unable to rename " + r9 + " to " + vkhVar.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    Unit unit2 = Unit.a;
                                    quwVar2.f(null);
                                    return Unit.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        klhVar2.close();
                                    } catch (Throwable th4) {
                                        rtg.a(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            quw quwVar3 = (quw) ukhVar.c;
                            Function2 function3 = (Function2) ukhVar.b;
                            vkh<T> vkhVar2 = ukhVar.a;
                            uj50.b(r10);
                            quwVar = quwVar3;
                            this = vkhVar2;
                            function2 = function3;
                            ukhVar.a = this;
                            ukhVar.b = quwVar;
                            ukhVar.c = file;
                            ukhVar.d = klhVar;
                            ukhVar.i = 2;
                            if (function2.invoke(klhVar, ukhVar) != y5bVar) {
                                vkhVar = this;
                                quwVar2 = quwVar;
                                r9 = file;
                                klhVar2 = klhVar;
                                Unit unit3 = Unit.a;
                                klhVar2.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r9.exists()) {
                                    file2 = vkhVar.a;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        zRenameTo = ul0.a(r9, file2);
                                    } else {
                                        zRenameTo = r9.renameTo(file2);
                                    }
                                    if (zRenameTo) {
                                        throw new IOException("Unable to rename " + r9 + " to " + vkhVar.a + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                    }
                                }
                                Unit unit4 = Unit.a;
                                quwVar2.f(null);
                                return Unit.a;
                            }
                            return y5bVar;
                        } catch (Throwable th5) {
                            th = th5;
                            klhVar2 = klhVar;
                            klhVar2.close();
                            throw th;
                        }
                        ne80<T> ne80Var = this.b;
                        ne80Var.getClass();
                        klhVar = new klh(file, ne80Var);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(this.a.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r10.f(null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                r10 = y5bVar;
                r10.f(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file = rrcVar;
        }
    }

    @Override // defpackage.dt7
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:57:0x007b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.l1e0
    public final Object d(m1e0 m1e0Var, x1b x1bVar) throws Throwable {
        tkh tkhVar;
        boolean zG;
        Throwable th;
        okh okhVar;
        vkh<T> vkhVar;
        boolean z;
        if (x1bVar instanceof tkh) {
            tkhVar = (tkh) x1bVar;
            int i = tkhVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                tkhVar.f = i - Integer.MIN_VALUE;
            } else {
                tkhVar = new tkh(this, x1bVar);
            }
        } else {
            tkhVar = new tkh(this, x1bVar);
        }
        Object obj = tkhVar.d;
        Object obj2 = y5b.a;
        int i2 = tkhVar.f;
        if (i2 == 0) {
            uj50.b(obj);
            if (this.e.get()) {
                ib5.a("StorageConnection has already been disposed.");
                return null;
            }
            zG = this.f.g();
            try {
                okh okhVar2 = new okh(this.a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf(zG);
                    tkhVar.a = this;
                    tkhVar.b = okhVar2;
                    tkhVar.c = zG;
                    tkhVar.f = 1;
                    Object objInvoke = m1e0Var.invoke(okhVar2, boolValueOf, tkhVar);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    vkhVar = this;
                    z = zG;
                    obj = objInvoke;
                    okhVar = okhVar2;
                    okhVar.close();
                    th = null;
                    if (th != null) {
                        throw th;
                    }
                    if (z) {
                        vkhVar.f.f(null);
                    }
                    return obj;
                } catch (Throwable th2) {
                    th = th2;
                    okhVar = okhVar2;
                    okhVar.close();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = tkhVar.c;
            okhVar = tkhVar.b;
            vkhVar = tkhVar.a;
            try {
                uj50.b(obj);
                try {
                    okhVar.close();
                    th = null;
                } catch (Throwable th4) {
                    th = th4;
                }
                if (th != null) {
                    if (z) {
                        vkhVar.f.f(null);
                    }
                    return obj;
                }
                try {
                    throw th;
                } catch (Throwable th5) {
                    th = th5;
                    zG = z;
                    this = vkhVar;
                }
            } catch (Throwable th6) {
                zG = z;
                this = vkhVar;
                th = th6;
                try {
                    okhVar.close();
                    throw th;
                } catch (Throwable th7) {
                    rtg.a(th, th7);
                    throw th;
                }
            }
        }
        if (zG) {
            this.f.f(null);
        }
        throw th;
    }

    @Override // defpackage.l1e0
    public final wxo e() {
        return this.c;
    }
}
