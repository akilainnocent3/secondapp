package defpackage;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.NotificationChannel;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.webkit.WebView;
import com.android.installreferrer.api.InstallReferrerClient;
import com.pairip.StartupLauncher;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.auth.AuthService;
import d9.a;
import java.net.ProxySelector;
import java.util.Iterator;
import java.util.Timer;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes2.dex */
public class hp0 extends Application implements androidx.work.a.b, rdd, qw90.a {
    public static volatile hp0 A;
    public dll a;
    public uqm b;
    public y8j c;
    public psm d;
    public erb e;
    public volatile m9n f;
    public vsm i;
    public j8o v;
    public r6k w;
    public int y = 0;
    public final a z = new a();

    /* JADX INFO: loaded from: classes5.dex */
    @ejf
    public interface b {
        f00 A();

        r6k B();

        rot E();

        l9i L();

        jrm N();

        age P();

        ich R();

        dll Y();

        psm a();

        y8j d0();

        zoh e0();

        erb f0();

        uqm getAccountHelper();

        j8o n();

        ggt o();

        bs0 p();

        d9 s();

        vsm t();

        qdl y();

        m9n z();
    }

    static {
        StartupLauncher.launch();
    }

    @Override // qw90.a
    public final m9n a(Context context) {
        m9n m9nVar;
        m9n m9nVarA;
        m9n m9nVar2 = this.f;
        if (m9nVar2 != null) {
            return m9nVar2;
        }
        synchronized (this) {
            m9nVar = this.f;
            if (m9nVar == null) {
                try {
                    m9nVarA = ((b) fjf.a(this, b.class)).z();
                } catch (Exception e) {
                    itf0.a.p(e, "Failed to get CoilImageLoader from EarlyEntryPoints, using default", new Object[0]);
                    m9nVarA = new m9n.a(context).a();
                }
                m9nVar = m9nVarA;
                this.f = m9nVar;
            }
        }
        return m9nVar;
    }

