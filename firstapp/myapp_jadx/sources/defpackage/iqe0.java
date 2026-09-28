package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class iqe0 implements zny, wtg {
    public static final String y = jgt.g("SystemFgDispatcher");
    public final svj0 a;
    public final p5f0 b;
    public final Object c = new Object();
    public ivj0 d;
    public final LinkedHashMap e;
    public final HashMap f;
    public final HashMap i;
    public final ouj0 v;
    public SystemForegroundService w;

    public iqe0(Context context) {
        svj0 svj0VarC = svj0.c(context);
        this.a = svj0VarC;
        this.b = svj0VarC.d;
        this.d = null;
        this.e = new LinkedHashMap();
        this.i = new HashMap();
        this.f = new HashMap();
        this.v = new ouj0(svj0VarC.j);
        svj0VarC.f.a(this);
    }

    public static Intent b(Context context, ivj0 ivj0Var, pti ptiVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", ivj0Var.a);
        intent.putExtra("KEY_GENERATION", ivj0Var.b);
        intent.putExtra("KEY_NOTIFICATION_ID", ptiVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ptiVar.b);
        intent.putExtra("KEY_NOTIFICATION", ptiVar.c);
        return intent;
    }

    @Override // defpackage.wtg
    public final void a(ivj0 ivj0Var, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                c9p c9pVar = ((owj0) this.f.remove(ivj0Var)) != null ? (c9p) this.i.remove(ivj0Var) : null;
                if (c9pVar != null) {
                    c9pVar.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        pti ptiVar = (pti) this.e.remove(ivj0Var);
        if (ivj0Var.equals(this.d)) {
            if (this.e.size() > 0) {
                Iterator it = this.e.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.d = (ivj0) entry.getKey();
                if (this.w != null) {
                    pti ptiVar2 = (pti) entry.getValue();
                    SystemForegroundService systemForegroundService = this.w;
                    int i = ptiVar2.a;
                    int i2 = ptiVar2.b;
                    Notification notification = ptiVar2.c;
                    systemForegroundService.getClass();
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 31) {
                        SystemForegroundService.b.a(systemForegroundService, i, notification, i2);
                    } else if (i3 >= 29) {
                        SystemForegroundService.a.a(systemForegroundService, i, notification, i2);
                    } else {
                        systemForegroundService.startForeground(i, notification);
                    }
                    this.w.d.cancel(ptiVar2.a);
                }
            } else {
                this.d = null;
            }
        }
        SystemForegroundService systemForegroundService2 = this.w;
        if (ptiVar == null || systemForegroundService2 == null) {
            return;
        }
        jgt.e().a(y, "Removing Notification (id: " + ptiVar.a + ", workSpecId: " + ivj0Var + ", notificationType: " + ptiVar.b);
        systemForegroundService2.d.cancel(ptiVar.a);
    }

    public final void c(Intent intent) {
        if (this.w == null) {
            ib5.a("handleNotify was called on the destroyed dispatcher");
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        ivj0 ivj0Var = new ivj0(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        jgt jgtVarE = jgt.e();
        StringBuilder sbA = uqe0.a(intExtra, "Notifying with (id:", ", workSpecId: ", stringExtra, ", notificationType :");
        sbA.append(intExtra2);
        sbA.append(")");
        jgtVarE.a(y, sbA.toString());
        if (notification == null) {
            hb5.a("Notification passed in the intent was null.");
            return;
        }
        pti ptiVar = new pti(intExtra, notification, intExtra2);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.put(ivj0Var, ptiVar);
        pti ptiVar2 = (pti) linkedHashMap.get(this.d);
        if (ptiVar2 == null) {
            this.d = ivj0Var;
        } else {
            this.w.d.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((pti) ((Map.Entry) it.next()).getValue()).b;
                }
                ptiVar = new pti(ptiVar2.a, ptiVar2.c, i);
            } else {
                ptiVar = ptiVar2;
            }
        }
        SystemForegroundService systemForegroundService = this.w;
        int i2 = ptiVar.a;
        int i3 = ptiVar.b;
        Notification notification2 = ptiVar.c;
        systemForegroundService.getClass();
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31) {
            SystemForegroundService.b.a(systemForegroundService, i2, notification2, i3);
        } else if (i4 >= 29) {
            SystemForegroundService.a.a(systemForegroundService, i2, notification2, i3);
        } else {
            systemForegroundService.startForeground(i2, notification2);
        }
    }

    @Override // defpackage.zny
    public final void d(owj0 owj0Var, rxa rxaVar) {
        if (rxaVar instanceof rxa.b) {
            String str = owj0Var.a;
            jgt.e().a(y, "Constraints unmet for WorkSpec " + str);
            ivj0 ivj0VarA = jxj0.a(owj0Var);
            int i = ((rxa.b) rxaVar).a;
            svj0 svj0Var = this.a;
            svj0Var.d.d(new j1e0(svj0Var.f, new iwd0(ivj0VarA), true, i));
        }
    }

    public final void e() {
        this.w = null;
        synchronized (this.c) {
            try {
                Iterator it = this.i.values().iterator();
                while (it.hasNext()) {
                    ((c9p) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.f.f(this);
    }

    public final void f(int i) {
        jgt.e().f(y, "Foreground service timed out, FGS type: " + i);
        for (Map.Entry entry : this.e.entrySet()) {
            if (((pti) entry.getValue()).b == i) {
                ivj0 ivj0Var = (ivj0) entry.getKey();
                svj0 svj0Var = this.a;
                svj0Var.d.d(new j1e0(svj0Var.f, new iwd0(ivj0Var), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.w;
        if (systemForegroundService != null) {
            systemForegroundService.b = true;
            jgt.e().a(SystemForegroundService.e, "Shutting down.");
            if (Build.VERSION.SDK_INT >= 26) {
                systemForegroundService.stopForeground(true);
            }
            systemForegroundService.stopSelf();
        }
    }
}
