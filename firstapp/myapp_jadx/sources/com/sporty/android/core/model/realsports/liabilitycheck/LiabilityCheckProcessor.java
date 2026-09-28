package com.sporty.android.core.model.realsports.liabilitycheck;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0010\b\b\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r¨\u0006\u000e"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckProcessor;", "", "typeId", "", "<init>", "(Ljava/lang/String;II)V", "getTypeId", "()I", "BOOKING_CODE_LIABILITY_CHECK", "Lcom/google/gson/annotations/SerializedName;", "value", "10", "MARKET_AND_BET_LIABILITY_CHECK", "20", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LiabilityCheckProcessor {
    BOOKING_CODE_LIABILITY_CHECK(10),
    MARKET_AND_BET_LIABILITY_CHECK(20);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int typeId;

    LiabilityCheckProcessor(int i) {
        this.typeId = i;
    }

    public static tag<LiabilityCheckProcessor> getEntries() {
        return $ENTRIES;
    }

    public final int getTypeId() {
        return this.typeId;
    }
}
