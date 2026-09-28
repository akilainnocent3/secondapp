package com.sporty.android.book.domain.entity;

import defpackage.ai50;
import defpackage.hfb0;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J9\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nÊ\u0001\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/book/domain/entity/SportLists;", "", "sportList", "", "Lcom/sporty/android/book/domain/entity/Sport;", "popularEvents", "popularCategories", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getSportList", "()Ljava/util/List;", "getPopularEvents", "getPopularCategories", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportLists {
    public static final int $stable = 0;
    private final List<Sport> popularCategories;
    private final List<Sport> popularEvents;
    private final List<Sport> sportList;

    public SportLists(List<Sport> list, List<Sport> list2, List<Sport> list3) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.sportList = list;
        this.popularEvents = list2;
        this.popularCategories = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportLists copy$default(SportLists sportLists, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = sportLists.sportList;
        }
        if ((i & 2) != 0) {
            list2 = sportLists.popularEvents;
        }
        if ((i & 4) != 0) {
            list3 = sportLists.popularCategories;
        }
        return sportLists.copy(list, list2, list3);
    }

    public final List<Sport> component1() {
        return this.sportList;
    }

    public final List<Sport> component2() {
        return this.popularEvents;
    }

    public final List<Sport> component3() {
        return this.popularCategories;
    }

    public final SportLists copy(List<Sport> sportList, List<Sport> popularEvents, List<Sport> popularCategories) {
        sportList.getClass();
        popularEvents.getClass();
        popularCategories.getClass();
        return new SportLists(sportList, popularEvents, popularCategories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SportLists)) {
            return false;
        }
        SportLists sportLists = (SportLists) other;
        return Intrinsics.g(this.sportList, sportLists.sportList) && Intrinsics.g(this.popularEvents, sportLists.popularEvents) && Intrinsics.g(this.popularCategories, sportLists.popularCategories);
    }

    public final List<Sport> getPopularCategories() {
        return this.popularCategories;
    }

    public final List<Sport> getPopularEvents() {
        return this.popularEvents;
    }

    public final List<Sport> getSportList() {
        return this.sportList;
    }

    public int hashCode() {
        return this.popularCategories.hashCode() + ai50.a(this.sportList.hashCode() * 31, 31, this.popularEvents);
    }

    public String toString() {
        List<Sport> list = this.sportList;
        List<Sport> list2 = this.popularEvents;
        return ng1.a(hfb0.a("SportLists(sportList=", ", popularEvents=", ", popularCategories=", list, list2), this.popularCategories, ")");
    }
}
