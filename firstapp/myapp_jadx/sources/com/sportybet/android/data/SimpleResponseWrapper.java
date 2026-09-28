package com.sportybet.android.data;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.plugin.realsports.data.ServerProductStatus;
import com.sportybet.plugin.realsports.data.ServerProductStatusHelper;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleResponseWrapper<T> extends CallbackWrapper<BaseResponse<T>> {
    private int bizCode;
    private T data;
    private String message;
    private int total;

    public SimpleResponseWrapper() {
    }

    public final int getBizCode() {
        return this.bizCode;
    }

    public final T getData() {
        return this.data;
    }

    public final String getMessage() {
        return this.message;
    }

    public final ServerProductStatus getServerProductStatus() {
        return ServerProductStatusHelper.getServerProductStatus(getMessage());
    }

    public final int getTotal() {
        return this.total;
    }

    public void onFailure(Throwable th) {
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseFailure(Throwable th) {
        onFailure(th);
    }

    @Override // com.sportybet.android.data.CallbackWrapper
    public final void onResponseSuccess(BaseResponse<T> baseResponse) {
        this.bizCode = baseResponse.bizCode;
        this.message = baseResponse.message;
        this.total = baseResponse.total;
        this.data = baseResponse.data;
        if (baseResponse.hasData()) {
            onSuccess(this.data);
        } else {
            onFailure(new SprThrowable(this.bizCode, this.message, this.data == null));
        }
    }

    public void onSuccess(T t) {
    }

    public SimpleResponseWrapper(Fragment fragment) {
        super(fragment);
    }

    public SimpleResponseWrapper(Activity activity) {
        super(activity);
    }
}
