package com.sportybet.plugin.realsports.prematch.data;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/PreMatchLoadingState;", "", "<init>", "(Ljava/lang/String;I)V", "READY_FOR_LOAD", "LOADING", "LOAD_SUCCESS", "LOAD_FAILED", "NO_MORE", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum PreMatchLoadingState {
    READY_FOR_LOAD,
    LOADING,
    LOAD_SUCCESS,
    LOAD_FAILED,
    NO_MORE;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<PreMatchLoadingState> getEntries() {
        return $ENTRIES;
    }
}
