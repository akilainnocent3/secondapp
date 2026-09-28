package com.sporty.android.core.model.accountprotection;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.ux5;
import defpackage.zi50;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b%¨\u0006$"}, d2 = {"Lcom/sporty/android/core/model/accountprotection/LastLoginDeviceInfo;", "Landroid/os/Parcelable;", LastLoginDeviceInfo.KEY_DEVICE, "", "platform", "ip", LastLoginDeviceInfo.KEY_LOCATION, "deviceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDevice", "()Ljava/lang/String;", "getPlatform", "getIp", "getLocation", "getDeviceId", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "model", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LastLoginDeviceInfo implements Parcelable {
    private static final String DATA_KEY = "data";
    public static final String KEY_DEVICE = "device";
    public static final String KEY_IP = "ip";
    public static final String KEY_LOCATION = "location";
    public static final String KEY_PLATFORM = "platform";
    private final String device;
    private final String deviceId;
    private final String ip;
    private final String location;
    private final String platform;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LastLoginDeviceInfo> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007b\u0002\b\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/sporty/android/core/model/accountprotection/LastLoginDeviceInfo$Companion;", "", "<init>", "()V", "KEY_DEVICE", "", "KEY_PLATFORM", "KEY_IP", "KEY_LOCATION", "DATA_KEY", "mapJSONObjectToLastDeviceInfo", "Lcom/sporty/android/core/model/accountprotection/LastLoginDeviceInfo;", "data", "Lorg/json/JSONObject;", "Lkotlin/jvm/JvmStatic;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LastLoginDeviceInfo mapJSONObjectToLastDeviceInfo(JSONObject data) {
            Object bVar;
            data.getClass();
            try {
                zi50.a aVar = zi50.b;
                bVar = data.getJSONObject("data");
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            JSONObject jSONObject = (JSONObject) bVar;
            if (jSONObject == null) {
                return null;
            }
            return new LastLoginDeviceInfo(jSONObject.optString(LastLoginDeviceInfo.KEY_DEVICE), jSONObject.optString("platform"), jSONObject.optString("ip"), jSONObject.optString(LastLoginDeviceInfo.KEY_LOCATION), null, 16, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LastLoginDeviceInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastLoginDeviceInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LastLoginDeviceInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LastLoginDeviceInfo[] newArray(int i) {
            return new LastLoginDeviceInfo[i];
        }
    }

    public /* synthetic */ LastLoginDeviceInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public static /* synthetic */ LastLoginDeviceInfo copy$default(LastLoginDeviceInfo lastLoginDeviceInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lastLoginDeviceInfo.device;
        }
        if ((i & 2) != 0) {
            str2 = lastLoginDeviceInfo.platform;
        }
        if ((i & 4) != 0) {
            str3 = lastLoginDeviceInfo.ip;
        }
        if ((i & 8) != 0) {
            str4 = lastLoginDeviceInfo.location;
        }
        if ((i & 16) != 0) {
            str5 = lastLoginDeviceInfo.deviceId;
        }
        String str6 = str5;
        String str7 = str3;
        return lastLoginDeviceInfo.copy(str, str2, str7, str4, str6);
    }

    public static final LastLoginDeviceInfo mapJSONObjectToLastDeviceInfo(JSONObject jSONObject) {
        return INSTANCE.mapJSONObjectToLastDeviceInfo(jSONObject);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final LastLoginDeviceInfo copy(String device, String platform, String ip, String location, String deviceId) {
        return new LastLoginDeviceInfo(device, platform, ip, location, deviceId);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastLoginDeviceInfo)) {
            return false;
        }
        LastLoginDeviceInfo lastLoginDeviceInfo = (LastLoginDeviceInfo) other;
        return Intrinsics.g(this.device, lastLoginDeviceInfo.device) && Intrinsics.g(this.platform, lastLoginDeviceInfo.platform) && Intrinsics.g(this.ip, lastLoginDeviceInfo.ip) && Intrinsics.g(this.location, lastLoginDeviceInfo.location) && Intrinsics.g(this.deviceId, lastLoginDeviceInfo.deviceId);
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public int hashCode() {
        String str = this.device;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.platform;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ip;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.location;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.deviceId;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.device;
        String str2 = this.platform;
        String str3 = this.ip;
        String str4 = this.location;
        String str5 = this.deviceId;
        StringBuilder sbA = ux5.a("LastLoginDeviceInfo(device=", str, ", platform=", str2, ", ip=");
        hxa.c(sbA, str3, ", location=", str4, ", deviceId=");
        return uf80.a(sbA, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.device);
        dest.writeString(this.platform);
        dest.writeString(this.ip);
        dest.writeString(this.location);
        dest.writeString(this.deviceId);
    }

    public LastLoginDeviceInfo(String str, String str2, String str3, String str4, String str5) {
        this.device = str;
        this.platform = str2;
        this.ip = str3;
        this.location = str4;
        this.deviceId = str5;
    }

    public LastLoginDeviceInfo() {
        this(null, null, null, null, null, 31, null);
    }
}
