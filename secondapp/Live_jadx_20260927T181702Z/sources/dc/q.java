package dc;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements ImageHeaderParser {
    public static final int A = 1635150182;
    public static final int B = 1635150195;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f78785b = "DfltImageHeaderParser";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f78786c = 4671814;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78787d = -1991225785;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f78788e = 65496;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78789f = 19789;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f78790g = 18761;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f78793j = 218;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f78794k = 217;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f78795l = 255;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f78796m = 225;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f78797n = 274;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f78799p = 1380533830;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f78800q = 1464156752;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f78801r = 1448097792;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f78802s = -256;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f78803t = 255;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f78804u = 88;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f78805v = 76;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f78806w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f78807x = 16;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f78808y = 8;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f78809z = 1718909296;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f78791h = "Exif\u0000\u0000";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f78792i = f78791h.getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f78798o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f78810a;

        public a(ByteBuffer byteBuffer) {
            this.f78810a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // dc.q.c
        public int a() throws c.a {
            return (c() << 8) | c();
        }

        @Override // dc.q.c
        public int b(byte[] bArr, int i10) {
            int iMin = Math.min(i10, this.f78810a.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.f78810a.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // dc.q.c
        public short c() throws c.a {
            if (this.f78810a.remaining() >= 1) {
                return (short) (this.f78810a.get() & 255);
            }
            throw new c.a();
        }

        @Override // dc.q.c
        public long skip(long j10) {
            int iMin = (int) Math.min(this.f78810a.remaining(), j10);
            ByteBuffer byteBuffer = this.f78810a;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f78811a;

        public b(byte[] bArr, int i10) {
            this.f78811a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public short a(int i10) {
            if (c(i10, 2)) {
                return this.f78811a.getShort(i10);
            }
            return (short) -1;
        }

        public int b(int i10) {
            if (c(i10, 4)) {
                return this.f78811a.getInt(i10);
            }
            return -1;
        }

        public final boolean c(int i10, int i11) {
            return this.f78811a.remaining() - i10 >= i11;
        }

        public int d() {
            return this.f78811a.remaining();
        }

        public void e(ByteOrder byteOrder) {
            this.f78811a.order(byteOrder);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class a extends IOException {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final long f78812b = 1;

            public a() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(byte[] bArr, int i10) throws IOException;

        short c() throws IOException;

        long skip(long j10) throws IOException;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f78813a;

        public d(InputStream inputStream) {
            this.f78813a = inputStream;
        }

        @Override // dc.q.c
        public int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // dc.q.c
        public int b(byte[] bArr, int i10) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f78813a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new c.a();
            }
            return i11;
        }

        @Override // dc.q.c
        public short c() throws IOException {
            int i10 = this.f78813a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new c.a();
        }

        @Override // dc.q.c
        public long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                long jSkip = this.f78813a.skip(j11);
                if (jSkip <= 0) {
                    if (this.f78813a.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j11 -= jSkip;
            }
            return j10 - j11;
        }
    }

    public static int e(int i10, int i11) {
        return i10 + 2 + (i11 * 12);
    }

    public static boolean h(int i10) {
        return (i10 & 65496) == 65496 || i10 == 19789 || i10 == 18761;
    }

    public static int k(b bVar) {
        ByteOrder byteOrder;
        short sA = bVar.a(6);
        if (sA != 18761) {
            if (sA != 19789 && Log.isLoggable(f78785b, 3)) {
                Log.d(f78785b, "Unknown endianness = " + ((int) sA));
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        bVar.e(byteOrder);
        int iB = bVar.b(10) + 6;
        short sA2 = bVar.a(iB);
        for (int i10 = 0; i10 < sA2; i10++) {
            int iE = e(iB, i10);
            short sA3 = bVar.a(iE);
            if (sA3 == 274) {
                short sA4 = bVar.a(iE + 2);
                if (sA4 >= 1 && sA4 <= 12) {
                    int iB2 = bVar.b(iE + 4);
                    if (iB2 >= 0) {
                        if (Log.isLoggable(f78785b, 3)) {
                            Log.d(f78785b, "Got tagIndex=" + i10 + " tagType=" + ((int) sA3) + " formatCode=" + ((int) sA4) + " componentCount=" + iB2);
                        }
                        int i11 = iB2 + f78798o[sA4];
                        if (i11 <= 4) {
                            int i12 = iE + 8;
                            if (i12 >= 0 && i12 <= bVar.d()) {
                                if (i11 >= 0 && i11 + i12 <= bVar.d()) {
                                    return bVar.a(i12);
                                }
                                if (Log.isLoggable(f78785b, 3)) {
                                    Log.d(f78785b, "Illegal number of bytes for TI tag data tagType=" + ((int) sA3));
                                }
                            } else if (Log.isLoggable(f78785b, 3)) {
                                Log.d(f78785b, "Illegal tagValueOffset=" + i12 + " tagType=" + ((int) sA3));
                            }
                        } else if (Log.isLoggable(f78785b, 3)) {
                            Log.d(f78785b, "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) sA4));
                        }
                    } else if (Log.isLoggable(f78785b, 3)) {
                        Log.d(f78785b, "Negative tiff component count");
                    }
                } else if (Log.isLoggable(f78785b, 3)) {
                    Log.d(f78785b, "Got invalid format code = " + ((int) sA4));
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType a(@NonNull InputStream inputStream) throws IOException {
        return g(new d((InputStream) pc.m.e(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@NonNull ByteBuffer byteBuffer, @NonNull wb.b bVar) throws IOException {
        return f(new a((ByteBuffer) pc.m.e(byteBuffer)), (wb.b) pc.m.e(bVar));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType c(@NonNull ByteBuffer byteBuffer) throws IOException {
        return g(new a((ByteBuffer) pc.m.e(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@NonNull InputStream inputStream, @NonNull wb.b bVar) throws IOException {
        return f(new d((InputStream) pc.m.e(inputStream)), (wb.b) pc.m.e(bVar));
    }

    public final int f(c cVar, wb.b bVar) throws IOException {
        try {
            int iA = cVar.a();
            if (!h(iA)) {
                if (Log.isLoggable(f78785b, 3)) {
                    Log.d(f78785b, "Parser doesn't handle magic number: " + iA);
                }
                return -1;
            }
            int iJ = j(cVar);
            if (iJ == -1) {
                if (Log.isLoggable(f78785b, 3)) {
                    Log.d(f78785b, "Failed to parse exif segment length, or exif segment not found");
                }
                return -1;
            }
            byte[] bArr = (byte[]) bVar.c(iJ, byte[].class);
            try {
                return l(cVar, bArr, iJ);
            } finally {
                bVar.put(bArr);
            }
        } catch (c.a unused) {
            return -1;
        }
    }

    @NonNull
    public final ImageHeaderParser.ImageType g(c cVar) throws IOException {
        try {
            int iA = cVar.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | cVar.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | cVar.c();
            if (iC2 == -1991225785) {
                cVar.skip(21L);
                try {
                    return cVar.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (c.a unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 != 1380533830) {
                return m(cVar, iC2);
            }
            cVar.skip(4L);
            if (((cVar.a() << 16) | cVar.a()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA2 = (cVar.a() << 16) | cVar.a();
            if ((iA2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i10 = iA2 & 255;
            if (i10 != 88) {
                if (i10 != 76) {
                    return ImageHeaderParser.ImageType.WEBP;
                }
                cVar.skip(4L);
                return (cVar.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            cVar.skip(4L);
            short sC = cVar.c();
            if ((sC & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            return (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
        } catch (c.a unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public final boolean i(byte[] bArr, int i10) {
        boolean z10 = bArr != null && i10 > f78792i.length;
        if (z10) {
            int i11 = 0;
            while (true) {
                byte[] bArr2 = f78792i;
                if (i11 >= bArr2.length) {
                    break;
                }
                if (bArr[i11] != bArr2[i11]) {
                    return false;
                }
                i11++;
            }
        }
        return z10;
    }

    public final int j(c cVar) throws IOException {
        short sC;
        int iA;
        long j10;
        long jSkip;
        do {
            short sC2 = cVar.c();
            if (sC2 != 255) {
                if (Log.isLoggable(f78785b, 3)) {
                    Log.d(f78785b, "Unknown segmentId=" + ((int) sC2));
                }
                return -1;
            }
            sC = cVar.c();
            if (sC == 218) {
                return -1;
            }
            if (sC == 217) {
                if (Log.isLoggable(f78785b, 3)) {
                    Log.d(f78785b, "Found MARKER_EOI in exif segment");
                }
                return -1;
            }
            iA = cVar.a() - 2;
            if (sC == 225) {
                return iA;
            }
            j10 = iA;
            jSkip = cVar.skip(j10);
        } while (jSkip == j10);
        if (Log.isLoggable(f78785b, 3)) {
            Log.d(f78785b, "Unable to skip enough data, type: " + ((int) sC) + ", wanted to skip: " + iA + ", but actually skipped: " + jSkip);
        }
        return -1;
    }

    public final int l(c cVar, byte[] bArr, int i10) throws IOException {
        int iB = cVar.b(bArr, i10);
        if (iB == i10) {
            if (i(bArr, i10)) {
                return k(new b(bArr, i10));
            }
            if (Log.isLoggable(f78785b, 3)) {
                Log.d(f78785b, "Missing jpeg exif preamble");
            }
            return -1;
        }
        if (Log.isLoggable(f78785b, 3)) {
            Log.d(f78785b, "Unable to read exif segment data, length: " + i10 + ", actually read: " + iB);
        }
        return -1;
    }

    public final ImageHeaderParser.ImageType m(c cVar, int i10) throws IOException {
        if (((cVar.a() << 16) | cVar.a()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iA = (cVar.a() << 16) | cVar.a();
        if (iA == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i11 = 0;
        boolean z10 = iA == 1635150182;
        cVar.skip(4L);
        int i12 = i10 - 16;
        if (i12 % 4 == 0) {
            while (i11 < 5 && i12 > 0) {
                int iA2 = (cVar.a() << 16) | cVar.a();
                if (iA2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iA2 == 1635150182) {
                    z10 = true;
                }
                i11++;
                i12 -= 4;
            }
        }
        return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }
}
