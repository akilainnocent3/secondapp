package com.sportybet.android.bethistory.presentation.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\rÊ\u0001\u0002\b\u000fÊ\u0001\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u000e"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult;", "Landroid/os/Parcelable;", "<init>", "()V", "Won", "Lost", "Void", "Settled", "Unsettled", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Lost;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Settled;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Unsettled;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Void;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Won;", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class BetDialogResult implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Lost;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Lost extends BetDialogResult {
        public static final Lost a = new Lost();
        public static final Parcelable.Creator<Lost> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Lost> {
            @Override // android.os.Parcelable.Creator
            public final Lost createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Lost.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Lost[] newArray(int i) {
                return new Lost[i];
            }
        }

        private Lost() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Lost);
        }

        public final int hashCode() {
            return -1725629013;
        }

        public final String toString() {
            return "Lost";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Settled;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Settled extends BetDialogResult {
        public static final Settled a = new Settled();
        public static final Parcelable.Creator<Settled> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Settled> {
            @Override // android.os.Parcelable.Creator
            public final Settled createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Settled.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Settled[] newArray(int i) {
                return new Settled[i];
            }
        }

        private Settled() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Settled);
        }

        public final int hashCode() {
            return -118062958;
        }

        public final String toString() {
            return "Settled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Unsettled;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Unsettled extends BetDialogResult {
        public static final Unsettled a = new Unsettled();
        public static final Parcelable.Creator<Unsettled> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Unsettled> {
            @Override // android.os.Parcelable.Creator
            public final Unsettled createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Unsettled.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Unsettled[] newArray(int i) {
                return new Unsettled[i];
            }
        }

        private Unsettled() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Unsettled);
        }

        public final int hashCode() {
            return 382001561;
        }

        public final String toString() {
            return "Unsettled";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Void;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Void extends BetDialogResult {
        public static final Void a = new Void();
        public static final Parcelable.Creator<Void> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Void> {
            @Override // android.os.Parcelable.Creator
            public final Void createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Void.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Void[] newArray(int i) {
                return new Void[i];
            }
        }

        private Void() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Void);
        }

        public final int hashCode() {
            return -1725331429;
        }

        public final String toString() {
            return "Void";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult$Won;", "Lcom/sportybet/android/bethistory/presentation/dialog/BetDialogResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Won extends BetDialogResult {
        public static final Won a = new Won();
        public static final Parcelable.Creator<Won> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Won> {
            @Override // android.os.Parcelable.Creator
            public final Won createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Won.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Won[] newArray(int i) {
                return new Won[i];
            }
        }

        private Won() {
            super(0);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Won);
        }

        public final int hashCode() {
            return 775629103;
        }

        public final String toString() {
            return "Won";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ BetDialogResult(int i) {
        this();
    }

    private BetDialogResult() {
    }
}
