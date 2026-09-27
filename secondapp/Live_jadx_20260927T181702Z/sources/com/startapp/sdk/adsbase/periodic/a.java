package com.startapp.sdk.adsbase.periodic;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.ironsource.Z3;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.l2;
import com.startapp.sdk.internal.p0;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.w1;
import com.startapp.sdk.internal.x1;
import com.startapp.sdk.internal.z7;
import java.util.Set;
import kotlin.jvm.internal.m0;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends x1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f74402i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f74403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ib f74404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f74405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f74406h;

    static {
        m0.o(a.class.getSimpleName(), "getSimpleName(...)");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, l2 callback, ib prefs, long j10, long j11) {
        super(context, callback);
        m0.p(context, "context");
        m0.p(callback, "callback");
        m0.p(prefs, "prefs");
        this.f74403e = context;
        this.f74404f = prefs;
        this.f74405g = j10;
        this.f74406h = j11;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003a  */
    @Override // com.startapp.sdk.internal.x1
    public final void a() {
        BluetoothAdapter adapter;
        final z7 dataBuilder = new z7();
        m0.p(dataBuilder, "dataBuilder");
        boolean zA = false;
        try {
            Object systemService = this.f74403e.getSystemService(Z3.f60408d);
            if (!(systemService instanceof BluetoothManager) || (adapter = ((BluetoothManager) systemService).getAdapter()) == null) {
                adapter = null;
            } else {
                if (!(Build.VERSION.SDK_INT < 31 ? p0.a(this.f74403e, "android.permission.BLUETOOTH") : true) || !adapter.isEnabled()) {
                    adapter = null;
                }
            }
            if (adapter != null) {
                zA = a(adapter, dataBuilder);
            }
        } catch (Throwable th2) {
            d9.a(th2);
        }
        this.f75810c.postDelayed(new Runnable() { // from class: com.startapp.sdk.adsbase.periodic.b
            @Override // java.lang.Runnable
            public final void run() {
                a.a(this.f74407b, dataBuilder);
            }
        }, zA ? this.f74405g : 0L);
    }

    public static final void a(a this$0, z7 dataBuilder) {
        m0.p(this$0, "this$0");
        m0.p(dataBuilder, "$dataBuilder");
        this$0.a(dataBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.content.BroadcastReceiver, com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1] */
    public final boolean a(BluetoothAdapter bluetoothAdapter, final z7 z7Var) {
        boolean zA;
        boolean zA2;
        Set<BluetoothDevice> bondedDevices;
        try {
            if (Build.VERSION.SDK_INT < 31) {
                zA2 = p0.a(this.f74403e, "android.permission.BLUETOOTH");
            } else {
                zA2 = p0.a(this.f74403e, "android.permission.BLUETOOTH_CONNECT");
            }
            if (zA2 && (bondedDevices = bluetoothAdapter.getBondedDevices()) != null) {
                for (BluetoothDevice bluetoothDevice : bondedDevices) {
                    m0.m(bluetoothDevice);
                    synchronized (z7Var) {
                        try {
                            m0.p(bluetoothDevice, "bluetoothDevice");
                            z7Var.f75961a.add(bluetoothDevice);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            d9.a(th3);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = jCurrentTimeMillis - ((sf) this.f74404f.a()).getLong("lastBtDiscoveringTime", 0L) >= this.f74406h;
        if (z10) {
            rf rfVarEdit = ((sf) this.f74404f.a()).edit();
            rfVarEdit.a("lastBtDiscoveringTime", Long.valueOf(jCurrentTimeMillis));
            rfVarEdit.f75462a.putLong("lastBtDiscoveringTime", jCurrentTimeMillis);
            rfVarEdit.apply();
        }
        if (!z10) {
            return false;
        }
        ?? r10 = new BroadcastReceiver() { // from class: com.startapp.sdk.adsbase.periodic.GetBluetoothAsync$startUnsafe$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                m0.p(context, "context");
                m0.p(intent, "intent");
                if (!m0.g("android.bluetooth.device.action.FOUND", intent.getAction())) {
                    if (m0.g("android.bluetooth.adapter.action.DISCOVERY_FINISHED", intent.getAction())) {
                        this.f74400a.a(z7Var);
                        return;
                    }
                    return;
                }
                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                if (bluetoothDevice2 != null) {
                    z7 z7Var2 = z7Var;
                    synchronized (z7Var2) {
                        m0.p(bluetoothDevice2, "bluetoothDevice");
                        z7Var2.f75962b.add(bluetoothDevice2);
                    }
                }
            }
        };
        z7Var.f75963c = r10;
        this.f74403e.registerReceiver(r10, new IntentFilter("android.bluetooth.device.action.FOUND"));
        if (Build.VERSION.SDK_INT < 31) {
            zA = p0.a(this.f74403e, "android.permission.BLUETOOTH_ADMIN");
        } else {
            zA = p0.a(this.f74403e, "android.permission.BLUETOOTH_SCAN");
        }
        if (zA) {
            return bluetoothAdapter.startDiscovery();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    public final void a(z7 z7Var) {
        boolean zA;
        BluetoothAdapter adapter;
        JSONObject jSONObjectA;
        boolean zA2;
        BluetoothAdapter bluetoothAdapter = null;
        try {
            w1 w1Var = this.f75809b;
            if (z7Var == null) {
                jSONObjectA = null;
            } else {
                if (Build.VERSION.SDK_INT < 31) {
                    zA2 = p0.a(this.f74403e, "android.permission.BLUETOOTH");
                } else {
                    zA2 = p0.a(this.f74403e, "android.permission.BLUETOOTH_CONNECT");
                }
                if (zA2) {
                    jSONObjectA = z7Var.a();
                } else {
                    jSONObjectA = null;
                }
            }
            w1Var.a(jSONObjectA);
        } catch (Throwable th2) {
            d9.a(th2);
        }
        if (z7Var != null) {
            try {
                GetBluetoothAsync$startUnsafe$1 getBluetoothAsync$startUnsafe$1 = z7Var.f75963c;
                if (getBluetoothAsync$startUnsafe$1 != null) {
                    z7Var.f75963c = null;
                    this.f74403e.unregisterReceiver(getBluetoothAsync$startUnsafe$1);
                }
            } catch (Throwable th3) {
                d9.a(th3);
            }
        }
        try {
            Object systemService = this.f74403e.getSystemService(Z3.f60408d);
            if ((systemService instanceof BluetoothManager) && (adapter = ((BluetoothManager) systemService).getAdapter()) != null) {
                if ((Build.VERSION.SDK_INT < 31 ? p0.a(this.f74403e, "android.permission.BLUETOOTH") : true) && adapter.isEnabled()) {
                    bluetoothAdapter = adapter;
                }
            }
            if (bluetoothAdapter != null) {
                if (Build.VERSION.SDK_INT < 31) {
                    zA = p0.a(this.f74403e, "android.permission.BLUETOOTH_ADMIN");
                } else {
                    zA = p0.a(this.f74403e, "android.permission.BLUETOOTH_SCAN");
                }
                if (zA) {
                    bluetoothAdapter.cancelDiscovery();
                }
            }
        } catch (Throwable th4) {
            d9.a(th4);
        }
    }
}
