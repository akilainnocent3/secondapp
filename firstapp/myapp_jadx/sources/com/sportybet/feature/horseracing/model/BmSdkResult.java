package com.sportybet.feature.horseracing.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "Landroid/os/Parcelable;", "LaunchLogin", "SdkLoaded", "UpdateBalance", "SdkError", "a", "Lcom/sportybet/feature/horseracing/model/BmSdkResult$LaunchLogin;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult$SdkError;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult$SdkLoaded;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult$UpdateBalance;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface BmSdkResult extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/horseracing/model/BmSdkResult$LaunchLogin;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class LaunchLogin implements BmSdkResult {
        public static final LaunchLogin a = new LaunchLogin();
        public static final Parcelable.Creator<LaunchLogin> CREATOR = new a();

        public static final class a implements Parcelable.Creator<LaunchLogin> {
            @Override // android.os.Parcelable.Creator
            public final LaunchLogin createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return LaunchLogin.a;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchLogin[] newArray(int i) {
                return new LaunchLogin[i];
            }
        }

        private LaunchLogin() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LaunchLogin);
        }

        public final int hashCode() {
            return -444052027;
        }

        public final String toString() {
            return "LaunchLogin";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/horseracing/model/BmSdkResult$SdkError;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SdkError implements BmSdkResult {
        public static final Parcelable.Creator<SdkError> CREATOR = new a();
        public final a a;

        public static final class a implements Parcelable.Creator<SdkError> {
            @Override // android.os.Parcelable.Creator
            public final SdkError createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SdkError(a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final SdkError[] newArray(int i) {
                return new SdkError[i];
            }
        }

        public SdkError(a aVar) {
            aVar.getClass();
            this.a = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SdkError) && this.a == ((SdkError) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "SdkError(error=" + this.a + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/horseracing/model/BmSdkResult$SdkLoaded;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class SdkLoaded implements BmSdkResult {
        public static final SdkLoaded a = new SdkLoaded();
        public static final Parcelable.Creator<SdkLoaded> CREATOR = new a();

        public static final class a implements Parcelable.Creator<SdkLoaded> {
            @Override // android.os.Parcelable.Creator
            public final SdkLoaded createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return SdkLoaded.a;
            }

            @Override // android.os.Parcelable.Creator
            public final SdkLoaded[] newArray(int i) {
                return new SdkLoaded[i];
            }
        }

        private SdkLoaded() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SdkLoaded);
        }

        public final int hashCode() {
            return -653941010;
        }

        public final String toString() {
            return "SdkLoaded";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/horseracing/model/BmSdkResult$UpdateBalance;", "Lcom/sportybet/feature/horseracing/model/BmSdkResult;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class UpdateBalance implements BmSdkResult {
        public static final UpdateBalance a = new UpdateBalance();
        public static final Parcelable.Creator<UpdateBalance> CREATOR = new a();

        public static final class a implements Parcelable.Creator<UpdateBalance> {
            @Override // android.os.Parcelable.Creator
            public final UpdateBalance createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return UpdateBalance.a;
            }

            @Override // android.os.Parcelable.Creator
            public final UpdateBalance[] newArray(int i) {
                return new UpdateBalance[i];
            }
        }

        private UpdateBalance() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateBalance);
        }

        public final int hashCode() {
            return -1475490718;
        }

        public final String toString() {
            return "UpdateBalance";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final C0371a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final /* synthetic */ a[] f;

        /* JADX INFO: renamed from: com.sportybet.feature.horseracing.model.BmSdkResult$a$a, reason: collision with other inner class name */
        public static final class C0371a {
        }

        static {
            a aVar = new a("ERROR_BETSLIP", 0);
            b = aVar;
            a aVar2 = new a("ERROR_REFRESH_TOKEN", 1);
            c = aVar2;
            a aVar3 = new a("AUTHENTICATION_FAILED", 2);
            d = aVar3;
            a aVar4 = new a("UNKNOWN", 3);
            e = aVar4;
            f = new a[]{aVar, aVar2, aVar3, aVar4};
            a = new C0371a();
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }
    }
}
