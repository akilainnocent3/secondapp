package com.sportybet.android.multimaker.presentation.uievent;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
public interface MultiMakerAddToBetSlipOptionsUiEvent {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/uievent/MultiMakerAddToBetSlipOptionsUiEvent$AllSelections;", "Lcom/sportybet/android/multimaker/presentation/uievent/MultiMakerAddToBetSlipOptionsUiEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AllSelections implements MultiMakerAddToBetSlipOptionsUiEvent, Parcelable {
        public static final AllSelections a = new AllSelections();
        public static final Parcelable.Creator<AllSelections> CREATOR = new a();

        public static final class a implements Parcelable.Creator<AllSelections> {
            @Override // android.os.Parcelable.Creator
            public final AllSelections createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return AllSelections.a;
            }

            @Override // android.os.Parcelable.Creator
            public final AllSelections[] newArray(int i) {
                return new AllSelections[i];
            }
        }

        private AllSelections() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AllSelections);
        }

        public final int hashCode() {
            return 1663583849;
        }

        public final String toString() {
            return "AllSelections";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/uievent/MultiMakerAddToBetSlipOptionsUiEvent$Cancel;", "Lcom/sportybet/android/multimaker/presentation/uievent/MultiMakerAddToBetSlipOptionsUiEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Cancel implements MultiMakerAddToBetSlipOptionsUiEvent, Parcelable {
        public static final Cancel a = new Cancel();
        public static final Parcelable.Creator<Cancel> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Cancel> {
            @Override // android.os.Parcelable.Creator
            public final Cancel createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Cancel.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Cancel[] newArray(int i) {
                return new Cancel[i];
            }
        }

        private Cancel() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Cancel);
        }

        public final int hashCode() {
            return -74127335;
        }

        public final String toString() {
            return "Cancel";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/multimaker/presentation/uievent/MultiMakerAddToBetSlipOptionsUiEvent$LockedSelectionsOnly;", "Lcom/sportybet/android/multimaker/presentation/uievent/MultiMakerAddToBetSlipOptionsUiEvent;", "Landroid/os/Parcelable;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LockedSelectionsOnly implements MultiMakerAddToBetSlipOptionsUiEvent, Parcelable {
        public static final LockedSelectionsOnly a = new LockedSelectionsOnly();
        public static final Parcelable.Creator<LockedSelectionsOnly> CREATOR = new a();

        public static final class a implements Parcelable.Creator<LockedSelectionsOnly> {
            @Override // android.os.Parcelable.Creator
            public final LockedSelectionsOnly createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return LockedSelectionsOnly.a;
            }

            @Override // android.os.Parcelable.Creator
            public final LockedSelectionsOnly[] newArray(int i) {
                return new LockedSelectionsOnly[i];
            }
        }

        private LockedSelectionsOnly() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LockedSelectionsOnly);
        }

        public final int hashCode() {
            return -1240816196;
        }

        public final String toString() {
            return "LockedSelectionsOnly";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
