package com.sportygames.common.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.f78;
import defpackage.gmf0;
import defpackage.j26;
import defpackage.mtg0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B±\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010H\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u00102J\u000b\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010T\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u000b\u0010W\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u0011\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\u0011\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u000eHÆ\u0003J\t\u0010^\u001a\u00020\u000eHÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J¸\u0002\u0010`\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001d\u001a\u00020\u000e2\b\b\u0002\u0010\u001e\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010aJ\u0006\u0010b\u001a\u00020\u0003J\u0013\u0010c\u001a\u00020\u000e2\b\u0010d\u001a\u0004\u0018\u00010eHÖ\u0003J\t\u0010f\u001a\u00020\u0003HÖ\u0001J\t\u0010g\u001a\u00020\u0005HÖ\u0001J\u0016\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020\u0003R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010'R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010'\"\u0004\b*\u0010+R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b,\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b.\u0010'R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b0\u0010'R\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\n\n\u0002\u00103\u001a\u0004\b1\u00102R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010'R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010$R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b:\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b;\u0010'R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010%\u001a\u0004\b>\u0010\"R\u0019\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b?\u00107R\u0019\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b@\u00107R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010'R\u001a\u0010\u001c\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010B\"\u0004\bC\u0010DR\u001a\u0010\u001d\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010B\"\u0004\bE\u0010DR\u001a\u0010\u001e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010'\"\u0004\bG\u0010+¨\u0006m"}, d2 = {"Lcom/sportygames/common/business/CommonGameDetails;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "createdAt", "", "updatedAt", "name", "countryCode", "displayName", "platform", "nativeSupportVersion", "launchUrl", "forceUseWebView", "", "launchTrigger", "imageUrl", "tags", "", "position", "launchRate", "releasedAt", "metaInfo", "Lcom/sportygames/common/business/CommonLobbyMetaInfo;", "onlineUserCount", "gameSounds", "commonSounds", "howToPlayBaseUrl", "isFavourite", "isFavouriteRun", "favouriteMessage", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sportygames/common/business/CommonLobbyMetaInfo;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCreatedAt", "()Ljava/lang/String;", "getUpdatedAt", "getName", "setName", "(Ljava/lang/String;)V", "getCountryCode", "getDisplayName", "getPlatform", "getNativeSupportVersion", "getLaunchUrl", "getForceUseWebView", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLaunchTrigger", "getImageUrl", "getTags", "()Ljava/util/List;", "getPosition", "setPosition", "getLaunchRate", "getReleasedAt", "getMetaInfo", "()Lcom/sportygames/common/business/CommonLobbyMetaInfo;", "getOnlineUserCount", "getGameSounds", "getCommonSounds", "getHowToPlayBaseUrl", "()Z", "setFavourite", "(Z)V", "setFavouriteRun", "getFavouriteMessage", "setFavouriteMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/sportygames/common/business/CommonLobbyMetaInfo;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/lang/String;ZZLjava/lang/String;)Lcom/sportygames/common/business/CommonGameDetails;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CommonGameDetails implements Parcelable {
    public static final Parcelable.Creator<CommonGameDetails> CREATOR = new a();
    private final List<String> commonSounds;
    private final String countryCode;
    private final String createdAt;
    private final String displayName;
    private String favouriteMessage;
    private final Boolean forceUseWebView;
    private final List<String> gameSounds;
    private final String howToPlayBaseUrl;
    private Integer id;
    private final String imageUrl;
    private boolean isFavourite;
    private boolean isFavouriteRun;
    private final Integer launchRate;
    private final String launchTrigger;
    private final String launchUrl;
    private final CommonLobbyMetaInfo metaInfo;
    private String name;
    private final String nativeSupportVersion;
    private final Integer onlineUserCount;
    private final String platform;
    private Integer position;
    private final String releasedAt;
    private final List<String> tags;
    private final String updatedAt;

    public static final class a implements Parcelable.Creator<CommonGameDetails> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final CommonGameDetails createFromParcel(Parcel parcel) {
            Integer numValueOf;
            CommonLobbyMetaInfo commonLobbyMetaInfo;
            Object objValueOf;
            Parcel parcel2;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                numValueOf = null;
                commonLobbyMetaInfo = null;
            } else {
                numValueOf = Integer.valueOf(parcel.readInt());
                commonLobbyMetaInfo = null;
            }
            String string = parcel.readString();
            CommonLobbyMetaInfo commonLobbyMetaInfo2 = commonLobbyMetaInfo;
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            CommonLobbyMetaInfo commonLobbyMetaInfoCreateFromParcel = commonLobbyMetaInfo2;
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                objValueOf = commonLobbyMetaInfoCreateFromParcel;
            } else {
                objValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            Object objValueOf2 = parcel.readInt() == 0 ? commonLobbyMetaInfoCreateFromParcel : Integer.valueOf(parcel.readInt());
            Object objValueOf3 = parcel.readInt() == 0 ? commonLobbyMetaInfoCreateFromParcel : Integer.valueOf(parcel.readInt());
            String string11 = parcel.readString();
            if (parcel.readInt() == 0) {
                parcel2 = parcel;
            } else {
                parcel2 = parcel;
                commonLobbyMetaInfoCreateFromParcel = CommonLobbyMetaInfo.CREATOR.createFromParcel(parcel2);
            }
            CommonLobbyMetaInfo commonLobbyMetaInfo3 = commonLobbyMetaInfoCreateFromParcel;
            Integer numValueOf2 = parcel2.readInt() == 0 ? null : Integer.valueOf(parcel2.readInt());
            boolean z = true;
            ArrayList<String> arrayListCreateStringArrayList2 = parcel2.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel2.createStringArrayList();
            Integer num = objValueOf3;
            Integer num2 = numValueOf2;
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                z = false;
            }
            return new CommonGameDetails(numValueOf, string, string2, string3, string4, string5, string6, string7, string8, objValueOf, string9, string10, arrayListCreateStringArrayList, objValueOf2, num, string11, commonLobbyMetaInfo3, num2, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, string12, z, parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CommonGameDetails[] newArray(int i) {
            return new CommonGameDetails[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ CommonGameDetails(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, List list, Integer num2, Integer num3, String str11, CommonLobbyMetaInfo commonLobbyMetaInfo, Integer num4, List list2, List list3, String str12, boolean z, boolean z2, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num5 = 0;
        this((i & 1) != 0 ? num5 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? Boolean.FALSE : bool, (i & 1024) != 0 ? "" : str9, (i & 2048) != 0 ? "" : str10, (i & 4096) != 0 ? new ArrayList() : list, (i & 8192) != 0 ? num5 : num2, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? num5 : num3, (i & 32768) != 0 ? "" : str11, (i & 65536) != 0 ? null : commonLobbyMetaInfo, (i & 131072) == 0 ? num4 : 0, (i & 262144) != 0 ? new ArrayList() : list2, (i & 524288) != 0 ? new ArrayList() : list3, (i & 1048576) != 0 ? "" : str12, (i & 2097152) != 0 ? false : z, (i & 4194304) != 0 ? false : z2, (i & 8388608) != 0 ? "" : str13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonGameDetails copy$default(CommonGameDetails commonGameDetails, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, List list, Integer num2, Integer num3, String str11, CommonLobbyMetaInfo commonLobbyMetaInfo, Integer num4, List list2, List list3, String str12, boolean z, boolean z2, String str13, int i, Object obj) {
        String str14;
        boolean z3;
        Integer num5 = (i & 1) != 0 ? commonGameDetails.id : num;
        String str15 = (i & 2) != 0 ? commonGameDetails.createdAt : str;
        String str16 = (i & 4) != 0 ? commonGameDetails.updatedAt : str2;
        String str17 = (i & 8) != 0 ? commonGameDetails.name : str3;
        String str18 = (i & 16) != 0 ? commonGameDetails.countryCode : str4;
        String str19 = (i & 32) != 0 ? commonGameDetails.displayName : str5;
        String str20 = (i & 64) != 0 ? commonGameDetails.platform : str6;
        String str21 = (i & 128) != 0 ? commonGameDetails.nativeSupportVersion : str7;
        String str22 = (i & 256) != 0 ? commonGameDetails.launchUrl : str8;
        Boolean bool2 = (i & 512) != 0 ? commonGameDetails.forceUseWebView : bool;
        String str23 = (i & 1024) != 0 ? commonGameDetails.launchTrigger : str9;
        String str24 = (i & 2048) != 0 ? commonGameDetails.imageUrl : str10;
        List list4 = (i & 4096) != 0 ? commonGameDetails.tags : list;
        Integer num6 = (i & 8192) != 0 ? commonGameDetails.position : num2;
        Integer num7 = num5;
        Integer num8 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? commonGameDetails.launchRate : num3;
        String str25 = (i & 32768) != 0 ? commonGameDetails.releasedAt : str11;
        CommonLobbyMetaInfo commonLobbyMetaInfo2 = (i & 65536) != 0 ? commonGameDetails.metaInfo : commonLobbyMetaInfo;
        Integer num9 = (i & 131072) != 0 ? commonGameDetails.onlineUserCount : num4;
        List list5 = (i & 262144) != 0 ? commonGameDetails.gameSounds : list2;
        List list6 = (i & 524288) != 0 ? commonGameDetails.commonSounds : list3;
        String str26 = (i & 1048576) != 0 ? commonGameDetails.howToPlayBaseUrl : str12;
        boolean z4 = (i & 2097152) != 0 ? commonGameDetails.isFavourite : z;
        boolean z5 = (i & 4194304) != 0 ? commonGameDetails.isFavouriteRun : z2;
        if ((i & 8388608) != 0) {
            z3 = z5;
            str14 = commonGameDetails.favouriteMessage;
        } else {
            str14 = str13;
            z3 = z5;
        }
        return commonGameDetails.copy(num7, str15, str16, str17, str18, str19, str20, str21, str22, bool2, str23, str24, list4, num6, num8, str25, commonLobbyMetaInfo2, num9, list5, list6, str26, z4, z3, str14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getForceUseWebView() {
        return this.forceUseWebView;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getLaunchTrigger() {
        return this.launchTrigger;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final List<String> component13() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getLaunchRate() {
        return this.launchRate;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getReleasedAt() {
        return this.releasedAt;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final CommonLobbyMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getOnlineUserCount() {
        return this.onlineUserCount;
    }

    public final List<String> component19() {
        return this.gameSounds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final List<String> component20() {
        return this.commonSounds;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getHowToPlayBaseUrl() {
        return this.howToPlayBaseUrl;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getIsFavouriteRun() {
        return this.isFavouriteRun;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getFavouriteMessage() {
        return this.favouriteMessage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getNativeSupportVersion() {
        return this.nativeSupportVersion;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getLaunchUrl() {
        return this.launchUrl;
    }

    public final CommonGameDetails copy(Integer id, String createdAt, String updatedAt, String name, String countryCode, String displayName, String platform, String nativeSupportVersion, String launchUrl, Boolean forceUseWebView, String launchTrigger, String imageUrl, List<String> tags, Integer position, Integer launchRate, String releasedAt, CommonLobbyMetaInfo metaInfo, Integer onlineUserCount, List<String> gameSounds, List<String> commonSounds, String howToPlayBaseUrl, boolean isFavourite, boolean isFavouriteRun, String favouriteMessage) {
        howToPlayBaseUrl.getClass();
        favouriteMessage.getClass();
        return new CommonGameDetails(id, createdAt, updatedAt, name, countryCode, displayName, platform, nativeSupportVersion, launchUrl, forceUseWebView, launchTrigger, imageUrl, tags, position, launchRate, releasedAt, metaInfo, onlineUserCount, gameSounds, commonSounds, howToPlayBaseUrl, isFavourite, isFavouriteRun, favouriteMessage);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonGameDetails)) {
            return false;
        }
        CommonGameDetails commonGameDetails = (CommonGameDetails) other;
        return Intrinsics.g(this.id, commonGameDetails.id) && Intrinsics.g(this.createdAt, commonGameDetails.createdAt) && Intrinsics.g(this.updatedAt, commonGameDetails.updatedAt) && Intrinsics.g(this.name, commonGameDetails.name) && Intrinsics.g(this.countryCode, commonGameDetails.countryCode) && Intrinsics.g(this.displayName, commonGameDetails.displayName) && Intrinsics.g(this.platform, commonGameDetails.platform) && Intrinsics.g(this.nativeSupportVersion, commonGameDetails.nativeSupportVersion) && Intrinsics.g(this.launchUrl, commonGameDetails.launchUrl) && Intrinsics.g(this.forceUseWebView, commonGameDetails.forceUseWebView) && Intrinsics.g(this.launchTrigger, commonGameDetails.launchTrigger) && Intrinsics.g(this.imageUrl, commonGameDetails.imageUrl) && Intrinsics.g(this.tags, commonGameDetails.tags) && Intrinsics.g(this.position, commonGameDetails.position) && Intrinsics.g(this.launchRate, commonGameDetails.launchRate) && Intrinsics.g(this.releasedAt, commonGameDetails.releasedAt) && Intrinsics.g(this.metaInfo, commonGameDetails.metaInfo) && Intrinsics.g(this.onlineUserCount, commonGameDetails.onlineUserCount) && Intrinsics.g(this.gameSounds, commonGameDetails.gameSounds) && Intrinsics.g(this.commonSounds, commonGameDetails.commonSounds) && Intrinsics.g(this.howToPlayBaseUrl, commonGameDetails.howToPlayBaseUrl) && this.isFavourite == commonGameDetails.isFavourite && this.isFavouriteRun == commonGameDetails.isFavouriteRun && Intrinsics.g(this.favouriteMessage, commonGameDetails.favouriteMessage);
    }

    public final List<String> getCommonSounds() {
        return this.commonSounds;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCreatedAt() {
        return this.createdAt;
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

    public final List<String> getGameSounds() {
        return this.gameSounds;
    }

    public final String getHowToPlayBaseUrl() {
        return this.howToPlayBaseUrl;
    }

    public final Integer getId() {
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

    public final CommonLobbyMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNativeSupportVersion() {
        return this.nativeSupportVersion;
    }

    public final Integer getOnlineUserCount() {
        return this.onlineUserCount;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getReleasedAt() {
        return this.releasedAt;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.createdAt;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.updatedAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.countryCode;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.displayName;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.platform;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.nativeSupportVersion;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.launchUrl;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool = this.forceUseWebView;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str9 = this.launchTrigger;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.imageUrl;
        int iHashCode12 = (iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode13 = (iHashCode12 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.position;
        int iHashCode14 = (iHashCode13 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.launchRate;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str11 = this.releasedAt;
        int iHashCode16 = (iHashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        CommonLobbyMetaInfo commonLobbyMetaInfo = this.metaInfo;
        int iHashCode17 = (iHashCode16 + (commonLobbyMetaInfo == null ? 0 : commonLobbyMetaInfo.hashCode())) * 31;
        Integer num4 = this.onlineUserCount;
        int iHashCode18 = (iHashCode17 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List<String> list2 = this.gameSounds;
        int iHashCode19 = (iHashCode18 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.commonSounds;
        return this.favouriteMessage.hashCode() + mtg0.a(mtg0.a(gmf0.a((iHashCode19 + (list3 != null ? list3.hashCode() : 0)) * 31, 31, this.howToPlayBaseUrl), 31, this.isFavourite), 31, this.isFavouriteRun);
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final boolean isFavouriteRun() {
        return this.isFavouriteRun;
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

    public final void setId(Integer num) {
        this.id = num;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CommonGameDetails(id=");
        sb.append(this.id);
        sb.append(", createdAt=");
        sb.append(this.createdAt);
        sb.append(", updatedAt=");
        sb.append(this.updatedAt);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", countryCode=");
        sb.append(this.countryCode);
        sb.append(", displayName=");
        sb.append(this.displayName);
        sb.append(", platform=");
        sb.append(this.platform);
        sb.append(", nativeSupportVersion=");
        sb.append(this.nativeSupportVersion);
        sb.append(", launchUrl=");
        sb.append(this.launchUrl);
        sb.append(", forceUseWebView=");
        sb.append(this.forceUseWebView);
        sb.append(", launchTrigger=");
        sb.append(this.launchTrigger);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", tags=");
        sb.append(this.tags);
        sb.append(", position=");
        sb.append(this.position);
        sb.append(", launchRate=");
        sb.append(this.launchRate);
        sb.append(", releasedAt=");
        sb.append(this.releasedAt);
        sb.append(", metaInfo=");
        sb.append(this.metaInfo);
        sb.append(", onlineUserCount=");
        sb.append(this.onlineUserCount);
        sb.append(", gameSounds=");
        sb.append(this.gameSounds);
        sb.append(", commonSounds=");
        sb.append(this.commonSounds);
        sb.append(", howToPlayBaseUrl=");
        sb.append(this.howToPlayBaseUrl);
        sb.append(", isFavourite=");
        sb.append(this.isFavourite);
        sb.append(", isFavouriteRun=");
        sb.append(this.isFavouriteRun);
        sb.append(", favouriteMessage=");
        return j26.a(sb, this.favouriteMessage, ')');
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
        dest.writeString(this.createdAt);
        dest.writeString(this.updatedAt);
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
        Integer num2 = this.position;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num2);
        }
        Integer num3 = this.launchRate;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num3);
        }
        dest.writeString(this.releasedAt);
        CommonLobbyMetaInfo commonLobbyMetaInfo = this.metaInfo;
        if (commonLobbyMetaInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            commonLobbyMetaInfo.writeToParcel(dest, flags);
        }
        Integer num4 = this.onlineUserCount;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            f78.c(dest, 1, num4);
        }
        dest.writeStringList(this.gameSounds);
        dest.writeStringList(this.commonSounds);
        dest.writeString(this.howToPlayBaseUrl);
        dest.writeInt(this.isFavourite ? 1 : 0);
        dest.writeInt(this.isFavouriteRun ? 1 : 0);
        dest.writeString(this.favouriteMessage);
    }

    public CommonGameDetails(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, String str9, String str10, List<String> list, Integer num2, Integer num3, String str11, CommonLobbyMetaInfo commonLobbyMetaInfo, Integer num4, List<String> list2, List<String> list3, String str12, boolean z, boolean z2, String str13) {
        str12.getClass();
        str13.getClass();
        this.id = num;
        this.createdAt = str;
        this.updatedAt = str2;
        this.name = str3;
        this.countryCode = str4;
        this.displayName = str5;
        this.platform = str6;
        this.nativeSupportVersion = str7;
        this.launchUrl = str8;
        this.forceUseWebView = bool;
        this.launchTrigger = str9;
        this.imageUrl = str10;
        this.tags = list;
        this.position = num2;
        this.launchRate = num3;
        this.releasedAt = str11;
        this.metaInfo = commonLobbyMetaInfo;
        this.onlineUserCount = num4;
        this.gameSounds = list2;
        this.commonSounds = list3;
        this.howToPlayBaseUrl = str12;
        this.isFavourite = z;
        this.isFavouriteRun = z2;
        this.favouriteMessage = str13;
    }

    public CommonGameDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16777215, null);
    }
}
