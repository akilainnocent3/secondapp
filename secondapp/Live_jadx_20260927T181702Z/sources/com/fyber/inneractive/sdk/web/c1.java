package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import io.appmetrica.analytics.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class c1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f47930g = Pattern.compile("max-age=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f47931h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f47932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f47933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f47934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f47935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f47936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f47937f;

    public c1(byte[] bArr, HashMap map, String str, String str2, int i10, String str3) {
        this.f47932a = bArr;
        this.f47933b = map;
        this.f47934c = str;
        this.f47935d = str2;
        this.f47936e = i10;
        this.f47937f = str3;
    }

    public final boolean a() {
        boolean z10;
        String str;
        if (TextUtils.isEmpty(this.f47937f)) {
            return false;
        }
        loop0: while (true) {
            z10 = true;
            for (String str2 : this.f47933b.keySet()) {
                if (!z10) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null || !str2.equalsIgnoreCase(kj.d.N0)) {
                        if (str2 != null && str2.equalsIgnoreCase(kj.d.f102461e)) {
                            String str3 = (String) this.f47933b.get(str2);
                            if (str3 != null) {
                                z10 = !str3.equalsIgnoreCase(jl.c.f100615u);
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = (String) this.f47933b.get(str2)) != null) {
                            try {
                                Date date = f47931h.parse(str);
                                if (date != null && date.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z10 = false;
                } else {
                    String str4 = (String) this.f47933b.get(str2);
                    if (str4 != null) {
                        Pattern pattern = f47930g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int iA = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.v.a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains(BuildConfig.SDK_BUILD_FLAVOR) || str4.toLowerCase(locale).contains("private") || iA > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                        }
                        z10 = false;
                    } else {
                        continue;
                    }
                }
            }
            break loop0;
        }
        return z10;
    }
}
