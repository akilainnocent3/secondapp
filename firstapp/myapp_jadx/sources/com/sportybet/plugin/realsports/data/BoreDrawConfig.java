package com.sportybet.plugin.realsports.data;

import com.appsflyer.internal.p;
import com.sporty.android.core.model.config.BoreDrawItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/sportybet/plugin/realsports/data/BoreDrawConfig;", "", "boreDrawItems", "", "Lcom/sporty/android/core/model/config/BoreDrawItem;", "<init>", "(Ljava/util/List;)V", "getBoreDrawItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BoreDrawConfig {
    public static final int $stable = 8;
    private final List<BoreDrawItem> boreDrawItems;

    public /* synthetic */ BoreDrawConfig(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BoreDrawConfig copy$default(BoreDrawConfig boreDrawConfig, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = boreDrawConfig.boreDrawItems;
        }
        return boreDrawConfig.copy(list);
    }

    public final List<BoreDrawItem> component1() {
        return this.boreDrawItems;
    }

    public final BoreDrawConfig copy(List<BoreDrawItem> boreDrawItems) {
        return new BoreDrawConfig(boreDrawItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BoreDrawConfig) && Intrinsics.g(this.boreDrawItems, ((BoreDrawConfig) other).boreDrawItems);
    }

    public final List<BoreDrawItem> getBoreDrawItems() {
        return this.boreDrawItems;
    }

    public int hashCode() {
        List<BoreDrawItem> list = this.boreDrawItems;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return p.a("BoreDrawConfig(boreDrawItems=", ")", this.boreDrawItems);
    }

    public BoreDrawConfig(List<BoreDrawItem> list) {
        this.boreDrawItems = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BoreDrawConfig() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
