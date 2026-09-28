package com.sportybet.feature.luckynumber.placebet.data.data;

import defpackage.kwi;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/luckynumber/placebet/data/data/LNStatisticsNumbersDTO;", "", "mostPlayed", "", "leastPlayed", "mostDrawn", "leastDrawn", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMostPlayed", "()Ljava/lang/String;", "getLeastPlayed", "getMostDrawn", "getLeastDrawn", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNStatisticsNumbersDTO {
    public static final int $stable = 0;
    private final String leastDrawn;
    private final String leastPlayed;
    private final String mostDrawn;
    private final String mostPlayed;

    public LNStatisticsNumbersDTO(String str, String str2, String str3, String str4) {
        this.mostPlayed = str;
        this.leastPlayed = str2;
        this.mostDrawn = str3;
        this.leastDrawn = str4;
    }

    public static /* synthetic */ LNStatisticsNumbersDTO copy$default(LNStatisticsNumbersDTO lNStatisticsNumbersDTO, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNStatisticsNumbersDTO.mostPlayed;
        }
        if ((i & 2) != 0) {
            str2 = lNStatisticsNumbersDTO.leastPlayed;
        }
        if ((i & 4) != 0) {
            str3 = lNStatisticsNumbersDTO.mostDrawn;
        }
        if ((i & 8) != 0) {
            str4 = lNStatisticsNumbersDTO.leastDrawn;
        }
        return lNStatisticsNumbersDTO.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMostPlayed() {
        return this.mostPlayed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLeastPlayed() {
        return this.leastPlayed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMostDrawn() {
        return this.mostDrawn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLeastDrawn() {
        return this.leastDrawn;
    }

    public final LNStatisticsNumbersDTO copy(String mostPlayed, String leastPlayed, String mostDrawn, String leastDrawn) {
        return new LNStatisticsNumbersDTO(mostPlayed, leastPlayed, mostDrawn, leastDrawn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNStatisticsNumbersDTO)) {
            return false;
        }
        LNStatisticsNumbersDTO lNStatisticsNumbersDTO = (LNStatisticsNumbersDTO) other;
        return Intrinsics.g(this.mostPlayed, lNStatisticsNumbersDTO.mostPlayed) && Intrinsics.g(this.leastPlayed, lNStatisticsNumbersDTO.leastPlayed) && Intrinsics.g(this.mostDrawn, lNStatisticsNumbersDTO.mostDrawn) && Intrinsics.g(this.leastDrawn, lNStatisticsNumbersDTO.leastDrawn);
    }

    public final String getLeastDrawn() {
        return this.leastDrawn;
    }

    public final String getLeastPlayed() {
        return this.leastPlayed;
    }

    public final String getMostDrawn() {
        return this.mostDrawn;
    }

    public final String getMostPlayed() {
        return this.mostPlayed;
    }

    public int hashCode() {
        String str = this.mostPlayed;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leastPlayed;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mostDrawn;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leastDrawn;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.mostPlayed;
        String str2 = this.leastPlayed;
        return kwi.a(ux5.a("LNStatisticsNumbersDTO(mostPlayed=", str, ", leastPlayed=", str2, ", mostDrawn="), this.mostDrawn, ", leastDrawn=", this.leastDrawn, ")");
    }
}
