package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.HandlerThread;
import android.view.InputEvent;
import com.google.android.gms.common.ConnectionResult;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class y3l implements gv5 {
    public static final Object a = new Object();
    public static wrl0 b;
    public static HandlerThread c;

    public static wrl0 h(Context context) {
        wrl0 wrl0Var;
        synchronized (a) {
            try {
                wrl0Var = b;
                if (wrl0Var == null) {
                    wrl0Var = new wrl0(context.getApplicationContext(), context.getMainLooper());
                    b = wrl0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wrl0Var;
    }

    public abstract void a(hq60 hq60Var, Object obj);

    public abstract String b();

    public uov c(apv apvVar) {
        ByteBuffer byteBuffer = apvVar.d;
        byteBuffer.getClass();
        ly0.b(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        return d(apvVar, byteBuffer);
    }

    public abstract uov d(apv apvVar, ByteBuffer byteBuffer);

    public abstract void e(pep pepVar);

    public abstract php f(ygp ygpVar, List list);

    public abstract boolean g();

    public abstract Object i(v1b v1bVar);

    public abstract tae j(ygp ygpVar, String str);

    public abstract he80 k(ygp ygpVar, Object obj);

    public abstract float l(Object obj);

    public void m(vp60 vp60Var, Object obj) {
        vp60Var.getClass();
        if (obj == null) {
            return;
        }
        hq60 hq60VarH1 = vp60Var.H1(b());
        try {
            a(hq60VarH1, obj);
            hq60VarH1.D1();
            vc1.a(hq60VarH1, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    public void n(vp60 vp60Var, ArrayList arrayList) {
        hq60 hq60VarH1 = vp60Var.H1(b());
        try {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                if (obj != null) {
                    a(hq60VarH1, obj);
                    hq60VarH1.D1();
                    hq60VarH1.reset();
                }
            }
            Unit unit = Unit.a;
            vc1.a(hq60VarH1, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                vc1.a(hq60VarH1, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.gv5
    public void onFailure(su5 su5Var, Throwable th) {
        o(new kbg(-1000, th));
    }

    @Override // defpackage.gv5
    public void onResponse(su5 su5Var, bi50 bi50Var) {
        String strString;
        Response response = bi50Var.a;
        if (response.getIsSuccessful()) {
            p(su5Var, bi50Var.b);
            return;
        }
        try {
            strString = bi50Var.c.string();
        } catch (IOException unused) {
            o(new wcg(-9999, su5Var.request().url().getI(), "can not get ErrorBody"));
            strString = "";
        }
        try {
            int iCode = response.code();
            JSONObject jSONObject = new JSONObject(strString);
            if (iCode != 401) {
                o(new wcg(jSONObject.getInt("errorCode"), jSONObject.getString("errorName"), jSONObject.getString("causeMsg")));
            } else if (jSONObject.getString("causeMsg").contains("globally")) {
                o(new wcg(63100, su5Var.request().url().getI(), "Error! Game is not available in your country."));
            } else {
                o(new wcg(63100, su5Var.request().url().getI(), "Please contact customer service for more information."));
            }
        } catch (Exception unused2) {
            o(new wcg(-9999, su5Var.request().url().getI(), strString));
        }
    }

    public abstract void p(su5 su5Var, Object obj);

    public abstract Object q(hqa0 hqa0Var, v1b v1bVar);

    public abstract Object r(Uri uri, InputEvent inputEvent, v1b v1bVar);

    public abstract Object s(Uri uri, v1b v1bVar);

    public abstract void t(Object obj, float f);

    public abstract ConnectionResult u(rll0 rll0Var, fzk0 fzk0Var, String str, Executor executor);

    public abstract void v(rll0 rll0Var, ServiceConnection serviceConnection);

    public void o(mb5 mb5Var) {
    }
}
