package com.sportybet.android.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import com.sportybet.plugin.webcontainer.jsbridge.JsBridgeParams;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 \u00022\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lcom/sportybet/android/data/LaunchOTP;", "Landroid/os/Parcelable;", "Companion", "Failed", "Success", "Lcom/sportybet/android/data/LaunchOTP$Failed;", "Lcom/sportybet/android/data/LaunchOTP$Success;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface LaunchOTP extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007b\u0002\b\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/sportybet/android/data/LaunchOTP$Companion;", "", "<init>", "()V", "KEY_PHONE", "", "KEY_OTP_TOKEN", "KEY_CALL_BACK_NAME", "parse", "Lcom/sportybet/android/data/LaunchOTP;", "param", "Lcom/sportybet/plugin/webcontainer/jsbridge/JsBridgeParams;", "Lkotlin/jvm/JvmStatic;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String KEY_CALL_BACK_NAME = "callbackName";
        private static final String KEY_OTP_TOKEN = "otpToken";
        private static final String KEY_PHONE = "phone";

        private Companion() {
        }

        public final LaunchOTP parse(JsBridgeParams param) {
            Object param2;
            if (param != null && (param2 = param.getParam(KEY_PHONE)) != null) {
                if (!(param2 instanceof String)) {
                    param2 = null;
                }
                String str = (String) param2;
                if (str != null) {
                    Object param3 = param.getParam(KEY_OTP_TOKEN);
                    if (param3 != null) {
                        if (!(param3 instanceof String)) {
                            param3 = null;
                        }
                        String str2 = (String) param3;
                        if (str2 != null) {
                            Object param4 = param.getParam(KEY_CALL_BACK_NAME);
                            if (param4 != null) {
                                String str3 = (String) (param4 instanceof String ? param4 : null);
                                if (str3 != null) {
                                    return new Success(str, str2, str3);
                                }
                            }
                            return Failed.INSTANCE;
                        }
                    }
                    return Failed.INSTANCE;
                }
            }
            return Failed.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005Ê\u0001\u0002\b\fÊ\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u000b"}, d2 = {"Lcom/sportybet/android/data/LaunchOTP$Failed;", "Lcom/sportybet/android/data/LaunchOTP;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Failed implements LaunchOTP {
        public static final int $stable = 0;
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

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u001eÊ\u0001\f\b\u001f\u0012\b\b \u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001d"}, d2 = {"Lcom/sportybet/android/data/LaunchOTP$Success;", "Lcom/sportybet/android/data/LaunchOTP;", "phone", "", "otpToken", "callbackName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPhone", "()Ljava/lang/String;", "getOtpToken", "getCallbackName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Success implements LaunchOTP {
        private final String callbackName;
        private final String otpToken;
        private final String phone;
        public static final Parcelable.Creator<Success> CREATOR = new Creator();
        public static final int $stable = 8;

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Success> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Success(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Success[] newArray(int i) {
                return new Success[i];
            }
        }

        public Success(String str, String str2, String str3) {
            m.a(str, str2, str3);
            this.phone = str;
            this.otpToken = str2;
            this.callbackName = str3;
        }

        public static /* synthetic */ Success copy$default(Success success, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = success.phone;
            }
            if ((i & 2) != 0) {
                str2 = success.otpToken;
            }
            if ((i & 4) != 0) {
                str3 = success.callbackName;
            }
            return success.copy(str, str2, str3);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPhone() {
            return this.phone;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOtpToken() {
            return this.otpToken;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getCallbackName() {
            return this.callbackName;
        }

        public final Success copy(String phone, String otpToken, String callbackName) {
            phone.getClass();
            otpToken.getClass();
            callbackName.getClass();
            return new Success(phone, otpToken, callbackName);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Success)) {
                return false;
            }
            Success success = (Success) other;
            return Intrinsics.g(this.phone, success.phone) && Intrinsics.g(this.otpToken, success.otpToken) && Intrinsics.g(this.callbackName, success.callbackName);
        }

        public final String getCallbackName() {
            return this.callbackName;
        }

        public final String getOtpToken() {
            return this.otpToken;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return this.callbackName.hashCode() + gmf0.a(this.phone.hashCode() * 31, 31, this.otpToken);
        }

        public String toString() {
            String str = this.phone;
            String str2 = this.otpToken;
            return uf80.a(ux5.a("Success(phone=", str, ", otpToken=", str2, ", callbackName="), this.callbackName, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.getClass();
            dest.writeString(this.phone);
            dest.writeString(this.otpToken);
            dest.writeString(this.callbackName);
        }
    }

    static LaunchOTP parse(JsBridgeParams jsBridgeParams) {
        return INSTANCE.parse(jsBridgeParams);
    }
}
