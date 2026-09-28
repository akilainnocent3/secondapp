package com.sporty.android.core.model.welcomereward;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/NonFtdRewardType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "LOYALTY", "LUCKY_WHEEL", "LOYALTY_MISSION", "LIVE_STREAM", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum NonFtdRewardType {
    LOYALTY("loyalty"),
    LUCKY_WHEEL("lw"),
    LOYALTY_MISSION("mission"),
    LIVE_STREAM("live");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String value;

    NonFtdRewardType(String str) {
        this.value = str;
    }

    public static tag<NonFtdRewardType> getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
