package com.sportygames.crash.utils;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.twilio.voice.EventKeys;
import defpackage.pq6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÆ\u0003JV\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013¨\u0006%"}, d2 = {"Lcom/sportygames/crash/utils/ErrorPayload;", "", "bizCode", "", EventKeys.ERROR_MESSAGE, "", "total", "data", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "", "partialError", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;)V", "getBizCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getTotal", "()Ljava/lang/Object;", "getData", "getError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPartialError", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/Object;)Lcom/sportygames/crash/utils/ErrorPayload;", "equals", "other", "hashCode", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ErrorPayload {
    public static final int $stable = 8;
    private final Integer bizCode;
    private final Object data;
    private final Boolean error;
    private final String message;
    private final Object partialError;
    private final Object total;

    public ErrorPayload(Integer num, String str, Object obj, Object obj2, Boolean bool, Object obj3) {
        this.bizCode = num;
        this.message = str;
        this.total = obj;
        this.data = obj2;
        this.error = bool;
        this.partialError = obj3;
    }

    public static /* synthetic */ ErrorPayload copy$default(ErrorPayload errorPayload, Integer num, String str, Object obj, Object obj2, Boolean bool, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            num = errorPayload.bizCode;
        }
        if ((i & 2) != 0) {
            str = errorPayload.message;
        }
        if ((i & 4) != 0) {
            obj = errorPayload.total;
        }
        if ((i & 8) != 0) {
            obj2 = errorPayload.data;
        }
        if ((i & 16) != 0) {
            bool = errorPayload.error;
        }
        if ((i & 32) != 0) {
            obj3 = errorPayload.partialError;
        }
        Boolean bool2 = bool;
        Object obj5 = obj3;
        return errorPayload.copy(num, str, obj, obj2, bool2, obj5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBizCode() {
        return this.bizCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Object getTotal() {
        return this.total;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Object getPartialError() {
        return this.partialError;
    }

    public final ErrorPayload copy(Integer bizCode, String message, Object total, Object data, Boolean error, Object partialError) {
        return new ErrorPayload(bizCode, message, total, data, error, partialError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorPayload)) {
            return false;
        }
        ErrorPayload errorPayload = (ErrorPayload) other;
        return Intrinsics.g(this.bizCode, errorPayload.bizCode) && Intrinsics.g(this.message, errorPayload.message) && Intrinsics.g(this.total, errorPayload.total) && Intrinsics.g(this.data, errorPayload.data) && Intrinsics.g(this.error, errorPayload.error) && Intrinsics.g(this.partialError, errorPayload.partialError);
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final Object getData() {
        return this.data;
    }

    public final Boolean getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final Object getPartialError() {
        return this.partialError;
    }

    public final Object getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.bizCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Object obj = this.total;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.data;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Boolean bool = this.error;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Object obj3 = this.partialError;
        return iHashCode5 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.bizCode;
        String str = this.message;
        Object obj = this.total;
        Object obj2 = this.data;
        Boolean bool = this.error;
        Object obj3 = this.partialError;
        StringBuilder sbA = pq6.a(num, "ErrorPayload(bizCode=", ", message=", str, ", total=");
        sbA.append(obj);
        sbA.append(", data=");
        sbA.append(obj2);
        sbA.append(", error=");
        sbA.append(bool);
        sbA.append(", partialError=");
        sbA.append(obj3);
        sbA.append(")");
        return sbA.toString();
    }
}
