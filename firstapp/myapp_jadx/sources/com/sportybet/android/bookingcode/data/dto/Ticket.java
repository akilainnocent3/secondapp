package com.sportybet.android.bookingcode.data.dto;

import defpackage.pe4;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\r\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\u0002\b\u0011Ê\u0001\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0010"}, d2 = {"Lcom/sportybet/android/bookingcode/data/dto/Ticket;", "", "orderType", "", "<init>", "(I)V", "getOrderType", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Ticket {
    public static final int $stable = 0;
    private final int orderType;

    public Ticket(int i) {
        this.orderType = i;
    }

    public static /* synthetic */ Ticket copy$default(Ticket ticket, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = ticket.orderType;
        }
        return ticket.copy(i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOrderType() {
        return this.orderType;
    }

    public final Ticket copy(int orderType) {
        return new Ticket(orderType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Ticket) && this.orderType == ((Ticket) other).orderType;
    }

    public final int getOrderType() {
        return this.orderType;
    }

    public int hashCode() {
        return Integer.hashCode(this.orderType);
    }

    public String toString() {
        return pe4.b(this.orderType, "Ticket(orderType=", ")");
    }
}
