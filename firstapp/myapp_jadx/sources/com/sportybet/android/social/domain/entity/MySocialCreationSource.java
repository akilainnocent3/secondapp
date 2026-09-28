package com.sportybet.android.social.domain.entity;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/android/social/domain/entity/MySocialCreationSource;", "Landroid/os/Parcelable;", "SocialCreation", "CustomCodeCreation", "Challenge", "Lcom/sportybet/android/social/domain/entity/MySocialCreationSource$Challenge;", "Lcom/sportybet/android/social/domain/entity/MySocialCreationSource$CustomCodeCreation;", "Lcom/sportybet/android/social/domain/entity/MySocialCreationSource$SocialCreation;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface MySocialCreationSource extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/social/domain/entity/MySocialCreationSource$Challenge;", "Lcom/sportybet/android/social/domain/entity/MySocialCreationSource;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Challenge implements MySocialCreationSource {
        public static final Challenge a = new Challenge();
        public static final Parcelable.Creator<Challenge> CREATOR = new a();

        public static final class a implements Parcelable.Creator<Challenge> {
            @Override // android.os.Parcelable.Creator
            public final Challenge createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Challenge.a;
            }

            @Override // android.os.Parcelable.Creator
            public final Challenge[] newArray(int i) {
                return new Challenge[i];
            }
        }

        private Challenge() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Challenge);
        }

        public final int hashCode() {
            return -1716528740;
        }

        public final String toString() {
            return "Challenge";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/social/domain/entity/MySocialCreationSource$CustomCodeCreation;", "Lcom/sportybet/android/social/domain/entity/MySocialCreationSource;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class CustomCodeCreation implements MySocialCreationSource {
        public static final CustomCodeCreation a = new CustomCodeCreation();
        public static final Parcelable.Creator<CustomCodeCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator<CustomCodeCreation> {
            @Override // android.os.Parcelable.Creator
            public final CustomCodeCreation createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return CustomCodeCreation.a;
            }

            @Override // android.os.Parcelable.Creator
            public final CustomCodeCreation[] newArray(int i) {
                return new CustomCodeCreation[i];
            }
        }

        private CustomCodeCreation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CustomCodeCreation);
        }

        public final int hashCode() {
            return 765785316;
        }

        public final String toString() {
            return "CustomCodeCreation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/social/domain/entity/MySocialCreationSource$SocialCreation;", "Lcom/sportybet/android/social/domain/entity/MySocialCreationSource;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SocialCreation implements MySocialCreationSource {
        public static final SocialCreation a = new SocialCreation();
        public static final Parcelable.Creator<SocialCreation> CREATOR = new a();

        public static final class a implements Parcelable.Creator<SocialCreation> {
            @Override // android.os.Parcelable.Creator
            public final SocialCreation createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return SocialCreation.a;
            }

            @Override // android.os.Parcelable.Creator
            public final SocialCreation[] newArray(int i) {
                return new SocialCreation[i];
            }
        }

        private SocialCreation() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SocialCreation);
        }

        public final int hashCode() {
            return -855561261;
        }

        public final String toString() {
            return "SocialCreation";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
