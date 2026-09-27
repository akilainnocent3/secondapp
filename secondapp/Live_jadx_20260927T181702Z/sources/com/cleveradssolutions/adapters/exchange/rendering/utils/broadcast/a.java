package com.cleveradssolutions.adapters.exchange.rendering.utils.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.view.WindowManager;
import com.cleveradssolutions.adapters.exchange.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f42505d = "zz";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f42506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f42507b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42508c;

    public boolean a() {
        b.h(f42505d, "isOrientationChanged: " + this.f42508c);
        return this.f42508c;
    }

    public void b() {
        if (this.f42506a != null) {
            b.h(f42505d, "unregister");
            this.f42506a.unregisterReceiver(this);
            this.f42506a = null;
        }
    }

    public final int c() {
        return ((WindowManager) this.f42506a.getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public void d(int i10) {
        b.h(f42505d, "handleOrientationChange currentRotation = " + i10);
    }

    public void e(Context context) {
        if (context != null) {
            b.h(f42505d, "register");
            Context applicationContext = context.getApplicationContext();
            this.f42506a = applicationContext;
            if (applicationContext != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"), 4);
                } else {
                    applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                }
            }
        }
    }

    public void f(boolean z10) {
        b.h(f42505d, "setOrientationChanged: " + z10);
        this.f42508c = z10;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        b.h(f42505d, "onReceive");
        if ("android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction())) {
            int iC = c();
            if (iC == this.f42507b) {
                f(false);
                return;
            }
            this.f42507b = iC;
            f(true);
            d(this.f42507b);
        }
    }
}
