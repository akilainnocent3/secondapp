package com.sporty.android.core.model.pocket.globalpay;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/pocket/globalpay/ChannelData;", "", "name", "", "provideName", AnalyticsParam.EVENT_PARAM_ID, "", "bankCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "getProvideName", "Lcom/google/gson/annotations/SerializedName;", "value", "provide_name", "getId", "()I", "getBankCode", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ChannelData {
    private final String bankCode;
    private final int id;
    private final String name;

    @SerializedName("provide_name")
    private final String provideName;

    public ChannelData(String str, String str2, int i, String str3) {
        str.getClass();
        str2.getClass();
        this.name = str;
        this.provideName = str2;
        this.id = i;
        this.bankCode = str3;
    }

    public static /* synthetic */ ChannelData copy$default(ChannelData channelData, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = channelData.name;
        }
        if ((i2 & 2) != 0) {
            str2 = channelData.provideName;
        }
        if ((i2 & 4) != 0) {
            i = channelData.id;
        }
        if ((i2 & 8) != 0) {
            str3 = channelData.bankCode;
        }
        return channelData.copy(str, str2, i, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProvideName() {
        return this.provideName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBankCode() {
        return this.bankCode;
    }

    public final ChannelData copy(String name, String provideName, int id, String bankCode) {
        name.getClass();
        provideName.getClass();
        return new ChannelData(name, provideName, id, bankCode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelData)) {
            return false;
        }
        ChannelData channelData = (ChannelData) other;
        return Intrinsics.g(this.name, channelData.name) && Intrinsics.g(this.provideName, channelData.provideName) && this.id == channelData.id && Intrinsics.g(this.bankCode, channelData.bankCode);
    }

    public final String getBankCode() {
        return this.bankCode;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getProvideName() {
        return this.provideName;
    }

    public int hashCode() {
        int iA = gpp.a(this.id, gmf0.a(this.name.hashCode() * 31, 31, this.provideName), 31);
        String str = this.bankCode;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.name;
        String str2 = this.provideName;
        int i = this.id;
        String str3 = this.bankCode;
        StringBuilder sbA = ux5.a("ChannelData(name=", str, ", provideName=", str2, ", id=");
        sbA.append(i);
        sbA.append(", bankCode=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ ChannelData(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, (i2 & 8) != 0 ? null : str3);
    }
}
