package com.sportybet.core.segmentation;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0010\b\u0004\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007j\u0010\b\b\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\tj\u0010\b\n\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u000bj\u0010\b\f\u0012\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\rÊ\u0001\u0002\b\u000f¨\u0006\u000e"}, d2 = {"Lcom/sportybet/core/segmentation/HomeSegment;", "", "<init>", "(Ljava/lang/String;I)V", "Sports", "Lcom/google/gson/annotations/SerializedName;", "value", "D1", "Games", "D2", "SportsDominant", "D3", "GamesDominant", "D4", "segmentation", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum HomeSegment {
    Sports,
    Games,
    SportsDominant,
    GamesDominant;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<HomeSegment> getEntries() {
        return $ENTRIES;
    }
}
