package com.ironsource.adqualitysdk.sdk;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.i.k;
import com.ironsource.adqualitysdk.sdk.i.kc;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class ISAdQualitySegment {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private double f52;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final Map<String, String> f53;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final long f54;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final AtomicBoolean f55;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f56;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f57;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private final String f58;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final int f59;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f66;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f68;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private double f65 = 999999.99d;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private int f67 = -1;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private int f64 = -1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private AtomicBoolean f62 = null;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private long f63 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private double f60 = -1.0d;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private Map<String, String> f61 = new HashMap();

        public ISAdQualitySegment build() {
            return new ISAdQualitySegment(this.f66, this.f67, this.f68, this.f64, this.f62, this.f60, this.f63, new HashMap(this.f61), (byte) 0);
        }

        public Builder setAge(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 <= 199) {
                this.f67 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setAge( ");
            sb2.append(i10);
            sb2.append(" ) age must be between 1-199");
            k.m2769("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setCustomData(String str, String str2) {
            if (TextUtils.isEmpty(str2)) {
                return this;
            }
            try {
                if (this.f61.size() >= 5) {
                    StringBuilder sb2 = new StringBuilder("setCustomData( ");
                    sb2.append(str);
                    sb2.append(" , ");
                    sb2.append(str2);
                    sb2.append(" ) limited to 5 custom values. Ignoring custom value.");
                    k.m2769("ISAdQualitySegment Builder", sb2.toString());
                    return this;
                }
                if (kc.m2826(str) && kc.m2826(str2) && kc.m2817(str, 32) && kc.m2817(str2, 32)) {
                    this.f61.put("sgct_".concat(String.valueOf(str)), str2);
                    return this;
                }
                StringBuilder sb3 = new StringBuilder("setCustomData( ");
                sb3.append(str);
                sb3.append(" , ");
                sb3.append(str2);
                sb3.append(" ) key and value must be alphanumeric and 1-32 in length");
                k.m2769("ISAdQualitySegment Builder", sb3.toString());
                return this;
            } catch (Exception e10) {
                e10.printStackTrace();
                return this;
            }
        }

        public Builder setGender(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            Locale locale = Locale.ENGLISH;
            if (str.toLowerCase(locale).equals("male") || str.toLowerCase(locale).equals("female")) {
                this.f68 = str.toLowerCase(locale);
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setGender( ");
            sb2.append(str);
            sb2.append(" ) is invalid");
            k.m2769("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setInAppPurchasesTotal(double d10) {
            if (d10 >= 0.0d && d10 < this.f65) {
                this.f60 = Math.floor(d10 * 100.0d) / 100.0d;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setIAPTotal( ");
            sb2.append(d10);
            sb2.append(" ) iapt must be between 0-");
            sb2.append(this.f65);
            k.m2769("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setIsPaying(boolean z10) {
            if (this.f62 == null) {
                this.f62 = new AtomicBoolean();
            }
            this.f62.set(z10);
            return this;
        }

        public Builder setLevel(int i10) {
            if (i10 == 0) {
                return this;
            }
            if (i10 > 0 && i10 < 999999) {
                this.f64 = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setLevel( ");
            sb2.append(i10);
            sb2.append(" ) level must be between 1-999999");
            k.m2769("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setSegmentName(String str) {
            if (TextUtils.isEmpty(str)) {
                return this;
            }
            if (kc.m2826(str) && kc.m2817(str, 32)) {
                this.f66 = str;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setSegmentName( ");
            sb2.append(str);
            sb2.append(" ) segment name must be alphanumeric and 1-32 in length");
            k.m2769("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }

        public Builder setUserCreationDate(long j10) {
            if (j10 == 0) {
                return this;
            }
            if (j10 > 0) {
                this.f63 = j10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder("setUserCreationDate( ");
            sb2.append(j10);
            sb2.append(" ) is an invalid timestamp");
            k.m2769("ISAdQualitySegment Builder", sb2.toString());
            return this;
        }
    }

    public /* synthetic */ ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map map, byte b10) {
        this(str, i10, str2, i11, atomicBoolean, d10, j10, map);
    }

    public int getAge() {
        return this.f59;
    }

    public Map<String, String> getCustomData() {
        return this.f53;
    }

    public String getGender() {
        return this.f58;
    }

    public double getInAppPurchasesTotal() {
        return this.f52;
    }

    public AtomicBoolean getIsPaying() {
        return this.f55;
    }

    public int getLevel() {
        return this.f57;
    }

    public String getName() {
        return this.f56;
    }

    public long getUserCreationDate() {
        return this.f54;
    }

    private ISAdQualitySegment(String str, int i10, String str2, int i11, AtomicBoolean atomicBoolean, double d10, long j10, Map<String, String> map) {
        this.f56 = str;
        this.f59 = i10;
        this.f58 = str2;
        this.f57 = i11;
        this.f55 = atomicBoolean;
        this.f52 = d10;
        this.f54 = j10;
        this.f53 = map;
    }
}
