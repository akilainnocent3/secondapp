package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/book/domain/entity/FeaturedBetBuilderMarket;", "", "specifier", "", AnalyticsParam.EVENT_PARAM_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getSpecifier", "()Ljava/lang/String;", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FeaturedBetBuilderMarket {
    public static final int $stable = 0;
    private final String id;
    private final String specifier;

    public FeaturedBetBuilderMarket(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.specifier = str;
        this.id = str2;
    }

    public static /* synthetic */ FeaturedBetBuilderMarket copy$default(FeaturedBetBuilderMarket featuredBetBuilderMarket, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = featuredBetBuilderMarket.specifier;
        }
        if ((i & 2) != 0) {
            str2 = featuredBetBuilderMarket.id;
        }
        return featuredBetBuilderMarket.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final FeaturedBetBuilderMarket copy(String specifier, String id) {
        specifier.getClass();
        id.getClass();
        return new FeaturedBetBuilderMarket(specifier, id);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeaturedBetBuilderMarket)) {
            return false;
        }
        FeaturedBetBuilderMarket featuredBetBuilderMarket = (FeaturedBetBuilderMarket) other;
        return Intrinsics.g(this.specifier, featuredBetBuilderMarket.specifier) && Intrinsics.g(this.id, featuredBetBuilderMarket.id);
    }

    public final String getId() {
        return this.id;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public int hashCode() {
        return this.id.hashCode() + (this.specifier.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("FeaturedBetBuilderMarket(specifier=", this.specifier, ", id=", this.id, ")");
    }
}
