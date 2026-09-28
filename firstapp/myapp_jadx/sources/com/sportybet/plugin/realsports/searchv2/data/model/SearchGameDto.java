package com.sportybet.plugin.realsports.searchv2.data.model;

import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bÊ\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/plugin/realsports/searchv2/data/model/SearchGameDto;", "", "gameId", "", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "gameCategory", "gameIcon", "gameLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getGameId", "()Ljava/lang/String;", "getGameName", "getGameCategory", "getGameIcon", "getGameLink", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SearchGameDto {
    public static final int $stable = 0;
    private final String gameCategory;
    private final String gameIcon;
    private final String gameId;
    private final String gameLink;
    private final String gameName;

    public /* synthetic */ SearchGameDto(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }

    public static /* synthetic */ SearchGameDto copy$default(SearchGameDto searchGameDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = searchGameDto.gameId;
        }
        if ((i & 2) != 0) {
            str2 = searchGameDto.gameName;
        }
        if ((i & 4) != 0) {
            str3 = searchGameDto.gameCategory;
        }
        if ((i & 8) != 0) {
            str4 = searchGameDto.gameIcon;
        }
        if ((i & 16) != 0) {
            str5 = searchGameDto.gameLink;
        }
        String str6 = str5;
        String str7 = str3;
        return searchGameDto.copy(str, str2, str7, str4, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGameName() {
        return this.gameName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getGameCategory() {
        return this.gameCategory;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGameIcon() {
        return this.gameIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getGameLink() {
        return this.gameLink;
    }

    public final SearchGameDto copy(String gameId, String gameName, String gameCategory, String gameIcon, String gameLink) {
        gameId.getClass();
        gameName.getClass();
        gameCategory.getClass();
        gameIcon.getClass();
        gameLink.getClass();
        return new SearchGameDto(gameId, gameName, gameCategory, gameIcon, gameLink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchGameDto)) {
            return false;
        }
        SearchGameDto searchGameDto = (SearchGameDto) other;
        return Intrinsics.g(this.gameId, searchGameDto.gameId) && Intrinsics.g(this.gameName, searchGameDto.gameName) && Intrinsics.g(this.gameCategory, searchGameDto.gameCategory) && Intrinsics.g(this.gameIcon, searchGameDto.gameIcon) && Intrinsics.g(this.gameLink, searchGameDto.gameLink);
    }

    public final String getGameCategory() {
        return this.gameCategory;
    }

    public final String getGameIcon() {
        return this.gameIcon;
    }

    public final String getGameId() {
        return this.gameId;
    }

    public final String getGameLink() {
        return this.gameLink;
    }

    public final String getGameName() {
        return this.gameName;
    }

    public int hashCode() {
        return this.gameLink.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.gameId.hashCode() * 31, 31, this.gameName), 31, this.gameCategory), 31, this.gameIcon);
    }

    public String toString() {
        String str = this.gameId;
        String str2 = this.gameName;
        String str3 = this.gameCategory;
        String str4 = this.gameIcon;
        String str5 = this.gameLink;
        StringBuilder sbA = ux5.a("SearchGameDto(gameId=", str, ", gameName=", str2, ", gameCategory=");
        hxa.c(sbA, str3, ", gameIcon=", str4, ", gameLink=");
        return uf80.a(sbA, str5, ")");
    }

    public SearchGameDto(String str, String str2, String str3, String str4, String str5) {
        qn4.b(str, str2, str3, str4, str5);
        this.gameId = str;
        this.gameName = str2;
        this.gameCategory = str3;
        this.gameIcon = str4;
        this.gameLink = str5;
    }

    public SearchGameDto() {
        this(null, null, null, null, null, 31, null);
    }
}
