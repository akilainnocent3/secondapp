package com.sportybet.plugin.realsports.prematch.data;

import defpackage.ai50;
import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.kya0;
import defpackage.mq0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JG\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0006HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\f\b!\u0012\b\b\"\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/EventsByOrderBody;", "", "order", "", "productId", "sportId", "", "tournamentId", "", "withMarkets", "", "<init>", "(IILjava/lang/String;Ljava/util/List;Z)V", "getOrder", "()I", "getProductId", "getSportId", "()Ljava/lang/String;", "getTournamentId", "()Ljava/util/List;", "getWithMarkets", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class EventsByOrderBody {
    public static final int $stable = 8;
    private final int order;
    private final int productId;
    private final String sportId;
    private final List<List<String>> tournamentId;
    private final boolean withMarkets;

    /* JADX WARN: Multi-variable type inference failed */
    public EventsByOrderBody(int i, int i2, String str, List<? extends List<String>> list, boolean z) {
        str.getClass();
        list.getClass();
        this.order = i;
        this.productId = i2;
        this.sportId = str;
        this.tournamentId = list;
        this.withMarkets = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EventsByOrderBody copy$default(EventsByOrderBody eventsByOrderBody, int i, int i2, String str, List list, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = eventsByOrderBody.order;
        }
        if ((i3 & 2) != 0) {
            i2 = eventsByOrderBody.productId;
        }
        if ((i3 & 4) != 0) {
            str = eventsByOrderBody.sportId;
        }
        if ((i3 & 8) != 0) {
            list = eventsByOrderBody.tournamentId;
        }
        if ((i3 & 16) != 0) {
            z = eventsByOrderBody.withMarkets;
        }
        boolean z2 = z;
        String str2 = str;
        return eventsByOrderBody.copy(i, i2, str2, list, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final List<List<String>> component4() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getWithMarkets() {
        return this.withMarkets;
    }

    public final EventsByOrderBody copy(int order, int productId, String sportId, List<? extends List<String>> tournamentId, boolean withMarkets) {
        sportId.getClass();
        tournamentId.getClass();
        return new EventsByOrderBody(order, productId, sportId, tournamentId, withMarkets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventsByOrderBody)) {
            return false;
        }
        EventsByOrderBody eventsByOrderBody = (EventsByOrderBody) other;
        return this.order == eventsByOrderBody.order && this.productId == eventsByOrderBody.productId && Intrinsics.g(this.sportId, eventsByOrderBody.sportId) && Intrinsics.g(this.tournamentId, eventsByOrderBody.tournamentId) && this.withMarkets == eventsByOrderBody.withMarkets;
    }

    public final int getOrder() {
        return this.order;
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

    public final boolean getWithMarkets() {
        return this.withMarkets;
    }

    public int hashCode() {
        return Boolean.hashCode(this.withMarkets) + ai50.a(gmf0.a(gpp.a(this.productId, Integer.hashCode(this.order) * 31, 31), 31, this.sportId), 31, this.tournamentId);
    }

    public String toString() {
        int i = this.order;
        int i2 = this.productId;
        String str = this.sportId;
        List<List<String>> list = this.tournamentId;
        boolean z = this.withMarkets;
        StringBuilder sbA = dy5.a("EventsByOrderBody(order=", i, i2, ", productId=", ", sportId=");
        kya0.b(str, ", tournamentId=", ", withMarkets=", sbA, list);
        return mq0.a(sbA, z, ")");
    }

    public /* synthetic */ EventsByOrderBody(int i, int i2, String str, List list, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, list, (i3 & 16) != 0 ? false : z);
    }
}
