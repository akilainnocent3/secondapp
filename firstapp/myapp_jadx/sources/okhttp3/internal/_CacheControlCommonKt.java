package okhttp3.internal;

import com.google.protobuf.Reader;
import com.twilio.voice.EventKeys;
import defpackage.rgf;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import kotlin.time.c;
import okhttp3.CacheControl;
import okhttp3.Headers;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\u000b\u001a\u00020\u0000*\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\n\u001a\u0013\u0010\r\u001a\u00020\u0000*\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u000f\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0011\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0011\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0012\u0010\u0010\u001a\u0013\u0010\u0013\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0013\u0010\u0014\u001a\u00020\f*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0010\u001a\u001b\u0010\u0017\u001a\u00020\u0000*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lokhttp3/CacheControl;", "", "commonToString", "(Lokhttp3/CacheControl;)Ljava/lang/String;", "", "", "commonClampToInt", "(J)I", "Lokhttp3/CacheControl$Companion;", "commonForceNetwork", "(Lokhttp3/CacheControl$Companion;)Lokhttp3/CacheControl;", "commonForceCache", "Lokhttp3/CacheControl$Builder;", "commonBuild", "(Lokhttp3/CacheControl$Builder;)Lokhttp3/CacheControl;", "commonNoCache", "(Lokhttp3/CacheControl$Builder;)Lokhttp3/CacheControl$Builder;", "commonNoStore", "commonOnlyIfCached", "commonNoTransform", "commonImmutable", "Lokhttp3/Headers;", "headers", "commonParse", "(Lokhttp3/CacheControl$Companion;Lokhttp3/Headers;)Lokhttp3/CacheControl;", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class _CacheControlCommonKt {
    public static final CacheControl commonBuild(CacheControl.Builder builder) {
        builder.getClass();
        return new CacheControl(builder.getNoCache(), builder.getNoStore(), builder.getMaxAgeSeconds(), -1, false, false, false, builder.getMaxStaleSeconds(), builder.getMinFreshSeconds(), builder.getOnlyIfCached(), builder.getNoTransform(), builder.getImmutable(), null);
    }

    public static final int commonClampToInt(long j) {
        return j > 2147483647L ? Reader.READ_DONE : (int) j;
    }

    public static final CacheControl commonForceCache(CacheControl.Companion companion) {
        companion.getClass();
        CacheControl.Builder builderOnlyIfCached = new CacheControl.Builder().onlyIfCached();
        kotlin.time.b.a aVar = kotlin.time.b.b;
        return builderOnlyIfCached.m128maxStaleLRDsOJo(c.h(Reader.READ_DONE, rgf.SECONDS)).build();
    }

    public static final CacheControl commonForceNetwork(CacheControl.Companion companion) {
        companion.getClass();
        return new CacheControl.Builder().noCache().build();
    }

    public static final CacheControl.Builder commonImmutable(CacheControl.Builder builder) {
        builder.getClass();
        builder.setImmutable$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoCache(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoCache$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoStore(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoStore$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonNoTransform(CacheControl.Builder builder) {
        builder.getClass();
        builder.setNoTransform$okhttp(true);
        return builder;
    }

    public static final CacheControl.Builder commonOnlyIfCached(CacheControl.Builder builder) {
        builder.getClass();
        builder.setOnlyIfCached$okhttp(true);
        return builder;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x006e A[EDGE_INSN: B:100:0x006e->B:22:0x006e BREAK  A[LOOP:2: B:16:0x0050->B:20:0x0061], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0049  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0061 A[LOOP:2: B:16:0x0050->B:20:0x0061, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:50:0x0103  */
    /* JADX WARN: Code duplicated, block: B:52:0x010b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0131  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:63:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x0147  */
    /* JADX WARN: Code duplicated, block: B:66:0x014d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:69:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0165  */
    /* JADX WARN: Code duplicated, block: B:72:0x016b  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x017c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0184  */
    /* JADX WARN: Code duplicated, block: B:78:0x018c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0194  */
    /* JADX WARN: Code duplicated, block: B:99:0x0068 A[SYNTHETIC] */
    public static final CacheControl commonParse(CacheControl.Companion companion, Headers headers) {
        int i;
        int length;
        boolean z;
        int length2;
        int i2;
        String string;
        String string2;
        Headers headers2 = headers;
        companion.getClass();
        headers2.getClass();
        int size = headers2.size();
        boolean z2 = true;
        boolean z3 = true;
        int i3 = 0;
        String str = null;
        boolean z4 = false;
        boolean z5 = false;
        int nonNegativeInt = -1;
        int nonNegativeInt2 = -1;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        int nonNegativeInt3 = -1;
        int nonNegativeInt4 = -1;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (i3 < size) {
            String strName = headers2.name(i3);
            String strValue = headers2.value(i3);
            if (kotlin.text.c.l(strName, "Cache-Control", z2)) {
                if (str == null) {
                    str = strValue;
                }
                i = 0;
                while (i < strValue.length()) {
                    length = strValue.length();
                    z = z2;
                    length2 = i;
                    while (true) {
                        if (length2 < length) {
                            i2 = size;
                            length2 = strValue.length();
                            break;
                        }
                        i2 = size;
                        if (StringsKt.N("=,;", strValue.charAt(length2))) {
                            break;
                        }
                        length2++;
                        size = i2;
                    }
                    string = StringsKt.t0(strValue.substring(i, length2)).toString();
                    if (length2 != strValue.length() || strValue.charAt(length2) == ',' || strValue.charAt(length2) == ';') {
                        i = length2 + 1;
                        string2 = null;
                    } else {
                        int iIndexOfNonWhitespace = _UtilCommonKt.indexOfNonWhitespace(strValue, length2 + 1);
                        if (iIndexOfNonWhitespace >= strValue.length() || strValue.charAt(iIndexOfNonWhitespace) != '\"') {
                            int length3 = strValue.length();
                            int length4 = iIndexOfNonWhitespace;
                            while (true) {
                                if (length4 >= length3) {
                                    length4 = strValue.length();
                                    break;
                                }
                                int i4 = length3;
                                if (StringsKt.N(",;", strValue.charAt(length4))) {
                                    break;
                                }
                                length4++;
                                length3 = i4;
                            }
                            string2 = StringsKt.t0(strValue.substring(iIndexOfNonWhitespace, length4)).toString();
                            i = length4;
                        } else {
                            int i5 = iIndexOfNonWhitespace + 1;
                            int iS = StringsKt.S(strValue, '\"', i5, 4);
                            string2 = strValue.substring(i5, iS);
                            i = iS + 1;
                        }
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z2 = z;
                        z4 = z2;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z2 = z;
                        z5 = z2;
                    } else {
                        if ("max-age".equalsIgnoreCase(string)) {
                            nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if (EventKeys.PRIVATE.equalsIgnoreCase(string)) {
                            z2 = z;
                            z6 = z2;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z2 = z;
                            z7 = z2;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z2 = z;
                            z8 = z2;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Reader.READ_DONE);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z2 = z;
                            z9 = z2;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z2 = z;
                            z10 = z2;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z2 = z;
                            z11 = z2;
                        }
                        z2 = z;
                    }
                    size = i2;
                }
                i3++;
                headers2 = headers;
                z2 = z2;
                size = size;
            } else {
                if (kotlin.text.c.l(strName, "Pragma", z2)) {
                }
                i3++;
                headers2 = headers;
                z2 = z2;
                size = size;
            }
            z3 = false;
            i = 0;
            while (i < strValue.length()) {
                length = strValue.length();
                z = z2;
                length2 = i;
                while (true) {
                    if (length2 < length) {
                        i2 = size;
                        length2 = strValue.length();
                        break;
                    }
                    i2 = size;
                    if (StringsKt.N("=,;", strValue.charAt(length2))) {
                        break;
                        break;
                    }
                    length2++;
                    size = i2;
                }
                string = StringsKt.t0(strValue.substring(i, length2)).toString();
                if (length2 != strValue.length()) {
                    i = length2 + 1;
                    string2 = null;
                } else {
                    i = length2 + 1;
                    string2 = null;
                }
                if ("no-cache".equalsIgnoreCase(string)) {
                    z2 = z;
                    z4 = z2;
                } else if ("no-store".equalsIgnoreCase(string)) {
                    z2 = z;
                    z5 = z2;
                } else {
                    if ("max-age".equalsIgnoreCase(string)) {
                        nonNegativeInt = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        nonNegativeInt2 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if (EventKeys.PRIVATE.equalsIgnoreCase(string)) {
                        z2 = z;
                        z6 = z2;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z2 = z;
                        z7 = z2;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z2 = z;
                        z8 = z2;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        nonNegativeInt3 = _UtilCommonKt.toNonNegativeInt(string2, Reader.READ_DONE);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        nonNegativeInt4 = _UtilCommonKt.toNonNegativeInt(string2, -1);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z2 = z;
                        z9 = z2;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z2 = z;
                        z10 = z2;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z2 = z;
                        z11 = z2;
                    }
                    z2 = z;
                }
                size = i2;
            }
            i3++;
            headers2 = headers;
            z2 = z2;
            size = size;
        }
        return new CacheControl(z4, z5, nonNegativeInt, nonNegativeInt2, z6, z7, z8, nonNegativeInt3, nonNegativeInt4, z9, z10, z11, !z3 ? null : str);
    }

    public static final String commonToString(CacheControl cacheControl) {
        cacheControl.getClass();
        String headerValue = cacheControl.getHeaderValue();
        if (headerValue != null) {
            return headerValue;
        }
        StringBuilder sb = new StringBuilder();
        if (cacheControl.noCache()) {
            sb.append("no-cache, ");
        }
        if (cacheControl.noStore()) {
            sb.append("no-store, ");
        }
        if (cacheControl.maxAgeSeconds() != -1) {
            sb.append("max-age=");
            sb.append(cacheControl.maxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.sMaxAgeSeconds() != -1) {
            sb.append("s-maxage=");
            sb.append(cacheControl.sMaxAgeSeconds());
            sb.append(", ");
        }
        if (cacheControl.getIsPrivate()) {
            sb.append("private, ");
        }
        if (cacheControl.getIsPublic()) {
            sb.append("public, ");
        }
        if (cacheControl.mustRevalidate()) {
            sb.append("must-revalidate, ");
        }
        if (cacheControl.maxStaleSeconds() != -1) {
            sb.append("max-stale=");
            sb.append(cacheControl.maxStaleSeconds());
            sb.append(", ");
        }
        if (cacheControl.minFreshSeconds() != -1) {
            sb.append("min-fresh=");
            sb.append(cacheControl.minFreshSeconds());
            sb.append(", ");
        }
        if (cacheControl.onlyIfCached()) {
            sb.append("only-if-cached, ");
        }
        if (cacheControl.noTransform()) {
            sb.append("no-transform, ");
        }
        if (cacheControl.immutable()) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length()).getClass();
        String string = sb.toString();
        cacheControl.setHeaderValue$okhttp(string);
        return string;
    }
}
