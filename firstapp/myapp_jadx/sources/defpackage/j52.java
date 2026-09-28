package defpackage;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.sportygames.compose.chat.data.model.HTTPResponse;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class j52 {
    public final b5 a;

    public j52(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function1 function1, x1b x1bVar) {
        e52 e52Var;
        ResponseBody responseBody;
        NetworkInfo activeNetworkInfo;
        NetworkCapabilities networkCapabilities;
        if (x1bVar instanceof e52) {
            e52Var = (e52) x1bVar;
            int i = e52Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                e52Var.c = i - Integer.MIN_VALUE;
            } else {
                e52Var = new e52(this, x1bVar);
            }
        } else {
            e52Var = new e52(this, x1bVar);
        }
        Object objInvoke = e52Var.a;
        y5b y5bVar = y5b.a;
        int i2 = e52Var.c;
        HTTPResponse hTTPResponse = null;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                try {
                    Context appContext = this.a.getAppContext();
                    ConnectivityManager connectivityManager = (ConnectivityManager) (appContext != null ? appContext.getSystemService("connectivity") : null);
                    if (connectivityManager != null && (Build.VERSION.SDK_INT < 29 ? (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting() : (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) == null || (!networkCapabilities.hasTransport(0) && !networkCapabilities.hasTransport(1)))) {
                        return jk50.b.a;
                    }
                } catch (Exception unused) {
                }
                e52Var.c = 1;
                objInvoke = function1.invoke(e52Var);
                if (objInvoke == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objInvoke);
            }
            objInvoke.getClass();
            HTTPResponse hTTPResponse2 = (HTTPResponse) objInvoke;
            Integer bizCode = hTTPResponse2.getBizCode();
            if (bizCode != null && bizCode.intValue() == 10000) {
                return new jk50.c(hTTPResponse2);
            }
            return new jk50.a(null, hTTPResponse2);
        } catch (NetworkErrorException unused2) {
            return jk50.b.a;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                return jk50.b.a;
            }
            if (!(th instanceof tom)) {
                return new jk50.a(null, null);
            }
            tom tomVar = th;
            try {
                bi50<?> bi50Var = tomVar.c;
                if (bi50Var != null && (responseBody = bi50Var.c) != null) {
                    hTTPResponse = (HTTPResponse) new eal().e(responseBody.toString(), HTTPResponse.class);
                }
            } catch (Exception unused3) {
            }
            return new jk50.a(new Integer(tomVar.a), hTTPResponse);
        }
    }
}
