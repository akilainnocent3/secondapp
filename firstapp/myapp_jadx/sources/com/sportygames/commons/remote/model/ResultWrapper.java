package com.sportygames.commons.remote.model;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.twilio.voice.EventKeys;
import defpackage.aya;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/sportygames/commons/remote/model/ResultWrapper;", "T", "", "<init>", "()V", "Success", "GenericError", "NetworkError", "Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;", "Lcom/sportygames/commons/remote/model/ResultWrapper$NetworkError;", "Lcom/sportygames/commons/remote/model/ResultWrapper$Success;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ResultWrapper<T> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportygames/commons/remote/model/ResultWrapper$NetworkError;", "Lcom/sportygames/commons/remote/model/ResultWrapper;", "", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NetworkError extends ResultWrapper {
        public static final int $stable = 0;
        public static final NetworkError INSTANCE = new NetworkError();

        private NetworkError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\t\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/sportygames/commons/remote/model/ResultWrapper$Success;", "T", "Lcom/sportygames/commons/remote/model/ResultWrapper;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/sportygames/commons/remote/model/ResultWrapper$Success;", "equals", "", "other", "", "hashCode", "", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Success<T> extends ResultWrapper<T> {
        public static final int $stable = 0;
        private final T value;

        public Success(T t) {
            super(null);
            this.value = t;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Success copy$default(Success success, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = success.value;
            }
            return success.copy(obj);
        }

        public final T component1() {
            return this.value;
        }

        public final Success<T> copy(T value) {
            return new Success<>(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.g(this.value, ((Success) other).value);
        }

        public final T getValue() {
            return this.value;
        }

        public int hashCode() {
            T t = this.value;
            if (t == null) {
                return 0;
            }
            return t.hashCode();
        }

        public String toString() {
            return aya.b(this.value, "Success(value=", ")");
        }
    }

    public /* synthetic */ ResultWrapper(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ResultWrapper() {
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J,\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;", "Lcom/sportygames/commons/remote/model/ResultWrapper;", "", EventKeys.ERROR_CODE, "", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "Lcom/sportygames/commons/remote/model/HTTPResponse;", "", "<init>", "(Ljava/lang/Integer;Lcom/sportygames/commons/remote/model/HTTPResponse;)V", "getCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getError", "()Lcom/sportygames/commons/remote/model/HTTPResponse;", "component1", "component2", "copy", "(Ljava/lang/Integer;Lcom/sportygames/commons/remote/model/HTTPResponse;)Lcom/sportygames/commons/remote/model/ResultWrapper$GenericError;", "equals", "", "other", "hashCode", "toString", "", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GenericError extends ResultWrapper {
        public static final int $stable = 8;
        private final Integer code;
        private final HTTPResponse<Object> error;

        public /* synthetic */ GenericError(Integer num, HTTPResponse hTTPResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : hTTPResponse);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GenericError copy$default(GenericError genericError, Integer num, HTTPResponse hTTPResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                num = genericError.code;
            }
            if ((i & 2) != 0) {
                hTTPResponse = genericError.error;
            }
            return genericError.copy(num, hTTPResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final Integer getCode() {
            return this.code;
        }

        public final HTTPResponse<Object> component2() {
            return this.error;
        }

        public final GenericError copy(Integer code, HTTPResponse<Object> error) {
            return new GenericError(code, error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GenericError)) {
                return false;
            }
            GenericError genericError = (GenericError) other;
            return Intrinsics.g(this.code, genericError.code) && Intrinsics.g(this.error, genericError.error);
        }

        public final Integer getCode() {
            return this.code;
        }

        public final HTTPResponse<Object> getError() {
            return this.error;
        }

        public int hashCode() {
            Integer num = this.code;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            HTTPResponse<Object> hTTPResponse = this.error;
            return iHashCode + (hTTPResponse != null ? hTTPResponse.hashCode() : 0);
        }

        public String toString() {
            return "GenericError(code=" + this.code + ", error=" + this.error + ")";
        }

        public GenericError(Integer num, HTTPResponse<Object> hTTPResponse) {
            super(null);
            this.code = num;
            this.error = hTTPResponse;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public GenericError() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }
}
