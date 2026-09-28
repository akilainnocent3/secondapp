package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import defpackage.jgt;
import defpackage.pbs;
import defpackage.upe0;
import defpackage.ywi0;
import defpackage.zwi0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class SystemAlarmService extends pbs {
    public static final String d = jgt.g("SystemAlarmService");
    public upe0 b;
    public boolean c;

    public final void a() {
        this.c = true;
        jgt.e().a(d, "All commands completed in dispatcher");
        String str = ywi0.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (zwi0.a) {
            linkedHashMap.putAll(zwi0.b);
            Unit unit = Unit.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                jgt.e().h(ywi0.a, "WakeLock held for " + str2);
            }
        }
        stopSelf();
    }

    @Override // defpackage.pbs, android.app.Service
    public final void onCreate() {
        super.onCreate();
        upe0 upe0Var = new upe0(this);
        this.b = upe0Var;
        if (upe0Var.w != null) {
            jgt.e().c(upe0.z, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            upe0Var.w = this;
        }
        this.c = false;
    }

    @Override // defpackage.pbs, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        upe0 upe0Var = this.b;
        upe0Var.getClass();
        jgt.e().a(upe0.z, "Destroying SystemAlarmDispatcher");
        upe0Var.d.f(upe0Var);
        upe0Var.w = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            jgt.e().f(d, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            upe0 upe0Var = this.b;
            upe0Var.getClass();
            jgt jgtVarE = jgt.e();
            String str = upe0.z;
            jgtVarE.a(str, "Destroying SystemAlarmDispatcher");
            upe0Var.d.f(upe0Var);
            upe0Var.w = null;
            upe0 upe0Var2 = new upe0(this);
            this.b = upe0Var2;
            if (upe0Var2.w != null) {
                jgt.e().c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                upe0Var2.w = this;
            }
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.b(intent, i2);
        return 3;
    }
}
