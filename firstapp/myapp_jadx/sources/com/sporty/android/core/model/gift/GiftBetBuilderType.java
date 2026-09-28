package com.sporty.android.core.model.gift;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sporty/android/core/model/gift/GiftBetBuilderType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_LIMIT", "LEAST_ONE_BET_BUILDER", "ALL_BET_BUILDER", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum GiftBetBuilderType {
    NO_LIMIT(0),
    LEAST_ONE_BET_BUILDER(1),
    ALL_BET_BUILDER(2);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int value;

    GiftBetBuilderType(int i) {
        this.value = i;
    }

    public static tag<GiftBetBuilderType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
