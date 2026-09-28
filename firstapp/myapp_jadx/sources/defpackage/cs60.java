package defpackage;

import com.google.gson.stream.MalformedJsonException;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprDataThrowable;
import com.sporty.android.common.network.data.SprHttpErrorThrowable;
import com.sporty.android.common.network.data.SprThrowable;
import java.io.InterruptedIOException;
import java.lang.reflect.Type;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.Pair;
import kotlin.Unit;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes4.dex */
public final class cs60<T> implements su5<zi50<? extends T>> {
    public final su5<BaseResponse<T>> a;
    public final Type b;
    public final wsm c;
    public final xw9 d;

    public static final class a implements gv5<BaseResponse<T>> {
        public final /* synthetic */ gv5<zi50<T>> a;
        public final /* synthetic */ cs60<T> b;

        public a(gv5<zi50<T>> gv5Var, cs60<T> cs60Var) {
            this.a = gv5Var;
            this.b = cs60Var;
        }

        @Override // defpackage.gv5
        public final void onFailure(su5<BaseResponse<T>> su5Var, Throwable th) {
            th.getClass();
            boolean zIsCanceled = su5Var.isCanceled();
            cs60<T> cs60Var = this.b;
            this.a.onResponse(cs60Var, bi50.a(new zi50(cs60Var.b(th, zIsCanceled))));
        }

        @Override // defpackage.gv5
        public final void onResponse(su5<BaseResponse<T>> su5Var, bi50<BaseResponse<T>> bi50Var) {
            cs60<T> cs60Var = this.b;
            this.a.onResponse(cs60Var, bi50.a(new zi50(cs60Var.c(bi50Var))));
        }
    }

    public cs60(su5<BaseResponse<T>> su5Var, Type type, wsm wsmVar, xw9 xw9Var) {
        su5Var.getClass();
        wsmVar.getClass();
        xw9Var.getClass();
        this.a = su5Var;
        this.b = type;
        this.c = wsmVar;
        this.d = xw9Var;
    }

    @Override // defpackage.su5
    public final void G(gv5<zi50<T>> gv5Var) {
        gv5Var.getClass();
        this.a.G(new a(gv5Var, this));
    }

    public final void a(String str, Throwable th) {
        this.c.f(th, kpu.f(new Pair("origin", str), new Pair("url", request().url().getI())));
    }

