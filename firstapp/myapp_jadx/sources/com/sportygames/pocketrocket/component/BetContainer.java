package com.sportygames.pocketrocket.component;

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
import androidx.window.layout.oKr.TEFcJcMqR;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.pocketrocket.component.BetContainer;
import com.sportygames.pocketrocket.model.response.DetailResponse;
import defpackage.ajc;
import defpackage.bmy;
import defpackage.cl2;
import defpackage.dl2;
import defpackage.el2;
import defpackage.fl2;
import defpackage.gaj;
import defpackage.gr60;
import defpackage.h5e;
import defpackage.il2;
import defpackage.nk2;
import defpackage.op5;
import defpackage.pl2;
import defpackage.pw;
import defpackage.rl2;
import defpackage.tr80;
import defpackage.un20;
import defpackage.zug;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\t\n\u0002\b.\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JG\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\r\u0010\u001a\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\r¢\u0006\u0004\b\u001c\u0010\u001bJ\r\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001d\u0010\u001bJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001bJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010\u001bJ=\u0010$\u001a\u00020\r2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b$\u0010%J!\u0010'\u001a\u00020\r2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u00020\r2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b*\u0010+J%\u00100\u001a\u00020\r2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0017¢\u0006\u0004\b0\u00101J!\u00103\u001a\u00020\r2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b3\u0010(J=\u00105\u001a\u00020\r2\u0012\u00104\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b5\u0010%J!\u00107\u001a\u00020\r2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r0\u000f¢\u0006\u0004\b7\u0010(J\u001b\u00109\u001a\u00020\r2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b9\u0010+JQ\u0010<\u001a\u00020\r2\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u000f2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\u000f2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b<\u0010=J/\u0010@\u001a\u00020\r2 \u0010?\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0>¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\r¢\u0006\u0004\bB\u0010\u001bJ\u001d\u0010D\u001a\u00020\r2\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\bD\u0010+R\"\u0010L\u001a\u00020E8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010-\u001a\u0004\u0018\u00010,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR$\u0010/\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010.\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010Z\u001a\u0004\b`\u0010\\\"\u0004\ba\u0010^R\"\u0010h\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010\u0019R\"\u0010l\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bi\u0010Z\u001a\u0004\bj\u0010\\\"\u0004\bk\u0010^R\"\u0010p\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010Z\u001a\u0004\bn\u0010\\\"\u0004\bo\u0010^R\"\u0010t\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bq\u0010Z\u001a\u0004\br\u0010\\\"\u0004\bs\u0010^R\"\u0010{\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bd\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR\"\u0010\u007f\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010v\u001a\u0004\b}\u0010x\"\u0004\b~\u0010zR&\u0010\u0083\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010d\u001a\u0005\b\u0081\u0001\u0010f\"\u0005\b\u0082\u0001\u0010\u0019R&\u0010\u0087\u0001\u001a\u00020u8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010v\u001a\u0005\b\u0085\u0001\u0010x\"\u0005\b\u0086\u0001\u0010zR&\u0010\u008b\u0001\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010d\u001a\u0005\b\u0089\u0001\u0010f\"\u0005\b\u008a\u0001\u0010\u0019RA\u0010?\u001a\u001c\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010 \u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0>8\u0006@\u0006X\u0086.¢\u0006\u0017\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0005\b\u0090\u0001\u0010AR(\u0010\u0096\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0005\b\u0095\u0001\u0010\u0016R(\u0010\u009a\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u0097\u0001\u0010\u0092\u0001\u001a\u0006\b\u0098\u0001\u0010\u0094\u0001\"\u0005\b\u0099\u0001\u0010\u0016R(\u0010\u009e\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009b\u0001\u0010\u0092\u0001\u001a\u0006\b\u009c\u0001\u0010\u0094\u0001\"\u0005\b\u009d\u0001\u0010\u0016R(\u0010¢\u0001\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010\u0092\u0001\u001a\u0006\b \u0001\u0010\u0094\u0001\"\u0005\b¡\u0001\u0010\u0016¨\u0006£\u0001"}, d2 = {"Lcom/sportygames/pocketrocket/component/BetContainer;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/sportygames/pocketrocket/model/response/DetailResponse;", "gameDetailResponse", "", "isFBGEnable", "Lkotlin/Function0;", "", "onClick", "Lkotlin/Function1;", "", "onChipClick", "setBetModel", "(Lcom/sportygames/pocketrocket/model/response/DetailResponse;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "number", "setCashoutAmount", "(I)V", "", "amount", "(D)V", "setPoint", "()V", "setDoubleZero", "setClear", "setCross", "setDone", "", "betListener", "isNotLoggedIn", "openLoginDialog", "setBetListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "cashoutListener", "setCashoutListener", "(Lkotlin/jvm/functions/Function1;)V", "removeFBGListener", "setFBGRemoveListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/sportygames/commons/models/GiftItem;", "giftItem", "betPlaced", "giftAmount", "setFBG", "(Lcom/sportygames/commons/models/GiftItem;ZD)V", "betStepListener", "setBetStepListener", "confirmBetListener", "setConfirmBetListener", "cancelBetListener", "setCancelBetListener", "cashoutAmount", "setAutoCashoutAmount", "autoBetListener", "autoDialogShow", "setautoBetListener", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function3;", "autoCashoutListener", "setautoCashoutListener", "(Lgaj;)V", "setDisableContainer", "fbgIconVisibility", "setEnableContainer", "Lnk2;", "a", "Lnk2;", "getBinding", "()Lnk2;", "setBinding", "(Lnk2;)V", "binding", "f", "Lcom/sportygames/commons/models/GiftItem;", "getGiftItem", "()Lcom/sportygames/commons/models/GiftItem;", "setGiftItem", "(Lcom/sportygames/commons/models/GiftItem;)V", "i", "Ljava/lang/Double;", "getGiftAmount", "()Ljava/lang/Double;", "setGiftAmount", "(Ljava/lang/Double;)V", "w", "Z", "getBetPlaced", "()Z", "setBetPlaced", "(Z)V", "y", "getAutoBetPlace", "setAutoBetPlace", "autoBetPlace", "z", "D", "getBetAmount", "()D", "setBetAmount", "betAmount", "A", "getBetInProgress", "setBetInProgress", "betInProgress", "B", "getCashoutDone", "setCashoutDone", "cashoutDone", "C", "getCashoutInProgress", "setCashoutInProgress", "cashoutInProgress", "", "J", "getRoundId", "()J", "setRoundId", "(J)V", "roundId", "E", "getFbgRoundId", "setFbgRoundId", "fbgRoundId", "F", "getCashoutCoeff", "setCashoutCoeff", "cashoutCoeff", "G", "getBetId", "setBetId", "betId", "H", "getUserInputAmount", "setUserInputAmount", "userInputAmount", "L", "Lgaj;", "getAutoCashoutListener", "()Lgaj;", "setAutoCashoutListener", "N", "I", "getHintAmount1Click", "()I", "setHintAmount1Click", "hintAmount1Click", "O", "getHintAmount2Click", "setHintAmount2Click", "hintAmount2Click", "P", "getHintAmount3Click", "setHintAmount3Click", "hintAmount3Click", "Q", "getHintAmount4Click", "setHintAmount4Click", "hintAmount4Click", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BetContainer extends LinearLayout {
    public static final /* synthetic */ int R = 0;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public boolean betInProgress;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public boolean cashoutDone;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public boolean cashoutInProgress;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public long roundId;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public long fbgRoundId;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public double cashoutCoeff;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public long betId;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public double userInputAmount;
    public boolean I;
    public boolean J;
    public boolean K;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public gaj<? super Boolean, ? super String, ? super Integer, Unit> autoCashoutListener;
    public DetailResponse M;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public int hintAmount1Click;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public int hintAmount2Click;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int hintAmount3Click;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public int hintAmount4Click;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public nk2 binding;
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
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            float f;
            if (i3 >= 4) {
                f = 15.0f - i3;
                if (f < 10.0f) {
                    f = 10.0f;
                }
            } else {
                f = 12.0f;
            }
            BetContainer.this.getBinding().b.setTextSize(f);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.bet_component, (ViewGroup) this, false);
        addView(viewInflate);
        int i = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i = R.id.auto_bet_text;
            TextView textView2 = (TextView) h5e.a(R.id.auto_bet_text, viewInflate);
            if (textView2 != null) {
                i = R.id.auto_bet_toggle;
                PRBetToggle pRBetToggle = (PRBetToggle) h5e.a(R.id.auto_bet_toggle, viewInflate);
                if (pRBetToggle != null) {
                    i = R.id.auto_cashout_text;
                    TextView textView3 = (TextView) h5e.a(R.id.auto_cashout_text, viewInflate);
                    if (textView3 != null) {
                        i = R.id.auto_cashout_toggle;
                        PRBetToggle pRBetToggle2 = (PRBetToggle) h5e.a(R.id.auto_cashout_toggle, viewInflate);
                        if (pRBetToggle2 != null) {
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
                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) viewInflate;
                                            i = R.id.cashout_amount;
                                            TextView textView5 = (TextView) h5e.a(R.id.cashout_amount, viewInflate);
                                            if (textView5 != null) {
                                                i = R.id.cashout_button;
                                                TextView textView6 = (TextView) h5e.a(R.id.cashout_button, viewInflate);
                                                if (textView6 != null) {
                                                    i = R.id.cashout_layout;
                                                    RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.cashout_layout, viewInflate);
                                                    if (relativeLayout != null) {
                                                        i = R.id.cross;
                                                        if (((TextView) h5e.a(R.id.cross, viewInflate)) != null) {
                                                            i = R.id.cross_bet;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.cross_bet, viewInflate);
                                                            if (constraintLayout4 != null) {
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
                                                                                                                i = R.id.margin_1;
                                                                                                                View viewA2 = h5e.a(R.id.margin_1, viewInflate);
                                                                                                                if (viewA2 != null) {
                                                                                                                    i = R.id.margin_2;
                                                                                                                    View viewA3 = h5e.a(R.id.margin_2, viewInflate);
                                                                                                                    if (viewA3 != null) {
                                                                                                                        i = R.id.max;
                                                                                                                        TextView textView15 = (TextView) h5e.a(R.id.max, viewInflate);
                                                                                                                        if (textView15 != null) {
                                                                                                                            i = R.id.max_text;
                                                                                                                            TextView textView16 = (TextView) h5e.a(R.id.max_text, viewInflate);
                                                                                                                            if (textView16 != null) {
                                                                                                                                i = R.id.min;
                                                                                                                                TextView textView17 = (TextView) h5e.a(R.id.min, viewInflate);
                                                                                                                                if (textView17 != null) {
                                                                                                                                    i = R.id.min_text;
                                                                                                                                    TextView textView18 = (TextView) h5e.a(R.id.min_text, viewInflate);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        i = R.id.minus;
                                                                                                                                        ImageView imageView4 = (ImageView) h5e.a(R.id.minus, viewInflate);
                                                                                                                                        if (imageView4 != null) {
                                                                                                                                            i = R.id.minus_layout;
                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.minus_layout, viewInflate)) != null) {
                                                                                                                                                i = R.id.place_bet;
                                                                                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.place_bet, viewInflate);
                                                                                                                                                if (constraintLayout5 != null) {
                                                                                                                                                    i = R.id.place_bet_text;
                                                                                                                                                    TextView textView19 = (TextView) h5e.a(R.id.place_bet_text, viewInflate);
                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                        i = R.id.place_bet_text_layout;
                                                                                                                                                        CardView cardView = (CardView) h5e.a(R.id.place_bet_text_layout, viewInflate);
                                                                                                                                                        if (cardView != null) {
                                                                                                                                                            i = R.id.plus;
                                                                                                                                                            ImageView imageView5 = (ImageView) h5e.a(R.id.plus, viewInflate);
                                                                                                                                                            if (imageView5 != null) {
                                                                                                                                                                i = R.id.plus_layout;
                                                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.plus_layout, viewInflate);
                                                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                                                    i = R.id.progress;
                                                                                                                                                                    if (((ConstraintLayout) h5e.a(R.id.progress, viewInflate)) != null) {
                                                                                                                                                                        i = R.id.rocket_name;
                                                                                                                                                                        TextView textView20 = (TextView) h5e.a(R.id.rocket_name, viewInflate);
                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                            i = R.id.tv_minus_multi;
                                                                                                                                                                            ImageView imageView6 = (ImageView) h5e.a(R.id.tv_minus_multi, viewInflate);
                                                                                                                                                                            if (imageView6 != null) {
                                                                                                                                                                                i = R.id.tv_plus_multi;
                                                                                                                                                                                ImageView imageView7 = (ImageView) h5e.a(R.id.tv_plus_multi, viewInflate);
                                                                                                                                                                                if (imageView7 != null) {
                                                                                                                                                                                    i = R.id.view7;
                                                                                                                                                                                    View viewA4 = h5e.a(R.id.view7, viewInflate);
                                                                                                                                                                                    if (viewA4 != null) {
                                                                                                                                                                                        i = R.id.view8;
                                                                                                                                                                                        View viewA5 = h5e.a(R.id.view8, viewInflate);
                                                                                                                                                                                        if (viewA5 != null) {
                                                                                                                                                                                            i = R.id.view_be11;
                                                                                                                                                                                            View viewA6 = h5e.a(R.id.view_be11, viewInflate);
                                                                                                                                                                                            if (viewA6 != null) {
                                                                                                                                                                                                i = R.id.view_bet;
                                                                                                                                                                                                View viewA7 = h5e.a(R.id.view_bet, viewInflate);
                                                                                                                                                                                                if (viewA7 != null) {
                                                                                                                                                                                                    i = R.id.view_bet10;
                                                                                                                                                                                                    View viewA8 = h5e.a(R.id.view_bet10, viewInflate);
                                                                                                                                                                                                    if (viewA8 != null) {
                                                                                                                                                                                                        i = R.id.view_bet2;
                                                                                                                                                                                                        View viewA9 = h5e.a(R.id.view_bet2, viewInflate);
                                                                                                                                                                                                        if (viewA9 != null) {
                                                                                                                                                                                                            i = R.id.view_bet4;
                                                                                                                                                                                                            View viewA10 = h5e.a(R.id.view_bet4, viewInflate);
                                                                                                                                                                                                            if (viewA10 != null) {
                                                                                                                                                                                                                i = R.id.view_bet5;
                                                                                                                                                                                                                View viewA11 = h5e.a(R.id.view_bet5, viewInflate);
                                                                                                                                                                                                                if (viewA11 != null) {
                                                                                                                                                                                                                    i = R.id.view_bet8;
                                                                                                                                                                                                                    View viewA12 = h5e.a(R.id.view_bet8, viewInflate);
                                                                                                                                                                                                                    if (viewA12 != null) {
                                                                                                                                                                                                                        i = R.id.view_bet9;
                                                                                                                                                                                                                        View viewA13 = h5e.a(R.id.view_bet9, viewInflate);
                                                                                                                                                                                                                        if (viewA13 != null) {
                                                                                                                                                                                                                            i = R.id.waiting;
                                                                                                                                                                                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.waiting, viewInflate);
                                                                                                                                                                                                                            if (appCompatTextView != null) {
                                                                                                                                                                                                                                i = R.id.waiting_button;
                                                                                                                                                                                                                                ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.waiting_button, viewInflate);
                                                                                                                                                                                                                                if (constraintLayout7 != null) {
                                                                                                                                                                                                                                    this.binding = new nk2(constraintLayout3, textView, textView2, pRBetToggle, textView3, pRBetToggle2, constraintLayout, constraintLayout2, textView4, constraintLayout3, textView5, textView6, relativeLayout, constraintLayout4, imageView, viewA, imageView2, imageView3, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, viewA2, viewA3, textView15, textView16, textView17, textView18, imageView4, constraintLayout5, textView19, cardView, imageView5, constraintLayout6, textView20, imageView6, imageView7, viewA4, viewA5, viewA6, viewA7, viewA8, viewA9, viewA10, viewA11, viewA12, viewA13, appCompatTextView, constraintLayout7);
                                                                                                                                                                                                                                    this.hintAmount1Click = 1;
                                                                                                                                                                                                                                    this.hintAmount2Click = 2;
                                                                                                                                                                                                                                    this.hintAmount3Click = 3;
                                                                                                                                                                                                                                    this.hintAmount4Click = 4;
                                                                                                                                                                                                                                    pRBetToggle.H = 1;
                                                                                                                                                                                                                                    this.v = un20.a(context);
                                                                                                                                                                                                                                    if (Build.VERSION.SDK_INT <= 25) {
                                                                                                                                                                                                                                        this.binding.w.setTextSize(14.0f);
                                                                                                                                                                                                                                        this.binding.c.setTextSize(7.5f);
                                                                                                                                                                                                                                        this.binding.e.setTextSize(7.5f);
                                                                                                                                                                                                                                        this.binding.X.setTextSize(12.0f);
                                                                                                                                                                                                                                        this.binding.b.setTextSize(12.5f);
                                                                                                                                                                                                                                        this.binding.b0.setTextSize(12.0f);
                                                                                                                                                                                                                                        this.binding.b.addTextChangedListener(new a());
                                                                                                                                                                                                                                        return;
                                                                                                                                                                                                                                    }
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setBetModel$default(BetContainer betContainer, DetailResponse detailResponse, boolean z, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            function0 = new dl2();
        }
        if ((i & 8) != 0) {
            function1 = new el2(0);
        }
        betContainer.setBetModel(detailResponse, z, function0, function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setEnableContainer$default(BetContainer betContainer, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new fl2(0);
        }
        betContainer.setEnableContainer(function0);
    }

    public final void a() {
        this.binding.I.setVisibility(8);
        this.binding.K.setVisibility(8);
        this.binding.M.setVisibility(8);
        this.binding.O.setVisibility(8);
    }

    public final void c() {
        String strB;
        String string;
        this.giftItem = null;
        this.giftAmount = null;
        this.fbgRoundId = 0L;
        setEnableContainer$default(this, null, 1, null);
        TextView textView = this.binding.b;
        TreeMap treeMap = pw.a;
        textView.setText(pw.n(this.userInputAmount));
        this.binding.V.setVisibility(0);
        this.binding.Z.setVisibility(0);
        this.binding.b.setAlpha(1.0f);
        this.binding.G.setAlpha(1.0f);
        this.binding.a0.setVisibility(0);
        this.binding.D.setVisibility(8);
        this.binding.Z.setVisibility(0);
        this.binding.d0.setVisibility(0);
        this.binding.G.setVisibility(8);
        this.binding.V.setVisibility(0);
        this.binding.c0.setVisibility(0);
        this.binding.P.setVisibility(0);
        this.binding.b.getLayoutParams().width = 0;
        this.binding.i.setBackground(getContext().getDrawable(R.drawable.card_bet_amount));
        TextView textView2 = this.binding.X;
        StringBuilder sb = new StringBuilder();
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
        sb.append(strB);
        sb.append(" ");
        op5 op5Var2 = op5.a;
        DetailResponse detailResponse = this.M;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        String currency = detailResponse.getCurrency();
        if (currency == null) {
            currency = "";
        }
        op5Var2.getClass();
        sb.append(op5.i(currency));
        sb.append(" ");
        sb.append(this.binding.b.getText().toString());
        sb.append("?");
        textView2.setText(sb.toString());
        double dA = tr80.a(this.binding.b);
        DetailResponse detailResponse2 = this.M;
        if (detailResponse2 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double stepAmount = dA - detailResponse2.getStepAmount();
        DetailResponse detailResponse3 = this.M;
        if (detailResponse3 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double minAmount = detailResponse3.getMinAmount();
        nk2 nk2Var = this.binding;
        if (stepAmount < minAmount) {
            nk2Var.V.setClickable(false);
            this.binding.c0.setAlpha(0.5f);
        } else {
            nk2Var.V.setClickable(true);
            this.binding.c0.setAlpha(1.0f);
        }
        double dA2 = tr80.a(this.binding.b);
        DetailResponse detailResponse4 = this.M;
        if (detailResponse4 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double stepAmount2 = detailResponse4.getStepAmount() + dA2;
        DetailResponse detailResponse5 = this.M;
        if (detailResponse5 == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double maxAmount = detailResponse5.getMaxAmount();
        nk2 nk2Var2 = this.binding;
        if (stepAmount2 > maxAmount) {
            nk2Var2.Z.setClickable(false);
            this.binding.d0.setAlpha(0.5f);
        } else {
            nk2Var2.Z.setClickable(true);
            this.binding.d0.setAlpha(1.0f);
        }
    }

    public final boolean d() {
        Integer numValueOf = Integer.valueOf(R.color.warn_toast);
        if (this.betPlaced) {
            gaj<Boolean, String, Integer, Unit> autoCashoutListener = getAutoCashoutListener();
            Boolean boolValueOf = Boolean.valueOf(this.K);
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
        Boolean boolValueOf2 = Boolean.valueOf(this.K);
        op5 op5Var2 = op5.a;
        String string3 = getContext().getString(R.string.turn_off_auto_bet_cms);
        string3.getClass();
        String string4 = getContext().getString(R.string.turn_off);
        string4.getClass();
        autoCashoutListener2.invoke(boolValueOf2, op5.c(op5Var2, string3, string4), numValueOf);
        return true;
    }

    public final void e() {
        this.binding.I.setVisibility(8);
        this.binding.K.setVisibility(8);
        this.binding.M.setVisibility(8);
        this.binding.O.setVisibility(8);
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

    public final nk2 getBinding() {
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

    public final long getFbgRoundId() {
        return this.fbgRoundId;
    }

    public final Double getGiftAmount() {
        return this.giftAmount;
    }

    public final GiftItem getGiftItem() {
        return this.giftItem;
    }

    public final int getHintAmount1Click() {
        return this.hintAmount1Click;
    }

    public final int getHintAmount2Click() {
        return this.hintAmount2Click;
    }

    public final int getHintAmount3Click() {
        return this.hintAmount3Click;
    }

    public final int getHintAmount4Click() {
        return this.hintAmount4Click;
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

    public final void setAutoCashoutAmount(Function0<Unit> cashoutAmount) {
        cashoutAmount.getClass();
        gr60.a(this.binding.B, new cl2(0, this, cashoutAmount));
    }

    public final void setAutoCashoutListener(gaj<? super Boolean, ? super String, ? super Integer, Unit> gajVar) {
        gajVar.getClass();
        this.autoCashoutListener = gajVar;
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

    public final void setBetListener(final Function1<? super String, Unit> betListener, final Function0<Boolean> isNotLoggedIn, final Function0<Unit> openLoginDialog) {
        betListener.getClass();
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        gr60.a(this.binding.v, new Function1() { // from class: gl2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = BetContainer.R;
                ((View) obj).getClass();
                if (((Boolean) isNotLoggedIn.invoke()).booleanValue()) {
                    openLoginDialog.invoke();
                } else {
                    BetContainer betContainer = this;
                    betContainer.a();
                    betListener.invoke(betContainer.binding.b.getText().toString());
                }
                return Unit.a;
            }
        });
    }

    public final void setBetModel(final DetailResponse gameDetailResponse, final boolean isFBGEnable, Function0<Unit> onClick, final Function1<? super Integer, Unit> onChipClick) {
        String upperCase;
        String string;
        gameDetailResponse.getClass();
        onClick.getClass();
        onChipClick.getClass();
        String currency = gameDetailResponse.getCurrency();
        String strB = null;
        if (currency != null) {
            upperCase = currency.toUpperCase(Locale.ROOT);
            upperCase.getClass();
        } else {
            upperCase = null;
        }
        gameDetailResponse.setCurrency(upperCase);
        this.M = gameDetailResponse;
        int i = 0;
        this.binding.y.setVisibility(0);
        TextView textView = this.binding.T;
        Context context = getContext();
        double minAmount = gameDetailResponse.getMinAmount();
        TreeMap treeMap = pw.a;
        textView.setText(context.getString(R.string.colon_amount, pw.n(minAmount)));
        this.binding.R.setText(getContext().getString(R.string.colon_amount, pw.n(gameDetailResponse.getMaxAmount())));
        if (this.giftItem == null) {
            double d = this.userInputAmount;
            if (d <= 0.0d || d < gameDetailResponse.getMinAmount()) {
                this.binding.b.setText(pw.n(gameDetailResponse.getDefaultAmount()));
                this.userInputAmount = tr80.a(this.binding.b);
            } else {
                this.binding.b.setText(pw.n(this.userInputAmount));
                this.userInputAmount = tr80.a(this.binding.b);
            }
        }
        this.binding.b0.setText(gameDetailResponse.getRocketType());
        String rocketType = gameDetailResponse.getRocketType();
        if (Intrinsics.g(rocketType, "RED")) {
            this.binding.b0.setTextColor(getContext().getColor(R.color.red_color));
            this.binding.b0.setTag(getContext().getString(R.string.red_rocket_cms));
            op5.r(op5.a, b.f(this.binding.b0), null, 4);
        } else {
            boolean zG = Intrinsics.g(rocketType, "PURPLE");
            nk2 nk2Var = this.binding;
            if (zG) {
                nk2Var.b0.setTextColor(getContext().getColor(R.color.purple_color));
                this.binding.b0.setTag(getContext().getString(R.string.purple_rocket_cms));
                op5.r(op5.a, b.f(this.binding.b0), null, 4);
            } else {
                nk2Var.b0.setTextColor(getContext().getColor(R.color.blue_color));
                this.binding.b0.setTag(getContext().getString(R.string.blue_rocket_cms));
                op5.r(op5.a, b.f(this.binding.b0), null, 4);
            }
        }
        TextView textView2 = this.binding.X;
        Context context2 = getContext();
        if (context2 != null && (string = context2.getString(R.string.place_bet_text_sh)) != null) {
            String string2 = getContext().getString(R.string.place_bet_cms);
            string2.getClass();
            strB = op5.b(string2, string, null);
        }
        String currency2 = gameDetailResponse.getCurrency();
        if (currency2 == null) {
            currency2 = "";
        }
        String strI = op5.i(currency2);
        CharSequence text = this.binding.b.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(strB);
        sb.append(" ");
        sb.append(strI);
        sb.append(" ");
        sb.append((Object) text);
        zug.b(sb, "?", textView2);
        nk2 nk2Var2 = this.binding;
        if (isFBGEnable) {
            gr60.a(nk2Var2.F, new il2(i, this, onClick));
            if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                this.binding.H.setBackground(getContext().getDrawable(R.drawable.pr_br_hint));
            }
            this.binding.F.setVisibility(0);
            this.binding.H.setText("");
            this.binding.I.setText("");
            ajc.a((Number) rl2.a(gameDetailResponse, 0), this.binding.J);
            ajc.a((Number) rl2.a(gameDetailResponse, 1), this.binding.L);
            ajc.a((Number) rl2.a(gameDetailResponse, 2), this.binding.N);
            ajc.a((Number) rl2.a(gameDetailResponse, 0), this.binding.K);
            ajc.a((Number) rl2.a(gameDetailResponse, 1), this.binding.M);
            ajc.a((Number) rl2.a(gameDetailResponse, 2), this.binding.O);
        } else {
            nk2Var2.F.setVisibility(8);
            ajc.a((Number) rl2.a(gameDetailResponse, 0), this.binding.H);
            ajc.a((Number) rl2.a(gameDetailResponse, 1), this.binding.J);
            ajc.a((Number) rl2.a(gameDetailResponse, 2), this.binding.L);
            ajc.a((Number) rl2.a(gameDetailResponse, 3), this.binding.N);
            ajc.a((Number) rl2.a(gameDetailResponse, 0), this.binding.I);
            ajc.a((Number) rl2.a(gameDetailResponse, 1), this.binding.K);
            ajc.a((Number) rl2.a(gameDetailResponse, 2), this.binding.M);
            ajc.a((Number) rl2.a(gameDetailResponse, 3), this.binding.O);
        }
        CharSequence text2 = this.binding.z.getText();
        text2.getClass();
        if (text2.length() == 0) {
            this.binding.z.setText("5");
            this.cashoutCoeff = Double.parseDouble("5");
        }
        double dA = tr80.a(this.binding.b) - gameDetailResponse.getStepAmount();
        double minAmount2 = gameDetailResponse.getMinAmount();
        nk2 nk2Var3 = this.binding;
        if (dA < minAmount2) {
            nk2Var3.V.setClickable(false);
            this.binding.c0.setAlpha(0.5f);
        } else {
            nk2Var3.V.setClickable(true);
            this.binding.c0.setAlpha(1.0f);
        }
        this.binding.H.setOnClickListener(new View.OnClickListener() { // from class: jl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string3;
                BetContainer betContainer = this.a;
                if (betContainer.betPlaced || betContainer.betInProgress || betContainer.autoBetPlace || isFBGEnable) {
                    return;
                }
                boolean z = betContainer.b;
                DetailResponse detailResponse = gameDetailResponse;
                if (z) {
                    double dA2 = ql2.a(betContainer.binding.b, detailResponse.getDefaultChips().get(0).doubleValue());
                    if (dA2 >= detailResponse.getMinAmount() && dA2 <= detailResponse.getMaxAmount()) {
                        TextView textView3 = betContainer.binding.b;
                        TreeMap treeMap2 = pw.a;
                        textView3.setText(pw.n(dA2));
                    }
                    betContainer.binding.I.setVisibility(0);
                } else {
                    TextView textView4 = betContainer.binding.b;
                    TreeMap treeMap3 = pw.a;
                    textView4.setText(pw.n(((Number) rl2.a(detailResponse, 0)).doubleValue()));
                    betContainer.b = true;
                    betContainer.c = false;
                    betContainer.d = false;
                    betContainer.e = false;
                    betContainer.binding.I.setVisibility(0);
                    betContainer.binding.K.setVisibility(8);
                    betContainer.binding.M.setVisibility(8);
                    betContainer.binding.O.setVisibility(8);
                }
                onChipClick.invoke(Integer.valueOf(betContainer.hintAmount1Click));
                double dA3 = tr80.a(betContainer.binding.b) - detailResponse.getStepAmount();
                double minAmount3 = detailResponse.getMinAmount();
                nk2 nk2Var4 = betContainer.binding;
                if (dA3 < minAmount3) {
                    nk2Var4.V.setClickable(false);
                    betContainer.binding.c0.setAlpha(0.5f);
                } else {
                    nk2Var4.V.setClickable(true);
                    betContainer.binding.c0.setAlpha(1.0f);
                }
                double stepAmount = detailResponse.getStepAmount() + tr80.a(betContainer.binding.b);
                double maxAmount = detailResponse.getMaxAmount();
                nk2 nk2Var5 = betContainer.binding;
                if (stepAmount > maxAmount) {
                    nk2Var5.Z.setClickable(false);
                    betContainer.binding.d0.setAlpha(0.5f);
                } else {
                    nk2Var5.Z.setClickable(true);
                    betContainer.binding.d0.setAlpha(1.0f);
                }
                TextView textView5 = betContainer.binding.X;
                Context context3 = betContainer.getContext();
                String strB2 = null;
                if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                    op5 op5Var = op5.a;
                    String string4 = betContainer.getContext().getString(R.string.place_bet_cms);
                    string4.getClass();
                    op5Var.getClass();
                    strB2 = op5.b(string4, string3, null);
                }
                op5 op5Var2 = op5.a;
                String currency3 = detailResponse.getCurrency();
                if (currency3 == null) {
                    currency3 = "";
                }
                op5Var2.getClass();
                String strI2 = op5.i(currency3);
                CharSequence text3 = betContainer.binding.b.getText();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strB2);
                sb2.append(" ");
                sb2.append(strI2);
                sb2.append(" ");
                sb2.append((Object) text3);
                zug.b(sb2, "?", textView5);
                betContainer.setCashoutAmount(Double.parseDouble(betContainer.binding.z.getText().toString()));
                if (tr80.a(betContainer.binding.z) < Double.parseDouble("1.01")) {
                    betContainer.binding.z.setText("1.01");
                    betContainer.cashoutCoeff = Double.parseDouble("5");
                }
                betContainer.userInputAmount = tr80.a(betContainer.binding.b);
            }
        });
        this.binding.J.setOnClickListener(new View.OnClickListener() { // from class: kl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strN;
                String string3;
                double dDoubleValue;
                TextView textView3;
                BetContainer betContainer = this.a;
                if (betContainer.betPlaced || betContainer.betInProgress || betContainer.autoBetPlace) {
                    return;
                }
                boolean z = betContainer.c;
                boolean z2 = isFBGEnable;
                DetailResponse detailResponse = gameDetailResponse;
                if (z) {
                    if (z2) {
                        dDoubleValue = detailResponse.getDefaultChips().get(0).doubleValue();
                        textView3 = betContainer.binding.b;
                    } else {
                        dDoubleValue = detailResponse.getDefaultChips().get(1).doubleValue();
                        textView3 = betContainer.binding.b;
                    }
                    double dA2 = ql2.a(textView3, dDoubleValue);
                    if (dA2 >= detailResponse.getMinAmount() && dA2 <= detailResponse.getMaxAmount()) {
                        TextView textView4 = betContainer.binding.b;
                        TreeMap treeMap2 = pw.a;
                        textView4.setText(pw.n(dA2));
                    }
                    betContainer.binding.K.setVisibility(0);
                } else {
                    TextView textView5 = betContainer.binding.b;
                    if (z2) {
                        TreeMap treeMap3 = pw.a;
                        strN = pw.n(((Number) rl2.a(detailResponse, 0)).doubleValue());
                    } else {
                        TreeMap treeMap4 = pw.a;
                        strN = pw.n(((Number) rl2.a(detailResponse, 1)).doubleValue());
                    }
                    textView5.setText(strN);
                    betContainer.b = false;
                    betContainer.c = true;
                    betContainer.d = false;
                    betContainer.e = false;
                    betContainer.binding.I.setVisibility(8);
                    betContainer.binding.K.setVisibility(0);
                    betContainer.binding.M.setVisibility(8);
                    betContainer.binding.O.setVisibility(8);
                }
                Function1 function1 = onChipClick;
                if (z2) {
                    function1.invoke(Integer.valueOf(betContainer.hintAmount1Click));
                } else {
                    function1.invoke(Integer.valueOf(betContainer.hintAmount2Click));
                }
                double dA3 = tr80.a(betContainer.binding.b) - detailResponse.getStepAmount();
                double minAmount3 = detailResponse.getMinAmount();
                nk2 nk2Var4 = betContainer.binding;
                if (dA3 < minAmount3) {
                    nk2Var4.V.setClickable(false);
                    betContainer.binding.c0.setAlpha(0.5f);
                } else {
                    nk2Var4.V.setClickable(true);
                    betContainer.binding.c0.setAlpha(1.0f);
                }
                double stepAmount = detailResponse.getStepAmount() + tr80.a(betContainer.binding.b);
                double maxAmount = detailResponse.getMaxAmount();
                nk2 nk2Var5 = betContainer.binding;
                if (stepAmount > maxAmount) {
                    nk2Var5.Z.setClickable(false);
                    betContainer.binding.d0.setAlpha(0.5f);
                } else {
                    nk2Var5.Z.setClickable(true);
                    betContainer.binding.d0.setAlpha(1.0f);
                }
                TextView textView6 = betContainer.binding.X;
                Context context3 = betContainer.getContext();
                String strB2 = null;
                if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                    op5 op5Var = op5.a;
                    String string4 = betContainer.getContext().getString(R.string.place_bet_cms);
                    string4.getClass();
                    op5Var.getClass();
                    strB2 = op5.b(string4, string3, null);
                }
                op5 op5Var2 = op5.a;
                String currency3 = detailResponse.getCurrency();
                if (currency3 == null) {
                    currency3 = "";
                }
                op5Var2.getClass();
                String strI2 = op5.i(currency3);
                CharSequence text3 = betContainer.binding.b.getText();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strB2);
                String str = TEFcJcMqR.kyEXRuHjEXbc;
                sb2.append(str);
                sb2.append(strI2);
                sb2.append(str);
                sb2.append((Object) text3);
                zug.b(sb2, "?", textView6);
                betContainer.setCashoutAmount(Double.parseDouble(betContainer.binding.z.getText().toString()));
                if (tr80.a(betContainer.binding.z) < Double.parseDouble("1.01")) {
                    betContainer.binding.z.setText("1.01");
                    betContainer.cashoutCoeff = Double.parseDouble("5");
                }
                betContainer.userInputAmount = tr80.a(betContainer.binding.b);
            }
        });
        this.binding.L.setOnClickListener(new View.OnClickListener() { // from class: ll2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strN;
                String string3;
                double dDoubleValue;
                TextView textView3;
                BetContainer betContainer = this.a;
                if (betContainer.betPlaced || betContainer.betInProgress || betContainer.autoBetPlace) {
                    return;
                }
                boolean z = betContainer.d;
                boolean z2 = isFBGEnable;
                DetailResponse detailResponse = gameDetailResponse;
                if (z) {
                    if (z2) {
                        dDoubleValue = detailResponse.getDefaultChips().get(1).doubleValue();
                        textView3 = betContainer.binding.b;
                    } else {
                        dDoubleValue = detailResponse.getDefaultChips().get(2).doubleValue();
                        textView3 = betContainer.binding.b;
                    }
                    double dA2 = ql2.a(textView3, dDoubleValue);
                    if (dA2 >= detailResponse.getMinAmount() && dA2 <= detailResponse.getMaxAmount()) {
                        TextView textView4 = betContainer.binding.b;
                        TreeMap treeMap2 = pw.a;
                        textView4.setText(pw.n(dA2));
                    }
                    betContainer.binding.M.setVisibility(0);
                } else {
                    TextView textView5 = betContainer.binding.b;
                    if (z2) {
                        TreeMap treeMap3 = pw.a;
                        strN = pw.n(((Number) rl2.a(detailResponse, 1)).doubleValue());
                    } else {
                        TreeMap treeMap4 = pw.a;
                        strN = pw.n(((Number) rl2.a(detailResponse, 2)).doubleValue());
                    }
                    textView5.setText(strN);
                    betContainer.b = false;
                    betContainer.c = false;
                    betContainer.d = true;
                    betContainer.e = false;
                    betContainer.binding.I.setVisibility(8);
                    betContainer.binding.K.setVisibility(8);
                    betContainer.binding.M.setVisibility(0);
                    betContainer.binding.O.setVisibility(8);
                }
                Function1 function1 = onChipClick;
                if (z2) {
                    function1.invoke(Integer.valueOf(betContainer.hintAmount2Click));
                } else {
                    function1.invoke(Integer.valueOf(betContainer.hintAmount3Click));
                }
                double dA3 = tr80.a(betContainer.binding.b) - detailResponse.getStepAmount();
                double minAmount3 = detailResponse.getMinAmount();
                nk2 nk2Var4 = betContainer.binding;
                if (dA3 < minAmount3) {
                    nk2Var4.V.setClickable(false);
                    betContainer.binding.c0.setAlpha(0.5f);
                } else {
                    nk2Var4.V.setClickable(true);
                    betContainer.binding.c0.setAlpha(1.0f);
                }
                double stepAmount = detailResponse.getStepAmount() + tr80.a(betContainer.binding.b);
                double maxAmount = detailResponse.getMaxAmount();
                nk2 nk2Var5 = betContainer.binding;
                if (stepAmount > maxAmount) {
                    nk2Var5.Z.setClickable(false);
                    betContainer.binding.d0.setAlpha(0.5f);
                } else {
                    nk2Var5.Z.setClickable(true);
                    betContainer.binding.d0.setAlpha(1.0f);
                }
                TextView textView6 = betContainer.binding.X;
                Context context3 = betContainer.getContext();
                String strB2 = null;
                if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                    op5 op5Var = op5.a;
                    String string4 = betContainer.getContext().getString(R.string.place_bet_cms);
                    string4.getClass();
                    op5Var.getClass();
                    strB2 = op5.b(string4, string3, null);
                }
                op5 op5Var2 = op5.a;
                String currency3 = detailResponse.getCurrency();
                if (currency3 == null) {
                    currency3 = "";
                }
                op5Var2.getClass();
                String strI2 = op5.i(currency3);
                CharSequence text3 = betContainer.binding.b.getText();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strB2);
                sb2.append(" ");
                sb2.append(strI2);
                sb2.append(" ");
                sb2.append((Object) text3);
                zug.b(sb2, "?", textView6);
                betContainer.setCashoutAmount(Double.parseDouble(betContainer.binding.z.getText().toString()));
                if (tr80.a(betContainer.binding.z) < Double.parseDouble("1.01")) {
                    betContainer.binding.z.setText("1.01");
                    betContainer.cashoutCoeff = Double.parseDouble("1.01");
                }
                betContainer.userInputAmount = tr80.a(betContainer.binding.b);
            }
        });
        this.binding.N.setOnClickListener(new View.OnClickListener() { // from class: ml2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strN;
                String string3;
                double dDoubleValue;
                TextView textView3;
                BetContainer betContainer = this.a;
                if (betContainer.betPlaced || betContainer.betInProgress || betContainer.autoBetPlace) {
                    return;
                }
                boolean z = betContainer.e;
                boolean z2 = isFBGEnable;
                DetailResponse detailResponse = gameDetailResponse;
                if (z) {
                    if (z2) {
                        dDoubleValue = detailResponse.getDefaultChips().get(2).doubleValue();
                        textView3 = betContainer.binding.b;
                    } else {
                        dDoubleValue = detailResponse.getDefaultChips().get(3).doubleValue();
                        textView3 = betContainer.binding.b;
                    }
                    double dA2 = ql2.a(textView3, dDoubleValue);
                    if (dA2 >= detailResponse.getMinAmount() && dA2 <= detailResponse.getMaxAmount()) {
                        TextView textView4 = betContainer.binding.b;
                        TreeMap treeMap2 = pw.a;
                        textView4.setText(pw.n(dA2));
                    }
                    betContainer.binding.O.setVisibility(0);
                } else {
                    TextView textView5 = betContainer.binding.b;
                    if (z2) {
                        TreeMap treeMap3 = pw.a;
                        strN = pw.n(((Number) rl2.a(detailResponse, 2)).doubleValue());
                    } else {
                        TreeMap treeMap4 = pw.a;
                        strN = pw.n(((Number) rl2.a(detailResponse, 3)).doubleValue());
                    }
                    textView5.setText(strN);
                    betContainer.b = false;
                    betContainer.c = false;
                    betContainer.d = false;
                    betContainer.e = true;
                    betContainer.binding.I.setVisibility(8);
                    betContainer.binding.K.setVisibility(8);
                    betContainer.binding.M.setVisibility(8);
                    betContainer.binding.O.setVisibility(0);
                }
                Function1 function1 = onChipClick;
                if (z2) {
                    function1.invoke(Integer.valueOf(betContainer.hintAmount3Click));
                } else {
                    function1.invoke(Integer.valueOf(betContainer.hintAmount4Click));
                }
                double dA3 = tr80.a(betContainer.binding.b) - detailResponse.getStepAmount();
                double minAmount3 = detailResponse.getMinAmount();
                nk2 nk2Var4 = betContainer.binding;
                if (dA3 < minAmount3) {
                    nk2Var4.V.setClickable(false);
                    betContainer.binding.c0.setAlpha(0.5f);
                } else {
                    nk2Var4.V.setClickable(true);
                    betContainer.binding.c0.setAlpha(1.0f);
                }
                double stepAmount = detailResponse.getStepAmount() + tr80.a(betContainer.binding.b);
                double maxAmount = detailResponse.getMaxAmount();
                nk2 nk2Var5 = betContainer.binding;
                if (stepAmount > maxAmount) {
                    nk2Var5.Z.setClickable(false);
                    betContainer.binding.d0.setAlpha(0.5f);
                } else {
                    nk2Var5.Z.setClickable(true);
                    betContainer.binding.d0.setAlpha(1.0f);
                }
                TextView textView6 = betContainer.binding.X;
                Context context3 = betContainer.getContext();
                String strB2 = null;
                if (context3 != null && (string3 = context3.getString(R.string.place_bet_text_sh)) != null) {
                    op5 op5Var = op5.a;
                    String string4 = betContainer.getContext().getString(R.string.place_bet_cms);
                    string4.getClass();
                    op5Var.getClass();
                    strB2 = op5.b(string4, string3, null);
                }
                op5 op5Var2 = op5.a;
                String currency3 = detailResponse.getCurrency();
                if (currency3 == null) {
                    currency3 = "";
                }
                op5Var2.getClass();
                String strI2 = op5.i(currency3);
                CharSequence text3 = betContainer.binding.b.getText();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strB2);
                sb2.append(" ");
                sb2.append(strI2);
                sb2.append(" ");
                sb2.append((Object) text3);
                zug.b(sb2, "?", textView6);
                betContainer.setCashoutAmount(Double.parseDouble(betContainer.binding.z.getText().toString()));
                if (tr80.a(betContainer.binding.z) < Double.parseDouble("1.01")) {
                    betContainer.binding.z.setText("1.01");
                    betContainer.cashoutCoeff = Double.parseDouble("5");
                }
                betContainer.userInputAmount = tr80.a(betContainer.binding.b);
            }
        });
    }

    public final void setBetPlaced(boolean z) {
        this.betPlaced = z;
    }

    public final void setBetStepListener(final Function1<? super String, Unit> betStepListener) {
        betStepListener.getClass();
        this.binding.V.setOnClickListener(new View.OnClickListener() { // from class: nl2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strB;
                String string;
                BetContainer betContainer = this.a;
                if (betContainer.betPlaced || betContainer.betInProgress || betContainer.autoBetPlace || betContainer.M == null) {
                    return;
                }
                double dA = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse = betContainer.M;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA <= detailResponse.getMinAmount()) {
                    return;
                }
                double dA2 = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse2 = betContainer.M;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double stepAmount = dA2 - detailResponse2.getStepAmount();
                DetailResponse detailResponse3 = betContainer.M;
                if (detailResponse3 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (stepAmount <= detailResponse3.getMinAmount()) {
                    DetailResponse detailResponse4 = betContainer.M;
                    if (detailResponse4 == null) {
                        Intrinsics.n("gameDetailResponse");
                        throw null;
                    }
                    stepAmount = detailResponse4.getMinAmount();
                }
                TextView textView = betContainer.binding.b;
                TreeMap treeMap = pw.a;
                textView.setText(pw.n(stepAmount));
                double dA3 = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse5 = betContainer.M;
                if (detailResponse5 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double minAmount = detailResponse5.getMinAmount();
                nk2 nk2Var = betContainer.binding;
                if (dA3 <= minAmount) {
                    nk2Var.V.setClickable(false);
                    betContainer.binding.c0.setAlpha(0.5f);
                } else {
                    nk2Var.V.setClickable(true);
                    betContainer.binding.c0.setAlpha(1.0f);
                }
                double dA4 = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse6 = betContainer.M;
                if (detailResponse6 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double stepAmount2 = detailResponse6.getStepAmount() + dA4;
                DetailResponse detailResponse7 = betContainer.M;
                if (detailResponse7 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double maxAmount = detailResponse7.getMaxAmount();
                nk2 nk2Var2 = betContainer.binding;
                if (stepAmount2 > maxAmount) {
                    nk2Var2.Z.setClickable(false);
                    betContainer.binding.d0.setAlpha(0.5f);
                } else {
                    nk2Var2.Z.setClickable(true);
                    betContainer.binding.d0.setAlpha(1.0f);
                }
                TextView textView2 = betContainer.binding.X;
                StringBuilder sb = new StringBuilder();
                Context context = betContainer.getContext();
                if (context == null || (string = context.getString(R.string.place_bet_text_sh)) == null) {
                    strB = null;
                } else {
                    op5 op5Var = op5.a;
                    String string2 = betContainer.getContext().getString(R.string.place_bet_cms);
                    string2.getClass();
                    op5Var.getClass();
                    strB = op5.b(string2, string, null);
                }
                sb.append(strB);
                sb.append(" ");
                op5 op5Var2 = op5.a;
                DetailResponse detailResponse8 = betContainer.M;
                if (detailResponse8 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                String currency = detailResponse8.getCurrency();
                if (currency == null) {
                    currency = "";
                }
                op5Var2.getClass();
                sb.append(op5.i(currency));
                sb.append(" ");
                sb.append(betContainer.binding.b.getText().toString());
                sb.append("?");
                textView2.setText(sb.toString());
                if (betContainer.K) {
                    betContainer.setCashoutAmount(Double.parseDouble(betContainer.binding.z.getText().toString()));
                }
                if (tr80.a(betContainer.binding.z) < Double.parseDouble("1.01")) {
                    betContainer.binding.z.setText("1.01");
                    betContainer.cashoutCoeff = Double.parseDouble("1.01");
                }
                betContainer.userInputAmount = tr80.a(betContainer.binding.b);
                betStepListener.invoke("minus");
            }
        });
        this.binding.Z.setOnClickListener(new View.OnClickListener() { // from class: ol2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strB;
                String string;
                BetContainer betContainer = this.a;
                if (betContainer.betPlaced || betContainer.betInProgress || betContainer.autoBetPlace || betContainer.M == null) {
                    return;
                }
                double dA = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse = betContainer.M;
                if (detailResponse == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                if (dA >= detailResponse.getMaxAmount()) {
                    return;
                }
                TextView textView = betContainer.binding.b;
                TreeMap treeMap = pw.a;
                double dA2 = tr80.a(textView);
                DetailResponse detailResponse2 = betContainer.M;
                if (detailResponse2 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                textView.setText(pw.n(detailResponse2.getStepAmount() + dA2));
                double dA3 = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse3 = betContainer.M;
                if (detailResponse3 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double stepAmount = dA3 - detailResponse3.getStepAmount();
                DetailResponse detailResponse4 = betContainer.M;
                if (detailResponse4 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double minAmount = detailResponse4.getMinAmount();
                nk2 nk2Var = betContainer.binding;
                if (stepAmount < minAmount) {
                    nk2Var.V.setClickable(false);
                    betContainer.binding.c0.setAlpha(0.5f);
                } else {
                    nk2Var.V.setClickable(true);
                    betContainer.binding.c0.setAlpha(1.0f);
                }
                double dA4 = tr80.a(betContainer.binding.b);
                DetailResponse detailResponse5 = betContainer.M;
                if (detailResponse5 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double stepAmount2 = detailResponse5.getStepAmount() + dA4;
                DetailResponse detailResponse6 = betContainer.M;
                if (detailResponse6 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                double maxAmount = detailResponse6.getMaxAmount();
                nk2 nk2Var2 = betContainer.binding;
                if (stepAmount2 > maxAmount) {
                    nk2Var2.Z.setClickable(false);
                    betContainer.binding.d0.setAlpha(0.5f);
                } else {
                    nk2Var2.Z.setClickable(true);
                    betContainer.binding.d0.setAlpha(1.0f);
                }
                TextView textView2 = betContainer.binding.X;
                StringBuilder sb = new StringBuilder();
                Context context = betContainer.getContext();
                if (context == null || (string = context.getString(R.string.place_bet_text_sh)) == null) {
                    strB = null;
                } else {
                    op5 op5Var = op5.a;
                    String string2 = betContainer.getContext().getString(R.string.place_bet_cms);
                    string2.getClass();
                    op5Var.getClass();
                    strB = op5.b(string2, string, null);
                }
                sb.append(strB);
                sb.append(" ");
                op5 op5Var2 = op5.a;
                DetailResponse detailResponse7 = betContainer.M;
                if (detailResponse7 == null) {
                    Intrinsics.n("gameDetailResponse");
                    throw null;
                }
                String currency = detailResponse7.getCurrency();
                if (currency == null) {
                    currency = "";
                }
                op5Var2.getClass();
                sb.append(op5.i(currency));
                sb.append(" ");
                sb.append(betContainer.binding.b.getText().toString());
                sb.append(lobGSRIlnSGJY.fYBgRtXHMSvHu);
                textView2.setText(sb.toString());
                if (betContainer.K) {
                    betContainer.setCashoutAmount(Double.parseDouble(betContainer.binding.z.getText().toString()));
                }
                betContainer.userInputAmount = tr80.a(betContainer.binding.b);
                betStepListener.invoke("plus");
            }
        });
    }

    public final void setBinding(nk2 nk2Var) {
        nk2Var.getClass();
        this.binding = nk2Var;
    }

    public final void setCancelBetListener(final Function1<? super String, Unit> cancelBetListener) {
        cancelBetListener.getClass();
        gr60.a(this.binding.C, new Function1(this) { // from class: bl2
            public final /* synthetic */ BetContainer b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = BetContainer.R;
                ((View) obj).getClass();
                cancelBetListener.invoke(this.b.binding.b.getText().toString());
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
            boolean z = this.I;
            nk2 nk2Var = this.binding;
            if (!z) {
                CharSequence text2 = nk2Var.z.getText();
                StringBuilder sb = new StringBuilder();
                sb.append((Object) text2);
                sb.append(number);
                d = Double.parseDouble(sb.toString());
            } else {
                if (number == 0) {
                    this.binding.z.setText(((Object) nk2Var.z.getText()) + ".0");
                    this.I = false;
                    return;
                }
                StringBuilder sb2 = new StringBuilder(((Object) nk2Var.z.getText()) + ".");
                sb2.append(number);
                d = Double.parseDouble(b(sb2.toString()));
                this.I = false;
            }
        } else if (this.I) {
            d = ((double) number) / 10.0d;
            this.I = false;
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

    public final void setCashoutDone(boolean z) {
        this.cashoutDone = z;
    }

    public final void setCashoutInProgress(boolean z) {
        this.cashoutInProgress = z;
    }

    public final void setCashoutListener(final Function1<? super String, Unit> cashoutListener) {
        cashoutListener.getClass();
        gr60.a(this.binding.A, new Function1() { // from class: hl2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = BetContainer.R;
                ((View) obj).getClass();
                BetContainer betContainer = this.a;
                betContainer.a();
                cashoutListener.invoke(betContainer.binding.b.getText().toString());
                return Unit.a;
            }
        });
    }

    public final void setClear() {
        if (!d()) {
            this.I = false;
            this.binding.z.setText("0");
            this.cashoutCoeff = 0.0d;
        }
        f();
    }

    public final void setConfirmBetListener(final Function1<? super String, Unit> confirmBetListener, final Function0<Boolean> isNotLoggedIn, final Function0<Unit> openLoginDialog) {
        confirmBetListener.getClass();
        isNotLoggedIn.getClass();
        openLoginDialog.getClass();
        gr60.a(this.binding.W, new Function1() { // from class: xk2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = BetContainer.R;
                ((View) obj).getClass();
                if (((Boolean) isNotLoggedIn.invoke()).booleanValue()) {
                    openLoginDialog.invoke();
                } else {
                    BetContainer betContainer = this;
                    betContainer.a();
                    confirmBetListener.invoke(betContainer.binding.b.getText().toString());
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
            String strA = pl2.a(this.binding.z, 1, this.binding.z.getText().toString(), 0);
            if (strA.length() <= 0) {
                this.binding.z.setText("0");
                this.cashoutCoeff = 0.0d;
            } else if (Intrinsics.g(String.valueOf(strA.charAt(strA.length() - 1)), ".")) {
                this.I = false;
                strA = strA.substring(0, strA.length() - 1);
            }
            int length = strA.length();
            nk2 nk2Var = this.binding;
            if (length > 0) {
                nk2Var.z.setText(strA);
                this.cashoutCoeff = Double.parseDouble(strA);
            } else {
                nk2Var.z.setText("0");
                this.cashoutCoeff = 0.0d;
            }
        }
        f();
    }

    public final void setDisableContainer() {
        this.J = true;
        this.binding.V.setClickable(false);
        this.binding.c0.setAlpha(0.5f);
        this.binding.Z.setClickable(false);
        this.binding.d0.setAlpha(0.5f);
        if (this.giftItem == null) {
            this.binding.b.setAlpha(0.5f);
        }
        if (this.giftItem != null && this.betPlaced) {
            this.binding.b.setAlpha(0.5f);
            this.binding.G.setAlpha(0.5f);
        }
        this.binding.b.setClickable(false);
        this.binding.H.setClickable(false);
        this.binding.H.setEnabled(false);
        this.binding.H.setAlpha(0.5f);
        this.binding.J.setClickable(false);
        this.binding.J.setEnabled(false);
        this.binding.J.setAlpha(0.5f);
        this.binding.L.setClickable(false);
        this.binding.L.setEnabled(false);
        this.binding.L.setAlpha(0.5f);
        this.binding.N.setClickable(false);
        this.binding.N.setEnabled(false);
        this.binding.N.setAlpha(0.5f);
        this.binding.F.setAlpha(0.3f);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0037  */
    public final void setDone() {
        if (d()) {
            return;
        }
        String string = this.binding.z.getText().toString();
        CharSequence text = this.binding.z.getText();
        text.getClass();
        if (text.length() == 0) {
            this.binding.v.setClickable(true);
            this.binding.v.setAlpha(1.0f);
            this.binding.z.setText("1.01");
            this.cashoutCoeff = Double.parseDouble("1.01");
        } else {
            double d = this.cashoutCoeff;
            if (d != 0.0d && d >= Double.parseDouble("1.01")) {
                TextView textView = this.binding.z;
                TreeMap treeMap = pw.a;
                textView.setText(pw.n(Double.parseDouble(string)));
            } else {
                this.binding.v.setClickable(true);
                this.binding.v.setAlpha(1.0f);
                this.binding.z.setText("1.01");
                this.cashoutCoeff = Double.parseDouble("1.01");
            }
        }
        this.I = false;
        f();
    }

    public final void setDoubleZero() {
        String str;
        if (d()) {
            return;
        }
        boolean z = this.I;
        nk2 nk2Var = this.binding;
        if (z) {
            str = ((Object) nk2Var.z.getText()) + ".00";
        } else {
            str = ((Object) nk2Var.z.getText()) + CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS;
        }
        String strB = b(str);
        if (strB.length() <= 0) {
            this.binding.z.setText("0");
            this.cashoutCoeff = 0.0d;
            return;
        }
        double d = Double.parseDouble(strB);
        DetailResponse detailResponse = this.M;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        double maxPayoutAmount = detailResponse.getMaxPayoutAmount();
        DetailResponse detailResponse2 = this.M;
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

    public final void setEnableContainer(Function0<Unit> fbgIconVisibility) {
        fbgIconVisibility.getClass();
        if (!this.J || this.giftItem != null) {
            return;
        }
        try {
            double d = Double.parseDouble(this.binding.b.getText().toString());
            DetailResponse detailResponse = this.M;
            if (detailResponse == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            double stepAmount = d - detailResponse.getStepAmount();
            DetailResponse detailResponse2 = this.M;
            if (detailResponse2 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            if (stepAmount >= detailResponse2.getMinAmount()) {
                this.binding.V.setClickable(true);
                this.binding.c0.setAlpha(1.0f);
            }
            double d2 = Double.parseDouble(this.binding.b.getText().toString());
            DetailResponse detailResponse3 = this.M;
            if (detailResponse3 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            double stepAmount2 = d2 + detailResponse3.getStepAmount();
            DetailResponse detailResponse4 = this.M;
            if (detailResponse4 == null) {
                Intrinsics.n("gameDetailResponse");
                throw null;
            }
            if (stepAmount2 <= detailResponse4.getMaxAmount()) {
                this.binding.Z.setClickable(true);
                this.binding.d0.setAlpha(1.0f);
            }
            this.binding.b.setClickable(true);
            this.binding.b.setAlpha(1.0f);
            this.binding.G.setAlpha(1.0f);
            this.binding.H.setClickable(true);
            this.binding.H.setAlpha(1.0f);
            this.binding.H.setEnabled(true);
            this.binding.J.setClickable(true);
            this.binding.J.setAlpha(1.0f);
            this.binding.J.setEnabled(true);
            this.binding.L.setClickable(true);
            this.binding.L.setAlpha(1.0f);
            this.binding.L.setEnabled(true);
            this.binding.N.setClickable(true);
            this.binding.N.setAlpha(1.0f);
            this.binding.N.setEnabled(true);
            fbgIconVisibility.invoke();
            this.J = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setFBG(GiftItem giftItem, boolean betPlaced, double giftAmount) {
        String strB;
        String string;
        giftItem.getClass();
        this.giftItem = giftItem;
        this.giftAmount = Double.valueOf(giftAmount);
        this.binding.V.setVisibility(8);
        this.binding.Z.setVisibility(8);
        nk2 nk2Var = this.binding;
        if (betPlaced) {
            nk2Var.a0.setVisibility(8);
            this.binding.D.setVisibility(8);
            this.binding.Z.setVisibility(0);
            this.binding.d0.setVisibility(0);
            this.binding.P.setVisibility(8);
            this.binding.b.getLayoutParams().width = -2;
        } else {
            nk2Var.D.setVisibility(0);
            this.binding.Z.setVisibility(8);
            this.binding.d0.setVisibility(8);
            this.binding.P.setVisibility(0);
            this.binding.b.getLayoutParams().width = 0;
        }
        this.binding.G.setVisibility(0);
        this.binding.V.setVisibility(8);
        this.binding.c0.setVisibility(8);
        setDisableContainer();
        this.binding.i.setBackground(getContext().getDrawable(R.drawable.card_bet_gift));
        TextView textView = this.binding.b;
        TreeMap treeMap = pw.a;
        textView.setText(pw.n(giftAmount));
        TextView textView2 = this.binding.X;
        StringBuilder sb = new StringBuilder();
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
        sb.append(strB);
        sb.append(" ");
        op5 op5Var2 = op5.a;
        DetailResponse detailResponse = this.M;
        if (detailResponse == null) {
            Intrinsics.n("gameDetailResponse");
            throw null;
        }
        String currency = detailResponse.getCurrency();
        if (currency == null) {
            currency = "";
        }
        op5Var2.getClass();
        sb.append(op5.i(currency));
        sb.append(" ");
        sb.append(this.binding.b.getText().toString());
        sb.append("?");
        textView2.setText(sb.toString());
        this.binding.I.setVisibility(8);
        this.binding.K.setVisibility(8);
        this.binding.M.setVisibility(8);
        this.binding.O.setVisibility(8);
    }

    public final void setFBGRemoveListener(final Function0<Unit> removeFBGListener) {
        removeFBGListener.getClass();
        gr60.a(this.binding.D, new Function1() { // from class: al2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i = BetContainer.R;
                ((View) obj).getClass();
                this.a.c();
                removeFBGListener.invoke();
                return Unit.a;
            }
        });
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

    public final void setHintAmount1Click(int i) {
        this.hintAmount1Click = i;
    }

    public final void setHintAmount2Click(int i) {
        this.hintAmount2Click = i;
    }

    public final void setHintAmount3Click(int i) {
        this.hintAmount3Click = i;
    }

    public final void setHintAmount4Click(int i) {
        this.hintAmount4Click = i;
    }

    public final void setPoint() {
        if (d() || StringsKt.M(this.binding.z.getText().toString(), ".", false)) {
            return;
        }
        this.I = true;
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
        this.binding.d.setOnStateChange(new Function1() { // from class: yk2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Integer numValueOf = Integer.valueOf(R.color.warn_toast);
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                BetContainer betContainer = this.a;
                boolean z = betContainer.K;
                if ((z && (!z || tr80.a(betContainer.binding.z) < Double.parseDouble("1.01"))) || betContainer.giftItem != null) {
                    GiftItem giftItem = betContainer.giftItem;
                    boolean z2 = betContainer.K;
                    if (giftItem != null) {
                        op5 op5Var = op5.a;
                        String string = betContainer.getContext().getString(R.string.fbg_auto_bet_warning_cms);
                        string.getClass();
                        String string2 = betContainer.getContext().getString(R.string.enable_auto_bet_fbg);
                        string2.getClass();
                        op5Var.getClass();
                        betContainer.getAutoCashoutListener().invoke(Boolean.valueOf(z2), op5.b(string, string2, null), numValueOf);
                        betContainer.binding.d.setStatus(false);
                    } else if (z2) {
                        op5 op5Var2 = op5.a;
                        String string3 = betContainer.getContext().getString(R.string.auto_cashout_greater_one_cms);
                        string3.getClass();
                        String string4 = betContainer.getContext().getString(R.string.auto_cashout_min_error);
                        string4.getClass();
                        op5Var2.getClass();
                        betContainer.getAutoCashoutListener().invoke(Boolean.valueOf(z2), op5.b(string3, string4, null), numValueOf);
                        betContainer.binding.d.setStatus(false);
                    } else {
                        betContainer.binding.d.setStatus(false);
                    }
                } else {
                    if (yju.a("br") && zBooleanValue) {
                        autoDialogShow.invoke(bool);
                        return Unit.a;
                    }
                    betContainer.binding.d.setStatus(zBooleanValue);
                    betContainer.a();
                    autoBetListener.invoke(bool);
                    betContainer.autoBetPlace = zBooleanValue;
                }
                return Unit.a;
            }
        });
    }

    public final void setautoCashoutListener(final gaj<? super Boolean, ? super String, ? super Integer, Unit> autoCashoutListener) {
        autoCashoutListener.getClass();
        setAutoCashoutListener(autoCashoutListener);
        this.binding.f.setOnStateChange(new Function1() { // from class: zk2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Integer numValueOf = Integer.valueOf(R.color.warn_toast);
                BetContainer betContainer = this.a;
                boolean z = betContainer.autoBetPlace;
                gaj gajVar = autoCashoutListener;
                if (z && betContainer.betPlaced) {
                    op5 op5Var = op5.a;
                    String string = betContainer.getContext().getString(R.string.modify_auto_cash_out_message_cms);
                    string.getClass();
                    String string2 = betContainer.getContext().getString(R.string.turn_off);
                    string2.getClass();
                    op5Var.getClass();
                    gajVar.invoke(bool, op5.b(string, string2, null), numValueOf);
                } else if (betContainer.betPlaced) {
                    op5 op5Var2 = op5.a;
                    String string3 = betContainer.getContext().getString(R.string.turn_on_off_auto_cashout_cms);
                    string3.getClass();
                    String string4 = betContainer.getContext().getString(R.string.auto_cashout_on_off);
                    string4.getClass();
                    gajVar.invoke(bool, op5.c(op5Var2, string3, string4), numValueOf);
                } else {
                    betContainer.binding.f.setStatus(zBooleanValue);
                    betContainer.K = zBooleanValue;
                    gajVar.invoke(bool, "", 0);
                    nk2 nk2Var = betContainer.binding;
                    if (zBooleanValue) {
                        nk2Var.B.setVisibility(0);
                    } else {
                        nk2Var.B.setVisibility(8);
                    }
                }
                return Unit.a;
            }
        });
    }

    public final void f() {
        try {
            double d = Double.parseDouble(this.binding.z.getText().toString());
            double d2 = Double.parseDouble(ACKxwYRsuWyGz.xIZAOjsO);
            nk2 nk2Var = this.binding;
            if (d < d2) {
                nk2Var.v.setClickable(false);
                this.binding.v.setAlpha(0.65f);
                this.binding.d.setAlpha(0.65f);
                if (this.binding.W.getVisibility() == 0) {
                    this.binding.W.setClickable(false);
                    this.binding.W.setAlpha(0.65f);
                    return;
                }
                return;
            }
            nk2Var.v.setClickable(true);
            this.binding.v.setAlpha(1.0f);
            SharedPreferences sharedPreferences = this.v;
            if (sharedPreferences != null && sharedPreferences.getBoolean("ROCKET_ONE_TAP", true)) {
                this.binding.d.setAlpha(1.0f);
            }
            this.binding.W.setClickable(true);
            this.binding.W.setAlpha(1.0f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void setCashoutAmount(double amount) {
        try {
            DetailResponse detailResponse = this.M;
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BetContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
