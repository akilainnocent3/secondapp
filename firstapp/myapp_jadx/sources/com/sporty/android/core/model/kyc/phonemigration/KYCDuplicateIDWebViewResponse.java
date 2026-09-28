package com.sporty.android.core.model.kyc.phonemigration;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.json.JsonSerializeService;
import defpackage.a320;
import defpackage.itf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00042\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;", "Landroid/os/Parcelable;", "KYCDuplicateIDWebViewData", "Failed", "Companion", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse$Failed;", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse$KYCDuplicateIDWebViewData;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface KYCDuplicateIDWebViewResponse extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007b\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse$Companion;", "", "<init>", "()V", "parse", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;", "json", "", "jsonSerializeService", "Lcom/sporty/android/core/model/json/JsonSerializeService;", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KYCDuplicateIDWebViewResponse parse(String json, JsonSerializeService jsonSerializeService) {
            json.getClass();
            jsonSerializeService.getClass();
            try {
                Object objFromJson = jsonSerializeService.fromJson(json, (Class<Object>) KYCDuplicateIDWebViewData.class);
                objFromJson.getClass();
                return (KYCDuplicateIDWebViewResponse) objFromJson;
            } catch (Throwable th) {
                itf0.a.d(a320.a("parse KYCWebViewResponse failed: ", th), new Object[0]);
                return Failed.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0014\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0083\u0004J\n\u0010\n\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u000b\u001a\u00020\fHÖ\u0081\u0004J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005Ê\u0001\u0002\b\u0013¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse$Failed;", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Failed implements KYCDuplicateIDWebViewResponse {
        public static final Failed INSTANCE = new Failed();
        public static final Parcelable.Creator<Failed> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Failed> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Failed.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Failed[] newArray(int i) {
                return new Failed[i];
            }
        }

        private Failed() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Failed);
        }

        public int hashCode() {
            return 1277997950;
        }

        public String toString() {
            return "Failed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013Ê\u0001\u0002\b'¨\u0006&"}, d2 = {"Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse$KYCDuplicateIDWebViewData;", "Lcom/sporty/android/core/model/kyc/phonemigration/KYCDuplicateIDWebViewResponse;", "userName", "", "config", "Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateConfigResponse;", "accountInfo", "Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateFindMainAccountResponse;", "checkPasswordToken", "Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateCheckPasswordResponse;", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateConfigResponse;Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateFindMainAccountResponse;Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateCheckPasswordResponse;)V", "getUserName", "()Ljava/lang/String;", "getConfig", "()Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateConfigResponse;", "getAccountInfo", "()Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateFindMainAccountResponse;", "getCheckPasswordToken", "()Lcom/sporty/android/core/model/kyc/phonemigration/PhoneMigrateCheckPasswordResponse;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class KYCDuplicateIDWebViewData implements KYCDuplicateIDWebViewResponse {
        public static final Parcelable.Creator<KYCDuplicateIDWebViewData> CREATOR = new Creator();
        private final PhoneMigrateFindMainAccountResponse accountInfo;
        private final PhoneMigrateCheckPasswordResponse checkPasswordToken;
        private final PhoneMigrateConfigResponse config;
        private final String userName;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<KYCDuplicateIDWebViewData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KYCDuplicateIDWebViewData createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new KYCDuplicateIDWebViewData(parcel.readString(), PhoneMigrateConfigResponse.CREATOR.createFromParcel(parcel), PhoneMigrateFindMainAccountResponse.CREATOR.createFromParcel(parcel), PhoneMigrateCheckPasswordResponse.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final KYCDuplicateIDWebViewData[] newArray(int i) {
                return new KYCDuplicateIDWebViewData[i];
            }
        }

        public KYCDuplicateIDWebViewData(String str, PhoneMigrateConfigResponse phoneMigrateConfigResponse, PhoneMigrateFindMainAccountResponse phoneMigrateFindMainAccountResponse, PhoneMigrateCheckPasswordResponse phoneMigrateCheckPasswordResponse) {
            str.getClass();
            phoneMigrateConfigResponse.getClass();
            phoneMigrateFindMainAccountResponse.getClass();
            phoneMigrateCheckPasswordResponse.getClass();
            this.userName = str;
            this.config = phoneMigrateConfigResponse;
            this.accountInfo = phoneMigrateFindMainAccountResponse;
            this.checkPasswordToken = phoneMigrateCheckPasswordResponse;
        }

        public static /* synthetic */ KYCDuplicateIDWebViewData copy$default(KYCDuplicateIDWebViewData kYCDuplicateIDWebViewData, String str, PhoneMigrateConfigResponse phoneMigrateConfigResponse, PhoneMigrateFindMainAccountResponse phoneMigrateFindMainAccountResponse, PhoneMigrateCheckPasswordResponse phoneMigrateCheckPasswordResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kYCDuplicateIDWebViewData.userName;
            }
            if ((i & 2) != 0) {
                phoneMigrateConfigResponse = kYCDuplicateIDWebViewData.config;
            }
            if ((i & 4) != 0) {
                phoneMigrateFindMainAccountResponse = kYCDuplicateIDWebViewData.accountInfo;
            }
            if ((i & 8) != 0) {
                phoneMigrateCheckPasswordResponse = kYCDuplicateIDWebViewData.checkPasswordToken;
            }
            return kYCDuplicateIDWebViewData.copy(str, phoneMigrateConfigResponse, phoneMigrateFindMainAccountResponse, phoneMigrateCheckPasswordResponse);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getUserName() {
            return this.userName;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final PhoneMigrateConfigResponse getConfig() {
            return this.config;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final PhoneMigrateFindMainAccountResponse getAccountInfo() {
            return this.accountInfo;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final PhoneMigrateCheckPasswordResponse getCheckPasswordToken() {
            return this.checkPasswordToken;
        }

        public final KYCDuplicateIDWebViewData copy(String userName, PhoneMigrateConfigResponse config, PhoneMigrateFindMainAccountResponse accountInfo, PhoneMigrateCheckPasswordResponse checkPasswordToken) {
            userName.getClass();
            config.getClass();
            accountInfo.getClass();
            checkPasswordToken.getClass();
            return new KYCDuplicateIDWebViewData(userName, config, accountInfo, checkPasswordToken);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof KYCDuplicateIDWebViewData)) {
                return false;
            }
            KYCDuplicateIDWebViewData kYCDuplicateIDWebViewData = (KYCDuplicateIDWebViewData) other;
            return Intrinsics.g(this.userName, kYCDuplicateIDWebViewData.userName) && Intrinsics.g(this.config, kYCDuplicateIDWebViewData.config) && Intrinsics.g(this.accountInfo, kYCDuplicateIDWebViewData.accountInfo) && Intrinsics.g(this.checkPasswordToken, kYCDuplicateIDWebViewData.checkPasswordToken);
        }

        public final PhoneMigrateFindMainAccountResponse getAccountInfo() {
            return this.accountInfo;
        }

        public final PhoneMigrateCheckPasswordResponse getCheckPasswordToken() {
            return this.checkPasswordToken;
        }

        public final PhoneMigrateConfigResponse getConfig() {
            return this.config;
        }

        public final String getUserName() {
            return this.userName;
        }

        public int hashCode() {
            return this.checkPasswordToken.hashCode() + ((this.accountInfo.hashCode() + ((this.config.hashCode() + (this.userName.hashCode() * 31)) * 31)) * 31);
        }

        public String toString() {
            return "KYCDuplicateIDWebViewData(userName=" + this.userName + ", config=" + this.config + ", accountInfo=" + this.accountInfo + ", checkPasswordToken=" + this.checkPasswordToken + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.userName);
            this.config.writeToParcel(dest, flags);
            this.accountInfo.writeToParcel(dest, flags);
            this.checkPasswordToken.writeToParcel(dest, flags);
        }
    }

    static KYCDuplicateIDWebViewResponse parse(String str, JsonSerializeService jsonSerializeService) {
        return INSTANCE.parse(str, jsonSerializeService);
    }
}
