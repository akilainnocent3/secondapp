package com.sporty.android.core.model.antest;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0010\b\u0004\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007j\u0010\b\b\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\tj\u0010\b\n\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\rj\u0010\b\u000e\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000f¨\u0006\u0010"}, d2 = {"Lcom/sporty/android/core/model/antest/CampaignStatusEnum;", "", "<init>", "(Ljava/lang/String;I)V", "DRAFT", "Lcom/google/gson/annotations/SerializedName;", "value", "0", "RUNNING", "1", "PAUSED", "2", "DELETED", "3", "FINISHED", "4", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum CampaignStatusEnum {
    DRAFT,
    RUNNING,
    PAUSED,
    DELETED,
    FINISHED;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<CampaignStatusEnum> getEntries() {
        return $ENTRIES;
    }
}
