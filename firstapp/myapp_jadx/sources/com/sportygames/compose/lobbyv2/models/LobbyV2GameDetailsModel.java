package com.sportygames.compose.lobbyv2.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.transition.nfj.CaBJCMnsV;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import defpackage.f78;
import defpackage.gfs;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.mng;
import defpackage.mq0;
import defpackage.p200;
import defpackage.qn4;
import defpackage.qpu;
import defpackage.uts;
import defpackage.w03;
import defpackage.x03;
import defpackage.xbp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b(\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0010\u0012\b\b\u0002\u0010 \u001a\u00020\u0006\u0012\b\b\u0002\u0010!\u001a\u00020\u0006\u0012\b\b\u0002\u0010\"\u001a\u00020\u0006\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010'\u001a\u00020\u0010¢\u0006\u0004\b(\u0010)J\r\u0010S\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010,J\b\u0010T\u001a\u0004\u0018\u00010\u0006J\u0006\u0010U\u001a\u00020\u0010J\u0006\u0010V\u001a\u00020WJ\u0013\u0010X\u001a\u00020\u00102\b\u0010Y\u001a\u0004\u0018\u00010ZH\u0096\u0002J\b\u0010[\u001a\u00020\u0003H\u0016J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0002\u0010,J\u0012\u0010]\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b^\u0010,J\u000b\u0010_\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00104J\u000b\u0010i\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010k\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014HÆ\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u000b\u0010n\u001a\u0004\u0018\u00010\u0006HÂ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010,J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014HÆ\u0003J\u0011\u0010r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014HÆ\u0003J\t\u0010s\u001a\u00020\u0006HÆ\u0003J\t\u0010t\u001a\u00020\u0010HÆ\u0003J\t\u0010u\u001a\u00020\u0010HÆ\u0003J\t\u0010v\u001a\u00020\u0006HÆ\u0003J\t\u0010w\u001a\u00020\u0006HÆ\u0003J\t\u0010x\u001a\u00020\u0006HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\u0006HÆ\u0003J\u0011\u0010{\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010}\u001a\u00020\u0010HÆ\u0003J \u0003\u0010~\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00102\b\b\u0002\u0010\u001f\u001a\u00020\u00102\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00062\b\b\u0002\u0010\"\u001a\u00020\u00062\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u00062\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00142\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010'\u001a\u00020\u0010HÆ\u0001¢\u0006\u0002\u0010\u007fJ\u0007\u0010\u0080\u0001\u001a\u00020\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0006HÖ\u0001J\u001b\u0010\u0082\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0085\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u0003R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010*R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0080\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u00105\u001a\u0004\b3\u00104R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b6\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b7\u00100R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u0010.R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b<\u0010,R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010*\u001a\u0004\b?\u0010,R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00109R\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u00109R\u0011\u0010\u001d\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u001a\u0010\u001e\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010C\"\u0004\bD\u0010ER\u001a\u0010\u001f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010C\"\u0004\bF\u0010ER\u001a\u0010 \u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00100\"\u0004\bH\u0010IR\u001a\u0010!\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u00100\"\u0004\bK\u0010IR\u001a\u0010\"\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00100\"\u0004\bM\u0010IR\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010$\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\bP\u00100R\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\bQ\u00109R\u0013\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\bR\u00100R\u0011\u0010'\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b'\u0010C¨\u0006\u0087\u0001"}, d2 = {"Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "gameId", "createdAt", "", "updatedAt", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "name", "countryCode", "displayName", "platform", "nativeSupportVersion", "launchUrl", "forceUseWebView", "", "launchTrigger", "imageUrl", "tags", "", "position", "launchRate", "releasedAt", "metaInfo", "Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;", "onlineUserCount", "gameSounds", "commonSounds", "howToPlayBaseUrl", "isFavourite", "isFavouriteRun", "favouriteMessage", "categoryName", "description", "categoryId", "bannerType", "games", "spotlightTitle", "isBottomOrientation", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "Ljava/lang/Integer;", "getGameId$SGLibrary_sportybetRelease", "()Ljava/lang/Integer;", "setGameId$SGLibrary_sportybetRelease", "(Ljava/lang/Integer;)V", "getDisplayName", "()Ljava/lang/String;", "getNativeSupportVersion", "getLaunchUrl", "getForceUseWebView", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLaunchTrigger", "getImageUrl", "getTags", "()Ljava/util/List;", "getPosition", "setPosition", "getLaunchRate", "getMetaInfo", "()Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;", "getOnlineUserCount", "getGameSounds", "getCommonSounds", "getHowToPlayBaseUrl", "()Z", "setFavourite", "(Z)V", "setFavouriteRun", "getFavouriteMessage", "setFavouriteMessage", "(Ljava/lang/String;)V", "getCategoryName", "setCategoryName", "getDescription", "setDescription", "getCategoryId", "()I", "getBannerType", "getGames", "getSpotlightTitle", "getId", "getName", "isBannerTypeCategory", "toLegacyGameDetails", "Lcom/sportygames/lobby/remote/models/GameDetails;", "equals", "other", "", "hashCode", "component1", "component2", "component2$SGLibrary_sportybetRelease", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sportygames/lobby/remote/models/LobbyMetaInfo;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Z)Lcom/sportygames/compose/lobbyv2/models/LobbyV2GameDetailsModel;", "describeContents", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LobbyV2GameDetailsModel implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<LobbyV2GameDetailsModel> CREATOR = new a();
    private final String bannerType;
    private final int categoryId;
    private String categoryName;

    @xbp(name = "commonSounds")
    private final List<String> commonSounds;
    private final String countryCode;
    private final String createdAt;
    private String description;
    private final String displayName;
    private String favouriteMessage;
    private final Boolean forceUseWebView;
    private Integer gameId;
    private String gameName;

    @xbp(name = "gameSounds")
    private final List<String> gameSounds;
    private final List<LobbyV2GameDetailsModel> games;
    private final String howToPlayBaseUrl;
    private Integer id;
    private final String imageUrl;
    private final boolean isBottomOrientation;
    private boolean isFavourite;
    private boolean isFavouriteRun;
    private final Integer launchRate;
    private final String launchTrigger;
    private final String launchUrl;
    private final LobbyMetaInfo metaInfo;
    private String name;
    private final String nativeSupportVersion;
    private final Integer onlineUserCount;
    private final String platform;
    private Integer position;
    private final String releasedAt;
    private final String spotlightTitle;
    private final List<String> tags;
    private final String updatedAt;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements Parcelable.Creator<LobbyV2GameDetailsModel> {
        @Override // android.os.Parcelable.Creator
        public final LobbyV2GameDetailsModel createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            ArrayList arrayList;
            boolean z;
            Boolean bool;
            parcel.getClass();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string12 = parcel.readString();
            LobbyMetaInfo lobbyMetaInfoCreateFromParcel = parcel.readInt() == 0 ? null : LobbyMetaInfo.CREATOR.createFromParcel(parcel);
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            String string13 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            String string14 = parcel.readString();
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            int i = parcel.readInt();
            String string17 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
                bool = boolValueOf;
                z = true;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = p200.a(LobbyV2GameDetailsModel.CREATOR, parcel, arrayList2, iA, 1);
                    boolValueOf = boolValueOf;
                    i2 = i2;
                }
                arrayList = arrayList2;
                z = true;
                bool = boolValueOf;
            }
            return new LobbyV2GameDetailsModel(numValueOf, numValueOf2, string, string2, string3, string4, string5, string6, string7, string8, string9, bool, string10, string11, arrayListCreateStringArrayList, numValueOf3, numValueOf4, string12, lobbyMetaInfoCreateFromParcel, numValueOf5, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string13, z2, z3, string14, string15, string16, i, string17, arrayList, parcel.readString(), parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final LobbyV2GameDetailsModel[] newArray(int i) {
            return new LobbyV2GameDetailsModel[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LobbyV2GameDetailsModel(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, List list, Integer num3, Integer num4, String str12, LobbyMetaInfo lobbyMetaInfo, Integer num5, List list2, List list3, String str13, boolean z, boolean z2, String str14, String str15, String str16, int i, String str17, List list4, String str18, boolean z3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num6 = 0;
        this((i2 & 1) != 0 ? num6 : num, (i2 & 2) != 0 ? num6 : num2, (i2 & 4) != 0 ? "" : str, (i2 & 8) != 0 ? "" : str2, (i2 & 16) != 0 ? "" : str3, (i2 & 32) != 0 ? "" : str4, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? Boolean.FALSE : bool, (i2 & 4096) != 0 ? "" : str10, (i2 & 8192) != 0 ? "" : str11, (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? new ArrayList() : list, (i2 & 32768) != 0 ? num6 : num3, (i2 & 65536) != 0 ? num6 : num4, (i2 & 131072) != 0 ? "" : str12, (i2 & 262144) != 0 ? null : lobbyMetaInfo, (i2 & 524288) == 0 ? num5 : 0, (i2 & 1048576) != 0 ? new ArrayList() : list2, (i2 & 2097152) != 0 ? new ArrayList() : list3, (i2 & 4194304) != 0 ? "" : str13, (i2 & 8388608) != 0 ? false : z, (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z2, (i2 & 33554432) != 0 ? "" : str14, (i2 & 67108864) != 0 ? "" : str15, (i2 & 134217728) != 0 ? "" : str16, (i2 & 268435456) != 0 ? 0 : i, (i2 & 536870912) != 0 ? "" : str17, (i2 & 1073741824) != 0 ? m2g.a : list4, (i2 & Integer.MIN_VALUE) == 0 ? str18 : "", (i3 & 1) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    private final String getReleasedAt() {
        return this.releasedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    private final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    private final String getGameName() {
        return this.gameName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final String getPlatform() {
        return this.platform;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LobbyV2GameDetailsModel copy$default(LobbyV2GameDetailsModel lobbyV2GameDetailsModel, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, List list, Integer num3, Integer num4, String str12, LobbyMetaInfo lobbyMetaInfo, Integer num5, List list2, List list3, String str13, boolean z, boolean z2, String str14, String str15, String str16, int i, String str17, List list4, String str18, boolean z3, int i2, int i3, Object obj) {
        boolean z4;
        String str19;
        Integer num6 = (i2 & 1) != 0 ? lobbyV2GameDetailsModel.id : num;
        Integer num7 = (i2 & 2) != 0 ? lobbyV2GameDetailsModel.gameId : num2;
        String str20 = (i2 & 4) != 0 ? lobbyV2GameDetailsModel.createdAt : str;
        String str21 = (i2 & 8) != 0 ? lobbyV2GameDetailsModel.updatedAt : str2;
        String str22 = (i2 & 16) != 0 ? lobbyV2GameDetailsModel.gameName : str3;
        String str23 = (i2 & 32) != 0 ? lobbyV2GameDetailsModel.name : str4;
        String str24 = (i2 & 64) != 0 ? lobbyV2GameDetailsModel.countryCode : str5;
        String str25 = (i2 & 128) != 0 ? lobbyV2GameDetailsModel.displayName : str6;
        String str26 = (i2 & 256) != 0 ? lobbyV2GameDetailsModel.platform : str7;
        String str27 = (i2 & 512) != 0 ? lobbyV2GameDetailsModel.nativeSupportVersion : str8;
        String str28 = (i2 & 1024) != 0 ? lobbyV2GameDetailsModel.launchUrl : str9;
        Boolean bool2 = (i2 & 2048) != 0 ? lobbyV2GameDetailsModel.forceUseWebView : bool;
        String str29 = (i2 & 4096) != 0 ? lobbyV2GameDetailsModel.launchTrigger : str10;
        String str30 = (i2 & 8192) != 0 ? lobbyV2GameDetailsModel.imageUrl : str11;
        Integer num8 = num6;
        List list5 = (i2 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? lobbyV2GameDetailsModel.tags : list;
        Integer num9 = (i2 & 32768) != 0 ? lobbyV2GameDetailsModel.position : num3;
        Integer num10 = (i2 & 65536) != 0 ? lobbyV2GameDetailsModel.launchRate : num4;
        String str31 = (i2 & 131072) != 0 ? lobbyV2GameDetailsModel.releasedAt : str12;
        LobbyMetaInfo lobbyMetaInfo2 = (i2 & 262144) != 0 ? lobbyV2GameDetailsModel.metaInfo : lobbyMetaInfo;
        Integer num11 = (i2 & 524288) != 0 ? lobbyV2GameDetailsModel.onlineUserCount : num5;
        List list6 = (i2 & 1048576) != 0 ? lobbyV2GameDetailsModel.gameSounds : list2;
        List list7 = (i2 & 2097152) != 0 ? lobbyV2GameDetailsModel.commonSounds : list3;
        String str32 = (i2 & 4194304) != 0 ? lobbyV2GameDetailsModel.howToPlayBaseUrl : str13;
        boolean z5 = (i2 & 8388608) != 0 ? lobbyV2GameDetailsModel.isFavourite : z;
        boolean z6 = (i2 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? lobbyV2GameDetailsModel.isFavouriteRun : z2;
        String str33 = (i2 & 33554432) != 0 ? lobbyV2GameDetailsModel.favouriteMessage : str14;
        String str34 = (i2 & 67108864) != 0 ? lobbyV2GameDetailsModel.categoryName : str15;
        String str35 = (i2 & 134217728) != 0 ? lobbyV2GameDetailsModel.description : str16;
        int i4 = (i2 & 268435456) != 0 ? lobbyV2GameDetailsModel.categoryId : i;
        String str36 = (i2 & 536870912) != 0 ? lobbyV2GameDetailsModel.bannerType : str17;
        List list8 = (i2 & 1073741824) != 0 ? lobbyV2GameDetailsModel.games : list4;
        String str37 = (i2 & Integer.MIN_VALUE) != 0 ? lobbyV2GameDetailsModel.spotlightTitle : str18;
        if ((i3 & 1) != 0) {
            str19 = str37;
            z4 = lobbyV2GameDetailsModel.isBottomOrientation;
        } else {
            z4 = z3;
            str19 = str37;
        }
        return lobbyV2GameDetailsModel.copy(num8, num7, str20, str21, str22, str23, str24, str25, str26, str27, str28, bool2, str29, str30, list5, num9, num10, str31, lobbyMetaInfo2, num11, list6, list7, str32, z5, z6, str33, str34, str35, i4, str36, list8, str19, z4);
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getNativeSupportVersion() {
        return this.nativeSupportVersion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getForceUseWebView() {
        return this.forceUseWebView;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<String> component15() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getLaunchRate() {
        return this.launchRate;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final LobbyMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    /* JADX INFO: renamed from: component2$SGLibrary_sportybetRelease, reason: from getter */
    public final Integer getGameId() {
        return this.gameId;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final Integer getOnlineUserCount() {
        return this.onlineUserCount;
    }

    public final List<String> component21() {
        return this.gameSounds;
    }

    public final List<String> component22() {
        return this.commonSounds;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getHowToPlayBaseUrl() {
        return this.howToPlayBaseUrl;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final boolean getIsFavouriteRun() {
        return this.isFavouriteRun;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getFavouriteMessage() {
        return this.favouriteMessage;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getCategoryName() {
        return this.categoryName;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getBannerType() {
        return this.bannerType;
    }

    public final List<LobbyV2GameDetailsModel> component31() {
        return this.games;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getSpotlightTitle() {
        return this.spotlightTitle;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIsBottomOrientation() {
        return this.isBottomOrientation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    public final LobbyV2GameDetailsModel copy(Integer id, Integer gameId, String createdAt, String updatedAt, String gameName, String name, String countryCode, String displayName, String platform, String nativeSupportVersion, String launchUrl, Boolean forceUseWebView, String launchTrigger, String imageUrl, List<String> tags, Integer position, Integer launchRate, String releasedAt, LobbyMetaInfo metaInfo, Integer onlineUserCount, List<String> gameSounds, List<String> commonSounds, String howToPlayBaseUrl, boolean isFavourite, boolean isFavouriteRun, String favouriteMessage, String categoryName, String description, int categoryId, String bannerType, List<LobbyV2GameDetailsModel> games, String spotlightTitle, boolean isBottomOrientation) {
        howToPlayBaseUrl.getClass();
        favouriteMessage.getClass();
        categoryName.getClass();
        description.getClass();
        bannerType.getClass();
        return new LobbyV2GameDetailsModel(id, gameId, createdAt, updatedAt, gameName, name, countryCode, displayName, platform, nativeSupportVersion, launchUrl, forceUseWebView, launchTrigger, imageUrl, tags, position, launchRate, releasedAt, metaInfo, onlineUserCount, gameSounds, commonSounds, howToPlayBaseUrl, isFavourite, isFavouriteRun, favouriteMessage, categoryName, description, categoryId, bannerType, games, spotlightTitle, isBottomOrientation);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!LobbyV2GameDetailsModel.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        other.getClass();
        return Intrinsics.g(getId(), ((LobbyV2GameDetailsModel) other).getId());
    }

    public final String getBannerType() {
        return this.bannerType;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final List<String> getCommonSounds() {
        return this.commonSounds;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getFavouriteMessage() {
        return this.favouriteMessage;
    }

    public final Boolean getForceUseWebView() {
        return this.forceUseWebView;
    }

    public final Integer getGameId$SGLibrary_sportybetRelease() {
        return this.gameId;
    }

    public final List<String> getGameSounds() {
        return this.gameSounds;
    }

    public final List<LobbyV2GameDetailsModel> getGames() {
        return this.games;
    }

    public final String getHowToPlayBaseUrl() {
        return this.howToPlayBaseUrl;
    }

    public final Integer getId() {
        Integer num = this.gameId;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer numValueOf = iIntValue > 0 ? Integer.valueOf(iIntValue) : this.id;
            if (numValueOf != null) {
                return numValueOf;
            }
        }
        return this.id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final Integer getLaunchRate() {
        return this.launchRate;
    }

    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    public final LobbyMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final String getName() {
        String str = this.gameName;
        return (str == null || str.length() == 0) ? this.name : this.gameName;
    }

    public final String getNativeSupportVersion() {
        return this.nativeSupportVersion;
    }

    public final Integer getOnlineUserCount() {
        return this.onlineUserCount;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getSpotlightTitle() {
        return this.spotlightTitle;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        Integer id = getId();
        if (id != null) {
            return id.intValue();
        }
        return 0;
    }

    public final boolean isBannerTypeCategory() {
        return !StringsKt.U(this.bannerType) && c.l(this.bannerType, "CATEGORY", true) && this.categoryId > 0;
    }

    public final boolean isBottomOrientation() {
        return this.isBottomOrientation;
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final boolean isFavouriteRun() {
        return this.isFavouriteRun;
    }

    public final void setCategoryName(String str) {
        str.getClass();
        this.categoryName = str;
    }

    public final void setDescription(String str) {
        str.getClass();
        this.description = str;
    }

    public final void setFavourite(boolean z) {
        this.isFavourite = z;
    }

    public final void setFavouriteMessage(String str) {
        str.getClass();
        this.favouriteMessage = str;
    }

    public final void setFavouriteRun(boolean z) {
        this.isFavouriteRun = z;
    }

    public final void setGameId$SGLibrary_sportybetRelease(Integer num) {
        this.gameId = num;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final GameDetails toLegacyGameDetails() {
        return new GameDetails(getId(), this.createdAt, this.updatedAt, getName(), this.countryCode, this.displayName, this.platform, this.nativeSupportVersion, this.launchUrl, this.forceUseWebView, this.launchTrigger, this.imageUrl, this.tags, this.position, this.launchRate, this.releasedAt, this.metaInfo, this.onlineUserCount, this.gameSounds, this.commonSounds, this.howToPlayBaseUrl, this.isFavourite, this.isFavouriteRun, this.favouriteMessage);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        Integer num = this.id;
        if (num == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num);
        }
        Integer num2 = this.gameId;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num2);
        }
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
        dest.writeString(this.gameName);
        dest.writeString(this.name);
        dest.writeString(this.countryCode);
        dest.writeString(this.displayName);
        dest.writeString(this.platform);
        dest.writeString(this.nativeSupportVersion);
        dest.writeString(this.launchUrl);
        Boolean bool = this.forceUseWebView;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
        dest.writeString(this.launchTrigger);
        dest.writeString(this.imageUrl);
        dest.writeStringList(this.tags);
        Integer num3 = this.position;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num3);
        }
        Integer num4 = this.launchRate;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num4);
        }
        dest.writeString(this.releasedAt);
        LobbyMetaInfo lobbyMetaInfo = this.metaInfo;
        if (lobbyMetaInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            lobbyMetaInfo.writeToParcel(dest, flags);
        }
        Integer num5 = this.onlineUserCount;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num5);
        }
        dest.writeStringList(this.gameSounds);
        dest.writeStringList(this.commonSounds);
        dest.writeString(this.howToPlayBaseUrl);
        dest.writeInt(this.isFavourite ? 1 : 0);
        dest.writeInt(this.isFavouriteRun ? 1 : 0);
        dest.writeString(this.favouriteMessage);
        dest.writeString(this.categoryName);
        dest.writeString(this.description);
        dest.writeInt(this.categoryId);
        dest.writeString(this.bannerType);
        List<LobbyV2GameDetailsModel> list = this.games;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<LobbyV2GameDetailsModel> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.spotlightTitle);
        dest.writeInt(this.isBottomOrientation ? 1 : 0);
    }

    public String toString() {
        Integer num = this.id;
        Integer num2 = this.gameId;
        String str = this.createdAt;
        String str2 = this.updatedAt;
        String str3 = this.gameName;
        String str4 = this.name;
        String str5 = this.countryCode;
        String str6 = this.displayName;
        String str7 = this.platform;
        String str8 = this.nativeSupportVersion;
        String str9 = this.launchUrl;
        Boolean bool = this.forceUseWebView;
        String str10 = this.launchTrigger;
        String str11 = this.imageUrl;
        List<String> list = this.tags;
        Integer num3 = this.position;
        Integer num4 = this.launchRate;
        String str12 = this.releasedAt;
        LobbyMetaInfo lobbyMetaInfo = this.metaInfo;
        Integer num5 = this.onlineUserCount;
        List<String> list2 = this.gameSounds;
        List<String> list3 = this.commonSounds;
        String str13 = this.howToPlayBaseUrl;
        boolean z = this.isFavourite;
        boolean z2 = this.isFavouriteRun;
        String str14 = this.favouriteMessage;
        String str15 = this.categoryName;
        String str16 = this.description;
        int i = this.categoryId;
        String str17 = this.bannerType;
        List<LobbyV2GameDetailsModel> list4 = this.games;
        String str18 = this.spotlightTitle;
        boolean z3 = this.isBottomOrientation;
        StringBuilder sb = new StringBuilder("LobbyV2GameDetailsModel(id=");
        sb.append(num);
        sb.append(", gameId=");
        sb.append(num2);
        sb.append(", createdAt=");
        hxa.c(sb, str, ", updatedAt=", str2, ", gameName=");
        hxa.c(sb, str3, ", name=", str4, ", countryCode=");
        hxa.c(sb, str5, ", displayName=", str6, ", platform=");
        hxa.c(sb, str7, ", nativeSupportVersion=", str8, ", launchUrl=");
        x03.a(sb, str9, ", forceUseWebView=", bool, ", launchTrigger=");
        hxa.c(sb, str10, ", imageUrl=", str11, ", tags=");
        sb.append(list);
        sb.append(", position=");
        sb.append(num3);
        sb.append(", launchRate=");
        w03.a(num4, ", releasedAt=", str12, ", metaInfo=", sb);
        sb.append(lobbyMetaInfo);
        sb.append(", onlineUserCount=");
        sb.append(num5);
        sb.append(", gameSounds=");
        qpu.a(", commonSounds=", ", howToPlayBaseUrl=", sb, list2, list3);
        uts.b(str13, CaBJCMnsV.lFcjAAMDqOXQTD, ", isFavouriteRun=", sb, z);
        mng.a(", favouriteMessage=", str14, ", categoryName=", sb, z2);
        hxa.c(sb, str15, ", description=", str16, ", categoryId=");
        f78.b(i, ", bannerType=", str17, ", games=", sb);
        gfs.a(", spotlightTitle=", str18, ", isBottomOrientation=", sb, list4);
        return mq0.a(sb, z3, ")");
    }

    public LobbyV2GameDetailsModel(Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, String str11, List<String> list, Integer num3, Integer num4, String str12, LobbyMetaInfo lobbyMetaInfo, Integer num5, List<String> list2, List<String> list3, String str13, boolean z, boolean z2, String str14, String str15, String str16, int i, String str17, List<LobbyV2GameDetailsModel> list4, String str18, boolean z3) {
        qn4.b(str13, str14, str15, str16, str17);
        this.id = num;
        this.gameId = num2;
        this.createdAt = str;
        this.updatedAt = str2;
        this.gameName = str3;
        this.name = str4;
        this.countryCode = str5;
        this.displayName = str6;
        this.platform = str7;
        this.nativeSupportVersion = str8;
        this.launchUrl = str9;
        this.forceUseWebView = bool;
        this.launchTrigger = str10;
        this.imageUrl = str11;
        this.tags = list;
        this.position = num3;
        this.launchRate = num4;
        this.releasedAt = str12;
        this.metaInfo = lobbyMetaInfo;
        this.onlineUserCount = num5;
        this.gameSounds = list2;
        this.commonSounds = list3;
        this.howToPlayBaseUrl = str13;
        this.isFavourite = z;
        this.isFavouriteRun = z2;
        this.favouriteMessage = str14;
        this.categoryName = str15;
        this.description = str16;
        this.categoryId = i;
        this.bannerType = str17;
        this.games = list4;
        this.spotlightTitle = str18;
        this.isBottomOrientation = z3;
    }

    public LobbyV2GameDetailsModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, null, 0, null, null, null, false, -1, 1, null);
    }
}
