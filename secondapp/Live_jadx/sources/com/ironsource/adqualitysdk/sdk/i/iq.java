package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class iq {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private d f2585;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f2586;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private long f2587;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class d {

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private int f2588;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f2589;

        public d(int i10, String str) {
            this.f2588 = i10;
            this.f2589 = str;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final int m2472() {
            return this.f2588;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final String m2473() {
            return this.f2589;
        }
    }

    public iq(String str, int i10, String str2, long j10) {
        this.f2586 = str;
        this.f2587 = j10;
        this.f2585 = new d(i10, str2);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m2468() throws JSONException {
        return !TextUtils.isEmpty(this.f2586) ? new JSONObject(this.f2586) : new JSONObject();
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final d m2469() {
        return this.f2585;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final long m2470() {
        return this.f2587;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final String m2471() {
        return this.f2586;
    }
}
