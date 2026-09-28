package com.sporty.android.core.model.config;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/config/BoreDrawSport;", "", "items", "", "Lcom/sporty/android/core/model/config/BoreDrawItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "sr:sport:1", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BoreDrawSport {

    @SerializedName("sr:sport:1")
    private final List<BoreDrawItem> items;

    public BoreDrawSport(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoreDrawSport copy$default(BoreDrawSport boreDrawSport, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = boreDrawSport.items;
        }
        return boreDrawSport.copy(list);
    }

    public final List<BoreDrawItem> component1() {
        return this.items;
    }

    public final BoreDrawSport copy(List<BoreDrawItem> items) {
        return new BoreDrawSport(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BoreDrawSport) && Intrinsics.g(this.items, ((BoreDrawSport) other).items);
    }

    public final List<BoreDrawItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        List<BoreDrawItem> list = this.items;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a(dqvOSm.ZSQXI, ")", this.items);
    }

    public BoreDrawSport(List<BoreDrawItem> list) {
        this.items = list;
    }

    public BoreDrawSport() {
        this(null, 1, null);
    }
}
