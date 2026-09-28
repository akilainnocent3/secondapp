package defpackage;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.sportygames.common.framework.network.HTTPResponse;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class k52 {
    public final b5 a;

    public k52(b5 b5Var) {
        b5Var.getClass();
        this.a = b5Var;
    }

    public final Object a(k5b k5bVar, Function1 function1, x1b x1bVar) {
        return ej5.d(k5bVar, new c52(this, function1, null), x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(Function1 function1, x1b x1bVar) {
        f52 f52Var;
        ResponseBody responseBody;
        boolean zHasCapability;
        if (x1bVar instanceof f52) {
            f52Var = (f52) x1bVar;
            int i = f52Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f52Var.c = i - Integer.MIN_VALUE;
            } else {
                f52Var = new f52(this, x1bVar);
            }
        } else {
            f52Var = new f52(this, x1bVar);
        }
        Object objInvoke = f52Var.a;
        y5b y5bVar = y5b.a;
        int i2 = f52Var.c;
        HTTPResponse hTTPResponse = null;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                try {
                    Context appContext = this.a.getAppContext();
                    Object systemService = appContext != null ? appContext.getSystemService("connectivity") : null;
                    ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
                    if (connectivityManager != null) {
                        zHasCapability = false;
                        if (Build.VERSION.SDK_INT >= 29) {
                            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                            if (networkCapabilities != null) {
                                zHasCapability = networkCapabilities.hasCapability(12);
                            }
                        } else {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
                                zHasCapability = true;
                            }
                        }
                    } else {
                        zHasCapability = true;
                    }
                } catch (Exception unused) {
                }
                if (!zHasCapability) {
                    return ik50.b.a;
                }
                f52Var.c = 1;
                objInvoke = function1.invoke(f52Var);
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
                return new ik50.c(hTTPResponse2);
            }
            return new ik50.a(null, hTTPResponse2);
        } catch (NetworkErrorException unused2) {
            return ik50.b.a;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                return ik50.b.a;
            }
            if (!(th instanceof tom)) {
                return new ik50.a(null, null);
            }
            tom tomVar = th;
            try {
                bi50<?> bi50Var = tomVar.c;
                if (bi50Var != null && (responseBody = bi50Var.c) != null) {
                    hTTPResponse = (HTTPResponse) new eal().e(responseBody.toString(), HTTPResponse.class);
                }
            } catch (Exception unused3) {
            }
            return new ik50.a(new Integer(tomVar.a), hTTPResponse);
        }
    }
}
