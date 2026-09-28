package com.sportygames.redblack.remote.models.enums;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sportygames/redblack/remote/models/enums/BetCardDecision;", "", "color", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getColor", "()Ljava/lang/String;", "BLACK", "RED", "GREEN", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public enum BetCardDecision {
    BLACK("black"),
    RED("red"),
    GREEN("green");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String color;

    BetCardDecision(String str) {
        this.color = str;
    }

    public static tag<BetCardDecision> getEntries() {
        return $ENTRIES;
    }

    public final String getColor() {
        return this.color;
    }
}
