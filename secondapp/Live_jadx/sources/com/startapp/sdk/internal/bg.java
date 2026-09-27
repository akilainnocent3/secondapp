package com.startapp.sdk.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class bg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f74599a = new HashMap();

    public final int a(SensorEvent sensorEvent) {
        int size;
        synchronized (this) {
            try {
                int type = sensorEvent.sensor.getType();
                SensorEvent sensorEvent2 = (SensorEvent) this.f74599a.get(Integer.valueOf(type));
                if (sensorEvent2 == null || sensorEvent2.accuracy <= sensorEvent.accuracy) {
                    this.f74599a.put(Integer.valueOf(type), sensorEvent);
                }
                size = this.f74599a.size();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    public final JSONArray a() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (SensorEvent sensorEvent : this.f74599a.values()) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            Sensor sensor = sensorEvent.sensor;
            jSONObject2.put("name", sensor.getName());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            jSONObject2.put("maximum range", sensor.getMaximumRange());
            jSONObject2.put("power", sensor.getPower());
            jSONObject2.put("resolution", sensor.getResolution());
            jSONObject2.put("accuracy", sensorEvent.accuracy);
            jSONObject2.put("timestamp", sensorEvent.timestamp);
            JSONArray jSONArray2 = new JSONArray();
            for (float f10 : sensorEvent.values) {
                jSONArray2.put(f10);
            }
            jSONObject2.put(androidx.lifecycle.v0.f13454g, jSONArray2);
            jSONObject.put(String.valueOf(sensor.getType()), jSONObject2);
            jSONArray.put(jSONObject);
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
