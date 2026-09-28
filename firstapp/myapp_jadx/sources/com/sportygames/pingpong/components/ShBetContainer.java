package com.sportygames.pingpong.components;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.pingpong.components.ShBetContainer;
import com.sportygames.pingpong.remote.models.DetailResponse;
import defpackage.aeh;
import defpackage.ajc;
import defpackage.bmy;
import defpackage.gaj;
import defpackage.gr60;
import defpackage.h5e;
import defpackage.hce0;
import defpackage.op5;
import defpackage.pw;
import defpackage.tr80;
import defpackage.un20;
import defpackage.v720;
import defpackage.yju;
import defpackage.zug;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.b;
import kotlin.text.c;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\t\n\u0002\b'\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0015J\r\u0010\u0017\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0015J\r\u0010\u0018\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0015J\r\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b\u0019\u0010\u0015J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u0015J=\u0010\"\u001a\u00020\n2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u00020\n2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\n2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b(\u0010)J%\u0010-\u001a\u00020\n2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J!\u00100\u001a\u00020\n2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b0\u0010&J!\u00102\u001a\u00020\n2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b2\u0010&J!\u00104\u001a\u00020\n2\u0012\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b4\u0010&J\u001b\u00106\u001a\u00020\n2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b6\u0010)J\u001b\u00107\u001a\u00020\n2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b7\u0010)JQ\u0010:\u001a\u00020\n2\u0012\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u001b2\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u001b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001e¢\u0006\u0004\b:\u0010;J!\u0010=\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b=\u0010&J!\u0010>\u001a\u00020\n2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u001b¢\u0006\u0004\b>\u0010&J/\u0010A\u001a\u00020\n2 \u0010@\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0?¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\n¢\u0006\u0004\bC\u0010\u0015J\r\u0010D\u001a\u00020\n¢\u0006\u0004\bD\u0010\u0015J\r\u0010E\u001a\u00020\n¢\u0006\u0004\bE\u0010\u0015J\r\u0010F\u001a\u00020\n¢\u0006\u0004\bF\u0010\u0015J\r\u0010G\u001a\u00020\n¢\u0006\u0004\bG\u0010\u0015J\r\u0010H\u001a\u00020\n¢\u0006\u0004\bH\u0010\u0015J\u0015\u0010I\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bI\u0010\u0010J\r\u0010J\u001a\u00020\n¢\u0006\u0004\bJ\u0010\u0015R\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR$\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010_\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010,\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\"\u0010i\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010a\u001a\u0004\bg\u0010c\"\u0004\bh\u0010eR\"\u0010o\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010\u0013R\"\u0010s\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bp\u0010a\u001a\u0004\bq\u0010c\"\u0004\br\u0010eR\"\u0010w\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bt\u0010a\u001a\u0004\bu\u0010c\"\u0004\bv\u0010eR\"\u0010z\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010a\u001a\u0004\by\u0010c\"\u0004\b\u001a\u0010eR\"\u0010}\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010a\u001a\u0004\b{\u0010c\"\u0004\b|\u0010eR(\u0010\u0085\u0001\u001a\u00020~8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R)\u0010\u0089\u0001\u001a\u00020~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0080\u0001\u001a\u0006\b\u0087\u0001\u0010\u0082\u0001\"\u0006\b\u0088\u0001\u0010\u0084\u0001R&\u0010\u008d\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010k\u001a\u0005\b\u008b\u0001\u0010m\"\u0005\b\u008c\u0001\u0010\u0013R)\u0010\u0091\u0001\u001a\u00020~8\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u008e\u0001\u0010\u0080\u0001\u001a\u0006\b\u008f\u0001\u0010\u0082\u0001\"\u0006\b\u0090\u0001\u0010\u0084\u0001R&\u0010\u0095\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0092\u0001\u0010k\u001a\u0005\b\u0093\u0001\u0010m\"\u0005\b\u0094\u0001\u0010\u0013RA\u0010@\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0?8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0005\b\u009a\u0001\u0010BR4\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u001b8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0005\b\u009f\u0001\u0010&R&\u0010¤\u0001\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¡\u0001\u0010a\u001a\u0005\b¢\u0001\u0010c\"\u0005\b£\u0001\u0010e¨\u0006¥\u0001"}, d2 = {"Lcom/sportygames/pingpong/components/ShBetContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/pingpong/remote/models/DetailResponse;", "gameDetailResponse", "", "setBetModel", "(Lcom/sportygames/pingpong/remote/models/DetailResponse;)V", "", "number", "setCashoutAmount", "(I)V", "", "amount", "(D)V", "setPoint", "()V", "setDoubleZero", "setClear", "setCross", "setDone", "setCashoutDone", "Lkotlin/Function1;", "", "betListener", "Lkotlin/Function0;", "", "isNotLoggedIn", "openLoginDialog", "setBetListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cashoutListener", "setCashoutListener", "(Lkotlin/jvm/functions/Function1;)V", "removeFBGListener", "setFBGRemoveListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/sportygames/commons/models/GiftItem;", "giftItem", "betPlaced", "setFBG", "(Lcom/sportygames/commons/models/GiftItem;ZD)V", "betStepListener", "setBetStepListener", "confirmBetListener", "setConfirmBetListener", "cancelBetListener", "setCancelBetListener", "cashoutAmount", "setAutoCashoutAmount", "setbetAmount", "autoBetListener", "autoDialogShow", "setautoBetListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "listener", "setFbgClickListener", "setOnBetChipSelectedListener", "Lkotlin/Function3;", "autoCashoutListener", "setautoCashoutListener", "(Lgaj;)V", "setDisableContainer", "setEnableContainer", "setBetDone", "setBetClear", "setBetCross", "setBetDoubleZero", "setBetNumberClick", "setBetPointClick", "Lv720;", "a", "Lv720;", "getBinding", "()Lv720;", "setBinding", "(Lv720;)V", "binding", "f", "Lcom/sportygames/commons/models/GiftItem;", "getGiftItem", "()Lcom/sportygames/commons/models/GiftItem;", "setGiftItem", "(Lcom/sportygames/commons/models/GiftItem;)V", "i", "Ljava/lang/Double;", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "giftAmount", "w", "Z", "getBetPlaced", "()Z", "setBetPlaced", "(Z)V", "y", "getAutoBetPlace", "setAutoBetPlace", "autoBetPlace", "z", "D", "getBetAmount", "()D", "setBetAmount", "betAmount", "A", "getBetInProgress", "setBetInProgress", "betInProgress", "B", "getBetPlacedV2", "setBetPlacedV2", "betPlacedV2", "C", "getCashoutDone", "cashoutDone", "getCashoutInProgress", "setCashoutInProgress", "cashoutInProgress", "", "E", "J", "getRoundId", "()J", "setRoundId", "(J)V", "roundId", "F", "getFbgRoundId", "setFbgRoundId", "fbgRoundId", "G", "getCashoutCoeff", "setCashoutCoeff", "cashoutCoeff", "H", "getBetId", "setBetId", "betId", "I", "getUserInputAmount", "setUserInputAmount", "userInputAmount", "M", "Lgaj;", "getAutoCashoutListener", "()Lgaj;", "setAutoCashoutListener", "N", "Lkotlin/jvm/functions/Function1;", "getOnBetChipSelected", "()Lkotlin/jvm/functions/Function1;", "setOnBetChipSelected", "onBetChipSelected", "Q", "getFbgAvailable", "setFbgAvailable", "fbgAvailable", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ShBetContainer extends LinearLayout {
    public static final /* synthetic */ int S = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean betInProgress;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean betPlacedV2;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean cashoutDone;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public boolean cashoutInProgress;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public long roundId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public long fbgRoundId;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public double cashoutCoeff;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public long betId;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public double userInputAmount;
    public boolean J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public gaj<? super Boolean, ? super String, ? super Integer, Unit> autoCashoutListener;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public Function1<? super Integer, Unit> onBetChipSelected;
    public Function1<? super Boolean, Unit> O;
    public DetailResponse P;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public boolean fbgAvailable;
    public final a R;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public v720 binding;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public GiftItem giftItem;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public Double giftAmount;
    public final SharedPreferences v;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public boolean betPlaced;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean autoBetPlace;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public double betAmount;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a implements TextWatcher {
        public final /* synthetic */ Context b;

        public a(Context context) {
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

        /* JADX WARN: Code duplicated, block: B:29:0x00be A[Catch: Exception -> 0x01c5, TryCatch #0 {Exception -> 0x01c5, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x0017, B:10:0x0020, B:12:0x003e, B:15:0x004d, B:17:0x0058, B:34:0x00ee, B:36:0x00f2, B:38:0x00fa, B:40:0x00fe, B:43:0x0107, B:47:0x0157, B:49:0x017e, B:51:0x01b1, B:52:0x01b4, B:44:0x012c, B:45:0x012f, B:46:0x0130, B:53:0x01b5, B:54:0x01b8, B:18:0x007d, B:20:0x0081, B:22:0x0089, B:24:0x008d, B:26:0x0095, B:27:0x00ba, B:28:0x00bd, B:29:0x00be, B:31:0x00c2, B:33:0x00ca, B:55:0x01b9, B:56:0x01bc, B:57:0x01bd, B:58:0x01c0, B:59:0x01c1, B:60:0x01c4), top: B:63:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00c2 A[Catch: Exception -> 0x01c5, TryCatch #0 {Exception -> 0x01c5, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x0017, B:10:0x0020, B:12:0x003e, B:15:0x004d, B:17:0x0058, B:34:0x00ee, B:36:0x00f2, B:38:0x00fa, B:40:0x00fe, B:43:0x0107, B:47:0x0157, B:49:0x017e, B:51:0x01b1, B:52:0x01b4, B:44:0x012c, B:45:0x012f, B:46:0x0130, B:53:0x01b5, B:54:0x01b8, B:18:0x007d, B:20:0x0081, B:22:0x0089, B:24:0x008d, B:26:0x0095, B:27:0x00ba, B:28:0x00bd, B:29:0x00be, B:31:0x00c2, B:33:0x00ca, B:55:0x01b9, B:56:0x01bc, B:57:0x01bd, B:58:0x01c0, B:59:0x01c1, B:60:0x01c4), top: B:63:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:33:0x00ca A[Catch: Exception -> 0x01c5, TryCatch #0 {Exception -> 0x01c5, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x0017, B:10:0x0020, B:12:0x003e, B:15:0x004d, B:17:0x0058, B:34:0x00ee, B:36:0x00f2, B:38:0x00fa, B:40:0x00fe, B:43:0x0107, B:47:0x0157, B:49:0x017e, B:51:0x01b1, B:52:0x01b4, B:44:0x012c, B:45:0x012f, B:46:0x0130, B:53:0x01b5, B:54:0x01b8, B:18:0x007d, B:20:0x0081, B:22:0x0089, B:24:0x008d, B:26:0x0095, B:27:0x00ba, B:28:0x00bd, B:29:0x00be, B:31:0x00c2, B:33:0x00ca, B:55:0x01b9, B:56:0x01bc, B:57:0x01bd, B:58:0x01c0, B:59:0x01c1, B:60:0x01c4), top: B:63:0x0009 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x01b9 A[Catch: Exception -> 0x01c5, TryCatch #0 {Exception -> 0x01c5, blocks: (B:3:0x0009, B:5:0x000f, B:8:0x0017, B:10:0x0020, B:12:0x003e, B:15:0x004d, B:17:0x0058, B:34:0x00ee, B:36:0x00f2, B:38:0x00fa, B:40:0x00fe, B:43:0x0107, B:47:0x0157, B:49:0x017e, B:51:0x01b1, B:52:0x01b4, B:44:0x012c, B:45:0x012f, B:46:0x0130, B:53:0x01b5, B:54:0x01b8, B:18:0x007d, B:20:0x0081, B:22:0x0089, B:24:0x008d, B:26:0x0095, B:27:0x00ba, B:28:0x00bd, B:29:0x00be, B:31:0x00c2, B:33:0x00ca, B:55:0x01b9, B:56:0x01bc, B:57:0x01bd, B:58:0x01c0, B:59:0x01c1, B:60:0x01c4), top: B:63:0x0009 }] */
        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            DetailResponse detailResponse;
            Context context = this.b;
            ShBetContainer shBetContainer = ShBetContainer.this;
            charSequence.getClass();
            try {
                if (!shBetContainer.getBetInProgress() && !shBetContainer.getBetPlaced()) {
                    if (charSequence.length() == 0) {
                        shBetContainer.getBinding().b.setText("0");
                        shBetContainer.getBinding().X.setClickable(false);
                        shBetContainer.getBinding().X.setAlpha(0.5f);
                        return;
                    }
                    double d = Double.parseDouble(charSequence.toString());
                    DetailResponse detailResponse2 = shBetContainer.P;
                    if (detailResponse2 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (d <= detailResponse2.getMinAmount()) {
                        shBetContainer.getBinding().X.setClickable(false);
                        shBetContainer.getBinding().X.setAlpha(0.5f);
                        shBetContainer.getBinding().b0.setClickable(true);
                        shBetContainer.getBinding().b0.setAlpha(1.0f);
                    } else {
                        DetailResponse detailResponse3 = shBetContainer.P;
                        if (detailResponse3 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d <= detailResponse3.getMinAmount()) {
                            detailResponse = shBetContainer.P;
                            if (detailResponse != null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            if (d >= detailResponse.getMaxAmount()) {
                                shBetContainer.getBinding().X.setClickable(true);
                                shBetContainer.getBinding().X.setAlpha(1.0f);
                                shBetContainer.getBinding().b0.setClickable(false);
                                shBetContainer.getBinding().b0.setAlpha(0.5f);
                            }
                        } else {
                            DetailResponse detailResponse4 = shBetContainer.P;
                            if (detailResponse4 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            if (d < detailResponse4.getMaxAmount()) {
                                shBetContainer.getBinding().X.setClickable(true);
                                shBetContainer.getBinding().X.setAlpha(1.0f);
                                shBetContainer.getBinding().b0.setClickable(true);
                                shBetContainer.getBinding().b0.setAlpha(1.0f);
                            } else {
                                detailResponse = shBetContainer.P;
                                if (detailResponse != null) {
                                    Intrinsics.n("gameDetailResponse");
                                    throw null;
                                }
                                if (d >= detailResponse.getMaxAmount()) {
                                    shBetContainer.getBinding().X.setClickable(true);
                                    shBetContainer.getBinding().X.setAlpha(1.0f);
                                    shBetContainer.getBinding().b0.setClickable(false);
                                    shBetContainer.getBinding().b0.setAlpha(0.5f);
                                }
                            }
                        }
                    }
                    DetailResponse detailResponse5 = shBetContainer.P;
                    if (detailResponse5 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    if (d < detailResponse5.getMinAmount()) {
                        shBetContainer.getBinding().v.setClickable(false);
                        shBetContainer.getBinding().v.setAlpha(0.65f);
                        shBetContainer.getBinding().Y.setClickable(false);
                        shBetContainer.getBinding().Y.setAlpha(0.65f);
                    } else {
                        DetailResponse detailResponse6 = shBetContainer.P;
                        if (detailResponse6 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d > detailResponse6.getMaxAmount()) {
                            shBetContainer.getBinding().v.setClickable(false);
                            shBetContainer.getBinding().v.setAlpha(0.65f);
                            shBetContainer.getBinding().Y.setClickable(false);
                            shBetContainer.getBinding().Y.setAlpha(0.65f);
                        } else {
                            shBetContainer.getBinding().v.setClickable(true);
                            shBetContainer.getBinding().v.setAlpha(1.0f);
                            shBetContainer.getBinding().Y.setClickable(true);
                            shBetContainer.getBinding().Y.setAlpha(1.0f);
                        }
                    }
                    TextView textView = shBetContainer.getBinding().Z;
                    String string = context.getString(R.string.place_bet_text_sh);
                    op5 op5Var = op5.a;
                    String string2 = context.getString(R.string.place_bet_cms);
                    string2.getClass();
                    string.getClass();
                    op5Var.getClass();
                    String strB = op5.b(string2, string, null);
                    DetailResponse detailResponse7 = shBetContainer.P;
                    if (detailResponse7 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    textView.setText(((Object) strB) + " " + op5.i(detailResponse7.getCurrency()) + " " + ((Object) shBetContainer.getBinding().b.getText()) + "?");
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShBetContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.pp_bet_component, (ViewGroup) this, false);
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
                                    i = R.id.bet_layout;
                                    if (((ConstraintLayout) h5e.a(R.id.bet_layout, viewInflate)) != null) {
                                        i = R.id.bet_text;
                                        TextView textView4 = (TextView) h5e.a(R.id.bet_text, viewInflate);
                                        if (textView4 != null) {
                                            i = R.id.card_layout;
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.card_layout, viewInflate);
                                            if (constraintLayout3 != null) {
                                                i = R.id.cashout_amount;
                                                TextView textView5 = (TextView) h5e.a(R.id.cashout_amount, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.cashout_amount_layout;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.cashout_amount_layout, viewInflate);
                                                    if (constraintLayout4 != null) {
                                                        i = R.id.cashout_button;
                                                        TextView textView6 = (TextView) h5e.a(R.id.cashout_button, viewInflate);
                                                        if (textView6 != null) {
                                                            i = R.id.cashout_layout;
                                                            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.cashout_layout, viewInflate);
                                                            if (relativeLayout != null) {
                                                                i = R.id.cross;
                                                                if (((TextView) h5e.a(R.id.cross, viewInflate)) != null) {
                                                                    i = R.id.cross_bet;
                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.cross_bet, viewInflate);
                                                                    if (constraintLayout5 != null) {
                                                                        i = R.id.cross_fbg;
                                                                        ImageView imageView = (ImageView) h5e.a(R.id.cross_fbg, viewInflate);
                                                                        if (imageView != null) {
                                                                            i = R.id.extra_space;
                                                                            View viewA = h5e.a(R.id.extra_space, viewInflate);
                                                                            if (viewA != null) {
                                                                                i = R.id.fbg_icon;
                                                                                ImageView imageView2 = (ImageView) h5e.a(R.id.fbg_icon, viewInflate);
                                                                                if (imageView2 != null) {
                                                                                    i = R.id.gift_box;
                                                                                    ImageView imageView3 = (ImageView) h5e.a(R.id.gift_box, viewInflate);
                                                                                    if (imageView3 != null) {
                                                                                        i = R.id.hint_amount1;
                                                                                        TextView textView7 = (TextView) h5e.a(R.id.hint_amount1, viewInflate);
                                                                                        if (textView7 != null) {
                                                                                            i = R.id.hint_amount1_selected;
                                                                                            TextView textView8 = (TextView) h5e.a(R.id.hint_amount1_selected, viewInflate);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.hint_amount2;
                                                                                                TextView textView9 = (TextView) h5e.a(R.id.hint_amount2, viewInflate);
                                                                                                if (textView9 != null) {
                                                                                                    i = R.id.hint_amount2_selected;
                                                                                                    TextView textView10 = (TextView) h5e.a(R.id.hint_amount2_selected, viewInflate);
                                                                                                    if (textView10 != null) {
                                                                                                        i = R.id.hint_amount3;
                                                                                                        TextView textView11 = (TextView) h5e.a(R.id.hint_amount3, viewInflate);
                                                                                                        if (textView11 != null) {
                                                                                                            i = R.id.hint_amount3_selected;
                                                                                                            TextView textView12 = (TextView) h5e.a(R.id.hint_amount3_selected, viewInflate);
                                                                                                            if (textView12 != null) {
                                                                                                                i = R.id.hint_amount4;
                                                                                                                TextView textView13 = (TextView) h5e.a(R.id.hint_amount4, viewInflate);
                                                                                                                if (textView13 != null) {
                                                                                                                    i = R.id.hint_amount4_selected;
                                                                                                                    TextView textView14 = (TextView) h5e.a(R.id.hint_amount4_selected, viewInflate);
                                                                                                                    if (textView14 != null) {
                                                                                                                        i = R.id.hint_fbg_selected;
                                                                                                                        TextView textView15 = (TextView) h5e.a(R.id.hint_fbg_selected, viewInflate);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i = R.id.margin_1;
                                                                                                                            View viewA2 = h5e.a(R.id.margin_1, viewInflate);
                                                                                                                            if (viewA2 != null) {
                                                                                                                                i = R.id.margin_2;
                                                                                                                                View viewA3 = h5e.a(R.id.margin_2, viewInflate);
                                                                                                                                if (viewA3 != null) {
                                                                                                                                    i = R.id.max;
                                                                                                                                    TextView textView16 = (TextView) h5e.a(R.id.max, viewInflate);
                                                                                                                                    if (textView16 != null) {
                                                                                                                                        i = R.id.max_text;
                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.max_text, viewInflate);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            i = R.id.min;
                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.min, viewInflate);
                                                                                                                                            if (textView18 != null) {
                                                                                                                                                i = R.id.min_text;
                                                                                                                                                TextView textView19 = (TextView) h5e.a(R.id.min_text, viewInflate);
                                                                                                                                                if (textView19 != null) {
                                                                                                                                                    i = R.id.minus;
                                                                                                                                                    ImageView imageView4 = (ImageView) h5e.a(R.id.minus, viewInflate);
                                                                                                                                                    if (imageView4 != null) {
                                                                                                                                                        i = R.id.minus_layout;
                                                                                                                                                        if (((RelativeLayout) h5e.a(R.id.minus_layout, viewInflate)) != null) {
                                                                                                                                                            i = R.id.place_bet;
                                                                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.place_bet, viewInflate);
                                                                                                                                                            if (constraintLayout6 != null) {
                                                                                                                                                                i = R.id.place_bet_text;
                                                                                                                                                                TextView textView20 = (TextView) h5e.a(R.id.place_bet_text, viewInflate);
                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                    i = R.id.place_bet_text_layout;
                                                                                                                                                                    CardView cardView = (CardView) h5e.a(R.id.place_bet_text_layout, viewInflate);
                                                                                                                                                                    if (cardView != null) {
                                                                                                                                                                        i = R.id.plus;
                                                                                                                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.plus, viewInflate);
                                                                                                                                                                        if (imageView5 != null) {
                                                                                                                                                                            i = R.id.plus_layout;
                                                                                                                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.plus_layout, viewInflate);
                                                                                                                                                                            if (relativeLayout2 != null) {
                                                                                                                                                                                i = R.id.progress;
                                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.progress, viewInflate)) != null) {
                                                                                                                                                                                    i = R.id.view;
                                                                                                                                                                                    View viewA4 = h5e.a(R.id.view, viewInflate);
                                                                                                                                                                                    if (viewA4 != null) {
                                                                                                                                                                                        i = R.id.view_be11;
                                                                                                                                                                                        View viewA5 = h5e.a(R.id.view_be11, viewInflate);
                                                                                                                                                                                        if (viewA5 != null) {
                                                                                                                                                                                            i = R.id.view_bet;
                                                                                                                                                                                            View viewA6 = h5e.a(R.id.view_bet, viewInflate);
                                                                                                                                                                                            if (viewA6 != null) {
                                                                                                                                                                                                i = R.id.view_bet10;
                                                                                                                                                                                                View viewA7 = h5e.a(R.id.view_bet10, viewInflate);
                                                                                                                                                                                                if (viewA7 != null) {
                                                                                                                                                                                                    i = R.id.view_bet2;
                                                                                                                                                                                                    View viewA8 = h5e.a(R.id.view_bet2, viewInflate);
                                                                                                                                                                                                    if (viewA8 != null) {
                                                                                                                                                                                                        i = R.id.view_bet3;
                                                                                                                                                                                                        View viewA9 = h5e.a(R.id.view_bet3, viewInflate);
                                                                                                                                                                                                        if (viewA9 != null) {
                                                                                                                                                                                                            i = R.id.view_bet4;
                                                                                                                                                                                                            View viewA10 = h5e.a(R.id.view_bet4, viewInflate);
                                                                                                                                                                                                            if (viewA10 != null) {
                                                                                                                                                                                                                i = R.id.view_bet5;
                                                                                                                                                                                                                View viewA11 = h5e.a(R.id.view_bet5, viewInflate);
                                                                                                                                                                                                                if (viewA11 != null) {
                                                                                                                                                                                                                    i = R.id.view_bet6;
                                                                                                                                                                                                                    View viewA12 = h5e.a(R.id.view_bet6, viewInflate);
                                                                                                                                                                                                                    if (viewA12 != null) {
                                                                                                                                                                                                                        i = R.id.view_bet7;
                                                                                                                                                                                                                        View viewA13 = h5e.a(R.id.view_bet7, viewInflate);
                                                                                                                                                                                                                        if (viewA13 != null) {
                                                                                                                                                                                                                            i = R.id.view_bet8;
                                                                                                                                                                                                                            View viewA14 = h5e.a(R.id.view_bet8, viewInflate);
                                                                                                                                                                                                                            if (viewA14 != null) {
                                                                                                                                                                                                                                i = R.id.view_bet9;
                                                                                                                                                                                                                                View viewA15 = h5e.a(R.id.view_bet9, viewInflate);
                                                                                                                                                                                                                                if (viewA15 != null) {
                                                                                                                                                                                                                                    i = R.id.waiting;
                                                                                                                                                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.waiting, viewInflate);
                                                                                                                                                                                                                                    if (appCompatTextView != null) {
                                                                                                                                                                                                                                        i = R.id.waiting_button;
                                                                                                                                                                                                                                        ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.waiting_button, viewInflate);
                                                                                                                                                                                                                                        if (constraintLayout7 != null) {
                                                                                                                                                                                                                                            this.binding = new v720((MaterialCardView) viewInflate, textView, textView2, sHBetToggle, textView3, sHBetToggle2, constraintLayout, constraintLayout2, textView4, constraintLayout3, textView5, constraintLayout4, textView6, relativeLayout, constraintLayout5, imageView, viewA, imageView2, imageView3, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, viewA2, viewA3, textView16, textView17, textView18, textView19, imageView4, constraintLayout6, textView20, cardView, imageView5, relativeLayout2, viewA4, viewA5, viewA6, viewA7, viewA8, viewA9, viewA10, viewA11, viewA12, viewA13, viewA14, viewA15, appCompatTextView, constraintLayout7);
                                                                                                                                                                                                                                            sHBetToggle.H = 1;
                                                                                                                                                                                                                                            SharedPreferences sharedPreferencesA = un20.a(context);
                                                                                                                                                                                                                                            this.v = sharedPreferencesA;
                                                                                                                                                                                                                                            if (sharedPreferencesA == null || !sharedPreferencesA.getBoolean("PING_PONG_ONE_TAP", true)) {
                                                                                                                                                                                                                                                this.binding.d.setAlpha(0.65f);
                                                                                                                                                                                                                                            } else {
                                                                                                                                                                                                                                                this.binding.d.setAlpha(1.0f);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (Build.VERSION.SDK_INT <= 25) {
                                                                                                                                                                                                                                                this.binding.w.setTextSize(12.0f);
                                                                                                                                                                                                                                                this.binding.c.setTextSize(9.0f);
                                                                                                                                                                                                                                                this.binding.e.setTextSize(9.0f);
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            this.R = new a(context);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        throw null;
    }

    public static String b(String str) {
        List listSplit$default = StringsKt__StringsKt.split$default(str, new String[]{"."}, false, 2, 2, null);
        if (listSplit$default.size() < 2) {
            return str;
        }
        return listSplit$default.get(0) + "." + c.p((String) listSplit$default.get(1), ".", "", false);
    }

    public final void a() {
        this.binding.J.setVisibility(8);
        this.binding.L.setVisibility(8);
        this.binding.N.setVisibility(8);
        this.binding.P.setVisibility(8);
        this.binding.Q.setVisibility(8);
    }

    public final void c() {
        String strB;
        String string;
        this.giftItem = null;
        this.binding.d.R = false;
        this.giftAmount = null;
        this.fbgRoundId = 0L;
        setEnableContainer();
        TextView textView = this.binding.b;
        TreeMap treeMap = pw.a;
        textView.setText(pw.n(this.userInputAmount));
        this.binding.X.setVisibility(0);
        this.binding.b0.setVisibility(0);
        this.binding.b.setAlpha(1.0f);
        this.binding.H.setAlpha(1.0f);
        this.binding.c0.setVisibility(0);
        this.binding.E.setVisibility(8);
        this.binding.H.setVisibility(8);
        this.binding.R.setVisibility(0);
        this.binding.b.getLayoutParams().width = 0;
        this.binding.i.setBackground(getContext().getDrawable(R.drawable.pp_card_bet_amount_selector));
        TextView textView2 = this.binding.Z;
        Context context = getContext();
        if (context == null || (string = context.getString(R.string.place_bet_text_sh)) == null) {
            strB = null;
        } else {
            op5 op5Var = op5.a;
            String string2 = getContext().getString(R.string.place_bet_cms);
            string2.getClass();
            op5Var.getClass();
            strB = op5.b(string2, string, null);
        }
        op5 op5Var2 = op5.a;
        DetailResponse detailResponse = this.P;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        String currency = detailResponse.getCurrency();
        op5Var2.getClass();
        String strI = op5.i(currency);
        CharSequence text = this.binding.b.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append("\n");
        sb.append(strI);
        sb.append(" ");
        sb.append((Object) text);
        zug.b(sb, "?", textView2);
        double dA = tr80.a(this.binding.b);
        DetailResponse detailResponse2 = this.P;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double stepAmount = dA - detailResponse2.getStepAmount();
        DetailResponse detailResponse3 = this.P;
        if (detailResponse3 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double minAmount = detailResponse3.getMinAmount();
        v720 v720Var = this.binding;
        if (stepAmount < minAmount) {
            v720Var.X.setClickable(false);
            this.binding.X.setAlpha(0.5f);
        } else {
            v720Var.X.setClickable(true);
            this.binding.X.setAlpha(1.0f);
        }
        double dA2 = tr80.a(this.binding.b);
        DetailResponse detailResponse4 = this.P;
        if (detailResponse4 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double stepAmount2 = detailResponse4.getStepAmount() + dA2;
        DetailResponse detailResponse5 = this.P;
        if (detailResponse5 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double maxAmount = detailResponse5.getMaxAmount();
        v720 v720Var2 = this.binding;
        if (stepAmount2 > maxAmount) {
            v720Var2.b0.setClickable(false);
            this.binding.b0.setAlpha(0.5f);
        } else {
            v720Var2.b0.setClickable(true);
            this.binding.b0.setAlpha(1.0f);
        }
    }

    public final boolean d() {
        Integer numValueOf = Integer.valueOf(R.color.warn_toast);
        if (this.betPlaced) {
            gaj<Boolean, String, Integer, Unit> autoCashoutListener = getAutoCashoutListener();
            Boolean boolValueOf = Boolean.valueOf(this.L);
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
        Boolean boolValueOf2 = Boolean.valueOf(this.L);
        op5 op5Var2 = op5.a;
        String string3 = getContext().getString(R.string.turn_off_auto_bet_cms);
        string3.getClass();
        String string4 = getContext().getString(R.string.turn_off);
        string4.getClass();
        autoCashoutListener2.invoke(boolValueOf2, op5.c(op5Var2, string3, string4), numValueOf);
        return true;
    }

    public final void e(int i) {
        if (i == 0) {
            if (this.binding.G.getAlpha() == 1.0f) {
                this.binding.Q.setVisibility(0);
            }
        } else {
            if (i == 1) {
                this.binding.J.setVisibility(0);
                return;
            }
            if (i == 2) {
                this.binding.L.setVisibility(0);
            } else if (i == 3) {
                this.binding.N.setVisibility(0);
            } else {
                if (i != 4) {
                    return;
                }
                this.binding.P.setVisibility(0);
            }
        }
    }

    public final void f() {
        boolean z;
        try {
            boolean z2 = Double.parseDouble(this.binding.z.getText().toString()) < Double.parseDouble("1.01");
            Double dH = b.h(this.binding.b.getText().toString());
            double dDoubleValue = dH != null ? dH.doubleValue() : 0.0d;
            DetailResponse detailResponse = this.P;
            if (detailResponse == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            if (dDoubleValue >= detailResponse.getMinAmount()) {
                DetailResponse detailResponse2 = this.P;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                z = dDoubleValue > detailResponse2.getMaxAmount();
            }
            if (!z2 && !z) {
                this.binding.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                SharedPreferences sharedPreferences = this.v;
                if (sharedPreferences != null && sharedPreferences.getBoolean("PING_PONG_ONE_TAP", true)) {
                    this.binding.d.setAlpha(1.0f);
                }
                this.binding.Y.setClickable(true);
                this.binding.Y.setAlpha(1.0f);
                return;
            }
            this.binding.v.setClickable(false);
            this.binding.v.setAlpha(0.65f);
            this.binding.d.setAlpha(0.65f);
            if (this.binding.Y.getVisibility() == 0) {
                this.binding.Y.setClickable(false);
                this.binding.Y.setAlpha(0.65f);
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

    public final v720 getBinding() {
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

    public final long getRoundId() {
        return this.roundId;
    }

    public final double getUserInputAmount() {
        return this.userInputAmount;
    }

    public final void setAutoBetPlace(boolean z) {
        this.autoBetPlace = z;
    }

    public final void setAutoCashoutAmount(final Function0<Unit> cashoutAmount) {
        cashoutAmount.getClass();
        gr60.a(this.binding.C, new Function1() { // from class: ar80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function0 function0 = cashoutAmount;
                int i = ShBetContainer.S;
                ((View) obj).getClass();
                try {
                    if (!shBetContainer.d()) {
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
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
        this.binding.b.setText("0");
    }

    public final void setBetCross() {
        String string;
        try {
            CharSequence text = this.binding.b.getText();
            String strSubstring = null;
            String string2 = text != null ? text.toString() : null;
            if (string2 != null && string2.length() != 0) {
                CharSequence text2 = this.binding.b.getText();
                if (text2 != null && (string = text2.toString()) != null) {
                    strSubstring = string.substring(0, this.binding.b.getText().toString().length() - 1);
                }
                if (strSubstring != null && strSubstring.length() == 0) {
                    this.binding.b.setText("");
                }
                if (strSubstring == null || strSubstring.length() <= 0) {
                    this.binding.b.setText("");
                } else {
                    this.binding.b.setText(strSubstring);
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void setBetDone() {
        try {
            String string = this.binding.b.getText().toString();
            String str = YAzniTbXHYQ.wJMcJiDMdP;
            if (string == null || string.length() == 0) {
                TextView textView = this.binding.b;
                TreeMap treeMap = pw.a;
                DetailResponse detailResponse = this.P;
                if (detailResponse == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                textView.setText(pw.n(detailResponse.getMinAmount()));
            } else {
                double d = Double.parseDouble(string);
                DetailResponse detailResponse2 = this.P;
                if (detailResponse2 == null) {
                    Intrinsics.n(str);
                    throw null;
                }
                if (d >= detailResponse2.getMaxAmount()) {
                    TextView textView2 = this.binding.b;
                    TreeMap treeMap2 = pw.a;
                    DetailResponse detailResponse3 = this.P;
                    if (detailResponse3 == null) {
                        Intrinsics.n(str);
                        throw null;
                    }
                    textView2.setText(pw.n(detailResponse3.getMaxAmount()));
                } else {
                    double d2 = Double.parseDouble(string);
                    DetailResponse detailResponse4 = this.P;
                    if (detailResponse4 == null) {
                        Intrinsics.n(str);
                        throw null;
                    }
                    double minAmount = detailResponse4.getMinAmount();
                    v720 v720Var = this.binding;
                    if (d2 <= minAmount) {
                        TextView textView3 = v720Var.b;
                        TreeMap treeMap3 = pw.a;
                        DetailResponse detailResponse5 = this.P;
                        if (detailResponse5 == null) {
                            Intrinsics.n(str);
                            throw null;
                        }
                        textView3.setText(pw.n(detailResponse5.getMinAmount()));
                    } else {
                        TextView textView4 = v720Var.b;
                        TreeMap treeMap4 = pw.a;
                        textView4.setText(pw.n(Double.parseDouble(string)));
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.binding.i.setEnabled(false);
            throw th;
        }
        this.binding.i.setEnabled(false);
    }

    public final void setBetDoubleZero() {
        String string = this.binding.b.getText().toString();
        if ((string.length() == 0 || Double.parseDouble(string) == 0.0d) && !StringsKt.M(string, ".", false)) {
            TextView textView = this.binding.b;
            TreeMap treeMap = pw.a;
            textView.setText(pw.n(Double.parseDouble("0")));
            string = "0";
        } else if (!StringsKt.M(string, ".", false)) {
            string = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
            TextView textView2 = this.binding.b;
            TreeMap treeMap2 = pw.a;
            textView2.setText(pw.n(Double.parseDouble(string)));
        } else if (((String) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
            TextView textView3 = this.binding.b;
            TreeMap treeMap3 = pw.a;
            textView3.setText(pw.n(Double.parseDouble(string)));
        } else if (((CharSequence) StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
            string = string.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
            TextView textView4 = this.binding.b;
            TreeMap treeMap4 = pw.a;
            textView4.setText(pw.n(Double.parseDouble(string)));
        } else {
            string = "";
        }
        if (string.length() == 0) {
            return;
        }
        double d = Double.parseDouble(string);
        DetailResponse detailResponse = this.P;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        if (d >= detailResponse.getMaxAmount()) {
            TextView textView5 = this.binding.b;
            TreeMap treeMap5 = pw.a;
            DetailResponse detailResponse2 = this.P;
            if (detailResponse2 != null) {
                textView5.setText(pw.n(detailResponse2.getMaxAmount()));
            } else {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
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
        gr60.a(this.binding.v, new Function1() { // from class: er80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function0 function0 = isNotLoggedIn;
                Function0 function1 = openLoginDialog;
                ShBetContainer shBetContainer = this;
                Function1 function2 = betListener;
                int i = ShBetContainer.S;
                ((View) obj).getClass();
                try {
                    if (((Boolean) function0.invoke()).booleanValue()) {
                        function1.invoke();
                    } else {
                        shBetContainer.a();
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
        String string;
        gameDetailResponse.getClass();
        this.P = gameDetailResponse;
        this.binding.b.addTextChangedListener(this.R);
        this.binding.y.setVisibility(0);
        TextView textView = this.binding.V;
        Context context = getContext();
        TreeMap treeMap = pw.a;
        textView.setText(context.getString(R.string.colon_amount, pw.n(gameDetailResponse.getMinAmount())));
        this.binding.T.setText(getContext().getString(R.string.colon_amount, pw.n(gameDetailResponse.getMaxAmount())));
        if (this.giftItem == null) {
            double d = this.userInputAmount;
            if (d <= 0.0d || d < gameDetailResponse.getMinAmount()) {
                this.binding.b.setText(pw.n(gameDetailResponse.getDefaultAmount()));
                this.userInputAmount = tr80.a(this.binding.b);
            }
        }
        TextView textView2 = this.binding.Z;
        Context context2 = getContext();
        String strB = null;
        if (context2 != null && (string = context2.getString(R.string.place_bet_text_sh)) != null) {
            op5 op5Var = op5.a;
            String string2 = getContext().getString(R.string.place_bet_cms);
            string2.getClass();
            op5Var.getClass();
            strB = op5.b(string2, string, null);
        }
        op5 op5Var2 = op5.a;
        String currency = gameDetailResponse.getCurrency();
        op5Var2.getClass();
        String strI = op5.i(currency);
        CharSequence text = this.binding.b.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append("\n");
        sb.append(strI);
        sb.append(" ");
        sb.append((Object) text);
        zug.b(sb, "?", textView2);
        int i = 1;
        if (this.fbgAvailable) {
            if (yju.a("br")) {
                this.binding.G.setBackground(getContext().getDrawable(R.drawable.pp_br_hint));
            }
            this.binding.G.setVisibility(0);
            this.binding.I.setVisibility(4);
            this.binding.Q.setVisibility(8);
            TextView textView3 = this.binding.K;
            Double d2 = gameDetailResponse.getDefaultChips().get(0);
            d2.getClass();
            ajc.a(d2, textView3);
            TextView textView4 = this.binding.M;
            Double d3 = gameDetailResponse.getDefaultChips().get(1);
            d3.getClass();
            ajc.a(d3, textView4);
            TextView textView5 = this.binding.O;
            Double d4 = gameDetailResponse.getDefaultChips().get(2);
            d4.getClass();
            ajc.a(d4, textView5);
            TextView textView6 = this.binding.J;
            Double d5 = gameDetailResponse.getDefaultChips().get(0);
            d5.getClass();
            ajc.a(d5, textView6);
            TextView textView7 = this.binding.L;
            Double d6 = gameDetailResponse.getDefaultChips().get(0);
            d6.getClass();
            ajc.a(d6, textView7);
            TextView textView8 = this.binding.N;
            Double d7 = gameDetailResponse.getDefaultChips().get(1);
            d7.getClass();
            ajc.a(d7, textView8);
            TextView textView9 = this.binding.P;
            Double d8 = gameDetailResponse.getDefaultChips().get(2);
            d8.getClass();
            ajc.a(d8, textView9);
        } else {
            this.binding.G.setVisibility(8);
            this.binding.I.setVisibility(0);
            this.binding.Q.setVisibility(8);
            TextView textView10 = this.binding.I;
            Double d9 = gameDetailResponse.getDefaultChips().get(0);
            d9.getClass();
            ajc.a(d9, textView10);
            TextView textView11 = this.binding.K;
            Double d10 = gameDetailResponse.getDefaultChips().get(1);
            d10.getClass();
            ajc.a(d10, textView11);
            TextView textView12 = this.binding.M;
            Double d11 = gameDetailResponse.getDefaultChips().get(2);
            d11.getClass();
            ajc.a(d11, textView12);
            TextView textView13 = this.binding.O;
            Double d12 = gameDetailResponse.getDefaultChips().get(3);
            d12.getClass();
            ajc.a(d12, textView13);
            TextView textView14 = this.binding.J;
            Double d13 = gameDetailResponse.getDefaultChips().get(0);
            d13.getClass();
            ajc.a(d13, textView14);
            TextView textView15 = this.binding.L;
            Double d14 = gameDetailResponse.getDefaultChips().get(1);
            d14.getClass();
            ajc.a(d14, textView15);
            TextView textView16 = this.binding.N;
            Double d15 = gameDetailResponse.getDefaultChips().get(2);
            d15.getClass();
            ajc.a(d15, textView16);
            TextView textView17 = this.binding.P;
            Double d16 = gameDetailResponse.getDefaultChips().get(3);
            d16.getClass();
            ajc.a(d16, textView17);
        }
        CharSequence text2 = this.binding.z.getText();
        text2.getClass();
        if (text2.length() == 0) {
            this.binding.z.setText("5");
            this.cashoutCoeff = Double.parseDouble("5");
        }
        double dA = tr80.a(this.binding.b) - gameDetailResponse.getStepAmount();
        double minAmount = gameDetailResponse.getMinAmount();
        v720 v720Var = this.binding;
        if (dA < minAmount) {
            v720Var.X.setClickable(false);
            this.binding.X.setAlpha(0.5f);
        } else {
            v720Var.X.setClickable(true);
            this.binding.X.setAlpha(1.0f);
        }
        gr60.a(this.binding.G, new Function1() { // from class: ir80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.S;
                ((View) obj).getClass();
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        if (shBetContainer.binding.G.getAlpha() == 1.0f) {
                            shBetContainer.binding.Q.setVisibility(0);
                        }
                        shBetContainer.binding.J.setVisibility(8);
                        shBetContainer.binding.L.setVisibility(8);
                        shBetContainer.binding.N.setVisibility(8);
                        shBetContainer.binding.P.setVisibility(8);
                        Function1<? super Boolean, Unit> function1 = shBetContainer.O;
                        if (function1 == null) {
                            Intrinsics.n("onFbgClick");
                            throw null;
                        }
                        function1.invoke(Boolean.TRUE);
                        shBetContainer.getOnBetChipSelected().invoke(0);
                        return Unit.a;
                    }
                    return Unit.a;
                } catch (Exception unused) {
                }
            }
        });
        this.binding.I.setOnClickListener(new View.OnClickListener() { // from class: kr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string3;
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.S;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        boolean z = shBetContainer.b;
                        DetailResponse detailResponse = gameDetailResponse;
                        if (z) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(0).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView18 = shBetContainer.binding.b;
                                TreeMap treeMap2 = pw.a;
                                textView18.setText(pw.n(dDoubleValue));
                            }
                            shBetContainer.binding.J.setVisibility(0);
                        } else {
                            TextView textView19 = shBetContainer.binding.b;
                            TreeMap treeMap3 = pw.a;
                            Double d17 = detailResponse.getDefaultChips().get(0);
                            d17.getClass();
                            textView19.setText(pw.n(d17.doubleValue()));
                            shBetContainer.b = true;
                            shBetContainer.c = false;
                            shBetContainer.d = false;
                            shBetContainer.e = false;
                            shBetContainer.binding.J.setVisibility(0);
                            shBetContainer.binding.L.setVisibility(8);
                            shBetContainer.binding.N.setVisibility(8);
                            shBetContainer.binding.P.setVisibility(8);
                        }
                        double d18 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) - detailResponse.getStepAmount();
                        double minAmount2 = detailResponse.getMinAmount();
                        v720 v720Var2 = shBetContainer.binding;
                        if (d18 < minAmount2) {
                            v720Var2.X.setClickable(false);
                            shBetContainer.binding.X.setAlpha(0.5f);
                        } else {
                            v720Var2.X.setClickable(true);
                            shBetContainer.binding.X.setAlpha(1.0f);
                        }
                        double d19 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) + detailResponse.getStepAmount();
                        double maxAmount = detailResponse.getMaxAmount();
                        v720 v720Var3 = shBetContainer.binding;
                        if (d19 > maxAmount) {
                            v720Var3.b0.setClickable(false);
                            shBetContainer.binding.b0.setAlpha(0.5f);
                        } else {
                            v720Var3.b0.setClickable(true);
                            shBetContainer.binding.b0.setAlpha(1.0f);
                        }
                        TextView textView20 = shBetContainer.binding.Z;
                        Context context3 = shBetContainer.getContext();
                        String strB2 = null;
                        if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                            op5 op5Var3 = op5.a;
                            String string4 = shBetContainer.getContext().getString(R.string.place_bet_cms);
                            string4.getClass();
                            op5Var3.getClass();
                            strB2 = op5.b(string4, string3, null);
                        }
                        op5 op5Var4 = op5.a;
                        String currency2 = detailResponse.getCurrency();
                        op5Var4.getClass();
                        textView20.setText(strB2 + "\n" + op5.i(currency2) + " " + ((Object) shBetContainer.binding.b.getText()) + "?");
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.z.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.z.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("5");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(1);
                    }
                } catch (Exception unused) {
                }
            }
        });
        this.binding.K.setOnClickListener(new View.OnClickListener() { // from class: mr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string3;
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.S;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        int i3 = !shBetContainer.fbgAvailable ? 1 : 0;
                        boolean z = shBetContainer.c;
                        DetailResponse detailResponse = gameDetailResponse;
                        if (z) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(i3).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView18 = shBetContainer.binding.b;
                                TreeMap treeMap2 = pw.a;
                                textView18.setText(pw.n(dDoubleValue));
                            }
                            shBetContainer.binding.L.setVisibility(0);
                        } else {
                            TextView textView19 = shBetContainer.binding.b;
                            TreeMap treeMap3 = pw.a;
                            Double d17 = detailResponse.getDefaultChips().get(i3);
                            d17.getClass();
                            textView19.setText(pw.n(d17.doubleValue()));
                            shBetContainer.b = false;
                            shBetContainer.c = true;
                            shBetContainer.d = false;
                            shBetContainer.e = false;
                            shBetContainer.binding.J.setVisibility(8);
                            shBetContainer.binding.L.setVisibility(0);
                            shBetContainer.binding.N.setVisibility(8);
                            shBetContainer.binding.P.setVisibility(8);
                        }
                        double d18 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) - detailResponse.getStepAmount();
                        double minAmount2 = detailResponse.getMinAmount();
                        v720 v720Var2 = shBetContainer.binding;
                        if (d18 < minAmount2) {
                            v720Var2.X.setClickable(false);
                            shBetContainer.binding.X.setAlpha(0.5f);
                        } else {
                            v720Var2.X.setClickable(true);
                            shBetContainer.binding.X.setAlpha(1.0f);
                        }
                        double d19 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) + detailResponse.getStepAmount();
                        double maxAmount = detailResponse.getMaxAmount();
                        v720 v720Var3 = shBetContainer.binding;
                        if (d19 > maxAmount) {
                            v720Var3.b0.setClickable(false);
                            shBetContainer.binding.b0.setAlpha(0.5f);
                        } else {
                            v720Var3.b0.setClickable(true);
                            shBetContainer.binding.b0.setAlpha(1.0f);
                        }
                        TextView textView20 = shBetContainer.binding.Z;
                        Context context3 = shBetContainer.getContext();
                        String strB2 = null;
                        if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                            op5 op5Var3 = op5.a;
                            String string4 = shBetContainer.getContext().getString(R.string.place_bet_cms);
                            string4.getClass();
                            op5Var3.getClass();
                            strB2 = op5.b(string4, string3, null);
                        }
                        op5 op5Var4 = op5.a;
                        String currency2 = detailResponse.getCurrency();
                        op5Var4.getClass();
                        textView20.setText(strB2 + "\n" + op5.i(currency2) + " " + ((Object) shBetContainer.binding.b.getText()) + "?");
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.z.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.z.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("5");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(2);
                    }
                } catch (Exception unused) {
                }
            }
        });
        this.binding.M.setOnClickListener(new aeh(i, this, gameDetailResponse));
        this.binding.O.setOnClickListener(new View.OnClickListener() { // from class: pr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string3;
                ShBetContainer shBetContainer = this.a;
                int i2 = ShBetContainer.S;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        int i3 = shBetContainer.fbgAvailable ? 2 : 3;
                        boolean z = shBetContainer.e;
                        DetailResponse detailResponse = gameDetailResponse;
                        if (z) {
                            double dDoubleValue = detailResponse.getDefaultChips().get(i3).doubleValue() + Double.parseDouble(shBetContainer.binding.b.getText().toString());
                            if (dDoubleValue >= detailResponse.getMinAmount() && dDoubleValue <= detailResponse.getMaxAmount()) {
                                TextView textView18 = shBetContainer.binding.b;
                                TreeMap treeMap2 = pw.a;
                                textView18.setText(pw.n(dDoubleValue));
                            }
                            shBetContainer.binding.P.setVisibility(0);
                        } else {
                            TextView textView19 = shBetContainer.binding.b;
                            TreeMap treeMap3 = pw.a;
                            Double d17 = detailResponse.getDefaultChips().get(i3);
                            d17.getClass();
                            textView19.setText(pw.n(d17.doubleValue()));
                            shBetContainer.b = false;
                            shBetContainer.c = false;
                            shBetContainer.d = false;
                            shBetContainer.e = true;
                            shBetContainer.binding.J.setVisibility(8);
                            shBetContainer.binding.L.setVisibility(8);
                            shBetContainer.binding.N.setVisibility(8);
                            shBetContainer.binding.P.setVisibility(0);
                        }
                        double d18 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) - detailResponse.getStepAmount();
                        double minAmount2 = detailResponse.getMinAmount();
                        v720 v720Var2 = shBetContainer.binding;
                        if (d18 < minAmount2) {
                            v720Var2.X.setClickable(false);
                            shBetContainer.binding.X.setAlpha(0.5f);
                        } else {
                            v720Var2.X.setClickable(true);
                            shBetContainer.binding.X.setAlpha(1.0f);
                        }
                        double d19 = Double.parseDouble(shBetContainer.binding.b.getText().toString()) + detailResponse.getStepAmount();
                        double maxAmount = detailResponse.getMaxAmount();
                        v720 v720Var3 = shBetContainer.binding;
                        if (d19 > maxAmount) {
                            v720Var3.b0.setClickable(false);
                            shBetContainer.binding.b0.setAlpha(0.5f);
                        } else {
                            v720Var3.b0.setClickable(true);
                            shBetContainer.binding.b0.setAlpha(1.0f);
                        }
                        TextView textView20 = shBetContainer.binding.Z;
                        Context context3 = shBetContainer.getContext();
                        String strB2 = null;
                        if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                            op5 op5Var3 = op5.a;
                            String string4 = shBetContainer.getContext().getString(R.string.place_bet_cms);
                            string4.getClass();
                            op5Var3.getClass();
                            strB2 = op5.b(string4, string3, null);
                        }
                        op5 op5Var4 = op5.a;
                        String currency2 = detailResponse.getCurrency();
                        op5Var4.getClass();
                        textView20.setText(strB2 + "\n" + op5.i(currency2) + " " + ((Object) shBetContainer.binding.b.getText()) + "?");
                        shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
                        if (Double.parseDouble(shBetContainer.binding.z.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.z.setText("1.01");
                            shBetContainer.cashoutCoeff = Double.parseDouble("5");
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        shBetContainer.getOnBetChipSelected().invoke(4);
                    }
                } catch (Exception unused) {
                }
            }
        });
    }

    public final void setBetNumberClick(int number) {
        String strValueOf;
        String string = this.binding.b.getText().toString();
        if (string == null || string.length() == 0 || string.equals("0")) {
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
        if (this.P == null) {
            this.binding.b.setText(strValueOf);
            return;
        }
        double d = Double.parseDouble(strValueOf);
        DetailResponse detailResponse = this.P;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double maxAmount = detailResponse.getMaxAmount();
        v720 v720Var = this.binding;
        if (d < maxAmount) {
            v720Var.b.setText(strValueOf);
            return;
        }
        TextView textView = v720Var.b;
        TreeMap treeMap = pw.a;
        DetailResponse detailResponse2 = this.P;
        if (detailResponse2 != null) {
            textView.setText(pw.n(detailResponse2.getMaxAmount()));
        } else {
            Intrinsics.n("gameDetailResponse");
            throw null;
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
            if (string.length() <= 0 || StringsKt.M(string, ".", false)) {
                return;
            }
            this.binding.b.setText(string.concat("."));
        } catch (Exception unused) {
        }
    }

    public final void setBetStepListener(final Function1<? super String, Unit> betStepListener) {
        betStepListener.getClass();
        this.binding.i.setEnabled(false);
        this.binding.X.setOnClickListener(new View.OnClickListener() { // from class: cr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strB;
                String string;
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = betStepListener;
                int i = ShBetContainer.S;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        double d = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse = shBetContainer.P;
                        if (detailResponse == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d <= detailResponse.getMinAmount()) {
                            return;
                        }
                        double d2 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse2 = shBetContainer.P;
                        if (detailResponse2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double stepAmount = d2 - detailResponse2.getStepAmount();
                        DetailResponse detailResponse3 = shBetContainer.P;
                        if (detailResponse3 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (stepAmount <= detailResponse3.getMinAmount()) {
                            DetailResponse detailResponse4 = shBetContainer.P;
                            if (detailResponse4 == null) {
                                Intrinsics.n("gameDetailResponse");
                                throw null;
                            }
                            stepAmount = detailResponse4.getMinAmount();
                        }
                        TextView textView = shBetContainer.binding.b;
                        TreeMap treeMap = pw.a;
                        textView.setText(pw.n(stepAmount));
                        double d3 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse5 = shBetContainer.P;
                        if (detailResponse5 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double minAmount = detailResponse5.getMinAmount();
                        v720 v720Var = shBetContainer.binding;
                        if (d3 <= minAmount) {
                            v720Var.X.setClickable(false);
                            shBetContainer.binding.X.setAlpha(0.5f);
                        } else {
                            v720Var.X.setClickable(true);
                            shBetContainer.binding.X.setAlpha(1.0f);
                        }
                        double d4 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse6 = shBetContainer.P;
                        if (detailResponse6 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double stepAmount2 = d4 + detailResponse6.getStepAmount();
                        DetailResponse detailResponse7 = shBetContainer.P;
                        if (detailResponse7 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double maxAmount = detailResponse7.getMaxAmount();
                        v720 v720Var2 = shBetContainer.binding;
                        if (stepAmount2 > maxAmount) {
                            v720Var2.b0.setClickable(false);
                            shBetContainer.binding.b0.setAlpha(0.5f);
                        } else {
                            v720Var2.b0.setClickable(true);
                            shBetContainer.binding.b0.setAlpha(1.0f);
                        }
                        TextView textView2 = shBetContainer.binding.Z;
                        Context context = shBetContainer.getContext();
                        if (context == null || (string = context.getString(R.string.place_bet_text_sh)) == null) {
                            strB = null;
                        } else {
                            op5 op5Var = op5.a;
                            String string2 = shBetContainer.getContext().getString(R.string.place_bet_cms);
                            string2.getClass();
                            op5Var.getClass();
                            strB = op5.b(string2, string, null);
                        }
                        op5 op5Var2 = op5.a;
                        DetailResponse detailResponse8 = shBetContainer.P;
                        if (detailResponse8 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        String currency = detailResponse8.getCurrency();
                        op5Var2.getClass();
                        textView2.setText(strB + "\n" + op5.i(currency) + " " + ((Object) shBetContainer.binding.b.getText()) + "?");
                        if (shBetContainer.L) {
                            shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
                        }
                        if (Double.parseDouble(shBetContainer.binding.z.getText().toString()) < Double.parseDouble("1.01")) {
                            shBetContainer.binding.z.setText("1.01");
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
        this.binding.b0.setOnClickListener(new View.OnClickListener() { // from class: dr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strB;
                String string;
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = betStepListener;
                int i = ShBetContainer.S;
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        double d = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse = shBetContainer.P;
                        if (detailResponse == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        if (d >= detailResponse.getMaxAmount()) {
                            return;
                        }
                        TextView textView = shBetContainer.binding.b;
                        TreeMap treeMap = pw.a;
                        double d2 = Double.parseDouble(textView.getText().toString());
                        DetailResponse detailResponse2 = shBetContainer.P;
                        if (detailResponse2 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        textView.setText(pw.n(d2 + detailResponse2.getStepAmount()));
                        double d3 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse3 = shBetContainer.P;
                        if (detailResponse3 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double stepAmount = d3 - detailResponse3.getStepAmount();
                        DetailResponse detailResponse4 = shBetContainer.P;
                        if (detailResponse4 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double minAmount = detailResponse4.getMinAmount();
                        v720 v720Var = shBetContainer.binding;
                        if (stepAmount < minAmount) {
                            v720Var.X.setClickable(false);
                            shBetContainer.binding.X.setAlpha(0.5f);
                        } else {
                            v720Var.X.setClickable(true);
                            shBetContainer.binding.X.setAlpha(1.0f);
                        }
                        double d4 = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        DetailResponse detailResponse5 = shBetContainer.P;
                        if (detailResponse5 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double stepAmount2 = d4 + detailResponse5.getStepAmount();
                        DetailResponse detailResponse6 = shBetContainer.P;
                        if (detailResponse6 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        double maxAmount = detailResponse6.getMaxAmount();
                        v720 v720Var2 = shBetContainer.binding;
                        if (stepAmount2 > maxAmount) {
                            v720Var2.b0.setClickable(false);
                            shBetContainer.binding.b0.setAlpha(0.5f);
                        } else {
                            v720Var2.b0.setClickable(true);
                            shBetContainer.binding.b0.setAlpha(1.0f);
                        }
                        TextView textView2 = shBetContainer.binding.Z;
                        Context context = shBetContainer.getContext();
                        if (context == null || (string = context.getString(R.string.place_bet_text_sh)) == null) {
                            strB = null;
                        } else {
                            op5 op5Var = op5.a;
                            String string2 = shBetContainer.getContext().getString(R.string.place_bet_cms);
                            string2.getClass();
                            op5Var.getClass();
                            strB = op5.b(string2, string, null);
                        }
                        op5 op5Var2 = op5.a;
                        DetailResponse detailResponse7 = shBetContainer.P;
                        if (detailResponse7 == null) {
                            Intrinsics.n("gameDetailResponse");
                            throw null;
                        }
                        String currency = detailResponse7.getCurrency();
                        op5Var2.getClass();
                        textView2.setText(strB + "\n" + op5.i(currency) + " " + ((Object) shBetContainer.binding.b.getText()) + "?");
                        if (shBetContainer.L) {
                            shBetContainer.setCashoutAmount(Double.parseDouble(shBetContainer.binding.z.getText().toString()));
                        }
                        shBetContainer.userInputAmount = Double.parseDouble(shBetContainer.binding.b.getText().toString());
                        function1.invoke("Decrease");
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public final void setBinding(v720 v720Var) {
        v720Var.getClass();
        this.binding = v720Var;
    }

    public final void setCancelBetListener(final Function1<? super String, Unit> cancelBetListener) {
        cancelBetListener.getClass();
        gr60.a(this.binding.D, new Function1(this) { // from class: sq80
            public final /* synthetic */ ShBetContainer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Function1 function1 = cancelBetListener;
                ShBetContainer shBetContainer = this.b;
                int i = ShBetContainer.S;
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

    public final void setCashoutAmount(int number) {
        double d;
        if (d()) {
            return;
        }
        CharSequence text = this.binding.z.getText();
        text.getClass();
        if (text.length() > 0 && !this.binding.z.getText().equals("0")) {
            boolean z = this.J;
            v720 v720Var = this.binding;
            if (!z) {
                CharSequence text2 = v720Var.z.getText();
                StringBuilder sb = new StringBuilder();
                sb.append((Object) text2);
                sb.append(number);
                d = Double.parseDouble(sb.toString());
            } else {
                if (number == 0) {
                    this.binding.z.setText(((Object) v720Var.z.getText()) + ".0");
                    this.J = false;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(((Object) v720Var.z.getText()) + ".");
                sb2.append(number);
                d = Double.parseDouble(b(sb2.toString()));
                this.J = false;
            }
        } else if (this.J) {
            d = ((double) number) / 10.0d;
            this.J = false;
        } else {
            d = number;
        }
        if (String.valueOf(d).length() > 0) {
            setCashoutAmount(d);
        } else {
            this.binding.z.setText("0");
            this.cashoutCoeff = 0.0d;
        }
        f();
    }

    public final void setCashoutCoeff(double d) {
        this.cashoutCoeff = d;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public final void setCashoutDone() {
        CharSequence text = this.binding.z.getText();
        text.getClass();
        if (text.length() == 0) {
            this.binding.v.setClickable(true);
            this.binding.v.setAlpha(1.0f);
            this.binding.z.setText("1.01");
            this.cashoutCoeff = Double.parseDouble("1.01");
        } else {
            double d = this.cashoutCoeff;
            if (d == 0.0d || d < Double.parseDouble("1.01")) {
                this.binding.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                this.binding.z.setText("1.01");
                this.cashoutCoeff = Double.parseDouble("1.01");
            }
        }
        this.J = false;
        f();
        this.binding.A.setEnabled(false);
    }

    public final void setCashoutInProgress(boolean z) {
        this.cashoutInProgress = z;
    }

    public final void setCashoutListener(final Function1<? super String, Unit> cashoutListener) {
        cashoutListener.getClass();
        gr60.a(this.binding.B, new Function1() { // from class: sr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = cashoutListener;
                int i = ShBetContainer.S;
                ((View) obj).getClass();
                try {
                    shBetContainer.a();
                    function1.invoke(shBetContainer.binding.b.getText().toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setClear() {
        if (!d()) {
            this.J = false;
            this.binding.z.setText("0");
            this.cashoutCoeff = 0.0d;
        }
        f();
    }

    public final void setConfirmBetListener(final Function1<? super String, Unit> confirmBetListener) {
        confirmBetListener.getClass();
        gr60.a(this.binding.Y, new Function1() { // from class: uq80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function1 function1 = confirmBetListener;
                int i = ShBetContainer.S;
                ((View) obj).getClass();
                try {
                    shBetContainer.a();
                    function1.invoke(shBetContainer.binding.b.getText().toString());
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
                return Unit.a;
            }
        });
    }

    public final void setCross() {
        if (d()) {
            return;
        }
        if (!Intrinsics.g(this.binding.z.getText().toString(), "0")) {
            String string = this.binding.z.getText().toString();
            int length = this.binding.z.getText().toString().length() - 1;
            if (length <= 0) {
                length = 0;
            }
            String strSubstring = string.substring(0, length);
            if (strSubstring.length() <= 0) {
                this.binding.z.setText("0");
                this.cashoutCoeff = 0.0d;
            } else if (Intrinsics.g(String.valueOf(strSubstring.charAt(strSubstring.length() - 1)), ".")) {
                this.J = false;
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            int length2 = strSubstring.length();
            v720 v720Var = this.binding;
            if (length2 > 0) {
                v720Var.z.setText(strSubstring);
                this.cashoutCoeff = Double.parseDouble(strSubstring);
            } else {
                v720Var.z.setText("0");
                this.cashoutCoeff = 0.0d;
            }
        }
        f();
    }

    public final void setDisableContainer() {
        this.K = true;
        this.binding.X.setClickable(false);
        this.binding.X.setAlpha(0.5f);
        this.binding.b0.setClickable(false);
        this.binding.b0.setAlpha(0.5f);
        if (this.giftItem == null) {
            this.binding.b.setAlpha(0.5f);
        }
        if (this.giftItem != null && this.betPlaced) {
            this.binding.b.setAlpha(0.5f);
            this.binding.H.setAlpha(0.5f);
        }
        this.binding.b.setClickable(false);
        this.binding.I.setClickable(false);
        this.binding.I.setEnabled(false);
        this.binding.I.setAlpha(0.5f);
        this.binding.K.setClickable(false);
        this.binding.K.setEnabled(false);
        this.binding.K.setAlpha(0.5f);
        this.binding.M.setClickable(false);
        this.binding.M.setEnabled(false);
        this.binding.M.setAlpha(0.5f);
        this.binding.O.setClickable(false);
        this.binding.O.setEnabled(false);
        this.binding.O.setAlpha(0.5f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    public final void setDone() {
        if (d()) {
            return;
        }
        CharSequence text = this.binding.z.getText();
        text.getClass();
        if (text.length() == 0) {
            this.binding.v.setClickable(true);
            this.binding.v.setAlpha(1.0f);
            this.binding.z.setText("1.01");
            this.cashoutCoeff = Double.parseDouble("1.01");
        } else {
            double d = this.cashoutCoeff;
            if (d == 0.0d || d < Double.parseDouble("1.01")) {
                this.binding.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                this.binding.z.setText("1.01");
                this.cashoutCoeff = Double.parseDouble("1.01");
            }
        }
        this.J = false;
        f();
        this.binding.A.setEnabled(false);
    }

    public final void setDoubleZero() {
        String str;
        if (d()) {
            return;
        }
        boolean z = this.J;
        v720 v720Var = this.binding;
        if (z) {
            str = ((Object) v720Var.z.getText()) + ".00";
        } else {
            str = ((Object) v720Var.z.getText()) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS;
        }
        String strB = b(str);
        if (strB.length() <= 0) {
            this.binding.z.setText("0");
            this.cashoutCoeff = 0.0d;
            return;
        }
        double d = Double.parseDouble(strB);
        DetailResponse detailResponse = this.P;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double maxPayoutAmount = detailResponse.getMaxPayoutAmount();
        DetailResponse detailResponse2 = this.P;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double defaultAmount = maxPayoutAmount / detailResponse2.getDefaultAmount();
        if (d > defaultAmount) {
            d = defaultAmount;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.##", SportyGamesManager.decimalFormatSymbols);
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        this.binding.z.setText(decimalFormat.format(d));
        this.cashoutCoeff = d;
    }

    public final void setEnableContainer() {
        if (!this.K || this.giftItem != null) {
            return;
        }
        try {
            double d = Double.parseDouble(this.binding.b.getText().toString());
            DetailResponse detailResponse = this.P;
            if (detailResponse == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            double stepAmount = d - detailResponse.getStepAmount();
            DetailResponse detailResponse2 = this.P;
            if (detailResponse2 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            if (stepAmount >= detailResponse2.getMinAmount()) {
                this.binding.X.setClickable(true);
                this.binding.X.setAlpha(1.0f);
            }
            double d2 = Double.parseDouble(this.binding.b.getText().toString());
            DetailResponse detailResponse3 = this.P;
            if (detailResponse3 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            double stepAmount2 = d2 + detailResponse3.getStepAmount();
            DetailResponse detailResponse4 = this.P;
            if (detailResponse4 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            if (stepAmount2 <= detailResponse4.getMaxAmount()) {
                this.binding.b0.setClickable(true);
                this.binding.b0.setAlpha(1.0f);
            }
            this.binding.b.setClickable(true);
            this.binding.b.setAlpha(1.0f);
            this.binding.H.setAlpha(1.0f);
            this.binding.I.setClickable(true);
            this.binding.I.setAlpha(1.0f);
            this.binding.I.setEnabled(true);
            this.binding.K.setClickable(true);
            this.binding.K.setAlpha(1.0f);
            this.binding.K.setEnabled(true);
            this.binding.M.setClickable(true);
            this.binding.M.setAlpha(1.0f);
            this.binding.M.setEnabled(true);
            this.binding.O.setClickable(true);
            this.binding.O.setAlpha(1.0f);
            this.binding.O.setEnabled(true);
            this.K = false;
        } catch (Exception unused) {
        }
    }

    public final void setFBG(GiftItem giftItem, boolean betPlaced, double amount) {
        String strB;
        String string;
        giftItem.getClass();
        this.giftItem = giftItem;
        this.binding.d.R = true;
        this.giftAmount = Double.valueOf(amount);
        this.binding.X.setVisibility(8);
        this.binding.b0.setVisibility(8);
        v720 v720Var = this.binding;
        if (betPlaced) {
            v720Var.c0.setVisibility(8);
            this.binding.E.setVisibility(8);
            this.binding.R.setVisibility(8);
            this.binding.b.getLayoutParams().width = -2;
        } else {
            v720Var.E.setVisibility(0);
            this.binding.R.setVisibility(0);
            this.binding.b.getLayoutParams().width = 0;
        }
        this.binding.H.setVisibility(0);
        setDisableContainer();
        this.binding.i.setBackground(getContext().getDrawable(R.drawable.card_bet_gift));
        this.binding.b.setText(String.valueOf(amount));
        TextView textView = this.binding.Z;
        Context context = getContext();
        if (context == null || (string = context.getString(R.string.place_bet_text_sh)) == null) {
            strB = null;
        } else {
            op5 op5Var = op5.a;
            String string2 = getContext().getString(R.string.place_bet_cms);
            string2.getClass();
            op5Var.getClass();
            strB = op5.b(string2, string, null);
        }
        op5 op5Var2 = op5.a;
        DetailResponse detailResponse = this.P;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        String currency = detailResponse.getCurrency();
        op5Var2.getClass();
        String strI = op5.i(currency);
        CharSequence text = this.binding.b.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append("\n");
        sb.append(strI);
        sb.append(" ");
        sb.append((Object) text);
        zug.b(sb, "?", textView);
        this.binding.J.setVisibility(8);
        this.binding.L.setVisibility(8);
        this.binding.N.setVisibility(8);
        this.binding.P.setVisibility(8);
    }

    public final void setFBGRemoveListener(final Function0<Unit> removeFBGListener) {
        removeFBGListener.getClass();
        gr60.a(this.binding.E, new Function1() { // from class: wq80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ShBetContainer shBetContainer = this.a;
                Function0 function0 = removeFBGListener;
                int i = ShBetContainer.S;
                ((View) obj).getClass();
                try {
                    if (!shBetContainer.betPlacedV2 && !shBetContainer.autoBetPlace) {
                        op5.a.getClass();
                        String str = op5.c;
                        if (str == null) {
                            str = "";
                        }
                        wz.a("FBGRemoved", krh0.e(str), new String[0]);
                        shBetContainer.c();
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

    public final void setOnBetChipSelected(Function1<? super Integer, Unit> function1) {
        function1.getClass();
        this.onBetChipSelected = function1;
    }

    public final void setOnBetChipSelectedListener(Function1<? super Integer, Unit> listener) {
        listener.getClass();
        setOnBetChipSelected(listener);
    }

    public final void setPoint() {
        if (d() || StringsKt.M(this.binding.z.getText().toString(), ".", false)) {
            return;
        }
        this.J = true;
        TextView textView = this.binding.z;
        textView.setText(textView.getText().toString());
    }

    public final void setRoundId(long j) {
        this.roundId = j;
    }

    public final void setUserInputAmount(double d) {
        this.userInputAmount = d;
    }

    public final void setautoBetListener(final Function1<? super Boolean, Unit> autoBetListener, final Function1<? super Boolean, Unit> autoDialogShow, Function0<Boolean> isNotLoggedIn, Function0<Unit> openLoginDialog) {
        autoBetListener.getClass();
        autoDialogShow.getClass();
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        this.binding.d.setLoginListeners(isNotLoggedIn, openLoginDialog);
        this.binding.d.setOnStateChange(new Function1() { // from class: yq80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer numValueOf = Integer.valueOf(R.color.warn_toast);
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                ShBetContainer shBetContainer = this.a;
                boolean z = shBetContainer.L;
                if ((!z || (z && tr80.a(shBetContainer.binding.z) >= Double.parseDouble("1.01"))) && shBetContainer.giftItem == null) {
                    if (yju.a(Chyeyik.YDvqs) && zBooleanValue) {
                        autoDialogShow.invoke(bool);
                        return Unit.a;
                    }
                    shBetContainer.binding.d.setStatus(zBooleanValue);
                    shBetContainer.a();
                    autoBetListener.invoke(bool);
                    shBetContainer.autoBetPlace = zBooleanValue;
                } else {
                    GiftItem giftItem = shBetContainer.giftItem;
                    boolean z2 = shBetContainer.L;
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
                        shBetContainer.getAutoCashoutListener().invoke(Boolean.valueOf(z2), op5.b(string3, string4, null), numValueOf);
                        shBetContainer.binding.d.setStatus(false);
                    } else {
                        shBetContainer.binding.d.setStatus(false);
                    }
                }
                return Unit.a;
            }
        });
    }

    public final void setautoCashoutListener(final gaj<? super Boolean, ? super String, ? super Integer, Unit> autoCashoutListener) {
        autoCashoutListener.getClass();
        setAutoCashoutListener(autoCashoutListener);
        this.binding.f.setOnStateChange(new Function1() { // from class: gr80
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
                    shBetContainer.L = zBooleanValue;
                    gajVar.invoke(bool, "", 0);
                    v720 v720Var = shBetContainer.binding;
                    if (zBooleanValue) {
                        v720Var.C.setVisibility(0);
                    } else {
                        v720Var.C.setVisibility(8);
                    }
                }
                return Unit.a;
            }
        });
    }

    public final void setbetAmount(final Function0<Unit> cashoutAmount) {
        cashoutAmount.getClass();
        gr60.a(this.binding.b, new Function1() { // from class: rr80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = ShBetContainer.S;
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
            DetailResponse detailResponse = this.P;
            if (detailResponse != null) {
                double maxPayoutAmount = detailResponse.getMaxPayoutAmount() / Double.parseDouble(this.binding.b.getText().toString());
                if (amount > maxPayoutAmount) {
                    amount = maxPayoutAmount;
                }
                DecimalFormat decimalFormat = new DecimalFormat("0.##", SportyGamesManager.decimalFormatSymbols);
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                this.binding.z.setText(decimalFormat.format(amount));
                String str = decimalFormat.format(amount);
                str.getClass();
                this.cashoutCoeff = Double.parseDouble(str);
                return;
            }
            Intrinsics.n("gameDetailResponse");
            throw null;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShBetContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
