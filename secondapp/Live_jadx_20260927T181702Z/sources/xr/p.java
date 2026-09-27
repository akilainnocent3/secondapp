package xr;

import dr.w2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,290:1\n1#2:291\n*E\n"})
public class p extends n {
    public static /* synthetic */ List A(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        return z(file, charset);
    }

    public static final w2 B(ArrayList arrayList, String it) {
        m0.p(it, "it");
        arrayList.add(it);
        return w2.f79517a;
    }

    @oy.l
    public static String C(@oy.l File file, @oy.l Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strM = b0.m(inputStreamReader);
            c.a(inputStreamReader, null);
            return strM;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(inputStreamReader, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ String D(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        return C(file, charset);
    }

    @ur.f
    public static final InputStreamReader E(File file, Charset charset) {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader F(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T G(@oy.l File file, @oy.l Charset charset, @oy.l ds.l<? super zu.m<String>, ? extends T> block) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        m0.p(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            T tInvoke = block.invoke(b0.i(bufferedReader));
            j0.d(1);
            c.a(bufferedReader, null);
            j0.c(1);
            return tInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                j0.d(1);
                c.a(bufferedReader, th2);
                j0.c(1);
                throw th3;
            }
        }
    }

    public static /* synthetic */ Object H(File file, Charset charset, ds.l block, int i10, Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        m0.p(block, "block");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), 8192);
        try {
            Object objInvoke = block.invoke(b0.i(bufferedReader));
            j0.d(1);
            c.a(bufferedReader, null);
            j0.c(1);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                j0.d(1);
                c.a(bufferedReader, th2);
                j0.c(1);
                throw th3;
            }
        }
    }

    public static void I(@oy.l File file, @oy.l byte[] array) {
        m0.p(file, "<this>");
        m0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            w2 w2Var = w2.f79517a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static void J(@oy.l File file, @oy.l String text, @oy.l Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(text, "text");
        m0.p(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            L(fileOutputStream, text, charset);
            w2 w2Var = w2.f79517a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void K(File file, String str, Charset charset, int i10, Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        if ((i10 & 2) != 0) {
            charset = cv.g.f77202b;
        }
        J(file, str, charset);
    }

    public static void L(@oy.l OutputStream outputStream, @oy.l String text, @oy.l Charset charset) throws IOException {
        m0.p(outputStream, "<this>");
        m0.p(text, "text");
        m0.p(charset, "charset");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            m0.o(bytes, "getBytes(...)");
            outputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderU = u(charset);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        m0.m(charsetEncoderU);
        ByteBuffer byteBufferO = o(8192, charsetEncoderU);
        int i10 = 0;
        int i11 = 0;
        while (i10 < text.length()) {
            int iMin = Math.min(8192 - i11, text.length() - i10);
            int i12 = i10 + iMin;
            char[] cArrArray = charBufferAllocate.array();
            m0.o(cArrArray, "array(...)");
            text.getChars(i10, i12, cArrArray, i11);
            charBufferAllocate.limit(iMin + i11);
            i11 = 1;
            if (!charsetEncoderU.encode(charBufferAllocate, byteBufferO, i12 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            outputStream.write(byteBufferO.array(), 0, byteBufferO.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i11 = 0;
            }
            charBufferAllocate.clear();
            byteBufferO.clear();
            i10 = i12;
        }
    }

    @ur.f
    public static final OutputStreamWriter M(File file, Charset charset) {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter N(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static void h(@oy.l File file, @oy.l byte[] array) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(array);
            w2 w2Var = w2.f79517a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static void i(@oy.l File file, @oy.l String text, @oy.l Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(text, "text");
        m0.p(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            L(fileOutputStream, text, charset);
            w2 w2Var = w2.f79517a;
            c.a(fileOutputStream, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public static /* synthetic */ void j(File file, String str, Charset charset, int i10, Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        if ((i10 & 2) != 0) {
            charset = cv.g.f77202b;
        }
        i(file, str, charset);
    }

    @ur.f
    public static final BufferedReader k(File file, Charset charset, int i10) {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i10);
    }

    public static /* synthetic */ BufferedReader l(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new BufferedReader(new InputStreamReader(new FileInputStream(file), charset), i10);
    }

    @ur.f
    public static final BufferedWriter m(File file, Charset charset, int i10) {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i10);
    }

    public static /* synthetic */ BufferedWriter n(File file, Charset charset, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        if ((i11 & 2) != 0) {
            i10 = 8192;
        }
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), i10);
    }

    @oy.l
    public static ByteBuffer o(int i10, @oy.l CharsetEncoder encoder) {
        m0.p(encoder, "encoder");
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10 * ((int) Math.ceil(encoder.maxBytesPerChar())));
        m0.o(byteBufferAllocate, "allocate(...)");
        return byteBufferAllocate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [byte[], java.lang.Object] */
    public static final void p(@oy.l File file, int i10, @oy.l ds.p<? super byte[], ? super Integer, w2> action) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(action, "action");
        ?? r10 = new byte[ms.u.u(i10, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i11 = fileInputStream.read(r10);
                if (i11 <= 0) {
                    w2 w2Var = w2.f79517a;
                    c.a(fileInputStream, null);
                    return;
                }
                action.invoke(r10, Integer.valueOf(i11));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    c.a(fileInputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public static final void q(@oy.l File file, @oy.l ds.p<? super byte[], ? super Integer, w2> action) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(action, "action");
        p(file, 4096, action);
    }

    public static final void r(@oy.l File file, @oy.l Charset charset, @oy.l ds.l<? super String, w2> action) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        m0.p(action, "action");
        b0.h(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), action);
    }

    public static /* synthetic */ void s(File file, Charset charset, ds.l lVar, int i10, Object obj) throws IllegalAccessException, IOException, InvocationTargetException {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        r(file, charset, lVar);
    }

    @ur.f
    public static final FileInputStream t(File file) {
        m0.p(file, "<this>");
        return new FileInputStream(file);
    }

    public static CharsetEncoder u(@oy.l Charset charset) {
        m0.p(charset, "<this>");
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        return charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
    }

    @ur.f
    public static final FileOutputStream v(File file) {
        m0.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @ur.f
    public static final PrintWriter w(File file, Charset charset) {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    public static /* synthetic */ PrintWriter x(File file, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = cv.g.f77202b;
        }
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        return new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), charset), 8192));
    }

    @oy.l
    public static byte[] y(@oy.l File file) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i10 = (int) length;
            byte[] bArrV0 = new byte[i10];
            int i11 = i10;
            int i12 = 0;
            while (i11 > 0) {
                int i13 = fileInputStream.read(bArrV0, i12, i11);
                if (i13 < 0) {
                    break;
                }
                i11 -= i13;
                i12 += i13;
            }
            if (i11 > 0) {
                bArrV0 = Arrays.copyOf(bArrV0, i12);
                m0.o(bArrV0, "copyOf(...)");
            } else {
                int i14 = fileInputStream.read();
                if (i14 != -1) {
                    g gVar = new g(8193);
                    gVar.write(i14);
                    b.l(fileInputStream, gVar, 0, 2, null);
                    int size = gVar.size() + i10;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrD = gVar.d();
                    byte[] bArrCopyOf = Arrays.copyOf(bArrV0, size);
                    m0.o(bArrCopyOf, "copyOf(...)");
                    bArrV0 = fr.q.v0(bArrD, bArrCopyOf, i10, 0, gVar.size());
                }
            }
            c.a(fileInputStream, null);
            return bArrV0;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                c.a(fileInputStream, th2);
                throw th3;
            }
        }
    }

    @oy.l
    public static final List<String> z(@oy.l File file, @oy.l Charset charset) throws IllegalAccessException, IOException, InvocationTargetException {
        m0.p(file, "<this>");
        m0.p(charset, "charset");
        final ArrayList arrayList = new ArrayList();
        r(file, charset, new ds.l() { // from class: xr.o
            @Override // ds.l
            public final Object invoke(Object obj) {
                return p.B(arrayList, (String) obj);
            }
        });
        return arrayList;
    }
}
