package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gvj0 implements Function0 {
    public final /* synthetic */ hvj0 a;
    public final /* synthetic */ UUID b;
    public final /* synthetic */ pti c;
    public final /* synthetic */ Context d;

    public /* synthetic */ gvj0(hvj0 hvj0Var, UUID uuid, pti ptiVar, Context context) {
        this.a = hvj0Var;
        this.b = uuid;
        this.c = ptiVar;
        this.d = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        hvj0 hvj0Var = this.a;
        UUID uuid = this.b;
        pti ptiVar = this.c;
        Context context = this.d;
        String string = uuid.toString();
        owj0 owj0VarJ = hvj0Var.c.j(string);
        if (owj0VarJ == null || owj0VarJ.b.a()) {
            ib5.a("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
            return null;
        }
        yy20 yy20Var = hvj0Var.b;
        synchronized (yy20Var.k) {
            try {
                jgt.e().f(yy20.l, "Moving WorkSpec (" + string + ") to the foreground");
                ayj0 ayj0Var = (ayj0) yy20Var.g.remove(string);
                if (ayj0Var != null) {
                    if (yy20Var.a == null) {
                        PowerManager.WakeLock wakeLockA = ywi0.a(yy20Var.b, "ProcessorForegroundLck");
                        yy20Var.a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    yy20Var.f.put(string, ayj0Var);
                    Intent intentB = iqe0.b(yy20Var.b, jxj0.a(ayj0Var.a), ptiVar);
                    Context context2 = yy20Var.b;
                    if (Build.VERSION.SDK_INT >= 26) {
                        o0b.a.b(context2, intentB);
                    } else {
                        context2.startService(intentB);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ivj0 ivj0VarA = jxj0.a(owj0VarJ);
        String str = iqe0.y;
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", ptiVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", ptiVar.b);
        intent.putExtra("KEY_NOTIFICATION", ptiVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", ivj0VarA.a);
        intent.putExtra("KEY_GENERATION", ivj0VarA.b);
        context.startService(intent);
        return null;
    }
}
