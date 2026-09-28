package com.sportybet.feature.loyalty.impl.challenge.presentation.model;

import defpackage.om2;
import defpackage.tag;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0018\u0002\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bÊ\u0001\u0002\b\r¨\u0006\f"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/challenge/presentation/model/ChallengeCardStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Upcoming", "Available", "Conflicted", "Ongoing", "Completed", "Cancelled", "Expired", "EntryClosed", "impl", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum ChallengeCardStatus {
    Upcoming,
    Available,
    Conflicted,
    Ongoing,
    Completed,
    Cancelled,
    Expired,
    EntryClosed;

    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    public static tag<ChallengeCardStatus> getEntries() {
        return $ENTRIES;
    }
}
