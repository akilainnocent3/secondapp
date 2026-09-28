package com.sportybet.plugin.realsports.onetwoup.domain.model;

import com.appsflyer.internal.p;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bÊ\u0001\u0002\b\u0013Ê\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0012"}, d2 = {"Lcom/sportybet/plugin/realsports/onetwoup/domain/model/OneTwoUpDisplayConfigSet;", "", "countries", "", "Lcom/sportybet/plugin/realsports/onetwoup/domain/model/OneTwoUpDisplayConfig;", "<init>", "(Ljava/util/List;)V", "getCountries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OneTwoUpDisplayConfigSet {
    public static final int $stable = 8;
    private final List<OneTwoUpDisplayConfig> countries;

    public OneTwoUpDisplayConfigSet(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OneTwoUpDisplayConfigSet copy$default(OneTwoUpDisplayConfigSet oneTwoUpDisplayConfigSet, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = oneTwoUpDisplayConfigSet.countries;
        }
        return oneTwoUpDisplayConfigSet.copy(list);
    }

    public final List<OneTwoUpDisplayConfig> component1() {
        return this.countries;
    }

    public final OneTwoUpDisplayConfigSet copy(List<OneTwoUpDisplayConfig> countries) {
        countries.getClass();
        return new OneTwoUpDisplayConfigSet(countries);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OneTwoUpDisplayConfigSet) && Intrinsics.g(this.countries, ((OneTwoUpDisplayConfigSet) other).countries);
    }

    public final List<OneTwoUpDisplayConfig> getCountries() {
        return this.countries;
    }

    public int hashCode() {
        return this.countries.hashCode();
    }

    public String toString() {
        return p.a("OneTwoUpDisplayConfigSet(countries=", ")", this.countries);
    }

    public OneTwoUpDisplayConfigSet(List<OneTwoUpDisplayConfig> list) {
        list.getClass();
        this.countries = list;
    }

    public OneTwoUpDisplayConfigSet() {
        this(null, 1, null);
    }
}
