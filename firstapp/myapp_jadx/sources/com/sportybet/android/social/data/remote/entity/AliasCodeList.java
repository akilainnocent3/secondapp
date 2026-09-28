package com.sportybet.android.social.data.remote.entity;

import com.twilio.voice.EventKeys;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/AliasCodeList;", "", EventKeys.ERROR_CODE, "", "Lcom/sportybet/android/social/data/remote/entity/AliasCode;", "reachLimit", "", "<init>", "(Ljava/util/List;Z)V", "getCode", "()Ljava/util/List;", "getReachLimit", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AliasCodeList {
    public static final int $stable = 8;
    private final List<AliasCode> code;
    private final boolean reachLimit;

    public AliasCodeList(List<AliasCode> list, boolean z) {
        list.getClass();
        this.code = list;
        this.reachLimit = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AliasCodeList copy$default(AliasCodeList aliasCodeList, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = aliasCodeList.code;
        }
        if ((i & 2) != 0) {
            z = aliasCodeList.reachLimit;
        }
        return aliasCodeList.copy(list, z);
    }

    public final List<AliasCode> component1() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getReachLimit() {
        return this.reachLimit;
    }

    public final AliasCodeList copy(List<AliasCode> code, boolean reachLimit) {
        code.getClass();
        return new AliasCodeList(code, reachLimit);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AliasCodeList)) {
            return false;
        }
        AliasCodeList aliasCodeList = (AliasCodeList) other;
        return Intrinsics.g(this.code, aliasCodeList.code) && this.reachLimit == aliasCodeList.reachLimit;
    }

    public final List<AliasCode> getCode() {
        return this.code;
    }

    public final boolean getReachLimit() {
        return this.reachLimit;
    }

    public int hashCode() {
        return Boolean.hashCode(this.reachLimit) + (this.code.hashCode() * 31);
    }

    public String toString() {
        return "AliasCodeList(code=" + this.code + ", reachLimit=" + this.reachLimit + ")";
    }

    public AliasCodeList(List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list, z);
    }
}
