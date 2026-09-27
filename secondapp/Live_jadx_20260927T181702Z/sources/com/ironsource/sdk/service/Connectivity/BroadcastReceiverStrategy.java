package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C4181a4;
import com.ironsource.C4485r4;
import com.ironsource.InterfaceC4556v7;
import com.ironsource.InterfaceC4573w7;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class BroadcastReceiverStrategy implements InterfaceC4556v7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC4573w7 f64060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f64061b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = C4181a4.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f64060a.a();
            } else {
                BroadcastReceiverStrategy.this.f64060a.a(strB, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC4573w7 interfaceC4573w7) {
        this.f64060a = interfaceC4573w7;
    }

    @Override // com.ironsource.InterfaceC4556v7
    public void b(Context context) {
        try {
            context.registerReceiver(this.f64061b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            C4485r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC4556v7
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC4556v7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f64061b);
        } catch (IllegalArgumentException e10) {
            C4485r4.d().a(e10);
        } catch (Exception e11) {
            C4485r4.d().a(e11);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e11);
        }
    }

    @Override // com.ironsource.InterfaceC4556v7
    public void a() {
        this.f64061b = null;
    }
}
