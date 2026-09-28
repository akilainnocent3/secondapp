package defpackage;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import com.google.protobuf.Reader;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes.dex */
public final class bvg {
    public static final e W;
    public static final e[][] X;
    public static final e[] Y;
    public static final HashMap<Integer, e>[] Z;
    public static final HashMap<String, e>[] a0;
    public static final Set<String> b0;
    public static final HashMap<Integer, Integer> c0;
    public static final Charset d0;
    public static final byte[] e0;
    public static final byte[] f0;
    public static final Pattern g0;
    public static final Pattern h0;
    public static final Pattern i0;
    public final String a;
    public final FileDescriptor b;
    public final AssetManager.AssetInputStream c;
    public int d;
    public final boolean e;
    public final HashMap<String, d>[] f;
    public final HashSet g;
    public ByteOrder h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public byte[] n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public d t;
    public boolean u;
    public static final boolean v = Log.isLoggable("ExifInterface", 3);
    public static final List<Integer> w = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> x = Arrays.asList(2, 7, 4, 5);
    public static final int[] y = {8, 8, 8};
    public static final int[] z = {8};
    public static final byte[] A = {-1, -40, -1};
    public static final byte[] B = {102, 116, 121, 112};
    public static final byte[] C = {109, 105, 102, 49};
    public static final byte[] D = {104, 101, 105, 99};
    public static final byte[] E = {97, 118, 105, 102};
    public static final byte[] F = {97, 118, 105, 115};
    public static final byte[] G = {79, 76, 89, 77, 80, 0};
    public static final byte[] H = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] I = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] J = "XML:com.adobe.xmp\u0000\u0000\u0000\u0000\u0000".getBytes(StandardCharsets.UTF_8);
    public static final byte[] K = {82, 73, 70, 70};
    public static final byte[] L = {87, 69, 66, 80};
    public static final byte[] M = {69, 88, 73, 70};
    public static final byte[] N = {-99, 1, 42};
    public static final byte[] O = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] P = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] R = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] S = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] T = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] U = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] V = {65, 83, 67, 73, 73, 0, 0, 0};

    public static class f {
        public final long a;
        public final long b;

        public f(long j, long j2) {
            if (j2 == 0) {
                this.a = 0L;
                this.b = 1L;
            } else {
                this.a = j;
                this.b = j2;
            }
        }

        public final String toString() {
            return this.a + "/" + this.b;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e(256, 3, 4, "ImageWidth"), new e(257, 3, 4, "ImageLength"), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e(273, 3, 4, "StripOffsets"), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e(278, 3, 4, "RowsPerStrip"), new e(279, 3, 4, "StripByteCounts"), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e(40962, 3, 4, "PixelXDimension"), new e(40963, 3, 4, "PixelYDimension"), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e(sgwpmp.jUznMHj, 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e(50720, 3, 4, "DefaultCropSize")};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e(2, 5, 10, "GPSLatitude"), new e("GPSLongitudeRef", 3, 2), new e(4, 5, 10, "GPSLongitude"), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e(256, 3, 4, "ThumbnailImageWidth"), new e(257, 3, 4, "ThumbnailImageLength"), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e(273, 3, 4, "StripOffsets"), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e(278, 3, 4, "RowsPerStrip"), new e(279, 3, 4, "StripByteCounts"), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e(50720, 3, 4, "DefaultCropSize")};
        W = new e("StripOffsets", 273, 3);
        X = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        Y = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        Z = new HashMap[10];
        a0 = new HashMap[10];
        b0 = Collections.unmodifiableSet(new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance")));
        c0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        d0 = charsetForName;
        e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            e[][] eVarArr6 = X;
            if (i >= eVarArr6.length) {
                HashMap<Integer, Integer> map = c0;
                e[] eVarArr7 = Y;
                map.put(Integer.valueOf(eVarArr7[0].a), 5);
                map.put(Integer.valueOf(eVarArr7[1].a), 1);
                map.put(Integer.valueOf(eVarArr7[2].a), 2);
                map.put(Integer.valueOf(eVarArr7[3].a), 3);
                map.put(Integer.valueOf(eVarArr7[4].a), 7);
                map.put(Integer.valueOf(eVarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i] = new HashMap<>();
            a0[i] = new HashMap<>();
            for (e eVar : eVarArr6[i]) {
                Z[i].put(Integer.valueOf(eVar.a), eVar);
                a0[i].put(eVar.b, eVar);
            }
            i++;
        }
    }

    public bvg(InputStream inputStream) throws IOException {
        e[][] eVarArr = X;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            bmy.a("inputStream cannot be null");
            throw null;
        }
        this.a = null;
        this.e = false;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                this.c = null;
                this.b = fileInputStream.getFD();
            } catch (Exception unused) {
                if (v) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                this.c = null;
                this.b = null;
            }
        } else {
            this.c = null;
            this.b = null;
        }
        t(inputStream);
    }

    public static double b(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d3 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d4 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d3 / 60.0d) + d2;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d4;
            }
            return -d4;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e2) {
            m8j.a(e2);
            return 0.0d;
        }
    }

    public static Pair<Integer, Integer> q(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairQ = q(strArrSplit[0]);
            if (((Integer) pairQ.first).intValue() == 2) {
                return pairQ;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairQ2 = q(strArrSplit[i]);
                int iIntValue = (((Integer) pairQ2.first).equals(pairQ.first) || ((Integer) pairQ2.second).equals(pairQ.first)) ? ((Integer) pairQ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairQ.second).intValue() == -1 || !(((Integer) pairQ2.first).equals(pairQ.second) || ((Integer) pairQ2.second).equals(pairQ.second))) ? -1 : ((Integer) pairQ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairQ = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairQ = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairQ;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
                        return j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public static ByteOrder w(b bVar) throws IOException {
        short s = bVar.readShort();
        boolean z2 = v;
        if (s == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s != 19789) {
            wnm.a(Integer.toHexString(s), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A(int i, String str, String str2) {
        HashMap<String, d>[] mapArr = this.f;
        if (mapArr[i].isEmpty() || mapArr[i].get(str) == null) {
            return;
        }
        HashMap<String, d> map = mapArr[i];
        map.put(str2, map.get(str));
        mapArr[i].remove(str);
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        byte b2;
        byte[] bArr;
        if (v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        b bVar = new b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            i08.a("Invalid marker");
            return;
        }
        cVar.d(-1);
        if (bVar.readByte() != -40) {
            i08.a("Invalid marker");
            return;
        }
        cVar.d(-40);
        cVar.d(-1);
        cVar.d(-31);
        this.p = J(cVar);
        d dVar = this.t;
        byte[] bArr2 = f0;
        if (dVar != null) {
            cVar.write(-1);
            cVar.d(-31);
            cVar.m(bArr2.length + 2 + this.t.d.length);
            cVar.write(bArr2);
            cVar.write(this.t.d);
            this.u = true;
        }
        byte[] bArr3 = new byte[4096];
        while (bVar.readByte() == -1) {
            do {
                b2 = bVar.readByte();
            } while (b2 == -1);
            if (b2 == -39 || b2 == -38) {
                cVar.d(-1);
                cVar.d(b2);
                evg.d(bVar, cVar);
                return;
            }
            if (b2 != -31) {
                cVar.d(-1);
                cVar.d(b2);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.m(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    i08.a("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = bVar.read(bArr3, 0, Math.min(i, 4096));
                    if (i2 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int length = unsignedShort2 - 2;
                if (length < 0) {
                    i08.a("Invalid length");
                    return;
                }
                int length2 = bArr2.length;
                byte[] bArr4 = e0;
                if (length >= length2) {
                    bArr = new byte[bArr2.length];
                } else {
                    bArr = length >= bArr4.length ? new byte[bArr4.length] : null;
                }
                if (bArr != null) {
                    bVar.readFully(bArr);
                    if (evg.e(bArr, bArr4) || evg.e(bArr, bArr2)) {
                        bVar.d(length - bArr.length);
                    }
                }
                cVar.d(-1);
                cVar.d(b2);
                cVar.m(unsignedShort2);
                if (bArr != null) {
                    length -= bArr.length;
                    cVar.write(bArr);
                }
                while (length > 0) {
                    int i3 = bVar.read(bArr3, 0, Math.min(length, 4096));
                    if (i3 < 0) {
                        break;
                    }
                    cVar.write(bArr3, 0, i3);
                    length -= i3;
                }
            }
        }
        i08.a("Invalid marker");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:19:0x0066  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x008d  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:42:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x006e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0088 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0041 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0075 -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0041
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void C(java.io.BufferedInputStream r9, java.io.BufferedOutputStream r10) {
        /*
            r8 = this;
            boolean r0 = defpackage.bvg.v
            if (r0 == 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "savePngAttributes starting with (inputStream: "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = ", outputStream: "
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ExifInterface"
            android.util.Log.d(r1, r0)
        L24:
            bvg$b r0 = new bvg$b
            r0.<init>(r9)
            bvg$c r9 = new bvg$c
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r9.<init>(r10, r1)
            byte[] r10 = defpackage.bvg.I
            int r10 = r10.length
            defpackage.evg.c(r0, r9, r10)
            bvg$d r10 = r8.t
            r1 = 1
            r2 = 0
            if (r10 != 0) goto L40
            boolean r10 = r8.u
            if (r10 == 0) goto L75
        L40:
            r10 = r1
        L41:
            if (r1 != 0) goto L4a
            if (r10 == 0) goto L46
            goto L4a
        L46:
            defpackage.evg.d(r0, r9)
            return
        L4a:
            int r3 = r0.readInt()
            int r4 = r0.readInt()
            r5 = 1229472850(0x49484452, float:820293.1)
            if (r4 != r5) goto L77
            r9.f(r3)
            r9.f(r4)
            int r3 = r3 + 4
            defpackage.evg.c(r0, r9, r3)
            int r3 = r8.p
            if (r3 != 0) goto L6a
            r8.K(r9)
            r1 = r2
        L6a:
            bvg$d r3 = r8.t
            if (r3 == 0) goto L41
            boolean r3 = r8.u
            if (r3 != 0) goto L41
            r8.L(r9)
        L75:
            r10 = r2
            goto L41
        L77:
            r5 = 1700284774(0x65584966, float:6.383657E22)
            if (r4 != r5) goto L88
            if (r1 == 0) goto L88
            r8.K(r9)
            int r3 = r3 + 4
            r0.d(r3)
            r1 = r2
            goto L41
        L88:
            r5 = 1767135348(0x69545874, float:1.6044374E25)
            if (r4 != r5) goto Lba
            byte[] r5 = defpackage.bvg.J
            int r6 = r5.length
            if (r3 < r6) goto Lba
            int r6 = r5.length
            byte[] r7 = new byte[r6]
            r0.readFully(r7)
            int r6 = r3 - r6
            int r6 = r6 + 4
            boolean r5 = java.util.Arrays.equals(r7, r5)
            if (r5 == 0) goto Lad
            bvg$d r10 = r8.t
            if (r10 == 0) goto La9
            r8.L(r9)
        La9:
            r0.d(r6)
            goto L75
        Lad:
            r9.f(r3)
            r9.f(r4)
            r9.write(r7)
            defpackage.evg.c(r0, r9, r6)
            goto L41
        Lba:
            r9.f(r3)
            r9.f(r4)
            int r3 = r3 + 4
            defpackage.evg.c(r0, r9, r3)
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvg.C(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 6941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final void D(java.io.BufferedInputStream r23, java.io.BufferedOutputStream r24) {
        /*
            Method dump skipped, instruction units count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvg.D(java.io.BufferedInputStream, java.io.BufferedOutputStream):void");
    }

    /* JADX WARN: Code duplicated, block: B:139:0x02d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:140:0x02da  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:144:0x02f9 A[LOOP:2: B:142:0x02f6->B:144:0x02f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:147:0x0318 A[LOOP:3: B:146:0x0316->B:147:0x0318, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:149:0x032e  */
    /* JADX WARN: Code duplicated, block: B:152:0x033a A[LOOP:4: B:150:0x0337->B:152:0x033a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:155:0x0382 A[LOOP:5: B:154:0x0380->B:155:0x0382, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:157:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b2 A[LOOP:6: B:158:0x03af->B:160:0x03b2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x03d1 A[LOOP:7: B:162:0x03cf->B:163:0x03d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:165:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:168:0x03f9 A[LOOP:8: B:166:0x03f6->B:168:0x03f9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x042b  */
    /* JADX WARN: Code duplicated, block: B:173:0x043c A[LOOP:9: B:171:0x0439->B:173:0x043c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:175:0x0453  */
    /* JADX WARN: Code duplicated, block: B:178:0x0464 A[LOOP:10: B:176:0x0461->B:178:0x0464, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:180:0x047b  */
    /* JADX WARN: Code duplicated, block: B:181:0x0489  */
    /* JADX WARN: Instruction removed from duplicated block: B:140:0x02da, please report this as an issue */
    public final void E(String str, String str2) {
        String str3;
        boolean z2;
        String str4;
        e eVar;
        int[] iArr;
        String[] strArrSplit;
        int[] iArr2;
        int i;
        String[] strArrSplit2;
        long[] jArr;
        int i2;
        int i3;
        String[] strArrSplit3;
        f[] fVarArr;
        int i4;
        String[] strArrSplit4;
        int length;
        int[] iArr3;
        int i5;
        ByteBuffer byteBufferWrap;
        int i6;
        String[] strArrSplit5;
        int length2;
        f[] fVarArr2;
        int i7;
        ByteBuffer byteBufferWrap2;
        int i8;
        String[] strArrSplit6;
        int length3;
        double[] dArr;
        int i9;
        ByteBuffer byteBufferWrap3;
        int i10;
        f fVar;
        long j;
        long j2;
        String strReplaceAll = str2;
        boolean zEquals = "ISOSpeedRatings".equals(str);
        boolean z3 = v;
        if (zEquals) {
            if (z3) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        } else {
            str3 = str;
        }
        String str5 = "/";
        if (strReplaceAll == null) {
            z2 = z3;
            str4 = "/";
        } else if (!b0.contains(str3) || strReplaceAll.contains("/")) {
            z2 = z3;
            str4 = "/";
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = g0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else if ("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) {
                boolean zFind = h0.matcher(strReplaceAll).find();
                boolean zFind2 = i0.matcher(strReplaceAll).find();
                if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                if (zFind2) {
                    strReplaceAll = strReplaceAll.replaceAll("-", ":");
                }
            }
        } else {
            try {
                double d2 = Double.parseDouble(strReplaceAll);
                long j3 = 1;
                if (d2 >= 9.223372036854776E18d || d2 <= -9.223372036854776E18d) {
                    z2 = z3;
                    str4 = "/";
                    fVar = new f(d2 > 0.0d ? Long.MAX_VALUE : Long.MIN_VALUE, 1L);
                } else {
                    double dAbs = Math.abs(d2);
                    long j4 = 0;
                    long j5 = 1;
                    double d3 = dAbs;
                    long j6 = 0;
                    while (true) {
                        double d4 = d3 % 1.0d;
                        long j7 = (long) (d3 - d4);
                        str4 = str5;
                        j = (j7 * j3) + j6;
                        j2 = (j7 * j4) + j5;
                        d3 = 1.0d / d4;
                        z2 = z3;
                        if (Math.abs(dAbs - (j / j2)) <= 1.0E-8d * dAbs) {
                            break;
                        }
                        z3 = z2;
                        j5 = j4;
                        j4 = j2;
                        j6 = j3;
                        j3 = j;
                        str5 = str4;
                    }
                    if (d2 < 0.0d) {
                        j = -j;
                    }
                    fVar = new f(j, j2);
                }
                strReplaceAll = fVar.toString();
            } catch (NumberFormatException unused) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
        }
        boolean zEquals2 = "Xmp".equals(str3);
        int i11 = 12;
        int i12 = 9;
        int i13 = 4;
        HashMap<String, d>[] mapArr = this.f;
        int i14 = 0;
        if (zEquals2) {
            boolean z4 = mapArr[0].containsKey("Xmp") || mapArr[5].containsKey("Xmp");
            int i15 = this.d;
            char c2 = i15 != 4 ? (i15 == 9 || i15 == 15 || i15 == 12 || i15 == 13) ? (char) 2 : (char) 1 : (char) 3;
            if ((c2 == 2 && (this.t != null || !z4)) || (c2 == 3 && !z4)) {
                this.t = strReplaceAll != null ? d.a(strReplaceAll) : null;
                return;
            }
        }
        int i16 = 0;
        while (i16 < X.length) {
            if ((i16 != i13 || this.i) && (eVar = a0[i16].get(str3)) != null) {
                int i17 = eVar.d;
                int i18 = eVar.c;
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairQ = q(strReplaceAll);
                    int i19 = -1;
                    if (i18 == ((Integer) pairQ.first).intValue() || i18 == ((Integer) pairQ.second).intValue()) {
                        i17 = i18;
                        iArr = U;
                        switch (i17) {
                            case 1:
                                str4 = str4;
                                mapArr[i16].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i16].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i < strArrSplit.length) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i16].put(str3, d.g(iArr2, this.h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i2 < strArrSplit2.length) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i16].put(str3, d.d(jArr, this.h));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i4 = i14;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit7 = strArrSplit3[i4].split(str4, i3);
                                    fVarArr[i4] = new f((long) Double.parseDouble(strArrSplit7[i14]), (long) Double.parseDouble(strArrSplit7[1]));
                                    i4++;
                                    i3 = -1;
                                }
                                mapArr[i16].put(str3, d.e(fVarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z2) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i17);
                                }
                                break;
                            case 9:
                                int i20 = i12;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i5 < strArrSplit4.length) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap<String, d> map = mapArr[i16];
                                ByteOrder byteOrder = this.h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i20] * length]);
                                byteBufferWrap.order(byteOrder);
                                while (i6 < length) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map.put(str3, new d(byteBufferWrap.array(), i20, length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i7 = i14;
                                while (i7 < strArrSplit5.length) {
                                    String[] strArrSplit8 = strArrSplit5[i7].split(str4, i19);
                                    fVarArr2[i7] = new f((long) Double.parseDouble(strArrSplit8[i14]), (long) Double.parseDouble(strArrSplit8[1]));
                                    i7++;
                                    i12 = i12;
                                    strArrSplit5 = strArrSplit5;
                                    i19 = -1;
                                }
                                HashMap<String, d> map2 = mapArr[i16];
                                ByteOrder byteOrder2 = this.h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                while (i8 < length2) {
                                    f fVar2 = fVarArr2[i8];
                                    byteBufferWrap2.putInt((int) fVar2.a);
                                    byteBufferWrap2.putInt((int) fVar2.b);
                                }
                                map2.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i9 < strArrSplit6.length) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap<String, d> map3 = mapArr[i16];
                                ByteOrder byteOrder3 = this.h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i11] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                while (i10 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map3.put(str3, new d(byteBufferWrap3.array(), i11, length3));
                                break;
                        }
                    } else if (i17 != -1 && (i17 == ((Integer) pairQ.first).intValue() || i17 == ((Integer) pairQ.second).intValue())) {
                        i14 = i14;
                        iArr = U;
                        switch (i17) {
                            case 1:
                                str4 = str4;
                                mapArr[i16].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i16].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                for (i = i14; i < strArrSplit.length; i++) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i16].put(str3, d.g(iArr2, this.h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                for (i2 = i14; i2 < strArrSplit2.length; i2++) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i16].put(str3, d.d(jArr, this.h));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i4 = i14;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit9 = strArrSplit3[i4].split(str4, i3);
                                    fVarArr[i4] = new f((long) Double.parseDouble(strArrSplit9[i14]), (long) Double.parseDouble(strArrSplit9[1]));
                                    i4++;
                                    i3 = -1;
                                }
                                mapArr[i16].put(str3, d.e(fVarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z2) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i17);
                                }
                                break;
                            case 9:
                                int i21 = i12;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                for (i5 = i14; i5 < strArrSplit4.length; i5++) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap<String, d> map4 = mapArr[i16];
                                ByteOrder byteOrder4 = this.h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i21] * length]);
                                byteBufferWrap.order(byteOrder4);
                                for (i6 = i14; i6 < length; i6++) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map4.put(str3, new d(byteBufferWrap.array(), i21, length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i7 = i14;
                                while (i7 < strArrSplit5.length) {
                                    String[] strArrSplit10 = strArrSplit5[i7].split(str4, i19);
                                    fVarArr2[i7] = new f((long) Double.parseDouble(strArrSplit10[i14]), (long) Double.parseDouble(strArrSplit10[1]));
                                    i7++;
                                    i12 = i12;
                                    strArrSplit5 = strArrSplit5;
                                    i19 = -1;
                                }
                                HashMap<String, d> map5 = mapArr[i16];
                                ByteOrder byteOrder5 = this.h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder5);
                                for (i8 = i14; i8 < length2; i8++) {
                                    f fVar3 = fVarArr2[i8];
                                    byteBufferWrap2.putInt((int) fVar3.a);
                                    byteBufferWrap2.putInt((int) fVar3.b);
                                }
                                map5.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                for (i9 = i14; i9 < strArrSplit6.length; i9++) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap<String, d> map6 = mapArr[i16];
                                ByteOrder byteOrder6 = this.h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i11] * length3]);
                                byteBufferWrap3.order(byteOrder6);
                                for (i10 = i14; i10 < length3; i10++) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map6.put(str3, new d(byteBufferWrap3.array(), i11, length3));
                                break;
                        }
                    } else if (i18 == 1 || i18 == 7 || i18 == 2) {
                        i17 = i18;
                        iArr = U;
                        switch (i17) {
                            case 1:
                                str4 = str4;
                                mapArr[i16].put(str3, d.a(strReplaceAll));
                                break;
                            case 2:
                            case 7:
                                str4 = str4;
                                mapArr[i16].put(str3, d.b(strReplaceAll));
                                break;
                            case 3:
                                str4 = str4;
                                strArrSplit = strReplaceAll.split(",", -1);
                                iArr2 = new int[strArrSplit.length];
                                while (i < strArrSplit.length) {
                                    iArr2[i] = Integer.parseInt(strArrSplit[i]);
                                }
                                mapArr[i16].put(str3, d.g(iArr2, this.h));
                                break;
                            case 4:
                                str4 = str4;
                                strArrSplit2 = strReplaceAll.split(",", -1);
                                jArr = new long[strArrSplit2.length];
                                while (i2 < strArrSplit2.length) {
                                    jArr[i2] = Long.parseLong(strArrSplit2[i2]);
                                }
                                mapArr[i16].put(str3, d.d(jArr, this.h));
                                break;
                            case 5:
                                i3 = -1;
                                str4 = str4;
                                strArrSplit3 = strReplaceAll.split(",", -1);
                                fVarArr = new f[strArrSplit3.length];
                                i4 = i14;
                                while (i4 < strArrSplit3.length) {
                                    String[] strArrSplit11 = strArrSplit3[i4].split(str4, i3);
                                    fVarArr[i4] = new f((long) Double.parseDouble(strArrSplit11[i14]), (long) Double.parseDouble(strArrSplit11[1]));
                                    i4++;
                                    i3 = -1;
                                }
                                mapArr[i16].put(str3, d.e(fVarArr, this.h));
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z2) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i17);
                                }
                                break;
                            case 9:
                                int i22 = i12;
                                strArrSplit4 = strReplaceAll.split(",", -1);
                                length = strArrSplit4.length;
                                iArr3 = new int[length];
                                while (i5 < strArrSplit4.length) {
                                    iArr3[i5] = Integer.parseInt(strArrSplit4[i5]);
                                }
                                HashMap<String, d> map7 = mapArr[i16];
                                ByteOrder byteOrder7 = this.h;
                                byteBufferWrap = ByteBuffer.wrap(new byte[iArr[i22] * length]);
                                byteBufferWrap.order(byteOrder7);
                                while (i6 < length) {
                                    byteBufferWrap.putInt(iArr3[i6]);
                                }
                                map7.put(str3, new d(byteBufferWrap.array(), i22, length));
                                break;
                            case 10:
                                strArrSplit5 = strReplaceAll.split(",", -1);
                                length2 = strArrSplit5.length;
                                fVarArr2 = new f[length2];
                                i7 = i14;
                                while (i7 < strArrSplit5.length) {
                                    String[] strArrSplit12 = strArrSplit5[i7].split(str4, i19);
                                    fVarArr2[i7] = new f((long) Double.parseDouble(strArrSplit12[i14]), (long) Double.parseDouble(strArrSplit12[1]));
                                    i7++;
                                    i12 = i12;
                                    strArrSplit5 = strArrSplit5;
                                    i19 = -1;
                                }
                                HashMap<String, d> map8 = mapArr[i16];
                                ByteOrder byteOrder8 = this.h;
                                byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder8);
                                while (i8 < length2) {
                                    f fVar4 = fVarArr2[i8];
                                    byteBufferWrap2.putInt((int) fVar4.a);
                                    byteBufferWrap2.putInt((int) fVar4.b);
                                }
                                map8.put(str3, new d(byteBufferWrap2.array(), 10, length2));
                                break;
                            case 12:
                                strArrSplit6 = strReplaceAll.split(",", -1);
                                length3 = strArrSplit6.length;
                                dArr = new double[length3];
                                while (i9 < strArrSplit6.length) {
                                    dArr[i9] = Double.parseDouble(strArrSplit6[i9]);
                                }
                                HashMap<String, d> map9 = mapArr[i16];
                                ByteOrder byteOrder9 = this.h;
                                byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[i11] * length3]);
                                byteBufferWrap3.order(byteOrder9);
                                while (i10 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i10]);
                                }
                                map9.put(str3, new d(byteBufferWrap3.array(), i11, length3));
                                break;
                        }
                    } else if (z2) {
                        StringBuilder sbA = he.a("Given tag (", str3, ") value didn't match with one of expected formats: ");
                        String[] strArr = T;
                        sbA.append(strArr[i18]);
                        sbA.append(i17 == -1 ? "" : ", " + strArr[i17]);
                        sbA.append(" (guess: ");
                        sbA.append(strArr[((Integer) pairQ.first).intValue()]);
                        sbA.append(((Integer) pairQ.second).intValue() != -1 ? ", " + strArr[((Integer) pairQ.second).intValue()] : "");
                        sbA.append(")");
                        Log.d("ExifInterface", sbA.toString());
                    }
                } else {
                    mapArr[i16].remove(str3);
                }
                i14 = i14;
            } else {
                i14 = i14;
            }
            i16++;
            i14 = i14;
            str4 = str4;
            i11 = 12;
            i12 = 9;
            i13 = 4;
        }
    }

    public final void F(b bVar) throws Throwable {
        String str;
        d dVar;
        int i;
        HashMap<String, d> map = this.f[4];
        d dVar2 = map.get("Compression");
        if (dVar2 == null) {
            this.o = 6;
            r(bVar, map);
            return;
        }
        int i2 = dVar2.i(this.h);
        this.o = i2;
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 6) {
                r(bVar, map);
                return;
            } else if (i2 != 7) {
                return;
            }
        }
        d dVar3 = map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.k(this.h);
            int[] iArr2 = y;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((i = dVar.i(this.h)) == 1 && Arrays.equals(iArr, z)) || (i == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = map.get("StripOffsets");
                d dVar5 = map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrB = evg.b(dVar4.k(this.h));
                long[] jArrB2 = evg.b(dVar5.k(this.h));
                if (jArrB == null || jArrB.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrB2 == null || jArrB2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrB.length != jArrB2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : jArrB2) {
                    j += j2;
                }
                int i4 = (int) j;
                byte[] bArr = new byte[i4];
                this.k = true;
                this.j = true;
                this.i = true;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (i5 < jArrB.length) {
                    int i8 = (int) jArrB[i5];
                    int i9 = (int) jArrB2[i5];
                    if (i5 < jArrB.length - i3) {
                        str = str2;
                        if (i8 + i9 != jArrB[i5 + 1]) {
                            this.k = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i10 = i8 - i6;
                    if (i10 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        bVar.d(i10);
                        int i11 = i6 + i10;
                        byte[] bArr2 = new byte[i9];
                        try {
                            bVar.readFully(bArr2);
                            i6 = i11 + i9;
                            System.arraycopy(bArr2, 0, bArr, i7, i9);
                            i7 += i9;
                            i5++;
                            str2 = str3;
                            i3 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i9 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i10 + " bytes.");
                        return;
                    }
                }
                this.n = bArr;
                if (this.k) {
                    this.l = (int) jArrB[0];
                    this.m = i4;
                    return;
                }
                return;
            }
        }
        if (v) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void G(int i, int i2) throws Throwable {
        HashMap<String, d>[] mapArr = this.f;
        boolean zIsEmpty = mapArr[i].isEmpty();
        boolean z2 = v;
        if (zIsEmpty || mapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = mapArr[i].get("ImageLength");
        d dVar2 = mapArr[i].get("ImageWidth");
        d dVar3 = mapArr[i2].get("ImageLength");
        d dVar4 = mapArr[i2].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int i3 = dVar.i(this.h);
        int i4 = dVar2.i(this.h);
        int i5 = dVar3.i(this.h);
        int i6 = dVar4.i(this.h);
        if (i3 >= i5 || i4 >= i6) {
            return;
        }
        HashMap<String, d> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    public final void H(g gVar, int i) throws Throwable {
        d dVarF;
        d dVarF2;
        HashMap<String, d>[] mapArr = this.f;
        d dVar = mapArr[i].get("DefaultCropSize");
        d dVar2 = mapArr[i].get("SensorTopBorder");
        d dVar3 = mapArr[i].get("SensorLeftBorder");
        d dVar4 = mapArr[i].get("SensorBottomBorder");
        d dVar5 = mapArr[i].get("SensorRightBorder");
        if (dVar != null) {
            int i2 = dVar.a;
            ByteOrder byteOrder = this.h;
            if (i2 == 5) {
                f[] fVarArr = (f[]) dVar.k(byteOrder);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarF = d.e(new f[]{fVarArr[0]}, this.h);
                    dVarF2 = d.e(new f[]{fVarArr[1]}, this.h);
                }
            } else {
                int[] iArr = (int[]) dVar.k(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarF = d.f(iArr[0], this.h);
                dVarF2 = d.f(iArr[1], this.h);
            }
            mapArr[i].put("ImageWidth", dVarF);
            mapArr[i].put("ImageLength", dVarF2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int i3 = dVar2.i(this.h);
            int i4 = dVar4.i(this.h);
            int i5 = dVar5.i(this.h);
            int i6 = dVar3.i(this.h);
            if (i4 <= i3 || i5 <= i6) {
                return;
            }
            d dVarF3 = d.f(i4 - i3, this.h);
            d dVarF4 = d.f(i5 - i6, this.h);
            mapArr[i].put("ImageLength", dVarF3);
            mapArr[i].put("ImageWidth", dVarF4);
            return;
        }
        d dVar6 = mapArr[i].get("ImageLength");
        d dVar7 = mapArr[i].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i].get("JPEGInterchangeFormat");
            d dVar9 = mapArr[i].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int i7 = dVar8.i(this.h);
            int i8 = dVar8.i(this.h);
            gVar.f(i7);
            byte[] bArr = new byte[i8];
            gVar.readFully(bArr);
            g(new b(bArr), i7, i);
        }
    }

    public final void I() throws Throwable {
        G(0, 5);
        G(0, 4);
        G(5, 4);
        HashMap<String, d>[] mapArr = this.f;
        d dVar = mapArr[1].get("PixelXDimension");
        d dVar2 = mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && s(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!s(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        A(0, "ThumbnailOrientation", "Orientation");
        A(0, "ThumbnailImageLength", "ImageLength");
        A(0, "ThumbnailImageWidth", "ImageWidth");
        A(5, "ThumbnailOrientation", "Orientation");
        A(5, "ThumbnailImageLength", "ImageLength");
        A(5, "ThumbnailImageWidth", "ImageWidth");
        A(4, "Orientation", "ThumbnailOrientation");
        A(4, "ImageLength", "ThumbnailImageLength");
        A(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void K(c cVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.p = cVar.a.size() + J(new c(byteArrayOutputStream, ByteOrder.BIG_ENDIAN));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        cVar.write(byteArray);
        CRC32 crc32 = new CRC32();
        crc32.update(byteArray, 4, byteArray.length - 4);
        cVar.f((int) crc32.getValue());
    }

    public final void L(c cVar) throws IOException {
        cVar.f(this.t.d.length + 22);
        CRC32 crc32 = new CRC32();
        cVar.f(1767135348);
        crc32.update(105);
        crc32.update(26964);
        crc32.update(6902872);
        crc32.update(1767135348);
        byte[] bArr = J;
        cVar.write(bArr);
        crc32.update(bArr);
        cVar.write(this.t.d);
        crc32.update(this.t.d);
        cVar.f((int) crc32.getValue());
        this.u = true;
    }

    public final void a() {
        String strC = c("DateTimeOriginal");
        HashMap<String, d>[] mapArr = this.f;
        if (strC != null && c("DateTime") == null) {
            mapArr[0].put("DateTime", d.b(strC));
        }
        if (c("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.c(0L, this.h));
        }
        if (c("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.c(0L, this.h));
        }
        if (c("Orientation") == null) {
            mapArr[0].put("Orientation", d.c(0L, this.h));
        }
        if (c("LightSource") == null) {
            mapArr[1].put("LightSource", d.c(0L, this.h));
        }
    }

    public final String c(String str) {
        if (str == null) {
            bmy.a("tag shouldn't be null");
            return null;
        }
        d dVarE = e(str);
        if (dVarE != null) {
            int i = dVarE.a;
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                f[] fVarArr = (f[]) dVarE.k(this.h);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.a / fVar.b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.a / fVar2.b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.a / fVar3.b)));
            }
            boolean zContains = b0.contains(str);
            ByteOrder byteOrder = this.h;
            if (!zContains) {
                return dVarE.j(byteOrder);
            }
            try {
                return Double.toString(dVarE.h(byteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int d(int i, String str) {
        d dVarE = e(str);
        if (dVarE != null) {
            try {
                return dVarE.i(this.h);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public final d e(String str) {
        d dVar;
        int i;
        d dVar2;
        if (str == null) {
            bmy.a("tag shouldn't be null");
            return null;
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        String str2 = oLsIjJCWb.bswEtJ;
        if (str2.equals(str) && (i = this.d) != 4 && ((i == 9 || i == 15 || i == 12 || i == 13) && (dVar2 = this.t) != null)) {
            return dVar2;
        }
        for (int i2 = 0; i2 < X.length; i2++) {
            d dVar3 = this.f[i2].get(str);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        if (!str2.equals(str) || (dVar = this.t) == null) {
            return null;
        }
        return dVar;
    }

    public final void f(g gVar, int i) {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28) {
            zkh.a("Reading EXIF from HEIC files is supported from SDK 28 and above");
            return;
        }
        if (i == 15 && i3 < 31) {
            zkh.a("Reading EXIF from AVIF files is supported from SDK 31 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(new a(gVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                HashMap<String, d>[] mapArr = this.f;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.f(Integer.parseInt(strExtractMetadata), this.h));
                }
                if (strExtractMetadata3 != null) {
                    mapArr[0].put("ImageLength", d.f(Integer.parseInt(strExtractMetadata3), this.h));
                }
                if (strExtractMetadata2 != null) {
                    int i4 = Integer.parseInt(strExtractMetadata2);
                    if (i4 == 90) {
                        i2 = 6;
                    } else if (i4 != 180) {
                        i2 = i4 != 270 ? 1 : 8;
                    } else {
                        i2 = 3;
                    }
                    mapArr[0].put("Orientation", d.f(i2, this.h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i5 = Integer.parseInt(strExtractMetadata4);
                    int i6 = Integer.parseInt(strExtractMetadata5);
                    if (i6 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.f(i5);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i7 = i5 + 6;
                    int i8 = i6 - 6;
                    if (!Arrays.equals(bArr, e0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i8];
                    gVar.readFully(bArr2);
                    this.p = i7;
                    x(0, bArr2);
                }
                String strExtractMetadata8 = mediaMetadataRetriever.extractMetadata(41);
                String strExtractMetadata9 = mediaMetadataRetriever.extractMetadata(42);
                if (strExtractMetadata8 != null && strExtractMetadata9 != null) {
                    int i9 = Integer.parseInt(strExtractMetadata8);
                    int i10 = Integer.parseInt(strExtractMetadata9);
                    long j = i9;
                    gVar.f(j);
                    byte[] bArr3 = new byte[i10];
                    gVar.readFully(bArr3);
                    this.t = new d(j, bArr3, 1, i10);
                    this.u = true;
                }
                if (v) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata3 + ", rotation " + strExtractMetadata2);
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            } catch (RuntimeException e2) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.", e2);
            }
        } catch (Throwable th) {
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    public final void g(bvg.b r22, int r23, int r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvg.g(bvg$b, int, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:146:0x01a5  */
    public final int h(BufferedInputStream bufferedInputStream) throws Throwable {
        int i;
        b bVar;
        int i2;
        b bVar2;
        int i3;
        int i4;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        int i5 = 0;
        while (true) {
            byte[] bArr2 = A;
            if (i5 >= bArr2.length) {
                return 4;
            }
            if (bArr[i5] != bArr2[i5]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i6 = 0; i6 < bytes.length; i6++) {
                    if (bArr[i6] != bytes[i6]) {
                        b bVar3 = null;
                        try {
                            bVar = new b(bArr);
                            try {
                                try {
                                    long j2 = bVar.readInt();
                                    byte[] bArr3 = new byte[4];
                                    bVar.readFully(bArr3);
                                    if (Arrays.equals(bArr3, B)) {
                                        if (j2 == 1) {
                                            j2 = bVar.readLong();
                                            j = 16;
                                            if (j2 < 16) {
                                            }
                                            bVar.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            j = 8;
                                        }
                                        if (j2 > 5000) {
                                            j2 = 5000;
                                        }
                                        long j3 = j2 - j;
                                        if (j3 < 8) {
                                            bVar.close();
                                            i = 0;
                                            i2 = 0;
                                        } else {
                                            byte[] bArr4 = new byte[4];
                                            long j4 = 0;
                                            boolean z2 = false;
                                            boolean z3 = false;
                                            boolean z4 = false;
                                            while (true) {
                                                if (j4 < j3 / 4) {
                                                    try {
                                                        bVar.readFully(bArr4);
                                                        if (j4 != 1) {
                                                            i = 0;
                                                            try {
                                                                if (Arrays.equals(bArr4, C)) {
                                                                    z2 = true;
                                                                } else if (Arrays.equals(bArr4, D)) {
                                                                    z3 = true;
                                                                } else if (Arrays.equals(bArr4, E) || Arrays.equals(bArr4, F)) {
                                                                    z4 = true;
                                                                }
                                                                if (!z2) {
                                                                    continue;
                                                                } else if (z3) {
                                                                    bVar.close();
                                                                    i2 = 12;
                                                                } else if (z4) {
                                                                    bVar.close();
                                                                    i2 = 15;
                                                                }
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                if (v) {
                                                                    Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                                                }
                                                                if (bVar != null) {
                                                                    bVar.close();
                                                                }
                                                                i2 = i;
                                                            }
                                                        }
                                                        j4++;
                                                    } catch (EOFException unused) {
                                                        i = 0;
                                                        bVar.close();
                                                        i2 = i;
                                                    }
                                                } else {
                                                    i = 0;
                                                }
                                                bVar.close();
                                                i2 = i;
                                            }
                                        }
                                    } else {
                                        bVar.close();
                                        i = 0;
                                        i2 = 0;
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar3 = bVar;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i = 0;
                            bVar = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (bVar3 != null) {
                                bVar3.close();
                            }
                            throw th;
                        }
                        if (i2 != 0) {
                            return i2;
                        }
                        try {
                            bVar2 = new b(bArr);
                            try {
                                ByteOrder byteOrderW = w(bVar2);
                                this.h = byteOrderW;
                                bVar2.c = byteOrderW;
                                short s = bVar2.readShort();
                                i3 = (s == 20306 || s == 21330) ? 1 : i;
                                bVar2.close();
                            } catch (Exception unused2) {
                                if (bVar2 != null) {
                                    bVar2.close();
                                }
                                i3 = i;
                            } catch (Throwable th3) {
                                th = th3;
                                bVar3 = bVar2;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused3) {
                            bVar2 = null;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                        if (i3 != 0) {
                            return 7;
                        }
                        try {
                            b bVar4 = new b(bArr);
                            try {
                                ByteOrder byteOrderW2 = w(bVar4);
                                this.h = byteOrderW2;
                                bVar4.c = byteOrderW2;
                                i4 = bVar4.readShort() != 85 ? i : 1;
                                bVar4.close();
                            } catch (Exception unused4) {
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                i4 = i;
                            } catch (Throwable th5) {
                                th = th5;
                                bVar3 = bVar4;
                                if (bVar3 != null) {
                                    bVar3.close();
                                }
                                throw th;
                            }
                        } catch (Exception unused5) {
                        } catch (Throwable th6) {
                            th = th6;
                        }
                        if (i4 != 0) {
                            return 10;
                        }
                        int i7 = i;
                        while (true) {
                            byte[] bArr5 = I;
                            if (i7 >= bArr5.length) {
                                return 13;
                            }
                            if (bArr[i7] != bArr5[i7]) {
                                int i8 = i;
                                while (true) {
                                    byte[] bArr6 = K;
                                    if (i8 >= bArr6.length) {
                                        int i9 = i;
                                        while (true) {
                                            byte[] bArr7 = L;
                                            if (i9 >= bArr7.length) {
                                                return 14;
                                            }
                                            if (bArr[bArr6.length + i9 + 4] != bArr7[i9]) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    } else {
                                        if (bArr[i8] != bArr6[i8]) {
                                            break;
                                        }
                                        i8++;
                                    }
                                }
                                return i;
                            }
                            i7++;
                        }
                    }
                }
                return 9;
            }
            i5++;
        }
    }

    public final void i(g gVar) throws Throwable {
        int i;
        int i2;
        l(gVar);
        HashMap<String, d>[] mapArr = this.f;
        d dVar = mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.d);
            gVar2.c = this.h;
            byte[] bArr = G;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.f(0L);
            byte[] bArr3 = H;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.f(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.f(12L);
            }
            y(gVar2, 6);
            d dVar2 = mapArr[7].get("PreviewImageStart");
            d dVar3 = mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.k(this.h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                d dVarF = d.f(i5, this.h);
                d dVarF2 = d.f(i6, this.h);
                mapArr[0].put("ImageWidth", dVarF);
                mapArr[0].put("ImageLength", dVarF2);
            }
        }
    }

    public final void j(b bVar) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.c = ByteOrder.BIG_ENDIAN;
        int i = bVar.b;
        bVar.d(I.length);
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (z2 && z3) {
                break;
            }
            try {
                int i2 = bVar.readInt();
                int i3 = bVar.readInt();
                int i4 = bVar.b;
                int i5 = i4 + i2 + 4;
                int i6 = i4 - i;
                if (i6 == 16 && i3 != 1229472850) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appear as the first chunk");
                }
                if (i3 == 1229278788) {
                    break;
                }
                if (i3 == 1700284774 && !z2) {
                    this.p = i6;
                    byte[] bArr = new byte[i2];
                    bVar.readFully(bArr);
                    int i7 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(i3 >>> 24);
                    crc32.update(i3 >>> 16);
                    crc32.update(i3 >>> 8);
                    crc32.update(i3);
                    crc32.update(bArr);
                    if (((int) crc32.getValue()) != i7) {
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i7 + ", calculated CRC value: " + crc32.getValue());
                    }
                    x(0, bArr);
                    I();
                    F(new b(bArr));
                    z2 = true;
                } else if (i3 == 1767135348 && !z3) {
                    byte[] bArr2 = J;
                    if (i2 >= bArr2.length) {
                        int length = bArr2.length;
                        byte[] bArr3 = new byte[length];
                        bVar.readFully(bArr3);
                        if (Arrays.equals(bArr3, bArr2)) {
                            int i8 = bVar.b - i;
                            int i9 = i2 - length;
                            byte[] bArr4 = new byte[i9];
                            bVar.readFully(bArr4);
                            this.t = new d(i8, bArr4, 1, i9);
                            z3 = true;
                        }
                    }
                }
                bVar.d(i5 - bVar.b);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt PNG file.", e2);
            }
        }
        this.u = z3;
    }

    public final void k(b bVar) throws Throwable {
        boolean z2 = v;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.d(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        bVar.d(i - bVar.b);
        bVar.readFully(bArr4);
        g(new b(bArr4), i, 5);
        bVar.d(i3 - bVar.b);
        bVar.c = ByteOrder.BIG_ENDIAN;
        int i4 = bVar.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == W.a) {
                short s = bVar.readShort();
                short s2 = bVar.readShort();
                d dVarF = d.f(s, this.h);
                d dVarF2 = d.f(s2, this.h);
                HashMap<String, d>[] mapArr = this.f;
                mapArr[0].put("ImageLength", dVarF);
                mapArr[0].put("ImageWidth", dVarF2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s) + ", width: " + ((int) s2));
                    return;
                }
                return;
            }
            bVar.d(unsignedShort2);
        }
    }

    public final void l(g gVar) throws Throwable {
        u(gVar);
        y(gVar, 0);
        H(gVar, 0);
        H(gVar, 5);
        H(gVar, 4);
        I();
        if (this.d == 8) {
            HashMap<String, d>[] mapArr = this.f;
            d dVar = mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.d);
                gVar2.c = this.h;
                gVar2.d(6);
                y(gVar2, 9);
                d dVar2 = mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void m(g gVar) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        l(gVar);
        HashMap<String, d>[] mapArr = this.f;
        d dVar = mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            g(new b(dVar.d), (int) dVar.c, 5);
        }
        d dVar2 = mapArr[0].get("ISO");
        d dVar3 = mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    public final boolean n(g gVar) throws IOException {
        byte[] bArr = e0;
        byte[] bArr2 = new byte[bArr.length];
        gVar.readFully(bArr2);
        if (!Arrays.equals(bArr2, bArr)) {
            Log.w("ExifInterface", "Given data is not EXIF-only.");
            return false;
        }
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        while (true) {
            if (i == bArrCopyOf.length) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            int i2 = gVar.a.read(bArrCopyOf, i, bArrCopyOf.length - i);
            if (i2 == -1) {
                byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i);
                this.p = bArr.length;
                x(0, bArrCopyOf2);
                return true;
            }
            i += i2;
            gVar.b += i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0092 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final byte[] o() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        byte[] bArr;
        InputStream inputStream = null;
        if (this.i) {
            byte[] bArr2 = this.n;
            if (bArr2 != null) {
                return bArr2;
            }
            try {
                fileInputStream = this.c;
                if (fileInputStream != null) {
                    try {
                        if (!fileInputStream.markSupported()) {
                            Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                            evg.a(fileInputStream);
                            return null;
                        }
                        fileInputStream.reset();
                        fileDescriptor = null;
                        try {
                            try {
                                b bVar = new b(fileInputStream);
                                bVar.d(this.l + this.p);
                                bArr = new byte[this.m];
                                bVar.readFully(bArr);
                                this.n = bArr;
                                evg.a(fileInputStream);
                                if (fileDescriptor != null) {
                                    try {
                                        Os.close(fileDescriptor);
                                        return bArr;
                                    } catch (ErrnoException e2) {
                                        Log.e("ExifInterfaceUtils", "Error closing fd.", e2);
                                    }
                                }
                                return bArr;
                            } catch (Exception e3) {
                                e = e3;
                                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
                                evg.a(fileInputStream);
                                if (fileDescriptor != null) {
                                    try {
                                        Os.close(fileDescriptor);
                                    } catch (ErrnoException e4) {
                                        Log.e("ExifInterfaceUtils", "Error closing fd.", e4);
                                    }
                                }
                                return null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            inputStream = fileInputStream;
                            evg.a(inputStream);
                            if (fileDescriptor != null) {
                                try {
                                    Os.close(fileDescriptor);
                                } catch (ErrnoException e5) {
                                    Log.e("ExifInterfaceUtils", "Error closing fd.", e5);
                                }
                            }
                            throw th;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        fileDescriptor = null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = null;
                        inputStream = fileInputStream;
                        evg.a(inputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                } else {
                    String str = this.a;
                    if (str != null) {
                        fileInputStream = new FileInputStream(str);
                        fileDescriptor = null;
                        b bVar2 = new b(fileInputStream);
                        bVar2.d(this.l + this.p);
                        bArr = new byte[this.m];
                        bVar2.readFully(bArr);
                        this.n = bArr;
                        evg.a(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return bArr;
                        }
                        return bArr;
                    }
                    FileDescriptor fileDescriptorDup = Os.dup(this.b);
                    try {
                        Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = new FileInputStream(fileDescriptorDup);
                        b bVar3 = new b(fileInputStream);
                        bVar3.d(this.l + this.p);
                        bArr = new byte[this.m];
                        bVar3.readFully(bArr);
                        this.n = bArr;
                        evg.a(fileInputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                            return bArr;
                        }
                        return bArr;
                    } catch (Exception e7) {
                        e = e7;
                        fileDescriptor = fileDescriptorDup;
                        fileInputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileDescriptor = fileDescriptorDup;
                        evg.a(inputStream);
                        if (fileDescriptor != null) {
                            Os.close(fileDescriptor);
                        }
                        throw th;
                    }
                }
            } catch (Exception e8) {
                e = e8;
                fileInputStream = null;
                fileDescriptor = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e);
            evg.a(fileInputStream);
            if (fileDescriptor != null) {
                Os.close(fileDescriptor);
            }
        }
        return null;
    }

    public final void p(b bVar) throws Throwable {
        if (v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.c = ByteOrder.LITTLE_ENDIAN;
        bVar.d(K.length);
        int i = bVar.readInt() + 8;
        byte[] bArr = L;
        bVar.d(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i2 = bVar.readInt();
                int i3 = length + 8;
                if (Arrays.equals(M, bArr2)) {
                    byte[] bArrCopyOfRange = new byte[i2];
                    bVar.readFully(bArrCopyOfRange);
                    byte[] bArr3 = e0;
                    if (evg.e(bArrCopyOfRange, bArr3)) {
                        bArrCopyOfRange = Arrays.copyOfRange(bArrCopyOfRange, bArr3.length, i2);
                    }
                    this.p = i3;
                    x(0, bArrCopyOfRange);
                    F(new b(bArrCopyOfRange));
                    return;
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.d(i2);
            } catch (EOFException e2) {
                throw new IOException("Encountered corrupt WebP file.", e2);
            }
        }
    }

    public final void r(b bVar, HashMap<String, d> map) throws Throwable {
        d dVar = map.get("JPEGInterchangeFormat");
        d dVar2 = map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int i = dVar.i(this.h);
        int i2 = dVar2.i(this.h);
        if (this.d == 7) {
            i += this.q;
        }
        if (i > 0 && i2 > 0) {
            this.i = true;
            if (this.a == null && this.c == null && this.b == null) {
                byte[] bArr = new byte[i2];
                bVar.d(i);
                bVar.readFully(bArr);
                this.n = bArr;
            }
            this.l = i;
            this.m = i2;
        }
        if (v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + i + ", length: " + i2);
        }
    }

    public final boolean s(HashMap<String, d> map) {
        d dVar = map.get("ImageLength");
        d dVar2 = map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.i(this.h) <= 512 && dVar2.i(this.h) <= 512;
    }

    public final void t(InputStream inputStream) {
        boolean z2 = v;
        for (int i = 0; i < X.length; i++) {
            try {
                try {
                    this.f[i] = new HashMap<>();
                } catch (Throwable th) {
                    a();
                    if (z2) {
                        v();
                    }
                    throw th;
                }
            } catch (IOException | UnsupportedOperationException e2) {
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file (ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e2);
                }
                a();
                if (z2) {
                    v();
                    return;
                }
                return;
            }
        }
        boolean z3 = this.e;
        if (!z3) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.d = h(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        int i2 = this.d;
        if (i2 == 4 || i2 == 9 || i2 == 13 || i2 == 14) {
            b bVar = new b(inputStream);
            int i3 = this.d;
            if (i3 == 4) {
                g(bVar, 0, 0);
            } else if (i3 == 13) {
                j(bVar);
            } else if (i3 == 9) {
                k(bVar);
            } else if (i3 == 14) {
                p(bVar);
            }
        } else {
            g gVar = new g(inputStream);
            if (!z3) {
                int i4 = this.d;
                if (i4 == 12 || i4 == 15) {
                    f(gVar, i4);
                } else if (i4 == 7) {
                    i(gVar);
                } else if (i4 == 10) {
                    m(gVar);
                } else {
                    l(gVar);
                }
            } else if (!n(gVar)) {
                a();
                if (z2) {
                    v();
                    return;
                }
                return;
            }
            gVar.f(this.p);
            F(gVar);
        }
        a();
        if (z2) {
            v();
        }
    }

    public final void u(g gVar) throws IOException {
        ByteOrder byteOrderW = w(gVar);
        this.h = byteOrderW;
        gVar.c = byteOrderW;
        int unsignedShort = gVar.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            wnm.a(Integer.toHexString(unsignedShort), "Invalid start code: ");
            return;
        }
        int i2 = gVar.readInt();
        if (i2 < 8) {
            i08.a(hce0.a(i2, "Invalid first Ifd offset: "));
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            gVar.d(i3);
        }
    }

    public final void v() {
        int i = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.f;
            if (i >= mapArr.length) {
                return;
            }
            StringBuilder sbA = efe0.a(i, "The size of tag group[", "]: ");
            sbA.append(mapArr[i].size());
            Log.d("ExifInterface", sbA.toString());
            for (Map.Entry<String, d> entry : mapArr[i].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.j(this.h) + "'");
            }
            i++;
        }
    }

    public final void x(int i, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        u(gVar);
        y(gVar, i);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0210  */
    /* JADX WARN: Code duplicated, block: B:103:0x0214  */
    /* JADX WARN: Code duplicated, block: B:108:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x0232  */
    /* JADX WARN: Code duplicated, block: B:112:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:119:0x025b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0299  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:132:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:134:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:137:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:139:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:148:0x0328  */
    /* JADX WARN: Code duplicated, block: B:175:0x032b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x014f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0160  */
    /* JADX WARN: Code duplicated, block: B:76:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x017a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:82:0x018b  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0191  */
    /* JADX WARN: Code duplicated, block: B:86:0x0194  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0206  */
    /* JADX WARN: Code duplicated, block: B:97:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x020c  */
    /* JADX WARN: Instruction removed from duplicated block: B:129:0x02a1, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:76:0x0166, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:93:0x01eb, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void y(g gVar, int i) throws IOException {
        HashMap<String, d>[] mapArr;
        long j;
        long j2;
        boolean z2;
        int i2;
        long j3;
        Integer num;
        HashSet hashSet;
        long j4;
        String str;
        int unsignedShort;
        long j5;
        String strA;
        int i3;
        int i4 = gVar.b;
        int i5 = gVar.e;
        Integer numValueOf = Integer.valueOf(i4);
        HashSet hashSet2 = this.g;
        hashSet2.add(numValueOf);
        short s = gVar.readShort();
        boolean z3 = v;
        if (z3) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s));
        }
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (true) {
            mapArr = this.f;
            if (s2 >= s) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i6 = gVar.readInt();
            long j6 = ((long) gVar.b) + 4;
            short s3 = s;
            e eVar = Z[i].get(Integer.valueOf(unsignedShort2));
            if (z3) {
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), eVar != null ? eVar.b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i6)));
            }
            if (eVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = U;
                    if (unsignedShort3 < iArr.length) {
                        int i7 = eVar.c;
                        if (i7 == 7 || unsignedShort3 == 7 || i7 == unsignedShort3 || (i2 = eVar.d) == unsignedShort3 || (((i7 == 4 || i2 == 4) && unsignedShort3 == 3) || (((i7 == 9 || i2 == 9) && unsignedShort3 == 8) || ((i7 == 12 || i2 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i7;
                            }
                            j = j6;
                            j2 = ((long) i6) * ((long) iArr[unsignedShort3]);
                            if (j2 < 0 || j2 > 2147483647L) {
                                if (z3 != 0) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i6);
                                }
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                        } else if (z3 != 0) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + T[unsignedShort3] + ") is unexpected for tag: " + eVar.b);
                        }
                    }
                    if (z2) {
                        j3 = j;
                        if (j2 > 4) {
                            i3 = gVar.readInt();
                            if (z3 != 0) {
                                Log.d("ExifInterface", "seek to data offset: " + i3);
                            }
                            if (this.d == 7) {
                                if ("MakerNote".equals(eVar.b)) {
                                    this.q = i3;
                                } else if (i != 6 && "ThumbnailImage".equals(eVar.b)) {
                                    this.r = i3;
                                    this.s = i6;
                                    d dVarF = d.f(6, this.h);
                                    d dVarC = d.c(this.r, this.h);
                                    d dVarC2 = d.c(this.s, this.h);
                                    mapArr[4].put("Compression", dVarF);
                                    mapArr[4].put("JPEGInterchangeFormat", dVarC);
                                    mapArr[4].put("JPEGInterchangeFormatLength", dVarC2);
                                }
                            }
                            gVar.f(i3);
                        } else {
                            j3 = j3;
                            unsignedShort2 = unsignedShort2;
                            eVar = eVar;
                        }
                        num = c0.get(Integer.valueOf(unsignedShort2));
                        if (z3 != 0) {
                            Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == 4) {
                                    j5 = ((long) gVar.readInt()) & 4294967295L;
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = gVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = gVar.readInt();
                                } else {
                                    j5 = -1;
                                }
                                if (z3 != 0) {
                                    Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), eVar.b));
                                }
                                if (j5 > 0 || (i5 != -1 && j5 >= i5)) {
                                    hashSet = hashSet2;
                                    if (z3 != 0) {
                                        strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                        if (i5 != -1) {
                                            strA = strA + " (total length: " + i5 + ")";
                                        }
                                        Log.d("ExifInterface", strA);
                                    }
                                } else {
                                    hashSet = hashSet2;
                                    if (!hashSet.contains(Integer.valueOf((int) j5))) {
                                        gVar.f(j5);
                                        y(gVar, num.intValue());
                                    } else if (z3 != 0) {
                                        Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j5 + ")");
                                    }
                                }
                                gVar.f(j3);
                            } else {
                                unsignedShort = gVar.readUnsignedShort();
                            }
                            j5 = unsignedShort;
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), eVar.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strA = strA + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strA);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strA = strA + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strA);
                                }
                            }
                            gVar.f(j3);
                        } else {
                            hashSet = hashSet2;
                            j4 = j3;
                            int i8 = gVar.b + this.p;
                            byte[] bArr = new byte[(int) j2];
                            gVar.readFully(bArr);
                            d dVar = new d(i8, bArr, unsignedShort3, i6);
                            jou jouVar = mapArr[i];
                            str = eVar.b;
                            jouVar.put(str, dVar);
                            if ("DNGVersion".equals(str)) {
                                this.d = 3;
                            }
                            if (((!"Make".equals(str) || "Model".equals(str)) && dVar.j(this.h).contains("PENTAX")) || ("Compression".equals(str) && dVar.i(this.h) == 65535)) {
                                this.d = 8;
                            }
                            if (gVar.b != j4) {
                                gVar.f(j4);
                            }
                        }
                    } else {
                        gVar.f(j);
                        hashSet = hashSet2;
                    }
                    s2 = (short) (s2 + 1);
                    hashSet2 = hashSet;
                    s = s3;
                    z3 = z3;
                }
                j = j6;
                if (z3 != 0) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j2 = 0;
                z2 = false;
                if (z2) {
                    gVar.f(j);
                    hashSet = hashSet2;
                } else {
                    j3 = j;
                    if (j2 > 4) {
                        i3 = gVar.readInt();
                        if (z3 != 0) {
                            Log.d("ExifInterface", "seek to data offset: " + i3);
                        }
                        if (this.d == 7) {
                            if ("MakerNote".equals(eVar.b)) {
                                this.q = i3;
                            } else if (i != 6) {
                            }
                        }
                        gVar.f(i3);
                    } else {
                        j3 = j3;
                        unsignedShort2 = unsignedShort2;
                        eVar = eVar;
                    }
                    num = c0.get(Integer.valueOf(unsignedShort2));
                    if (z3 != 0) {
                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == 4) {
                                j5 = ((long) gVar.readInt()) & 4294967295L;
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = gVar.readInt();
                            } else {
                                unsignedShort = gVar.readShort();
                            }
                            if (z3 != 0) {
                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), eVar.b));
                            }
                            if (j5 > 0) {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strA = strA + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strA);
                                }
                            } else {
                                hashSet = hashSet2;
                                if (z3 != 0) {
                                    strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                    if (i5 != -1) {
                                        strA = strA + " (total length: " + i5 + ")";
                                    }
                                    Log.d("ExifInterface", strA);
                                }
                            }
                            gVar.f(j3);
                        } else {
                            unsignedShort = gVar.readUnsignedShort();
                        }
                        j5 = unsignedShort;
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), eVar.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strA = strA + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strA);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strA = strA + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strA);
                            }
                        }
                        gVar.f(j3);
                    } else {
                        hashSet = hashSet2;
                        j4 = j3;
                        int i9 = gVar.b + this.p;
                        byte[] bArr2 = new byte[(int) j2];
                        gVar.readFully(bArr2);
                        d dVar2 = new d(i9, bArr2, unsignedShort3, i6);
                        jou jouVar2 = mapArr[i];
                        str = eVar.b;
                        jouVar2.put(str, dVar2);
                        if ("DNGVersion".equals(str)) {
                            this.d = 3;
                        }
                        if (!"Make".equals(str)) {
                        }
                        this.d = 8;
                        if (gVar.b != j4) {
                            gVar.f(j4);
                        }
                    }
                }
                s2 = (short) (s2 + 1);
                hashSet2 = hashSet;
                s = s3;
                z3 = z3;
            } else if (z3) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j = j6;
            j2 = 0;
            z2 = false;
            if (z2) {
                gVar.f(j);
                hashSet = hashSet2;
            } else {
                j3 = j;
                if (j2 > 4) {
                    i3 = gVar.readInt();
                    if (z3 != 0) {
                        Log.d("ExifInterface", "seek to data offset: " + i3);
                    }
                    if (this.d == 7) {
                        if ("MakerNote".equals(eVar.b)) {
                            this.q = i3;
                        } else if (i != 6) {
                        }
                    }
                    gVar.f(i3);
                } else {
                    j3 = j3;
                    unsignedShort2 = unsignedShort2;
                    eVar = eVar;
                }
                num = c0.get(Integer.valueOf(unsignedShort2));
                if (z3 != 0) {
                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j2);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == 4) {
                            j5 = ((long) gVar.readInt()) & 4294967295L;
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = gVar.readInt();
                        } else {
                            unsignedShort = gVar.readShort();
                        }
                        if (z3 != 0) {
                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), eVar.b));
                        }
                        if (j5 > 0) {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strA = strA + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strA);
                            }
                        } else {
                            hashSet = hashSet2;
                            if (z3 != 0) {
                                strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                                if (i5 != -1) {
                                    strA = strA + " (total length: " + i5 + ")";
                                }
                                Log.d("ExifInterface", strA);
                            }
                        }
                        gVar.f(j3);
                    } else {
                        unsignedShort = gVar.readUnsignedShort();
                    }
                    j5 = unsignedShort;
                    if (z3 != 0) {
                        Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j5), eVar.b));
                    }
                    if (j5 > 0) {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strA = strA + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strA);
                        }
                    } else {
                        hashSet = hashSet2;
                        if (z3 != 0) {
                            strA = avg.a(j5, "Skip jump into the IFD since its offset is invalid: ");
                            if (i5 != -1) {
                                strA = strA + " (total length: " + i5 + ")";
                            }
                            Log.d("ExifInterface", strA);
                        }
                    }
                    gVar.f(j3);
                } else {
                    hashSet = hashSet2;
                    j4 = j3;
                    int i10 = gVar.b + this.p;
                    byte[] bArr3 = new byte[(int) j2];
                    gVar.readFully(bArr3);
                    d dVar3 = new d(i10, bArr3, unsignedShort3, i6);
                    jou jouVar3 = mapArr[i];
                    str = eVar.b;
                    jouVar3.put(str, dVar3);
                    if ("DNGVersion".equals(str)) {
                        this.d = 3;
                    }
                    if (!"Make".equals(str)) {
                    }
                    this.d = 8;
                    if (gVar.b != j4) {
                        gVar.f(j4);
                    }
                }
            }
            s2 = (short) (s2 + 1);
            hashSet2 = hashSet;
            s = s3;
            z3 = z3;
        }
        HashSet hashSet3 = hashSet2;
        boolean z4 = z3;
        int i11 = gVar.readInt();
        if (z4) {
            Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i11)));
        }
        long j7 = i11;
        if (j7 <= 0) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        if (hashSet3.contains(Integer.valueOf(i11))) {
            if (z4) {
                Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i11);
                return;
            }
            return;
        }
        gVar.f(j7);
        if (mapArr[4].isEmpty()) {
            y(gVar, 4);
        } else if (mapArr[5].isEmpty()) {
            y(gVar, 5);
        }
    }

    public final void z(String str) {
        for (int i = 0; i < X.length; i++) {
            this.f[i].remove(str);
        }
    }

    public final int J(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        int i;
        int[] iArr;
        int i2;
        e[][] eVarArr = X;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = Y;
        for (e eVar : eVarArr2) {
            z(eVar.b);
        }
        boolean z2 = this.i;
        String str = rarBonoqWB.Altx;
        if (z2) {
            if (this.j) {
                z("StripOffsets");
                z("StripByteCounts");
            } else {
                z("JPEGInterchangeFormat");
                z(str);
            }
        }
        int i3 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f;
            if (i3 >= length) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i3].entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue() == null) {
                    it.remove();
                }
            }
            i3++;
        }
        if (mapArr[1].isEmpty()) {
            i = 1;
        } else {
            i = 1;
            mapArr[0].put(eVarArr2[1].b, d.c(0L, this.h));
        }
        if (!mapArr[2].isEmpty()) {
            mapArr[r7].put(eVarArr2[2].b, d.c(0L, this.h));
        }
        if (!mapArr[3].isEmpty()) {
            mapArr[i].put(eVarArr2[3].b, d.c(0L, this.h));
        }
        int i4 = 4;
        if (this.i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", d.f(0, this.h));
                mapArr[4].put("StripByteCounts", d.f(this.m, this.h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(0L, this.h));
                mapArr[4].put(str, d.c(this.m, this.h));
            }
        }
        int i5 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = U;
            if (i5 >= length2) {
                break;
            }
            Iterator<Map.Entry<String, d>> it2 = mapArr[i5].entrySet().iterator();
            int i6 = 0;
            while (it2.hasNext()) {
                d value = it2.next().getValue();
                value.getClass();
                int i7 = iArr[value.a] * value.b;
                if (i7 > 4) {
                    i6 += i7;
                }
            }
            iArr3[i5] = iArr3[i5] + i6;
            i5++;
        }
        int size = 8;
        for (int i8 = 0; i8 < eVarArr.length; i8++) {
            if (!mapArr[i8].isEmpty()) {
                iArr2[i8] = size;
                size = (mapArr[i8].size() * 12) + 6 + iArr3[i8] + size;
            }
        }
        if (this.i) {
            if (this.j) {
                mapArr[4].put("StripOffsets", d.f(size, this.h));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.c(size, this.h));
            }
            this.l = size;
            size += this.m;
        }
        if (this.d == 4) {
            size += 8;
        }
        if (v) {
            for (int i9 = 0; i9 < eVarArr.length; i9++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i9), Integer.valueOf(iArr2[i9]), Integer.valueOf(mapArr[i9].size()), Integer.valueOf(iArr3[i9]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i].isEmpty()) {
            mapArr[0].put(eVarArr2[i].b, d.c(iArr2[i], this.h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[0].put(eVarArr2[r6].b, d.c(iArr2[2], this.h));
        }
        if (!mapArr[r6].isEmpty()) {
            mapArr[i].put(eVarArr2[r6].b, d.c(iArr2[3], this.h));
        }
        int i10 = this.d;
        if (i10 == 4) {
            if (size > 65535) {
                ib5.a(pe4.b(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
                return 0;
            }
            cVar.m(size);
            cVar.write(e0);
        } else if (i10 == 13) {
            cVar.f(size);
            cVar.f(1700284774);
        } else if (i10 == 14) {
            cVar.write(M);
            cVar.f(size);
        }
        int size2 = cVar.a.size();
        cVar.g(this.h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.b = this.h;
        cVar.m(42);
        cVar.l(8L);
        int i11 = 0;
        while (i11 < eVarArr.length) {
            if (mapArr[i11].isEmpty()) {
                i2 = i4;
            } else {
                cVar.m(mapArr[i11].size());
                int size3 = (mapArr[i11].size() * 12) + iArr2[i11] + 2 + i4;
                for (Map.Entry<String, d> entry : mapArr[i11].entrySet()) {
                    int i12 = a0[i11].get(entry.getKey()).a;
                    d value2 = entry.getValue();
                    value2.getClass();
                    int i13 = value2.b;
                    int i14 = value2.a;
                    int i15 = iArr[i14] * i13;
                    cVar.m(i12);
                    cVar.m(i14);
                    cVar.f(i13);
                    if (i15 > 4) {
                        cVar.l(size3);
                        size3 += i15;
                    } else {
                        cVar.write(value2.d);
                        if (i15 < 4) {
                            while (i15 < 4) {
                                cVar.d(0);
                                i15++;
                            }
                        }
                    }
                    i4 = 4;
                }
                int i16 = i4;
                if (i11 != 0 || mapArr[i16].isEmpty()) {
                    cVar.l(0L);
                } else {
                    cVar.l(iArr2[i16]);
                }
                Iterator<Map.Entry<String, d>> it3 = mapArr[i11].entrySet().iterator();
                while (it3.hasNext()) {
                    byte[] bArr = it3.next().getValue().d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
                i2 = 4;
            }
            i11++;
            i4 = i2;
        }
        if (this.i) {
            cVar.write(o());
        }
        if (this.d == 14 && size % 2 == i) {
            cVar.d(0);
        }
        cVar.b = ByteOrder.BIG_ENDIAN;
        return size2;
    }

    public static class c extends FilterOutputStream {
        public final DataOutputStream a;
        public ByteOrder b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.a = new DataOutputStream(outputStream);
            this.b = byteOrder;
        }

        public final void d(int i) throws IOException {
            this.a.write(i);
        }

        public final void f(int i) throws IOException {
            ByteOrder byteOrder = this.b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            DataOutputStream dataOutputStream = this.a;
            if (byteOrder == byteOrder2) {
                dataOutputStream.write(i & 255);
                dataOutputStream.write((i >>> 8) & 255);
                dataOutputStream.write((i >>> 16) & 255);
                dataOutputStream.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                dataOutputStream.write((i >>> 24) & 255);
                dataOutputStream.write((i >>> 16) & 255);
                dataOutputStream.write((i >>> 8) & 255);
                dataOutputStream.write(i & 255);
            }
        }

        public final void g(short s) throws IOException {
            ByteOrder byteOrder = this.b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            DataOutputStream dataOutputStream = this.a;
            if (byteOrder == byteOrder2) {
                dataOutputStream.write(s & 255);
                dataOutputStream.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                dataOutputStream.write((s >>> 8) & 255);
                dataOutputStream.write(s & 255);
            }
        }

        public final void l(long j) throws IOException {
            if (j <= 4294967295L) {
                f((int) j);
            } else {
                hb5.a("val is larger than the maximum value of a 32-bit unsigned integer");
            }
        }

        public final void m(int i) throws IOException {
            if (i <= 65535) {
                g((short) i);
            } else {
                hb5.a("val is larger than the maximum value of a 16-bit unsigned integer");
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) throws IOException {
            this.a.write(bArr, i, i2);
        }
    }

    public static class b extends InputStream implements DataInput {
        public final DataInputStream a;
        public int b;
        public ByteOrder c;
        public byte[] d;
        public final int e;

        public b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.a = dataInputStream;
            dataInputStream.mark(0);
            this.b = 0;
            this.c = byteOrder;
            this.e = inputStream instanceof b ? ((b) inputStream).e : -1;
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.a.available();
        }

        public final void d(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                DataInputStream dataInputStream = this.a;
                int iSkip = (int) dataInputStream.skip(i3);
                if (iSkip <= 0) {
                    if (this.d == null) {
                        this.d = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException(pe4.b(i, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i2 += iSkip;
            }
            this.b += i2;
        }

        @Override // java.io.InputStream
        public final void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() {
            this.b++;
            return this.a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.b++;
            return this.a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.b++;
            int i = this.a.read();
            if (i >= 0) {
                return (byte) i;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.b += 2;
            return this.a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.b += bArr.length;
            this.a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.b += 4;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            if ((i | i2 | i3 | i4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            wnm.a(this.c, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            this.b += 8;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            int i3 = dataInputStream.read();
            int i4 = dataInputStream.read();
            int i5 = dataInputStream.read();
            int i6 = dataInputStream.read();
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            wnm.a(this.c, "Invalid byte order: ");
            return 0L;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.b += 2;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i << 8) + i2);
            }
            wnm.a(this.c, "Invalid byte order: ");
            return (short) 0;
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.b += 2;
            return this.a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.b++;
            return this.a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.b += 2;
            DataInputStream dataInputStream = this.a;
            int i = dataInputStream.read();
            int i2 = dataInputStream.read();
            if ((i | i2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i2 << 8) + i;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i << 8) + i2;
            }
            wnm.a(this.c, "Invalid byte order: ");
            return 0;
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.b += i2;
            this.a.readFully(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.a.read(bArr, i, i2);
            this.b += i3;
            return i3;
        }

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.e = bArr.length;
        }
    }

    public static class d {
        public final int a;
        public final int b;
        public final long c;
        public final byte[] d;

        public d(long j, byte[] bArr, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = j;
            this.d = bArr;
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(new byte[]{(byte) (str.charAt(0) - '0')}, 1, 1);
            }
            byte[] bytes = str.getBytes(bvg.d0);
            return new d(bytes, 1, bytes.length);
        }

        public static d b(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(bvg.d0);
            return new d(bytes, 2, bytes.length);
        }

        public static d c(long j, ByteOrder byteOrder) {
            return d(new long[]{j}, byteOrder);
        }

        public static d d(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bvg.U[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new d(byteBufferWrap.array(), 4, jArr.length);
        }

        public static d e(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bvg.U[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.a);
                byteBufferWrap.putInt((int) fVar.b);
            }
            return new d(byteBufferWrap.array(), 5, fVarArr.length);
        }

        public static d f(int i, ByteOrder byteOrder) {
            return g(new int[]{i}, byteOrder);
        }

        public static d g(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[bvg.U[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new d(byteBufferWrap.array(), 3, iArr.length);
        }

        public final double h(ByteOrder byteOrder) {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objK instanceof String) {
                return Double.parseDouble((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objK;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.a / fVar.b;
        }

        public final int i(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objK instanceof String) {
                return Integer.parseInt((String) objK);
            }
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objK instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objK;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String j(ByteOrder byteOrder) throws Throwable {
            Object objK = k(byteOrder);
            if (objK == null) {
                return null;
            }
            if (objK instanceof String) {
                return (String) objK;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objK instanceof long[]) {
                long[] jArr = (long[]) objK;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof int[]) {
                int[] iArr = (int[]) objK;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objK instanceof double[]) {
                double[] dArr = (double[]) objK;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objK instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objK;
            while (i < fVarArr.length) {
                sb.append(fVarArr[i].a);
                sb.append('/');
                sb.append(fVarArr[i].b);
                i++;
                if (i != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Code duplicated, block: B:103:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
        /* JADX WARN: Type inference failed for: r13v14, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v15, types: [long[]] */
        /* JADX WARN: Type inference failed for: r13v16, types: [bvg$f[]] */
        /* JADX WARN: Type inference failed for: r13v17, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v18, types: [int[]] */
        /* JADX WARN: Type inference failed for: r13v19, types: [bvg$f[]] */
        /* JADX WARN: Type inference failed for: r13v20, types: [double[]] */
        /* JADX WARN: Type inference failed for: r13v21, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r13v22, types: [double[]] */
        public final Serializable k(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            String str;
            byte b;
            ?? r13;
            byte[] bArr = this.d;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.c = byteOrder;
                        int i = this.a;
                        int length = 0;
                        int i2 = this.b;
                        switch (i) {
                            case 1:
                            case 6:
                                if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                    str = new String(bArr, bvg.d0);
                                    try {
                                        bVar.close();
                                        return str;
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                        return str;
                                    }
                                }
                                String str2 = new String(new char[]{(char) (b + 48)});
                                try {
                                    bVar.close();
                                    return str2;
                                } catch (IOException e2) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                                    return str2;
                                }
                            case 2:
                            case 7:
                                if (i2 >= bvg.V.length) {
                                    int i3 = 0;
                                    while (true) {
                                        byte[] bArr2 = bvg.V;
                                        if (i3 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i3] == bArr2[i3]) {
                                            i3++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < i2) {
                                    byte b2 = bArr[length];
                                    if (b2 == 0) {
                                        str = sb.toString();
                                        bVar.close();
                                        return str;
                                    }
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    length++;
                                }
                                str = sb.toString();
                                bVar.close();
                                return str;
                            case 3:
                                r13 = new int[i2];
                                while (length < i2) {
                                    r13[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                                try {
                                    bVar.close();
                                    return r13;
                                } catch (IOException e3) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                                    return r13;
                                }
                            case 4:
                                r13 = new long[i2];
                                while (length < i2) {
                                    r13[length] = ((long) bVar.readInt()) & 4294967295L;
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            case 5:
                                r13 = new f[i2];
                                while (length < i2) {
                                    r13[length] = new f(((long) bVar.readInt()) & 4294967295L, ((long) bVar.readInt()) & 4294967295L);
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            case 8:
                                r13 = new int[i2];
                                while (length < i2) {
                                    r13[length] = bVar.readShort();
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            case 9:
                                r13 = new int[i2];
                                while (length < i2) {
                                    r13[length] = bVar.readInt();
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            case 10:
                                r13 = new f[i2];
                                while (length < i2) {
                                    r13[length] = new f(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            case 11:
                                r13 = new double[i2];
                                while (length < i2) {
                                    r13[length] = bVar.readFloat();
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            case 12:
                                r13 = new double[i2];
                                while (length < i2) {
                                    r13[length] = bVar.readDouble();
                                    length++;
                                }
                                bVar.close();
                                return r13;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e4) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                                    return null;
                                }
                        }
                    } catch (IOException e5) {
                        e = e5;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e6) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e7) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        }
                    }
                    throw th;
                }
            } catch (IOException e8) {
                e = e8;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(bvg.T[this.a]);
            sb.append(", data length:");
            return zk1.a(this.d.length, ")", sb);
        }

        public d(byte[] bArr, int i, int i2) {
            this(-1L, bArr, i, i2);
        }
    }

    public static class e {
        public final int a;
        public final String b;
        public final int c;
        public final int d;

        public e(String str, int i, int i2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = -1;
        }

        public e(int i, int i2, int i3, String str) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = i3;
        }
    }

    public class a extends MediaDataSource {
        public long a;
        public final /* synthetic */ g b;

        public a(g gVar) {
            this.b = gVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j, byte[] bArr, int i, int i2) {
            g gVar = this.b;
            DataInputStream dataInputStream = gVar.a;
            if (i2 == 0) {
                return 0;
            }
            if (j >= 0) {
                try {
                    long j2 = this.a;
                    if (j2 != j) {
                        if (j2 < 0 || j < j2 + ((long) dataInputStream.available())) {
                            gVar.f(j);
                            this.a = j;
                        }
                    }
                    if (i2 > dataInputStream.available()) {
                        i2 = dataInputStream.available();
                    }
                    int i3 = gVar.read(bArr, i, i2);
                    if (i3 >= 0) {
                        this.a += (long) i3;
                        return i3;
                    }
                } catch (IOException unused) {
                }
                this.a = -1L;
                return -1;
            }
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }

    public static class g extends b {
        public g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.a.mark(Reader.READ_DONE);
            } else {
                hb5.a("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
                throw null;
            }
        }

        public final void f(long j) throws IOException {
            int i = this.b;
            if (i > j) {
                this.b = 0;
                this.a.reset();
            } else {
                j -= (long) i;
            }
            d((int) j);
        }

        public g(byte[] bArr) {
            super(bArr);
            this.a.mark(Reader.READ_DONE);
        }
    }

    public bvg(String str) throws Throwable {
        boolean z2;
        e[][] eVarArr = X;
        this.f = new HashMap[eVarArr.length];
        this.g = new HashSet(eVarArr.length);
        this.h = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (str != null) {
            this.c = null;
            this.a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        Os.lseek(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        if (v) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    t(fileInputStream2);
                    evg.a(fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    evg.a(fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            bmy.a("filename cannot be null");
            throw null;
        }
    }
}
