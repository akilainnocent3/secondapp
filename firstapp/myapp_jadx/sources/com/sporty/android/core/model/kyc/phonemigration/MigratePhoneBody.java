package com.sporty.android.core.model.kyc.phonemigration;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b!¨\u0006 "}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/MigratePhoneBody;", "Landroid/os/Parcelable;", "mainAccountOTPVerifyToken", "", "nameMatchedVerifyToken", "passwordVerifyToken", "subAccountOTPVerifyToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMainAccountOTPVerifyToken", "()Ljava/lang/String;", "getNameMatchedVerifyToken", "getPasswordVerifyToken", "getSubAccountOTPVerifyToken", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MigratePhoneBody implements Parcelable {
    public static final Parcelable.Creator<MigratePhoneBody> CREATOR = new Creator();
    private final String mainAccountOTPVerifyToken;
    private final String nameMatchedVerifyToken;
    private final String passwordVerifyToken;
    private final String subAccountOTPVerifyToken;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<MigratePhoneBody> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MigratePhoneBody createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MigratePhoneBody(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MigratePhoneBody[] newArray(int i) {
            return new MigratePhoneBody[i];
        }
    }

    public MigratePhoneBody(String str, String str2, String str3, String str4) {
        str3.getClass();
        this.mainAccountOTPVerifyToken = str;
        this.nameMatchedVerifyToken = str2;
        this.passwordVerifyToken = str3;
        this.subAccountOTPVerifyToken = str4;
    }

    public static /* synthetic */ MigratePhoneBody copy$default(MigratePhoneBody migratePhoneBody, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = migratePhoneBody.mainAccountOTPVerifyToken;
        }
        if ((i & 2) != 0) {
            str2 = migratePhoneBody.nameMatchedVerifyToken;
        }
        if ((i & 4) != 0) {
            str3 = migratePhoneBody.passwordVerifyToken;
        }
        if ((i & 8) != 0) {
            str4 = migratePhoneBody.subAccountOTPVerifyToken;
        }
        return migratePhoneBody.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMainAccountOTPVerifyToken() {
        return this.mainAccountOTPVerifyToken;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNameMatchedVerifyToken() {
        return this.nameMatchedVerifyToken;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPasswordVerifyToken() {
        return this.passwordVerifyToken;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSubAccountOTPVerifyToken() {
        return this.subAccountOTPVerifyToken;
    }

    public final MigratePhoneBody copy(String mainAccountOTPVerifyToken, String nameMatchedVerifyToken, String passwordVerifyToken, String subAccountOTPVerifyToken) {
        passwordVerifyToken.getClass();
        return new MigratePhoneBody(mainAccountOTPVerifyToken, nameMatchedVerifyToken, passwordVerifyToken, subAccountOTPVerifyToken);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MigratePhoneBody)) {
            return false;
        }
        MigratePhoneBody migratePhoneBody = (MigratePhoneBody) other;
        return Intrinsics.g(this.mainAccountOTPVerifyToken, migratePhoneBody.mainAccountOTPVerifyToken) && Intrinsics.g(this.nameMatchedVerifyToken, migratePhoneBody.nameMatchedVerifyToken) && Intrinsics.g(this.passwordVerifyToken, migratePhoneBody.passwordVerifyToken) && Intrinsics.g(this.subAccountOTPVerifyToken, migratePhoneBody.subAccountOTPVerifyToken);
    }

    public final String getMainAccountOTPVerifyToken() {
        return this.mainAccountOTPVerifyToken;
    }

    public final String getNameMatchedVerifyToken() {
        return this.nameMatchedVerifyToken;
    }

    public final String getPasswordVerifyToken() {
        return this.passwordVerifyToken;
    }

    public final String getSubAccountOTPVerifyToken() {
        return this.subAccountOTPVerifyToken;
    }

    public int hashCode() {
        String str = this.mainAccountOTPVerifyToken;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.nameMatchedVerifyToken;
        int iA = gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.passwordVerifyToken);
        String str3 = this.subAccountOTPVerifyToken;
        return iA + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.mainAccountOTPVerifyToken;
        String str2 = this.nameMatchedVerifyToken;
        return kwi.a(ux5.a("MigratePhoneBody(mainAccountOTPVerifyToken=", str, ", nameMatchedVerifyToken=", str2, ", passwordVerifyToken="), this.passwordVerifyToken, ", subAccountOTPVerifyToken=", this.subAccountOTPVerifyToken, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.mainAccountOTPVerifyToken);
        dest.writeString(this.nameMatchedVerifyToken);
        dest.writeString(this.passwordVerifyToken);
        dest.writeString(this.subAccountOTPVerifyToken);
    }
}
