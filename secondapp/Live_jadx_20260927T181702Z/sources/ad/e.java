package ad;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import com.digitalturbine.ignite.cl.aidl.IIgniteServiceAPI;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Context f4809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4810g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4811h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f4812i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public bd.a f4813j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public IIgniteServiceAPI f4814k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f4818o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public a f4819p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4805b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4806c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4807d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4808e = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Bundle f4815l = new Bundle();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f4816m = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f4820q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f4821r = new b(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final zc.a f4817n = new zc.a(this);

    public e(Context context) {
        String str = null;
        this.f4809f = context.getApplicationContext();
        Intent intent = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
        Context context2 = this.f4809f;
        if (context2 != null) {
            List<ResolveInfo> listQueryIntentServices = context2.getPackageManager().queryIntentServices(intent, 0);
            if (listQueryIntentServices.size() > 0) {
                str = listQueryIntentServices.get(0).serviceInfo.packageName;
            }
        }
        this.f4812i = str;
        this.f4813j = new bd.a(false, "");
    }

    @Override // ad.a
    public final boolean a() {
        IIgniteServiceAPI iIgniteServiceAPI;
        return this.f4808e && (iIgniteServiceAPI = this.f4814k) != null && iIgniteServiceAPI.asBinder().isBinderAlive();
    }

    @Override // ad.a
    public final void b() {
        if (TextUtils.isEmpty(this.f4812i)) {
            gd.b.b("%s : unable to authenticate - there is no ignite on the device", "IgniteAuthenticationComponent");
            return;
        }
        if (!a()) {
            jd.c.f99785a.execute(this.f4821r);
            return;
        }
        if (!this.f4805b || f()) {
            n();
            return;
        }
        Object[] objArr = {"IgniteAuthenticationComponent"};
        gd.a aVar = gd.b.f86434b.f86435a;
        if (aVar != null) {
            aVar.i("%s : already authenticated", objArr);
        }
    }

    @Override // ad.a
    public final void c(String str) {
        String str2;
        gd.b.a("%s: onAuthenticationSuccess", "IgniteAuthenticationComponent");
        this.f4806c = false;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4820q = str;
        this.f4815l.putString("clientToken", str);
        this.f4805b = true;
        String str3 = "";
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            try {
                str2 = new String(Base64.decode(str.split("\\.")[1], 8), "UTF-8");
            } catch (Exception e10) {
                gd.b.b("%s : decodeJwtBody : %s", "JwtUtil", e10.toString());
                str2 = "";
            }
        }
        if (!str2.isEmpty()) {
            try {
                long jOptLong = new JSONObject(str2).optLong("exp");
                this.f4807d = jOptLong;
                long millis = TimeUnit.SECONDS.toMillis(jOptLong);
                try {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(millis);
                    str3 = simpleDateFormat.format(calendar.getTime());
                } catch (Exception unused) {
                }
                gd.b.a("%s : Ignite session will exp in: %s", "IgniteAuthenticationComponent", str3);
            } catch (Exception e11) {
                cd.b.a(cd.d.ONE_DT_GENERAL_ERROR, e11);
                gd.b.b("%s: resolveSessionExpiryTime : unable resolve session expiration : %s", "IgniteAuthenticationComponent", e11.toString());
            }
        }
        a aVar = this.f4818o;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    @Override // ad.a
    public final String d() {
        return this.f4812i;
    }

    @Override // ad.a
    public final void destroy() {
        if (this.f4809f != null && a()) {
            this.f4809f.unbindService(this);
            this.f4809f = null;
        }
        this.f4819p = null;
        this.f4818o = null;
        this.f4814k = null;
    }

    @Override // ad.a
    public final String e() {
        return this.f4820q;
    }

    @Override // ad.a
    public final boolean f() {
        return this.f4807d > 0 && TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > this.f4807d;
    }

    @Override // ad.a
    public final Context g() {
        return this.f4809f;
    }

    @Override // ad.a
    public final boolean h() {
        return this.f4805b;
    }

    @Override // ad.a
    public final String i() {
        return this.f4813j.f21191a;
    }

    @Override // ad.a
    public final boolean j() {
        return this.f4813j.f21192b;
    }

    @Override // ad.a
    public final IIgniteServiceAPI k() {
        return this.f4814k;
    }

    @Override // ad.a
    public final void l() {
        b();
    }

    @Override // ad.a
    public final void m(a aVar) {
        this.f4818o = aVar;
    }

    public final void n() {
        if (a()) {
            String str = this.f4810g;
            String str2 = this.f4811h;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.f4806c) {
                return;
            }
            if ((f() || !this.f4805b) && this.f4814k != null) {
                try {
                    this.f4806c = true;
                    this.f4815l.putInt("sdkFlowTypeKey", 1);
                    this.f4814k.authenticate(this.f4810g, this.f4811h, this.f4815l, this.f4817n);
                } catch (RemoteException e10) {
                    this.f4806c = false;
                    cd.b.a(cd.d.ONE_DT_AUTHENTICATION_ERROR, e10);
                    gd.b.b("%s: startAuthenticationProcess: unable to start authentication : %s", "IgniteAuthenticationComponent", e10.toString());
                }
            }
        }
    }

    @Override // ed.b
    public final void onCredentialsRequestFailed(String str) {
        gd.b.b("%s: onCredentialsRequestFailed: %s", "IgniteAuthenticationComponent", str);
        b(str);
    }

    @Override // ed.b
    public final void onCredentialsRequestSuccess(String str, String str2) {
        this.f4810g = str;
        this.f4811h = str2;
        n();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        gd.b.a("%s : onIgniteConnected", "IgniteAuthenticationComponent");
        this.f4814k = IIgniteServiceAPI.Stub.asInterface(iBinder);
        this.f4808e = true;
        jd.c.f99785a.execute(new c(this, new d(this, componentName, iBinder)));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f4808e = false;
        this.f4807d = 0L;
        b("Service : " + (componentName != null ? componentName.getClassName() : "Ignite") + " disconnected");
    }

    @Override // ad.a
    public final void a(String str) {
        gd.b.b("%s : onAuthenticationFailed : %s", "IgniteAuthenticationComponent", str);
        this.f4806c = false;
        a aVar = this.f4818o;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    @Override // ad.a
    public final void k(a aVar) {
        this.f4819p = aVar;
    }

    @Override // ad.a
    public final void b(String str) {
        gd.b.b("%s : onIgniteFailedToConnect : %s", "IgniteAuthenticationComponent", str);
        a aVar = this.f4819p;
        if (aVar != null) {
            aVar.b(str);
        }
    }

    @Override // ad.a
    public final void c(ComponentName componentName, IBinder iBinder) {
        a aVar = this.f4819p;
        if (aVar != null) {
            aVar.c(componentName, iBinder);
        }
    }

    @Override // ad.a
    public final boolean c() {
        return f() || !a();
    }
}
