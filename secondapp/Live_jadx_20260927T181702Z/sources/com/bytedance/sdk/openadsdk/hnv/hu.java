package com.bytedance.sdk.openadsdk.hnv;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.ironsource.C4235d4;
import com.ironsource.Q6;
import gp.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import jg.b0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hu {
    private Context hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private WeakReference<ok> f37214tq;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Map<String, hww> f37213sd = new HashMap();
    private SensorEventListener vy = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.1
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            ok okVarVy;
            if (sensorEvent.sensor.getType() != 1 || (okVarVy = hu.this.vy()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put(b0.f100177r, f12);
                okVarVy.hww("accelerometer_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* JADX INFO: renamed from: hv, reason: collision with root package name */
    private SensorEventListener f37212hv = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.12
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            ok okVarVy;
            if (sensorEvent.sensor.getType() != 4 || (okVarVy = hu.this.vy()) == null) {
                return;
            }
            float degrees = (float) Math.toDegrees(sensorEvent.values[0]);
            float degrees2 = (float) Math.toDegrees(sensorEvent.values[1]);
            float degrees3 = (float) Math.toDegrees(sensorEvent.values[2]);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", degrees);
                jSONObject.put("y", degrees2);
                jSONObject.put(b0.f100177r, degrees3);
                okVarVy.hww("gyro_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* JADX INFO: renamed from: hu, reason: collision with root package name */
    private SensorEventListener f37211hu = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.23
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            ok okVarVy;
            if (sensorEvent.sensor.getType() != 10 || (okVarVy = hu.this.vy()) == null) {
                return;
            }
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("x", f10);
                jSONObject.put("y", f11);
                jSONObject.put(b0.f100177r, f12);
                okVarVy.hww("accelerometer_grativityless_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };
    private SensorEventListener vgm = new SensorEventListener() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.34
        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = sensorEvent.values;
                float[] fArr2 = nod.f37260tq;
                System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
            } else if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = sensorEvent.values;
                float[] fArr4 = nod.f37259sd;
                System.arraycopy(fArr3, 0, fArr4, 0, fArr4.length);
            }
            float[] fArr5 = nod.vy;
            SensorManager.getRotationMatrix(fArr5, null, nod.f37260tq, nod.f37259sd);
            float[] fArr6 = nod.f37258hv;
            SensorManager.getOrientation(fArr5, fArr6);
            ok okVarVy = hu.this.vy();
            if (okVarVy == null) {
                return;
            }
            float f10 = fArr6[0];
            float f11 = fArr6[1];
            float f12 = fArr6[2];
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("alpha", f10);
                jSONObject.put("beta", f11);
                jSONObject.put("gamma", f12);
                okVarVy.hww("rotation_vector_callback", jSONObject);
            } catch (Throwable unused) {
            }
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface hww {
        JSONObject hww(JSONObject jSONObject) throws Throwable;
    }

    public hu(ok okVar) {
        this.hww = okVar.hww();
        this.f37214tq = new WeakReference<>(okVar);
        sd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.hnv.hww hv() {
        ok okVarVy = vy();
        if (okVarVy == null) {
            return null;
        }
        return okVarVy.bs();
    }

    private void sd() {
        this.f37213sd.put("adInfo", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.45
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                if (okVarVy == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectMrs = okVarVy.mrs();
                if (jSONObjectMrs != null) {
                    jSONObjectMrs.put(e.f87280s, 1);
                    return jSONObjectMrs;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(e.f87280s, -1);
                return jSONObject3;
            }
        });
        this.f37213sd.put("appInfo", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.56
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(e.f87280s, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = hu.this.hww().iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject2.put("supportList", jSONArray);
                ok okVarVy = hu.this.vy();
                if (okVarVy != null) {
                    jSONObject2.put("deviceId", okVarVy.vgm());
                    jSONObject2.put("netType", okVarVy.wgt());
                    jSONObject2.put("innerAppName", okVarVy.vy());
                    jSONObject2.put("appName", okVarVy.hv());
                    jSONObject2.put("appVersion", okVarVy.hu());
                    Map<String, String> mapTq = okVarVy.tq();
                    for (String str : mapTq.keySet()) {
                        jSONObject2.put(str, mapTq.get(str));
                    }
                }
                return jSONObject2;
            }
        });
        this.f37213sd.put("playableSDKInfo", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.62
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(e.f87280s, 1);
                jSONObject2.put("appName", "playable_sdk");
                jSONObject2.put("playableSdkEdition", "6.6.0");
                jSONObject2.put(Q6.F, "android");
                return jSONObject2;
            }
        });
        this.f37213sd.put("subscribe_app_ad", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.63
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("download_app_ad", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.64
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put(C4235d4.i.f61430o, new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.2
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                if (okVarVy == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(e.f87280s, 1);
                jSONObject3.put("viewStatus", okVarVy.rs());
                return jSONObject3;
            }
        });
        this.f37213sd.put("getVolume", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.3
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                if (okVarVy == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(e.f87280s, 1);
                jSONObject3.put("endcard_mute", okVarVy.ok());
                return jSONObject3;
            }
        });
        this.f37213sd.put("getScreenSize", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.4
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                if (okVarVy == null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectJpb = okVarVy.jpb();
                jSONObjectJpb.put(e.f87280s, 1);
                return jSONObjectJpb;
            }
        });
        this.f37213sd.put("start_accelerometer_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.5
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        vgm.hww("PlayableJsBridge", "invoke start_accelerometer_observer error", th2);
                        jSONObject2.put(e.f87280s, -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nod.hww(hu.this.hww, hu.this.vy, iOptInt);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("close_accelerometer_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.6
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nod.hww(hu.this.hww, hu.this.vy);
                    jSONObject2.put(e.f87280s, 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    vgm.hww("PlayableJsBridge", "invoke close_accelerometer_observer error", th2);
                    jSONObject2.put(e.f87280s, -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f37213sd.put("start_gyro_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.7
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        vgm.hww("PlayableJsBridge", "invoke start_gyro_observer error", th2);
                        jSONObject2.put(e.f87280s, -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nod.tq(hu.this.hww, hu.this.f37212hv, iOptInt);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("close_gyro_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.8
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nod.hww(hu.this.hww, hu.this.f37212hv);
                    jSONObject2.put(e.f87280s, 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    vgm.hww("PlayableJsBridge", "invoke close_gyro_observer error", th2);
                    jSONObject2.put(e.f87280s, -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f37213sd.put("start_accelerometer_grativityless_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.9
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        vgm.hww("PlayableJsBridge", "invoke start_accelerometer_grativityless_observer error", th2);
                        jSONObject2.put(e.f87280s, -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nod.sd(hu.this.hww, hu.this.f37211hu, iOptInt);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("close_accelerometer_grativityless_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.10
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nod.hww(hu.this.hww, hu.this.f37211hu);
                    jSONObject2.put(e.f87280s, 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    vgm.hww("PlayableJsBridge", "invoke close_accelerometer_grativityless_observer error", th2);
                    jSONObject2.put(e.f87280s, -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f37213sd.put("start_rotation_vector_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.11
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                int iOptInt = 2;
                if (jSONObject != null) {
                    try {
                        iOptInt = jSONObject.optInt("interval_android", 2);
                    } catch (Throwable th2) {
                        vgm.hww("PlayableJsBridge", "invoke start_rotation_vector_observer error", th2);
                        jSONObject2.put(e.f87280s, -1);
                        jSONObject2.put("codeMsg", th2.toString());
                        return jSONObject2;
                    }
                }
                nod.vy(hu.this.hww, hu.this.vgm, iOptInt);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("close_rotation_vector_observer", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.13
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nod.hww(hu.this.hww, hu.this.vgm);
                    jSONObject2.put(e.f87280s, 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    vgm.hww("PlayableJsBridge", "invoke close_rotation_vector_observer error", th2);
                    jSONObject2.put(e.f87280s, -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f37213sd.put("device_shake", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.14
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nod.hww(hu.this.hww, 300L);
                    jSONObject2.put(e.f87280s, 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    vgm.hww("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put(e.f87280s, -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f37213sd.put("device_shake_short", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.15
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    nod.hww(hu.this.hww, 150L);
                    jSONObject2.put(e.f87280s, 1);
                    return jSONObject2;
                } catch (Throwable th2) {
                    vgm.hww("PlayableJsBridge", "invoke device_shake error", th2);
                    jSONObject2.put(e.f87280s, -1);
                    jSONObject2.put("codeMsg", th2.toString());
                    return jSONObject2;
                }
            }
        });
        this.f37213sd.put("playable_style", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.16
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectSd = okVarVy.sd();
                jSONObjectSd.put(e.f87280s, 1);
                return jSONObjectSd;
            }
        });
        this.f37213sd.put("sendReward", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.17
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.hnv();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playableInteractionTriggered", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.18
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.kv();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("webview_time_track", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.19
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                return new JSONObject();
            }
        });
        this.f37213sd.put("playable_event", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.20
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null || jSONObject == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.tq(jSONObject.optString("event", null), jSONObject.optJSONObject("params"));
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("reportAd", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.21
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("close", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.22
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("openAdLandPageLinks", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.24
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("get_viewport", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.25
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOmn = okVarVy.omn();
                jSONObjectOmn.put(e.f87280s, 1);
                return jSONObjectOmn;
            }
        });
        this.f37213sd.put("jssdk_load_finish", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.26
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.oxu();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_material_render_result", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.27
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.rs(jSONObject);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("detect_change_playable_click", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.28
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectNod = okVarVy.nod();
                jSONObjectNod.put(e.f87280s, 1);
                return jSONObjectNod;
            }
        });
        this.f37213sd.put("check_camera_permission", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.29
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectEd = okVarVy.ed();
                jSONObjectEd.put(e.f87280s, 1);
                return jSONObjectEd;
            }
        });
        this.f37213sd.put("check_external_storage", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.30
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectKhx = okVarVy.khx();
                if (jSONObjectKhx.isNull("result")) {
                    jSONObjectKhx.put(e.f87280s, -1);
                    return jSONObjectKhx;
                }
                jSONObjectKhx.put(e.f87280s, 1);
                return jSONObjectKhx;
            }
        });
        this.f37213sd.put("playable_open_camera", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.31
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_pick_photo", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.32
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_download_media_in_photos", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.33
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.hww(jSONObject);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_preventTouchEvent", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.35
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.tq(jSONObject);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_settings_info", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.36
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectWeu = okVarVy.weu();
                jSONObjectWeu.put(e.f87280s, 1);
                return jSONObjectWeu;
            }
        });
        this.f37213sd.put("playable_load_main_scene", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.37
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.kub();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_enter_section", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.38
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.vy(jSONObject);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_end", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.39
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.aeg();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_finish_play_playable", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.40
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.grv();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_transfrom_module_show", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.41
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.aed();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_transfrom_module_change_color", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.42
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.zvy();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_set_scroll_rect", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.43
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_click_area", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.44
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.hv(jSONObject);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_real_play_start", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.46
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_material_first_frame_show", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.47
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.mw();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_stuck_check_pong", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.48
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.za();
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_material_adnormal_mask", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.49
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                okVarVy.hu(jSONObject);
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_long_press_panel", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.50
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_alpha_player_play", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.51
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_transfrom_module_highlight", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.52
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_send_click_event", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.53
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_query_media_permission_declare", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.54
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectVgm = okVarVy.vgm(jSONObject);
                jSONObjectVgm.put(e.f87280s, 1);
                return jSONObjectVgm;
            }
        });
        this.f37213sd.put("playable_query_media_permission_enable", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.55
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                ok okVarVy = hu.this.vy();
                JSONObject jSONObject2 = new JSONObject();
                if (okVarVy == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                JSONObject jSONObjectOk = okVarVy.ok(jSONObject);
                jSONObjectOk.put(e.f87280s, 1);
                return jSONObjectOk;
            }
        });
        this.f37213sd.put("playable_apply_media_permission", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.57
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_start_kws", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.58
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_close_kws", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.59
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_video_preload_task_add", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.60
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
        this.f37213sd.put("playable_video_preload_task_cancel", new hww() { // from class: com.bytedance.sdk.openadsdk.hnv.hu.61
            @Override // com.bytedance.sdk.openadsdk.hnv.hu.hww
            public JSONObject hww(JSONObject jSONObject) throws Throwable {
                com.bytedance.sdk.openadsdk.hnv.hww hwwVarHv = hu.this.hv();
                JSONObject jSONObject2 = new JSONObject();
                if (hwwVarHv == null) {
                    jSONObject2.put(e.f87280s, -1);
                    return jSONObject2;
                }
                jSONObject2.put(e.f87280s, 1);
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ok vy() {
        WeakReference<ok> weakReference = this.f37214tq;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public Set<String> hww() {
        return this.f37213sd.keySet();
    }

    public void tq() {
        nod.hww(this.hww, this.vy);
        nod.hww(this.hww, this.f37212hv);
        nod.hww(this.hww, this.f37211hu);
        nod.hww(this.hww, this.vgm);
    }

    public JSONObject hww(String str, JSONObject jSONObject) {
        try {
            hww hwwVar = this.f37213sd.get(str);
            if (hwwVar == null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(e.f87280s, -1);
                return jSONObject2;
            }
            return hwwVar.hww(jSONObject);
        } catch (Throwable th2) {
            vgm.hww("PlayableJsBridge", "invoke error", th2);
            return null;
        }
    }
}
