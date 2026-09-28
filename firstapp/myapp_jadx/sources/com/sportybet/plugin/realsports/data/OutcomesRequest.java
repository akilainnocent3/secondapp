package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.realsports.betslip.Selection;
import defpackage.gmf0;
import defpackage.hxa;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u001fHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0006HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006!"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutcomesRequest;", "", "selections", "", "Lcom/sportybet/plugin/realsports/betslip/Selection;", "state", "", AnalyticsParam.EVENT_STATUS, "requestBody", AnalyticsParam.EVENT_PARAM_EXCEPTION, "", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getSelections", "()Ljava/util/List;", "getState", "()Ljava/lang/String;", "getStatus", "getRequestBody", "getException", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutcomesRequest {
    public static final int $stable = 8;
    private final Throwable exception;
    private final String requestBody;
    private final List<Selection> selections;
    private final String state;
    private final String status;

    /* JADX WARN: Multi-variable type inference failed */
    public OutcomesRequest(List<? extends Selection> list, String str, String str2, String str3, Throwable th) {
        list.getClass();
        str3.getClass();
        this.selections = list;
        this.state = str;
        this.status = str2;
        this.requestBody = str3;
        this.exception = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OutcomesRequest copy$default(OutcomesRequest outcomesRequest, List list, String str, String str2, String str3, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            list = outcomesRequest.selections;
        }
        if ((i & 2) != 0) {
            str = outcomesRequest.state;
        }
        if ((i & 4) != 0) {
            str2 = outcomesRequest.status;
        }
        if ((i & 8) != 0) {
            str3 = outcomesRequest.requestBody;
        }
        if ((i & 16) != 0) {
            th = outcomesRequest.exception;
        }
        Throwable th2 = th;
        String str4 = str2;
        return outcomesRequest.copy(list, str, str4, str3, th2);
    }

    public final List<Selection> component1() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRequestBody() {
        return this.requestBody;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Throwable getException() {
        return this.exception;
    }

    public final OutcomesRequest copy(List<? extends Selection> selections, String state, String status, String requestBody, Throwable exception) {
        selections.getClass();
        requestBody.getClass();
        return new OutcomesRequest(selections, state, status, requestBody, exception);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutcomesRequest)) {
            return false;
        }
        OutcomesRequest outcomesRequest = (OutcomesRequest) other;
        return Intrinsics.g(this.selections, outcomesRequest.selections) && Intrinsics.g(this.state, outcomesRequest.state) && Intrinsics.g(this.status, outcomesRequest.status) && Intrinsics.g(this.requestBody, outcomesRequest.requestBody) && Intrinsics.g(this.exception, outcomesRequest.exception);
    }

    public final Throwable getException() {
        return this.exception;
    }

    public final String getRequestBody() {
        return this.requestBody;
    }

    public final List<Selection> getSelections() {
        return this.selections;
    }

    public final String getState() {
        return this.state;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        int iHashCode = this.selections.hashCode() * 31;
        String str = this.state;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.status;
        int iA = gmf0.a((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.requestBody);
        Throwable th = this.exception;
        return iA + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        List<Selection> list = this.selections;
        String str = this.state;
        String str2 = this.status;
        String str3 = this.requestBody;
        Throwable th = this.exception;
        StringBuilder sb = new StringBuilder("OutcomesRequest(selections=");
        sb.append(list);
        sb.append(", state=");
        sb.append(str);
        sb.append(", status=");
        hxa.c(sb, str2, ", requestBody=", str3, ", exception=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ OutcomesRequest(List list, String str, String str2, String str3, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, str3, (i & 16) != 0 ? null : th);
    }
}
