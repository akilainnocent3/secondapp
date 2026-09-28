package okhttp3;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.bmy;
import defpackage.f87;
import defpackage.fae;
import defpackage.gmf0;
import defpackage.gvf;
import defpackage.hb5;
import defpackage.m2g;
import defpackage.mtg0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal._HostnamesCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.http.DateFormattingKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 92\u00020\u0001:\u0002:9J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0013\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010 \u001a\u00020\rH\u0007¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010\"\u001a\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010$\u001a\u00020\u0004H\u0007¢\u0006\u0004\b#\u0010\u0015J\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0004H\u0000¢\u0006\u0004\b&\u0010'J\r\u0010)\u001a\u00020(¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0011\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b\u0013\u0010\u000fR\u0017\u0010\u001a\u001a\u00020\u00178\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u001e\u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b\u001e\u0010\u000fR\u0017\u0010 \u001a\u00020\r8\u0007¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b \u0010\u000fR\u0017\u0010$\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b$\u0010\u0015R\u0017\u0010\"\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b4\u00103\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b\u001c\u0010\u0015R\u0019\u00108\u001a\u0004\u0018\u00010\r8\u0007¢\u0006\f\n\u0004\b7\u0010,\u001a\u0004\b8\u0010\u000f¨\u0006;"}, d2 = {"Lokhttp3/Cookie;", "", "Lokhttp3/HttpUrl;", "url", "", "matches", "(Lokhttp3/HttpUrl;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "-deprecated_name", "name", "-deprecated_value", "value", "-deprecated_persistent", "()Z", "persistent", "", "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", "domain", "-deprecated_path", AnalyticsParam.EVENT_PATH, "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "Lokhttp3/Cookie$Builder;", "newBuilder", "()Lokhttp3/Cookie$Builder;", "a", "Ljava/lang/String;", "b", "c", "J", "d", "e", "f", "Z", "g", "h", "i", "j", "sameSite", "Companion", "Builder", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Cookie {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Pattern k = Pattern.compile("(\\d{2,4})[^\\d]*");
    public static final Pattern l = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    public static final Pattern m = Pattern.compile("(\\d{1,2})[^\\d]*");
    public static final Pattern n = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String value;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long expiresAt;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String domain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final String path;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final boolean secure;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean httpOnly;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public final boolean persistent;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final boolean hostOnly;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final String sameSite;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0019\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0015*\u0004\u0018\u00010\u00140\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/Cookie$Companion;", "", "<init>", "()V", "Lokhttp3/HttpUrl;", "url", "", "setCookie", "Lokhttp3/Cookie;", "parse", "(Lokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "", "currentTimeMillis", "parse$okhttp", "(JLokhttp3/HttpUrl;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/Headers;", "headers", "", "parseAll", "(Lokhttp3/HttpUrl;Lokhttp3/Headers;)Ljava/util/List;", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "YEAR_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "DAY_OF_MONTH_PATTERN", "TIME_PATTERN", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static int a(int i, int i2, String str, boolean z) {
            while (i < i2) {
                char cCharAt = str.charAt(i);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && cCharAt < ':') || (('a' <= cCharAt && cCharAt < '{') || (('A' <= cCharAt && cCharAt < '[') || cCharAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        public static final /* synthetic */ boolean access$domainMatch(Companion companion, String str, String str2) {
            companion.getClass();
            return b(str, str2);
        }

        public static final boolean access$pathMatch(Companion companion, HttpUrl httpUrl, String str) {
            companion.getClass();
            String strEncodedPath = httpUrl.encodedPath();
            if (Intrinsics.g(strEncodedPath, str)) {
                return true;
            }
            return c.u(strEncodedPath, str, false) && (c.k(str, "/", false) || strEncodedPath.charAt(str.length()) == '/');
        }

        public static boolean b(String str, String str2) {
            return Intrinsics.g(str, str2) || (c.k(str, str2, false) && str.charAt((str.length() - str2.length()) - 1) == '.' && !_HostnamesCommonKt.canParseAsIpAddress(str));
        }

        public static long c(int i, String str) {
            int iA = a(0, i, str, false);
            Matcher matcher = Cookie.n.matcher(str);
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int iT = -1;
            int i5 = -1;
            int i6 = -1;
            while (iA < i) {
                int iA2 = a(iA + 1, i, str, true);
                matcher.region(iA, iA2);
                if (i3 == -1 && matcher.usePattern(Cookie.n).matches()) {
                    String strGroup = matcher.group(1);
                    strGroup.getClass();
                    i3 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    strGroup2.getClass();
                    i5 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    strGroup3.getClass();
                    i6 = Integer.parseInt(strGroup3);
                } else if (i4 == -1 && matcher.usePattern(Cookie.m).matches()) {
                    String strGroup4 = matcher.group(1);
                    strGroup4.getClass();
                    i4 = Integer.parseInt(strGroup4);
                } else if (iT == -1 && matcher.usePattern(Cookie.l).matches()) {
                    String strGroup5 = matcher.group(1);
                    strGroup5.getClass();
                    Locale locale = Locale.US;
                    String strA = gvf.a(locale, strGroup5, locale);
                    String strPattern = Cookie.l.pattern();
                    strPattern.getClass();
                    iT = StringsKt.T(strPattern, strA, 0, false, 6) / 4;
                } else if (i2 == -1 && matcher.usePattern(Cookie.k).matches()) {
                    String strGroup6 = matcher.group(1);
                    strGroup6.getClass();
                    i2 = Integer.parseInt(strGroup6);
                }
                iA = a(iA2 + 1, i, str, false);
            }
            if (70 <= i2 && i2 < 100) {
                i2 += 1900;
            }
            if (i2 >= 0 && i2 < 70) {
                i2 += 2000;
            }
            if (i2 < 1601) {
                hb5.a("Failed requirement.");
                return 0L;
            }
            if (iT == -1) {
                hb5.a("Failed requirement.");
                return 0L;
            }
            if (1 > i4 || i4 >= 32) {
                hb5.a("Failed requirement.");
                return 0L;
            }
            if (i3 < 0 || i3 >= 24) {
                hb5.a("Failed requirement.");
                return 0L;
            }
            if (i5 < 0 || i5 >= 60) {
                hb5.a("Failed requirement.");
                return 0L;
            }
            if (i6 < 0 || i6 >= 60) {
                hb5.a("Failed requirement.");
                return 0L;
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(_UtilJvmKt.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i2);
            gregorianCalendar.set(2, iT - 1);
            gregorianCalendar.set(5, i4);
            gregorianCalendar.set(11, i3);
            gregorianCalendar.set(12, i5);
            gregorianCalendar.set(13, i6);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        public final Cookie parse(HttpUrl url, String setCookie) {
            url.getClass();
            setCookie.getClass();
            return parse$okhttp(System.currentTimeMillis(), url, setCookie);
        }

        public final Cookie parse$okhttp(long currentTimeMillis, HttpUrl url, String setCookie) {
            long j;
            String str;
            url.getClass();
            setCookie.getClass();
            int iDelimiterOffset$default = _UtilCommonKt.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = _UtilCommonKt.delimiterOffset$default(setCookie, '=', 0, iDelimiterOffset$default, 2, (Object) null);
            String strSubstring = null;
            if (iDelimiterOffset$default2 != iDelimiterOffset$default) {
                String strTrimSubstring$default = _UtilCommonKt.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
                if (strTrimSubstring$default.length() != 0 && _UtilCommonKt.indexOfControlOrNonAscii(strTrimSubstring$default) == -1) {
                    String strTrimSubstring = _UtilCommonKt.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
                    if (_UtilCommonKt.indexOfControlOrNonAscii(strTrimSubstring) == -1) {
                        int i = iDelimiterOffset$default + 1;
                        int length = setCookie.length();
                        String str2 = null;
                        String str3 = null;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        boolean z4 = true;
                        long j2 = -1;
                        long jC = DateFormattingKt.MAX_DATE;
                        while (true) {
                            if (i >= length) {
                                if (j2 == Long.MIN_VALUE) {
                                    j = Long.MIN_VALUE;
                                } else if (j2 != -1) {
                                    long j3 = currentTimeMillis + (j2 <= 9223372036854775L ? j2 * 1000 : Long.MAX_VALUE);
                                    j = (j3 < currentTimeMillis || j3 > DateFormattingKt.MAX_DATE) ? 253402300799999L : j3;
                                } else {
                                    j = jC;
                                }
                                String strHost = url.host();
                                if (str2 == null) {
                                    str = strHost;
                                } else {
                                    if (!b(strHost, str2)) {
                                        return null;
                                    }
                                    str = str2;
                                }
                                if (strHost.length() != str.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
                                    return null;
                                }
                                if (strSubstring == null || !c.u(strSubstring, "/", false)) {
                                    String strEncodedPath = url.encodedPath();
                                    int iW = StringsKt.W(strEncodedPath, '/', 0, 6);
                                    strSubstring = iW != 0 ? strEncodedPath.substring(0, iW) : "/";
                                }
                                return new Cookie(strTrimSubstring$default, strTrimSubstring, j, str, strSubstring, z3, z, z2, z4, str3, null);
                            }
                            int iDelimiterOffset = _UtilCommonKt.delimiterOffset(setCookie, ';', i, length);
                            int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(setCookie, '=', i, iDelimiterOffset);
                            String strTrimSubstring2 = _UtilCommonKt.trimSubstring(setCookie, i, iDelimiterOffset2);
                            String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? _UtilCommonKt.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                            if (c.l(strTrimSubstring2, "expires", true)) {
                                try {
                                    jC = c(strTrimSubstring3.length(), strTrimSubstring3);
                                    z2 = true;
                                } catch (NumberFormatException | IllegalArgumentException unused) {
                                }
                            } else if (c.l(strTrimSubstring2, "max-age", true)) {
                                try {
                                    j2 = Long.parseLong(strTrimSubstring3);
                                    if (j2 <= 0) {
                                        j2 = Long.MIN_VALUE;
                                    }
                                } catch (NumberFormatException e) {
                                    try {
                                        if (!new Regex("-?\\d+").f(strTrimSubstring3)) {
                                            throw e;
                                        }
                                        j2 = c.u(strTrimSubstring3, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                                    } catch (NumberFormatException | IllegalArgumentException unused2) {
                                        continue;
                                    }
                                }
                                z2 = true;
                            } else if (c.l(strTrimSubstring2, "domain", true)) {
                                if (c.k(strTrimSubstring3, ".", false)) {
                                    throw new IllegalArgumentException("Failed requirement.");
                                }
                                String canonicalHost = _HostnamesCommonKt.toCanonicalHost(StringsKt.a0(strTrimSubstring3, "."));
                                if (canonicalHost == null) {
                                    throw new IllegalArgumentException();
                                }
                                str2 = canonicalHost;
                                z4 = false;
                            } else if (c.l(strTrimSubstring2, AnalyticsParam.EVENT_PATH, true)) {
                                strSubstring = strTrimSubstring3;
                            } else if (c.l(strTrimSubstring2, "secure", true)) {
                                z3 = true;
                            } else if (c.l(strTrimSubstring2, "httponly", true)) {
                                z = true;
                            } else if (c.l(strTrimSubstring2, "samesite", true)) {
                                str3 = strTrimSubstring3;
                            }
                            i = iDelimiterOffset + 1;
                        }
                    }
                }
            }
            return null;
        }

        public final List<Cookie> parseAll(HttpUrl url, Headers headers) {
            url.getClass();
            headers.getClass();
            List<String> listValues = headers.values("Set-Cookie");
            int size = listValues.size();
            List<Cookie> listUnmodifiableList = null;
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                Cookie cookie = parse(url, listValues.get(i));
                if (cookie != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookie);
                }
            }
            if (arrayList != null) {
                listUnmodifiableList = Collections.unmodifiableList(arrayList);
                listUnmodifiableList.getClass();
            }
            return listUnmodifiableList == null ? m2g.a : listUnmodifiableList;
        }

        private Companion() {
        }
    }

    public Cookie(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5, DefaultConstructorMarker defaultConstructorMarker) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j;
        this.domain = str3;
        this.path = str4;
        this.secure = z;
        this.httpOnly = z2;
        this.persistent = z3;
        this.hostOnly = z4;
        this.sameSite = str5;
    }

    public static final Cookie parse(HttpUrl httpUrl, String str) {
        return INSTANCE.parse(httpUrl, str);
    }

    public static final List<Cookie> parseAll(HttpUrl httpUrl, Headers headers) {
        return INSTANCE.parseAll(httpUrl, headers);
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @fae
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    public final String domain() {
        return this.domain;
    }

    public boolean equals(Object other) {
        if (!(other instanceof Cookie)) {
            return false;
        }
        Cookie cookie = (Cookie) other;
        return Intrinsics.g(cookie.name, this.name) && Intrinsics.g(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && Intrinsics.g(cookie.domain, this.domain) && Intrinsics.g(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly && Intrinsics.g(cookie.sameSite, this.sameSite);
    }

    public final long expiresAt() {
        return this.expiresAt;
    }

    public int hashCode() {
        int iA = mtg0.a(mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a(f87.a(gmf0.a(gmf0.a(527, 31, this.name), 31, this.value), this.expiresAt, 31), 31, this.domain), 31, this.path), 31, this.secure), 31, this.httpOnly), 31, this.persistent), 31, this.hostOnly);
        String str = this.sameSite;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final boolean hostOnly() {
        return this.hostOnly;
    }

    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(HttpUrl url) {
        url.getClass();
        boolean z = this.hostOnly;
        String str = this.domain;
        if ((z ? Intrinsics.g(url.host(), str) : Companion.access$domainMatch(INSTANCE, url.host(), str)) && Companion.access$pathMatch(INSTANCE, url, this.path)) {
            return !this.secure || url.isHttps();
        }
        return false;
    }

    public final String name() {
        return this.name;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final String path() {
        return this.path;
    }

    public final boolean persistent() {
        return this.persistent;
    }

    /* JADX INFO: renamed from: sameSite, reason: from getter */
    public final String getSameSite() {
        return this.sameSite;
    }

    public final boolean secure() {
        return this.secure;
    }

    public String toString() {
        return toString$okhttp(false);
    }

    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name);
        sb.append('=');
        sb.append(this.value);
        if (this.persistent) {
            long j = this.expiresAt;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(DateFormattingKt.toHttpDateString(new Date(j)));
            }
        }
        if (!this.hostOnly) {
            sb.append("; domain=");
            if (forObsoleteRfc2965) {
                sb.append(".");
            }
            sb.append(this.domain);
        }
        sb.append("; path=");
        sb.append(this.path);
        if (this.secure) {
            sb.append("; secure");
        }
        if (this.httpOnly) {
            sb.append("; httponly");
        }
        String str = this.sameSite;
        if (str != null) {
            sb.append("; samesite=");
            sb.append(str);
        }
        return sb.toString();
    }

    public final String value() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\tJ\u0015\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\tJ\r\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\tJ\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/Cookie$Builder;", "", "<init>", "()V", "Lokhttp3/Cookie;", "cookie", "(Lokhttp3/Cookie;)V", "", "name", "(Ljava/lang/String;)Lokhttp3/Cookie$Builder;", "value", "", "expiresAt", "(J)Lokhttp3/Cookie$Builder;", "domain", "hostOnlyDomain", AnalyticsParam.EVENT_PATH, "secure", "()Lokhttp3/Cookie$Builder;", "httpOnly", "sameSite", "build", "()Lokhttp3/Cookie;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Builder {
        public String a;
        public String b;
        public long c;
        public String d;
        public String e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public String j;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(Cookie cookie) {
            this();
            cookie.getClass();
            this.a = cookie.name();
            this.b = cookie.value();
            this.c = cookie.expiresAt();
            this.d = cookie.domain();
            this.e = cookie.path();
            this.f = cookie.secure();
            this.g = cookie.httpOnly();
            this.h = cookie.persistent();
            this.i = cookie.hostOnly();
            this.j = cookie.getSameSite();
        }

        public final Cookie build() {
            String str = this.a;
            if (str == null) {
                bmy.a("builder.name == null");
                return null;
            }
            String str2 = this.b;
            if (str2 == null) {
                bmy.a("builder.value == null");
                return null;
            }
            long j = this.c;
            String str3 = this.d;
            if (str3 != null) {
                return new Cookie(str, str2, j, str3, this.e, this.f, this.g, this.h, this.i, this.j, null);
            }
            bmy.a("builder.domain == null");
            return null;
        }

        public final Builder domain(String domain) {
            domain.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(domain);
            if (canonicalHost == null) {
                hb5.a("unexpected domain: ".concat(domain));
                return null;
            }
            this.d = canonicalHost;
            this.i = false;
            return this;
        }

        public final Builder expiresAt(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DateFormattingKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.c = expiresAt;
            this.h = true;
            return this;
        }

        public final Builder hostOnlyDomain(String domain) {
            domain.getClass();
            String canonicalHost = _HostnamesCommonKt.toCanonicalHost(domain);
            if (canonicalHost == null) {
                hb5.a("unexpected domain: ".concat(domain));
                return null;
            }
            this.d = canonicalHost;
            this.i = true;
            return this;
        }

        public final Builder httpOnly() {
            this.g = true;
            return this;
        }

        public final Builder name(String name) {
            name.getClass();
            if (Intrinsics.g(StringsKt.t0(name).toString(), name)) {
                this.a = name;
                return this;
            }
            hb5.a("name is not trimmed");
            return null;
        }

        public final Builder path(String path) {
            path.getClass();
            if (c.u(path, "/", false)) {
                this.e = path;
                return this;
            }
            hb5.a("path must start with '/'");
            return null;
        }

        public final Builder sameSite(String sameSite) {
            sameSite.getClass();
            if (Intrinsics.g(StringsKt.t0(sameSite).toString(), sameSite)) {
                this.j = sameSite;
                return this;
            }
            hb5.a("sameSite is not trimmed");
            return null;
        }

        public final Builder secure() {
            this.f = true;
            return this;
        }

        public final Builder value(String value) {
            value.getClass();
            if (Intrinsics.g(StringsKt.t0(value).toString(), value)) {
                this.b = value;
                return this;
            }
            hb5.a("value is not trimmed");
            return null;
        }

        public Builder() {
            this.c = DateFormattingKt.MAX_DATE;
            this.e = "/";
        }
    }
}
