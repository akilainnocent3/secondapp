package com.sportygames.pingpong.remote.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.dy5;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.qn4;
import defpackage.ry4;
import defpackage.vnk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\bC\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010A\u001a\u00020\u0006HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\t\u0010D\u001a\u00020\u0006HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010G\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010H\u001a\u00020\u0006HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010)J\u000b\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0000HÆ\u0003Jä\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0000HÆ\u0001¢\u0006\u0002\u0010PJ\u0006\u0010Q\u001a\u00020\u0003J\u0013\u0010R\u001a\u00020S2\b\u0010T\u001a\u0004\u0018\u00010UHÖ\u0003J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\t\u0010W\u001a\u00020\u0006HÖ\u0001J\u0016\u0010X\u001a\u00020Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001eR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001eR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001e\"\u0004\b,\u0010$R\u0011\u0010\u0011\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001e\"\u0004\b/\u0010$R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001e\"\u0004\b1\u0010$R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u001e\"\u0004\b3\u0010$R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b4\u0010)\"\u0004\b5\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u001e\"\u0004\b7\u0010$R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;¨\u0006]"}, d2 = {"Lcom/sportygames/pingpong/remote/models/TopWinResponse;", "Landroid/os/Parcelable;", AnalyticsParam.EVENT_PARAM_ID, "", "userId", "nickName", "", "avatar", "avatarUrl", "betId", "roundId", "stakeAmount", "payoutAmount", "cashoutCoefficient", "cashOutCoefficient", "", "countryCode", "currency", "payoutOrCoefficient", "timeRange", "updateTime", "houseCoefficient", "isCalledFrom", "topWinOther", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lcom/sportygames/pingpong/remote/models/TopWinResponse;)V", "getId", "()I", "getUserId", "getNickName", "()Ljava/lang/String;", "getAvatar", "getAvatarUrl", "getBetId", "getRoundId", "setRoundId", "(Ljava/lang/String;)V", "getStakeAmount", "getPayoutAmount", "getCashoutCoefficient", "getCashOutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCountryCode", "setCountryCode", "getCurrency", "getPayoutOrCoefficient", "setPayoutOrCoefficient", "getTimeRange", "setTimeRange", "getUpdateTime", "setUpdateTime", "getHouseCoefficient", "setHouseCoefficient", "(Ljava/lang/Double;)V", "setCalledFrom", "getTopWinOther", "()Lcom/sportygames/pingpong/remote/models/TopWinResponse;", "setTopWinOther", "(Lcom/sportygames/pingpong/remote/models/TopWinResponse;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lcom/sportygames/pingpong/remote/models/TopWinResponse;)Lcom/sportygames/pingpong/remote/models/TopWinResponse;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopWinResponse implements Parcelable {
    private final String avatar;
    private final String avatarUrl;
    private final String betId;
    private final Double cashOutCoefficient;
    private final String cashoutCoefficient;
    private String countryCode;
    private final String currency;
    private Double houseCoefficient;
    private final int id;
    private String isCalledFrom;
    private final String nickName;
    private final String payoutAmount;
    private String payoutOrCoefficient;
    private String roundId;
    private final String stakeAmount;
    private String timeRange;
    private TopWinResponse topWinOther;
    private String updateTime;
    private final int userId;
    public static final Parcelable.Creator<TopWinResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<TopWinResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopWinResponse createFromParcel(Parcel parcel) {
            Double dValueOf;
            Double d;
            parcel.getClass();
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            if (parcel.readInt() == 0) {
                dValueOf = null;
                d = null;
            } else {
                dValueOf = Double.valueOf(parcel.readDouble());
                d = null;
            }
            Double d2 = d;
            return new TopWinResponse(i, i2, string, string2, string3, string4, string5, string6, string7, string8, dValueOf, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? d2 : Double.valueOf(parcel.readDouble()), parcel.readString(), (TopWinResponse) (parcel.readInt() == 0 ? d2 : TopWinResponse.CREATOR.createFromParcel(parcel)));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopWinResponse[] newArray(int i) {
            return new TopWinResponse[i];
        }
    }

    public TopWinResponse(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d, String str9, String str10, String str11, String str12, String str13, Double d2, String str14, TopWinResponse topWinResponse) {
        qn4.b(str, str4, str6, str7, str10);
        this.id = i;
        this.userId = i2;
        this.nickName = str;
        this.avatar = str2;
        this.avatarUrl = str3;
        this.betId = str4;
        this.roundId = str5;
        this.stakeAmount = str6;
        this.payoutAmount = str7;
        this.cashoutCoefficient = str8;
        this.cashOutCoefficient = d;
        this.countryCode = str9;
        this.currency = str10;
        this.payoutOrCoefficient = str11;
        this.timeRange = str12;
        this.updateTime = str13;
        this.houseCoefficient = d2;
        this.isCalledFrom = str14;
        this.topWinOther = topWinResponse;
    }

    public static /* synthetic */ TopWinResponse copy$default(TopWinResponse topWinResponse, int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Double d, String str9, String str10, String str11, String str12, String str13, Double d2, String str14, TopWinResponse topWinResponse2, int i3, Object obj) {
        TopWinResponse topWinResponse3;
        String str15;
        int i4 = (i3 & 1) != 0 ? topWinResponse.id : i;
        int i5 = (i3 & 2) != 0 ? topWinResponse.userId : i2;
        String str16 = (i3 & 4) != 0 ? topWinResponse.nickName : str;
        String str17 = (i3 & 8) != 0 ? topWinResponse.avatar : str2;
        String str18 = (i3 & 16) != 0 ? topWinResponse.avatarUrl : str3;
        String str19 = (i3 & 32) != 0 ? topWinResponse.betId : str4;
        String str20 = (i3 & 64) != 0 ? topWinResponse.roundId : str5;
        String str21 = (i3 & 128) != 0 ? topWinResponse.stakeAmount : str6;
        String str22 = (i3 & 256) != 0 ? topWinResponse.payoutAmount : str7;
        String str23 = (i3 & 512) != 0 ? topWinResponse.cashoutCoefficient : str8;
        Double d3 = (i3 & 1024) != 0 ? topWinResponse.cashOutCoefficient : d;
        String str24 = (i3 & 2048) != 0 ? topWinResponse.countryCode : str9;
        String str25 = (i3 & 4096) != 0 ? topWinResponse.currency : str10;
        String str26 = (i3 & 8192) != 0 ? topWinResponse.payoutOrCoefficient : str11;
        int i6 = i4;
        String str27 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? topWinResponse.timeRange : str12;
        String str28 = (i3 & 32768) != 0 ? topWinResponse.updateTime : str13;
        Double d4 = (i3 & 65536) != 0 ? topWinResponse.houseCoefficient : d2;
        String str29 = (i3 & 131072) != 0 ? topWinResponse.isCalledFrom : str14;
        if ((i3 & 262144) != 0) {
            str15 = str29;
            topWinResponse3 = topWinResponse.topWinOther;
        } else {
            topWinResponse3 = topWinResponse2;
            str15 = str29;
        }
        return topWinResponse.copy(i6, i5, str16, str17, str18, str19, str20, str21, str22, str23, d3, str24, str25, str26, str27, str28, d4, str15, topWinResponse3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Double getCashOutCoefficient() {
        return this.cashOutCoefficient;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getPayoutOrCoefficient() {
        return this.payoutOrCoefficient;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getIsCalledFrom() {
        return this.isCalledFrom;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final TopWinResponse getTopWinOther() {
        return this.topWinOther;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNickName() {
        return this.nickName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBetId() {
        return this.betId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getRoundId() {
        return this.roundId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getStakeAmount() {
        return this.stakeAmount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getPayoutAmount() {
        return this.payoutAmount;
    }

    public final TopWinResponse copy(int id, int userId, String nickName, String avatar, String avatarUrl, String betId, String roundId, String stakeAmount, String payoutAmount, String cashoutCoefficient, Double cashOutCoefficient, String countryCode, String currency, String payoutOrCoefficient, String timeRange, String updateTime, Double houseCoefficient, String isCalledFrom, TopWinResponse topWinOther) {
        nickName.getClass();
        betId.getClass();
        stakeAmount.getClass();
        payoutAmount.getClass();
        currency.getClass();
        return new TopWinResponse(id, userId, nickName, avatar, avatarUrl, betId, roundId, stakeAmount, payoutAmount, cashoutCoefficient, cashOutCoefficient, countryCode, currency, payoutOrCoefficient, timeRange, updateTime, houseCoefficient, isCalledFrom, topWinOther);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopWinResponse)) {
            return false;
        }
        TopWinResponse topWinResponse = (TopWinResponse) other;
        return this.id == topWinResponse.id && this.userId == topWinResponse.userId && Intrinsics.g(this.nickName, topWinResponse.nickName) && Intrinsics.g(this.avatar, topWinResponse.avatar) && Intrinsics.g(this.avatarUrl, topWinResponse.avatarUrl) && Intrinsics.g(this.betId, topWinResponse.betId) && Intrinsics.g(this.roundId, topWinResponse.roundId) && Intrinsics.g(this.stakeAmount, topWinResponse.stakeAmount) && Intrinsics.g(this.payoutAmount, topWinResponse.payoutAmount) && Intrinsics.g(this.cashoutCoefficient, topWinResponse.cashoutCoefficient) && Intrinsics.g(this.cashOutCoefficient, topWinResponse.cashOutCoefficient) && Intrinsics.g(this.countryCode, topWinResponse.countryCode) && Intrinsics.g(this.currency, topWinResponse.currency) && Intrinsics.g(this.payoutOrCoefficient, topWinResponse.payoutOrCoefficient) && Intrinsics.g(this.timeRange, topWinResponse.timeRange) && Intrinsics.g(this.updateTime, topWinResponse.updateTime) && Intrinsics.g(this.houseCoefficient, topWinResponse.houseCoefficient) && Intrinsics.g(this.isCalledFrom, topWinResponse.isCalledFrom) && Intrinsics.g(this.topWinOther, topWinResponse.topWinOther);
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getBetId() {
        return this.betId;
    }

    public final Double getCashOutCoefficient() {
        return this.cashOutCoefficient;
    }

    public final String getCashoutCoefficient() {
        return this.cashoutCoefficient;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getHouseCoefficient() {
        return this.houseCoefficient;
    }

    public final int getId() {
        return this.id;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getPayoutAmount() {
        return this.payoutAmount;
    }

    public final String getPayoutOrCoefficient() {
        return this.payoutOrCoefficient;
    }

    public final String getRoundId() {
        return this.roundId;
    }

    public final String getStakeAmount() {
        return this.stakeAmount;
    }

    public final String getTimeRange() {
        return this.timeRange;
    }

    public final TopWinResponse getTopWinOther() {
        return this.topWinOther;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final int getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int iA = gmf0.a(gpp.a(this.userId, Integer.hashCode(this.id) * 31, 31), 31, this.nickName);
        String str = this.avatar;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatarUrl;
        int iA2 = gmf0.a((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.betId);
        String str3 = this.roundId;
        int iA3 = gmf0.a(gmf0.a((iA2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.stakeAmount), 31, this.payoutAmount);
        String str4 = this.cashoutCoefficient;
        int iHashCode2 = (iA3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Double d = this.cashOutCoefficient;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str5 = this.countryCode;
        int iA4 = gmf0.a((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.currency);
        String str6 = this.payoutOrCoefficient;
        int iHashCode4 = (iA4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timeRange;
        int iHashCode5 = (iHashCode4 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.updateTime;
        int iHashCode6 = (iHashCode5 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Double d2 = this.houseCoefficient;
        int iHashCode7 = (iHashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        String str9 = this.isCalledFrom;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        TopWinResponse topWinResponse = this.topWinOther;
        return iHashCode8 + (topWinResponse != null ? topWinResponse.hashCode() : 0);
    }

    public final String isCalledFrom() {
        return this.isCalledFrom;
    }

    public final void setCalledFrom(String str) {
        this.isCalledFrom = str;
    }

    public final void setCountryCode(String str) {
        this.countryCode = str;
    }

    public final void setHouseCoefficient(Double d) {
        this.houseCoefficient = d;
    }

    public final void setPayoutOrCoefficient(String str) {
        this.payoutOrCoefficient = str;
    }

    public final void setRoundId(String str) {
        this.roundId = str;
    }

    public final void setTimeRange(String str) {
        this.timeRange = str;
    }

    public final void setTopWinOther(TopWinResponse topWinResponse) {
        this.topWinOther = topWinResponse;
    }

    public final void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public String toString() {
        int i = this.id;
        int i2 = this.userId;
        String str = this.nickName;
        String str2 = this.avatar;
        String str3 = this.avatarUrl;
        String str4 = this.betId;
        String str5 = this.roundId;
        String str6 = this.stakeAmount;
        String str7 = this.payoutAmount;
        String str8 = this.cashoutCoefficient;
        Double d = this.cashOutCoefficient;
        String str9 = this.countryCode;
        String str10 = this.currency;
        String str11 = this.payoutOrCoefficient;
        String str12 = this.timeRange;
        String str13 = this.updateTime;
        Double d2 = this.houseCoefficient;
        String str14 = this.isCalledFrom;
        TopWinResponse topWinResponse = this.topWinOther;
        StringBuilder sbA = dy5.a("TopWinResponse(id=", i, i2, ", userId=", ", nickName=");
        hxa.c(sbA, str, ", avatar=", str2, ", avatarUrl=");
        hxa.c(sbA, str3, ", betId=", str4, ", roundId=");
        hxa.c(sbA, str5, ", stakeAmount=", str6, ", payoutAmount=");
        hxa.c(sbA, str7, ", cashoutCoefficient=", str8, ", cashOutCoefficient=");
        ry4.a(d, ", countryCode=", str9, ", currency=", sbA);
        hxa.c(sbA, str10, ", payoutOrCoefficient=", str11, ", timeRange=");
        hxa.c(sbA, str12, ", updateTime=", str13, ", houseCoefficient=");
        ry4.a(d2, ", isCalledFrom=", str14, ", topWinOther=", sbA);
        sbA.append(topWinResponse);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.id);
        dest.writeInt(this.userId);
        dest.writeString(this.nickName);
        dest.writeString(this.avatar);
        dest.writeString(this.avatarUrl);
        dest.writeString(this.betId);
        dest.writeString(this.roundId);
        dest.writeString(this.stakeAmount);
        dest.writeString(this.payoutAmount);
        dest.writeString(this.cashoutCoefficient);
        Double d = this.cashOutCoefficient;
        if (d == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d);
        }
        dest.writeString(this.countryCode);
        dest.writeString(this.currency);
        dest.writeString(this.payoutOrCoefficient);
        dest.writeString(this.timeRange);
        dest.writeString(this.updateTime);
        Double d2 = this.houseCoefficient;
        if (d2 == null) {
            dest.writeInt(0);
        } else {
            vnk.a(dest, 1, d2);
        }
        dest.writeString(this.isCalledFrom);
        TopWinResponse topWinResponse = this.topWinOther;
        if (topWinResponse == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            topWinResponse.writeToParcel(dest, flags);
        }
    }
}
