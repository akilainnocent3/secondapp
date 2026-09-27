package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import com.ironsource.C4235d4;
import com.ironsource.G5;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class ig {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f74993b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f74995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c2 f74996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SensorManager f74997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ib f74998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f74999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Pair f75000i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ib f75001j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final r4 f75002k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f75003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f75004m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f74992a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f74994c = new HashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final fg f75005n = new fg(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final hg f75006o = new hg(this);

    public ig(ib ibVar, ib ibVar2, r4 r4Var, Context context) {
        this.f75001j = ibVar;
        this.f75002k = r4Var;
        this.f74998g = ibVar2;
        this.f74999h = context;
        this.f75000i = new Pair(Integer.valueOf(((sf) ibVar2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((sf) ibVar2.a()).getInt("daily_collected", 0)));
        SensorsData sensorsDataU = MetaData.E().U();
        if (sensorsDataU == null) {
            return;
        }
        this.f74995d = (long) (((double) (1000 / sensorsDataU.d())) * 0.95d);
        this.f75004m = sensorsDataU.e();
    }

    public static boolean a(ig igVar, SensorEvent sensorEvent) {
        igVar.getClass();
        int type = sensorEvent.sensor.getType();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l10 = (Long) igVar.f74994c.get(Integer.valueOf(type));
        if (jCurrentTimeMillis - (l10 == null ? 0L : l10.longValue()) < igVar.f74995d) {
            return true;
        }
        igVar.f74994c.put(Integer.valueOf(type), Long.valueOf(jCurrentTimeMillis));
        return false;
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f74997f = sensorManager;
        if (sensorManager == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.f75006o, intentFilter);
        } catch (Throwable th2) {
            if (a(8)) {
                d9.a(th2);
            }
        }
        SensorManager sensorManager2 = this.f74997f;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.f75005n);
        }
        int iD = 1000000 / sensorsData.d();
        Sensor defaultSensor = this.f74997f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f74997f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f74997f.getDefaultSensor(2);
        this.f74997f.registerListener(this.f75005n, defaultSensor, iD);
        this.f74997f.registerListener(this.f75005n, defaultSensor2, iD);
        this.f74997f.registerListener(this.f75005n, defaultSensor3, iD);
    }

    public static void a(ig igVar, SensorEvent sensorEvent, SensorsData sensorsData) {
        Object obj;
        igVar.f74993b = ((sf) igVar.f74998g.a()).getInt("total_collected", 0);
        c2 c2Var = igVar.f74996e;
        if (c2Var == null || c2Var.f74627g.size() >= c2Var.f74628h) {
            igVar.f74996e = new c2(((com.startapp.sdk.common.advertisingid.b) igVar.f75001j.a()).a().f75070a, igVar.f74999h.getPackageName(), System.currentTimeMillis() + "", UUID.randomUUID().toString(), igVar.f75003l, igVar.a(), sensorsData.c());
            igVar.f74992a = 0;
        }
        int i10 = igVar.f74992a;
        igVar.f74992a = i10 + 1;
        tf tfVar = new tf(i10, sensorEvent.sensor.getType(), System.currentTimeMillis(), Arrays.copyOf(sensorEvent.values, 3));
        c2 c2Var2 = igVar.f74996e;
        c2Var2.f74627g.add(tfVar);
        if (c2Var2.f74627g.size() >= c2Var2.f74628h) {
            int i11 = Calendar.getInstance().get(6);
            if (((Integer) igVar.f75000i.first).intValue() == i11) {
                Pair pair = igVar.f75000i;
                igVar.f75000i = new Pair((Integer) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1));
            } else {
                igVar.f75000i = new Pair(Integer.valueOf(i11), 1);
            }
            c2 c2Var3 = igVar.f74996e;
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("advertisingId", c2Var3.f74621a);
                jSONObject.put("bId", c2Var3.f74624d);
                jSONObject.put("batchTimestamp", c2Var3.f74623c);
                jSONObject.put("fp", c2Var3.f74622b);
                jSONObject.put(C4235d4.j.f61475k0, c2Var3.f74625e);
                jSONObject.put("isScreenOn", c2Var3.f74626f);
                JSONArray jSONArray = new JSONArray();
                for (tf tfVar2 : c2Var3.f74627g) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("sId", tfVar2.f75564a);
                    jSONObject2.put(G5.f59045q, tfVar2.f75565b);
                    jSONObject2.put("ts", tfVar2.f75566c);
                    JSONArray jSONArray2 = new JSONArray();
                    for (float f10 : tfVar2.f75567d) {
                        jSONArray2.put(f10);
                    }
                    jSONObject2.put("v", jSONArray2);
                    jSONArray.put(jSONObject2);
                }
                jSONObject.put("valueList", jSONArray);
                obj = jSONObject;
            } catch (Throwable th2) {
                if (igVar.a(16)) {
                    d9.a(th2);
                }
                obj = null;
            }
            if (sensorsData.g()) {
                d9 d9Var = new d9(e9.f74733p);
                d9Var.f74676e = String.valueOf(obj);
                d9Var.a();
            } else {
                d9 d9Var2 = new d9(e9.f74733p);
                d9Var2.f74677f = obj;
                d9Var2.a();
            }
            rf rfVarEdit = ((sf) igVar.f74998g.a()).edit();
            int i12 = igVar.f74993b + 1;
            igVar.f74993b = i12;
            rfVarEdit.putInt("total_collected", i12);
            rfVarEdit.putLong("sensor_last_collected_time", System.currentTimeMillis());
            Integer num = (Integer) igVar.f75000i.first;
            int iIntValue = num.intValue();
            rfVarEdit.a("last_collected_day", num);
            rfVarEdit.f75462a.putInt("last_collected_day", iIntValue);
            Integer num2 = (Integer) igVar.f75000i.second;
            int iIntValue2 = num2.intValue();
            rfVarEdit.a("daily_collected", num2);
            rfVarEdit.f75462a.putInt("daily_collected", iIntValue2);
            rfVarEdit.apply();
            igVar.a(igVar.f74993b == sensorsData.e());
        }
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.f74999h.getSystemService("display")).getDisplays()) {
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z10) {
        try {
            SensorManager sensorManager = this.f74997f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.f75005n);
            }
            this.f75002k.getClass();
            SensorsData sensorsDataU = MetaData.E().U();
            this.f74996e = null;
            if (!z10 && sensorsDataU != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new gg(this), ((long) sensorsDataU.a()) * 1000);
            }
            this.f74999h.unregisterReceiver(this.f75006o);
        } catch (Throwable th2) {
            if (a(32)) {
                d9.a(th2);
            }
        }
    }

    public final void a(Context context) {
        int iA;
        try {
            this.f75002k.getClass();
            SensorsData sensorsDataU = MetaData.E().U();
            String str = ((com.startapp.sdk.common.advertisingid.b) this.f75001j.a()).a().f75070a;
            if (sensorsDataU != null) {
                this.f75002k.getClass();
                SensorsData sensorsDataU2 = MetaData.E().U();
                if (sensorsDataU2 != null && ((sf) this.f74998g.a()).getInt("total_collected", 0) != sensorsDataU2.e() && !str.equals("0") && !str.equals("00000000-0000-0000-0000-000000000000")) {
                    long j10 = ((sf) this.f74998g.a()).getLong("sensor_last_collected_time", 0L);
                    if ((((Integer) this.f75000i.first).intValue() != Calendar.getInstance().get(6) || ((Integer) this.f75000i.second).intValue() != sensorsDataU.f()) && (System.currentTimeMillis() - j10) / 1000 >= sensorsDataU.a()) {
                        a(context, sensorsDataU);
                        return;
                    }
                    if (((Integer) this.f75000i.first).intValue() == Calendar.getInstance().get(6) && ((Integer) this.f75000i.second).intValue() == sensorsDataU.f()) {
                        iA = (24 - Calendar.getInstance().get(11)) * 3600;
                    } else {
                        iA = sensorsDataU.a();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new gg(this), ((long) iA) * 1000);
                }
            }
        } catch (Throwable th2) {
            if (a(4)) {
                d9.a(th2);
            }
        }
    }

    public final boolean a(int i10) {
        this.f75002k.getClass();
        SensorsData sensorsDataU = MetaData.E().U();
        ComponentInfoEventConfig componentInfoEventConfigB = sensorsDataU != null ? sensorsDataU.b() : null;
        return componentInfoEventConfigB != null && componentInfoEventConfigB.a((long) i10);
    }
}
