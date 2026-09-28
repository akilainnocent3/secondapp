package com.sportybet.feature.worldcup.config.domain.model;

import com.sporty.android.book.domain.entity.Category;
import defpackage.gmf0;
import defpackage.kwi;
import defpackage.ux5;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nÊ\u0001\u0002\b\u001aÊ\u0001\f\b\u001b\u0012\b\b\u001c\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/worldcup/config/domain/model/WorldCupRelatedGame;", "", "thumbnailUrl", "", "redirectUrl", "name", Category.CATEGORY_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getThumbnailUrl", "()Ljava/lang/String;", "getRedirectUrl", "getName", "getCategory", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "world-cup", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WorldCupRelatedGame {
    public static final int $stable = 0;
    private final String category;
    private final String name;
    private final String redirectUrl;
    private final String thumbnailUrl;

    public WorldCupRelatedGame(String str, String str2, String str3, String str4) {
        wd7.a(str, str2, str3, str4);
        this.thumbnailUrl = str;
        this.redirectUrl = str2;
        this.name = str3;
        this.category = str4;
    }

    public static /* synthetic */ WorldCupRelatedGame copy$default(WorldCupRelatedGame worldCupRelatedGame, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = worldCupRelatedGame.thumbnailUrl;
        }
        if ((i & 2) != 0) {
            str2 = worldCupRelatedGame.redirectUrl;
        }
        if ((i & 4) != 0) {
            str3 = worldCupRelatedGame.name;
        }
        if ((i & 8) != 0) {
            str4 = worldCupRelatedGame.category;
        }
        return worldCupRelatedGame.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final WorldCupRelatedGame copy(String thumbnailUrl, String redirectUrl, String name, String category) {
        thumbnailUrl.getClass();
        redirectUrl.getClass();
        name.getClass();
        category.getClass();
        return new WorldCupRelatedGame(thumbnailUrl, redirectUrl, name, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorldCupRelatedGame)) {
            return false;
        }
        WorldCupRelatedGame worldCupRelatedGame = (WorldCupRelatedGame) other;
        return Intrinsics.g(this.thumbnailUrl, worldCupRelatedGame.thumbnailUrl) && Intrinsics.g(this.redirectUrl, worldCupRelatedGame.redirectUrl) && Intrinsics.g(this.name, worldCupRelatedGame.name) && Intrinsics.g(this.category, worldCupRelatedGame.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRedirectUrl() {
        return this.redirectUrl;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int hashCode() {
        return this.category.hashCode() + gmf0.a(gmf0.a(this.thumbnailUrl.hashCode() * 31, 31, this.redirectUrl), 31, this.name);
    }

    public String toString() {
        String str = this.thumbnailUrl;
        String str2 = this.redirectUrl;
        return kwi.a(ux5.a("WorldCupRelatedGame(thumbnailUrl=", str, ", redirectUrl=", str2, ", name="), this.name, ", category=", this.category, ")");
    }
}
