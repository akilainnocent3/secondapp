package com.sporty.android.core.model.patron;

import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.qn4;
import defpackage.z620;
import defpackage.zbp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\tHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000eHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003Jo\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0014\u0010.\u001a\u00020\u00052\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00100\u001a\u00020\tHÖ\u0081\u0004J\n\u00101\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013R%\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u0092\u0002\f\b\u001f\u0012\b\b \u0012\u0004\b\t0!¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0013¨\u00062"}, d2 = {"Lcom/sporty/android/core/model/patron/DeviceModel;", "", LastLoginDeviceInfo.KEY_LOCATION, "", "currentDevice", "", LastLoginDeviceInfo.KEY_DEVICE, "deviceId", "inactiveDays", "", "ip", "phoneModel", "platform", AnalyticsParam.EVENT_STATUS, "Lcom/sporty/android/core/model/patron/DeviceStatusDto;", "updateTime", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/patron/DeviceStatusDto;Ljava/lang/String;)V", "getLocation", "()Ljava/lang/String;", "getCurrentDevice", "()Z", "getDevice", "getDeviceId", "getInactiveDays", "()I", "getIp", "getPhoneModel", "getPlatform", "getStatus", "()Lcom/sporty/android/core/model/patron/DeviceStatusDto;", "Lcom/google/gson/annotations/JsonAdapter;", "value", "Lcom/sporty/android/core/model/patron/DeviceStatusDtoAdapter;", "getUpdateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DeviceModel {
    private final boolean currentDevice;
    private final String device;
    private final String deviceId;
    private final int inactiveDays;
    private final String ip;
    private final String location;
    private final String phoneModel;
    private final String platform;

    @zbp(DeviceStatusDtoAdapter.class)
    private final DeviceStatusDto status;
    private final String updateTime;

    public DeviceModel(String str, boolean z, String str2, String str3, int i, String str4, String str5, String str6, DeviceStatusDto deviceStatusDto, String str7) {
        qn4.b(str2, str3, str4, str5, str6);
        deviceStatusDto.getClass();
        str7.getClass();
        this.location = str;
        this.currentDevice = z;
        this.device = str2;
        this.deviceId = str3;
        this.inactiveDays = i;
        this.ip = str4;
        this.phoneModel = str5;
        this.platform = str6;
        this.status = deviceStatusDto;
        this.updateTime = str7;
    }

    public static /* synthetic */ DeviceModel copy$default(DeviceModel deviceModel, String str, boolean z, String str2, String str3, int i, String str4, String str5, String str6, DeviceStatusDto deviceStatusDto, String str7, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = deviceModel.location;
        }
        if ((i2 & 2) != 0) {
            z = deviceModel.currentDevice;
        }
        if ((i2 & 4) != 0) {
            str2 = deviceModel.device;
        }
        if ((i2 & 8) != 0) {
            str3 = deviceModel.deviceId;
        }
        if ((i2 & 16) != 0) {
            i = deviceModel.inactiveDays;
        }
        if ((i2 & 32) != 0) {
            str4 = deviceModel.ip;
        }
        if ((i2 & 64) != 0) {
            str5 = deviceModel.phoneModel;
        }
        if ((i2 & 128) != 0) {
            str6 = deviceModel.platform;
        }
        if ((i2 & 256) != 0) {
            deviceStatusDto = deviceModel.status;
        }
        if ((i2 & 512) != 0) {
            str7 = deviceModel.updateTime;
        }
        DeviceStatusDto deviceStatusDto2 = deviceStatusDto;
        String str8 = str7;
        String str9 = str5;
        String str10 = str6;
        int i3 = i;
        String str11 = str4;
        return deviceModel.copy(str, z, str2, str3, i3, str11, str9, str10, deviceStatusDto2, str8);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getCurrentDevice() {
        return this.currentDevice;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDevice() {
        return this.device;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getInactiveDays() {
        return this.inactiveDays;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPhoneModel() {
        return this.phoneModel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final DeviceStatusDto getStatus() {
        return this.status;
    }

    public final DeviceModel copy(String location, boolean currentDevice, String device, String deviceId, int inactiveDays, String ip, String phoneModel, String platform, DeviceStatusDto status, String updateTime) {
        qn4.b(device, deviceId, ip, phoneModel, platform);
        status.getClass();
        updateTime.getClass();
        return new DeviceModel(location, currentDevice, device, deviceId, inactiveDays, ip, phoneModel, platform, status, updateTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceModel)) {
            return false;
        }
        DeviceModel deviceModel = (DeviceModel) other;
        return Intrinsics.g(this.location, deviceModel.location) && this.currentDevice == deviceModel.currentDevice && Intrinsics.g(this.device, deviceModel.device) && Intrinsics.g(this.deviceId, deviceModel.deviceId) && this.inactiveDays == deviceModel.inactiveDays && Intrinsics.g(this.ip, deviceModel.ip) && Intrinsics.g(this.phoneModel, deviceModel.phoneModel) && Intrinsics.g(this.platform, deviceModel.platform) && this.status == deviceModel.status && Intrinsics.g(this.updateTime, deviceModel.updateTime);
    }

    public final boolean getCurrentDevice() {
        return this.currentDevice;
    }

    public final String getDevice() {
        return this.device;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final int getInactiveDays() {
        return this.inactiveDays;
    }

    public final String getIp() {
        return this.ip;
    }

    public final String getLocation() {
        return this.location;
    }

    public final String getPhoneModel() {
        return this.phoneModel;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final DeviceStatusDto getStatus() {
        return this.status;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.location;
        return this.updateTime.hashCode() + ((this.status.hashCode() + gmf0.a(gmf0.a(gmf0.a(gpp.a(this.inactiveDays, gmf0.a(gmf0.a(mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.currentDevice), 31, this.device), 31, this.deviceId), 31), 31, this.ip), 31, this.phoneModel), 31, this.platform)) * 31);
    }

    public String toString() {
        String str = this.location;
        boolean z = this.currentDevice;
        String str2 = this.device;
        String str3 = this.deviceId;
        int i = this.inactiveDays;
        String str4 = this.ip;
        String str5 = this.phoneModel;
        String str6 = this.platform;
        DeviceStatusDto deviceStatusDto = this.status;
        String str7 = this.updateTime;
        StringBuilder sbA = z620.a("DeviceModel(location=", str, ", currentDevice=", ", device=", z);
        hxa.c(sbA, str2, ", deviceId=", str3, ", inactiveDays=");
        f78.b(i, ", ip=", str4, ", phoneModel=", sbA);
        hxa.c(sbA, str5, ", platform=", str6, ", status=");
        sbA.append(deviceStatusDto);
        sbA.append(", updateTime=");
        sbA.append(str7);
        sbA.append(")");
        return sbA.toString();
    }
}
