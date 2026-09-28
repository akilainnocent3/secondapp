package com.sportybet.feature.recap.data.remote.dto;

import com.google.gson.annotations.SerializedName;
import defpackage.m2g;
import defpackage.uf80;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bÊ\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapTopMarkets;", "", "desc", "", "items", "", "Lcom/sportybet/feature/recap/data/remote/dto/NetworkRecapMarketItem;", "title", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getDesc", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getItems", "()Ljava/util/List;", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NetworkRecapTopMarkets {

    @SerializedName("desc")
    private final String desc;

    @SerializedName("items")
    private final List<NetworkRecapMarketItem> items;

    @SerializedName("title")
    private final String title;

    public NetworkRecapTopMarkets(String str, List<NetworkRecapMarketItem> list, String str2) {
        this.desc = str;
        this.items = list;
        this.title = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkRecapTopMarkets copy$default(NetworkRecapTopMarkets networkRecapTopMarkets, String str, List list, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = networkRecapTopMarkets.desc;
        }
        if ((i & 2) != 0) {
            list = networkRecapTopMarkets.items;
        }
        if ((i & 4) != 0) {
            str2 = networkRecapTopMarkets.title;
        }
        return networkRecapTopMarkets.copy(str, list, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final List<NetworkRecapMarketItem> component2() {
        return this.items;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final NetworkRecapTopMarkets copy(String desc, List<NetworkRecapMarketItem> items, String title) {
        return new NetworkRecapTopMarkets(desc, items, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkRecapTopMarkets)) {
            return false;
        }
        NetworkRecapTopMarkets networkRecapTopMarkets = (NetworkRecapTopMarkets) other;
        return Intrinsics.g(this.desc, networkRecapTopMarkets.desc) && Intrinsics.g(this.items, networkRecapTopMarkets.items) && Intrinsics.g(this.title, networkRecapTopMarkets.title);
    }

    public final String getDesc() {
        return this.desc;
    }

    public final List<NetworkRecapMarketItem> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.desc;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<NetworkRecapMarketItem> list = this.items;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.title;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.desc;
        List<NetworkRecapMarketItem> list = this.items;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("NetworkRecapTopMarkets(desc=");
        sb.append(str);
        sb.append(", items=");
        sb.append(list);
        sb.append(", title=");
        return uf80.a(sb, str2, ")");
    }

    public NetworkRecapTopMarkets(String str, List list, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? m2g.a : list, str2);
    }
}