    public final zi50.b b(Throwable th, boolean z) {
        if (z) {
            zi50.a aVar = zi50.b;
            return uj50.a(th);
        }
        boolean z2 = th instanceof UnknownHostException;
        xw9 xw9Var = this.d;
        if (z2 || (th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof SSLException) || (th instanceof SocketException) || (th instanceof InterruptedIOException)) {
            zi50.a aVar2 = zi50.b;
            xw9Var.getClass();
            th.getClass();
            return new zi50.b(th);
        }
        if ((th instanceof zdp) || (th instanceof MalformedJsonException)) {
            a("SafeResultCall.parseError", th);
            zi50.a aVar3 = zi50.b;
            xw9Var.getClass();
            return new zi50.b(th);
        }
        a("SafeResultCall.unexpectedError", th);
        zi50.a aVar4 = zi50.b;
        xw9Var.getClass();
        return new zi50.b(th);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    public final Object c(bi50<BaseResponse<T>> bi50Var) {
        SprThrowable sprThrowable;
        String strString;
        Object bVar;
        Throwable sprThrowable2;
        Object obj;
        boolean isSuccessful = bi50Var.a.getIsSuccessful();
        xw9 xw9Var = this.d;
        if (isSuccessful) {
            BaseResponse<T> baseResponse = bi50Var.b;
            if (baseResponse == null) {
                NullPointerException nullPointerException = new NullPointerException("Successful response for " + request().url() + " had a null body");
                a("SafeResultCall.unexpectedError", nullPointerException);
                zi50.a aVar = zi50.b;
                xw9Var.getClass();
                return new zi50.b(nullPointerException);
            }
            if (!baseResponse.isSuccessful()) {
                zi50.a aVar2 = zi50.b;
                int i = baseResponse.bizCode;
                String str = baseResponse.message;
                T t = baseResponse.data;
                xw9Var.getClass();
                if (t != null) {
                    sprThrowable = new SprDataThrowable(t, str != null ? str : "", i);
                } else {
                    sprThrowable = new SprThrowable(i, str != null ? str : "", true);
                }
                return new zi50.b(sprThrowable);
            }
            if (this.b == Unit.class) {
                zi50.a aVar3 = zi50.b;
                return Unit.a;
            }
            T t2 = baseResponse.data;
            if (t2 != null) {
                zi50.a aVar4 = zi50.b;
                return t2;
            }
            zi50.a aVar5 = zi50.b;
            int i2 = baseResponse.bizCode;
            String str2 = baseResponse.message;
            xw9Var.getClass();
            return new zi50.b(new SprThrowable(i2, str2 != null ? str2 : "", true));
        }
        tom tomVar = new tom(bi50Var);
        zi50.a aVar6 = zi50.b;
        xw9Var.getClass();
        SprHttpErrorThrowable sprHttpErrorThrowable = null;
        bi50<?> bi50Var2 = tomVar.c;
        if (bi50Var2 != null) {
            try {
                ResponseBody responseBody = bi50Var2.c;
                if (responseBody != null) {
                    strString = responseBody.string();
                } else {
                    strString = null;
                }
                if (strString != null || strString.length() == 0) {
                    obj = null;
                } else {
                    obj = (BaseResponse) new eal().e(strString, BaseResponse.class);
                }
                bVar = obj;
            } catch (Throwable th) {
                zi50.a aVar7 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            strString = null;
            if (strString != null) {
                obj = null;
            } else {
                obj = null;
            }
            bVar = obj;
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        BaseResponse baseResponse2 = (BaseResponse) bVar;
        if (baseResponse2 == null) {
            sprThrowable2 = null;
        } else {
            int i3 = baseResponse2.bizCode;
            String str3 = baseResponse2.message;
            sprThrowable2 = new SprThrowable(i3, str3 != null ? str3 : "", baseResponse2.data == null);
        }
        if (sprThrowable2 == null) {
            if (bi50Var2 != null) {
                Response response = bi50Var2.a;
                int iCode = response.code();
                String strMessage = response.message();
                strMessage.getClass();
                sprHttpErrorThrowable = new SprHttpErrorThrowable(iCode, strMessage);
            }
            if (sprHttpErrorThrowable != null) {
                sprThrowable2 = sprHttpErrorThrowable;
            } else {
                String str4 = tomVar.b;
                str4.getClass();
                sprThrowable2 = new SprHttpErrorThrowable(tomVar.a, str4);
            }
        }
        return new zi50.b(sprThrowable2);
    }

    @Override // defpackage.su5
    public final void cancel() {
        this.a.cancel();
    }

    @Override // defpackage.su5
    public final su5<zi50<T>> clone() {
        return new cs60(this.a.clone(), this.b, this.c, this.d);
    }

    @Override // defpackage.su5
    public final bi50<zi50<T>> execute() {
        su5<BaseResponse<T>> su5Var = this.a;
        try {
            bi50<BaseResponse<T>> bi50VarExecute = su5Var.execute();
            bi50VarExecute.getClass();
            return bi50.a(new zi50(c(bi50VarExecute)));
        } catch (Throwable th) {
            return bi50.a(new zi50(b(th, su5Var.isCanceled())));
        }
    }

    @Override // defpackage.su5
    public final boolean isCanceled() {
        return this.a.isCanceled();
    }

    @Override // defpackage.su5
    public final Request request() {
        Request request = this.a.request();
        request.getClass();
        return request;
    }
}
