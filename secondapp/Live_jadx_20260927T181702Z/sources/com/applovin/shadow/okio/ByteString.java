package com.applovin.shadow.okio;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import cv.k0;
import dr.g1;
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
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n43#2,7:365\n53#2:372\n56#2:373\n64#2,4:374\n68#2:379\n70#2:381\n76#2,23:382\n104#2,23:405\n131#2,2:428\n133#2,9:431\n145#2:440\n148#2:441\n151#2:442\n154#2:443\n162#2:444\n172#2,3:445\n171#2:448\n185#2,2:449\n190#2:451\n194#2:452\n198#2:453\n202#2:454\n206#2,7:455\n219#2:462\n223#2,8:463\n235#2,4:471\n244#2,5:475\n253#2,6:480\n259#2,9:487\n322#2,8:496\n131#2,2:504\n133#2,9:507\n333#2,9:516\n68#3:378\n74#3:380\n74#3:486\n1#4:430\n1#4:506\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString\n*L\n66#1:365,7\n71#1:372\n108#1:373\n110#1:374,4\n110#1:379\n110#1:381\n112#1:382,23\n114#1:405,23\n118#1:428,2\n118#1:431,9\n120#1:440\n129#1:441\n131#1:442\n133#1:443\n152#1:444\n159#1:445,3\n159#1:448\n166#1:449,2\n168#1:451\n170#1:452\n172#1:453\n174#1:454\n180#1:455,7\n183#1:462\n186#1:463,8\n188#1:471,4\n190#1:475,5\n192#1:480,6\n192#1:487,9\n194#1:496,8\n194#1:504,2\n194#1:507,9\n194#1:516,9\n110#1:378\n110#1:380\n192#1:486\n118#1:430\n194#1:506\n*E\n"})
public class ByteString implements Serializable, Comparable<ByteString> {

    @oy.l
    public static final Companion Companion = new Companion(null);

    @oy.l
    @cs.g
    public static final ByteString EMPTY = new ByteString(new byte[0]);
    private static final long serialVersionUID = 1;

    @oy.l
    private final byte[] data;
    private transient int hashCode;

