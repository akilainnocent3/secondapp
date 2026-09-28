package defpackage;

import android.accounts.NetworkErrorException;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes7.dex */
public final class i52 {
    public static final i52 a = new i52();

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function1 function1, x1b x1bVar) {
        d52 d52Var;
        Object genericError;
        ResponseBody responseBody;
        boolean zHasCapability;
        if (x1bVar instanceof d52) {
            d52Var = (d52) x1bVar;
            int i = d52Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                d52Var.c = i - Integer.MIN_VALUE;
            } else {
                d52Var = new d52(this, x1bVar);
            }
        } else {
            d52Var = new d52(this, x1bVar);
        }
        Object objInvoke = d52Var.a;
        y5b y5bVar = y5b.a;
        int i2 = d52Var.c;
        HTTPResponse hTTPResponse = null;
        try {
            if (i2 == 0) {
                uj50.b(objInvoke);
                try {
                    Object systemService = SportyGamesManager.getApplicationContext().getSystemService("connectivity");
                    systemService.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    zHasCapability = false;
                    if (Build.VERSION.SDK_INT >= 29) {
                        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                        if (networkCapabilities != null) {
                            zHasCapability = networkCapabilities.hasCapability(12);
                        }
                    } else {
                        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                        if (activeNetworkInfo != null) {
                            zHasCapability = activeNetworkInfo.isConnectedOrConnecting() ? true : true;
                        }
                    }
                } catch (Exception unused) {
                }
                if (!zHasCapability) {
                    return ResultWrapper.NetworkError.INSTANCE;
                }
                d52Var.c = 1;
                objInvoke = function1.invoke(d52Var);
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
            genericError = (bizCode != null && bizCode.intValue() == 10000) ? new ResultWrapper.Success(hTTPResponse2) : new ResultWrapper.GenericError(null, hTTPResponse2);
        } catch (NetworkErrorException unused2) {
            return ResultWrapper.NetworkError.INSTANCE;
        } catch (Throwable th) {
            if (th instanceof IOException) {
                return ResultWrapper.NetworkError.INSTANCE;
            }
            if (!(th instanceof tom)) {
                return new ResultWrapper.GenericError(null, null);
            }
            tom tomVar = th;
            try {
                bi50<?> bi50Var = tomVar.c;
                if (bi50Var != null && (responseBody = bi50Var.c) != null) {
                    hTTPResponse = (HTTPResponse) new eal().e(responseBody.toString(), HTTPResponse.class);
                }
            } catch (Exception unused3) {
            }
            genericError = new ResultWrapper.GenericError(new Integer(tomVar.a), hTTPResponse);
        }
        return genericError;
    }
}
