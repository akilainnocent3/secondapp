package com.sporty.android.core.model.cms;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R/\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\r\u0012\b\b\u0004\u0012\u0004\b\b(\u0002¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR/\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\r\u0012\b\b\u0004\u0012\u0004\b\b(\u0004¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR/\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\r\u0012\b\b\u0004\u0012\u0004\b\b(\u0005¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR/\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\r\u0012\b\b\u0004\u0012\u0004\b\b(\u0006¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\n\"\u0004\b\u0013\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/core/model/cms/CMSResponse;", "", "key", "", "value", "type", AnalyticsParam.MINI_GAMES_PAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "Lcom/google/gson/annotations/SerializedName;", "getValue", "setValue", "getType", "setType", "getPage", "setPage", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CMSResponse {

    @SerializedName("key")
    private String key;

    @SerializedName(AnalyticsParam.MINI_GAMES_PAGE)
    private String page;

    @SerializedName("type")
    private String type;

    @SerializedName("value")
    private String value;

    public /* synthetic */ CMSResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ CMSResponse copy$default(CMSResponse cMSResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cMSResponse.key;
        }
        if ((i & 2) != 0) {
            str2 = cMSResponse.value;
        }
        if ((i & 4) != 0) {
            str3 = cMSResponse.type;
        }
        if ((i & 8) != 0) {
            str4 = cMSResponse.page;
        }
        return cMSResponse.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPage() {
        return this.page;
    }

    public final CMSResponse copy(String key, String value, String type, String page) {
        return new CMSResponse(key, value, type, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CMSResponse)) {
            return false;
        }
        CMSResponse cMSResponse = (CMSResponse) other;
        return Intrinsics.g(this.key, cMSResponse.key) && Intrinsics.g(this.value, cMSResponse.value) && Intrinsics.g(this.type, cMSResponse.type) && Intrinsics.g(this.page, cMSResponse.page);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPage() {
        return this.page;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.key;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.value;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.page;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setKey(String str) {
        this.key = str;
    }

    public final void setPage(String str) {
        this.page = str;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        String str = this.key;
        String str2 = this.value;
        return kwi.a(ux5.a("CMSResponse(key=", str, ", value=", str2, ", type="), this.type, ", page=", this.page, ")");
    }

    public CMSResponse(String str, String str2, String str3, String str4) {
        this.key = str;
        this.value = str2;
        this.type = str3;
        this.page = str4;
    }

    public CMSResponse() {
        this(null, null, null, null, 15, null);
    }
}
