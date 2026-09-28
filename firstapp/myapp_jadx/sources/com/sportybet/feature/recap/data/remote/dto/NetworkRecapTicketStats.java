package com.sportybet.feature.recap.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ>\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\u0005\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\u0005\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR)\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\u0005\u0012\u0004\b\b(\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR)\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\u0005\u0012\u0004\b\b(\u0007¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fÊ\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapTicketStats;", "", "title", "", "desc", "value", "", "valueType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getTitle", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "getDesc", "getValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getValueType", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapTicketStats;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkRecapTicketStats {

    @SerializedName("desc")
    private final String desc;

    @SerializedName("title")
    private final String title;

    @SerializedName("value")
    private final Integer value;

    @SerializedName("valueType")
    private final Integer valueType;

    public NetworkRecapTicketStats(String str, String str2, Integer num, Integer num2) {
        this.title = str;
        this.desc = str2;
        this.value = num;
        this.valueType = num2;
    }

    public static /* synthetic */ NetworkRecapTicketStats copy$default(NetworkRecapTicketStats networkRecapTicketStats, String str, String str2, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkRecapTicketStats.title;
        }
        if ((i & 2) != 0) {
            str2 = networkRecapTicketStats.desc;
        }
        if ((i & 4) != 0) {
            num = networkRecapTicketStats.value;
        }
        if ((i & 8) != 0) {
            num2 = networkRecapTicketStats.valueType;
        }
        return networkRecapTicketStats.copy(str, str2, num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getValueType() {
        return this.valueType;
    }

    public final NetworkRecapTicketStats copy(String title, String desc, Integer value, Integer valueType) {
        return new NetworkRecapTicketStats(title, desc, value, valueType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRecapTicketStats)) {
            return false;
        }
        NetworkRecapTicketStats networkRecapTicketStats = (NetworkRecapTicketStats) other;
        return Intrinsics.g(this.title, networkRecapTicketStats.title) && Intrinsics.g(this.desc, networkRecapTicketStats.desc) && Intrinsics.g(this.value, networkRecapTicketStats.value) && Intrinsics.g(this.valueType, networkRecapTicketStats.valueType);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getValue() {
        return this.value;
    }

    public final Integer getValueType() {
        return this.valueType;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.value;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.valueType;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.desc;
        Integer num = this.value;
        Integer num2 = this.valueType;
        StringBuilder sbA = ux5.a("NetworkRecapTicketStats(title=", str, ", desc=", str2, ", value=");
        sbA.append(num);
        sbA.append(", valueType=");
        sbA.append(num2);
        sbA.append(")");
        return sbA.toString();
    }
}
