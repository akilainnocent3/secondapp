package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportynews.data.HeroArticleList;
import com.sporty.android.sportynews.data.NewsArticleList;
import com.sporty.android.sportynews.data.SubArticleList;
import com.sportybet.android.instantwin.newtork.model.error.ErrorCode;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class xtc0 {
    public final wsc0 a;
    public jvd0 b;
    public jvd0 c;
    public jvd0 d;
    public jvd0 e;

    public xtc0(wsc0 wsc0Var) {
        wsc0Var.getClass();
        this.a = wsc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.sporty.android.sportynews.data.NewsArticleList] */
    public static BaseResponse a(BaseResponse baseResponse, BaseResponse baseResponse2) {
        int i;
        String str;
        BaseResponse baseResponse3 = new BaseResponse();
        if ((baseResponse != null && baseResponse.isSuccessful()) || (baseResponse2 != null && baseResponse2.isSuccessful())) {
            i = 10000;
        } else if (baseResponse != null) {
            i = baseResponse.bizCode;
        } else {
            i = baseResponse2 != null ? baseResponse2.bizCode : ErrorCode.INVALID;
        }
        baseResponse3.bizCode = i;
        if (i == 10000) {
            str = "";
        } else if (baseResponse == null || (str = baseResponse.message) == null) {
            str = "Unknown error";
        }
        baseResponse3.message = str;
        baseResponse3.data = new NewsArticleList(baseResponse != null ? (HeroArticleList) baseResponse.data : null, baseResponse2 != null ? (SubArticleList) baseResponse2.data : null);
        return baseResponse3;
    }

    public final void b(et7 et7Var, String str, String str2, Function1 function1) {
        str.getClass();
        str2.getClass();
        jvd0 jvd0Var = this.e;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.e = kzh.d(new g1i(new yzh(new xzh(new ttc0(this.a.b(str, str2)), new utc0(2, null)), new vtc0(3, null)), new wtc0(function1, null)), et7Var);
    }
}
