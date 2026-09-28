package com.sporty.android.core.model.patron;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u001a\u0002\b\t¢\u0006\u0004\b\u0007\u0010\bR(\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002\u0092\u0002\u0002\b\f¢\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004\u0092\u0002\u0002\b\f¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0005\u0092\u0002\u0002\b\f¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/sporty/android/core/model/patron/DocumentAudit;", "", "rejectReason", "", "rejectTitle", AnalyticsParam.EVENT_STATUS, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "Lkotlin/jvm/JvmOverloads;", "Lcom/google/gson/annotations/SerializedName;", "value", "Lkotlin/jvm/JvmField;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class DocumentAudit {

    @SerializedName("rejectReason")
    public String rejectReason;

    @SerializedName("rejectTitle")
    public String rejectTitle;

    @SerializedName(AnalyticsParam.EVENT_STATUS)
    public int status;

    public /* synthetic */ DocumentAudit(String str, String str2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? DocumentAuditStatus.DRAFT.getValue() : i);
    }

    public DocumentAudit(String str) {
        this(str, null, 0, 6, null);
    }

    public DocumentAudit(String str, String str2) {
        this(str, str2, 0, 4, null);
    }

    public DocumentAudit(String str, String str2, int i) {
        this.rejectReason = str;
        this.rejectTitle = str2;
        this.status = i;
    }

    public DocumentAudit() {
        this(null, null, 0, 7, null);
    }
}
