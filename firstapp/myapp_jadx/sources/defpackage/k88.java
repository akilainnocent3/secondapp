package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k88 implements wtg {
    public static final String f = jgt.g("CommandHandler");
    public final Context a;
    public final HashMap b = new HashMap();
    public final Object c = new Object();
    public final dqe0 d;
    public final qpe0 e;

    public k88(Context context, dqe0 dqe0Var, qpe0 qpe0Var) {
        this.a = context;
        this.d = dqe0Var;
        this.e = qpe0Var;
    }

    public static ivj0 c(Intent intent) {
        return new ivj0(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void d(Intent intent, ivj0 ivj0Var) {
        intent.putExtra("KEY_WORKSPEC_ID", ivj0Var.a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", ivj0Var.b);
    }

    @Override // defpackage.wtg
    public final void a(ivj0 ivj0Var, boolean z) {
        synchronized (this.c) {
            try {
                kkd kkdVar = (kkd) this.b.remove(ivj0Var);
                this.e.b(ivj0Var);
                if (kkdVar != null) {
                    kkdVar.e(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(int i, upe0 upe0Var, Intent intent) {
        List<iwd0> listC;
        ArrayList arrayList;
        String action = intent.getAction();
        int i2 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            jgt.e().a(f, "Handling constraints changed " + intent);
            Context context = this.a;
            nxa nxaVar = new nxa(context, this.d, i, upe0Var);
            ArrayList arrayListG = upe0Var.e.c.C().g();
            String str = ConstraintProxy.a;
            int size = arrayListG.size();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayListG.get(i3);
                i3++;
                lxa lxaVar = ((owj0) obj).j;
                z |= lxaVar.e;
                z2 |= lxaVar.c;
                z3 |= lxaVar.f;
                z4 |= lxaVar.a != sox.a;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList2 = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            int size2 = arrayListG.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayListG.get(i4);
                i4++;
                owj0 owj0Var = (owj0) obj2;
                if (jCurrentTimeMillis >= owj0Var.a() && (!owj0Var.c() || nxaVar.b.a(owj0Var))) {
                    arrayList2.add(owj0Var);
                }
            }
            int size3 = arrayList2.size();
            while (i2 < size3) {
                Object obj3 = arrayList2.get(i2);
                i2++;
                owj0 owj0Var2 = (owj0) obj3;
                String str3 = owj0Var2.a;
                ivj0 ivj0VarA = jxj0.a(owj0Var2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                d(intent3, ivj0VarA);
                jgt.e().a(nxa.c, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                upe0Var.b.a().execute(new upe0.b(nxaVar.a, upe0Var, intent3));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            jgt.e().a(f, "Handling reschedule " + intent + ", " + i);
            upe0Var.e.f();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            jgt.e().c(f, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.a;
            ivj0 ivj0VarC = c(intent);
            jgt jgtVarE = jgt.e();
            String str4 = f;
            jgtVarE.a(str4, "Handling schedule work for " + ivj0VarC);
            WorkDatabase workDatabase = upe0Var.e.c;
            workDatabase.c();
            try {
                owj0 owj0VarJ = workDatabase.C().j(ivj0VarC.a);
                if (owj0VarJ == null) {
                    jgt.e().h(str4, "Skipping scheduling " + ivj0VarC + " because it's no longer in the DB");
                    return;
                }
                if (owj0VarJ.b.a()) {
                    jgt.e().h(str4, "Skipping scheduling " + ivj0VarC + "because it is finished.");
                    return;
                }
                long jA = owj0VarJ.a();
                if (owj0VarJ.c()) {
                    jgt.e().a(str4, "Opportunistically setting an alarm for " + ivj0VarC + "at " + jA);
                    bs.b(context2, workDatabase, ivj0VarC, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    upe0Var.b.a().execute(new upe0.b(i, upe0Var, intent4));
                } else {
                    jgt.e().a(str4, "Setting up Alarms for " + ivj0VarC + "at " + jA);
                    bs.b(context2, workDatabase, ivj0VarC, jA);
                }
                workDatabase.v();
                return;
            } finally {
                workDatabase.r();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.c) {
                try {
                    ivj0 ivj0VarC2 = c(intent);
                    jgt jgtVarE2 = jgt.e();
                    String str5 = f;
                    jgtVarE2.a(str5, "Handing delay met for " + ivj0VarC2);
                    if (this.b.containsKey(ivj0VarC2)) {
                        jgt.e().a(str5, "WorkSpec " + ivj0VarC2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        kkd kkdVar = new kkd(this.a, i, upe0Var, this.e.d(ivj0VarC2));
                        this.b.put(ivj0VarC2, kkdVar);
                        kkdVar.c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                jgt.e().h(f, "Ignoring intent " + intent);
                return;
            }
            ivj0 ivj0VarC3 = c(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            jgt.e().a(f, "Handling onExecutionCompleted " + intent + ", " + i);
            a(ivj0VarC3, z5);
            return;
        }
        qpe0 qpe0Var = this.e;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i5 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            arrayList = new ArrayList(1);
            iwd0 iwd0VarB = qpe0Var.b(new ivj0(string, i5));
            if (iwd0VarB != null) {
                listC = arrayList;
                arrayList.add(iwd0VarB);
                listC = arrayList;
            }
        } else {
            listC = qpe0Var.c(string);
        }
        listC = arrayList;
        for (iwd0 iwd0Var : listC) {
            jgt.e().a(f, "Handing stopWork work for " + string);
            ovj0 ovj0Var = upe0Var.y;
            ovj0Var.getClass();
            iwd0Var.getClass();
            ovj0Var.a(iwd0Var, -512);
            Context context3 = this.a;
            WorkDatabase workDatabase2 = upe0Var.e.c;
            ivj0 ivj0Var = iwd0Var.a;
            String str6 = bs.a;
            lqe0 lqe0VarZ = workDatabase2.z();
            kqe0 kqe0VarD = lqe0VarZ.d(ivj0Var);
            if (kqe0VarD != null) {
                bs.a(context3, ivj0Var, kqe0VarD.c);
                jgt.e().a(bs.a, "Removing SystemIdInfo for workSpecId (" + ivj0Var + ")");
                lqe0VarZ.b(ivj0Var);
            }
            upe0Var.a(iwd0Var.a, false);
        }
    }
}
