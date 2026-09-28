package com.sportybet.feature.dedicatedteampage.shared.data.model;

import defpackage.mtg0;
import defpackage.ng1;
import defpackage.z620;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003J5\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u0004HÖ\u0081\u0004R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001bÊ\u0001\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/shared/data/model/PaginatedResponseDto;", "T", "", "flag", "", "hasNextPage", "", "data", "", "<init>", "(Ljava/lang/String;ZLjava/util/List;)V", "getFlag", "()Ljava/lang/String;", "getHasNextPage", "()Z", "getData", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PaginatedResponseDto<T> {
    public static final int $stable = 8;
    private final List<T> data;
    private final String flag;
    private final boolean hasNextPage;

    /* JADX WARN: Multi-variable type inference failed */
    public PaginatedResponseDto(String str, boolean z, List<? extends T> list) {
        list.getClass();
        this.flag = str;
        this.hasNextPage = z;
        this.data = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaginatedResponseDto copy$default(PaginatedResponseDto paginatedResponseDto, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paginatedResponseDto.flag;
        }
        if ((i & 2) != 0) {
            z = paginatedResponseDto.hasNextPage;
        }
        if ((i & 4) != 0) {
            list = paginatedResponseDto.data;
        }
        return paginatedResponseDto.copy(str, z, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFlag() {
        return this.flag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public final List<T> component3() {
        return this.data;
    }

    public final PaginatedResponseDto<T> copy(String flag, boolean hasNextPage, List<? extends T> data) {
        data.getClass();
        return new PaginatedResponseDto<>(flag, hasNextPage, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaginatedResponseDto)) {
            return false;
        }
        PaginatedResponseDto paginatedResponseDto = (PaginatedResponseDto) other;
        return Intrinsics.g(this.flag, paginatedResponseDto.flag) && this.hasNextPage == paginatedResponseDto.hasNextPage && Intrinsics.g(this.data, paginatedResponseDto.data);
    }

    public final List<T> getData() {
        return this.data;
    }

    public final String getFlag() {
        return this.flag;
    }

    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }

    public int hashCode() {
        String str = this.flag;
        return this.data.hashCode() + mtg0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.hasNextPage);
    }

    public String toString() {
        String str = this.flag;
        boolean z = this.hasNextPage;
        return ng1.a(z620.a("PaginatedResponseDto(flag=", str, ", hasNextPage=", ", data=", z), this.data, ")");
    }
}
