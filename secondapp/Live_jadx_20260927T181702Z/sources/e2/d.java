package e2;

import android.util.AtomicFile;
import dr.w2;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nAtomicFile.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n1#1,76:1\n30#1,13:77\n*S KotlinDebug\n*F\n+ 1 AtomicFile.kt\nandroidx/core/util/AtomicFileKt\n*L\n48#1:77,13\n*E\n"})
public final class d {
    @oy.l
    public static final byte[] a(@oy.l AtomicFile atomicFile) {
        return atomicFile.readFully();
    }

    @oy.l
    public static final String b(@oy.l AtomicFile atomicFile, @oy.l Charset charset) {
        return new String(atomicFile.readFully(), charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        return b(atomicFile, charset);
    }

    public static final void d(@oy.l AtomicFile atomicFile, @oy.l ds.l<? super FileOutputStream, w2> lVar) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            lVar.invoke(fileOutputStreamStartWrite);
            kotlin.jvm.internal.j0.d(1);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } finally {
            kotlin.jvm.internal.j0.d(1);
            atomicFile.failWrite(fileOutputStreamStartWrite);
            kotlin.jvm.internal.j0.c(1);
        }
    }

    public static final void e(@oy.l AtomicFile atomicFile, @oy.l byte[] bArr) throws IOException {
        FileOutputStream fileOutputStreamStartWrite = atomicFile.startWrite();
        try {
            fileOutputStreamStartWrite.write(bArr);
            atomicFile.finishWrite(fileOutputStreamStartWrite);
        } catch (Throwable th2) {
            atomicFile.failWrite(fileOutputStreamStartWrite);
            throw th2;
        }
    }

    public static final void f(@oy.l AtomicFile atomicFile, @oy.l String str, @oy.l Charset charset) throws IOException {
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.m0.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            charset = cv.g.f77202b;
        }
        f(atomicFile, str, charset);
    }
}
