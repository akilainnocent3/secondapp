package com.sportybet.android.portal;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sportybet/android/portal/Segment;", "", "textRepresentation", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTextRepresentation", "()Ljava/lang/String;", "Sports", "Games", "SportsDominant", "GamesDominant", "portal_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum Segment {
    Sports("D1"),
    Games("D2"),
    SportsDominant("D3"),
    GamesDominant("D4");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String textRepresentation;

    Segment(String str) {
        this.textRepresentation = str;
    }

    public static tag<Segment> getEntries() {
        return $ENTRIES;
    }

    public final String getTextRepresentation() {
        return this.textRepresentation;
    }
}
