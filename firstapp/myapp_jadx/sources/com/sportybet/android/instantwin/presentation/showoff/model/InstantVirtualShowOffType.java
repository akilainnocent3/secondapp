package com.sportybet.android.instantwin.presentation.showoff.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.android.instantwin.newtork.model.response.Round;
import com.sportybet.android.instantwin.newtork.model.response.Ticket;
import defpackage.tug;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\tÊ\u0001\u0002\b\u000bÊ\u0001\f\b\f\u0012\b\b\r\u0012\u0004\b\u0003\u0010\u0000¨\u0006\n"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType;", "Landroid/os/Parcelable;", "<init>", "()V", "TicketWithoutCompleteInfo", "TicketWithCompleteInfo", "RoundWithCompleteInfo", "Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType$RoundWithCompleteInfo;", "Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType$TicketWithCompleteInfo;", "Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType$TicketWithoutCompleteInfo;", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class InstantVirtualShowOffType implements Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType$RoundWithCompleteInfo;", "Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class RoundWithCompleteInfo extends InstantVirtualShowOffType {
        public static final Parcelable.Creator<RoundWithCompleteInfo> CREATOR = new a();
        public final Round a;

        public static final class a implements Parcelable.Creator<RoundWithCompleteInfo> {
            @Override // android.os.Parcelable.Creator
            public final RoundWithCompleteInfo createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RoundWithCompleteInfo((Round) parcel.readParcelable(RoundWithCompleteInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final RoundWithCompleteInfo[] newArray(int i) {
                return new RoundWithCompleteInfo[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoundWithCompleteInfo(Round round) {
            super(0);
            round.getClass();
            this.a = round;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RoundWithCompleteInfo) && Intrinsics.g(this.a, ((RoundWithCompleteInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "RoundWithCompleteInfo(round=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType$TicketWithCompleteInfo;", "Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class TicketWithCompleteInfo extends InstantVirtualShowOffType {
        public static final Parcelable.Creator<TicketWithCompleteInfo> CREATOR = new a();
        public final Ticket a;

        public static final class a implements Parcelable.Creator<TicketWithCompleteInfo> {
            @Override // android.os.Parcelable.Creator
            public final TicketWithCompleteInfo createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TicketWithCompleteInfo((Ticket) parcel.readParcelable(TicketWithCompleteInfo.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final TicketWithCompleteInfo[] newArray(int i) {
                return new TicketWithCompleteInfo[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketWithCompleteInfo(Ticket ticket) {
            super(0);
            ticket.getClass();
            this.a = ticket;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TicketWithCompleteInfo) && Intrinsics.g(this.a, ((TicketWithCompleteInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TicketWithCompleteInfo(ticket=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.a, i);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType$TicketWithoutCompleteInfo;", "Lcom/sportybet/android/instantwin/presentation/showoff/model/InstantVirtualShowOffType;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class TicketWithoutCompleteInfo extends InstantVirtualShowOffType {
        public static final Parcelable.Creator<TicketWithoutCompleteInfo> CREATOR = new a();
        public final String a;

        public static final class a implements Parcelable.Creator<TicketWithoutCompleteInfo> {
            @Override // android.os.Parcelable.Creator
            public final TicketWithoutCompleteInfo createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new TicketWithoutCompleteInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final TicketWithoutCompleteInfo[] newArray(int i) {
                return new TicketWithoutCompleteInfo[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketWithoutCompleteInfo(String str) {
            super(0);
            str.getClass();
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TicketWithoutCompleteInfo) && Intrinsics.g(this.a, ((TicketWithoutCompleteInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("TicketWithoutCompleteInfo(ticketId=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }

    public /* synthetic */ InstantVirtualShowOffType(int i) {
        this();
    }

    private InstantVirtualShowOffType() {
    }
}
