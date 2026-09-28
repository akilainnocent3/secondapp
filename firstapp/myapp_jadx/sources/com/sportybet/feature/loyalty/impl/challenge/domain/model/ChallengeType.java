package com.sportybet.feature.loyalty.impl.challenge.domain.model;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007Ê\u0001\u0002\b\t¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/challenge/domain/model/ChallengeType;", "", "<init>", "(Ljava/lang/String;I)V", "TOTAL_WINNING_AMOUNT", "HIGHEST_WINNING_AMOUNT", "TOTAL_WINNING_ODDS", "UNKNOWN", "impl", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum ChallengeType {
    TOTAL_WINNING_AMOUNT,
    HIGHEST_WINNING_AMOUNT,
    TOTAL_WINNING_ODDS,
    UNKNOWN;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<ChallengeType> getEntries() {
        return $ENTRIES;
    }
}
