package com.sportybet.android.instantwin.newtork.model.tracking;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "", "bizType", "", "<init>", "(Ljava/lang/Integer;)V", "getBizType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "copy", "(Ljava/lang/Integer;)Lcom/sportybet/android/instantwin/newtork/model/tracking/InstantWinBizTypeTag;", "equals", "", "other", "hashCode", "toString", "", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantWinBizTypeTag {
    public static final int $stable = 0;
    private final Integer bizType;

    public /* synthetic */ InstantWinBizTypeTag(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }

    public static /* synthetic */ InstantWinBizTypeTag copy$default(InstantWinBizTypeTag instantWinBizTypeTag, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            num = instantWinBizTypeTag.bizType;
        }
        return instantWinBizTypeTag.copy(num);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getBizType() {
        return this.bizType;
    }

    public final InstantWinBizTypeTag copy(Integer bizType) {
        return new InstantWinBizTypeTag(bizType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof InstantWinBizTypeTag) && Intrinsics.g(this.bizType, ((InstantWinBizTypeTag) other).bizType);
    }

    public final Integer getBizType() {
        return this.bizType;
    }

    public int hashCode() {
        Integer num = this.bizType;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public String toString() {
        return "InstantWinBizTypeTag(bizType=" + this.bizType + ")";
    }

    public InstantWinBizTypeTag(Integer num) {
        this.bizType = num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InstantWinBizTypeTag() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
