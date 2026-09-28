package com.sportybet.plugin.realsports.prematch.data;

import defpackage.gpp;
import defpackage.ml5;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/prematch/data/TournamentDetails;", "", "tournamentId", "", "productId", "", "sportId", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTournamentId", "()Ljava/lang/String;", "getProductId", "()I", "getSportId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TournamentDetails {
    public static final int $stable = 0;
    private final int productId;
    private final String sportId;
    private final String tournamentId;

    public TournamentDetails(String str, int i, String str2) {
        str.getClass();
        str2.getClass();
        this.tournamentId = str;
        this.productId = i;
        this.sportId = str2;
    }

    public static /* synthetic */ TournamentDetails copy$default(TournamentDetails tournamentDetails, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tournamentDetails.tournamentId;
        }
        if ((i2 & 2) != 0) {
            i = tournamentDetails.productId;
        }
        if ((i2 & 4) != 0) {
            str2 = tournamentDetails.sportId;
        }
        return tournamentDetails.copy(str, i, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTournamentId() {
        return this.tournamentId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    public final TournamentDetails copy(String tournamentId, int productId, String sportId) {
        tournamentId.getClass();
        sportId.getClass();
        return new TournamentDetails(tournamentId, productId, sportId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TournamentDetails)) {
            return false;
        }
        TournamentDetails tournamentDetails = (TournamentDetails) other;
        return Intrinsics.g(this.tournamentId, tournamentDetails.tournamentId) && this.productId == tournamentDetails.productId && Intrinsics.g(this.sportId, tournamentDetails.sportId);
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public final String getTournamentId() {
        return this.tournamentId;
    }

    public int hashCode() {
        return this.sportId.hashCode() + gpp.a(this.productId, this.tournamentId.hashCode() * 31, 31);
    }

    public String toString() {
        String str = this.tournamentId;
        int i = this.productId;
        return uf80.a(ml5.a(i, "TournamentDetails(tournamentId=", str, ", productId=", ", sportId="), this.sportId, ")");
    }
}
