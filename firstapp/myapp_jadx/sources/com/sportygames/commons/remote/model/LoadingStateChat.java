package com.sportygames.commons.remote.model;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/sportygames/commons/remote/model/LoadingStateChat;", "T", "", AnalyticsParam.EVENT_STATUS, "Lcom/sportygames/commons/remote/model/StatusChat;", "data", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "Lcom/sportygames/commons/remote/model/ResultChatWrapper$GenericError;", "networkError", "Lcom/sportygames/commons/remote/model/ResultChatWrapper$NetworkError;", "<init>", "(Lcom/sportygames/commons/remote/model/StatusChat;Ljava/lang/Object;Lcom/sportygames/commons/remote/model/ResultChatWrapper$GenericError;Lcom/sportygames/commons/remote/model/ResultChatWrapper$NetworkError;)V", "getStatus", "()Lcom/sportygames/commons/remote/model/StatusChat;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/sportygames/commons/remote/model/ResultChatWrapper$GenericError;", "getNetworkError", "()Lcom/sportygames/commons/remote/model/ResultChatWrapper$NetworkError;", "component1", "component2", "component3", "component4", "copy", "(Lcom/sportygames/commons/remote/model/StatusChat;Ljava/lang/Object;Lcom/sportygames/commons/remote/model/ResultChatWrapper$GenericError;Lcom/sportygames/commons/remote/model/ResultChatWrapper$NetworkError;)Lcom/sportygames/commons/remote/model/LoadingStateChat;", "equals", "", "other", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoadingStateChat<T> {
    public static final int $stable = 0;
    private final T data;
    private final ResultChatWrapper.GenericError error;
    private final ResultChatWrapper.NetworkError networkError;
    private final StatusChat status;

    public LoadingStateChat(StatusChat statusChat, T t, ResultChatWrapper.GenericError genericError, ResultChatWrapper.NetworkError networkError) {
        statusChat.getClass();
        this.status = statusChat;
        this.data = t;
        this.error = genericError;
        this.networkError = networkError;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadingStateChat copy$default(LoadingStateChat loadingStateChat, StatusChat statusChat, Object obj, ResultChatWrapper.GenericError genericError, ResultChatWrapper.NetworkError networkError, int i, Object obj2) {
        if ((i & 1) != 0) {
            statusChat = loadingStateChat.status;
        }
        if ((i & 2) != 0) {
            obj = loadingStateChat.data;
        }
        if ((i & 4) != 0) {
            genericError = loadingStateChat.error;
        }
        if ((i & 8) != 0) {
            networkError = loadingStateChat.networkError;
        }
        return loadingStateChat.copy(statusChat, obj, genericError, networkError);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StatusChat getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResultChatWrapper.GenericError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResultChatWrapper.NetworkError getNetworkError() {
        return this.networkError;
    }

    public final LoadingStateChat<T> copy(StatusChat status, T data, ResultChatWrapper.GenericError error, ResultChatWrapper.NetworkError networkError) {
        status.getClass();
        return new LoadingStateChat<>(status, data, error, networkError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingStateChat)) {
            return false;
        }
        LoadingStateChat loadingStateChat = (LoadingStateChat) other;
        return this.status == loadingStateChat.status && Intrinsics.g(this.data, loadingStateChat.data) && Intrinsics.g(this.error, loadingStateChat.error) && Intrinsics.g(this.networkError, loadingStateChat.networkError);
    }

    public final T getData() {
        return this.data;
    }

    public final ResultChatWrapper.GenericError getError() {
        return this.error;
    }

    public final ResultChatWrapper.NetworkError getNetworkError() {
        return this.networkError;
    }

    public final StatusChat getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        ResultChatWrapper.GenericError genericError = this.error;
        int iHashCode3 = (iHashCode2 + (genericError == null ? 0 : genericError.hashCode())) * 31;
        ResultChatWrapper.NetworkError networkError = this.networkError;
        return iHashCode3 + (networkError != null ? networkError.hashCode() : 0);
    }

    public String toString() {
        return "LoadingStateChat(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ", networkError=" + this.networkError + ")";
    }
}
