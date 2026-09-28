package com.sporty.android.core.model.gift;

import com.google.gson.annotations.SerializedName;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0014\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010#\u001a\u00020$HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/gift/GiftCountBody;", "", "classify", "", "bizType", "betType", "deviceChannel", "deviceChannels", "", "<init>", "(IILjava/lang/Integer;ILjava/util/List;)V", "getClassify", "()I", "getBizType", "getBetType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDeviceChannel", "Lcom/google/gson/annotations/SerializedName;", "value", "deviceCh", "getDeviceChannels", "()Ljava/util/List;", "deviceChs", "component1", "component2", "component3", "component4", "component5", "copy", "(IILjava/lang/Integer;ILjava/util/List;)Lcom/sporty/android/core/model/gift/GiftCountBody;", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftCountBody {
    private final Integer betType;
    private final int bizType;
    private final int classify;

    @SerializedName("deviceCh")
    private final int deviceChannel;

    @SerializedName("deviceChs")
    private final List<Integer> deviceChannels;

    public /* synthetic */ GiftCountBody(int i, int i2, Integer num, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? null : num, i3, (i4 & 16) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftCountBody copy$default(GiftCountBody giftCountBody, int i, int i2, Integer num, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = giftCountBody.classify;
        }
        if ((i4 & 2) != 0) {
            i2 = giftCountBody.bizType;
        }
        if ((i4 & 4) != 0) {
            num = giftCountBody.betType;
        }
        if ((i4 & 8) != 0) {
            i3 = giftCountBody.deviceChannel;
        }
        if ((i4 & 16) != 0) {
            list = giftCountBody.deviceChannels;
        }
        List list2 = list;
        Integer num2 = num;
        return giftCountBody.copy(i, i2, num2, i3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getClassify() {
        return this.classify;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBizType() {
        return this.bizType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getBetType() {
        return this.betType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDeviceChannel() {
        return this.deviceChannel;
    }

    public final List<Integer> component5() {
        return this.deviceChannels;
    }

    public final GiftCountBody copy(int classify, int bizType, Integer betType, int deviceChannel, List<Integer> deviceChannels) {
        return new GiftCountBody(classify, bizType, betType, deviceChannel, deviceChannels);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftCountBody)) {
            return false;
        }
        GiftCountBody giftCountBody = (GiftCountBody) other;
        return this.classify == giftCountBody.classify && this.bizType == giftCountBody.bizType && Intrinsics.g(this.betType, giftCountBody.betType) && this.deviceChannel == giftCountBody.deviceChannel && Intrinsics.g(this.deviceChannels, giftCountBody.deviceChannels);
    }

    public final Integer getBetType() {
        return this.betType;
    }

    public final int getBizType() {
        return this.bizType;
    }

    public final int getClassify() {
        return this.classify;
    }

    public final int getDeviceChannel() {
        return this.deviceChannel;
    }

    public final List<Integer> getDeviceChannels() {
        return this.deviceChannels;
    }

    public int hashCode() {
        int iA = gpp.a(this.bizType, Integer.hashCode(this.classify) * 31, 31);
        Integer num = this.betType;
        int iA2 = gpp.a(this.deviceChannel, (iA + (num == null ? 0 : num.hashCode())) * 31, 31);
        List<Integer> list = this.deviceChannels;
        return iA2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        int i = this.classify;
        int i2 = this.bizType;
        Integer num = this.betType;
        int i3 = this.deviceChannel;
        List<Integer> list = this.deviceChannels;
        StringBuilder sbA = dy5.a("GiftCountBody(classify=", i, i2, ", bizType=", ", betType=");
        sbA.append(num);
        sbA.append(", deviceChannel=");
        sbA.append(i3);
        sbA.append(", deviceChannels=");
        return ng1.a(sbA, list, ")");
    }

    public GiftCountBody(int i, int i2, Integer num, int i3, List<Integer> list) {
        this.classify = i;
        this.bizType = i2;
        this.betType = num;
        this.deviceChannel = i3;
        this.deviceChannels = list;
    }
}
