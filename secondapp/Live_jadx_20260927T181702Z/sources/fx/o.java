package fx;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
@s1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n42#2,7:365\n52#2:372\n55#2:373\n62#2,4:374\n66#2:379\n68#2:381\n74#2,23:382\n102#2,23:405\n129#2,2:428\n131#2,9:431\n143#2:440\n146#2:441\n149#2:442\n152#2:443\n160#2:444\n170#2,3:445\n169#2:448\n183#2,2:449\n188#2:451\n192#2:452\n196#2:453\n200#2:454\n204#2,7:455\n217#2:462\n221#2,8:463\n233#2,4:471\n242#2,5:475\n251#2,6:480\n257#2,9:487\n301#2,8:496\n129#2,2:504\n131#2,9:507\n312#2,9:516\n67#3:378\n73#3:380\n73#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
public class o implements Serializable, Comparable<o> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f85658f = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    public final byte[] f85660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient int f85661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public transient String f85662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final a f85657e = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final o f85659g = new o(new byte[0]);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 ByteStringNonJs.kt\nokio/internal/-ByteStringNonJs\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n269#2:365\n273#2,3:366\n280#2,3:369\n287#2,2:372\n25#3:374\n27#3,7:376\n1#4:375\n1#4:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static /* synthetic */ o k(a aVar, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = cv.g.f77202b;
            }
            return aVar.j(str, charset);
        }

        public static /* synthetic */ o p(a aVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = i.f();
            }
            return aVar.o(bArr, i10, i11);
        }

        @cs.j(name = "-deprecated_decodeBase64")
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "string.decodeBase64()", imports = {"okio.ByteString.Companion.decodeBase64"}))
        @oy.m
        public final o a(@oy.l String string) {
            kotlin.jvm.internal.m0.p(string, "string");
            return h(string);
        }

        @cs.j(name = "-deprecated_decodeHex")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "string.decodeHex()", imports = {"okio.ByteString.Companion.decodeHex"}))
        public final o b(@oy.l String string) {
            kotlin.jvm.internal.m0.p(string, "string");
            return i(string);
        }

        @cs.j(name = "-deprecated_encodeString")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "string.encode(charset)", imports = {"okio.ByteString.Companion.encode"}))
        public final o c(@oy.l String string, @oy.l Charset charset) {
            kotlin.jvm.internal.m0.p(string, "string");
            kotlin.jvm.internal.m0.p(charset, "charset");
            return j(string, charset);
        }

        @cs.j(name = "-deprecated_encodeUtf8")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "string.encodeUtf8()", imports = {"okio.ByteString.Companion.encodeUtf8"}))
        public final o d(@oy.l String string) {
            kotlin.jvm.internal.m0.p(string, "string");
            return l(string);
        }

        @cs.j(name = "-deprecated_of")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "buffer.toByteString()", imports = {"okio.ByteString.Companion.toByteString"}))
        public final o e(@oy.l ByteBuffer buffer) {
            kotlin.jvm.internal.m0.p(buffer, "buffer");
            return m(buffer);
        }

        @cs.j(name = "-deprecated_of")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "array.toByteString(offset, byteCount)", imports = {"okio.ByteString.Companion.toByteString"}))
        public final o f(@oy.l byte[] array, int i10, int i11) {
            kotlin.jvm.internal.m0.p(array, "array");
            return o(array, i10, i11);
        }

        @cs.j(name = "-deprecated_read")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @dr.g1(expression = "inputstream.readByteString(byteCount)", imports = {"okio.ByteString.Companion.readByteString"}))
        public final o g(@oy.l InputStream inputstream, int i10) {
            kotlin.jvm.internal.m0.p(inputstream, "inputstream");
            return q(inputstream, i10);
        }

        @cs.o
        @oy.m
        public final o h(@oy.l String str) {
            kotlin.jvm.internal.m0.p(str, "<this>");
            byte[] bArrA = fx.a.a(str);
            if (bArrA != null) {
                return new o(bArrA);
            }
            return null;
        }

        @oy.l
        @cs.o
        public final o i(@oy.l String str) {
            kotlin.jvm.internal.m0.p(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((gx.d.c(str.charAt(i11)) << 4) + gx.d.c(str.charAt(i11 + 1)));
            }
            return new o(bArr);
        }

        @cs.j(name = "encodeString")
        @oy.l
        @cs.o
        public final o j(@oy.l String str, @oy.l Charset charset) {
            kotlin.jvm.internal.m0.p(str, "<this>");
            kotlin.jvm.internal.m0.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            kotlin.jvm.internal.m0.o(bytes, "getBytes(...)");
            return new o(bytes);
        }

        @oy.l
        @cs.o
        public final o l(@oy.l String str) {
            kotlin.jvm.internal.m0.p(str, "<this>");
            o oVar = new o(k1.a(str));
            oVar.g0(str);
            return oVar;
        }

        @cs.j(name = "of")
        @oy.l
        @cs.o
        public final o m(@oy.l ByteBuffer byteBuffer) {
            kotlin.jvm.internal.m0.p(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new o(bArr);
        }

        @oy.l
        @cs.o
        public final o n(@oy.l byte... data) {
            kotlin.jvm.internal.m0.p(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
            return new o(bArrCopyOf);
        }

        @cs.j(name = "of")
        @oy.l
        @cs.o
        public final o o(@oy.l byte[] bArr, int i10, int i11) {
            kotlin.jvm.internal.m0.p(bArr, "<this>");
            int iL = i.l(bArr, i11);
            i.e(bArr.length, i10, iL);
            return new o(fr.q.f1(bArr, i10, iL + i10));
        }

        @cs.j(name = "read")
        @oy.l
        @cs.o
        public final o q(@oy.l InputStream inputStream, int i10) throws IOException {
            kotlin.jvm.internal.m0.p(inputStream, "<this>");
            if (i10 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + i10).toString());
            }
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = inputStream.read(bArr, i11, i10 - i11);
                if (i12 == -1) {
                    throw new EOFException();
                }
                i11 += i12;
            }
            return new o(bArr);
        }

        public a() {
        }
    }

    public o(@oy.l byte[] data) {
        kotlin.jvm.internal.m0.p(data, "data");
        this.f85660b = data;
    }

    public static /* synthetic */ int M(o oVar, o oVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.I(oVar2, i10);
    }

    public static /* synthetic */ int N(o oVar, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.K(bArr, i10);
    }

    public static /* synthetic */ int U(o oVar, o oVar2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = i.f();
        }
        return oVar.R(oVar2, i10);
    }

    public static /* synthetic */ int V(o oVar, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = i.f();
        }
        return oVar.T(bArr, i10);
    }

    @cs.j(name = "of")
    @oy.l
    @cs.o
    public static final o Y(@oy.l ByteBuffer byteBuffer) {
        return f85657e.m(byteBuffer);
    }

    @oy.l
    @cs.o
    public static final o Z(@oy.l byte... bArr) {
        return f85657e.n(bArr);
    }

    @cs.j(name = "of")
    @oy.l
    @cs.o
    public static final o a0(@oy.l byte[] bArr, int i10, int i11) {
        return f85657e.o(bArr, i10, i11);
    }

    @cs.j(name = "read")
    @oy.l
    @cs.o
    public static final o d0(@oy.l InputStream inputStream, int i10) throws IOException {
        return f85657e.q(inputStream, i10);
    }

    public static /* synthetic */ void l(o oVar, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        oVar.k(i10, bArr, i11, i12);
    }

    @cs.o
    @oy.m
    public static final o m(@oy.l String str) {
        return f85657e.h(str);
    }

    @oy.l
    @cs.o
    public static final o n(@oy.l String str) {
        return f85657e.i(str);
    }

    @cs.j(name = "encodeString")
    @oy.l
    @cs.o
    public static final o q(@oy.l String str, @oy.l Charset charset) {
        return f85657e.j(str, charset);
    }

    public static /* synthetic */ o r0(o oVar, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = i.f();
        }
        return oVar.q0(i10, i11);
    }

    @oy.l
    @cs.o
    public static final o s(@oy.l String str) {
        return f85657e.l(str);
    }

    @oy.l
    public String A() {
        char[] cArr = new char[w().length * 2];
        int i10 = 0;
        for (byte b10 : w()) {
            int i11 = i10 + 1;
            cArr[i10] = gx.c.G()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = gx.c.G()[b10 & zi.c.f161639q];
        }
        return cv.k0.L1(cArr);
    }

    @oy.l
    public o B(@oy.l String algorithm, @oy.l o key) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.m0.p(algorithm, "algorithm");
        kotlin.jvm.internal.m0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.u0(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.f85660b);
            kotlin.jvm.internal.m0.o(bArrDoFinal, "doFinal(...)");
            return new o(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @oy.l
    public o C(@oy.l o key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return B("HmacSHA1", key);
    }

    @oy.l
    public o E(@oy.l o key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return B("HmacSHA256", key);
    }

    @oy.l
    public o G(@oy.l o key) {
        kotlin.jvm.internal.m0.p(key, "key");
        return B("HmacSHA512", key);
    }

    @cs.k
    public final int H(@oy.l o other) {
        kotlin.jvm.internal.m0.p(other, "other");
        return M(this, other, 0, 2, null);
    }

    @cs.k
    public final int I(@oy.l o other, int i10) {
        kotlin.jvm.internal.m0.p(other, "other");
        return K(other.O(), i10);
    }

    @cs.k
    public final int J(@oy.l byte[] other) {
        kotlin.jvm.internal.m0.p(other, "other");
        return N(this, other, 0, 2, null);
    }

    @cs.k
    public int K(@oy.l byte[] other, int i10) {
        kotlin.jvm.internal.m0.p(other, "other");
        int length = w().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!i.d(w(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @oy.l
    public byte[] O() {
        return w();
    }

    public byte P(int i10) {
        return w()[i10];
    }

    @cs.k
    public final int Q(@oy.l o other) {
        kotlin.jvm.internal.m0.p(other, "other");
        return U(this, other, 0, 2, null);
    }

    @cs.k
    public final int R(@oy.l o other, int i10) {
        kotlin.jvm.internal.m0.p(other, "other");
        return T(other.O(), i10);
    }

    @cs.k
    public final int S(@oy.l byte[] other) {
        kotlin.jvm.internal.m0.p(other, "other");
        return V(this, other, 0, 2, null);
    }

    @cs.k
    public int T(@oy.l byte[] other, int i10) {
        kotlin.jvm.internal.m0.p(other, "other");
        for (int iMin = Math.min(i.k(this, i10), w().length - other.length); -1 < iMin; iMin--) {
            if (i.d(w(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }

    @oy.l
    public final o X() {
        return o("MD5");
    }

    @cs.j(name = "-deprecated_getByte")
    @dr.o(level = dr.q.ERROR, message = "moved to operator function", replaceWith = @dr.g1(expression = "this[index]", imports = {}))
    public final byte a(int i10) {
        return v(i10);
    }

    public boolean b0(int i10, @oy.l o other, int i11, int i12) {
        kotlin.jvm.internal.m0.p(other, "other");
        return other.c0(i11, w(), i10, i12);
    }

    public boolean c0(int i10, @oy.l byte[] other, int i11, int i12) {
        kotlin.jvm.internal.m0.p(other, "other");
        return i10 >= 0 && i10 <= w().length - i12 && i11 >= 0 && i11 <= other.length - i12 && i.d(w(), i10, other, i11, i12);
    }

    @cs.j(name = "-deprecated_size")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @dr.g1(expression = "size", imports = {}))
    public final int d() {
        return k0();
    }

    public final void e0(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        o oVarQ = f85657e.q(objectInputStream, objectInputStream.readInt());
        Field declaredField = o.class.getDeclaredField("b");
        declaredField.setAccessible(true);
        declaredField.set(this, oVarQ.f85660b);
    }

    public boolean equals(@oy.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (oVar.k0() == w().length && oVar.c0(0, w(), 0, w().length)) {
                return true;
            }
        }
        return false;
    }

    public final void f0(int i10) {
        this.f85661c = i10;
    }

    @oy.l
    public ByteBuffer g() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.f85660b).asReadOnlyBuffer();
        kotlin.jvm.internal.m0.o(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    public final void g0(@oy.m String str) {
        this.f85662d = str;
    }

    @oy.l
    public String h() {
        return fx.a.c(w(), null, 1, null);
    }

    @oy.l
    public final o h0() {
        return o("SHA-1");
    }

    public int hashCode() {
        int iX = x();
        if (iX != 0) {
            return iX;
        }
        int iHashCode = Arrays.hashCode(w());
        f0(iHashCode);
        return iHashCode;
    }

    @oy.l
    public String i() {
        return fx.a.b(w(), fx.a.e());
    }

    @oy.l
    public final o i0() {
        return o(to.c.algoTypeS2);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public int compareTo(@oy.l o other) {
        kotlin.jvm.internal.m0.p(other, "other");
        int iK0 = k0();
        int iK1 = other.k0();
        int iMin = Math.min(iK0, iK1);
        for (int i10 = 0; i10 < iMin; i10++) {
            int iV = v(i10) & 255;
            int iV2 = other.v(i10) & 255;
            if (iV != iV2) {
                return iV < iV2 ? -1 : 1;
            }
        }
        if (iK0 == iK1) {
            return 0;
        }
        return iK0 < iK1 ? -1 : 1;
    }

    @oy.l
    public final o j0() {
        return o("SHA-512");
    }

    public void k(int i10, @oy.l byte[] target, int i11, int i12) {
        kotlin.jvm.internal.m0.p(target, "target");
        fr.q.v0(w(), target, i11, i10, i12 + i10);
    }

    @cs.j(name = "size")
    public final int k0() {
        return y();
    }

    public final boolean l0(@oy.l o prefix) {
        kotlin.jvm.internal.m0.p(prefix, "prefix");
        return b0(0, prefix, 0, prefix.k0());
    }

    public final boolean m0(@oy.l byte[] prefix) {
        kotlin.jvm.internal.m0.p(prefix, "prefix");
        return c0(0, prefix, 0, prefix.length);
    }

    @oy.l
    public String n0(@oy.l Charset charset) {
        kotlin.jvm.internal.m0.p(charset, "charset");
        return new String(this.f85660b, charset);
    }

    @oy.l
    public o o(@oy.l String algorithm) throws NoSuchAlgorithmException {
        kotlin.jvm.internal.m0.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.f85660b, 0, k0());
        byte[] bArrDigest = messageDigest.digest();
        kotlin.jvm.internal.m0.m(bArrDigest);
        return new o(bArrDigest);
    }

    @oy.l
    @cs.k
    public final o o0() {
        return r0(this, 0, 0, 3, null);
    }

    @oy.l
    @cs.k
    public final o p0(int i10) {
        return r0(this, i10, 0, 2, null);
    }

    @oy.l
    @cs.k
    public o q0(int i10, int i11) {
        int iK = i.k(this, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (iK <= w().length) {
            if (iK - i10 >= 0) {
                return (i10 == 0 && iK == w().length) ? this : new o(fr.q.f1(w(), i10, iK));
            }
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        throw new IllegalArgumentException(("endIndex > length(" + w().length + ')').toString());
    }

    @oy.l
    public o s0() {
        for (int i10 = 0; i10 < w().length; i10++) {
            byte b10 = w()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] bArrW = w();
                byte[] bArrCopyOf = Arrays.copyOf(bArrW, bArrW.length);
                kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new o(bArrCopyOf);
            }
        }
        return this;
    }

    public final boolean t(@oy.l o suffix) {
        kotlin.jvm.internal.m0.p(suffix, "suffix");
        return b0(k0() - suffix.k0(), suffix, 0, suffix.k0());
    }

    @oy.l
    public o t0() {
        for (int i10 = 0; i10 < w().length; i10++) {
            byte b10 = w()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] bArrW = w();
                byte[] bArrCopyOf = Arrays.copyOf(bArrW, bArrW.length);
                kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new o(bArrCopyOf);
            }
        }
        return this;
    }

    @oy.l
    public String toString() {
        if (w().length == 0) {
            return "[size=0]";
        }
        int iB = gx.c.b(w(), 64);
        if (iB != -1) {
            String strW0 = w0();
            String strSubstring = strW0.substring(0, iB);
            kotlin.jvm.internal.m0.o(strSubstring, "substring(...)");
            String strZ2 = cv.k0.z2(cv.k0.z2(cv.k0.z2(strSubstring, ce.a.f23003h, "\\\\", false, 4, null), IOUtils.LINE_SEPARATOR_UNIX, "\\n", false, 4, null), za.h.f160939d, "\\r", false, 4, null);
            if (iB >= strW0.length()) {
                return "[text=" + strZ2 + fw.b.f85385l;
            }
            return "[size=" + w().length + " text=" + strZ2 + "…]";
        }
        if (w().length <= 64) {
            return "[hex=" + A() + fw.b.f85385l;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(w().length);
        sb2.append(" hex=");
        int iK = i.k(this, 64);
        if (iK <= w().length) {
            if (iK < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iK == w().length ? this : new o(fr.q.f1(w(), 0, iK))).A());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + w().length + ')').toString());
    }

    public final boolean u(@oy.l byte[] suffix) {
        kotlin.jvm.internal.m0.p(suffix, "suffix");
        return c0(k0() - suffix.length, suffix, 0, suffix.length);
    }

    @oy.l
    public byte[] u0() {
        byte[] bArrW = w();
        byte[] bArrCopyOf = Arrays.copyOf(bArrW, bArrW.length);
        kotlin.jvm.internal.m0.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @cs.j(name = "getByte")
    public final byte v(int i10) {
        return P(i10);
    }

    @oy.l
    public final byte[] w() {
        return this.f85660b;
    }

    @oy.l
    public String w0() {
        String strZ = z();
        if (strZ != null) {
            return strZ;
        }
        String strC = k1.c(O());
        g0(strC);
        return strC;
    }

    public final int x() {
        return this.f85661c;
    }

    public void x0(@oy.l OutputStream out) throws IOException {
        kotlin.jvm.internal.m0.p(out, "out");
        out.write(this.f85660b);
    }

    public int y() {
        return w().length;
    }

    public void y0(@oy.l l buffer, int i10, int i11) {
        kotlin.jvm.internal.m0.p(buffer, "buffer");
        gx.c.F(this, buffer, i10, i11);
    }

    @oy.m
    public final String z() {
        return this.f85662d;
    }

    public final void z0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.f85660b.length);
        objectOutputStream.write(this.f85660b);
    }
}
