package com.sporty.android.core.model.betbuilder;

import com.google.gson.annotations.SerializedName;
import defpackage.gmf0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J-\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u001bHÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0004HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR%\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0010¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/core/model/betbuilder/Filter;", "", "ids", "", "", "sportId", "type", "Lcom/sporty/android/core/model/betbuilder/FilterType;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lcom/sporty/android/core/model/betbuilder/FilterType;)V", "getIds", "()Ljava/util/List;", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "sport", "getType", "()Lcom/sporty/android/core/model/betbuilder/FilterType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Filter {
    private final List<String> ids;

    @SerializedName("sport")
    private final String sportId;
    private final FilterType type;

    public Filter(List<String> list, String str, FilterType filterType) {
        list.getClass();
        str.getClass();
        filterType.getClass();
        this.ids = list;
        this.sportId = str;
        this.type = filterType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Filter copy$default(Filter filter, List list, String str, FilterType filterType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = filter.ids;
        }
        if ((i & 2) != 0) {
            str = filter.sportId;
        }
        if ((i & 4) != 0) {
            filterType = filter.type;
        }
        return filter.copy(list, str, filterType);
    }

    public final List<String> component1() {
        return this.ids;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FilterType getType() {
        return this.type;
    }

    public final Filter copy(List<String> ids, String sportId, FilterType type) {
        ids.getClass();
        sportId.getClass();
        type.getClass();
        return new Filter(ids, sportId, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Filter)) {
            return false;
        }
        Filter filter = (Filter) other;
        return Intrinsics.g(this.ids, filter.ids) && Intrinsics.g(this.sportId, filter.sportId) && this.type == filter.type;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final FilterType getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + gmf0.a(this.ids.hashCode() * 31, 31, this.sportId);
    }

    public String toString() {
        return "Filter(ids=" + this.ids + ", sportId=" + this.sportId + ", type=" + this.type + ")";
    }
}
