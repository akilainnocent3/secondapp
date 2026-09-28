package defpackage;

import android.content.Context;
import android.os.Build;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;

/* JADX INFO: loaded from: classes4.dex */
public final class tzf0 extends p32 {
    public static final AccountHelperEntryPointImpl a = new AccountHelperEntryPointImpl();
    public static final x840 b = new x840();
    public static boolean c = false;

    public static void i(Context context, int i) {
        if (context == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_COMMON);
        aVar.l("show toolbar notification by Notification Manager, openBetsCount: %s", Integer.valueOf(i));
        g1y g1yVarB = b5y.b(context, "toolbar");
        g1yVarB.s = b5y.c(i, context, false);
        g1yVarB.d(16, false);
        g1yVarB.d(2, true);
        g1yVarB.x = true;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            g1yVarB.d(8, true);
        }
        if (i2 >= 31) {
            g1yVarB.t = b5y.c(i, context, true);
        }
        p32.h(context, 500000, g1yVarB.a());
    }

    public static void j(Context context, int i) {
        if (context == null) {
            return;
        }
        rzf0 rzf0Var = new rzf0(context, i);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        m2l m2lVarJ = ((l1y.a) qag.a(applicationContext, l1y.a.class)).j();
        m1y m1yVar = new m1y(rzf0Var);
        zu7.a aVar = zu7.a;
        v5b v5bVarA = zu7.a();
        m2lVarJ.getClass();
        v5bVarA.getClass();
        zed zedVar = m2lVarJ.a;
        zedVar.getClass();
        pfd pfdVar = fse.a;
        ej5.c(v5bVarA, odd.b, null, new afd(zedVar, "notification_on", true, m1yVar, null), 2);
    }
}
