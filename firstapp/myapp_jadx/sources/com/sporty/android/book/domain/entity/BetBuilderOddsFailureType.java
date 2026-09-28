package com.sporty.android.book.domain.entity;

import defpackage.om2;
import defpackage.tag;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetBuilderOddsFailureType;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "ZERO_WIN_BET", "UNKNOWN", "UNKNOWN_PLAYER_TEAM", "MISSING_BASE_MARKETS", "OTHER", "Companion", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public enum BetBuilderOddsFailureType {
    ZERO_WIN_BET("ZERO_WIN_BET"),
    UNKNOWN("UNKNOWN"),
    UNKNOWN_PLAYER_TEAM("UNKNOWN_PLAYER_TEAM"),
    MISSING_BASE_MARKETS("MISSING_BASE_MARKETS"),
    OTHER("OTHER");

    private final String rawValue;
    private static final /* synthetic */ tag $ENTRIES = om2.a(values());

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetBuilderOddsFailureType$Companion;", "", "<init>", "()V", "from", "Lcom/sporty/android/book/domain/entity/BetBuilderOddsFailureType;", "rawValue", "", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BetBuilderOddsFailureType from(String rawValue) {
            BetBuilderOddsFailureType next;
            rawValue.getClass();
            Iterator<BetBuilderOddsFailureType> it = BetBuilderOddsFailureType.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(next.getRawValue(), rawValue));
            BetBuilderOddsFailureType betBuilderOddsFailureType = next;
            return betBuilderOddsFailureType == null ? BetBuilderOddsFailureType.OTHER : betBuilderOddsFailureType;
        }

        private Companion() {
        }
    }

    BetBuilderOddsFailureType(String str) {
        this.rawValue = str;
    }

    public static tag<BetBuilderOddsFailureType> getEntries() {
        return $ENTRIES;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
