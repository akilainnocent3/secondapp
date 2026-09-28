package defpackage;

import android.system.Os;
import android.system.OsConstants;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class uug {
    public static final a b = new a();
    public static final b c = new b();
    public static final c d = new c();
    public static final List<String> e = Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", iKBWavCysVP.CgEHDyxJJllpGdC, "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    public static final List<String> f = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");
    public final bvg a;

    public class a extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    public class b extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    public class c extends ThreadLocal<SimpleDateFormat> {
        @Override // java.lang.ThreadLocal
        public final SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    public uug(bvg bvgVar) {
        this.a = bvgVar;
    }

    public final int a() {
        switch (this.a.d(0, "Orientation")) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void b(int i) {
        int i2 = i % 90;
        bvg bvgVar = this.a;
        if (i2 != 0) {
            Locale locale = Locale.US;
            pgt.i("uug", "Can only rotate in right angles (eg. 0, 90, 180, 270). " + i + " is unsupported.");
            bvgVar.E("Orientation", String.valueOf(0));
            return;
        }
        int i3 = i % 360;
        int iD = bvgVar.d(0, "Orientation");
        while (i3 < 0) {
            i3 += 90;
            switch (iD) {
                case 2:
                    iD = 5;
                    break;
                case 3:
                case 8:
                    iD = 6;
                    break;
                case 4:
                    iD = 7;
                    break;
                case 5:
                    iD = 4;
                    break;
                case 6:
                    iD = 1;
                    break;
                case 7:
                    iD = 2;
                    break;
                default:
                    iD = 8;
                    break;
            }
        }
        while (i3 > 0) {
            i3 -= 90;
            switch (iD) {
                case 2:
                    iD = 7;
                    break;
                case 3:
                    iD = 8;
                    break;
                case 4:
                    iD = 5;
                    break;
                case 5:
                    iD = 2;
                    break;
                case 6:
                    iD = 3;
                    break;
                case 7:
                    iD = 4;
                    break;
                case 8:
                    iD = 1;
                    break;
                default:
                    iD = 6;
                    break;
            }
        }
        bvgVar.E("Orientation", String.valueOf(iD));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x017f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0127 A[Catch: all -> 0x0130, Exception -> 0x0133, TryCatch #16 {Exception -> 0x0133, all -> 0x0130, blocks: (B:81:0x0123, B:83:0x0127, B:90:0x0145, B:89:0x0136), top: B:140:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0136 A[Catch: all -> 0x0130, Exception -> 0x0133, TryCatch #16 {Exception -> 0x0133, all -> 0x0130, blocks: (B:81:0x0123, B:83:0x0127, B:90:0x0145, B:89:0x0136), top: B:140:0x0123 }] */
    public final void c() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        Object obj;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c cVar = d;
        String str = cVar.get().format(new Date(jCurrentTimeMillis));
        bvg bvgVar = this.a;
        bvgVar.E("DateTime", str);
        try {
            bvgVar.E("SubSecTime", Long.toString(jCurrentTimeMillis - cVar.get().parse(str).getTime()));
        } catch (ParseException unused) {
        }
        int i = bvgVar.d;
        if (i != 4 && i != 13 && i != 14) {
            i08.a("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
            return;
        }
        if (bvgVar.b == null && bvgVar.a == null) {
            i08.a("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (bvgVar.i && bvgVar.j && !bvgVar.k) {
            i08.a("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        int i2 = bvgVar.o;
        Closeable closeable = null;
        bvgVar.n = (i2 == 6 || i2 == 7) ? bvgVar.o() : null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (bvgVar.a != null) {
                fileInputStream = new FileInputStream(bvgVar.a);
            } else {
                Os.lseek(bvgVar.b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(bvgVar.b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    evg.d(fileInputStream, fileOutputStream);
                    evg.a(fileInputStream);
                    evg.a(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (bvgVar.a != null) {
                                        fileOutputStream2 = new FileOutputStream(bvgVar.a);
                                    } else {
                                        Os.lseek(bvgVar.b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(bvgVar.b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i3 = bvgVar.d;
                                                if (i3 == 4) {
                                                    bvgVar.B(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 13) {
                                                    bvgVar.C(bufferedInputStream, bufferedOutputStream);
                                                } else if (i3 == 14) {
                                                    bvgVar.D(bufferedInputStream, bufferedOutputStream);
                                                }
                                                evg.a(bufferedInputStream);
                                                evg.a(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                bvgVar.n = null;
                                            } catch (Exception e2) {
                                                e = e2;
                                                closeable = fileInputStream3;
                                                try {
                                                    try {
                                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                        try {
                                                            if (bvgVar.a != null) {
                                                                fileOutputStream3 = new FileOutputStream(bvgVar.a);
                                                            } else {
                                                                Os.lseek(bvgVar.b, 0L, OsConstants.SEEK_SET);
                                                                fileOutputStream3 = new FileOutputStream(bvgVar.b);
                                                            }
                                                            fileOutputStream2 = fileOutputStream3;
                                                            evg.d(fileInputStream2, fileOutputStream2);
                                                            evg.a(fileInputStream2);
                                                            evg.a(fileOutputStream2);
                                                            throw new IOException("Failed to save new file", e);
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            closeable = fileInputStream2;
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            closeable = fileInputStream2;
                                                            evg.a(closeable);
                                                            evg.a(fileOutputStream2);
                                                            throw th;
                                                        }
                                                    } catch (Exception e4) {
                                                        e = e4;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                }
                                            }
                                        } catch (Exception e5) {
                                            e = e5;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            closeable = bufferedInputStream;
                                            evg.a(closeable);
                                            evg.a(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e6) {
                                        e = e6;
                                        obj = null;
                                        closeable = fileInputStream3;
                                        fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                        if (bvgVar.a != null) {
                                            fileOutputStream3 = new FileOutputStream(bvgVar.a);
                                        } else {
                                            Os.lseek(bvgVar.b, 0L, OsConstants.SEEK_SET);
                                            fileOutputStream3 = new FileOutputStream(bvgVar.b);
                                        }
                                        fileOutputStream2 = fileOutputStream3;
                                        evg.d(fileInputStream2, fileOutputStream2);
                                        evg.a(fileInputStream2);
                                        evg.a(fileOutputStream2);
                                        throw new IOException("Failed to save new file", e);
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                    fileOutputStream2 = null;
                                    obj = null;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                evg.a(closeable);
                                evg.a(0);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e8) {
                            e = e8;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Exception e9) {
                    e = e9;
                    closeable = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th6) {
                        th = th6;
                        evg.a(closeable);
                        evg.a(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    closeable = fileInputStream;
                    evg.a(closeable);
                    evg.a(fileOutputStream);
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileOutputStream = null;
            } catch (Throwable th8) {
                th = th8;
                fileOutputStream = null;
            }
        } catch (Exception e11) {
            e = e11;
            fileOutputStream = null;
        } catch (Throwable th9) {
            th = th9;
            fileOutputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01f7 A[Catch: NumberFormatException -> 0x01fe, TRY_LEAVE, TryCatch #2 {NumberFormatException -> 0x01fe, blocks: (B:105:0x01ed, B:108:0x01f7), top: B:124:0x01ed }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0113 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115 A[Catch: ParseException -> 0x010e, TRY_ENTER, TryCatch #5 {ParseException -> 0x010e, blocks: (B:54:0x0115, B:57:0x012a), top: B:130:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0128 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x012a A[Catch: ParseException -> 0x010e, TRY_LEAVE, TryCatch #5 {ParseException -> 0x010e, blocks: (B:54:0x0115, B:57:0x012a), top: B:130:0x0113 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153  */
    /* JADX WARN: Code duplicated, block: B:63:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x015b  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160  */
    /* JADX WARN: Code duplicated, block: B:69:0x0179  */
    /* JADX WARN: Code duplicated, block: B:72:0x0180  */
    /* JADX WARN: Code duplicated, block: B:74:0x018d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0191  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01af  */
    /* JADX WARN: Code duplicated, block: B:92:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01dd  */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ac, code lost:
    
        if (r3.equals("M") != false) goto L83;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instruction units count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uug.toString():java.lang.String");
    }
}
