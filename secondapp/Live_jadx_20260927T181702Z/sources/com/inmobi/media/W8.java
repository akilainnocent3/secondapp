package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class W8 extends AbstractC3655f2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W8 f55713c = new W8();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f55714d = new AtomicBoolean(true);

    public final JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        AtomicBoolean atomicBoolean = f55714d;
        jSONObject.put("a-audioBannerEnabled", String.valueOf(atomicBoolean.get()));
        if (atomicBoolean.get()) {
            long j10 = this.f56386a / 1000;
            if (j10 != 0) {
                jSONObject.put("a-lastAudioBannerPlayedTs", String.valueOf(j10));
            }
            int i10 = this.f56387b;
            if (i10 > 0) {
                jSONObject.put("a-audioBannerFreq", String.valueOf(i10));
            }
            Context context = Ji.f54934a;
            if (context != null) {
                ConcurrentHashMap concurrentHashMap = Ea.f54559b;
                Ea eaA = Da.a(context, "banner_audio_pref_file");
                kotlin.jvm.internal.m0.p("user_mute_count", "key");
                int i11 = eaA.f54560a.getInt("user_mute_count", -1);
                if (i11 > 0) {
                    jSONObject.put("a-b-umc", String.valueOf(i11));
                }
            }
        }
        return jSONObject;
    }
}
