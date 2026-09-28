package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.DisplayMetrics;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.android.material.navigation.NavigationView;
import com.sporty.android.platform.features.userfeedback.TM.jbkEboCkTqmGf;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.BetBoxContainer;
import com.sportygames.commons.components.BetChipContainer;
import com.sportygames.commons.components.ChipSlider;
import com.sportygames.commons.components.GameHeader;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGConfirmDialogActivity;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.commons.views.ExitDialogActivity;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.evenodd.components.RoundResult;
import com.sportygames.evenodd.remote.models.ChatRoomResponse;
import com.sportygames.evenodd.remote.models.DetailResponse;
import com.sportygames.evenodd.remote.models.GameAvailableResponse;
import com.sportygames.evenodd.remote.models.PlaceBetRequest;
import com.sportygames.evenodd.remote.models.PlaceBetResponse;
import com.sportygames.evenodd.remote.models.UserValidateResponse;
import com.sportygames.evenodd.remote.models.WalletInfo;
import com.sportygames.lobby.remote.models.GameDetails;
import com.twilio.voice.EventKeys;
import fgg.b;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import nl.dionsegijn.konfetti.xml.KonfettiView;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00042\u00020\u00062\u00020\u0004B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lfgg;", "Ll12;", "Lbo1;", "Ljhg;", "", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fgg extends l12<bo1, jhg> implements GameMainActivity.b, bb {
    public xi60 A;
    public mke A0;
    public z66 B0;
    public final q8i0 C;
    public boolean C0;
    public fo2 D;
    public final q8i0 D0;
    public Double E;
    public final q8i0 E0;
    public final q8i0 F;
    public boolean F0;
    public final q8i0 G;
    public boolean G0;
    public final q8i0 H;
    public bo1.b H0;
    public int I;
    public long I0;
    public boolean J;
    public final ee<Intent> J0;
    public double K;
    public double L;
    public double M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public String R;
    public LinkedHashSet<Integer> S;
    public LinkedHashSet<Integer> T;
    public List<String> U;
    public SharedPreferences.Editor V;
    public ArrayList<Double> W;
    public SharedPreferences X;
    public DetailResponse Y;
    public PromotionGiftsResponse Z;
    public PlaceBetResponse a0;
    public ppe b0;
    public boolean c;
    public mpe c0;
    public npe d0;
    public int e0;
    public int f;
    public boolean f0;
    public zh60 g0;
    public double h0;
    public GameDetails i;
    public double i0;
    public boolean j0;
    public double k0;
    public int l0;
    public final ema m0;
    public int n0;
    public int o0;
    public boolean p0;
    public ggg q0;
    public fq5 r0;
    public ArrayList<GameDetails> s0;
    public boolean t0;
    public final String u0;
    public final ArrayList<String> v0;
    public boolean w0;
    public boolean x0;
    public boolean y;
    public String y0;
    public xbg z;
    public nle z0;
    public String d = "";
    public String e = "";
    public String v = "";
    public String w = "";
    public String B = "";

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$evenOddAnimCompleteListener$1$1", f = "EvenOddFragment.kt", l = {2594}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgg.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:119:0x0678  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jhg jhgVar;
            double d;
            double d2;
            Object obj2;
            int i;
            jhg jhgVar2;
            String strD;
            AppCompatImageView redMark;
            y5b y5bVar = y5b.a;
            int i2 = this.a;
            int i3 = 1;
            if (i2 == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(200L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            fgg fggVar = fgg.this;
            jhg jhgVar3 = (jhg) fggVar.b;
            if (jhgVar3 != null) {
                jhgVar3.J.setBackImageVisible(0);
            }
            jhg jhgVar4 = (jhg) fggVar.b;
            if (jhgVar4 != null) {
                jhgVar4.D.setDrawerLockMode(0, 8388613);
            }
            jhg jhgVar5 = (jhg) fggVar.b;
            if (jhgVar5 != null) {
                jhgVar5.d0.setBalance(fggVar.B, fggVar.E);
            }
            Double d3 = fggVar.E;
            if ((d3 != null ? d3.doubleValue() : 0.0d) < fggVar.L) {
                jhg jhgVar6 = (jhg) fggVar.b;
                if (jhgVar6 != null && (redMark = jhgVar6.J.getRedMark()) != null) {
                    redMark.setVisibility(0);
                }
                fggVar.l0 = R.drawable.hamberger_add_more_red;
                jhg jhgVar7 = (jhg) fggVar.b;
                if (jhgVar7 != null) {
                    jhgVar7.M.F(R.drawable.hamberger_add_more_red);
                }
            }
            fggVar.O = false;
            double d4 = fggVar.k0;
            if (d4 < 0.0d) {
                jhg jhgVar8 = (jhg) fggVar.b;
                if (jhgVar8 != null) {
                    jhgVar8.d0.a(Math.abs(d4));
                }
            } else if (d4 > 0.0d && (jhgVar = (jhg) fggVar.b) != null) {
                jhgVar.d0.b(Math.abs(d4));
            }
            fggVar.S = new LinkedHashSet<>();
            int i4 = fggVar.e0;
            if (i4 == 1) {
                ypa0 ypa0VarD0 = fggVar.D0();
                String string = fggVar.getString(R.string.game_win);
                string.getClass();
                ypa0VarD0.A1(2000L, string);
            } else if (i4 == 3) {
                ypa0 ypa0VarD1 = fggVar.D0();
                String string2 = fggVar.getString(R.string.house_win);
                string2.getClass();
                ypa0VarD1.A1(2000L, string2);
            } else {
                ypa0 ypa0VarD2 = fggVar.D0();
                String string3 = fggVar.getString(R.string.game_lose);
                string3.getClass();
                ypa0VarD2.A1(2000L, string3);
            }
            PlaceBetResponse placeBetResponse = fggVar.a0;
            if (placeBetResponse == null || (jhgVar2 = (jhg) fggVar.b) == null) {
                i3 = 1;
                d = 0.0d;
                d2 = 1.0d;
                obj2 = null;
            } else {
                final RoundResult roundResult = jhgVar2.E;
                d2 = 1.0d;
                boolean zG = Intrinsics.g(placeBetResponse.getUserPick(), placeBetResponse.getHouseDrawDecision());
                khg khgVar = roundResult.binding;
                d = 0.0d;
                if (zG) {
                    khgVar.A.setText(String.valueOf(placeBetResponse.getHouseDrawSum()));
                    roundResult.binding.v.setVisibility(0);
                    roundResult.binding.e.setVisibility(4);
                    roundResult.binding.y.setVisibility(8);
                    roundResult.binding.E.setVisibility(8);
                    roundResult.binding.F.setVisibility(8);
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new uz50(null, roundResult, placeBetResponse), 3);
                    Double payoutAmount = placeBetResponse.getPayoutAmount();
                    payoutAmount.getClass();
                    if (payoutAmount.doubleValue() < 1.0d) {
                        String str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(placeBetResponse.getPayoutAmount().doubleValue());
                        str.getClass();
                        op5 op5Var = op5.a;
                        String currency = placeBetResponse.getCurrency();
                        op5Var.getClass();
                        String upperCase = op5.i(currency).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        roundResult.binding.G.setText(upperCase + " " + str);
                    }
                    roundResult.binding.z.setVisibility(0);
                    roundResult.binding.i.setVisibility(0);
                    roundResult.binding.f.setVisibility(8);
                    roundResult.binding.b.setVisibility(0);
                    if (Build.VERSION.SDK_INT <= 25) {
                        roundResult.binding.w.setTextSize(32.0f);
                        roundResult.binding.i.setTextSize(2, 20.0f);
                        roundResult.binding.G.setTextSize(2, 20.0f);
                        roundResult.binding.C.setTextSize(2, 20.0f);
                        roundResult.binding.A.setTextSize(2, 20.0f);
                    }
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    Drawable drawable = roundResult.getContext().getDrawable(R.drawable.sporty_trophy);
                    op5 op5Var2 = op5.a;
                    String string4 = roundResult.binding.i.getTag().toString();
                    String string5 = roundResult.getContext().getString(R.string.redblack_win_msg);
                    string5.getClass();
                    String strC = op5.c(op5Var2, string4, string5);
                    if (drawable != null) {
                        drawable.setBounds(0, 0, (roundResult.binding.i.getLineHeight() * 40) / 53, roundResult.binding.i.getLineHeight());
                    }
                    spannableStringBuilder.append((CharSequence) strC.concat("   "));
                    int color = roundResult.getContext().getColor(R.color.win_color);
                    String currency2 = placeBetResponse.getCurrency();
                    Locale locale = Locale.ROOT;
                    String upperCase2 = currency2.toUpperCase(locale);
                    upperCase2.getClass();
                    String strI = op5.i(upperCase2);
                    Double actualCreditedAmt = placeBetResponse.getActualCreditedAmt();
                    if (actualCreditedAmt != null) {
                        double dDoubleValue = actualCreditedAmt.doubleValue();
                        TreeMap treeMap = pw.a;
                        strD = pw.d(dDoubleValue);
                    } else {
                        strD = null;
                    }
                    StringBuilder sbA = uqe0.a(color, "<font color=", ">", strI, " ");
                    sbA.append(strD);
                    sbA.append("</font>");
                    spannableStringBuilder.append((CharSequence) Html.fromHtml(sbA.toString()));
                    spannableStringBuilder.setSpan(drawable != null ? new ImageSpan(drawable, 2) : null, strC.length() + 1, strC.length() + 2, 17);
                    roundResult.binding.i.setText(spannableStringBuilder);
                    TextView textView = roundResult.binding.w;
                    String upperCase3 = placeBetResponse.getHouseDrawDecision().toUpperCase(locale);
                    upperCase3.getClass();
                    textView.setText(upperCase3);
                    if (placeBetResponse.getGiftAmount() == null || placeBetResponse.getGiftAmount().doubleValue() <= 0.0d) {
                        roundResult.binding.e.setVisibility(4);
                    } else {
                        roundResult.binding.e.setVisibility(0);
                        TextView textView2 = roundResult.binding.D;
                        String upperCase4 = op5.i(placeBetResponse.getCurrency()).toUpperCase(locale);
                        upperCase4.getClass();
                        TreeMap treeMap2 = pw.a;
                        hu1.b(upperCase4, " ", pw.d(placeBetResponse.getPayoutAmount().doubleValue()), textView2);
                        TextView textView3 = roundResult.binding.d;
                        String upperCase5 = op5.i(placeBetResponse.getCurrency()).toUpperCase(locale);
                        upperCase5.getClass();
                        hu1.b(upperCase5, " ", pw.d(placeBetResponse.getGiftAmount().doubleValue()), textView3);
                        TextView textView4 = roundResult.binding.G;
                        String upperCase6 = op5.i(placeBetResponse.getCurrency()).toUpperCase(locale);
                        upperCase6.getClass();
                        Double actualCreditedAmt2 = placeBetResponse.getActualCreditedAmt();
                        hu1.b(upperCase6, " ", actualCreditedAmt2 != null ? pw.d(actualCreditedAmt2.doubleValue()) : null, textView4);
                    }
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(roundResult.getContext(), R.anim.animation_left);
                    animationLoadAnimation.getClass();
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(roundResult.getContext(), R.anim.animation_right);
                    animationLoadAnimation2.getClass();
                    roundResult.binding.z.startAnimation(animationLoadAnimation);
                    roundResult.binding.b.startAnimation(animationLoadAnimation2);
                    roundResult.getHandler().postDelayed(new Runnable() { // from class: pz50
                        @Override // java.lang.Runnable
                        public final void run() {
                            RoundResult roundResult2 = roundResult;
                            ViewGroup.LayoutParams layoutParams = roundResult2.binding.B.getLayoutParams();
                            layoutParams.getClass();
                            layoutParams.width = roundResult2.binding.B.getHeight();
                            roundResult2.binding.B.setLayoutParams(layoutParams);
                        }
                    }, 150L);
                    khg khgVar2 = roundResult.binding;
                    op5.r(op5Var2, kotlin.collections.b.f(khgVar2.w, khgVar2.C), null, 4);
                    obj2 = null;
                } else {
                    i3 = 1;
                    khgVar.A.setText(String.valueOf(placeBetResponse.getHouseDrawSum()));
                    roundResult.binding.v.setVisibility(0);
                    roundResult.binding.e.setVisibility(4);
                    roundResult.binding.y.setVisibility(0);
                    roundResult.binding.F.setVisibility(0);
                    pfd pfdVar2 = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new sz50(null, roundResult, placeBetResponse), 3);
                    roundResult.binding.H.setVisibility(8);
                    roundResult.binding.G.setVisibility(8);
                    roundResult.binding.z.setVisibility(8);
                    roundResult.binding.b.clearAnimation();
                    roundResult.binding.z.clearAnimation();
                    TextView textView5 = roundResult.binding.w;
                    String houseDrawDecision = placeBetResponse.getHouseDrawDecision();
                    Locale locale2 = Locale.ROOT;
                    String upperCase7 = houseDrawDecision.toUpperCase(locale2);
                    upperCase7.getClass();
                    textView5.setText(upperCase7);
                    roundResult.binding.e.setVisibility(4);
                    TextView textView6 = roundResult.binding.f;
                    Context context = roundResult.getContext();
                    String upperCase8 = placeBetResponse.getUserPick().toUpperCase(locale2);
                    upperCase8.getClass();
                    textView6.setText(context.getString(R.string.redblack_lost_msg, upperCase8));
                    if (Build.VERSION.SDK_INT <= 25) {
                        roundResult.binding.w.setTextSize(32.0f);
                    }
                    roundResult.binding.f.setVisibility(0);
                    roundResult.binding.i.setVisibility(8);
                    roundResult.binding.H.setVisibility(8);
                    roundResult.binding.G.setVisibility(8);
                    roundResult.binding.z.setVisibility(8);
                    roundResult.binding.b.setVisibility(8);
                    HashMap map = new HashMap();
                    String upperCase9 = placeBetResponse.getUserPick().toUpperCase(locale2);
                    upperCase9.getClass();
                    if (upperCase9.equals("ODD")) {
                        String string6 = roundResult.getContext().getString(R.string.pick_cms);
                        op5 op5Var3 = op5.a;
                        String string7 = roundResult.getContext().getString(R.string.odd_cms);
                        string7.getClass();
                        String userPick = placeBetResponse.getUserPick();
                        op5Var3.getClass();
                        map.put(string6, op5.b(string7, userPick, null));
                    } else {
                        String upperCase10 = placeBetResponse.getUserPick().toUpperCase(locale2);
                        upperCase10.getClass();
                        if (upperCase10.equals("EVEN")) {
                            String string8 = roundResult.getContext().getString(R.string.pick_cms);
                            op5 op5Var4 = op5.a;
                            String string9 = roundResult.getContext().getString(R.string.even_cms);
                            string9.getClass();
                            String userPick2 = placeBetResponse.getUserPick();
                            op5Var4.getClass();
                            obj2 = null;
                            map.put(string8, op5.b(string9, userPick2, null));
                        }
                        op5 op5Var5 = op5.a;
                        khg khgVar3 = roundResult.binding;
                        op5.r(op5Var5, kotlin.collections.b.f(khgVar3.f, khgVar3.w, khgVar3.C), map, 4);
                        ViewGroup.LayoutParams layoutParams = roundResult.binding.B.getLayoutParams();
                        layoutParams.getClass();
                        layoutParams.width = roundResult.binding.B.getHeight();
                        roundResult.binding.B.setLayoutParams(layoutParams);
                        roundResult.getHandler().postDelayed(new Runnable() { // from class: oz50
                            @Override // java.lang.Runnable
                            public final void run() {
                                RoundResult roundResult2 = roundResult;
                                ViewGroup.LayoutParams layoutParams2 = roundResult2.binding.B.getLayoutParams();
                                layoutParams2.getClass();
                                layoutParams2.width = roundResult2.binding.B.getHeight();
                                roundResult2.binding.B.setLayoutParams(layoutParams2);
                            }
                        }, 150L);
                    }
                    obj2 = null;
                    op5 op5Var6 = op5.a;
                    khg khgVar4 = roundResult.binding;
                    op5.r(op5Var6, kotlin.collections.b.f(khgVar4.f, khgVar4.w, khgVar4.C), map, 4);
                    ViewGroup.LayoutParams layoutParams2 = roundResult.binding.B.getLayoutParams();
                    layoutParams2.getClass();
                    layoutParams2.width = roundResult.binding.B.getHeight();
                    roundResult.binding.B.setLayoutParams(layoutParams2);
                    roundResult.getHandler().postDelayed(new Runnable() { // from class: oz50
                        @Override // java.lang.Runnable
                        public final void run() {
                            RoundResult roundResult2 = roundResult;
                            ViewGroup.LayoutParams layoutParams3 = roundResult2.binding.B.getLayoutParams();
                            layoutParams3.getClass();
                            layoutParams3.width = roundResult2.binding.B.getHeight();
                            roundResult2.binding.B.setLayoutParams(layoutParams3);
                        }
                    }, 150L);
                }
            }
            jhg jhgVar9 = (jhg) fggVar.b;
            if (jhgVar9 != null) {
                jhgVar9.w.setRenderMode(0);
            }
            jhg jhgVar10 = (jhg) fggVar.b;
            if (jhgVar10 != null) {
                jhgVar10.z.setRenderMode(0);
            }
            jhg jhgVar11 = (jhg) fggVar.b;
            if (jhgVar11 != null) {
                jhgVar11.y.setRenderMode(0);
            }
            if (fggVar.e0 == i3) {
                fggVar.requireActivity().getWindowManager().getDefaultDisplay().getMetrics(new DisplayMetrics());
                androidx.fragment.app.e activity = fggVar.getActivity();
                Object systemService = activity != null ? activity.getSystemService("vibrator") : obj2;
                systemService.getClass();
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 26) {
                    vibrator.vibrate(VibrationEffect.createOneShot(200L, -1));
                } else {
                    vibrator.vibrate(200L);
                }
                TimeUnit.SECONDS.getClass();
                x0g x0gVar = new x0g();
                x0gVar.a = 1000L;
                x0gVar.b = 0.005f;
                jhg jhgVar12 = (jhg) fggVar.b;
                if (jhgVar12 != null) {
                    KonfettiView konfettiView = jhgVar12.a0;
                    iuz iuzVar = new iuz(x0gVar);
                    iuzVar.a(-45);
                    iuzVar.f();
                    px80.d dVar = px80.d.a;
                    px80.a aVar = px80.a.a;
                    iuzVar.e(kotlin.collections.b.k(dVar, aVar));
                    iuzVar.b(kotlin.collections.b.k(new Integer(16777215), new Integer(16766720), new Integer(12632256), new Integer(16740285)));
                    iuzVar.d(60.0f);
                    i = 0;
                    iuzVar.c(new i620.c(d, 0.8d));
                    guz guzVar = iuzVar.a;
                    iuz iuzVar2 = new iuz(x0gVar);
                    iuzVar2.a(225);
                    iuzVar2.f();
                    iuzVar2.e(kotlin.collections.b.k(dVar, aVar));
                    iuzVar2.b(kotlin.collections.b.k(new Integer(16777215), new Integer(16766720), new Integer(12632256), new Integer(16740285)));
                    iuzVar2.d(60.0f);
                    iuzVar2.c(new i620.c(d2, 0.8d));
                    konfettiView.a(guzVar, iuzVar2.a);
                } else {
                    i = 0;
                }
            } else {
                i = 0;
            }
            if (!fggVar.Q) {
                jhg jhgVar13 = (jhg) fggVar.b;
                if (jhgVar13 != null) {
                    jhgVar13.E.setVisibility(i);
                }
                jhg jhgVar14 = (jhg) fggVar.b;
                if (jhgVar14 != null) {
                    jhgVar14.I.setVisibility(i);
                }
                boolean z = fggVar.F0;
                B b = fggVar.b;
                if (z) {
                    jhg jhgVar15 = (jhg) b;
                    if (jhgVar15 != null) {
                        jhgVar15.X.setVisibility(8);
                    }
                } else {
                    jhg jhgVar16 = (jhg) b;
                    if (jhgVar16 != null) {
                        jhgVar16.X.setVisibility(0);
                    }
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$onResume$1", f = "EvenOddFragment.kt", l = {2149, 2150}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: loaded from: classes2.dex */
        @c0d(c = "com.sportygames.evenodd.views.fragments.EvenOddFragment$onResume$1$1", f = "EvenOddFragment.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public final /* synthetic */ fgg a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fgg fggVar, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.a = fggVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.a, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                final int[] iArr = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.five, R.drawable.six};
                final int[] iArr2 = {R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice_1, R.drawable.flat_dice, R.drawable.six};
                final fgg fggVar = this.a;
                jhg jhgVar = (jhg) fggVar.b;
                if (jhgVar != null) {
                    jhgVar.w.setRenderMode(1);
                }
                jhg jhgVar2 = (jhg) fggVar.b;
                if (jhgVar2 != null) {
                    jhgVar2.z.setRenderMode(1);
                }
                jhg jhgVar3 = (jhg) fggVar.b;
                if (jhgVar3 != null) {
                    jhgVar3.y.setRenderMode(1);
                }
                jhg jhgVar4 = (jhg) fggVar.b;
                if (jhgVar4 != null) {
                    jhgVar4.w.queueEvent(new Runnable() { // from class: jgg
                        @Override // java.lang.Runnable
                        public final void run() {
                            ppe ppeVar = fggVar.b0;
                            if (ppeVar == null) {
                                Intrinsics.n("cubeRender1");
                                throw null;
                            }
                            ppeVar.a(iArr, iArr2, Float.valueOf(1.2f), Float.valueOf(1.0f));
                        }
                    });
                }
                jhg jhgVar5 = (jhg) fggVar.b;
                if (jhgVar5 != null) {
                    jhgVar5.y.queueEvent(new Runnable() { // from class: kgg
                        @Override // java.lang.Runnable
                        public final void run() {
                            mpe mpeVar = fggVar.c0;
                            if (mpeVar == null) {
                                Intrinsics.n("cubeRender2");
                                throw null;
                            }
                            mpeVar.a(iArr, iArr2, Float.valueOf(1.2f), Float.valueOf(1.0f));
                        }
                    });
                }
                jhg jhgVar6 = (jhg) fggVar.b;
                if (jhgVar6 != null) {
                    jhgVar6.z.queueEvent(new Runnable() { // from class: lgg
                        @Override // java.lang.Runnable
                        public final void run() {
                            npe npeVar = fggVar.d0;
                            if (npeVar == null) {
                                Intrinsics.n("cubeRender3");
                                throw null;
                            }
                            npeVar.a(iArr, iArr2, Float.valueOf(1.2f), Float.valueOf(1.0f));
                        }
                    });
                }
                ppe ppeVar = fggVar.b0;
                if (ppeVar == null) {
                    Intrinsics.n(jbkEboCkTqmGf.aZnThrNfQXp);
                    throw null;
                }
                ppeVar.d = 3450;
                ppeVar.e = 50;
                ppeVar.w = 1;
                ppeVar.y = 1;
                ppeVar.z = 0;
                ppeVar.v = 0;
                ppeVar.i = fgg.w0(fggVar.U.get(0));
                mpe mpeVar = fggVar.c0;
                if (mpeVar == null) {
                    Intrinsics.n("cubeRender2");
                    throw null;
                }
                mpeVar.d = 3480;
                mpeVar.e = 40;
                mpeVar.w = 1;
                mpeVar.y = 1;
                mpeVar.z = 0;
                mpeVar.v = 0;
                mpeVar.i = fgg.w0(fggVar.U.get(1));
                npe npeVar = fggVar.d0;
                if (npeVar == null) {
                    Intrinsics.n("cubeRender3");
                    throw null;
                }
                npeVar.d = 3480;
                npeVar.e = 30;
                npeVar.w = 1;
                npeVar.y = 1;
                npeVar.z = 0;
                npeVar.v = 0;
                npeVar.i = fgg.w0(fggVar.U.get(2));
                return Unit.a;
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return fgg.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
        
            if (defpackage.ej5.d(r9, r1, r8) == r0) goto L21;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r8.a
                fgg r2 = defpackage.fgg.this
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r9)
                goto L51
            L13:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                return r5
            L19:
                defpackage.uj50.b(r9)
                goto L3f
            L1d:
                defpackage.uj50.b(r9)
                ppe r9 = r2.b0
                if (r9 == 0) goto L60
                edg r1 = defpackage.edg.i
                r9.i = r1
                mpe r9 = r2.c0
                if (r9 == 0) goto L5a
                r9.i = r1
                npe r9 = r2.d0
                if (r9 == 0) goto L54
                r9.i = r1
                r8.a = r4
                r6 = 50
                java.lang.Object r9 = defpackage.hkd.b(r6, r8)
                if (r9 != r0) goto L3f
                goto L50
            L3f:
                pfd r9 = defpackage.fse.a
                wcl r9 = defpackage.gku.a
                fgg$c$a r1 = new fgg$c$a
                r1.<init>(r2, r5)
                r8.a = r3
                java.lang.Object r8 = defpackage.ej5.d(r9, r1, r8)
                if (r8 != r0) goto L51
            L50:
                return r0
            L51:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            L54:
                java.lang.String r8 = "cubeRender3"
                kotlin.jvm.internal.Intrinsics.n(r8)
                throw r5
            L5a:
                java.lang.String r8 = "cubeRender2"
                kotlin.jvm.internal.Intrinsics.n(r8)
                throw r5
            L60:
                java.lang.String r8 = "cubeRender1"
                kotlin.jvm.internal.Intrinsics.n(r8)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: fgg.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgg.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class d extends saj implements Function1<Boolean, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            bool.getClass();
            fgg fggVar = (fgg) this.receiver;
            rk60 rk60VarY1 = fggVar.D0().y1();
            SharedPreferences sharedPreferences = fggVar.X;
            boolean z = false;
            if (sharedPreferences != null && sharedPreferences.getBoolean("EVEN_ODD_SOUND", false)) {
                z = true;
            }
            rk60VarY1.d = z;
            fggVar.D0();
            Intrinsics.n("soundManager");
            throw null;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d0 extends qlr implements Function0<Fragment> {
        public d0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgg.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class e extends saj implements Function1<Throwable, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th) {
            Throwable th2 = th;
            th2.getClass();
            ((fgg) this.receiver).getClass();
            th2.printStackTrace();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ d0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(d0 d0Var) {
            super(0);
            this.a = d0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f implements DrawerLayout.e {
        public f() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void a(View view) {
            view.getClass();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void b(View view) {
            view.getClass();
            fgg.this.I0();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public final void c(View view, float f) {
            view.getClass();
            double d = f;
            fgg fggVar = fgg.this;
            if (d > 0.8d) {
                jhg jhgVar = (jhg) fggVar.b;
                if (jhgVar != null) {
                    jhgVar.A.setVisibility(0);
                }
                jhg jhgVar2 = (jhg) fggVar.b;
                if (jhgVar2 != null) {
                    jhgVar2.y.setVisibility(4);
                }
                jhg jhgVar3 = (jhg) fggVar.b;
                if (jhgVar3 != null) {
                    jhgVar3.w.setVisibility(4);
                }
                jhg jhgVar4 = (jhg) fggVar.b;
                if (jhgVar4 != null) {
                    jhgVar4.B.setVisibility(0);
                }
                jhg jhgVar5 = (jhg) fggVar.b;
                if (jhgVar5 != null) {
                    jhgVar5.C.setVisibility(0);
                }
                jhg jhgVar6 = (jhg) fggVar.b;
                if (jhgVar6 != null) {
                    jhgVar6.z.setVisibility(4);
                    return;
                }
                return;
            }
            if (d <= 0.5d) {
                jhg jhgVar7 = (jhg) fggVar.b;
                if (jhgVar7 != null) {
                    jhgVar7.A.setVisibility(4);
                }
                jhg jhgVar8 = (jhg) fggVar.b;
                if (jhgVar8 != null) {
                    jhgVar8.C.setVisibility(4);
                }
                jhg jhgVar9 = (jhg) fggVar.b;
                if (jhgVar9 != null) {
                    jhgVar9.B.setVisibility(4);
                }
                jhg jhgVar10 = (jhg) fggVar.b;
                if (jhgVar10 != null) {
                    jhgVar10.w.setVisibility(0);
                }
                jhg jhgVar11 = (jhg) fggVar.b;
                if (jhgVar11 != null) {
                    jhgVar11.z.setVisibility(0);
                }
                jhg jhgVar12 = (jhg) fggVar.b;
                if (jhgVar12 != null) {
                    jhgVar12.y.setVisibility(0);
                }
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public g(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return fgg.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return fgg.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j extends qlr implements Function0<r8i0.c> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return fgg.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class k extends qlr implements Function0<v8i0> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return fgg.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l extends qlr implements Function0<cyb> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return fgg.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m extends qlr implements Function0<r8i0.c> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return fgg.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgg.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o extends qlr implements Function0<Fragment> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgg.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p extends qlr implements Function0<w8i0> {
        public final /* synthetic */ o a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(o oVar) {
            super(0);
            this.a = oVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgg.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t extends qlr implements Function0<Fragment> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgg.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u extends qlr implements Function0<w8i0> {
        public final /* synthetic */ t a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(t tVar) {
            super(0);
            this.a = tVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class v extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x extends qlr implements Function0<Fragment> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return fgg.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? fgg.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z extends qlr implements Function0<w8i0> {
        public final /* synthetic */ x a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(x xVar) {
            super(0);
            this.a = xVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public fgg() {
        x xVar = new x();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new z(xVar));
        this.C = new q8i0(jq40.a(nt2.class), new a0(ttrVarA), new c0(ttrVarA), new b0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new e0(new d0()));
        this.F = new q8i0(jq40.a(ypa0.class), new f0(ttrVarA2), new n(ttrVarA2), new g0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new p(new o()));
        this.G = new q8i0(jq40.a(ei10.class), new q(ttrVarA3), new s(ttrVarA3), new r(ttrVarA3));
        ttr ttrVarA4 = hwr.a(a1sVar, new u(new t()));
        this.H = new q8i0(jq40.a(o530.class), new v(ttrVarA4), new y(ttrVarA4), new w(ttrVarA4));
        this.R = "";
        this.S = new LinkedHashSet<>();
        this.T = new LinkedHashSet<>();
        this.U = new ArrayList();
        this.W = new ArrayList<>();
        this.j0 = true;
        this.m0 = new ema();
        this.u0 = "sg_even_odd";
        this.v0 = kotlin.collections.b.f("sg_even_odd", "sg_common_dialog_message", "sg_chat", "sg_bethistory", "sg_fbg_dialog", "sg_ham_menu", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
        this.y0 = "en";
        this.D0 = new q8i0(jq40.a(fuj.class), new h(), new j(), new i());
        this.E0 = new q8i0(jq40.a(db6.class), new k(), new m(), new l());
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: xdg
            @Override // defpackage.ud
            public final void a(Object obj) {
                e activity;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i2 = activityResult.a;
                if ((i2 == -1 || i2 == 107) && (activity = this.a.getActivity()) != null) {
                    activity.finish();
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.J0 = eeVarRegisterForActivityResult;
    }

    public static void L0(fgg fggVar) {
        jhg jhgVar = (jhg) fggVar.b;
        if (jhgVar != null) {
            jhgVar.X.setAlpha(0.5f);
        }
        jhg jhgVar2 = (jhg) fggVar.b;
        if (jhgVar2 != null) {
            jhgVar2.X.setEnabled(false);
        }
        jhg jhgVar3 = (jhg) fggVar.b;
        if (jhgVar3 != null) {
            jhgVar3.R.setAlpha(0.5f);
        }
        jhg jhgVar4 = (jhg) fggVar.b;
        if (jhgVar4 != null) {
            jhgVar4.R.setEnabled(false);
        }
        jhg jhgVar5 = (jhg) fggVar.b;
        if (jhgVar5 != null) {
            jhgVar5.R.setClickable(false);
        }
        jhg jhgVar6 = (jhg) fggVar.b;
        if (jhgVar6 != null) {
            jhgVar6.Y.setClickable(false);
        }
        jhg jhgVar7 = (jhg) fggVar.b;
        if (jhgVar7 != null) {
            jhgVar7.Y.setAlpha(0.5f);
        }
        jhg jhgVar8 = (jhg) fggVar.b;
        if (jhgVar8 != null) {
            jhgVar8.Y.setEnabled(false);
        }
        jhg jhgVar9 = (jhg) fggVar.b;
        if (jhgVar9 != null) {
            jhgVar9.Z.setClickable(false);
        }
        jhg jhgVar10 = (jhg) fggVar.b;
        if (jhgVar10 != null) {
            jhgVar10.Z.setAlpha(0.5f);
        }
        jhg jhgVar11 = (jhg) fggVar.b;
        if (jhgVar11 != null) {
            jhgVar11.Z.setEnabled(false);
        }
        jhg jhgVar12 = (jhg) fggVar.b;
        if (jhgVar12 != null) {
            jhgVar12.d.setAlpha(0.5f);
        }
        jhg jhgVar13 = (jhg) fggVar.b;
        if (jhgVar13 != null) {
            jhgVar13.d.setEnabled(false);
        }
        jhg jhgVar14 = (jhg) fggVar.b;
        if (jhgVar14 != null) {
            jhgVar14.i.setAlpha(0.5f);
        }
        jhg jhgVar15 = (jhg) fggVar.b;
        if (jhgVar15 != null) {
            jhgVar15.i.setEnabled(false);
        }
        jhg jhgVar16 = (jhg) fggVar.b;
        if (jhgVar16 != null) {
            jhgVar16.d0.setAlpha(0.5f);
        }
        jhg jhgVar17 = (jhg) fggVar.b;
        if (jhgVar17 != null) {
            jhgVar17.i.setEnabled(false);
        }
        jhg jhgVar18 = (jhg) fggVar.b;
        if (jhgVar18 != null) {
            jhgVar18.J.a(0);
        }
    }

    public final o530 C0() {
        return (o530) this.H.getValue();
    }

    public final ypa0 D0() {
        return (ypa0) this.F.getValue();
    }

    public final void E0() {
        int i2;
        Boolean boolValueOf;
        Resources resources;
        DisplayMetrics displayMetrics;
        Integer numValueOf = Integer.valueOf(R.color.evenodd_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.evenodd_toggle_on_color);
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        ldg ldgVar = new ldg();
        SharedPreferences sharedPreferences = this.X;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, ldgVar, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("EVEN_ODD_MUSIC", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: mdg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                this.a.P0(((Boolean) obj).booleanValue());
                return Unit.a;
            }
        }, 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        odg odgVar = new odg();
        SharedPreferences sharedPreferences2 = this.X;
        if (sharedPreferences2 != null) {
            i2 = 1;
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("EVEN_ODD_SOUND", true));
        } else {
            i2 = 1;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, odgVar, true, boolValueOf, numValueOf2, numValueOf, null, false, new uq2(this, i2), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        vq2 vq2Var = new vq2(1);
        SharedPreferences sharedPreferences3 = this.X;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, vq2Var, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("EVEN_ODD_ONE_TAP", false)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: pdg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                fgg fggVar = this.a;
                fggVar.D0().J1(fggVar.D0().y1().d);
                SharedPreferences.Editor editor = fggVar.V;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("EVEN_ODD_ONE_TAP", true);
                    }
                } else if (editor != null) {
                    editor.putBoolean("EVEN_ODD_ONE_TAP", false);
                }
                SharedPreferences.Editor editor2 = fggVar.V;
                if (editor2 != null) {
                    editor2.apply();
                }
                return Unit.a;
            }
        }, 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new qdg(this, 0), false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        int i3 = 0;
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new rdg(this, i3), false, null, null, null, null, false, null, 3072, null));
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            SGHamburgerMenu sGHamburgerMenu = jhgVar.M;
            SGHamburgerMenu.b bVar = new SGHamburgerMenu.b(D0(), R.string.evenodd_name, this.v, this.w, listK, new sdg(this, i3), new tdg());
            androidx.fragment.app.e eVarRequireActivity = requireActivity();
            eVarRequireActivity.getClass();
            SGHamburgerMenu.setup$default(sGHamburgerMenu, bVar, eVarRequireActivity, false, null, null, 28, null);
        }
        Context context = getContext();
        double d2 = ((double) ((context == null || (resources = context.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.widthPixels)) * 0.72d;
        jhg jhgVar2 = (jhg) this.b;
        if ((jhgVar2 != null ? jhgVar2.Q.getLayoutParams() : null) != null) {
            jhg jhgVar3 = (jhg) this.b;
            ViewGroup.LayoutParams layoutParams = jhgVar3 != null ? jhgVar3.Q.getLayoutParams() : null;
            layoutParams.getClass();
            DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = (int) d2;
            jhg jhgVar4 = (jhg) this.b;
            if (jhgVar4 != null) {
                jhgVar4.Q.setLayoutParams(layoutParams2);
            }
        }
        jhg jhgVar5 = (jhg) this.b;
        if (jhgVar5 != null) {
            jhgVar5.M.setEvenImage();
        }
    }

    public final void F0() {
        int i2;
        boolean zBooleanValue;
        AppCompatImageView chat;
        Context context = getContext();
        if (context != null) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "even-odd");
            if (arrayListA.isEmpty()) {
                i2 = 0;
                zBooleanValue = false;
            } else {
                int size = arrayListA.size();
                i2 = 0;
                zBooleanValue = false;
                while (true) {
                    if (i2 >= size) {
                        i2 = 0;
                        break;
                    }
                    Boolean isView = arrayListA.get(i2).getIsView();
                    zBooleanValue = isView != null ? isView.booleanValue() : false;
                    if (!zBooleanValue) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.t0 = true;
            B b2 = this.b;
            if (zBooleanValue) {
                jhg jhgVar = (jhg) b2;
                if (jhgVar != null) {
                    jhgVar.e.setVisibility(0);
                }
                jhg jhgVar2 = (jhg) this.b;
                if (jhgVar2 != null) {
                    jhgVar2.A.setVisibility(4);
                }
                jhg jhgVar3 = (jhg) this.b;
                if (jhgVar3 != null) {
                    jhgVar3.C.setVisibility(4);
                }
                jhg jhgVar4 = (jhg) this.b;
                if (jhgVar4 != null) {
                    jhgVar4.B.setVisibility(4);
                }
                jhg jhgVar5 = (jhg) this.b;
                if (jhgVar5 != null) {
                    jhgVar5.w.setVisibility(0);
                }
                jhg jhgVar6 = (jhg) this.b;
                if (jhgVar6 != null) {
                    jhgVar6.z.setVisibility(0);
                }
                jhg jhgVar7 = (jhg) this.b;
                if (jhgVar7 != null) {
                    jhgVar7.y.setVisibility(0);
                }
                this.x0 = false;
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new igg(this, null), 3);
                return;
            }
            jhg jhgVar8 = (jhg) b2;
            if (jhgVar8 != null) {
                jhgVar8.w.setVisibility(4);
            }
            jhg jhgVar9 = (jhg) this.b;
            if (jhgVar9 != null) {
                jhgVar9.y.setVisibility(4);
            }
            jhg jhgVar10 = (jhg) this.b;
            if (jhgVar10 != null) {
                jhgVar10.z.setVisibility(4);
            }
            jhg jhgVar11 = (jhg) this.b;
            if (jhgVar11 != null) {
                jhgVar11.A.setVisibility(0);
            }
            jhg jhgVar12 = (jhg) this.b;
            if (jhgVar12 != null) {
                jhgVar12.B.setVisibility(0);
            }
            jhg jhgVar13 = (jhg) this.b;
            if (jhgVar13 != null) {
                jhgVar13.C.setVisibility(0);
            }
            this.x0 = true;
            if (this.i != null) {
                jhg jhgVar14 = (jhg) this.b;
                boolean z2 = (jhgVar14 == null || (chat = jhgVar14.J.getChat()) == null || chat.getVisibility() != 0) ? false : true;
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                op5.a.getClass();
                List<? extends File> list = op5.b;
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                aVar.c = "even-odd";
                aVar.d = i2;
                aVar.w = list;
                aVar.z = o2gVar;
                aVar.A = z2;
                aVarA.f(R.id.onboarding_images, aVar, null);
                aVarA.d();
            }
            jhg jhgVar15 = (jhg) this.b;
            if (jhgVar15 != null) {
                jhgVar15.T.setVisibility(0);
            }
        }
    }

    public final void G0() {
        String houseDraw;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar;
        ssw<LoadingState<HTTPResponse<WalletInfo>>> sswVar2;
        PlaceBetResponse placeBetResponse = this.a0;
        if (placeBetResponse == null || (houseDraw = placeBetResponse.getHouseDraw()) == null) {
            houseDraw = "";
        }
        int i2 = 3;
        boolean z2 = false;
        try {
            if (getActivity() != null) {
                this.N = true;
                bo1 bo1Var = (bo1) this.a;
                if (bo1Var != null && (sswVar2 = bo1Var.v) != null) {
                    sswVar2.l(getViewLifecycleOwner());
                }
                bo1 bo1Var2 = (bo1) this.a;
                if (bo1Var2 != null) {
                    bo1Var2.B1();
                }
                bo1 bo1Var3 = (bo1) this.a;
                if (bo1Var3 != null && (sswVar = bo1Var3.v) != null) {
                    sswVar.f(getViewLifecycleOwner(), new g(new qfg(this, z2)));
                }
                this.O = true;
                this.U = StringsKt__StringsKt.split$default(houseDraw, new String[]{":"}, false, 0, 6, null);
                jhg jhgVar = (jhg) this.b;
                if (jhgVar != null) {
                    jhgVar.y.setVisibility(0);
                }
                jhg jhgVar2 = (jhg) this.b;
                if (jhgVar2 != null) {
                    jhgVar2.z.setVisibility(0);
                }
                LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
                this.T = linkedHashSet;
                linkedHashSet.add(Integer.valueOf(Integer.parseInt(this.U.get(0))));
                this.T.add(Integer.valueOf(Integer.parseInt(this.U.get(1))));
                this.T.add(Integer.valueOf(Integer.parseInt(this.U.get(2))));
                jhg jhgVar3 = (jhg) this.b;
                if (jhgVar3 != null) {
                    jhgVar3.w.setRenderMode(1);
                }
                jhg jhgVar4 = (jhg) this.b;
                if (jhgVar4 != null) {
                    jhgVar4.z.setRenderMode(1);
                }
                jhg jhgVar5 = (jhg) this.b;
                if (jhgVar5 != null) {
                    jhgVar5.y.setRenderMode(1);
                }
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new ugg(this, null), 3);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        PlaceBetResponse placeBetResponse2 = this.a0;
        String houseDrawDecision = placeBetResponse2 != null ? placeBetResponse2.getHouseDrawDecision() : null;
        PlaceBetResponse placeBetResponse3 = this.a0;
        if (kotlin.text.c.l(houseDrawDecision, placeBetResponse3 != null ? placeBetResponse3.getUserPick() : null, false)) {
            i2 = 1;
        } else {
            PlaceBetResponse placeBetResponse4 = this.a0;
            if (!kotlin.text.c.l(placeBetResponse4 != null ? placeBetResponse4.getHouseDrawDecision() : null, "triple", true)) {
                i2 = 2;
            }
        }
        this.e0 = i2;
    }

    public final void H0() {
        this.F0 = false;
        this.G0 = false;
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            jhgVar.d.E(1.0f, true);
        }
        jhg jhgVar2 = (jhg) this.b;
        if (jhgVar2 != null) {
            jhgVar2.c.a(8);
        }
        jhg jhgVar3 = (jhg) this.b;
        if (jhgVar3 != null) {
            jhgVar3.c.b(4, 0);
        }
        jhg jhgVar4 = (jhg) this.b;
        if (jhgVar4 != null) {
            BetBoxContainer betBoxContainer = jhgVar4.c;
            bo1.b bVar = this.H0;
            betBoxContainer.setBetAmount(Double.valueOf(bVar != null ? bVar.a : 0.0d), this.W);
        }
        jhg jhgVar5 = (jhg) this.b;
        if (jhgVar5 != null) {
            ChipSlider chipSlider = jhgVar5.i;
            bo1.b bVar2 = this.H0;
            chipSlider.setBetAmount(bVar2 != null ? bVar2.a : 0.0d, this.W);
        }
        bo1 bo1Var = (bo1) this.a;
        if (bo1Var != null) {
            bo1.b bVar3 = this.H0;
            bo1Var.z1(Double.valueOf(bVar3 != null ? bVar3.a : 0.0d));
        }
        bo1 bo1Var2 = (bo1) this.a;
        if (bo1Var2 != null) {
            bo1Var2.A1(null);
        }
        jhg jhgVar6 = (jhg) this.b;
        if (jhgVar6 != null) {
            jhgVar6.i.setEnabled(true);
        }
        jhg jhgVar7 = (jhg) this.b;
        if (jhgVar7 != null) {
            jhgVar7.i.setAlpha(1.0f);
        }
        jhg jhgVar8 = (jhg) this.b;
        if (jhgVar8 != null) {
            jhgVar8.i.b(true);
        }
        jhg jhgVar9 = (jhg) this.b;
        if (jhgVar9 != null) {
            jhgVar9.d.setEnabled(true);
        }
        jhg jhgVar10 = (jhg) this.b;
        if (jhgVar10 != null) {
            jhgVar10.d.setAlpha(1.0f);
        }
        jhg jhgVar11 = (jhg) this.b;
        if (jhgVar11 != null) {
            jhgVar11.d.E(1.0f, true);
        }
        jhg jhgVar12 = (jhg) this.b;
        if (jhgVar12 != null) {
            jhgVar12.f.setVisibility(8);
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
        fdg.e.a();
    }

    public final void I0() {
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            jhgVar.Z.setAlpha(1.0f);
        }
        jhg jhgVar2 = (jhg) this.b;
        if (jhgVar2 != null) {
            jhgVar2.Z.setEnabled(true);
        }
        jhg jhgVar3 = (jhg) this.b;
        if (jhgVar3 != null) {
            jhgVar3.Y.setAlpha(1.0f);
        }
        jhg jhgVar4 = (jhg) this.b;
        if (jhgVar4 != null) {
            jhgVar4.Y.setEnabled(true);
        }
        jhg jhgVar5 = (jhg) this.b;
        if (jhgVar5 != null) {
            jhgVar5.Y.setClickable(true);
        }
        jhg jhgVar6 = (jhg) this.b;
        if (jhgVar6 != null) {
            jhgVar6.Z.setClickable(true);
        }
        jhg jhgVar7 = (jhg) this.b;
        if (jhgVar7 != null) {
            jhgVar7.X.setAlpha(1.0f);
        }
        jhg jhgVar8 = (jhg) this.b;
        if (jhgVar8 != null) {
            jhgVar8.X.setEnabled(true);
        }
        jhg jhgVar9 = (jhg) this.b;
        if (jhgVar9 != null) {
            jhgVar9.X.setClickable(true);
        }
        jhg jhgVar10 = (jhg) this.b;
        if (jhgVar10 != null) {
            jhgVar10.R.setAlpha(1.0f);
        }
        jhg jhgVar11 = (jhg) this.b;
        if (jhgVar11 != null) {
            jhgVar11.R.setEnabled(true);
        }
        jhg jhgVar12 = (jhg) this.b;
        if (jhgVar12 != null) {
            jhgVar12.R.setClickable(true);
        }
        jhg jhgVar13 = (jhg) this.b;
        if (jhgVar13 != null) {
            jhgVar13.c.setAlpha(1.0f);
        }
        jhg jhgVar14 = (jhg) this.b;
        if (jhgVar14 != null) {
            jhgVar14.c.setEnabled(true);
        }
        jhg jhgVar15 = (jhg) this.b;
        if (jhgVar15 != null) {
            jhgVar15.d.setAlpha(1.0f);
        }
        jhg jhgVar16 = (jhg) this.b;
        if (jhgVar16 != null) {
            jhgVar16.d.setEnabled(true);
        }
        jhg jhgVar17 = (jhg) this.b;
        if (jhgVar17 != null) {
            jhgVar17.i.setAlpha(1.0f);
        }
        jhg jhgVar18 = (jhg) this.b;
        if (jhgVar18 != null) {
            jhgVar18.i.setEnabled(true);
        }
        jhg jhgVar19 = (jhg) this.b;
        if (jhgVar19 != null) {
            jhgVar19.d0.setAlpha(1.0f);
        }
        jhg jhgVar20 = (jhg) this.b;
        if (jhgVar20 != null) {
            jhgVar20.i.setEnabled(true);
        }
        jhg jhgVar21 = (jhg) this.b;
        if (jhgVar21 != null) {
            jhgVar21.J.a(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(ImageView imageView, String str, x1b x1bVar) {
        pgg pggVar;
        if (x1bVar instanceof pgg) {
            pggVar = (pgg) x1bVar;
            int i2 = pggVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pggVar.d = i2 - Integer.MIN_VALUE;
            } else {
                pggVar = new pgg(this, x1bVar);
            }
        } else {
            pggVar = new pgg(this, x1bVar);
        }
        Object objC = pggVar.b;
        y5b y5bVar = y5b.a;
        int i3 = pggVar.d;
        if (i3 == 0) {
            uj50.b(objC);
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = getContext();
            pggVar.a = imageView;
            pggVar.d = 1;
            objC = r9n.c(pggVar, context, str);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView = pggVar.a;
            uj50.b(objC);
        }
        imageView.setImageBitmap((Bitmap) objC);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(ConstraintLayout constraintLayout, String str, x1b x1bVar) {
        qgg qggVar;
        if (x1bVar instanceof qgg) {
            qggVar = (qgg) x1bVar;
            int i2 = qggVar.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qggVar.d = i2 - Integer.MIN_VALUE;
            } else {
                qggVar = new qgg(this, x1bVar);
            }
        } else {
            qggVar = new qgg(this, x1bVar);
        }
        Object objB = qggVar.b;
        y5b y5bVar = y5b.a;
        int i3 = qggVar.d;
        if (i3 == 0) {
            uj50.b(objB);
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = getContext();
            qggVar.a = constraintLayout;
            qggVar.d = 1;
            objB = r9n.b(context, str, qggVar);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            constraintLayout = qggVar.a;
            uj50.b(objB);
        }
        constraintLayout.setBackground((Drawable) objB);
        return Unit.a;
    }

    public final void M0() {
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        fo2 fo2Var = new fo2(eVarRequireActivity, "Even-Odd");
        fo2Var.H = new rmb(this, 1);
        fo2Var.I = new Function2() { // from class: leg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                this.a.u0().x1(((Integer) obj).intValue(), ((Integer) obj2).intValue(), PagingFetchType.ARCHIVE_MORE);
                return Unit.a;
            }
        };
        fo2Var.d();
        androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        vo2 vo2Var = new vo2();
        vo2Var.e = eVarRequireActivity2;
        fo2Var.i(vo2Var);
        fo2Var.b();
        this.D = fo2Var;
        fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: meg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                fo2 fo2Var2 = this.a.D;
                if (fo2Var2 != null) {
                    fo2Var2.c();
                }
            }
        });
    }

    public final void N0() {
        boolean z2;
        try {
            z2 = this.I0 != 0 && System.currentTimeMillis() - this.I0 < 30000;
            this.I0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        try {
            jhg jhgVar = (jhg) this.b;
            if (jhgVar != null) {
                jhgVar.L.setCampaignCompletedText();
            }
            jhg jhgVar2 = (jhg) this.b;
            if (jhgVar2 != null) {
                jhgVar2.L.setVisibility(0);
            }
            jhg jhgVar3 = (jhg) this.b;
            if (jhgVar3 != null) {
                jhgVar3.L.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
            }
            ej5.c(ebs.a(getLifecycle()), null, null, new vgg(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void O0(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            GameDetails gameDetails = this.i;
            nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, null, context.getDrawable(R.drawable.evenodd_bet_history_bg), function0, 4);
            this.z0 = nleVar;
            nleVar.show();
            if (z2) {
                GameDetails gameDetails2 = this.i;
                wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
            }
        }
    }

    public final void P0(boolean z2) {
        jhg jhgVar;
        SharedPreferences.Editor editor = this.V;
        if (!z2) {
            if (editor != null) {
                editor.putBoolean("EVEN_ODD_MUSIC", false);
            }
            if (((jhg) this.b) != null) {
                D0().I1();
            }
            D0().y1();
            SharedPreferences.Editor editor2 = this.V;
            if (editor2 != null) {
                editor2.apply();
                return;
            }
            return;
        }
        if (editor != null) {
            editor.putBoolean("EVEN_ODD_MUSIC", true);
        }
        SharedPreferences.Editor editor3 = this.V;
        if (editor3 != null) {
            editor3.apply();
        }
        D0().y1();
        SharedPreferences sharedPreferences = this.X;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("EVEN_ODD_MUSIC", true)) : null;
        SharedPreferences sharedPreferences2 = this.X;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("EVEN_ODD_SOUND", true)) : null;
        Context context = getContext();
        if (context == null || (jhgVar = (jhg) this.b) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = jhgVar.W;
        GameDetails gameDetails = this.i;
        String name = gameDetails != null ? gameDetails.getName() : null;
        String str = name == null ? "" : name;
        GameDetails gameDetails2 = this.i;
        String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
        String str2 = name2 == null ? "" : name2;
        rk60.b bVar = rk60.b.d;
        GameDetails gameDetails3 = this.i;
        ypa0 ypa0VarD0 = D0();
        String string = getString(R.string.bg_music);
        string.getClass();
        progressMeterComponent.I(str, str2, boolValueOf2, bVar, gameDetails3, context, ypa0VarD0, boolValueOf, string);
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        String name;
        bo1 bo1Var;
        Resources resources;
        String[] stringArray;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        if ((xnh0Var != null ? xnh0Var.a : null) == null || xnh0Var.a.length() <= 0) {
            return;
        }
        this.p0 = false;
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            jhgVar.e.setVisibility(8);
        }
        jhg jhgVar2 = (jhg) this.b;
        if (jhgVar2 != null) {
            jhgVar2.w.setVisibility(8);
        }
        jhg jhgVar3 = (jhg) this.b;
        if (jhgVar3 != null) {
            jhgVar3.y.setVisibility(8);
        }
        jhg jhgVar4 = (jhg) this.b;
        if (jhgVar4 != null) {
            jhgVar4.z.setVisibility(8);
        }
        if (getContext() != null) {
            Context context = getContext();
            int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.even_odd_images_array)) == null) ? 0 : stringArray.length) + 7;
            int i2 = 100 / length;
            int i3 = 100 - (length * i2);
            jhg jhgVar5 = (jhg) this.b;
            if (jhgVar5 != null) {
                jhgVar5.W.setProgressForApi(i2);
            }
            jhg jhgVar6 = (jhg) this.b;
            if (jhgVar6 != null) {
                jhgVar6.W.L();
            }
            jhg jhgVar7 = (jhg) this.b;
            if (jhgVar7 != null) {
                jhgVar7.W.O(i3);
            }
            jhg jhgVar8 = (jhg) this.b;
            if (jhgVar8 != null) {
                jhgVar8.W.setVisibility(0);
            }
            GameDetails gameDetails = this.i;
            if (gameDetails != null && (name = gameDetails.getName()) != null && (bo1Var = (bo1) this.a) != null) {
                ej5.c(o8i0.d(bo1Var), null, null, new ym1(bo1Var, name, null), 3);
            }
            jhg jhgVar9 = (jhg) this.b;
            if (jhgVar9 != null) {
                jhgVar9.W.E(this.r0, this.v0, this.u0, this.y0);
            }
        }
    }

    public final void Q0(boolean z2) {
        SharedPreferences.Editor editor = this.V;
        if (z2) {
            if (editor != null) {
                editor.putBoolean("EVEN_ODD_SOUND", true);
            }
            D0().y1().d = true;
        } else {
            if (editor != null) {
                editor.putBoolean("EVEN_ODD_SOUND", false);
            }
            D0().y1().d = false;
        }
        SharedPreferences.Editor editor2 = this.V;
        if (editor2 != null) {
            editor2.apply();
        }
    }

    public final void R0(double d2) {
        Dialog dialog;
        xi60 xi60Var = this.A;
        if (xi60Var != null && (dialog = xi60Var.getDialog()) != null && dialog.isShowing()) {
            xi60 xi60Var2 = this.A;
            if (xi60Var2 != null) {
                xi60Var2.dismiss();
            }
            this.A = null;
        }
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            jhgVar.c.a(0);
        }
        jhg jhgVar2 = (jhg) this.b;
        if (jhgVar2 != null) {
            jhgVar2.c.b(0, 4);
        }
        jhg jhgVar3 = (jhg) this.b;
        if (jhgVar3 != null) {
            jhgVar3.c.setBetAmount(Double.valueOf(d2), this.W);
        }
        jhg jhgVar4 = (jhg) this.b;
        if (jhgVar4 != null) {
            jhgVar4.i.setBetAmount(d2, this.W);
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    @Override // defpackage.bb
    public final void f0(m8 m8Var) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z2 = nzf0.a;
        if (!z2 && jCurrentTimeMillis - nzf0.b <= 500) {
            z2 = true;
        }
        if (z2) {
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        Boolean boolValueOf = activity != null ? Boolean.valueOf(activity.isFinishing()) : null;
        boolValueOf.getClass();
        if (boolValueOf.booleanValue()) {
            return;
        }
        androidx.fragment.app.e activity2 = getActivity();
        Boolean boolValueOf2 = activity2 != null ? Boolean.valueOf(activity2.isDestroyed()) : null;
        boolValueOf2.getClass();
        if (boolValueOf2.booleanValue()) {
            return;
        }
        int i2 = 0;
        this.p0 = false;
        Context context = getContext();
        if (context != null) {
            hht hhtVar = new hht(context, "Even-Odd");
            String string = getString(R.string.game_not_available);
            string.getClass();
            String string2 = getString(R.string.label_dialog_exit);
            string2.getClass();
            hhtVar.c(string, string2, new tfg(this, i2), new ufg(0), context.getColor(R.color.try_again_color));
            hhtVar.a();
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.evenodd_game_fragment, (ViewGroup) null, false);
        int i2 = R.id.add_money;
        TextView textView = (TextView) h5e.a(R.id.add_money, viewInflate);
        if (textView != null) {
            i2 = R.id.bet_amountbox;
            BetBoxContainer betBoxContainer = (BetBoxContainer) h5e.a(R.id.bet_amountbox, viewInflate);
            if (betBoxContainer != null) {
                i2 = R.id.betchip_container;
                BetChipContainer betChipContainer = (BetChipContainer) h5e.a(R.id.betchip_container, viewInflate);
                if (betChipContainer != null) {
                    i2 = R.id.cardlay;
                    RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.cardlay, viewInflate);
                    if (relativeLayout != null) {
                        i2 = R.id.chip_overlay;
                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.chip_overlay, viewInflate);
                        if (constraintLayout != null) {
                            i2 = R.id.chip_slider;
                            ChipSlider chipSlider = (ChipSlider) h5e.a(R.id.chip_slider, viewInflate);
                            if (chipSlider != null) {
                                i2 = R.id.cl_background;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.cl_background, viewInflate);
                                if (constraintLayout2 != null) {
                                    i2 = R.id.cube_layout;
                                    GLSurfaceView gLSurfaceView = (GLSurfaceView) h5e.a(R.id.cube_layout, viewInflate);
                                    if (gLSurfaceView != null) {
                                        i2 = R.id.cube_layout2;
                                        GLSurfaceView gLSurfaceView2 = (GLSurfaceView) h5e.a(R.id.cube_layout2, viewInflate);
                                        if (gLSurfaceView2 != null) {
                                            i2 = R.id.cube_layout3;
                                            GLSurfaceView gLSurfaceView3 = (GLSurfaceView) h5e.a(R.id.cube_layout3, viewInflate);
                                            if (gLSurfaceView3 != null) {
                                                i2 = R.id.dice;
                                                ImageView imageView = (ImageView) h5e.a(R.id.dice, viewInflate);
                                                if (imageView != null) {
                                                    i2 = R.id.dice2;
                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.dice2, viewInflate);
                                                    if (imageView2 != null) {
                                                        i2 = R.id.dice3;
                                                        ImageView imageView3 = (ImageView) h5e.a(R.id.dice3, viewInflate);
                                                        if (imageView3 != null) {
                                                            i2 = R.id.drawer_layout;
                                                            DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                            if (drawerLayout != null) {
                                                                i2 = R.id.eo_round_result;
                                                                RoundResult roundResult = (RoundResult) h5e.a(R.id.eo_round_result, viewInflate);
                                                                if (roundResult != null) {
                                                                    i2 = R.id.error_text;
                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.error_text, viewInflate);
                                                                    if (appCompatTextView != null) {
                                                                        i2 = R.id.even;
                                                                        TextView textView2 = (TextView) h5e.a(R.id.even, viewInflate);
                                                                        if (textView2 != null) {
                                                                            i2 = R.id.evenoddlay;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.evenoddlay, viewInflate);
                                                                            if (constraintLayout3 != null) {
                                                                                i2 = R.id.evenoddnew;
                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.evenoddnew, viewInflate);
                                                                                if (constraintLayout4 != null) {
                                                                                    i2 = R.id.flContent;
                                                                                    if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                                                        i2 = R.id.game_header;
                                                                                        GameHeader gameHeader = (GameHeader) h5e.a(R.id.game_header, viewInflate);
                                                                                        if (gameHeader != null) {
                                                                                            i2 = R.id.games_campaign_progress;
                                                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                                            if (composeView != null) {
                                                                                                i2 = R.id.gift_toast_bar;
                                                                                                GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                                                if (giftToast != null) {
                                                                                                    i2 = R.id.guideline;
                                                                                                    if (((Guideline) h5e.a(R.id.guideline, viewInflate)) != null) {
                                                                                                        i2 = R.id.hamburger_menu;
                                                                                                        SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                                                        if (sGHamburgerMenu != null) {
                                                                                                            i2 = R.id.iv_table_glow;
                                                                                                            ImageView imageView4 = (ImageView) h5e.a(R.id.iv_table_glow, viewInflate);
                                                                                                            if (imageView4 != null) {
                                                                                                                i2 = R.id.layout;
                                                                                                                if (((ConstraintLayout) h5e.a(R.id.layout, viewInflate)) != null) {
                                                                                                                    i2 = R.id.loose_text;
                                                                                                                    ImageView imageView5 = (ImageView) h5e.a(R.id.loose_text, viewInflate);
                                                                                                                    if (imageView5 != null) {
                                                                                                                        i2 = R.id.margin;
                                                                                                                        View viewA = h5e.a(R.id.margin, viewInflate);
                                                                                                                        if (viewA != null) {
                                                                                                                            i2 = R.id.navigationView;
                                                                                                                            NavigationView navigationView = (NavigationView) h5e.a(R.id.navigationView, viewInflate);
                                                                                                                            if (navigationView != null) {
                                                                                                                                i2 = R.id.new_round_btn;
                                                                                                                                TextView textView3 = (TextView) h5e.a(R.id.new_round_btn, viewInflate);
                                                                                                                                if (textView3 != null) {
                                                                                                                                    i2 = R.id.odd;
                                                                                                                                    TextView textView4 = (TextView) h5e.a(R.id.odd, viewInflate);
                                                                                                                                    if (textView4 != null) {
                                                                                                                                        i2 = R.id.onboarding_images;
                                                                                                                                        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                        if (frameLayout != null) {
                                                                                                                                            i2 = R.id.pay_even;
                                                                                                                                            TextView textView5 = (TextView) h5e.a(R.id.pay_even, viewInflate);
                                                                                                                                            if (textView5 != null) {
                                                                                                                                                i2 = R.id.pay_odd;
                                                                                                                                                TextView textView6 = (TextView) h5e.a(R.id.pay_odd, viewInflate);
                                                                                                                                                if (textView6 != null) {
                                                                                                                                                    i2 = R.id.progress_meter_component;
                                                                                                                                                    ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                                    if (progressMeterComponent != null) {
                                                                                                                                                        i2 = R.id.rebet_btn;
                                                                                                                                                        TextView textView7 = (TextView) h5e.a(R.id.rebet_btn, viewInflate);
                                                                                                                                                        if (textView7 != null) {
                                                                                                                                                            i2 = R.id.select_even_btn;
                                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.select_even_btn, viewInflate);
                                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                                i2 = R.id.select_odd_btn;
                                                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.select_odd_btn, viewInflate);
                                                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                                                    i2 = R.id.view2;
                                                                                                                                                                    if (((ConstraintLayout) h5e.a(R.id.view2, viewInflate)) != null) {
                                                                                                                                                                        i2 = R.id.viewKonfetti;
                                                                                                                                                                        KonfettiView konfettiView = (KonfettiView) h5e.a(R.id.viewKonfetti, viewInflate);
                                                                                                                                                                        if (konfettiView != null) {
                                                                                                                                                                            i2 = R.id.view_margin;
                                                                                                                                                                            View viewA2 = h5e.a(R.id.view_margin, viewInflate);
                                                                                                                                                                            if (viewA2 != null) {
                                                                                                                                                                                i2 = R.id.view_margin2;
                                                                                                                                                                                View viewA3 = h5e.a(R.id.view_margin2, viewInflate);
                                                                                                                                                                                if (viewA3 != null) {
                                                                                                                                                                                    i2 = R.id.wallet_textView;
                                                                                                                                                                                    WalletText walletText = (WalletText) h5e.a(R.id.wallet_textView, viewInflate);
                                                                                                                                                                                    if (walletText != null) {
                                                                                                                                                                                        return new jhg((CoordinatorLayout) viewInflate, textView, betBoxContainer, betChipContainer, relativeLayout, constraintLayout, chipSlider, constraintLayout2, gLSurfaceView, gLSurfaceView2, gLSurfaceView3, imageView, imageView2, imageView3, drawerLayout, roundResult, appCompatTextView, textView2, constraintLayout3, constraintLayout4, gameHeader, composeView, giftToast, sGHamburgerMenu, imageView4, imageView5, viewA, navigationView, textView3, textView4, frameLayout, textView5, textView6, progressMeterComponent, textView7, constraintLayout5, constraintLayout6, konfettiView, viewA2, viewA3, walletText);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        androidx.fragment.app.e activity;
        ssw<bo1.c> sswVar;
        bo1.c cVarD;
        ssw<bo1.c> sswVar2;
        bo1.c cVarD2;
        ssw<bo1.c> sswVar3;
        bo1.c cVarD3;
        ssw<bo1.c> sswVar4;
        bo1.c cVarD4;
        ssw<Double> sswVar5;
        Double d2;
        super.onActivityResult(i2, i3, intent);
        switch (i2) {
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                if (i3 == 107 && (activity = getActivity()) != null) {
                    activity.finish();
                    break;
                }
                break;
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                if (i3 == 106) {
                    String str = this.B;
                    if (str != null && !StringsKt.U(str)) {
                        bo1 bo1Var = (bo1) this.a;
                        this.M = (bo1Var == null || (sswVar5 = bo1Var.b) == null || (d2 = sswVar5.d()) == null) ? 0.0d : d2.doubleValue();
                        L0(this);
                        if (this.J) {
                            if (yju.a("br")) {
                                z0().y1(new PlaceBetRequest(this.R, this.M, this.B, null, null, this.C0, null, 64, null), getActivity());
                            } else {
                                ei10.x1(z0(), new PlaceBetRequest(this.R, this.M, this.B, null, null, this.C0, null, 64, null));
                            }
                            jhg jhgVar = (jhg) this.b;
                            if (jhgVar != null) {
                                jhgVar.I.setVisibility(8);
                            }
                            jhg jhgVar2 = (jhg) this.b;
                            if (jhgVar2 != null) {
                                jhgVar2.E.setVisibility(8);
                            }
                        } else {
                            Double dValueOf = null;
                            if (yju.a("br")) {
                                ei10 ei10VarZ0 = z0();
                                String upperCase = this.R.toUpperCase(Locale.ROOT);
                                upperCase.getClass();
                                double d3 = this.M;
                                String str2 = this.B;
                                bo1 bo1Var2 = (bo1) this.a;
                                String giftId = (bo1Var2 == null || (sswVar4 = bo1Var2.c) == null || (cVarD4 = sswVar4.d()) == null) ? null : cVarD4.a.getGiftId();
                                bo1 bo1Var3 = (bo1) this.a;
                                if (bo1Var3 != null && (sswVar3 = bo1Var3.c) != null && (cVarD3 = sswVar3.d()) != null) {
                                    dValueOf = Double.valueOf(cVarD3.b);
                                }
                                ei10VarZ0.y1(new PlaceBetRequest(upperCase, d3, str2, giftId, dValueOf, this.C0, null, 64, null), getActivity());
                            } else {
                                ei10 ei10VarZ1 = z0();
                                String upperCase2 = this.R.toUpperCase(Locale.ROOT);
                                upperCase2.getClass();
                                double d4 = this.M;
                                String str3 = this.B;
                                bo1 bo1Var4 = (bo1) this.a;
                                String giftId2 = (bo1Var4 == null || (sswVar2 = bo1Var4.c) == null || (cVarD2 = sswVar2.d()) == null) ? null : cVarD2.a.getGiftId();
                                bo1 bo1Var5 = (bo1) this.a;
                                if (bo1Var5 != null && (sswVar = bo1Var5.c) != null && (cVarD = sswVar.d()) != null) {
                                    dValueOf = Double.valueOf(cVarD.b);
                                }
                                ei10.x1(ei10VarZ1, new PlaceBetRequest(upperCase2, d4, str3, giftId2, dValueOf, this.C0, null, 64, null));
                            }
                        }
                        this.h0 = this.M;
                        jhg jhgVar3 = (jhg) this.b;
                        if (jhgVar3 != null) {
                            jhgVar3.J.setBackImageVisible(8);
                        }
                        jhg jhgVar4 = (jhg) this.b;
                        if (jhgVar4 != null) {
                            jhgVar4.H.setVisibility(8);
                        }
                        jhg jhgVar5 = (jhg) this.b;
                        if (jhgVar5 != null) {
                            jhgVar5.F.setVisibility(4);
                        }
                        jhg jhgVar6 = (jhg) this.b;
                        if (jhgVar6 != null) {
                            jhgVar6.i.setVisibility(8);
                        }
                        jhg jhgVar7 = (jhg) this.b;
                        if (jhgVar7 != null) {
                            jhgVar7.d.setVisibility(8);
                        }
                        jhg jhgVar8 = (jhg) this.b;
                        if (jhgVar8 != null) {
                            jhgVar8.c.setVisibility(8);
                        }
                        jhg jhgVar9 = (jhg) this.b;
                        if (jhgVar9 != null) {
                            jhgVar9.J.a(0);
                        }
                        jhg jhgVar10 = (jhg) this.b;
                        if (jhgVar10 != null) {
                            jhgVar10.J.setBackImageVisible(8);
                        }
                        jhg jhgVar11 = (jhg) this.b;
                        if (jhgVar11 != null) {
                            jhgVar11.D.setDrawerLockMode(1, 8388613);
                        }
                        jhg jhgVar12 = (jhg) this.b;
                        if (jhgVar12 != null) {
                            jhgVar12.A.setVisibility(4);
                        }
                        jhg jhgVar13 = (jhg) this.b;
                        if (jhgVar13 != null) {
                            jhgVar13.C.setVisibility(4);
                        }
                        jhg jhgVar14 = (jhg) this.b;
                        if (jhgVar14 != null) {
                            jhgVar14.B.setVisibility(4);
                        }
                        jhg jhgVar15 = (jhg) this.b;
                        if (jhgVar15 != null) {
                            jhgVar15.w.setVisibility(0);
                        }
                        jhg jhgVar16 = (jhg) this.b;
                        if (jhgVar16 != null) {
                            jhgVar16.z.setVisibility(0);
                        }
                        jhg jhgVar17 = (jhg) this.b;
                        if (jhgVar17 != null) {
                            jhgVar17.y.setVisibility(0);
                        }
                        break;
                    }
                } else if (i3 != 108 && this.J) {
                    this.J = false;
                    break;
                }
                break;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                if (i3 == 106) {
                    D0().J1(D0().y1().d);
                    SharedPreferences.Editor editor = this.V;
                    if (editor != null) {
                        editor.putBoolean("EVEN_ODD_ONE_TAP", true);
                    }
                    SharedPreferences.Editor editor2 = this.V;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    E0();
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.A0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        bo1 bo1Var;
        ssw<LoadingState<HTTPResponse<DetailResponse>>> sswVar;
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar2;
        fdg.e.a = null;
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        bo1 bo1Var2 = (bo1) this.a;
        if (bo1Var2 != null && (sswVar2 = bo1Var2.d) != null) {
            sswVar2.l(getViewLifecycleOwner());
        }
        u0().b.l(getViewLifecycleOwner());
        if (getView() != null && (bo1Var = (bo1) this.a) != null && (sswVar = bo1Var.f) != null) {
            sswVar.l(getViewLifecycleOwner());
        }
        C0().b.l(getViewLifecycleOwner());
        if (this.q0 != null && (context = getContext()) != null) {
            fdt fdtVarA = fdt.a(context);
            ggg gggVar = this.q0;
            if (gggVar == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA.d(gggVar);
        }
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            jhgVar.W.N();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (!this.f0) {
            jhg jhgVar = (jhg) this.b;
            if (jhgVar != null) {
                jhgVar.w.onPause();
            }
            jhg jhgVar2 = (jhg) this.b;
            if (jhgVar2 != null) {
                jhgVar2.y.onPause();
            }
            jhg jhgVar3 = (jhg) this.b;
            if (jhgVar3 != null) {
                jhgVar3.z.onPause();
            }
        }
        try {
            y0().e.l(getViewLifecycleOwner());
            y0().d.l(getViewLifecycleOwner());
            y0().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String name;
        String name2;
        ssw<LoadingState<HTTPResponse<UserValidateResponse>>> sswVar;
        q8i0 q8i0Var = this.E0;
        boolean z2 = false;
        if (this.c) {
            bo1 bo1Var = (bo1) this.a;
            if (bo1Var != null) {
                ej5.c(o8i0.d(bo1Var), null, null, new ao1(bo1Var, null), 3);
            }
            bo1 bo1Var2 = (bo1) this.a;
            if (bo1Var2 != null && (sswVar = bo1Var2.e) != null) {
                sswVar.f(getViewLifecycleOwner(), new g(new peg(this, z2)));
            }
        }
        this.f0 = false;
        jhg jhgVar = (jhg) this.b;
        if (jhgVar != null) {
            jhgVar.w.onResume();
        }
        jhg jhgVar2 = (jhg) this.b;
        if (jhgVar2 != null) {
            jhgVar2.y.onResume();
        }
        jhg jhgVar3 = (jhg) this.b;
        if (jhgVar3 != null) {
            jhgVar3.z.onResume();
        }
        if (this.t0) {
            SharedPreferences sharedPreferences = this.X;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("EVEN_ODD_MUSIC", true)) : null;
            jhg jhgVar4 = (jhg) this.b;
            if (jhgVar4 != null) {
                ProgressMeterComponent progressMeterComponent = jhgVar4.W;
                ypa0 ypa0VarD0 = D0();
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0VarD0, boolValueOf, string);
            }
        }
        if (this.N) {
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new c(null), 3);
        }
        this.N = false;
        try {
            GameDetails gameDetails = this.i;
            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                name = "";
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), y0());
            GameDetails gameDetails2 = this.i;
            if (gameDetails2 == null || (name2 = gameDetails2.getName()) == null) {
                name2 = "";
            }
            androidx.fragment.app.e activity = getActivity();
            ComposeView composeView = null;
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            jhg jhgVar5 = (jhg) this.b;
            if (jhgVar5 != null) {
                composeView = jhgVar5.K;
            }
            ra6.b(name2, activity, viewLifecycleOwner2, composeView, this.B0, y0(), (db6) q8i0Var.getValue(), p58.e, null, new tld0(this.i), new udg(this, 0), new Function0() { // from class: vdg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    try {
                        this.a.C0().x1();
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return Unit.a;
                }
            }, null, 17920);
            y0().x1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        Context context;
        super.onStart();
        if (this.q0 == null || (context = getContext()) == null) {
            return;
        }
        fdt fdtVarA = fdt.a(context);
        ggg gggVar = this.q0;
        if (gggVar == null) {
            Intrinsics.n("mServiceReceiver");
            throw null;
        }
        fdtVarA.d(gggVar);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("soundOnOff");
        intentFilter.addAction("musicOnOff");
        intentFilter.addAction("soundOn");
        intentFilter.addAction("fbg_revert");
        fdt fdtVarA2 = fdt.a(context);
        ggg gggVar2 = this.q0;
        if (gggVar2 != null) {
            fdtVarA2.b(gggVar2, intentFilter);
        } else {
            Intrinsics.n("mServiceReceiver");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        D0().G1();
        if (((jhg) this.b) != null) {
            D0().I1();
        }
        super.onStop();
        this.m0.dispose();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ImageView crossFbg;
        SurfaceHolder holder;
        SurfaceHolder holder2;
        SurfaceHolder holder3;
        AppCompatImageView chat;
        ssw<LoadingState<HTTPResponse<UserValidateResponse>>> sswVar;
        ssw<LoadingState<HTTPResponse<DetailResponse>>> sswVar2;
        ssw<Double> sswVar3;
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar4;
        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar5;
        String name;
        bo1 bo1Var;
        ssw<LoadingState<List<File>>> sswVar6;
        ssw<Integer> liveData;
        Resources resources;
        String[] stringArray;
        Resources resources2;
        DisplayMetrics displayMetrics;
        view.getClass();
        super.onViewCreated(view, bundle);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarA = jq40.a(fq5.class);
        String strI = dq7VarA.i();
        if (strI == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.r0 = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        SportyGamesManager.getInstance().setScreenName("sportygames/even-odd");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            qlf.d(activity);
            qlf.c(window, activity.getColor(R.color.toolbar_strip_even_odd));
        }
        ArrayList<String> arrayList = vlr.a.get("even-odd");
        int i2 = 1;
        char c2 = 1;
        char c3 = 1;
        char c4 = 1;
        char c5 = 1;
        char c6 = 1;
        char c7 = 1;
        if (arrayList != null && arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
            this.y0 = xwj.a();
        }
        Context context = getContext();
        int i3 = 0;
        int i4 = (context == null || (resources2 = context.getResources()) == null || (displayMetrics = resources2.getDisplayMetrics()) == null) ? 0 : displayMetrics.widthPixels;
        jhg jhgVar = (jhg) this.b;
        ViewGroup.LayoutParams layoutParams = jhgVar != null ? jhgVar.Q.getLayoutParams() : null;
        layoutParams.getClass();
        DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (i4 * 72) / 100;
        jhg jhgVar2 = (jhg) this.b;
        if (jhgVar2 != null) {
            jhgVar2.Q.setLayoutParams(layoutParams2);
        }
        Context context2 = getContext();
        int length = ((context2 == null || (resources = context2.getResources()) == null || (stringArray = resources.getStringArray(R.array.even_odd_images_array)) == null) ? 0 : stringArray.length) + 7;
        jhg jhgVar3 = (jhg) this.b;
        if (jhgVar3 != null) {
            jhgVar3.W.setVisibility(0);
        }
        jhg jhgVar4 = (jhg) this.b;
        if (jhgVar4 != null) {
            jhgVar4.W.setProgressForApi(100 / length);
        }
        jhg jhgVar5 = (jhg) this.b;
        if (jhgVar5 != null) {
            jhgVar5.W.setCurrentProgress(100 - ((100 / length) * length));
        }
        jhg jhgVar6 = (jhg) this.b;
        if (jhgVar6 != null && (liveData = jhgVar6.W.getLiveData()) != null) {
            liveData.f(getViewLifecycleOwner(), new lfy() { // from class: teg
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Integer num = (Integer) obj;
                    fgg fggVar = this.a;
                    if (num != null && num.intValue() == 70) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new mgg(fggVar, null), 3);
                    }
                    if (num != null && num.intValue() == 100) {
                        pfd pfdVar2 = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new ogg(fggVar, null), 3);
                    }
                }
            });
        }
        op5 op5Var = op5.a;
        String str = this.u0;
        op5Var.getClass();
        op5.c = str;
        fq5 fq5Var = this.r0;
        if (fq5Var != null && (sswVar6 = fq5Var.c) != null) {
            sswVar6.f(getViewLifecycleOwner(), new g(new anb(this, i2)));
        }
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        D0();
        this.z = new xbg(eVarRequireActivity, "Even-Odd");
        try {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                String str2 = ((db6) this.E0.getValue()).c;
                if (str2 == null) {
                    str2 = "Ongoing";
                }
                this.B0 = new z66(activity2, str2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        SharedPreferences sharedPreferencesA = un20.a(requireActivity());
        this.X = sharedPreferencesA;
        this.V = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
        String string = getString(R.string.guest_username);
        string.getClass();
        this.w = string;
        L0(this);
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        zh60 zh60Var = new zh60(contextRequireContext);
        zh60Var.F = "";
        zh60Var.G = R.string.confirm_bet;
        zh60Var.H = R.string.cancel_bet;
        zh60Var.I = new wh60();
        zh60Var.K = "Even-Odd";
        zh60Var.L = "one tap bet";
        zh60Var.setCancelable(false);
        this.g0 = zh60Var;
        jhg jhgVar7 = (jhg) this.b;
        if (jhgVar7 != null) {
            jhgVar7.d.setColor(R.color.chip_bg_eo);
        }
        this.q0 = new ggg(this);
        jhg jhgVar8 = (jhg) this.b;
        if (jhgVar8 != null) {
            jhgVar8.i.setTooltipColor(R.drawable.trans_eo_round);
        }
        GameDetails gameDetails = this.i;
        if (gameDetails != null && (name = gameDetails.getName()) != null && (bo1Var = (bo1) this.a) != null) {
            ej5.c(o8i0.d(bo1Var), null, null, new ym1(bo1Var, name, null), 3);
        }
        bo1 bo1Var2 = (bo1) this.a;
        if (bo1Var2 != null && (sswVar5 = bo1Var2.z) != null) {
            sswVar5.f(getViewLifecycleOwner(), new g(new Function1() { // from class: seg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List list;
                    LoadingState loadingState = (LoadingState) obj;
                    if (fgg.a.a[loadingState.getStatus().ordinal()] == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (((hTTPResponse == null || (list = (List) hTTPResponse.getData()) == null) ? 0 : list.size()) > 0) {
                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                            List list2 = hTTPResponse2 != null ? (List) hTTPResponse2.getData() : null;
                            list2.getClass();
                            this.a.s0 = (ArrayList) list2;
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        bo1 bo1Var3 = (bo1) this.a;
        if (bo1Var3 != null && (sswVar4 = bo1Var3.d) != null) {
            sswVar4.f(getViewLifecycleOwner(), new g(new imb(this, c7 == true ? 1 : 0)));
        }
        E0();
        bo1 bo1Var4 = (bo1) this.a;
        if (bo1Var4 != null && (sswVar3 = bo1Var4.b) != null) {
            sswVar3.f(getViewLifecycleOwner(), new g(new Function1() { // from class: aeg
                /* JADX WARN: Code duplicated, block: B:23:0x0043  */
                /* JADX WARN: Code duplicated, block: B:25:0x0049  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jhg jhgVar9;
                    ssw<DetailResponse> sswVar7;
                    DetailResponse detailResponseD;
                    ssw<DetailResponse> sswVar8;
                    DetailResponse detailResponseD2;
                    ssw<DetailResponse> sswVar9;
                    DetailResponse detailResponseD3;
                    ssw<DetailResponse> sswVar10;
                    DetailResponse detailResponseD4;
                    ssw<DetailResponse> sswVar11;
                    DetailResponse detailResponseD5;
                    ssw<DetailResponse> sswVar12;
                    DetailResponse detailResponseD6;
                    jhg jhgVar10;
                    Double d2 = (Double) obj;
                    fgg fggVar = this.a;
                    if (d2 != null) {
                        if (fggVar.E != null) {
                            double dDoubleValue = d2.doubleValue();
                            Double d3 = fggVar.E;
                            if (dDoubleValue < (d3 != null ? d3.doubleValue() : 0.0d) || d2.doubleValue() <= 0.0d) {
                                jhgVar10 = (jhg) fggVar.b;
                                if (jhgVar10 != null) {
                                    jhgVar10.b.setVisibility(8);
                                }
                            } else {
                                Double d4 = fggVar.E;
                                if ((d4 != null ? d4.doubleValue() : 0.0d) <= fggVar.i0) {
                                    jhg jhgVar11 = (jhg) fggVar.b;
                                    if (jhgVar11 != null) {
                                        jhgVar11.b.setVisibility(0);
                                    }
                                } else {
                                    jhgVar10 = (jhg) fggVar.b;
                                    if (jhgVar10 != null) {
                                        jhgVar10.b.setVisibility(8);
                                    }
                                }
                            }
                        } else {
                            jhgVar10 = (jhg) fggVar.b;
                            if (jhgVar10 != null) {
                                jhgVar10.b.setVisibility(8);
                            }
                        }
                    }
                    jhg jhgVar12 = (jhg) fggVar.b;
                    Double dValueOf = null;
                    if (jhgVar12 != null) {
                        BetChipContainer betChipContainer = jhgVar12.d;
                        bo1 bo1Var5 = (bo1) fggVar.a;
                        betChipContainer.setBetAmount(d2, (bo1Var5 == null || (sswVar12 = bo1Var5.i) == null || (detailResponseD6 = sswVar12.d()) == null) ? null : Double.valueOf(detailResponseD6.getMaxAmount()));
                    }
                    if (fggVar.I != 0) {
                        Double d5 = fggVar.E;
                        double dDoubleValue2 = d5 != null ? d5.doubleValue() : 0.0d;
                        bo1 bo1Var6 = (bo1) fggVar.a;
                        if (dDoubleValue2 >= ((bo1Var6 == null || (sswVar11 = bo1Var6.i) == null || (detailResponseD5 = sswVar11.d()) == null) ? 0.0d : detailResponseD5.getDefaultAmount()) || fggVar.I != 0) {
                            jhg jhgVar13 = (jhg) fggVar.b;
                            if (jhgVar13 != null) {
                                jhgVar13.c.setBetAmount(d2, fggVar.W);
                            }
                            if (d2 != null) {
                                double dDoubleValue3 = d2.doubleValue();
                                jhg jhgVar14 = (jhg) fggVar.b;
                                if (jhgVar14 != null) {
                                    jhgVar14.i.setBetAmount(dDoubleValue3, fggVar.W);
                                }
                            }
                        } else {
                            Double d6 = fggVar.E;
                            double dDoubleValue4 = d6 != null ? d6.doubleValue() : 0.0d;
                            bo1 bo1Var7 = (bo1) fggVar.a;
                            double minAmount = (bo1Var7 == null || (sswVar10 = bo1Var7.i) == null || (detailResponseD4 = sswVar10.d()) == null) ? 0.0d : detailResponseD4.getMinAmount();
                            B b2 = fggVar.b;
                            if (dDoubleValue4 < minAmount) {
                                jhg jhgVar15 = (jhg) b2;
                                if (jhgVar15 != null) {
                                    ChipSlider chipSlider = jhgVar15.i;
                                    DetailResponse detailResponse = fggVar.Y;
                                    Double dValueOf2 = detailResponse != null ? Double.valueOf(detailResponse.getMinAmount()) : null;
                                    bo1 bo1Var8 = (bo1) fggVar.a;
                                    Double dValueOf3 = (bo1Var8 == null || (sswVar9 = bo1Var8.i) == null || (detailResponseD3 = sswVar9.d()) == null) ? null : Double.valueOf(detailResponseD3.getMaxAmount());
                                    DetailResponse detailResponse2 = fggVar.Y;
                                    chipSlider.setConfiguration(dValueOf2, dValueOf3, detailResponse2 != null ? Double.valueOf(detailResponse2.getDefaultAmount()) : null);
                                }
                                jhg jhgVar16 = (jhg) fggVar.b;
                                if (jhgVar16 != null) {
                                    BetBoxContainer betBoxContainer = jhgVar16.c;
                                    bo1 bo1Var9 = (bo1) fggVar.a;
                                    if (bo1Var9 != null && (sswVar8 = bo1Var9.i) != null && (detailResponseD2 = sswVar8.d()) != null) {
                                        dValueOf = Double.valueOf(detailResponseD2.getMinAmount());
                                    }
                                    betBoxContainer.setBetAmount(dValueOf, fggVar.W);
                                }
                                jhg jhgVar17 = (jhg) fggVar.b;
                                if (jhgVar17 != null) {
                                    ChipSlider chipSlider2 = jhgVar17.i;
                                    bo1 bo1Var10 = (bo1) fggVar.a;
                                    chipSlider2.setBetAmount((bo1Var10 == null || (sswVar7 = bo1Var10.i) == null || (detailResponseD = sswVar7.d()) == null) ? 0.0d : detailResponseD.getMinAmount(), fggVar.W);
                                }
                            } else {
                                jhg jhgVar18 = (jhg) b2;
                                if (jhgVar18 != null) {
                                    jhgVar18.i.setSeekMax();
                                }
                                jhg jhgVar19 = (jhg) fggVar.b;
                                if (jhgVar19 != null) {
                                    jhgVar19.c.setBetAmount(fggVar.E, fggVar.W);
                                }
                                Double d7 = fggVar.E;
                                if (d7 != null) {
                                    double dDoubleValue5 = d7.doubleValue();
                                    jhg jhgVar20 = (jhg) fggVar.b;
                                    if (jhgVar20 != null) {
                                        jhgVar20.i.setBetAmount(dDoubleValue5, fggVar.W);
                                    }
                                }
                            }
                        }
                        double dDoubleValue6 = d2 != null ? d2.doubleValue() : 0.0d;
                        Double d8 = fggVar.E;
                        if (dDoubleValue6 >= (d8 != null ? d8.doubleValue() : 0.0d) * 0.8d) {
                            Double d9 = fggVar.E;
                            if ((d9 != null ? d9.doubleValue() : 0.0d) <= fggVar.i0 && (jhgVar9 = (jhg) fggVar.b) != null) {
                                jhgVar9.b.setVisibility(0);
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        z0().b.f(getViewLifecycleOwner(), new g(new reg(this, i3)));
        C0().b.f(getViewLifecycleOwner(), new g(new Function1() { // from class: deg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PromotionGiftsResponse promotionGiftsResponse;
                boolean z2;
                List<GiftItem> entityList;
                GiftItem giftItem;
                String currency;
                List<GiftItem> entityList2;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = fgg.a.a[loadingState.getStatus().ordinal()];
                fgg fggVar = this.a;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        fggVar.Z = promotionGiftsResponse;
                        if (fggVar.o0 == 1) {
                            try {
                                new brr();
                                GameDetails gameDetails2 = fggVar.i;
                                if (gameDetails2 != null) {
                                    gameDetails2.getDisplayName();
                                }
                                z2 = true;
                            } catch (NoSuchAlgorithmException e3) {
                                e3.printStackTrace();
                                z2 = false;
                            }
                            SharedPreferences sharedPreferences = fggVar.X;
                            if (sharedPreferences != null && !sharedPreferences.getBoolean("EVEN_ODD_ONE_TAP", false) && z2) {
                                zh60 zh60Var2 = fggVar.g0;
                                if (zh60Var2 == null) {
                                    Intrinsics.n("oneTapBetDialog");
                                    throw null;
                                }
                                if (!zh60Var2.isShowing()) {
                                    Context context3 = fggVar.getContext();
                                    String string2 = context3 != null ? context3.getString(R.string.one_tap_choice_label) : null;
                                    if (string2 != null) {
                                        fggVar.f0 = true;
                                        e activity3 = fggVar.getActivity();
                                        if (activity3 != null) {
                                            Intent intent = new Intent(activity3, (Class<?>) SGConfirmDialogActivity.class);
                                            op5 op5Var2 = op5.a;
                                            String string3 = activity3.getString(R.string.otb_dialog_msg_cms);
                                            string3.getClass();
                                            op5Var2.getClass();
                                            intent.putExtra(EventKeys.ERROR_MESSAGE, op5.b(string3, string2, null));
                                            String string4 = activity3.getString(R.string.yes_btn_cms);
                                            string4.getClass();
                                            String string5 = fggVar.getString(R.string.yes_bet);
                                            string5.getClass();
                                            intent.putExtra("positive", op5.b(string4, string5, null));
                                            String string6 = activity3.getString(R.string.no_btn_cms);
                                            string6.getClass();
                                            String string7 = fggVar.getString(R.string.no_bet);
                                            string7.getClass();
                                            intent.putExtra("negative", op5.b(string6, string7, null));
                                            intent.putExtra("color", R.color.toolbar_strip_even_odd);
                                            intent.putExtra("cancel_btn_color", activity3.getColor(R.color.redblack_confirm_dialog_left_button));
                                            intent.putExtra("confirm_btn_color", activity3.getColor(R.color.redblack_confirm_dialog_right_button));
                                            if (fggVar.getLifecycle().b().compareTo(s9s.b.e) >= 0) {
                                                fggVar.startActivityForResult(intent, HttpStatusCodesKt.HTTP_EARLY_HINTS);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = fggVar.Z;
                        if (promotionGiftsResponse2 == null || (entityList2 = promotionGiftsResponse2.getEntityList()) == null || !entityList2.isEmpty() || fggVar.o0 != 1) {
                            PromotionGiftsResponse promotionGiftsResponse3 = fggVar.Z;
                            if (promotionGiftsResponse3 != null && (entityList = promotionGiftsResponse3.getEntityList()) != null && (!entityList.isEmpty()) && fggVar.o0 == 1) {
                                PromotionGiftsResponse promotionGiftsResponse4 = fggVar.Z;
                                List<GiftItem> entityList3 = promotionGiftsResponse4 != null ? promotionGiftsResponse4.getEntityList() : null;
                                if (entityList3 != null && !entityList3.isEmpty()) {
                                    PromotionGiftsResponse promotionGiftsResponse5 = fggVar.Z;
                                    List<GiftItem> entityList4 = promotionGiftsResponse5 != null ? promotionGiftsResponse5.getEntityList() : null;
                                    if (entityList4 == null) {
                                        entityList4 = m2g.a;
                                    }
                                    entityList4.getClass();
                                    Iterator<T> it = entityList4.iterator();
                                    double curBal = 0.0d;
                                    while (it.hasNext()) {
                                        curBal += ((GiftItem) it.next()).getCurBal();
                                    }
                                    PromotionGiftsResponse promotionGiftsResponse6 = fggVar.Z;
                                    List<GiftItem> entityList5 = promotionGiftsResponse6 != null ? promotionGiftsResponse6.getEntityList() : null;
                                    if (entityList5 != null && (giftItem = entityList5.get(0)) != null && (currency = giftItem.getCurrency()) != null) {
                                        op5.a.getClass();
                                        String strI2 = op5.i(currency);
                                        jhg jhgVar9 = (jhg) fggVar.b;
                                        if (jhgVar9 != null) {
                                            GiftToast.setToastText$default(jhgVar9.L, strI2, curBal, null, 4, null);
                                        }
                                        jhg jhgVar10 = (jhg) fggVar.b;
                                        if (jhgVar10 != null) {
                                            jhgVar10.L.setClickable(true);
                                        }
                                        jbh.a.j(new FbgData(true, Double.valueOf(curBal), strI2));
                                    }
                                    jhg jhgVar11 = (jhg) fggVar.b;
                                    if (jhgVar11 != null) {
                                        jhgVar11.L.setVisibility(0);
                                    }
                                    jhg jhgVar12 = (jhg) fggVar.b;
                                    if (jhgVar12 != null) {
                                        jhgVar12.L.startAnimation(AnimationUtils.loadAnimation(fggVar.getContext(), R.anim.fade_in_fade_out_toast));
                                    }
                                }
                                ej5.c(ebs.a(fggVar.getLifecycle()), null, null, new hgg(fggVar, null), 3);
                                fggVar.o0 = 0;
                            }
                        } else {
                            fggVar.o0 = 0;
                        }
                        PromotionGiftsResponse promotionGiftsResponse7 = fggVar.Z;
                        List<GiftItem> entityList6 = promotionGiftsResponse7 != null ? promotionGiftsResponse7.getEntityList() : null;
                        if (entityList6 == null || entityList6.isEmpty()) {
                            jhg jhgVar13 = (jhg) fggVar.b;
                            if (jhgVar13 != null) {
                                jhgVar13.d.F(fggVar.W);
                            }
                        } else {
                            jhg jhgVar14 = (jhg) fggVar.b;
                            if (jhgVar14 != null) {
                                BetChipContainer betChipContainer = jhgVar14.d;
                                ArrayList<Double> arrayList2 = fggVar.W;
                                ArrayList<Double> arrayList3 = new ArrayList<>();
                                arrayList3.add(Double.valueOf(-1.0d));
                                if (arrayList2 != null) {
                                    arrayList3.addAll(arrayList2);
                                }
                                betChipContainer.F(arrayList3);
                            }
                        }
                    }
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    fggVar.o0 = 0;
                }
                return Unit.a;
            }
        }));
        C0().c.f(getViewLifecycleOwner(), new g(new Function1() { // from class: beg
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PromotionGiftsResponse promotionGiftsResponse;
                jhg jhgVar9;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = fgg.a.a[loadingState.getStatus().ordinal()];
                fgg fggVar = this.a;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        fggVar.C0().c.l(fggVar.getViewLifecycleOwner());
                        fggVar.Z = promotionGiftsResponse;
                        jhg jhgVar10 = (jhg) fggVar.b;
                        if (jhgVar10 != null) {
                            jhgVar10.W.P();
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = fggVar.Z;
                        List<GiftItem> entityList = promotionGiftsResponse2 != null ? promotionGiftsResponse2.getEntityList() : null;
                        if (entityList == null || entityList.isEmpty()) {
                            jhg jhgVar11 = (jhg) fggVar.b;
                            if (jhgVar11 != null) {
                                jhgVar11.d.setChipList(fggVar.W);
                            }
                        } else {
                            jhg jhgVar12 = (jhg) fggVar.b;
                            if (jhgVar12 != null) {
                                BetChipContainer betChipContainer = jhgVar12.d;
                                ArrayList<Double> arrayList2 = fggVar.W;
                                ArrayList<Double> arrayList3 = new ArrayList<>();
                                arrayList3.add(Double.valueOf(-1.0d));
                                if (arrayList2 != null) {
                                    arrayList3.addAll(arrayList2);
                                }
                                betChipContainer.setChipList(arrayList3);
                            }
                        }
                    }
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    jhg jhgVar13 = (jhg) fggVar.b;
                    if (jhgVar13 != null) {
                        jhgVar13.W.P();
                    }
                    ArrayList<Double> arrayList4 = fggVar.W;
                    if (arrayList4 != null && (jhgVar9 = (jhg) fggVar.b) != null) {
                        jhgVar9.d.setChipList(arrayList4);
                    }
                }
                return Unit.a;
            }
        }));
        bo1 bo1Var5 = (bo1) this.a;
        if (bo1Var5 != null && (sswVar2 = bo1Var5.f) != null) {
            sswVar2.f(getViewLifecycleOwner(), new g(new Function1() { // from class: eeg
                /* JADX WARN: Code duplicated, block: B:131:0x024d  */
                /* JADX WARN: Code duplicated, block: B:133:0x0253  */
                /* JADX WARN: Code duplicated, block: B:136:0x0260  */
                /* JADX WARN: Code duplicated, block: B:141:0x0275  */
                /* JADX WARN: Code duplicated, block: B:165:0x02c6  */
                /* JADX WARN: Code duplicated, block: B:167:0x02cc  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jhg jhgVar9;
                    jhg jhgVar10;
                    jhg jhgVar11;
                    AppCompatImageView redMark;
                    DetailResponse detailResponse;
                    DetailResponse detailResponse2;
                    DetailResponse detailResponse3;
                    DetailResponse detailResponse4;
                    DetailResponse detailResponse5;
                    double dDoubleValue;
                    DetailResponse detailResponse6;
                    double defaultAmount;
                    DetailResponse detailResponse7;
                    DetailResponse detailResponse8;
                    DetailResponse detailResponse9;
                    DetailResponse detailResponse10;
                    DetailResponse detailResponse11;
                    DetailResponse detailResponse12;
                    DetailResponse detailResponse13;
                    DetailResponse detailResponse14;
                    DetailResponse detailResponse15;
                    DetailResponse detailResponse16;
                    DetailResponse detailResponse17;
                    DetailResponse detailResponse18;
                    DetailResponse detailResponse19;
                    DetailResponse detailResponse20;
                    DetailResponse detailResponse21;
                    AppCompatImageView redMark2;
                    jhg jhgVar12;
                    AppCompatImageView redMark3;
                    DetailResponse detailResponse22;
                    DetailResponse detailResponse23;
                    DetailResponse detailResponse24;
                    DetailResponse detailResponse25;
                    DetailResponse detailResponse26;
                    DetailResponse detailResponse27;
                    DetailResponse detailResponse28;
                    DetailResponse detailResponse29;
                    DetailResponse detailResponse30;
                    DetailResponse detailResponse31;
                    DetailResponse detailResponse32;
                    DetailResponse detailResponse33;
                    DetailResponse detailResponse34;
                    DetailResponse detailResponse35;
                    DetailResponse detailResponse36;
                    DetailResponse detailResponse37;
                    DetailResponse detailResponse38;
                    DetailResponse detailResponse39;
                    DetailResponse detailResponse40;
                    DetailResponse detailResponse41;
                    DetailResponse detailResponse42;
                    DetailResponse detailResponse43;
                    jhg jhgVar13;
                    DetailResponse detailResponse44;
                    AppCompatImageView redMark4;
                    DetailResponse detailResponse45;
                    DetailResponse detailResponse46;
                    DetailResponse detailResponse47;
                    DetailResponse detailResponse48;
                    DetailResponse detailResponse49;
                    DetailResponse detailResponse50;
                    DetailResponse detailResponse51;
                    ssw<LoadingState<HTTPResponse<List<ChatRoomResponse>>>> sswVar7;
                    String name2;
                    bo1 bo1Var6;
                    Integer code;
                    jhg jhgVar14;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = fgg.a.a[loadingState.getStatus().ordinal()];
                    final fgg fggVar = this.a;
                    ArrayList<Double> betChipList = null;
                    if (i5 == 1) {
                        if (fggVar.w0) {
                            fggVar.C0().x1();
                            Unit unit = Unit.a;
                        } else {
                            fggVar.w0 = true;
                            jhg jhgVar15 = (jhg) fggVar.b;
                            if (jhgVar15 != null) {
                                jhgVar15.W.P();
                                Unit unit2 = Unit.a;
                            }
                        }
                        jhg jhgVar16 = (jhg) fggVar.b;
                        if (jhgVar16 != null) {
                            jhgVar16.W.P();
                            Unit unit3 = Unit.a;
                        }
                        GameDetails gameDetails2 = fggVar.i;
                        if (gameDetails2 != null && (name2 = gameDetails2.getName()) != null && (bo1Var6 = (bo1) fggVar.a) != null) {
                            ej5.c(o8i0.d(bo1Var6), null, null, new sm1(bo1Var6, name2, null), 3);
                            Unit unit4 = Unit.a;
                        }
                        bo1 bo1Var7 = (bo1) fggVar.a;
                        if (bo1Var7 != null && (sswVar7 = bo1Var7.y) != null) {
                            sswVar7.f(fggVar.getViewLifecycleOwner(), new fgg.g(new Function1() { // from class: rfg
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj2) {
                                    AppCompatImageView chat2;
                                    String chatRoomId;
                                    AppCompatImageView chat3;
                                    AppCompatImageView chat4;
                                    List list;
                                    ChatRoomResponse chatRoomResponse;
                                    String botUserId;
                                    List list2;
                                    ChatRoomResponse chatRoomResponse2;
                                    List list3;
                                    AppCompatImageView chat5;
                                    LoadingState loadingState2 = (LoadingState) obj2;
                                    boolean z2 = true;
                                    if (fgg.a.a[loadingState2.getStatus().ordinal()] == 1) {
                                        fgg fggVar2 = fggVar;
                                        jhg jhgVar17 = (jhg) fggVar2.b;
                                        boolean z3 = (jhgVar17 == null || (chat5 = jhgVar17.J.getChat()) == null || chat5.getVisibility() != 0) ? false : true;
                                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState2.getData();
                                        if (((hTTPResponse == null || (list3 = (List) hTTPResponse.getData()) == null) ? 0 : list3.size()) > 0) {
                                            HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState2.getData();
                                            String str3 = "";
                                            if (hTTPResponse2 == null || (list2 = (List) hTTPResponse2.getData()) == null || (chatRoomResponse2 = (ChatRoomResponse) list2.get(0)) == null || (chatRoomId = chatRoomResponse2.getChatRoomId()) == null) {
                                                chatRoomId = "";
                                            }
                                            fggVar2.d = chatRoomId;
                                            HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState2.getData();
                                            if (hTTPResponse3 != null && (list = (List) hTTPResponse3.getData()) != null && (chatRoomResponse = (ChatRoomResponse) list.get(0)) != null && (botUserId = chatRoomResponse.getBotUserId()) != null) {
                                                str3 = botUserId;
                                            }
                                            fggVar2.e = str3;
                                            jhg jhgVar18 = (jhg) fggVar2.b;
                                            if (jhgVar18 != null && (chat4 = jhgVar18.J.getChat()) != null) {
                                                chat4.setVisibility(0);
                                            }
                                            jhg jhgVar19 = (jhg) fggVar2.b;
                                            if (jhgVar19 != null && (chat3 = jhgVar19.J.getChat()) != null) {
                                                chat3.setImageDrawable(fggVar2.requireContext().getDrawable(R.drawable.chat_eo));
                                            }
                                        } else {
                                            jhg jhgVar20 = (jhg) fggVar2.b;
                                            if (jhgVar20 != null && (chat2 = jhgVar20.J.getChat()) != null) {
                                                chat2.setVisibility(8);
                                            }
                                            z2 = false;
                                        }
                                        if (z3 != z2) {
                                            jhg jhgVar21 = (jhg) fggVar2.b;
                                            FrameLayout frameLayout = jhgVar21 != null ? jhgVar21.T : null;
                                            FragmentManager childFragmentManager = fggVar2.getChildFragmentManager();
                                            childFragmentManager.getClass();
                                            if (frameLayout != null && frameLayout.getVisibility() == 0 && childFragmentManager.G(R.id.onboarding_images) != null) {
                                                if (yju.a("br")) {
                                                    nle nleVar = fggVar2.z0;
                                                    if (nleVar != null && !nleVar.isShowing()) {
                                                        fggVar2.F0();
                                                    }
                                                } else {
                                                    fggVar2.F0();
                                                }
                                            }
                                        }
                                    }
                                    return Unit.a;
                                }
                            }));
                        }
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        fggVar.W = (hTTPResponse == null || (detailResponse51 = (DetailResponse) hTTPResponse.getData()) == null) ? null : detailResponse51.getBetChipList();
                        o530 o530VarC0 = fggVar.C0();
                        ej5.c(o8i0.d(o530VarC0), null, null, new u530(o530VarC0, null), 3);
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        fggVar.i0 = (hTTPResponse2 == null || (detailResponse50 = (DetailResponse) hTTPResponse2.getData()) == null) ? 0.0d : detailResponse50.getMaxAmount();
                        HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                        fggVar.Y = hTTPResponse3 != null ? (DetailResponse) hTTPResponse3.getData() : null;
                        jhg jhgVar17 = (jhg) fggVar.b;
                        if (jhgVar17 != null) {
                            BetChipContainer betChipContainer = jhgVar17.d;
                            HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                            Double dValueOf = (hTTPResponse4 == null || (detailResponse49 = (DetailResponse) hTTPResponse4.getData()) == null) ? null : Double.valueOf(detailResponse49.getMinAmount());
                            HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                            betChipContainer.setMinMaxChip(dValueOf, (hTTPResponse5 == null || (detailResponse48 = (DetailResponse) hTTPResponse5.getData()) == null) ? null : Double.valueOf(detailResponse48.getMaxAmount()));
                            Unit unit5 = Unit.a;
                        }
                        HTTPResponse hTTPResponse6 = (HTTPResponse) loadingState.getData();
                        fggVar.L = (hTTPResponse6 == null || (detailResponse47 = (DetailResponse) hTTPResponse6.getData()) == null) ? 0.0d : detailResponse47.getMinAmount();
                        if (fggVar.E == null) {
                            jhgVar9 = (jhg) fggVar.b;
                            if (jhgVar9 != null) {
                                jhgVar9.b.setVisibility(8);
                                Unit unit6 = Unit.a;
                            }
                            jhgVar10 = (jhg) fggVar.b;
                            if (jhgVar10 != null && (redMark = jhgVar10.J.getRedMark()) != null) {
                                redMark.setVisibility(8);
                                Unit unit7 = Unit.a;
                            }
                            fggVar.l0 = R.drawable.hamberger_add_more_bg;
                            jhgVar11 = (jhg) fggVar.b;
                            if (jhgVar11 != null) {
                                jhgVar11.M.F(R.drawable.hamberger_add_more_bg);
                                Unit unit8 = Unit.a;
                            }
                        } else {
                            HTTPResponse hTTPResponse7 = (HTTPResponse) loadingState.getData();
                            double minAmount = (hTTPResponse7 == null || (detailResponse46 = (DetailResponse) hTTPResponse7.getData()) == null) ? 0.0d : detailResponse46.getMinAmount();
                            Double d2 = fggVar.E;
                            if (minAmount < (d2 != null ? d2.doubleValue() : 0.0d)) {
                                jhgVar9 = (jhg) fggVar.b;
                                if (jhgVar9 != null) {
                                    jhgVar9.b.setVisibility(8);
                                    Unit unit9 = Unit.a;
                                }
                                jhgVar10 = (jhg) fggVar.b;
                                if (jhgVar10 != null) {
                                    redMark.setVisibility(8);
                                    Unit unit10 = Unit.a;
                                }
                                fggVar.l0 = R.drawable.hamberger_add_more_bg;
                                jhgVar11 = (jhg) fggVar.b;
                                if (jhgVar11 != null) {
                                    jhgVar11.M.F(R.drawable.hamberger_add_more_bg);
                                    Unit unit11 = Unit.a;
                                }
                            } else {
                                Double d3 = fggVar.E;
                                if ((d3 != null ? d3.doubleValue() : 0.0d) > fggVar.i0) {
                                    jhgVar9 = (jhg) fggVar.b;
                                    if (jhgVar9 != null) {
                                        jhgVar9.b.setVisibility(8);
                                        Unit unit12 = Unit.a;
                                    }
                                    jhgVar10 = (jhg) fggVar.b;
                                    if (jhgVar10 != null) {
                                        redMark.setVisibility(8);
                                        Unit unit13 = Unit.a;
                                    }
                                    fggVar.l0 = R.drawable.hamberger_add_more_bg;
                                    jhgVar11 = (jhg) fggVar.b;
                                    if (jhgVar11 != null) {
                                        jhgVar11.M.F(R.drawable.hamberger_add_more_bg);
                                        Unit unit14 = Unit.a;
                                    }
                                } else {
                                    HTTPResponse hTTPResponse8 = (HTTPResponse) loadingState.getData();
                                    if (((hTTPResponse8 == null || (detailResponse45 = (DetailResponse) hTTPResponse8.getData()) == null) ? 0.0d : detailResponse45.getMinAmount()) > 0.0d) {
                                        jhg jhgVar18 = (jhg) fggVar.b;
                                        if (jhgVar18 != null) {
                                            jhgVar18.b.setVisibility(0);
                                            Unit unit15 = Unit.a;
                                        }
                                        jhg jhgVar19 = (jhg) fggVar.b;
                                        if (jhgVar19 != null && (redMark4 = jhgVar19.J.getRedMark()) != null) {
                                            redMark4.setVisibility(0);
                                            Unit unit16 = Unit.a;
                                        }
                                        fggVar.l0 = R.drawable.hamberger_add_more_red;
                                        jhg jhgVar20 = (jhg) fggVar.b;
                                        if (jhgVar20 != null) {
                                            jhgVar20.M.F(R.drawable.hamberger_add_more_red);
                                            Unit unit17 = Unit.a;
                                        }
                                        jhg jhgVar21 = (jhg) fggVar.b;
                                        if (jhgVar21 != null) {
                                            jhgVar21.F.setVisibility(0);
                                            Unit unit18 = Unit.a;
                                        }
                                        jhg jhgVar22 = (jhg) fggVar.b;
                                        if (jhgVar22 != null) {
                                            jhgVar22.c.setErrorBetAmount();
                                            Unit unit19 = Unit.a;
                                        }
                                    } else {
                                        jhgVar9 = (jhg) fggVar.b;
                                        if (jhgVar9 != null) {
                                            jhgVar9.b.setVisibility(8);
                                            Unit unit110 = Unit.a;
                                        }
                                        jhgVar10 = (jhg) fggVar.b;
                                        if (jhgVar10 != null) {
                                            redMark.setVisibility(8);
                                            Unit unit111 = Unit.a;
                                        }
                                        fggVar.l0 = R.drawable.hamberger_add_more_bg;
                                        jhgVar11 = (jhg) fggVar.b;
                                        if (jhgVar11 != null) {
                                            jhgVar11.M.F(R.drawable.hamberger_add_more_bg);
                                            Unit unit112 = Unit.a;
                                        }
                                    }
                                }
                            }
                        }
                        double d4 = fggVar.h0;
                        if (d4 > 0.0d) {
                            Double d5 = fggVar.E;
                            if (d5 == null || d4 < d5.doubleValue()) {
                                jhgVar13 = (jhg) fggVar.b;
                                if (jhgVar13 != null) {
                                    jhgVar13.b.setVisibility(8);
                                    Unit unit20 = Unit.a;
                                }
                            } else {
                                Double d6 = fggVar.E;
                                if ((d6 != null ? d6.doubleValue() : 0.0d) > fggVar.i0) {
                                    jhgVar13 = (jhg) fggVar.b;
                                    if (jhgVar13 != null) {
                                        jhgVar13.b.setVisibility(8);
                                        Unit unit21 = Unit.a;
                                    }
                                } else {
                                    HTTPResponse hTTPResponse9 = (HTTPResponse) loadingState.getData();
                                    if (((hTTPResponse9 == null || (detailResponse44 = (DetailResponse) hTTPResponse9.getData()) == null) ? 0.0d : detailResponse44.getMinAmount()) > 0.0d) {
                                        jhg jhgVar23 = (jhg) fggVar.b;
                                        if (jhgVar23 != null) {
                                            jhgVar23.b.setVisibility(0);
                                            Unit unit22 = Unit.a;
                                        }
                                    } else {
                                        jhgVar13 = (jhg) fggVar.b;
                                        if (jhgVar13 != null) {
                                            jhgVar13.b.setVisibility(8);
                                            Unit unit23 = Unit.a;
                                        }
                                    }
                                }
                            }
                        }
                        Double d7 = fggVar.E;
                        double dDoubleValue2 = d7 != null ? d7.doubleValue() : 0.0d;
                        HTTPResponse hTTPResponse10 = (HTTPResponse) loadingState.getData();
                        double maxAmount = (hTTPResponse10 == null || (detailResponse43 = (DetailResponse) hTTPResponse10.getData()) == null) ? 0.0d : detailResponse43.getMaxAmount();
                        B b2 = fggVar.b;
                        if (dDoubleValue2 < maxAmount) {
                            jhg jhgVar24 = (jhg) b2;
                            if (jhgVar24 != null) {
                                ChipSlider chipSlider = jhgVar24.i;
                                HTTPResponse hTTPResponse11 = (HTTPResponse) loadingState.getData();
                                Double dValueOf2 = (hTTPResponse11 == null || (detailResponse42 = (DetailResponse) hTTPResponse11.getData()) == null) ? null : Double.valueOf(detailResponse42.getMinAmount());
                                Double d8 = fggVar.E;
                                HTTPResponse hTTPResponse12 = (HTTPResponse) loadingState.getData();
                                chipSlider.setConfiguration(dValueOf2, d8, (hTTPResponse12 == null || (detailResponse41 = (DetailResponse) hTTPResponse12.getData()) == null) ? null : Double.valueOf(detailResponse41.getDefaultAmount()));
                                Unit unit24 = Unit.a;
                            }
                            Double d9 = fggVar.E;
                            double dDoubleValue3 = d9 != null ? d9.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse13 = (HTTPResponse) loadingState.getData();
                            if (dDoubleValue3 < ((hTTPResponse13 == null || (detailResponse40 = (DetailResponse) hTTPResponse13.getData()) == null) ? 0.0d : detailResponse40.getDefaultAmount())) {
                                Double d10 = fggVar.E;
                                double dDoubleValue4 = d10 != null ? d10.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse14 = (HTTPResponse) loadingState.getData();
                                double minAmount2 = (hTTPResponse14 == null || (detailResponse39 = (DetailResponse) hTTPResponse14.getData()) == null) ? 0.0d : detailResponse39.getMinAmount();
                                B b3 = fggVar.b;
                                if (dDoubleValue4 < minAmount2) {
                                    jhg jhgVar25 = (jhg) b3;
                                    if (jhgVar25 != null) {
                                        ChipSlider chipSlider2 = jhgVar25.i;
                                        HTTPResponse hTTPResponse15 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf3 = (hTTPResponse15 == null || (detailResponse38 = (DetailResponse) hTTPResponse15.getData()) == null) ? null : Double.valueOf(detailResponse38.getMinAmount());
                                        HTTPResponse hTTPResponse16 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf4 = (hTTPResponse16 == null || (detailResponse37 = (DetailResponse) hTTPResponse16.getData()) == null) ? null : Double.valueOf(detailResponse37.getMaxAmount());
                                        HTTPResponse hTTPResponse17 = (HTTPResponse) loadingState.getData();
                                        chipSlider2.setConfiguration(dValueOf3, dValueOf4, (hTTPResponse17 == null || (detailResponse36 = (DetailResponse) hTTPResponse17.getData()) == null) ? null : Double.valueOf(detailResponse36.getMinAmount()));
                                        Unit unit25 = Unit.a;
                                    }
                                    jhg jhgVar26 = (jhg) fggVar.b;
                                    if (jhgVar26 != null) {
                                        BetBoxContainer betBoxContainer = jhgVar26.c;
                                        HTTPResponse hTTPResponse18 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf5 = (hTTPResponse18 == null || (detailResponse35 = (DetailResponse) hTTPResponse18.getData()) == null) ? null : Double.valueOf(detailResponse35.getMinAmount());
                                        HTTPResponse hTTPResponse19 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer.setBetAmount(dValueOf5, (hTTPResponse19 == null || (detailResponse34 = (DetailResponse) hTTPResponse19.getData()) == null) ? null : detailResponse34.getBetChipList());
                                        Unit unit26 = Unit.a;
                                    }
                                    jhg jhgVar27 = (jhg) fggVar.b;
                                    if (jhgVar27 != null) {
                                        ChipSlider chipSlider3 = jhgVar27.i;
                                        HTTPResponse hTTPResponse20 = (HTTPResponse) loadingState.getData();
                                        double minAmount3 = (hTTPResponse20 == null || (detailResponse33 = (DetailResponse) hTTPResponse20.getData()) == null) ? 0.0d : detailResponse33.getMinAmount();
                                        HTTPResponse hTTPResponse21 = (HTTPResponse) loadingState.getData();
                                        chipSlider3.setBetAmount(minAmount3, (hTTPResponse21 == null || (detailResponse32 = (DetailResponse) hTTPResponse21.getData()) == null) ? null : detailResponse32.getBetChipList());
                                        Unit unit27 = Unit.a;
                                    }
                                } else {
                                    jhg jhgVar28 = (jhg) b3;
                                    if (jhgVar28 != null) {
                                        jhgVar28.i.setSeekMax();
                                        Unit unit28 = Unit.a;
                                    }
                                    jhg jhgVar29 = (jhg) fggVar.b;
                                    if (jhgVar29 != null) {
                                        BetBoxContainer betBoxContainer2 = jhgVar29.c;
                                        Double d11 = fggVar.E;
                                        HTTPResponse hTTPResponse22 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer2.setBetAmount(d11, (hTTPResponse22 == null || (detailResponse31 = (DetailResponse) hTTPResponse22.getData()) == null) ? null : detailResponse31.getBetChipList());
                                        Unit unit29 = Unit.a;
                                    }
                                }
                            } else {
                                jhg jhgVar30 = (jhg) fggVar.b;
                                if (jhgVar30 != null) {
                                    BetBoxContainer betBoxContainer3 = jhgVar30.c;
                                    HTTPResponse hTTPResponse23 = (HTTPResponse) loadingState.getData();
                                    Double dValueOf6 = (hTTPResponse23 == null || (detailResponse30 = (DetailResponse) hTTPResponse23.getData()) == null) ? null : Double.valueOf(detailResponse30.getDefaultAmount());
                                    HTTPResponse hTTPResponse24 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer3.setBetAmount(dValueOf6, (hTTPResponse24 == null || (detailResponse29 = (DetailResponse) hTTPResponse24.getData()) == null) ? null : detailResponse29.getBetChipList());
                                    Unit unit30 = Unit.a;
                                }
                            }
                        } else {
                            jhg jhgVar31 = (jhg) b2;
                            if (jhgVar31 != null) {
                                ChipSlider chipSlider4 = jhgVar31.i;
                                HTTPResponse hTTPResponse25 = (HTTPResponse) loadingState.getData();
                                Double dValueOf7 = (hTTPResponse25 == null || (detailResponse5 = (DetailResponse) hTTPResponse25.getData()) == null) ? null : Double.valueOf(detailResponse5.getMinAmount());
                                HTTPResponse hTTPResponse26 = (HTTPResponse) loadingState.getData();
                                Double dValueOf8 = (hTTPResponse26 == null || (detailResponse4 = (DetailResponse) hTTPResponse26.getData()) == null) ? null : Double.valueOf(detailResponse4.getMaxAmount());
                                HTTPResponse hTTPResponse27 = (HTTPResponse) loadingState.getData();
                                chipSlider4.setConfiguration(dValueOf7, dValueOf8, (hTTPResponse27 == null || (detailResponse3 = (DetailResponse) hTTPResponse27.getData()) == null) ? null : Double.valueOf(detailResponse3.getDefaultAmount()));
                                Unit unit31 = Unit.a;
                            }
                            jhg jhgVar32 = (jhg) fggVar.b;
                            if (jhgVar32 != null) {
                                BetBoxContainer betBoxContainer4 = jhgVar32.c;
                                HTTPResponse hTTPResponse28 = (HTTPResponse) loadingState.getData();
                                Double dValueOf9 = (hTTPResponse28 == null || (detailResponse2 = (DetailResponse) hTTPResponse28.getData()) == null) ? null : Double.valueOf(detailResponse2.getDefaultAmount());
                                HTTPResponse hTTPResponse29 = (HTTPResponse) loadingState.getData();
                                betBoxContainer4.setBetAmount(dValueOf9, (hTTPResponse29 == null || (detailResponse = (DetailResponse) hTTPResponse29.getData()) == null) ? null : detailResponse.getBetChipList());
                                Unit unit32 = Unit.a;
                            }
                        }
                        if (fggVar.I == 0) {
                            Double d12 = fggVar.E;
                            double dDoubleValue5 = d12 != null ? d12.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse30 = (HTTPResponse) loadingState.getData();
                            if (dDoubleValue5 <= ((hTTPResponse30 == null || (detailResponse28 = (DetailResponse) hTTPResponse30.getData()) == null) ? 0.0d : detailResponse28.getMinAmount())) {
                                HTTPResponse hTTPResponse31 = (HTTPResponse) loadingState.getData();
                                dDoubleValue = (hTTPResponse31 == null || (detailResponse27 = (DetailResponse) hTTPResponse31.getData()) == null) ? 0.0d : detailResponse27.getMaxAmount();
                            } else {
                                Double d13 = fggVar.E;
                                dDoubleValue = d13 != null ? d13.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse32 = (HTTPResponse) loadingState.getData();
                                double maxAmount2 = (hTTPResponse32 == null || (detailResponse6 = (DetailResponse) hTTPResponse32.getData()) == null) ? 0.0d : detailResponse6.getMaxAmount();
                                if (dDoubleValue > maxAmount2) {
                                    dDoubleValue = maxAmount2;
                                }
                            }
                            fggVar.K = dDoubleValue;
                            Double d14 = fggVar.E;
                            double dDoubleValue6 = d14 != null ? d14.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse33 = (HTTPResponse) loadingState.getData();
                            double minAmount4 = (hTTPResponse33 == null || (detailResponse26 = (DetailResponse) hTTPResponse33.getData()) == null) ? 0.0d : detailResponse26.getMinAmount();
                            Double d15 = fggVar.E;
                            if (dDoubleValue6 > minAmount4) {
                                defaultAmount = d15 != null ? d15.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse34 = (HTTPResponse) loadingState.getData();
                                double defaultAmount2 = (hTTPResponse34 == null || (detailResponse25 = (DetailResponse) hTTPResponse34.getData()) == null) ? 0.0d : detailResponse25.getDefaultAmount();
                                if (defaultAmount > defaultAmount2) {
                                    defaultAmount = defaultAmount2;
                                }
                                jhg jhgVar33 = (jhg) fggVar.b;
                                if (jhgVar33 != null) {
                                    ChipSlider chipSlider5 = jhgVar33.i;
                                    HTTPResponse hTTPResponse35 = (HTTPResponse) loadingState.getData();
                                    chipSlider5.setConfiguration((hTTPResponse35 == null || (detailResponse24 = (DetailResponse) hTTPResponse35.getData()) == null) ? null : Double.valueOf(detailResponse24.getMinAmount()), Double.valueOf(fggVar.K), Double.valueOf(defaultAmount));
                                    Unit unit33 = Unit.a;
                                }
                                jhg jhgVar34 = (jhg) fggVar.b;
                                if (jhgVar34 != null) {
                                    BetBoxContainer betBoxContainer5 = jhgVar34.c;
                                    Double dValueOf10 = Double.valueOf(defaultAmount);
                                    HTTPResponse hTTPResponse36 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer5.setBetAmount(dValueOf10, (hTTPResponse36 == null || (detailResponse23 = (DetailResponse) hTTPResponse36.getData()) == null) ? null : detailResponse23.getBetChipList());
                                    Unit unit34 = Unit.a;
                                }
                                jhg jhgVar35 = (jhg) fggVar.b;
                                if (jhgVar35 != null) {
                                    ChipSlider chipSlider6 = jhgVar35.i;
                                    HTTPResponse hTTPResponse37 = (HTTPResponse) loadingState.getData();
                                    if (hTTPResponse37 != null && (detailResponse22 = (DetailResponse) hTTPResponse37.getData()) != null) {
                                        betChipList = detailResponse22.getBetChipList();
                                    }
                                    chipSlider6.setBetAmount(defaultAmount, betChipList);
                                    Unit unit35 = Unit.a;
                                }
                                fggVar.M = defaultAmount;
                            } else {
                                double dDoubleValue7 = d15 != null ? d15.doubleValue() : 0.0d;
                                HTTPResponse hTTPResponse38 = (HTTPResponse) loadingState.getData();
                                double defaultAmount3 = (hTTPResponse38 == null || (detailResponse21 = (DetailResponse) hTTPResponse38.getData()) == null) ? 0.0d : detailResponse21.getDefaultAmount();
                                B b4 = fggVar.b;
                                if (dDoubleValue7 < defaultAmount3) {
                                    jhg jhgVar36 = (jhg) b4;
                                    if (jhgVar36 != null) {
                                        ChipSlider chipSlider7 = jhgVar36.i;
                                        HTTPResponse hTTPResponse39 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf11 = (hTTPResponse39 == null || (detailResponse20 = (DetailResponse) hTTPResponse39.getData()) == null) ? null : Double.valueOf(detailResponse20.getMinAmount());
                                        Double dValueOf12 = Double.valueOf(fggVar.K);
                                        HTTPResponse hTTPResponse40 = (HTTPResponse) loadingState.getData();
                                        chipSlider7.setConfiguration(dValueOf11, dValueOf12, (hTTPResponse40 == null || (detailResponse19 = (DetailResponse) hTTPResponse40.getData()) == null) ? null : Double.valueOf(detailResponse19.getMinAmount()));
                                        Unit unit36 = Unit.a;
                                    }
                                    jhg jhgVar37 = (jhg) fggVar.b;
                                    if (jhgVar37 != null) {
                                        BetBoxContainer betBoxContainer6 = jhgVar37.c;
                                        HTTPResponse hTTPResponse41 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf13 = (hTTPResponse41 == null || (detailResponse18 = (DetailResponse) hTTPResponse41.getData()) == null) ? null : Double.valueOf(detailResponse18.getMinAmount());
                                        HTTPResponse hTTPResponse42 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer6.setBetAmount(dValueOf13, (hTTPResponse42 == null || (detailResponse17 = (DetailResponse) hTTPResponse42.getData()) == null) ? null : detailResponse17.getBetChipList());
                                        Unit unit37 = Unit.a;
                                    }
                                    jhg jhgVar38 = (jhg) fggVar.b;
                                    if (jhgVar38 != null) {
                                        ChipSlider chipSlider8 = jhgVar38.i;
                                        HTTPResponse hTTPResponse43 = (HTTPResponse) loadingState.getData();
                                        double minAmount5 = (hTTPResponse43 == null || (detailResponse16 = (DetailResponse) hTTPResponse43.getData()) == null) ? 0.0d : detailResponse16.getMinAmount();
                                        HTTPResponse hTTPResponse44 = (HTTPResponse) loadingState.getData();
                                        if (hTTPResponse44 != null && (detailResponse15 = (DetailResponse) hTTPResponse44.getData()) != null) {
                                            betChipList = detailResponse15.getBetChipList();
                                        }
                                        chipSlider8.setBetAmount(minAmount5, betChipList);
                                        Unit unit38 = Unit.a;
                                    }
                                    HTTPResponse hTTPResponse45 = (HTTPResponse) loadingState.getData();
                                    defaultAmount = (hTTPResponse45 == null || (detailResponse14 = (DetailResponse) hTTPResponse45.getData()) == null) ? 0.0d : detailResponse14.getMinAmount();
                                    fggVar.M = defaultAmount;
                                } else {
                                    jhg jhgVar39 = (jhg) b4;
                                    if (jhgVar39 != null) {
                                        ChipSlider chipSlider9 = jhgVar39.i;
                                        HTTPResponse hTTPResponse46 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf14 = (hTTPResponse46 == null || (detailResponse13 = (DetailResponse) hTTPResponse46.getData()) == null) ? null : Double.valueOf(detailResponse13.getMinAmount());
                                        Double dValueOf15 = Double.valueOf(fggVar.K);
                                        HTTPResponse hTTPResponse47 = (HTTPResponse) loadingState.getData();
                                        chipSlider9.setConfiguration(dValueOf14, dValueOf15, (hTTPResponse47 == null || (detailResponse12 = (DetailResponse) hTTPResponse47.getData()) == null) ? null : Double.valueOf(detailResponse12.getDefaultAmount()));
                                        Unit unit39 = Unit.a;
                                    }
                                    jhg jhgVar40 = (jhg) fggVar.b;
                                    if (jhgVar40 != null) {
                                        BetBoxContainer betBoxContainer7 = jhgVar40.c;
                                        HTTPResponse hTTPResponse48 = (HTTPResponse) loadingState.getData();
                                        Double dValueOf16 = (hTTPResponse48 == null || (detailResponse11 = (DetailResponse) hTTPResponse48.getData()) == null) ? null : Double.valueOf(detailResponse11.getDefaultAmount());
                                        HTTPResponse hTTPResponse49 = (HTTPResponse) loadingState.getData();
                                        betBoxContainer7.setBetAmount(dValueOf16, (hTTPResponse49 == null || (detailResponse10 = (DetailResponse) hTTPResponse49.getData()) == null) ? null : detailResponse10.getBetChipList());
                                        Unit unit40 = Unit.a;
                                    }
                                    jhg jhgVar41 = (jhg) fggVar.b;
                                    if (jhgVar41 != null) {
                                        ChipSlider chipSlider10 = jhgVar41.i;
                                        HTTPResponse hTTPResponse50 = (HTTPResponse) loadingState.getData();
                                        double defaultAmount4 = (hTTPResponse50 == null || (detailResponse9 = (DetailResponse) hTTPResponse50.getData()) == null) ? 0.0d : detailResponse9.getDefaultAmount();
                                        HTTPResponse hTTPResponse51 = (HTTPResponse) loadingState.getData();
                                        if (hTTPResponse51 != null && (detailResponse8 = (DetailResponse) hTTPResponse51.getData()) != null) {
                                            betChipList = detailResponse8.getBetChipList();
                                        }
                                        chipSlider10.setBetAmount(defaultAmount4, betChipList);
                                        Unit unit41 = Unit.a;
                                    }
                                    HTTPResponse hTTPResponse52 = (HTTPResponse) loadingState.getData();
                                    defaultAmount = (hTTPResponse52 == null || (detailResponse7 = (DetailResponse) hTTPResponse52.getData()) == null) ? 0.0d : detailResponse7.getDefaultAmount();
                                    fggVar.M = defaultAmount;
                                }
                            }
                            Double d16 = fggVar.E;
                            if (defaultAmount > (d16 != null ? d16.doubleValue() : 0.0d)) {
                                jhg jhgVar42 = (jhg) fggVar.b;
                                if (jhgVar42 != null && (redMark3 = jhgVar42.J.getRedMark()) != null) {
                                    redMark3.setVisibility(0);
                                    Unit unit42 = Unit.a;
                                }
                                fggVar.l0 = R.drawable.hamberger_add_more_red;
                                jhg jhgVar43 = (jhg) fggVar.b;
                                if (jhgVar43 != null) {
                                    jhgVar43.M.F(R.drawable.hamberger_add_more_red);
                                    Unit unit43 = Unit.a;
                                }
                                jhg jhgVar44 = (jhg) fggVar.b;
                                if (jhgVar44 != null) {
                                    jhgVar44.F.setVisibility(0);
                                    Unit unit44 = Unit.a;
                                }
                                jhg jhgVar45 = (jhg) fggVar.b;
                                if (jhgVar45 != null) {
                                    jhgVar45.c.setErrorBetAmount();
                                    Unit unit45 = Unit.a;
                                }
                            } else {
                                double d17 = fggVar.M;
                                Double d18 = fggVar.E;
                                if (d17 >= (d18 != null ? d18.doubleValue() : 0.0d)) {
                                    Double d19 = fggVar.E;
                                    if ((d19 != null ? d19.doubleValue() : 0.0d) <= fggVar.i0 && (jhgVar12 = (jhg) fggVar.b) != null) {
                                        jhgVar12.b.setVisibility(0);
                                        Unit unit46 = Unit.a;
                                    }
                                }
                                jhg jhgVar46 = (jhg) fggVar.b;
                                if (jhgVar46 != null && (redMark2 = jhgVar46.J.getRedMark()) != null) {
                                    redMark2.setVisibility(8);
                                    Unit unit47 = Unit.a;
                                }
                                fggVar.l0 = R.drawable.hamberger_add_more_bg;
                                jhg jhgVar47 = (jhg) fggVar.b;
                                if (jhgVar47 != null) {
                                    jhgVar47.M.F(R.drawable.hamberger_add_more_bg);
                                    Unit unit48 = Unit.a;
                                }
                                jhg jhgVar48 = (jhg) fggVar.b;
                                if (jhgVar48 != null) {
                                    jhgVar48.F.setVisibility(4);
                                    Unit unit49 = Unit.a;
                                }
                                jhg jhgVar49 = (jhg) fggVar.b;
                                if (jhgVar49 != null) {
                                    jhgVar49.c.setErrorBetAmountLayout();
                                    Unit unit50 = Unit.a;
                                }
                            }
                        }
                        fggVar.I0();
                        Unit unit51 = Unit.a;
                    } else if (i5 != 3) {
                        Unit unit52 = Unit.a;
                    } else {
                        Context context3 = fggVar.getContext();
                        if (context3 != null) {
                            if (!fggVar.w0 && (jhgVar14 = (jhg) fggVar.b) != null) {
                                jhgVar14.W.O(100);
                                Unit unit53 = Unit.a;
                            }
                            e activity3 = fggVar.getActivity();
                            if (activity3 != null) {
                                ResultWrapper.GenericError error = loadingState.getError();
                                if (error == null || (code = error.getCode()) == null || code.intValue() != 403 || fggVar.p0) {
                                    fdg fdgVar = fdg.e;
                                    fggVar.D0();
                                    jcg.d(fdgVar, activity3, "Even-Odd", loadingState.getError(), new cfg(fggVar, 0), null, null, 0, context3.getColor(R.color.try_again_color), null, null, null, new dfg(fggVar, 0), null, 97760);
                                } else {
                                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                                    fggVar.p0 = true;
                                }
                                Unit unit54 = Unit.a;
                            }
                            Unit unit55 = Unit.a;
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        bo1 bo1Var6 = (bo1) this.a;
        if (bo1Var6 != null && (sswVar = bo1Var6.e) != null) {
            sswVar.f(getViewLifecycleOwner(), new g(new peg(this, c6 == true ? 1 : 0)));
        }
        jhg jhgVar9 = (jhg) this.b;
        if (jhgVar9 != null) {
            jhgVar9.W.E(this.r0, this.v0, this.u0, this.y0);
        }
        jhg jhgVar10 = (jhg) this.b;
        if (jhgVar10 != null) {
            jhgVar10.J.setAlpha(0.5f);
        }
        jhg jhgVar11 = (jhg) this.b;
        if (jhgVar11 != null) {
            jhgVar11.D.setScrimColor(requireContext().getColor(R.color.trans_black_60));
        }
        jhg jhgVar12 = (jhg) this.b;
        if (jhgVar12 != null) {
            jhgVar12.J.setNavigationListener(new dlb(this, c5 == true ? 1 : 0));
        }
        jhg jhgVar13 = (jhg) this.b;
        if (jhgVar13 != null && (chat = jhgVar13.J.getChat()) != null) {
            chat.setOnClickListener(new View.OnClickListener() { // from class: egg
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    fgg fggVar = this.a;
                    try {
                        fggVar.c = true;
                        fggVar.f0 = true;
                        Intent intent = new Intent(fggVar.requireContext(), (Class<?>) ChatActivity.class);
                        intent.putExtra("roomId", fggVar.d);
                        intent.putExtra("botId", fggVar.e);
                        intent.putExtra("color", R.color.toolbar_strip_bottle);
                        GameDetails gameDetails2 = fggVar.i;
                        intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails2 != null ? gameDetails2.getName() : null);
                        intent.putExtra("sound", fggVar.i);
                        SharedPreferences sharedPreferences = fggVar.X;
                        intent.putExtra("soundOn", sharedPreferences != null ? sharedPreferences.getBoolean("EVEN_ODD_SOUND", false) : false);
                        fggVar.requireActivity().overridePendingTransition(R.anim.slide_in_up, R.anim.slide_in_up);
                        fggVar.requireContext().startActivity(intent);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            });
        }
        jhg jhgVar14 = (jhg) this.b;
        if (jhgVar14 != null) {
            jhgVar14.w.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        }
        jhg jhgVar15 = (jhg) this.b;
        if (jhgVar15 != null && (holder3 = jhgVar15.w.getHolder()) != null) {
            holder3.setFormat(-3);
        }
        jhg jhgVar16 = (jhg) this.b;
        if (jhgVar16 != null) {
            jhgVar16.y.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        }
        jhg jhgVar17 = (jhg) this.b;
        if (jhgVar17 != null && (holder2 = jhgVar17.y.getHolder()) != null) {
            holder2.setFormat(-3);
        }
        jhg jhgVar18 = (jhg) this.b;
        if (jhgVar18 != null) {
            jhgVar18.z.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        }
        jhg jhgVar19 = (jhg) this.b;
        if (jhgVar19 != null && (holder = jhgVar19.z.getHolder()) != null) {
            holder.setFormat(-3);
        }
        Context context3 = getContext();
        if (context3 != null) {
            this.b0 = new ppe(context3, this);
            this.c0 = new mpe(context3, this);
            this.d0 = new npe(context3, this);
        }
        jhg jhgVar20 = (jhg) this.b;
        if (jhgVar20 != null) {
            GLSurfaceView gLSurfaceView = jhgVar20.w;
            ppe ppeVar = this.b0;
            if (ppeVar == null) {
                Intrinsics.n("cubeRender1");
                throw null;
            }
            gLSurfaceView.setRenderer(ppeVar);
        }
        jhg jhgVar21 = (jhg) this.b;
        if (jhgVar21 != null) {
            jhgVar21.w.setZOrderOnTop(true);
        }
        jhg jhgVar22 = (jhg) this.b;
        if (jhgVar22 != null) {
            jhgVar22.y.setZOrderOnTop(true);
        }
        jhg jhgVar23 = (jhg) this.b;
        if (jhgVar23 != null) {
            jhgVar23.z.setZOrderOnTop(true);
        }
        jhg jhgVar24 = (jhg) this.b;
        if (jhgVar24 != null) {
            GLSurfaceView gLSurfaceView2 = jhgVar24.y;
            mpe mpeVar = this.c0;
            if (mpeVar == null) {
                Intrinsics.n("cubeRender2");
                throw null;
            }
            gLSurfaceView2.setRenderer(mpeVar);
        }
        jhg jhgVar25 = (jhg) this.b;
        if (jhgVar25 != null) {
            GLSurfaceView gLSurfaceView3 = jhgVar25.z;
            npe npeVar = this.d0;
            if (npeVar == null) {
                Intrinsics.n("cubeRender3");
                throw null;
            }
            gLSurfaceView3.setRenderer(npeVar);
        }
        jhg jhgVar26 = (jhg) this.b;
        if (jhgVar26 != null) {
            jhgVar26.w.setRenderMode(0);
        }
        jhg jhgVar27 = (jhg) this.b;
        if (jhgVar27 != null) {
            jhgVar27.z.setRenderMode(0);
        }
        jhg jhgVar28 = (jhg) this.b;
        if (jhgVar28 != null) {
            jhgVar28.y.setRenderMode(0);
        }
        jhg jhgVar29 = (jhg) this.b;
        if (jhgVar29 != null) {
            jhgVar29.w.setPreserveEGLContextOnPause(true);
        }
        jhg jhgVar30 = (jhg) this.b;
        if (jhgVar30 != null) {
            jhgVar30.y.setPreserveEGLContextOnPause(true);
        }
        jhg jhgVar31 = (jhg) this.b;
        if (jhgVar31 != null) {
            jhgVar31.z.setPreserveEGLContextOnPause(true);
        }
        ppe ppeVar2 = this.b0;
        if (ppeVar2 == null) {
            Intrinsics.n("cubeRender1");
            throw null;
        }
        edg edgVar = edg.i;
        ppeVar2.i = edgVar;
        mpe mpeVar2 = this.c0;
        if (mpeVar2 == null) {
            Intrinsics.n("cubeRender2");
            throw null;
        }
        mpeVar2.i = edgVar;
        npe npeVar2 = this.d0;
        if (npeVar2 == null) {
            Intrinsics.n("cubeRender3");
            throw null;
        }
        npeVar2.i = edgVar;
        jhg jhgVar32 = (jhg) this.b;
        if (jhgVar32 != null) {
            jhgVar32.J.setBackListener(new gdg(this, 0));
        }
        jhg jhgVar33 = (jhg) this.b;
        if (jhgVar33 != null) {
            jhgVar33.D.a(new f());
        }
        jhg jhgVar34 = (jhg) this.b;
        if (jhgVar34 != null) {
            jhgVar34.b.setOnClickListener(new hdg());
        }
        if (Build.VERSION.SDK_INT <= 25) {
            jhg jhgVar35 = (jhg) this.b;
            if (jhgVar35 != null) {
                jhgVar35.b.setTextSize(14.0f);
            }
            jhg jhgVar36 = (jhg) this.b;
            if (jhgVar36 != null) {
                jhgVar36.G.setTextSize(2, 15.0f);
            }
            jhg jhgVar37 = (jhg) this.b;
            if (jhgVar37 != null) {
                jhgVar37.S.setTextSize(2, 15.0f);
            }
        }
        jhg jhgVar38 = (jhg) this.b;
        if (jhgVar38 != null) {
            gr60.a(jhgVar38.R, new glb(this, c4 == true ? 1 : 0));
        }
        jhg jhgVar39 = (jhg) this.b;
        if (jhgVar39 != null) {
            gr60.a(jhgVar39.Y, new Function1() { // from class: idg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    fgg fggVar = this.a;
                    String string2 = fggVar.getString(R.string.even);
                    string2.getClass();
                    fggVar.p0(string2);
                    return Unit.a;
                }
            });
        }
        jhg jhgVar40 = (jhg) this.b;
        if (jhgVar40 != null) {
            gr60.a(jhgVar40.X, new ilb(this, c3 == true ? 1 : 0));
        }
        jhg jhgVar41 = (jhg) this.b;
        if (jhgVar41 != null) {
            gr60.a(jhgVar41.Z, new Function1() { // from class: jdg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    fgg fggVar = this.a;
                    int i5 = fggVar.f + 1;
                    fggVar.f = i5;
                    ppe ppeVar3 = fggVar.b0;
                    if (ppeVar3 == null) {
                        Intrinsics.n("cubeRender1");
                        throw null;
                    }
                    ppeVar3.w = i5;
                    String string2 = fggVar.getString(R.string.odd);
                    string2.getClass();
                    fggVar.p0(string2);
                    return Unit.a;
                }
            });
        }
        jhg jhgVar42 = (jhg) this.b;
        if (jhgVar42 != null) {
            jhgVar42.d.setBetAmountAddListener(new oq2(this, c2 == true ? 1 : 0));
        }
        jhg jhgVar43 = (jhg) this.b;
        if (jhgVar43 != null) {
            jhgVar43.i.setAmountChangeListener(new Function2() { // from class: kdg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Double dY1;
                    Double d2 = (Double) obj;
                    d2.getClass();
                    if (((Boolean) obj2).booleanValue()) {
                        fgg fggVar = this.a;
                        bo1 bo1Var7 = (bo1) fggVar.a;
                        if (bo1Var7 == null || (dY1 = bo1Var7.y1()) == null || !dY1.equals(d2)) {
                            ypa0 ypa0VarD0 = fggVar.D0();
                            String string2 = fggVar.getString(R.string.slider);
                            string2.getClass();
                            ypa0VarD0.A1(0L, string2);
                            bo1 bo1Var8 = (bo1) fggVar.a;
                            if (bo1Var8 != null) {
                                bo1Var8.z1(d2);
                            }
                        }
                    }
                    return Unit.a;
                }
            }, new Function1() { // from class: ndg
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Double dY1;
                    Double dY2;
                    Double d2 = (Double) obj;
                    fgg fggVar = this.a;
                    fggVar.I = 1;
                    bo1 bo1Var7 = (bo1) fggVar.a;
                    if (bo1Var7 == null || (dY2 = bo1Var7.y1()) == null || !dY2.equals(d2)) {
                        bo1 bo1Var8 = (bo1) fggVar.a;
                        if (bo1Var8 != null) {
                            bo1Var8.z1(d2);
                        }
                        bo1 bo1Var9 = (bo1) fggVar.a;
                        double dDoubleValue = (bo1Var9 == null || (dY1 = bo1Var9.y1()) == null) ? 0.0d : dY1.doubleValue();
                        Double d3 = fggVar.E;
                        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
                        B b2 = fggVar.b;
                        if (dDoubleValue > dDoubleValue2) {
                            jhg jhgVar44 = (jhg) b2;
                            if (jhgVar44 != null) {
                                jhgVar44.F.setVisibility(0);
                            }
                            jhg jhgVar45 = (jhg) fggVar.b;
                            if (jhgVar45 != null) {
                                jhgVar45.c.setErrorBetAmount();
                            }
                            jhg jhgVar46 = (jhg) fggVar.b;
                            if (jhgVar46 != null) {
                                jhgVar46.i.setSeekMax();
                            }
                        } else {
                            jhg jhgVar47 = (jhg) b2;
                            if (jhgVar47 != null) {
                                jhgVar47.F.setVisibility(4);
                            }
                            jhg jhgVar48 = (jhg) fggVar.b;
                            if (jhgVar48 != null) {
                                jhgVar48.c.setErrorBetAmountLayout();
                            }
                        }
                    }
                    return Unit.a;
                }
            }, new wdg(this, i3));
        }
        u0().b.f(getViewLifecycleOwner(), new g(new ceg(this, i3)));
        ema emaVar = this.m0;
        if (e5y.b == null) {
            synchronized (e5y.class) {
                try {
                    if (e5y.b == null) {
                        e5y.b = new e5y();
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        e5y e5yVar = e5y.b;
        e5yVar.getClass();
        ddy ddyVarA = e5yVar.a();
        final feg fegVar = new feg();
        tdy tdyVar = new tdy(ddyVarA, new faj() { // from class: oeg
            @Override // defpackage.faj
            public final Object apply(Object obj) {
                obj.getClass();
                return (Boolean) fegVar.invoke(obj);
            }
        });
        final d dVar = new d(1, this, fgg.class, "onGetObservableSuccess", "onGetObservableSuccess(Z)V", 0);
        rlr rlrVar = new rlr(new pya() { // from class: yeg
            @Override // defpackage.pya
            public final void accept(Object obj) {
                dVar.invoke(obj);
                throw null;
            }
        }, new ifg(new e(1, this, fgg.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0)), taj.c);
        tdyVar.a(rlrVar);
        emaVar.b(rlrVar);
        jhg jhgVar44 = (jhg) this.b;
        if (jhgVar44 != null) {
            jhgVar44.d.setFbgClickListener(new sfg(this, i3));
        }
        jhg jhgVar45 = (jhg) this.b;
        if (jhgVar45 != null && (crossFbg = jhgVar45.c.getCrossFbg()) != null) {
            gr60.a(crossFbg, new cgg(this, i3));
        }
        ypa0 ypa0VarD0 = D0();
        GameDetails gameDetails2 = this.i;
        String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
        if (name2 == null) {
            name2 = "";
        }
        ypa0VarD0.e = name2;
    }

    public final void p0(String str) {
        ssw<bo1.c> sswVar;
        bo1.c cVarD;
        ssw<bo1.c> sswVar2;
        bo1.c cVarD2;
        ssw<bo1.c> sswVar3;
        bo1.c cVarD3;
        ssw<bo1.c> sswVar4;
        bo1.c cVarD4;
        ssw<Double> sswVar5;
        Double d2;
        ssw<Double> sswVar6;
        Double d3;
        String string;
        ssw<Double> sswVar7;
        ssw<Double> sswVar8;
        ssw<Double> sswVar9;
        ssw<Double> sswVar10;
        Double d4;
        this.Q = false;
        this.R = str;
        ypa0 ypa0VarD0 = D0();
        String string2 = getString(R.string.click_main_menu);
        string2.getClass();
        ypa0VarD0.A1(0L, string2);
        SharedPreferences sharedPreferences = this.X;
        double dDoubleValue = 0.0d;
        if (sharedPreferences != null && !sharedPreferences.getBoolean("EVEN_ODD_ONE_TAP", false)) {
            if (this.B == null) {
                return;
            }
            DecimalFormat decimalFormat = new DecimalFormat("#,###.00", SportyGamesManager.decimalFormatSymbols);
            bo1 bo1Var = (bo1) this.a;
            if (bo1Var != null && (sswVar10 = bo1Var.b) != null && (d4 = sswVar10.d()) != null) {
                dDoubleValue = d4.doubleValue();
            }
            if (dDoubleValue < 1.0d) {
                decimalFormat = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols);
            }
            bo1 bo1Var2 = (bo1) this.a;
            if (bo1Var2 == null || (sswVar6 = bo1Var2.b) == null || (d3 = sswVar6.d()) == null) {
                return;
            }
            double dDoubleValue2 = d3.doubleValue();
            op5 op5Var = op5.a;
            String str2 = this.B;
            op5Var.getClass();
            if (getString(R.string.redblack_confirm_txt, op5.i(str2), decimalFormat.format(dDoubleValue2), str) != null) {
                this.f0 = true;
                Context context = getContext();
                if (context != null) {
                    if (Intrinsics.g(str, getString(R.string.even))) {
                        string = getString(R.string.place_bet_confirm_even_cms);
                        string.getClass();
                    } else {
                        string = getString(R.string.place_bet_confirm_odd_cms);
                        string.getClass();
                    }
                    HashMap map = new HashMap();
                    map.put(getString(R.string.currency_cms), op5.i(this.B));
                    String string3 = getString(R.string.amount_cms);
                    bo1 bo1Var3 = (bo1) this.a;
                    map.put(string3, decimalFormat.format((bo1Var3 == null || (sswVar9 = bo1Var3.b) == null) ? null : sswVar9.d()));
                    Intent intent = new Intent(context, (Class<?>) SGConfirmDialogActivity.class);
                    intent.putExtra("sound", this.i);
                    String strI = op5.i(this.B);
                    bo1 bo1Var4 = (bo1) this.a;
                    String string4 = getString(R.string.redblack_confirm_txt, strI, decimalFormat.format((bo1Var4 == null || (sswVar8 = bo1Var4.b) == null) ? null : sswVar8.d()), str);
                    string4.getClass();
                    intent.putExtra(EventKeys.ERROR_MESSAGE, op5.b(string, string4, map));
                    intent.putExtra("color", R.color.toolbar_strip_even_odd);
                    String strI2 = op5.i(this.B);
                    bo1 bo1Var5 = (bo1) this.a;
                    String string5 = getString(R.string.redblack_confirm_txt, strI2, decimalFormat.format((bo1Var5 == null || (sswVar7 = bo1Var5.b) == null) ? null : sswVar7.d()), str);
                    string5.getClass();
                    intent.putExtra("placeholder", op5.b(string, string5, map));
                    String string6 = context.getString(R.string.confirm_btn_cms);
                    string6.getClass();
                    String string7 = getString(R.string.confirm_bet);
                    string7.getClass();
                    intent.putExtra("positive", op5.b(string6, string7, null));
                    String string8 = context.getString(R.string.cancel_btn_cms);
                    string8.getClass();
                    String string9 = getString(R.string.cancel_bet);
                    string9.getClass();
                    intent.putExtra("negative", op5.b(string8, string9, null));
                    intent.putExtra("cancel_btn_color", context.getColor(R.color.redblack_confirm_dialog_left_button));
                    intent.putExtra("confirm_btn_color", context.getColor(R.color.redblack_confirm_dialog_right_button));
                    startActivityForResult(intent, HttpStatusCodesKt.HTTP_PROCESSING);
                    jhg jhgVar = (jhg) this.b;
                    if (jhgVar == null || jhgVar.F.getVisibility() != 0) {
                        return;
                    }
                    this.y = true;
                    return;
                }
                return;
            }
            return;
        }
        String str3 = this.B;
        if (str3 == null || StringsKt.U(str3)) {
            return;
        }
        bo1 bo1Var6 = (bo1) this.a;
        if (bo1Var6 != null && (sswVar5 = bo1Var6.b) != null && (d2 = sswVar5.d()) != null) {
            dDoubleValue = d2.doubleValue();
        }
        this.M = dDoubleValue;
        this.h0 = dDoubleValue;
        L0(this);
        if (this.J) {
            if (yju.a("br")) {
                z0().y1(new PlaceBetRequest(str, this.M, this.B, null, null, this.C0, null, 64, null), getActivity());
            } else {
                ei10.x1(z0(), new PlaceBetRequest(str, this.M, this.B, null, null, this.C0, null, 64, null));
            }
            jhg jhgVar2 = (jhg) this.b;
            if (jhgVar2 != null) {
                jhgVar2.I.setVisibility(8);
            }
            jhg jhgVar3 = (jhg) this.b;
            if (jhgVar3 != null) {
                jhgVar3.E.setVisibility(8);
            }
        } else {
            String str4 = this.B;
            if (str4 == null || StringsKt.U(str4)) {
                return;
            }
            if (yju.a("br")) {
                ei10 ei10VarZ0 = z0();
                double d5 = this.M;
                Double dValueOf = null;
                String str5 = this.B;
                bo1 bo1Var7 = (bo1) this.a;
                String giftId = (bo1Var7 == null || (sswVar4 = bo1Var7.c) == null || (cVarD4 = sswVar4.d()) == null) ? null : cVarD4.a.getGiftId();
                bo1 bo1Var8 = (bo1) this.a;
                if (bo1Var8 != null && (sswVar3 = bo1Var8.c) != null && (cVarD3 = sswVar3.d()) != null) {
                    dValueOf = Double.valueOf(cVarD3.b);
                }
                ei10VarZ0.y1(new PlaceBetRequest(str, d5, str5, giftId, dValueOf, this.C0, null, 64, null), getActivity());
            } else {
                Double dValueOf2 = null;
                ei10 ei10VarZ1 = z0();
                double d6 = this.M;
                String str6 = this.B;
                bo1 bo1Var9 = (bo1) this.a;
                String giftId2 = (bo1Var9 == null || (sswVar2 = bo1Var9.c) == null || (cVarD2 = sswVar2.d()) == null) ? null : cVarD2.a.getGiftId();
                bo1 bo1Var10 = (bo1) this.a;
                if (bo1Var10 != null && (sswVar = bo1Var10.c) != null && (cVarD = sswVar.d()) != null) {
                    dValueOf2 = Double.valueOf(cVarD.b);
                }
                ei10.x1(ei10VarZ1, new PlaceBetRequest(str, d6, str6, giftId2, dValueOf2, this.C0, null, 64, null));
            }
        }
        jhg jhgVar4 = (jhg) this.b;
        if (jhgVar4 != null) {
            jhgVar4.J.setBackImageVisible(8);
        }
        jhg jhgVar5 = (jhg) this.b;
        if (jhgVar5 != null && jhgVar5.F.getVisibility() == 0) {
            this.y = true;
        }
        jhg jhgVar6 = (jhg) this.b;
        if (jhgVar6 != null) {
            jhgVar6.H.setVisibility(8);
        }
        jhg jhgVar7 = (jhg) this.b;
        if (jhgVar7 != null) {
            jhgVar7.F.setVisibility(4);
        }
        jhg jhgVar8 = (jhg) this.b;
        if (jhgVar8 != null) {
            jhgVar8.i.setVisibility(8);
        }
        jhg jhgVar9 = (jhg) this.b;
        if (jhgVar9 != null) {
            jhgVar9.d.setVisibility(8);
        }
        jhg jhgVar10 = (jhg) this.b;
        if (jhgVar10 != null) {
            jhgVar10.c.setVisibility(8);
        }
        jhg jhgVar11 = (jhg) this.b;
        if (jhgVar11 != null) {
            jhgVar11.J.a(0);
        }
        jhg jhgVar12 = (jhg) this.b;
        if (jhgVar12 != null) {
            jhgVar12.J.setBackImageVisible(8);
        }
        jhg jhgVar13 = (jhg) this.b;
        if (jhgVar13 != null) {
            jhgVar13.D.setDrawerLockMode(1, 8388613);
        }
    }

    public final int q0(int i2) {
        return ycv.b(i2 * getResources().getDisplayMetrics().density);
    }

    public final void r0(final int i2, final boolean z2) {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(new Runnable() { // from class: qeg
                @Override // java.lang.Runnable
                public final void run() {
                    fgg fggVar = this.a;
                    fggVar.S.add(Integer.valueOf(i2));
                    if (fggVar.S.size() < 1 || fggVar.S.size() != fggVar.T.size() || fggVar.P || !z2) {
                        return;
                    }
                    fggVar.P = true;
                    ppe ppeVar = fggVar.b0;
                    if (ppeVar == null) {
                        Intrinsics.n("cubeRender1");
                        throw null;
                    }
                    ppeVar.f = 0;
                    mpe mpeVar = fggVar.c0;
                    if (mpeVar == null) {
                        Intrinsics.n("cubeRender2");
                        throw null;
                    }
                    mpeVar.f = 0;
                    npe npeVar = fggVar.d0;
                    if (npeVar == null) {
                        Intrinsics.n("cubeRender3");
                        throw null;
                    }
                    npeVar.f = 0;
                    fggVar.I0();
                    ej5.c(ebs.a(fggVar.getLifecycle()), null, null, fggVar.new b(null), 3);
                    fggVar.N = false;
                }
            });
        }
    }

    public final void s0() {
        requireActivity().finish();
    }

    public final void t0(String str) {
        Unit unit;
        String name;
        Integer id;
        if ((this.x0 || !this.t0) && str == null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        ArrayList<GameDetails> arrayList = this.s0;
        int i2 = 0;
        ee<Intent> eeVar = this.J0;
        if (arrayList != null) {
            if (getContext() != null) {
                Intent intent = new Intent(getContext(), (Class<?>) ExitDialogActivity.class);
                intent.putParcelableArrayListExtra("ExitGameList", this.s0);
                GameDetails gameDetails = this.i;
                if (gameDetails == null || (name = gameDetails.getName()) == null) {
                    name = "";
                }
                intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, name);
                GameDetails gameDetails2 = this.i;
                intent.putExtra("gameId", (gameDetails2 == null || (id = gameDetails2.getId()) == null) ? 0 : id.intValue());
                intent.putExtra("color", R.color.sb_black_100);
                intent.putExtra(EventKeys.ERROR_MESSAGE, str);
                eeVar.b(intent);
                unit = Unit.a;
            } else {
                unit = null;
            }
            if (unit != null) {
                return;
            }
        }
        this.f0 = true;
        androidx.fragment.app.e activity2 = getActivity();
        if (activity2 != null) {
            if (str != null) {
                xbg xbgVar = this.z;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string = getString(R.string.label_dialog_exit);
                string.getClass();
                xbg.c(xbgVar, str, string, new ydg(this, i2), new zdg(), activity2.getColor(R.color.try_again_color), 224);
                xbgVar.a();
                return;
            }
            Intent intent2 = new Intent(activity2, (Class<?>) SGConfirmDialogActivity.class);
            op5 op5Var = op5.a;
            String string2 = getString(R.string.exit_confirm_msg_cms);
            string2.getClass();
            String string3 = getString(R.string.exit_text);
            string3.getClass();
            op5Var.getClass();
            intent2.putExtra(EventKeys.ERROR_MESSAGE, op5.b(string2, string3, null));
            String string4 = getString(R.string.stay_btn_cms);
            string4.getClass();
            String string5 = getString(R.string.stay);
            string5.getClass();
            intent2.putExtra("positive", op5.b(string4, string5, null));
            intent2.putExtra("color", R.color.toolbar_strip_even_odd);
            String string6 = getString(R.string.exit_btn_cms);
            string6.getClass();
            String string7 = getString(R.string.label_dialog_exit);
            string7.getClass();
            intent2.putExtra("negative", op5.b(string6, string7, null));
            intent2.putExtra("cancel_btn_color", activity2.getColor(R.color.redblack_confirm_dialog_left_button));
            intent2.putExtra("confirm_btn_color", activity2.getColor(R.color.redblack_confirm_dialog_right_button));
            eeVar.b(intent2);
            Unit unit2 = Unit.a;
        }
    }

    public final nt2 u0() {
        return (nt2) this.C.getValue();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void v0(String str, ImageView imageView) {
        try {
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        imageView.setImageDrawable(requireContext().getDrawable(R.drawable.one));
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(q0(60), q0(60));
                        jhg jhgVar = (jhg) this.b;
                        if (imageView.equals(jhgVar != null ? jhgVar.A : null)) {
                            layoutParams.addRule(11, -1);
                            layoutParams.addRule(13, -1);
                            layoutParams.setMargins(0, 0, 30, 0);
                        } else {
                            layoutParams.addRule(13, -1);
                        }
                        imageView.setLayoutParams(layoutParams);
                        return;
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        imageView.setImageDrawable(requireContext().getDrawable(R.drawable.two));
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(q0(60), q0(60));
                        jhg jhgVar2 = (jhg) this.b;
                        if (imageView.equals(jhgVar2 != null ? jhgVar2.A : null)) {
                            layoutParams2.addRule(11, -1);
                            layoutParams2.addRule(13, -1);
                            layoutParams2.setMargins(0, 0, 30, 0);
                        } else {
                            layoutParams2.addRule(13, -1);
                        }
                        imageView.setLayoutParams(layoutParams2);
                        return;
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        imageView.setImageDrawable(requireContext().getDrawable(R.drawable.three));
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(q0(60), q0(60));
                        jhg jhgVar3 = (jhg) this.b;
                        if (imageView.equals(jhgVar3 != null ? jhgVar3.A : null)) {
                            layoutParams3.addRule(11, -1);
                            layoutParams3.addRule(13, -1);
                            layoutParams3.setMargins(0, 0, 30, 0);
                        } else {
                            layoutParams3.addRule(13, -1);
                        }
                        imageView.setLayoutParams(layoutParams3);
                        return;
                    }
                    break;
                case 52:
                    if (str.equals("4")) {
                        imageView.setImageDrawable(requireContext().getDrawable(R.drawable.four));
                        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(q0(60), q0(60));
                        jhg jhgVar4 = (jhg) this.b;
                        if (imageView.equals(jhgVar4 != null ? jhgVar4.A : null)) {
                            layoutParams4.addRule(11, -1);
                            layoutParams4.addRule(13, -1);
                            layoutParams4.setMargins(0, 0, 30, 0);
                        } else {
                            layoutParams4.addRule(13, -1);
                        }
                        imageView.setLayoutParams(layoutParams4);
                        return;
                    }
                    break;
                case 53:
                    if (str.equals("5")) {
                        imageView.setImageDrawable(requireContext().getDrawable(R.drawable.five));
                        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(q0(60), q0(60));
                        jhg jhgVar5 = (jhg) this.b;
                        if (imageView.equals(jhgVar5 != null ? jhgVar5.A : null)) {
                            layoutParams5.addRule(11, -1);
                            layoutParams5.addRule(13, -1);
                            layoutParams5.setMargins(0, 0, 30, 0);
                        } else {
                            layoutParams5.addRule(13, -1);
                        }
                        imageView.setLayoutParams(layoutParams5);
                        return;
                    }
                    break;
                case 54:
                    if (str.equals("6")) {
                        imageView.setImageDrawable(requireContext().getDrawable(R.drawable.six));
                        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(q0(60), q0(60));
                        jhg jhgVar6 = (jhg) this.b;
                        if (imageView.equals(jhgVar6 != null ? jhgVar6.A : null)) {
                            layoutParams6.addRule(11, -1);
                            layoutParams6.addRule(13, -1);
                            layoutParams6.setMargins(0, 0, 30, 0);
                        } else {
                            layoutParams6.addRule(13, -1);
                        }
                        imageView.setLayoutParams(layoutParams6);
                        return;
                    }
                    break;
            }
            jhg jhgVar7 = (jhg) this.b;
            if (jhgVar7 != null) {
                jhgVar7.A.setImageDrawable(requireContext().getDrawable(R.drawable.dice));
            }
            jhg jhgVar8 = (jhg) this.b;
            if (jhgVar8 != null) {
                jhgVar8.B.setImageDrawable(requireContext().getDrawable(R.drawable.dice));
            }
            jhg jhgVar9 = (jhg) this.b;
            if (jhgVar9 != null) {
                jhgVar9.C.setImageDrawable(requireContext().getDrawable(R.drawable.dice));
            }
            RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(q0(85), q0(85));
            layoutParams7.addRule(13, -1);
            RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(q0(85), q0(85));
            layoutParams8.addRule(13, -1);
            jhg jhgVar10 = (jhg) this.b;
            if (jhgVar10 != null) {
                jhgVar10.A.setLayoutParams(layoutParams8);
            }
            jhg jhgVar11 = (jhg) this.b;
            if (jhgVar11 != null) {
                jhgVar11.B.setLayoutParams(layoutParams7);
            }
            jhg jhgVar12 = (jhg) this.b;
            if (jhgVar12 != null) {
                jhgVar12.C.setLayoutParams(layoutParams7);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final fuj y0() {
        return (fuj) this.D0.getValue();
    }

    public final ei10 z0() {
        return (ei10) this.G.getValue();
    }

    public static edg w0(String str) {
        switch (str.hashCode()) {
            case 49:
                if (str.equals(TEFcJcMqR.lzGktpY)) {
                    return edg.a;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    return edg.b;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    return edg.c;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    return edg.d;
                }
                break;
            case 53:
                if (str.equals("5")) {
                    return edg.e;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    return edg.f;
                }
                break;
        }
        return edg.a;
    }
}
