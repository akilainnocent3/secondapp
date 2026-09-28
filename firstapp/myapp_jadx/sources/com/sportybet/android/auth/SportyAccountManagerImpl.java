package com.sportybet.android.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.OnAccountsUpdateListener;
import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.sporty.android.core.model.account.AccountInfo;
import com.sporty.android.core.model.patron.KycHintExtra;
import com.sportybet.android.auth.SportyAccountManagerImpl;
import com.sportybet.android.gp.tz.R;
import defpackage.bc6;
import defpackage.bm50;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.dj5;
import defpackage.e97;
import defpackage.ejt;
import defpackage.eo20;
import defpackage.fae;
import defpackage.ga;
import defpackage.gaj;
import defpackage.hwr;
import defpackage.i97;
import defpackage.ib5;
import defpackage.iyz;
import defpackage.ks20;
import defpackage.lyh;
import defpackage.m2l;
import defpackage.mgb0;
import defpackage.n1i;
import defpackage.oaa0;
import defpackage.psm;
import defpackage.pu0;
import defpackage.r0i;
import defpackage.s0i;
import defpackage.s9e0;
import defpackage.sab;
import defpackage.sn5;
import defpackage.str;
import defpackage.t8;
import defpackage.tje0;
import defpackage.tkk;
import defpackage.ttr;
import defpackage.uj50;
import defpackage.uzh;
import defpackage.v1b;
import defpackage.vj5;
import defpackage.vl50;
import defpackage.wm20;
import defpackage.x1b;
import defpackage.xwd0;
import defpackage.y5b;
import defpackage.yzo;
import defpackage.zb6;
import defpackage.zi50;
import defpackage.ztw;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010 \u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b \u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00192\b\u0010!\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00162\u0006\u0010$\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00190'H\u0016¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b*\u0010\u0018J\u0012\u0010+\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b+\u0010\u0018J\u0012\u0010,\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b,\u0010\u0018J\u001a\u0010.\u001a\u00020\u00162\b\u0010-\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b.\u0010&J\u0012\u0010/\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b/\u0010\u0018J\u001a\u00100\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b0\u0010&J\u0012\u00101\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b1\u0010\u0018J\u0018\u00103\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b4\u0010\u0018J\u001a\u00105\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010\u0019H\u0096@¢\u0006\u0004\b5\u0010&J\u0010\u00107\u001a\u000206H\u0096@¢\u0006\u0004\b7\u0010\u0018J\u0018\u00109\u001a\u00020\u00162\u0006\u00108\u001a\u000206H\u0096@¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\b\u0012\u0004\u0012\u0002060'H\u0016¢\u0006\u0004\b;\u0010)J\u0010\u0010<\u001a\u000206H\u0096@¢\u0006\u0004\b<\u0010\u0018J\u0018\u0010>\u001a\u00020\u00162\u0006\u0010=\u001a\u000206H\u0096@¢\u0006\u0004\b>\u0010:J\u0015\u0010?\u001a\b\u0012\u0004\u0012\u0002060'H\u0016¢\u0006\u0004\b?\u0010)J\u0010\u0010A\u001a\u00020@H\u0096@¢\u0006\u0004\bA\u0010\u0018J\u0018\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020@H\u0096@¢\u0006\u0004\bC\u0010DJ\u0015\u0010E\u001a\b\u0012\u0004\u0012\u00020@0'H\u0016¢\u0006\u0004\bE\u0010)J\u0010\u0010G\u001a\u00020FH\u0096@¢\u0006\u0004\bG\u0010\u0018J\u0018\u0010I\u001a\u00020\u00162\u0006\u0010H\u001a\u00020FH\u0096@¢\u0006\u0004\bI\u0010JJ\u0018\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bL\u0010&J\u0010\u0010M\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bM\u0010\u0018J\u0010\u0010N\u001a\u00020FH\u0096@¢\u0006\u0004\bN\u0010\u0018J\u0018\u0010P\u001a\u00020\u00162\u0006\u0010O\u001a\u00020FH\u0096@¢\u0006\u0004\bP\u0010JJ\u0010\u0010R\u001a\u00020QH\u0096@¢\u0006\u0004\bR\u0010\u0018J\u0018\u0010T\u001a\u00020\u00162\u0006\u0010S\u001a\u00020QH\u0096@¢\u0006\u0004\bT\u0010UJ\u0015\u0010V\u001a\b\u0012\u0004\u0012\u00020Q0'H\u0016¢\u0006\u0004\bV\u0010)J\u0010\u0010W\u001a\u00020\u0016H\u0096@¢\u0006\u0004\bW\u0010\u0018J\u0019\u0010Z\u001a\u00020\u00162\b\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bZ\u0010[J\u0011\u0010\\\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b\\\u0010]J\u0010\u0010^\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b^\u0010\u0018J\u000f\u0010_\u001a\u00020QH\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020QH\u0016¢\u0006\u0004\ba\u0010`J\u0015\u0010b\u001a\b\u0012\u0004\u0012\u00020Q0'H\u0016¢\u0006\u0004\bb\u0010)J\u0018\u0010d\u001a\u00020\u00162\u0006\u0010c\u001a\u00020QH\u0096@¢\u0006\u0004\bd\u0010UJ\u0010\u0010e\u001a\u00020QH\u0096@¢\u0006\u0004\be\u0010\u0018J\u0018\u0010h\u001a\u00020\u00162\u0006\u0010g\u001a\u00020fH\u0096@¢\u0006\u0004\bh\u0010iJ$\u0010m\u001a\u00020\u00162\u0012\u0010l\u001a\u000e\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020k0jH\u0082@¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020\u0019*\u00020\u0019H\u0002¢\u0006\u0004\bo\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010pR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010qR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010rR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010sR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010uR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010vR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010wR \u0010y\u001a\b\u0012\u0004\u0012\u00020k0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\"\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010X0x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b}\u0010z\u001a\u0004\b~\u0010|R%\u0010\u0080\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u007f0x8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010z\u001a\u0005\b\u0081\u0001\u0010|R \u0010\u0086\u0001\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0087\u0001\u001a\u00020F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u0089\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u008d\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008c\u0001R/\u0010H\u001a\u00020F2\u0007\u0010\u008e\u0001\u001a\u00020F8V@VX\u0097\u000e¢\u0006\u0016\u0012\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0005\bG\u0010\u008f\u0001\"\u0005\bI\u0010\u0090\u0001R/\u0010K\u001a\u00020\u00192\u0007\u0010\u008e\u0001\u001a\u00020\u00198V@VX\u0097\u000e¢\u0006\u0016\u0012\u0006\b\u0094\u0001\u0010\u0092\u0001\u001a\u0005\bM\u0010\u0085\u0001\"\u0005\bL\u0010\u0093\u0001R/\u00108\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u0002068V@VX\u0097\u000e¢\u0006\u0016\u0012\u0006\b\u0097\u0001\u0010\u0092\u0001\u001a\u0005\b7\u0010\u0095\u0001\"\u0005\b9\u0010\u0096\u0001R/\u0010=\u001a\u0002062\u0007\u0010\u008e\u0001\u001a\u0002068V@VX\u0097\u000e¢\u0006\u0016\u0012\u0006\b\u0098\u0001\u0010\u0092\u0001\u001a\u0005\b<\u0010\u0095\u0001\"\u0005\b>\u0010\u0096\u0001¨\u0006\u0099\u0001"}, d2 = {"Lcom/sportybet/android/auth/SportyAccountManagerImpl;", "Lmgb0;", "Lga;", "preferenceDataStore", "Lm2l;", "globalPreferenceDataStore", "", "Lejt;", "accountCleanables", "Lstr;", "Liyz;", "patronRepository", "Landroid/accounts/AccountManager;", "androidAccountManager", "Landroid/content/Context;", "applicationContext", "Lpsm;", "countryManager", "Lbnh0;", "urlCreator", "<init>", "(Lga;Lm2l;Ljava/util/Set;Lstr;Landroid/accounts/AccountManager;Landroid/content/Context;Lpsm;Lbnh0;)V", "", "init", "(Lv1b;)Ljava/lang/Object;", "", "avatar", "nickname", "updateAvatarAndNickname", "(Ljava/lang/String;Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "account", "userId", "updateLastAccount", "default", "getLanguageCode", "(Ljava/lang/String;)Ljava/lang/String;", "languageCode", "setLanguageCode", "(Ljava/lang/String;Lv1b;)Ljava/lang/Object;", "Llyh;", "getLanguageFlow", "()Llyh;", "getLastAccount", "getLastUserId", "getLastAvatarUrl", "avatarUrl", "setLastAvatarUrl", "getLastNickname", "setLastNickname", "getLoginType", "loginType", "setLoginType", "getUserId", "setUserId", "", "getUserCertStatus", "userCertStatus", "setUserCertStatus", "(ILv1b;)Ljava/lang/Object;", "getUserCertStatusFlow", "getDocumentAuditStatus", "documentAuditStatus", "setDocumentAuditStatus", "getDocumentAuditStatusFlow", "Lcom/sporty/android/core/model/patron/KycHintExtra;", "getKycHintExtra", "kycHintExtra", "setKycHintExtra", "(Lcom/sporty/android/core/model/patron/KycHintExtra;Lv1b;)Ljava/lang/Object;", "getKycHintExtraFlow", "", "getSelfExclusionUTCTimeStamp", "selfExclusionUTCTimeStamp", "setSelfExclusionUTCTimeStamp", "(JLv1b;)Ljava/lang/Object;", "selfExclusionType", "setSelfExclusionType", "getSelfExclusionType", "getLoginTime", "loginTime", "setLoginTime", "", "getShowBalance", "showBalance", "setShowBalance", "(ZLv1b;)Ljava/lang/Object;", "isShowingBalanceFlow", "clear", "Lcom/sporty/android/core/model/account/AccountInfo;", "accountInfo", "setAccountInfo", "(Lcom/sporty/android/core/model/account/AccountInfo;)V", "lastAccountInfo", "()Lcom/sporty/android/core/model/account/AccountInfo;", "reloadAccountInfo", "hasPersonalPage", "()Z", "isLogin", "isLoginFlow", "enable", "setTwoFactorAuthEnabled", "isTwoFactorAuthEnabled", "Landroid/app/Activity;", "activity", "ensureLogin", "(Landroid/app/Activity;Lv1b;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lt8;", "block", "updateAccount", "(Lkotlin/jvm/functions/Function1;Lv1b;)Ljava/lang/Object;", "addZeroPrefix", "Lga;", "Lm2l;", "Ljava/util/Set;", "Lstr;", "Landroid/accounts/AccountManager;", "Landroid/content/Context;", "Lpsm;", "Lbnh0;", "Lztw;", "accountHolderFlow", "Lztw;", "getAccountHolderFlow", "()Lztw;", "accountInfoFlow", "getAccountInfoFlow", "Landroid/accounts/Account;", "accountFlow", "getAccountFlow", "accountType$delegate", "Lttr;", "getAccountType", "()Ljava/lang/String;", "accountType", "cachedSelfExclusionUTCTimeStamp", "J", "cachedSelfExclusionType", "Ljava/lang/String;", "cachedUserCertStatus", "I", "cachedDocumentAuditStatus", "value", "()J", "(J)V", "getSelfExclusionUTCTimeStamp$annotations", "()V", "(Ljava/lang/String;)V", "getSelfExclusionType$annotations", "()I", "(I)V", "getUserCertStatus$annotations", "getDocumentAuditStatus$annotations", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SportyAccountManagerImpl implements mgb0 {
    public static final int $stable = 8;
    private final Set<ejt> accountCleanables;
    private final ztw<Account> accountFlow;
    private final ztw<t8> accountHolderFlow;
    private final ztw<AccountInfo> accountInfoFlow;

    /* JADX INFO: renamed from: accountType$delegate, reason: from kotlin metadata */
    private final ttr accountType;
    private final AccountManager androidAccountManager;
    private final Context applicationContext;
    private volatile int cachedDocumentAuditStatus;
    private volatile String cachedSelfExclusionType;
    private volatile long cachedSelfExclusionUTCTimeStamp;
    private volatile int cachedUserCertStatus;
    private final psm countryManager;
    private final m2l globalPreferenceDataStore;
    private final str<iyz> patronRepository;
    private final ga preferenceDataStore;
    private final bnh0 urlCreator;

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$clear$1, reason: invalid class name */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {364, 373}, m = "clear", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class AnonymousClass1 extends x1b {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(v1b<? super AnonymousClass1> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.clear(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$ensureLogin$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {476}, m = "ensureLogin", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14331 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14331(v1b<? super C14331> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.ensureLogin(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$getKycHintExtra$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {279, 280}, m = "getKycHintExtra", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14341 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14341(v1b<? super C14341> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.getKycHintExtra(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$getKycHintExtraFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "Lcom/sporty/android/core/model/patron/KycHintExtra;", "rejectTitle", "", "rejectReason"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl$getKycHintExtraFlow$1", f = "SportyAccountManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class C14351 extends tje0 implements gaj<String, String, v1b<? super KycHintExtra>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C14351(v1b<? super C14351> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(String str, String str2, v1b<? super KycHintExtra> v1bVar) {
            C14351 c14351 = new C14351(v1bVar);
            c14351.L$0 = str;
            c14351.L$1 = str2;
            return c14351.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            String str2 = (String) this.L$1;
            y5b y5bVar = y5b.a;
            if (this.label == 0) {
                uj50.b(obj);
                return new KycHintExtra(str, str2);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$getLoginTime$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {330}, m = "getLoginTime", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14361 extends x1b {
        int label;
        /* synthetic */ Object result;

        public C14361(v1b<? super C14361> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.getLoginTime(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$getSelfExclusionType$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {326}, m = "getSelfExclusionType", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14371 extends x1b {
        int label;
        /* synthetic */ Object result;

        public C14371(v1b<? super C14371> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.getSelfExclusionType(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$getShowBalance$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {339, 338}, m = "getShowBalance", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14381 extends x1b {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14381(v1b<? super C14381> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.getShowBalance(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$init$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {WebSocketProtocol.PAYLOAD_SHORT, 127, 128, 129, 130, 131, 132, 134, 136, 137, 138, 139}, m = "init", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14391 extends x1b {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C14391(v1b<? super C14391> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.init(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$reloadAccountInfo$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {393, 396, 397}, m = "reloadAccountInfo", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14401 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14401(v1b<? super C14401> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.reloadAccountInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setDocumentAuditStatus$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {269}, m = "setDocumentAuditStatus", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14411 extends x1b {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C14411(v1b<? super C14411> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setDocumentAuditStatus(0, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setKycHintExtra$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {288, 290, 293, 295}, m = "setKycHintExtra", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14421 extends x1b {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C14421(v1b<? super C14421> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setKycHintExtra(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setLanguageCode$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {183, 186}, m = "setLanguageCode", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14431 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14431(v1b<? super C14431> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setLanguageCode(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setLastAvatarUrl$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {212, 214}, m = "setLastAvatarUrl", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14441 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14441(v1b<? super C14441> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setLastAvatarUrl(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setLastNickname$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {223, 225}, m = "setLastNickname", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14451 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14451(v1b<? super C14451> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setLastNickname(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setLoginType$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {234, 235}, m = "setLoginType", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14461 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14461(v1b<? super C14461> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setLoginType(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setSelfExclusionType$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {321}, m = "setSelfExclusionType", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14471 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14471(v1b<? super C14471> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setSelfExclusionType(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setSelfExclusionUTCTimeStamp$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {316}, m = "setSelfExclusionUTCTimeStamp", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14481 extends x1b {
        long J$0;
        int label;
        /* synthetic */ Object result;

        public C14481(v1b<? super C14481> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setSelfExclusionUTCTimeStamp(0L, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setShowBalance$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {346, 345}, m = "setShowBalance", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14491 extends x1b {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C14491(v1b<? super C14491> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setShowBalance(false, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setUserCertStatus$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {256}, m = "setUserCertStatus", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14501 extends x1b {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public C14501(v1b<? super C14501> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setUserCertStatus(0, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$setUserId$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {244, 246, 248}, m = "setUserId", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14511 extends x1b {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C14511(v1b<? super C14511> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.setUserId(null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$updateAvatarAndNickname$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {154, 160, 161}, m = "updateAvatarAndNickname", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14521 extends x1b {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14521(v1b<? super C14521> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.updateAvatarAndNickname(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.sportybet.android.auth.SportyAccountManagerImpl$updateLastAccount$1, reason: invalid class name and case insensitive filesystem */
    @c0d(c = "com.sportybet.android.auth.SportyAccountManagerImpl", f = "SportyAccountManagerImpl.kt", l = {165, 171, 172}, m = "updateLastAccount", v = 2)
    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class C14531 extends x1b {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C14531(v1b<? super C14531> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SportyAccountManagerImpl.this.updateLastAccount(null, null, this);
        }
    }

    public SportyAccountManagerImpl(ga gaVar, m2l m2lVar, Set<ejt> set, str<iyz> strVar, AccountManager accountManager, Context context, psm psmVar, bnh0 bnh0Var) {
        gaVar.getClass();
        m2lVar.getClass();
        set.getClass();
        strVar.getClass();
        accountManager.getClass();
        context.getClass();
        psmVar.getClass();
        bnh0Var.getClass();
        this.preferenceDataStore = gaVar;
        this.globalPreferenceDataStore = m2lVar;
        this.accountCleanables = set;
        this.patronRepository = strVar;
        this.androidAccountManager = accountManager;
        this.applicationContext = context;
        this.countryManager = psmVar;
        this.urlCreator = bnh0Var;
        this.accountHolderFlow = xwd0.a(new t8(0));
        this.accountInfoFlow = xwd0.a(null);
        this.accountFlow = xwd0.a(null);
        this.accountType = hwr.b(new ks20(this, 1));
        this.cachedSelfExclusionType = "";
        this.cachedUserCertStatus = 360;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String accountType_delegate$lambda$0(SportyAccountManagerImpl sportyAccountManagerImpl) {
        return sn5.b(sportyAccountManagerImpl.applicationContext, R.string.account_manager_account_type, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String addZeroPrefix(String str) {
        return (!this.countryManager.E() || c.u(str, "0", false) || str.length() >= 18) ? str : "0".concat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 clear$lambda$0(t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, null, null, null, null, null, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getAccountType() {
        return (String) this.accountType.getValue();
    }

    @fae
    public static /* synthetic */ void getDocumentAuditStatus$annotations() {
    }

    @fae
    public static /* synthetic */ void getSelfExclusionType$annotations() {
    }

    @fae
    public static /* synthetic */ void getSelfExclusionUTCTimeStamp$annotations() {
    }

    @fae
    public static /* synthetic */ void getUserCertStatus$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$0(SportyAccountManagerImpl sportyAccountManagerImpl, Account[] accountArr) {
        Account value;
        ztw<Account> accountFlow = sportyAccountManagerImpl.getAccountFlow();
        do {
            value = accountFlow.getValue();
            accountArr.getClass();
        } while (!accountFlow.g(value, accountArr.length == 0 ? null : accountArr[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$1(SportyAccountManagerImpl sportyAccountManagerImpl, Account[] accountArr) {
        Account value;
        Account account;
        ztw<Account> accountFlow = sportyAccountManagerImpl.getAccountFlow();
        do {
            value = accountFlow.getValue();
            accountArr.getClass();
            int length = accountArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    account = null;
                    break;
                }
                account = accountArr[i];
                if (Intrinsics.g(account.type, sportyAccountManagerImpl.getAccountType())) {
                    break;
                } else {
                    i++;
                }
            }
        } while (!accountFlow.g(value, account));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 setLanguageCode$lambda$0(String str, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, null, null, null, null, str, 63);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 setLastAvatarUrl$lambda$0(String str, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, str, null, null, null, null, 123);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 setLastNickname$lambda$0(String str, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, null, str, null, null, null, 119);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 setLoginType$lambda$0(String str, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, null, null, str, null, null, 111);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 setUserId$lambda$0(String str, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, null, null, null, str, null, 95);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateAccount(Function1<? super t8, t8> function1, v1b<? super Unit> v1bVar) {
        return getAccountHolderFlow().emit(function1.invoke(getAccountHolderFlow().getValue()), v1bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 updateAvatarAndNickname$lambda$0(String str, String str2, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, null, null, str, str2, null, null, null, 115);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t8 updateLastAccount$lambda$0(String str, String str2, t8 t8Var) {
        t8Var.getClass();
        return t8.a(t8Var, str, str2, null, null, null, null, null, 124);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x005b->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        if (updateAccount(r7, r0) == r1) goto L24;
     */
    @Override // defpackage.mgb0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object clear(defpackage.v1b<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.sportybet.android.auth.SportyAccountManagerImpl.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.sportybet.android.auth.SportyAccountManagerImpl$clear$1 r0 = (com.sportybet.android.auth.SportyAccountManagerImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.sportybet.android.auth.SportyAccountManagerImpl$clear$1 r0 = new com.sportybet.android.auth.SportyAccountManagerImpl$clear$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            y5b r1 = defpackage.y5b.a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L41
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L37
            java.lang.Object r2 = r0.L$3
            ejt r2 = (defpackage.ejt) r2
            java.lang.Object r2 = r0.L$1
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.L$0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            defpackage.uj50.b(r7)
            goto L5b
        L37:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r5
        L3d:
            defpackage.uj50.b(r7)
            goto L52
        L41:
            defpackage.uj50.b(r7)
            pgb0 r7 = new pgb0
            r7.<init>()
            r0.label = r4
            java.lang.Object r7 = r6.updateAccount(r7, r0)
            if (r7 != r1) goto L52
            goto L77
        L52:
            java.util.Set<ejt> r7 = r6.accountCleanables
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r2 = r7
        L5b:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L78
            java.lang.Object r7 = r2.next()
            ejt r7 = (defpackage.ejt) r7
            r0.L$0 = r5
            r0.L$1 = r2
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r3
            java.lang.Object r7 = r7.clearUserData(r0)
            if (r7 != r1) goto L5b
        L77:
            return r1
        L78:
            r0 = 0
            r6.cachedSelfExclusionUTCTimeStamp = r0
            java.lang.String r7 = ""
            r6.cachedSelfExclusionType = r7
            r7 = 360(0x168, float:5.04E-43)
            r6.cachedUserCertStatus = r7
            r7 = 0
            r6.cachedDocumentAuditStatus = r7
            ztw r6 = r6.getAccountFlow()
            r6.setValue(r5)
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sportybet.android.auth.SportyAccountManagerImpl.clear(v1b):java.lang.Object");
    }

    @Override // defpackage.mgb0
    @fae
    public /* bridge */ void clearSync() {
        super.clearSync();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object ensureLogin(Activity activity, v1b<? super Unit> v1bVar) {
        C14331 c14331;
        if (v1bVar instanceof C14331) {
            c14331 = (C14331) v1bVar;
            int i = c14331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14331.label = i - Integer.MIN_VALUE;
            } else {
                c14331 = new C14331(v1bVar);
            }
        } else {
            c14331 = new C14331(v1bVar);
        }
        Object obj = c14331.result;
        y5b y5bVar = y5b.a;
        int i2 = c14331.label;
        if (i2 == 0) {
            uj50.b(obj);
            if (getAccountFlow().getValue() != null) {
                return Unit.a;
            }
            c14331.L$0 = activity;
            c14331.label = 1;
            final bc6 bc6Var = new bc6(1, yzo.b(c14331));
            bc6Var.q();
            this.androidAccountManager.addAccount(getAccountType(), null, null, vj5.a(new Pair("is_signup", Boolean.FALSE)), activity, new AccountManagerCallback() { // from class: com.sportybet.android.auth.SportyAccountManagerImpl$ensureLogin$2$1
                @Override // android.accounts.AccountManagerCallback
                public final void run(AccountManagerFuture<Bundle> accountManagerFuture) {
                    try {
                        Bundle result = accountManagerFuture.getResult();
                        String string = result.getString("authAccount");
                        String strAddZeroPrefix = string != null ? this.this$0.addZeroPrefix(string) : null;
                        String string2 = result.getString("accountType");
                        if (strAddZeroPrefix != null && strAddZeroPrefix.length() != 0 && string2 != null && string2.length() != 0) {
                            this.this$0.getAccountFlow().setValue(new Account(strAddZeroPrefix, string2));
                            bc6Var.s(Unit.a, new gaj<Throwable, Unit, CoroutineContext, Unit>() { // from class: com.sportybet.android.auth.SportyAccountManagerImpl$ensureLogin$2$1.1
                                @Override // defpackage.gaj
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Unit unit, CoroutineContext coroutineContext) {
                                    invoke2(th, unit, coroutineContext);
                                    return Unit.a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th, Unit unit, CoroutineContext coroutineContext) {
                                    th.getClass();
                                    unit.getClass();
                                    coroutineContext.getClass();
                                }
                            });
                        }
                    } catch (OperationCanceledException unused) {
                        bc6Var.s(Unit.a, new gaj<Throwable, Unit, CoroutineContext, Unit>() { // from class: com.sportybet.android.auth.SportyAccountManagerImpl$ensureLogin$2$1.3
                            @Override // defpackage.gaj
                            public /* bridge */ /* synthetic */ Unit invoke(Throwable th, Unit unit, CoroutineContext coroutineContext) {
                                invoke2(th, unit, coroutineContext);
                                return Unit.a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable th, Unit unit, CoroutineContext coroutineContext) {
                                th.getClass();
                                unit.getClass();
                                coroutineContext.getClass();
                            }
                        });
                    } catch (Exception e) {
                        zb6<Unit> zb6Var = bc6Var;
                        zi50.a aVar = zi50.b;
                        zb6Var.resumeWith(new zi50.b(e));
                    }
                }
            }, null);
            if (bc6Var.o() == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    @Override // defpackage.mgb0
    public Object getDocumentAuditStatus(v1b<? super Integer> v1bVar) {
        ga gaVar = this.preferenceDataStore;
        return gaVar.k.a(gaVar, ga.s[10]).e(v1bVar, new Integer(0));
    }

    @Override // defpackage.mgb0
    public lyh<Integer> getDocumentAuditStatusFlow() {
        ga gaVar = this.preferenceDataStore;
        return gaVar.k.a(gaVar, ga.s[10]).d(0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object getKycHintExtra(v1b<? super KycHintExtra> v1bVar) {
        C14341 c14341;
        String str;
        if (v1bVar instanceof C14341) {
            c14341 = (C14341) v1bVar;
            int i = c14341.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14341.label = i - Integer.MIN_VALUE;
            } else {
                c14341 = new C14341(v1bVar);
            }
        } else {
            c14341 = new C14341(v1bVar);
        }
        Object objF = c14341.result;
        y5b y5bVar = y5b.a;
        int i2 = c14341.label;
        if (i2 == 0) {
            uj50.b(objF);
            wm20<String> wm20VarC = this.preferenceDataStore.c();
            c14341.label = 1;
            objF = wm20VarC.f(c14341);
            if (objF != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objF);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) c14341.L$0;
            uj50.b(objF);
        }
        return new KycHintExtra(str, (String) objF);
        String str2 = (String) objF;
        wm20<String> wm20VarB = this.preferenceDataStore.b();
        c14341.L$0 = str2;
        c14341.label = 2;
        Object objF2 = wm20VarB.f(c14341);
        if (objF2 != y5bVar) {
            objF = objF2;
            str = str2;
            return new KycHintExtra(str, (String) objF);
        }
        return y5bVar;
    }

    @Override // defpackage.mgb0
    public lyh<KycHintExtra> getKycHintExtraFlow() {
        return new n1i(this.preferenceDataStore.c().c(), this.preferenceDataStore.b().c(), new C14351(null));
    }

    @Override // defpackage.mgb0
    public String getLanguageCode(String str) {
        String str2 = getAccountHolderFlow().getValue().g;
        if (str2 != null) {
            if (StringsKt.U(str2)) {
                str2 = str;
            }
            if (str2 != null) {
                return str2;
            }
        }
        return str == null ? this.countryManager.A().getLanguageCode() : str;
    }

    @Override // defpackage.mgb0
    public lyh<String> getLanguageFlow() {
        return uzh.b(new SportyAccountManagerImpl$getLanguageFlow$$inlined$map$1(this.globalPreferenceDataStore.getStringByFlow("language_code", this.countryManager.A().getLanguageCode()), this));
    }

    @Override // defpackage.mgb0
    public Object getLastAccount(v1b<? super String> v1bVar) {
        return getAccountHolderFlow().getValue().a;
    }

    @Override // defpackage.mgb0
    public Object getLastAvatarUrl(v1b<? super String> v1bVar) {
        return getAccountHolderFlow().getValue().c;
    }

    @Override // defpackage.mgb0
    public Object getLastNickname(v1b<? super String> v1bVar) {
        return getAccountHolderFlow().getValue().d;
    }

    @Override // defpackage.mgb0
    public Object getLastUserId(v1b<? super String> v1bVar) {
        return getAccountHolderFlow().getValue().b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object getLoginTime(v1b<? super Long> v1bVar) {
        C14361 c14361;
        if (v1bVar instanceof C14361) {
            c14361 = (C14361) v1bVar;
            int i = c14361.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14361.label = i - Integer.MIN_VALUE;
            } else {
                c14361 = new C14361(v1bVar);
            }
        } else {
            c14361 = new C14361(v1bVar);
        }
        Object objF = c14361.result;
        y5b y5bVar = y5b.a;
        int i2 = c14361.label;
        if (i2 == 0) {
            uj50.b(objF);
            ga gaVar = this.preferenceDataStore;
            wm20 wm20VarA = gaVar.p.a(gaVar, ga.s[15]);
            c14361.label = 1;
            objF = wm20VarA.f(c14361);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        Long l = (Long) objF;
        return new Long(l != null ? l.longValue() : 0L);
    }

    @Override // defpackage.mgb0
    public Object getLoginType(v1b<? super String> v1bVar) {
        return getAccountHolderFlow().getValue().e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object getSelfExclusionType(v1b<? super String> v1bVar) {
        C14371 c14371;
        if (v1bVar instanceof C14371) {
            c14371 = (C14371) v1bVar;
            int i = c14371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14371.label = i - Integer.MIN_VALUE;
            } else {
                c14371 = new C14371(v1bVar);
            }
        } else {
            c14371 = new C14371(v1bVar);
        }
        Object objF = c14371.result;
        y5b y5bVar = y5b.a;
        int i2 = c14371.label;
        if (i2 == 0) {
            uj50.b(objF);
            ga gaVar = this.preferenceDataStore;
            wm20 wm20VarA = gaVar.o.a(gaVar, ga.s[14]);
            c14371.label = 1;
            objF = wm20VarA.f(c14371);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        String str = (String) objF;
        return str == null ? "" : str;
    }

    @Override // defpackage.mgb0
    public Object getSelfExclusionUTCTimeStamp(v1b<? super Long> v1bVar) {
        ga gaVar = this.preferenceDataStore;
        return gaVar.n.a(gaVar, ga.s[13]).e(v1bVar, new Long(0L));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object getShowBalance(v1b<? super Boolean> v1bVar) {
        C14381 c14381;
        ga gaVar;
        String str;
        if (v1bVar instanceof C14381) {
            c14381 = (C14381) v1bVar;
            int i = c14381.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14381.label = i - Integer.MIN_VALUE;
            } else {
                c14381 = new C14381(v1bVar);
            }
        } else {
            c14381 = new C14381(v1bVar);
        }
        Object obj = c14381.result;
        Object obj2 = y5b.a;
        int i2 = c14381.label;
        if (i2 == 0) {
            uj50.b(obj);
            gaVar = this.preferenceDataStore;
            eo20[] eo20VarArr = eo20.a;
            c14381.L$0 = gaVar;
            c14381.L$1 = "show_balance";
            c14381.label = 1;
            Object userId = getUserId(c14381);
            if (userId != obj2) {
                obj = userId;
                str = "show_balance";
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = (String) c14381.L$1;
        gaVar = (ga) c14381.L$0;
        uj50.b(obj);
        c14381.L$0 = null;
        c14381.L$1 = null;
        c14381.label = 2;
        Object obj3 = gaVar.a.getBoolean(str + "_" + obj, true, c14381);
        return obj3 == obj2 ? obj2 : obj3;
    }

    @Override // defpackage.mgb0
    public Object getUserCertStatus(v1b<? super Integer> v1bVar) {
        ga gaVar = this.preferenceDataStore;
        return gaVar.j.a(gaVar, ga.s[9]).e(v1bVar, new Integer(360));
    }

    @Override // defpackage.mgb0
    public lyh<Integer> getUserCertStatusFlow() {
        ga gaVar = this.preferenceDataStore;
        return gaVar.j.a(gaVar, ga.s[9]).d(360);
    }

    @Override // defpackage.mgb0
    public Object getUserId(v1b<? super String> v1bVar) {
        String str = getAccountHolderFlow().getValue().f;
        return str == null ? "" : str;
    }

    @Override // defpackage.mgb0
    public boolean hasPersonalPage() {
        String str;
        AccountInfo value;
        return (getAccountFlow().getValue() == null || (str = getAccountHolderFlow().getValue().d) == null || str.length() == 0 || (value = getAccountInfoFlow().getValue()) == null || !value.getNicknameVerified()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x012b  */
    /* JADX WARN: Code duplicated, block: B:35:0x014e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0172  */
    /* JADX WARN: Code duplicated, block: B:43:0x0198  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:55:0x021c  */
    /* JADX WARN: Code duplicated, block: B:58:0x022b  */
    /* JADX WARN: Code duplicated, block: B:62:0x0243  */
    /* JADX WARN: Code duplicated, block: B:66:0x0257  */
    /* JADX WARN: Code duplicated, block: B:70:0x026f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0280  */
    /* JADX WARN: Code duplicated, block: B:74:0x0291  */
    /* JADX WARN: Code duplicated, block: B:78:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02c0 A[LOOP:1: B:77:0x02af->B:81:0x02c0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x02c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x02c4 A[SYNTHETIC] */
    @Override // defpackage.mgb0
    public Object init(v1b<? super Unit> v1bVar) {
        C14391 c14391;
        String str;
        Object objF;
        String str2;
        String str3;
        Object objE;
        String str4;
        String str5;
        String str6;
        Object objF2;
        String str7;
        String str8;
        String str9;
        Object objE2;
        String str10;
        String str11;
        String str12;
        Object objF3;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        s9e0 s9e0Var;
        Object string;
        String str19;
        s9e0 s9e0Var2;
        t8 t8Var;
        ztw<t8> accountHolderFlow;
        SportyAccountManagerImpl sportyAccountManagerImpl;
        SportyAccountManagerImpl sportyAccountManagerImpl2;
        SportyAccountManagerImpl sportyAccountManagerImpl3;
        SportyAccountManagerImpl sportyAccountManagerImpl4;
        int i;
        AccountManager accountManager;
        ztw<Account> accountFlow;
        Account value;
        Account[] accounts;
        int length;
        int i2;
        Account account;
        if (v1bVar instanceof C14391) {
            c14391 = (C14391) v1bVar;
            int i3 = c14391.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c14391.label = i3 - Integer.MIN_VALUE;
            } else {
                c14391 = new C14391(v1bVar);
            }
        } else {
            c14391 = new C14391(v1bVar);
        }
        Object objF4 = c14391.result;
        y5b y5bVar = y5b.a;
        switch (c14391.label) {
            case 0:
                uj50.b(objF4);
                ga gaVar = this.preferenceDataStore;
                wm20 wm20VarA = gaVar.b.a(gaVar, ga.s[0]);
                c14391.label = 1;
                objF4 = wm20VarA.f(c14391);
                if (objF4 != y5bVar) {
                    str = (String) objF4;
                    ga gaVar2 = this.preferenceDataStore;
                    wm20 wm20VarA2 = gaVar2.c.a(gaVar2, ga.s[1]);
                    c14391.L$0 = str;
                    c14391.label = 2;
                    objF = wm20VarA2.f(c14391);
                    if (objF != y5bVar) {
                        str2 = str;
                        objF4 = objF;
                        str3 = (String) objF4;
                        ga gaVar3 = this.preferenceDataStore;
                        wm20 wm20VarA3 = gaVar3.d.a(gaVar3, ga.s[2]);
                        c14391.L$0 = str2;
                        c14391.L$1 = str3;
                        c14391.label = 3;
                        objE = wm20VarA3.e(c14391, "default_avatar.png");
                        if (objE != y5bVar) {
                            String str20 = str2;
                            str4 = str3;
                            objF4 = objE;
                            str5 = str20;
                            str6 = (String) objF4;
                            ga gaVar4 = this.preferenceDataStore;
                            wm20 wm20VarA4 = gaVar4.e.a(gaVar4, ga.s[3]);
                            c14391.L$0 = str5;
                            c14391.L$1 = str4;
                            c14391.L$2 = str6;
                            c14391.label = 4;
                            objF2 = wm20VarA4.f(c14391);
                            if (objF2 != y5bVar) {
                                String str21 = str4;
                                str7 = str6;
                                objF4 = objF2;
                                str8 = str21;
                                str9 = (String) objF4;
                                ga gaVar5 = this.preferenceDataStore;
                                wm20 wm20VarA5 = gaVar5.f.a(gaVar5, ga.s[4]);
                                c14391.L$0 = str5;
                                c14391.L$1 = str8;
                                c14391.L$2 = str7;
                                c14391.L$3 = str9;
                                c14391.label = 5;
                                objE2 = wm20VarA5.e(c14391, "");
                                if (objE2 != y5bVar) {
                                    String str22 = str7;
                                    str10 = str9;
                                    objF4 = objE2;
                                    str11 = str22;
                                    str12 = (String) objF4;
                                    ga gaVar6 = this.preferenceDataStore;
                                    wm20 wm20VarA6 = gaVar6.g.a(gaVar6, ga.s[5]);
                                    c14391.L$0 = str5;
                                    c14391.L$1 = str8;
                                    c14391.L$2 = str11;
                                    c14391.L$3 = str10;
                                    c14391.L$4 = str12;
                                    c14391.label = 6;
                                    objF3 = wm20VarA6.f(c14391);
                                    if (objF3 != y5bVar) {
                                        String str23 = str8;
                                        str13 = str10;
                                        str14 = str23;
                                        str15 = str5;
                                        str16 = str11;
                                        str17 = str12;
                                        objF4 = objF3;
                                        str18 = (String) objF4;
                                        s9e0Var = s9e0.a;
                                        m2l m2lVar = this.globalPreferenceDataStore;
                                        c14391.L$0 = str15;
                                        c14391.L$1 = str14;
                                        c14391.L$2 = str16;
                                        c14391.L$3 = str13;
                                        c14391.L$4 = str17;
                                        c14391.L$5 = str18;
                                        c14391.L$6 = s9e0Var;
                                        c14391.label = 7;
                                        string = m2lVar.a.getString("language_code", "", c14391);
                                        if (string != y5bVar) {
                                            str19 = str14;
                                            s9e0Var2 = s9e0Var;
                                            objF4 = string;
                                            String str24 = str18;
                                            String str25 = str17;
                                            String str26 = str13;
                                            String str27 = str16;
                                            String str28 = str15;
                                            s9e0Var2.getClass();
                                            t8Var = new t8(str28, str19, str27, str26, str25, str24, s9e0.a((String) objF4));
                                            accountHolderFlow = getAccountHolderFlow();
                                            c14391.L$0 = null;
                                            c14391.L$1 = null;
                                            c14391.L$2 = null;
                                            c14391.L$3 = null;
                                            c14391.L$4 = null;
                                            c14391.L$5 = null;
                                            c14391.L$6 = null;
                                            c14391.label = 8;
                                            if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                                                c14391.L$0 = null;
                                                c14391.L$1 = this;
                                                c14391.label = 9;
                                                objF4 = getSelfExclusionUTCTimeStamp(c14391);
                                                if (objF4 != y5bVar) {
                                                    sportyAccountManagerImpl = this;
                                                    sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                                                    c14391.L$0 = null;
                                                    c14391.L$1 = this;
                                                    c14391.label = 10;
                                                    objF4 = getSelfExclusionType(c14391);
                                                    if (objF4 != y5bVar) {
                                                        sportyAccountManagerImpl2 = this;
                                                        sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                                        c14391.L$0 = null;
                                                        c14391.L$1 = this;
                                                        c14391.label = 11;
                                                        objF4 = getUserCertStatus(c14391);
                                                        if (objF4 != y5bVar) {
                                                            sportyAccountManagerImpl3 = this;
                                                            sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                                            c14391.L$0 = null;
                                                            c14391.L$1 = this;
                                                            c14391.label = 12;
                                                            objF4 = getDocumentAuditStatus(c14391);
                                                            if (objF4 != y5bVar) {
                                                                sportyAccountManagerImpl4 = this;
                                                                sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                                                i = Build.VERSION.SDK_INT;
                                                                accountManager = this.androidAccountManager;
                                                                if (i >= 26) {
                                                                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                                        @Override // android.accounts.OnAccountsUpdateListener
                                                                        public final void onAccountsUpdated(Account[] accountArr) {
                                                                            SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                                        }
                                                                    }, null, false, new String[]{getAccountType()});
                                                                } else {
                                                                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                                        @Override // android.accounts.OnAccountsUpdateListener
                                                                        public final void onAccountsUpdated(Account[] accountArr) {
                                                                            SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                                        }
                                                                    }, null, false);
                                                                }
                                                                accountFlow = getAccountFlow();
                                                                do {
                                                                    value = accountFlow.getValue();
                                                                    accounts = this.androidAccountManager.getAccounts();
                                                                    accounts.getClass();
                                                                    length = accounts.length;
                                                                    i2 = 0;
                                                                    while (true) {
                                                                        if (i2 < length) {
                                                                            account = accounts[i2];
                                                                            if (!Intrinsics.g(account.type, getAccountType())) {
                                                                                i2++;
                                                                            }
                                                                        } else {
                                                                            account = null;
                                                                        }
                                                                    }
                                                                } while (!accountFlow.g(value, account));
                                                                return Unit.a;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 1:
                uj50.b(objF4);
                str = (String) objF4;
                ga gaVar7 = this.preferenceDataStore;
                wm20 wm20VarA7 = gaVar7.c.a(gaVar7, ga.s[1]);
                c14391.L$0 = str;
                c14391.label = 2;
                objF = wm20VarA7.f(c14391);
                if (objF != y5bVar) {
                    str2 = str;
                    objF4 = objF;
                    str3 = (String) objF4;
                    ga gaVar8 = this.preferenceDataStore;
                    wm20 wm20VarA8 = gaVar8.d.a(gaVar8, ga.s[2]);
                    c14391.L$0 = str2;
                    c14391.L$1 = str3;
                    c14391.label = 3;
                    objE = wm20VarA8.e(c14391, "default_avatar.png");
                    if (objE != y5bVar) {
                        String str29 = str2;
                        str4 = str3;
                        objF4 = objE;
                        str5 = str29;
                        str6 = (String) objF4;
                        ga gaVar9 = this.preferenceDataStore;
                        wm20 wm20VarA9 = gaVar9.e.a(gaVar9, ga.s[3]);
                        c14391.L$0 = str5;
                        c14391.L$1 = str4;
                        c14391.L$2 = str6;
                        c14391.label = 4;
                        objF2 = wm20VarA9.f(c14391);
                        if (objF2 != y5bVar) {
                            String str210 = str4;
                            str7 = str6;
                            objF4 = objF2;
                            str8 = str210;
                            str9 = (String) objF4;
                            ga gaVar10 = this.preferenceDataStore;
                            wm20 wm20VarA10 = gaVar10.f.a(gaVar10, ga.s[4]);
                            c14391.L$0 = str5;
                            c14391.L$1 = str8;
                            c14391.L$2 = str7;
                            c14391.L$3 = str9;
                            c14391.label = 5;
                            objE2 = wm20VarA10.e(c14391, "");
                            if (objE2 != y5bVar) {
                                String str211 = str7;
                                str10 = str9;
                                objF4 = objE2;
                                str11 = str211;
                                str12 = (String) objF4;
                                ga gaVar11 = this.preferenceDataStore;
                                wm20 wm20VarA11 = gaVar11.g.a(gaVar11, ga.s[5]);
                                c14391.L$0 = str5;
                                c14391.L$1 = str8;
                                c14391.L$2 = str11;
                                c14391.L$3 = str10;
                                c14391.L$4 = str12;
                                c14391.label = 6;
                                objF3 = wm20VarA11.f(c14391);
                                if (objF3 != y5bVar) {
                                    String str212 = str8;
                                    str13 = str10;
                                    str14 = str212;
                                    str15 = str5;
                                    str16 = str11;
                                    str17 = str12;
                                    objF4 = objF3;
                                    str18 = (String) objF4;
                                    s9e0Var = s9e0.a;
                                    m2l m2lVar2 = this.globalPreferenceDataStore;
                                    c14391.L$0 = str15;
                                    c14391.L$1 = str14;
                                    c14391.L$2 = str16;
                                    c14391.L$3 = str13;
                                    c14391.L$4 = str17;
                                    c14391.L$5 = str18;
                                    c14391.L$6 = s9e0Var;
                                    c14391.label = 7;
                                    string = m2lVar2.a.getString("language_code", "", c14391);
                                    if (string != y5bVar) {
                                        str19 = str14;
                                        s9e0Var2 = s9e0Var;
                                        objF4 = string;
                                        String str213 = str18;
                                        String str214 = str17;
                                        String str215 = str13;
                                        String str216 = str16;
                                        String str217 = str15;
                                        s9e0Var2.getClass();
                                        t8Var = new t8(str217, str19, str216, str215, str214, str213, s9e0.a((String) objF4));
                                        accountHolderFlow = getAccountHolderFlow();
                                        c14391.L$0 = null;
                                        c14391.L$1 = null;
                                        c14391.L$2 = null;
                                        c14391.L$3 = null;
                                        c14391.L$4 = null;
                                        c14391.L$5 = null;
                                        c14391.L$6 = null;
                                        c14391.label = 8;
                                        if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                                            c14391.L$0 = null;
                                            c14391.L$1 = this;
                                            c14391.label = 9;
                                            objF4 = getSelfExclusionUTCTimeStamp(c14391);
                                            if (objF4 != y5bVar) {
                                                sportyAccountManagerImpl = this;
                                                sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                                                c14391.L$0 = null;
                                                c14391.L$1 = this;
                                                c14391.label = 10;
                                                objF4 = getSelfExclusionType(c14391);
                                                if (objF4 != y5bVar) {
                                                    sportyAccountManagerImpl2 = this;
                                                    sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                                    c14391.L$0 = null;
                                                    c14391.L$1 = this;
                                                    c14391.label = 11;
                                                    objF4 = getUserCertStatus(c14391);
                                                    if (objF4 != y5bVar) {
                                                        sportyAccountManagerImpl3 = this;
                                                        sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                                        c14391.L$0 = null;
                                                        c14391.L$1 = this;
                                                        c14391.label = 12;
                                                        objF4 = getDocumentAuditStatus(c14391);
                                                        if (objF4 != y5bVar) {
                                                            sportyAccountManagerImpl4 = this;
                                                            sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                                            i = Build.VERSION.SDK_INT;
                                                            accountManager = this.androidAccountManager;
                                                            if (i >= 26) {
                                                                accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                                    @Override // android.accounts.OnAccountsUpdateListener
                                                                    public final void onAccountsUpdated(Account[] accountArr) {
                                                                        SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                                    }
                                                                }, null, false, new String[]{getAccountType()});
                                                            } else {
                                                                accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                                    @Override // android.accounts.OnAccountsUpdateListener
                                                                    public final void onAccountsUpdated(Account[] accountArr) {
                                                                        SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                                    }
                                                                }, null, false);
                                                            }
                                                            accountFlow = getAccountFlow();
                                                            do {
                                                                value = accountFlow.getValue();
                                                                accounts = this.androidAccountManager.getAccounts();
                                                                accounts.getClass();
                                                                length = accounts.length;
                                                                i2 = 0;
                                                                while (true) {
                                                                    if (i2 < length) {
                                                                        account = accounts[i2];
                                                                        if (!Intrinsics.g(account.type, getAccountType())) {
                                                                            i2++;
                                                                        }
                                                                    } else {
                                                                        account = null;
                                                                    }
                                                                }
                                                            } while (!accountFlow.g(value, account));
                                                            return Unit.a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 2:
                str2 = (String) c14391.L$0;
                uj50.b(objF4);
                str3 = (String) objF4;
                ga gaVar12 = this.preferenceDataStore;
                wm20 wm20VarA12 = gaVar12.d.a(gaVar12, ga.s[2]);
                c14391.L$0 = str2;
                c14391.L$1 = str3;
                c14391.label = 3;
                objE = wm20VarA12.e(c14391, "default_avatar.png");
                if (objE != y5bVar) {
                    String str218 = str2;
                    str4 = str3;
                    objF4 = objE;
                    str5 = str218;
                    str6 = (String) objF4;
                    ga gaVar13 = this.preferenceDataStore;
                    wm20 wm20VarA13 = gaVar13.e.a(gaVar13, ga.s[3]);
                    c14391.L$0 = str5;
                    c14391.L$1 = str4;
                    c14391.L$2 = str6;
                    c14391.label = 4;
                    objF2 = wm20VarA13.f(c14391);
                    if (objF2 != y5bVar) {
                        String str219 = str4;
                        str7 = str6;
                        objF4 = objF2;
                        str8 = str219;
                        str9 = (String) objF4;
                        ga gaVar14 = this.preferenceDataStore;
                        wm20 wm20VarA14 = gaVar14.f.a(gaVar14, ga.s[4]);
                        c14391.L$0 = str5;
                        c14391.L$1 = str8;
                        c14391.L$2 = str7;
                        c14391.L$3 = str9;
                        c14391.label = 5;
                        objE2 = wm20VarA14.e(c14391, "");
                        if (objE2 != y5bVar) {
                            String str2110 = str7;
                            str10 = str9;
                            objF4 = objE2;
                            str11 = str2110;
                            str12 = (String) objF4;
                            ga gaVar15 = this.preferenceDataStore;
                            wm20 wm20VarA15 = gaVar15.g.a(gaVar15, ga.s[5]);
                            c14391.L$0 = str5;
                            c14391.L$1 = str8;
                            c14391.L$2 = str11;
                            c14391.L$3 = str10;
                            c14391.L$4 = str12;
                            c14391.label = 6;
                            objF3 = wm20VarA15.f(c14391);
                            if (objF3 != y5bVar) {
                                String str2111 = str8;
                                str13 = str10;
                                str14 = str2111;
                                str15 = str5;
                                str16 = str11;
                                str17 = str12;
                                objF4 = objF3;
                                str18 = (String) objF4;
                                s9e0Var = s9e0.a;
                                m2l m2lVar3 = this.globalPreferenceDataStore;
                                c14391.L$0 = str15;
                                c14391.L$1 = str14;
                                c14391.L$2 = str16;
                                c14391.L$3 = str13;
                                c14391.L$4 = str17;
                                c14391.L$5 = str18;
                                c14391.L$6 = s9e0Var;
                                c14391.label = 7;
                                string = m2lVar3.a.getString("language_code", "", c14391);
                                if (string != y5bVar) {
                                    str19 = str14;
                                    s9e0Var2 = s9e0Var;
                                    objF4 = string;
                                    String str2112 = str18;
                                    String str2113 = str17;
                                    String str2114 = str13;
                                    String str2115 = str16;
                                    String str2116 = str15;
                                    s9e0Var2.getClass();
                                    t8Var = new t8(str2116, str19, str2115, str2114, str2113, str2112, s9e0.a((String) objF4));
                                    accountHolderFlow = getAccountHolderFlow();
                                    c14391.L$0 = null;
                                    c14391.L$1 = null;
                                    c14391.L$2 = null;
                                    c14391.L$3 = null;
                                    c14391.L$4 = null;
                                    c14391.L$5 = null;
                                    c14391.L$6 = null;
                                    c14391.label = 8;
                                    if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                                        c14391.L$0 = null;
                                        c14391.L$1 = this;
                                        c14391.label = 9;
                                        objF4 = getSelfExclusionUTCTimeStamp(c14391);
                                        if (objF4 != y5bVar) {
                                            sportyAccountManagerImpl = this;
                                            sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                                            c14391.L$0 = null;
                                            c14391.L$1 = this;
                                            c14391.label = 10;
                                            objF4 = getSelfExclusionType(c14391);
                                            if (objF4 != y5bVar) {
                                                sportyAccountManagerImpl2 = this;
                                                sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                                c14391.L$0 = null;
                                                c14391.L$1 = this;
                                                c14391.label = 11;
                                                objF4 = getUserCertStatus(c14391);
                                                if (objF4 != y5bVar) {
                                                    sportyAccountManagerImpl3 = this;
                                                    sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                                    c14391.L$0 = null;
                                                    c14391.L$1 = this;
                                                    c14391.label = 12;
                                                    objF4 = getDocumentAuditStatus(c14391);
                                                    if (objF4 != y5bVar) {
                                                        sportyAccountManagerImpl4 = this;
                                                        sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                                        i = Build.VERSION.SDK_INT;
                                                        accountManager = this.androidAccountManager;
                                                        if (i >= 26) {
                                                            accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                                @Override // android.accounts.OnAccountsUpdateListener
                                                                public final void onAccountsUpdated(Account[] accountArr) {
                                                                    SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                                }
                                                            }, null, false, new String[]{getAccountType()});
                                                        } else {
                                                            accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                                @Override // android.accounts.OnAccountsUpdateListener
                                                                public final void onAccountsUpdated(Account[] accountArr) {
                                                                    SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                                }
                                                            }, null, false);
                                                        }
                                                        accountFlow = getAccountFlow();
                                                        do {
                                                            value = accountFlow.getValue();
                                                            accounts = this.androidAccountManager.getAccounts();
                                                            accounts.getClass();
                                                            length = accounts.length;
                                                            i2 = 0;
                                                            while (true) {
                                                                if (i2 < length) {
                                                                    account = accounts[i2];
                                                                    if (!Intrinsics.g(account.type, getAccountType())) {
                                                                        i2++;
                                                                    }
                                                                } else {
                                                                    account = null;
                                                                }
                                                            }
                                                        } while (!accountFlow.g(value, account));
                                                        return Unit.a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 3:
                str4 = (String) c14391.L$1;
                str5 = (String) c14391.L$0;
                uj50.b(objF4);
                str6 = (String) objF4;
                ga gaVar16 = this.preferenceDataStore;
                wm20 wm20VarA16 = gaVar16.e.a(gaVar16, ga.s[3]);
                c14391.L$0 = str5;
                c14391.L$1 = str4;
                c14391.L$2 = str6;
                c14391.label = 4;
                objF2 = wm20VarA16.f(c14391);
                if (objF2 != y5bVar) {
                    String str2117 = str4;
                    str7 = str6;
                    objF4 = objF2;
                    str8 = str2117;
                    str9 = (String) objF4;
                    ga gaVar17 = this.preferenceDataStore;
                    wm20 wm20VarA17 = gaVar17.f.a(gaVar17, ga.s[4]);
                    c14391.L$0 = str5;
                    c14391.L$1 = str8;
                    c14391.L$2 = str7;
                    c14391.L$3 = str9;
                    c14391.label = 5;
                    objE2 = wm20VarA17.e(c14391, "");
                    if (objE2 != y5bVar) {
                        String str2118 = str7;
                        str10 = str9;
                        objF4 = objE2;
                        str11 = str2118;
                        str12 = (String) objF4;
                        ga gaVar18 = this.preferenceDataStore;
                        wm20 wm20VarA18 = gaVar18.g.a(gaVar18, ga.s[5]);
                        c14391.L$0 = str5;
                        c14391.L$1 = str8;
                        c14391.L$2 = str11;
                        c14391.L$3 = str10;
                        c14391.L$4 = str12;
                        c14391.label = 6;
                        objF3 = wm20VarA18.f(c14391);
                        if (objF3 != y5bVar) {
                            String str2119 = str8;
                            str13 = str10;
                            str14 = str2119;
                            str15 = str5;
                            str16 = str11;
                            str17 = str12;
                            objF4 = objF3;
                            str18 = (String) objF4;
                            s9e0Var = s9e0.a;
                            m2l m2lVar4 = this.globalPreferenceDataStore;
                            c14391.L$0 = str15;
                            c14391.L$1 = str14;
                            c14391.L$2 = str16;
                            c14391.L$3 = str13;
                            c14391.L$4 = str17;
                            c14391.L$5 = str18;
                            c14391.L$6 = s9e0Var;
                            c14391.label = 7;
                            string = m2lVar4.a.getString("language_code", "", c14391);
                            if (string != y5bVar) {
                                str19 = str14;
                                s9e0Var2 = s9e0Var;
                                objF4 = string;
                                String str21110 = str18;
                                String str21111 = str17;
                                String str21112 = str13;
                                String str21113 = str16;
                                String str21114 = str15;
                                s9e0Var2.getClass();
                                t8Var = new t8(str21114, str19, str21113, str21112, str21111, str21110, s9e0.a((String) objF4));
                                accountHolderFlow = getAccountHolderFlow();
                                c14391.L$0 = null;
                                c14391.L$1 = null;
                                c14391.L$2 = null;
                                c14391.L$3 = null;
                                c14391.L$4 = null;
                                c14391.L$5 = null;
                                c14391.L$6 = null;
                                c14391.label = 8;
                                if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                                    c14391.L$0 = null;
                                    c14391.L$1 = this;
                                    c14391.label = 9;
                                    objF4 = getSelfExclusionUTCTimeStamp(c14391);
                                    if (objF4 != y5bVar) {
                                        sportyAccountManagerImpl = this;
                                        sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                                        c14391.L$0 = null;
                                        c14391.L$1 = this;
                                        c14391.label = 10;
                                        objF4 = getSelfExclusionType(c14391);
                                        if (objF4 != y5bVar) {
                                            sportyAccountManagerImpl2 = this;
                                            sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                            c14391.L$0 = null;
                                            c14391.L$1 = this;
                                            c14391.label = 11;
                                            objF4 = getUserCertStatus(c14391);
                                            if (objF4 != y5bVar) {
                                                sportyAccountManagerImpl3 = this;
                                                sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                                c14391.L$0 = null;
                                                c14391.L$1 = this;
                                                c14391.label = 12;
                                                objF4 = getDocumentAuditStatus(c14391);
                                                if (objF4 != y5bVar) {
                                                    sportyAccountManagerImpl4 = this;
                                                    sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                                    i = Build.VERSION.SDK_INT;
                                                    accountManager = this.androidAccountManager;
                                                    if (i >= 26) {
                                                        accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                            @Override // android.accounts.OnAccountsUpdateListener
                                                            public final void onAccountsUpdated(Account[] accountArr) {
                                                                SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                            }
                                                        }, null, false, new String[]{getAccountType()});
                                                    } else {
                                                        accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                            @Override // android.accounts.OnAccountsUpdateListener
                                                            public final void onAccountsUpdated(Account[] accountArr) {
                                                                SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                            }
                                                        }, null, false);
                                                    }
                                                    accountFlow = getAccountFlow();
                                                    do {
                                                        value = accountFlow.getValue();
                                                        accounts = this.androidAccountManager.getAccounts();
                                                        accounts.getClass();
                                                        length = accounts.length;
                                                        i2 = 0;
                                                        while (true) {
                                                            if (i2 < length) {
                                                                account = accounts[i2];
                                                                if (!Intrinsics.g(account.type, getAccountType())) {
                                                                    i2++;
                                                                }
                                                            } else {
                                                                account = null;
                                                            }
                                                        }
                                                    } while (!accountFlow.g(value, account));
                                                    return Unit.a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 4:
                str7 = (String) c14391.L$2;
                str8 = (String) c14391.L$1;
                str5 = (String) c14391.L$0;
                uj50.b(objF4);
                str9 = (String) objF4;
                ga gaVar19 = this.preferenceDataStore;
                wm20 wm20VarA19 = gaVar19.f.a(gaVar19, ga.s[4]);
                c14391.L$0 = str5;
                c14391.L$1 = str8;
                c14391.L$2 = str7;
                c14391.L$3 = str9;
                c14391.label = 5;
                objE2 = wm20VarA19.e(c14391, "");
                if (objE2 != y5bVar) {
                    String str21115 = str7;
                    str10 = str9;
                    objF4 = objE2;
                    str11 = str21115;
                    str12 = (String) objF4;
                    ga gaVar110 = this.preferenceDataStore;
                    wm20 wm20VarA110 = gaVar110.g.a(gaVar110, ga.s[5]);
                    c14391.L$0 = str5;
                    c14391.L$1 = str8;
                    c14391.L$2 = str11;
                    c14391.L$3 = str10;
                    c14391.L$4 = str12;
                    c14391.label = 6;
                    objF3 = wm20VarA110.f(c14391);
                    if (objF3 != y5bVar) {
                        String str21116 = str8;
                        str13 = str10;
                        str14 = str21116;
                        str15 = str5;
                        str16 = str11;
                        str17 = str12;
                        objF4 = objF3;
                        str18 = (String) objF4;
                        s9e0Var = s9e0.a;
                        m2l m2lVar5 = this.globalPreferenceDataStore;
                        c14391.L$0 = str15;
                        c14391.L$1 = str14;
                        c14391.L$2 = str16;
                        c14391.L$3 = str13;
                        c14391.L$4 = str17;
                        c14391.L$5 = str18;
                        c14391.L$6 = s9e0Var;
                        c14391.label = 7;
                        string = m2lVar5.a.getString("language_code", "", c14391);
                        if (string != y5bVar) {
                            str19 = str14;
                            s9e0Var2 = s9e0Var;
                            objF4 = string;
                            String str21117 = str18;
                            String str21118 = str17;
                            String str21119 = str13;
                            String str211110 = str16;
                            String str211111 = str15;
                            s9e0Var2.getClass();
                            t8Var = new t8(str211111, str19, str211110, str21119, str21118, str21117, s9e0.a((String) objF4));
                            accountHolderFlow = getAccountHolderFlow();
                            c14391.L$0 = null;
                            c14391.L$1 = null;
                            c14391.L$2 = null;
                            c14391.L$3 = null;
                            c14391.L$4 = null;
                            c14391.L$5 = null;
                            c14391.L$6 = null;
                            c14391.label = 8;
                            if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                                c14391.L$0 = null;
                                c14391.L$1 = this;
                                c14391.label = 9;
                                objF4 = getSelfExclusionUTCTimeStamp(c14391);
                                if (objF4 != y5bVar) {
                                    sportyAccountManagerImpl = this;
                                    sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                                    c14391.L$0 = null;
                                    c14391.L$1 = this;
                                    c14391.label = 10;
                                    objF4 = getSelfExclusionType(c14391);
                                    if (objF4 != y5bVar) {
                                        sportyAccountManagerImpl2 = this;
                                        sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                        c14391.L$0 = null;
                                        c14391.L$1 = this;
                                        c14391.label = 11;
                                        objF4 = getUserCertStatus(c14391);
                                        if (objF4 != y5bVar) {
                                            sportyAccountManagerImpl3 = this;
                                            sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                            c14391.L$0 = null;
                                            c14391.L$1 = this;
                                            c14391.label = 12;
                                            objF4 = getDocumentAuditStatus(c14391);
                                            if (objF4 != y5bVar) {
                                                sportyAccountManagerImpl4 = this;
                                                sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                                i = Build.VERSION.SDK_INT;
                                                accountManager = this.androidAccountManager;
                                                if (i >= 26) {
                                                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                        @Override // android.accounts.OnAccountsUpdateListener
                                                        public final void onAccountsUpdated(Account[] accountArr) {
                                                            SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                        }
                                                    }, null, false, new String[]{getAccountType()});
                                                } else {
                                                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                        @Override // android.accounts.OnAccountsUpdateListener
                                                        public final void onAccountsUpdated(Account[] accountArr) {
                                                            SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                        }
                                                    }, null, false);
                                                }
                                                accountFlow = getAccountFlow();
                                                do {
                                                    value = accountFlow.getValue();
                                                    accounts = this.androidAccountManager.getAccounts();
                                                    accounts.getClass();
                                                    length = accounts.length;
                                                    i2 = 0;
                                                    while (true) {
                                                        if (i2 < length) {
                                                            account = accounts[i2];
                                                            if (!Intrinsics.g(account.type, getAccountType())) {
                                                                i2++;
                                                            }
                                                        } else {
                                                            account = null;
                                                        }
                                                    }
                                                } while (!accountFlow.g(value, account));
                                                return Unit.a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 5:
                str10 = (String) c14391.L$3;
                str11 = (String) c14391.L$2;
                str8 = (String) c14391.L$1;
                str5 = (String) c14391.L$0;
                uj50.b(objF4);
                str12 = (String) objF4;
                ga gaVar111 = this.preferenceDataStore;
                wm20 wm20VarA111 = gaVar111.g.a(gaVar111, ga.s[5]);
                c14391.L$0 = str5;
                c14391.L$1 = str8;
                c14391.L$2 = str11;
                c14391.L$3 = str10;
                c14391.L$4 = str12;
                c14391.label = 6;
                objF3 = wm20VarA111.f(c14391);
                if (objF3 != y5bVar) {
                    String str211112 = str8;
                    str13 = str10;
                    str14 = str211112;
                    str15 = str5;
                    str16 = str11;
                    str17 = str12;
                    objF4 = objF3;
                    str18 = (String) objF4;
                    s9e0Var = s9e0.a;
                    m2l m2lVar6 = this.globalPreferenceDataStore;
                    c14391.L$0 = str15;
                    c14391.L$1 = str14;
                    c14391.L$2 = str16;
                    c14391.L$3 = str13;
                    c14391.L$4 = str17;
                    c14391.L$5 = str18;
                    c14391.L$6 = s9e0Var;
                    c14391.label = 7;
                    string = m2lVar6.a.getString("language_code", "", c14391);
                    if (string != y5bVar) {
                        str19 = str14;
                        s9e0Var2 = s9e0Var;
                        objF4 = string;
                        String str211113 = str18;
                        String str211114 = str17;
                        String str211115 = str13;
                        String str211116 = str16;
                        String str211117 = str15;
                        s9e0Var2.getClass();
                        t8Var = new t8(str211117, str19, str211116, str211115, str211114, str211113, s9e0.a((String) objF4));
                        accountHolderFlow = getAccountHolderFlow();
                        c14391.L$0 = null;
                        c14391.L$1 = null;
                        c14391.L$2 = null;
                        c14391.L$3 = null;
                        c14391.L$4 = null;
                        c14391.L$5 = null;
                        c14391.L$6 = null;
                        c14391.label = 8;
                        if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                            c14391.L$0 = null;
                            c14391.L$1 = this;
                            c14391.label = 9;
                            objF4 = getSelfExclusionUTCTimeStamp(c14391);
                            if (objF4 != y5bVar) {
                                sportyAccountManagerImpl = this;
                                sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                                c14391.L$0 = null;
                                c14391.L$1 = this;
                                c14391.label = 10;
                                objF4 = getSelfExclusionType(c14391);
                                if (objF4 != y5bVar) {
                                    sportyAccountManagerImpl2 = this;
                                    sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                    c14391.L$0 = null;
                                    c14391.L$1 = this;
                                    c14391.label = 11;
                                    objF4 = getUserCertStatus(c14391);
                                    if (objF4 != y5bVar) {
                                        sportyAccountManagerImpl3 = this;
                                        sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                        c14391.L$0 = null;
                                        c14391.L$1 = this;
                                        c14391.label = 12;
                                        objF4 = getDocumentAuditStatus(c14391);
                                        if (objF4 != y5bVar) {
                                            sportyAccountManagerImpl4 = this;
                                            sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                            i = Build.VERSION.SDK_INT;
                                            accountManager = this.androidAccountManager;
                                            if (i >= 26) {
                                                accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                    @Override // android.accounts.OnAccountsUpdateListener
                                                    public final void onAccountsUpdated(Account[] accountArr) {
                                                        SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                    }
                                                }, null, false, new String[]{getAccountType()});
                                            } else {
                                                accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                    @Override // android.accounts.OnAccountsUpdateListener
                                                    public final void onAccountsUpdated(Account[] accountArr) {
                                                        SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                    }
                                                }, null, false);
                                            }
                                            accountFlow = getAccountFlow();
                                            do {
                                                value = accountFlow.getValue();
                                                accounts = this.androidAccountManager.getAccounts();
                                                accounts.getClass();
                                                length = accounts.length;
                                                i2 = 0;
                                                while (true) {
                                                    if (i2 < length) {
                                                        account = accounts[i2];
                                                        if (!Intrinsics.g(account.type, getAccountType())) {
                                                            i2++;
                                                        }
                                                    } else {
                                                        account = null;
                                                    }
                                                }
                                            } while (!accountFlow.g(value, account));
                                            return Unit.a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 6:
                String str30 = (String) c14391.L$4;
                String str31 = (String) c14391.L$3;
                String str32 = (String) c14391.L$2;
                String str33 = (String) c14391.L$1;
                String str34 = (String) c14391.L$0;
                uj50.b(objF4);
                str15 = str34;
                str16 = str32;
                str17 = str30;
                str14 = str33;
                str13 = str31;
                str18 = (String) objF4;
                s9e0Var = s9e0.a;
                m2l m2lVar7 = this.globalPreferenceDataStore;
                c14391.L$0 = str15;
                c14391.L$1 = str14;
                c14391.L$2 = str16;
                c14391.L$3 = str13;
                c14391.L$4 = str17;
                c14391.L$5 = str18;
                c14391.L$6 = s9e0Var;
                c14391.label = 7;
                string = m2lVar7.a.getString("language_code", "", c14391);
                if (string != y5bVar) {
                    str19 = str14;
                    s9e0Var2 = s9e0Var;
                    objF4 = string;
                    String str211118 = str18;
                    String str211119 = str17;
                    String str2111110 = str13;
                    String str2111111 = str16;
                    String str2111112 = str15;
                    s9e0Var2.getClass();
                    t8Var = new t8(str2111112, str19, str2111111, str2111110, str211119, str211118, s9e0.a((String) objF4));
                    accountHolderFlow = getAccountHolderFlow();
                    c14391.L$0 = null;
                    c14391.L$1 = null;
                    c14391.L$2 = null;
                    c14391.L$3 = null;
                    c14391.L$4 = null;
                    c14391.L$5 = null;
                    c14391.L$6 = null;
                    c14391.label = 8;
                    if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                        c14391.L$0 = null;
                        c14391.L$1 = this;
                        c14391.label = 9;
                        objF4 = getSelfExclusionUTCTimeStamp(c14391);
                        if (objF4 != y5bVar) {
                            sportyAccountManagerImpl = this;
                            sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                            c14391.L$0 = null;
                            c14391.L$1 = this;
                            c14391.label = 10;
                            objF4 = getSelfExclusionType(c14391);
                            if (objF4 != y5bVar) {
                                sportyAccountManagerImpl2 = this;
                                sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                                c14391.L$0 = null;
                                c14391.L$1 = this;
                                c14391.label = 11;
                                objF4 = getUserCertStatus(c14391);
                                if (objF4 != y5bVar) {
                                    sportyAccountManagerImpl3 = this;
                                    sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                    c14391.L$0 = null;
                                    c14391.L$1 = this;
                                    c14391.label = 12;
                                    objF4 = getDocumentAuditStatus(c14391);
                                    if (objF4 != y5bVar) {
                                        sportyAccountManagerImpl4 = this;
                                        sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                        i = Build.VERSION.SDK_INT;
                                        accountManager = this.androidAccountManager;
                                        if (i >= 26) {
                                            accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                                @Override // android.accounts.OnAccountsUpdateListener
                                                public final void onAccountsUpdated(Account[] accountArr) {
                                                    SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                                }
                                            }, null, false, new String[]{getAccountType()});
                                        } else {
                                            accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                                @Override // android.accounts.OnAccountsUpdateListener
                                                public final void onAccountsUpdated(Account[] accountArr) {
                                                    SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                                }
                                            }, null, false);
                                        }
                                        accountFlow = getAccountFlow();
                                        do {
                                            value = accountFlow.getValue();
                                            accounts = this.androidAccountManager.getAccounts();
                                            accounts.getClass();
                                            length = accounts.length;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 < length) {
                                                    account = accounts[i2];
                                                    if (!Intrinsics.g(account.type, getAccountType())) {
                                                        i2++;
                                                    }
                                                } else {
                                                    account = null;
                                                }
                                            }
                                        } while (!accountFlow.g(value, account));
                                        return Unit.a;
                                    }
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 7:
                s9e0Var2 = (s9e0) c14391.L$6;
                str18 = (String) c14391.L$5;
                str17 = (String) c14391.L$4;
                str13 = (String) c14391.L$3;
                str16 = (String) c14391.L$2;
                String str35 = (String) c14391.L$1;
                str15 = (String) c14391.L$0;
                uj50.b(objF4);
                str19 = str35;
                String str2111113 = str18;
                String str2111114 = str17;
                String str2111115 = str13;
                String str2111116 = str16;
                String str2111117 = str15;
                s9e0Var2.getClass();
                t8Var = new t8(str2111117, str19, str2111116, str2111115, str2111114, str2111113, s9e0.a((String) objF4));
                accountHolderFlow = getAccountHolderFlow();
                c14391.L$0 = null;
                c14391.L$1 = null;
                c14391.L$2 = null;
                c14391.L$3 = null;
                c14391.L$4 = null;
                c14391.L$5 = null;
                c14391.L$6 = null;
                c14391.label = 8;
                if (accountHolderFlow.emit(t8Var, c14391) != y5bVar) {
                    c14391.L$0 = null;
                    c14391.L$1 = this;
                    c14391.label = 9;
                    objF4 = getSelfExclusionUTCTimeStamp(c14391);
                    if (objF4 != y5bVar) {
                        sportyAccountManagerImpl = this;
                        sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                        c14391.L$0 = null;
                        c14391.L$1 = this;
                        c14391.label = 10;
                        objF4 = getSelfExclusionType(c14391);
                        if (objF4 != y5bVar) {
                            sportyAccountManagerImpl2 = this;
                            sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                            c14391.L$0 = null;
                            c14391.L$1 = this;
                            c14391.label = 11;
                            objF4 = getUserCertStatus(c14391);
                            if (objF4 != y5bVar) {
                                sportyAccountManagerImpl3 = this;
                                sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                                c14391.L$0 = null;
                                c14391.L$1 = this;
                                c14391.label = 12;
                                objF4 = getDocumentAuditStatus(c14391);
                                if (objF4 != y5bVar) {
                                    sportyAccountManagerImpl4 = this;
                                    sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                    i = Build.VERSION.SDK_INT;
                                    accountManager = this.androidAccountManager;
                                    if (i >= 26) {
                                        accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                            @Override // android.accounts.OnAccountsUpdateListener
                                            public final void onAccountsUpdated(Account[] accountArr) {
                                                SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                            }
                                        }, null, false, new String[]{getAccountType()});
                                    } else {
                                        accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                            @Override // android.accounts.OnAccountsUpdateListener
                                            public final void onAccountsUpdated(Account[] accountArr) {
                                                SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                            }
                                        }, null, false);
                                    }
                                    accountFlow = getAccountFlow();
                                    do {
                                        value = accountFlow.getValue();
                                        accounts = this.androidAccountManager.getAccounts();
                                        accounts.getClass();
                                        length = accounts.length;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 < length) {
                                                account = accounts[i2];
                                                if (!Intrinsics.g(account.type, getAccountType())) {
                                                    i2++;
                                                }
                                            } else {
                                                account = null;
                                            }
                                        }
                                    } while (!accountFlow.g(value, account));
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                return y5bVar;
            case 8:
                uj50.b(objF4);
                c14391.L$0 = null;
                c14391.L$1 = this;
                c14391.label = 9;
                objF4 = getSelfExclusionUTCTimeStamp(c14391);
                if (objF4 != y5bVar) {
                    sportyAccountManagerImpl = this;
                    sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                    c14391.L$0 = null;
                    c14391.L$1 = this;
                    c14391.label = 10;
                    objF4 = getSelfExclusionType(c14391);
                    if (objF4 != y5bVar) {
                        sportyAccountManagerImpl2 = this;
                        sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                        c14391.L$0 = null;
                        c14391.L$1 = this;
                        c14391.label = 11;
                        objF4 = getUserCertStatus(c14391);
                        if (objF4 != y5bVar) {
                            sportyAccountManagerImpl3 = this;
                            sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                            c14391.L$0 = null;
                            c14391.L$1 = this;
                            c14391.label = 12;
                            objF4 = getDocumentAuditStatus(c14391);
                            if (objF4 != y5bVar) {
                                sportyAccountManagerImpl4 = this;
                                sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                                i = Build.VERSION.SDK_INT;
                                accountManager = this.androidAccountManager;
                                if (i >= 26) {
                                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                        @Override // android.accounts.OnAccountsUpdateListener
                                        public final void onAccountsUpdated(Account[] accountArr) {
                                            SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                        }
                                    }, null, false, new String[]{getAccountType()});
                                } else {
                                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                        @Override // android.accounts.OnAccountsUpdateListener
                                        public final void onAccountsUpdated(Account[] accountArr) {
                                            SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                        }
                                    }, null, false);
                                }
                                accountFlow = getAccountFlow();
                                do {
                                    value = accountFlow.getValue();
                                    accounts = this.androidAccountManager.getAccounts();
                                    accounts.getClass();
                                    length = accounts.length;
                                    i2 = 0;
                                    while (true) {
                                        if (i2 < length) {
                                            account = accounts[i2];
                                            if (!Intrinsics.g(account.type, getAccountType())) {
                                                i2++;
                                            }
                                        } else {
                                            account = null;
                                        }
                                    }
                                } while (!accountFlow.g(value, account));
                                return Unit.a;
                            }
                        }
                    }
                }
                return y5bVar;
            case 9:
                sportyAccountManagerImpl = (SportyAccountManagerImpl) c14391.L$1;
                uj50.b(objF4);
                sportyAccountManagerImpl.cachedSelfExclusionUTCTimeStamp = ((Number) objF4).longValue();
                c14391.L$0 = null;
                c14391.L$1 = this;
                c14391.label = 10;
                objF4 = getSelfExclusionType(c14391);
                if (objF4 != y5bVar) {
                    sportyAccountManagerImpl2 = this;
                    sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                    c14391.L$0 = null;
                    c14391.L$1 = this;
                    c14391.label = 11;
                    objF4 = getUserCertStatus(c14391);
                    if (objF4 != y5bVar) {
                        sportyAccountManagerImpl3 = this;
                        sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                        c14391.L$0 = null;
                        c14391.L$1 = this;
                        c14391.label = 12;
                        objF4 = getDocumentAuditStatus(c14391);
                        if (objF4 != y5bVar) {
                            sportyAccountManagerImpl4 = this;
                            sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                            i = Build.VERSION.SDK_INT;
                            accountManager = this.androidAccountManager;
                            if (i >= 26) {
                                accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                    @Override // android.accounts.OnAccountsUpdateListener
                                    public final void onAccountsUpdated(Account[] accountArr) {
                                        SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                    }
                                }, null, false, new String[]{getAccountType()});
                            } else {
                                accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                    @Override // android.accounts.OnAccountsUpdateListener
                                    public final void onAccountsUpdated(Account[] accountArr) {
                                        SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                    }
                                }, null, false);
                            }
                            accountFlow = getAccountFlow();
                            do {
                                value = accountFlow.getValue();
                                accounts = this.androidAccountManager.getAccounts();
                                accounts.getClass();
                                length = accounts.length;
                                i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        account = accounts[i2];
                                        if (!Intrinsics.g(account.type, getAccountType())) {
                                            i2++;
                                        }
                                    } else {
                                        account = null;
                                    }
                                }
                            } while (!accountFlow.g(value, account));
                            return Unit.a;
                        }
                    }
                }
                return y5bVar;
            case 10:
                sportyAccountManagerImpl2 = (SportyAccountManagerImpl) c14391.L$1;
                uj50.b(objF4);
                sportyAccountManagerImpl2.cachedSelfExclusionType = (String) objF4;
                c14391.L$0 = null;
                c14391.L$1 = this;
                c14391.label = 11;
                objF4 = getUserCertStatus(c14391);
                if (objF4 != y5bVar) {
                    sportyAccountManagerImpl3 = this;
                    sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                    c14391.L$0 = null;
                    c14391.L$1 = this;
                    c14391.label = 12;
                    objF4 = getDocumentAuditStatus(c14391);
                    if (objF4 != y5bVar) {
                        sportyAccountManagerImpl4 = this;
                        sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                        i = Build.VERSION.SDK_INT;
                        accountManager = this.androidAccountManager;
                        if (i >= 26) {
                            accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                                @Override // android.accounts.OnAccountsUpdateListener
                                public final void onAccountsUpdated(Account[] accountArr) {
                                    SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                                }
                            }, null, false, new String[]{getAccountType()});
                        } else {
                            accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                                @Override // android.accounts.OnAccountsUpdateListener
                                public final void onAccountsUpdated(Account[] accountArr) {
                                    SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                                }
                            }, null, false);
                        }
                        accountFlow = getAccountFlow();
                        do {
                            value = accountFlow.getValue();
                            accounts = this.androidAccountManager.getAccounts();
                            accounts.getClass();
                            length = accounts.length;
                            i2 = 0;
                            while (true) {
                                if (i2 < length) {
                                    account = accounts[i2];
                                    if (!Intrinsics.g(account.type, getAccountType())) {
                                        i2++;
                                    }
                                } else {
                                    account = null;
                                }
                            }
                        } while (!accountFlow.g(value, account));
                        return Unit.a;
                    }
                }
                return y5bVar;
            case 11:
                sportyAccountManagerImpl3 = (SportyAccountManagerImpl) c14391.L$1;
                uj50.b(objF4);
                sportyAccountManagerImpl3.cachedUserCertStatus = ((Number) objF4).intValue();
                c14391.L$0 = null;
                c14391.L$1 = this;
                c14391.label = 12;
                objF4 = getDocumentAuditStatus(c14391);
                if (objF4 != y5bVar) {
                    sportyAccountManagerImpl4 = this;
                    sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                    i = Build.VERSION.SDK_INT;
                    accountManager = this.androidAccountManager;
                    if (i >= 26) {
                        accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                            @Override // android.accounts.OnAccountsUpdateListener
                            public final void onAccountsUpdated(Account[] accountArr) {
                                SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                            }
                        }, null, false, new String[]{getAccountType()});
                    } else {
                        accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                            @Override // android.accounts.OnAccountsUpdateListener
                            public final void onAccountsUpdated(Account[] accountArr) {
                                SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                            }
                        }, null, false);
                    }
                    accountFlow = getAccountFlow();
                    do {
                        value = accountFlow.getValue();
                        accounts = this.androidAccountManager.getAccounts();
                        accounts.getClass();
                        length = accounts.length;
                        i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                account = accounts[i2];
                                if (!Intrinsics.g(account.type, getAccountType())) {
                                    i2++;
                                }
                            } else {
                                account = null;
                            }
                        }
                    } while (!accountFlow.g(value, account));
                    return Unit.a;
                }
                return y5bVar;
            case 12:
                sportyAccountManagerImpl4 = (SportyAccountManagerImpl) c14391.L$1;
                uj50.b(objF4);
                sportyAccountManagerImpl4.cachedDocumentAuditStatus = ((Number) objF4).intValue();
                i = Build.VERSION.SDK_INT;
                accountManager = this.androidAccountManager;
                if (i >= 26) {
                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: rgb0
                        @Override // android.accounts.OnAccountsUpdateListener
                        public final void onAccountsUpdated(Account[] accountArr) {
                            SportyAccountManagerImpl.init$lambda$0(this.a, accountArr);
                        }
                    }, null, false, new String[]{getAccountType()});
                } else {
                    accountManager.addOnAccountsUpdatedListener(new OnAccountsUpdateListener() { // from class: sgb0
                        @Override // android.accounts.OnAccountsUpdateListener
                        public final void onAccountsUpdated(Account[] accountArr) {
                            SportyAccountManagerImpl.init$lambda$1(this.a, accountArr);
                        }
                    }, null, false);
                }
                accountFlow = getAccountFlow();
                do {
                    value = accountFlow.getValue();
                    accounts = this.androidAccountManager.getAccounts();
                    accounts.getClass();
                    length = accounts.length;
                    i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            account = accounts[i2];
                            if (!Intrinsics.g(account.type, getAccountType())) {
                                i2++;
                            }
                        } else {
                            account = null;
                        }
                    }
                } while (!accountFlow.g(value, account));
                return Unit.a;
            default:
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    @Override // defpackage.mgb0
    @fae
    public /* bridge */ void initSync() {
        super.initSync();
    }

    @Override // defpackage.mgb0
    public boolean isLogin() {
        return getAccountFlow().getValue() != null;
    }

    @Override // defpackage.mgb0
    public lyh<Boolean> isLoginFlow() {
        return new SportyAccountManagerImpl$isLoginFlow$$inlined$map$1(getAccountFlow());
    }

    @Override // defpackage.mgb0
    public lyh<Boolean> isShowingBalanceFlow() {
        return r0i.f(new SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$map$1(getAccountHolderFlow()), new SportyAccountManagerImpl$isShowingBalanceFlow$$inlined$flatMapLatest$1(null, this));
    }

    @Override // defpackage.mgb0
    public Object isTwoFactorAuthEnabled(v1b<? super Boolean> v1bVar) {
        ga gaVar = this.preferenceDataStore;
        return gaVar.q.a(gaVar, ga.s[16]).e(v1bVar, Boolean.FALSE);
    }

    @Override // defpackage.mgb0
    public AccountInfo lastAccountInfo() {
        return getAccountInfoFlow().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object reloadAccountInfo(v1b<? super Unit> v1bVar) {
        C14401 c14401;
        AccountInfo accountInfo;
        String nickname;
        AccountInfo accountInfo2;
        if (v1bVar instanceof C14401) {
            c14401 = (C14401) v1bVar;
            int i = c14401.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14401.label = i - Integer.MIN_VALUE;
            } else {
                c14401 = new C14401(v1bVar);
            }
        } else {
            c14401 = new C14401(v1bVar);
        }
        Object objC = c14401.result;
        Object obj = y5b.a;
        int i2 = c14401.label;
        if (i2 == 0) {
            uj50.b(objC);
            vl50 vl50VarF = bm50.f(this.patronRepository.get().a(pu0.c.a));
            c14401.label = 1;
            objC = s0i.c(vl50VarF, c14401);
            if (objC != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            uj50.b(objC);
        } else {
            if (i2 == 2) {
                AccountInfo accountInfo3 = (AccountInfo) c14401.L$0;
                uj50.b(objC);
                accountInfo = accountInfo3;
                nickname = accountInfo.getNickname();
                c14401.L$0 = accountInfo;
                c14401.label = 3;
                if (setLastNickname(nickname, c14401) != obj) {
                    accountInfo2 = accountInfo;
                }
                return obj;
            }
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            accountInfo2 = (AccountInfo) c14401.L$0;
            uj50.b(objC);
        }
        String strE = this.urlCreator.e(accountInfo2.getAvatar());
        oaa0 oaa0Var = oaa0.a;
        String nickname2 = accountInfo2.getNickname();
        oaa0Var.getClass();
        oaa0.a(nickname2, strE, true);
        return Unit.a;
        accountInfo = (AccountInfo) objC;
        if (accountInfo == null) {
            return Unit.a;
        }
        ztw<AccountInfo> accountInfoFlow = getAccountInfoFlow();
        while (!accountInfoFlow.g(accountInfoFlow.getValue(), accountInfo)) {
        }
        String avatar = accountInfo.getAvatar();
        c14401.L$0 = accountInfo;
        c14401.label = 2;
        if (setLastAvatarUrl(avatar, c14401) != obj) {
            nickname = accountInfo.getNickname();
            c14401.L$0 = accountInfo;
            c14401.label = 3;
            if (setLastNickname(nickname, c14401) != obj) {
                accountInfo2 = accountInfo;
                String strE2 = this.urlCreator.e(accountInfo2.getAvatar());
                oaa0 oaa0Var2 = oaa0.a;
                String nickname3 = accountInfo2.getNickname();
                oaa0Var2.getClass();
                oaa0.a(nickname3, strE2, true);
                return Unit.a;
            }
        }
        return obj;
    }

    @Override // defpackage.mgb0
    public void setAccountInfo(AccountInfo accountInfo) {
        getAccountInfoFlow().setValue(accountInfo);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setDocumentAuditStatus(int i, v1b<? super Unit> v1bVar) {
        C14411 c14411;
        if (v1bVar instanceof C14411) {
            c14411 = (C14411) v1bVar;
            int i2 = c14411.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14411.label = i2 - Integer.MIN_VALUE;
            } else {
                c14411 = new C14411(v1bVar);
            }
        } else {
            c14411 = new C14411(v1bVar);
        }
        Object obj = c14411.result;
        y5b y5bVar = y5b.a;
        int i3 = c14411.label;
        if (i3 == 0) {
            uj50.b(obj);
            ga gaVar = this.preferenceDataStore;
            wm20 wm20VarA = gaVar.k.a(gaVar, ga.s[10]);
            Integer num = new Integer(i);
            c14411.I$0 = i;
            c14411.label = 1;
            if (wm20VarA.g(c14411, num) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c14411.I$0;
            uj50.b(obj);
        }
        this.cachedDocumentAuditStatus = i;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setKycHintExtra(KycHintExtra kycHintExtra, v1b<? super Unit> v1bVar) {
        C14421 c14421;
        String rejectReason;
        if (v1bVar instanceof C14421) {
            c14421 = (C14421) v1bVar;
            int i = c14421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14421.label = i - Integer.MIN_VALUE;
            } else {
                c14421 = new C14421(v1bVar);
            }
        } else {
            c14421 = new C14421(v1bVar);
        }
        Object obj = c14421.result;
        y5b y5bVar = y5b.a;
        int i2 = c14421.label;
        if (i2 == 0) {
            uj50.b(obj);
            String rejectTitle = kycHintExtra.getRejectTitle();
            rejectReason = kycHintExtra.getRejectReason();
            ga gaVar = this.preferenceDataStore;
            if (rejectTitle == null) {
                wm20<String> wm20VarC = gaVar.c();
                c14421.L$0 = null;
                c14421.L$1 = null;
                c14421.L$2 = rejectReason;
                c14421.label = 1;
                if (wm20VarC.a(c14421) != y5bVar) {
                }
            } else {
                wm20<String> wm20VarC2 = gaVar.c();
                c14421.L$0 = null;
                c14421.L$1 = null;
                c14421.L$2 = rejectReason;
                c14421.label = 2;
                if (wm20VarC2.g(c14421, rejectTitle) != y5bVar) {
                }
            }
            return y5bVar;
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        }
        rejectReason = (String) c14421.L$2;
        uj50.b(obj);
        ga gaVar2 = this.preferenceDataStore;
        if (rejectReason == null) {
            wm20<String> wm20VarB = gaVar2.b();
            c14421.L$0 = null;
            c14421.L$1 = null;
            c14421.L$2 = null;
            c14421.label = 3;
            Object objA = wm20VarB.a(c14421);
            if (objA != y5bVar) {
                return objA;
            }
        } else {
            wm20<String> wm20VarB2 = gaVar2.b();
            c14421.L$0 = null;
            c14421.L$1 = null;
            c14421.L$2 = null;
            c14421.label = 4;
            Object objG = wm20VarB2.g(c14421, rejectReason);
            if (objG != y5bVar) {
                return objG;
            }
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setLanguageCode(String str, v1b<? super Unit> v1bVar) {
        C14431 c14431;
        if (v1bVar instanceof C14431) {
            c14431 = (C14431) v1bVar;
            int i = c14431.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14431.label = i - Integer.MIN_VALUE;
            } else {
                c14431 = new C14431(v1bVar);
            }
        } else {
            c14431 = new C14431(v1bVar);
        }
        Object obj = c14431.result;
        Object obj2 = y5b.a;
        int i2 = c14431.label;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(obj);
            Function1<? super t8, t8> sabVar = new sab(str, i3);
            c14431.L$0 = str;
            c14431.label = 1;
            if (updateAccount(sabVar, c14431) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        }
        str = (String) c14431.L$0;
        uj50.b(obj);
        m2l m2lVar = this.globalPreferenceDataStore;
        c14431.L$0 = null;
        c14431.label = 2;
        Object objPutString = m2lVar.a.putString("language_code", str, c14431);
        return objPutString == obj2 ? obj2 : objPutString;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setLastAvatarUrl(String str, v1b<? super Unit> v1bVar) {
        C14441 c14441;
        if (v1bVar instanceof C14441) {
            c14441 = (C14441) v1bVar;
            int i = c14441.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14441.label = i - Integer.MIN_VALUE;
            } else {
                c14441 = new C14441(v1bVar);
            }
        } else {
            c14441 = new C14441(v1bVar);
        }
        Object obj = c14441.result;
        Object obj2 = y5b.a;
        int i2 = c14441.label;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(obj);
            Function1<? super t8, t8> e97Var = new e97(str, i3);
            c14441.L$0 = str;
            c14441.label = 1;
            if (updateAccount(e97Var, c14441) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        }
        str = (String) c14441.L$0;
        uj50.b(obj);
        if (str == null) {
            return Unit.a;
        }
        ga gaVar = this.preferenceDataStore;
        wm20 wm20VarA = gaVar.d.a(gaVar, ga.s[2]);
        c14441.L$0 = null;
        c14441.label = 2;
        Object objG = wm20VarA.g(c14441, str);
        return objG == obj2 ? obj2 : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setLastNickname(String str, v1b<? super Unit> v1bVar) {
        C14451 c14451;
        if (v1bVar instanceof C14451) {
            c14451 = (C14451) v1bVar;
            int i = c14451.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14451.label = i - Integer.MIN_VALUE;
            } else {
                c14451 = new C14451(v1bVar);
            }
        } else {
            c14451 = new C14451(v1bVar);
        }
        Object obj = c14451.result;
        Object obj2 = y5b.a;
        int i2 = c14451.label;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(obj);
            Function1<? super t8, t8> i97Var = new i97(str, i3);
            c14451.L$0 = str;
            c14451.label = 1;
            if (updateAccount(i97Var, c14451) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        }
        str = (String) c14451.L$0;
        uj50.b(obj);
        if (str == null) {
            return Unit.a;
        }
        ga gaVar = this.preferenceDataStore;
        wm20 wm20VarA = gaVar.e.a(gaVar, ga.s[3]);
        c14451.L$0 = null;
        c14451.label = 2;
        Object objG = wm20VarA.g(c14451, str);
        return objG == obj2 ? obj2 : objG;
    }

    @Override // defpackage.mgb0
    public Object setLoginTime(long j, v1b<? super Unit> v1bVar) {
        ga gaVar = this.preferenceDataStore;
        return gaVar.p.a(gaVar, ga.s[15]).g(v1bVar, new Long(j));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setLoginType(String str, v1b<? super Unit> v1bVar) {
        C14461 c14461;
        if (v1bVar instanceof C14461) {
            c14461 = (C14461) v1bVar;
            int i = c14461.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14461.label = i - Integer.MIN_VALUE;
            } else {
                c14461 = new C14461(v1bVar);
            }
        } else {
            c14461 = new C14461(v1bVar);
        }
        Object obj = c14461.result;
        Object obj2 = y5b.a;
        int i2 = c14461.label;
        int i3 = 1;
        if (i2 == 0) {
            uj50.b(obj);
            Function1<? super t8, t8> tkkVar = new tkk(str, i3);
            c14461.L$0 = str;
            c14461.label = 1;
            if (updateAccount(tkkVar, c14461) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        }
        str = (String) c14461.L$0;
        uj50.b(obj);
        ga gaVar = this.preferenceDataStore;
        wm20 wm20VarA = gaVar.f.a(gaVar, ga.s[4]);
        c14461.L$0 = null;
        c14461.label = 2;
        Object objG = wm20VarA.g(c14461, str);
        return objG == obj2 ? obj2 : objG;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setSelfExclusionType(String str, v1b<? super Unit> v1bVar) {
        C14471 c14471;
        if (v1bVar instanceof C14471) {
            c14471 = (C14471) v1bVar;
            int i = c14471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14471.label = i - Integer.MIN_VALUE;
            } else {
                c14471 = new C14471(v1bVar);
            }
        } else {
            c14471 = new C14471(v1bVar);
        }
        Object obj = c14471.result;
        y5b y5bVar = y5b.a;
        int i2 = c14471.label;
        if (i2 == 0) {
            uj50.b(obj);
            ga gaVar = this.preferenceDataStore;
            wm20 wm20VarA = gaVar.o.a(gaVar, ga.s[14]);
            c14471.L$0 = str;
            c14471.label = 1;
            if (wm20VarA.g(c14471, str) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = (String) c14471.L$0;
            uj50.b(obj);
        }
        this.cachedSelfExclusionType = str;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setSelfExclusionUTCTimeStamp(long j, v1b<? super Unit> v1bVar) {
        C14481 c14481;
        if (v1bVar instanceof C14481) {
            c14481 = (C14481) v1bVar;
            int i = c14481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14481.label = i - Integer.MIN_VALUE;
            } else {
                c14481 = new C14481(v1bVar);
            }
        } else {
            c14481 = new C14481(v1bVar);
        }
        Object obj = c14481.result;
        y5b y5bVar = y5b.a;
        int i2 = c14481.label;
        if (i2 == 0) {
            uj50.b(obj);
            ga gaVar = this.preferenceDataStore;
            wm20 wm20VarA = gaVar.n.a(gaVar, ga.s[13]);
            Long l = new Long(j);
            c14481.J$0 = j;
            c14481.label = 1;
            if (wm20VarA.g(c14481, l) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = c14481.J$0;
            uj50.b(obj);
        }
        this.cachedSelfExclusionUTCTimeStamp = j;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setShowBalance(boolean z, v1b<? super Unit> v1bVar) {
        C14491 c14491;
        ga gaVar;
        String str;
        if (v1bVar instanceof C14491) {
            c14491 = (C14491) v1bVar;
            int i = c14491.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14491.label = i - Integer.MIN_VALUE;
            } else {
                c14491 = new C14491(v1bVar);
            }
        } else {
            c14491 = new C14491(v1bVar);
        }
        Object obj = c14491.result;
        Object obj2 = y5b.a;
        int i2 = c14491.label;
        if (i2 == 0) {
            uj50.b(obj);
            gaVar = this.preferenceDataStore;
            eo20[] eo20VarArr = eo20.a;
            c14491.L$0 = gaVar;
            c14491.L$1 = "show_balance";
            c14491.Z$0 = z;
            c14491.label = 1;
            Object userId = getUserId(c14491);
            if (userId != obj2) {
                obj = userId;
                str = "show_balance";
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = c14491.Z$0;
        str = (String) c14491.L$1;
        gaVar = (ga) c14491.L$0;
        uj50.b(obj);
        String str2 = str + "_" + obj;
        Boolean boolValueOf = Boolean.valueOf(z);
        c14491.L$0 = null;
        c14491.L$1 = null;
        c14491.Z$0 = z;
        c14491.label = 2;
        Object objPutBoolean = gaVar.a.putBoolean(str2, boolValueOf, c14491);
        return objPutBoolean == obj2 ? obj2 : objPutBoolean;
    }

    @Override // defpackage.mgb0
    public Object setTwoFactorAuthEnabled(boolean z, v1b<? super Unit> v1bVar) {
        ga gaVar = this.preferenceDataStore;
        return gaVar.q.a(gaVar, ga.s[16]).g(v1bVar, Boolean.valueOf(z));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setUserCertStatus(int i, v1b<? super Unit> v1bVar) {
        C14501 c14501;
        if (v1bVar instanceof C14501) {
            c14501 = (C14501) v1bVar;
            int i2 = c14501.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c14501.label = i2 - Integer.MIN_VALUE;
            } else {
                c14501 = new C14501(v1bVar);
            }
        } else {
            c14501 = new C14501(v1bVar);
        }
        Object obj = c14501.result;
        y5b y5bVar = y5b.a;
        int i3 = c14501.label;
        if (i3 == 0) {
            uj50.b(obj);
            ga gaVar = this.preferenceDataStore;
            wm20 wm20VarA = gaVar.j.a(gaVar, ga.s[9]);
            Integer num = new Integer(i);
            c14501.I$0 = i;
            c14501.label = 1;
            if (wm20VarA.g(c14501, num) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = c14501.I$0;
            uj50.b(obj);
        }
        this.cachedUserCertStatus = i;
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object setUserId(final String str, v1b<? super Unit> v1bVar) {
        C14511 c14511;
        if (v1bVar instanceof C14511) {
            c14511 = (C14511) v1bVar;
            int i = c14511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14511.label = i - Integer.MIN_VALUE;
            } else {
                c14511 = new C14511(v1bVar);
            }
        } else {
            c14511 = new C14511(v1bVar);
        }
        Object obj = c14511.result;
        Object obj2 = y5b.a;
        int i2 = c14511.label;
        if (i2 == 0) {
            uj50.b(obj);
            ga gaVar = this.preferenceDataStore;
            if (str == null) {
                wm20 wm20VarA = gaVar.g.a(gaVar, ga.s[5]);
                c14511.L$0 = str;
                c14511.label = 1;
                if (wm20VarA.a(c14511) != obj2) {
                }
            } else {
                wm20 wm20VarA2 = gaVar.g.a(gaVar, ga.s[5]);
                c14511.L$0 = str;
                c14511.label = 2;
                if (wm20VarA2.g(c14511, str) != obj2) {
                }
            }
        }
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return obj;
        }
        str = (String) c14511.L$0;
        uj50.b(obj);
        Function1<? super t8, t8> function1 = new Function1() { // from class: ngb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return SportyAccountManagerImpl.setUserId$lambda$0(str, (t8) obj3);
            }
        };
        c14511.L$0 = null;
        c14511.label = 3;
        Object objUpdateAccount = updateAccount(function1, c14511);
        return objUpdateAccount == obj2 ? obj2 : objUpdateAccount;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object updateAvatarAndNickname(final String str, final String str2, v1b<? super Unit> v1bVar) {
        C14521 c14521;
        String str3;
        Object objG;
        if (v1bVar instanceof C14521) {
            c14521 = (C14521) v1bVar;
            int i = c14521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14521.label = i - Integer.MIN_VALUE;
            } else {
                c14521 = new C14521(v1bVar);
            }
        } else {
            c14521 = new C14521(v1bVar);
        }
        Object obj = c14521.result;
        Object obj2 = y5b.a;
        int i2 = c14521.label;
        if (i2 == 0) {
            uj50.b(obj);
            Function1<? super t8, t8> function1 = new Function1() { // from class: ogb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return SportyAccountManagerImpl.updateAvatarAndNickname$lambda$0(str, str2, (t8) obj3);
                }
            };
            c14521.L$0 = str;
            c14521.L$1 = str2;
            c14521.label = 1;
            if (updateAccount(function1, c14521) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            str2 = (String) c14521.L$1;
            str = (String) c14521.L$0;
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                return obj;
            }
            str3 = (String) c14521.L$1;
            uj50.b(obj);
        }
        ga gaVar = this.preferenceDataStore;
        wm20 wm20VarA = gaVar.e.a(gaVar, ga.s[3]);
        c14521.L$0 = null;
        c14521.L$1 = null;
        c14521.label = 3;
        objG = wm20VarA.g(c14521, str3);
        if (objG != obj2) {
            return obj2;
        }
        return objG;
        ga gaVar2 = this.preferenceDataStore;
        wm20 wm20VarA2 = gaVar2.d.a(gaVar2, ga.s[2]);
        c14521.L$0 = null;
        c14521.L$1 = str2;
        c14521.label = 2;
        if (wm20VarA2.g(c14521, str) != obj2) {
            str3 = str2;
            ga gaVar3 = this.preferenceDataStore;
            wm20 wm20VarA3 = gaVar3.e.a(gaVar3, ga.s[3]);
            c14521.L$0 = null;
            c14521.L$1 = null;
            c14521.label = 3;
            objG = wm20VarA3.g(c14521, str3);
            if (objG != obj2) {
                return objG;
            }
        }
        return obj2;
    }

    @Override // defpackage.mgb0
    @fae
    public /* bridge */ void updateAvatarAndNicknameSync(String str, String str2) {
        super.updateAvatarAndNicknameSync(str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mgb0
    public Object updateLastAccount(final String str, final String str2, v1b<? super Unit> v1bVar) {
        C14531 c14531;
        String str3;
        Object objG;
        if (v1bVar instanceof C14531) {
            c14531 = (C14531) v1bVar;
            int i = c14531.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c14531.label = i - Integer.MIN_VALUE;
            } else {
                c14531 = new C14531(v1bVar);
            }
        } else {
            c14531 = new C14531(v1bVar);
        }
        Object obj = c14531.result;
        Object obj2 = y5b.a;
        int i2 = c14531.label;
        if (i2 == 0) {
            uj50.b(obj);
            Function1<? super t8, t8> function1 = new Function1() { // from class: qgb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return SportyAccountManagerImpl.updateLastAccount$lambda$0(str, str2, (t8) obj3);
                }
            };
            c14531.L$0 = str;
            c14531.L$1 = str2;
            c14531.label = 1;
            if (updateAccount(function1, c14531) != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            str2 = (String) c14531.L$1;
            str = (String) c14531.L$0;
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                return obj;
            }
            str3 = (String) c14531.L$1;
            uj50.b(obj);
        }
        ga gaVar = this.preferenceDataStore;
        wm20 wm20VarA = gaVar.c.a(gaVar, ga.s[1]);
        c14531.L$0 = null;
        c14531.L$1 = null;
        c14531.label = 3;
        objG = wm20VarA.g(c14531, str3);
        if (objG != obj2) {
            return obj2;
        }
        return objG;
        ga gaVar2 = this.preferenceDataStore;
        wm20 wm20VarA2 = gaVar2.b.a(gaVar2, ga.s[0]);
        c14531.L$0 = null;
        c14531.L$1 = str2;
        c14531.label = 2;
        if (wm20VarA2.g(c14531, str) != obj2) {
            str3 = str2;
            ga gaVar3 = this.preferenceDataStore;
            wm20 wm20VarA3 = gaVar3.c.a(gaVar3, ga.s[1]);
            c14531.L$0 = null;
            c14531.L$1 = null;
            c14531.label = 3;
            objG = wm20VarA3.g(c14531, str3);
            if (objG != obj2) {
                return objG;
            }
        }
        return obj2;
    }

    @Override // defpackage.mgb0
    @fae
    public /* bridge */ void updateLastAccountSync(String str, String str2) {
        super.updateLastAccountSync(str, str2);
    }

    @Override // defpackage.mgb0
    public ztw<Account> getAccountFlow() {
        return this.accountFlow;
    }

    @Override // defpackage.mgb0
    public ztw<t8> getAccountHolderFlow() {
        return this.accountHolderFlow;
    }

    @Override // defpackage.mgb0
    public ztw<AccountInfo> getAccountInfoFlow() {
        return this.accountInfoFlow;
    }

    @Override // defpackage.mgb0
    public /* bridge */ String getLastAccount() {
        return super.getLastAccount();
    }

    @Override // defpackage.mgb0
    public /* bridge */ String getLastAvatarUrl() {
        return super.getLastAvatarUrl();
    }

    @Override // defpackage.mgb0
    public /* bridge */ String getLastNickname() {
        return super.getLastNickname();
    }

    @Override // defpackage.mgb0
    public /* bridge */ String getLastUserId() {
        return super.getLastUserId();
    }

    @Override // defpackage.mgb0
    public /* bridge */ String getLoginType() {
        return super.getLoginType();
    }

    @Override // defpackage.mgb0
    public /* bridge */ String getUserId() {
        return super.getUserId();
    }

    @Override // defpackage.mgb0
    public /* bridge */ void setLoginTime(long j) {
        super.setLoginTime(j);
    }

    @Override // defpackage.mgb0
    /* JADX INFO: renamed from: getDocumentAuditStatus, reason: from getter */
    public int getCachedDocumentAuditStatus() {
        return this.cachedDocumentAuditStatus;
    }

    @Override // defpackage.mgb0
    /* JADX INFO: renamed from: getSelfExclusionUTCTimeStamp, reason: from getter */
    public long getCachedSelfExclusionUTCTimeStamp() {
        return this.cachedSelfExclusionUTCTimeStamp;
    }

    @Override // defpackage.mgb0
    /* JADX INFO: renamed from: getUserCertStatus, reason: from getter */
    public int getCachedUserCertStatus() {
        return this.cachedUserCertStatus;
    }

    @Override // defpackage.mgb0
    public String getLanguageCode() {
        return getLanguageCode(null);
    }

    @Override // defpackage.mgb0
    /* JADX INFO: renamed from: getSelfExclusionType, reason: from getter */
    public String getCachedSelfExclusionType() {
        return this.cachedSelfExclusionType;
    }

    @Override // defpackage.mgb0
    public void setSelfExclusionType(String str) {
        str.getClass();
        dj5.b(new SportyAccountManagerImpl$selfExclusionType$1(this, str, null));
    }

    public void setDocumentAuditStatus(int i) {
        dj5.b(new SportyAccountManagerImpl$documentAuditStatus$1(this, i, null));
    }

    @Override // defpackage.mgb0
    public void setSelfExclusionUTCTimeStamp(long j) {
        dj5.b(new SportyAccountManagerImpl$selfExclusionUTCTimeStamp$1(this, j, null));
    }

    @Override // defpackage.mgb0
    public void setUserCertStatus(int i) {
        dj5.b(new SportyAccountManagerImpl$userCertStatus$1(this, i, null));
    }

    @Override // defpackage.mgb0
    public /* bridge */ long getLoginTime() {
        return super.getLoginTime();
    }

    @Override // defpackage.mgb0
    @fae
    public /* bridge */ void setLanguageCode(String str) {
        super.setLanguageCode(str);
    }

    @Override // defpackage.mgb0
    public /* bridge */ void setLoginType(String str) {
        super.setLoginType(str);
    }

    @Override // defpackage.mgb0
    public /* bridge */ void setLastAvatarUrl(String str) {
        super.setLastAvatarUrl(str);
    }

    @Override // defpackage.mgb0
    public /* bridge */ void setLastNickname(String str) {
        super.setLastNickname(str);
    }

    @Override // defpackage.mgb0
    public /* bridge */ boolean getShowBalance() {
        return super.getShowBalance();
    }

    @Override // defpackage.mgb0
    public /* bridge */ void setUserId(String str) {
        super.setUserId(str);
    }

    @Override // defpackage.mgb0
    public /* bridge */ void setShowBalance(boolean z) {
        super.setShowBalance(z);
    }
}
