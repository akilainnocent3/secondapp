package com.sportygames.common.framework.network;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.twilio.voice.EventKeys;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BO\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\"\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010$\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jh\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\t\u0010+\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0014\u0010\u0010R\u001e\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u0006,"}, d2 = {"Lcom/sportygames/common/framework/network/HTTPResponse;", "T", "", "bizCode", "", EventKeys.ERROR_MESSAGE, "", "total", "data", AnalyticsEvent.BI_TRACKING_KIND_ERROR, "", "partialError", "innerMsg", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getBizCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getTotal", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "getError", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getPartialError", "getInnerMsg", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/sportygames/common/framework/network/HTTPResponse;", "equals", "other", "hashCode", "toString", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HTTPResponse<T> {
    private final Integer bizCode;
    private T data;
    private final Boolean error;
    private final String innerMsg;
    private final String message;
    private final String partialError;
    private final Integer total;

    public /* synthetic */ HTTPResponse(Integer num, String str, Integer num2, Object obj, Boolean bool, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, str, num2, obj, bool, str2, (i & 64) != 0 ? null : str3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HTTPResponse copy$default(HTTPResponse hTTPResponse, Integer num, String str, Integer num2, Object obj, Boolean bool, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            num = hTTPResponse.bizCode;
        }
        if ((i & 2) != 0) {
            str = hTTPResponse.message;
        }
        if ((i & 4) != 0) {
            num2 = hTTPResponse.total;
        }
        if ((i & 8) != 0) {
            obj = hTTPResponse.data;
        }
        if ((i & 16) != 0) {
            bool = hTTPResponse.error;
        }
        if ((i & 32) != 0) {
            str2 = hTTPResponse.partialError;
        }
        if ((i & 64) != 0) {
            str3 = hTTPResponse.innerMsg;
        }
        String str4 = str2;
        String str5 = str3;
        Boolean bool2 = bool;
        Integer num3 = num2;
        return hTTPResponse.copy(num, str, num3, obj, bool2, str4, str5);
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
    public final Integer getTotal() {
        return this.total;
    }

    public final T component4() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getError() {
        return this.error;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPartialError() {
        return this.partialError;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getInnerMsg() {
        return this.innerMsg;
    }

    public final HTTPResponse<T> copy(Integer bizCode, String message, Integer total, T data, Boolean error, String partialError, String innerMsg) {
        return new HTTPResponse<>(bizCode, message, total, data, error, partialError, innerMsg);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HTTPResponse)) {
            return false;
        }
        HTTPResponse hTTPResponse = (HTTPResponse) other;
        return Intrinsics.g(this.bizCode, hTTPResponse.bizCode) && Intrinsics.g(this.message, hTTPResponse.message) && Intrinsics.g(this.total, hTTPResponse.total) && Intrinsics.g(this.data, hTTPResponse.data) && Intrinsics.g(this.error, hTTPResponse.error) && Intrinsics.g(this.partialError, hTTPResponse.partialError) && Intrinsics.g(this.innerMsg, hTTPResponse.innerMsg);
    }

    public final Integer getBizCode() {
        return this.bizCode;
    }

    public final T getData() {
        return this.data;
    }

    public final Boolean getError() {
        return this.error;
    }

    public final String getInnerMsg() {
        return this.innerMsg;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getPartialError() {
        return this.partialError;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public int hashCode() {
        Integer num = this.bizCode;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.message;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.total;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        T t = this.data;
        int iHashCode4 = (iHashCode3 + (t == null ? 0 : t.hashCode())) * 31;
        Boolean bool = this.error;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.partialError;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.innerMsg;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setData(T t) {
        this.data = t;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HTTPResponse(bizCode=");
        sb.append(this.bizCode);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", total=");
        sb.append(this.total);
        sb.append(", data=");
        sb.append(this.data);
        sb.append(", error=");
        sb.append(this.error);
        sb.append(", partialError=");
        sb.append(this.partialError);
        sb.append(", innerMsg=");
        return j26.a(sb, this.innerMsg, ')');
    }

    public HTTPResponse(Integer num, String str, Integer num2, T t, Boolean bool, String str2, String str3) {
        this.bizCode = num;
        this.message = str;
        this.total = num2;
        this.data = t;
        this.error = bool;
        this.partialError = str2;
        this.innerMsg = str3;
    }
}
