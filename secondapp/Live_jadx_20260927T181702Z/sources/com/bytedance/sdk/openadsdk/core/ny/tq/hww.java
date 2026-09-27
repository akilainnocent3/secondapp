package com.bytedance.sdk.openadsdk.core.ny.tq;

import android.text.TextUtils;
import mk.e;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends sd implements Comparable<hww> {
    public long hww;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.ny.tq.hww$hww, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C0353hww {
        private final String hww;

        /* JADX INFO: renamed from: sd, reason: collision with root package name */
        private sd.EnumC0354sd f36571sd = sd.EnumC0354sd.TRACKING_URL;

        /* JADX INFO: renamed from: tq, reason: collision with root package name */
        private final long f36572tq;

        public C0353hww(String str, long j10) {
            this.hww = str;
            this.f36572tq = j10;
        }

        public hww hww() {
            return new hww(this.f36572tq, this.hww, this.f36571sd, Boolean.FALSE);
        }
    }

    public hww(long j10, String str, sd.EnumC0354sd enumC0354sd, Boolean bool) {
        super(str, enumC0354sd, bool);
        this.hww = j10;
    }

    public long hww() {
        return this.hww;
    }

    public String toString() {
        return super.toString();
    }

    public JSONObject tq() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", sd());
        jSONObject.put("trackingMilliseconds", this.hww);
        return jSONObject;
    }

    public static int hww(String str) {
        if (TextUtils.isEmpty(str)) {
            return Integer.MIN_VALUE;
        }
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length == 3) {
            try {
                return (int) ((Integer.parseInt(strArrSplit[0]) * e.f107640n) + (Integer.parseInt(strArrSplit[1]) * 60000) + (Float.parseFloat(strArrSplit[2]) * 1000.0f));
            } catch (Throwable unused) {
            }
        }
        return Integer.MIN_VALUE;
    }

    public boolean hww(long j10) {
        return this.hww <= j10 && !hv();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: hww, reason: merged with bridge method [inline-methods] */
    public int compareTo(hww hwwVar) {
        if (hwwVar == null) {
            return 1;
        }
        long j10 = this.hww;
        long j11 = hwwVar.hww;
        if (j10 > j11) {
            return 1;
        }
        return j10 < j11 ? -1 : 0;
    }
}
