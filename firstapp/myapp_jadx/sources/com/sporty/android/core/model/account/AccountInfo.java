package com.sporty.android.core.model.account;

import defpackage.em5;
import defpackage.f78;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nng;
import defpackage.oie;
import defpackage.qn4;
import defpackage.u8;
import defpackage.uts;
import defpackage.ux5;
import defpackage.w03;
import defpackage.zug;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\bd\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B¥\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\u0010\u0012\b\b\u0002\u0010$\u001a\u00020\u0010\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020\n\u0012\b\b\u0002\u0010(\u001a\u00020)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\n\u0012\b\b\u0002\u0010,\u001a\u00020\n\u0012\b\b\u0002\u0010-\u001a\u00020)¢\u0006\u0004\b.\u0010/J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010a\u001a\u00020\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0006HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\nHÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\t\u0010g\u001a\u00020\nHÆ\u0003J\t\u0010h\u001a\u00020\u0003HÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\u0010\u0010j\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010@J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010@J\u000b\u0010q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\nHÆ\u0003J\u0010\u0010t\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010LJ\t\u0010u\u001a\u00020\nHÆ\u0003J\t\u0010v\u001a\u00020\nHÆ\u0003J\u0010\u0010w\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010LJ\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\nHÆ\u0003J\t\u0010}\u001a\u00020\u0010HÆ\u0003J\t\u0010~\u001a\u00020\u0010HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0080\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020)HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020)HÆ\u0003J®\u0003\u0010\u0087\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\n2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\u00102\b\b\u0002\u0010$\u001a\u00020\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010+\u001a\u00020\n2\b\b\u0002\u0010,\u001a\u00020\n2\b\b\u0002\u0010-\u001a\u00020)HÆ\u0001¢\u0006\u0003\u0010\u0088\u0001J\u0016\u0010\u0089\u0001\u001a\u00020\n2\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\u000b\u0010\u008b\u0001\u001a\u00020\u0010HÖ\u0081\u0004J\u000b\u0010\u008c\u0001\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00101\"\u0004\b3\u00104R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u00101R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b8\u00101R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b;\u0010:R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b<\u0010:R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b=\u00101R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b>\u00101R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u00101R\u0011\u0010\u0012\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bC\u00101R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010A\u001a\u0004\bD\u0010@R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bE\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bF\u00101R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0010¢\u0006\n\n\u0002\u0010A\u001a\u0004\bG\u0010@R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u00101R\u001a\u0010\u0018\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00101\"\u0004\bJ\u00104R\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bK\u0010:R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010M\u001a\u0004\b\u001a\u0010LR\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bN\u0010:R\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bO\u0010:R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010M\u001a\u0004\bP\u0010LR\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u00101R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bT\u00101R\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u0011\u0010#\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010$\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bX\u0010WR\u0013\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bY\u00101R\u0011\u0010&\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010:R\u0011\u0010'\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010:R\u0011\u0010(\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0013\u0010*\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\\\u00101R\u0011\u0010+\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b]\u0010:R\u0011\u0010,\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b^\u0010:R\u0011\u0010-\u001a\u00020)¢\u0006\b\n\u0000\u001a\u0004\b_\u0010[Ê\u0001\u0003\b\u008e\u0001¨\u0006\u008d\u0001"}, d2 = {"Lcom/sporty/android/core/model/account/AccountInfo;", "", "area", "", "avatar", "avatarFrame", "Lcom/sporty/android/core/model/account/AvatarFrame;", "betslipTheme", "birthday", "editableBirthday", "", "editableFirstName", "editableLastName", "email", "firstName", "gender", "", "language", "lastName", "locationId", "nameUpdateRejectReasonDetail", "nameUpdateRejectReasonTitle", "nameUpdateStatus", "nameUpdateSuccessContent", "nickname", "nicknameVerified", "isCreator", "ninEnabled", "ninNameUpdateEnabled", "ninVerified", "phone", "phoneCountryCode", "state", "theme", "phoneReviewed", "loyaltyCurrentTier", "loyaltyHistoryHighestTier", "oddsFormat", "isTelegramBindEnabled", "isTelegramBound", "loyaltyLifeWager", "", "bio", "ninDobVerificationEnabled", "dobVerifiedByNin", "createTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/account/AvatarFrame;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;ZZJLjava/lang/String;ZZJ)V", "getArea", "()Ljava/lang/String;", "getAvatar", "setAvatar", "(Ljava/lang/String;)V", "getAvatarFrame", "()Lcom/sporty/android/core/model/account/AvatarFrame;", "getBetslipTheme", "getBirthday", "getEditableBirthday", "()Z", "getEditableFirstName", "getEditableLastName", "getEmail", "getFirstName", "getGender", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLanguage", "getLastName", "getLocationId", "getNameUpdateRejectReasonDetail", "getNameUpdateRejectReasonTitle", "getNameUpdateStatus", "getNameUpdateSuccessContent", "getNickname", "setNickname", "getNicknameVerified", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getNinEnabled", "getNinNameUpdateEnabled", "getNinVerified", "getPhone", "getPhoneCountryCode", "getState", "getTheme", "getPhoneReviewed", "getLoyaltyCurrentTier", "()I", "getLoyaltyHistoryHighestTier", "getOddsFormat", "getLoyaltyLifeWager", "()J", "getBio", "getNinDobVerificationEnabled", "getDobVerifiedByNin", "getCreateTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/sporty/android/core/model/account/AvatarFrame;Ljava/lang/String;Ljava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/String;ZZJLjava/lang/String;ZZJ)Lcom/sporty/android/core/model/account/AccountInfo;", "equals", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AccountInfo {
    private final String area;
    private String avatar;
    private final AvatarFrame avatarFrame;
    private final String betslipTheme;
    private final String bio;
    private final String birthday;
    private final long createTime;
    private final boolean dobVerifiedByNin;
    private final boolean editableBirthday;
    private final boolean editableFirstName;
    private final boolean editableLastName;
    private final String email;
    private final String firstName;
    private final Integer gender;
    private final Boolean isCreator;
    private final boolean isTelegramBindEnabled;
    private final boolean isTelegramBound;
    private final String language;
    private final String lastName;
    private final Integer locationId;
    private final int loyaltyCurrentTier;
    private final int loyaltyHistoryHighestTier;
    private final long loyaltyLifeWager;
    private final String nameUpdateRejectReasonDetail;
    private final String nameUpdateRejectReasonTitle;
    private final Integer nameUpdateStatus;
    private final String nameUpdateSuccessContent;
    private String nickname;
    private final boolean nicknameVerified;
    private final boolean ninDobVerificationEnabled;
    private final boolean ninEnabled;
    private final boolean ninNameUpdateEnabled;
    private final Boolean ninVerified;
    private final String oddsFormat;
    private final String phone;
    private final String phoneCountryCode;
    private final boolean phoneReviewed;
    private final String state;
    private final String theme;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AccountInfo(String str, String str2, AvatarFrame avatarFrame, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, Integer num3, String str11, String str12, boolean z4, Boolean bool, boolean z5, boolean z6, Boolean bool2, String str13, String str14, String str15, String str16, boolean z7, int i, int i2, String str17, boolean z8, boolean z9, long j, String str18, boolean z10, boolean z11, long j2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num4 = 0;
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? new AvatarFrame(null, null, null, 7, null) : avatarFrame, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? "" : str4, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? false : z2, (i3 & 128) != 0 ? false : z3, (i3 & 256) != 0 ? "" : str5, (i3 & 512) != 0 ? "" : str6, (i3 & 1024) != 0 ? num4 : num, (i3 & 2048) != 0 ? "" : str7, (i3 & 4096) != 0 ? "" : str8, (i3 & 8192) != 0 ? num4 : num2, (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? "" : str9, (i3 & 32768) != 0 ? "" : str10, (i3 & 65536) == 0 ? num3 : 0, (i3 & 131072) != 0 ? null : str11, (i3 & 262144) != 0 ? "" : str12, (i3 & 524288) != 0 ? false : z4, (i3 & 1048576) != 0 ? Boolean.FALSE : bool, (i3 & 2097152) != 0 ? false : z5, (i3 & 4194304) != 0 ? false : z6, (i3 & 8388608) != 0 ? null : bool2, (i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? "" : str13, (i3 & 33554432) != 0 ? "" : str14, (i3 & 67108864) != 0 ? "" : str15, (i3 & 134217728) == 0 ? str16 : "", (i3 & 268435456) != 0 ? false : z7, (i3 & 536870912) != 0 ? 0 : i, (i3 & 1073741824) != 0 ? 0 : i2, (i3 & Integer.MIN_VALUE) != 0 ? null : str17, (i4 & 1) != 0 ? false : z8, (i4 & 2) != 0 ? false : z9, (i4 & 4) != 0 ? 0L : j, (i4 & 8) == 0 ? str18 : null, (i4 & 16) != 0 ? false : z10, (i4 & 32) != 0 ? false : z11, (i4 & 64) != 0 ? 0L : j2);
    }

    public static /* synthetic */ AccountInfo copy$default(AccountInfo accountInfo, String str, String str2, AvatarFrame avatarFrame, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, Integer num3, String str11, String str12, boolean z4, Boolean bool, boolean z5, boolean z6, Boolean bool2, String str13, String str14, String str15, String str16, boolean z7, int i, int i2, String str17, boolean z8, boolean z9, long j, String str18, boolean z10, boolean z11, long j2, int i3, int i4, Object obj) {
        long j3;
        boolean z12;
        boolean z13;
        String str19 = (i3 & 1) != 0 ? accountInfo.area : str;
        String str20 = (i3 & 2) != 0 ? accountInfo.avatar : str2;
        AvatarFrame avatarFrame2 = (i3 & 4) != 0 ? accountInfo.avatarFrame : avatarFrame;
        String str21 = (i3 & 8) != 0 ? accountInfo.betslipTheme : str3;
        String str22 = (i3 & 16) != 0 ? accountInfo.birthday : str4;
        boolean z14 = (i3 & 32) != 0 ? accountInfo.editableBirthday : z;
        boolean z15 = (i3 & 64) != 0 ? accountInfo.editableFirstName : z2;
        boolean z16 = (i3 & 128) != 0 ? accountInfo.editableLastName : z3;
        String str23 = (i3 & 256) != 0 ? accountInfo.email : str5;
        String str24 = (i3 & 512) != 0 ? accountInfo.firstName : str6;
        Integer num4 = (i3 & 1024) != 0 ? accountInfo.gender : num;
        String str25 = (i3 & 2048) != 0 ? accountInfo.language : str7;
        String str26 = (i3 & 4096) != 0 ? accountInfo.lastName : str8;
        Integer num5 = (i3 & 8192) != 0 ? accountInfo.locationId : num2;
        String str27 = str19;
        String str28 = (i3 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? accountInfo.nameUpdateRejectReasonDetail : str9;
        String str29 = (i3 & 32768) != 0 ? accountInfo.nameUpdateRejectReasonTitle : str10;
        Integer num6 = (i3 & 65536) != 0 ? accountInfo.nameUpdateStatus : num3;
        String str30 = (i3 & 131072) != 0 ? accountInfo.nameUpdateSuccessContent : str11;
        String str31 = (i3 & 262144) != 0 ? accountInfo.nickname : str12;
        boolean z17 = (i3 & 524288) != 0 ? accountInfo.nicknameVerified : z4;
        Boolean bool3 = (i3 & 1048576) != 0 ? accountInfo.isCreator : bool;
        boolean z18 = (i3 & 2097152) != 0 ? accountInfo.ninEnabled : z5;
        boolean z19 = (i3 & 4194304) != 0 ? accountInfo.ninNameUpdateEnabled : z6;
        Boolean bool4 = (i3 & 8388608) != 0 ? accountInfo.ninVerified : bool2;
        String str32 = (i3 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? accountInfo.phone : str13;
        String str33 = (i3 & 33554432) != 0 ? accountInfo.phoneCountryCode : str14;
        String str34 = (i3 & 67108864) != 0 ? accountInfo.state : str15;
        String str35 = (i3 & 134217728) != 0 ? accountInfo.theme : str16;
        boolean z20 = (i3 & 268435456) != 0 ? accountInfo.phoneReviewed : z7;
        int i5 = (i3 & 536870912) != 0 ? accountInfo.loyaltyCurrentTier : i;
        int i6 = (i3 & 1073741824) != 0 ? accountInfo.loyaltyHistoryHighestTier : i2;
        String str36 = (i3 & Integer.MIN_VALUE) != 0 ? accountInfo.oddsFormat : str17;
        boolean z21 = (i4 & 1) != 0 ? accountInfo.isTelegramBindEnabled : z8;
        boolean z22 = (i4 & 2) != 0 ? accountInfo.isTelegramBound : z9;
        String str37 = str28;
        long j4 = (i4 & 4) != 0 ? accountInfo.loyaltyLifeWager : j;
        String str38 = (i4 & 8) != 0 ? accountInfo.bio : str18;
        boolean z23 = (i4 & 16) != 0 ? accountInfo.ninDobVerificationEnabled : z10;
        String str39 = str38;
        boolean z24 = (i4 & 32) != 0 ? accountInfo.dobVerifiedByNin : z11;
        if ((i4 & 64) != 0) {
            z13 = z23;
            z12 = z24;
            j3 = accountInfo.createTime;
        } else {
            j3 = j2;
            z12 = z24;
            z13 = z23;
        }
        return accountInfo.copy(str27, str20, avatarFrame2, str21, str22, z14, z15, z16, str23, str24, num4, str25, str26, num5, str37, str29, num6, str30, str31, z17, bool3, z18, z19, bool4, str32, str33, str34, str35, z20, i5, i6, str36, z21, z22, j4, str39, z13, z12, j3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getArea() {
        return this.area;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getLocationId() {
        return this.locationId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNameUpdateRejectReasonDetail() {
        return this.nameUpdateRejectReasonDetail;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getNameUpdateRejectReasonTitle() {
        return this.nameUpdateRejectReasonTitle;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getNameUpdateStatus() {
        return this.nameUpdateStatus;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getNameUpdateSuccessContent() {
        return this.nameUpdateSuccessContent;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final boolean getNicknameVerified() {
        return this.nicknameVerified;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Boolean getIsCreator() {
        return this.isCreator;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final boolean getNinEnabled() {
        return this.ninEnabled;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final boolean getNinNameUpdateEnabled() {
        return this.ninNameUpdateEnabled;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final Boolean getNinVerified() {
        return this.ninVerified;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getPhoneReviewed() {
        return this.phoneReviewed;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AvatarFrame getAvatarFrame() {
        return this.avatarFrame;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final int getLoyaltyCurrentTier() {
        return this.loyaltyCurrentTier;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getLoyaltyHistoryHighestTier() {
        return this.loyaltyHistoryHighestTier;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getOddsFormat() {
        return this.oddsFormat;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getIsTelegramBindEnabled() {
        return this.isTelegramBindEnabled;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getIsTelegramBound() {
        return this.isTelegramBound;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final long getLoyaltyLifeWager() {
        return this.loyaltyLifeWager;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getBio() {
        return this.bio;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getNinDobVerificationEnabled() {
        return this.ninDobVerificationEnabled;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getDobVerifiedByNin() {
        return this.dobVerifiedByNin;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final long getCreateTime() {
        return this.createTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBetslipTheme() {
        return this.betslipTheme;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getEditableBirthday() {
        return this.editableBirthday;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getEditableFirstName() {
        return this.editableFirstName;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getEditableLastName() {
        return this.editableLastName;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final AccountInfo copy(String area, String avatar, AvatarFrame avatarFrame, String betslipTheme, String birthday, boolean editableBirthday, boolean editableFirstName, boolean editableLastName, String email, String firstName, Integer gender, String language, String lastName, Integer locationId, String nameUpdateRejectReasonDetail, String nameUpdateRejectReasonTitle, Integer nameUpdateStatus, String nameUpdateSuccessContent, String nickname, boolean nicknameVerified, Boolean isCreator, boolean ninEnabled, boolean ninNameUpdateEnabled, Boolean ninVerified, String phone, String phoneCountryCode, String state, String theme, boolean phoneReviewed, int loyaltyCurrentTier, int loyaltyHistoryHighestTier, String oddsFormat, boolean isTelegramBindEnabled, boolean isTelegramBound, long loyaltyLifeWager, String bio, boolean ninDobVerificationEnabled, boolean dobVerifiedByNin, long createTime) {
        avatar.getClass();
        avatarFrame.getClass();
        betslipTheme.getClass();
        birthday.getClass();
        email.getClass();
        qn4.b(firstName, language, lastName, nickname, phone);
        phoneCountryCode.getClass();
        theme.getClass();
        return new AccountInfo(area, avatar, avatarFrame, betslipTheme, birthday, editableBirthday, editableFirstName, editableLastName, email, firstName, gender, language, lastName, locationId, nameUpdateRejectReasonDetail, nameUpdateRejectReasonTitle, nameUpdateStatus, nameUpdateSuccessContent, nickname, nicknameVerified, isCreator, ninEnabled, ninNameUpdateEnabled, ninVerified, phone, phoneCountryCode, state, theme, phoneReviewed, loyaltyCurrentTier, loyaltyHistoryHighestTier, oddsFormat, isTelegramBindEnabled, isTelegramBound, loyaltyLifeWager, bio, ninDobVerificationEnabled, dobVerifiedByNin, createTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) other;
        return Intrinsics.g(this.area, accountInfo.area) && Intrinsics.g(this.avatar, accountInfo.avatar) && Intrinsics.g(this.avatarFrame, accountInfo.avatarFrame) && Intrinsics.g(this.betslipTheme, accountInfo.betslipTheme) && Intrinsics.g(this.birthday, accountInfo.birthday) && this.editableBirthday == accountInfo.editableBirthday && this.editableFirstName == accountInfo.editableFirstName && this.editableLastName == accountInfo.editableLastName && Intrinsics.g(this.email, accountInfo.email) && Intrinsics.g(this.firstName, accountInfo.firstName) && Intrinsics.g(this.gender, accountInfo.gender) && Intrinsics.g(this.language, accountInfo.language) && Intrinsics.g(this.lastName, accountInfo.lastName) && Intrinsics.g(this.locationId, accountInfo.locationId) && Intrinsics.g(this.nameUpdateRejectReasonDetail, accountInfo.nameUpdateRejectReasonDetail) && Intrinsics.g(this.nameUpdateRejectReasonTitle, accountInfo.nameUpdateRejectReasonTitle) && Intrinsics.g(this.nameUpdateStatus, accountInfo.nameUpdateStatus) && Intrinsics.g(this.nameUpdateSuccessContent, accountInfo.nameUpdateSuccessContent) && Intrinsics.g(this.nickname, accountInfo.nickname) && this.nicknameVerified == accountInfo.nicknameVerified && Intrinsics.g(this.isCreator, accountInfo.isCreator) && this.ninEnabled == accountInfo.ninEnabled && this.ninNameUpdateEnabled == accountInfo.ninNameUpdateEnabled && Intrinsics.g(this.ninVerified, accountInfo.ninVerified) && Intrinsics.g(this.phone, accountInfo.phone) && Intrinsics.g(this.phoneCountryCode, accountInfo.phoneCountryCode) && Intrinsics.g(this.state, accountInfo.state) && Intrinsics.g(this.theme, accountInfo.theme) && this.phoneReviewed == accountInfo.phoneReviewed && this.loyaltyCurrentTier == accountInfo.loyaltyCurrentTier && this.loyaltyHistoryHighestTier == accountInfo.loyaltyHistoryHighestTier && Intrinsics.g(this.oddsFormat, accountInfo.oddsFormat) && this.isTelegramBindEnabled == accountInfo.isTelegramBindEnabled && this.isTelegramBound == accountInfo.isTelegramBound && this.loyaltyLifeWager == accountInfo.loyaltyLifeWager && Intrinsics.g(this.bio, accountInfo.bio) && this.ninDobVerificationEnabled == accountInfo.ninDobVerificationEnabled && this.dobVerifiedByNin == accountInfo.dobVerifiedByNin && this.createTime == accountInfo.createTime;
    }

    public final String getArea() {
        return this.area;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final AvatarFrame getAvatarFrame() {
        return this.avatarFrame;
    }

    public final String getBetslipTheme() {
        return this.betslipTheme;
    }

    public final String getBio() {
        return this.bio;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final boolean getDobVerifiedByNin() {
        return this.dobVerifiedByNin;
    }

    public final boolean getEditableBirthday() {
        return this.editableBirthday;
    }

    public final boolean getEditableFirstName() {
        return this.editableFirstName;
    }

    public final boolean getEditableLastName() {
        return this.editableLastName;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final Integer getLocationId() {
        return this.locationId;
    }

    public final int getLoyaltyCurrentTier() {
        return this.loyaltyCurrentTier;
    }

    public final int getLoyaltyHistoryHighestTier() {
        return this.loyaltyHistoryHighestTier;
    }

    public final long getLoyaltyLifeWager() {
        return this.loyaltyLifeWager;
    }

    public final String getNameUpdateRejectReasonDetail() {
        return this.nameUpdateRejectReasonDetail;
    }

    public final String getNameUpdateRejectReasonTitle() {
        return this.nameUpdateRejectReasonTitle;
    }

    public final Integer getNameUpdateStatus() {
        return this.nameUpdateStatus;
    }

    public final String getNameUpdateSuccessContent() {
        return this.nameUpdateSuccessContent;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final boolean getNicknameVerified() {
        return this.nicknameVerified;
    }

    public final boolean getNinDobVerificationEnabled() {
        return this.ninDobVerificationEnabled;
    }

    public final boolean getNinEnabled() {
        return this.ninEnabled;
    }

    public final boolean getNinNameUpdateEnabled() {
        return this.ninNameUpdateEnabled;
    }

    public final Boolean getNinVerified() {
        return this.ninVerified;
    }

    public final String getOddsFormat() {
        return this.oddsFormat;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final String getPhoneCountryCode() {
        return this.phoneCountryCode;
    }

    public final boolean getPhoneReviewed() {
        return this.phoneReviewed;
    }

    public final String getState() {
        return this.state;
    }

    public final String getTheme() {
        return this.theme;
    }

    public int hashCode() {
        String str = this.area;
        int iA = gmf0.a(gmf0.a(mtg0.a(mtg0.a(mtg0.a(gmf0.a(gmf0.a((this.avatarFrame.hashCode() + gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.avatar)) * 31, 31, this.betslipTheme), 31, this.birthday), 31, this.editableBirthday), 31, this.editableFirstName), 31, this.editableLastName), 31, this.email), 31, this.firstName);
        Integer num = this.gender;
        int iA2 = gmf0.a(gmf0.a((iA + (num == null ? 0 : num.hashCode())) * 31, 31, this.language), 31, this.lastName);
        Integer num2 = this.locationId;
        int iHashCode = (iA2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.nameUpdateRejectReasonDetail;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nameUpdateRejectReasonTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.nameUpdateStatus;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.nameUpdateSuccessContent;
        int iA3 = mtg0.a(gmf0.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.nickname), 31, this.nicknameVerified);
        Boolean bool = this.isCreator;
        int iA4 = mtg0.a(mtg0.a((iA3 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.ninEnabled), 31, this.ninNameUpdateEnabled);
        Boolean bool2 = this.ninVerified;
        int iA5 = gmf0.a(gmf0.a((iA4 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.phone), 31, this.phoneCountryCode);
        String str5 = this.state;
        int iA6 = gpp.a(this.loyaltyHistoryHighestTier, gpp.a(this.loyaltyCurrentTier, mtg0.a(gmf0.a((iA5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.theme), 31, this.phoneReviewed), 31), 31);
        String str6 = this.oddsFormat;
        int iA7 = f87.a(mtg0.a(mtg0.a((iA6 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.isTelegramBindEnabled), 31, this.isTelegramBound), this.loyaltyLifeWager, 31);
        String str7 = this.bio;
        return Long.hashCode(this.createTime) + mtg0.a(mtg0.a((iA7 + (str7 != null ? str7.hashCode() : 0)) * 31, 31, this.ninDobVerificationEnabled), 31, this.dobVerifiedByNin);
    }

    public final Boolean isCreator() {
        return this.isCreator;
    }

    public final boolean isTelegramBindEnabled() {
        return this.isTelegramBindEnabled;
    }

    public final boolean isTelegramBound() {
        return this.isTelegramBound;
    }

    public final void setAvatar(String str) {
        str.getClass();
        this.avatar = str;
    }

    public final void setNickname(String str) {
        str.getClass();
        this.nickname = str;
    }

    public String toString() {
        String str = this.area;
        String str2 = this.avatar;
        AvatarFrame avatarFrame = this.avatarFrame;
        String str3 = this.betslipTheme;
        String str4 = this.birthday;
        boolean z = this.editableBirthday;
        boolean z2 = this.editableFirstName;
        boolean z3 = this.editableLastName;
        String str5 = this.email;
        String str6 = this.firstName;
        Integer num = this.gender;
        String str7 = this.language;
        String str8 = this.lastName;
        Integer num2 = this.locationId;
        String str9 = this.nameUpdateRejectReasonDetail;
        String str10 = this.nameUpdateRejectReasonTitle;
        Integer num3 = this.nameUpdateStatus;
        String str11 = this.nameUpdateSuccessContent;
        String str12 = this.nickname;
        boolean z4 = this.nicknameVerified;
        Boolean bool = this.isCreator;
        boolean z5 = this.ninEnabled;
        boolean z6 = this.ninNameUpdateEnabled;
        Boolean bool2 = this.ninVerified;
        String str13 = this.phone;
        String str14 = this.phoneCountryCode;
        String str15 = this.state;
        String str16 = this.theme;
        boolean z7 = this.phoneReviewed;
        int i = this.loyaltyCurrentTier;
        int i2 = this.loyaltyHistoryHighestTier;
        String str17 = this.oddsFormat;
        boolean z8 = this.isTelegramBindEnabled;
        boolean z9 = this.isTelegramBound;
        long j = this.loyaltyLifeWager;
        String str18 = this.bio;
        boolean z10 = this.ninDobVerificationEnabled;
        boolean z11 = this.dobVerifiedByNin;
        long j2 = this.createTime;
        StringBuilder sbA = ux5.a("AccountInfo(area=", str, ", avatar=", str2, ", avatarFrame=");
        sbA.append(avatarFrame);
        sbA.append(", betslipTheme=");
        sbA.append(str3);
        sbA.append(", birthday=");
        uts.b(str4, ", editableBirthday=", ", editableFirstName=", sbA, z);
        nng.a(", editableLastName=", ", email=", sbA, z2, z3);
        hxa.c(sbA, str5, ", firstName=", str6, ", gender=");
        w03.a(num, ", language=", str7, ", lastName=", sbA);
        oie.a(num2, str8, ", locationId=", ", nameUpdateRejectReasonDetail=", sbA);
        hxa.c(sbA, str9, ", nameUpdateRejectReasonTitle=", str10, ", nameUpdateStatus=");
        w03.a(num3, ", nameUpdateSuccessContent=", str11, ", nickname=", sbA);
        uts.b(str12, ", nicknameVerified=", ", isCreator=", sbA, z4);
        sbA.append(bool);
        sbA.append(", ninEnabled=");
        sbA.append(z5);
        sbA.append(", ninNameUpdateEnabled=");
        sbA.append(z6);
        sbA.append(", ninVerified=");
        sbA.append(bool2);
        sbA.append(", phone=");
        hxa.c(sbA, str13, ", phoneCountryCode=", str14, ", state=");
        hxa.c(sbA, str15, ", theme=", str16, ", phoneReviewed=");
        sbA.append(z7);
        sbA.append(", loyaltyCurrentTier=");
        sbA.append(i);
        sbA.append(", loyaltyHistoryHighestTier=");
        f78.b(i2, ", oddsFormat=", str17, ", isTelegramBindEnabled=", sbA);
        nng.a(", isTelegramBound=", ", loyaltyLifeWager=", sbA, z8, z9);
        em5.a(j, ", bio=", str18, sbA);
        u8.a(", ninDobVerificationEnabled=", ", dobVerifiedByNin=", sbA, z10, z11);
        return zug.a(j2, ", createTime=", ")", sbA);
    }

    public AccountInfo(String str, String str2, AvatarFrame avatarFrame, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, String str6, Integer num, String str7, String str8, Integer num2, String str9, String str10, Integer num3, String str11, String str12, boolean z4, Boolean bool, boolean z5, boolean z6, Boolean bool2, String str13, String str14, String str15, String str16, boolean z7, int i, int i2, String str17, boolean z8, boolean z9, long j, String str18, boolean z10, boolean z11, long j2) {
        str2.getClass();
        avatarFrame.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        qn4.b(str6, str7, str8, str12, str13);
        str14.getClass();
        str16.getClass();
        this.area = str;
        this.avatar = str2;
        this.avatarFrame = avatarFrame;
        this.betslipTheme = str3;
        this.birthday = str4;
        this.editableBirthday = z;
        this.editableFirstName = z2;
        this.editableLastName = z3;
        this.email = str5;
        this.firstName = str6;
        this.gender = num;
        this.language = str7;
        this.lastName = str8;
        this.locationId = num2;
        this.nameUpdateRejectReasonDetail = str9;
        this.nameUpdateRejectReasonTitle = str10;
        this.nameUpdateStatus = num3;
        this.nameUpdateSuccessContent = str11;
        this.nickname = str12;
        this.nicknameVerified = z4;
        this.isCreator = bool;
        this.ninEnabled = z5;
        this.ninNameUpdateEnabled = z6;
        this.ninVerified = bool2;
        this.phone = str13;
        this.phoneCountryCode = str14;
        this.state = str15;
        this.theme = str16;
        this.phoneReviewed = z7;
        this.loyaltyCurrentTier = i;
        this.loyaltyHistoryHighestTier = i2;
        this.oddsFormat = str17;
        this.isTelegramBindEnabled = z8;
        this.isTelegramBound = z9;
        this.loyaltyLifeWager = j;
        this.bio = str18;
        this.ninDobVerificationEnabled = z10;
        this.dobVerifiedByNin = z11;
        this.createTime = j2;
    }

    public AccountInfo() {
        this(null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, null, null, null, null, null, false, 0, 0, null, false, false, 0L, null, false, false, 0L, -1, 127, null);
    }
}
