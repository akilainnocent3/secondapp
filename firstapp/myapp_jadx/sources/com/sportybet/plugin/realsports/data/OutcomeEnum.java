package com.sportybet.plugin.realsports.data;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sportybet/plugin/realsports/data/OutcomeEnum;", "", AnalyticsParam.EVENT_PARAM_ID, "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "Home", "Draw", "Away", "Joker", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum OutcomeEnum {
    Home("1"),
    Draw("2"),
    Away("3"),
    Joker("joker");

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());
    private final String id;

    OutcomeEnum(String str) {
        this.id = str;
    }

    public static tag<OutcomeEnum> getEntries() {
        return $ENTRIES;
    }

    public final String getId() {
        return this.id;
    }
}