    @oy.m
    private transient String utf8;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n+ 2 ByteString.kt\nokio/internal/-ByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,364:1\n271#2:365\n275#2,3:366\n282#2,3:369\n289#2,2:372\n295#2:374\n297#2,7:376\n1#3:375\n1#3:383\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/ByteString$Companion\n*L\n234#1:365\n239#1:366,3\n251#1:369,3\n259#1:372,2\n262#1:374\n262#1:376,7\n262#1:375\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.x xVar) {
            this();
        }

        public static /* synthetic */ ByteString encodeString$default(Companion companion, String str, Charset charset, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                charset = cv.g.f77202b;
            }
            return companion.encodeString(str, charset);
        }

        public static /* synthetic */ ByteString of$default(Companion companion, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = SegmentedByteString.getDEFAULT__ByteString_size();
            }
            return companion.of(bArr, i10, i11);
        }

        @cs.j(name = "-deprecated_decodeBase64")
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "string.decodeBase64()", imports = {"com.applovin.shadow.okio.ByteString.Companion.decodeBase64"}))
        @oy.m
        /* JADX INFO: renamed from: -deprecated_decodeBase64, reason: not valid java name */
        public final ByteString m142deprecated_decodeBase64(@oy.l String string) {
            m0.p(string, "string");
            return decodeBase64(string);
        }

        @cs.j(name = "-deprecated_decodeHex")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "string.decodeHex()", imports = {"com.applovin.shadow.okio.ByteString.Companion.decodeHex"}))
        /* JADX INFO: renamed from: -deprecated_decodeHex, reason: not valid java name */
        public final ByteString m143deprecated_decodeHex(@oy.l String string) {
            m0.p(string, "string");
            return decodeHex(string);
        }

        @cs.j(name = "-deprecated_encodeString")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "string.encode(charset)", imports = {"com.applovin.shadow.okio.ByteString.Companion.encode"}))
        /* JADX INFO: renamed from: -deprecated_encodeString, reason: not valid java name */
        public final ByteString m144deprecated_encodeString(@oy.l String string, @oy.l Charset charset) {
            m0.p(string, "string");
            m0.p(charset, "charset");
            return encodeString(string, charset);
        }

        @cs.j(name = "-deprecated_encodeUtf8")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "string.encodeUtf8()", imports = {"com.applovin.shadow.okio.ByteString.Companion.encodeUtf8"}))
        /* JADX INFO: renamed from: -deprecated_encodeUtf8, reason: not valid java name */
        public final ByteString m145deprecated_encodeUtf8(@oy.l String string) {
            m0.p(string, "string");
            return encodeUtf8(string);
        }

        @cs.j(name = "-deprecated_of")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "buffer.toByteString()", imports = {"com.applovin.shadow.okio.ByteString.Companion.toByteString"}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m146deprecated_of(@oy.l ByteBuffer buffer) {
            m0.p(buffer, "buffer");
            return of(buffer);
        }

        @cs.j(name = "-deprecated_read")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "inputstream.readByteString(byteCount)", imports = {"com.applovin.shadow.okio.ByteString.Companion.readByteString"}))
        /* JADX INFO: renamed from: -deprecated_read, reason: not valid java name */
        public final ByteString m148deprecated_read(@oy.l InputStream inputstream, int i10) {
            m0.p(inputstream, "inputstream");
            return read(inputstream, i10);
        }

        @cs.o
        @oy.m
        public final ByteString decodeBase64(@oy.l String str) {
            m0.p(str, "<this>");
            byte[] bArrDecodeBase64ToArray = Base64.decodeBase64ToArray(str);
            if (bArrDecodeBase64ToArray != null) {
                return new ByteString(bArrDecodeBase64ToArray);
            }
            return null;
        }

        @oy.l
        @cs.o
        public final ByteString decodeHex(@oy.l String str) {
            m0.p(str, "<this>");
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException(("Unexpected hex string: " + str).toString());
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = i10 * 2;
                bArr[i10] = (byte) ((com.applovin.shadow.okio.internal.ByteString.decodeHexDigit(str.charAt(i11)) << 4) + com.applovin.shadow.okio.internal.ByteString.decodeHexDigit(str.charAt(i11 + 1)));
            }
            return new ByteString(bArr);
        }

        @cs.j(name = "encodeString")
        @oy.l
        @cs.o
        public final ByteString encodeString(@oy.l String str, @oy.l Charset charset) {
            m0.p(str, "<this>");
            m0.p(charset, "charset");
            byte[] bytes = str.getBytes(charset);
            m0.o(bytes, "this as java.lang.String).getBytes(charset)");
            return new ByteString(bytes);
        }

        @oy.l
        @cs.o
        public final ByteString encodeUtf8(@oy.l String str) {
            m0.p(str, "<this>");
            ByteString byteString = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(str));
            byteString.setUtf8$okio(str);
            return byteString;
        }

        @cs.j(name = "of")
        @oy.l
        @cs.o
        public final ByteString of(@oy.l ByteBuffer byteBuffer) {
            m0.p(byteBuffer, "<this>");
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            return new ByteString(bArr);
        }

        @cs.j(name = "read")
        @oy.l
        @cs.o
        public final ByteString read(@oy.l InputStream inputStream, int i10) throws IOException {
            m0.p(inputStream, "<this>");
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
            return new ByteString(bArr);
        }

        private Companion() {
        }

        @cs.j(name = "-deprecated_of")
        @oy.l
        @dr.o(level = dr.q.ERROR, message = "moved to extension function", replaceWith = @g1(expression = "array.toByteString(offset, byteCount)", imports = {"com.applovin.shadow.okio.ByteString.Companion.toByteString"}))
        /* JADX INFO: renamed from: -deprecated_of, reason: not valid java name */
        public final ByteString m147deprecated_of(@oy.l byte[] array, int i10, int i11) {
            m0.p(array, "array");
            return of(array, i10, i11);
        }

        @oy.l
        @cs.o
        public final ByteString of(@oy.l byte... data) {
            m0.p(data, "data");
            byte[] bArrCopyOf = Arrays.copyOf(data, data.length);
            m0.o(bArrCopyOf, "copyOf(this, size)");
            return new ByteString(bArrCopyOf);
        }

        @cs.j(name = "of")
        @oy.l
        @cs.o
        public final ByteString of(@oy.l byte[] bArr, int i10, int i11) {
            m0.p(bArr, "<this>");
            int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(bArr, i11);
            SegmentedByteString.checkOffsetAndCount(bArr.length, i10, iResolveDefaultParameter);
            return new ByteString(fr.q.f1(bArr, i10, iResolveDefaultParameter + i10));
        }
    }

    public ByteString(@oy.l byte[] data) {
        m0.p(data, "data");
        this.data = data;
    }

    public static /* synthetic */ void copyInto$default(ByteString byteString, int i10, byte[] bArr, int i11, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copyInto");
        }
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        byteString.copyInto(i10, bArr, i11, i12);
    }

    @cs.o
    @oy.m
    public static final ByteString decodeBase64(@oy.l String str) {
        return Companion.decodeBase64(str);
    }

    @oy.l
    @cs.o
    public static final ByteString decodeHex(@oy.l String str) {
        return Companion.decodeHex(str);
    }

    @cs.j(name = "encodeString")
    @oy.l
    @cs.o
    public static final ByteString encodeString(@oy.l String str, @oy.l Charset charset) {
        return Companion.encodeString(str, charset);
    }

    @oy.l
    @cs.o
    public static final ByteString encodeUtf8(@oy.l String str) {
        return Companion.encodeUtf8(str);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.indexOf(byteString2, i10);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, ByteString byteString2, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(byteString2, i10);
    }

    @cs.j(name = "of")
    @oy.l
    @cs.o
    public static final ByteString of(@oy.l ByteBuffer byteBuffer) {
        return Companion.of(byteBuffer);
    }

    @cs.j(name = "read")
    @oy.l
    @cs.o
    public static final ByteString read(@oy.l InputStream inputStream, int i10) throws IOException {
        return Companion.read(inputStream, i10);
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        ByteString byteString = Companion.read(objectInputStream, objectInputStream.readInt());
        Field declaredField = ByteString.class.getDeclaredField("data");
        declaredField.setAccessible(true);
        declaredField.set(this, byteString.data);
    }

    public static /* synthetic */ ByteString substring$default(ByteString byteString, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: substring");
        }
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.substring(i10, i11);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    @cs.j(name = "-deprecated_getByte")
    @dr.o(level = dr.q.ERROR, message = "moved to operator function", replaceWith = @g1(expression = "this[index]", imports = {}))
    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m140deprecated_getByte(int i10) {
        return getByte(i10);
    }

    @cs.j(name = "-deprecated_size")
    @dr.o(level = dr.q.ERROR, message = "moved to val", replaceWith = @g1(expression = "size", imports = {}))
    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final int m141deprecated_size() {
        return size();
    }

    @oy.l
    public ByteBuffer asByteBuffer() {
        ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(this.data).asReadOnlyBuffer();
        m0.o(byteBufferAsReadOnlyBuffer, "asReadOnlyBuffer(...)");
        return byteBufferAsReadOnlyBuffer;
    }

    @oy.l
    public String base64() {
        return Base64.encodeBase64$default(getData$okio(), null, 1, null);
    }

    @oy.l
    public String base64Url() {
        return Base64.encodeBase64(getData$okio(), Base64.getBASE64_URL_SAFE());
    }

    public void copyInto(int i10, @oy.l byte[] target, int i11, int i12) {
        m0.p(target, "target");
        fr.q.v0(getData$okio(), target, i11, i10, i12 + i10);
    }

    @oy.l
    public ByteString digest$okio(@oy.l String algorithm) throws NoSuchAlgorithmException {
        m0.p(algorithm, "algorithm");
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        messageDigest.update(this.data, 0, size());
        byte[] bArrDigest = messageDigest.digest();
        m0.m(bArrDigest);
        return new ByteString(bArrDigest);
    }

    public final boolean endsWith(@oy.l ByteString suffix) {
        m0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.size(), suffix, 0, suffix.size());
    }

    public boolean equals(@oy.m Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == getData$okio().length && byteString.rangeEquals(0, getData$okio(), 0, getData$okio().length)) {
                return true;
            }
        }
        return false;
    }

    @cs.j(name = "getByte")
    public final byte getByte(int i10) {
        return internalGet$okio(i10);
    }

    @oy.l
    public final byte[] getData$okio() {
        return this.data;
    }

    public final int getHashCode$okio() {
        return this.hashCode;
    }

    public int getSize$okio() {
        return getData$okio().length;
    }

    @oy.m
    public final String getUtf8$okio() {
        return this.utf8;
    }

    public int hashCode() {
        int hashCode$okio = getHashCode$okio();
        if (hashCode$okio != 0) {
            return hashCode$okio;
        }
        int iHashCode = Arrays.hashCode(getData$okio());
        setHashCode$okio(iHashCode);
        return iHashCode;
    }

    @oy.l
    public String hex() {
        char[] cArr = new char[getData$okio().length * 2];
        int i10 = 0;
        for (byte b10 : getData$okio()) {
            int i11 = i10 + 1;
            cArr[i10] = com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15];
            i10 += 2;
            cArr[i11] = com.applovin.shadow.okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & zi.c.f161639q];
        }
        return k0.L1(cArr);
    }

    @oy.l
    public ByteString hmac$okio(@oy.l String algorithm, @oy.l ByteString key) throws NoSuchAlgorithmException {
        m0.p(algorithm, "algorithm");
        m0.p(key, "key");
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.toByteArray(), algorithm));
            byte[] bArrDoFinal = mac.doFinal(this.data);
            m0.o(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @oy.l
    public ByteString hmacSha1(@oy.l ByteString key) {
        m0.p(key, "key");
        return hmac$okio("HmacSHA1", key);
    }

    @oy.l
    public ByteString hmacSha256(@oy.l ByteString key) {
        m0.p(key, "key");
        return hmac$okio("HmacSHA256", key);
    }

    @oy.l
    public ByteString hmacSha512(@oy.l ByteString key) {
        m0.p(key, "key");
        return hmac$okio("HmacSHA512", key);
    }

    @cs.k
    public final int indexOf(@oy.l ByteString other) {
        m0.p(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @oy.l
    public byte[] internalArray$okio() {
        return getData$okio();
    }

    public byte internalGet$okio(int i10) {
        return getData$okio()[i10];
    }

    @cs.k
    public final int lastIndexOf(@oy.l ByteString other) {
        m0.p(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    @oy.l
    public final ByteString md5() {
        return digest$okio("MD5");
    }

    public boolean rangeEquals(int i10, @oy.l ByteString other, int i11, int i12) {
        m0.p(other, "other");
        return other.rangeEquals(i11, getData$okio(), i10, i12);
    }

    public final void setHashCode$okio(int i10) {
        this.hashCode = i10;
    }

    public final void setUtf8$okio(@oy.m String str) {
        this.utf8 = str;
    }

    @oy.l
    public final ByteString sha1() {
        return digest$okio("SHA-1");
    }

    @oy.l
    public final ByteString sha256() {
        return digest$okio(to.c.algoTypeS2);
    }

    @oy.l
    public final ByteString sha512() {
        return digest$okio("SHA-512");
    }

    @cs.j(name = "size")
    public final int size() {
        return getSize$okio();
    }

    public final boolean startsWith(@oy.l ByteString prefix) {
        m0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.size());
    }

    @oy.l
    public String string(@oy.l Charset charset) {
        m0.p(charset, "charset");
        return new String(this.data, charset);
    }

    @oy.l
    @cs.k
    public final ByteString substring() {
        return substring$default(this, 0, 0, 3, null);
    }

    @oy.l
    public ByteString toAsciiLowercase() {
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b10 = getData$okio()[i10];
            if (b10 >= 65 && b10 <= 90) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                m0.o(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 + 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 65 && b11 <= 90) {
                        bArrCopyOf[i11] = (byte) (b11 + 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @oy.l
    public ByteString toAsciiUppercase() {
        for (int i10 = 0; i10 < getData$okio().length; i10++) {
            byte b10 = getData$okio()[i10];
            if (b10 >= 97 && b10 <= 122) {
                byte[] data$okio = getData$okio();
                byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
                m0.o(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i10] = (byte) (b10 - 32);
                for (int i11 = i10 + 1; i11 < bArrCopyOf.length; i11++) {
                    byte b11 = bArrCopyOf[i11];
                    if (b11 >= 97 && b11 <= 122) {
                        bArrCopyOf[i11] = (byte) (b11 - 32);
                    }
                }
                return new ByteString(bArrCopyOf);
            }
        }
        return this;
    }

    @oy.l
    public byte[] toByteArray() {
        byte[] data$okio = getData$okio();
        byte[] bArrCopyOf = Arrays.copyOf(data$okio, data$okio.length);
        m0.o(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    @oy.l
    public String toString() {
        if (getData$okio().length == 0) {
            return "[size=0]";
        }
        int iCodePointIndexToCharIndex = com.applovin.shadow.okio.internal.ByteString.codePointIndexToCharIndex(getData$okio(), 64);
        if (iCodePointIndexToCharIndex != -1) {
            String strUtf8 = utf8();
            String strSubstring = strUtf8.substring(0, iCodePointIndexToCharIndex);
            m0.o(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strZ2 = k0.z2(k0.z2(k0.z2(strSubstring, ce.a.f23003h, "\\\\", false, 4, null), IOUtils.LINE_SEPARATOR_UNIX, "\\n", false, 4, null), za.h.f160939d, "\\r", false, 4, null);
            if (iCodePointIndexToCharIndex >= strUtf8.length()) {
                return "[text=" + strZ2 + fw.b.f85385l;
            }
            return "[size=" + getData$okio().length + " text=" + strZ2 + "…]";
        }
        if (getData$okio().length <= 64) {
            return "[hex=" + hex() + fw.b.f85385l;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[size=");
        sb2.append(getData$okio().length);
        sb2.append(" hex=");
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, 64);
        if (iResolveDefaultParameter <= getData$okio().length) {
            if (iResolveDefaultParameter < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            sb2.append((iResolveDefaultParameter == getData$okio().length ? this : new ByteString(fr.q.f1(getData$okio(), 0, iResolveDefaultParameter))).hex());
            sb2.append("…]");
            return sb2.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
    }

    @oy.l
    public String utf8() {
        String utf8$okio = getUtf8$okio();
        if (utf8$okio != null) {
            return utf8$okio;
        }
        String utf8String = _JvmPlatformKt.toUtf8String(internalArray$okio());
        setUtf8$okio(utf8String);
        return utf8String;
    }

    public void write(@oy.l OutputStream out) throws IOException {
        m0.p(out, "out");
        out.write(this.data);
    }

    public void write$okio(@oy.l Buffer buffer, int i10, int i11) {
        m0.p(buffer, "buffer");
        com.applovin.shadow.okio.internal.ByteString.commonWrite(this, buffer, i10, i11);
    }

    public static /* synthetic */ int indexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: indexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return byteString.indexOf(bArr, i10);
    }

    @oy.l
    @cs.o
    public static final ByteString of(@oy.l byte... bArr) {
        return Companion.of(bArr);
    }

    @Override // java.lang.Comparable
    public int compareTo(@oy.l ByteString other) {
        m0.p(other, "other");
        int size = size();
        int size2 = other.size();
        int iMin = Math.min(size, size2);
        for (int i10 = 0; i10 < iMin; i10++) {
            int i11 = getByte(i10) & 255;
            int i12 = other.getByte(i10) & 255;
            if (i11 != i12) {
                return i11 < i12 ? -1 : 1;
            }
        }
        if (size == size2) {
            return 0;
        }
        return size < size2 ? -1 : 1;
    }

    public final boolean endsWith(@oy.l byte[] suffix) {
        m0.p(suffix, "suffix");
        return rangeEquals(size() - suffix.length, suffix, 0, suffix.length);
    }

    @cs.k
    public final int indexOf(@oy.l byte[] other) {
        m0.p(other, "other");
        return indexOf$default(this, other, 0, 2, (Object) null);
    }

    @cs.k
    public final int lastIndexOf(@oy.l byte[] other) {
        m0.p(other, "other");
        return lastIndexOf$default(this, other, 0, 2, (Object) null);
    }

    public boolean rangeEquals(int i10, @oy.l byte[] other, int i11, int i12) {
        m0.p(other, "other");
        return i10 >= 0 && i10 <= getData$okio().length - i12 && i11 >= 0 && i11 <= other.length - i12 && SegmentedByteString.arrayRangeEquals(getData$okio(), i10, other, i11, i12);
    }

    public final boolean startsWith(@oy.l byte[] prefix) {
        m0.p(prefix, "prefix");
        return rangeEquals(0, prefix, 0, prefix.length);
    }

    @oy.l
    @cs.k
    public final ByteString substring(int i10) {
        return substring$default(this, i10, 0, 2, null);
    }

    public static /* synthetic */ int lastIndexOf$default(ByteString byteString, byte[] bArr, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lastIndexOf");
        }
        if ((i11 & 2) != 0) {
            i10 = SegmentedByteString.getDEFAULT__ByteString_size();
        }
        return byteString.lastIndexOf(bArr, i10);
    }

    @cs.j(name = "of")
    @oy.l
    @cs.o
    public static final ByteString of(@oy.l byte[] bArr, int i10, int i11) {
        return Companion.of(bArr, i10, i11);
    }

    @cs.k
    public final int indexOf(@oy.l ByteString other, int i10) {
        m0.p(other, "other");
        return indexOf(other.internalArray$okio(), i10);
    }

    @cs.k
    public final int lastIndexOf(@oy.l ByteString other, int i10) {
        m0.p(other, "other");
        return lastIndexOf(other.internalArray$okio(), i10);
    }

    @oy.l
    @cs.k
    public ByteString substring(int i10, int i11) {
        int iResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(this, i11);
        if (i10 >= 0) {
            if (iResolveDefaultParameter <= getData$okio().length) {
                if (iResolveDefaultParameter - i10 >= 0) {
                    return (i10 == 0 && iResolveDefaultParameter == getData$okio().length) ? this : new ByteString(fr.q.f1(getData$okio(), i10, iResolveDefaultParameter));
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            throw new IllegalArgumentException(("endIndex > length(" + getData$okio().length + ')').toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    @cs.k
    public int indexOf(@oy.l byte[] other, int i10) {
        m0.p(other, "other");
        int length = getData$okio().length - other.length;
        int iMax = Math.max(i10, 0);
        if (iMax > length) {
            return -1;
        }
        while (!SegmentedByteString.arrayRangeEquals(getData$okio(), iMax, other, 0, other.length)) {
            if (iMax == length) {
                return -1;
            }
            iMax++;
        }
        return iMax;
    }

    @cs.k
    public int lastIndexOf(@oy.l byte[] other, int i10) {
        m0.p(other, "other");
        for (int iMin = Math.min(SegmentedByteString.resolveDefaultParameter(this, i10), getData$okio().length - other.length); -1 < iMin; iMin--) {
            if (SegmentedByteString.arrayRangeEquals(getData$okio(), iMin, other, 0, other.length)) {
                return iMin;
            }
        }
        return -1;
    }
}
