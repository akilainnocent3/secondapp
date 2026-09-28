package com.sportybet.android.instantwin.newtork.model.response;

import com.google.gson.annotations.SerializedName;
import defpackage.bt6;
import defpackage.gmf0;
import defpackage.ux5;
import defpackage.v9d;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012Ê\u0001\f\b \u0012\b\b!\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001f"}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/Sport;", "", "sportId", "", "name", "gameTypes", "", "Lcom/sportybet/android/instantwin/newtork/model/response/InstantWinGameType;", "marketCategories", "Lcom/sportybet/android/instantwin/newtork/model/response/MarketCategory;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getSportId", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getName", "getGameTypes", "()Ljava/util/List;", "getMarketCategories", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "instantWin", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Sport {
    public static final int $stable = 0;

    @SerializedName("gameTypes")
    private final List<InstantWinGameType> gameTypes;

    @SerializedName("marketCategories")
    private final List<MarketCategory> marketCategories;

    @SerializedName("name")
    private final String name;

    @SerializedName("sportId")
    private final String sportId;

    public Sport(String str, String str2, List<InstantWinGameType> list, List<MarketCategory> list2) {
        bt6.a(str, str2, list2);
        this.sportId = str;
        this.name = str2;
        this.gameTypes = list;
        this.marketCategories = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Sport copy$default(Sport sport, String str, String str2, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sport.sportId;
        }
        if ((i & 2) != 0) {
            str2 = sport.name;
        }
        if ((i & 4) != 0) {
            list = sport.gameTypes;
        }
        if ((i & 8) != 0) {
            list2 = sport.marketCategories;
        }
        return sport.copy(str, str2, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<InstantWinGameType> component3() {
        return this.gameTypes;
    }

    public final List<MarketCategory> component4() {
        return this.marketCategories;
    }

    public final Sport copy(String sportId, String name, List<InstantWinGameType> gameTypes, List<MarketCategory> marketCategories) {
        sportId.getClass();
        name.getClass();
        marketCategories.getClass();
        return new Sport(sportId, name, gameTypes, marketCategories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sport)) {
            return false;
        }
        Sport sport = (Sport) other;
        return Intrinsics.g(this.sportId, sport.sportId) && Intrinsics.g(this.name, sport.name) && Intrinsics.g(this.gameTypes, sport.gameTypes) && Intrinsics.g(this.marketCategories, sport.marketCategories);
    }

    public final List<InstantWinGameType> getGameTypes() {
        return this.gameTypes;
    }

    public final List<MarketCategory> getMarketCategories() {
        return this.marketCategories;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSportId() {
        return this.sportId;
    }

    public int hashCode() {
        int iA = gmf0.a(this.sportId.hashCode() * 31, 31, this.name);
        List<InstantWinGameType> list = this.gameTypes;
        return this.marketCategories.hashCode() + ((iA + (list == null ? 0 : list.hashCode())) * 31);
    }

    public String toString() {
        String str = this.sportId;
        String str2 = this.name;
        return v9d.a(", marketCategories=", ")", ux5.a("Sport(sportId=", str, ", name=", str2, ", gameTypes="), this.gameTypes, this.marketCategories);
    }
}
