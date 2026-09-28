package com.sportybet.feature.recap.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import com.twilio.voice.EventKeys;
import defpackage.m2g;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR'\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR'\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR-\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011Ê\u0001\u0002\b\u001e¨\u0006\u001d"}, d2 = {"Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapPlayedSports;", "", "desc", "", "title", "valueType", EventKeys.VALUES_KEY, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getDesc", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getTitle", "getValueType", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkRecapPlayedSports {

    @SerializedName("desc")
    private final String desc;

    @SerializedName("title")
    private final String title;

    @SerializedName("valueType")
    private final String valueType;

    @SerializedName(EventKeys.VALUES_KEY)
    private final List<String> values;

    public NetworkRecapPlayedSports(String str, String str2, String str3, List<String> list) {
        this.desc = str;
        this.title = str2;
        this.valueType = str3;
        this.values = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRecapPlayedSports copy$default(NetworkRecapPlayedSports networkRecapPlayedSports, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkRecapPlayedSports.desc;
        }
        if ((i & 2) != 0) {
            str2 = networkRecapPlayedSports.title;
        }
        if ((i & 4) != 0) {
            str3 = networkRecapPlayedSports.valueType;
        }
        if ((i & 8) != 0) {
            list = networkRecapPlayedSports.values;
        }
        return networkRecapPlayedSports.copy(str, str2, str3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getValueType() {
        return this.valueType;
    }

    public final List<String> component4() {
        return this.values;
    }

    public final NetworkRecapPlayedSports copy(String desc, String title, String valueType, List<String> values) {
        return new NetworkRecapPlayedSports(desc, title, valueType, values);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRecapPlayedSports)) {
            return false;
        }
        NetworkRecapPlayedSports networkRecapPlayedSports = (NetworkRecapPlayedSports) other;
        return Intrinsics.g(this.desc, networkRecapPlayedSports.desc) && Intrinsics.g(this.title, networkRecapPlayedSports.title) && Intrinsics.g(this.valueType, networkRecapPlayedSports.valueType) && Intrinsics.g(this.values, networkRecapPlayedSports.values);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValueType() {
        return this.valueType;
    }

    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.valueType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.values;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.desc;
        String str2 = this.title;
        return nve.a(this.valueType, ", values=", ")", ux5.a("NetworkRecapPlayedSports(desc=", str, ", title=", str2, ", valueType="), this.values);
    }

    public NetworkRecapPlayedSports(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? m2g.a : list);
    }
}
