package com.sportygames.lobby.remote.models;

import com.appsflyer.internal.b0;
import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00103\u001a\u00020\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0014HÆ\u0003J©\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001J\u0013\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010#R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006="}, d2 = {"Lcom/sportygames/lobby/remote/models/BannerDetailResponse;", "", AnalyticsParam.EVENT_PARAM_ID, "", "platform", "", "name", "imageUrl", "launchUrl", "launchTrigger", "linkType", "linkValue", "startAt", "endAt", "isActive", "", "position", "game", "Lcom/sportygames/lobby/remote/models/GameDetails;", Category.CATEGORY_ID, "Lcom/sportygames/lobby/remote/models/CategoriesResponse;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJLcom/sportygames/lobby/remote/models/GameDetails;Lcom/sportygames/lobby/remote/models/CategoriesResponse;)V", "getId", "()J", "getPlatform", "()Ljava/lang/String;", "getName", "getImageUrl", "getLaunchUrl", "getLaunchTrigger", "getLinkType", "getLinkValue", "getStartAt", "getEndAt", "()Z", "getPosition", "getGame", "()Lcom/sportygames/lobby/remote/models/GameDetails;", "getCategory", "()Lcom/sportygames/lobby/remote/models/CategoriesResponse;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "other", "hashCode", "", "toString", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BannerDetailResponse {
    public static final int $stable = 8;
    private final CategoriesResponse category;
    private final String endAt;
    private final GameDetails game;
    private final long id;
    private final String imageUrl;
    private final boolean isActive;
    private final String launchTrigger;
    private final String launchUrl;
    private final String linkType;
    private final String linkValue;
    private final String name;
    private final String platform;
    private final long position;
    private final String startAt;

    public /* synthetic */ BannerDetailResponse(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, long j2, GameDetails gameDetails, CategoriesResponse categoriesResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, z, j2, (i & 4096) != 0 ? null : gameDetails, (i & 8192) != 0 ? null : categoriesResponse);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getEndAt() {
        return this.endAt;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final GameDetails getGame() {
        return this.game;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final CategoriesResponse getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getLinkType() {
        return this.linkType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLinkValue() {
        return this.linkValue;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getStartAt() {
        return this.startAt;
    }

    public final BannerDetailResponse copy(long id, String platform, String name, String imageUrl, String launchUrl, String launchTrigger, String linkType, String linkValue, String startAt, String endAt, boolean isActive, long position, GameDetails game, CategoriesResponse category) {
        platform.getClass();
        return new BannerDetailResponse(id, platform, name, imageUrl, launchUrl, launchTrigger, linkType, linkValue, startAt, endAt, isActive, position, game, category);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDetailResponse)) {
            return false;
        }
        BannerDetailResponse bannerDetailResponse = (BannerDetailResponse) other;
        return this.id == bannerDetailResponse.id && Intrinsics.g(this.platform, bannerDetailResponse.platform) && Intrinsics.g(this.name, bannerDetailResponse.name) && Intrinsics.g(this.imageUrl, bannerDetailResponse.imageUrl) && Intrinsics.g(this.launchUrl, bannerDetailResponse.launchUrl) && Intrinsics.g(this.launchTrigger, bannerDetailResponse.launchTrigger) && Intrinsics.g(this.linkType, bannerDetailResponse.linkType) && Intrinsics.g(this.linkValue, bannerDetailResponse.linkValue) && Intrinsics.g(this.startAt, bannerDetailResponse.startAt) && Intrinsics.g(this.endAt, bannerDetailResponse.endAt) && this.isActive == bannerDetailResponse.isActive && this.position == bannerDetailResponse.position && Intrinsics.g(this.game, bannerDetailResponse.game) && Intrinsics.g(this.category, bannerDetailResponse.category);
    }

    public final CategoriesResponse getCategory() {
        return this.category;
    }

    public final String getEndAt() {
        return this.endAt;
    }

    public final GameDetails getGame() {
        return this.game;
    }

    public final long getId() {
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    public final String getLinkType() {
        return this.linkType;
    }

    public final String getLinkValue() {
        return this.linkValue;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final long getPosition() {
        return this.position;
    }

    public final String getStartAt() {
        return this.startAt;
    }

    public int hashCode() {
        int iA = gmf0.a(Long.hashCode(this.id) * 31, 31, this.platform);
        String str = this.name;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.launchUrl;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.launchTrigger;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.linkType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.linkValue;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.startAt;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.endAt;
        int iA2 = f87.a(mtg0.a((iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.isActive), this.position, 31);
        GameDetails gameDetails = this.game;
        int iHashCode8 = (iA2 + (gameDetails == null ? 0 : gameDetails.hashCode())) * 31;
        CategoriesResponse categoriesResponse = this.category;
        return iHashCode8 + (categoriesResponse != null ? categoriesResponse.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        long j = this.id;
        String str = this.platform;
        String str2 = this.name;
        String str3 = this.imageUrl;
        String str4 = this.launchUrl;
        String str5 = this.launchTrigger;
        String str6 = this.linkType;
        String str7 = this.linkValue;
        String str8 = this.startAt;
        String str9 = this.endAt;
        boolean z = this.isActive;
        long j2 = this.position;
        GameDetails gameDetails = this.game;
        CategoriesResponse categoriesResponse = this.category;
        StringBuilder sbA = b0.a(j, "BannerDetailResponse(id=", ", platform=", str);
        hxa.c(sbA, ", name=", str2, ", imageUrl=", str3);
        hxa.c(sbA, ", launchUrl=", str4, ", launchTrigger=", str5);
        hxa.c(sbA, ", linkType=", str6, ", linkValue=", str7);
        hxa.c(sbA, ", startAt=", str8, ", endAt=", str9);
        sbA.append(", isActive=");
        sbA.append(z);
        sbA.append(", position=");
        sbA.append(j2);
        sbA.append(", game=");
        sbA.append(gameDetails);
        sbA.append(", category=");
        sbA.append(categoriesResponse);
        sbA.append(")");
        return sbA.toString();
    }

    public BannerDetailResponse(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z, long j2, GameDetails gameDetails, CategoriesResponse categoriesResponse) {
        str.getClass();
        this.id = j;
        this.platform = str;
        this.name = str2;
        this.imageUrl = str3;
        this.launchUrl = str4;
        this.launchTrigger = str5;
        this.linkType = str6;
        this.linkValue = str7;
        this.startAt = str8;
        this.endAt = str9;
        this.isActive = z;
        this.position = j2;
        this.game = gameDetails;
        this.category = categoriesResponse;
    }
}
