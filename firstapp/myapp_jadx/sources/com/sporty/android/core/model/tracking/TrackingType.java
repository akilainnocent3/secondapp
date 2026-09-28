package com.sporty.android.core.model.tracking;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/tracking/TrackingType;", "", "nameForBi", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getNameForBi", "()Ljava/lang/String;", "BiAnalytics", "BookCAnalytics", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum TrackingType {
    BiAnalytics(AnalyticsEvent.BI_TRACKING_TYPE_BI_ANALYTICS),
    BookCAnalytics(AnalyticsEvent.BI_TRACKING_TYPE_BOOK_C_ANALYTICS);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String nameForBi;

    TrackingType(String str) {
        this.nameForBi = str;
    }

    public static tag<TrackingType> getEntries() {
        return $ENTRIES;
    }

    public final String getNameForBi() {
        return this.nameForBi;
    }
}
