package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.sportyherov2.components.OverUnderComponent;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import com.sportygames.sportyherov2.remote.models.TopBets;
import defpackage.ajc;
import defpackage.bmy;
import defpackage.dq40;
import defpackage.gaj;
import defpackage.gez;
import defpackage.gr60;
import defpackage.gyk;
import defpackage.hdz;
import defpackage.hez;
import defpackage.hu1;
import defpackage.j560;
import defpackage.kdz;
import defpackage.mo80;
import defpackage.np5;
import defpackage.odz;
import defpackage.op5;
import defpackage.pkb;
import defpackage.pl2;
import defpackage.pr7;
import defpackage.pw;
import defpackage.qxk;
import defpackage.rkb;
import defpackage.ru80;
import defpackage.ssw;
import defpackage.tbg;
import defpackage.tr80;
import defpackage.tx5;
import defpackage.uu80;
import defpackage.wdz;
import defpackage.zm2;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b>\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000f¢\u0006\u0004\b\u0014\u0010\u0012J#\u0010\u0017\u001a\u00020\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u000fH\u0007¢\u0006\u0004\b\u0017\u0010\u0012JQ\u0010 \u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\f0\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0004\b \u0010!J\u001d\u0010%\u001a\u00020\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001b¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\f0\u001d¢\u0006\u0004\b(\u0010)J%\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u001b¢\u0006\u0004\b.\u0010/J%\u00104\u001a\u00020\f2\u0006\u00100\u001a\u00020\n2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u00020\u0013¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\f¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\f¢\u0006\u0004\b8\u00107J\u0015\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\u001b¢\u0006\u0004\b:\u0010;J%\u0010?\u001a\u00020\f2\u0006\u0010<\u001a\u00020\n2\u0006\u0010=\u001a\u0002012\u0006\u0010>\u001a\u000201¢\u0006\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010U\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010[\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010;R\"\u0010b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR0\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR(\u0010r\u001a\b\u0012\u0004\u0012\u00020\n0k8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\"\u0010}\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bz\u0010]\u001a\u0004\b{\u0010_\"\u0004\b|\u0010aR$\u0010\u0081\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010]\u001a\u0004\b\u007f\u0010_\"\u0005\b\u0080\u0001\u0010aR&\u0010\u0085\u0001\u001a\u00020s8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010xR&\u0010\u0089\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010W\u001a\u0005\b\u0087\u0001\u0010Y\"\u0005\b\u0088\u0001\u0010;R+\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R%\u0010\u0093\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bt\u0010]\u001a\u0005\b\u0091\u0001\u0010_\"\u0005\b\u0092\u0001\u0010aR&\u0010\u0097\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0094\u0001\u0010]\u001a\u0005\b\u0095\u0001\u0010_\"\u0005\b\u0096\u0001\u0010aR&\u0010\u009b\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0098\u0001\u0010]\u001a\u0005\b\u0099\u0001\u0010_\"\u0005\b\u009a\u0001\u0010aR&\u0010\u009f\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009c\u0001\u0010]\u001a\u0005\b\u009d\u0001\u0010_\"\u0005\b\u009e\u0001\u0010aR4\u0010¥\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000f8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0005\b¤\u0001\u0010\u0012R&\u0010©\u0001\u001a\u00020s8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010t\u001a\u0005\b§\u0001\u0010v\"\u0005\b¨\u0001\u0010xR%\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\bª\u0001\u0010]\u001a\u0005\b«\u0001\u0010_\"\u0005\b¬\u0001\u0010aR&\u0010°\u0001\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u00ad\u0001\u0010]\u001a\u0005\b®\u0001\u0010_\"\u0005\b¯\u0001\u0010a¨\u0006±\u0001"}, d2 = {"Lcom/sportygames/sportyherov2/components/OverUnderComponent;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/sportyherov2/remote/models/DetailResponse;", "gameDetailResponse", "", "isBet1", "", "setBetModel", "(Lcom/sportygames/sportyherov2/remote/models/DetailResponse;Z)V", "Lkotlin/Function1;", "listener", "setFbgClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "setOnBetChipSelectedListener", "", "betStepListener", "setBetStepListener", "Landroid/content/SharedPreferences;", "preferences", "Lkotlin/Function3;", "", "betListener", "Lkotlin/Function0;", "isNotLoggedIn", "openLoginDialog", "setBetListener", "(Landroid/content/SharedPreferences;Lgaj;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lcom/sportygames/sportyherov2/remote/models/SideBetConfigsList;", "sideBetConfigsList", "ouMinFBGUsageThreshold", "setCoeffModel", "(Lcom/sportygames/sportyherov2/remote/models/SideBetConfigsList;D)V", "removeFBGListener", "setFBGRemoveListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/sportygames/commons/models/GiftItem;", "giftItem", "betPlaced", "amount", "setFBG", "(Lcom/sportygames/commons/models/GiftItem;ZD)V", "isClick", "", "alpha", "visibility", "setDisableContainer", "(ZFI)V", "setPlaceBet", "()V", "setValentineTheme", "value", "setMinThreshold", "(D)V", "tournamentBannerVisible", "deviceHeight", "deviceWidth", "setNestedDimensions", "(ZFF)V", "Lru80;", "a", "Lru80;", "getBinding", "()Lru80;", "setBinding", "(Lru80;)V", "binding", "d", "Lcom/sportygames/commons/models/GiftItem;", "getGiftItem", "()Lcom/sportygames/commons/models/GiftItem;", "setGiftItem", "(Lcom/sportygames/commons/models/GiftItem;)V", "e", "Ljava/lang/Double;", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "giftAmount", "f", "D", "getUserInputAmount", "()D", "setUserInputAmount", "userInputAmount", "A", "Z", "getOverclicked", "()Z", "setOverclicked", "(Z)V", "overclicked", "Ljava/util/HashMap;", "B", "Ljava/util/HashMap;", "getUnderFetchDetail", "()Ljava/util/HashMap;", "setUnderFetchDetail", "(Ljava/util/HashMap;)V", "underFetchDetail", "Lssw;", "C", "Lssw;", "getErrorShowLiveData", "()Lssw;", "setErrorShowLiveData", "(Lssw;)V", "errorShowLiveData", "", "J", "getRoundId", "()J", "setRoundId", "(J)V", "roundId", "E", "getCashoutDone", "setCashoutDone", "cashoutDone", "F", "getCashoutInProgress", "setCashoutInProgress", "cashoutInProgress", "G", "getBetId", "setBetId", "betId", "H", "getBetAmount", "setBetAmount", "betAmount", "I", "Ljava/lang/String;", "getBetType", "()Ljava/lang/String;", "setBetType", "(Ljava/lang/String;)V", "betType", "getShowOverUnderBetConfirmation", "setShowOverUnderBetConfirmation", "showOverUnderBetConfirmation", "K", "getBetIsWaiting", "setBetIsWaiting", "betIsWaiting", "L", "getBetIsPlaced", "setBetIsPlaced", "betIsPlaced", "N", "getFbgAvailable", "setFbgAvailable", "fbgAvailable", "P", "Lkotlin/jvm/functions/Function1;", "getOnBetChipSelected", "()Lkotlin/jvm/functions/Function1;", "setOnBetChipSelected", "onBetChipSelected", "V", "getFbgRoundId", "setFbgRoundId", "fbgRoundId", "W", "getBetPlaced", "setBetPlaced", "a0", "getBetInProgress", "setBetInProgress", "betInProgress", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OverUnderComponent extends LinearLayout {
    public static final /* synthetic */ int b0 = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean overclicked;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public HashMap<Double, Double> underFetchDetail;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public ssw<Boolean> errorShowLiveData;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public long roundId;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public boolean cashoutDone;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean cashoutInProgress;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public long betId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public double betAmount;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public String betType;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public boolean showOverUnderBetConfirmation;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public boolean betIsWaiting;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public boolean betIsPlaced;
    public boolean M;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean fbgAvailable;
    public Function1<? super Boolean, Unit> O;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public Function1<? super Integer, Unit> onBetChipSelected;
    public double Q;
    public SHKeypadContainer R;
    public boolean S;
    public final a T;
    public final b U;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public long fbgRoundId;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public boolean betPlaced;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ru80 binding;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public boolean betInProgress;
    public DetailResponse b;
    public SideBetConfigsList c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public GiftItem giftItem;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Double giftAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public double userInputAmount;
    public boolean i;
    public boolean v;
    public boolean w;
    public boolean y;
    public int z;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            charSequence.getClass();
        }

        /* JADX WARN: Code duplicated, block: B:29:0x008e A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001d, B:12:0x0021, B:15:0x005a, B:17:0x0064, B:34:0x00a0, B:36:0x00a6, B:38:0x00b0, B:51:0x0105, B:39:0x00c0, B:41:0x00c6, B:43:0x00d2, B:45:0x00d9, B:47:0x00de, B:49:0x00e6, B:50:0x00f6, B:53:0x0109, B:54:0x010c, B:55:0x010d, B:56:0x0110, B:18:0x006b, B:20:0x006f, B:22:0x0077, B:24:0x007b, B:26:0x0083, B:27:0x008a, B:28:0x008d, B:29:0x008e, B:31:0x0092, B:33:0x009a, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c), top: B:65:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x0092 A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001d, B:12:0x0021, B:15:0x005a, B:17:0x0064, B:34:0x00a0, B:36:0x00a6, B:38:0x00b0, B:51:0x0105, B:39:0x00c0, B:41:0x00c6, B:43:0x00d2, B:45:0x00d9, B:47:0x00de, B:49:0x00e6, B:50:0x00f6, B:53:0x0109, B:54:0x010c, B:55:0x010d, B:56:0x0110, B:18:0x006b, B:20:0x006f, B:22:0x0077, B:24:0x007b, B:26:0x0083, B:27:0x008a, B:28:0x008d, B:29:0x008e, B:31:0x0092, B:33:0x009a, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c), top: B:65:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x009a A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001d, B:12:0x0021, B:15:0x005a, B:17:0x0064, B:34:0x00a0, B:36:0x00a6, B:38:0x00b0, B:51:0x0105, B:39:0x00c0, B:41:0x00c6, B:43:0x00d2, B:45:0x00d9, B:47:0x00de, B:49:0x00e6, B:50:0x00f6, B:53:0x0109, B:54:0x010c, B:55:0x010d, B:56:0x0110, B:18:0x006b, B:20:0x006f, B:22:0x0077, B:24:0x007b, B:26:0x0083, B:27:0x008a, B:28:0x008d, B:29:0x008e, B:31:0x0092, B:33:0x009a, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c), top: B:65:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:57:0x0111 A[Catch: Exception -> 0x011d, TryCatch #0 {Exception -> 0x011d, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001d, B:12:0x0021, B:15:0x005a, B:17:0x0064, B:34:0x00a0, B:36:0x00a6, B:38:0x00b0, B:51:0x0105, B:39:0x00c0, B:41:0x00c6, B:43:0x00d2, B:45:0x00d9, B:47:0x00de, B:49:0x00e6, B:50:0x00f6, B:53:0x0109, B:54:0x010c, B:55:0x010d, B:56:0x0110, B:18:0x006b, B:20:0x006f, B:22:0x0077, B:24:0x007b, B:26:0x0083, B:27:0x008a, B:28:0x008d, B:29:0x008e, B:31:0x0092, B:33:0x009a, B:57:0x0111, B:58:0x0114, B:59:0x0115, B:60:0x0118, B:61:0x0119, B:62:0x011c), top: B:65:0x0005 }] */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DetailResponse detailResponse;
            Double d;
            OverUnderComponent overUnderComponent = OverUnderComponent.this;
            charSequence.getClass();
            try {
                if (!overUnderComponent.getBetInProgress() && !overUnderComponent.getBetPlaced()) {
                    if (charSequence.length() == 0) {
                        overUnderComponent.a(0.4f, false);
                        return;
                    }
                    double d2 = Double.parseDouble(charSequence.toString());
                    double d3 = Double.parseDouble(overUnderComponent.getBinding().T0.getText().toString().substring(0, overUnderComponent.getBinding().T0.getText().toString().length() - 1));
                    DetailResponse detailResponse2 = overUnderComponent.b;
                    if (detailResponse2 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (d2 <= detailResponse2.getMinAmount()) {
                        overUnderComponent.a(0.4f, false);
                        overUnderComponent.b(1.0f, true);
                    } else {
                        DetailResponse detailResponse3 = overUnderComponent.b;
                        if (detailResponse3 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d2 <= detailResponse3.getMinAmount()) {
                            detailResponse = overUnderComponent.b;
                            if (detailResponse != null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            if (d2 >= detailResponse.getMaxAmount()) {
                                overUnderComponent.a(1.0f, true);
                                overUnderComponent.b(0.4f, false);
                            }
                        } else {
                            DetailResponse detailResponse4 = overUnderComponent.b;
                            if (detailResponse4 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            if (d2 < detailResponse4.getMaxAmount()) {
                                overUnderComponent.a(1.0f, true);
                                overUnderComponent.b(1.0f, true);
                            } else {
                                detailResponse = overUnderComponent.b;
                                if (detailResponse != null) {
                                    Intrinsics.n("gameDetailResponse");
                                    throw null;
                                }
                                if (d2 >= detailResponse.getMaxAmount()) {
                                    overUnderComponent.a(1.0f, true);
                                    overUnderComponent.b(0.4f, false);
                                }
                            }
                        }
                    }
                    double d4 = d2 * d3;
                    DetailResponse detailResponse5 = overUnderComponent.b;
                    if (detailResponse5 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (d4 > detailResponse5.getMaxPayoutAmount()) {
                        overUnderComponent.getErrorShowLiveData().j(Boolean.TRUE);
                        overUnderComponent.m(0.5f, false);
                        overUnderComponent.r(1.0f, true);
                    } else {
                        HashMap<Double, Double> underFetchDetail = overUnderComponent.getUnderFetchDetail();
                        double dDoubleValue = ((underFetchDetail == null || (d = underFetchDetail.get(Double.valueOf(d3))) == null) ? 1.0d : d.doubleValue()) * d2;
                        DetailResponse detailResponse6 = overUnderComponent.b;
                        if (detailResponse6 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (dDoubleValue > detailResponse6.getMaxPayoutAmount()) {
                            overUnderComponent.getErrorShowLiveData().j(Boolean.TRUE);
                            overUnderComponent.r(0.5f, false);
                            overUnderComponent.m(1.0f, true);
                        } else {
                            overUnderComponent.getErrorShowLiveData().j(Boolean.FALSE);
                            overUnderComponent.m(1.0f, true);
                            overUnderComponent.r(1.0f, true);
                        }
                    }
                    overUnderComponent.setPlaceBet();
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements TextWatcher {
        public final /* synthetic */ Context b;

        public b(Context context) {
            this.b = context;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            charSequence.getClass();
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00c0 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:3:0x000f, B:7:0x001d, B:9:0x0027, B:12:0x0041, B:15:0x006e, B:17:0x007a, B:51:0x00f7, B:53:0x011a, B:55:0x0126, B:57:0x012d, B:60:0x017f, B:62:0x0189, B:75:0x01e2, B:63:0x019a, B:65:0x01a0, B:67:0x01ac, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:74:0x01d2, B:77:0x01e6, B:78:0x01ea, B:79:0x01eb, B:80:0x01ef, B:18:0x0084, B:20:0x008a, B:22:0x0092, B:24:0x009c, B:26:0x00a0, B:28:0x00a8, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:34:0x00bf, B:35:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00d0, B:43:0x00d8, B:44:0x00e0, B:45:0x00e3, B:46:0x00e4, B:48:0x00e8, B:50:0x00f0, B:81:0x01f0, B:82:0x01f4, B:83:0x01f5, B:84:0x01fa, B:85:0x01fb, B:86:0x01ff, B:87:0x0200), top: B:90:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:46:0x00e4 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:3:0x000f, B:7:0x001d, B:9:0x0027, B:12:0x0041, B:15:0x006e, B:17:0x007a, B:51:0x00f7, B:53:0x011a, B:55:0x0126, B:57:0x012d, B:60:0x017f, B:62:0x0189, B:75:0x01e2, B:63:0x019a, B:65:0x01a0, B:67:0x01ac, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:74:0x01d2, B:77:0x01e6, B:78:0x01ea, B:79:0x01eb, B:80:0x01ef, B:18:0x0084, B:20:0x008a, B:22:0x0092, B:24:0x009c, B:26:0x00a0, B:28:0x00a8, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:34:0x00bf, B:35:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00d0, B:43:0x00d8, B:44:0x00e0, B:45:0x00e3, B:46:0x00e4, B:48:0x00e8, B:50:0x00f0, B:81:0x01f0, B:82:0x01f4, B:83:0x01f5, B:84:0x01fa, B:85:0x01fb, B:86:0x01ff, B:87:0x0200), top: B:90:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:48:0x00e8 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:3:0x000f, B:7:0x001d, B:9:0x0027, B:12:0x0041, B:15:0x006e, B:17:0x007a, B:51:0x00f7, B:53:0x011a, B:55:0x0126, B:57:0x012d, B:60:0x017f, B:62:0x0189, B:75:0x01e2, B:63:0x019a, B:65:0x01a0, B:67:0x01ac, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:74:0x01d2, B:77:0x01e6, B:78:0x01ea, B:79:0x01eb, B:80:0x01ef, B:18:0x0084, B:20:0x008a, B:22:0x0092, B:24:0x009c, B:26:0x00a0, B:28:0x00a8, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:34:0x00bf, B:35:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00d0, B:43:0x00d8, B:44:0x00e0, B:45:0x00e3, B:46:0x00e4, B:48:0x00e8, B:50:0x00f0, B:81:0x01f0, B:82:0x01f4, B:83:0x01f5, B:84:0x01fa, B:85:0x01fb, B:86:0x01ff, B:87:0x0200), top: B:90:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00f0 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:3:0x000f, B:7:0x001d, B:9:0x0027, B:12:0x0041, B:15:0x006e, B:17:0x007a, B:51:0x00f7, B:53:0x011a, B:55:0x0126, B:57:0x012d, B:60:0x017f, B:62:0x0189, B:75:0x01e2, B:63:0x019a, B:65:0x01a0, B:67:0x01ac, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:74:0x01d2, B:77:0x01e6, B:78:0x01ea, B:79:0x01eb, B:80:0x01ef, B:18:0x0084, B:20:0x008a, B:22:0x0092, B:24:0x009c, B:26:0x00a0, B:28:0x00a8, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:34:0x00bf, B:35:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00d0, B:43:0x00d8, B:44:0x00e0, B:45:0x00e3, B:46:0x00e4, B:48:0x00e8, B:50:0x00f0, B:81:0x01f0, B:82:0x01f4, B:83:0x01f5, B:84:0x01fa, B:85:0x01fb, B:86:0x01ff, B:87:0x0200), top: B:90:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:81:0x01f0 A[Catch: Exception -> 0x0205, TryCatch #0 {Exception -> 0x0205, blocks: (B:3:0x000f, B:7:0x001d, B:9:0x0027, B:12:0x0041, B:15:0x006e, B:17:0x007a, B:51:0x00f7, B:53:0x011a, B:55:0x0126, B:57:0x012d, B:60:0x017f, B:62:0x0189, B:75:0x01e2, B:63:0x019a, B:65:0x01a0, B:67:0x01ac, B:69:0x01b3, B:71:0x01b9, B:73:0x01c1, B:74:0x01d2, B:77:0x01e6, B:78:0x01ea, B:79:0x01eb, B:80:0x01ef, B:18:0x0084, B:20:0x008a, B:22:0x0092, B:24:0x009c, B:26:0x00a0, B:28:0x00a8, B:30:0x00ac, B:32:0x00b4, B:33:0x00bc, B:34:0x00bf, B:35:0x00c0, B:37:0x00c6, B:39:0x00cc, B:41:0x00d0, B:43:0x00d8, B:44:0x00e0, B:45:0x00e3, B:46:0x00e4, B:48:0x00e8, B:50:0x00f0, B:81:0x01f0, B:82:0x01f4, B:83:0x01f5, B:84:0x01fa, B:85:0x01fb, B:86:0x01ff, B:87:0x0200), top: B:90:0x000f }] */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            double d;
            SideBetConfigsList sideBetConfigsList;
            Double d2;
            Double d3;
            Context context = this.b;
            charSequence.getClass();
            try {
                int length = charSequence.length();
                OverUnderComponent overUnderComponent = OverUnderComponent.this;
                if (length != 0 && !charSequence.equals("0x") && charSequence.toString().substring(0, charSequence.toString().length() - 1).length() != 0) {
                    double d4 = Double.parseDouble(charSequence.toString().substring(0, charSequence.toString().length() - 1));
                    double d5 = Double.parseDouble(overUnderComponent.getBinding().L0.getText().toString());
                    SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                    if (sideBetConfigsList2 == null) {
                        Intrinsics.n("sideBetConfigsList");
                        throw null;
                    }
                    if (d4 <= sideBetConfigsList2.getMinCoefficient()) {
                        overUnderComponent.d(0.4f, false);
                        overUnderComponent.e(1.0f, true);
                        d = d5;
                    } else {
                        if (overUnderComponent.getGiftItem() != null) {
                            d = d5;
                            if (d4 <= overUnderComponent.Q) {
                                overUnderComponent.d(0.4f, false);
                                overUnderComponent.e(1.0f, true);
                            }
                        } else {
                            d = d5;
                        }
                        SideBetConfigsList sideBetConfigsList3 = overUnderComponent.c;
                        if (sideBetConfigsList3 == null) {
                            Intrinsics.n("sideBetConfigsList");
                            throw null;
                        }
                        if (d4 > sideBetConfigsList3.getMinCoefficient()) {
                            SideBetConfigsList sideBetConfigsList4 = overUnderComponent.c;
                            if (sideBetConfigsList4 == null) {
                                Intrinsics.n("sideBetConfigsList");
                                throw null;
                            }
                            if (d4 < sideBetConfigsList4.getMaxCoefficient()) {
                                overUnderComponent.d(1.0f, true);
                                overUnderComponent.e(1.0f, true);
                            } else if (d4 > overUnderComponent.Q) {
                                sideBetConfigsList = overUnderComponent.c;
                                if (sideBetConfigsList != null) {
                                    Intrinsics.n("sideBetConfigsList");
                                    throw null;
                                }
                                if (d4 >= sideBetConfigsList.getMaxCoefficient()) {
                                    overUnderComponent.d(1.0f, true);
                                    overUnderComponent.e(0.4f, false);
                                }
                            } else {
                                sideBetConfigsList = overUnderComponent.c;
                                if (sideBetConfigsList != null) {
                                    Intrinsics.n("sideBetConfigsList");
                                    throw null;
                                }
                                if (d4 >= sideBetConfigsList.getMaxCoefficient()) {
                                    overUnderComponent.d(1.0f, true);
                                    overUnderComponent.e(0.4f, false);
                                }
                            }
                        } else if (d4 > overUnderComponent.Q || overUnderComponent.getGiftItem() == null) {
                            sideBetConfigsList = overUnderComponent.c;
                            if (sideBetConfigsList != null) {
                                Intrinsics.n("sideBetConfigsList");
                                throw null;
                            }
                            if (d4 >= sideBetConfigsList.getMaxCoefficient()) {
                                overUnderComponent.d(1.0f, true);
                                overUnderComponent.e(0.4f, false);
                            }
                        } else {
                            SideBetConfigsList sideBetConfigsList5 = overUnderComponent.c;
                            if (sideBetConfigsList5 == null) {
                                Intrinsics.n("sideBetConfigsList");
                                throw null;
                            }
                            if (d4 < sideBetConfigsList5.getMaxCoefficient()) {
                                overUnderComponent.d(1.0f, true);
                                overUnderComponent.e(1.0f, true);
                            } else {
                                sideBetConfigsList = overUnderComponent.c;
                                if (sideBetConfigsList != null) {
                                    Intrinsics.n("sideBetConfigsList");
                                    throw null;
                                }
                                if (d4 >= sideBetConfigsList.getMaxCoefficient()) {
                                    overUnderComponent.d(1.0f, true);
                                    overUnderComponent.e(0.4f, false);
                                }
                            }
                        }
                    }
                    TextView textView = overUnderComponent.getBinding().Y0;
                    op5 op5Var = op5.a;
                    String string = context.getString(R.string.pays_text_cms);
                    string.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string, "Pays", null);
                    TreeMap treeMap = pw.a;
                    HashMap<Double, Double> underFetchDetail = overUnderComponent.getUnderFetchDetail();
                    textView.setText("(" + strB + " " + pw.q((underFetchDetail == null || (d3 = underFetchDetail.get(Double.valueOf(d4))) == null) ? 0.0d : d3.doubleValue()) + "x)");
                    TextView textView2 = overUnderComponent.getBinding().u0;
                    String string2 = context.getString(R.string.pays_text_cms);
                    string2.getClass();
                    textView2.setText("(" + op5.b(string2, "Pays", null) + " " + pw.q(d4) + "x)");
                    double d6 = d * d4;
                    DetailResponse detailResponse = overUnderComponent.b;
                    if (detailResponse == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (d6 > detailResponse.getMaxPayoutAmount()) {
                        overUnderComponent.getErrorShowLiveData().j(Boolean.TRUE);
                        overUnderComponent.m(0.5f, false);
                        overUnderComponent.r(1.0f, true);
                    } else {
                        HashMap<Double, Double> underFetchDetail2 = overUnderComponent.getUnderFetchDetail();
                        double dDoubleValue = ((underFetchDetail2 == null || (d2 = underFetchDetail2.get(Double.valueOf(d4))) == null) ? 1.0d : d2.doubleValue()) * d;
                        DetailResponse detailResponse2 = overUnderComponent.b;
                        if (detailResponse2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (dDoubleValue > detailResponse2.getMaxPayoutAmount()) {
                            overUnderComponent.getErrorShowLiveData().j(Boolean.TRUE);
                            overUnderComponent.r(0.5f, false);
                            overUnderComponent.m(1.0f, true);
                        } else {
                            overUnderComponent.getErrorShowLiveData().j(Boolean.FALSE);
                            overUnderComponent.m(1.0f, true);
                            overUnderComponent.r(1.0f, true);
                        }
                    }
                    overUnderComponent.setPlaceBet();
                    return;
                }
                int i4 = OverUnderComponent.b0;
                overUnderComponent.d(0.4f, false);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverUnderComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.binding = ru80.a(LayoutInflater.from(context), this);
        this.overclicked = true;
        this.underFetchDetail = new HashMap<>();
        this.errorShowLiveData = new ssw<>();
        this.M = true;
        this.T = new a();
        this.U = new b(context);
    }

    public static void l(TextView textView) {
        String string;
        CharSequence text = textView.getText();
        String strA = null;
        if (Intrinsics.g(text != null ? text.toString() : null, "x")) {
            return;
        }
        CharSequence text2 = textView.getText();
        if (text2 != null && (string = text2.toString()) != null) {
            strA = pl2.a(textView, 1, string, 0);
        }
        String strSubstring = String.valueOf(strA).substring(0, String.valueOf(textView.getText()).length() - 2);
        if (strSubstring.length() == 0) {
            textView.setText("0x");
        }
        if (strSubstring.length() > 0) {
            textView.setText(strSubstring.concat("x"));
        } else {
            textView.setText("0x");
        }
    }

    public final void a(float f, boolean z) {
        if (f == 0.4f) {
            f = 0.65f;
        }
        this.binding.G.setClickable(z);
        this.binding.R0.setAlpha(f);
        this.binding.E.setClickable(z);
        this.binding.P0.setAlpha(f);
        this.binding.E.setAlpha(f);
        this.binding.G.setAlpha(f);
    }

    public final void b(float f, boolean z) {
        if (f == 0.4f) {
            f = 0.65f;
        }
        this.binding.I.setClickable(z);
        this.binding.U0.setAlpha(f);
        this.binding.C.setClickable(z);
        this.binding.N0.setAlpha(f);
        this.binding.C.setAlpha(f);
        this.binding.I.setAlpha(f);
    }

    public final void c() {
        Double d;
        double dA = tr80.a(this.binding.L0);
        double dA2 = j560.a(1, 0, this.binding.T0.getText().toString());
        double d2 = dA * dA2;
        DetailResponse detailResponse = this.b;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (d2 > detailResponse.getMaxPayoutAmount()) {
            this.errorShowLiveData.j(Boolean.TRUE);
            m(0.5f, false);
            r(1.0f, true);
            return;
        }
        HashMap<Double, Double> map = this.underFetchDetail;
        double dDoubleValue = ((map == null || (d = map.get(Double.valueOf(dA2))) == null) ? 1.0d : d.doubleValue()) * dA;
        DetailResponse detailResponse2 = this.b;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double maxPayoutAmount = detailResponse2.getMaxPayoutAmount();
        ssw<Boolean> sswVar = this.errorShowLiveData;
        if (dDoubleValue > maxPayoutAmount) {
            sswVar.j(Boolean.TRUE);
            r(0.5f, false);
            m(1.0f, true);
        } else {
            sswVar.j(Boolean.FALSE);
            m(1.0f, true);
            r(1.0f, true);
        }
    }

    public final void d(float f, boolean z) {
        this.binding.H.setClickable(z);
        this.binding.S0.setAlpha(f);
        this.binding.F.setClickable(z);
        this.binding.Q0.setAlpha(f);
        this.binding.H.setAlpha(f);
        this.binding.F.setAlpha(f);
    }

    public final void e(float f, boolean z) {
        this.binding.J.setClickable(z);
        this.binding.V0.setAlpha(f);
        this.binding.D.setClickable(z);
        this.binding.O0.setAlpha(f);
        this.binding.J.setAlpha(f);
        this.binding.D.setAlpha(f);
    }

    public final void f(float f, boolean z) {
        ru80 ru80Var;
        ru80 ru80Var2;
        int childCount = this.binding.j0.getChildCount();
        int i = 0;
        while (true) {
            ru80Var = this.binding;
            if (i >= childCount) {
                break;
            }
            ru80Var.j0.getChildAt(i).setEnabled(z);
            this.binding.j0.getChildAt(i).setAlpha(f);
            i++;
        }
        ru80Var.X.setEnabled(isEnabled());
        this.binding.X.setAlpha(f);
        int childCount2 = this.binding.i.getChildCount();
        int i2 = 0;
        while (true) {
            ru80Var2 = this.binding;
            if (i2 >= childCount2) {
                break;
            }
            ru80Var2.i.getChildAt(i2).setEnabled(z);
            this.binding.i.getChildAt(i2).setAlpha(f);
            i2++;
        }
        int childCount3 = ru80Var2.l0.getChildCount();
        for (int i3 = 0; i3 < childCount3; i3++) {
            this.binding.l0.getChildAt(i3).setEnabled(z);
            this.binding.l0.getChildAt(i3).setAlpha(f);
        }
        if (z) {
            String string = this.binding.T0.getText().toString();
            double dA = (string.length() <= 0 || string.equals("x")) ? 0.0d : j560.a(1, 0, string);
            double dA2 = this.binding.L0.getText().toString().length() > 0 ? tr80.a(this.binding.L0) : 0.0d;
            k(dA, dA2);
            DetailResponse detailResponse = this.b;
            if (detailResponse == null) {
                return;
            }
            if (dA2 > detailResponse.getMinAmount()) {
                a(1.0f, true);
            } else {
                a(0.4f, false);
            }
            GiftItem giftItem = this.giftItem;
            if (giftItem != null && dA > this.Q) {
                d(1.0f, true);
                return;
            }
            if (giftItem == null) {
                SideBetConfigsList sideBetConfigsList = this.c;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA > sideBetConfigsList.getMinCoefficient()) {
                    d(1.0f, true);
                    return;
                }
            }
            d(0.4f, false);
        }
    }

    public final void g() {
        Double d;
        double dA = tr80.a(this.binding.L0);
        double dA2 = hez.a(this.binding.T0, 1, this.binding.T0.getText().toString(), 0);
        double d2 = dA * dA2;
        DetailResponse detailResponse = this.b;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (d2 > detailResponse.getMaxPayoutAmount()) {
            m(0.5f, false);
            r(1.0f, true);
            return;
        }
        HashMap<Double, Double> map = this.underFetchDetail;
        double dDoubleValue = ((map == null || (d = map.get(Double.valueOf(dA2))) == null) ? 1.0d : d.doubleValue()) * dA;
        DetailResponse detailResponse2 = this.b;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (dDoubleValue > detailResponse2.getMaxPayoutAmount()) {
            r(0.5f, false);
            m(1.0f, true);
        } else {
            m(1.0f, true);
            r(1.0f, true);
        }
    }

    public final double getBetAmount() {
        return this.betAmount;
    }

    public final long getBetId() {
        return this.betId;
    }

    public final boolean getBetInProgress() {
        return this.betInProgress;
    }

    public final boolean getBetIsPlaced() {
        return this.betIsPlaced;
    }

    public final boolean getBetIsWaiting() {
        return this.betIsWaiting;
    }

    public final boolean getBetPlaced() {
        return this.betPlaced;
    }

    public final String getBetType() {
        return this.betType;
    }

    public final ru80 getBinding() {
        return this.binding;
    }

    public final boolean getCashoutDone() {
        return this.cashoutDone;
    }

    public final boolean getCashoutInProgress() {
        return this.cashoutInProgress;
    }

    public final ssw<Boolean> getErrorShowLiveData() {
        return this.errorShowLiveData;
    }

    public final boolean getFbgAvailable() {
        return this.fbgAvailable;
    }

    public final long getFbgRoundId() {
        return this.fbgRoundId;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final GiftItem getGiftItem() {
        return this.giftItem;
    }

    public final Function1<Integer, Unit> getOnBetChipSelected() {
        Function1 function1 = this.onBetChipSelected;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.n("onBetChipSelected");
        throw null;
    }

    public final boolean getOverclicked() {
        return this.overclicked;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final boolean getShowOverUnderBetConfirmation() {
        return this.showOverUnderBetConfirmation;
    }

    public final HashMap<Double, Double> getUnderFetchDetail() {
        return this.underFetchDetail;
    }

    public final double getUserInputAmount() {
        return this.userInputAmount;
    }

    public final void h(boolean z) {
        ru80 ru80Var = this.binding;
        if (z) {
            ru80Var.K.setVisibility(0);
            this.binding.L.setVisibility(0);
            this.binding.M.setVisibility(0);
            this.binding.N.setVisibility(0);
            this.binding.O.setVisibility(0);
            this.binding.P.setVisibility(0);
            return;
        }
        ru80Var.K.setVisibility(8);
        this.binding.L.setVisibility(8);
        this.binding.M.setVisibility(8);
        this.binding.N.setVisibility(8);
        this.binding.O.setVisibility(8);
        this.binding.P.setVisibility(8);
    }

    public final void i() {
        this.binding.Q.setVisibility(0);
        this.binding.E0.setVisibility(8);
        this.binding.F0.setVisibility(8);
        this.binding.D0.setClickable(true);
        this.binding.D0.setEnabled(true);
        this.binding.D0.setAlpha(1.0f);
        this.binding.K0.setAlpha(1.0f);
    }

    public final void j() {
        this.binding.e0.setVisibility(8);
        this.binding.f0.setVisibility(8);
        this.binding.g0.setVisibility(8);
        this.binding.h0.setVisibility(8);
        this.binding.i0.setVisibility(8);
    }

    public final void k(double d, double d2) {
        DetailResponse detailResponse = this.b;
        if (detailResponse == null) {
            return;
        }
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (d2 < detailResponse.getMaxAmount()) {
            b(1.0f, true);
        } else {
            b(0.4f, false);
        }
        SideBetConfigsList sideBetConfigsList = this.c;
        if (sideBetConfigsList == null) {
            Intrinsics.n("sideBetConfigsList");
            throw null;
        }
        if (d < sideBetConfigsList.getMaxCoefficient()) {
            e(1.0f, true);
        } else {
            e(0.4f, false);
        }
    }

    public final void m(float f, boolean z) {
        this.binding.R.setClickable(z);
        this.binding.R.setEnabled(z);
        this.binding.R.setFocusable(z);
        this.binding.R.setAlpha(f);
        this.binding.t0.setAlpha(f);
        this.binding.u0.setAlpha(f);
        if (this.overclicked) {
            this.binding.D0.setClickable(z);
            this.binding.D0.setEnabled(z);
            this.binding.D0.setAlpha(f);
            this.binding.K0.setAlpha(f);
        }
    }

    public final void n() {
        this.giftItem = null;
        this.giftAmount = null;
        this.fbgRoundId = 0L;
        this.binding.k0.setVisibility(8);
        setDisableContainer(true, 1.0f, 0);
        TextView textView = this.binding.L0;
        TreeMap treeMap = pw.a;
        Double dH = kotlin.text.b.h(pw.q(this.userInputAmount));
        String str = "0.00";
        if (dH != null) {
            try {
                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                str2.getClass();
                str = str2;
            } catch (Exception unused) {
            }
        }
        textView.setText(str);
        this.binding.U.setVisibility(8);
        this.binding.V.setVisibility(8);
        this.binding.X.setVisibility(8);
        this.binding.j0.setBackground(getContext().getDrawable(R.drawable.sh_bet_bg_selector_v2));
        setPlaceBet();
        double dA = tr80.a(this.binding.L0);
        DetailResponse detailResponse = this.b;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double stepAmount = dA - detailResponse.getStepAmount();
        DetailResponse detailResponse2 = this.b;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (stepAmount <= detailResponse2.getMinAmount()) {
            a(0.4f, false);
        } else {
            a(1.0f, true);
        }
        double dA2 = tr80.a(this.binding.L0);
        DetailResponse detailResponse3 = this.b;
        if (detailResponse3 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double stepAmount2 = detailResponse3.getStepAmount() + dA2;
        DetailResponse detailResponse4 = this.b;
        if (detailResponse4 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (stepAmount2 > detailResponse4.getMaxAmount()) {
            b(0.4f, false);
        } else {
            b(1.0f, true);
        }
        ViewGroup.LayoutParams layoutParams = this.binding.X.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(0, (int) getResources().getDimension(R.dimen._8sdp), (int) getResources().getDimension(R.dimen._6sdp), (int) getResources().getDimension(R.dimen._2sdp));
        this.binding.X.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.binding.L0.getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins(0, (int) getResources().getDimension(R.dimen._8sdp), 0, 0);
        this.binding.L0.setLayoutParams(layoutParams4);
    }

    public final void o() {
        int i = this.z;
        ru80 ru80Var = this.binding;
        if (i == 2) {
            String string = ru80Var.T0.getText().toString();
            if (string.length() == 0 || Intrinsics.g(this.binding.T0.getText().toString(), "0x")) {
                GiftItem giftItem = this.giftItem;
                ru80 ru80Var2 = this.binding;
                if (giftItem != null) {
                    TextView textView = ru80Var2.T0;
                    TreeMap treeMap = pw.a;
                    pr7.b(this.Q, "x", textView);
                    return;
                }
                TextView textView2 = ru80Var2.T0;
                TreeMap treeMap2 = pw.a;
                SideBetConfigsList sideBetConfigsList = this.c;
                if (sideBetConfigsList != null) {
                    textView2.setText(pw.q(sideBetConfigsList.getMinCoefficient()).concat("x"));
                    return;
                } else {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
            }
            double dA = hez.a(this.binding.T0, 1, string, 0);
            SideBetConfigsList sideBetConfigsList2 = this.c;
            if (sideBetConfigsList2 == null) {
                Intrinsics.n("sideBetConfigsList");
                throw null;
            }
            double maxCoefficient = sideBetConfigsList2.getMaxCoefficient();
            ru80 ru80Var3 = this.binding;
            if (dA >= maxCoefficient) {
                TextView textView3 = ru80Var3.T0;
                TreeMap treeMap3 = pw.a;
                SideBetConfigsList sideBetConfigsList3 = this.c;
                if (sideBetConfigsList3 != null) {
                    textView3.setText(pw.q(sideBetConfigsList3.getMaxCoefficient()).concat("x"));
                    return;
                } else {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
            }
            double dA2 = hez.a(ru80Var3.T0, 1, string, 0);
            SideBetConfigsList sideBetConfigsList4 = this.c;
            if (sideBetConfigsList4 == null) {
                Intrinsics.n("sideBetConfigsList");
                throw null;
            }
            double minCoefficient = sideBetConfigsList4.getMinCoefficient();
            GiftItem giftItem2 = this.giftItem;
            ru80 ru80Var4 = this.binding;
            if (dA2 > minCoefficient) {
                if (giftItem2 == null) {
                    TextView textView4 = ru80Var4.T0;
                    TreeMap treeMap4 = pw.a;
                    textView4.setText(pw.q(Double.parseDouble(string.substring(0, textView4.getText().toString().length() - 1))).concat("x"));
                    return;
                } else {
                    TextView textView5 = ru80Var4.T0;
                    TreeMap treeMap5 = pw.a;
                    pr7.b(this.Q, "x", textView5);
                    return;
                }
            }
            if (giftItem2 != null) {
                TextView textView6 = ru80Var4.T0;
                TreeMap treeMap6 = pw.a;
                pr7.b(this.Q, "x", textView6);
                return;
            }
            TextView textView7 = ru80Var4.T0;
            TreeMap treeMap7 = pw.a;
            SideBetConfigsList sideBetConfigsList5 = this.c;
            if (sideBetConfigsList5 != null) {
                textView7.setText(pw.q(sideBetConfigsList5.getMinCoefficient()).concat("x"));
                return;
            } else {
                Intrinsics.n("sideBetConfigsList");
                throw null;
            }
        }
        String string2 = ru80Var.L0.getText().toString();
        String str = "0.00";
        if (string2.length() == 0) {
            TextView textView8 = this.binding.L0;
            TreeMap treeMap8 = pw.a;
            DetailResponse detailResponse = this.b;
            if (detailResponse == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            Double dH = kotlin.text.b.h(pw.q(detailResponse.getMinAmount()));
            if (dH != null) {
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
            }
            textView8.setText(str);
            return;
        }
        double d = Double.parseDouble(string2);
        DetailResponse detailResponse2 = this.b;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (d >= detailResponse2.getMaxAmount()) {
            TextView textView9 = this.binding.L0;
            TreeMap treeMap9 = pw.a;
            DetailResponse detailResponse3 = this.b;
            if (detailResponse3 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            Double dH2 = kotlin.text.b.h(pw.q(detailResponse3.getMaxAmount()));
            if (dH2 != null) {
                try {
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH2.doubleValue());
                    str3.getClass();
                    str = str3;
                } catch (Exception unused2) {
                }
            }
            textView9.setText(str);
            return;
        }
        double d2 = Double.parseDouble(string2);
        DetailResponse detailResponse4 = this.b;
        if (detailResponse4 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double minAmount = detailResponse4.getMinAmount();
        ru80 ru80Var5 = this.binding;
        if (d2 > minAmount) {
            TextView textView10 = ru80Var5.L0;
            TreeMap treeMap10 = pw.a;
            Double dH3 = kotlin.text.b.h(pw.q(Double.parseDouble(string2)));
            if (dH3 != null) {
                try {
                    String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                    str4.getClass();
                    str = str4;
                } catch (Exception unused3) {
                }
            }
            textView10.setText(str);
            return;
        }
        TextView textView11 = ru80Var5.L0;
        TreeMap treeMap11 = pw.a;
        DetailResponse detailResponse5 = this.b;
        if (detailResponse5 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        Double dH4 = kotlin.text.b.h(pw.q(detailResponse5.getMinAmount()));
        if (dH4 != null) {
            try {
                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                str5.getClass();
                str = str5;
            } catch (Exception unused4) {
            }
        }
        textView11.setText(str);
    }

    public final void p(int i) {
        if (i == 0) {
            if (this.binding.A0.getVisibility() == 8) {
                this.binding.i0.setVisibility(0);
            }
        } else {
            if (i == 1) {
                this.binding.e0.setVisibility(0);
                return;
            }
            if (i == 2) {
                this.binding.f0.setVisibility(0);
            } else if (i == 3) {
                this.binding.g0.setVisibility(0);
            } else {
                if (i != 4) {
                    return;
                }
                this.binding.h0.setVisibility(0);
            }
        }
    }

    public final void q() {
        this.binding.j0.setEnabled(false);
        this.binding.l0.setEnabled(false);
    }

    public final void r(float f, boolean z) {
        this.binding.S.setClickable(z);
        this.binding.S.setEnabled(z);
        this.binding.S.setFocusable(z);
        this.binding.S.setAlpha(f);
        this.binding.X0.setAlpha(f);
        this.binding.Y0.setAlpha(f);
        if (this.overclicked) {
            return;
        }
        this.binding.D0.setClickable(z);
        this.binding.D0.setEnabled(z);
        this.binding.D0.setAlpha(f);
        this.binding.K0.setAlpha(f);
    }

    public final String s(boolean z) {
        if (z) {
            Context context = getContext();
            if (context == null) {
                return "";
            }
            op5 op5Var = op5.a;
            String string = context.getString(R.string.bet_text_game_cms);
            string.getClass();
            String string2 = context.getString(R.string.bet);
            string2.getClass();
            op5Var.getClass();
            StringBuilder sb = new StringBuilder(op5.b(string, string2, null));
            sb.append(" : ");
            String string3 = context.getString(R.string.over_text_cms);
            string3.getClass();
            String string4 = context.getString(R.string.over_text);
            string4.getClass();
            sb.append(op5.b(string3, string4, null));
            sb.append(" ");
            sb.append(this.binding.T0.getText().toString());
            sb.append(" ");
            sb.append(this.binding.u0.getText().toString());
            return sb.toString();
        }
        Context context2 = getContext();
        if (context2 == null) {
            return "";
        }
        op5 op5Var2 = op5.a;
        String string5 = context2.getString(R.string.bet_text_game_cms);
        string5.getClass();
        String string6 = context2.getString(R.string.bet);
        string6.getClass();
        op5Var2.getClass();
        StringBuilder sb2 = new StringBuilder(op5.b(string5, string6, null));
        sb2.append(" : ");
        String string7 = context2.getString(R.string.under_text_cms);
        string7.getClass();
        String string8 = context2.getString(R.string.under_text);
        string8.getClass();
        sb2.append(op5.b(string7, string8, null));
        sb2.append(" ");
        sb2.append(this.binding.T0.getText().toString());
        sb2.append(" ");
        sb2.append(this.binding.Y0.getText().toString());
        return sb2.toString();
    }

    public final void setBetAmount(double d) {
        this.betAmount = d;
    }

    public final void setBetId(long j) {
        this.betId = j;
    }

    public final void setBetInProgress(boolean z) {
        this.betInProgress = z;
    }

    public final void setBetIsPlaced(boolean z) {
        this.betIsPlaced = z;
    }

    public final void setBetIsWaiting(boolean z) {
        this.betIsWaiting = z;
    }

    public final void setBetListener(final SharedPreferences preferences, final gaj<? super String, ? super Double, ? super String, Unit> betListener, final Function0<Boolean> isNotLoggedIn, final Function0<Unit> openLoginDialog) {
        preferences.getClass();
        betListener.getClass();
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        gr60.a(this.binding.R, new Function1() { // from class: edz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = OverUnderComponent.b0;
                ((View) obj).getClass();
                if (((Boolean) isNotLoggedIn.invoke()).booleanValue()) {
                    openLoginDialog.invoke();
                } else {
                    OverUnderComponent overUnderComponent = this;
                    overUnderComponent.overclicked = true;
                    overUnderComponent.j();
                    overUnderComponent.m(1.0f, true);
                    double dA = 0.0d;
                    if (preferences.getBoolean("SPORTY_HERO_ONE_TAP", false)) {
                        overUnderComponent.binding.R.setClickable(false);
                        overUnderComponent.binding.R.setEnabled(false);
                        overUnderComponent.binding.R.setAlpha(0.5f);
                        overUnderComponent.binding.t0.setAlpha(0.5f);
                        overUnderComponent.binding.u0.setAlpha(0.5f);
                        overUnderComponent.binding.S.setClickable(false);
                        overUnderComponent.binding.S.setEnabled(false);
                        overUnderComponent.binding.S.setAlpha(0.5f);
                        overUnderComponent.binding.X0.setAlpha(0.5f);
                        overUnderComponent.binding.Y0.setAlpha(0.5f);
                        overUnderComponent.betIsWaiting = true;
                        String string = overUnderComponent.binding.T0.getText().toString();
                        if (string.length() > 0 && !string.equals("x")) {
                            dA = j560.a(1, 0, string);
                        }
                        overUnderComponent.f(0.5f, false);
                        betListener.invoke(overUnderComponent.binding.L0.getText().toString(), Double.valueOf(dA), "OVER");
                        overUnderComponent.showOverUnderBetConfirmation = false;
                    } else {
                        overUnderComponent.showOverUnderBetConfirmation = true;
                        overUnderComponent.binding.Q.setVisibility(8);
                        overUnderComponent.binding.E0.setVisibility(0);
                        String string2 = overUnderComponent.binding.T0.getText().toString();
                        if (string2 != null && string2.length() != 0 && !string2.equals("x")) {
                            dA = j560.a(1, 0, string2);
                        }
                        if (overUnderComponent.M) {
                            wz.a("BetConfirmation1", "Sporty Hero", "OVER_UNDER", "OVER", String.valueOf(dA));
                        } else {
                            wz.a("BetConfirmation2", "Sporty Hero", "OVER_UNDER", "OVER", String.valueOf(dA));
                        }
                        overUnderComponent.setPlaceBet();
                    }
                }
                return Unit.a;
            }
        });
        gr60.a(this.binding.S, new Function1() { // from class: sdz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = OverUnderComponent.b0;
                ((View) obj).getClass();
                if (((Boolean) isNotLoggedIn.invoke()).booleanValue()) {
                    openLoginDialog.invoke();
                } else {
                    OverUnderComponent overUnderComponent = this;
                    overUnderComponent.overclicked = false;
                    overUnderComponent.j();
                    overUnderComponent.r(1.0f, true);
                    double dA = 0.0d;
                    if (preferences.getBoolean("SPORTY_HERO_ONE_TAP", false)) {
                        overUnderComponent.binding.R.setClickable(false);
                        overUnderComponent.binding.R.setEnabled(false);
                        overUnderComponent.binding.R.setAlpha(0.5f);
                        overUnderComponent.binding.t0.setAlpha(0.5f);
                        overUnderComponent.binding.u0.setAlpha(0.5f);
                        overUnderComponent.binding.S.setClickable(false);
                        overUnderComponent.binding.S.setEnabled(false);
                        overUnderComponent.binding.S.setAlpha(0.5f);
                        overUnderComponent.binding.X0.setAlpha(0.5f);
                        overUnderComponent.binding.Y0.setAlpha(0.5f);
                        overUnderComponent.betIsWaiting = true;
                        String string = overUnderComponent.binding.T0.getText().toString();
                        if (string != null && string.length() != 0 && !string.equals("x")) {
                            dA = j560.a(1, 0, string);
                        }
                        overUnderComponent.f(0.5f, false);
                        betListener.invoke(overUnderComponent.binding.L0.getText().toString(), Double.valueOf(dA), "UNDER");
                        overUnderComponent.showOverUnderBetConfirmation = false;
                    } else {
                        overUnderComponent.showOverUnderBetConfirmation = true;
                        overUnderComponent.binding.Q.setVisibility(8);
                        overUnderComponent.binding.E0.setVisibility(0);
                        String string2 = overUnderComponent.binding.T0.getText().toString();
                        if (string2 != null && string2.length() != 0 && !string2.equals("x")) {
                            dA = j560.a(1, 0, string2);
                        }
                        if (overUnderComponent.M) {
                            wz.a("BetConfirmation1", "Sporty Hero", "OVER_UNDER", "UNDER", String.valueOf(dA));
                        } else {
                            wz.a("BetConfirmation2", "Sporty Hero", "OVER_UNDER", "UNDER", String.valueOf(dA));
                        }
                        overUnderComponent.setPlaceBet();
                    }
                }
                return Unit.a;
            }
        });
        gr60.a(this.binding.D0, new Function1() { // from class: udz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = OverUnderComponent.b0;
                ((View) obj).getClass();
                if (((Boolean) isNotLoggedIn.invoke()).booleanValue()) {
                    openLoginDialog.invoke();
                } else {
                    OverUnderComponent overUnderComponent = this;
                    overUnderComponent.j();
                    overUnderComponent.binding.E0.setVisibility(8);
                    overUnderComponent.binding.Q.setVisibility(0);
                    overUnderComponent.binding.R.setClickable(false);
                    overUnderComponent.binding.R.setEnabled(false);
                    overUnderComponent.binding.R.setAlpha(0.5f);
                    overUnderComponent.binding.t0.setAlpha(0.5f);
                    overUnderComponent.binding.u0.setAlpha(0.5f);
                    overUnderComponent.binding.S.setClickable(false);
                    overUnderComponent.binding.S.setEnabled(false);
                    overUnderComponent.binding.S.setAlpha(0.5f);
                    overUnderComponent.binding.X0.setAlpha(0.5f);
                    overUnderComponent.binding.Y0.setAlpha(0.5f);
                    overUnderComponent.betIsWaiting = true;
                    overUnderComponent.f(0.5f, false);
                    String string = overUnderComponent.binding.T0.getText().toString();
                    double dA = (string == null || string.length() == 0 || string.equals("x")) ? 0.0d : j560.a(1, 0, string);
                    boolean z = overUnderComponent.overclicked;
                    ru80 ru80Var = overUnderComponent.binding;
                    gaj gajVar = betListener;
                    if (z) {
                        gajVar.invoke(ru80Var.L0.getText().toString(), Double.valueOf(dA), "OVER");
                    } else {
                        gajVar.invoke(ru80Var.L0.getText().toString(), Double.valueOf(dA), "UNDER");
                    }
                    overUnderComponent.showOverUnderBetConfirmation = false;
                }
                return Unit.a;
            }
        });
    }

    public final void setBetModel(final DetailResponse gameDetailResponse, final boolean isBet1) {
        gameDetailResponse.getClass();
        this.b = gameDetailResponse;
        this.M = isBet1;
        if (this.giftItem == null) {
            double d = this.userInputAmount;
            String str = "0.00";
            if (d <= 0.0d || d < gameDetailResponse.getMinAmount()) {
                TextView textView = this.binding.L0;
                TreeMap treeMap = pw.a;
                Double dH = kotlin.text.b.h(pw.q(gameDetailResponse.getDefaultAmount()));
                if (dH != null) {
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(str);
                this.userInputAmount = tr80.a(this.binding.L0);
            } else {
                TextView textView2 = this.binding.L0;
                TreeMap treeMap2 = pw.a;
                Double dH2 = kotlin.text.b.h(pw.q(this.userInputAmount));
                if (dH2 != null) {
                    try {
                        String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH2.doubleValue());
                        str3.getClass();
                        str = str3;
                    } catch (Exception unused2) {
                    }
                }
                textView2.setText(str);
                this.userInputAmount = tr80.a(this.binding.L0);
            }
        }
        boolean z = this.fbgAvailable;
        ru80 ru80Var = this.binding;
        int i = 0;
        if (z) {
            ru80Var.W.setVisibility(0);
            this.binding.c.setVisibility(4);
            this.binding.i0.setVisibility(8);
            TextView textView3 = this.binding.d;
            TreeMap treeMap3 = pw.a;
            ajc.a((Number) gez.a(gameDetailResponse, 0), textView3);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.e);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.f);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.f0);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.g0);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.h0);
        } else {
            ru80Var.W.setVisibility(8);
            this.binding.c.setVisibility(0);
            this.binding.i0.setVisibility(8);
            TextView textView4 = this.binding.c;
            TreeMap treeMap4 = pw.a;
            ajc.a((Number) gez.a(gameDetailResponse, 0), textView4);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.d);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.e);
            ajc.a((Number) gez.a(gameDetailResponse, 3), this.binding.f);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.e0);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.f0);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.g0);
            ajc.a((Number) gez.a(gameDetailResponse, 3), this.binding.h0);
        }
        if (tr80.a(this.binding.L0) - gameDetailResponse.getStepAmount() < gameDetailResponse.getMinAmount()) {
            a(0.4f, false);
        } else {
            a(1.0f, true);
        }
        if (this.S) {
            return;
        }
        this.S = true;
        op5 op5Var = op5.a;
        ru80 ru80Var2 = this.binding;
        TextView textView5 = ru80Var2.P0;
        TextView textView6 = ru80Var2.N0;
        TextView textView7 = ru80Var2.W0;
        TextView textView8 = ru80Var2.Q0;
        TextView textView9 = ru80Var2.O0;
        TextView textView10 = ru80Var2.M0;
        TextView textView11 = ru80Var2.t0;
        TextView textView12 = ru80Var2.X0;
        TextView textView13 = ru80Var2.s0;
        SHKeypadContainer sHKeypadContainer = this.R;
        if (sHKeypadContainer == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        TextView textView14 = sHKeypadContainer.getBinding().d;
        SHKeypadContainer sHKeypadContainer2 = this.R;
        if (sHKeypadContainer2 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        op5.r(op5Var, kotlin.collections.b.f(textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, sHKeypadContainer2.getBinding().b), null, 6);
        this.binding.L0.addTextChangedListener(this.T);
        gr60.a(this.binding.W, new wdz(this, i));
        this.binding.c.setOnClickListener(new View.OnClickListener() { // from class: ydz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                boolean z2 = overUnderComponent.i;
                DetailResponse detailResponse = gameDetailResponse;
                String str4 = "0.00";
                if (z2) {
                    double dA = ql2.a(overUnderComponent.binding.L0, detailResponse.getDefaultChips().get(0).doubleValue());
                    if (dA >= detailResponse.getMinAmount() && dA <= detailResponse.getMaxAmount()) {
                        TextView textView15 = overUnderComponent.binding.L0;
                        TreeMap treeMap5 = pw.a;
                        Double dH3 = b.h(pw.q(dA));
                        if (dH3 != null) {
                            try {
                                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                                str5.getClass();
                                str4 = str5;
                            } catch (Exception unused3) {
                            }
                        }
                        textView15.setText(str4);
                    }
                    overUnderComponent.binding.e0.setVisibility(0);
                } else {
                    TextView textView16 = overUnderComponent.binding.L0;
                    TreeMap treeMap6 = pw.a;
                    Double dH4 = b.h(pw.q(((Number) gez.a(detailResponse, 0)).doubleValue()));
                    if (dH4 != null) {
                        try {
                            String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                            str6.getClass();
                            str4 = str6;
                        } catch (Exception unused4) {
                        }
                    }
                    textView16.setText(str4);
                    overUnderComponent.i = true;
                    overUnderComponent.v = false;
                    overUnderComponent.w = false;
                    overUnderComponent.y = false;
                    overUnderComponent.binding.e0.setVisibility(0);
                    overUnderComponent.binding.f0.setVisibility(8);
                    overUnderComponent.binding.g0.setVisibility(8);
                    overUnderComponent.binding.h0.setVisibility(8);
                }
                if (isBet1) {
                    wz.a("Bet1Chip1Click", "Sporty Hero", "OVER_UNDER");
                } else {
                    wz.a("Bet2Chip1Click", "Sporty Hero", "OVER_UNDER");
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.performClick();
                if (tr80.a(overUnderComponent.binding.L0) - detailResponse.getStepAmount() < detailResponse.getMinAmount()) {
                    overUnderComponent.a(0.4f, false);
                } else {
                    overUnderComponent.a(1.0f, true);
                }
                if (detailResponse.getStepAmount() + tr80.a(overUnderComponent.binding.L0) > detailResponse.getMaxAmount()) {
                    overUnderComponent.b(0.4f, false);
                } else {
                    overUnderComponent.b(1.0f, true);
                }
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
                overUnderComponent.getOnBetChipSelected().invoke(1);
            }
        });
        this.binding.d.setOnClickListener(new View.OnClickListener() { // from class: aez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                int i2 = !overUnderComponent.fbgAvailable ? 1 : 0;
                boolean z2 = overUnderComponent.v;
                DetailResponse detailResponse = gameDetailResponse;
                String str4 = "0.00";
                if (z2) {
                    double dA = ql2.a(overUnderComponent.binding.L0, detailResponse.getDefaultChips().get(i2).doubleValue());
                    if (dA >= detailResponse.getMinAmount() && dA <= detailResponse.getMaxAmount()) {
                        TextView textView15 = overUnderComponent.binding.L0;
                        TreeMap treeMap5 = pw.a;
                        Double dH3 = b.h(pw.q(dA));
                        if (dH3 != null) {
                            try {
                                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                                str5.getClass();
                                str4 = str5;
                            } catch (Exception unused3) {
                            }
                        }
                        textView15.setText(str4);
                    }
                    overUnderComponent.binding.f0.setVisibility(0);
                } else {
                    TextView textView16 = overUnderComponent.binding.L0;
                    TreeMap treeMap6 = pw.a;
                    Double dH4 = b.h(pw.q(((Number) gez.a(detailResponse, i2)).doubleValue()));
                    if (dH4 != null) {
                        try {
                            String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                            str6.getClass();
                            str4 = str6;
                        } catch (Exception unused4) {
                        }
                    }
                    textView16.setText(str4);
                    overUnderComponent.i = false;
                    overUnderComponent.v = true;
                    overUnderComponent.w = false;
                    overUnderComponent.y = false;
                    overUnderComponent.binding.e0.setVisibility(8);
                    overUnderComponent.binding.f0.setVisibility(0);
                    overUnderComponent.binding.g0.setVisibility(8);
                    overUnderComponent.binding.h0.setVisibility(8);
                }
                if (isBet1) {
                    wz.a("Bet1Chip2Click", "Sporty Hero", "OVER_UNDER");
                } else {
                    wz.a("Bet2Chip2Click", "Sporty Hero", "OVER_UNDER");
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.performClick();
                if (tr80.a(overUnderComponent.binding.L0) - detailResponse.getStepAmount() < detailResponse.getMinAmount()) {
                    overUnderComponent.a(0.4f, false);
                } else {
                    overUnderComponent.a(1.0f, true);
                }
                if (detailResponse.getStepAmount() + tr80.a(overUnderComponent.binding.L0) > detailResponse.getMaxAmount()) {
                    overUnderComponent.b(0.4f, false);
                } else {
                    overUnderComponent.b(1.0f, true);
                }
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
                overUnderComponent.getOnBetChipSelected().invoke(2);
            }
        });
        this.binding.e.setOnClickListener(new View.OnClickListener() { // from class: cez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                int i2 = overUnderComponent.fbgAvailable ? 1 : 2;
                boolean z2 = overUnderComponent.w;
                DetailResponse detailResponse = gameDetailResponse;
                String str4 = "0.00";
                if (z2) {
                    double dA = ql2.a(overUnderComponent.binding.L0, detailResponse.getDefaultChips().get(i2).doubleValue());
                    if (dA >= detailResponse.getMinAmount() && dA <= detailResponse.getMaxAmount()) {
                        TextView textView15 = overUnderComponent.binding.L0;
                        TreeMap treeMap5 = pw.a;
                        Double dH3 = b.h(pw.q(dA));
                        if (dH3 != null) {
                            try {
                                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                                str5.getClass();
                                str4 = str5;
                            } catch (Exception unused3) {
                            }
                        }
                        textView15.setText(str4);
                    }
                    overUnderComponent.binding.g0.setVisibility(0);
                } else {
                    TextView textView16 = overUnderComponent.binding.L0;
                    TreeMap treeMap6 = pw.a;
                    Double dH4 = b.h(pw.q(((Number) gez.a(detailResponse, i2)).doubleValue()));
                    if (dH4 != null) {
                        try {
                            String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                            str6.getClass();
                            str4 = str6;
                        } catch (Exception unused4) {
                        }
                    }
                    textView16.setText(str4);
                    overUnderComponent.i = false;
                    overUnderComponent.v = false;
                    overUnderComponent.w = true;
                    overUnderComponent.y = false;
                    overUnderComponent.binding.e0.setVisibility(8);
                    overUnderComponent.binding.f0.setVisibility(8);
                    overUnderComponent.binding.g0.setVisibility(0);
                    overUnderComponent.binding.h0.setVisibility(8);
                }
                if (isBet1) {
                    wz.a("Bet1Chip3Click", "Sporty Hero", "OVER_UNDER");
                } else {
                    wz.a("Bet2Chip3Click", "Sporty Hero", "OVER_UNDER");
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.performClick();
                if (tr80.a(overUnderComponent.binding.L0) - detailResponse.getStepAmount() < detailResponse.getMinAmount()) {
                    overUnderComponent.a(0.4f, false);
                } else {
                    overUnderComponent.a(1.0f, true);
                }
                if (detailResponse.getStepAmount() + tr80.a(overUnderComponent.binding.L0) > detailResponse.getMaxAmount()) {
                    overUnderComponent.b(0.4f, false);
                } else {
                    overUnderComponent.b(1.0f, true);
                }
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
                overUnderComponent.getOnBetChipSelected().invoke(3);
            }
        });
        this.binding.f.setOnClickListener(new View.OnClickListener() { // from class: eez
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                int i2 = overUnderComponent.fbgAvailable ? 2 : 3;
                boolean z2 = overUnderComponent.y;
                DetailResponse detailResponse = gameDetailResponse;
                String str4 = "0.00";
                if (z2) {
                    double dA = ql2.a(overUnderComponent.binding.L0, detailResponse.getDefaultChips().get(i2).doubleValue());
                    if (dA >= detailResponse.getMinAmount() && dA <= detailResponse.getMaxAmount()) {
                        TextView textView15 = overUnderComponent.binding.L0;
                        TreeMap treeMap5 = pw.a;
                        Double dH3 = b.h(pw.q(dA));
                        if (dH3 != null) {
                            try {
                                String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                                str5.getClass();
                                str4 = str5;
                            } catch (Exception unused3) {
                            }
                        }
                        textView15.setText(str4);
                    }
                    overUnderComponent.binding.h0.setVisibility(0);
                } else {
                    TextView textView16 = overUnderComponent.binding.L0;
                    TreeMap treeMap6 = pw.a;
                    Double dH4 = b.h(pw.q(((Number) gez.a(detailResponse, i2)).doubleValue()));
                    if (dH4 != null) {
                        try {
                            String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                            str6.getClass();
                            str4 = str6;
                        } catch (Exception unused4) {
                        }
                    }
                    textView16.setText(str4);
                    overUnderComponent.i = false;
                    overUnderComponent.v = false;
                    overUnderComponent.w = false;
                    overUnderComponent.y = true;
                    overUnderComponent.binding.e0.setVisibility(8);
                    overUnderComponent.binding.f0.setVisibility(8);
                    overUnderComponent.binding.g0.setVisibility(8);
                    overUnderComponent.binding.h0.setVisibility(0);
                }
                if (isBet1) {
                    wz.a("Bet1Chip4Click", "Sporty Hero", "OVER_UNDER");
                } else {
                    wz.a("Bet2Chip4Click", "Sporty Hero", "OVER_UNDER");
                }
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                sHKeypadContainer3.performClick();
                if (tr80.a(overUnderComponent.binding.L0) - detailResponse.getStepAmount() < detailResponse.getMinAmount()) {
                    overUnderComponent.a(0.4f, false);
                } else {
                    overUnderComponent.a(1.0f, true);
                }
                if (detailResponse.getStepAmount() + tr80.a(overUnderComponent.binding.L0) > detailResponse.getMaxAmount()) {
                    overUnderComponent.b(0.4f, false);
                } else {
                    overUnderComponent.b(1.0f, true);
                }
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
                overUnderComponent.getOnBetChipSelected().invoke(4);
            }
        });
        this.binding.H0.setOnClickListener(new View.OnClickListener() { // from class: mcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = OverUnderComponent.b0;
                OverUnderComponent overUnderComponent = this.a;
                overUnderComponent.j();
                SHKeypadContainer sHKeypadContainer3 = overUnderComponent.R;
                if (sHKeypadContainer3 != null) {
                    sHKeypadContainer3.performClick();
                } else {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
            }
        });
        gr60.a(this.binding.A0, new Function1() { // from class: ocz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i2 = OverUnderComponent.b0;
                ((View) obj).getClass();
                Function1<? super Boolean, Unit> function1 = this.a.O;
                if (function1 != null) {
                    function1.invoke(Boolean.FALSE);
                    return Unit.a;
                }
                Intrinsics.n("onFbgClick");
                throw null;
            }
        });
    }

    public final void setBetPlaced(boolean z) {
        this.betPlaced = z;
    }

    public final void setBetStepListener(final Function1<? super String, Unit> betStepListener) {
        betStepListener.getClass();
        SHKeypadContainer sHKeypadContainer = this.R;
        if (sHKeypadContainer == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        int i = 0;
        sHKeypadContainer.setDoneClick(new hdz(this, i));
        SHKeypadContainer sHKeypadContainer2 = this.R;
        if (sHKeypadContainer2 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        int i2 = 1;
        sHKeypadContainer2.setClearClick(new qxk(this, 1));
        SHKeypadContainer sHKeypadContainer3 = this.R;
        if (sHKeypadContainer3 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        sHKeypadContainer3.setCrossClick(new kdz(this, i));
        final dq40 dq40Var = new dq40();
        dq40Var.a = "";
        final dq40 dq40Var2 = new dq40();
        dq40Var2.a = "";
        SHKeypadContainer sHKeypadContainer4 = this.R;
        if (sHKeypadContainer4 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        sHKeypadContainer4.setDoubleZeroClick(new Function0() { // from class: mdz
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v11, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v17, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.CharSequence, java.lang.String] */
            /* JADX WARN: Type inference failed for: r1v31, types: [T, java.lang.CharSequence, java.lang.String] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                String str;
                String str2;
                String str3;
                String str4;
                TextView textView;
                OverUnderComponent overUnderComponent = this.a;
                int i3 = overUnderComponent.z;
                ru80 ru80Var = overUnderComponent.binding;
                if (i3 == 2) {
                    ?? A = pl2.a(overUnderComponent.binding.T0, 1, ru80Var.T0.getText().toString(), 0);
                    int length = A.length();
                    dq40 dq40Var3 = dq40Var2;
                    if (!(length == 0 || Double.parseDouble(A) == 0.0d) || StringsKt.M(A, ".", false)) {
                        if (!StringsKt.M(A, ".", false)) {
                            dq40Var3.a = A;
                            textView = overUnderComponent.binding.T0;
                        } else if (((String) StringsKt__StringsKt.split$default(A, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
                            dq40Var3.a = A;
                            k560.a(overUnderComponent.binding.T0, A, "x");
                        } else if (((CharSequence) StringsKt__StringsKt.split$default(A, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
                            dq40Var3.a = A;
                            textView = overUnderComponent.binding.T0;
                        }
                        k560.a(textView, A, "00x");
                    } else {
                        dq40Var3.a = "0";
                        overUnderComponent.binding.T0.setText("0x");
                    }
                    if (((CharSequence) dq40Var3.a).length() > 0) {
                        double d = Double.parseDouble((String) dq40Var3.a);
                        SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                        if (sideBetConfigsList == null) {
                            Intrinsics.n("sideBetConfigsList");
                            throw null;
                        }
                        if (d >= sideBetConfigsList.getMaxCoefficient()) {
                            TextView textView2 = overUnderComponent.binding.T0;
                            TreeMap treeMap = pw.a;
                            SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                            if (sideBetConfigsList2 == null) {
                                Intrinsics.n("sideBetConfigsList");
                                throw null;
                            }
                            textView2.setText(pw.q(sideBetConfigsList2.getMaxCoefficient()).concat("x"));
                        }
                    }
                } else {
                    ?? string = ru80Var.L0.getText().toString();
                    int length2 = string.length();
                    dq40 dq40Var4 = dq40Var;
                    String str5 = "0.00";
                    if ((length2 == 0 || Double.parseDouble(string) == 0.0d) && !StringsKt.M(string, ".", false)) {
                        dq40Var4.a = "0";
                        TextView textView3 = overUnderComponent.binding.L0;
                        Double dH = b.h("0");
                        if (dH != null) {
                            try {
                                str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                                str.getClass();
                            } catch (Exception unused) {
                                str = "0.00";
                            }
                        } else {
                            str = "0.00";
                        }
                        textView3.setText(str);
                    } else if (!StringsKt.M(string, ".", false)) {
                        ?? Concat = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                        dq40Var4.a = Concat;
                        TextView textView4 = overUnderComponent.binding.L0;
                        Double dH2 = b.h(Concat);
                        if (dH2 != null) {
                            try {
                                str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH2.doubleValue());
                                str2.getClass();
                            } catch (Exception unused2) {
                                str2 = "0.00";
                            }
                        } else {
                            str2 = "0.00";
                        }
                        textView4.setText(str2);
                    } else if (((String) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
                        dq40Var4.a = string;
                        TextView textView5 = overUnderComponent.binding.L0;
                        Double dH3 = b.h(string);
                        if (dH3 != null) {
                            try {
                                str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH3.doubleValue());
                                str4.getClass();
                            } catch (Exception unused3) {
                                str4 = "0.00";
                            }
                        } else {
                            str4 = "0.00";
                        }
                        textView5.setText(str4);
                    } else if (((CharSequence) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
                        ?? Concat2 = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                        dq40Var4.a = Concat2;
                        TextView textView6 = overUnderComponent.binding.L0;
                        Double dH4 = b.h(Concat2);
                        if (dH4 != null) {
                            try {
                                str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH4.doubleValue());
                                str3.getClass();
                            } catch (Exception unused4) {
                                str3 = "0.00";
                            }
                        } else {
                            str3 = "0.00";
                        }
                        textView6.setText(str3);
                    }
                    if (((CharSequence) dq40Var4.a).length() > 0) {
                        double d2 = Double.parseDouble((String) dq40Var4.a);
                        DetailResponse detailResponse = overUnderComponent.b;
                        if (detailResponse == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d2 >= detailResponse.getMaxAmount()) {
                            TextView textView7 = overUnderComponent.binding.L0;
                            TreeMap treeMap2 = pw.a;
                            DetailResponse detailResponse2 = overUnderComponent.b;
                            if (detailResponse2 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            Double dH5 = b.h(pw.q(detailResponse2.getMaxAmount()));
                            if (dH5 != null) {
                                try {
                                    String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH5.doubleValue());
                                    str6.getClass();
                                    str5 = str6;
                                } catch (Exception unused5) {
                                }
                            }
                            textView7.setText(str5);
                        }
                    }
                }
                return Unit.a;
            }
        });
        SHKeypadContainer sHKeypadContainer5 = this.R;
        if (sHKeypadContainer5 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        sHKeypadContainer5.setNumberClick(new gyk(this, i2));
        SHKeypadContainer sHKeypadContainer6 = this.R;
        if (sHKeypadContainer6 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        sHKeypadContainer6.setPointClick(new odz(this, i));
        SHKeypadContainer sHKeypadContainer7 = this.R;
        if (sHKeypadContainer7 == null) {
            Intrinsics.n("ouKeypad");
            throw null;
        }
        sHKeypadContainer7.setOnClickListener(new View.OnClickListener() { // from class: qdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SHKeypadContainer sHKeypadContainer8;
                OverUnderComponent overUnderComponent = this.a;
                SHKeypadContainer sHKeypadContainer9 = overUnderComponent.R;
                if (sHKeypadContainer9 == null) {
                    Intrinsics.n("ouKeypad");
                    throw null;
                }
                if (sHKeypadContainer9.getVisibility() == 0) {
                    SHKeypadContainer sHKeypadContainer10 = overUnderComponent.R;
                    if (sHKeypadContainer10 == null) {
                        Intrinsics.n("ouKeypad");
                        throw null;
                    }
                    sHKeypadContainer10.setVisibility(8);
                    try {
                        overUnderComponent.o();
                        overUnderComponent.q();
                        sHKeypadContainer8 = overUnderComponent.R;
                        if (sHKeypadContainer8 == null) {
                            Intrinsics.n("ouKeypad");
                            throw null;
                        }
                    } catch (Exception unused) {
                        overUnderComponent.q();
                        sHKeypadContainer8 = overUnderComponent.R;
                        if (sHKeypadContainer8 == null) {
                            Intrinsics.n("ouKeypad");
                            throw null;
                        }
                    } catch (Throwable th) {
                        overUnderComponent.q();
                        SHKeypadContainer sHKeypadContainer11 = overUnderComponent.R;
                        if (sHKeypadContainer11 == null) {
                            Intrinsics.n("ouKeypad");
                            throw null;
                        }
                        sHKeypadContainer11.setVisibility(8);
                        overUnderComponent.z = 0;
                        throw th;
                    }
                    sHKeypadContainer8.setVisibility(8);
                    overUnderComponent.z = 0;
                }
            }
        });
        q();
        this.binding.G.setOnClickListener(new View.OnClickListener() { // from class: qcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                double dA = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse = overUnderComponent.b;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA <= detailResponse.getMinAmount()) {
                    return;
                }
                if (overUnderComponent.M) {
                    wz.a("StepAmountMinus1", "Sporty Hero", "OVER_UNDER");
                } else {
                    wz.a("StepAmountMinus2", "Sporty Hero", "OVER_UNDER");
                }
                double dA2 = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse2 = overUnderComponent.b;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double stepAmount = dA2 - detailResponse2.getStepAmount();
                DetailResponse detailResponse3 = overUnderComponent.b;
                if (detailResponse3 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (stepAmount <= detailResponse3.getMinAmount()) {
                    DetailResponse detailResponse4 = overUnderComponent.b;
                    if (detailResponse4 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    stepAmount = detailResponse4.getMinAmount();
                }
                TextView textView = overUnderComponent.binding.L0;
                TreeMap treeMap = pw.a;
                Double dH = b.h(pw.q(stepAmount));
                String str = "0.00";
                if (dH != null) {
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(str);
                double dA3 = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse5 = overUnderComponent.b;
                if (detailResponse5 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA3 <= detailResponse5.getMinAmount()) {
                    overUnderComponent.a(0.4f, false);
                } else {
                    overUnderComponent.a(1.0f, true);
                }
                double dA4 = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse6 = overUnderComponent.b;
                if (detailResponse6 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA4 >= detailResponse6.getMaxAmount()) {
                    overUnderComponent.b(0.4f, false);
                } else {
                    overUnderComponent.b(1.0f, true);
                }
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
                betStepListener.invoke("Decrease");
            }
        });
        this.binding.I.setOnClickListener(new View.OnClickListener() { // from class: tcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                double dA = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse = overUnderComponent.b;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA >= detailResponse.getMaxAmount()) {
                    return;
                }
                if (overUnderComponent.M) {
                    wz.a("StepAmountPlus1", "Sporty Hero", "OVER_UNDER");
                } else {
                    wz.a("StepAmountPlus2", "Sporty Hero", "OVER_UNDER");
                }
                double dA2 = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse2 = overUnderComponent.b;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double stepAmount = detailResponse2.getStepAmount() + dA2;
                DetailResponse detailResponse3 = overUnderComponent.b;
                if (detailResponse3 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (stepAmount >= detailResponse3.getMaxAmount()) {
                    DetailResponse detailResponse4 = overUnderComponent.b;
                    if (detailResponse4 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    stepAmount = detailResponse4.getMaxAmount();
                }
                TextView textView = overUnderComponent.binding.L0;
                TreeMap treeMap = pw.a;
                Double dH = b.h(pw.q(stepAmount));
                String str = "0.00";
                if (dH != null) {
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(str);
                double dA3 = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse5 = overUnderComponent.b;
                if (detailResponse5 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA3 <= detailResponse5.getMinAmount()) {
                    overUnderComponent.a(0.4f, false);
                } else {
                    overUnderComponent.a(1.0f, true);
                }
                double dA4 = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse6 = overUnderComponent.b;
                if (detailResponse6 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA4 >= detailResponse6.getMaxAmount()) {
                    overUnderComponent.b(0.4f, false);
                } else {
                    overUnderComponent.b(1.0f, true);
                }
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
                betStepListener.invoke("Decrease");
            }
        });
        this.binding.E.setOnClickListener(new View.OnClickListener() { // from class: vcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                double dA = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse = overUnderComponent.b;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA <= detailResponse.getMinAmount()) {
                    return;
                }
                wz.a("BetAmountMinClick", "Sporty Hero", "OVER_UNDER");
                TextView textView = overUnderComponent.binding.L0;
                TreeMap treeMap = pw.a;
                DetailResponse detailResponse2 = overUnderComponent.b;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                Double dH = b.h(pw.q(detailResponse2.getMinAmount()));
                String str = "0.00";
                if (dH != null) {
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(str);
                overUnderComponent.a(0.4f, false);
                overUnderComponent.b(1.0f, true);
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
            }
        });
        this.binding.C.setOnClickListener(new View.OnClickListener() { // from class: xcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                double dA = tr80.a(overUnderComponent.binding.L0);
                DetailResponse detailResponse = overUnderComponent.b;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA >= detailResponse.getMaxAmount()) {
                    return;
                }
                wz.a("BetAmountMaxClick", "Sporty Hero", "OVER_UNDER");
                TextView textView = overUnderComponent.binding.L0;
                TreeMap treeMap = pw.a;
                DetailResponse detailResponse2 = overUnderComponent.b;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                Double dH = b.h(pw.q(detailResponse2.getMaxAmount()));
                String str = "0.00";
                if (dH != null) {
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                }
                textView.setText(str);
                overUnderComponent.b(0.4f, false);
                overUnderComponent.a(1.0f, true);
                overUnderComponent.userInputAmount = tr80.a(overUnderComponent.binding.L0);
            }
        });
        this.binding.D.setOnClickListener(new View.OnClickListener() { // from class: zcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                double dA = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA >= sideBetConfigsList.getMaxCoefficient()) {
                    return;
                }
                wz.a("CoefficientMaxClick", "Sporty Hero", "OVER_UNDER");
                TextView textView = overUnderComponent.binding.T0;
                TreeMap treeMap = pw.a;
                SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                if (sideBetConfigsList2 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                textView.setText(pw.q(sideBetConfigsList2.getMaxCoefficient()).concat("x"));
                overUnderComponent.e(0.4f, false);
                overUnderComponent.d(1.0f, true);
            }
        });
        this.binding.F.setOnClickListener(new zm2(this, i2));
        this.binding.H.setOnClickListener(new tbg(this, i2));
        this.binding.J.setOnClickListener(new View.OnClickListener() { // from class: ddz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OverUnderComponent overUnderComponent = this.a;
                double dA = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList = overUnderComponent.c;
                if (sideBetConfigsList == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA >= sideBetConfigsList.getMaxCoefficient()) {
                    return;
                }
                wz.a("CoefficientPlusClick", "Sporty Hero", "OVER_UNDER");
                TextView textView = overUnderComponent.binding.T0;
                TreeMap treeMap = pw.a;
                double dA2 = hez.a(overUnderComponent.binding.T0, 1, textView.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList2 = overUnderComponent.c;
                if (sideBetConfigsList2 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                textView.setText(pw.q(sideBetConfigsList2.getStepValue() + dA2).concat("x"));
                double dA3 = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList3 = overUnderComponent.c;
                if (sideBetConfigsList3 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA3 <= sideBetConfigsList3.getMinCoefficient()) {
                    overUnderComponent.d(0.4f, false);
                } else {
                    if (hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0) > overUnderComponent.Q || overUnderComponent.giftItem == null) {
                        overUnderComponent.d(1.0f, true);
                    } else {
                        overUnderComponent.d(0.4f, false);
                    }
                }
                double dA4 = hez.a(overUnderComponent.binding.T0, 1, overUnderComponent.binding.T0.getText().toString(), 0);
                SideBetConfigsList sideBetConfigsList4 = overUnderComponent.c;
                if (sideBetConfigsList4 == null) {
                    Intrinsics.n("sideBetConfigsList");
                    throw null;
                }
                if (dA4 >= sideBetConfigsList4.getMaxCoefficient()) {
                    overUnderComponent.e(0.4f, false);
                } else {
                    overUnderComponent.e(1.0f, true);
                }
            }
        });
        gr60.a(this.binding.n0, new pkb(this, i2));
        gr60.a(this.binding.m0, new rkb(this, 2));
        this.binding.T.setOnClickListener(new View.OnClickListener() { // from class: rcz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = OverUnderComponent.b0;
                OverUnderComponent overUnderComponent = this.a;
                overUnderComponent.j();
                overUnderComponent.i();
                overUnderComponent.showOverUnderBetConfirmation = false;
            }
        });
    }

    public final void setBetType(String str) {
        this.betType = str;
    }

    public final void setBinding(ru80 ru80Var) {
        ru80Var.getClass();
        this.binding = ru80Var;
    }

    public final void setCashoutDone(boolean z) {
        this.cashoutDone = z;
    }

    public final void setCashoutInProgress(boolean z) {
        this.cashoutInProgress = z;
    }

    public final void setCoeffModel(SideBetConfigsList sideBetConfigsList, double ouMinFBGUsageThreshold) {
        Double d;
        sideBetConfigsList.getClass();
        double dDoubleValue = 0.0d;
        if (ouMinFBGUsageThreshold == 0.0d) {
            this.Q = sideBetConfigsList.getMinCoefficient();
        } else {
            this.Q = ouMinFBGUsageThreshold;
        }
        this.c = sideBetConfigsList;
        this.binding.T0.addTextChangedListener(this.U);
        TextView textView = this.binding.T0;
        TreeMap treeMap = pw.a;
        textView.setText(pw.q(sideBetConfigsList.getDefaultCoefficient()).concat("x"));
        if (hez.a(this.binding.T0, 1, this.binding.T0.getText().toString(), 0) - sideBetConfigsList.getStepValue() < sideBetConfigsList.getMinCoefficient()) {
            d(0.4f, false);
        } else if (hez.a(this.binding.T0, 1, this.binding.T0.getText().toString(), 0) - sideBetConfigsList.getStepValue() >= ouMinFBGUsageThreshold || this.giftItem == null) {
            d(1.0f, true);
        } else {
            d(0.4f, false);
        }
        TextView textView2 = this.binding.Y0;
        op5 op5Var = op5.a;
        String string = getContext().getString(R.string.pays_text_cms);
        string.getClass();
        op5Var.getClass();
        String strB = op5.b(string, "Pays", null);
        HashMap<Double, Double> map = this.underFetchDetail;
        if (map != null && (d = map.get(Double.valueOf(sideBetConfigsList.getDefaultCoefficient()))) != null) {
            dDoubleValue = d.doubleValue();
        }
        textView2.setText(tx5.a("(", strB, " ", pw.q(dDoubleValue), "x)"));
        TextView textView3 = this.binding.u0;
        String string2 = getContext().getString(R.string.pays_text_cms);
        string2.getClass();
        textView3.setText(tx5.a("(", op5.b(string2, "Pays", null), " ", pw.q(sideBetConfigsList.getDefaultCoefficient()), "x)"));
    }

    public final void setDisableContainer(boolean isClick, float alpha, int visibility) {
        this.binding.G.setVisibility(visibility);
        this.binding.R0.setVisibility(visibility);
        this.binding.E.setVisibility(visibility);
        this.binding.P0.setVisibility(visibility);
        this.binding.I.setVisibility(visibility);
        this.binding.U0.setVisibility(visibility);
        this.binding.C.setVisibility(visibility);
        this.binding.N0.setVisibility(visibility);
        this.binding.m0.setClickable(isClick);
        this.binding.m0.setEnabled(isClick);
        if (this.giftItem != null && this.betPlaced) {
            this.binding.L0.setAlpha(alpha);
            this.binding.X.setAlpha(alpha);
        }
        if (this.giftItem == null) {
            this.binding.b.setAlpha(alpha);
            this.binding.X.setAlpha(alpha);
        }
        this.binding.c.setClickable(isClick);
        this.binding.c.setEnabled(isClick);
        this.binding.d.setClickable(isClick);
        this.binding.d.setEnabled(isClick);
        this.binding.e.setClickable(isClick);
        this.binding.e.setEnabled(isClick);
        this.binding.f.setClickable(isClick);
        this.binding.f.setEnabled(isClick);
        ru80 ru80Var = this.binding;
        if (isClick) {
            ru80Var.A0.setVisibility(8);
            this.binding.x0.setVisibility(8);
            this.binding.y0.setVisibility(8);
            this.binding.z0.setVisibility(8);
            return;
        }
        ru80Var.A0.setVisibility(0);
        this.binding.x0.setVisibility(0);
        this.binding.y0.setVisibility(0);
        this.binding.z0.setVisibility(0);
    }

    public final void setErrorShowLiveData(ssw<Boolean> sswVar) {
        sswVar.getClass();
        this.errorShowLiveData = sswVar;
    }

    public final void setFBG(GiftItem giftItem, boolean betPlaced, double amount) {
        giftItem.getClass();
        this.giftItem = giftItem;
        this.giftAmount = Double.valueOf(amount);
        this.binding.U.setVisibility(0);
        this.binding.V.setVisibility(0);
        ru80 ru80Var = this.binding;
        if (betPlaced) {
            ru80Var.j0.setBackground(getContext().getDrawable(R.drawable.ou_range_bet_gift_placed_bet));
            this.binding.U.setEnabled(false);
            this.binding.U.setClickable(false);
            this.binding.V.setEnabled(false);
            this.binding.U.setClickable(false);
        } else {
            ru80Var.j0.setBackground(getContext().getDrawable(R.drawable.ou_range_bet_gift));
            this.binding.U.setEnabled(true);
            this.binding.U.setClickable(true);
            this.binding.V.setEnabled(true);
            this.binding.U.setClickable(true);
        }
        this.binding.X.setVisibility(0);
        setDisableContainer(false, 0.5f, 8);
        TextView textView = this.binding.L0;
        TreeMap treeMap = pw.a;
        Double dH = kotlin.text.b.h(pw.q(amount));
        String str = "0.00";
        if (dH != null) {
            try {
                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dH.doubleValue());
                str2.getClass();
                str = str2;
            } catch (Exception unused) {
            }
        }
        textView.setText(str);
        setPlaceBet();
        this.binding.e0.setVisibility(8);
        this.binding.f0.setVisibility(8);
        this.binding.g0.setVisibility(8);
        this.binding.h0.setVisibility(8);
        double d = this.Q;
        if (d != 0.0d) {
            this.binding.k0.setVisibility(0);
            TextView textView2 = this.binding.I0;
            op5 op5Var = op5.a;
            String string = getContext().getString(R.string.min_coeff_fbg_cms);
            string.getClass();
            textView2.setText(op5.c(op5Var, string, "Min Coeff for Gift:"));
            hu1.b(" ", pw.q(d), "x", this.binding.J0);
            if (this.Q != 0.0d && this.binding.T0.getText().toString().length() > 0) {
                double dA = hez.a(this.binding.T0, 1, this.binding.T0.getText().toString(), 0);
                double d2 = this.Q;
                ru80 ru80Var2 = this.binding;
                if (dA <= d2) {
                    pr7.b(d2, "x", ru80Var2.T0);
                } else {
                    pr7.b(dA, "x", ru80Var2.T0);
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = this.binding.X.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins((int) getResources().getDimension(R.dimen._12sdp), (int) getResources().getDimension(R.dimen._8sdp), (int) getResources().getDimension(R.dimen._6sdp), (int) getResources().getDimension(R.dimen._2sdp));
        this.binding.X.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.binding.L0.getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.setMargins((int) getResources().getDimension(R.dimen._12sdp), (int) getResources().getDimension(R.dimen._8sdp), 0, 0);
        this.binding.L0.setLayoutParams(layoutParams4);
    }

    public final void setFBGRemoveListener(final Function0<Unit> removeFBGListener) {
        removeFBGListener.getClass();
        gr60.a(this.binding.U, new Function1() { // from class: cdz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = OverUnderComponent.b0;
                ((View) obj).getClass();
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("FBGRemoved", krh0.e(str), new String[0]);
                this.a.n();
                removeFBGListener.invoke();
                return Unit.a;
            }
        });
    }

    public final void setFbgAvailable(boolean z) {
        this.fbgAvailable = z;
    }

    public final void setFbgClickListener(Function1<? super Boolean, Unit> listener) {
        listener.getClass();
        this.O = listener;
    }

    public final void setFbgRoundId(long j) {
        this.fbgRoundId = j;
    }

    public final void setGiftAmount(Double d) {
        this.giftAmount = d;
    }

    public final void setGiftItem(GiftItem giftItem) {
        this.giftItem = giftItem;
    }

    public final void setMinThreshold(double value) {
        this.Q = value;
    }

    public final void setNestedDimensions(boolean tournamentBannerVisible, float deviceHeight, float deviceWidth) {
        Map mapG = tournamentBannerVisible ? uu80.g(deviceHeight, deviceWidth) : uu80.f(deviceHeight, deviceWidth);
        Map mapE = tournamentBannerVisible ? uu80.e(deviceHeight, deviceWidth) : uu80.d(deviceHeight, deviceWidth);
        ViewGroup.LayoutParams layoutParams = this.binding.d1.getLayoutParams();
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Float f = (Float) mapG.get("view2_space");
        layoutParams2.S = f != null ? f.floatValue() : 0.06f;
        this.binding.d1.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.binding.j0.getLayoutParams();
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        Float f2 = (Float) mapG.get("layout_amount_height");
        layoutParams4.S = f2 != null ? f2.floatValue() : 0.18f;
        Float f3 = (Float) mapG.get("layout_amount_width");
        layoutParams4.R = f3 != null ? f3.floatValue() : 0.87f;
        this.binding.j0.setLayoutParams(layoutParams4);
        ViewGroup.LayoutParams layoutParams5 = this.binding.K.getLayoutParams();
        layoutParams5.getClass();
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        Float f4 = (Float) mapG.get("layout_amount_height");
        layoutParams6.S = f4 != null ? f4.floatValue() : 0.18f;
        Float f5 = (Float) mapG.get("layout_amount_width");
        layoutParams6.R = f5 != null ? f5.floatValue() : 0.87f;
        this.binding.K.setLayoutParams(layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = this.binding.B0.getLayoutParams();
        layoutParams7.getClass();
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        Float f6 = (Float) mapG.get("layout_amount_height");
        layoutParams8.S = f6 != null ? f6.floatValue() : 0.18f;
        Float f7 = (Float) mapG.get("layout_amount_width");
        layoutParams8.R = f7 != null ? f7.floatValue() : 0.87f;
        this.binding.B0.setLayoutParams(layoutParams8);
        ViewGroup.LayoutParams layoutParams9 = this.binding.E.getLayoutParams();
        layoutParams9.getClass();
        ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
        Float f8 = (Float) mapG.get("min_bg_height");
        layoutParams10.S = f8 != null ? f8.floatValue() : 0.75f;
        Float f9 = (Float) mapG.get("min_bg_width");
        layoutParams10.R = f9 != null ? f9.floatValue() : 0.118f;
        this.binding.E.setLayoutParams(layoutParams10);
        ViewGroup.LayoutParams layoutParams11 = this.binding.G.getLayoutParams();
        layoutParams11.getClass();
        ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
        Float f10 = (Float) mapG.get("min_bg_height");
        layoutParams12.S = f10 != null ? f10.floatValue() : 0.75f;
        Float f11 = (Float) mapG.get("min_bg_width");
        layoutParams12.R = f11 != null ? f11.floatValue() : 0.118f;
        this.binding.G.setLayoutParams(layoutParams12);
        ViewGroup.LayoutParams layoutParams13 = this.binding.I.getLayoutParams();
        layoutParams13.getClass();
        ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
        Float f12 = (Float) mapG.get("min_bg_height");
        layoutParams14.S = f12 != null ? f12.floatValue() : 0.75f;
        Float f13 = (Float) mapG.get("min_bg_width");
        layoutParams14.R = f13 != null ? f13.floatValue() : 0.118f;
        this.binding.I.setLayoutParams(layoutParams14);
        ViewGroup.LayoutParams layoutParams15 = this.binding.C.getLayoutParams();
        layoutParams15.getClass();
        ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
        Float f14 = (Float) mapG.get("min_bg_height");
        layoutParams16.S = f14 != null ? f14.floatValue() : 0.75f;
        Float f15 = (Float) mapG.get("min_bg_width");
        layoutParams16.R = f15 != null ? f15.floatValue() : 0.118f;
        this.binding.C.setLayoutParams(layoutParams16);
        ViewGroup.LayoutParams layoutParams17 = this.binding.U.getLayoutParams();
        layoutParams17.getClass();
        ConstraintLayout.LayoutParams layoutParams18 = (ConstraintLayout.LayoutParams) layoutParams17;
        Float f16 = (Float) mapG.get("min_bg_height");
        layoutParams18.S = f16 != null ? f16.floatValue() : 0.75f;
        Float f17 = (Float) mapG.get("min_bg_width");
        layoutParams18.R = f17 != null ? f17.floatValue() : 0.118f;
        this.binding.U.setLayoutParams(layoutParams18);
        ViewGroup.LayoutParams layoutParams19 = this.binding.V.getLayoutParams();
        layoutParams19.getClass();
        ConstraintLayout.LayoutParams layoutParams20 = (ConstraintLayout.LayoutParams) layoutParams19;
        Float f18 = (Float) mapG.get("fbg_icon_height");
        layoutParams20.S = f18 != null ? f18.floatValue() : 0.4f;
        Float f19 = (Float) mapG.get("fbg_icon_height");
        layoutParams20.R = f19 != null ? f19.floatValue() : 0.4f;
        this.binding.V.setLayoutParams(layoutParams20);
        ViewGroup.LayoutParams layoutParams21 = this.binding.e1.getLayoutParams();
        layoutParams21.getClass();
        ConstraintLayout.LayoutParams layoutParams22 = (ConstraintLayout.LayoutParams) layoutParams21;
        Float f20 = (Float) mapG.get("view3_space");
        layoutParams22.S = f20 != null ? f20.floatValue() : 0.04f;
        this.binding.e1.setLayoutParams(layoutParams22);
        ViewGroup.LayoutParams layoutParams23 = this.binding.i.getLayoutParams();
        layoutParams23.getClass();
        ConstraintLayout.LayoutParams layoutParams24 = (ConstraintLayout.LayoutParams) layoutParams23;
        Float f21 = (Float) mapG.get("amt_select_layout_height");
        layoutParams24.S = f21 != null ? f21.floatValue() : 0.11f;
        Float f22 = (Float) mapG.get("amt_select_layout_width");
        layoutParams24.R = f22 != null ? f22.floatValue() : 0.87f;
        this.binding.i.setLayoutParams(layoutParams24);
        ViewGroup.LayoutParams layoutParams25 = this.binding.l0.getLayoutParams();
        layoutParams25.getClass();
        ConstraintLayout.LayoutParams layoutParams26 = (ConstraintLayout.LayoutParams) layoutParams25;
        Float f23 = (Float) mapG.get("layout_amount_height");
        layoutParams26.S = f23 != null ? f23.floatValue() : 0.18f;
        Float f24 = (Float) mapG.get("layout_amount_width");
        layoutParams26.R = f24 != null ? f24.floatValue() : 0.87f;
        this.binding.l0.setLayoutParams(layoutParams26);
        ViewGroup.LayoutParams layoutParams27 = this.binding.L.getLayoutParams();
        layoutParams27.getClass();
        ConstraintLayout.LayoutParams layoutParams28 = (ConstraintLayout.LayoutParams) layoutParams27;
        Float f25 = (Float) mapG.get("layout_amount_height");
        layoutParams28.S = f25 != null ? f25.floatValue() : 0.18f;
        Float f26 = (Float) mapG.get("layout_amount_width");
        layoutParams28.R = f26 != null ? f26.floatValue() : 0.87f;
        this.binding.L.setLayoutParams(layoutParams28);
        ViewGroup.LayoutParams layoutParams29 = this.binding.F.getLayoutParams();
        layoutParams29.getClass();
        ConstraintLayout.LayoutParams layoutParams30 = (ConstraintLayout.LayoutParams) layoutParams29;
        Float f27 = (Float) mapG.get("min_bg_height");
        layoutParams30.S = f27 != null ? f27.floatValue() : 0.75f;
        Float f28 = (Float) mapG.get("min_bg_width");
        layoutParams30.R = f28 != null ? f28.floatValue() : 0.118f;
        this.binding.F.setLayoutParams(layoutParams30);
        ViewGroup.LayoutParams layoutParams31 = this.binding.H.getLayoutParams();
        layoutParams31.getClass();
        ConstraintLayout.LayoutParams layoutParams32 = (ConstraintLayout.LayoutParams) layoutParams31;
        Float f29 = (Float) mapG.get("min_bg_height");
        layoutParams32.S = f29 != null ? f29.floatValue() : 0.75f;
        Float f30 = (Float) mapG.get("min_bg_width");
        layoutParams32.R = f30 != null ? f30.floatValue() : 0.118f;
        this.binding.H.setLayoutParams(layoutParams32);
        ViewGroup.LayoutParams layoutParams33 = this.binding.J.getLayoutParams();
        layoutParams33.getClass();
        ConstraintLayout.LayoutParams layoutParams34 = (ConstraintLayout.LayoutParams) layoutParams33;
        Float f31 = (Float) mapG.get("min_bg_height");
        layoutParams34.S = f31 != null ? f31.floatValue() : 0.75f;
        Float f32 = (Float) mapG.get("min_bg_width");
        layoutParams34.R = f32 != null ? f32.floatValue() : 0.118f;
        this.binding.J.setLayoutParams(layoutParams34);
        ViewGroup.LayoutParams layoutParams35 = this.binding.D.getLayoutParams();
        layoutParams35.getClass();
        ConstraintLayout.LayoutParams layoutParams36 = (ConstraintLayout.LayoutParams) layoutParams35;
        Float f33 = (Float) mapG.get("min_bg_height");
        layoutParams36.S = f33 != null ? f33.floatValue() : 0.75f;
        Float f34 = (Float) mapG.get("min_bg_width");
        layoutParams36.R = f34 != null ? f34.floatValue() : 0.118f;
        this.binding.D.setLayoutParams(layoutParams36);
        ViewGroup.LayoutParams layoutParams37 = this.binding.C0.getLayoutParams();
        layoutParams37.getClass();
        ConstraintLayout.LayoutParams layoutParams38 = (ConstraintLayout.LayoutParams) layoutParams37;
        Float f35 = (Float) mapG.get("layout_amount_height");
        layoutParams38.S = f35 != null ? f35.floatValue() : 0.18f;
        Float f36 = (Float) mapG.get("layout_amount_width");
        layoutParams38.R = f36 != null ? f36.floatValue() : 0.87f;
        this.binding.C0.setLayoutParams(layoutParams38);
        ViewGroup.LayoutParams layoutParams39 = this.binding.f1.getLayoutParams();
        layoutParams39.getClass();
        ConstraintLayout.LayoutParams layoutParams40 = (ConstraintLayout.LayoutParams) layoutParams39;
        Float f37 = (Float) mapG.get("view5_space");
        layoutParams40.S = f37 != null ? f37.floatValue() : 0.08f;
        this.binding.f1.setLayoutParams(layoutParams40);
        ViewGroup.LayoutParams layoutParams41 = this.binding.Q.getLayoutParams();
        layoutParams41.getClass();
        ConstraintLayout.LayoutParams layoutParams42 = (ConstraintLayout.LayoutParams) layoutParams41;
        Float f38 = (Float) mapG.get("placebet_btn_height");
        layoutParams42.S = f38 != null ? f38.floatValue() : 0.17f;
        this.binding.Q.setLayoutParams(layoutParams42);
        ViewGroup.LayoutParams layoutParams43 = this.binding.R.getLayoutParams();
        layoutParams43.getClass();
        ConstraintLayout.LayoutParams layoutParams44 = (ConstraintLayout.LayoutParams) layoutParams43;
        Float f39 = (Float) mapG.get("over_btn_width");
        layoutParams44.R = f39 != null ? f39.floatValue() : 0.45f;
        this.binding.R.setLayoutParams(layoutParams44);
        ViewGroup.LayoutParams layoutParams45 = this.binding.S.getLayoutParams();
        layoutParams45.getClass();
        ConstraintLayout.LayoutParams layoutParams46 = (ConstraintLayout.LayoutParams) layoutParams45;
        Float f40 = (Float) mapG.get("over_btn_width");
        layoutParams46.R = f40 != null ? f40.floatValue() : 0.45f;
        this.binding.S.setLayoutParams(layoutParams46);
        ViewGroup.LayoutParams layoutParams47 = this.binding.v0.getLayoutParams();
        layoutParams47.getClass();
        ConstraintLayout.LayoutParams layoutParams48 = (ConstraintLayout.LayoutParams) layoutParams47;
        Float f41 = (Float) mapG.get("over_btn_width");
        layoutParams48.R = f41 != null ? f41.floatValue() : 0.45f;
        this.binding.v0.setLayoutParams(layoutParams48);
        ViewGroup.LayoutParams layoutParams49 = this.binding.Z0.getLayoutParams();
        layoutParams49.getClass();
        ConstraintLayout.LayoutParams layoutParams50 = (ConstraintLayout.LayoutParams) layoutParams49;
        Float f42 = (Float) mapG.get("over_btn_width");
        layoutParams50.R = f42 != null ? f42.floatValue() : 0.45f;
        this.binding.Z0.setLayoutParams(layoutParams50);
        ViewGroup.LayoutParams layoutParams51 = this.binding.h1.getLayoutParams();
        layoutParams51.getClass();
        ConstraintLayout.LayoutParams layoutParams52 = (ConstraintLayout.LayoutParams) layoutParams51;
        Float f43 = (Float) mapG.get("placebet_btn_height");
        layoutParams52.S = f43 != null ? f43.floatValue() : 0.17f;
        this.binding.h1.setLayoutParams(layoutParams52);
        ViewGroup.LayoutParams layoutParams53 = this.binding.E0.getLayoutParams();
        layoutParams53.getClass();
        ConstraintLayout.LayoutParams layoutParams54 = (ConstraintLayout.LayoutParams) layoutParams53;
        Float f44 = (Float) mapG.get("placebet_btn_height");
        layoutParams54.S = f44 != null ? f44.floatValue() : 0.19f;
        this.binding.E0.setLayoutParams(layoutParams54);
        ViewGroup.LayoutParams layoutParams55 = this.binding.w.getLayoutParams();
        layoutParams55.getClass();
        ConstraintLayout.LayoutParams layoutParams56 = (ConstraintLayout.LayoutParams) layoutParams55;
        Float f45 = (Float) mapG.get("bet_place_text");
        layoutParams56.R = f45 != null ? f45.floatValue() : 0.62f;
        this.binding.w.setLayoutParams(layoutParams56);
        ViewGroup.LayoutParams layoutParams57 = this.binding.F0.getLayoutParams();
        layoutParams57.getClass();
        ConstraintLayout.LayoutParams layoutParams58 = (ConstraintLayout.LayoutParams) layoutParams57;
        Float f46 = (Float) mapG.get("placebet_ui_width");
        layoutParams58.R = f46 != null ? f46.floatValue() : 0.95f;
        Float f47 = (Float) mapG.get("placebet_btn_height");
        layoutParams58.S = f47 != null ? f47.floatValue() : 0.19f;
        this.binding.F0.setLayoutParams(layoutParams58);
        ViewGroup.LayoutParams layoutParams59 = this.binding.g1.getLayoutParams();
        layoutParams59.getClass();
        ConstraintLayout.LayoutParams layoutParams60 = (ConstraintLayout.LayoutParams) layoutParams59;
        Float f48 = (Float) mapG.get("view_6_space");
        layoutParams60.S = f48 != null ? f48.floatValue() : 0.032f;
        this.binding.g1.setLayoutParams(layoutParams60);
        ViewGroup.LayoutParams layoutParams61 = this.binding.w0.getLayoutParams();
        layoutParams61.getClass();
        ConstraintLayout.LayoutParams layoutParams62 = (ConstraintLayout.LayoutParams) layoutParams61;
        Float f49 = (Float) mapG.get("spacer_1_width");
        layoutParams62.R = f49 != null ? f49.floatValue() : 0.0227f;
        this.binding.w0.setLayoutParams(layoutParams62);
        ViewGroup.LayoutParams layoutParams63 = this.binding.a1.getLayoutParams();
        layoutParams63.getClass();
        ConstraintLayout.LayoutParams layoutParams64 = (ConstraintLayout.LayoutParams) layoutParams63;
        Float f50 = (Float) mapG.get("spacer_1_width");
        layoutParams64.R = f50 != null ? f50.floatValue() : 0.0227f;
        this.binding.a1.setLayoutParams(layoutParams64);
        ViewGroup.LayoutParams layoutParams65 = this.binding.y.getLayoutParams();
        layoutParams65.getClass();
        ConstraintLayout.LayoutParams layoutParams66 = (ConstraintLayout.LayoutParams) layoutParams65;
        Float f51 = (Float) mapG.get("spacer_1_width");
        layoutParams66.R = f51 != null ? f51.floatValue() : 0.0227f;
        this.binding.y.setLayoutParams(layoutParams66);
        ViewGroup.LayoutParams layoutParams67 = this.binding.z.getLayoutParams();
        layoutParams67.getClass();
        ConstraintLayout.LayoutParams layoutParams68 = (ConstraintLayout.LayoutParams) layoutParams67;
        Float f52 = (Float) mapG.get("spacer_1_width");
        layoutParams68.R = f52 != null ? f52.floatValue() : 0.0227f;
        this.binding.z.setLayoutParams(layoutParams68);
        ViewGroup.LayoutParams layoutParams69 = this.binding.A.getLayoutParams();
        layoutParams69.getClass();
        ConstraintLayout.LayoutParams layoutParams70 = (ConstraintLayout.LayoutParams) layoutParams69;
        Float f53 = (Float) mapG.get("spacer_1_width");
        layoutParams70.R = f53 != null ? f53.floatValue() : 0.0227f;
        this.binding.A.setLayoutParams(layoutParams70);
        ViewGroup.LayoutParams layoutParams71 = this.binding.T.getLayoutParams();
        layoutParams71.getClass();
        ConstraintLayout.LayoutParams layoutParams72 = (ConstraintLayout.LayoutParams) layoutParams71;
        Float f54 = (Float) mapG.get("close_btn");
        layoutParams72.R = f54 != null ? f54.floatValue() : 0.136f;
        this.binding.T.setLayoutParams(layoutParams72);
        ViewGroup.LayoutParams layoutParams73 = this.binding.D0.getLayoutParams();
        layoutParams73.getClass();
        ConstraintLayout.LayoutParams layoutParams74 = (ConstraintLayout.LayoutParams) layoutParams73;
        Float f55 = (Float) mapG.get("close_btn");
        layoutParams74.R = f55 != null ? f55.floatValue() : 0.136f;
        this.binding.D0.setLayoutParams(layoutParams74);
        Resources resources = getResources();
        Integer num = (Integer) mapE.get("min_max_text_size");
        int iIntValue = R.dimen._9ssp;
        this.binding.P0.setTextSize(0, resources.getDimension(num != null ? num.intValue() : R.dimen._9ssp));
        Resources resources2 = getResources();
        Integer num2 = (Integer) mapE.get("min_max_text_size");
        this.binding.N0.setTextSize(0, resources2.getDimension(num2 != null ? num2.intValue() : R.dimen._9ssp));
        Resources resources3 = getResources();
        Integer num3 = (Integer) mapE.get("minus_plus_text_size");
        int iIntValue2 = R.dimen._24ssp;
        this.binding.R0.setTextSize(0, resources3.getDimension(num3 != null ? num3.intValue() : R.dimen._24ssp));
        Resources resources4 = getResources();
        Integer num4 = (Integer) mapE.get("center_title_text_size");
        this.binding.W0.setTextSize(0, resources4.getDimension(num4 != null ? num4.intValue() : R.dimen._9ssp));
        Resources resources5 = getResources();
        Integer num5 = (Integer) mapE.get("center_title_top_margin");
        int dimensionPixelSize = resources5.getDimensionPixelSize(num5 != null ? num5.intValue() : R.dimen._3sdp);
        TextView textView = this.binding.W0;
        ViewGroup.LayoutParams layoutParams75 = textView.getLayoutParams();
        if (layoutParams75 == null) {
            bmy.a("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams76 = (ConstraintLayout.LayoutParams) layoutParams75;
        ((ViewGroup.MarginLayoutParams) layoutParams76).topMargin = dimensionPixelSize;
        textView.setLayoutParams(layoutParams76);
        TextView textView2 = this.binding.M0;
        ViewGroup.LayoutParams layoutParams77 = textView2.getLayoutParams();
        if (layoutParams77 == null) {
            bmy.a("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            return;
        }
        ConstraintLayout.LayoutParams layoutParams78 = (ConstraintLayout.LayoutParams) layoutParams77;
        ((ViewGroup.MarginLayoutParams) layoutParams78).topMargin = dimensionPixelSize;
        textView2.setLayoutParams(layoutParams78);
        Resources resources6 = getResources();
        Integer num6 = (Integer) mapE.get("center_amount_size");
        int iIntValue3 = R.dimen._14ssp;
        this.binding.L0.setTextSize(0, resources6.getDimension(num6 != null ? num6.intValue() : R.dimen._14ssp));
        Resources resources7 = getResources();
        Integer num7 = (Integer) mapE.get("min_max_text_size");
        this.binding.Q0.setTextSize(0, resources7.getDimension(num7 != null ? num7.intValue() : R.dimen._9ssp));
        Resources resources8 = getResources();
        Integer num8 = (Integer) mapE.get("minus_plus_text_size");
        this.binding.S0.setTextSize(0, resources8.getDimension(num8 != null ? num8.intValue() : R.dimen._24ssp));
        Resources resources9 = getResources();
        Integer num9 = (Integer) mapE.get("center_title_text_size");
        this.binding.M0.setTextSize(0, resources9.getDimension(num9 != null ? num9.intValue() : R.dimen._9ssp));
        Resources resources10 = getResources();
        Integer num10 = (Integer) mapE.get("center_amount_size");
        this.binding.T0.setTextSize(0, resources10.getDimension(num10 != null ? num10.intValue() : R.dimen._14ssp));
        Resources resources11 = getResources();
        Integer num11 = (Integer) mapE.get("minus_plus_text_size");
        if (num11 != null) {
            iIntValue2 = num11.intValue();
        }
        this.binding.V0.setTextSize(0, resources11.getDimension(iIntValue2));
        Resources resources12 = getResources();
        Integer num12 = (Integer) mapE.get("min_max_text_size");
        if (num12 != null) {
            iIntValue = num12.intValue();
        }
        this.binding.O0.setTextSize(0, resources12.getDimension(iIntValue));
        Resources resources13 = getResources();
        Integer num13 = (Integer) mapE.get("over_under_text1");
        if (num13 != null) {
            iIntValue3 = num13.intValue();
        }
        this.binding.t0.setTextSize(0, resources13.getDimension(iIntValue3));
        Resources resources14 = getResources();
        Integer num14 = (Integer) mapE.get("placed_bet_text_size");
        float dimension = resources14.getDimension(num14 != null ? num14.intValue() : R.dimen._10ssp);
        this.binding.B.setTextSize(0, dimension);
        this.binding.s0.setTextSize(0, dimension);
        Resources resources15 = getResources();
        Integer num15 = (Integer) mapE.get("placed_bet_text_size");
        this.binding.b.setTextSize(0, resources15.getDimension(num15 != null ? num15.intValue() : R.dimen._12ssp));
        Resources resources16 = getResources();
        Integer num16 = (Integer) mapE.get("fbg_icon_padding");
        int dimensionPixelSize2 = resources16.getDimensionPixelSize(num16 != null ? num16.intValue() : R.dimen._5sdp);
        this.binding.W.setPadding(dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize2);
    }

    public final void setOnBetChipSelected(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.onBetChipSelected = function1;
    }

    public final void setOnBetChipSelectedListener(Function1<? super Integer, Unit> listener) {
        listener.getClass();
        setOnBetChipSelected(listener);
    }

    public final void setOverclicked(boolean z) {
        this.overclicked = z;
    }

    public final void setPlaceBet() {
        String strB;
        String strB2;
        String string;
        String string2;
        String string3;
        String strB3;
        String strB4;
        String string4;
        String string5;
        String string6;
        boolean z = this.overclicked;
        ru80 ru80Var = this.binding;
        String strB5 = null;
        if (z) {
            TextView textView = ru80Var.v;
            StringBuilder sb = new StringBuilder();
            Context context = getContext();
            if (context == null || (string6 = context.getString(R.string.place_bet_text_sh)) == null) {
                strB3 = null;
            } else {
                op5 op5Var = op5.a;
                String string7 = getContext().getString(R.string.place_bet_cms);
                string7.getClass();
                op5Var.getClass();
                strB3 = op5.b(string7, string6, null);
            }
            sb.append(strB3);
            sb.append(" ");
            op5 op5Var2 = op5.a;
            DetailResponse detailResponse = this.b;
            if (detailResponse == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            String currency = detailResponse.getCurrency();
            op5Var2.getClass();
            sb.append(op5.i(currency));
            sb.append(" ");
            sb.append(this.binding.L0.getText().toString());
            sb.append("\n");
            Context context2 = getContext();
            if (context2 == null || (string5 = context2.getString(R.string.for_text)) == null) {
                strB4 = null;
            } else {
                String string8 = getContext().getString(R.string.for_cms);
                string8.getClass();
                strB4 = op5.b(string8, string5, null);
            }
            sb.append(strB4);
            sb.append(" ");
            Context context3 = getContext();
            if (context3 != null && (string4 = context3.getString(R.string.over_text)) != null) {
                String string9 = getContext().getString(R.string.over_text_cms);
                string9.getClass();
                strB5 = op5.b(string9, string4, null);
            }
            sb.append(strB5);
            sb.append(" ");
            sb.append(this.binding.T0.getText().toString());
            sb.append(" ?");
            textView.setText(sb.toString());
            return;
        }
        TextView textView2 = ru80Var.v;
        StringBuilder sb2 = new StringBuilder();
        Context context4 = getContext();
        if (context4 == null || (string3 = context4.getString(R.string.place_bet_text_sh)) == null) {
            strB = null;
        } else {
            op5 op5Var3 = op5.a;
            String string10 = getContext().getString(R.string.place_bet_cms);
            string10.getClass();
            op5Var3.getClass();
            strB = op5.b(string10, string3, null);
        }
        sb2.append(strB);
        sb2.append(" ");
        op5 op5Var4 = op5.a;
        DetailResponse detailResponse2 = this.b;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        String currency2 = detailResponse2.getCurrency();
        op5Var4.getClass();
        sb2.append(op5.i(currency2));
        sb2.append(" ");
        sb2.append(this.binding.L0.getText().toString());
        sb2.append("\n");
        Context context5 = getContext();
        if (context5 == null || (string2 = context5.getString(R.string.for_text)) == null) {
            strB2 = null;
        } else {
            String string11 = getContext().getString(R.string.for_cms);
            string11.getClass();
            strB2 = op5.b(string11, string2, null);
        }
        sb2.append(strB2);
        sb2.append(" ");
        Context context6 = getContext();
        if (context6 != null && (string = context6.getString(R.string.under_text)) != null) {
            String string12 = getContext().getString(R.string.under_text_cms);
            string12.getClass();
            strB5 = op5.b(string12, string, null);
        }
        sb2.append(strB5);
        sb2.append(" ");
        sb2.append(this.binding.T0.getText().toString());
        sb2.append(" ?");
        textView2.setText(sb2.toString());
    }

    public final void setRoundId(long j) {
        this.roundId = j;
    }

    public final void setShowOverUnderBetConfirmation(boolean z) {
        this.showOverUnderBetConfirmation = z;
    }

    public final void setUnderFetchDetail(HashMap<Double, Double> map) {
        this.underFetchDetail = map;
    }

    public final void setUserInputAmount(double d) {
        this.userInputAmount = d;
    }

    public final void setValentineTheme() {
        this.binding.b1.setVisibility(0);
        this.binding.c1.setVisibility(0);
        Context context = getContext();
        context.getClass();
        mo80 mo80Var = new mo80(np5.a(context, context));
        op5 op5Var = op5.a;
        String string = getContext().getString(R.string.valentine_gif_white_cms);
        string.getClass();
        mo80Var.a(Uri.parse(op5.c(op5Var, string, ""))).e(this.binding.b1);
        Context context2 = getContext();
        context2.getClass();
        mo80 mo80Var2 = new mo80(np5.a(context2, context2));
        String string2 = getContext().getString(R.string.valentine_gif_white_cms);
        string2.getClass();
        mo80Var2.a(Uri.parse(op5.c(op5Var, string2, ""))).e(this.binding.c1);
    }

    public final void t(TopBets topBets) {
        op5 op5Var;
        Double d;
        topBets.getClass();
        this.betType = topBets.getBetType();
        boolean zG = Intrinsics.g(topBets.getBetType(), "OVER");
        ru80 ru80Var = this.binding;
        if (zG) {
            TextView textView = ru80Var.B;
            op5Var = op5.a;
            String string = getContext().getString(R.string.bet_text_game_cms);
            string.getClass();
            String string2 = getContext().getString(R.string.bet);
            string2.getClass();
            op5Var.getClass();
            StringBuilder sb = new StringBuilder(op5.b(string, string2, null));
            sb.append(" : ");
            String string3 = getContext().getString(R.string.over_text_cms);
            string3.getClass();
            String string4 = getContext().getString(R.string.over_text);
            string4.getClass();
            sb.append(op5.b(string3, string4, null));
            sb.append(" ");
            TreeMap treeMap = pw.a;
            Double targetCoefficient = topBets.getTargetCoefficient();
            sb.append(pw.q(targetCoefficient != null ? targetCoefficient.doubleValue() : 0.0d).concat("x"));
            sb.append(" (");
            String string5 = getContext().getString(R.string.pays_text_cms);
            string5.getClass();
            sb.append(op5.b(string5, "Pays", null));
            sb.append(" ");
            Double targetCoefficient2 = topBets.getTargetCoefficient();
            sb.append(pw.q(targetCoefficient2 != null ? targetCoefficient2.doubleValue() : 0.0d).concat("x)"));
            textView.setText(sb.toString());
        } else {
            TextView textView2 = ru80Var.B;
            op5Var = op5.a;
            String string6 = getContext().getString(R.string.bet_text_game_cms);
            string6.getClass();
            String string7 = getContext().getString(R.string.bet);
            string7.getClass();
            op5Var.getClass();
            StringBuilder sb2 = new StringBuilder(op5.b(string6, string7, null));
            sb2.append(" : ");
            String string8 = getContext().getString(R.string.under_text_cms);
            string8.getClass();
            String string9 = getContext().getString(R.string.under_text);
            string9.getClass();
            sb2.append(op5.b(string8, string9, null));
            sb2.append(" ");
            TreeMap treeMap2 = pw.a;
            Double targetCoefficient3 = topBets.getTargetCoefficient();
            sb2.append(pw.q(targetCoefficient3 != null ? targetCoefficient3.doubleValue() : 0.0d).concat("x"));
            sb2.append(" (");
            String string10 = getContext().getString(R.string.pays_text_cms);
            string10.getClass();
            sb2.append(op5.b(string10, "Pays", null));
            sb2.append(" ");
            HashMap<Double, Double> map = this.underFetchDetail;
            sb2.append(pw.q((map == null || (d = map.get(topBets.getTargetCoefficient())) == null) ? 0.0d : d.doubleValue()).concat("x)"));
            textView2.setText(sb2.toString());
        }
        f(0.5f, false);
        this.binding.b.setText(getContext().getString(R.string.waiting_for_next_round_to_start));
        this.binding.b.setTag(getContext().getString(R.string.waiting_for_next_round_cms));
        this.betIsWaiting = true;
        op5.r(op5Var, kotlin.collections.b.f(this.binding.b), null, 4);
        this.binding.G0.setVisibility(0);
        this.binding.s0.setVisibility(8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OverUnderComponent(Context context) {
        this(context, null);
        context.getClass();
    }
}
