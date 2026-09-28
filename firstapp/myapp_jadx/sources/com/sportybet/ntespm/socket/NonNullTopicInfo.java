package com.sportybet.ntespm.socket;

import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.m2g;
import defpackage.qn4;
import defpackage.ux5;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020'HÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017Ê\u0001\f\b*\u0012\b\b+\u0012\u0004\b\u0003\u0010\u0000¨\u0006)"}, d2 = {"Lcom/sportybet/ntespm/socket/NonNullTopicInfo;", "", "sportId", "", "categoryId", "tournamentId", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "productId", "marketId", "marketSpecifiers", "postfix", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSportId", "()Ljava/lang/String;", "getCategoryId", "getTournamentId", "getEventId", "getProductId", "getMarketId", "getMarketSpecifiers", "getPostfix", "setPostfix", "(Ljava/lang/String;)V", "fromString", "topicString", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NonNullTopicInfo {
    public static final int $stable = 8;
    private final String categoryId;
    private final String eventId;
    private final String marketId;
    private final String marketSpecifiers;
    private String postfix;
    private final String productId;
    private final String sportId;
    private final String tournamentId;

    public /* synthetic */ NonNullTopicInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "~" : str, (i & 2) != 0 ? "~" : str2, (i & 4) != 0 ? "~" : str3, (i & 8) != 0 ? "~" : str4, (i & 16) != 0 ? "~" : str5, (i & 32) != 0 ? "~" : str6, (i & 64) != 0 ? "~" : str7, (i & 128) != 0 ? "" : str8);
    }

    public static /* synthetic */ NonNullTopicInfo copy$default(NonNullTopicInfo nonNullTopicInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nonNullTopicInfo.sportId;
        }
        if ((i & 2) != 0) {
            str2 = nonNullTopicInfo.categoryId;
        }
        if ((i & 4) != 0) {
            str3 = nonNullTopicInfo.tournamentId;
        }
        if ((i & 8) != 0) {
            str4 = nonNullTopicInfo.eventId;
        }
        if ((i & 16) != 0) {
            str5 = nonNullTopicInfo.productId;
        }
        if ((i & 32) != 0) {
            str6 = nonNullTopicInfo.marketId;
        }
        if ((i & 64) != 0) {
            str7 = nonNullTopicInfo.marketSpecifiers;
        }
        if ((i & 128) != 0) {
            str8 = nonNullTopicInfo.postfix;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return nonNullTopicInfo.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getMarketSpecifiers() {
        return this.marketSpecifiers;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    public final NonNullTopicInfo copy(String sportId, String categoryId, String tournamentId, String eventId, String productId, String marketId, String marketSpecifiers, String postfix) {
        qn4.b(sportId, categoryId, tournamentId, eventId, productId);
        marketId.getClass();
        marketSpecifiers.getClass();
        postfix.getClass();
        return new NonNullTopicInfo(sportId, categoryId, tournamentId, eventId, productId, marketId, marketSpecifiers, postfix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NonNullTopicInfo)) {
            return false;
        }
        NonNullTopicInfo nonNullTopicInfo = (NonNullTopicInfo) other;
        return Intrinsics.g(this.sportId, nonNullTopicInfo.sportId) && Intrinsics.g(this.categoryId, nonNullTopicInfo.categoryId) && Intrinsics.g(this.tournamentId, nonNullTopicInfo.tournamentId) && Intrinsics.g(this.eventId, nonNullTopicInfo.eventId) && Intrinsics.g(this.productId, nonNullTopicInfo.productId) && Intrinsics.g(this.marketId, nonNullTopicInfo.marketId) && Intrinsics.g(this.marketSpecifiers, nonNullTopicInfo.marketSpecifiers) && Intrinsics.g(this.postfix, nonNullTopicInfo.postfix);
    }

    public final NonNullTopicInfo fromString(String topicString) {
        Collection collectionT0;
        if (topicString == null || topicString.length() == 0) {
            return null;
        }
        List listH = new Regex("\\^").h(topicString);
        if (!listH.isEmpty()) {
            ListIterator listIterator = listH.listIterator(listH.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    collectionT0 = m2g.a;
                    break;
                }
                if (((String) listIterator.previous()).length() != 0) {
                    collectionT0 = CollectionsKt.t0(listH, listIterator.nextIndex() + 1);
                    break;
                }
            }
        } else {
            collectionT0 = m2g.a;
            break;
        }
        String[] strArr = (String[]) collectionT0.toArray(new String[0]);
        if ((StringsKt.M(topicString, TopicType.MARKET_ODDS.getPostfix(), false) || StringsKt.M(topicString, TopicType.MARKET_STATUS_V2.getPostfix(), false) || StringsKt.M(topicString, TopicType.CASH_OUT_STATUS.getPostfix(), false)) && strArr.length == 8) {
            return new NonNullTopicInfo(strArr[0], strArr[1], strArr[2], strArr[3], strArr[4], strArr[5], strArr[6], strArr[7]);
        }
        return null;
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getMarketId() {
        return this.marketId;
    }

    public final String getMarketSpecifiers() {
        return this.marketSpecifiers;
    }

    public final String getPostfix() {
        return this.postfix;
    }

    public final String getProductId() {
        return this.productId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        return this.postfix.hashCode() + gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(gmf0.a(this.sportId.hashCode() * 31, 31, this.categoryId), 31, this.tournamentId), 31, this.eventId), 31, this.productId), 31, this.marketId), 31, this.marketSpecifiers);
    }

    public final void setPostfix(String str) {
        str.getClass();
        this.postfix = str;
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.categoryId;
        String str3 = this.tournamentId;
        String str4 = this.eventId;
        String str5 = this.productId;
        String str6 = this.marketId;
        String str7 = this.marketSpecifiers;
        String str8 = this.postfix;
        StringBuilder sbA = ux5.a("NonNullTopicInfo(sportId=", str, ", categoryId=", str2, ", tournamentId=");
        hxa.c(sbA, str3, ", eventId=", str4, ", productId=");
        hxa.c(sbA, str5, ", marketId=", str6, ", marketSpecifiers=");
        return kwi.a(sbA, str7, ", postfix=", str8, ")");
    }

    public NonNullTopicInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        qn4.b(str, str2, str3, str4, str5);
        m.a(str6, str7, str8);
        this.sportId = str;
        this.categoryId = str2;
        this.tournamentId = str3;
        this.eventId = str4;
        this.productId = str5;
        this.marketId = str6;
        this.marketSpecifiers = str7;
        this.postfix = str8;
    }

    public NonNullTopicInfo() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }
}
