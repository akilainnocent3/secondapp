package defpackage;

import com.sporty.android.common.network.data.BaseResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class y7u {
    public static final <T> boolean a(bi50<T> bi50Var) {
        if (!bi50Var.a.getIsSuccessful()) {
            return false;
        }
        T t = bi50Var.b;
        BaseResponse baseResponse = t instanceof BaseResponse ? (BaseResponse) t : null;
        return baseResponse != null ? baseResponse.isSuccessful() : true;
    }
}
