package com.sportygames.commons.remote.model;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BK\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0012J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003JZ\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/sportygames/commons/remote/model/LoadingState;", "T", "", AnalyticsParam.EVENT_STATUS, "Lcom/sportygames/commons/remote/model/Status;", "data", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;", "networkError", "Lcom/sportygames/commons/remote/model/ResultWrapper$NetworkError;", "additionalInfo", "", "", "<init>", "(Lcom/sportygames/commons/remote/model/Status;Ljava/lang/Object;Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;Lcom/sportygames/commons/remote/model/ResultWrapper$NetworkError;Ljava/util/Map;)V", "getStatus", "()Lcom/sportygames/commons/remote/model/Status;", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;", "getNetworkError", "()Lcom/sportygames/commons/remote/model/ResultWrapper$NetworkError;", "getAdditionalInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/sportygames/commons/remote/model/Status;Ljava/lang/Object;Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;Lcom/sportygames/commons/remote/model/ResultWrapper$NetworkError;Ljava/util/Map;)Lcom/sportygames/commons/remote/model/LoadingState;", "equals", "", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LoadingState<T> {
    public static final int $stable = 8;
    private final Map<String, String> additionalInfo;
    private final T data;
    private final ResultWrapper.GenericError error;
    private final ResultWrapper.NetworkError networkError;
    private final Status status;

    public /* synthetic */ LoadingState(Status status, Object obj, ResultWrapper.GenericError genericError, ResultWrapper.NetworkError networkError, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : genericError, (i & 8) != 0 ? null : networkError, (i & 16) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoadingState copy$default(LoadingState loadingState, Status status, Object obj, ResultWrapper.GenericError genericError, ResultWrapper.NetworkError networkError, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            status = loadingState.status;
        }
        if ((i & 2) != 0) {
            obj = loadingState.data;
        }
        if ((i & 4) != 0) {
            genericError = loadingState.error;
        }
        if ((i & 8) != 0) {
            networkError = loadingState.networkError;
        }
        if ((i & 16) != 0) {
            map = loadingState.additionalInfo;
        }
        Map map2 = map;
        ResultWrapper.GenericError genericError2 = genericError;
        return loadingState.copy(status, obj, genericError2, networkError, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ResultWrapper.GenericError getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ResultWrapper.NetworkError getNetworkError() {
        return this.networkError;
    }

    public final Map<String, String> component5() {
        return this.additionalInfo;
    }

    public final LoadingState<T> copy(Status status, T data, ResultWrapper.GenericError error, ResultWrapper.NetworkError networkError, Map<String, String> additionalInfo) {
        status.getClass();
        return new LoadingState<>(status, data, error, networkError, additionalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadingState)) {
            return false;
        }
        LoadingState loadingState = (LoadingState) other;
        return this.status == loadingState.status && Intrinsics.g(this.data, loadingState.data) && Intrinsics.g(this.error, loadingState.error) && Intrinsics.g(this.networkError, loadingState.networkError) && Intrinsics.g(this.additionalInfo, loadingState.additionalInfo);
    }

    public final Map<String, String> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final T getData() {
        return this.data;
    }

    public final ResultWrapper.GenericError getError() {
        return this.error;
    }

    public final ResultWrapper.NetworkError getNetworkError() {
        return this.networkError;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.status.hashCode() * 31;
        T t = this.data;
        int iHashCode2 = (iHashCode + (t == null ? 0 : t.hashCode())) * 31;
        ResultWrapper.GenericError genericError = this.error;
        int iHashCode3 = (iHashCode2 + (genericError == null ? 0 : genericError.hashCode())) * 31;
        ResultWrapper.NetworkError networkError = this.networkError;
        int iHashCode4 = (iHashCode3 + (networkError == null ? 0 : networkError.hashCode())) * 31;
        Map<String, String> map = this.additionalInfo;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "LoadingState(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ", networkError=" + this.networkError + ", additionalInfo=" + this.additionalInfo + ")";
    }

    public LoadingState(Status status, T t, ResultWrapper.GenericError genericError, ResultWrapper.NetworkError networkError, Map<String, String> map) {
        status.getClass();
        this.status = status;
        this.data = t;
        this.error = genericError;
        this.networkError = networkError;
        this.additionalInfo = map;
    }
}
