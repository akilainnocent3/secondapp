package com.sporty.android.core.model.bookingcode;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/RecommendBookingCodeRequestSource;", "", "source", "", "<init>", "(Ljava/lang/String;II)V", "getSource", "()I", "PREMATCH_COMMENT_PAGE", "PREMATCH_EVENT_DETAIL_PAGE", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum RecommendBookingCodeRequestSource {
    PREMATCH_COMMENT_PAGE(1),
    PREMATCH_EVENT_DETAIL_PAGE(2);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int source;

    RecommendBookingCodeRequestSource(int i) {
        this.source = i;
    }

    public static tag<RecommendBookingCodeRequestSource> getEntries() {
        return $ENTRIES;
    }

    public final int getSource() {
        return this.source;
    }
}
