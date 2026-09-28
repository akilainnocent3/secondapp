package com.sportybet.plugin.realsports.prematch.data;

import defpackage.ai50;
import defpackage.cv7;
import defpackage.gpp;
import defpackage.lng;
import defpackage.ml5;
import defpackage.mtg0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\bHÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0018J\t\u0010$\u001a\u00020\fHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003Jn\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0002\u0010'J\u0014\u0010(\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010*\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010+\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cÊ\u0001\f\b-\u0012\b\b.\u0012\u0004\b\u0003\u0010\u0000¨\u0006,"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/LiveEventsRequestBody;", "", "sportId", "", "order", "", "productId", "tournamentId", "", "pageSize", "pageNum", "withOneUpMarket", "", "withTwoUpMarket", "<init>", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)V", "getSportId", "()Ljava/lang/String;", "getOrder", "()I", "getProductId", "getTournamentId", "()Ljava/util/List;", "getPageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageNum", "getWithOneUpMarket", "()Z", "getWithTwoUpMarket", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;IILjava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;ZZ)Lcom/sportybet/plugin/realsports/prematch/data/LiveEventsRequestBody;", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiveEventsRequestBody {
    public static final int $stable = 8;
    private final int order;
    private final Integer pageNum;
    private final Integer pageSize;
    private final int productId;
    private final String sportId;
    private final List<List<String>> tournamentId;
    private final boolean withOneUpMarket;
    private final boolean withTwoUpMarket;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveEventsRequestBody(String str, int i, int i2, List<? extends List<String>> list, Integer num, Integer num2, boolean z, boolean z2) {
        str.getClass();
        list.getClass();
        this.sportId = str;
        this.order = i;
        this.productId = i2;
        this.tournamentId = list;
        this.pageSize = num;
        this.pageNum = num2;
        this.withOneUpMarket = z;
        this.withTwoUpMarket = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveEventsRequestBody copy$default(LiveEventsRequestBody liveEventsRequestBody, String str, int i, int i2, List list, Integer num, Integer num2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = liveEventsRequestBody.sportId;
        }
        if ((i3 & 2) != 0) {
            i = liveEventsRequestBody.order;
        }
        if ((i3 & 4) != 0) {
            i2 = liveEventsRequestBody.productId;
        }
        if ((i3 & 8) != 0) {
            list = liveEventsRequestBody.tournamentId;
        }
        if ((i3 & 16) != 0) {
            num = liveEventsRequestBody.pageSize;
        }
        if ((i3 & 32) != 0) {
            num2 = liveEventsRequestBody.pageNum;
        }
        if ((i3 & 64) != 0) {
            z = liveEventsRequestBody.withOneUpMarket;
        }
        if ((i3 & 128) != 0) {
            z2 = liveEventsRequestBody.withTwoUpMarket;
        }
        boolean z3 = z;
        boolean z4 = z2;
        Integer num3 = num;
        Integer num4 = num2;
        return liveEventsRequestBody.copy(str, i, i2, list, num3, num4, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    public final List<List<String>> component4() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getPageNum() {
        return this.pageNum;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getWithOneUpMarket() {
        return this.withOneUpMarket;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getWithTwoUpMarket() {
        return this.withTwoUpMarket;
    }

    public final LiveEventsRequestBody copy(String sportId, int order, int productId, List<? extends List<String>> tournamentId, Integer pageSize, Integer pageNum, boolean withOneUpMarket, boolean withTwoUpMarket) {
        sportId.getClass();
        tournamentId.getClass();
        return new LiveEventsRequestBody(sportId, order, productId, tournamentId, pageSize, pageNum, withOneUpMarket, withTwoUpMarket);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveEventsRequestBody)) {
            return false;
        }
        LiveEventsRequestBody liveEventsRequestBody = (LiveEventsRequestBody) other;
        return Intrinsics.g(this.sportId, liveEventsRequestBody.sportId) && this.order == liveEventsRequestBody.order && this.productId == liveEventsRequestBody.productId && Intrinsics.g(this.tournamentId, liveEventsRequestBody.tournamentId) && Intrinsics.g(this.pageSize, liveEventsRequestBody.pageSize) && Intrinsics.g(this.pageNum, liveEventsRequestBody.pageNum) && this.withOneUpMarket == liveEventsRequestBody.withOneUpMarket && this.withTwoUpMarket == liveEventsRequestBody.withTwoUpMarket;
    }

    public final int getOrder() {
        return this.order;
    }

    public final Integer getPageNum() {
        return this.pageNum;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final List<List<String>> getTournamentId() {
        return this.tournamentId;
    }

    public final boolean getWithOneUpMarket() {
        return this.withOneUpMarket;
    }

    public final boolean getWithTwoUpMarket() {
        return this.withTwoUpMarket;
    }

    public int hashCode() {
        int iA = ai50.a(gpp.a(this.productId, gpp.a(this.order, this.sportId.hashCode() * 31, 31), 31), 31, this.tournamentId);
        Integer num = this.pageSize;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.pageNum;
        return Boolean.hashCode(this.withTwoUpMarket) + mtg0.a((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.withOneUpMarket);
    }

    public String toString() {
        String str = this.sportId;
        int i = this.order;
        int i2 = this.productId;
        List<List<String>> list = this.tournamentId;
        Integer num = this.pageSize;
        Integer num2 = this.pageNum;
        boolean z = this.withOneUpMarket;
        boolean z2 = this.withTwoUpMarket;
        StringBuilder sbA = ml5.a(i, "LiveEventsRequestBody(sportId=", str, ", order=", ", productId=");
        sbA.append(i2);
        sbA.append(", tournamentId=");
        sbA.append(list);
        sbA.append(", pageSize=");
        cv7.a(sbA, num, ", pageNum=", num2, ", withOneUpMarket=");
        return lng.a(", withTwoUpMarket=", ")", sbA, z, z2);
    }

    public /* synthetic */ LiveEventsRequestBody(String str, int i, int i2, List list, Integer num, Integer num2, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, list, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? null : num2, (i3 & 64) != 0 ? true : z, (i3 & 128) != 0 ? true : z2);
    }
}
