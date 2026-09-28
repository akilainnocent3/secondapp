package com.sportybet.android.social.data.remote.entity;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0013Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/CreatorCreditsData;", "", "entityList", "", "Lcom/sportybet/android/social/data/remote/entity/CreatorCredit;", "<init>", "(Ljava/util/List;)V", "getEntityList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class CreatorCreditsData {
    public static final int $stable = 8;
    private final List<CreatorCredit> entityList;

    public CreatorCreditsData(List<CreatorCredit> list) {
        list.getClass();
        this.entityList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreatorCreditsData copy$default(CreatorCreditsData creatorCreditsData, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = creatorCreditsData.entityList;
        }
        return creatorCreditsData.copy(list);
    }

    public final List<CreatorCredit> component1() {
        return this.entityList;
    }

    public final CreatorCreditsData copy(List<CreatorCredit> entityList) {
        entityList.getClass();
        return new CreatorCreditsData(entityList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CreatorCreditsData) && Intrinsics.g(this.entityList, ((CreatorCreditsData) other).entityList);
    }

    public final List<CreatorCredit> getEntityList() {
        return this.entityList;
    }

    public int hashCode() {
        return this.entityList.hashCode();
    }

    public String toString() {
        return p.a("CreatorCreditsData(entityList=", ")", this.entityList);
    }
}
