package com.sportybet.feature.luckynumber.placebet.presentation;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nÊ\u0001\u0002\b\f¨\u0006\u000b"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/presentation/LNPlaceBetEntranceFromButton;", "", "fromButton", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getFromButton", "()Ljava/lang/String;", "RE_BET_WIN", "RE_BET_LOST", "RE_BET_VOID", "luckynumber", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum LNPlaceBetEntranceFromButton {
    RE_BET_WIN("rebet__Win"),
    RE_BET_LOST("rebet__Lost"),
    RE_BET_VOID("rebet__Void");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String fromButton;

    LNPlaceBetEntranceFromButton(String str) {
        this.fromButton = str;
    }

    public static tag<LNPlaceBetEntranceFromButton> getEntries() {
        return $ENTRIES;
    }

    public final String getFromButton() {
        return this.fromButton;
    }
}
