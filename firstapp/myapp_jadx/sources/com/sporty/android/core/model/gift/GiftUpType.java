package com.sporty.android.core.model.gift;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sporty/android/core/model/gift/GiftUpType;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NO_LIMIT", "LEAST_ONE_ONE_UP", "ALL_ONE_UP", "LEAST_ONE_TWO_UP", "ALL_TWO_UP", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum GiftUpType {
    NO_LIMIT(0),
    LEAST_ONE_ONE_UP(1),
    ALL_ONE_UP(2),
    LEAST_ONE_TWO_UP(3),
    ALL_TWO_UP(4);

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final int value;

    GiftUpType(int i) {
        this.value = i;
    }

    public static tag<GiftUpType> getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
