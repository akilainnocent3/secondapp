package com.startapp.sdk.internal;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class z7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f75961a = new LinkedHashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f75962b = new LinkedHashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GetBluetoothAsync$startUnsafe$1 f75963c;

    public final synchronized JSONObject a() {
        JSONObject jSONObject;
        try {
            if (this.f75961a.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (BluetoothDevice bluetoothDevice : this.f75961a) {
                    int i10 = com.startapp.sdk.adsbase.periodic.a.f74402i;
                    JSONObject jSONObject2 = new JSONObject();
                    BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                    jSONObject2.put("bluetoothClass", bluetoothClass != null ? Integer.valueOf(bluetoothClass.getDeviceClass()) : null);
                    jSONObject2.put("name", bluetoothDevice.getName());
                    jSONObject2.put("mac", bluetoothDevice.getAddress());
                    jSONObject2.put("bondState", bluetoothDevice.getBondState());
                    jSONArray.put(jSONObject2);
                }
                jSONObject = new JSONObject();
                jSONObject.put("paired", jSONArray);
            } else {
                jSONObject = null;
            }
            if (this.f75962b.size() <= 0) {
                return jSONObject;
            }
            JSONArray jSONArray2 = new JSONArray();
            for (BluetoothDevice bluetoothDevice2 : this.f75962b) {
                int i11 = com.startapp.sdk.adsbase.periodic.a.f74402i;
                JSONObject jSONObject3 = new JSONObject();
                BluetoothClass bluetoothClass2 = bluetoothDevice2.getBluetoothClass();
                jSONObject3.put("bluetoothClass", bluetoothClass2 != null ? Integer.valueOf(bluetoothClass2.getDeviceClass()) : null);
                jSONObject3.put("name", bluetoothDevice2.getName());
                jSONObject3.put("mac", bluetoothDevice2.getAddress());
                jSONObject3.put("bondState", bluetoothDevice2.getBondState());
                jSONArray2.put(jSONObject3);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            jSONObject.put("available", jSONArray2);
            return jSONObject;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