    @Override // androidx.work.a.b
    public final androidx.work.a b() {
        androidx.work.a.C0076a c0076a = new androidx.work.a.C0076a();
        dll dllVar = this.a;
        dllVar.getClass();
        c0076a.a = dllVar;
        c0076a.b = 6;
        return new androidx.work.a(c0076a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application
    public void onCreate() {
        String processName;
        super.onCreate();
        A = this;
        Object[] objArr = 0;
        if (Build.VERSION.SDK_INT >= 28) {
            processName = Application.getProcessName();
        } else {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) getSystemService("activity");
            if (activityManager == null || activityManager.getRunningAppProcesses() == null) {
                processName = null;
                break;
            }
            try {
                Iterator<ActivityManager.RunningAppProcessInfo> it = activityManager.getRunningAppProcesses().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        processName = null;
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.pid == iMyPid) {
                        processName = next.processName;
                        break;
                    }
                    processName = null;
                    break;
                }
            } catch (Exception e) {
                itf0.a aVar = itf0.a;
                aVar.q(MyLog.TAG_COMMON);
                aVar.f(e, "getCurProcessName Exception", new Object[0]);
            }
        }
        if (getPackageName().equals(processName)) {
            int i = rpm.a;
            ProxySelector proxySelector = ProxySelector.getDefault();
            if (!(proxySelector instanceof ur60)) {
                ProxySelector.setDefault(new ur60(proxySelector));
            }
            b bVar = (b) fjf.a(this, b.class);
            bVar.e0().b();
            bVar.N();
            this.a = bVar.Y();
            this.d = bVar.a();
            this.e = bVar.f0();
            this.i = bVar.t();
            bVar.R();
            this.w = bVar.B();
            bs0 bs0VarP = bVar.p();
            age ageVarP = bVar.P();
            kbs kbsVar = ix20.w.f;
            kbsVar.a(this);
            kbsVar.a(bs0VarP);
            kbsVar.a(ageVarP);
            j8o j8oVarN = bVar.n();
            this.v = j8oVarN;
            registerActivityLifecycleCallbacks(j8oVarN.b());
            registerActivityLifecycleCallbacks(this.z);
            if (Build.VERSION.SDK_INT >= 28) {
                WebView.setDataDirectorySuffix(processName);
            }
            this.b = bVar.getAccountHelper();
            this.c = bVar.d0();
            kbsVar.a(bVar.o());
            getPackageManager().setComponentEnabledSetting(new ComponentName(this, (Class<?>) AuthService.class), 1, 1);
            this.d.a();
            String userId = this.b.getUserId();
            vsm vsmVar = this.i;
            if (userId == null) {
                userId = "UNKNOWN";
            }
            vsmVar.setUserId(userId);
            fkc fkcVar = new fkc(this, Thread.getDefaultUncaughtExceptionHandler(), this.e);
            Thread.setDefaultUncaughtExceptionHandler(fkcVar);
            o760.a = new gp0(fkcVar, objArr == true ? 1 : 0);
            f00 f00Var = vgb0.a;
            f00 f00VarA = bVar.A();
            vgb0.a = f00VarA;
            Iterator<T> it2 = vgb0.b.iterator();
            while (it2.hasNext()) {
                ((zqm) it2.next()).e(f00VarA);
            }
            l9i l9iVarL = bVar.L();
            ej5.c(l9iVarL.a, null, null, new k9i(l9iVarL, null), 3);
            Regex regex = nnn.a;
            nnn.a aVar2 = new nnn.a(this);
            nnn.c = aVar2;
            ao20.a aVar3 = aVar2.e;
            ohp<Object>[] ohpVarArr = nnn.a.f;
            ohp<Object> ohpVar = ohpVarArr[0];
            aVar3.getClass();
            ohpVar.getClass();
            ao20.d[] dVarArr = ao20.d.a;
            Object value = aVar3.a.c.getValue();
            value.getClass();
            String string = ((SharedPreferences) value).getString(ohpVar.getName(), null);
            String strA = nnn.a(string);
            nnn.d = strA;
            if (!Intrinsics.g(string, strA)) {
                nnn.a aVar4 = nnn.c;
                if (aVar4 == null) {
                    Intrinsics.n("configPreferences");
                    throw null;
                }
                aVar4.e.a(ohpVarArr[0], strA);
            }
            if (nnn.d == null) {
                InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(this).build();
                installReferrerClientBuild.getClass();
                nnn.b = installReferrerClientBuild;
                installReferrerClientBuild.startConnection(new onn());
            }
            ao20.a aVar5 = ((r7d.a) r7d.a.getValue()).e;
            ohp<Object> ohpVar2 = r7d.a.f[0];
            aVar5.getClass();
            ohpVar2.getClass();
            Object value2 = aVar5.a.c.getValue();
            value2.getClass();
            r7d.b = ((SharedPreferences) value2).getString(ohpVar2.getName(), null);
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 26) {
                gx0 gx0Var = new gx0();
                NotificationChannel notificationChannel = new NotificationChannel("toolbar", "Toolbar", 3);
                notificationChannel.enableLights(false);
                notificationChannel.enableVibration(false);
                notificationChannel.setLightColor(-16711936);
                gx0Var.addLast(notificationChannel);
                NotificationChannel notificationChannel2 = new NotificationChannel("download", "Download", 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setLightColor(-16711936);
                gx0Var.addLast(notificationChannel2);
                gx0Var.addLast(new NotificationChannel("otp", "OTP", 4));
                gx0Var.addLast(new NotificationChannel("FCMText", "Text Notification", 3));
                gx0Var.addLast(new NotificationChannel("FCMPic", "Image Notification", 4));
                gx0Var.addLast(new NotificationChannel("FCM_LCP", "Live Events", 4));
                gx0Var.addLast(new NotificationChannel("PLEASED_VOICE", "Customer Service Voice Call", 3));
                t2y t2yVar = new t2y(this);
                if (i2 >= 26) {
                    t2yVar.b.deleteNotificationChannel("chat");
                }
                t2y t2yVar2 = new t2y(this);
                if (i2 >= 26) {
                    t2yVar2.b.createNotificationChannels(gx0Var);
                }
            }
            d9 d9VarS = bVar.s();
            uqm uqmVar = d9VarS.d;
            uqmVar.addAccountChangeListener(d9VarS);
            d9VarS.onAccountChange(uqmVar.getAccount());
            oti.c().a(d9VarS);
            if (d9VarS.c == null) {
                long jC = d9VarS.w.c("forbidden_access_check_frequency");
                if (jC <= 0) {
                    jC = 10;
                }
                Timer timer = new Timer();
                d9VarS.c = timer;
                timer.schedule(d9VarS.new a(), 1L, jC * RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
                itf0.a aVar6 = itf0.a;
                aVar6.q(MyLog.TAG_COMMON);
                aVar6.a("create timer: %s", Long.valueOf(jC));
            }
            rot rotVarE = bVar.E();
            rot rotVar = yup.a;
            if ((rotVar != null || rotVarE != null) && (rotVar == null || !rotVar.equals(rotVarE))) {
                yup.a = rotVarE;
                yup.b = null;
            }
            qdl qdlVarY = bVar.y();
            Object systemService = qdlVarY.a.getSystemService("activity");
            ActivityManager activityManager2 = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager2 != null ? activityManager2.isLowRamDevice() : false) {
                return;
            }
            ej5.c(qdlVarY.f, null, null, new pdl(qdlVarY, null), 3);
        }
    }

    @Override // defpackage.rdd
    public final void onDestroy(ibs ibsVar) {
        r6k r6kVar = this.w;
        r6kVar.getClass();
        try {
            zi50.a aVar = zi50.b;
            w5b.c(r6kVar.b, null);
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        unregisterActivityLifecycleCallbacks(this.z);
        unregisterActivityLifecycleCallbacks(this.v.b());
    }

    @Override // defpackage.rdd
    public final void onPause(ibs ibsVar) {
        r6k r6kVar = this.w;
        jvd0 jvd0Var = r6kVar.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        r6kVar.c = null;
        this.i.b(false);
    }

    @Override // defpackage.rdd
    public final void onResume(ibs ibsVar) {
        this.w.a();
        this.i.b(true);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (activity.getComponentName().getClassName().equals("com.google.android.play.core.common.PlayCoreDialogWrapperActivity")) {
                f00 f00Var = vgb0.a;
                vgb0.a(AnalyticsEvent.IN_APP_REVIEW_RATING);
            }
            hp0.this.y++;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            hp0.this.y--;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
