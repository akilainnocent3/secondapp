package com.sportygames.compose.chat.data.model;

import androidx.transition.nfj.CaBJCMnsV;
import com.twilio.voice.EventKeys;
import defpackage.gmf0;
import defpackage.j26;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/sportygames/compose/chat/data/model/SendMessageRequest;", "", "chatRoomId", "", "msgType", "text", "gif", "json", "Lcom/sportygames/compose/chat/data/model/SendMessageRequest$Json;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportygames/compose/chat/data/model/SendMessageRequest$Json;)V", "getChatRoomId", "()Ljava/lang/String;", "getMsgType", "getText", "getGif", "getJson", "()Lcom/sportygames/compose/chat/data/model/SendMessageRequest$Json;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Json", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SendMessageRequest {
    public static final int $stable = 0;
    private final String chatRoomId;
    private final String gif;
    private final Json json;
    private final String msgType;
    private final String text;

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b:\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00102\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00109\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010;\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003JÚ\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u000b2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020FHÖ\u0001J\t\u0010G\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\n\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b(\u0010\u001cR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001aR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001aR\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010 \u001a\u0004\b.\u0010\u001fR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001a¨\u0006H"}, d2 = {"Lcom/sportygames/compose/chat/data/model/SendMessageRequest$Json;", "", "avatarUrl", "", "betId", "", "cashOutCoefficient", "", "currency", "houseCoefficient", "isBot", "", EventKeys.ERROR_MESSAGE, "nickName", "payoutAmount", "roundId", "stakeAmount", "targetCoefficient", "betCategory", "sideBetType", "startCoefficient", "endCoefficient", "rocketType", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getBetId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getCashOutCoefficient", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCurrency", "getHouseCoefficient", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "getNickName", "getPayoutAmount", "getRoundId", "getStakeAmount", "getTargetCoefficient", "getBetCategory", "getSideBetType", "getStartCoefficient", "getEndCoefficient", "getRocketType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/sportygames/compose/chat/data/model/SendMessageRequest$Json;", "equals", "other", "hashCode", "", "toString", "compose-chat_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Json {
        public static final int $stable = 0;
        private final String avatarUrl;
        private final String betCategory;
        private final Long betId;
        private final Double cashOutCoefficient;
        private final String currency;
        private final Double endCoefficient;
        private final Double houseCoefficient;
        private final Boolean isBot;
        private final String message;
        private final String nickName;
        private final Double payoutAmount;
        private final String rocketType;
        private final Long roundId;
        private final String sideBetType;
        private final Double stakeAmount;
        private final Double startCoefficient;
        private final Double targetCoefficient;

        public /* synthetic */ Json(String str, Long l, Double d, String str2, Double d2, Boolean bool, String str3, String str4, Double d3, Long l2, Double d4, Double d5, String str5, String str6, Double d6, Double d7, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, l, (i & 4) != 0 ? null : d, str2, d2, bool, str3, str4, d3, l2, d4, (i & 2048) != 0 ? null : d5, (i & 4096) != 0 ? null : str5, (i & 8192) != 0 ? null : str6, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : d6, (32768 & i) != 0 ? null : d7, (i & 65536) != 0 ? null : str7);
        }

        public static /* synthetic */ Json copy$default(Json json, String str, Long l, Double d, String str2, Double d2, Boolean bool, String str3, String str4, Double d3, Long l2, Double d4, Double d5, String str5, String str6, Double d6, Double d7, String str7, int i, Object obj) {
            String str8;
            Double d8;
            String str9 = (i & 1) != 0 ? json.avatarUrl : str;
            Long l3 = (i & 2) != 0 ? json.betId : l;
            Double d9 = (i & 4) != 0 ? json.cashOutCoefficient : d;
            String str10 = (i & 8) != 0 ? json.currency : str2;
            Double d10 = (i & 16) != 0 ? json.houseCoefficient : d2;
            Boolean bool2 = (i & 32) != 0 ? json.isBot : bool;
            String str11 = (i & 64) != 0 ? json.message : str3;
            String str12 = (i & 128) != 0 ? json.nickName : str4;
            Double d11 = (i & 256) != 0 ? json.payoutAmount : d3;
            Long l4 = (i & 512) != 0 ? json.roundId : l2;
            Double d12 = (i & 1024) != 0 ? json.stakeAmount : d4;
            Double d13 = (i & 2048) != 0 ? json.targetCoefficient : d5;
            String str13 = (i & 4096) != 0 ? json.betCategory : str5;
            String str14 = (i & 8192) != 0 ? json.sideBetType : str6;
            String str15 = str9;
            Double d14 = (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? json.startCoefficient : d6;
            Double d15 = (i & 32768) != 0 ? json.endCoefficient : d7;
            if ((i & 65536) != 0) {
                d8 = d15;
                str8 = json.rocketType;
            } else {
                str8 = str7;
                d8 = d15;
            }
            return json.copy(str15, l3, d9, str10, d10, bool2, str11, str12, d11, l4, d12, d13, str13, str14, d14, d8, str8);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        /* JADX INFO: renamed from: component10, reason: from getter */
        public final Long getRoundId() {
            return this.roundId;
        }

        /* JADX INFO: renamed from: component11, reason: from getter */
        public final Double getStakeAmount() {
            return this.stakeAmount;
        }

        /* JADX INFO: renamed from: component12, reason: from getter */
        public final Double getTargetCoefficient() {
            return this.targetCoefficient;
        }

        /* JADX INFO: renamed from: component13, reason: from getter */
        public final String getBetCategory() {
            return this.betCategory;
        }

        /* JADX INFO: renamed from: component14, reason: from getter */
        public final String getSideBetType() {
            return this.sideBetType;
        }

        /* JADX INFO: renamed from: component15, reason: from getter */
        public final Double getStartCoefficient() {
            return this.startCoefficient;
        }

        /* JADX INFO: renamed from: component16, reason: from getter */
        public final Double getEndCoefficient() {
            return this.endCoefficient;
        }

        /* JADX INFO: renamed from: component17, reason: from getter */
        public final String getRocketType() {
            return this.rocketType;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Long getBetId() {
            return this.betId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final Double getCashOutCoefficient() {
            return this.cashOutCoefficient;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getCurrency() {
            return this.currency;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final Double getHouseCoefficient() {
            return this.houseCoefficient;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final Boolean getIsBot() {
            return this.isBot;
        }

        /* JADX INFO: renamed from: component7, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: component8, reason: from getter */
        public final String getNickName() {
            return this.nickName;
        }

        /* JADX INFO: renamed from: component9, reason: from getter */
        public final Double getPayoutAmount() {
            return this.payoutAmount;
        }

        public final Json copy(String avatarUrl, Long betId, Double cashOutCoefficient, String currency, Double houseCoefficient, Boolean isBot, String message, String nickName, Double payoutAmount, Long roundId, Double stakeAmount, Double targetCoefficient, String betCategory, String sideBetType, Double startCoefficient, Double endCoefficient, String rocketType) {
            return new Json(avatarUrl, betId, cashOutCoefficient, currency, houseCoefficient, isBot, message, nickName, payoutAmount, roundId, stakeAmount, targetCoefficient, betCategory, sideBetType, startCoefficient, endCoefficient, rocketType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Json)) {
                return false;
            }
            Json json = (Json) other;
            return Intrinsics.g(this.avatarUrl, json.avatarUrl) && Intrinsics.g(this.betId, json.betId) && Intrinsics.g(this.cashOutCoefficient, json.cashOutCoefficient) && Intrinsics.g(this.currency, json.currency) && Intrinsics.g(this.houseCoefficient, json.houseCoefficient) && Intrinsics.g(this.isBot, json.isBot) && Intrinsics.g(this.message, json.message) && Intrinsics.g(this.nickName, json.nickName) && Intrinsics.g(this.payoutAmount, json.payoutAmount) && Intrinsics.g(this.roundId, json.roundId) && Intrinsics.g(this.stakeAmount, json.stakeAmount) && Intrinsics.g(this.targetCoefficient, json.targetCoefficient) && Intrinsics.g(this.betCategory, json.betCategory) && Intrinsics.g(this.sideBetType, json.sideBetType) && Intrinsics.g(this.startCoefficient, json.startCoefficient) && Intrinsics.g(this.endCoefficient, json.endCoefficient) && Intrinsics.g(this.rocketType, json.rocketType);
        }

        public final String getAvatarUrl() {
            return this.avatarUrl;
        }

        public final String getBetCategory() {
            return this.betCategory;
        }

        public final Long getBetId() {
            return this.betId;
        }

        public final Double getCashOutCoefficient() {
            return this.cashOutCoefficient;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final Double getEndCoefficient() {
            return this.endCoefficient;
        }

        public final Double getHouseCoefficient() {
            return this.houseCoefficient;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getNickName() {
            return this.nickName;
        }

        public final Double getPayoutAmount() {
            return this.payoutAmount;
        }

        public final String getRocketType() {
            return this.rocketType;
        }

        public final Long getRoundId() {
            return this.roundId;
        }

        public final String getSideBetType() {
            return this.sideBetType;
        }

        public final Double getStakeAmount() {
            return this.stakeAmount;
        }

        public final Double getStartCoefficient() {
            return this.startCoefficient;
        }

        public final Double getTargetCoefficient() {
            return this.targetCoefficient;
        }

        public int hashCode() {
            String str = this.avatarUrl;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l = this.betId;
            int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
            Double d = this.cashOutCoefficient;
            int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
            String str2 = this.currency;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Double d2 = this.houseCoefficient;
            int iHashCode5 = (iHashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Boolean bool = this.isBot;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str3 = this.message;
            int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.nickName;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Double d3 = this.payoutAmount;
            int iHashCode9 = (iHashCode8 + (d3 == null ? 0 : d3.hashCode())) * 31;
            Long l2 = this.roundId;
            int iHashCode10 = (iHashCode9 + (l2 == null ? 0 : l2.hashCode())) * 31;
            Double d4 = this.stakeAmount;
            int iHashCode11 = (iHashCode10 + (d4 == null ? 0 : d4.hashCode())) * 31;
            Double d5 = this.targetCoefficient;
            int iHashCode12 = (iHashCode11 + (d5 == null ? 0 : d5.hashCode())) * 31;
            String str5 = this.betCategory;
            int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.sideBetType;
            int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
            Double d6 = this.startCoefficient;
            int iHashCode15 = (iHashCode14 + (d6 == null ? 0 : d6.hashCode())) * 31;
            Double d7 = this.endCoefficient;
            int iHashCode16 = (iHashCode15 + (d7 == null ? 0 : d7.hashCode())) * 31;
            String str7 = this.rocketType;
            return iHashCode16 + (str7 != null ? str7.hashCode() : 0);
        }

        public final Boolean isBot() {
            return this.isBot;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Json(avatarUrl=");
            sb.append(this.avatarUrl);
            sb.append(", betId=");
            sb.append(this.betId);
            sb.append(", cashOutCoefficient=");
            sb.append(this.cashOutCoefficient);
            sb.append(", currency=");
            sb.append(this.currency);
            sb.append(", houseCoefficient=");
            sb.append(this.houseCoefficient);
            sb.append(CaBJCMnsV.ZisRtZCZsyTAC);
            sb.append(this.isBot);
            sb.append(", message=");
            sb.append(this.message);
            sb.append(", nickName=");
            sb.append(this.nickName);
            sb.append(", payoutAmount=");
            sb.append(this.payoutAmount);
            sb.append(", roundId=");
            sb.append(this.roundId);
            sb.append(", stakeAmount=");
            sb.append(this.stakeAmount);
            sb.append(", targetCoefficient=");
            sb.append(this.targetCoefficient);
            sb.append(", betCategory=");
            sb.append(this.betCategory);
            sb.append(", sideBetType=");
            sb.append(this.sideBetType);
            sb.append(", startCoefficient=");
            sb.append(this.startCoefficient);
            sb.append(", endCoefficient=");
            sb.append(this.endCoefficient);
            sb.append(", rocketType=");
            return j26.a(sb, this.rocketType, ')');
        }

        public Json(String str, Long l, Double d, String str2, Double d2, Boolean bool, String str3, String str4, Double d3, Long l2, Double d4, Double d5, String str5, String str6, Double d6, Double d7, String str7) {
            this.avatarUrl = str;
            this.betId = l;
            this.cashOutCoefficient = d;
            this.currency = str2;
            this.houseCoefficient = d2;
            this.isBot = bool;
            this.message = str3;
            this.nickName = str4;
            this.payoutAmount = d3;
            this.roundId = l2;
            this.stakeAmount = d4;
            this.targetCoefficient = d5;
            this.betCategory = str5;
            this.sideBetType = str6;
            this.startCoefficient = d6;
            this.endCoefficient = d7;
            this.rocketType = str7;
        }
    }

    public SendMessageRequest(String str, String str2, String str3, String str4, Json json) {
        str.getClass();
        str2.getClass();
        this.chatRoomId = str;
        this.msgType = str2;
        this.text = str3;
        this.gif = str4;
        this.json = json;
    }

    public static /* synthetic */ SendMessageRequest copy$default(SendMessageRequest sendMessageRequest, String str, String str2, String str3, String str4, Json json, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendMessageRequest.chatRoomId;
        }
        if ((i & 2) != 0) {
            str2 = sendMessageRequest.msgType;
        }
        if ((i & 4) != 0) {
            str3 = sendMessageRequest.text;
        }
        if ((i & 8) != 0) {
            str4 = sendMessageRequest.gif;
        }
        if ((i & 16) != 0) {
            json = sendMessageRequest.json;
        }
        Json json2 = json;
        String str5 = str3;
        return sendMessageRequest.copy(str, str2, str5, str4, json2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMsgType() {
        return this.msgType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGif() {
        return this.gif;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Json getJson() {
        return this.json;
    }

    public final SendMessageRequest copy(String chatRoomId, String msgType, String text, String gif, Json json) {
        chatRoomId.getClass();
        msgType.getClass();
        return new SendMessageRequest(chatRoomId, msgType, text, gif, json);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SendMessageRequest)) {
            return false;
        }
        SendMessageRequest sendMessageRequest = (SendMessageRequest) other;
        return Intrinsics.g(this.chatRoomId, sendMessageRequest.chatRoomId) && Intrinsics.g(this.msgType, sendMessageRequest.msgType) && Intrinsics.g(this.text, sendMessageRequest.text) && Intrinsics.g(this.gif, sendMessageRequest.gif) && Intrinsics.g(this.json, sendMessageRequest.json);
    }

    public final String getChatRoomId() {
        return this.chatRoomId;
    }

    public final String getGif() {
        return this.gif;
    }

    public final Json getJson() {
        return this.json;
    }

    public final String getMsgType() {
        return this.msgType;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iA = gmf0.a(this.chatRoomId.hashCode() * 31, 31, this.msgType);
        String str = this.text;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gif;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Json json = this.json;
        return iHashCode2 + (json != null ? json.hashCode() : 0);
    }

    public String toString() {
        return "SendMessageRequest(chatRoomId=" + this.chatRoomId + ", msgType=" + this.msgType + ", text=" + this.text + ", gif=" + this.gif + ", json=" + this.json + ')';
    }
}
