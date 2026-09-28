package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class jkw implements wxo {
    public static final a j = new a();
    public final CoroutineContext a;
    public final File b;
    public final v67 c;
    public final String d;
    public final String e;
    public final String f;
    public final tuw g;
    public final mpe0 h;
    public final mpe0 i;

    public static final class a {
        /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        
            r1 = r0.getMessage();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        
            if (r1 == null) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
        
            r11.a = r12;
            r11.b = r3;
            r11.e = 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x006e, code lost:
        
            if (defpackage.hkd.b(r3, r11) == r13) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
        
            return r13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
        
            throw r0;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006e -> B:27:0x0071). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.io.FileOutputStream r12, defpackage.x1b r13) throws java.io.IOException {
            /*
                r11 = this;
                boolean r0 = r13 instanceof defpackage.ikw
                if (r0 == 0) goto L13
                r0 = r13
                ikw r0 = (defpackage.ikw) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                ikw r0 = new ikw
                r0.<init>(r11, r13)
            L18:
                java.lang.Object r11 = r0.c
                y5b r13 = defpackage.y5b.a
                int r1 = r0.e
                r2 = 1
                if (r1 == 0) goto L33
                if (r1 != r2) goto L2c
                long r3 = r0.b
                java.io.FileOutputStream r12 = r0.a
                defpackage.uj50.b(r11)
                r11 = r0
                goto L71
            L2c:
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r11)
                r11 = 0
                return r11
            L33:
                defpackage.uj50.b(r11)
                r3 = 10
                r11 = r0
            L39:
                r0 = 60000(0xea60, double:2.9644E-319)
                int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r0 > 0) goto L76
                java.nio.channels.FileChannel r5 = r12.getChannel()     // Catch: java.io.IOException -> L54
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r0 = r5.lock(r6, r8, r10)     // Catch: java.io.IOException -> L54
                r0.getClass()     // Catch: java.io.IOException -> L54
                return r0
            L54:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                if (r1 == 0) goto L75
                java.lang.String r5 = "Resource deadlock would occur"
                r6 = 0
                boolean r1 = kotlin.text.StringsKt.M(r1, r5, r6)
                if (r1 != r2) goto L75
                r11.a = r12
                r11.b = r3
                r11.e = r2
                java.lang.Object r0 = defpackage.hkd.b(r3, r11)
                if (r0 != r13) goto L71
                return r13
            L71:
                r0 = 2
                long r3 = r3 * r0
                goto L39
            L75:
                throw r0
            L76:
                java.nio.channels.FileChannel r5 = r12.getChannel()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r10 = 0
                r6 = 0
                java.nio.channels.FileLock r11 = r5.lock(r6, r8, r10)
                r11.getClass()
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: jkw.a.a(java.io.FileOutputStream, x1b):java.lang.Object");
        }
    }

    public static final class b extends qlr implements Function0<s290> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final s290 invoke() throws Throwable {
            ParcelFileDescriptor parcelFileDescriptorOpen;
            System.loadLibrary("datastore_shared_counter");
            try {
                parcelFileDescriptorOpen = ParcelFileDescriptor.open((File) new mkw(jkw.this).invoke(), 939524096);
                try {
                    int fd = parcelFileDescriptorOpen.getFd();
                    NativeSharedCounter nativeSharedCounter = s290.b;
                    if (nativeSharedCounter.nativeTruncateFile(fd) != 0) {
                        throw new IOException("Failed to truncate counter file");
                    }
                    long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                    if (jNativeCreateSharedCounter < 0) {
                        throw new IOException("Failed to mmap counter file");
                    }
                    s290 s290Var = new s290(jNativeCreateSharedCounter);
                    parcelFileDescriptorOpen.close();
                    return s290Var;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptorOpen != null) {
                        parcelFileDescriptorOpen.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptorOpen = null;
            }
        }
    }

    public static final class c extends qlr implements Function0<File> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final File invoke() {
            jkw jkwVar = jkw.this;
            File file = new File(jkwVar.b.getAbsolutePath() + jkwVar.d);
            jkw.f(file);
            return file;
        }
    }

    public jkw(CoroutineContext coroutineContext, File file) {
        coroutineContext.getClass();
        this.a = coroutineContext;
        this.b = file;
        Object obj = bmw.b;
        this.c = hzh.b(new amw(file, null));
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = uuw.a();
        this.h = hwr.b(new c());
        this.i = hwr.b(new b());
    }

    public static void f(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                jre.a(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.wxo
    public final Object a(rrc rrcVar) {
        mpe0 mpe0Var = this.i;
        if (mpe0Var.a()) {
            return new Integer(s290.b.nativeIncrementAndGetCounterValue(((s290) mpe0Var.getValue()).a));
        }
        return ej5.d(this.a, new lkw(this, null), rrcVar);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc A[Catch: all -> 0x00e0, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f7 A[Catch: all -> 0x00e0, TRY_ENTER, TryCatch #1 {all -> 0x00e0, blocks: (B:61:0x00dc, B:75:0x00f7, B:76:0x00fa), top: B:88:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v13, types: [tuw] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [quw] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, okw] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [quw] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.Closeable, java.lang.Object, y5b] */
    @Override // defpackage.wxo
    public final Object b(Function2 function2, x1b x1bVar) throws Throwable {
        ?? okwVar;
        ?? r1;
        ?? r2;
        String message;
        FileLock fileLockTryLock;
        FileLock fileLock;
        FileInputStream fileInputStream;
        ?? r3;
        ?? r4;
        if (x1bVar instanceof okw) {
            okw okwVar2 = (okw) x1bVar;
            int i = okwVar2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                okwVar2.i = i - Integer.MIN_VALUE;
                okwVar = okwVar2;
            } else {
                okwVar = new okw(this, x1bVar);
            }
        } else {
            okwVar = new okw(this, x1bVar);
        }
        Object objInvoke = okwVar.e;
        ?? r5 = y5b.a;
        int i2 = okwVar.i;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                tuw tuwVar = this.g;
                boolean zG = tuwVar.g();
                try {
                    if (zG) {
                        FileInputStream fileInputStream2 = new FileInputStream((File) this.h.getValue());
                        try {
                            try {
                                fileLockTryLock = fileInputStream2.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th) {
                                th = th;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            String message2 = e.getMessage();
                            if ((message2 == null || !kotlin.text.c.u(message2, this.f, false)) && ((message = e.getMessage()) == null || !kotlin.text.c.u(message, "Resource deadlock would occur", false))) {
                                throw e;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            okwVar.a = tuwVar;
                            okwVar.b = fileInputStream2;
                            okwVar.c = fileLockTryLock;
                            okwVar.d = zG;
                            okwVar.i = 2;
                            objInvoke = function2.invoke(boolValueOf, okwVar);
                            if (objInvoke != r5) {
                                fileLock = fileLockTryLock;
                                okwVar = tuwVar;
                                r1 = zG;
                                fileInputStream = fileInputStream2;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                ft7.a(fileInputStream, null);
                                if (r1 != 0) {
                                    okwVar.f(null);
                                }
                                return objInvoke;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        okwVar.a = tuwVar;
                        okwVar.d = zG;
                        okwVar.i = 1;
                        objInvoke = function2.invoke(bool, okwVar);
                        if (objInvoke != r5) {
                            r3 = tuwVar;
                            r4 = zG;
                            if (r4 != 0) {
                                r3.f(null);
                            }
                            return objInvoke;
                        }
                    }
                    return r5;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = tuwVar;
                    r1 = zG;
                }
            } else if (i2 == 1) {
                r1 = okwVar.d;
                r2 = okwVar.a;
                try {
                    uj50.b(objInvoke);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.f(null);
                    }
                    return objInvoke;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = okwVar.d;
                fileLock = okwVar.c;
                fileInputStream = okwVar.b;
                tuw tuwVar2 = okwVar.a;
                try {
                    uj50.b(objInvoke);
                    r1 = z;
                    okwVar = tuwVar2;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        ft7.a(fileInputStream, null);
                        if (r1 != 0) {
                            okwVar.f(null);
                        }
                        return objInvoke;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    ft7.a(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = okwVar;
        if (r1 != 0) {
            r2.f(null);
        }
        throw th;
    }

    @Override // defpackage.wxo
    public final lyh<Unit> c() {
        return this.c;
    }

    @Override // defpackage.wxo
    public final Object d(x1b x1bVar) {
        mpe0 mpe0Var = this.i;
        if (mpe0Var.a()) {
            return new Integer(s290.b.nativeGetCounterValue(((s290) mpe0Var.getValue()).a));
        }
        return ej5.d(this.a, new kkw(this, null), x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:41:0x00bb, B:55:0x00d9, B:56:0x00dc), top: B:77:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:41:0x00bb, B:55:0x00d9, B:56:0x00dc), top: B:77:0x0022, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [quw] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [quw] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v25, types: [quw] */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.Closeable, java.lang.Object, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // defpackage.wxo
    public final Object e(Function1 function1, x1b x1bVar) throws Throwable {
        nkw nkwVar;
        tuw tuwVar;
        ?? r9;
        FileOutputStream fileOutputStream;
        Throwable th;
        ?? r10;
        ?? r8;
        ?? r2;
        Closeable closeable;
        FileLock fileLock;
        FileLock fileLock2;
        Object objInvoke;
        ?? r0;
        ?? r11;
        if (x1bVar instanceof nkw) {
            nkwVar = (nkw) x1bVar;
            int i = nkwVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                nkwVar.f = i - Integer.MIN_VALUE;
            } else {
                nkwVar = new nkw(this, x1bVar);
            }
        } else {
            nkwVar = new nkw(this, x1bVar);
        }
        ?? r12 = nkwVar.d;
        y5b y5bVar = y5b.a;
        int i2 = nkwVar.f;
        try {
            try {
                try {
                    if (i2 == 0) {
                        uj50.b(r12);
                        nkwVar.a = this;
                        nkwVar.b = function1;
                        tuwVar = this.g;
                        nkwVar.c = tuwVar;
                        nkwVar.f = 1;
                        if (tuwVar.d(nkwVar) != y5bVar) {
                        }
                        r9 = function1;
                        r12 = tuwVar;
                        return y5bVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                ib5.a("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) nkwVar.c;
                            closeable = (Closeable) nkwVar.b;
                            quw quwVar = (quw) nkwVar.a;
                            try {
                                uj50.b(r12);
                                r0 = quwVar;
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    ft7.a(closeable, null);
                                    r0.f(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = r0;
                                    r12.f(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) nkwVar.c;
                        r8 = (quw) nkwVar.b;
                        Function1 function2 = (Function1) nkwVar.a;
                        try {
                            uj50.b(r12);
                            r2 = function2;
                            r8 = r8;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                nkwVar.a = r8;
                                nkwVar.b = closeable;
                                nkwVar.c = fileLock2;
                                nkwVar.f = 3;
                                objInvoke = r2.invoke(nkwVar);
                                if (objInvoke != y5bVar) {
                                    r0 = r8;
                                    fileLock = fileLock2;
                                    r11 = objInvoke;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    ft7.a(closeable, null);
                                    r0.f(null);
                                    return r11;
                                }
                                r9 = function1;
                                r12 = tuwVar;
                                return y5bVar;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    quw quwVar2 = (quw) nkwVar.c;
                    Function1 function3 = (Function1) nkwVar.b;
                    jkw jkwVar = (jkw) nkwVar.a;
                    uj50.b(r12);
                    r12 = quwVar2;
                    this = jkwVar;
                    r9 = function3;
                    a aVar = j;
                    nkwVar.a = r9;
                    nkwVar.b = r12;
                    nkwVar.c = fileOutputStream;
                    nkwVar.f = 2;
                    Object objA = aVar.a(fileOutputStream, nkwVar);
                    if (objA != y5bVar) {
                        ?? r7 = r12;
                        r10 = objA;
                        r8 = r7;
                        r2 = r9;
                        closeable = fileOutputStream;
                        fileLock2 = (FileLock) r10;
                        nkwVar.a = r8;
                        nkwVar.b = closeable;
                        nkwVar.c = fileLock2;
                        nkwVar.f = 3;
                        objInvoke = r2.invoke(nkwVar);
                        if (objInvoke != y5bVar) {
                            r0 = r8;
                            fileLock = fileLock2;
                            r11 = objInvoke;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            ft7.a(closeable, null);
                            r0.f(null);
                            return r11;
                        }
                    }
                    r9 = function1;
                    r12 = tuwVar;
                    return y5bVar;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r9 = function1;
                r12 = tuwVar;
                fileOutputStream = new FileOutputStream((File) this.h.getValue());
            } catch (Throwable th7) {
                th = th7;
                r12.f(null);
                throw th;
            }
        } catch (Throwable th8) {
            r12 = nkwVar;
            try {
                throw th8;
            } catch (Throwable th9) {
                ft7.a(function1, th8);
                throw th9;
            }
        }
    }
}
