package l3;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.media.AudioAttributesCompat;
import com.ironsource.C4271f4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.vungle.ads.internal.protos.Sdk;
import dc.q;
import gi.j;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import k.y0;
import r7.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class a {
    public static final String A = "Compression";
    public static final String A0 = "OECF";
    public static final String A1 = "GPSLongitudeRef";
    public static final String A2 = "CameraSettingsIFDPointer";
    public static final short A3 = 9;
    public static final short A4 = 2;
    public static final int A5 = 0;
    public static final int A6 = 9;
    public static final byte A7 = -49;
    public static final String B = "PhotometricInterpretation";
    public static final String B0 = "SensitivityType";
    public static final String B1 = "GPSLongitude";
    public static final String B2 = "ImageProcessingIFDPointer";
    public static final short B3 = 10;
    public static final short B4 = 3;
    public static final int B5 = 1;
    public static final int B6 = 10;
    public static final byte B7 = -38;
    public static final String C = "Orientation";
    public static final String C0 = "StandardOutputSensitivity";
    public static final String C1 = "GPSAltitudeRef";
    public static final int C2 = 512;
    public static final short C3 = 11;
    public static final short C4 = 4;
    public static final int C5 = 5000;
    public static final int C6 = 11;
    public static final byte C7 = -31;
    public static final String D = "SamplesPerPixel";
    public static final String D0 = "RecommendedExposureIndex";
    public static final String D1 = "GPSAltitude";
    public static final int D2 = 0;
    public static final short D3 = 12;
    public static final short D4 = 0;
    public static final int D6 = 12;
    public static final byte D7 = -2;
    public static final String E = "PlanarConfiguration";
    public static final String E0 = "ISOSpeed";
    public static final String E1 = "GPSTimeStamp";
    public static final int E2 = 1;
    public static final short E3 = 13;
    public static final short E4 = 1;
    public static final String E5 = "FUJIFILMCCD-RAW";
    public static final int E6 = 13;
    public static final byte E7 = -39;
    public static final String F = "YCbCrSubSampling";
    public static final String F0 = "ISOSpeedLatitudeyyy";
    public static final String F1 = "GPSSatellites";
    public static final int F2 = 2;
    public static final short F3 = 14;
    public static final short F4 = 2;
    public static final int F5 = 84;
    public static final int F6 = 8192;
    public static final int F7 = 0;
    public static final String G = "YCbCrPositioning";
    public static final String G0 = "ISOSpeedLatitudezzz";
    public static final String G1 = "GPSStatus";
    public static final int G2 = 3;
    public static final short G3 = 15;
    public static final short G4 = 0;
    public static final int G7 = 1;
    public static final String H = "XResolution";
    public static final String H0 = "ShutterSpeedValue";
    public static final String H1 = "GPSMeasureMode";
    public static final int H2 = 4;
    public static final short H3 = 16;
    public static final short H4 = 0;
    public static final int H7 = 2;
    public static final String I = "YResolution";
    public static final String I0 = "ApertureValue";
    public static final String I1 = "GPSDOP";
    public static final int I2 = 5;
    public static final short I3 = 17;
    public static final short I4 = 0;
    public static final int I7 = 3;
    public static final String J = "ResolutionUnit";
    public static final String J0 = "BrightnessValue";
    public static final String J1 = "GPSSpeedRef";
    public static final int J2 = 6;
    public static final short J3 = 18;
    public static final short J4 = 0;
    public static final short J5 = 20306;
    public static final f[] J6;
    public static final int J7 = 4;
    public static final String K = "StripOffsets";
    public static final String K0 = "ExposureBiasValue";
    public static final String K1 = "GPSSpeed";
    public static final int K2 = 7;
    public static final short K3 = 19;
    public static final short K4 = 1;
    public static final short K5 = 21330;
    public static final f[] K6;
    public static final int K7 = 5;
    public static final String L = "RowsPerStrip";
    public static final String L0 = "MaxApertureValue";
    public static final String L1 = "GPSTrackRef";
    public static final int L2 = 8;
    public static final short L3 = 20;
    public static final short L4 = 2;
    public static final f[] L6;
    public static final int L7 = 6;
    public static final String M = "StripByteCounts";
    public static final String M0 = "SubjectDistance";
    public static final String M1 = "GPSTrack";
    public static final short M3 = 21;
    public static final short M4 = 0;
    public static final f[] M6;
    public static final int M7 = 7;
    public static final String N = "JPEGInterchangeFormat";
    public static final String N0 = "MeteringMode";
    public static final String N1 = "GPSImgDirectionRef";
    public static final short N3 = 22;
    public static final short N4 = 1;
    public static final int N5 = 8;
    public static final f[] N6;
    public static final int N7 = 8;
    public static final String O = "JPEGInterchangeFormatLength";
    public static final String O0 = "LightSource";
    public static final String O1 = "GPSImgDirection";
    public static final short O2 = 1;
    public static final short O3 = 23;
    public static final short O4 = 2;
    public static final int O5 = 12;
    public static final f O6;
    public static final int O7 = 9;
    public static final String P = "TransferFunction";
    public static final String P0 = "Flash";
    public static final String P1 = "GPSMapDatum";
    public static final short P2 = 2;
    public static final short P3 = 24;
    public static final short P4 = 3;
    public static final short P5 = 85;
    public static final f[] P6;
    public static final int P7 = 10;
    public static final String Q = "WhitePoint";
    public static final String Q0 = "SubjectArea";
    public static final String Q1 = "GPSDestLatitudeRef";
    public static final short Q2 = 1;
    public static final short Q3 = 255;
    public static final String Q4 = "N";
    public static final String Q5 = "PENTAX";
    public static final f[] Q6;
    public static final int Q7 = 11;
    public static final String R = "PrimaryChromaticities";
    public static final String R0 = "FocalLength";
    public static final String R1 = "GPSDestLatitude";
    public static final short R2 = 2;
    public static final short R3 = 1;
    public static final String R4 = "S";
    public static final int R5 = 6;
    public static final f[] R6;
    public static final int R7 = 12;
    public static final String S = "YCbCrCoefficients";
    public static final String S0 = "FlashEnergy";
    public static final String S1 = "GPSDestLongitudeRef";
    public static final short S2 = 2;
    public static final short S3 = 4;
    public static final String S4 = "E";
    public static final f[] S6;
    public static final int S7 = 13;
    public static final String T = "ReferenceBlackWhite";
    public static final String T0 = "SpatialFrequencyResponse";
    public static final String T1 = "GPSDestLongitude";
    public static final short T2 = 3;
    public static final short T3 = 6;
    public static final String T4 = "W";
    public static final int T6 = 0;
    public static final int T7 = 14;
    public static final String U = "DateTime";
    public static final String U0 = "FocalPlaneXResolution";
    public static final String U1 = "GPSDestBearingRef";
    public static final int U2 = 1;
    public static final short U3 = 8;
    public static final short U4 = 0;
    public static final int U6 = 1;
    public static final Pattern U7;
    public static final String V = "ImageDescription";
    public static final String V0 = "FocalPlaneYResolution";
    public static final String V1 = "GPSDestBearing";
    public static final int V2 = 65535;
    public static final short V3 = 16;
    public static final short V4 = 1;
    public static final int V6 = 2;
    public static final Pattern V7;
    public static final String W = "Make";
    public static final String W0 = "FocalPlaneResolutionUnit";
    public static final String W1 = "GPSDestDistanceRef";
    public static final short W2 = 0;
    public static final short W3 = 24;
    public static final String W4 = "A";
    public static final int W5 = 4;
    public static final int W6 = 3;
    public static final Pattern W7;
    public static final String X = "Model";
    public static final String X0 = "SubjectLocation";
    public static final String X1 = "GPSDestDistance";
    public static final short X2 = 1;
    public static final short X3 = 32;
    public static final String X4 = "V";
    public static final int X5 = 4;
    public static final int X6 = 4;
    public static final Pattern X7;
    public static final String Y = "Software";
    public static final String Y0 = "ExposureIndex";
    public static final String Y1 = "GPSProcessingMethod";
    public static final short Y2 = 2;
    public static final short Y3 = 64;
    public static final String Y4 = "2";
    public static final int Y6 = 5;
    public static final int Y7 = 19;
    public static final String Z = "Artist";
    public static final String Z0 = "SensingMethod";
    public static final String Z1 = "GPSAreaInformation";
    public static final short Z2 = 3;
    public static final short Z3 = 1;
    public static final String Z4 = "3";
    public static final int Z6 = 6;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final String f103317a0 = "Copyright";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final String f103318a1 = "FileSource";

    /* JADX INFO: renamed from: a2, reason: collision with root package name */
    public static final String f103319a2 = "GPSDateStamp";

    /* JADX INFO: renamed from: a3, reason: collision with root package name */
    public static final short f103320a3 = 4;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final short f103321a4 = 2;

    /* JADX INFO: renamed from: a5, reason: collision with root package name */
    public static final String f103322a5 = "K";

    /* JADX INFO: renamed from: a6, reason: collision with root package name */
    public static final int f103323a6 = 4;

    /* JADX INFO: renamed from: a7, reason: collision with root package name */
    public static final int f103324a7 = 7;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final String f103325b0 = "ExifVersion";

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final String f103326b1 = "SceneType";

    /* JADX INFO: renamed from: b2, reason: collision with root package name */
    public static final String f103327b2 = "GPSDifferential";

    /* JADX INFO: renamed from: b3, reason: collision with root package name */
    public static final short f103328b3 = 5;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    public static final short f103329b4 = 3;

    /* JADX INFO: renamed from: b5, reason: collision with root package name */
    public static final String f103330b5 = "M";

    /* JADX INFO: renamed from: b7, reason: collision with root package name */
    public static final int f103332b7 = 8;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final String f103333c0 = "FlashpixVersion";

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final String f103334c1 = "CFAPattern";

    /* JADX INFO: renamed from: c2, reason: collision with root package name */
    public static final String f103335c2 = "GPSHPositioningError";

    /* JADX INFO: renamed from: c3, reason: collision with root package name */
    public static final short f103336c3 = 6;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    public static final short f103337c4 = 4;

    /* JADX INFO: renamed from: c5, reason: collision with root package name */
    public static final String f103338c5 = "N";

    /* JADX INFO: renamed from: c7, reason: collision with root package name */
    public static final int f103340c7 = 9;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f103341d0 = "ColorSpace";

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final String f103342d1 = "CustomRendered";

    /* JADX INFO: renamed from: d2, reason: collision with root package name */
    public static final String f103343d2 = "InteroperabilityIndex";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final short f103344d3 = 7;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    public static final short f103345d4 = 5;

    /* JADX INFO: renamed from: d5, reason: collision with root package name */
    public static final String f103346d5 = "T";

    /* JADX INFO: renamed from: d6, reason: collision with root package name */
    public static final byte f103347d6 = 47;

    /* JADX INFO: renamed from: d7, reason: collision with root package name */
    public static final f[][] f103348d7;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final String f103349e0 = "Gamma";

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final String f103350e1 = "ExposureMode";

    /* JADX INFO: renamed from: e2, reason: collision with root package name */
    public static final String f103351e2 = "ThumbnailImageLength";

    /* JADX INFO: renamed from: e3, reason: collision with root package name */
    public static final short f103352e3 = 8;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    public static final short f103353e4 = 7;

    /* JADX INFO: renamed from: e5, reason: collision with root package name */
    public static final String f103354e5 = "M";

    /* JADX INFO: renamed from: e7, reason: collision with root package name */
    public static final f[] f103356e7;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final String f103357f0 = "PixelXDimension";

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final String f103358f1 = "WhiteBalance";

    /* JADX INFO: renamed from: f2, reason: collision with root package name */
    public static final String f103359f2 = "ThumbnailImageWidth";

    /* JADX INFO: renamed from: f3, reason: collision with root package name */
    public static final short f103360f3 = 0;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final short f103361f4 = 8;

    /* JADX INFO: renamed from: f5, reason: collision with root package name */
    public static final String f103362f5 = "K";

    /* JADX INFO: renamed from: f7, reason: collision with root package name */
    public static final HashMap<Integer, f>[] f103364f7;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final String f103365g0 = "PixelYDimension";

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f103366g1 = "DigitalZoomRatio";

    /* JADX INFO: renamed from: g2, reason: collision with root package name */
    @y0({y0.a.LIBRARY})
    public static final String f103367g2 = "ThumbnailOrientation";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final short f103368g3 = 1;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final short f103369g4 = 0;

    /* JADX INFO: renamed from: g5, reason: collision with root package name */
    public static final String f103370g5 = "M";

    /* JADX INFO: renamed from: g7, reason: collision with root package name */
    public static final HashMap<String, f>[] f103372g7;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final String f103373h0 = "ComponentsConfiguration";

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final String f103374h1 = "FocalLengthIn35mmFilm";

    /* JADX INFO: renamed from: h2, reason: collision with root package name */
    public static final String f103375h2 = "DNGVersion";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final short f103376h3 = 2;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final short f103377h4 = 1;

    /* JADX INFO: renamed from: h5, reason: collision with root package name */
    public static final String f103378h5 = "N";

    /* JADX INFO: renamed from: h7, reason: collision with root package name */
    public static final HashSet<String> f103380h7;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final String f103381i0 = "CompressedBitsPerPixel";

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final String f103382i1 = "SceneCaptureType";

    /* JADX INFO: renamed from: i2, reason: collision with root package name */
    public static final String f103383i2 = "DefaultCropSize";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final short f103384i3 = 3;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    public static final short f103385i4 = 2;

    /* JADX INFO: renamed from: i5, reason: collision with root package name */
    public static final short f103386i5 = 0;

    /* JADX INFO: renamed from: i7, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f103388i7;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final String f103389j0 = "MakerNote";

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final String f103390j1 = "GainControl";

    /* JADX INFO: renamed from: j2, reason: collision with root package name */
    public static final String f103391j2 = "ThumbnailImage";

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final short f103392j3 = 4;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    public static final short f103393j4 = 3;

    /* JADX INFO: renamed from: j5, reason: collision with root package name */
    public static final short f103394j5 = 1;

    /* JADX INFO: renamed from: j6, reason: collision with root package name */
    public static final int f103395j6 = 10;

    /* JADX INFO: renamed from: j7, reason: collision with root package name */
    public static final Charset f103396j7;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final String f103397k0 = "UserComment";

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final String f103398k1 = "Contrast";

    /* JADX INFO: renamed from: k2, reason: collision with root package name */
    public static final String f103399k2 = "PreviewImageStart";

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final short f103400k3 = 5;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    public static final short f103401k4 = 1;

    /* JADX INFO: renamed from: k5, reason: collision with root package name */
    public static final int f103402k5 = 1;

    /* JADX INFO: renamed from: k6, reason: collision with root package name */
    public static final int f103403k6 = 4;

    /* JADX INFO: renamed from: k7, reason: collision with root package name */
    public static final byte[] f103404k7;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final String f103405l0 = "RelatedSoundFile";

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final String f103406l1 = "Saturation";

    /* JADX INFO: renamed from: l2, reason: collision with root package name */
    public static final String f103407l2 = "PreviewImageLength";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final short f103408l3 = 6;

    /* JADX INFO: renamed from: l4, reason: collision with root package name */
    public static final short f103409l4 = 0;

    /* JADX INFO: renamed from: l5, reason: collision with root package name */
    public static final int f103410l5 = 2;

    /* JADX INFO: renamed from: l6, reason: collision with root package name */
    public static final int f103411l6 = 4;

    /* JADX INFO: renamed from: l7, reason: collision with root package name */
    public static final byte[] f103412l7;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f103413m0 = "DateTimeOriginal";

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final String f103414m1 = "Sharpness";

    /* JADX INFO: renamed from: m2, reason: collision with root package name */
    public static final String f103415m2 = "AspectFrame";

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    public static final short f103416m3 = 7;

    /* JADX INFO: renamed from: m4, reason: collision with root package name */
    public static final short f103417m4 = 1;

    /* JADX INFO: renamed from: m5, reason: collision with root package name */
    public static final int f103418m5 = 6;

    /* JADX INFO: renamed from: m6, reason: collision with root package name */
    public static SimpleDateFormat f103419m6 = null;

    /* JADX INFO: renamed from: m7, reason: collision with root package name */
    public static final byte f103420m7 = -1;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f103421n0 = "DateTimeDigitized";

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final String f103422n1 = "DeviceSettingDescription";

    /* JADX INFO: renamed from: n2, reason: collision with root package name */
    public static final String f103423n2 = "SensorBottomBorder";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final short f103424n3 = 0;

    /* JADX INFO: renamed from: n4, reason: collision with root package name */
    public static final short f103425n4 = 0;

    /* JADX INFO: renamed from: n5, reason: collision with root package name */
    public static final int f103426n5 = 7;

    /* JADX INFO: renamed from: n6, reason: collision with root package name */
    public static SimpleDateFormat f103427n6 = null;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f103429o0 = "OffsetTime";

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final String f103430o1 = "SubjectDistanceRange";

    /* JADX INFO: renamed from: o2, reason: collision with root package name */
    public static final String f103431o2 = "SensorLeftBorder";

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final short f103432o3 = 1;

    /* JADX INFO: renamed from: o4, reason: collision with root package name */
    public static final short f103433o4 = 1;

    /* JADX INFO: renamed from: o5, reason: collision with root package name */
    public static final int f103434o5 = 8;

    /* JADX INFO: renamed from: o6, reason: collision with root package name */
    public static final short f103435o6 = 18761;

    /* JADX INFO: renamed from: o7, reason: collision with root package name */
    public static final byte f103436o7 = -64;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f103437p0 = "OffsetTimeOriginal";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f103438p1 = "ImageUniqueID";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f103439p2 = "SensorRightBorder";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final short f103440p3 = 2;

    /* JADX INFO: renamed from: p4, reason: collision with root package name */
    public static final short f103441p4 = 2;

    /* JADX INFO: renamed from: p5, reason: collision with root package name */
    public static final int f103442p5 = 32773;

    /* JADX INFO: renamed from: p6, reason: collision with root package name */
    public static final short f103443p6 = 19789;

    /* JADX INFO: renamed from: p7, reason: collision with root package name */
    public static final byte f103444p7 = -63;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f103445q0 = "OffsetTimeDigitized";

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    @Deprecated
    public static final String f103446q1 = "CameraOwnerName";

    /* JADX INFO: renamed from: q2, reason: collision with root package name */
    public static final String f103447q2 = "SensorTopBorder";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final short f103448q3 = 3;

    /* JADX INFO: renamed from: q4, reason: collision with root package name */
    @Deprecated
    public static final int f103449q4 = 0;

    /* JADX INFO: renamed from: q5, reason: collision with root package name */
    public static final int f103450q5 = 34892;

    /* JADX INFO: renamed from: q6, reason: collision with root package name */
    public static final byte f103451q6 = 42;

    /* JADX INFO: renamed from: q7, reason: collision with root package name */
    public static final byte f103452q7 = -62;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final String f103453r0 = "SubSecTime";

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final String f103454r1 = "CameraOwnerName";

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    public static final String f103455r2 = "ISO";

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    public static final short f103456r3 = 4;

    /* JADX INFO: renamed from: r4, reason: collision with root package name */
    @Deprecated
    public static final int f103457r4 = 1;

    /* JADX INFO: renamed from: r6, reason: collision with root package name */
    public static final int f103459r6 = 8;

    /* JADX INFO: renamed from: r7, reason: collision with root package name */
    public static final byte f103460r7 = -61;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final String f103461s0 = "SubSecTimeOriginal";

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    public static final String f103462s1 = "BodySerialNumber";

    /* JADX INFO: renamed from: s2, reason: collision with root package name */
    public static final String f103463s2 = "JpgFromRaw";

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final short f103464s3 = 5;

    /* JADX INFO: renamed from: s4, reason: collision with root package name */
    public static final short f103465s4 = 0;

    /* JADX INFO: renamed from: s6, reason: collision with root package name */
    public static final int f103467s6 = 1;

    /* JADX INFO: renamed from: s7, reason: collision with root package name */
    public static final byte f103468s7 = -59;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f103469t0 = "SubSecTimeDigitized";

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    public static final String f103470t1 = "LensSpecification";

    /* JADX INFO: renamed from: t2, reason: collision with root package name */
    public static final String f103471t2 = "Xmp";

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final short f103472t3 = 6;

    /* JADX INFO: renamed from: t4, reason: collision with root package name */
    public static final short f103473t4 = 1;

    /* JADX INFO: renamed from: t6, reason: collision with root package name */
    public static final int f103475t6 = 2;

    /* JADX INFO: renamed from: t7, reason: collision with root package name */
    public static final byte f103476t7 = -58;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final String f103477u0 = "ExposureTime";

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    public static final String f103478u1 = "LensMake";

    /* JADX INFO: renamed from: u2, reason: collision with root package name */
    public static final String f103479u2 = "NewSubfileType";

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final short f103480u3 = 255;

    /* JADX INFO: renamed from: u4, reason: collision with root package name */
    public static final short f103481u4 = 0;

    /* JADX INFO: renamed from: u5, reason: collision with root package name */
    public static final int f103482u5 = 0;

    /* JADX INFO: renamed from: u6, reason: collision with root package name */
    public static final int f103483u6 = 3;

    /* JADX INFO: renamed from: u7, reason: collision with root package name */
    public static final byte f103484u7 = -57;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final String f103486v0 = "FNumber";

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    public static final String f103487v1 = "LensModel";

    /* JADX INFO: renamed from: v2, reason: collision with root package name */
    public static final String f103488v2 = "SubfileType";

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final short f103489v3 = 0;

    /* JADX INFO: renamed from: v4, reason: collision with root package name */
    public static final short f103490v4 = 1;

    /* JADX INFO: renamed from: v5, reason: collision with root package name */
    public static final int f103491v5 = 1;

    /* JADX INFO: renamed from: v6, reason: collision with root package name */
    public static final int f103492v6 = 4;

    /* JADX INFO: renamed from: v7, reason: collision with root package name */
    public static final byte f103493v7 = -55;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final String f103495w0 = "ExposureProgram";

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    public static final String f103496w1 = "LensSerialNumber";

    /* JADX INFO: renamed from: w2, reason: collision with root package name */
    public static final String f103497w2 = "ExifIFDPointer";

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final short f103498w3 = 1;

    /* JADX INFO: renamed from: w4, reason: collision with root package name */
    public static final short f103499w4 = 2;

    /* JADX INFO: renamed from: w5, reason: collision with root package name */
    public static final int f103500w5 = 2;

    /* JADX INFO: renamed from: w6, reason: collision with root package name */
    public static final int f103501w6 = 5;

    /* JADX INFO: renamed from: w7, reason: collision with root package name */
    public static final byte f103502w7 = -54;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f103503x = "ImageWidth";

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final String f103504x0 = "SpectralSensitivity";

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    public static final String f103505x1 = "GPSVersionID";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f103506x2 = "GPSInfoIFDPointer";

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final short f103507x3 = 2;

    /* JADX INFO: renamed from: x4, reason: collision with root package name */
    public static final short f103508x4 = 3;

    /* JADX INFO: renamed from: x5, reason: collision with root package name */
    public static final int f103509x5 = 6;

    /* JADX INFO: renamed from: x6, reason: collision with root package name */
    public static final int f103510x6 = 6;

    /* JADX INFO: renamed from: x7, reason: collision with root package name */
    public static final byte f103511x7 = -53;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f103512y = "ImageLength";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Deprecated
    public static final String f103513y0 = "ISOSpeedRatings";

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    public static final String f103514y1 = "GPSLatitudeRef";

    /* JADX INFO: renamed from: y2, reason: collision with root package name */
    public static final String f103515y2 = "InteroperabilityIFDPointer";

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final short f103516y3 = 3;

    /* JADX INFO: renamed from: y4, reason: collision with root package name */
    public static final short f103517y4 = 0;

    /* JADX INFO: renamed from: y5, reason: collision with root package name */
    public static final int f103518y5 = 0;

    /* JADX INFO: renamed from: y6, reason: collision with root package name */
    public static final int f103519y6 = 7;

    /* JADX INFO: renamed from: y7, reason: collision with root package name */
    public static final byte f103520y7 = -51;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f103521z = "BitsPerSample";

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final String f103522z0 = "PhotographicSensitivity";

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    public static final String f103523z1 = "GPSLatitude";

    /* JADX INFO: renamed from: z2, reason: collision with root package name */
    public static final String f103524z2 = "SubIFDPointer";

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    public static final short f103525z3 = 4;

    /* JADX INFO: renamed from: z4, reason: collision with root package name */
    public static final short f103526z4 = 1;

    /* JADX INFO: renamed from: z5, reason: collision with root package name */
    public static final int f103527z5 = 1;

    /* JADX INFO: renamed from: z6, reason: collision with root package name */
    public static final int f103528z6 = 8;

    /* JADX INFO: renamed from: z7, reason: collision with root package name */
    public static final byte f103529z7 = -50;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f103530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FileDescriptor f103531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AssetManager.AssetInputStream f103532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f103533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f103534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<String, d>[] f103535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set<Integer> f103536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ByteOrder f103537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f103538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f103539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f103540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f103541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f103542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f103543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f103544o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f103545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f103546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f103547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f103548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f103549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f103550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f103485v = "ExifInterface";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final boolean f103494w = Log.isLoggable(f103485v, 3);
    public static final List<Integer> M2 = Arrays.asList(1, 6, 3, 8);
    public static final List<Integer> N2 = Arrays.asList(2, 7, 4, 5);

    /* JADX INFO: renamed from: r5, reason: collision with root package name */
    public static final int[] f103458r5 = {8, 8, 8};

    /* JADX INFO: renamed from: s5, reason: collision with root package name */
    public static final int[] f103466s5 = {4};

    /* JADX INFO: renamed from: t5, reason: collision with root package name */
    public static final int[] f103474t5 = {8};

    /* JADX INFO: renamed from: n7, reason: collision with root package name */
    public static final byte f103428n7 = -40;
    public static final byte[] D5 = {-1, f103428n7, -1};
    public static final byte[] G5 = {102, 116, 121, 112};
    public static final byte[] H5 = {109, 105, 102, 49};
    public static final byte[] I5 = {104, 101, 105, 99};
    public static final byte[] L5 = {79, 76, 89, 77, 80, 0};
    public static final byte[] M5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] S5 = {-119, 80, 78, 71, 13, 10, zi.c.D, 10};
    public static final byte[] T5 = {101, 88, 73, 102};
    public static final byte[] U5 = {73, 72, 68, 82};
    public static final byte[] V5 = {73, 69, 78, 68};
    public static final byte[] Y5 = {82, 73, 70, 70};
    public static final byte[] Z5 = {87, 69, 66, 80};

    /* JADX INFO: renamed from: b6, reason: collision with root package name */
    public static final byte[] f103331b6 = {69, 88, 73, 70};

    /* JADX INFO: renamed from: c6, reason: collision with root package name */
    public static final byte[] f103339c6 = {-99, 1, 42};

    /* JADX INFO: renamed from: e6, reason: collision with root package name */
    public static final byte[] f103355e6 = "VP8X".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: f6, reason: collision with root package name */
    public static final byte[] f103363f6 = "VP8L".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: g6, reason: collision with root package name */
    public static final byte[] f103371g6 = "VP8 ".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: h6, reason: collision with root package name */
    public static final byte[] f103379h6 = "ANIM".getBytes(Charset.defaultCharset());

    /* JADX INFO: renamed from: i6, reason: collision with root package name */
    public static final byte[] f103387i6 = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] G6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] H6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] I6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final ByteOrder f103554f = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final ByteOrder f103555g = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DataInputStream f103556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteOrder f103557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f103558d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public byte[] f103559e;

        public b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f103556b.available();
        }

        public int d() {
            return this.f103558d;
        }

        public long h() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        public void i(ByteOrder byteOrder) {
            this.f103557c = byteOrder;
        }

        public void k(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int iSkip = (int) this.f103556b.skip(i12);
                if (iSkip <= 0) {
                    if (this.f103559e == null) {
                        this.f103559e = new byte[8192];
                    }
                    iSkip = this.f103556b.read(this.f103559e, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += iSkip;
            }
            this.f103558d += i11;
        }

        @Override // java.io.InputStream
        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f103558d++;
            return this.f103556b.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f103558d++;
            return this.f103556b.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f103558d++;
            int i10 = this.f103556b.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f103558d += 2;
            return this.f103556b.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f103558d += i11;
            this.f103556b.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f103558d += 4;
            int i10 = this.f103556b.read();
            int i11 = this.f103556b.read();
            int i12 = this.f103556b.read();
            int i13 = this.f103556b.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f103557c;
            if (byteOrder == f103554f) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == f103555g) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f103557c);
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            Log.d(a.f103485v, "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f103558d += 8;
            int i10 = this.f103556b.read();
            int i11 = this.f103556b.read();
            int i12 = this.f103556b.read();
            int i13 = this.f103556b.read();
            int i14 = this.f103556b.read();
            int i15 = this.f103556b.read();
            int i16 = this.f103556b.read();
            int i17 = this.f103556b.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f103557c;
            if (byteOrder == f103554f) {
                return (((long) i17) << 56) + (((long) i16) << 48) + (((long) i15) << 40) + (((long) i14) << 32) + (((long) i13) << 24) + (((long) i12) << 16) + (((long) i11) << 8) + ((long) i10);
            }
            if (byteOrder == f103555g) {
                return (((long) i10) << 56) + (((long) i11) << 48) + (((long) i12) << 40) + (((long) i13) << 32) + (((long) i14) << 24) + (((long) i15) << 16) + (((long) i16) << 8) + ((long) i17);
            }
            throw new IOException("Invalid byte order: " + this.f103557c);
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f103558d += 2;
            int i10 = this.f103556b.read();
            int i11 = this.f103556b.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f103557c;
            if (byteOrder == f103554f) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == f103555g) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f103557c);
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f103558d += 2;
            return this.f103556b.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f103558d++;
            return this.f103556b.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f103558d += 2;
            int i10 = this.f103556b.read();
            int i11 = this.f103556b.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f103557c;
            if (byteOrder == f103554f) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == f103555g) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f103557c);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f103557c = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f103556b = dataInputStream;
            dataInputStream.mark(0);
            this.f103558d = 0;
            this.f103557c = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f103556b.read(bArr, i10, i11);
            this.f103558d += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f103558d += bArr.length;
            this.f103556b.readFully(bArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends FilterOutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final OutputStream f103560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ByteOrder f103561c;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f103560b = outputStream;
            this.f103561c = byteOrder;
        }

        public void a(ByteOrder byteOrder) {
            this.f103561c = byteOrder;
        }

        public void b(int i10) throws IOException {
            this.f103560b.write(i10);
        }

        public void c(int i10) throws IOException {
            ByteOrder byteOrder = this.f103561c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f103560b.write(i10 & 255);
                this.f103560b.write((i10 >>> 8) & 255);
                this.f103560b.write((i10 >>> 16) & 255);
                this.f103560b.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f103560b.write((i10 >>> 24) & 255);
                this.f103560b.write((i10 >>> 16) & 255);
                this.f103560b.write((i10 >>> 8) & 255);
                this.f103560b.write(i10 & 255);
            }
        }

        public void d(short s10) throws IOException {
            ByteOrder byteOrder = this.f103561c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f103560b.write(s10 & 255);
                this.f103560b.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f103560b.write((s10 >>> 8) & 255);
                this.f103560b.write(s10 & 255);
            }
        }

        public void h(long j10) throws IOException {
            c((int) j10);
        }

        public void i(int i10) throws IOException {
            d((short) i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f103560b.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f103560b.write(bArr, i10, i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f103562e = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f103564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f103565c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f103566d;

        public d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1L, bArr);
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f103396j7);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double d10, ByteOrder byteOrder) {
            return c(new double[]{d10}, byteOrder);
        }

        public static d c(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d10 : dArr) {
                byteBufferWrap.putDouble(d10);
            }
            return new d(12, dArr.length, byteBufferWrap.array());
        }

        public static d d(int i10, ByteOrder byteOrder) {
            return e(new int[]{i10}, byteOrder);
        }

        public static d e(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putInt(i10);
            }
            return new d(9, iArr.length, byteBufferWrap.array());
        }

        public static d f(h hVar, ByteOrder byteOrder) {
            return g(new h[]{hVar}, byteOrder);
        }

        public static d g(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[10] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f103571a);
                byteBufferWrap.putInt((int) hVar.f103572b);
            }
            return new d(10, hVarArr.length, byteBufferWrap.array());
        }

        public static d h(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f103396j7);
            return new d(2, bytes.length, bytes);
        }

        public static d i(long j10, ByteOrder byteOrder) {
            return j(new long[]{j10}, byteOrder);
        }

        public static d j(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d k(h hVar, ByteOrder byteOrder) {
            return l(new h[]{hVar}, byteOrder);
        }

        public static d l(h[] hVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[5] * hVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (h hVar : hVarArr) {
                byteBufferWrap.putInt((int) hVar.f103571a);
                byteBufferWrap.putInt((int) hVar.f103572b);
            }
            return new d(5, hVarArr.length, byteBufferWrap.array());
        }

        public static d m(int i10, ByteOrder byteOrder) {
            return n(new int[]{i10}, byteOrder);
        }

        public static d n(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.H6[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public double o(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objR instanceof String) {
                return Double.parseDouble((String) objR);
            }
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objR instanceof int[]) {
                int[] iArr = (int[]) objR;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objR instanceof double[]) {
                double[] dArr = (double[]) objR;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objR instanceof h[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            h[] hVarArr = (h[]) objR;
            if (hVarArr.length == 1) {
                return hVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int p(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objR instanceof String) {
                return Integer.parseInt((String) objR);
            }
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objR instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objR;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String q(ByteOrder byteOrder) throws Throwable {
            Object objR = r(byteOrder);
            if (objR == null) {
                return null;
            }
            if (objR instanceof String) {
                return (String) objR;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (objR instanceof long[]) {
                long[] jArr = (long[]) objR;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objR instanceof int[]) {
                int[] iArr = (int[]) objR;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (objR instanceof double[]) {
                double[] dArr = (double[]) objR;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
            if (!(objR instanceof h[])) {
                return null;
            }
            h[] hVarArr = (h[]) objR;
            while (i10 < hVarArr.length) {
                sb2.append(hVarArr[i10].f103571a);
                sb2.append('/');
                sb2.append(hVarArr[i10].f103572b);
                i10++;
                if (i10 != hVarArr.length) {
                    sb2.append(",");
                }
            }
            return sb2.toString();
        }

        /* JADX WARN: Code duplicated, block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:18:0x0030 */
        public Object r(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            byte b10;
            byte b11;
            Object str;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(this.f103566d);
                    try {
                        bVar.i(byteOrder);
                        int length = 0;
                        switch (this.f103563a) {
                            case 1:
                            case 6:
                                byte[] bArr = this.f103566d;
                                if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                    str = new String(new char[]{(char) (b10 + 48)});
                                    break;
                                } else {
                                    String str2 = new String(bArr, a.f103396j7);
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e10) {
                                        Log.e(a.f103485v, "IOException occurred while closing InputStream", e10);
                                        return str2;
                                    }
                                }
                                break;
                            case 2:
                            case 7:
                                if (this.f103564b >= a.I6.length) {
                                    int i10 = 0;
                                    while (true) {
                                        byte[] bArr2 = a.I6;
                                        if (i10 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (this.f103566d[i10] == bArr2[i10]) {
                                            i10++;
                                        }
                                    }
                                }
                                StringBuilder sb2 = new StringBuilder();
                                while (length < this.f103564b && (b11 = this.f103566d[length]) != 0) {
                                    if (b11 >= 32) {
                                        sb2.append((char) b11);
                                    } else {
                                        sb2.append('?');
                                    }
                                    length++;
                                }
                                str = sb2.toString();
                                break;
                            case 3:
                                int[] iArr = new int[this.f103564b];
                                while (true) {
                                    str = iArr;
                                    if (length < this.f103564b) {
                                        iArr[length] = bVar.readUnsignedShort();
                                        length++;
                                    }
                                }
                                break;
                            case 4:
                                long[] jArr = new long[this.f103564b];
                                while (true) {
                                    str = jArr;
                                    if (length < this.f103564b) {
                                        jArr[length] = bVar.h();
                                        length++;
                                    }
                                }
                                break;
                            case 5:
                                h[] hVarArr = new h[this.f103564b];
                                while (true) {
                                    str = hVarArr;
                                    if (length < this.f103564b) {
                                        hVarArr[length] = new h(bVar.h(), bVar.h());
                                        length++;
                                    }
                                }
                                break;
                            case 8:
                                int[] iArr2 = new int[this.f103564b];
                                while (true) {
                                    str = iArr2;
                                    if (length < this.f103564b) {
                                        iArr2[length] = bVar.readShort();
                                        length++;
                                    }
                                }
                                break;
                            case 9:
                                int[] iArr3 = new int[this.f103564b];
                                while (true) {
                                    str = iArr3;
                                    if (length < this.f103564b) {
                                        iArr3[length] = bVar.readInt();
                                        length++;
                                    }
                                }
                                break;
                            case 10:
                                h[] hVarArr2 = new h[this.f103564b];
                                while (true) {
                                    str = hVarArr2;
                                    if (length < this.f103564b) {
                                        hVarArr2[length] = new h(bVar.readInt(), bVar.readInt());
                                        length++;
                                    }
                                }
                                break;
                            case 11:
                                double[] dArr = new double[this.f103564b];
                                while (true) {
                                    str = dArr;
                                    if (length < this.f103564b) {
                                        dArr[length] = bVar.readFloat();
                                        length++;
                                    }
                                }
                                break;
                            case 12:
                                double[] dArr2 = new double[this.f103564b];
                                while (true) {
                                    str = dArr2;
                                    if (length < this.f103564b) {
                                        dArr2[length] = bVar.readDouble();
                                        length++;
                                    }
                                }
                                break;
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e11) {
                                    Log.e(a.f103485v, "IOException occurred while closing InputStream", e11);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e12) {
                            Log.e(a.f103485v, "IOException occurred while closing InputStream", e12);
                            return str;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w(a.f103485v, "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e14) {
                                Log.e(a.f103485v, "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e(a.f103485v, "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                bVar = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                throw th;
            }
        }

        public int s() {
            return a.H6[this.f103563a] * this.f103564b;
        }

        public String toString() {
            return j.f86770c + a.G6[this.f103563a] + ", data length:" + this.f103566d.length + j.f86771d;
        }

        public d(int i10, int i11, long j10, byte[] bArr) {
            this.f103563a = i10;
            this.f103564b = i11;
            this.f103565c = j10;
            this.f103566d = bArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Retention(RetentionPolicy.SOURCE)
    @y0({y0.a.LIBRARY})
    public @interface g {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f103571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f103572b;

        public h(double d10) {
            this((long) (d10 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f103571a / this.f103572b;
        }

        public String toString() {
            return this.f103571a + to.c.userBaseDel + this.f103572b;
        }

        public h(long j10, long j11) {
            if (j11 == 0) {
                this.f103571a = 0L;
                this.f103572b = 1L;
            } else {
                this.f103571a = j10;
                this.f103572b = j11;
            }
        }
    }

    static {
        f[] fVarArr = {new f(f103479u2, qb.d.f122120l, 4), new f(f103488v2, 255, 4), new f(f103503x, 256, 3, 4), new f(f103512y, 257, 3, 4), new f(f103521z, i1.d.HandlerC1208d.f123894i, 3), new f(A, i1.d.HandlerC1208d.f123895j, 3), new f(B, i1.d.HandlerC1208d.f123898m, 3), new f(V, com.google.android.material.bottomappbar.d.f50281j, 2), new f(W, 271, 2), new f("Model", 272, 2), new f(K, AudioAttributesCompat.O, 3, 4), new f(C, q.f78797n, 3), new f(D, 277, 3), new f(L, 278, 3, 4), new f(M, 279, 3, 4), new f(H, 282, 5), new f(I, 283, 5), new f(E, 284, 3), new f(J, 296, 3), new f(P, 301, 3), new f(Y, 305, 2), new f(U, 306, 2), new f(Z, 315, 2), new f(Q, 318, 5), new f(R, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new f(f103524z2, 330, 4), new f(N, 513, 4), new f(O, i1.d.HandlerC1208d.f123902q, 4), new f(S, 529, 5), new f(F, IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new f(G, 531, 3), new f(T, 532, 5), new f(f103317a0, 33432, 2), new f(f103497w2, 34665, 4), new f(f103506x2, 34853, 4), new f(f103447q2, 4, 4), new f(f103431o2, 5, 4), new f(f103423n2, 6, 4), new f(f103439p2, 7, 4), new f(f103455r2, 23, 3), new f(f103463s2, 46, 7), new f(f103471t2, 700, 1)};
        J6 = fVarArr;
        f[] fVarArr2 = {new f(f103477u0, 33434, 5), new f(f103486v0, 33437, 5), new f(f103495w0, 34850, 3), new f(f103504x0, 34852, 2), new f(f103522z0, 34855, 3), new f(A0, 34856, 7), new f(B0, 34864, 3), new f(C0, 34865, 4), new f(D0, 34866, 4), new f(E0, 34867, 4), new f(F0, 34868, 4), new f(G0, 34869, 4), new f(f103325b0, 36864, 2), new f(f103413m0, 36867, 2), new f(f103421n0, 36868, 2), new f(f103429o0, 36880, 2), new f(f103437p0, 36881, 2), new f(f103445q0, 36882, 2), new f(f103373h0, 37121, 7), new f(f103381i0, 37122, 5), new f(H0, 37377, 10), new f(I0, 37378, 5), new f(J0, 37379, 10), new f(K0, 37380, 10), new f(L0, 37381, 5), new f(M0, 37382, 5), new f(N0, 37383, 3), new f(O0, 37384, 3), new f(P0, 37385, 3), new f(R0, 37386, 5), new f(Q0, 37396, 3), new f(f103389j0, 37500, 7), new f(f103397k0, 37510, 7), new f(f103453r0, 37520, 2), new f(f103461s0, 37521, 2), new f(f103469t0, 37522, 2), new f(f103333c0, 40960, 7), new f(f103341d0, 40961, 3), new f(f103357f0, 40962, 3, 4), new f(f103365g0, 40963, 3, 4), new f(f103405l0, 40964, 2), new f(f103515y2, 40965, 4), new f(S0, 41483, 5), new f(T0, 41484, 7), new f(U0, 41486, 5), new f(V0, 41487, 5), new f(W0, 41488, 3), new f(X0, 41492, 3), new f(Y0, 41493, 5), new f(Z0, 41495, 3), new f(f103318a1, 41728, 7), new f(f103326b1, 41729, 7), new f(f103334c1, 41730, 7), new f(f103342d1, 41985, 3), new f(f103350e1, 41986, 3), new f(f103358f1, 41987, 3), new f(f103366g1, 41988, 5), new f(f103374h1, 41989, 3), new f(f103382i1, 41990, 3), new f(f103390j1, 41991, 3), new f(f103398k1, 41992, 3), new f(f103406l1, 41993, 3), new f(f103414m1, 41994, 3), new f(f103422n1, 41995, 7), new f(f103430o1, 41996, 3), new f(f103438p1, 42016, 2), new f("CameraOwnerName", 42032, 2), new f(f103462s1, 42033, 2), new f(f103470t1, 42034, 5), new f(f103478u1, 42035, 2), new f(f103487v1, 42036, 2), new f(f103349e0, 42240, 5), new f(f103375h2, 50706, 1), new f(f103383i2, 50720, 3, 4)};
        K6 = fVarArr2;
        f[] fVarArr3 = {new f(f103505x1, 0, 1), new f(f103514y1, 1, 2), new f(f103523z1, 2, 5, 10), new f(A1, 3, 2), new f(B1, 4, 5, 10), new f(C1, 5, 1), new f(D1, 6, 5), new f(E1, 7, 5), new f(F1, 8, 2), new f(G1, 9, 2), new f(H1, 10, 2), new f(I1, 11, 5), new f(J1, 12, 2), new f(K1, 13, 5), new f(L1, 14, 2), new f(M1, 15, 5), new f(N1, 16, 2), new f(O1, 17, 5), new f(P1, 18, 2), new f(Q1, 19, 2), new f(R1, 20, 5), new f(S1, 21, 2), new f(T1, 22, 5), new f(U1, 23, 2), new f(V1, 24, 5), new f(W1, 25, 2), new f(X1, 26, 5), new f(Y1, 27, 7), new f(Z1, 28, 7), new f(f103319a2, 29, 2), new f(f103327b2, 30, 3), new f(f103335c2, 31, 5)};
        L6 = fVarArr3;
        f[] fVarArr4 = {new f(f103343d2, 1, 2)};
        M6 = fVarArr4;
        f[] fVarArr5 = {new f(f103479u2, qb.d.f122120l, 4), new f(f103488v2, 255, 4), new f(f103359f2, 256, 3, 4), new f(f103351e2, 257, 3, 4), new f(f103521z, i1.d.HandlerC1208d.f123894i, 3), new f(A, i1.d.HandlerC1208d.f123895j, 3), new f(B, i1.d.HandlerC1208d.f123898m, 3), new f(V, com.google.android.material.bottomappbar.d.f50281j, 2), new f(W, 271, 2), new f("Model", 272, 2), new f(K, AudioAttributesCompat.O, 3, 4), new f(f103367g2, q.f78797n, 3), new f(D, 277, 3), new f(L, 278, 3, 4), new f(M, 279, 3, 4), new f(H, 282, 5), new f(I, 283, 5), new f(E, 284, 3), new f(J, 296, 3), new f(P, 301, 3), new f(Y, 305, 2), new f(U, 306, 2), new f(Z, 315, 2), new f(Q, 318, 5), new f(R, Sdk.SDKError.Reason.SILENT_MODE_MONITOR_ERROR_VALUE, 5), new f(f103524z2, 330, 4), new f(N, 513, 4), new f(O, i1.d.HandlerC1208d.f123902q, 4), new f(S, 529, 5), new f(F, IronSourceError.ERROR_AD_UNIT_CAPPED, 3), new f(G, 531, 3), new f(T, 532, 5), new f(f103317a0, 33432, 2), new f(f103497w2, 34665, 4), new f(f103506x2, 34853, 4), new f(f103375h2, 50706, 1), new f(f103383i2, 50720, 3, 4)};
        N6 = fVarArr5;
        O6 = new f(K, AudioAttributesCompat.O, 3);
        f[] fVarArr6 = {new f(f103391j2, 256, 7), new f(A2, 8224, 4), new f(B2, 8256, 4)};
        P6 = fVarArr6;
        f[] fVarArr7 = {new f(f103399k2, 257, 4), new f(f103407l2, i1.d.HandlerC1208d.f123894i, 4)};
        Q6 = fVarArr7;
        f[] fVarArr8 = {new f(f103415m2, 4371, 3)};
        R6 = fVarArr8;
        f[] fVarArr9 = {new f(f103341d0, 55, 3)};
        S6 = fVarArr9;
        f[][] fVarArr10 = {fVarArr, fVarArr2, fVarArr3, fVarArr4, fVarArr5, fVarArr, fVarArr6, fVarArr7, fVarArr8, fVarArr9};
        f103348d7 = fVarArr10;
        f103356e7 = new f[]{new f(f103524z2, 330, 4), new f(f103497w2, 34665, 4), new f(f103506x2, 34853, 4), new f(f103515y2, 40965, 4), new f(A2, 8224, 1), new f(B2, 8256, 1)};
        f103364f7 = new HashMap[fVarArr10.length];
        f103372g7 = new HashMap[fVarArr10.length];
        f103380h7 = new HashSet<>(Arrays.asList(f103486v0, f103366g1, f103477u0, M0, E1));
        f103388i7 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f103396j7 = charsetForName;
        f103404k7 = q.f78791h.getBytes(charsetForName);
        f103412l7 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f103419m6 = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f103427n6 = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            f[][] fVarArr11 = f103348d7;
            if (i10 >= fVarArr11.length) {
                HashMap<Integer, Integer> map = f103388i7;
                f[] fVarArr12 = f103356e7;
                map.put(Integer.valueOf(fVarArr12[0].f103567a), 5);
                map.put(Integer.valueOf(fVarArr12[1].f103567a), 1);
                map.put(Integer.valueOf(fVarArr12[2].f103567a), 2);
                map.put(Integer.valueOf(fVarArr12[3].f103567a), 3);
                map.put(Integer.valueOf(fVarArr12[4].f103567a), 7);
                map.put(Integer.valueOf(fVarArr12[5].f103567a), 8);
                U7 = Pattern.compile(".*[1-9].*");
                V7 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                W7 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                X7 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f103364f7[i10] = new HashMap<>();
            f103372g7[i10] = new HashMap<>();
            for (f fVar : fVarArr11[i10]) {
                f103364f7[i10].put(Integer.valueOf(fVar.f103567a), fVar);
                f103372g7[i10].put(fVar.f103568b, fVar);
            }
            i10++;
        }
    }

    public a(@NonNull File file) throws Throwable {
        f[][] fVarArr = f103348d7;
        this.f103535f = new HashMap[fVarArr.length];
        this.f103536g = new HashSet(fVarArr.length);
        this.f103537h = ByteOrder.BIG_ENDIAN;
        if (file == null) {
            throw new NullPointerException("file cannot be null");
        }
        O(file.getAbsolutePath());
    }

    public static boolean A0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    public static Pair<Integer, Integer> J(String str) {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairJ = J(strArrSplit[0]);
            if (((Integer) pairJ.first).intValue() == 2) {
                return pairJ;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairJ2 = J(strArrSplit[i10]);
                int iIntValue = (((Integer) pairJ2.first).equals(pairJ.first) || ((Integer) pairJ2.second).equals(pairJ.first)) ? ((Integer) pairJ.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairJ.second).intValue() == -1 || !(((Integer) pairJ2.first).equals(pairJ.second) || ((Integer) pairJ2.second).equals(pairJ.second))) ? -1 : ((Integer) pairJ.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairJ = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairJ = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairJ;
        }
        if (!str.contains(to.c.userBaseDel)) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    if (j10 < 0 || j10 > 65535) {
                        return j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
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
        String[] strArrSplit2 = str.split(to.c.userBaseDel, -1);
        if (strArrSplit2.length == 2) {
            try {
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
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

    public static boolean P(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = f103404k7;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f103404k7;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean S(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = D5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public static boolean X(FileDescriptor fileDescriptor) {
        try {
            l3.b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f103494w) {
                return false;
            }
            Log.d(f103485v, "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static boolean Z(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean a0(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("mimeType shouldn't be null");
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        byte b10 = -1;
        switch (lowerCase.hashCode()) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    b10 = 0;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    b10 = 1;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    b10 = 2;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    b10 = 3;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    b10 = 4;
                }
                break;
            case -1487394660:
                if (lowerCase.equals("image/jpeg")) {
                    b10 = 5;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    b10 = 6;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    b10 = 7;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    b10 = 8;
                }
                break;
            case -879258763:
                if (lowerCase.equals("image/png")) {
                    b10 = 9;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    b10 = 10;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    b10 = zi.c.f161635m;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    b10 = 13;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    b10 = zi.c.f161638p;
                }
                break;
        }
        switch (b10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    public static double c(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split(to.c.userBaseDel, -1);
            double d10 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split(to.c.userBaseDel, -1);
            double d11 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split(to.c.userBaseDel, -1);
            double d12 = d10 + (d11 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(R4) && !str2.equals(T4)) {
                if (!str2.equals("N") && !str2.equals(S4)) {
                    throw new IllegalArgumentException();
                }
                return d12;
            }
            return -d12;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    public static Long f0(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && U7.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = f103419m6.parse(str, parsePosition);
                if (date == null && (date = f103427n6.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i10 = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i11 = Integer.parseInt(str3.substring(1, 3));
                    int i12 = Integer.parseInt(str3.substring(4, 6));
                    if ((com.google.android.material.badge.a.f50153v.equals(strSubstring) || TokenBuilder.TOKEN_DELIMITER.equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i11 <= 14) {
                        int i13 = ((i11 * 60) + i12) * 60000;
                        if (!TokenBuilder.TOKEN_DELIMITER.equals(strSubstring)) {
                            i10 = -1;
                        }
                        time += (long) (i13 * i10);
                    }
                }
                if (str2 != null) {
                    time += l3.b.g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final void A(i iVar) throws Throwable {
        d dVar;
        g0(iVar);
        k0(iVar, 0);
        C0(iVar, 0);
        C0(iVar, 5);
        C0(iVar, 4);
        D0();
        if (this.f103533d != 8 || (dVar = this.f103535f[1].get(f103389j0)) == null) {
            return;
        }
        i iVar2 = new i(dVar.f103566d);
        iVar2.i(this.f103537h);
        iVar2.k(6);
        k0(iVar2, 9);
        d dVar2 = this.f103535f[9].get(f103341d0);
        if (dVar2 != null) {
            this.f103535f[1].put(f103341d0, dVar2);
        }
    }

    public int B() {
        switch (l(C, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return com.google.android.material.bottomappbar.d.f50281j;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public final void B0(int i10, int i11) throws Throwable {
        if (this.f103535f[i10].isEmpty() || this.f103535f[i11].isEmpty()) {
            if (f103494w) {
                Log.d(f103485v, "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = this.f103535f[i10].get(f103512y);
        d dVar2 = this.f103535f[i10].get(f103503x);
        d dVar3 = this.f103535f[i11].get(f103512y);
        d dVar4 = this.f103535f[i11].get(f103503x);
        if (dVar == null || dVar2 == null) {
            if (f103494w) {
                Log.d(f103485v, "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (f103494w) {
                Log.d(f103485v, "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iP = dVar.p(this.f103537h);
        int iP2 = dVar2.p(this.f103537h);
        int iP3 = dVar3.p(this.f103537h);
        int iP4 = dVar4.p(this.f103537h);
        if (iP >= iP3 || iP2 >= iP4) {
            return;
        }
        HashMap<String, d>[] mapArr = this.f103535f;
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void C(i iVar) throws Throwable {
        if (f103494w) {
            Log.d(f103485v, "getRw2Attributes starting with: " + iVar);
        }
        A(iVar);
        d dVar = this.f103535f[0].get(f103463s2);
        if (dVar != null) {
            t(new b(dVar.f103566d), (int) dVar.f103565c, 5);
        }
        d dVar2 = this.f103535f[0].get(f103455r2);
        d dVar3 = this.f103535f[1].get(f103522z0);
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f103535f[1].put(f103522z0, dVar2);
    }

    public final void C0(i iVar, int i10) throws Throwable {
        d dVarM;
        d dVarM2;
        d dVar = this.f103535f[i10].get(f103383i2);
        d dVar2 = this.f103535f[i10].get(f103447q2);
        d dVar3 = this.f103535f[i10].get(f103431o2);
        d dVar4 = this.f103535f[i10].get(f103423n2);
        d dVar5 = this.f103535f[i10].get(f103439p2);
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                o0(iVar, i10);
                return;
            }
            int iP = dVar2.p(this.f103537h);
            int iP2 = dVar4.p(this.f103537h);
            int iP3 = dVar5.p(this.f103537h);
            int iP4 = dVar3.p(this.f103537h);
            if (iP2 <= iP || iP3 <= iP4) {
                return;
            }
            d dVarM3 = d.m(iP2 - iP, this.f103537h);
            d dVarM4 = d.m(iP3 - iP4, this.f103537h);
            this.f103535f[i10].put(f103512y, dVarM3);
            this.f103535f[i10].put(f103503x, dVarM4);
            return;
        }
        if (dVar.f103563a == 5) {
            h[] hVarArr = (h[]) dVar.r(this.f103537h);
            if (hVarArr == null || hVarArr.length != 2) {
                Log.w(f103485v, "Invalid crop size values. cropSize=" + Arrays.toString(hVarArr));
                return;
            }
            dVarM = d.k(hVarArr[0], this.f103537h);
            dVarM2 = d.k(hVarArr[1], this.f103537h);
        } else {
            int[] iArr = (int[]) dVar.r(this.f103537h);
            if (iArr == null || iArr.length != 2) {
                Log.w(f103485v, "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                return;
            }
            dVarM = d.m(iArr[0], this.f103537h);
            dVarM2 = d.m(iArr[1], this.f103537h);
        }
        this.f103535f[i10].put(f103503x, dVarM);
        this.f103535f[i10].put(f103512y, dVarM2);
    }

    public final void D(i iVar) throws IOException {
        byte[] bArr = f103404k7;
        iVar.k(bArr.length);
        byte[] bArr2 = new byte[iVar.available()];
        iVar.readFully(bArr2);
        this.f103545p = bArr.length;
        j0(bArr2, 0);
    }

    public final void D0() throws Throwable {
        B0(0, 5);
        B0(0, 4);
        B0(5, 4);
        d dVar = this.f103535f[1].get(f103357f0);
        d dVar2 = this.f103535f[1].get(f103365g0);
        if (dVar != null && dVar2 != null) {
            this.f103535f[0].put(f103503x, dVar);
            this.f103535f[0].put(f103512y, dVar2);
        }
        if (this.f103535f[4].isEmpty() && b0(this.f103535f[5])) {
            HashMap<String, d>[] mapArr = this.f103535f;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!b0(this.f103535f[4])) {
            Log.d(f103485v, "No image meets the size requirements of a thumbnail image.");
        }
        m0(0, f103367g2, C);
        m0(0, f103351e2, f103512y);
        m0(0, f103359f2, f103503x);
        m0(5, f103367g2, C);
        m0(5, f103351e2, f103512y);
        m0(5, f103359f2, f103503x);
        m0(4, C, f103367g2);
        m0(4, f103512y, f103351e2);
        m0(4, f103503x, f103359f2);
    }

    @Nullable
    public byte[] E() {
        int i10 = this.f103544o;
        if (i10 == 6 || i10 == 7) {
            return G();
        }
        return null;
    }

    public final int E0(c cVar) throws IOException {
        f[][] fVarArr = f103348d7;
        int[] iArr = new int[fVarArr.length];
        int[] iArr2 = new int[fVarArr.length];
        for (f fVar : f103356e7) {
            l0(fVar.f103568b);
        }
        if (this.f103538i) {
            if (this.f103539j) {
                l0(K);
                l0(M);
            } else {
                l0(N);
                l0(O);
            }
        }
        for (int i10 = 0; i10 < f103348d7.length; i10++) {
            for (Object obj : this.f103535f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f103535f[i10].remove(entry.getKey());
                }
            }
        }
        int i11 = 1;
        if (!this.f103535f[1].isEmpty()) {
            this.f103535f[0].put(f103356e7[1].f103568b, d.i(0L, this.f103537h));
        }
        if (!this.f103535f[2].isEmpty()) {
            this.f103535f[0].put(f103356e7[2].f103568b, d.i(0L, this.f103537h));
        }
        if (!this.f103535f[3].isEmpty()) {
            this.f103535f[1].put(f103356e7[3].f103568b, d.i(0L, this.f103537h));
        }
        if (this.f103538i) {
            if (this.f103539j) {
                this.f103535f[4].put(K, d.m(0, this.f103537h));
                this.f103535f[4].put(M, d.m(this.f103542m, this.f103537h));
            } else {
                this.f103535f[4].put(N, d.i(0L, this.f103537h));
                this.f103535f[4].put(O, d.i(this.f103542m, this.f103537h));
            }
        }
        for (int i12 = 0; i12 < f103348d7.length; i12++) {
            Iterator<Map.Entry<String, d>> it = this.f103535f[i12].entrySet().iterator();
            int i13 = 0;
            while (it.hasNext()) {
                int iS = it.next().getValue().s();
                if (iS > 4) {
                    i13 += iS;
                }
            }
            iArr2[i12] = iArr2[i12] + i13;
        }
        int size = 8;
        for (int i14 = 0; i14 < f103348d7.length; i14++) {
            if (!this.f103535f[i14].isEmpty()) {
                iArr[i14] = size;
                size += (this.f103535f[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.f103538i) {
            if (this.f103539j) {
                this.f103535f[4].put(K, d.m(size, this.f103537h));
            } else {
                this.f103535f[4].put(N, d.i(size, this.f103537h));
            }
            this.f103541l = size;
            size += this.f103542m;
        }
        if (this.f103533d == 4) {
            size += 8;
        }
        if (f103494w) {
            int i15 = 0;
            while (i15 < f103348d7.length) {
                Integer numValueOf = Integer.valueOf(i15);
                Integer numValueOf2 = Integer.valueOf(iArr[i15]);
                Integer numValueOf3 = Integer.valueOf(this.f103535f[i15].size());
                Integer numValueOf4 = Integer.valueOf(iArr2[i15]);
                Integer numValueOf5 = Integer.valueOf(size);
                int i16 = i11;
                Object[] objArr = new Object[5];
                objArr[0] = numValueOf;
                objArr[i16] = numValueOf2;
                objArr[2] = numValueOf3;
                objArr[3] = numValueOf4;
                objArr[4] = numValueOf5;
                Log.d(f103485v, String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", objArr));
                i15++;
                i11 = i16;
            }
        }
        int i17 = i11;
        if (!this.f103535f[i17].isEmpty()) {
            this.f103535f[0].put(f103356e7[i17].f103568b, d.i(iArr[i17], this.f103537h));
        }
        if (!this.f103535f[r13].isEmpty()) {
            this.f103535f[0].put(f103356e7[r13].f103568b, d.i(iArr[r13], this.f103537h));
        }
        if (!this.f103535f[r14].isEmpty()) {
            this.f103535f[i17].put(f103356e7[r14].f103568b, d.i(iArr[r14], this.f103537h));
        }
        int i18 = this.f103533d;
        if (i18 == 4) {
            cVar.i(size);
            cVar.write(f103404k7);
        } else if (i18 == 13) {
            cVar.c(size);
            cVar.write(T5);
        } else if (i18 == 14) {
            cVar.write(f103331b6);
            cVar.c(size);
        }
        cVar.d(this.f103537h == ByteOrder.BIG_ENDIAN ? f103443p6 : f103435o6);
        cVar.a(this.f103537h);
        cVar.i(42);
        cVar.h(8L);
        for (int i19 = 0; i19 < f103348d7.length; i19++) {
            if (!this.f103535f[i19].isEmpty()) {
                cVar.i(this.f103535f[i19].size());
                int size2 = iArr[i19] + 2 + (this.f103535f[i19].size() * 12) + 4;
                for (Map.Entry<String, d> entry2 : this.f103535f[i19].entrySet()) {
                    int i20 = f103372g7[i19].get(entry2.getKey()).f103567a;
                    d value = entry2.getValue();
                    int iS2 = value.s();
                    cVar.i(i20);
                    cVar.i(value.f103563a);
                    cVar.c(value.f103564b);
                    if (iS2 > 4) {
                        cVar.h(size2);
                        size2 += iS2;
                    } else {
                        cVar.write(value.f103566d);
                        if (iS2 < 4) {
                            while (iS2 < 4) {
                                cVar.b(0);
                                iS2++;
                            }
                        }
                    }
                }
                if (i19 != 0 || this.f103535f[4].isEmpty()) {
                    cVar.h(0L);
                } else {
                    cVar.h(iArr[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = this.f103535f[i19].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f103566d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f103538i) {
            cVar.write(G());
        }
        if (this.f103533d == 14 && size % 2 == i17) {
            cVar.b(0);
        }
        cVar.a(ByteOrder.BIG_ENDIAN);
        return size;
    }

    @Nullable
    public Bitmap F() throws Throwable {
        if (!this.f103538i) {
            return null;
        }
        if (this.f103543n == null) {
            this.f103543n = G();
        }
        int i10 = this.f103544o;
        if (i10 == 6 || i10 == 7) {
            return BitmapFactory.decodeByteArray(this.f103543n, 0, this.f103542m);
        }
        if (i10 == 1) {
            int length = this.f103543n.length / 3;
            int[] iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                byte[] bArr = this.f103543n;
                int i12 = i11 * 3;
                iArr[i11] = (bArr[i12] << zi.c.f161640r) + (bArr[i12 + 1] << 8) + bArr[i12 + 2];
            }
            d dVar = this.f103535f[4].get(f103351e2);
            d dVar2 = this.f103535f[4].get(f103359f2);
            if (dVar != null && dVar2 != null) {
                return Bitmap.createBitmap(iArr, dVar2.p(this.f103537h), dVar.p(this.f103537h), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    @Nullable
    public byte[] G() throws Throwable {
        FileDescriptor fileDescriptor;
        Exception e10;
        FileDescriptor fileDescriptor2;
        ?? fileInputStream;
        ?? r10 = 0;
        r10 = 0;
        if (!this.f103538i) {
            return null;
        }
        ?? fileInputStream2 = this.f103543n;
        try {
            if (fileInputStream2 != 0) {
                return fileInputStream2;
            }
            try {
                fileInputStream2 = this.f103532c;
                if (fileInputStream2 != 0) {
                    try {
                        if (!fileInputStream2.markSupported()) {
                            Log.d(f103485v, "Cannot read thumbnail from inputstream without mark/reset support");
                            l3.b.c(fileInputStream2);
                            return null;
                        }
                        fileInputStream2.reset();
                        fileInputStream = fileInputStream2;
                        fileDescriptor2 = null;
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e11) {
                        e10 = e11;
                        fileDescriptor2 = null;
                        Log.d(f103485v, "Encountered exception while getting thumbnail", e10);
                        l3.b.c(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            l3.b.b(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        fileDescriptor = null;
                        r10 = fileInputStream2;
                        l3.b.c(r10);
                        if (fileDescriptor != null) {
                            l3.b.b(fileDescriptor);
                        }
                        throw th;
                    }
                } else if (this.f103530a != null) {
                    fileInputStream = new FileInputStream(this.f103530a);
                    fileDescriptor2 = null;
                    fileInputStream2 = fileInputStream;
                } else {
                    FileDescriptor fileDescriptorB = l3.b.a.b(this.f103531b);
                    try {
                        l3.b.a.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                        fileDescriptor2 = fileDescriptorB;
                        fileInputStream2 = new FileInputStream(fileDescriptorB);
                    } catch (Exception e12) {
                        e10 = e12;
                        fileDescriptor2 = fileDescriptorB;
                        fileInputStream2 = 0;
                        Log.d(f103485v, "Encountered exception while getting thumbnail", e10);
                        l3.b.c(fileInputStream2);
                        if (fileDescriptor2 != null) {
                            l3.b.b(fileDescriptor2);
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileDescriptor = fileDescriptorB;
                        l3.b.c(r10);
                        if (fileDescriptor != null) {
                            l3.b.b(fileDescriptor);
                        }
                        throw th;
                    }
                }
                try {
                    if (fileInputStream2.skip(this.f103541l + this.f103545p) != this.f103541l + this.f103545p) {
                        throw new IOException("Corrupted image");
                    }
                    byte[] bArr = new byte[this.f103542m];
                    if (fileInputStream2.read(bArr) != this.f103542m) {
                        throw new IOException("Corrupted image");
                    }
                    this.f103543n = bArr;
                    l3.b.c(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        l3.b.b(fileDescriptor2);
                    }
                    return bArr;
                } catch (Exception e13) {
                    e10 = e13;
                    Log.d(f103485v, "Encountered exception while getting thumbnail", e10);
                    l3.b.c(fileInputStream2);
                    if (fileDescriptor2 != null) {
                        l3.b.b(fileDescriptor2);
                    }
                    return null;
                }
            } catch (Exception e14) {
                fileInputStream2 = 0;
                e10 = e14;
                fileDescriptor2 = null;
            } catch (Throwable th4) {
                th = th4;
                fileDescriptor = null;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    @Nullable
    public long[] H() {
        if (this.f103549t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        if (!this.f103538i) {
            return null;
        }
        if (!this.f103539j || this.f103540k) {
            return new long[]{this.f103541l + this.f103545p, this.f103542m};
        }
        return null;
    }

    public final void I(b bVar) throws Throwable {
        if (f103494w) {
            Log.d(f103485v, "getWebpAttributes starting with: " + bVar);
        }
        bVar.i(ByteOrder.LITTLE_ENDIAN);
        bVar.k(Y5.length);
        int i10 = bVar.readInt() + 8;
        byte[] bArr = Z5;
        bVar.k(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i11 = bVar.readInt();
                int i12 = length + 8;
                if (Arrays.equals(f103331b6, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    if (bVar.read(bArr3) == i11) {
                        this.f103545p = i12;
                        j0(bArr3, 0);
                        z0(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + l3.b.a(bArr2));
                    }
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.k(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void K(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get(N);
        d dVar2 = (d) map.get(O);
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iP = dVar.p(this.f103537h);
        int iP2 = dVar2.p(this.f103537h);
        if (this.f103533d == 7) {
            iP += this.f103546q;
        }
        if (iP > 0 && iP2 > 0) {
            this.f103538i = true;
            if (this.f103530a == null && this.f103532c == null && this.f103531b == null) {
                byte[] bArr = new byte[iP2];
                bVar.skip(iP);
                bVar.read(bArr);
                this.f103543n = bArr;
            }
            this.f103541l = iP;
            this.f103542m = iP2;
        }
        if (f103494w) {
            Log.d(f103485v, "Setting thumbnail attributes with offset: " + iP + ", length: " + iP2);
        }
    }

    public final void L(b bVar, HashMap map) throws IOException {
        d dVar = (d) map.get(K);
        d dVar2 = (d) map.get(M);
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] jArrD = l3.b.d(dVar.r(this.f103537h));
        long[] jArrD2 = l3.b.d(dVar2.r(this.f103537h));
        if (jArrD == null || jArrD.length == 0) {
            Log.w(f103485v, "stripOffsets should not be null or have zero length.");
            return;
        }
        if (jArrD2 == null || jArrD2.length == 0) {
            Log.w(f103485v, "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (jArrD.length != jArrD2.length) {
            Log.w(f103485v, "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j10 = 0;
        for (long j11 : jArrD2) {
            j10 += j11;
        }
        int i10 = (int) j10;
        byte[] bArr = new byte[i10];
        this.f103540k = true;
        this.f103539j = true;
        this.f103538i = true;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < jArrD.length; i13++) {
            int i14 = (int) jArrD[i13];
            int i15 = (int) jArrD2[i13];
            if (i13 < jArrD.length - 1 && i14 + i15 != jArrD[i13 + 1]) {
                this.f103540k = false;
            }
            int i16 = i14 - i11;
            if (i16 < 0) {
                Log.d(f103485v, "Invalid strip offset value");
                return;
            }
            long j12 = i16;
            if (bVar.skip(j12) != j12) {
                Log.d(f103485v, "Failed to skip " + i16 + " bytes.");
                return;
            }
            int i17 = i11 + i16;
            byte[] bArr2 = new byte[i15];
            if (bVar.read(bArr2) != i15) {
                Log.d(f103485v, "Failed to read " + i15 + " bytes.");
                return;
            }
            i11 = i17 + i15;
            System.arraycopy(bArr2, 0, bArr, i12, i15);
            i12 += i15;
        }
        this.f103543n = bArr;
        if (this.f103540k) {
            this.f103541l = (int) jArrD[0];
            this.f103542m = i10;
        }
    }

    public boolean M(@NonNull String str) {
        return q(str) != null;
    }

    public boolean N() {
        return this.f103538i;
    }

    public final void O(String str) throws Throwable {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f103532c = null;
        this.f103530a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (X(fileInputStream2.getFD())) {
                    this.f103531b = fileInputStream2.getFD();
                } else {
                    this.f103531b = null;
                }
                e0(fileInputStream2);
                l3.b.c(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                l3.b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public boolean Q() {
        int iL = l(C, 1);
        return iL == 2 || iL == 7 || iL == 4 || iL == 5;
    }

    public final boolean R(byte[] bArr) throws Throwable {
        long j10;
        b bVar = null;
        try {
            try {
                b bVar2 = new b(bArr);
                try {
                    long length = bVar2.readInt();
                    byte[] bArr2 = new byte[4];
                    bVar2.read(bArr2);
                    if (!Arrays.equals(bArr2, G5)) {
                        bVar2.close();
                        return false;
                    }
                    if (length == 1) {
                        length = bVar2.readLong();
                        j10 = 16;
                        if (length < 16) {
                            bVar2.close();
                            return false;
                        }
                    } else {
                        j10 = 8;
                    }
                    if (length > bArr.length) {
                        length = bArr.length;
                    }
                    long j11 = length - j10;
                    if (j11 < 8) {
                        bVar2.close();
                        return false;
                    }
                    byte[] bArr3 = new byte[4];
                    boolean z10 = false;
                    boolean z11 = false;
                    for (long j12 = 0; j12 < j11 / 4; j12++) {
                        if (bVar2.read(bArr3) != 4) {
                            bVar2.close();
                            return false;
                        }
                        if (j12 != 1) {
                            if (Arrays.equals(bArr3, H5)) {
                                z10 = true;
                            } else if (Arrays.equals(bArr3, I5)) {
                                z11 = true;
                            }
                            if (z10 && z11) {
                                bVar2.close();
                                return true;
                            }
                        }
                    }
                    bVar2.close();
                } catch (Exception e10) {
                    e = e10;
                    bVar = bVar2;
                    if (f103494w) {
                        Log.d(f103485v, "Exception parsing HEIF file type box.", e);
                    }
                    if (bVar != null) {
                        bVar.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                    if (bVar != null) {
                        bVar.close();
                    }
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean T(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderI0 = i0(bVar2);
                this.f103537h = byteOrderI0;
                bVar2.i(byteOrderI0);
                short s10 = bVar2.readShort();
                boolean z10 = s10 == 20306 || s10 == 21330;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean U(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = S5;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    public final boolean V(byte[] bArr) throws IOException {
        byte[] bytes = E5.getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    public final boolean W(byte[] bArr) throws Throwable {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder byteOrderI0 = i0(bVar2);
                this.f103537h = byteOrderI0;
                bVar2.i(byteOrderI0);
                boolean z10 = bVar2.readShort() == 85;
                bVar2.close();
                return z10;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final boolean Y(HashMap map) throws IOException {
        d dVar;
        int iP;
        d dVar2 = (d) map.get(f103521z);
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.r(this.f103537h);
            int[] iArr2 = f103458r5;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f103533d == 3 && (dVar = (d) map.get(B)) != null && (((iP = dVar.p(this.f103537h)) == 1 && Arrays.equals(iArr, f103474t5)) || (iP == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f103494w) {
            return false;
        }
        Log.d(f103485v, "Unsupported data type value");
        return false;
    }

    public final void a() {
        String strI = i(f103413m0);
        if (strI != null && i(U) == null) {
            this.f103535f[0].put(U, d.h(strI));
        }
        if (i(f103503x) == null) {
            this.f103535f[0].put(f103503x, d.i(0L, this.f103537h));
        }
        if (i(f103512y) == null) {
            this.f103535f[0].put(f103512y, d.i(0L, this.f103537h));
        }
        if (i(C) == null) {
            this.f103535f[0].put(C, d.i(0L, this.f103537h));
        }
        if (i(O0) == null) {
            this.f103535f[1].put(O0, d.i(0L, this.f103537h));
        }
    }

    public final String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - j10;
        long j11 = (long) (d11 * 60.0d);
        return j10 + "/1," + j11 + "/1," + Math.round((d11 - (j11 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public final boolean b0(HashMap map) throws IOException {
        d dVar = (d) map.get(f103512y);
        d dVar2 = (d) map.get(f103503x);
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.p(this.f103537h) <= 512 && dVar2.p(this.f103537h) <= 512;
    }

    public boolean c0() {
        if (!this.f103538i) {
            return false;
        }
        int i10 = this.f103544o;
        return i10 == 6 || i10 == 7;
    }

    public final void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f103396j7;
                sb2.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb2.append(str);
                throw new IOException(sb2.toString());
            }
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public final boolean d0(byte[] bArr) throws IOException {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = Y5;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = Z5;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[Y5.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else {
                if (bArr[i10] != bArr2[i10]) {
                    return false;
                }
                i10++;
            }
        }
    }

    public final void e(b bVar, c cVar, byte[] bArr) throws IOException {
        int i10 = bVar.readInt();
        cVar.write(bArr);
        cVar.c(i10);
        if (i10 % 2 == 1) {
            i10++;
        }
        l3.b.f(bVar, cVar, i10);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x009f A[Catch: all -> 0x0015, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0004, B:6:0x0009, B:13:0x001e, B:15:0x0022, B:16:0x0030, B:18:0x0038, B:20:0x0041, B:31:0x0061, B:21:0x0045, B:23:0x004b, B:26:0x0052, B:29:0x005a, B:30:0x005e, B:32:0x006b, B:34:0x0075, B:37:0x007d, B:40:0x0085, B:43:0x008d, B:48:0x009b, B:50:0x009f), top: B:61:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public final void e0(@NonNull InputStream inputStream) {
        boolean z10;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < f103348d7.length; i10++) {
            try {
                try {
                    this.f103535f[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    a();
                    if (f103494w) {
                        h0();
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                z10 = f103494w;
                if (z10) {
                    Log.w(f103485v, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z10) {
                    h0();
                    return;
                }
                return;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                z10 = f103494w;
                if (z10) {
                    Log.w(f103485v, "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z10) {
                    h0();
                    return;
                }
                return;
            }
        }
        if (!this.f103534e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f103533d = w(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (A0(this.f103533d)) {
            i iVar = new i(inputStream);
            if (this.f103534e) {
                D(iVar);
            } else {
                int i11 = this.f103533d;
                if (i11 == 12) {
                    s(iVar);
                } else if (i11 == 7) {
                    x(iVar);
                } else if (i11 == 10) {
                    C(iVar);
                } else {
                    A(iVar);
                }
            }
            iVar.l(this.f103545p);
            z0(iVar);
        } else {
            b bVar = new b(inputStream);
            int i12 = this.f103533d;
            if (i12 == 4) {
                t(bVar, 0, 0);
            } else if (i12 == 13) {
                y(bVar);
            } else if (i12 == 9) {
                z(bVar);
            } else if (i12 == 14) {
                I(bVar);
            }
        }
        a();
        if (f103494w) {
            h0();
        }
    }

    public void f() {
        int i10 = 1;
        switch (l(C, 1)) {
            case 1:
                i10 = 2;
                break;
            case 2:
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 0;
                break;
        }
        v0(C, Integer.toString(i10));
    }

    public void g() {
        int i10 = 1;
        switch (l(C, 1)) {
            case 1:
                i10 = 4;
                break;
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 0;
                break;
        }
        v0(C, Integer.toString(i10));
    }

    public final void g0(b bVar) throws IOException {
        ByteOrder byteOrderI0 = i0(bVar);
        this.f103537h = byteOrderI0;
        bVar.i(byteOrderI0);
        int unsignedShort = bVar.readUnsignedShort();
        int i10 = this.f103533d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = bVar.readInt();
        if (i11 < 8) {
            throw new IOException("Invalid first Ifd offset: " + i11);
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            bVar.k(i12);
        }
    }

    public double h(double d10) {
        double dK = k(D1, -1.0d);
        int iL = l(C1, -1);
        if (dK < 0.0d || iL < 0) {
            return d10;
        }
        return dK * ((double) (iL != 1 ? 1 : -1));
    }

    public final void h0() {
        for (int i10 = 0; i10 < this.f103535f.length; i10++) {
            Log.d(f103485v, "The size of tag group[" + i10 + "]: " + this.f103535f[i10].size());
            for (Map.Entry<String, d> entry : this.f103535f[i10].entrySet()) {
                d value = entry.getValue();
                Log.d(f103485v, "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.q(this.f103537h) + "'");
            }
        }
    }

    @Nullable
    public String i(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            if (!f103380h7.contains(str)) {
                return dVarQ.q(this.f103537h);
            }
            if (str.equals(E1)) {
                int i10 = dVarQ.f103563a;
                if (i10 != 5 && i10 != 10) {
                    Log.w(f103485v, "GPS Timestamp format is not rational. format=" + dVarQ.f103563a);
                    return null;
                }
                h[] hVarArr = (h[]) dVarQ.r(this.f103537h);
                if (hVarArr == null || hVarArr.length != 3) {
                    Log.w(f103485v, "Invalid GPS Timestamp array. array=" + Arrays.toString(hVarArr));
                    return null;
                }
                h hVar = hVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (hVar.f103571a / hVar.f103572b));
                h hVar2 = hVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (hVar2.f103571a / hVar2.f103572b));
                h hVar3 = hVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (hVar3.f103571a / hVar3.f103572b)));
            }
            try {
                return Double.toString(dVarQ.o(this.f103537h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final ByteOrder i0(b bVar) throws IOException {
        short s10 = bVar.readShort();
        if (s10 == 18761) {
            if (f103494w) {
                Log.d(f103485v, "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (f103494w) {
                Log.d(f103485v, "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    @Nullable
    public byte[] j(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            return dVarQ.f103566d;
        }
        return null;
    }

    public final void j0(byte[] bArr, int i10) throws IOException {
        i iVar = new i(bArr);
        g0(iVar);
        k0(iVar, i10);
    }

    public double k(@NonNull String str, double d10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            try {
                return dVarQ.o(this.f103537h);
            } catch (NumberFormatException unused) {
            }
        }
        return d10;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:103:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x013c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0143  */
    /* JADX WARN: Code duplicated, block: B:49:0x0149  */
    /* JADX WARN: Code duplicated, block: B:51:0x0151  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168  */
    /* JADX WARN: Code duplicated, block: B:55:0x016f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0179  */
    /* JADX WARN: Code duplicated, block: B:58:0x017b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:71:0x0202  */
    /* JADX WARN: Code duplicated, block: B:73:0x0205  */
    /* JADX WARN: Code duplicated, block: B:75:0x0209 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x020b  */
    /* JADX WARN: Code duplicated, block: B:78:0x020f  */
    /* JADX WARN: Code duplicated, block: B:83:0x021c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0221  */
    /* JADX WARN: Code duplicated, block: B:85:0x0226  */
    /* JADX WARN: Code duplicated, block: B:87:0x022d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0248  */
    /* JADX WARN: Code duplicated, block: B:92:0x0255  */
    /* JADX WARN: Code duplicated, block: B:93:0x0260 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0262  */
    /* JADX WARN: Code duplicated, block: B:95:0x0284 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0286  */
    /* JADX WARN: Code duplicated, block: B:98:0x029f  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x0151, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x01e2, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:94:0x0262, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:96:0x0286, please report this as an issue */
    public final void k0(i iVar, int i10) throws IOException {
        int i11;
        short s10;
        long j10;
        boolean z10;
        Integer num;
        int unsignedShort;
        long jH;
        int i12;
        this.f103536g.add(Integer.valueOf(iVar.f103558d));
        short s11 = iVar.readShort();
        if (f103494w) {
            Log.d(f103485v, "numberOfDirectoryEntry: " + ((int) s11));
        }
        if (s11 <= 0) {
            return;
        }
        short s12 = 0;
        while (s12 < s11) {
            int unsignedShort2 = iVar.readUnsignedShort();
            int unsignedShort3 = iVar.readUnsignedShort();
            int i13 = iVar.readInt();
            long jD = ((long) iVar.d()) + 4;
            f fVar = f103364f7[i10].get(Integer.valueOf(unsignedShort2));
            boolean z11 = f103494w;
            if (z11) {
                i11 = 4;
                Log.d(f103485v, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), fVar != null ? fVar.f103568b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            } else {
                i11 = 4;
            }
            if (fVar != null) {
                if (unsignedShort3 > 0) {
                    int[] iArr = H6;
                    if (unsignedShort3 < iArr.length) {
                        if (fVar.a(unsignedShort3)) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = fVar.f103569c;
                            }
                            s10 = s12;
                            j10 = ((long) i13) * ((long) iArr[unsignedShort3]);
                            if (j10 < 0 || j10 > 2147483647L) {
                                if (z11) {
                                    Log.d(f103485v, "Skip the tag entry since the number of components is invalid: " + i13);
                                }
                                z10 = false;
                            } else {
                                z10 = true;
                            }
                        } else if (z11) {
                            Log.d(f103485v, "Skip the tag entry since data format (" + G6[unsignedShort3] + ") is unexpected for tag: " + fVar.f103568b);
                        }
                    }
                    if (z10) {
                        if (j10 > 4) {
                            i12 = iVar.readInt();
                            if (z11) {
                                Log.d(f103485v, "seek to data offset: " + i12);
                            }
                            if (this.f103533d == 7) {
                                if (f103389j0.equals(fVar.f103568b)) {
                                    this.f103546q = i12;
                                } else if (i10 != 6 && f103391j2.equals(fVar.f103568b)) {
                                    this.f103547r = i12;
                                    this.f103548s = i13;
                                    d dVarM = d.m(6, this.f103537h);
                                    d dVarI = d.i(this.f103547r, this.f103537h);
                                    d dVarI2 = d.i(this.f103548s, this.f103537h);
                                    this.f103535f[i11].put(A, dVarM);
                                    this.f103535f[i11].put(N, dVarI);
                                    this.f103535f[i11].put(O, dVarI2);
                                }
                            }
                            iVar.l(i12);
                        } else {
                            unsignedShort2 = unsignedShort2;
                            i13 = i13;
                            z11 = z11;
                        }
                        num = f103388i7.get(Integer.valueOf(unsignedShort2));
                        if (z11) {
                            Log.d(f103485v, "nextIfdType: " + num + " byteCount: " + j10);
                        }
                        if (num != null) {
                            if (unsignedShort3 != 3) {
                                if (unsignedShort3 == i11) {
                                    jH = iVar.h();
                                } else if (unsignedShort3 == 8) {
                                    unsignedShort = iVar.readShort();
                                } else if (unsignedShort3 != 9 || unsignedShort3 == 13) {
                                    unsignedShort = iVar.readInt();
                                } else {
                                    jH = -1;
                                }
                                if (z11) {
                                    Log.d(f103485v, String.format("Offset: %d, tagName: %s", Long.valueOf(jH), fVar.f103568b));
                                }
                                if (jH > 0) {
                                    if (!this.f103536g.contains(Integer.valueOf((int) jH))) {
                                        iVar.l(jH);
                                        k0(iVar, num.intValue());
                                    } else if (z11) {
                                        Log.d(f103485v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + j.f86771d);
                                    }
                                } else if (z11) {
                                    Log.d(f103485v, "Skip jump into the IFD since its offset is invalid: " + jH);
                                }
                                iVar.l(jD);
                            } else {
                                unsignedShort = iVar.readUnsignedShort();
                            }
                            jH = unsignedShort;
                            if (z11) {
                                Log.d(f103485v, String.format("Offset: %d, tagName: %s", Long.valueOf(jH), fVar.f103568b));
                            }
                            if (jH > 0) {
                                if (!this.f103536g.contains(Integer.valueOf((int) jH))) {
                                    iVar.l(jH);
                                    k0(iVar, num.intValue());
                                } else if (z11) {
                                    Log.d(f103485v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + j.f86771d);
                                }
                            } else if (z11) {
                                Log.d(f103485v, "Skip jump into the IFD since its offset is invalid: " + jH);
                            }
                            iVar.l(jD);
                        } else {
                            int iD = iVar.d() + this.f103545p;
                            byte[] bArr = new byte[(int) j10];
                            iVar.readFully(bArr);
                            d dVar = new d(unsignedShort3, i13, iD, bArr);
                            this.f103535f[i10].put(fVar.f103568b, dVar);
                            if (f103375h2.equals(fVar.f103568b)) {
                                this.f103533d = 3;
                            }
                            if (((!W.equals(fVar.f103568b) || "Model".equals(fVar.f103568b)) && dVar.q(this.f103537h).contains(Q5)) || (A.equals(fVar.f103568b) && dVar.p(this.f103537h) == 65535)) {
                                this.f103533d = 8;
                            }
                            if (iVar.d() != jD) {
                                iVar.l(jD);
                            }
                        }
                    } else {
                        iVar.l(jD);
                        s11 = s11;
                    }
                    s12 = (short) (s10 + 1);
                    s11 = s11;
                }
                s10 = s12;
                if (z11) {
                    Log.d(f103485v, "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j10 = 0;
                z10 = false;
                if (z10) {
                    iVar.l(jD);
                    s11 = s11;
                } else {
                    if (j10 > 4) {
                        i12 = iVar.readInt();
                        if (z11) {
                            Log.d(f103485v, "seek to data offset: " + i12);
                        }
                        if (this.f103533d == 7) {
                            if (f103389j0.equals(fVar.f103568b)) {
                                this.f103546q = i12;
                            } else if (i10 != 6) {
                            }
                        }
                        iVar.l(i12);
                    } else {
                        unsignedShort2 = unsignedShort2;
                        i13 = i13;
                        z11 = z11;
                    }
                    num = f103388i7.get(Integer.valueOf(unsignedShort2));
                    if (z11) {
                        Log.d(f103485v, "nextIfdType: " + num + " byteCount: " + j10);
                    }
                    if (num != null) {
                        if (unsignedShort3 != 3) {
                            if (unsignedShort3 == i11) {
                                jH = iVar.h();
                            } else if (unsignedShort3 == 8) {
                                if (unsignedShort3 != 9) {
                                }
                                unsignedShort = iVar.readInt();
                            } else {
                                unsignedShort = iVar.readShort();
                            }
                            if (z11) {
                                Log.d(f103485v, String.format("Offset: %d, tagName: %s", Long.valueOf(jH), fVar.f103568b));
                            }
                            if (jH > 0) {
                                if (!this.f103536g.contains(Integer.valueOf((int) jH))) {
                                    iVar.l(jH);
                                    k0(iVar, num.intValue());
                                } else if (z11) {
                                    Log.d(f103485v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + j.f86771d);
                                }
                            } else if (z11) {
                                Log.d(f103485v, "Skip jump into the IFD since its offset is invalid: " + jH);
                            }
                            iVar.l(jD);
                        } else {
                            unsignedShort = iVar.readUnsignedShort();
                        }
                        jH = unsignedShort;
                        if (z11) {
                            Log.d(f103485v, String.format("Offset: %d, tagName: %s", Long.valueOf(jH), fVar.f103568b));
                        }
                        if (jH > 0) {
                            if (!this.f103536g.contains(Integer.valueOf((int) jH))) {
                                iVar.l(jH);
                                k0(iVar, num.intValue());
                            } else if (z11) {
                                Log.d(f103485v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + j.f86771d);
                            }
                        } else if (z11) {
                            Log.d(f103485v, "Skip jump into the IFD since its offset is invalid: " + jH);
                        }
                        iVar.l(jD);
                    } else {
                        int iD2 = iVar.d() + this.f103545p;
                        byte[] bArr2 = new byte[(int) j10];
                        iVar.readFully(bArr2);
                        d dVar2 = new d(unsignedShort3, i13, iD2, bArr2);
                        this.f103535f[i10].put(fVar.f103568b, dVar2);
                        if (f103375h2.equals(fVar.f103568b)) {
                            this.f103533d = 3;
                        }
                        if (!W.equals(fVar.f103568b)) {
                        }
                        this.f103533d = 8;
                        if (iVar.d() != jD) {
                            iVar.l(jD);
                        }
                    }
                }
                s12 = (short) (s10 + 1);
                s11 = s11;
            } else if (z11) {
                Log.d(f103485v, "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            s10 = s12;
            j10 = 0;
            z10 = false;
            if (z10) {
                iVar.l(jD);
                s11 = s11;
            } else {
                if (j10 > 4) {
                    i12 = iVar.readInt();
                    if (z11) {
                        Log.d(f103485v, "seek to data offset: " + i12);
                    }
                    if (this.f103533d == 7) {
                        if (f103389j0.equals(fVar.f103568b)) {
                            this.f103546q = i12;
                        } else if (i10 != 6) {
                        }
                    }
                    iVar.l(i12);
                } else {
                    unsignedShort2 = unsignedShort2;
                    i13 = i13;
                    z11 = z11;
                }
                num = f103388i7.get(Integer.valueOf(unsignedShort2));
                if (z11) {
                    Log.d(f103485v, "nextIfdType: " + num + " byteCount: " + j10);
                }
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i11) {
                            jH = iVar.h();
                        } else if (unsignedShort3 == 8) {
                            if (unsignedShort3 != 9) {
                            }
                            unsignedShort = iVar.readInt();
                        } else {
                            unsignedShort = iVar.readShort();
                        }
                        if (z11) {
                            Log.d(f103485v, String.format("Offset: %d, tagName: %s", Long.valueOf(jH), fVar.f103568b));
                        }
                        if (jH > 0) {
                            if (!this.f103536g.contains(Integer.valueOf((int) jH))) {
                                iVar.l(jH);
                                k0(iVar, num.intValue());
                            } else if (z11) {
                                Log.d(f103485v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + j.f86771d);
                            }
                        } else if (z11) {
                            Log.d(f103485v, "Skip jump into the IFD since its offset is invalid: " + jH);
                        }
                        iVar.l(jD);
                    } else {
                        unsignedShort = iVar.readUnsignedShort();
                    }
                    jH = unsignedShort;
                    if (z11) {
                        Log.d(f103485v, String.format("Offset: %d, tagName: %s", Long.valueOf(jH), fVar.f103568b));
                    }
                    if (jH > 0) {
                        if (!this.f103536g.contains(Integer.valueOf((int) jH))) {
                            iVar.l(jH);
                            k0(iVar, num.intValue());
                        } else if (z11) {
                            Log.d(f103485v, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + jH + j.f86771d);
                        }
                    } else if (z11) {
                        Log.d(f103485v, "Skip jump into the IFD since its offset is invalid: " + jH);
                    }
                    iVar.l(jD);
                } else {
                    int iD3 = iVar.d() + this.f103545p;
                    byte[] bArr3 = new byte[(int) j10];
                    iVar.readFully(bArr3);
                    d dVar3 = new d(unsignedShort3, i13, iD3, bArr3);
                    this.f103535f[i10].put(fVar.f103568b, dVar3);
                    if (f103375h2.equals(fVar.f103568b)) {
                        this.f103533d = 3;
                    }
                    if (!W.equals(fVar.f103568b)) {
                    }
                    this.f103533d = 8;
                    if (iVar.d() != jD) {
                        iVar.l(jD);
                    }
                }
            }
            s12 = (short) (s10 + 1);
            s11 = s11;
        }
        int i14 = iVar.readInt();
        boolean z12 = f103494w;
        if (z12) {
            Log.d(f103485v, String.format("nextIfdOffset: %d", Integer.valueOf(i14)));
        }
        long j11 = i14;
        if (j11 <= 0) {
            if (z12) {
                Log.d(f103485v, "Stop reading file since a wrong offset may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        if (this.f103536g.contains(Integer.valueOf(i14))) {
            if (z12) {
                Log.d(f103485v, "Stop reading file since re-reading an IFD may cause an infinite loop: " + i14);
                return;
            }
            return;
        }
        iVar.l(j11);
        if (this.f103535f[4].isEmpty()) {
            k0(iVar, 4);
        } else if (this.f103535f[5].isEmpty()) {
            k0(iVar, 5);
        }
    }

    public int l(@NonNull String str, int i10) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            try {
                return dVarQ.p(this.f103537h);
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public final void l0(String str) {
        for (int i10 = 0; i10 < f103348d7.length; i10++) {
            this.f103535f[i10].remove(str);
        }
    }

    @Nullable
    public long[] m(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (this.f103549t) {
            throw new IllegalStateException("The underlying file has been modified since being parsed");
        }
        d dVarQ = q(str);
        if (dVarQ != null) {
            return new long[]{dVarQ.f103565c, dVarQ.f103566d.length};
        }
        return null;
    }

    public final void m0(int i10, String str, String str2) {
        if (this.f103535f[i10].isEmpty() || this.f103535f[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = this.f103535f[i10];
        map.put(str2, map.get(str));
        this.f103535f[i10].remove(str);
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public Long n() {
        return f0(i(U), i(f103453r0), i(f103429o0));
    }

    public void n0() {
        v0(C, Integer.toString(1));
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public Long o() {
        return f0(i(f103421n0), i(f103469t0), i(f103445q0));
    }

    public final void o0(i iVar, int i10) throws Throwable {
        d dVar = this.f103535f[i10].get(f103512y);
        d dVar2 = this.f103535f[i10].get(f103503x);
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f103535f[i10].get(N);
            d dVar4 = this.f103535f[i10].get(O);
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int iP = dVar3.p(this.f103537h);
            int iP2 = dVar3.p(this.f103537h);
            iVar.l(iP);
            byte[] bArr = new byte[iP2];
            iVar.read(bArr);
            t(new b(bArr), iP, i10);
        }
    }

    @Nullable
    @y0({y0.a.LIBRARY})
    public Long p() {
        return f0(i(f103413m0), i(f103461s0), i(f103437p0));
    }

    public void p0(int i10) {
        if (i10 % 90 != 0) {
            throw new IllegalArgumentException("degree should be a multiple of 90");
        }
        int iL = l(C, 1);
        List<Integer> list = M2;
        int iIntValue = 0;
        if (list.contains(Integer.valueOf(iL))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(iL)) + (i10 / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = N2;
            if (list2.contains(Integer.valueOf(iL))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(iL)) + (i10 / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        v0(C, Integer.toString(iIntValue));
    }

    @Nullable
    public final d q(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (f103513y0.equals(str)) {
            if (f103494w) {
                Log.d(f103485v, "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = f103522z0;
        }
        for (int i10 = 0; i10 < f103348d7.length; i10++) {
            d dVar = this.f103535f[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00f1 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0106 A[Catch: all -> 0x0101, Exception -> 0x0104, TryCatch #20 {Exception -> 0x0104, all -> 0x0101, blocks: (B:68:0x00ed, B:70:0x00f1, B:77:0x010e, B:76:0x0106), top: B:120:0x00ed }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0152  */
    public void q0() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream2;
        Exception exc;
        FileOutputStream fileOutputStream3;
        InputStream fileInputStream2;
        Exception e10;
        FileOutputStream fileOutputStream4;
        if (!Z(this.f103533d)) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (this.f103531b == null && this.f103530a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (this.f103538i && this.f103539j && !this.f103540k) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        this.f103549t = true;
        this.f103543n = E();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile(C4271f4.D, "tmp");
            if (this.f103530a != null) {
                fileInputStream = new FileInputStream(this.f103530a);
            } else {
                l3.b.a.c(this.f103531b, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.f103531b);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    l3.b.e(fileInputStream, fileOutputStream);
                    l3.b.c(fileInputStream);
                    l3.b.c(fileOutputStream);
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.f103530a != null) {
                                        fileOutputStream3 = new FileOutputStream(this.f103530a);
                                    } else {
                                        l3.b.a.c(this.f103531b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.f103531b);
                                    }
                                    try {
                                        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                            try {
                                                int i10 = this.f103533d;
                                                if (i10 == 4) {
                                                    r0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 13) {
                                                    s0(bufferedInputStream, bufferedOutputStream);
                                                } else if (i10 == 14) {
                                                    t0(bufferedInputStream, bufferedOutputStream);
                                                }
                                                l3.b.c(bufferedInputStream);
                                                l3.b.c(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.f103543n = null;
                                            } catch (Exception e11) {
                                                exc = e11;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.f103530a == null) {
                                                            l3.b.a.c(this.f103531b, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream4 = new FileOutputStream(this.f103531b);
                                                        } else {
                                                            fileOutputStream4 = new FileOutputStream(this.f103530a);
                                                        }
                                                        fileOutputStream3 = fileOutputStream4;
                                                        l3.b.e(fileInputStream2, fileOutputStream3);
                                                        l3.b.c(fileInputStream2);
                                                        l3.b.c(fileOutputStream3);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e12) {
                                                        e10 = e12;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e10);
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            inputStream = fileInputStream2;
                                                            l3.b.c(inputStream);
                                                            l3.b.c(fileOutputStream3);
                                                            throw th;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        inputStream = fileInputStream2;
                                                        l3.b.c(inputStream);
                                                        l3.b.c(fileOutputStream3);
                                                        throw th;
                                                    }
                                                } catch (Exception e13) {
                                                    fileInputStream2 = inputStream;
                                                    e10 = e13;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    l3.b.c(inputStream);
                                                    l3.b.c(fileOutputStream3);
                                                    throw th;
                                                }
                                            }
                                        } catch (Exception e14) {
                                            inputStream = fileInputStream3;
                                            exc = e14;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            inputStream = bufferedInputStream;
                                            l3.b.c(inputStream);
                                            l3.b.c(0);
                                            if (0 == 0) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e15) {
                                        inputStream = fileInputStream3;
                                        exc = e15;
                                    }
                                } catch (Exception e16) {
                                    e = e16;
                                    fileOutputStream2 = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream3 = fileOutputStream2;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.f103530a == null) {
                                        l3.b.a.c(this.f103531b, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream4 = new FileOutputStream(this.f103531b);
                                    } else {
                                        fileOutputStream4 = new FileOutputStream(this.f103530a);
                                    }
                                    fileOutputStream3 = fileOutputStream4;
                                    l3.b.e(fileInputStream2, fileOutputStream3);
                                    l3.b.c(fileInputStream2);
                                    l3.b.c(fileOutputStream3);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                l3.b.c(inputStream);
                                l3.b.c(0);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e17) {
                            e = e17;
                            fileOutputStream2 = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e18) {
                    e = e18;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        l3.b.c(inputStream);
                        l3.b.c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    l3.b.c(inputStream);
                    l3.b.c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e19) {
                e = e19;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e20) {
            e = e20;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    @Nullable
    @SuppressLint({"AutoBoxing"})
    public Long r() {
        String strI = i(f103319a2);
        String strI2 = i(E1);
        if (strI != null && strI2 != null) {
            Pattern pattern = U7;
            if (pattern.matcher(strI).matches() || pattern.matcher(strI2).matches()) {
                String str = strI + ' ' + strI2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = f103419m6.parse(str, parsePosition);
                    if (date == null && (date = f103427n6.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    public final void r0(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (f103494w) {
            Log.d(f103485v, "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + j.f86771d);
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.b(-40);
        d dVarRemove = (i(f103471t2) == null || !this.f103550u) ? null : this.f103535f[0].remove(f103471t2);
        cVar.b(-1);
        cVar.b(-31);
        E0(cVar);
        if (dVarRemove != null) {
            this.f103535f[0].put(f103471t2, dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte b10 = bVar.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.b(-1);
                cVar.b(b10);
                l3.b.e(bVar, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.b(-1);
                cVar.b(b10);
                int unsignedShort = bVar.readUnsignedShort();
                cVar.i(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = bVar.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i11);
                    i10 -= i11;
                }
            } else {
                int unsignedShort2 = bVar.readUnsignedShort();
                int i12 = unsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f103404k7)) {
                        bVar.k(unsignedShort2 - 8);
                    }
                }
                cVar.b(-1);
                cVar.b(b10);
                cVar.i(unsignedShort2);
                if (i12 >= 6) {
                    i12 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i12 > 0) {
                    int i13 = bVar.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 < 0) {
                        break;
                    }
                    cVar.write(bArr, 0, i13);
                    i12 -= i13;
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void s(i iVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                l3.b.C0982b.a(mediaMetadataRetriever, new C0981a(iVar));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.f103535f[0].put(f103503x, d.m(Integer.parseInt(strExtractMetadata), this.f103537h));
                }
                if (strExtractMetadata2 != null) {
                    this.f103535f[0].put(f103512y, d.m(Integer.parseInt(strExtractMetadata2), this.f103537h));
                }
                if (strExtractMetadata3 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata3);
                    if (i11 == 90) {
                        i10 = 6;
                    } else if (i11 != 180) {
                        i10 = i11 != 270 ? 1 : 8;
                    } else {
                        i10 = 3;
                    }
                    this.f103535f[0].put(C, d.m(i10, this.f103537h));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i12 = Integer.parseInt(strExtractMetadata4);
                    int i13 = Integer.parseInt(strExtractMetadata5);
                    if (i13 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    iVar.l(i12);
                    byte[] bArr = new byte[6];
                    if (iVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i14 = i12 + 6;
                    int i15 = i13 - 6;
                    if (!Arrays.equals(bArr, f103404k7)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i15];
                    if (iVar.read(bArr2) != i15) {
                        throw new IOException("Can't read exif");
                    }
                    this.f103545p = i14;
                    j0(bArr2, 0);
                }
                if (f103494w) {
                    Log.d(f103485v, "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    public final void s0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (f103494w) {
            Log.d(f103485v, "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + j.f86771d);
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = S5;
        l3.b.f(bVar, cVar, bArr.length);
        int i10 = this.f103545p;
        if (i10 == 0) {
            int i11 = bVar.readInt();
            cVar.c(i11);
            l3.b.f(bVar, cVar, i11 + 8);
        } else {
            l3.b.f(bVar, cVar, (i10 - bArr.length) - 8);
            bVar.k(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                E0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f103560b).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.c((int) crc32.getValue());
                l3.b.c(byteArrayOutputStream2);
                l3.b.e(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                l3.b.c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x00be  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
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
    public final void t(l3.a.b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.a.t(l3.a$b, int, int):void");
    }

    public final void t0(InputStream inputStream, OutputStream outputStream) throws Throwable {
        char c10;
        int i10;
        int i11;
        int i12;
        if (f103494w) {
            Log.d(f103485v, "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + j.f86771d);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = Y5;
        l3.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = Z5;
        bVar.k(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                    int i13 = this.f103545p;
                    if (i13 != 0) {
                        l3.b.f(bVar, cVar2, (i13 - ((bArr.length + 4) + bArr2.length)) - 8);
                        bVar.k(4);
                        int i14 = bVar.readInt();
                        if (i14 % 2 != 0) {
                            i14++;
                        }
                        bVar.k(i14);
                        E0(cVar2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (bVar.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = f103355e6;
                        boolean z10 = true;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i15 = bVar.readInt();
                            byte[] bArr5 = new byte[i15 % 2 == 1 ? i15 + 1 : i15];
                            bVar.read(bArr5);
                            byte b10 = (byte) (8 | bArr5[0]);
                            bArr5[0] = b10;
                            boolean z11 = ((b10 >> 1) & 1) == 1;
                            cVar2.write(bArr4);
                            cVar2.c(i15);
                            cVar2.write(bArr5);
                            if (z11) {
                                d(bVar, cVar2, f103379h6, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, f103387i6)) {
                                        break;
                                    } else {
                                        e(bVar, cVar2, bArr6);
                                    }
                                }
                                E0(cVar2);
                            } else {
                                d(bVar, cVar2, f103371g6, f103363f6);
                                E0(cVar2);
                            }
                        } else {
                            byte[] bArr7 = f103371g6;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f103363f6)) {
                                int i16 = bVar.readInt();
                                int i17 = i16 % 2 == 1 ? i16 + 1 : i16;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    bVar.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    c10 = '\b';
                                    if (bVar.read(bArr9) != 3 || !Arrays.equals(f103339c6, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i10 = bVar.readInt();
                                    i17 -= 10;
                                    i12 = (i10 << 2) >> 18;
                                    i11 = (i10 << 18) >> 18;
                                    z10 = false;
                                } else {
                                    c10 = '\b';
                                    if (!Arrays.equals(bArr3, f103363f6)) {
                                        i10 = 0;
                                        z10 = false;
                                        i11 = 0;
                                        i12 = 0;
                                    } else {
                                        if (bVar.readByte() != 47) {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                        i10 = bVar.readInt();
                                        i11 = (i10 & 16383) + 1;
                                        i12 = ((i10 & 268419072) >>> 14) + 1;
                                        if ((i10 & 268435456) == 0) {
                                            z10 = false;
                                        }
                                        i17 -= 5;
                                    }
                                }
                                cVar2.write(bArr4);
                                cVar2.c(10);
                                byte[] bArr10 = new byte[10];
                                if (z10) {
                                    bArr10[0] = (byte) (bArr10[0] | zi.c.f161640r);
                                }
                                bArr10[0] = (byte) (bArr10[0] | 8);
                                int i18 = i11 - 1;
                                int i19 = i12 - 1;
                                bArr10[4] = (byte) i18;
                                bArr10[5] = (byte) (i18 >> 8);
                                bArr10[6] = (byte) (i18 >> 16);
                                bArr10[7] = (byte) i19;
                                bArr10[c10] = (byte) (i19 >> 8);
                                bArr10[9] = (byte) (i19 >> 16);
                                cVar2.write(bArr10);
                                cVar2.write(bArr3);
                                cVar2.c(i16);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    cVar2.write(bArr8);
                                    cVar2.write(f103339c6);
                                    cVar2.c(i10);
                                } else if (Arrays.equals(bArr3, f103363f6)) {
                                    cVar2.write(47);
                                    cVar2.c(i10);
                                }
                                l3.b.f(bVar, cVar2, i17);
                                E0(cVar2);
                            }
                        }
                    }
                    l3.b.e(bVar, cVar2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = Z5;
                    cVar.c(size + bArr11.length);
                    cVar.write(bArr11);
                    byteArrayOutputStream2.writeTo(cVar);
                    l3.b.c(byteArrayOutputStream2);
                } catch (Exception e10) {
                    e = e10;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    l3.b.c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Deprecated
    public boolean u(float[] fArr) {
        double[] dArrV = v();
        if (dArrV == null) {
            return false;
        }
        fArr[0] = (float) dArrV[0];
        fArr[1] = (float) dArrV[1];
        return true;
    }

    public void u0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        v0(D1, new h(Math.abs(d10)).toString());
        v0(C1, str);
    }

    @Nullable
    public double[] v() {
        String strI = i(f103523z1);
        String strI2 = i(f103514y1);
        String strI3 = i(B1);
        String strI4 = i(A1);
        if (strI == null || strI2 == null || strI3 == null || strI4 == null) {
            return null;
        }
        try {
            return new double[]{c(strI, strI2), c(strI3, strI4)};
        } catch (IllegalArgumentException unused) {
            Log.w(f103485v, "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", strI, strI2, strI3, strI4));
            return null;
        }
    }

    public void v0(@NonNull String str, @Nullable String str2) {
        f fVar;
        int i10;
        int i11;
        int i12;
        String str3;
        int i13;
        String str4 = str;
        String strReplaceAll = str2;
        if (str4 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        boolean zEquals = U.equals(str4);
        String str5 = f103485v;
        if ((zEquals || f103413m0.equals(str4) || f103421n0.equals(str4)) && strReplaceAll != null) {
            boolean zFind = W7.matcher(strReplaceAll).find();
            boolean zFind2 = X7.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                Log.w(f103485v, "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll(TokenBuilder.TOKEN_DELIMITER, ":");
            }
        }
        if (f103513y0.equals(str4)) {
            if (f103494w) {
                Log.d(f103485v, "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = f103522z0;
        }
        int i14 = 2;
        int i15 = 1;
        if (strReplaceAll != null && f103380h7.contains(str4)) {
            if (str4.equals(E1)) {
                Matcher matcher = V7.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w(f103485v, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new h(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w(f103485v, "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i16 = 0;
        int i17 = 0;
        while (i17 < f103348d7.length) {
            if ((i17 != 4 || this.f103538i) && (fVar = f103372g7[i17].get(str4)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairJ = J(strReplaceAll);
                    if (fVar.f103569c == ((Integer) pairJ.first).intValue() || fVar.f103569c == ((Integer) pairJ.second).intValue()) {
                        i10 = fVar.f103569c;
                    } else {
                        int i18 = fVar.f103570d;
                        if (i18 == -1 || !(i18 == ((Integer) pairJ.first).intValue() || fVar.f103570d == ((Integer) pairJ.second).intValue())) {
                            int i19 = fVar.f103569c;
                            if (i19 == i15 || i19 == 7 || i19 == i14) {
                                i10 = i19;
                            } else if (f103494w) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str4);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = G6;
                                sb2.append(strArr[fVar.f103569c]);
                                sb2.append(fVar.f103570d == -1 ? "" : ", " + strArr[fVar.f103570d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) pairJ.first).intValue()]);
                                sb2.append(((Integer) pairJ.second).intValue() != -1 ? ", " + strArr[((Integer) pairJ.second).intValue()] : "");
                                sb2.append(j.f86771d);
                                Log.d(str5, sb2.toString());
                            }
                        } else {
                            i10 = fVar.f103570d;
                        }
                    }
                    switch (i10) {
                        case 1:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            this.f103535f[i12].put(str4, d.a(strReplaceAll));
                            break;
                        case 2:
                        case 7:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            this.f103535f[i12].put(str4, d.h(strReplaceAll));
                            break;
                        case 3:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            String[] strArrSplit = strReplaceAll.split(",", -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i20 = i11; i20 < strArrSplit.length; i20++) {
                                iArr[i20] = Integer.parseInt(strArrSplit[i20]);
                            }
                            this.f103535f[i12].put(str4, d.n(iArr, this.f103537h));
                            break;
                        case 4:
                            i11 = i16;
                            i12 = i17;
                            str3 = str5;
                            i13 = i15;
                            String[] strArrSplit2 = strReplaceAll.split(",", -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i21 = i11; i21 < strArrSplit2.length; i21++) {
                                jArr[i21] = Long.parseLong(strArrSplit2[i21]);
                            }
                            this.f103535f[i12].put(str4, d.j(jArr, this.f103537h));
                            break;
                        case 5:
                            i11 = i16;
                            i13 = i15;
                            String[] strArrSplit3 = strReplaceAll.split(",", -1);
                            h[] hVarArr = new h[strArrSplit3.length];
                            int i22 = i11;
                            while (i22 < strArrSplit3.length) {
                                String[] strArrSplit4 = strArrSplit3[i22].split(to.c.userBaseDel, -1);
                                hVarArr[i22] = new h((long) Double.parseDouble(strArrSplit4[i11]), (long) Double.parseDouble(strArrSplit4[i13]));
                                i22++;
                                str5 = str5;
                                i17 = i17;
                            }
                            i12 = i17;
                            str3 = str5;
                            this.f103535f[i12].put(str4, d.l(hVarArr, this.f103537h));
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f103494w) {
                                Log.d(str5, "Data format isn't one of expected formats: " + i10);
                            }
                            break;
                        case 9:
                            i11 = i16;
                            i13 = i15;
                            String[] strArrSplit5 = strReplaceAll.split(",", -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i23 = i11; i23 < strArrSplit5.length; i23++) {
                                iArr2[i23] = Integer.parseInt(strArrSplit5[i23]);
                            }
                            this.f103535f[i17].put(str4, d.e(iArr2, this.f103537h));
                            i12 = i17;
                            str3 = str5;
                            break;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(",", -1);
                            h[] hVarArr2 = new h[strArrSplit6.length];
                            int i24 = i16;
                            while (i24 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i24].split(to.c.userBaseDel, -1);
                                hVarArr2[i24] = new h((long) Double.parseDouble(strArrSplit7[i16]), (long) Double.parseDouble(strArrSplit7[i15]));
                                i24++;
                                i16 = i16;
                                i15 = i15;
                                strArrSplit6 = strArrSplit6;
                            }
                            i11 = i16;
                            i13 = i15;
                            this.f103535f[i17].put(str4, d.g(hVarArr2, this.f103537h));
                            i12 = i17;
                            str3 = str5;
                            break;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(",", -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i25 = i16; i25 < strArrSplit8.length; i25++) {
                                dArr[i25] = Double.parseDouble(strArrSplit8[i25]);
                            }
                            this.f103535f[i17].put(str4, d.c(dArr, this.f103537h));
                            break;
                    }
                } else {
                    this.f103535f[i17].remove(str4);
                }
                i11 = i16;
                i12 = i17;
                str3 = str5;
                i13 = i15;
            } else {
                i11 = i16;
                i12 = i17;
                str3 = str5;
                i13 = i15;
            }
            i17 = i12 + 1;
            i16 = i11;
            str5 = str3;
            i15 = i13;
            i14 = 2;
        }
    }

    public final int w(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (S(bArr)) {
            return 4;
        }
        if (V(bArr)) {
            return 9;
        }
        if (R(bArr)) {
            return 12;
        }
        if (T(bArr)) {
            return 7;
        }
        if (W(bArr)) {
            return 10;
        }
        if (U(bArr)) {
            return 13;
        }
        return d0(bArr) ? 14 : 0;
    }

    @y0({y0.a.LIBRARY})
    public void w0(@NonNull Long l10) {
        if (l10 == null) {
            throw new NullPointerException("Timestamp should not be null.");
        }
        if (l10.longValue() < 0) {
            throw new IllegalArgumentException("Timestamp should a positive value.");
        }
        String string = Long.toString(l10.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = "0" + string;
        }
        v0(U, f103419m6.format(new Date(l10.longValue())));
        v0(f103453r0, string);
    }

    public final void x(i iVar) throws Throwable {
        int i10;
        int i11;
        A(iVar);
        d dVar = this.f103535f[1].get(f103389j0);
        if (dVar != null) {
            i iVar2 = new i(dVar.f103566d);
            iVar2.i(this.f103537h);
            byte[] bArr = L5;
            byte[] bArr2 = new byte[bArr.length];
            iVar2.readFully(bArr2);
            iVar2.l(0L);
            byte[] bArr3 = M5;
            byte[] bArr4 = new byte[bArr3.length];
            iVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                iVar2.l(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                iVar2.l(12L);
            }
            k0(iVar2, 6);
            d dVar2 = this.f103535f[7].get(f103399k2);
            d dVar3 = this.f103535f[7].get(f103407l2);
            if (dVar2 != null && dVar3 != null) {
                this.f103535f[5].put(N, dVar2);
                this.f103535f[5].put(O, dVar3);
            }
            d dVar4 = this.f103535f[8].get(f103415m2);
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.r(this.f103537h);
                if (iArr == null || iArr.length != 4) {
                    Log.w(f103485v, "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarM = d.m(i14, this.f103537h);
                d dVarM2 = d.m(i15, this.f103537h);
                this.f103535f[0].put(f103503x, dVarM);
                this.f103535f[0].put(f103512y, dVarM2);
            }
        }
    }

    public void x0(Location location) {
        if (location == null) {
            return;
        }
        v0(Y1, location.getProvider());
        y0(location.getLatitude(), location.getLongitude());
        u0(location.getAltitude());
        v0(J1, "K");
        v0(K1, new h((location.getSpeed() * TimeUnit.HOURS.toSeconds(1L)) / 1000.0f).toString());
        String[] strArrSplit = f103419m6.format(new Date(location.getTime())).split("\\s+", -1);
        v0(f103319a2, strArrSplit[0]);
        v0(E1, strArrSplit[1]);
    }

    public final void y(b bVar) throws Throwable {
        if (f103494w) {
            Log.d(f103485v, "getPngAttributes starting with: " + bVar);
        }
        bVar.i(ByteOrder.BIG_ENDIAN);
        byte[] bArr = S5;
        bVar.k(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, U5)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, V5)) {
                    return;
                }
                if (Arrays.equals(bArr2, T5)) {
                    byte[] bArr3 = new byte[i10];
                    if (bVar.read(bArr3) != i10) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + l3.b.a(bArr2));
                    }
                    int i12 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f103545p = i11;
                        j0(bArr3, 0);
                        D0();
                        z0(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                bVar.k(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public void y0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        }
        if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        }
        v0(f103514y1, d10 >= 0.0d ? "N" : R4);
        v0(f103523z1, b(Math.abs(d10)));
        v0(A1, d11 >= 0.0d ? S4 : T4);
        v0(B1, b(Math.abs(d11)));
    }

    public final void z(b bVar) throws Throwable {
        boolean z10 = f103494w;
        if (z10) {
            Log.d(f103485v, "getRafAttributes starting with: " + bVar);
        }
        bVar.k(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.k(i10 - bVar.d());
        bVar.read(bArr4);
        t(new b(bArr4), i10, 5);
        bVar.k(i12 - bVar.d());
        bVar.i(ByteOrder.BIG_ENDIAN);
        int i13 = bVar.readInt();
        if (z10) {
            Log.d(f103485v, "numberOfDirectoryEntry: " + i13);
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == O6.f103567a) {
                short s10 = bVar.readShort();
                short s11 = bVar.readShort();
                d dVarM = d.m(s10, this.f103537h);
                d dVarM2 = d.m(s11, this.f103537h);
                this.f103535f[0].put(f103512y, dVarM);
                this.f103535f[0].put(f103503x, dVarM2);
                if (f103494w) {
                    Log.d(f103485v, "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            bVar.k(unsignedShort2);
        }
    }

    public final void z0(b bVar) throws Throwable {
        HashMap<String, d> map = this.f103535f[4];
        d dVar = map.get(A);
        if (dVar == null) {
            this.f103544o = 6;
            K(bVar, map);
            return;
        }
        int iP = dVar.p(this.f103537h);
        this.f103544o = iP;
        if (iP != 1) {
            if (iP == 6) {
                K(bVar, map);
                return;
            } else if (iP != 7) {
                return;
            }
        }
        if (Y(map)) {
            L(bVar, map);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends b {
        public i(byte[] bArr) throws IOException {
            super(bArr);
            this.f103556b.mark(Integer.MAX_VALUE);
        }

        public void l(long j10) throws IOException {
            int i10 = this.f103558d;
            if (i10 > j10) {
                this.f103558d = 0;
                this.f103556b.reset();
            } else {
                j10 -= (long) i10;
            }
            k((int) j10);
        }

        public i(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f103556b.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f103567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f103568b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f103569c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f103570d;

        public f(String str, int i10, int i11) {
            this.f103568b = str;
            this.f103567a = i10;
            this.f103569c = i11;
            this.f103570d = -1;
        }

        public boolean a(int i10) {
            int i11;
            int i12 = this.f103569c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f103570d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        public f(String str, int i10, int i11, int i12) {
            this.f103568b = str;
            this.f103567a = i10;
            this.f103569c = i11;
            this.f103570d = i12;
        }
    }

    public a(@NonNull String str) throws Throwable {
        f[][] fVarArr = f103348d7;
        this.f103535f = new HashMap[fVarArr.length];
        this.f103536g = new HashSet(fVarArr.length);
        this.f103537h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            O(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    public a(@NonNull FileDescriptor fileDescriptor) throws Throwable {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        f[][] fVarArr = f103348d7;
        this.f103535f = new HashMap[fVarArr.length];
        this.f103536g = new HashSet(fVarArr.length);
        this.f103537h = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f103532c = null;
            this.f103530a = null;
            if (X(fileDescriptor)) {
                this.f103531b = fileDescriptor;
                try {
                    fileDescriptor = l3.b.a.b(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f103531b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    e0(fileInputStream);
                    l3.b.c(fileInputStream);
                    if (z10) {
                        l3.b.b(fileDescriptor);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    l3.b.c(fileInputStream);
                    if (z10) {
                        l3.b.b(fileDescriptor);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* JADX INFO: renamed from: l3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class C0981a extends MediaDataSource {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f103551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f103552c;

        public C0981a(i iVar) {
            this.f103552c = iVar;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f103551b;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f103552c.available())) {
                        return -1;
                    }
                    this.f103552c.l(j10);
                    this.f103551b = j10;
                }
                if (i11 > this.f103552c.available()) {
                    i11 = this.f103552c.available();
                }
                int i12 = this.f103552c.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f103551b += (long) i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f103551b = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    public a(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public a(@NonNull InputStream inputStream, int i10) throws IOException {
        f[][] fVarArr = f103348d7;
        this.f103535f = new HashMap[fVarArr.length];
        this.f103536g = new HashSet(fVarArr.length);
        this.f103537h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f103530a = null;
            if (i10 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f103404k7.length);
                if (!P(bufferedInputStream)) {
                    Log.w(f103485v, "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f103534e = true;
                this.f103532c = null;
                this.f103531b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f103532c = (AssetManager.AssetInputStream) inputStream;
                this.f103531b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (X(fileInputStream.getFD())) {
                    this.f103532c = null;
                    this.f103531b = fileInputStream.getFD();
                } else {
                    this.f103532c = null;
                    this.f103531b = null;
                }
            } else {
                this.f103532c = null;
                this.f103531b = null;
            }
            e0(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
