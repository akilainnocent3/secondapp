package com.sportygames.sportyherov2.components;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.sportyherov2.components.ShBetContainer;
import com.sportygames.sportyherov2.remote.models.DetailResponse;
import defpackage.ajc;
import defpackage.bmy;
import defpackage.e6a;
import defpackage.ea50;
import defpackage.eg1;
import defpackage.feh;
import defpackage.gaj;
import defpackage.gez;
import defpackage.gr60;
import defpackage.h5e;
import defpackage.hce0;
import defpackage.hre;
import defpackage.kfm;
import defpackage.kpu;
import defpackage.krh0;
import defpackage.lo80;
import defpackage.mo80;
import defpackage.na7;
import defpackage.np5;
import defpackage.och;
import defpackage.op5;
import defpackage.po80;
import defpackage.pw;
import defpackage.qmf0;
import defpackage.qq80;
import defpackage.thk;
import defpackage.tr80;
import defpackage.un20;
import defpackage.uu80;
import defpackage.wae0;
import defpackage.xa50;
import defpackage.yju;
import defpackage.zug;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\t\n\u0002\b2\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\u001bJ\r\u0010 \u001a\u00020\n¢\u0006\u0004\b \u0010\u001bJ=\u0010'\u001a\u00020\n2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\n¢\u0006\u0004\b)\u0010\u001bJ!\u0010+\u001a\u00020\n2\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u00020\n2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b.\u0010/J'\u00103\u001a\u00020\n2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0007¢\u0006\u0004\b3\u00104J#\u00106\u001a\u00020\n2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!H\u0007¢\u0006\u0004\b6\u0010,J!\u00108\u001a\u00020\n2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b8\u0010,J!\u0010:\u001a\u00020\n2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\b:\u0010,J\u001b\u0010<\u001a\u00020\n2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b<\u0010/J\u001b\u0010=\u001a\u00020\n2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b=\u0010/JQ\u0010@\u001a\u00020\n2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0!2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0!2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0$¢\u0006\u0004\b@\u0010AJ!\u0010C\u001a\u00020\n2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\bC\u0010,J!\u0010D\u001a\u00020\n2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0!¢\u0006\u0004\bD\u0010,J/\u0010G\u001a\u00020\n2 \u0010F\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0E¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\n¢\u0006\u0004\bI\u0010\u001bJ\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u001bJ\r\u0010K\u001a\u00020\n¢\u0006\u0004\bK\u0010\u001bJ\r\u0010L\u001a\u00020\n¢\u0006\u0004\bL\u0010\u001bJ\r\u0010M\u001a\u00020\n¢\u0006\u0004\bM\u0010\u001bJ\r\u0010N\u001a\u00020\n¢\u0006\u0004\bN\u0010\u001bJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\bO\u0010\u0014J\u000f\u0010P\u001a\u00020\nH\u0007¢\u0006\u0004\bP\u0010\u001bJ\r\u0010Q\u001a\u00020\n¢\u0006\u0004\bQ\u0010\u001bJ\r\u0010R\u001a\u00020\n¢\u0006\u0004\bR\u0010\u001bJ\u0015\u0010T\u001a\u00020\n2\u0006\u0010S\u001a\u00020\b¢\u0006\u0004\bT\u0010\fJ\u001d\u0010X\u001a\u00020\n2\u0006\u0010V\u001a\u00020U2\u0006\u0010W\u001a\u00020U¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\n2\u0006\u0010[\u001a\u00020ZH\u0002¢\u0006\u0004\b\\\u0010]R\"\u0010e\u001a\u00020^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR$\u00101\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR$\u0010r\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u00102\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010\fR\"\u0010{\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010t\u001a\u0004\by\u0010v\"\u0004\bz\u0010\fR$\u0010\u0081\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010\u0019R&\u0010\u0085\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0082\u0001\u0010t\u001a\u0005\b\u0083\u0001\u0010v\"\u0005\b\u0084\u0001\u0010\fR&\u0010\u0089\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0086\u0001\u0010t\u001a\u0005\b\u0087\u0001\u0010v\"\u0005\b\u0088\u0001\u0010\fR%\u0010\u008c\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b\u008a\u0001\u0010t\u001a\u0005\b\u008b\u0001\u0010v\"\u0004\b \u0010\fR&\u0010\u0090\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010t\u001a\u0005\b\u008e\u0001\u0010v\"\u0005\b\u008f\u0001\u0010\fR*\u0010\u0098\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R*\u0010\u009c\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0099\u0001\u0010\u0093\u0001\u001a\u0006\b\u009a\u0001\u0010\u0095\u0001\"\u0006\b\u009b\u0001\u0010\u0097\u0001R&\u0010 \u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010}\u001a\u0005\b\u009e\u0001\u0010\u007f\"\u0005\b\u009f\u0001\u0010\u0019R*\u0010¤\u0001\u001a\u00030\u0091\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010\u0093\u0001\u001a\u0006\b¢\u0001\u0010\u0095\u0001\"\u0006\b£\u0001\u0010\u0097\u0001R&\u0010¨\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¥\u0001\u0010}\u001a\u0005\b¦\u0001\u0010\u007f\"\u0005\b§\u0001\u0010\u0019RA\u0010F\u001a\u001c\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0E8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b©\u0001\u0010ª\u0001\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0005\b\u00ad\u0001\u0010HR4\u0010³\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0!8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0005\b²\u0001\u0010,R&\u0010·\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b´\u0001\u0010t\u001a\u0005\bµ\u0001\u0010v\"\u0005\b¶\u0001\u0010\fR&\u0010»\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¸\u0001\u0010t\u001a\u0005\b¹\u0001\u0010v\"\u0005\bº\u0001\u0010\fR)\u0010Â\u0001\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001¨\u0006Ã\u0001"}, d2 = {"Lcom/sportygames/sportyherov2/components/ShBetContainer;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "isWorldCupThemeEnabled", "", "setBetContainerBgWcTheme", "(Z)V", "Lcom/sportygames/sportyherov2/remote/models/DetailResponse;", "gameDetailResponse", "setBetModel", "(Lcom/sportygames/sportyherov2/remote/models/DetailResponse;)V", "", "number", "setCashoutAmount", "(I)V", "count", "setAutoBetCount", "", "amount", "(D)V", "setPoint", "()V", "setDoubleZero", "setClear", "setCross", "setDone", "setCashoutDone", "Lkotlin/Function1;", "", "betListener", "Lkotlin/Function0;", "isNotLoggedIn", "openLoginDialog", "setBetListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "setCashOutAmount", "cashoutListener", "setCashoutListener", "(Lkotlin/jvm/functions/Function1;)V", "removeFBGListener", "setFBGRemoveListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/sportygames/commons/models/GiftItem;", "giftItem", "betPlaced", "setFBG", "(Lcom/sportygames/commons/models/GiftItem;ZD)V", "betStepListener", "setBetStepListener", "confirmBetListener", "setConfirmBetListener", "cancelBetListener", "setCancelBetListener", "cashoutAmount", "setAutoCashoutAmount", "setbetAmount", "autoBetListener", "autoDialogShow", "setautoBetListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "listener", "setFbgClickListener", "setOnBetChipSelectedListener", "Lkotlin/Function3;", "autoCashoutListener", "setautoCashoutListener", "(Lgaj;)V", "setDisableContainer", "setEnableContainer", "setBetDone", "setBetClear", "setBetCross", "setBetDoubleZero", "setBetNumberClick", "setBetPointClick", "setValentineTheme", "setBetText", "isActive", "setRainActive", "", "height", "width", "setUiPercentageOfNestedElements", "(FF)V", "Landroid/widget/TextView;", "textView", "setupAutoSizeTextView", "(Landroid/widget/TextView;)V", "Lqq80;", "F", "Lqq80;", "getBinding", "()Lqq80;", "setBinding", "(Lqq80;)V", "binding", "K", "Lcom/sportygames/commons/models/GiftItem;", "getGiftItem", "()Lcom/sportygames/commons/models/GiftItem;", "setGiftItem", "(Lcom/sportygames/commons/models/GiftItem;)V", "L", "Ljava/lang/Double;", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "giftAmount", "M", "Z", "getBetPlaced", "()Z", "setBetPlaced", "N", "getAutoBetPlace", "setAutoBetPlace", "autoBetPlace", "O", "D", "getBetAmount", "()D", "setBetAmount", "betAmount", "P", "getBetInProgress", "setBetInProgress", "betInProgress", "Q", "getBetPlacedV2", "setBetPlacedV2", "betPlacedV2", "R", "getCashoutDone", "cashoutDone", "S", "getCashoutInProgress", "setCashoutInProgress", "cashoutInProgress", "", "T", "J", "getRoundId", "()J", "setRoundId", "(J)V", "roundId", "U", "getFbgRoundId", "setFbgRoundId", "fbgRoundId", "V", "getCashoutCoeff", "setCashoutCoeff", "cashoutCoeff", "W", "getBetId", "setBetId", "betId", "a0", "getUserInputAmount", "setUserInputAmount", "userInputAmount", "e0", "Lgaj;", "getAutoCashoutListener", "()Lgaj;", "setAutoCashoutListener", "f0", "Lkotlin/jvm/functions/Function1;", "getOnBetChipSelected", "()Lkotlin/jvm/functions/Function1;", "setOnBetChipSelected", "onBetChipSelected", "i0", "getFbgAvailable", "setFbgAvailable", "fbgAvailable", "j0", "getRainIsActive", "setRainIsActive", "rainIsActive", "p0", "Ljava/lang/String;", "getCoeff", "()Ljava/lang/String;", "setCoeff", "(Ljava/lang/String;)V", "coeff", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShBetContainer extends ConstraintLayout {
    public static final /* synthetic */ int s0 = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public qq80 binding;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public GiftItem giftItem;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public Double giftAmount;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean betPlaced;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public boolean autoBetPlace;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public double betAmount;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public boolean betInProgress;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean betPlacedV2;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public boolean cashoutDone;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public boolean cashoutInProgress;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public long roundId;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public long fbgRoundId;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public double cashoutCoeff;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    public long betId;

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    public double userInputAmount;
    public boolean b0;
    public boolean c0;
    public boolean d0;

    /* JADX INFO: renamed from: e0, reason: from kotlin metadata */
    public gaj<? super Boolean, ? super String, ? super Integer, Unit> autoCashoutListener;

    /* JADX INFO: renamed from: f0, reason: from kotlin metadata */
    public Function1<? super Integer, Unit> onBetChipSelected;
    public Function1<? super Boolean, Unit> g0;
    public DetailResponse h0;

    /* JADX INFO: renamed from: i0, reason: from kotlin metadata */
    public boolean fbgAvailable;

    /* JADX INFO: renamed from: j0, reason: from kotlin metadata */
    public boolean rainIsActive;
    public String k0;
    public final float l0;
    public final float m0;
    public final float n0;
    public boolean o0;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    public String coeff;
    public final a q0;
    public final b r0;

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

        /* JADX WARN: Code duplicated, block: B:32:0x00bc A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001c, B:12:0x003a, B:14:0x0048, B:18:0x0055, B:39:0x00ee, B:41:0x00f2, B:45:0x00fc, B:47:0x0100, B:51:0x0109, B:53:0x0155, B:55:0x016b, B:57:0x0171, B:59:0x0177, B:61:0x017f, B:62:0x018a, B:64:0x0192, B:65:0x019d, B:67:0x01a5, B:68:0x01b0, B:52:0x012e, B:19:0x007b, B:21:0x007f, B:25:0x0089, B:27:0x008d, B:31:0x0097, B:32:0x00bc, B:34:0x00c0, B:38:0x00ca), top: B:71:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x00c0 A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001c, B:12:0x003a, B:14:0x0048, B:18:0x0055, B:39:0x00ee, B:41:0x00f2, B:45:0x00fc, B:47:0x0100, B:51:0x0109, B:53:0x0155, B:55:0x016b, B:57:0x0171, B:59:0x0177, B:61:0x017f, B:62:0x018a, B:64:0x0192, B:65:0x019d, B:67:0x01a5, B:68:0x01b0, B:52:0x012e, B:19:0x007b, B:21:0x007f, B:25:0x0089, B:27:0x008d, B:31:0x0097, B:32:0x00bc, B:34:0x00c0, B:38:0x00ca), top: B:71:0x0005 }] */
        /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ca A[Catch: Exception -> 0x01ba, TryCatch #0 {Exception -> 0x01ba, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0013, B:10:0x001c, B:12:0x003a, B:14:0x0048, B:18:0x0055, B:39:0x00ee, B:41:0x00f2, B:45:0x00fc, B:47:0x0100, B:51:0x0109, B:53:0x0155, B:55:0x016b, B:57:0x0171, B:59:0x0177, B:61:0x017f, B:62:0x018a, B:64:0x0192, B:65:0x019d, B:67:0x01a5, B:68:0x01b0, B:52:0x012e, B:19:0x007b, B:21:0x007f, B:25:0x0089, B:27:0x008d, B:31:0x0097, B:32:0x00bc, B:34:0x00c0, B:38:0x00ca), top: B:71:0x0005 }] */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DetailResponse detailResponse;
            double maxAmount;
            Resources resources;
            ShBetContainer shBetContainer = ShBetContainer.this;
            charSequence.getClass();
            try {
                if (!shBetContainer.getBetInProgress() && !shBetContainer.getBetPlaced()) {
                    if (charSequence.length() == 0) {
                        shBetContainer.getBinding().b.setText("0.00");
                        shBetContainer.getBinding().f0.setClickable(false);
                        shBetContainer.getBinding().f0.setAlpha(0.5f);
                        return;
                    }
                    double d = Double.parseDouble(charSequence.toString());
                    DetailResponse detailResponse2 = shBetContainer.h0;
                    if (d <= (detailResponse2 != null ? detailResponse2.getMinAmount() : 0.0d)) {
                        shBetContainer.getBinding().f0.setClickable(false);
                        shBetContainer.getBinding().f0.setAlpha(0.5f);
                        shBetContainer.getBinding().k0.setClickable(true);
                        shBetContainer.getBinding().k0.setAlpha(1.0f);
                    } else {
                        DetailResponse detailResponse3 = shBetContainer.h0;
                        if (d <= (detailResponse3 != null ? detailResponse3.getMinAmount() : 0.0d)) {
                            detailResponse = shBetContainer.h0;
                            if (detailResponse != null) {
                                maxAmount = detailResponse.getMaxAmount();
                            } else {
                                maxAmount = 0.0d;
                            }
                            if (d >= maxAmount) {
                                shBetContainer.getBinding().f0.setClickable(true);
                                shBetContainer.getBinding().f0.setAlpha(1.0f);
                                shBetContainer.getBinding().k0.setClickable(false);
                                shBetContainer.getBinding().k0.setAlpha(0.5f);
                            }
                        } else {
                            DetailResponse detailResponse4 = shBetContainer.h0;
                            if (d < (detailResponse4 != null ? detailResponse4.getMaxAmount() : 0.0d)) {
                                shBetContainer.getBinding().f0.setClickable(true);
                                shBetContainer.getBinding().f0.setAlpha(1.0f);
                                shBetContainer.getBinding().k0.setClickable(true);
                                shBetContainer.getBinding().k0.setAlpha(1.0f);
                            } else {
                                detailResponse = shBetContainer.h0;
                                if (detailResponse != null) {
                                    maxAmount = detailResponse.getMaxAmount();
                                } else {
                                    maxAmount = 0.0d;
                                }
                                if (d >= maxAmount) {
                                    shBetContainer.getBinding().f0.setClickable(true);
                                    shBetContainer.getBinding().f0.setAlpha(1.0f);
                                    shBetContainer.getBinding().k0.setClickable(false);
                                    shBetContainer.getBinding().k0.setAlpha(0.5f);
                                }
                            }
                        }
                    }
                    DetailResponse detailResponse5 = shBetContainer.h0;
                    if (d < (detailResponse5 != null ? detailResponse5.getMinAmount() : 0.0d)) {
                        shBetContainer.getBinding().v.setClickable(false);
                        shBetContainer.getBinding().v.setAlpha(0.65f);
                        shBetContainer.getBinding().h0.setClickable(false);
                        shBetContainer.getBinding().h0.setAlpha(0.65f);
                    } else {
                        DetailResponse detailResponse6 = shBetContainer.h0;
                        if (d > (detailResponse6 != null ? detailResponse6.getMaxAmount() : 0.0d)) {
                            shBetContainer.getBinding().v.setClickable(false);
                            shBetContainer.getBinding().v.setAlpha(0.65f);
                            shBetContainer.getBinding().h0.setClickable(false);
                            shBetContainer.getBinding().h0.setAlpha(0.65f);
                        } else {
                            shBetContainer.getBinding().v.setClickable(true);
                            shBetContainer.getBinding().v.setAlpha(1.0f);
                            shBetContainer.getBinding().h0.setClickable(true);
                            shBetContainer.getBinding().h0.setAlpha(1.0f);
                        }
                    }
                    shBetContainer.G();
                    shBetContainer.setBetText();
                    TextView textView = shBetContainer.getBinding().b;
                    String string = charSequence.toString();
                    Context context = shBetContainer.getContext();
                    if (context == null || (resources = context.getResources()) == null || string.length() <= 0) {
                        return;
                    }
                    if (string.length() > 10) {
                        textView.setTextSize(0, resources.getDimension(R.dimen._10ssp));
                        return;
                    }
                    if (string.length() > 9) {
                        textView.setTextSize(0, resources.getDimension(R.dimen._12ssp));
                    } else if (string.length() > 8) {
                        textView.setTextSize(0, resources.getDimension(R.dimen._13ssp));
                    } else {
                        textView.setTextSize(0, resources.getDimension(R.dimen._14ssp));
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            editable.getClass();
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            charSequence.getClass();
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            float f;
            ShBetContainer shBetContainer = ShBetContainer.this;
            charSequence.getClass();
            try {
                if (charSequence.length() > 0) {
                    if (charSequence.length() > 6) {
                        f = 8.0f;
                    } else if (charSequence.length() > 5) {
                        f = 9.0f;
                    } else {
                        f = charSequence.length() > 4 ? 10.0f : 11.0f;
                    }
                    shBetContainer.getBinding().G.setTextSize(2, f);
                    shBetContainer.getBinding().K.setTextSize(2, f);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShBetContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.sh_bet_component_v2, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i = R.id.auto_bet_text;
            TextView textView2 = (TextView) h5e.a(R.id.auto_bet_text, viewInflate);
            if (textView2 != null) {
                i = R.id.auto_bet_toggle;
                SHBetToggle sHBetToggle = (SHBetToggle) h5e.a(R.id.auto_bet_toggle, viewInflate);
                if (sHBetToggle != null) {
                    i = R.id.auto_cashout_text;
                    TextView textView3 = (TextView) h5e.a(R.id.auto_cashout_text, viewInflate);
                    if (textView3 != null) {
                        i = R.id.auto_cashout_toggle;
                        SHBetToggle sHBetToggle2 = (SHBetToggle) h5e.a(R.id.auto_cashout_toggle, viewInflate);
                        if (sHBetToggle2 != null) {
                            i = R.id.bet_amountbox;
                            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.bet_amountbox, viewInflate);
                            if (constraintLayout != null) {
                                i = R.id.bet_button;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.bet_button, viewInflate);
                                if (constraintLayout2 != null) {
                                    i = R.id.bet_button_football_icon;
                                    ImageView imageView = (ImageView) h5e.a(R.id.bet_button_football_icon, viewInflate);
                                    if (imageView != null) {
                                        i = R.id.bet_layout;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.bet_layout, viewInflate);
                                        if (constraintLayout3 != null) {
                                            i = R.id.bet_text;
                                            TextView textView4 = (TextView) h5e.a(R.id.bet_text, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.blur_1;
                                                View viewA = h5e.a(R.id.blur_1, viewInflate);
                                                if (viewA != null) {
                                                    i = R.id.blur_2;
                                                    View viewA2 = h5e.a(R.id.blur_2, viewInflate);
                                                    if (viewA2 != null) {
                                                        i = R.id.blur_3;
                                                        View viewA3 = h5e.a(R.id.blur_3, viewInflate);
                                                        if (viewA3 != null) {
                                                            i = R.id.blur_4;
                                                            View viewA4 = h5e.a(R.id.blur_4, viewInflate);
                                                            if (viewA4 != null) {
                                                                i = R.id.bottom_space;
                                                                View viewA5 = h5e.a(R.id.bottom_space, viewInflate);
                                                                if (viewA5 != null) {
                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate;
                                                                    i = R.id.cashout_amount;
                                                                    TextView textView5 = (TextView) h5e.a(R.id.cashout_amount, viewInflate);
                                                                    if (textView5 != null) {
                                                                        i = R.id.cashout_amount_layout;
                                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.cashout_amount_layout, viewInflate);
                                                                        if (constraintLayout5 != null) {
                                                                            i = R.id.cashout_button;
                                                                            TextView textView6 = (TextView) h5e.a(R.id.cashout_button, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = R.id.cashout_layout;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.cashout_layout, viewInflate);
                                                                                if (relativeLayout != null) {
                                                                                    i = R.id.cross;
                                                                                    TextView textView7 = (TextView) h5e.a(R.id.cross, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.cross_bet;
                                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.cross_bet, viewInflate);
                                                                                        if (constraintLayout6 != null) {
                                                                                            i = R.id.cross_fbg;
                                                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.cross_fbg, viewInflate);
                                                                                            if (imageView2 != null) {
                                                                                                i = R.id.extra_space;
                                                                                                View viewA6 = h5e.a(R.id.extra_space, viewInflate);
                                                                                                if (viewA6 != null) {
                                                                                                    i = R.id.fbg_icon;
                                                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.fbg_icon, viewInflate);
                                                                                                    if (imageView3 != null) {
                                                                                                        i = R.id.gif;
                                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.gif, viewInflate);
                                                                                                        if (appCompatImageView != null) {
                                                                                                            i = R.id.gift_box;
                                                                                                            ImageView imageView4 = (ImageView) h5e.a(R.id.gift_box, viewInflate);
                                                                                                            if (imageView4 != null) {
                                                                                                                i = R.id.guideline;
                                                                                                                if (((Guideline) h5e.a(R.id.guideline, viewInflate)) != null) {
                                                                                                                    i = R.id.guideline1;
                                                                                                                    if (((Guideline) h5e.a(R.id.guideline1, viewInflate)) != null) {
                                                                                                                        i = R.id.hint_amount1;
                                                                                                                        TextView textView8 = (TextView) h5e.a(R.id.hint_amount1, viewInflate);
                                                                                                                        if (textView8 != null) {
                                                                                                                            i = R.id.hint_amount1_selected;
                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.hint_amount1_selected, viewInflate);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i = R.id.hint_amount2;
                                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.hint_amount2, viewInflate);
                                                                                                                                if (textView10 != null) {
                                                                                                                                    i = R.id.hint_amount2_selected;
                                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.hint_amount2_selected, viewInflate);
                                                                                                                                    if (textView11 != null) {
                                                                                                                                        i = R.id.hint_amount3;
                                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.hint_amount3, viewInflate);
                                                                                                                                        if (textView12 != null) {
                                                                                                                                            i = R.id.hint_amount3_selected;
                                                                                                                                            TextView textView13 = (TextView) h5e.a(R.id.hint_amount3_selected, viewInflate);
                                                                                                                                            if (textView13 != null) {
                                                                                                                                                i = R.id.hint_amount4;
                                                                                                                                                TextView textView14 = (TextView) h5e.a(R.id.hint_amount4, viewInflate);
                                                                                                                                                if (textView14 != null) {
                                                                                                                                                    i = R.id.hint_amount4_selected;
                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.hint_amount4_selected, viewInflate);
                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                        i = R.id.hint_fbg_selected;
                                                                                                                                                        TextView textView16 = (TextView) h5e.a(R.id.hint_fbg_selected, viewInflate);
                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                            i = R.id.layout_auto_bet;
                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.layout_auto_bet, viewInflate)) != null) {
                                                                                                                                                                i = R.id.layout_auto_cashout;
                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.layout_auto_cashout, viewInflate)) != null) {
                                                                                                                                                                    i = R.id.left_space;
                                                                                                                                                                    View viewA7 = h5e.a(R.id.left_space, viewInflate);
                                                                                                                                                                    if (viewA7 != null) {
                                                                                                                                                                        i = R.id.max;
                                                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.max, viewInflate);
                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                            i = R.id.max_text;
                                                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.max_text, viewInflate);
                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                i = R.id.min;
                                                                                                                                                                                TextView textView19 = (TextView) h5e.a(R.id.min, viewInflate);
                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                    i = R.id.min_text;
                                                                                                                                                                                    TextView textView20 = (TextView) h5e.a(R.id.min_text, viewInflate);
                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                        i = R.id.minus;
                                                                                                                                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.minus, viewInflate);
                                                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                                                            i = R.id.minus_layout;
                                                                                                                                                                                            ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.minus_layout, viewInflate);
                                                                                                                                                                                            if (constraintLayout7 != null) {
                                                                                                                                                                                                i = R.id.place_bet;
                                                                                                                                                                                                ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.place_bet, viewInflate);
                                                                                                                                                                                                if (constraintLayout8 != null) {
                                                                                                                                                                                                    i = R.id.place_bet_text;
                                                                                                                                                                                                    TextView textView21 = (TextView) h5e.a(R.id.place_bet_text, viewInflate);
                                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                                        i = R.id.place_bet_text_layout;
                                                                                                                                                                                                        ConstraintLayout constraintLayout9 = (ConstraintLayout) h5e.a(R.id.place_bet_text_layout, viewInflate);
                                                                                                                                                                                                        if (constraintLayout9 != null) {
                                                                                                                                                                                                            i = R.id.plus;
                                                                                                                                                                                                            ImageView imageView6 = (ImageView) h5e.a(R.id.plus, viewInflate);
                                                                                                                                                                                                            if (imageView6 != null) {
                                                                                                                                                                                                                i = R.id.plus_layout;
                                                                                                                                                                                                                ConstraintLayout constraintLayout10 = (ConstraintLayout) h5e.a(R.id.plus_layout, viewInflate);
                                                                                                                                                                                                                if (constraintLayout10 != null) {
                                                                                                                                                                                                                    i = R.id.progress;
                                                                                                                                                                                                                    if (((ConstraintLayout) h5e.a(R.id.progress, viewInflate)) != null) {
                                                                                                                                                                                                                        i = R.id.right_space;
                                                                                                                                                                                                                        View viewA8 = h5e.a(R.id.right_space, viewInflate);
                                                                                                                                                                                                                        if (viewA8 != null) {
                                                                                                                                                                                                                            i = R.id.spacer_1;
                                                                                                                                                                                                                            View viewA9 = h5e.a(R.id.spacer_1, viewInflate);
                                                                                                                                                                                                                            if (viewA9 != null) {
                                                                                                                                                                                                                                i = R.id.spacer_2;
                                                                                                                                                                                                                                View viewA10 = h5e.a(R.id.spacer_2, viewInflate);
                                                                                                                                                                                                                                if (viewA10 != null) {
                                                                                                                                                                                                                                    i = R.id.spacer_3;
                                                                                                                                                                                                                                    View viewA11 = h5e.a(R.id.spacer_3, viewInflate);
                                                                                                                                                                                                                                    if (viewA11 != null) {
                                                                                                                                                                                                                                        i = R.id.spacer_4;
                                                                                                                                                                                                                                        View viewA12 = h5e.a(R.id.spacer_4, viewInflate);
                                                                                                                                                                                                                                        if (viewA12 != null) {
                                                                                                                                                                                                                                            i = R.id.top_space;
                                                                                                                                                                                                                                            View viewA13 = h5e.a(R.id.top_space, viewInflate);
                                                                                                                                                                                                                                            if (viewA13 != null) {
                                                                                                                                                                                                                                                i = R.id.waiting;
                                                                                                                                                                                                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.waiting, viewInflate);
                                                                                                                                                                                                                                                if (appCompatTextView != null) {
                                                                                                                                                                                                                                                    i = R.id.waiting_button;
                                                                                                                                                                                                                                                    ConstraintLayout constraintLayout11 = (ConstraintLayout) h5e.a(R.id.waiting_button, viewInflate);
                                                                                                                                                                                                                                                    if (constraintLayout11 != null) {
                                                                                                                                                                                                                                                        i = R.id.wc_flag;
                                                                                                                                                                                                                                                        if (((CardView) h5e.a(R.id.wc_flag, viewInflate)) != null) {
                                                                                                                                                                                                                                                            i = R.id.wc_flag_image;
                                                                                                                                                                                                                                                            ImageView imageView7 = (ImageView) h5e.a(R.id.wc_flag_image, viewInflate);
                                                                                                                                                                                                                                                            if (imageView7 != null) {
                                                                                                                                                                                                                                                                this.binding = new qq80(constraintLayout4, textView, textView2, sHBetToggle, textView3, sHBetToggle2, constraintLayout, constraintLayout2, imageView, constraintLayout3, textView4, viewA, viewA2, viewA3, viewA4, viewA5, constraintLayout4, textView5, constraintLayout5, textView6, relativeLayout, textView7, constraintLayout6, imageView2, viewA6, imageView3, appCompatImageView, imageView4, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, viewA7, textView17, textView18, textView19, textView20, imageView5, constraintLayout7, constraintLayout8, textView21, constraintLayout9, imageView6, constraintLayout10, viewA8, viewA9, viewA10, viewA11, viewA12, viewA13, appCompatTextView, constraintLayout11, imageView7);
                                                                                                                                                                                                                                                                this.k0 = "BET";
                                                                                                                                                                                                                                                                this.l0 = 1.15f;
                                                                                                                                                                                                                                                                this.m0 = 0.95f;
                                                                                                                                                                                                                                                                this.n0 = 1.15f;
                                                                                                                                                                                                                                                                sHBetToggle.H = 1;
                                                                                                                                                                                                                                                                un20.a(context);
                                                                                                                                                                                                                                                                this.binding.d.setAlpha(1.0f);
                                                                                                                                                                                                                                                                if (Build.VERSION.SDK_INT <= 25) {
                                                                                                                                                                                                                                                                    this.binding.z.setTextSize(12.0f);
                                                                                                                                                                                                                                                                    this.binding.c.setTextSize(9.0f);
                                                                                                                                                                                                                                                                    this.binding.e.setTextSize(9.0f);
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                setupAutoSizeTextView(this.binding.b);
                                                                                                                                                                                                                                                                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                                                                                                                                                                                                                                                                float f = displayMetrics.heightPixels;
                                                                                                                                                                                                                                                                float f2 = displayMetrics.widthPixels;
                                                                                                                                                                                                                                                                if (f != 0.0f && f2 != 0.0f) {
                                                                                                                                                                                                                                                                    Map mapA = uu80.a(f, f2);
                                                                                                                                                                                                                                                                    Float f3 = (Float) mapA.get("bet_button_text");
                                                                                                                                                                                                                                                                    this.l0 = f3 != null ? f3.floatValue() : 1.15f;
                                                                                                                                                                                                                                                                    Float f4 = (Float) mapA.get("bet_currency_text");
                                                                                                                                                                                                                                                                    this.m0 = f4 != null ? f4.floatValue() : 0.95f;
                                                                                                                                                                                                                                                                    Float f5 = (Float) mapA.get("bet_amount_text");
                                                                                                                                                                                                                                                                    this.n0 = f5 != null ? f5.floatValue() : 1.15f;
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                this.coeff = "";
                                                                                                                                                                                                                                                                this.q0 = new a();
                                                                                                                                                                                                                                                                this.r0 = new b();
                                                                                                                                                                                                                                                                return;
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
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static String H(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 2, 2, null);
        if (listSplit$default.size() < 2) {
            return str;
        }
        return listSplit$default.get(0) + "." + c.p((String) listSplit$default.get(1), ".", "", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setupAutoSizeTextView(TextView textView) {
        int i;
        Context context = getContext();
        if (context == null || (i = Build.VERSION.SDK_INT) >= 26) {
            return;
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen._9ssp);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen._14ssp);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen._1ssp);
        if (i >= 27) {
            qmf0.a.a(textView, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3);
        } else if (textView instanceof eg1) {
            ((eg1) textView).setAutoSizeTextTypeUniformWithConfiguration(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, 0);
        }
    }

    public final void E() {
        this.binding.d.setAlpha(1.0f);
    }

    public final void F() {
        this.binding.S.setVisibility(8);
        this.binding.U.setVisibility(8);
        this.binding.W.setVisibility(8);
        this.binding.Y.setVisibility(8);
        this.binding.Z.setVisibility(8);
    }

    public final void G() {
        String currency;
        String string;
        TextView textView = this.binding.i0;
        Context context = getContext();
        String strB = null;
        if (context != null && (string = context.getString(R.string.place_bet_text_sh)) != null) {
            op5 op5Var = op5.a;
            String string2 = getContext().getString(R.string.place_bet_cms);
            string2.getClass();
            op5Var.getClass();
            strB = op5.b(string2, string, null);
        }
        op5 op5Var2 = op5.a;
        DetailResponse detailResponse = this.h0;
        if (detailResponse == null || (currency = detailResponse.getCurrency()) == null) {
            currency = "";
        }
        op5Var2.getClass();
        String strI = op5.i(currency);
        CharSequence text = this.binding.b.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append(" ");
        sb.append(strI);
        sb.append(" ");
        sb.append((Object) text);
        zug.b(sb, "?", textView);
    }

    public final void I() {
        String str = "0.00";
        this.giftItem = null;
        qq80 qq80Var = this.binding;
        qq80Var.d.R = false;
        this.giftAmount = null;
        this.fbgRoundId = 0L;
        TextView textView = qq80Var.b;
        try {
            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.userInputAmount);
            str2.getClass();
            str = str2;
        } catch (Exception unused) {
        }
        textView.setText(str);
        this.binding.f0.setVisibility(0);
        this.binding.k0.setVisibility(0);
        if (this.autoBetPlace) {
            return;
        }
        setEnableContainer();
        this.binding.b.setAlpha(1.0f);
        this.binding.Q.setAlpha(1.0f);
        this.binding.l0.setVisibility(0);
        this.binding.M.setVisibility(8);
        this.binding.Q.setVisibility(8);
        this.binding.b.getLayoutParams().width = 0;
        this.binding.i.setBackground(getContext().getDrawable(R.drawable.sh_card_bet_amount_background_v2));
        G();
        setBetText();
        K();
        L();
    }

    public final void J() {
        this.binding.v.setBackground(getContext().getDrawable(R.drawable.bet_button_sh_v2));
        this.binding.H.setBackground(getContext().getDrawable(R.drawable.sh_cashout_background));
        this.binding.P.setVisibility(8);
        this.binding.d.k();
        this.binding.f.k();
    }

    public final void K() {
        double dA = tr80.a(this.binding.b);
        DetailResponse detailResponse = this.h0;
        double minAmount = detailResponse != null ? detailResponse.getMinAmount() : 0.0d;
        qq80 qq80Var = this.binding;
        if (dA <= minAmount) {
            qq80Var.f0.setClickable(false);
            this.binding.f0.setAlpha(0.5f);
        } else {
            qq80Var.f0.setClickable(true);
            this.binding.f0.setAlpha(1.0f);
        }
    }

    public final void L() {
        double dA = tr80.a(this.binding.b);
        DetailResponse detailResponse = this.h0;
        double maxAmount = detailResponse != null ? detailResponse.getMaxAmount() : 0.0d;
        qq80 qq80Var = this.binding;
        if (dA >= maxAmount) {
            qq80Var.k0.setClickable(false);
            this.binding.k0.setAlpha(0.5f);
        } else {
            qq80Var.k0.setClickable(true);
            this.binding.k0.setAlpha(1.0f);
        }
    }

    public final boolean M() {
        Integer numValueOf = Integer.valueOf(R.color.warn_toast);
        if (this.betPlaced) {
            gaj<Boolean, String, Integer, Unit> autoCashoutListener = getAutoCashoutListener();
            Boolean boolValueOf = Boolean.valueOf(this.d0);
            op5 op5Var = op5.a;
            String string = getContext().getString(R.string.modify_auto_cashout_cms);
            string.getClass();
            String string2 = getContext().getString(R.string.modify_auto_cashout);
            string2.getClass();
            autoCashoutListener.invoke(boolValueOf, op5.c(op5Var, string, string2), numValueOf);
            return true;
        }
        if (!this.autoBetPlace) {
            return false;
        }
        gaj<Boolean, String, Integer, Unit> autoCashoutListener2 = getAutoCashoutListener();
        Boolean boolValueOf2 = Boolean.valueOf(this.d0);
        op5 op5Var2 = op5.a;
        String string3 = getContext().getString(R.string.turn_off_auto_bet_cms);
        string3.getClass();
        String string4 = getContext().getString(R.string.turn_off);
        string4.getClass();
        autoCashoutListener2.invoke(boolValueOf2, op5.c(op5Var2, string3, string4), numValueOf);
        return true;
    }

    public final void N() {
        try {
            double d = Double.parseDouble(this.binding.G.getText().toString());
            double d2 = Double.parseDouble("1.01");
            qq80 qq80Var = this.binding;
            if (d >= d2) {
                qq80Var.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                this.binding.d.setAlpha(1.0f);
                this.binding.h0.setClickable(true);
                this.binding.h0.setAlpha(1.0f);
                return;
            }
            qq80Var.v.setClickable(false);
            this.binding.v.setAlpha(0.65f);
            this.binding.d.setAlpha(1.0f);
            if (this.binding.h0.getVisibility() == 0) {
                this.binding.h0.setClickable(false);
                this.binding.h0.setAlpha(0.65f);
            }
        } catch (Exception unused) {
        }
    }

    public final boolean getAutoBetPlace() {
        return this.autoBetPlace;
    }

    public final gaj<Boolean, String, Integer, Unit> getAutoCashoutListener() {
        gaj gajVar = this.autoCashoutListener;
        if (gajVar != null) {
            return gajVar;
        }
        Intrinsics.n("autoCashoutListener");
        throw null;
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

    public final boolean getBetPlaced() {
        return this.betPlaced;
    }

    public final boolean getBetPlacedV2() {
        return this.betPlacedV2;
    }

    public final qq80 getBinding() {
        return this.binding;
    }

    public final double getCashoutCoeff() {
        return this.cashoutCoeff;
    }

    public final boolean getCashoutDone() {
        return this.cashoutDone;
    }

    public final boolean getCashoutInProgress() {
        return this.cashoutInProgress;
    }

    public final String getCoeff() {
        return this.coeff;
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

    public final boolean getRainIsActive() {
        return this.rainIsActive;
    }

    public final long getRoundId() {
        return this.roundId;
    }

    public final double getUserInputAmount() {
        return this.userInputAmount;
    }

    public final void setAutoBetCount(int count) {
        this.binding.d.setAutoBetCount(count);
    }

    public final void setAutoBetPlace(boolean z) {
        this.autoBetPlace = z;
    }

    public final void setAutoCashoutAmount(final Function0<Unit> cashoutAmount) {
        cashoutAmount.getClass();
        gr60.a(this.binding.J, new Function1() { // from class: jr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function0 function0 = cashoutAmount;
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    if (!shBetContainer.M()) {
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                        function0.invoke();
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setAutoCashoutListener(gaj<? super Boolean, ? super String, ? super Integer, Unit> gajVar) {
        gajVar.getClass();
        this.autoCashoutListener = gajVar;
    }

    public final void setBetAmount(double d) {
        this.betAmount = d;
    }

    public final void setBetClear() {
        this.binding.b.setText("0.00");
        this.b0 = false;
    }

    public final void setBetContainerBgWcTheme(boolean isWorldCupThemeEnabled) {
        if (!isWorldCupThemeEnabled) {
            this.binding.u0.setVisibility(8);
            this.binding.w.setVisibility(8);
            this.binding.A.setVisibility(8);
            this.binding.B.setVisibility(8);
            this.binding.C.setVisibility(8);
            this.binding.D.setVisibility(8);
            return;
        }
        String strA = e6a.a();
        Locale locale = Locale.ROOT;
        String lowerCase = strA.toLowerCase(locale);
        lowerCase.getClass();
        String strI = krh0.i(lowerCase);
        this.binding.w.setVisibility(0);
        op5.a.getClass();
        String strB = op5.b("football_webp:sg_common", "https://s.sporty.net/cms/Dummy_Trionda_4745258da5.png", null);
        Context context = getContext();
        context.getClass();
        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
        xa50VarC.getClass();
        po80 po80Var = new po80(xa50VarC, strB, na7.a(xa50VarC, Drawable.class, strB), lo80.a);
        hre.a aVar = hre.a;
        aVar.getClass();
        po80Var.c(aVar);
        po80Var.e(this.binding.w);
        this.binding.u0.setVisibility(8);
        if (strI.length() == 0) {
            return;
        }
        this.binding.u0.setVisibility(0);
        Context context2 = getContext();
        context2.getClass();
        xa50 xa50VarA = np5.a(context2, context2);
        po80 po80Var2 = new po80(xa50VarA, strI, na7.a(xa50VarA, Drawable.class, strI), lo80.a);
        po80Var2.c(aVar);
        po80Var2.e(this.binding.u0);
        ImageView imageView = this.binding.u0;
        String country = SportyGamesManager.getInstance().getCountry();
        if (country == null) {
            country = "";
        }
        String lowerCase2 = country.toLowerCase(locale);
        lowerCase2.getClass();
        imageView.setAlpha(krh0.h(lowerCase2));
        this.binding.A.setVisibility(0);
        this.binding.B.setVisibility(0);
        this.binding.C.setVisibility(0);
        this.binding.D.setVisibility(0);
    }

    public final void setBetCross() {
        try {
            CharSequence text = this.binding.b.getText();
            String string = text != null ? text.toString() : null;
            if (string != null && string.length() != 0) {
                CharSequence text2 = this.binding.b.getText();
                String string2 = text2 != null ? text2.toString() : null;
                if (string2 != null && StringsKt.M(string2, ".00", false)) {
                    this.b0 = false;
                    List listSplit$default = StringsKt__StringsKt.split$default(string2, new String[]{"."}, false, 0, 6, null);
                    int length = ((String) listSplit$default.get(0)).length();
                    qq80 qq80Var = this.binding;
                    String str = "0.00";
                    if (length == 1) {
                        qq80Var.b.setText("0.00");
                        return;
                    }
                    TextView textView = qq80Var.b;
                    try {
                        String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(((String) listSplit$default.get(0)).substring(0, ((String) listSplit$default.get(0)).length() - 1)));
                        str2.getClass();
                        str = str2;
                    } catch (Exception unused) {
                    }
                    textView.setText(str);
                    return;
                }
                List listSplit$default2 = string2 != null ? StringsKt__StringsKt.split$default(string2, new String[]{"."}, false, 0, 6, null) : null;
                if (listSplit$default2 == null || listSplit$default2.size() != 2) {
                    return;
                }
                char cI = wae0.I((CharSequence) listSplit$default2.get(1));
                qq80 qq80Var2 = this.binding;
                if (cI == '0') {
                    qq80Var2.b.setText(listSplit$default2.get(0) + ".00");
                    return;
                }
                qq80Var2.b.setText(listSplit$default2.get(0) + "." + ((String) listSplit$default2.get(1)).substring(0, ((String) listSplit$default2.get(1)).length() - 1) + "0");
            }
        } catch (Exception unused2) {
        }
    }

    public final void setBetDone() {
        try {
            try {
                String string = this.binding.b.getText().toString();
                String str = "0.00";
                String str2 = null;
                if (string == null || string.length() == 0) {
                    TextView textView = this.binding.b;
                    DetailResponse detailResponse = this.h0;
                    if (detailResponse != null) {
                        try {
                            String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(detailResponse.getMinAmount());
                            str3.getClass();
                            str = str3;
                        } catch (Exception unused) {
                        }
                        str2 = str;
                    }
                    textView.setText(str2);
                } else {
                    double d = Double.parseDouble(string);
                    DetailResponse detailResponse2 = this.h0;
                    if (d >= (detailResponse2 != null ? detailResponse2.getMaxAmount() : 0.0d)) {
                        TextView textView2 = this.binding.b;
                        DetailResponse detailResponse3 = this.h0;
                        if (detailResponse3 != null) {
                            try {
                                String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(detailResponse3.getMaxAmount());
                                str4.getClass();
                                str = str4;
                            } catch (Exception unused2) {
                            }
                            str2 = str;
                        }
                        textView2.setText(str2);
                    } else {
                        double d2 = Double.parseDouble(string);
                        DetailResponse detailResponse4 = this.h0;
                        double minAmount = detailResponse4 != null ? detailResponse4.getMinAmount() : 0.0d;
                        qq80 qq80Var = this.binding;
                        if (d2 <= minAmount) {
                            TextView textView3 = qq80Var.b;
                            DetailResponse detailResponse5 = this.h0;
                            if (detailResponse5 != null) {
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(detailResponse5.getMinAmount());
                                    str5.getClass();
                                    str = str5;
                                } catch (Exception unused3) {
                                }
                                str2 = str;
                            }
                            textView3.setText(str2);
                        } else {
                            TextView textView4 = qq80Var.b;
                            try {
                                String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(string));
                                str6.getClass();
                                str = str6;
                            } catch (Exception unused4) {
                            }
                            textView4.setText(str);
                        }
                    }
                }
                this.b0 = false;
            } catch (Exception unused5) {
            }
        } finally {
            this.binding.i.setEnabled(false);
        }
    }

    public final void setBetDoubleZero() {
        String string = this.binding.b.getText().toString();
        if (this.b0) {
            return;
        }
        List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
        if (listSplit$default.size() > 1) {
            if (Intrinsics.g(listSplit$default.get(0), "0") || Intrinsics.g(listSplit$default.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default.get(0)).length() == 0) {
                this.binding.b.setText("0." + listSplit$default.get(1));
                return;
            }
            this.binding.b.setText(listSplit$default.get(0) + "00." + listSplit$default.get(1));
        }
    }

    public final void setBetId(long j) {
        this.betId = j;
    }

    public final void setBetInProgress(boolean z) {
        this.betInProgress = z;
    }

    public final void setBetListener(final Function1<? super String, Unit> betListener, final Function0<Boolean> isNotLoggedIn, final Function0<Unit> openLoginDialog) {
        betListener.getClass();
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        gr60.a(this.binding.v, new Function1() { // from class: or80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function0 function0 = isNotLoggedIn;
                Function0 function1 = openLoginDialog;
                ShBetContainer shBetContainer = this;
                Function1 function2 = betListener;
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    if (((Boolean) function0.invoke()).booleanValue()) {
                        function1.invoke();
                    } else {
                        shBetContainer.F();
                        function2.invoke(shBetContainer.binding.b.getText().toString());
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setBetModel(final DetailResponse gameDetailResponse) {
        gameDetailResponse.getClass();
        this.h0 = gameDetailResponse;
        this.binding.F.setVisibility(0);
        TextView textView = this.binding.d0;
        Context context = getContext();
        TreeMap treeMap = pw.a;
        textView.setText(context.getString(R.string.colon_amount, pw.n(gameDetailResponse.getMinAmount())));
        this.binding.b0.setText(getContext().getString(R.string.colon_amount, pw.n(gameDetailResponse.getMaxAmount())));
        if (this.giftItem == null) {
            double d = this.userInputAmount;
            String str = "0.00";
            if (d <= 0.0d || d < gameDetailResponse.getMinAmount()) {
                TextView textView2 = this.binding.b;
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(gameDetailResponse.getDefaultAmount());
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                textView2.setText(str);
                this.userInputAmount = tr80.a(this.binding.b);
            } else {
                TextView textView3 = this.binding.b;
                try {
                    String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.userInputAmount);
                    str3.getClass();
                    str = str3;
                } catch (Exception unused2) {
                }
                textView3.setText(str);
                this.userInputAmount = tr80.a(this.binding.b);
            }
        }
        G();
        setBetText();
        int i = 1;
        if (this.fbgAvailable) {
            if (yju.a("br")) {
                this.binding.O.setBackground(getContext().getDrawable(R.drawable.sh_br_hint));
            }
            this.binding.O.setVisibility(0);
            this.binding.O.setVisibility(0);
            this.binding.R.setVisibility(4);
            this.binding.Z.setVisibility(8);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.T);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.V);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.X);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.S);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.U);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.W);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.Y);
        } else {
            this.binding.O.setVisibility(8);
            this.binding.R.setVisibility(0);
            this.binding.Z.setVisibility(8);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.R);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.T);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.V);
            ajc.a((Number) gez.a(gameDetailResponse, 3), this.binding.X);
            ajc.a((Number) gez.a(gameDetailResponse, 0), this.binding.S);
            ajc.a((Number) gez.a(gameDetailResponse, 1), this.binding.U);
            ajc.a((Number) gez.a(gameDetailResponse, 2), this.binding.W);
            ajc.a((Number) gez.a(gameDetailResponse, 3), this.binding.Y);
        }
        CharSequence text = this.binding.G.getText();
        text.getClass();
        if (text.length() == 0) {
            this.binding.G.setText("5");
            this.cashoutCoeff = Double.parseDouble("5");
        }
        K();
        if (this.o0) {
            return;
        }
        this.o0 = true;
        this.binding.b.addTextChangedListener(this.q0);
        this.binding.G.addTextChangedListener(this.r0);
        gr60.a(this.binding.O, new feh(this, i));
        this.binding.R.setOnClickListener(new och(i, this, gameDetailResponse));
        this.binding.T.setOnClickListener(new View.OnClickListener() { // from class: tq80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.s0;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        int i3 = !shBetContainer.fbgAvailable ? 1 : 0;
                        boolean z = shBetContainer.H;
                        DetailResponse detailResponse = gameDetailResponse;
                        String str4 = "0.00";
                        if (z) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(i3).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView4 = shBetContainer.binding.b;
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                                    str5.getClass();
                                    str4 = str5;
                                } catch (Exception unused3) {
                                }
                                textView4.setText(str4);
                            }
                            shBetContainer.binding.U.setVisibility(0);
                        } else {
                            TextView textView5 = shBetContainer.binding.b;
                            Double d2 = detailResponse.getDefaultChips().get(i3);
                            d2.getClass();
                            try {
                                String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2.doubleValue());
                                str6.getClass();
                                str4 = str6;
                            } catch (Exception unused4) {
                            }
                            textView5.setText(str4);
                            shBetContainer.G = false;
                            shBetContainer.H = true;
                            shBetContainer.I = false;
                            shBetContainer.J = false;
                            shBetContainer.binding.S.setVisibility(8);
                            shBetContainer.binding.U.setVisibility(0);
                            shBetContainer.binding.W.setVisibility(8);
                            shBetContainer.binding.Y.setVisibility(8);
                        }
                        shBetContainer.K();
                        shBetContainer.L();
                        shBetContainer.G();
                        shBetContainer.setBetText();
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.G.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.G.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("5");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(2);
                    }
                } catch (Exception unused5) {
                }
            }
        });
        this.binding.V.setOnClickListener(new View.OnClickListener() { // from class: vq80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.s0;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        int i3 = shBetContainer.fbgAvailable ? 1 : 2;
                        boolean z = shBetContainer.I;
                        DetailResponse detailResponse = gameDetailResponse;
                        String str4 = "0.00";
                        if (z) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(i3).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView4 = shBetContainer.binding.b;
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                                    str5.getClass();
                                    str4 = str5;
                                } catch (Exception unused3) {
                                }
                                textView4.setText(str4);
                            }
                            shBetContainer.binding.W.setVisibility(0);
                        } else {
                            TextView textView5 = shBetContainer.binding.b;
                            Double d2 = detailResponse.getDefaultChips().get(i3);
                            d2.getClass();
                            try {
                                String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2.doubleValue());
                                str6.getClass();
                                str4 = str6;
                            } catch (Exception unused4) {
                            }
                            textView5.setText(str4);
                            shBetContainer.G = false;
                            shBetContainer.H = false;
                            shBetContainer.I = true;
                            shBetContainer.J = false;
                            shBetContainer.binding.S.setVisibility(8);
                            shBetContainer.binding.U.setVisibility(8);
                            shBetContainer.binding.W.setVisibility(0);
                            shBetContainer.binding.Y.setVisibility(8);
                        }
                        shBetContainer.K();
                        shBetContainer.L();
                        shBetContainer.G();
                        shBetContainer.setBetText();
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.G.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.G.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("1.01");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(3);
                    }
                } catch (Exception unused5) {
                }
            }
        });
        this.binding.X.setOnClickListener(new View.OnClickListener() { // from class: xq80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.s0;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        int i3 = shBetContainer.fbgAvailable ? 2 : 3;
                        boolean z = shBetContainer.J;
                        DetailResponse detailResponse = gameDetailResponse;
                        String str4 = "0.00";
                        if (z) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(i3).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView4 = shBetContainer.binding.b;
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(dDoubleValue);
                                    str5.getClass();
                                    str4 = str5;
                                } catch (Exception unused3) {
                                }
                                textView4.setText(str4);
                            }
                            shBetContainer.binding.Y.setVisibility(0);
                        } else {
                            TextView textView5 = shBetContainer.binding.b;
                            Double d2 = detailResponse.getDefaultChips().get(i3);
                            d2.getClass();
                            try {
                                String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2.doubleValue());
                                str6.getClass();
                                str4 = str6;
                            } catch (Exception unused4) {
                            }
                            textView5.setText(str4);
                            shBetContainer.G = false;
                            shBetContainer.H = false;
                            shBetContainer.I = false;
                            shBetContainer.J = true;
                            shBetContainer.binding.S.setVisibility(8);
                            shBetContainer.binding.U.setVisibility(8);
                            shBetContainer.binding.W.setVisibility(8);
                            shBetContainer.binding.Y.setVisibility(0);
                        }
                        shBetContainer.K();
                        shBetContainer.L();
                        shBetContainer.G();
                        shBetContainer.setBetText();
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.G.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.G.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("5");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(4);
                    }
                } catch (Exception unused5) {
                }
            }
        });
    }

    public final void setBetNumberClick(int number) {
        String string = this.binding.b.getText().toString();
        if (this.b0) {
            List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
            if (listSplit$default.size() == 2) {
                if (wae0.F((CharSequence) listSplit$default.get(1)) == '0') {
                    this.binding.b.setText(listSplit$default.get(0) + "." + number + wae0.I((CharSequence) listSplit$default.get(1)));
                    return;
                }
                if (wae0.I((CharSequence) listSplit$default.get(1)) == '0') {
                    this.binding.b.setText(listSplit$default.get(0) + "." + ((String) listSplit$default.get(1)).substring(0, ((String) listSplit$default.get(1)).length() - 1) + number);
                    return;
                }
                return;
            }
            return;
        }
        List listSplit$default2 = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
        if (listSplit$default2.size() > 1) {
            if (Intrinsics.g(listSplit$default2.get(0), "0") || Intrinsics.g(listSplit$default2.get(0), CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS) || ((CharSequence) listSplit$default2.get(0)).length() == 0) {
                this.binding.b.setText(number + "." + listSplit$default2.get(1));
                return;
            }
            if (this.binding.b.getText().length() <= 11) {
                this.binding.b.setText(listSplit$default2.get(0) + number + "." + listSplit$default2.get(1));
            }
        }
    }

    public final void setBetPlaced(boolean z) {
        this.betPlaced = z;
    }

    public final void setBetPlacedV2(boolean z) {
        this.betPlacedV2 = z;
    }

    public final void setBetPointClick() {
        try {
            String string = this.binding.b.getText().toString();
            if (string.length() > 0 && !StringsKt.M(string, ".", false)) {
                this.binding.b.setText(string.concat("."));
            }
            this.b0 = true;
        } catch (Exception unused) {
        }
    }

    public final void setBetStepListener(final Function1<? super String, Unit> betStepListener) {
        betStepListener.getClass();
        this.binding.i.setEnabled(false);
        this.binding.f0.setOnClickListener(new View.OnClickListener() { // from class: fr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = betStepListener;
                int i = ShBetContainer.s0;
                String str = "0.00";
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        shBetContainer.F();
                        double d = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse = shBetContainer.h0;
                        if (d <= (detailResponse != null ? detailResponse.getMinAmount() : 0.0d)) {
                            return;
                        }
                        double d2 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse2 = shBetContainer.h0;
                        double stepAmount = d2 - (detailResponse2 != null ? detailResponse2.getStepAmount() : 0.0d);
                        DetailResponse detailResponse3 = shBetContainer.h0;
                        if (stepAmount < (detailResponse3 != null ? detailResponse3.getMinAmount() : 0.0d)) {
                            return;
                        }
                        TextView textView = shBetContainer.binding.b;
                        try {
                            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(stepAmount);
                            str2.getClass();
                            str = str2;
                        } catch (Exception unused) {
                        }
                        textView.setText(str);
                        shBetContainer.K();
                        shBetContainer.L();
                        shBetContainer.G();
                        shBetContainer.setBetText();
                        if (shBetContainer.d0) {
                            shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.G.getText().toString()));
                        }
                        if (Double.parseDouble(shBetContainer.binding.G.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.G.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("1.01");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        function1.invoke("Decrease");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
        this.binding.k0.setOnClickListener(new kfm(1, this, betStepListener));
    }

    public final void setBetText() {
        String strB;
        String currency;
        String string;
        Context context = getContext();
        if (context == null || (string = context.getString(R.string.bet)) == null) {
            strB = "BET";
        } else {
            op5 op5Var = op5.a;
            String string2 = getContext().getString(R.string.bet_upper_case_cms);
            string2.getClass();
            op5Var.getClass();
            strB = op5.b(string2, string, null);
        }
        this.k0 = strB;
        op5 op5Var2 = op5.a;
        DetailResponse detailResponse = this.h0;
        if (detailResponse == null || (currency = detailResponse.getCurrency()) == null) {
            currency = "";
        }
        op5Var2.getClass();
        String strI = op5.i(currency);
        String string3 = this.binding.b.getText().toString();
        String str = "0.00";
        if (string3 == null || string3.length() == 0) {
            this.binding.b.setText("0.00");
        }
        try {
            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(tr80.a(this.binding.b));
            str2.getClass();
            str = str2;
        } catch (Exception unused) {
        }
        String str3 = this.k0 + "\n" + strI + " " + str;
        SpannableString spannableString = new SpannableString(str3);
        spannableString.setSpan(new StyleSpan(1), 0, this.k0.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(this.l0), 0, this.k0.length(), 33);
        int iT = StringsKt.T(str3, strI, 0, false, 6);
        int length = strI.length() + iT;
        spannableString.setSpan(new StyleSpan(0), iT, length, 33);
        spannableString.setSpan(new RelativeSizeSpan(this.m0), iT, length, 33);
        int i = length + 1;
        spannableString.setSpan(new StyleSpan(1), i, str3.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(this.n0), i, str3.length(), 33);
        this.binding.z.setText(spannableString);
    }

    public final void setBinding(qq80 qq80Var) {
        qq80Var.getClass();
        this.binding = qq80Var;
    }

    public final void setCancelBetListener(final Function1<? super String, Unit> cancelBetListener) {
        cancelBetListener.getClass();
        gr60.a(this.binding.L, new Function1(this) { // from class: qr80
            public final /* synthetic */ ShBetContainer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function1 function1 = cancelBetListener;
                ShBetContainer shBetContainer = this.b;
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    function1.invoke(shBetContainer.binding.b.getText().toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setCashOutAmount() {
        String str = "0.00";
        CharSequence text = this.binding.G.getText();
        text.getClass();
        if (text.length() > 0) {
            if (tr80.a(this.binding.G) < Double.parseDouble("1.01")) {
                this.binding.G.setText("1.01");
                this.cashoutCoeff = Double.parseDouble("1.01");
            }
            double d = Double.parseDouble(this.binding.b.getText().toString()) * tr80.a(this.binding.G);
            DetailResponse detailResponse = this.h0;
            if (d >= (detailResponse != null ? detailResponse.getMaxPayoutAmount() : 0.0d)) {
                TextView textView = this.binding.G;
                DetailResponse detailResponse2 = this.h0;
                try {
                    String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format((detailResponse2 != null ? detailResponse2.getMaxPayoutAmount() : 0.0d) / Double.parseDouble(this.binding.b.getText().toString()));
                    str2.getClass();
                    str = str2;
                } catch (Exception unused) {
                }
                textView.setText(str);
                this.cashoutCoeff = tr80.a(this.binding.G);
            }
        }
    }

    public final void setCashoutAmount(int number) {
        String strValueOf;
        if (M()) {
            return;
        }
        String string = this.binding.G.getText().toString();
        if (string.length() <= 0 || string.equals("0")) {
            strValueOf = String.valueOf(number);
        } else if (StringsKt.M(string, ".", false)) {
            List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null);
            if (listSplit$default.size() != 2) {
                strValueOf = listSplit$default.get(0) + "." + number;
            } else if (((String) listSplit$default.get(1)).length() < 2) {
                strValueOf = listSplit$default.get(0) + "." + listSplit$default.get(1) + number;
            } else {
                strValueOf = listSplit$default.get(0) + "." + listSplit$default.get(1);
            }
        } else if (Double.parseDouble(string) == 0.0d && number == 0) {
            return;
        } else {
            strValueOf = hce0.a(number, string);
        }
        this.binding.G.setText(strValueOf);
        this.cashoutCoeff = Double.parseDouble(strValueOf);
        N();
    }

    public final void setCashoutCoeff(double d) {
        this.cashoutCoeff = d;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final void setCashoutDone() {
        CharSequence text = this.binding.G.getText();
        text.getClass();
        if (text.length() == 0) {
            this.binding.v.setClickable(true);
            this.binding.v.setAlpha(1.0f);
            this.binding.G.setText("1.01");
            this.cashoutCoeff = Double.parseDouble("1.01");
        } else {
            double d = this.cashoutCoeff;
            if (d == 0.0d || d < Double.parseDouble("1.01")) {
                this.binding.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                this.binding.G.setText("1.01");
                this.cashoutCoeff = Double.parseDouble("1.01");
            }
        }
        N();
        this.binding.H.setEnabled(false);
        this.b0 = false;
    }

    public final void setCashoutInProgress(boolean z) {
        this.cashoutInProgress = z;
    }

    public final void setCashoutListener(final Function1<? super String, Unit> cashoutListener) {
        cashoutListener.getClass();
        gr60.a(this.binding.I, new Function1() { // from class: hr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = cashoutListener;
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    shBetContainer.F();
                    function1.invoke(shBetContainer.binding.b.getText().toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setClear() {
        if (!M()) {
            this.binding.G.setText("0");
            this.cashoutCoeff = 0.0d;
        }
        N();
    }

    public final void setCoeff(String str) {
        str.getClass();
        this.coeff = str;
    }

    public final void setConfirmBetListener(final Function1<? super String, Unit> confirmBetListener) {
        confirmBetListener.getClass();
        gr60.a(this.binding.h0, new Function1() { // from class: zq80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = confirmBetListener;
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    shBetContainer.F();
                    function1.invoke(shBetContainer.binding.b.getText().toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setCross() {
        if (M()) {
            return;
        }
        if (!Intrinsics.g(this.binding.G.getText().toString(), "0")) {
            String string = this.binding.G.getText().toString();
            int length = this.binding.G.getText().toString().length() - 1;
            if (length <= 0) {
                length = 0;
            }
            String strSubstring = string.substring(0, length);
            int length2 = strSubstring.length();
            qq80 qq80Var = this.binding;
            if (length2 > 0) {
                qq80Var.G.setText(strSubstring);
                this.cashoutCoeff = Double.parseDouble(strSubstring);
            } else {
                qq80Var.G.setText("0");
                this.cashoutCoeff = 0.0d;
            }
        }
        N();
    }

    public final void setDisableContainer() {
        this.c0 = true;
        this.binding.f0.setClickable(false);
        this.binding.f0.setAlpha(0.5f);
        this.binding.k0.setClickable(false);
        this.binding.k0.setAlpha(0.5f);
        if (this.giftItem == null) {
            this.binding.b.setAlpha(0.5f);
        }
        if (this.giftItem != null && this.betPlaced) {
            this.binding.b.setAlpha(0.5f);
            this.binding.Q.setAlpha(0.5f);
        }
        this.binding.b.setClickable(false);
        this.binding.R.setClickable(false);
        this.binding.R.setEnabled(false);
        this.binding.R.setAlpha(0.5f);
        this.binding.T.setClickable(false);
        this.binding.T.setEnabled(false);
        this.binding.T.setAlpha(0.5f);
        this.binding.V.setClickable(false);
        this.binding.V.setEnabled(false);
        this.binding.V.setAlpha(0.5f);
        this.binding.X.setClickable(false);
        this.binding.X.setEnabled(false);
        this.binding.X.setAlpha(0.5f);
    }

    public final void setDone() {
        float f;
        if (M()) {
            return;
        }
        try {
            CharSequence text = this.binding.G.getText();
            text.getClass();
            if (text.length() != 0 && Double.parseDouble(this.binding.G.getText().toString()) > Double.parseDouble("1.01")) {
                double d = Double.parseDouble(this.binding.G.getText().toString()) * Double.parseDouble(this.binding.b.getText().toString());
                DetailResponse detailResponse = this.h0;
                String str = "0.00";
                if (d > (detailResponse != null ? detailResponse.getMaxPayoutAmount() : 0.0d)) {
                    DetailResponse detailResponse2 = this.h0;
                    double maxPayoutAmount = (detailResponse2 != null ? detailResponse2.getMaxPayoutAmount() : 0.0d) / Double.parseDouble(this.binding.b.getText().toString());
                    if (!StringsKt.M(String.valueOf(maxPayoutAmount), ".", false) || ((CharSequence) StringsKt__StringsKt.split$default(String.valueOf(maxPayoutAmount), new String[]{"."}, false, 0, 6, null).get(1)).length() <= 0 || Double.parseDouble((String) StringsKt__StringsKt.split$default(String.valueOf(maxPayoutAmount), new String[]{"."}, false, 0, 6, null).get(1)) <= 0.0d) {
                        this.binding.G.setText((CharSequence) StringsKt__StringsKt.split$default(String.valueOf(maxPayoutAmount), new String[]{"."}, false, 0, 6, null).get(0));
                    } else {
                        TextView textView = this.binding.G;
                        try {
                            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(maxPayoutAmount);
                            str2.getClass();
                            str = str2;
                        } catch (Exception unused) {
                        }
                        textView.setText(str);
                    }
                    this.cashoutCoeff = Double.parseDouble(this.binding.G.getText().toString());
                } else {
                    String strH = H(this.binding.G.getText().toString());
                    if (!StringsKt.M(strH, ".", false) || ((CharSequence) StringsKt__StringsKt.split$default(strH, new String[]{"."}, false, 0, 6, null).get(1)).length() <= 0 || Double.parseDouble((String) StringsKt__StringsKt.split$default(strH, new String[]{"."}, false, 0, 6, null).get(1)) <= 0.0d) {
                        this.binding.G.setText((CharSequence) StringsKt__StringsKt.split$default(strH, new String[]{"."}, false, 0, 6, null).get(0));
                    } else {
                        TextView textView2 = this.binding.G;
                        try {
                            String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(strH));
                            str3.getClass();
                            str = str3;
                        } catch (Exception unused2) {
                        }
                        textView2.setText(str);
                    }
                    this.cashoutCoeff = Double.parseDouble(this.binding.G.getText().toString());
                }
            } else {
                this.binding.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                this.binding.G.setText("1.01");
                this.cashoutCoeff = Double.parseDouble("1.01");
            }
            String string = this.binding.G.getText().toString();
            try {
                if (string.length() > 0) {
                    if (string.length() > 6) {
                        f = 8.0f;
                    } else if (string.length() > 5) {
                        f = 9.0f;
                    } else {
                        f = string.length() > 4 ? 10.0f : 11.0f;
                    }
                    this.binding.G.setTextSize(2, f);
                    this.binding.K.setTextSize(2, f);
                }
            } catch (Exception unused3) {
            }
            N();
            this.binding.H.setEnabled(false);
        } catch (Exception unused4) {
        }
    }

    public final void setDoubleZero() {
        if (M()) {
            return;
        }
        String string = this.binding.G.getText().toString();
        if ((string.length() == 0 || Double.parseDouble(string) == 0.0d) && !StringsKt.M(string, ".", false)) {
            this.coeff = "0";
            this.binding.G.setText("0");
        } else if (!StringsKt.M(string, ".", false)) {
            String strConcat = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
            this.coeff = strConcat;
            this.binding.G.setText(strConcat);
        } else if (((String) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
            String strConcat2 = string.concat("0");
            this.coeff = strConcat2;
            this.binding.G.setText(strConcat2);
        } else if (((CharSequence) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
            String strConcat3 = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
            this.coeff = strConcat3;
            this.binding.G.setText(strConcat3);
        }
        if (this.coeff.length() > 0) {
            this.binding.G.setText(this.coeff);
        }
        this.cashoutCoeff = tr80.a(this.binding.G);
    }

    public final void setEnableContainer() {
        if (this.c0 && this.giftItem == null && !this.autoBetPlace) {
            try {
                double d = Double.parseDouble(this.binding.b.getText().toString());
                DetailResponse detailResponse = this.h0;
                if (d >= (detailResponse != null ? detailResponse.getMinAmount() : 0.0d)) {
                    this.binding.f0.setClickable(true);
                    this.binding.f0.setAlpha(1.0f);
                }
                double d2 = Double.parseDouble(this.binding.b.getText().toString());
                DetailResponse detailResponse2 = this.h0;
                if (d2 <= (detailResponse2 != null ? detailResponse2.getMaxAmount() : 0.0d)) {
                    this.binding.k0.setClickable(true);
                    this.binding.k0.setAlpha(1.0f);
                }
            } catch (Exception unused) {
            }
            this.binding.b.setClickable(true);
            if (this.autoBetPlace) {
                return;
            }
            this.binding.b.setAlpha(1.0f);
            this.binding.Q.setAlpha(1.0f);
            this.binding.R.setClickable(true);
            this.binding.R.setAlpha(1.0f);
            this.binding.R.setEnabled(true);
            this.binding.T.setClickable(true);
            this.binding.T.setAlpha(1.0f);
            this.binding.T.setEnabled(true);
            this.binding.V.setClickable(true);
            this.binding.V.setAlpha(1.0f);
            this.binding.V.setEnabled(true);
            this.binding.X.setClickable(true);
            this.binding.X.setAlpha(1.0f);
            this.binding.X.setEnabled(true);
            this.c0 = false;
        }
    }

    public final void setFBG(GiftItem giftItem, boolean betPlaced, double amount) {
        String str = "0.00";
        giftItem.getClass();
        this.giftItem = giftItem;
        this.binding.d.R = true;
        this.giftAmount = Double.valueOf(amount);
        this.binding.f0.setVisibility(4);
        this.binding.k0.setVisibility(4);
        qq80 qq80Var = this.binding;
        if (betPlaced) {
            qq80Var.l0.setVisibility(4);
            this.binding.M.setVisibility(8);
        } else {
            qq80Var.M.setVisibility(0);
        }
        this.binding.b.getLayoutParams().width = -2;
        this.binding.Q.setVisibility(0);
        setDisableContainer();
        this.binding.i.setBackground(getContext().getDrawable(R.drawable.card_bet_gift));
        TextView textView = this.binding.b;
        try {
            String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(amount);
            str2.getClass();
            str = str2;
        } catch (Exception unused) {
        }
        textView.setText(str);
        G();
        setBetText();
        this.binding.S.setVisibility(8);
        this.binding.U.setVisibility(8);
        this.binding.W.setVisibility(8);
        this.binding.Y.setVisibility(8);
    }

    public final void setFBGRemoveListener(final Function0<Unit> removeFBGListener) {
        removeFBGListener.getClass();
        gr60.a(this.binding.M, new Function1() { // from class: nr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function0 function0 = removeFBGListener;
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        op5.a.getClass();
                        String str = op5.c;
                        if (str == null) {
                            str = "";
                        }
                        wz.a("FBGRemoved", krh0.e(str), new String[0]);
                        shBetContainer.I();
                        function0.invoke();
                        return Unit.a;
                    }
                    return Unit.a;
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public final void setFbgAvailable(boolean z) {
        this.fbgAvailable = z;
    }

    public final void setFbgClickListener(Function1<? super Boolean, Unit> listener) {
        listener.getClass();
        this.g0 = listener;
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

    public final void setOnBetChipSelected(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.onBetChipSelected = function1;
    }

    public final void setOnBetChipSelectedListener(Function1<? super Integer, Unit> listener) {
        listener.getClass();
        setOnBetChipSelected(listener);
    }

    public final void setPoint() {
        if (M() || StringsKt.M(this.binding.G.getText().toString(), ".", false)) {
            return;
        }
        TextView textView = this.binding.G;
        textView.setText(((Object) textView.getText()) + ".");
    }

    public final void setRainActive(boolean isActive) {
        this.rainIsActive = isActive;
        qq80 qq80Var = this.binding;
        if (!isActive) {
            qq80Var.P.setVisibility(8);
            return;
        }
        qq80Var.P.setVisibility(0);
        op5 op5Var = op5.a;
        String string = getContext().getString(R.string.rain_drops_gif);
        string.getClass();
        String strC = op5.c(op5Var, string, "");
        Context context = getContext();
        context.getClass();
        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
        xa50VarC.getClass();
        po80<thk> po80VarA = new mo80(xa50VarC).a(Uri.parse(strC));
        po80VarA.h();
        hre.a aVar = hre.a;
        aVar.getClass();
        po80VarA.c(aVar);
        ea50<T> ea50VarR = po80VarA.c.R();
        ea50VarR.getClass();
        po80VarA.c = ea50VarR;
        po80VarA.e(this.binding.P);
    }

    public final void setRainIsActive(boolean z) {
        this.rainIsActive = z;
    }

    public final void setRoundId(long j) {
        this.roundId = j;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x071d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0722  */
    /* JADX WARN: Code duplicated, block: B:104:0x072e  */
    /* JADX WARN: Code duplicated, block: B:105:0x0733  */
    /* JADX WARN: Code duplicated, block: B:108:0x0753  */
    /* JADX WARN: Code duplicated, block: B:109:0x0758  */
    /* JADX WARN: Code duplicated, block: B:112:0x0764  */
    /* JADX WARN: Code duplicated, block: B:113:0x0769  */
    /* JADX WARN: Code duplicated, block: B:116:0x0789  */
    /* JADX WARN: Code duplicated, block: B:119:0x0799  */
    /* JADX WARN: Code duplicated, block: B:122:0x07bd  */
    /* JADX WARN: Code duplicated, block: B:125:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:126:0x07e6  */
    /* JADX WARN: Code duplicated, block: B:129:0x0807  */
    /* JADX WARN: Code duplicated, block: B:130:0x080c  */
    /* JADX WARN: Code duplicated, block: B:133:0x082c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0850  */
    /* JADX WARN: Code duplicated, block: B:139:0x0877  */
    /* JADX WARN: Code duplicated, block: B:140:0x087c  */
    /* JADX WARN: Code duplicated, block: B:143:0x088c  */
    /* JADX WARN: Code duplicated, block: B:144:0x0891  */
    /* JADX WARN: Code duplicated, block: B:147:0x08b0  */
    /* JADX WARN: Code duplicated, block: B:150:0x08be  */
    /* JADX WARN: Code duplicated, block: B:153:0x08ff  */
    /* JADX WARN: Code duplicated, block: B:154:0x0912  */
    /* JADX WARN: Code duplicated, block: B:156:0x0916  */
    /* JADX WARN: Code duplicated, block: B:157:0x0929  */
    /* JADX WARN: Code duplicated, block: B:159:0x092d  */
    /* JADX WARN: Code duplicated, block: B:15:0x0490  */
    /* JADX WARN: Code duplicated, block: B:16:0x0495  */
    /* JADX WARN: Code duplicated, block: B:19:0x04b6  */
    /* JADX WARN: Code duplicated, block: B:20:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x04db  */
    /* JADX WARN: Code duplicated, block: B:24:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:27:0x0501  */
    /* JADX WARN: Code duplicated, block: B:30:0x0525  */
    /* JADX WARN: Code duplicated, block: B:33:0x0549  */
    /* JADX WARN: Code duplicated, block: B:34:0x054e  */
    /* JADX WARN: Code duplicated, block: B:37:0x056e  */
    /* JADX WARN: Code duplicated, block: B:40:0x057e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0583  */
    /* JADX WARN: Code duplicated, block: B:44:0x05a3  */
    /* JADX WARN: Code duplicated, block: B:45:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x05b9  */
    /* JADX WARN: Code duplicated, block: B:52:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x05de  */
    /* JADX WARN: Code duplicated, block: B:56:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:57:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:60:0x060f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0614  */
    /* JADX WARN: Code duplicated, block: B:64:0x0620  */
    /* JADX WARN: Code duplicated, block: B:65:0x0625  */
    /* JADX WARN: Code duplicated, block: B:68:0x0645  */
    /* JADX WARN: Code duplicated, block: B:69:0x064a  */
    /* JADX WARN: Code duplicated, block: B:72:0x0656  */
    /* JADX WARN: Code duplicated, block: B:73:0x065b  */
    /* JADX WARN: Code duplicated, block: B:76:0x067b  */
    /* JADX WARN: Code duplicated, block: B:77:0x0680  */
    /* JADX WARN: Code duplicated, block: B:80:0x068c  */
    /* JADX WARN: Code duplicated, block: B:81:0x0691  */
    /* JADX WARN: Code duplicated, block: B:84:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x06b6  */
    /* JADX WARN: Code duplicated, block: B:88:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:89:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:92:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:93:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:96:0x06f8  */
    /* JADX WARN: Code duplicated, block: B:97:0x06fd  */
    public final void setUiPercentageOfNestedElements(float height, float width) {
        int i;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        float f;
        float f2;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Map mapF;
        Float f3;
        float fFloatValue;
        Float f4;
        float fFloatValue2;
        Float f5;
        float fFloatValue3;
        Float f6;
        float fFloatValue4;
        Float f7;
        float fFloatValue5;
        Float f8;
        float fFloatValue6;
        Float f9;
        float fFloatValue7;
        Float f10;
        float fFloatValue8;
        Float f11;
        float fFloatValue9;
        Float f12;
        float fFloatValue10;
        Float f13;
        float fFloatValue11;
        Float f14;
        float fFloatValue12;
        Float f15;
        float fFloatValue13;
        Float f16;
        float fFloatValue14;
        Float f17;
        float fFloatValue15;
        Float f18;
        float fFloatValue16;
        Float f19;
        float fFloatValue17;
        Float f20;
        float fFloatValue18;
        Float f21;
        float fFloatValue19;
        Float f22;
        float fFloatValue20;
        Float f23;
        float fFloatValue21;
        Float f24;
        float fFloatValue22;
        Float f25;
        float fFloatValue23;
        Float f26;
        float fFloatValue24;
        Float f27;
        float fFloatValue25;
        Float f28;
        float fFloatValue26;
        Float f29;
        float fFloatValue27;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Map<String, Integer> mapF2;
        float f30 = height / width;
        Float fValueOf = Float.valueOf(0.074f);
        Pair pair = new Pair("bet_card_space_vertical", fValueOf);
        Float fValueOf2 = Float.valueOf(0.022f);
        Pair pair2 = new Pair("bet_card_space_horizontal", fValueOf2);
        Float fValueOf3 = Float.valueOf(0.09f);
        Pair pair3 = new Pair("bet_card_spacer_1", fValueOf3);
        Float fValueOf4 = Float.valueOf(0.056f);
        Pair pair4 = new Pair("bet_card_spacer_3", fValueOf4);
        Float fValueOf5 = Float.valueOf(0.13f);
        Pair pair5 = new Pair("bet_card_toggle_height", fValueOf5);
        Float fValueOf6 = Float.valueOf(0.204f);
        Pair pair6 = new Pair("bet_card_toggle_width", fValueOf6);
        Float fValueOf7 = Float.valueOf(0.28f);
        Pair pair7 = new Pair("bet_card_amount_box_height", fValueOf7);
        Float fValueOf8 = Float.valueOf(0.465f);
        Pair pair8 = new Pair("bet_card_amount_box_width", fValueOf8);
        Float fValueOf9 = Float.valueOf(0.142f);
        Pair pair9 = new Pair("bet_card_hint_amt_width", fValueOf9);
        Float fValueOf10 = Float.valueOf(0.186f);
        Pair pair10 = new Pair("bet_card_hint_amt_height", fValueOf10);
        Pair pair11 = new Pair("bet_card_bet_btn_layout_width", fValueOf8);
        Float fValueOf11 = Float.valueOf(0.543f);
        Pair pair12 = new Pair("bet_card_place_bet_area", fValueOf11);
        Float fValueOf12 = Float.valueOf(0.35f);
        Pair pair13 = new Pair("bet_card_cross_height", fValueOf12);
        Float fValueOf13 = Float.valueOf(0.59f);
        Pair pair14 = new Pair("bet_card_minus_height", fValueOf13);
        Float fValueOf14 = Float.valueOf(0.106f);
        Pair pair15 = new Pair("bet_card_minus_width", fValueOf14);
        Float fValueOf15 = Float.valueOf(0.00625f);
        Pair pair16 = new Pair("vertical_spacer", fValueOf15);
        Float fValueOf16 = Float.valueOf(1.15f);
        Pair pair17 = new Pair("bet_button_text", fValueOf16);
        Float fValueOf17 = Float.valueOf(0.95f);
        Map mapF3 = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, new Pair("bet_currency_text", fValueOf17), new Pair("bet_amount_text", fValueOf16));
        int i2 = (f30 > 2.1f ? 1 : (f30 == 2.1f ? 0 : -1));
        if (i2 < 0) {
            i = i2;
            obj = "bet_card_amount_box_height";
            obj2 = "bet_card_amount_box_width";
            obj3 = "bet_card_spacer_1";
            obj4 = "bet_card_spacer_3";
            f = 1.5f;
            f2 = 2.0f;
            if (f30 >= 2.0f) {
                mapF = kpu.f(new Pair("bet_card_space_vertical", Float.valueOf(0.08f)), new Pair("bet_card_space_horizontal", Float.valueOf(0.024f)), new Pair(obj3, Float.valueOf(0.096f)), new Pair(obj4, fValueOf4), new Pair("bet_card_toggle_height", fValueOf5), new Pair("bet_card_toggle_width", fValueOf6), new Pair(obj, Float.valueOf(0.2766f)), new Pair(obj2, fValueOf8), new Pair("bet_card_hint_amt_width", Float.valueOf(0.143f)), new Pair("bet_card_hint_amt_height", Float.valueOf(0.177f)), new Pair("bet_card_bet_btn_layout_width", Float.valueOf(0.46f)), new Pair("bet_card_place_bet_area", fValueOf11), new Pair("bet_card_cross_height", fValueOf12), new Pair("bet_card_minus_height", fValueOf13), new Pair("bet_card_minus_width", fValueOf14), new Pair("vertical_spacer", Float.valueOf(0.0048f)), new Pair("bet_button_text", fValueOf16), new Pair("bet_currency_text", fValueOf17), new Pair("bet_amount_text", fValueOf16));
                obj5 = "bet_card_hint_amt_width";
                obj6 = "bet_card_bet_btn_layout_width";
                obj7 = "bet_card_hint_amt_height";
                obj8 = "bet_card_place_bet_area";
                obj9 = "bet_card_cross_height";
                obj10 = "bet_card_minus_height";
            } else if (f30 >= 1.5f) {
                obj5 = "bet_card_hint_amt_width";
                obj7 = "bet_card_hint_amt_height";
                obj6 = "bet_card_bet_btn_layout_width";
                obj8 = "bet_card_place_bet_area";
                obj9 = "bet_card_cross_height";
                obj10 = "bet_card_minus_height";
                mapF = kpu.f(new Pair("bet_card_space_vertical", fValueOf), new Pair("bet_card_space_horizontal", fValueOf2), new Pair(obj3, fValueOf3), new Pair(obj4, fValueOf4), new Pair("bet_card_toggle_height", fValueOf5), new Pair("bet_card_toggle_width", fValueOf6), new Pair(obj, fValueOf7), new Pair(obj2, fValueOf8), new Pair(obj5, fValueOf9), new Pair(obj7, fValueOf10), new Pair(obj6, fValueOf8), new Pair(obj8, fValueOf11), new Pair(obj9, fValueOf12), new Pair(obj10, fValueOf13), new Pair("bet_card_minus_width", fValueOf14), new Pair("vertical_spacer", fValueOf15), new Pair("bet_button_text", fValueOf16), new Pair("bet_currency_text", fValueOf17), new Pair("bet_amount_text", fValueOf16));
            } else {
                obj5 = "bet_card_hint_amt_width";
                obj6 = "bet_card_bet_btn_layout_width";
                obj7 = "bet_card_hint_amt_height";
                obj8 = "bet_card_place_bet_area";
                obj9 = "bet_card_cross_height";
                obj10 = "bet_card_minus_height";
                mapF = mapF3;
            }
            ViewGroup.LayoutParams layoutParams = this.binding.r0.getLayoutParams();
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            f3 = (Float) mapF.get("bet_card_space_vertical");
            if (f3 != null) {
                fFloatValue = f3.floatValue();
            } else {
                fFloatValue = 0.074f;
            }
            layoutParams2.S = fFloatValue;
            this.binding.r0.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = this.binding.m0.getLayoutParams();
            layoutParams3.getClass();
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            f4 = (Float) mapF.get("bet_card_space_horizontal");
            if (f4 != null) {
                fFloatValue2 = f4.floatValue();
            } else {
                fFloatValue2 = 0.022f;
            }
            layoutParams4.R = fFloatValue2;
            this.binding.m0.setLayoutParams(layoutParams4);
            ViewGroup.LayoutParams layoutParams5 = this.binding.E.getLayoutParams();
            layoutParams5.getClass();
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            f5 = (Float) mapF.get("bet_card_space_vertical");
            if (f5 != null) {
                fFloatValue3 = f5.floatValue();
            } else {
                fFloatValue3 = 0.074f;
            }
            layoutParams6.S = fFloatValue3;
            this.binding.E.setLayoutParams(layoutParams6);
            ViewGroup.LayoutParams layoutParams7 = this.binding.a0.getLayoutParams();
            layoutParams7.getClass();
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            Float f31 = (Float) mapF.get("bet_card_space_horizontal");
            layoutParams8.R = f31 != null ? f31.floatValue() : 0.022f;
            this.binding.a0.setLayoutParams(layoutParams8);
            ViewGroup.LayoutParams layoutParams9 = this.binding.n0.getLayoutParams();
            layoutParams9.getClass();
            ConstraintLayout.LayoutParams layoutParams10 = (ConstraintLayout.LayoutParams) layoutParams9;
            Float f32 = (Float) mapF.get(obj3);
            layoutParams10.S = f32 != null ? f32.floatValue() : 0.09f;
            this.binding.n0.setLayoutParams(layoutParams10);
            ViewGroup.LayoutParams layoutParams11 = this.binding.p0.getLayoutParams();
            layoutParams11.getClass();
            ConstraintLayout.LayoutParams layoutParams12 = (ConstraintLayout.LayoutParams) layoutParams11;
            f6 = (Float) mapF.get(obj4);
            if (f6 != null) {
                fFloatValue4 = f6.floatValue();
            } else {
                fFloatValue4 = 0.056f;
            }
            layoutParams12.S = fFloatValue4;
            this.binding.p0.setLayoutParams(layoutParams12);
            ViewGroup.LayoutParams layoutParams13 = this.binding.i.getLayoutParams();
            layoutParams13.getClass();
            ConstraintLayout.LayoutParams layoutParams14 = (ConstraintLayout.LayoutParams) layoutParams13;
            Float f33 = (Float) mapF.get(obj);
            layoutParams14.S = f33 != null ? f33.floatValue() : 0.28f;
            f7 = (Float) mapF.get(obj2);
            if (f7 != null) {
                fFloatValue5 = f7.floatValue();
            } else {
                fFloatValue5 = 0.465f;
            }
            layoutParams14.R = fFloatValue5;
            this.binding.i.setLayoutParams(layoutParams14);
            ViewGroup.LayoutParams layoutParams15 = this.binding.R.getLayoutParams();
            layoutParams15.getClass();
            ConstraintLayout.LayoutParams layoutParams16 = (ConstraintLayout.LayoutParams) layoutParams15;
            f8 = (Float) mapF.get(obj7);
            if (f8 != null) {
                fFloatValue6 = f8.floatValue();
            } else {
                fFloatValue6 = 0.142f;
            }
            layoutParams16.S = fFloatValue6;
            f9 = (Float) mapF.get(obj5);
            if (f9 != null) {
                fFloatValue7 = f9.floatValue();
            } else {
                fFloatValue7 = 0.186f;
            }
            layoutParams16.R = fFloatValue7;
            this.binding.R.setLayoutParams(layoutParams16);
            ViewGroup.LayoutParams layoutParams17 = this.binding.O.getLayoutParams();
            layoutParams17.getClass();
            ConstraintLayout.LayoutParams layoutParams18 = (ConstraintLayout.LayoutParams) layoutParams17;
            f10 = (Float) mapF.get(obj7);
            if (f10 != null) {
                fFloatValue8 = f10.floatValue();
            } else {
                fFloatValue8 = 0.142f;
            }
            layoutParams18.S = fFloatValue8;
            f11 = (Float) mapF.get(obj5);
            if (f11 != null) {
                fFloatValue9 = f11.floatValue();
            } else {
                fFloatValue9 = 0.186f;
            }
            layoutParams18.R = fFloatValue9;
            this.binding.O.setLayoutParams(layoutParams18);
            ViewGroup.LayoutParams layoutParams19 = this.binding.Z.getLayoutParams();
            layoutParams19.getClass();
            ConstraintLayout.LayoutParams layoutParams20 = (ConstraintLayout.LayoutParams) layoutParams19;
            f12 = (Float) mapF.get(obj7);
            if (f12 != null) {
                fFloatValue10 = f12.floatValue();
            } else {
                fFloatValue10 = 0.142f;
            }
            layoutParams20.S = fFloatValue10;
            f13 = (Float) mapF.get(obj5);
            if (f13 != null) {
                fFloatValue11 = f13.floatValue();
            } else {
                fFloatValue11 = 0.186f;
            }
            layoutParams20.R = fFloatValue11;
            this.binding.Z.setLayoutParams(layoutParams20);
            ViewGroup.LayoutParams layoutParams21 = this.binding.S.getLayoutParams();
            layoutParams21.getClass();
            ConstraintLayout.LayoutParams layoutParams22 = (ConstraintLayout.LayoutParams) layoutParams21;
            f14 = (Float) mapF.get(obj7);
            if (f14 != null) {
                fFloatValue12 = f14.floatValue();
            } else {
                fFloatValue12 = 0.142f;
            }
            layoutParams22.S = fFloatValue12;
            f15 = (Float) mapF.get(obj5);
            if (f15 != null) {
                fFloatValue13 = f15.floatValue();
            } else {
                fFloatValue13 = 0.186f;
            }
            layoutParams22.R = fFloatValue13;
            this.binding.S.setLayoutParams(layoutParams20);
            ViewGroup.LayoutParams layoutParams23 = this.binding.T.getLayoutParams();
            layoutParams23.getClass();
            ConstraintLayout.LayoutParams layoutParams24 = (ConstraintLayout.LayoutParams) layoutParams23;
            f16 = (Float) mapF.get(obj7);
            if (f16 != null) {
                fFloatValue14 = f16.floatValue();
            } else {
                fFloatValue14 = 0.142f;
            }
            layoutParams24.S = fFloatValue14;
            f17 = (Float) mapF.get(obj5);
            if (f17 != null) {
                fFloatValue15 = f17.floatValue();
            } else {
                fFloatValue15 = 0.186f;
            }
            layoutParams24.R = fFloatValue15;
            this.binding.T.setLayoutParams(layoutParams24);
            ViewGroup.LayoutParams layoutParams25 = this.binding.C.getLayoutParams();
            layoutParams25.getClass();
            ConstraintLayout.LayoutParams layoutParams26 = (ConstraintLayout.LayoutParams) layoutParams25;
            f18 = (Float) mapF.get(obj7);
            if (f18 != null) {
                fFloatValue16 = f18.floatValue();
            } else {
                fFloatValue16 = 0.142f;
            }
            layoutParams26.S = fFloatValue16;
            f19 = (Float) mapF.get(obj5);
            if (f19 != null) {
                fFloatValue17 = f19.floatValue();
            } else {
                fFloatValue17 = 0.186f;
            }
            layoutParams26.R = fFloatValue17;
            this.binding.C.setLayoutParams(layoutParams26);
            ViewGroup.LayoutParams layoutParams27 = this.binding.U.getLayoutParams();
            layoutParams27.getClass();
            ConstraintLayout.LayoutParams layoutParams28 = (ConstraintLayout.LayoutParams) layoutParams27;
            f20 = (Float) mapF.get(obj7);
            if (f20 != null) {
                fFloatValue18 = f20.floatValue();
            } else {
                fFloatValue18 = 0.142f;
            }
            layoutParams28.S = fFloatValue18;
            f21 = (Float) mapF.get(obj5);
            if (f21 != null) {
                fFloatValue19 = f21.floatValue();
            } else {
                fFloatValue19 = 0.186f;
            }
            layoutParams28.R = fFloatValue19;
            this.binding.U.setLayoutParams(layoutParams28);
            ViewGroup.LayoutParams layoutParams29 = this.binding.V.getLayoutParams();
            layoutParams29.getClass();
            ConstraintLayout.LayoutParams layoutParams30 = (ConstraintLayout.LayoutParams) layoutParams29;
            f22 = (Float) mapF.get(obj7);
            if (f22 != null) {
                fFloatValue20 = f22.floatValue();
            } else {
                fFloatValue20 = 0.142f;
            }
            layoutParams30.S = fFloatValue20;
            f23 = (Float) mapF.get(obj5);
            if (f23 != null) {
                fFloatValue21 = f23.floatValue();
            } else {
                fFloatValue21 = 0.186f;
            }
            layoutParams30.R = fFloatValue21;
            this.binding.V.setLayoutParams(layoutParams30);
            ViewGroup.LayoutParams layoutParams31 = this.binding.D.getLayoutParams();
            layoutParams31.getClass();
            ConstraintLayout.LayoutParams layoutParams32 = (ConstraintLayout.LayoutParams) layoutParams31;
            f24 = (Float) mapF.get(obj7);
            if (f24 != null) {
                fFloatValue22 = f24.floatValue();
            } else {
                fFloatValue22 = 0.142f;
            }
            layoutParams32.S = fFloatValue22;
            f25 = (Float) mapF.get(obj5);
            if (f25 != null) {
                fFloatValue23 = f25.floatValue();
            } else {
                fFloatValue23 = 0.186f;
            }
            layoutParams32.R = fFloatValue23;
            this.binding.D.setLayoutParams(layoutParams32);
            ViewGroup.LayoutParams layoutParams33 = this.binding.W.getLayoutParams();
            layoutParams33.getClass();
            ConstraintLayout.LayoutParams layoutParams34 = (ConstraintLayout.LayoutParams) layoutParams33;
            Float f34 = (Float) mapF.get(obj7);
            layoutParams34.S = f34 != null ? f34.floatValue() : 0.142f;
            Float f35 = (Float) mapF.get(obj5);
            layoutParams34.R = f35 != null ? f35.floatValue() : 0.186f;
            this.binding.W.setLayoutParams(layoutParams34);
            ViewGroup.LayoutParams layoutParams35 = this.binding.y.getLayoutParams();
            layoutParams35.getClass();
            ConstraintLayout.LayoutParams layoutParams36 = (ConstraintLayout.LayoutParams) layoutParams35;
            Float f36 = (Float) mapF.get(obj6);
            layoutParams36.R = f36 != null ? f36.floatValue() : 0.465f;
            this.binding.y.setLayoutParams(layoutParams36);
            ViewGroup.LayoutParams layoutParams37 = this.binding.j0.getLayoutParams();
            layoutParams37.getClass();
            ConstraintLayout.LayoutParams layoutParams38 = (ConstraintLayout.LayoutParams) layoutParams37;
            f26 = (Float) mapF.get(obj8);
            if (f26 != null) {
                fFloatValue24 = f26.floatValue();
            } else {
                fFloatValue24 = 0.415f;
            }
            layoutParams38.S = fFloatValue24;
            this.binding.j0.setLayoutParams(layoutParams38);
            ViewGroup.LayoutParams layoutParams39 = this.binding.L.getLayoutParams();
            layoutParams39.getClass();
            ConstraintLayout.LayoutParams layoutParams40 = (ConstraintLayout.LayoutParams) layoutParams39;
            f27 = (Float) mapF.get(obj9);
            if (f27 != null) {
                fFloatValue25 = f27.floatValue();
            } else {
                fFloatValue25 = 0.35f;
            }
            layoutParams40.S = fFloatValue25;
            this.binding.L.setLayoutParams(layoutParams40);
            ViewGroup.LayoutParams layoutParams41 = this.binding.h0.getLayoutParams();
            layoutParams41.getClass();
            ConstraintLayout.LayoutParams layoutParams42 = (ConstraintLayout.LayoutParams) layoutParams41;
            Float f37 = (Float) mapF.get(obj9);
            layoutParams42.S = f37 != null ? f37.floatValue() : 0.35f;
            this.binding.h0.setLayoutParams(layoutParams42);
            ViewGroup.LayoutParams layoutParams43 = this.binding.q0.getLayoutParams();
            layoutParams43.getClass();
            ConstraintLayout.LayoutParams layoutParams44 = (ConstraintLayout.LayoutParams) layoutParams43;
            Float f38 = (Float) mapF.get(obj4);
            layoutParams44.S = f38 != null ? f38.floatValue() : 0.056f;
            this.binding.q0.setLayoutParams(layoutParams44);
            ViewGroup.LayoutParams layoutParams45 = this.binding.g0.getLayoutParams();
            layoutParams45.getClass();
            ConstraintLayout.LayoutParams layoutParams46 = (ConstraintLayout.LayoutParams) layoutParams45;
            f28 = (Float) mapF.get(obj10);
            if (f28 != null) {
                fFloatValue26 = f28.floatValue();
            } else {
                fFloatValue26 = 0.6f;
            }
            layoutParams46.S = fFloatValue26;
            f29 = (Float) mapF.get("bet_card_minus_width");
            if (f29 != null) {
                fFloatValue27 = f29.floatValue();
            } else {
                fFloatValue27 = 0.109f;
            }
            layoutParams46.R = fFloatValue27;
            this.binding.g0.setLayoutParams(layoutParams46);
            ViewGroup.LayoutParams layoutParams47 = this.binding.l0.getLayoutParams();
            layoutParams47.getClass();
            ConstraintLayout.LayoutParams layoutParams48 = (ConstraintLayout.LayoutParams) layoutParams47;
            Float f39 = (Float) mapF.get(obj10);
            layoutParams48.S = f39 != null ? f39.floatValue() : 0.6f;
            Float f40 = (Float) mapF.get("bet_card_minus_width");
            layoutParams48.R = f40 != null ? f40.floatValue() : 0.109f;
            this.binding.l0.setLayoutParams(layoutParams48);
            numValueOf = Integer.valueOf(R.dimen._33sdp);
            numValueOf2 = Integer.valueOf(R.dimen._12sdp);
            numValueOf3 = Integer.valueOf(R.dimen._11sdp);
            Pair pair18 = new Pair("bet_card_auto_cashout_height", numValueOf3);
            numValueOf4 = Integer.valueOf(R.dimen._28sdp);
            mapF2 = kpu.f(pair18, new Pair("bet_card_auto_cashout_width", numValueOf4));
            if (i >= 0) {
                mapF2 = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf2), new Pair("bet_card_auto_cashout_width", numValueOf));
            } else if (f30 >= f2) {
                mapF2 = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf2), new Pair("bet_card_auto_cashout_width", numValueOf));
            } else if (f30 >= f) {
                mapF2 = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf3), new Pair("bet_card_auto_cashout_width", numValueOf4));
            }
            this.binding.d.setToggleDimensions(mapF2);
            this.binding.f.setToggleDimensions(mapF2);
        }
        obj3 = "bet_card_spacer_1";
        obj4 = "bet_card_spacer_3";
        obj2 = "bet_card_amount_box_width";
        f = 1.5f;
        f2 = 2.0f;
        i = i2;
        mapF = kpu.f(new Pair("bet_card_space_vertical", fValueOf), new Pair("bet_card_space_horizontal", fValueOf2), new Pair(obj3, fValueOf3), new Pair(obj4, fValueOf4), new Pair("bet_card_toggle_height", fValueOf5), new Pair("bet_card_toggle_width", fValueOf6), new Pair("bet_card_amount_box_height", fValueOf7), new Pair(obj2, fValueOf8), new Pair("bet_card_hint_amt_width", fValueOf9), new Pair("bet_card_hint_amt_height", fValueOf10), new Pair("bet_card_bet_btn_layout_width", fValueOf8), new Pair("bet_card_place_bet_area", fValueOf11), new Pair("bet_card_cross_height", fValueOf12), new Pair("bet_card_minus_height", fValueOf13), new Pair("bet_card_minus_width", fValueOf14), new Pair("vertical_spacer", fValueOf15), new Pair("bet_button_text", fValueOf16), new Pair("bet_currency_text", fValueOf17), new Pair("bet_amount_text", fValueOf16));
        obj5 = "bet_card_hint_amt_width";
        obj = "bet_card_amount_box_height";
        obj6 = "bet_card_bet_btn_layout_width";
        obj7 = "bet_card_hint_amt_height";
        obj8 = "bet_card_place_bet_area";
        obj9 = "bet_card_cross_height";
        obj10 = "bet_card_minus_height";
        ViewGroup.LayoutParams layoutParams49 = this.binding.r0.getLayoutParams();
        layoutParams49.getClass();
        ConstraintLayout.LayoutParams layoutParams50 = (ConstraintLayout.LayoutParams) layoutParams49;
        f3 = (Float) mapF.get("bet_card_space_vertical");
        if (f3 != null) {
            fFloatValue = f3.floatValue();
        } else {
            fFloatValue = 0.074f;
        }
        layoutParams50.S = fFloatValue;
        this.binding.r0.setLayoutParams(layoutParams50);
        ViewGroup.LayoutParams layoutParams51 = this.binding.m0.getLayoutParams();
        layoutParams51.getClass();
        ConstraintLayout.LayoutParams layoutParams52 = (ConstraintLayout.LayoutParams) layoutParams51;
        f4 = (Float) mapF.get("bet_card_space_horizontal");
        if (f4 != null) {
            fFloatValue2 = f4.floatValue();
        } else {
            fFloatValue2 = 0.022f;
        }
        layoutParams52.R = fFloatValue2;
        this.binding.m0.setLayoutParams(layoutParams52);
        ViewGroup.LayoutParams layoutParams53 = this.binding.E.getLayoutParams();
        layoutParams53.getClass();
        ConstraintLayout.LayoutParams layoutParams54 = (ConstraintLayout.LayoutParams) layoutParams53;
        f5 = (Float) mapF.get("bet_card_space_vertical");
        if (f5 != null) {
            fFloatValue3 = f5.floatValue();
        } else {
            fFloatValue3 = 0.074f;
        }
        layoutParams54.S = fFloatValue3;
        this.binding.E.setLayoutParams(layoutParams54);
        ViewGroup.LayoutParams layoutParams55 = this.binding.a0.getLayoutParams();
        layoutParams55.getClass();
        ConstraintLayout.LayoutParams layoutParams56 = (ConstraintLayout.LayoutParams) layoutParams55;
        Float f310 = (Float) mapF.get("bet_card_space_horizontal");
        layoutParams56.R = f310 != null ? f310.floatValue() : 0.022f;
        this.binding.a0.setLayoutParams(layoutParams56);
        ViewGroup.LayoutParams layoutParams57 = this.binding.n0.getLayoutParams();
        layoutParams57.getClass();
        ConstraintLayout.LayoutParams layoutParams110 = (ConstraintLayout.LayoutParams) layoutParams57;
        Float f311 = (Float) mapF.get(obj3);
        layoutParams110.S = f311 != null ? f311.floatValue() : 0.09f;
        this.binding.n0.setLayoutParams(layoutParams110);
        ViewGroup.LayoutParams layoutParams111 = this.binding.p0.getLayoutParams();
        layoutParams111.getClass();
        ConstraintLayout.LayoutParams layoutParams112 = (ConstraintLayout.LayoutParams) layoutParams111;
        f6 = (Float) mapF.get(obj4);
        if (f6 != null) {
            fFloatValue4 = f6.floatValue();
        } else {
            fFloatValue4 = 0.056f;
        }
        layoutParams112.S = fFloatValue4;
        this.binding.p0.setLayoutParams(layoutParams112);
        ViewGroup.LayoutParams layoutParams113 = this.binding.i.getLayoutParams();
        layoutParams113.getClass();
        ConstraintLayout.LayoutParams layoutParams114 = (ConstraintLayout.LayoutParams) layoutParams113;
        Float f312 = (Float) mapF.get(obj);
        layoutParams114.S = f312 != null ? f312.floatValue() : 0.28f;
        f7 = (Float) mapF.get(obj2);
        if (f7 != null) {
            fFloatValue5 = f7.floatValue();
        } else {
            fFloatValue5 = 0.465f;
        }
        layoutParams114.R = fFloatValue5;
        this.binding.i.setLayoutParams(layoutParams114);
        ViewGroup.LayoutParams layoutParams115 = this.binding.R.getLayoutParams();
        layoutParams115.getClass();
        ConstraintLayout.LayoutParams layoutParams116 = (ConstraintLayout.LayoutParams) layoutParams115;
        f8 = (Float) mapF.get(obj7);
        if (f8 != null) {
            fFloatValue6 = f8.floatValue();
        } else {
            fFloatValue6 = 0.142f;
        }
        layoutParams116.S = fFloatValue6;
        f9 = (Float) mapF.get(obj5);
        if (f9 != null) {
            fFloatValue7 = f9.floatValue();
        } else {
            fFloatValue7 = 0.186f;
        }
        layoutParams116.R = fFloatValue7;
        this.binding.R.setLayoutParams(layoutParams116);
        ViewGroup.LayoutParams layoutParams117 = this.binding.O.getLayoutParams();
        layoutParams117.getClass();
        ConstraintLayout.LayoutParams layoutParams118 = (ConstraintLayout.LayoutParams) layoutParams117;
        f10 = (Float) mapF.get(obj7);
        if (f10 != null) {
            fFloatValue8 = f10.floatValue();
        } else {
            fFloatValue8 = 0.142f;
        }
        layoutParams118.S = fFloatValue8;
        f11 = (Float) mapF.get(obj5);
        if (f11 != null) {
            fFloatValue9 = f11.floatValue();
        } else {
            fFloatValue9 = 0.186f;
        }
        layoutParams118.R = fFloatValue9;
        this.binding.O.setLayoutParams(layoutParams118);
        ViewGroup.LayoutParams layoutParams119 = this.binding.Z.getLayoutParams();
        layoutParams119.getClass();
        ConstraintLayout.LayoutParams layoutParams210 = (ConstraintLayout.LayoutParams) layoutParams119;
        f12 = (Float) mapF.get(obj7);
        if (f12 != null) {
            fFloatValue10 = f12.floatValue();
        } else {
            fFloatValue10 = 0.142f;
        }
        layoutParams210.S = fFloatValue10;
        f13 = (Float) mapF.get(obj5);
        if (f13 != null) {
            fFloatValue11 = f13.floatValue();
        } else {
            fFloatValue11 = 0.186f;
        }
        layoutParams210.R = fFloatValue11;
        this.binding.Z.setLayoutParams(layoutParams210);
        ViewGroup.LayoutParams layoutParams211 = this.binding.S.getLayoutParams();
        layoutParams211.getClass();
        ConstraintLayout.LayoutParams layoutParams212 = (ConstraintLayout.LayoutParams) layoutParams211;
        f14 = (Float) mapF.get(obj7);
        if (f14 != null) {
            fFloatValue12 = f14.floatValue();
        } else {
            fFloatValue12 = 0.142f;
        }
        layoutParams212.S = fFloatValue12;
        f15 = (Float) mapF.get(obj5);
        if (f15 != null) {
            fFloatValue13 = f15.floatValue();
        } else {
            fFloatValue13 = 0.186f;
        }
        layoutParams212.R = fFloatValue13;
        this.binding.S.setLayoutParams(layoutParams210);
        ViewGroup.LayoutParams layoutParams213 = this.binding.T.getLayoutParams();
        layoutParams213.getClass();
        ConstraintLayout.LayoutParams layoutParams214 = (ConstraintLayout.LayoutParams) layoutParams213;
        f16 = (Float) mapF.get(obj7);
        if (f16 != null) {
            fFloatValue14 = f16.floatValue();
        } else {
            fFloatValue14 = 0.142f;
        }
        layoutParams214.S = fFloatValue14;
        f17 = (Float) mapF.get(obj5);
        if (f17 != null) {
            fFloatValue15 = f17.floatValue();
        } else {
            fFloatValue15 = 0.186f;
        }
        layoutParams214.R = fFloatValue15;
        this.binding.T.setLayoutParams(layoutParams214);
        ViewGroup.LayoutParams layoutParams215 = this.binding.C.getLayoutParams();
        layoutParams215.getClass();
        ConstraintLayout.LayoutParams layoutParams216 = (ConstraintLayout.LayoutParams) layoutParams215;
        f18 = (Float) mapF.get(obj7);
        if (f18 != null) {
            fFloatValue16 = f18.floatValue();
        } else {
            fFloatValue16 = 0.142f;
        }
        layoutParams216.S = fFloatValue16;
        f19 = (Float) mapF.get(obj5);
        if (f19 != null) {
            fFloatValue17 = f19.floatValue();
        } else {
            fFloatValue17 = 0.186f;
        }
        layoutParams216.R = fFloatValue17;
        this.binding.C.setLayoutParams(layoutParams216);
        ViewGroup.LayoutParams layoutParams217 = this.binding.U.getLayoutParams();
        layoutParams217.getClass();
        ConstraintLayout.LayoutParams layoutParams218 = (ConstraintLayout.LayoutParams) layoutParams217;
        f20 = (Float) mapF.get(obj7);
        if (f20 != null) {
            fFloatValue18 = f20.floatValue();
        } else {
            fFloatValue18 = 0.142f;
        }
        layoutParams218.S = fFloatValue18;
        f21 = (Float) mapF.get(obj5);
        if (f21 != null) {
            fFloatValue19 = f21.floatValue();
        } else {
            fFloatValue19 = 0.186f;
        }
        layoutParams218.R = fFloatValue19;
        this.binding.U.setLayoutParams(layoutParams218);
        ViewGroup.LayoutParams layoutParams219 = this.binding.V.getLayoutParams();
        layoutParams219.getClass();
        ConstraintLayout.LayoutParams layoutParams310 = (ConstraintLayout.LayoutParams) layoutParams219;
        f22 = (Float) mapF.get(obj7);
        if (f22 != null) {
            fFloatValue20 = f22.floatValue();
        } else {
            fFloatValue20 = 0.142f;
        }
        layoutParams310.S = fFloatValue20;
        f23 = (Float) mapF.get(obj5);
        if (f23 != null) {
            fFloatValue21 = f23.floatValue();
        } else {
            fFloatValue21 = 0.186f;
        }
        layoutParams310.R = fFloatValue21;
        this.binding.V.setLayoutParams(layoutParams310);
        ViewGroup.LayoutParams layoutParams311 = this.binding.D.getLayoutParams();
        layoutParams311.getClass();
        ConstraintLayout.LayoutParams layoutParams312 = (ConstraintLayout.LayoutParams) layoutParams311;
        f24 = (Float) mapF.get(obj7);
        if (f24 != null) {
            fFloatValue22 = f24.floatValue();
        } else {
            fFloatValue22 = 0.142f;
        }
        layoutParams312.S = fFloatValue22;
        f25 = (Float) mapF.get(obj5);
        if (f25 != null) {
            fFloatValue23 = f25.floatValue();
        } else {
            fFloatValue23 = 0.186f;
        }
        layoutParams312.R = fFloatValue23;
        this.binding.D.setLayoutParams(layoutParams312);
        ViewGroup.LayoutParams layoutParams313 = this.binding.W.getLayoutParams();
        layoutParams313.getClass();
        ConstraintLayout.LayoutParams layoutParams314 = (ConstraintLayout.LayoutParams) layoutParams313;
        Float f313 = (Float) mapF.get(obj7);
        layoutParams314.S = f313 != null ? f313.floatValue() : 0.142f;
        Float f314 = (Float) mapF.get(obj5);
        layoutParams314.R = f314 != null ? f314.floatValue() : 0.186f;
        this.binding.W.setLayoutParams(layoutParams314);
        ViewGroup.LayoutParams layoutParams315 = this.binding.y.getLayoutParams();
        layoutParams315.getClass();
        ConstraintLayout.LayoutParams layoutParams316 = (ConstraintLayout.LayoutParams) layoutParams315;
        Float f315 = (Float) mapF.get(obj6);
        layoutParams316.R = f315 != null ? f315.floatValue() : 0.465f;
        this.binding.y.setLayoutParams(layoutParams316);
        ViewGroup.LayoutParams layoutParams317 = this.binding.j0.getLayoutParams();
        layoutParams317.getClass();
        ConstraintLayout.LayoutParams layoutParams318 = (ConstraintLayout.LayoutParams) layoutParams317;
        f26 = (Float) mapF.get(obj8);
        if (f26 != null) {
            fFloatValue24 = f26.floatValue();
        } else {
            fFloatValue24 = 0.415f;
        }
        layoutParams318.S = fFloatValue24;
        this.binding.j0.setLayoutParams(layoutParams318);
        ViewGroup.LayoutParams layoutParams319 = this.binding.L.getLayoutParams();
        layoutParams319.getClass();
        ConstraintLayout.LayoutParams layoutParams410 = (ConstraintLayout.LayoutParams) layoutParams319;
        f27 = (Float) mapF.get(obj9);
        if (f27 != null) {
            fFloatValue25 = f27.floatValue();
        } else {
            fFloatValue25 = 0.35f;
        }
        layoutParams410.S = fFloatValue25;
        this.binding.L.setLayoutParams(layoutParams410);
        ViewGroup.LayoutParams layoutParams411 = this.binding.h0.getLayoutParams();
        layoutParams411.getClass();
        ConstraintLayout.LayoutParams layoutParams412 = (ConstraintLayout.LayoutParams) layoutParams411;
        Float f316 = (Float) mapF.get(obj9);
        layoutParams412.S = f316 != null ? f316.floatValue() : 0.35f;
        this.binding.h0.setLayoutParams(layoutParams412);
        ViewGroup.LayoutParams layoutParams413 = this.binding.q0.getLayoutParams();
        layoutParams413.getClass();
        ConstraintLayout.LayoutParams layoutParams414 = (ConstraintLayout.LayoutParams) layoutParams413;
        Float f317 = (Float) mapF.get(obj4);
        layoutParams414.S = f317 != null ? f317.floatValue() : 0.056f;
        this.binding.q0.setLayoutParams(layoutParams414);
        ViewGroup.LayoutParams layoutParams415 = this.binding.g0.getLayoutParams();
        layoutParams415.getClass();
        ConstraintLayout.LayoutParams layoutParams416 = (ConstraintLayout.LayoutParams) layoutParams415;
        f28 = (Float) mapF.get(obj10);
        if (f28 != null) {
            fFloatValue26 = f28.floatValue();
        } else {
            fFloatValue26 = 0.6f;
        }
        layoutParams416.S = fFloatValue26;
        f29 = (Float) mapF.get("bet_card_minus_width");
        if (f29 != null) {
            fFloatValue27 = f29.floatValue();
        } else {
            fFloatValue27 = 0.109f;
        }
        layoutParams416.R = fFloatValue27;
        this.binding.g0.setLayoutParams(layoutParams416);
        ViewGroup.LayoutParams layoutParams417 = this.binding.l0.getLayoutParams();
        layoutParams417.getClass();
        ConstraintLayout.LayoutParams layoutParams418 = (ConstraintLayout.LayoutParams) layoutParams417;
        Float f318 = (Float) mapF.get(obj10);
        layoutParams418.S = f318 != null ? f318.floatValue() : 0.6f;
        Float f41 = (Float) mapF.get("bet_card_minus_width");
        layoutParams418.R = f41 != null ? f41.floatValue() : 0.109f;
        this.binding.l0.setLayoutParams(layoutParams418);
        numValueOf = Integer.valueOf(R.dimen._33sdp);
        numValueOf2 = Integer.valueOf(R.dimen._12sdp);
        numValueOf3 = Integer.valueOf(R.dimen._11sdp);
        Pair pair19 = new Pair("bet_card_auto_cashout_height", numValueOf3);
        numValueOf4 = Integer.valueOf(R.dimen._28sdp);
        mapF2 = kpu.f(pair19, new Pair("bet_card_auto_cashout_width", numValueOf4));
        if (i >= 0) {
            mapF2 = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf2), new Pair("bet_card_auto_cashout_width", numValueOf));
        } else if (f30 >= f2) {
            mapF2 = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf2), new Pair("bet_card_auto_cashout_width", numValueOf));
        } else if (f30 >= f) {
            mapF2 = kpu.f(new Pair("bet_card_auto_cashout_height", numValueOf3), new Pair("bet_card_auto_cashout_width", numValueOf4));
        }
        this.binding.d.setToggleDimensions(mapF2);
        this.binding.f.setToggleDimensions(mapF2);
    }

    public final void setUserInputAmount(double d) {
        this.userInputAmount = d;
    }

    public final void setValentineTheme() {
        String strC;
        this.binding.v.setBackground(getContext().getDrawable(R.drawable.bet_button_sh_valentine));
        this.binding.d.setValentine();
        this.binding.f.setValentine();
        this.binding.P.setVisibility(0);
        this.binding.H.setBackground(getContext().getDrawable(R.drawable.sh_cashout_background_valentine));
        if (this.rainIsActive) {
            op5 op5Var = op5.a;
            String string = getContext().getString(R.string.rain_drops_gif);
            string.getClass();
            strC = op5.c(op5Var, string, "https://s.sporty.net/cms/rain_drops_gif_52fa34d4f3.gif");
        } else {
            op5 op5Var2 = op5.a;
            String string2 = getContext().getString(R.string.valentine_gif_cms);
            string2.getClass();
            strC = op5.c(op5Var2, string2, "");
        }
        Context context = getContext();
        context.getClass();
        xa50 xa50VarC = com.bumptech.glide.a.b(context).c(context);
        xa50VarC.getClass();
        po80<thk> po80VarA = new mo80(xa50VarC).a(Uri.parse(strC));
        po80VarA.h();
        hre.a aVar = hre.a;
        aVar.getClass();
        po80VarA.c(aVar);
        ea50<T> ea50VarR = po80VarA.c.R();
        ea50VarR.getClass();
        po80VarA.c = ea50VarR;
        po80VarA.e(this.binding.P);
    }

    public final void setautoBetListener(final Function1<? super Boolean, Unit> autoBetListener, final Function1<? super Boolean, Unit> autoDialogShow, Function0<Boolean> isNotLoggedIn, Function0<Unit> openLoginDialog) {
        autoBetListener.getClass();
        autoDialogShow.getClass();
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        this.binding.d.setLoginListeners(isNotLoggedIn, openLoginDialog);
        this.binding.d.setOnStateChange(new Function1() { // from class: lr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer numValueOf = Integer.valueOf(R.color.warn_toast);
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ShBetContainer shBetContainer = this.a;
                boolean z = shBetContainer.d0;
                if ((z && (!z || tr80.a(shBetContainer.binding.G) < Double.parseDouble("1.01"))) || shBetContainer.giftItem != null) {
                    GiftItem giftItem = shBetContainer.giftItem;
                    boolean z2 = shBetContainer.d0;
                    if (giftItem != null) {
                        op5 op5Var = op5.a;
                        String string = shBetContainer.getContext().getString(R.string.fbg_auto_bet_warning_cms);
                        string.getClass();
                        String string2 = shBetContainer.getContext().getString(R.string.enable_auto_bet_fbg);
                        string2.getClass();
                        op5Var.getClass();
                        shBetContainer.getAutoCashoutListener().invoke(Boolean.valueOf(z2), op5.b(string, string2, null), numValueOf);
                        shBetContainer.binding.d.setStatus(false);
                    } else if (z2) {
                        op5 op5Var2 = op5.a;
                        String string3 = shBetContainer.getContext().getString(R.string.auto_cashout_greater_one_cms);
                        string3.getClass();
                        String string4 = shBetContainer.getContext().getString(R.string.auto_cashout_min_error);
                        string4.getClass();
                        op5Var2.getClass();
                        shBetContainer.getAutoCashoutListener().invoke(Boolean.TRUE, op5.b(string3, string4, null), numValueOf);
                        shBetContainer.binding.d.setStatus(false);
                    } else {
                        shBetContainer.binding.d.setStatus(false);
                    }
                } else {
                    if (yju.a("br") && zBooleanValue) {
                        autoDialogShow.invoke(bool);
                        return Unit.a;
                    }
                    shBetContainer.binding.d.setStatus(zBooleanValue);
                    shBetContainer.F();
                    shBetContainer.setCashOutAmount();
                    autoBetListener.invoke(bool);
                    shBetContainer.autoBetPlace = zBooleanValue;
                }
                return Unit.a;
            }
        });
    }

    public final void setautoCashoutListener(final gaj<? super Boolean, ? super String, ? super Integer, Unit> autoCashoutListener) {
        autoCashoutListener.getClass();
        setAutoCashoutListener(autoCashoutListener);
        this.binding.f.setOnStateChange(new Function1() { // from class: rq80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Integer numValueOf = Integer.valueOf(R.color.warn_toast);
                ShBetContainer shBetContainer = this.a;
                boolean z = shBetContainer.autoBetPlace;
                gaj gajVar = autoCashoutListener;
                if (z && shBetContainer.betPlaced) {
                    op5 op5Var = op5.a;
                    String string = shBetContainer.getContext().getString(R.string.modify_auto_cash_out_message_cms);
                    string.getClass();
                    String string2 = shBetContainer.getContext().getString(R.string.turn_off);
                    string2.getClass();
                    op5Var.getClass();
                    gajVar.invoke(bool, op5.b(string, string2, null), numValueOf);
                } else if (shBetContainer.betPlaced) {
                    op5 op5Var2 = op5.a;
                    String string3 = shBetContainer.getContext().getString(R.string.turn_on_off_auto_cashout_cms);
                    string3.getClass();
                    String string4 = shBetContainer.getContext().getString(R.string.auto_cashout_on_off);
                    string4.getClass();
                    gajVar.invoke(bool, op5.c(op5Var2, string3, string4), numValueOf);
                } else {
                    shBetContainer.binding.f.setStatus(zBooleanValue);
                    shBetContainer.d0 = zBooleanValue;
                    gajVar.invoke(bool, "", 0);
                    qq80 qq80Var = shBetContainer.binding;
                    if (zBooleanValue) {
                        qq80Var.J.setVisibility(0);
                    } else {
                        qq80Var.J.setVisibility(4);
                    }
                }
                return Unit.a;
            }
        });
    }

    public final void setbetAmount(final Function0<Unit> cashoutAmount) {
        cashoutAmount.getClass();
        gr60.a(this.binding.b, new Function1() { // from class: br80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = ShBetContainer.s0;
                ((View) obj).getClass();
                ShBetContainer shBetContainer = this.a;
                if (shBetContainer.betPlacedV2 || shBetContainer.autoBetPlace) {
                    return Unit.a;
                }
                shBetContainer.binding.i.setEnabled(true);
                cashoutAmount.invoke();
                return Unit.a;
            }
        });
    }

    public final void setCashoutDone(boolean z) {
        this.cashoutDone = z;
    }

    public final void setCashoutAmount(double amount) {
        try {
            DetailResponse detailResponse = this.h0;
            double maxPayoutAmount = (detailResponse != null ? detailResponse.getMaxPayoutAmount() : 0.0d) / Double.parseDouble(this.binding.b.getText().toString());
            if (amount > maxPayoutAmount) {
                amount = maxPayoutAmount;
            }
            DecimalFormat decimalFormat = new DecimalFormat("0.##", SportyGamesManager.decimalFormatSymbols);
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            this.binding.G.setText(decimalFormat.format(amount));
            String str = decimalFormat.format(amount);
            str.getClass();
            this.cashoutCoeff = Double.parseDouble(str);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShBetContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
