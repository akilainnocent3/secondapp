package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.navigation.NavigationView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.BetBoxContainer;
import com.sportygames.commons.components.BetChipContainer;
import com.sportygames.commons.components.ChipSlider;
import com.sportygames.commons.components.DeckCard;
import com.sportygames.commons.components.GameHeader;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.WalletText;
import com.sportygames.commons.components.a;
import com.sportygames.commons.models.CardDetail;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.models.PagingState;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.commons.models.enums.PagingFetchType;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.utils.CasinoLogger;
import com.sportygames.commons.viewmodels.FbgData;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.redblack.components.LevelIndicator;
import com.sportygames.redblack.components.RoundResult;
import com.sportygames.redblack.remote.models.BetAmountVO;
import com.sportygames.redblack.remote.models.FetchBetAmountResponse;
import com.sportygames.redblack.remote.models.GameAvailableResponse;
import com.sportygames.redblack.remote.models.PlaceBetRequest;
import com.sportygames.redblack.remote.models.PlaceBetResponse;
import com.sportygames.redblack.remote.models.RoundInitializeResponse;
import com.sportygames.redblack.remote.models.RoundRequest;
import com.sportygames.redblack.remote.models.UserCard;
import com.sportygames.redblack.remote.models.enums.BetCardDecision;
import com.twilio.voice.AudioFormat;
import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnn40;", "Ll12;", "Lloj;", "Lxo40;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class nn40 extends l12<loj, xo40> implements GameMainActivity.b, bb {
    public final q8i0 A;
    public final q8i0 B;
    public final q8i0 C;
    public fq5 D;
    public final q8i0 E;
    public fph0 F;
    public fo2 G;
    public GameDetails H;
    public List<GameDetails> I;
    public xi60 J;
    public AnimatorSet K;
    public AnimatorSet L;
    public int M;
    public Double N;
    public PlaceBetResponse O;
    public BetAmountVO P;
    public SharedPreferences Q;
    public SharedPreferences.Editor R;
    public xbg S;
    public hht T;
    public ArrayList<Double> U;
    public int V;
    public double W;
    public double X;
    public double Y;
    public int Z;
    public int a0;
    public int b0;
    public com.sportygames.commons.components.a c;
    public String c0;
    public com.sportygames.commons.components.a d;
    public int d0;
    public boolean e0;
    public PromotionGiftsResponse f0;
    public int g0;
    public boolean h0;
    public d i0;
    public boolean j0;
    public final String k0;
    public final ArrayList<String> l0;
    public boolean m0;
    public boolean n0;
    public String o0;
    public String p0;
    public nle q0;
    public mke r0;
    public z66 s0;
    public boolean t0;
    public final q8i0 u0;
    public double v;
    public final q8i0 v0;
    public boolean w0;
    public boolean x0;
    public final q8i0 y;
    public g060.a y0;
    public ypa0 z;
    public long z0;
    public String e = "";
    public String f = "";
    public String i = "";
    public String w = "";

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
    public static final class a0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(ttr ttrVar) {
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
    public static final class b implements Animator.AnimatorListener {
        public final /* synthetic */ bq40 b;
        public final /* synthetic */ FrameLayout c;
        public final /* synthetic */ int d;

        public b(bq40 bq40Var, FrameLayout frameLayout, int i) {
            this.b = bq40Var;
            this.c = frameLayout;
            this.d = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            bq40 bq40Var = this.b;
            if (bq40Var.a == 0) {
                bq40Var.a = 1;
                nn40 nn40Var = nn40.this;
                xo40 xo40Var = (xo40) nn40Var.b;
                if (xo40Var != null) {
                    xo40Var.Z.setCardUnDraw();
                }
                nn40Var.G0(this.c, this.d);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
            nn40 nn40Var = nn40.this;
            Context context = nn40Var.getContext();
            if (context != null) {
                ypa0 ypa0Var = nn40Var.z;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = context.getString(R.string.card_deal);
                string.getClass();
                ypa0Var.A1(500L, string);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class b0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? nn40.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c implements Animator.AnimatorListener {
        public final /* synthetic */ bq40 a;
        public final /* synthetic */ nn40 b;
        public final /* synthetic */ int c;

        public c(bq40 bq40Var, nn40 nn40Var, int i) {
            this.a = bq40Var;
            this.b = nn40Var;
            this.c = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlaceBetResponse placeBetResponse;
            List<UserCard> userHistory;
            List<UserCard> userHistory2;
            animator.getClass();
            bq40 bq40Var = this.a;
            int i = bq40Var.a;
            nn40 nn40Var = this.b;
            if (i != 0 || (placeBetResponse = nn40Var.O) == null || (((userHistory = placeBetResponse.getUserHistory()) != null && userHistory.size() == 5) || this.c != 0)) {
                xo40 xo40Var = (xo40) nn40Var.b;
                if (xo40Var != null) {
                    xo40Var.e.setGravity(1);
                }
                LinearLayoutCompat.LayoutParams layoutParams = new LinearLayoutCompat.LayoutParams(0, -2);
                ((LinearLayout.LayoutParams) layoutParams).weight = 1.0f;
                layoutParams.setMargins(0, 8, 0, 0);
                LinearLayoutCompat.LayoutParams layoutParams2 = new LinearLayoutCompat.LayoutParams(0, -2);
                ((LinearLayout.LayoutParams) layoutParams2).weight = 0.0f;
                layoutParams2.setMargins(0, 0, 0, 0);
                xo40 xo40Var2 = (xo40) nn40Var.b;
                if (xo40Var2 != null) {
                    xo40Var2.L.setLayoutParams(layoutParams2);
                    return;
                }
                return;
            }
            bq40Var.a = 1;
            fph0 fph0Var = nn40Var.F;
            if (fph0Var != null) {
                PlaceBetResponse placeBetResponse2 = nn40Var.O;
                ArrayList arrayList = (placeBetResponse2 == null || (userHistory2 = placeBetResponse2.getUserHistory()) == null) ? null : new ArrayList(userHistory2);
                PlaceBetResponse placeBetResponse3 = nn40Var.O;
                fph0Var.i(arrayList, placeBetResponse3 != null ? placeBetResponse3.getWinStatus() : false);
            }
            xo40 xo40Var3 = (xo40) nn40Var.b;
            if (xo40Var3 != null) {
                xo40Var3.L.setVisibility(0);
            }
            xo40 xo40Var4 = (xo40) nn40Var.b;
            if (xo40Var4 != null) {
                xo40Var4.e.setGravity(8388613);
            }
            LinearLayoutCompat.LayoutParams layoutParams3 = new LinearLayoutCompat.LayoutParams(0, -2);
            ((LinearLayout.LayoutParams) layoutParams3).weight = 1.0f;
            layoutParams3.setMargins(0, 8, 20, 0);
            LinearLayoutCompat.LayoutParams layoutParams4 = new LinearLayoutCompat.LayoutParams(0, -2);
            ((LinearLayout.LayoutParams) layoutParams4).weight = 1.0f;
            xo40 xo40Var5 = (xo40) nn40Var.b;
            if (xo40Var5 != null) {
                xo40Var5.L.setLayoutParams(layoutParams4);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            animator.getClass();
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class c0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ v a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(v vVar) {
            super(0);
            this.a = vVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            rk60 soundManager;
            intent.getClass();
            final nn40 nn40Var = nn40.this;
            xo40 xo40Var = (xo40) nn40Var.b;
            if (xo40Var == null || (soundManager = xo40Var.V.getSoundManager()) == null) {
                return;
            }
            ypa0 ypa0Var = nn40Var.z;
            if (ypa0Var != null) {
                ypa0Var.F1(soundManager, new Function0() { // from class: un40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        nn40 nn40Var2 = nn40Var;
                        SharedPreferences sharedPreferences = nn40Var2.Q;
                        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("MUSIC", true)) : null;
                        if (boolValueOf == null || boolValueOf.equals(Boolean.TRUE)) {
                            ypa0 ypa0Var2 = nn40Var2.z;
                            if (ypa0Var2 == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            String string = nn40Var2.getString(R.string.bg_music);
                            string.getClass();
                            ypa0Var2.A1(0L, string);
                        }
                        return Unit.a;
                    }
                });
            } else {
                Intrinsics.n("soundViewModel");
                throw null;
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class d0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public e(Function1 function1) {
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
    public static final class e0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e0(ttr ttrVar) {
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
    public static final class f extends qlr implements Function0<v8i0> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return nn40.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class f0 extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f0(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? nn40.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g extends qlr implements Function0<cyb> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return nn40.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class g0 extends qlr implements Function0<Fragment> {
        public g0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return nn40.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h extends qlr implements Function0<r8i0.c> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return nn40.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class h0 extends qlr implements Function0<w8i0> {
        public final /* synthetic */ g0 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h0(g0 g0Var) {
            super(0);
            this.a = g0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i extends qlr implements Function0<v8i0> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return nn40.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class i0 extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i0(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j extends qlr implements Function0<cyb> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return nn40.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class j0 extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j0(ttr ttrVar) {
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
    public static final class k extends qlr implements Function0<r8i0.c> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return nn40.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class l extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? nn40.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m extends qlr implements Function0<Fragment> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return nn40.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n extends qlr implements Function0<w8i0> {
        public final /* synthetic */ m a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.a = mVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class o extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class p extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(ttr ttrVar) {
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
    public static final class q extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? nn40.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class r extends qlr implements Function0<Fragment> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return nn40.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class s extends qlr implements Function0<w8i0> {
        public final /* synthetic */ r a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(r rVar) {
            super(0);
            this.a = rVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class t extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class u extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(ttr ttrVar) {
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
    public static final class v extends qlr implements Function0<Fragment> {
        public v() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return nn40.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? nn40.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x extends qlr implements Function0<Fragment> {
        public x() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return nn40.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y extends qlr implements Function0<w8i0> {
        public final /* synthetic */ x a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(x xVar) {
            super(0);
            this.a = xVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public nn40() {
        v vVar = new v();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new c0(vVar));
        this.y = new q8i0(jq40.a(jqh0.class), new d0(ttrVarA), new f0(ttrVarA), new e0(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new h0(new g0()));
        this.A = new q8i0(jq40.a(g060.class), new i0(ttrVarA2), new l(ttrVarA2), new j0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new n(new m()));
        this.B = new q8i0(jq40.a(ynh0.class), new o(ttrVarA3), new q(ttrVarA3), new p(ttrVarA3));
        ttr ttrVarA4 = hwr.a(a1sVar, new s(new r()));
        this.C = new q8i0(jq40.a(bu2.class), new t(ttrVarA4), new w(ttrVarA4), new u(ttrVarA4));
        ttr ttrVarA5 = hwr.a(a1sVar, new y(new x()));
        this.E = new q8i0(jq40.a(q530.class), new z(ttrVarA5), new b0(ttrVarA5), new a0(ttrVarA5));
        this.U = new ArrayList<>();
        this.c0 = "";
        this.h0 = true;
        this.k0 = "sg_red_black";
        this.l0 = kotlin.collections.b.f("sg_red_black", "sg_common_dialog_message", "sg_chat", "sg_bethistory", "sg_fbg_dialog", "sg_ham_menu", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
        this.o0 = "en";
        this.p0 = "";
        this.u0 = new q8i0(jq40.a(fuj.class), new f(), new h(), new g());
        this.v0 = new q8i0(jq40.a(db6.class), new i(), new k(), new j());
    }

    public final g060 C0() {
        return (g060) this.A.getValue();
    }

    public final ynh0 D0() {
        return (ynh0) this.B.getValue();
    }

    public final void F0(FrameLayout frameLayout, int i2, int i3) {
        bq40 bq40Var = new bq40();
        frameLayout.setTranslationX(0.0f);
        frameLayout.animate().translationX((-i2) + 300.0f).setDuration(500L).setStartDelay(0L).setListener(new b(bq40Var, frameLayout, i3));
    }

    public final void G0(FrameLayout frameLayout, int i2) {
        try {
            bq40 bq40Var = new bq40();
            frameLayout.setTranslationX(500.0f);
            frameLayout.setTranslationY(38.0f);
            frameLayout.setTranslationZ(125.0f);
            frameLayout.setRotation(-15.0f);
            frameLayout.setRotationY(70.0f);
            frameLayout.setScaleY(0.25f);
            frameLayout.setScaleX(0.35f);
            frameLayout.animate().translationX(0.0f).translationY(0.0f).translationZ(0.0f).setDuration(700L).rotation(0.0f).rotationY(0.0f).scaleY(1.0f).scaleX(1.0f).setStartDelay(0L).setListener(new c(bq40Var, this, i2)).getClass();
        } catch (Exception unused) {
        }
    }

    public final void H0() {
        int i2;
        boolean zBooleanValue;
        AppCompatImageView chat;
        try {
            Context context = getContext();
            if (context != null) {
                ArrayList<OnboardingItem> arrayListA = sny.a(context, "red-black");
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
                boolean z2 = true;
                this.j0 = true;
                if (zBooleanValue) {
                    this.n0 = false;
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new tn40(this, null), 3);
                    return;
                }
                this.n0 = true;
                if (this.H != null) {
                    xo40 xo40Var = (xo40) this.b;
                    if (xo40Var == null || (chat = xo40Var.D.getChat()) == null || chat.getVisibility() != 0) {
                        z2 = false;
                    }
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    childFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(childFragmentManager);
                    op5.a.getClass();
                    List<? extends File> list = op5.b;
                    o2g o2gVar = o2g.a;
                    o2gVar.getClass();
                    com.sportygames.commons.views.a aVar2 = new com.sportygames.commons.views.a();
                    aVar2.c = "red-black";
                    aVar2.d = i2;
                    aVar2.w = list;
                    aVar2.z = o2gVar;
                    aVar2.A = z2;
                    aVar.f(R.id.onboarding_images, aVar2, null);
                    aVar.d();
                }
                xo40 xo40Var2 = (xo40) this.b;
                if (xo40Var2 != null) {
                    xo40Var2.P.setVisibility(0);
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
        jl40.e.a();
    }

    public final void I0() {
        if (this.w0) {
            J0();
        }
        t0();
        r0();
        ypa0 ypa0Var = this.z;
        if (ypa0Var == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        String string = getString(R.string.click_main_menu);
        string.getClass();
        ypa0Var.A1(0L, string);
        N0(true);
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.e0.setVisibility(0);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.b0.setVisibility(8);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.z.setVisibility(0);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.X.setVisibility(0);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            xo40Var5.f.setVisibility(0);
        }
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.d0.setVisibility(0);
        }
        xo40 xo40Var7 = (xo40) this.b;
        if (xo40Var7 != null) {
            xo40Var7.c0.setVisibility(0);
        }
        xo40 xo40Var8 = (xo40) this.b;
        if (xo40Var8 != null) {
            xo40Var8.N.setVisibility(8);
        }
        xo40 xo40Var9 = (xo40) this.b;
        if (xo40Var9 != null) {
            xo40Var9.c.setVisibility(8);
        }
        xo40 xo40Var10 = (xo40) this.b;
        if (xo40Var10 != null) {
            xo40Var10.C.setVisibility(4);
        }
        xo40 xo40Var11 = (xo40) this.b;
        if (xo40Var11 != null) {
            xo40Var11.d0.setAlpha(0.5f);
        }
        xo40 xo40Var12 = (xo40) this.b;
        if (xo40Var12 != null) {
            xo40Var12.d0.setEnabled(false);
        }
        xo40 xo40Var13 = (xo40) this.b;
        if (xo40Var13 != null) {
            xo40Var13.c0.setAlpha(0.5f);
        }
        xo40 xo40Var14 = (xo40) this.b;
        if (xo40Var14 != null) {
            xo40Var14.c0.setEnabled(false);
        }
        xo40 xo40Var15 = (xo40) this.b;
        if (xo40Var15 != null) {
            xo40Var15.c0.setClickable(false);
        }
        xo40 xo40Var16 = (xo40) this.b;
        if (xo40Var16 != null) {
            xo40Var16.d0.setClickable(false);
        }
        xo40 xo40Var17 = (xo40) this.b;
        if (xo40Var17 != null) {
            F0(xo40Var17.A, this.g0, 0);
        }
        if (this.M != 5) {
            g060 g060VarC0 = C0();
            RoundInitializeResponse roundInitializeResponseD = C0().c.d();
            g060VarC0.y1(new RoundRequest(roundInitializeResponseD != null ? Long.valueOf(roundInitializeResponseD.getRoundId()) : null));
            xo40 xo40Var18 = (xo40) this.b;
            if (xo40Var18 != null) {
                xo40Var18.N.setBackgroundColor(requireContext().getColor(R.color.redblack_next_hand));
                return;
            }
            return;
        }
        xo40 xo40Var19 = (xo40) this.b;
        if (xo40Var19 != null) {
            xo40Var19.N.setBackgroundColor(requireContext().getColor(R.color.redblack_next_hand));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        fph0 fph0Var = new fph0(contextRequireContext);
        this.F = fph0Var;
        xo40 xo40Var20 = (xo40) this.b;
        if (xo40Var20 != null) {
            xo40Var20.e0.setAdapter(fph0Var);
        }
        xo40 xo40Var21 = (xo40) this.b;
        if (xo40Var21 != null) {
            xo40Var21.L.setVisibility(8);
        }
        xo40 xo40Var22 = (xo40) this.b;
        if (xo40Var22 != null) {
            xo40Var22.e.setGravity(1);
        }
        g060 g060VarC1 = C0();
        RoundInitializeResponse roundInitializeResponseD2 = C0().c.d();
        g060VarC1.x1(new RoundRequest(roundInitializeResponseD2 != null ? Long.valueOf(roundInitializeResponseD2.getRoundId()) : null));
        C0().z1();
    }

    public final void J0() {
        this.w0 = false;
        this.x0 = false;
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.f.E(1.0f, true);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.e.a(8);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.e.b(4, 0);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            BetBoxContainer betBoxContainer = xo40Var4.e;
            g060.a aVar = this.y0;
            betBoxContainer.setBetAmount(Double.valueOf(aVar != null ? aVar.a : 0.0d), this.U);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            ChipSlider chipSlider = xo40Var5.X;
            g060.a aVar2 = this.y0;
            chipSlider.setBetAmount(aVar2 != null ? aVar2.a : 0.0d, this.U);
        }
        g060 g060VarC0 = C0();
        g060.a aVar3 = this.y0;
        g060VarC0.d.m(Double.valueOf(aVar3 != null ? aVar3.a : 0.0d));
        C0().e.m(null);
        t0();
        r0();
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.y.setVisibility(8);
        }
    }

    public final void K0() {
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.d0.setAlpha(1.0f);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.d0.setEnabled(true);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.c0.setAlpha(1.0f);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.c0.setEnabled(true);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            xo40Var5.c0.setClickable(true);
        }
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.d0.setClickable(true);
        }
        xo40 xo40Var7 = (xo40) this.b;
        if (xo40Var7 != null) {
            xo40Var7.N.setAlpha(1.0f);
        }
        xo40 xo40Var8 = (xo40) this.b;
        if (xo40Var8 != null) {
            xo40Var8.N.setEnabled(true);
        }
        xo40 xo40Var9 = (xo40) this.b;
        if (xo40Var9 != null) {
            xo40Var9.c.setAlpha(1.0f);
        }
        xo40 xo40Var10 = (xo40) this.b;
        if (xo40Var10 != null) {
            xo40Var10.d.setEnabled(true);
        }
        xo40 xo40Var11 = (xo40) this.b;
        if (xo40Var11 != null) {
            xo40Var11.z.setAlpha(1.0f);
        }
        xo40 xo40Var12 = (xo40) this.b;
        if (xo40Var12 != null) {
            xo40Var12.z.setEnabled(true);
        }
        xo40 xo40Var13 = (xo40) this.b;
        if (xo40Var13 != null) {
            xo40Var13.i0.setAlpha(1.0f);
        }
        if (!this.w0) {
            xo40 xo40Var14 = (xo40) this.b;
            if (xo40Var14 != null) {
                xo40Var14.f.setAlpha(1.0f);
            }
            xo40 xo40Var15 = (xo40) this.b;
            if (xo40Var15 != null) {
                xo40Var15.f.setEnabled(true);
            }
            xo40 xo40Var16 = (xo40) this.b;
            if (xo40Var16 != null) {
                xo40Var16.X.setAlpha(1.0f);
            }
            xo40 xo40Var17 = (xo40) this.b;
            if (xo40Var17 != null) {
                xo40Var17.X.setEnabled(true);
            }
        }
        xo40 xo40Var18 = (xo40) this.b;
        if (xo40Var18 != null) {
            xo40Var18.D.a(4);
        }
        xo40 xo40Var19 = (xo40) this.b;
        if (xo40Var19 != null) {
            RecyclerView.f adapter = xo40Var19.a0.a.getAdapter();
            adapter.getClass();
            w6s w6sVar = (w6s) adapter;
            w6sVar.c = 0;
            w6sVar.notifyDataSetChanged();
        }
    }

    public final void L0() {
        this.Z = 1;
        this.V = 0;
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.b0.setVisibility(8);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.z.setVisibility(0);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.X.setVisibility(0);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.f.setVisibility(0);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            xo40Var5.d0.setVisibility(0);
        }
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.c0.setVisibility(0);
        }
        xo40 xo40Var7 = (xo40) this.b;
        if (xo40Var7 != null) {
            xo40Var7.N.setVisibility(8);
        }
        xo40 xo40Var8 = (xo40) this.b;
        if (xo40Var8 != null) {
            xo40Var8.c.setVisibility(8);
        }
        xo40 xo40Var9 = (xo40) this.b;
        if (xo40Var9 != null) {
            xo40Var9.C.setVisibility(4);
        }
        xo40 xo40Var10 = (xo40) this.b;
        if (xo40Var10 != null) {
            F0(xo40Var10.A, this.g0, 1);
        }
        xo40 xo40Var11 = (xo40) this.b;
        if (xo40Var11 != null) {
            xo40Var11.L.setVisibility(8);
        }
        xo40 xo40Var12 = (xo40) this.b;
        if (xo40Var12 != null) {
            xo40Var12.e.setGravity(1);
        }
        fph0 fph0Var = this.F;
        fph0Var.getClass();
        fph0Var.i(null, false);
        g060 g060VarC0 = C0();
        RoundInitializeResponse roundInitializeResponseD = C0().c.d();
        g060VarC0.x1(new RoundRequest(roundInitializeResponseD != null ? Long.valueOf(roundInitializeResponseD.getRoundId()) : null));
        C0().z1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(AppCompatImageView appCompatImageView, String str, x1b x1bVar) {
        xn40 xn40Var;
        if (x1bVar instanceof xn40) {
            xn40Var = (xn40) x1bVar;
            int i2 = xn40Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xn40Var.d = i2 - Integer.MIN_VALUE;
            } else {
                xn40Var = new xn40(this, x1bVar);
            }
        } else {
            xn40Var = new xn40(this, x1bVar);
        }
        Object objC = xn40Var.b;
        y5b y5bVar = y5b.a;
        int i3 = xn40Var.d;
        if (i3 == 0) {
            uj50.b(objC);
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = getContext();
            xn40Var.a = appCompatImageView;
            xn40Var.d = 1;
            objC = r9n.c(xn40Var, context, str);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            appCompatImageView = xn40Var.a;
            uj50.b(objC);
        }
        appCompatImageView.setImageBitmap((Bitmap) objC);
        return Unit.a;
    }

    public final void N0(boolean z2) {
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.d0.setAlpha(0.5f);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.d0.setEnabled(false);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.c0.setAlpha(0.5f);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.c0.setEnabled(false);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            xo40Var5.c0.setClickable(false);
        }
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.d0.setClickable(false);
        }
        xo40 xo40Var7 = (xo40) this.b;
        if (xo40Var7 != null) {
            xo40Var7.N.setAlpha(0.5f);
        }
        xo40 xo40Var8 = (xo40) this.b;
        if (xo40Var8 != null) {
            xo40Var8.N.setEnabled(false);
        }
        xo40 xo40Var9 = (xo40) this.b;
        if (xo40Var9 != null) {
            xo40Var9.c.setAlpha(0.5f);
        }
        xo40 xo40Var10 = (xo40) this.b;
        if (xo40Var10 != null) {
            xo40Var10.d.setEnabled(false);
        }
        xo40 xo40Var11 = (xo40) this.b;
        if (xo40Var11 != null) {
            xo40Var11.z.setAlpha(0.5f);
        }
        xo40 xo40Var12 = (xo40) this.b;
        if (xo40Var12 != null) {
            xo40Var12.z.setEnabled(false);
        }
        xo40 xo40Var13 = (xo40) this.b;
        if (xo40Var13 != null) {
            xo40Var13.f.setAlpha(0.5f);
        }
        xo40 xo40Var14 = (xo40) this.b;
        if (xo40Var14 != null) {
            xo40Var14.f.setEnabled(false);
        }
        xo40 xo40Var15 = (xo40) this.b;
        if (xo40Var15 != null) {
            xo40Var15.X.setAlpha(0.5f);
        }
        xo40 xo40Var16 = (xo40) this.b;
        if (xo40Var16 != null) {
            xo40Var16.X.setEnabled(false);
        }
        xo40 xo40Var17 = (xo40) this.b;
        if (xo40Var17 != null) {
            xo40Var17.i0.setAlpha(0.5f);
        }
        xo40 xo40Var18 = (xo40) this.b;
        if (xo40Var18 != null) {
            xo40Var18.X.setEnabled(false);
        }
        if (z2) {
            return;
        }
        xo40 xo40Var19 = (xo40) this.b;
        if (xo40Var19 != null) {
            xo40Var19.D.a(0);
        }
        xo40 xo40Var20 = (xo40) this.b;
        if (xo40Var20 != null) {
            RecyclerView.f adapter = xo40Var20.a0.a.getAdapter();
            adapter.getClass();
            w6s w6sVar = (w6s) adapter;
            w6sVar.c = 1;
            w6sVar.notifyDataSetChanged();
        }
    }

    public final void O0() {
        boolean z2;
        Context context;
        try {
            new brr();
            GameDetails gameDetails = this.H;
            if (gameDetails != null) {
                gameDetails.getDisplayName();
            }
            z2 = true;
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            z2 = false;
        }
        SharedPreferences sharedPreferences = this.Q;
        if (sharedPreferences == null || sharedPreferences.getBoolean("ONE_TAP", false) || !z2) {
            return;
        }
        Context context2 = getContext();
        String string = context2 != null ? context2.getString(R.string.one_tap_choice_label) : null;
        if (string == null || (context = getContext()) == null) {
            return;
        }
        com.sportygames.commons.components.a aVar = this.d;
        if (aVar == null || !aVar.isVisible()) {
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
            op5 op5Var = op5.a;
            String string2 = getString(R.string.otb_dialog_msg_cms);
            string2.getClass();
            op5Var.getClass();
            String strB = op5.b(string2, string, null);
            String string3 = getString(R.string.yes_btn_cms);
            string3.getClass();
            String string4 = getString(R.string.yes_bet);
            string4.getClass();
            String strB2 = op5.b(string3, string4, null);
            String string5 = getString(R.string.no_btn_cms);
            string5.getClass();
            String string6 = getString(R.string.no_bet);
            string6.getClass();
            aVar2.f(R.id.flContent, com.sportygames.commons.components.a.C0437a.a("Red-Black", "one tap bet", strB, "", strB2, op5.b(string5, string6, null), new Function1() { // from class: nm40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    FragmentManager supportFragmentManager2;
                    FragmentManager supportFragmentManager3;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    nn40 nn40Var = this.a;
                    nn40Var.s0();
                    nn40Var.K0();
                    if (zBooleanValue) {
                        ypa0 ypa0Var = nn40Var.z;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        ypa0Var.J1(ypa0Var.y1().d);
                        SharedPreferences.Editor editor = nn40Var.R;
                        if (zBooleanValue) {
                            if (editor != null) {
                                editor.putBoolean("ONE_TAP", true);
                            }
                        } else if (editor != null) {
                            editor.putBoolean("ONE_TAP", false);
                        }
                        SharedPreferences.Editor editor2 = nn40Var.R;
                        if (editor2 != null) {
                            editor2.apply();
                        }
                        nn40Var.E0();
                        e activity = nn40Var.getActivity();
                        if (activity != null && (supportFragmentManager3 = activity.getSupportFragmentManager()) != null) {
                            supportFragmentManager3.a0();
                        }
                    } else {
                        e activity2 = nn40Var.getActivity();
                        if (activity2 != null && (supportFragmentManager2 = activity2.getSupportFragmentManager()) != null) {
                            supportFragmentManager2.a0();
                        }
                    }
                    return Unit.a;
                }
            }, new om40(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288), null);
            aVar2.c("CONFIRM_DIALOG_FRAGMENT");
            aVar2.d();
        }
    }

    public final void P0() {
        if (getContext() != null) {
            androidx.fragment.app.e activity = getActivity();
            fo2 fo2Var = null;
            if (activity != null) {
                fo2 fo2Var2 = new fo2(activity, "Red-Black");
                fo2Var2.H = new Function2() { // from class: km40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        int iIntValue2 = ((Integer) obj2).intValue();
                        bu2 bu2VarW0 = this.a.w0();
                        PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
                        pagingFetchType.getClass();
                        ej5.c(o8i0.d(bu2VarW0), null, null, new qt2(bu2VarW0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                        return Unit.a;
                    }
                };
                fo2Var2.I = new Function2() { // from class: lm40
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj).intValue();
                        int iIntValue2 = ((Integer) obj2).intValue();
                        bu2 bu2VarW0 = this.a.w0();
                        PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
                        pagingFetchType.getClass();
                        ej5.c(o8i0.d(bu2VarW0), null, null, new qt2(bu2VarW0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                        return Unit.a;
                    }
                };
                fo2Var2.d();
                if (this.z == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                androidx.fragment.app.e eVarRequireActivity = requireActivity();
                eVarRequireActivity.getClass();
                xo2 xo2Var = new xo2();
                xo2Var.e = eVarRequireActivity;
                fo2Var2.g(xo2Var, null);
                fo2Var2.b();
                fo2Var = fo2Var2;
            }
            this.G = fo2Var;
            if (fo2Var != null) {
                fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: mm40
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        fo2 fo2Var3 = this.a.G;
                        if (fo2Var3 != null) {
                            fo2Var3.c();
                        }
                    }
                });
            }
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        String name;
        loj lojVar;
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
        this.e0 = false;
        Context context = getContext();
        int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.red_black_images_array)) == null) ? 0 : stringArray.length) + 7;
        int i2 = 100 / length;
        int i3 = 100 - (length * i2);
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.V.setProgressForApi(i2);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.V.L();
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.V.O(i3);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.V.setVisibility(0);
        }
        if (getContext() != null) {
            GameDetails gameDetails = this.H;
            if (gameDetails != null && (name = gameDetails.getName()) != null && (lojVar = (loj) this.a) != null) {
                ej5.c(o8i0.d(lojVar), null, null, new joj(lojVar, name, null), 3);
            }
            xo40 xo40Var5 = (xo40) this.b;
            if (xo40Var5 != null) {
                xo40Var5.V.E(this.D, this.l0, this.k0, this.o0);
            }
        }
    }

    public final void Q0() {
        boolean z2;
        try {
            z2 = this.z0 != 0 && System.currentTimeMillis() - this.z0 < 30000;
            this.z0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        try {
            xo40 xo40Var = (xo40) this.b;
            if (xo40Var != null) {
                xo40Var.F.setCampaignCompletedText();
            }
            xo40 xo40Var2 = (xo40) this.b;
            if (xo40Var2 != null) {
                xo40Var2.F.setVisibility(0);
            }
            xo40 xo40Var3 = (xo40) this.b;
            if (xo40Var3 != null) {
                xo40Var3.F.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
            }
            ej5.c(ebs.a(getLifecycle()), null, null, new yn40(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void R0(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            GameDetails gameDetails = this.H;
            nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, null, context.getDrawable(R.drawable.redblack_bet_history_bg), function0, 4);
            this.q0 = nleVar;
            nleVar.show();
            if (z2) {
                GameDetails gameDetails2 = this.H;
                wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
            }
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
        this.e0 = false;
        Context context = getContext();
        if (context != null) {
            this.T = new hht(context, "Red-Black");
            String string = getString(R.string.game_not_available);
            hht hhtVar = this.T;
            if (hhtVar != null) {
                string.getClass();
                String string2 = getString(R.string.label_dialog_exit);
                string2.getClass();
                hhtVar.c(string, string2, new f9w(this, 2), new wkr(1), context.getColor(R.color.try_again_color));
                hhtVar.a();
            }
            xo40 xo40Var = (xo40) this.b;
            if (xo40Var != null) {
                xo40Var.A.setVisibility(0);
            }
        }
    }

    @Override // defpackage.l12
    public final g6i0 o0() {
        View viewInflate = getLayoutInflater().inflate(R.layout.redblack_main_game_fragment, (ViewGroup) null, false);
        int i2 = R.id.add_money;
        TextView textView = (TextView) h5e.a(R.id.add_money, viewInflate);
        if (textView != null) {
            i2 = R.id.another_btn;
            ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.another_btn, viewInflate);
            if (constraintLayout != null) {
                i2 = R.id.another_text;
                TextView textView2 = (TextView) h5e.a(R.id.another_text, viewInflate);
                if (textView2 != null) {
                    i2 = R.id.bet_amountbox;
                    BetBoxContainer betBoxContainer = (BetBoxContainer) h5e.a(R.id.bet_amountbox, viewInflate);
                    if (betBoxContainer != null) {
                        i2 = R.id.betchip_container;
                        BetChipContainer betChipContainer = (BetChipContainer) h5e.a(R.id.betchip_container, viewInflate);
                        if (betChipContainer != null) {
                            i2 = R.id.black;
                            TextView textView3 = (TextView) h5e.a(R.id.black, viewInflate);
                            if (textView3 != null) {
                                i2 = R.id.card_back;
                                FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.card_back, viewInflate);
                                if (frameLayout != null) {
                                    i2 = R.id.card_front;
                                    FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.card_front, viewInflate);
                                    if (frameLayout2 != null) {
                                        i2 = R.id.cardlay;
                                        if (((ConstraintLayout) h5e.a(R.id.cardlay, viewInflate)) != null) {
                                            i2 = R.id.chip_overlay;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.chip_overlay, viewInflate);
                                            if (constraintLayout2 != null) {
                                                i2 = R.id.chipboxlay;
                                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.chipboxlay, viewInflate);
                                                if (linearLayoutCompat != null) {
                                                    i2 = R.id.deck_frame;
                                                    FrameLayout frameLayout3 = (FrameLayout) h5e.a(R.id.deck_frame, viewInflate);
                                                    if (frameLayout3 != null) {
                                                        i2 = R.id.drawer_layout;
                                                        DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                        if (drawerLayout != null) {
                                                            i2 = R.id.error_text;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.error_text, viewInflate);
                                                            if (appCompatTextView != null) {
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
                                                                                        i2 = R.id.ivBackground;
                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.ivBackground, viewInflate);
                                                                                        if (appCompatImageView != null) {
                                                                                            i2 = R.id.iv_cards_group;
                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.iv_cards_group, viewInflate);
                                                                                            if (appCompatImageView2 != null) {
                                                                                                i2 = R.id.layout;
                                                                                                if (((ConstraintLayout) h5e.a(R.id.layout, viewInflate)) != null) {
                                                                                                    i2 = R.id.margin;
                                                                                                    View viewA = h5e.a(R.id.margin, viewInflate);
                                                                                                    if (viewA != null) {
                                                                                                        i2 = R.id.navigationView;
                                                                                                        NavigationView navigationView = (NavigationView) h5e.a(R.id.navigationView, viewInflate);
                                                                                                        if (navigationView != null) {
                                                                                                            i2 = R.id.new_container;
                                                                                                            if (((ConstraintLayout) h5e.a(R.id.new_container, viewInflate)) != null) {
                                                                                                                i2 = R.id.new_round;
                                                                                                                RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.new_round, viewInflate);
                                                                                                                if (relativeLayout != null) {
                                                                                                                    i2 = R.id.new_round_button;
                                                                                                                    TextView textView4 = (TextView) h5e.a(R.id.new_round_button, viewInflate);
                                                                                                                    if (textView4 != null) {
                                                                                                                        i2 = R.id.next_hand_btn;
                                                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.next_hand_btn, viewInflate);
                                                                                                                        if (constraintLayout3 != null) {
                                                                                                                            i2 = R.id.next_hand_text;
                                                                                                                            TextView textView5 = (TextView) h5e.a(R.id.next_hand_text, viewInflate);
                                                                                                                            if (textView5 != null) {
                                                                                                                                i2 = R.id.onboarding_images;
                                                                                                                                FrameLayout frameLayout4 = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                if (frameLayout4 != null) {
                                                                                                                                    i2 = R.id.pay_text;
                                                                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.pay_text, viewInflate);
                                                                                                                                    if (appCompatTextView2 != null) {
                                                                                                                                        i2 = R.id.percentView1;
                                                                                                                                        View viewA2 = h5e.a(R.id.percentView1, viewInflate);
                                                                                                                                        if (viewA2 != null) {
                                                                                                                                            i2 = R.id.percentView2;
                                                                                                                                            View viewA3 = h5e.a(R.id.percentView2, viewInflate);
                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                i2 = R.id.percentView3;
                                                                                                                                                View viewA4 = h5e.a(R.id.percentView3, viewInflate);
                                                                                                                                                if (viewA4 != null) {
                                                                                                                                                    i2 = R.id.percentView4;
                                                                                                                                                    View viewA5 = h5e.a(R.id.percentView4, viewInflate);
                                                                                                                                                    if (viewA5 != null) {
                                                                                                                                                        i2 = R.id.progress_meter_component;
                                                                                                                                                        ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                                        if (progressMeterComponent != null) {
                                                                                                                                                            i2 = R.id.red;
                                                                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.red, viewInflate);
                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                i2 = R.id.red_chip_slider;
                                                                                                                                                                ChipSlider chipSlider = (ChipSlider) h5e.a(R.id.red_chip_slider, viewInflate);
                                                                                                                                                                if (chipSlider != null) {
                                                                                                                                                                    i2 = R.id.redblack_card_view;
                                                                                                                                                                    DeckCard deckCard = (DeckCard) h5e.a(R.id.redblack_card_view, viewInflate);
                                                                                                                                                                    if (deckCard != null) {
                                                                                                                                                                        i2 = R.id.redblack_image_view;
                                                                                                                                                                        DeckCard deckCard2 = (DeckCard) h5e.a(R.id.redblack_image_view, viewInflate);
                                                                                                                                                                        if (deckCard2 != null) {
                                                                                                                                                                            i2 = R.id.redblack_level_indicator;
                                                                                                                                                                            LevelIndicator levelIndicator = (LevelIndicator) h5e.a(R.id.redblack_level_indicator, viewInflate);
                                                                                                                                                                            if (levelIndicator != null) {
                                                                                                                                                                                i2 = R.id.redblacklay;
                                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.redblacklay, viewInflate)) != null) {
                                                                                                                                                                                    i2 = R.id.round_result;
                                                                                                                                                                                    RoundResult roundResult = (RoundResult) h5e.a(R.id.round_result, viewInflate);
                                                                                                                                                                                    if (roundResult != null) {
                                                                                                                                                                                        i2 = R.id.select_black_btn;
                                                                                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.select_black_btn, viewInflate);
                                                                                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                                                                                            i2 = R.id.select_red_btn;
                                                                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.select_red_btn, viewInflate);
                                                                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                                                                i2 = R.id.turn_cards;
                                                                                                                                                                                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.turn_cards, viewInflate);
                                                                                                                                                                                                if (recyclerView != null) {
                                                                                                                                                                                                    i2 = R.id.view;
                                                                                                                                                                                                    View viewA6 = h5e.a(R.id.view, viewInflate);
                                                                                                                                                                                                    if (viewA6 != null) {
                                                                                                                                                                                                        i2 = R.id.view2;
                                                                                                                                                                                                        if (((ConstraintLayout) h5e.a(R.id.view2, viewInflate)) != null) {
                                                                                                                                                                                                            i2 = R.id.view_margin;
                                                                                                                                                                                                            View viewA7 = h5e.a(R.id.view_margin, viewInflate);
                                                                                                                                                                                                            if (viewA7 != null) {
                                                                                                                                                                                                                i2 = R.id.view_margin2;
                                                                                                                                                                                                                View viewA8 = h5e.a(R.id.view_margin2, viewInflate);
                                                                                                                                                                                                                if (viewA8 != null) {
                                                                                                                                                                                                                    i2 = R.id.wallet_textView;
                                                                                                                                                                                                                    WalletText walletText = (WalletText) h5e.a(R.id.wallet_textView, viewInflate);
                                                                                                                                                                                                                    if (walletText != null) {
                                                                                                                                                                                                                        return new xo40((CoordinatorLayout) viewInflate, textView, constraintLayout, textView2, betBoxContainer, betChipContainer, textView3, frameLayout, frameLayout2, constraintLayout2, linearLayoutCompat, frameLayout3, drawerLayout, appCompatTextView, gameHeader, composeView, giftToast, sGHamburgerMenu, appCompatImageView, appCompatImageView2, viewA, navigationView, relativeLayout, textView4, constraintLayout3, textView5, frameLayout4, appCompatTextView2, viewA2, viewA3, viewA4, viewA5, progressMeterComponent, textView6, chipSlider, deckCard, deckCard2, levelIndicator, roundResult, constraintLayout4, constraintLayout5, recyclerView, viewA6, viewA7, viewA8, walletText);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.r0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Context context;
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar;
        jl40.e.a = null;
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        if (getView() != null) {
            loj lojVar = (loj) this.a;
            if (lojVar != null && (sswVar = lojVar.b) != null) {
                sswVar.l(getViewLifecycleOwner());
            }
            ((jqh0) this.y.getValue()).b.l(getViewLifecycleOwner());
            C0().i.l(getViewLifecycleOwner());
            C0().f.l(getViewLifecycleOwner());
            D0().b.l(getViewLifecycleOwner());
            w0().b.l(getViewLifecycleOwner());
            z0().b.l(getViewLifecycleOwner());
        }
        if (this.i0 != null && (context = getContext()) != null) {
            fdt fdtVarA = fdt.a(context);
            d dVar = this.i0;
            if (dVar == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA.d(dVar);
        }
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.V.N();
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
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
        Context context;
        q8i0 q8i0Var = this.v0;
        super.onResume();
        if (this.i0 != null && (context = getContext()) != null) {
            fdt fdtVarA = fdt.a(context);
            d dVar = this.i0;
            if (dVar == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA.d(dVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("soundOn");
            fdt fdtVarA2 = fdt.a(context);
            d dVar2 = this.i0;
            if (dVar2 == null) {
                Intrinsics.n("mServiceReceiver");
                throw null;
            }
            fdtVarA2.b(dVar2, intentFilter);
        }
        int i2 = 1;
        if (this.j0) {
            SharedPreferences sharedPreferences = this.Q;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("MUSIC", true)) : null;
            xo40 xo40Var = (xo40) this.b;
            if (xo40Var != null) {
                ProgressMeterComponent progressMeterComponent = xo40Var.V;
                ypa0 ypa0Var = this.z;
                if (ypa0Var == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                String string = getString(R.string.bg_music);
                string.getClass();
                progressMeterComponent.K(ypa0Var, boolValueOf, string);
            }
        }
        try {
            GameDetails gameDetails = this.H;
            String str = "";
            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                name = "";
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), y0());
            GameDetails gameDetails2 = this.H;
            if (gameDetails2 != null && (name2 = gameDetails2.getName()) != null) {
                str = name2;
            }
            androidx.fragment.app.e activity = getActivity();
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            xo40 xo40Var2 = (xo40) this.b;
            ComposeView composeView = xo40Var2 != null ? xo40Var2.E : null;
            String str2 = str;
            z66 z66Var = this.s0;
            if (z66Var == null) {
                Intrinsics.n("campaignEndDialog");
                throw null;
            }
            ra6.b(str2, activity, viewLifecycleOwner2, composeView, z66Var, y0(), (db6) q8i0Var.getValue(), 0L, null, new tld0(this.H), new Function1() { // from class: kl40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    nn40 nn40Var = this.a;
                    CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                    try {
                        nn40Var.t0 = campaignTopicResponse != null;
                        if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                            nn40Var.Q0();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return Unit.a;
                }
            }, new oo00(this, i2), null, 18048);
            y0().x1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        ypa0 ypa0Var = this.z;
        if (ypa0Var != null) {
            ypa0Var.G1();
            if (((xo40) this.b) != null) {
                ypa0 ypa0Var2 = this.z;
                if (ypa0Var2 == null) {
                    Intrinsics.n("soundViewModel");
                    throw null;
                }
                ypa0Var2.I1();
            }
        }
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ssw<LoadingState<HTTPResponse<GameAvailableResponse>>> sswVar;
        ssw<LoadingState<HTTPResponse<List<GameDetails>>>> sswVar2;
        String name;
        loj lojVar;
        ImageView crossFbg;
        xo40 xo40Var;
        AppCompatImageView chat;
        Resources resources;
        DisplayMetrics displayMetrics;
        ssw<LoadingState<List<File>>> sswVar3;
        ssw<Integer> liveData;
        Resources resources2;
        String[] stringArray;
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
        this.D = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        SportyGamesManager.getInstance().setScreenName("sportygames/red-black");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            qlf.d(activity);
            qlf.c(window, activity.getColor(R.color.toolbar_strip_red_black));
        }
        Context context = getContext();
        int i2 = 0;
        int length = ((context == null || (resources2 = context.getResources()) == null || (stringArray = resources2.getStringArray(R.array.red_black_images_array)) == null) ? 0 : stringArray.length) + 7;
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.V.setVisibility(0);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.V.setProgressForApi(100 / length);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.V.setCurrentProgress(100 - ((100 / length) * length));
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null && (liveData = xo40Var5.V.getLiveData()) != null) {
            liveData.f(getViewLifecycleOwner(), new lfy() { // from class: tl40
                @Override // defpackage.lfy
                public final void u1(Object obj) {
                    Integer num = (Integer) obj;
                    nn40 nn40Var = this.a;
                    if (num != null && num.intValue() == 75) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new vn40(nn40Var, null), 3);
                    }
                    if (num != null && num.intValue() == 100) {
                        pfd pfdVar2 = fse.a;
                        ej5.c(w5b.a(gku.a), null, null, new wn40(nn40Var, null), 3);
                    }
                }
            });
        }
        ArrayList<String> arrayList = vlr.a.get("red-black");
        int i3 = 1;
        if (arrayList != null && arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
            this.o0 = xwj.a();
        }
        SharedPreferences sharedPreferencesA = un20.a(requireContext());
        this.Q = sharedPreferencesA;
        this.R = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
        if (Build.VERSION.SDK_INT <= 25) {
            xo40 xo40Var6 = (xo40) this.b;
            if (xo40Var6 != null) {
                xo40Var6.W.setTextSize(18.0f);
            }
            xo40 xo40Var7 = (xo40) this.b;
            if (xo40Var7 != null) {
                xo40Var7.i.setTextSize(18.0f);
            }
            xo40 xo40Var8 = (xo40) this.b;
            if (xo40Var8 != null) {
                xo40Var8.O.setTextSize(18.0f);
            }
        }
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        v8i0 viewModelStore2 = eVarRequireActivity.getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = eVarRequireActivity.getDefaultViewModelProviderFactory();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, sd7.a(eVarRequireActivity, viewModelStore2, defaultViewModelProviderFactory2));
        dq7 dq7VarA2 = jq40.a(ypa0.class);
        String strI2 = dq7VarA2.i();
        if (strI2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.z = (ypa0) s8i0Var2.a(dq7VarA2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI2));
        fq5 fq5Var = this.D;
        if (fq5Var != null && (sswVar3 = fq5Var.c) != null) {
            sswVar3.f(getViewLifecycleOwner(), new e(new enh(this, i3)));
        }
        SportyGamesManager.getInstance().addAccountUpdatedListener(this);
        String string = getString(R.string.guest_username);
        string.getClass();
        this.f = string;
        Context context2 = getContext();
        int i4 = (context2 == null || (resources = context2.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0 : displayMetrics.widthPixels;
        xo40 xo40Var9 = (xo40) this.b;
        ViewGroup.LayoutParams layoutParams = xo40Var9 != null ? xo40Var9.K.getLayoutParams() : null;
        layoutParams.getClass();
        DrawerLayout.LayoutParams layoutParams2 = (DrawerLayout.LayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) layoutParams2).width = (i4 * 72) / 100;
        xo40 xo40Var10 = (xo40) this.b;
        if (xo40Var10 != null) {
            xo40Var10.K.setLayoutParams(layoutParams2);
        }
        androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        if (this.z == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        this.S = new xbg(eVarRequireActivity2, "Red-Black");
        try {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                String str = ((db6) this.v0.getValue()).c;
                if (str == null) {
                    str = "Ongoing";
                }
                this.s0 = new z66(activity2, str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.i0 = new d();
        androidx.fragment.app.e activity3 = getActivity();
        this.T = activity3 != null ? new hht(activity3, "Red-Black") : null;
        this.g0 = (getResources().getDisplayMetrics().widthPixels * 7) / 10;
        N0(false);
        xo40 xo40Var11 = (xo40) this.b;
        if (xo40Var11 != null) {
            xo40Var11.B.setScrimColor(requireContext().getColor(R.color.trans_black_60));
        }
        xo40 xo40Var12 = (xo40) this.b;
        if (xo40Var12 != null && (chat = xo40Var12.D.getChat()) != null) {
            chat.setOnClickListener(new View.OnClickListener() { // from class: an40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    nn40 nn40Var = this.a;
                    try {
                        Intent intent = new Intent(nn40Var.requireContext(), (Class<?>) ChatActivity.class);
                        intent.putExtra("roomId", nn40Var.i);
                        intent.putExtra("botId", nn40Var.w);
                        intent.putExtra("color", R.color.toolbar_strip_bottle);
                        GameDetails gameDetails = nn40Var.H;
                        intent.putExtra(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails != null ? gameDetails.getName() : null);
                        intent.putExtra("sound", nn40Var.H);
                        SharedPreferences sharedPreferences = nn40Var.Q;
                        intent.putExtra("soundOn", sharedPreferences != null ? sharedPreferences.getBoolean("SOUND", false) : false);
                        e activity4 = nn40Var.getActivity();
                        if (activity4 != null) {
                            activity4.overridePendingTransition(R.anim.slide_in_up, R.anim.slide_in_up);
                        }
                        nn40Var.requireContext().startActivity(intent);
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            });
        }
        xo40 xo40Var13 = (xo40) this.b;
        if (xo40Var13 != null) {
            xo40Var13.D.setBackListener(new pmh(this, 2));
        }
        xo40 xo40Var14 = (xo40) this.b;
        if (xo40Var14 != null) {
            xo40Var14.f.setColor(R.color.chip_bg_rb);
        }
        xo40 xo40Var15 = (xo40) this.b;
        if (xo40Var15 != null) {
            xo40Var15.b.setOnClickListener(new ml40());
        }
        if (Build.VERSION.SDK_INT == 25 && (xo40Var = (xo40) this.b) != null) {
            xo40Var.b.setTextSize(14.0f);
        }
        xo40 xo40Var16 = (xo40) this.b;
        if (xo40Var16 != null) {
            xo40Var16.D.a(0);
        }
        androidx.fragment.app.e eVarRequireActivity3 = requireActivity();
        eVarRequireActivity3.getClass();
        l12.m0(eVarRequireActivity3);
        androidx.fragment.app.e eVarRequireActivity4 = requireActivity();
        eVarRequireActivity4.getClass();
        this.g0 = l12.n0(eVarRequireActivity4);
        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(requireContext(), R.animator.out_image);
        animatorLoadAnimator.getClass();
        this.K = (AnimatorSet) animatorLoadAnimator;
        Animator animatorLoadAnimator2 = AnimatorInflater.loadAnimator(requireContext(), R.animator.flip_image);
        animatorLoadAnimator2.getClass();
        this.L = (AnimatorSet) animatorLoadAnimator2;
        xo40 xo40Var17 = (xo40) this.b;
        if (xo40Var17 != null) {
            xo40Var17.D.setAlpha(0.5f);
        }
        float f2 = getResources().getDisplayMetrics().density * 8000.0f;
        xo40 xo40Var18 = (xo40) this.b;
        if (xo40Var18 != null) {
            xo40Var18.w.setCameraDistance(f2);
        }
        xo40 xo40Var19 = (xo40) this.b;
        if (xo40Var19 != null) {
            xo40Var19.v.setCameraDistance(f2);
        }
        xo40 xo40Var20 = (xo40) this.b;
        if (xo40Var20 != null) {
            xo40Var20.D.setNavigationListener(new rmh(this, i3));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        fph0 fph0Var = new fph0(contextRequireContext);
        this.F = fph0Var;
        xo40 xo40Var21 = (xo40) this.b;
        if (xo40Var21 != null) {
            xo40Var21.e0.setAdapter(fph0Var);
        }
        xo40 xo40Var22 = (xo40) this.b;
        if (xo40Var22 != null) {
            RecyclerView recyclerView = xo40Var22.e0;
            getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        }
        xo40 xo40Var23 = (xo40) this.b;
        if (xo40Var23 != null) {
            gr60.a(xo40Var23.c0, new htc(this, i3));
        }
        xo40 xo40Var24 = (xo40) this.b;
        if (xo40Var24 != null) {
            gr60.a(xo40Var24.d0, new Function1() { // from class: nl40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    nn40 nn40Var = this.a;
                    ((View) obj).getClass();
                    try {
                        if (nn40Var.C0().d.d() != null) {
                            String string2 = nn40Var.getString(R.string.red);
                            string2.getClass();
                            nn40Var.p0(string2, BetCardDecision.RED);
                        }
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    return Unit.a;
                }
            });
        }
        xo40 xo40Var25 = (xo40) this.b;
        if (xo40Var25 != null) {
            gr60.a(xo40Var25.N, new Function1() { // from class: ol40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    this.a.I0();
                    return Unit.a;
                }
            });
        }
        xo40 xo40Var26 = (xo40) this.b;
        if (xo40Var26 != null) {
            gr60.a(xo40Var26.c, new pl40(this, i2));
        }
        xo40 xo40Var27 = (xo40) this.b;
        if (xo40Var27 != null) {
            gr60.a(xo40Var27.M, new no00(this, i3));
        }
        xo40 xo40Var28 = (xo40) this.b;
        if (xo40Var28 != null) {
            xo40Var28.f.setBetAmountAddListener(new Function1() { // from class: ql40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    double dDoubleValue = ((Double) obj).doubleValue();
                    nn40 nn40Var = this.a;
                    if (nn40Var.w0) {
                        return Unit.a;
                    }
                    ypa0 ypa0Var = nn40Var.z;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    String string2 = nn40Var.getString(R.string.click_chip);
                    string2.getClass();
                    ypa0Var.A1(0L, string2);
                    nn40Var.V = 1;
                    xo40 xo40Var29 = (xo40) nn40Var.b;
                    if (xo40Var29 != null) {
                        xo40Var29.X.setBetAmount(dDoubleValue, nn40Var.U);
                    }
                    xo40 xo40Var30 = (xo40) nn40Var.b;
                    Double dValueOf = xo40Var30 != null ? Double.valueOf(xo40Var30.e.getI()) : null;
                    dValueOf.getClass();
                    nn40Var.Y = dValueOf.doubleValue() + dDoubleValue;
                    ssw<Double> sswVar4 = nn40Var.C0().d;
                    Double d2 = sswVar4.d();
                    sswVar4.m(d2 != null ? Double.valueOf(d2.doubleValue() + dDoubleValue) : null);
                    Double d3 = nn40Var.C0().d.d();
                    double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
                    Double d4 = nn40Var.N;
                    double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
                    B b2 = nn40Var.b;
                    if (dDoubleValue2 > dDoubleValue3) {
                        xo40 xo40Var31 = (xo40) b2;
                        if (xo40Var31 != null) {
                            xo40Var31.C.setVisibility(0);
                        }
                        xo40 xo40Var32 = (xo40) nn40Var.b;
                        if (xo40Var32 != null) {
                            xo40Var32.e.setErrorBetAmount();
                        }
                    } else {
                        xo40 xo40Var33 = (xo40) b2;
                        if (xo40Var33 != null) {
                            xo40Var33.C.setVisibility(4);
                        }
                        xo40 xo40Var34 = (xo40) nn40Var.b;
                        if (xo40Var34 != null) {
                            xo40Var34.e.setErrorBetAmountLayout();
                        }
                    }
                    return Unit.a;
                }
            });
        }
        xo40 xo40Var29 = (xo40) this.b;
        if (xo40Var29 != null) {
            xo40Var29.f.setFbgClickListener(new Function1() { // from class: en40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    e activity4;
                    xi60 xi60Var;
                    BetAmountVO betAmountVO;
                    BetAmountVO betAmountVO2;
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    final nn40 nn40Var = this.a;
                    if (nn40Var.w0 || nn40Var.J != null) {
                        return Unit.a;
                    }
                    ypa0 ypa0Var = nn40Var.z;
                    if (ypa0Var == null) {
                        Intrinsics.n("soundViewModel");
                        throw null;
                    }
                    String string2 = nn40Var.getString(R.string.click_chip);
                    string2.getClass();
                    ypa0Var.A1(0L, string2);
                    if (zBooleanValue && (activity4 = nn40Var.getActivity()) != null) {
                        g060 g060VarC0 = nn40Var.C0();
                        ssw<RoundInitializeResponse> sswVar4 = g060VarC0.c;
                        Double d2 = g060VarC0.d.d();
                        double maxAmount = 0.0d;
                        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                        RoundInitializeResponse roundInitializeResponseD = sswVar4.d();
                        double userBalance = roundInitializeResponseD != null ? roundInitializeResponseD.getUserBalance() : 0.0d;
                        RoundInitializeResponse roundInitializeResponseD2 = sswVar4.d();
                        double minAmount = (roundInitializeResponseD2 == null || (betAmountVO2 = roundInitializeResponseD2.getBetAmountVO()) == null) ? 0.0d : betAmountVO2.getMinAmount();
                        RoundInitializeResponse roundInitializeResponseD3 = sswVar4.d();
                        if (roundInitializeResponseD3 != null && (betAmountVO = roundInitializeResponseD3.getBetAmountVO()) != null) {
                            maxAmount = betAmountVO.getMaxAmount();
                        }
                        nn40Var.y0 = new g060.a(dDoubleValue, minAmount, maxAmount, userBalance);
                        xi60 xi60Var2 = new xi60();
                        nn40Var.J = xi60Var2;
                        if (!xi60Var2.isAdded() && (xi60Var = nn40Var.J) != null) {
                            FragmentManager supportFragmentManager = activity4.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            xi60Var.q0(supportFragmentManager, new to00(nn40Var, 1), new gaj() { // from class: ul40
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                                    Dialog dialog;
                                    GiftItem giftItem = (GiftItem) obj2;
                                    Double d3 = (Double) obj3;
                                    double dDoubleValue2 = d3.doubleValue();
                                    boolean zBooleanValue2 = ((Boolean) obj4).booleanValue();
                                    giftItem.getClass();
                                    nn40 nn40Var2 = nn40Var;
                                    nn40Var2.w0 = true;
                                    nn40Var2.x0 = zBooleanValue2;
                                    xi60 xi60Var3 = nn40Var2.J;
                                    if (xi60Var3 != null && (dialog = xi60Var3.getDialog()) != null && dialog.isShowing()) {
                                        xi60 xi60Var4 = nn40Var2.J;
                                        if (xi60Var4 != null) {
                                            xi60Var4.dismiss();
                                        }
                                        nn40Var2.J = null;
                                    }
                                    xo40 xo40Var30 = (xo40) nn40Var2.b;
                                    if (xo40Var30 != null) {
                                        xo40Var30.e.a(0);
                                    }
                                    xo40 xo40Var31 = (xo40) nn40Var2.b;
                                    if (xo40Var31 != null) {
                                        xo40Var31.e.b(0, 4);
                                    }
                                    xo40 xo40Var32 = (xo40) nn40Var2.b;
                                    if (xo40Var32 != null) {
                                        xo40Var32.e.setBetAmount(d3, nn40Var2.U);
                                    }
                                    xo40 xo40Var33 = (xo40) nn40Var2.b;
                                    if (xo40Var33 != null) {
                                        xo40Var33.X.setBetAmount(dDoubleValue2, nn40Var2.U);
                                    }
                                    xo40 xo40Var34 = (xo40) nn40Var2.b;
                                    if (xo40Var34 != null) {
                                        xo40Var34.y.setVisibility(0);
                                    }
                                    g060.a aVar = nn40Var2.y0;
                                    double d4 = (aVar != null ? aVar.a : 0.0d) - dDoubleValue2;
                                    nn40Var2.C0().d.m(d3);
                                    xo40 xo40Var35 = (xo40) nn40Var2.b;
                                    if (xo40Var35 != null) {
                                        xo40Var35.f.setEnabled(false);
                                    }
                                    xo40 xo40Var36 = (xo40) nn40Var2.b;
                                    if (xo40Var36 != null) {
                                        xo40Var36.f.setAlpha(0.5f);
                                    }
                                    xo40 xo40Var37 = (xo40) nn40Var2.b;
                                    if (xo40Var37 != null) {
                                        xo40Var37.f.E(0.5f, false);
                                    }
                                    xo40 xo40Var38 = (xo40) nn40Var2.b;
                                    if (xo40Var38 != null) {
                                        xo40Var38.X.setEnabled(false);
                                    }
                                    xo40 xo40Var39 = (xo40) nn40Var2.b;
                                    if (xo40Var39 != null) {
                                        xo40Var39.X.setAlpha(0.5f);
                                    }
                                    xo40 xo40Var40 = (xo40) nn40Var2.b;
                                    if (xo40Var40 != null) {
                                        xo40Var40.X.b(false);
                                    }
                                    nn40Var2.C0().e.m(new g060.b(giftItem, dDoubleValue2, d4));
                                    return Unit.a;
                                }
                            }, new n2w(nn40Var, 1));
                        }
                    }
                    return Unit.a;
                }
            });
        }
        xo40 xo40Var30 = (xo40) this.b;
        if (xo40Var30 != null && (crossFbg = xo40Var30.e.getCrossFbg()) != null) {
            gr60.a(crossFbg, new Function1() { // from class: kn40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    nn40 nn40Var = this.a;
                    GameDetails gameDetails = nn40Var.H;
                    String name2 = gameDetails != null ? gameDetails.getName() : null;
                    if (name2 == null) {
                        name2 = "";
                    }
                    wz.a("FBGRemoved", name2, new String[0]);
                    nn40Var.J0();
                    return Unit.a;
                }
            });
        }
        zp40 zp40Var = new zp40();
        xo40 xo40Var31 = (xo40) this.b;
        if (xo40Var31 != null) {
            xo40Var31.X.setAmountChangeListener(new Function2() { // from class: mn40
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Double d2 = (Double) obj;
                    d2.getClass();
                    if (((Boolean) obj2).booleanValue()) {
                        nn40 nn40Var = this.a;
                        ypa0 ypa0Var = nn40Var.z;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string2 = nn40Var.getString(R.string.slider);
                        string2.getClass();
                        ypa0Var.A1(0L, string2);
                        nn40Var.C0().d.m(d2);
                    }
                    return Unit.a;
                }
            }, new zsc(i3, zp40Var, this), new Function1() { // from class: ll40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Double d2 = (Double) obj;
                    nn40 nn40Var = this.a;
                    if (d2 != null) {
                        if (!Intrinsics.a(nn40Var.Y, d2)) {
                            ypa0 ypa0Var = nn40Var.z;
                            if (ypa0Var == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            String string2 = nn40Var.getString(R.string.slider);
                            string2.getClass();
                            ypa0Var.A1(0L, string2);
                        }
                        nn40Var.Y = d2.doubleValue();
                    }
                    nn40Var.C0().d.m(d2);
                    return Unit.a;
                }
            });
        }
        GameDetails gameDetails = this.H;
        if (gameDetails != null && (name = gameDetails.getName()) != null && (lojVar = (loj) this.a) != null) {
            ej5.c(o8i0.d(lojVar), null, null, new joj(lojVar, name, null), 3);
        }
        loj lojVar2 = (loj) this.a;
        if (lojVar2 != null && (sswVar2 = lojVar2.d) != null) {
            sswVar2.f(getViewLifecycleOwner(), new e(new jp00(this, i3)));
        }
        E0();
        loj lojVar3 = (loj) this.a;
        if (lojVar3 != null && (sswVar = lojVar3.b) != null) {
            sswVar.f(getViewLifecycleOwner(), new e(new sl40(this, i2)));
        }
        ((jqh0) this.y.getValue()).b.f(getViewLifecycleOwner(), new e(new gm40(this, i2)));
        C0().b.f(getViewLifecycleOwner(), new e(new Function1() { // from class: dm40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                RoundInitializeResponse roundInitializeResponse;
                RoundInitializeResponse roundInitializeResponse2;
                RoundInitializeResponse roundInitializeResponse3;
                ResultWrapper.GenericError error;
                Integer code;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = nn40.a.a[loadingState.getStatus().ordinal()];
                final nn40 nn40Var = this.a;
                int i6 = 1;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    nn40Var.P = (hTTPResponse == null || (roundInitializeResponse3 = (RoundInitializeResponse) hTTPResponse.getData()) == null) ? null : roundInitializeResponse3.getBetAmountVO();
                    g060 g060VarC0 = nn40Var.C0();
                    RoundInitializeResponse roundInitializeResponseD = nn40Var.C0().c.d();
                    g060VarC0.y1(new RoundRequest(roundInitializeResponseD != null ? Long.valueOf(roundInitializeResponseD.getRoundId()) : null));
                    xo40 xo40Var32 = (xo40) nn40Var.b;
                    if (xo40Var32 != null) {
                        xo40Var32.Y.setCardUnDraw();
                    }
                    xo40 xo40Var33 = (xo40) nn40Var.b;
                    if (xo40Var33 != null) {
                        LevelIndicator levelIndicator = xo40Var33.a0;
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        levelIndicator.setCurrentTurn((hTTPResponse2 == null || (roundInitializeResponse2 = (RoundInitializeResponse) hTTPResponse2.getData()) == null) ? null : Integer.valueOf(roundInitializeResponse2.getTurnId()));
                    }
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    nn40Var.U = (hTTPResponse3 == null || (roundInitializeResponse = (RoundInitializeResponse) hTTPResponse3.getData()) == null) ? null : roundInitializeResponse.getBetChipList();
                    q530 q530VarZ0 = nn40Var.z0();
                    ej5.c(o8i0.d(q530VarZ0), null, null, new w530(q530VarZ0, null), 3);
                    nn40Var.C0().d.f(nn40Var.getViewLifecycleOwner(), new nn40.e(new ss00(nn40Var, i6)));
                    xo40 xo40Var34 = (xo40) nn40Var.b;
                    if (xo40Var34 != null) {
                        xo40Var34.V.P();
                    }
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    e activity4 = nn40Var.getActivity();
                    if (activity4 != null) {
                        xo40 xo40Var35 = (xo40) nn40Var.b;
                        if (xo40Var35 != null) {
                            xo40Var35.V.O(100);
                        }
                        xbg xbgVar = nn40Var.S;
                        if (xbgVar == null) {
                            Intrinsics.n("errorDialog");
                            throw null;
                        }
                        if (!xbgVar.isShowing() && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 403)) {
                            xo40 xo40Var36 = (xo40) nn40Var.b;
                            if (xo40Var36 != null) {
                                xo40Var36.A.setVisibility(0);
                            }
                            jl40 jl40Var = jl40.e;
                            if (nn40Var.z == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            jcg.d(jl40Var, activity4, "Red-Black", loadingState.getError(), new yjr(nn40Var, i6), new Function0() { // from class: bn40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    nn40Var.L0();
                                    return Unit.a;
                                }
                            }, new Function0() { // from class: cn40
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    nn40 nn40Var2 = nn40Var;
                                    nn40Var2.C0().z1();
                                    nn40Var2.N0(false);
                                    return Unit.a;
                                }
                            }, 0, activity4.getColor(R.color.try_again_color), null, null, null, new vr00(nn40Var, i6), null, 85376);
                            nn40Var.K0();
                        }
                    }
                }
                return Unit.a;
            }
        }));
        D0().b.f(getViewLifecycleOwner(), new e(new Function1() { // from class: cm40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PlaceBetResponse placeBetResponse;
                UserCard userCard;
                PlaceBetResponse placeBetResponse2;
                PlaceBetResponse placeBetResponse3;
                PlaceBetResponse placeBetResponse4;
                xo40 xo40Var32;
                BetCardDecision betCardDecisionValueOf;
                BetCardDecision betCardDecisionValueOf2;
                xo40 xo40Var33;
                PlaceBetResponse placeBetResponse5;
                UserCard userCard2;
                ResultWrapper.GenericError error;
                Integer code;
                Integer code2;
                Integer code3;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = nn40.a.a[loadingState.getStatus().ordinal()];
                final nn40 nn40Var = this.a;
                boolean z2 = false;
                int i6 = 1;
                if (i5 == 1) {
                    jqh0 jqh0Var = (jqh0) nn40Var.y.getValue();
                    ej5.c(o8i0.d(jqh0Var), null, null, new iqh0(jqh0Var, nn40Var.Z, null), 3);
                    nn40Var.z0().x1();
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    UserCard userCardCopy$default = (hTTPResponse == null || (placeBetResponse5 = (PlaceBetResponse) hTTPResponse.getData()) == null || (userCard2 = placeBetResponse5.getUserCard()) == null) ? null : UserCard.copy$default(userCard2, null, null, null, null, null, null, null, 127, null);
                    if (userCardCopy$default != null && (xo40Var33 = (xo40) nn40Var.b) != null) {
                        xo40Var33.Z.setCardDraw(new CardDetail(userCardCopy$default));
                    }
                    xo40 xo40Var34 = (xo40) nn40Var.b;
                    if (xo40Var34 != null) {
                        xo40Var34.e0.setVisibility(8);
                    }
                    HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                    PlaceBetResponse placeBetResponse6 = hTTPResponse2 != null ? (PlaceBetResponse) hTTPResponse2.getData() : null;
                    if (placeBetResponse6 != null) {
                        nn40Var.O = placeBetResponse6;
                        AnimatorSet animatorSet = nn40Var.K;
                        if (animatorSet != null) {
                            xo40 xo40Var35 = (xo40) nn40Var.b;
                            animatorSet.setTarget(xo40Var35 != null ? xo40Var35.w : null);
                        }
                        AnimatorSet animatorSet2 = nn40Var.L;
                        if (animatorSet2 != null) {
                            xo40 xo40Var36 = (xo40) nn40Var.b;
                            animatorSet2.setTarget(xo40Var36 != null ? xo40Var36.v : null);
                        }
                        AnimatorSet animatorSet3 = nn40Var.K;
                        if (animatorSet3 != null) {
                            animatorSet3.start();
                        }
                        AnimatorSet animatorSet4 = nn40Var.L;
                        if (animatorSet4 != null) {
                            animatorSet4.start();
                        }
                        AnimatorSet animatorSet5 = nn40Var.K;
                        if (animatorSet5 != null) {
                            animatorSet5.addListener(new sn40(nn40Var, placeBetResponse6));
                        }
                    }
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse3 != null && (placeBetResponse4 = (PlaceBetResponse) hTTPResponse3.getData()) != null && (xo40Var32 = (xo40) nn40Var.b) != null) {
                        RoundResult roundResult = xo40Var32.b0;
                        PlaceBetRequest placeBetRequest = nn40Var.D0().c;
                        if (placeBetRequest == null) {
                            Intrinsics.n("placeBetRequest");
                            throw null;
                        }
                        try {
                            if (placeBetResponse4.getWinStatus()) {
                                String color = placeBetResponse4.getUserCard().getColor();
                                if (color != null && (betCardDecisionValueOf2 = BetCardDecision.valueOf(color)) != null) {
                                    op5 op5Var = op5.a;
                                    String currency = placeBetResponse4.getCurrency();
                                    op5Var.getClass();
                                    roundResult.b(betCardDecisionValueOf2, op5.i(currency), placeBetResponse4);
                                }
                            } else {
                                String color2 = placeBetResponse4.getUserCard().getColor();
                                if (color2 != null && (betCardDecisionValueOf = BetCardDecision.valueOf(color2)) != null) {
                                    roundResult.a(betCardDecisionValueOf, placeBetRequest.getDecision());
                                }
                            }
                        } catch (Exception unused) {
                        }
                    }
                    HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                    int turnId = (hTTPResponse4 == null || (placeBetResponse3 = (PlaceBetResponse) hTTPResponse4.getData()) == null) ? 0 : placeBetResponse3.getTurnId();
                    nn40Var.M = turnId;
                    if (turnId == 5) {
                        nn40Var.Z = 1;
                        xo40 xo40Var37 = (xo40) nn40Var.b;
                        if (xo40Var37 != null) {
                            xo40Var37.c.setBackgroundColor(nn40Var.requireContext().getColor(R.color.redblack_next_hand));
                        }
                        b bVar = new b();
                        xo40 xo40Var38 = (xo40) nn40Var.b;
                        bVar.f(xo40Var38 != null ? xo40Var38.c : null);
                        bVar.k(R.id.another_text, 0.5f);
                        xo40 xo40Var39 = (xo40) nn40Var.b;
                        bVar.b(xo40Var39 != null ? xo40Var39.c : null);
                    } else {
                        nn40Var.Z = 0;
                        b bVar2 = new b();
                        xo40 xo40Var40 = (xo40) nn40Var.b;
                        bVar2.f(xo40Var40 != null ? xo40Var40.N : null);
                        bVar2.k(R.id.next_hand_text, 0.38f);
                        xo40 xo40Var41 = (xo40) nn40Var.b;
                        bVar2.b(xo40Var41 != null ? xo40Var41.N : null);
                        xo40 xo40Var42 = (xo40) nn40Var.b;
                        if (xo40Var42 != null) {
                            xo40Var42.N.setBackgroundColor(nn40Var.requireContext().getColor(R.color.redblack_next_hand));
                        }
                    }
                    nn40Var.V = 0;
                    HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse5 == null || (placeBetResponse2 = (PlaceBetResponse) hTTPResponse5.getData()) == null || !placeBetResponse2.getWinStatus()) {
                        nn40Var.a0 = 1;
                        HTTPResponse hTTPResponse6 = (HTTPResponse) loadingState.getData();
                        String color3 = (hTTPResponse6 == null || (placeBetResponse = (PlaceBetResponse) hTTPResponse6.getData()) == null || (userCard = placeBetResponse.getUserCard()) == null) ? null : userCard.getColor();
                        Context context3 = nn40Var.getContext();
                        boolean zL = c.l(color3, context3 != null ? context3.getString(R.string.green) : null, true);
                        ypa0 ypa0Var = nn40Var.z;
                        if (zL) {
                            if (ypa0Var == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            String string2 = nn40Var.getString(R.string.house_win);
                            string2.getClass();
                            ypa0Var.A1(3000L, string2);
                        } else {
                            if (ypa0Var == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            String string3 = nn40Var.getString(R.string.game_lose);
                            string3.getClass();
                            ypa0Var.A1(2500L, string3);
                        }
                    } else {
                        ypa0 ypa0Var2 = nn40Var.z;
                        if (ypa0Var2 == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string4 = nn40Var.getString(R.string.game_win);
                        string4.getClass();
                        ypa0Var2.A1(3000L, string4);
                    }
                    CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
                    GameDetails gameDetails2 = nn40Var.H;
                    Pair pair = new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails2 != null ? gameDetails2.getName() : null);
                    Pair pair2 = new Pair("isFBG", Boolean.valueOf(nn40Var.w0));
                    Pair pair3 = new Pair("isPartialFBG", Boolean.valueOf(nn40Var.x0));
                    Pair pair4 = new Pair("betButton", nn40Var.p0);
                    SharedPreferences sharedPreferences = nn40Var.Q;
                    casinoLogger.logEventToCasino("BetPlaced", vj5.a(pair, pair2, pair3, pair4, new Pair("isOneTapBet", sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ONE_TAP", false)) : null), new Pair("Platform", "ANDROID")));
                } else if (i5 != 2) {
                    if (i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    nn40Var.z0().x1();
                    nn40Var.C0().e.m(null);
                    if (nn40Var.w0) {
                        nn40Var.J0();
                    }
                    e activity4 = nn40Var.getActivity();
                    if (activity4 != null) {
                        xo40 xo40Var43 = (xo40) nn40Var.b;
                        if (xo40Var43 != null) {
                            xo40Var43.A.setVisibility(0);
                        }
                        ResultWrapper.GenericError error2 = loadingState.getError();
                        if (error2 == null || (code3 = error2.getCode()) == null || code3.intValue() != 403) {
                            ResultWrapper.GenericError error3 = loadingState.getError();
                            if ((error3 == null || (code2 = error3.getCode()) == null || code2.intValue() != 123450) && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 123451)) {
                                jl40 jl40Var = jl40.e;
                                if (nn40Var.z == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                ResultWrapper.GenericError error4 = loadingState.getError();
                                Function0 function0 = new Function0() { // from class: ym40
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        nn40Var.u0();
                                        return Unit.a;
                                    }
                                };
                                pjr pjrVar = new pjr(nn40Var, 1);
                                zm40 zm40Var = new zm40();
                                loadingState.getError();
                                jcg.d(jl40Var, activity4, "Red-Black", error4, function0, pjrVar, zm40Var, -4, activity4.getColor(R.color.try_again_color), null, null, null, new er00(nn40Var, i6), new gr00(nn40Var, i6), AudioFormat.AUDIO_SAMPLE_RATE_32000);
                            } else {
                                e activity5 = nn40Var.getActivity();
                                GameMainActivity gameMainActivity = activity5 instanceof GameMainActivity ? (GameMainActivity) activity5 : null;
                                if (gameMainActivity != null) {
                                    Integer code4 = loadingState.getError().getCode();
                                    if (code4 != null && code4.intValue() == 123450) {
                                        z2 = true;
                                    }
                                    gameMainActivity.b2(z2);
                                }
                            }
                        } else {
                            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                        }
                        nn40Var.K0();
                    }
                }
                return Unit.a;
            }
        }));
        C0().f.f(getViewLifecycleOwner(), new e(new Function1() { // from class: fm40
            /* JADX WARN: Code duplicated, block: B:123:0x0216  */
            /* JADX WARN: Code duplicated, block: B:125:0x021c  */
            /* JADX WARN: Code duplicated, block: B:128:0x0229  */
            /* JADX WARN: Code duplicated, block: B:133:0x023c  */
            /* JADX WARN: Code duplicated, block: B:602:0x0971  */
            /* JADX WARN: Code duplicated, block: B:604:0x0975  */
            /* JADX WARN: Code duplicated, block: B:605:0x097a  */
            /* JADX WARN: Code duplicated, block: B:615:0x0999  */
            /* JADX WARN: Code duplicated, block: B:617:0x099f  */
            /* JADX WARN: Code duplicated, block: B:619:0x09a5  */
            /* JADX WARN: Code duplicated, block: B:623:0x09c4  */
            /* JADX WARN: Code duplicated, block: B:626:0x09d9  */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                xo40 xo40Var32;
                xo40 xo40Var33;
                xo40 xo40Var34;
                AppCompatImageView redMark;
                FetchBetAmountResponse fetchBetAmountResponse;
                BetAmountVO betAmountVO;
                FetchBetAmountResponse fetchBetAmountResponse2;
                BetAmountVO betAmountVO2;
                FetchBetAmountResponse fetchBetAmountResponse3;
                BetAmountVO betAmountVO3;
                FetchBetAmountResponse fetchBetAmountResponse4;
                BetAmountVO betAmountVO4;
                FetchBetAmountResponse fetchBetAmountResponse5;
                BetAmountVO betAmountVO5;
                double dDoubleValue;
                FetchBetAmountResponse fetchBetAmountResponse6;
                BetAmountVO betAmountVO6;
                FetchBetAmountResponse fetchBetAmountResponse7;
                BetAmountVO betAmountVO7;
                FetchBetAmountResponse fetchBetAmountResponse8;
                BetAmountVO betAmountVO8;
                FetchBetAmountResponse fetchBetAmountResponse9;
                BetAmountVO betAmountVO9;
                FetchBetAmountResponse fetchBetAmountResponse10;
                BetAmountVO betAmountVO10;
                FetchBetAmountResponse fetchBetAmountResponse11;
                BetAmountVO betAmountVO11;
                FetchBetAmountResponse fetchBetAmountResponse12;
                BetAmountVO betAmountVO12;
                FetchBetAmountResponse fetchBetAmountResponse13;
                BetAmountVO betAmountVO13;
                FetchBetAmountResponse fetchBetAmountResponse14;
                BetAmountVO betAmountVO14;
                FetchBetAmountResponse fetchBetAmountResponse15;
                BetAmountVO betAmountVO15;
                AppCompatImageView redMark2;
                xo40 xo40Var35;
                Double d2;
                double dDoubleValue2;
                HTTPResponse hTTPResponse;
                xo40 xo40Var36;
                xo40 xo40Var37;
                xo40 xo40Var38;
                FetchBetAmountResponse fetchBetAmountResponse16;
                BetAmountVO betAmountVO16;
                FetchBetAmountResponse fetchBetAmountResponse17;
                BetAmountVO betAmountVO17;
                AppCompatImageView redMark3;
                FetchBetAmountResponse fetchBetAmountResponse18;
                BetAmountVO betAmountVO18;
                FetchBetAmountResponse fetchBetAmountResponse19;
                BetAmountVO betAmountVO19;
                FetchBetAmountResponse fetchBetAmountResponse20;
                BetAmountVO betAmountVO20;
                FetchBetAmountResponse fetchBetAmountResponse21;
                BetAmountVO betAmountVO21;
                FetchBetAmountResponse fetchBetAmountResponse22;
                BetAmountVO betAmountVO22;
                FetchBetAmountResponse fetchBetAmountResponse23;
                BetAmountVO betAmountVO23;
                FetchBetAmountResponse fetchBetAmountResponse24;
                BetAmountVO betAmountVO24;
                FetchBetAmountResponse fetchBetAmountResponse25;
                BetAmountVO betAmountVO25;
                FetchBetAmountResponse fetchBetAmountResponse26;
                BetAmountVO betAmountVO26;
                FetchBetAmountResponse fetchBetAmountResponse27;
                BetAmountVO betAmountVO27;
                FetchBetAmountResponse fetchBetAmountResponse28;
                BetAmountVO betAmountVO28;
                FetchBetAmountResponse fetchBetAmountResponse29;
                BetAmountVO betAmountVO29;
                FetchBetAmountResponse fetchBetAmountResponse30;
                BetAmountVO betAmountVO30;
                FetchBetAmountResponse fetchBetAmountResponse31;
                BetAmountVO betAmountVO31;
                FetchBetAmountResponse fetchBetAmountResponse32;
                BetAmountVO betAmountVO32;
                FetchBetAmountResponse fetchBetAmountResponse33;
                BetAmountVO betAmountVO33;
                AppCompatImageView redMark4;
                FetchBetAmountResponse fetchBetAmountResponse34;
                BetAmountVO betAmountVO34;
                FetchBetAmountResponse fetchBetAmountResponse35;
                BetAmountVO betAmountVO35;
                FetchBetAmountResponse fetchBetAmountResponse36;
                BetAmountVO betAmountVO36;
                FetchBetAmountResponse fetchBetAmountResponse37;
                BetAmountVO betAmountVO37;
                FetchBetAmountResponse fetchBetAmountResponse38;
                FetchBetAmountResponse fetchBetAmountResponse39;
                Integer code;
                xo40 xo40Var39;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = nn40.a.a[loadingState.getStatus().ordinal()];
                nn40 nn40Var = this.a;
                int i6 = 1;
                if (i5 == 1) {
                    if (nn40Var.m0) {
                        nn40Var.z0().x1();
                        Unit unit = Unit.a;
                    } else {
                        nn40Var.m0 = true;
                        xo40 xo40Var40 = (xo40) nn40Var.b;
                        if (xo40Var40 != null) {
                            xo40Var40.V.P();
                            Unit unit2 = Unit.a;
                        }
                    }
                    nn40Var.C0().e.m(null);
                    xo40 xo40Var41 = (xo40) nn40Var.b;
                    if (xo40Var41 != null) {
                        xo40Var41.Y.setCardUnDraw();
                        Unit unit3 = Unit.a;
                    }
                    xo40 xo40Var42 = (xo40) nn40Var.b;
                    if (xo40Var42 != null) {
                        LevelIndicator levelIndicator = xo40Var42.a0;
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        levelIndicator.setCurrentTurn((hTTPResponse2 == null || (fetchBetAmountResponse39 = (FetchBetAmountResponse) hTTPResponse2.getData()) == null) ? null : Integer.valueOf(fetchBetAmountResponse39.getTurnId()));
                        Unit unit4 = Unit.a;
                    }
                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                    nn40Var.b0 = (hTTPResponse3 == null || (fetchBetAmountResponse38 = (FetchBetAmountResponse) hTTPResponse3.getData()) == null) ? nn40Var.b0 : fetchBetAmountResponse38.getTurnId();
                    HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                    double defaultAmount = 0.0d;
                    nn40Var.X = (hTTPResponse4 == null || (fetchBetAmountResponse37 = (FetchBetAmountResponse) hTTPResponse4.getData()) == null || (betAmountVO37 = fetchBetAmountResponse37.getBetAmountVO()) == null) ? 0.0d : betAmountVO37.getMaxAmount();
                    xo40 xo40Var43 = (xo40) nn40Var.b;
                    if (xo40Var43 != null) {
                        BetChipContainer betChipContainer = xo40Var43.f;
                        HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                        Double dValueOf = (hTTPResponse5 == null || (fetchBetAmountResponse36 = (FetchBetAmountResponse) hTTPResponse5.getData()) == null || (betAmountVO36 = fetchBetAmountResponse36.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO36.getMinAmount());
                        HTTPResponse hTTPResponse6 = (HTTPResponse) loadingState.getData();
                        betChipContainer.setMinMaxChip(dValueOf, (hTTPResponse6 == null || (fetchBetAmountResponse35 = (FetchBetAmountResponse) hTTPResponse6.getData()) == null || (betAmountVO35 = fetchBetAmountResponse35.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO35.getMaxAmount()));
                        Unit unit5 = Unit.a;
                    }
                    if (nn40Var.N == null) {
                        xo40Var32 = (xo40) nn40Var.b;
                        if (xo40Var32 != null) {
                            xo40Var32.b.setVisibility(8);
                            Unit unit6 = Unit.a;
                        }
                        xo40Var33 = (xo40) nn40Var.b;
                        if (xo40Var33 != null && (redMark = xo40Var33.D.getRedMark()) != null) {
                            redMark.setVisibility(8);
                            Unit unit7 = Unit.a;
                        }
                        xo40Var34 = (xo40) nn40Var.b;
                        if (xo40Var34 != null) {
                            xo40Var34.G.F(R.drawable.hamberger_add_more_bg);
                            Unit unit8 = Unit.a;
                        }
                    } else {
                        HTTPResponse hTTPResponse7 = (HTTPResponse) loadingState.getData();
                        double minAmount = (hTTPResponse7 == null || (fetchBetAmountResponse34 = (FetchBetAmountResponse) hTTPResponse7.getData()) == null || (betAmountVO34 = fetchBetAmountResponse34.getBetAmountVO()) == null) ? 0.0d : betAmountVO34.getMinAmount();
                        Double d3 = nn40Var.N;
                        if (minAmount < (d3 != null ? d3.doubleValue() : 0.0d)) {
                            xo40Var32 = (xo40) nn40Var.b;
                            if (xo40Var32 != null) {
                                xo40Var32.b.setVisibility(8);
                                Unit unit9 = Unit.a;
                            }
                            xo40Var33 = (xo40) nn40Var.b;
                            if (xo40Var33 != null) {
                                redMark.setVisibility(8);
                                Unit unit10 = Unit.a;
                            }
                            xo40Var34 = (xo40) nn40Var.b;
                            if (xo40Var34 != null) {
                                xo40Var34.G.F(R.drawable.hamberger_add_more_bg);
                                Unit unit11 = Unit.a;
                            }
                        } else {
                            Double d4 = nn40Var.N;
                            if ((d4 != null ? d4.doubleValue() : 0.0d) <= nn40Var.X) {
                                xo40 xo40Var44 = (xo40) nn40Var.b;
                                if (xo40Var44 != null) {
                                    xo40Var44.b.setVisibility(0);
                                    Unit unit12 = Unit.a;
                                }
                                xo40 xo40Var45 = (xo40) nn40Var.b;
                                if (xo40Var45 != null && (redMark4 = xo40Var45.D.getRedMark()) != null) {
                                    redMark4.setVisibility(0);
                                    Unit unit13 = Unit.a;
                                }
                                xo40 xo40Var46 = (xo40) nn40Var.b;
                                if (xo40Var46 != null) {
                                    xo40Var46.G.F(R.drawable.hamberger_add_more_red);
                                    Unit unit14 = Unit.a;
                                }
                                xo40 xo40Var47 = (xo40) nn40Var.b;
                                if (xo40Var47 != null) {
                                    xo40Var47.C.setVisibility(0);
                                    Unit unit15 = Unit.a;
                                }
                                xo40 xo40Var48 = (xo40) nn40Var.b;
                                if (xo40Var48 != null) {
                                    xo40Var48.e.setErrorBetAmount();
                                    Unit unit16 = Unit.a;
                                }
                            } else {
                                xo40Var32 = (xo40) nn40Var.b;
                                if (xo40Var32 != null) {
                                    xo40Var32.b.setVisibility(8);
                                    Unit unit17 = Unit.a;
                                }
                                xo40Var33 = (xo40) nn40Var.b;
                                if (xo40Var33 != null) {
                                    redMark.setVisibility(8);
                                    Unit unit18 = Unit.a;
                                }
                                xo40Var34 = (xo40) nn40Var.b;
                                if (xo40Var34 != null) {
                                    xo40Var34.G.F(R.drawable.hamberger_add_more_bg);
                                    Unit unit19 = Unit.a;
                                }
                            }
                        }
                    }
                    Double d5 = nn40Var.N;
                    double dDoubleValue3 = d5 != null ? d5.doubleValue() : 0.0d;
                    HTTPResponse hTTPResponse8 = (HTTPResponse) loadingState.getData();
                    double maxAmount = (hTTPResponse8 == null || (fetchBetAmountResponse33 = (FetchBetAmountResponse) hTTPResponse8.getData()) == null || (betAmountVO33 = fetchBetAmountResponse33.getBetAmountVO()) == null) ? 0.0d : betAmountVO33.getMaxAmount();
                    B b2 = nn40Var.b;
                    if (dDoubleValue3 < maxAmount) {
                        xo40 xo40Var49 = (xo40) b2;
                        if (xo40Var49 != null) {
                            ChipSlider chipSlider = xo40Var49.X;
                            HTTPResponse hTTPResponse9 = (HTTPResponse) loadingState.getData();
                            Double dValueOf2 = (hTTPResponse9 == null || (fetchBetAmountResponse32 = (FetchBetAmountResponse) hTTPResponse9.getData()) == null || (betAmountVO32 = fetchBetAmountResponse32.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO32.getMinAmount());
                            Double d6 = nn40Var.N;
                            BetAmountVO betAmountVO38 = nn40Var.P;
                            chipSlider.setConfiguration(dValueOf2, d6, betAmountVO38 != null ? Double.valueOf(betAmountVO38.getDefaultAmount()) : null);
                            Unit unit20 = Unit.a;
                        }
                        xo40 xo40Var50 = (xo40) nn40Var.b;
                        if (xo40Var50 != null) {
                            BetChipContainer betChipContainer2 = xo40Var50.f;
                            HTTPResponse hTTPResponse10 = (HTTPResponse) loadingState.getData();
                            Double dValueOf3 = (hTTPResponse10 == null || (fetchBetAmountResponse31 = (FetchBetAmountResponse) hTTPResponse10.getData()) == null || (betAmountVO31 = fetchBetAmountResponse31.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO31.getMinAmount());
                            HTTPResponse hTTPResponse11 = (HTTPResponse) loadingState.getData();
                            betChipContainer2.setBetAmount(dValueOf3, (hTTPResponse11 == null || (fetchBetAmountResponse30 = (FetchBetAmountResponse) hTTPResponse11.getData()) == null || (betAmountVO30 = fetchBetAmountResponse30.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO30.getMaxAmount()));
                            Unit unit21 = Unit.a;
                        }
                        Double d7 = nn40Var.N;
                        double dDoubleValue4 = d7 != null ? d7.doubleValue() : 0.0d;
                        HTTPResponse hTTPResponse12 = (HTTPResponse) loadingState.getData();
                        if (dDoubleValue4 < ((hTTPResponse12 == null || (fetchBetAmountResponse29 = (FetchBetAmountResponse) hTTPResponse12.getData()) == null || (betAmountVO29 = fetchBetAmountResponse29.getBetAmountVO()) == null) ? 0.0d : betAmountVO29.getDefaultAmount())) {
                            Double d8 = nn40Var.N;
                            double dDoubleValue5 = d8 != null ? d8.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse13 = (HTTPResponse) loadingState.getData();
                            double minAmount2 = (hTTPResponse13 == null || (fetchBetAmountResponse28 = (FetchBetAmountResponse) hTTPResponse13.getData()) == null || (betAmountVO28 = fetchBetAmountResponse28.getBetAmountVO()) == null) ? 0.0d : betAmountVO28.getMinAmount();
                            B b3 = nn40Var.b;
                            if (dDoubleValue5 < minAmount2) {
                                xo40 xo40Var51 = (xo40) b3;
                                if (xo40Var51 != null) {
                                    ChipSlider chipSlider2 = xo40Var51.X;
                                    HTTPResponse hTTPResponse14 = (HTTPResponse) loadingState.getData();
                                    Double dValueOf4 = (hTTPResponse14 == null || (fetchBetAmountResponse27 = (FetchBetAmountResponse) hTTPResponse14.getData()) == null || (betAmountVO27 = fetchBetAmountResponse27.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO27.getMinAmount());
                                    HTTPResponse hTTPResponse15 = (HTTPResponse) loadingState.getData();
                                    Double dValueOf5 = (hTTPResponse15 == null || (fetchBetAmountResponse26 = (FetchBetAmountResponse) hTTPResponse15.getData()) == null || (betAmountVO26 = fetchBetAmountResponse26.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO26.getMaxAmount());
                                    HTTPResponse hTTPResponse16 = (HTTPResponse) loadingState.getData();
                                    chipSlider2.setConfiguration(dValueOf4, dValueOf5, (hTTPResponse16 == null || (fetchBetAmountResponse25 = (FetchBetAmountResponse) hTTPResponse16.getData()) == null || (betAmountVO25 = fetchBetAmountResponse25.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO25.getMinAmount()));
                                    Unit unit22 = Unit.a;
                                }
                                xo40 xo40Var52 = (xo40) nn40Var.b;
                                if (xo40Var52 != null) {
                                    BetBoxContainer betBoxContainer = xo40Var52.e;
                                    HTTPResponse hTTPResponse17 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer.setBetAmount((hTTPResponse17 == null || (fetchBetAmountResponse24 = (FetchBetAmountResponse) hTTPResponse17.getData()) == null || (betAmountVO24 = fetchBetAmountResponse24.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO24.getMinAmount()), nn40Var.U);
                                    Unit unit23 = Unit.a;
                                }
                                xo40 xo40Var53 = (xo40) nn40Var.b;
                                if (xo40Var53 != null) {
                                    ChipSlider chipSlider3 = xo40Var53.X;
                                    HTTPResponse hTTPResponse18 = (HTTPResponse) loadingState.getData();
                                    chipSlider3.setBetAmount((hTTPResponse18 == null || (fetchBetAmountResponse23 = (FetchBetAmountResponse) hTTPResponse18.getData()) == null || (betAmountVO23 = fetchBetAmountResponse23.getBetAmountVO()) == null) ? 0.0d : betAmountVO23.getMinAmount(), nn40Var.U);
                                    Unit unit24 = Unit.a;
                                }
                            } else {
                                xo40 xo40Var54 = (xo40) b3;
                                if (xo40Var54 != null) {
                                    xo40Var54.X.setSeekMax();
                                    Unit unit25 = Unit.a;
                                }
                                xo40 xo40Var55 = (xo40) nn40Var.b;
                                if (xo40Var55 != null) {
                                    xo40Var55.e.setBetAmount(nn40Var.N, nn40Var.U);
                                    Unit unit26 = Unit.a;
                                }
                            }
                        } else {
                            xo40 xo40Var56 = (xo40) nn40Var.b;
                            if (xo40Var56 != null) {
                                BetBoxContainer betBoxContainer2 = xo40Var56.e;
                                HTTPResponse hTTPResponse19 = (HTTPResponse) loadingState.getData();
                                betBoxContainer2.setBetAmount((hTTPResponse19 == null || (fetchBetAmountResponse22 = (FetchBetAmountResponse) hTTPResponse19.getData()) == null || (betAmountVO22 = fetchBetAmountResponse22.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO22.getDefaultAmount()), nn40Var.U);
                                Unit unit27 = Unit.a;
                            }
                        }
                    } else {
                        xo40 xo40Var57 = (xo40) b2;
                        if (xo40Var57 != null) {
                            ChipSlider chipSlider4 = xo40Var57.X;
                            HTTPResponse hTTPResponse20 = (HTTPResponse) loadingState.getData();
                            Double dValueOf6 = (hTTPResponse20 == null || (fetchBetAmountResponse5 = (FetchBetAmountResponse) hTTPResponse20.getData()) == null || (betAmountVO5 = fetchBetAmountResponse5.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO5.getMinAmount());
                            HTTPResponse hTTPResponse21 = (HTTPResponse) loadingState.getData();
                            Double dValueOf7 = (hTTPResponse21 == null || (fetchBetAmountResponse4 = (FetchBetAmountResponse) hTTPResponse21.getData()) == null || (betAmountVO4 = fetchBetAmountResponse4.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO4.getMaxAmount());
                            BetAmountVO betAmountVO39 = nn40Var.P;
                            chipSlider4.setConfiguration(dValueOf6, dValueOf7, betAmountVO39 != null ? Double.valueOf(betAmountVO39.getDefaultAmount()) : null);
                            Unit unit28 = Unit.a;
                        }
                        xo40 xo40Var58 = (xo40) nn40Var.b;
                        if (xo40Var58 != null) {
                            BetChipContainer betChipContainer3 = xo40Var58.f;
                            HTTPResponse hTTPResponse22 = (HTTPResponse) loadingState.getData();
                            Double dValueOf8 = (hTTPResponse22 == null || (fetchBetAmountResponse3 = (FetchBetAmountResponse) hTTPResponse22.getData()) == null || (betAmountVO3 = fetchBetAmountResponse3.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO3.getMinAmount());
                            HTTPResponse hTTPResponse23 = (HTTPResponse) loadingState.getData();
                            betChipContainer3.setBetAmount(dValueOf8, (hTTPResponse23 == null || (fetchBetAmountResponse2 = (FetchBetAmountResponse) hTTPResponse23.getData()) == null || (betAmountVO2 = fetchBetAmountResponse2.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO2.getMaxAmount()));
                            Unit unit29 = Unit.a;
                        }
                        xo40 xo40Var59 = (xo40) nn40Var.b;
                        if (xo40Var59 != null) {
                            BetBoxContainer betBoxContainer3 = xo40Var59.e;
                            HTTPResponse hTTPResponse24 = (HTTPResponse) loadingState.getData();
                            betBoxContainer3.setBetAmount((hTTPResponse24 == null || (fetchBetAmountResponse = (FetchBetAmountResponse) hTTPResponse24.getData()) == null || (betAmountVO = fetchBetAmountResponse.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO.getDefaultAmount()), nn40Var.U);
                            Unit unit30 = Unit.a;
                        }
                    }
                    if (nn40Var.V == 0) {
                        Double d9 = nn40Var.N;
                        double dDoubleValue6 = d9 != null ? d9.doubleValue() : 0.0d;
                        HTTPResponse hTTPResponse25 = (HTTPResponse) loadingState.getData();
                        if (dDoubleValue6 <= ((hTTPResponse25 == null || (fetchBetAmountResponse21 = (FetchBetAmountResponse) hTTPResponse25.getData()) == null || (betAmountVO21 = fetchBetAmountResponse21.getBetAmountVO()) == null) ? 0.0d : betAmountVO21.getMinAmount())) {
                            HTTPResponse hTTPResponse26 = (HTTPResponse) loadingState.getData();
                            dDoubleValue = (hTTPResponse26 == null || (fetchBetAmountResponse20 = (FetchBetAmountResponse) hTTPResponse26.getData()) == null || (betAmountVO20 = fetchBetAmountResponse20.getBetAmountVO()) == null) ? 0.0d : betAmountVO20.getMaxAmount();
                        } else {
                            Double d10 = nn40Var.N;
                            dDoubleValue = d10 != null ? d10.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse27 = (HTTPResponse) loadingState.getData();
                            double maxAmount2 = (hTTPResponse27 == null || (fetchBetAmountResponse6 = (FetchBetAmountResponse) hTTPResponse27.getData()) == null || (betAmountVO6 = fetchBetAmountResponse6.getBetAmountVO()) == null) ? 0.0d : betAmountVO6.getMaxAmount();
                            if (dDoubleValue > maxAmount2) {
                                dDoubleValue = maxAmount2;
                            }
                        }
                        nn40Var.W = dDoubleValue;
                        Double d11 = nn40Var.N;
                        double dDoubleValue7 = d11 != null ? d11.doubleValue() : 0.0d;
                        HTTPResponse hTTPResponse28 = (HTTPResponse) loadingState.getData();
                        double minAmount3 = (hTTPResponse28 == null || (fetchBetAmountResponse19 = (FetchBetAmountResponse) hTTPResponse28.getData()) == null || (betAmountVO19 = fetchBetAmountResponse19.getBetAmountVO()) == null) ? 0.0d : betAmountVO19.getMinAmount();
                        Double d12 = nn40Var.N;
                        if (dDoubleValue7 > minAmount3) {
                            double dDoubleValue8 = d12 != null ? d12.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse29 = (HTTPResponse) loadingState.getData();
                            Double dValueOf9 = (hTTPResponse29 == null || (fetchBetAmountResponse18 = (FetchBetAmountResponse) hTTPResponse29.getData()) == null || (betAmountVO18 = fetchBetAmountResponse18.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO18.getDefaultAmount());
                            dValueOf9.getClass();
                            double dDoubleValue9 = dValueOf9.doubleValue();
                            if (dDoubleValue8 > dDoubleValue9) {
                                dDoubleValue8 = dDoubleValue9;
                            }
                            xo40 xo40Var60 = (xo40) nn40Var.b;
                            if (xo40Var60 != null) {
                                ChipSlider chipSlider5 = xo40Var60.X;
                                Object data = ((HTTPResponse) loadingState.getData()).getData();
                                data.getClass();
                                chipSlider5.setConfiguration(Double.valueOf(((FetchBetAmountResponse) data).getBetAmountVO().getMinAmount()), Double.valueOf(nn40Var.W), Double.valueOf(dDoubleValue8));
                                Unit unit31 = Unit.a;
                            }
                            xo40 xo40Var61 = (xo40) nn40Var.b;
                            if (xo40Var61 != null) {
                                xo40Var61.e.setBetAmount(Double.valueOf(dDoubleValue8), nn40Var.U);
                                Unit unit32 = Unit.a;
                            }
                            xo40 xo40Var62 = (xo40) nn40Var.b;
                            if (xo40Var62 != null) {
                                xo40Var62.X.setBetAmount(dDoubleValue8, nn40Var.U);
                                Unit unit33 = Unit.a;
                            }
                        } else {
                            double dDoubleValue10 = d12 != null ? d12.doubleValue() : 0.0d;
                            HTTPResponse hTTPResponse30 = (HTTPResponse) loadingState.getData();
                            double defaultAmount2 = (hTTPResponse30 == null || (fetchBetAmountResponse15 = (FetchBetAmountResponse) hTTPResponse30.getData()) == null || (betAmountVO15 = fetchBetAmountResponse15.getBetAmountVO()) == null) ? 0.0d : betAmountVO15.getDefaultAmount();
                            B b4 = nn40Var.b;
                            if (dDoubleValue10 < defaultAmount2) {
                                xo40 xo40Var63 = (xo40) b4;
                                if (xo40Var63 != null) {
                                    ChipSlider chipSlider6 = xo40Var63.X;
                                    HTTPResponse hTTPResponse31 = (HTTPResponse) loadingState.getData();
                                    Double dValueOf10 = (hTTPResponse31 == null || (fetchBetAmountResponse14 = (FetchBetAmountResponse) hTTPResponse31.getData()) == null || (betAmountVO14 = fetchBetAmountResponse14.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO14.getMinAmount());
                                    Double dValueOf11 = Double.valueOf(nn40Var.W);
                                    HTTPResponse hTTPResponse32 = (HTTPResponse) loadingState.getData();
                                    chipSlider6.setConfiguration(dValueOf10, dValueOf11, (hTTPResponse32 == null || (fetchBetAmountResponse13 = (FetchBetAmountResponse) hTTPResponse32.getData()) == null || (betAmountVO13 = fetchBetAmountResponse13.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO13.getMinAmount()));
                                    Unit unit34 = Unit.a;
                                }
                                xo40 xo40Var64 = (xo40) nn40Var.b;
                                if (xo40Var64 != null) {
                                    BetBoxContainer betBoxContainer4 = xo40Var64.e;
                                    HTTPResponse hTTPResponse33 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer4.setBetAmount((hTTPResponse33 == null || (fetchBetAmountResponse12 = (FetchBetAmountResponse) hTTPResponse33.getData()) == null || (betAmountVO12 = fetchBetAmountResponse12.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO12.getMinAmount()), nn40Var.U);
                                    Unit unit35 = Unit.a;
                                }
                                xo40 xo40Var65 = (xo40) nn40Var.b;
                                if (xo40Var65 != null) {
                                    ChipSlider chipSlider7 = xo40Var65.X;
                                    HTTPResponse hTTPResponse34 = (HTTPResponse) loadingState.getData();
                                    chipSlider7.setBetAmount((hTTPResponse34 == null || (fetchBetAmountResponse11 = (FetchBetAmountResponse) hTTPResponse34.getData()) == null || (betAmountVO11 = fetchBetAmountResponse11.getBetAmountVO()) == null) ? 0.0d : betAmountVO11.getMinAmount(), nn40Var.U);
                                    Unit unit36 = Unit.a;
                                }
                            } else {
                                xo40 xo40Var66 = (xo40) b4;
                                if (xo40Var66 != null) {
                                    ChipSlider chipSlider8 = xo40Var66.X;
                                    HTTPResponse hTTPResponse35 = (HTTPResponse) loadingState.getData();
                                    Double dValueOf12 = (hTTPResponse35 == null || (fetchBetAmountResponse10 = (FetchBetAmountResponse) hTTPResponse35.getData()) == null || (betAmountVO10 = fetchBetAmountResponse10.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO10.getMinAmount());
                                    Double dValueOf13 = Double.valueOf(nn40Var.W);
                                    HTTPResponse hTTPResponse36 = (HTTPResponse) loadingState.getData();
                                    chipSlider8.setConfiguration(dValueOf12, dValueOf13, (hTTPResponse36 == null || (fetchBetAmountResponse9 = (FetchBetAmountResponse) hTTPResponse36.getData()) == null || (betAmountVO9 = fetchBetAmountResponse9.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO9.getDefaultAmount()));
                                    Unit unit37 = Unit.a;
                                }
                                xo40 xo40Var67 = (xo40) nn40Var.b;
                                if (xo40Var67 != null) {
                                    BetBoxContainer betBoxContainer5 = xo40Var67.e;
                                    HTTPResponse hTTPResponse37 = (HTTPResponse) loadingState.getData();
                                    betBoxContainer5.setBetAmount((hTTPResponse37 == null || (fetchBetAmountResponse8 = (FetchBetAmountResponse) hTTPResponse37.getData()) == null || (betAmountVO8 = fetchBetAmountResponse8.getBetAmountVO()) == null) ? null : Double.valueOf(betAmountVO8.getDefaultAmount()), nn40Var.U);
                                    Unit unit38 = Unit.a;
                                }
                                xo40 xo40Var68 = (xo40) nn40Var.b;
                                if (xo40Var68 != null) {
                                    ChipSlider chipSlider9 = xo40Var68.X;
                                    HTTPResponse hTTPResponse38 = (HTTPResponse) loadingState.getData();
                                    chipSlider9.setBetAmount((hTTPResponse38 == null || (fetchBetAmountResponse7 = (FetchBetAmountResponse) hTTPResponse38.getData()) == null || (betAmountVO7 = fetchBetAmountResponse7.getBetAmountVO()) == null) ? 0.0d : betAmountVO7.getDefaultAmount(), nn40Var.U);
                                    Unit unit39 = Unit.a;
                                }
                            }
                        }
                        xo40 xo40Var69 = (xo40) nn40Var.b;
                        double i7 = xo40Var69 != null ? xo40Var69.e.getI() : 0.0d;
                        Double d13 = nn40Var.N;
                        double dDoubleValue11 = d13 != null ? d13.doubleValue() : 0.0d;
                        B b5 = nn40Var.b;
                        if (i7 > dDoubleValue11) {
                            xo40 xo40Var70 = (xo40) b5;
                            if (xo40Var70 != null && (redMark3 = xo40Var70.D.getRedMark()) != null) {
                                redMark3.setVisibility(0);
                                Unit unit40 = Unit.a;
                            }
                            xo40 xo40Var71 = (xo40) nn40Var.b;
                            if (xo40Var71 != null) {
                                xo40Var71.G.F(R.drawable.hamberger_add_more_red);
                                Unit unit41 = Unit.a;
                            }
                            xo40 xo40Var72 = (xo40) nn40Var.b;
                            if (xo40Var72 != null) {
                                xo40Var72.C.setVisibility(0);
                                Unit unit42 = Unit.a;
                            }
                            xo40 xo40Var73 = (xo40) nn40Var.b;
                            if (xo40Var73 != null) {
                                xo40Var73.e.setErrorBetAmount();
                                Unit unit43 = Unit.a;
                            }
                        } else {
                            xo40 xo40Var74 = (xo40) b5;
                            double i8 = xo40Var74 != null ? xo40Var74.e.getI() : 0.0d;
                            Double d14 = nn40Var.N;
                            d14.getClass();
                            if (i8 >= d14.doubleValue() * 0.8d) {
                                Double d15 = nn40Var.N;
                                if ((d15 != null ? d15.doubleValue() : 0.0d) <= nn40Var.X && (xo40Var35 = (xo40) nn40Var.b) != null) {
                                    xo40Var35.b.setVisibility(0);
                                    Unit unit44 = Unit.a;
                                }
                            }
                            xo40 xo40Var75 = (xo40) nn40Var.b;
                            if (xo40Var75 != null && (redMark2 = xo40Var75.D.getRedMark()) != null) {
                                redMark2.setVisibility(8);
                                Unit unit45 = Unit.a;
                            }
                            xo40 xo40Var76 = (xo40) nn40Var.b;
                            if (xo40Var76 != null) {
                                xo40Var76.G.F(R.drawable.hamberger_add_more_bg);
                                Unit unit46 = Unit.a;
                            }
                            xo40 xo40Var77 = (xo40) nn40Var.b;
                            if (xo40Var77 != null) {
                                xo40Var77.C.setVisibility(4);
                                Unit unit47 = Unit.a;
                            }
                            xo40 xo40Var78 = (xo40) nn40Var.b;
                            if (xo40Var78 != null) {
                                xo40Var78.e.setErrorBetAmountLayout();
                                Unit unit48 = Unit.a;
                            }
                        }
                        if (nn40Var.Z == 1 || nn40Var.a0 == 1) {
                            double d16 = nn40Var.Y;
                            if (d16 > 0.0d) {
                                Double d17 = nn40Var.N;
                                if (d16 <= (d17 != null ? d17.doubleValue() : 0.0d)) {
                                    Double d18 = nn40Var.N;
                                    double dDoubleValue12 = d18 != null ? d18.doubleValue() : 0.0d;
                                    BetAmountVO betAmountVO40 = nn40Var.P;
                                    if (dDoubleValue12 <= (betAmountVO40 != null ? betAmountVO40.getMinAmount() : 0.0d)) {
                                        d2 = nn40Var.N;
                                        if (d2 != null) {
                                            dDoubleValue2 = d2.doubleValue();
                                        } else {
                                            dDoubleValue2 = 0.0d;
                                        }
                                        hTTPResponse = (HTTPResponse) loadingState.getData();
                                        if (hTTPResponse != null && (fetchBetAmountResponse16 = (FetchBetAmountResponse) hTTPResponse.getData()) != null && (betAmountVO16 = fetchBetAmountResponse16.getBetAmountVO()) != null) {
                                            defaultAmount = betAmountVO16.getDefaultAmount();
                                        }
                                        if (dDoubleValue2 > defaultAmount) {
                                            xo40Var36 = (xo40) nn40Var.b;
                                            if (xo40Var36 != null) {
                                                ChipSlider chipSlider10 = xo40Var36.X;
                                                BetAmountVO betAmountVO41 = nn40Var.P;
                                                chipSlider10.setConfiguration(betAmountVO41 != null ? Double.valueOf(betAmountVO41.getMinAmount()) : null, Double.valueOf(nn40Var.W), Double.valueOf(nn40Var.Y));
                                                Unit unit49 = Unit.a;
                                            }
                                            xo40Var37 = (xo40) nn40Var.b;
                                            if (xo40Var37 != null) {
                                                xo40Var37.e.setBetAmount(Double.valueOf(nn40Var.Y), nn40Var.U);
                                                Unit unit50 = Unit.a;
                                            }
                                            xo40Var38 = (xo40) nn40Var.b;
                                            if (xo40Var38 != null) {
                                                xo40Var38.X.setBetAmount(nn40Var.Y, nn40Var.U);
                                                Unit unit51 = Unit.a;
                                            }
                                            nn40Var.C0().d.m(Double.valueOf(nn40Var.Y));
                                        }
                                    } else {
                                        Double d19 = nn40Var.N;
                                        double dDoubleValue13 = d19 != null ? d19.doubleValue() : 0.0d;
                                        HTTPResponse hTTPResponse39 = (HTTPResponse) loadingState.getData();
                                        if (dDoubleValue13 < ((hTTPResponse39 == null || (fetchBetAmountResponse17 = (FetchBetAmountResponse) hTTPResponse39.getData()) == null || (betAmountVO17 = fetchBetAmountResponse17.getBetAmountVO()) == null) ? 0.0d : betAmountVO17.getDefaultAmount())) {
                                            xo40 xo40Var79 = (xo40) nn40Var.b;
                                            if (xo40Var79 != null) {
                                                ChipSlider chipSlider11 = xo40Var79.X;
                                                BetAmountVO betAmountVO42 = nn40Var.P;
                                                chipSlider11.setConfiguration(betAmountVO42 != null ? Double.valueOf(betAmountVO42.getMinAmount()) : null, Double.valueOf(nn40Var.W), Double.valueOf(nn40Var.W));
                                                Unit unit52 = Unit.a;
                                            }
                                            xo40 xo40Var80 = (xo40) nn40Var.b;
                                            if (xo40Var80 != null) {
                                                xo40Var80.e.setBetAmount(Double.valueOf(nn40Var.W), nn40Var.U);
                                                Unit unit53 = Unit.a;
                                            }
                                            xo40 xo40Var81 = (xo40) nn40Var.b;
                                            if (xo40Var81 != null) {
                                                xo40Var81.X.setBetAmount(nn40Var.W, nn40Var.U);
                                                Unit unit54 = Unit.a;
                                            }
                                            nn40Var.C0().d.m(Double.valueOf(nn40Var.W));
                                        } else {
                                            d2 = nn40Var.N;
                                            if (d2 != null) {
                                                dDoubleValue2 = d2.doubleValue();
                                            } else {
                                                dDoubleValue2 = 0.0d;
                                            }
                                            hTTPResponse = (HTTPResponse) loadingState.getData();
                                            if (hTTPResponse != null) {
                                                defaultAmount = betAmountVO16.getDefaultAmount();
                                            }
                                            if (dDoubleValue2 > defaultAmount) {
                                                xo40Var36 = (xo40) nn40Var.b;
                                                if (xo40Var36 != null) {
                                                    ChipSlider chipSlider12 = xo40Var36.X;
                                                    BetAmountVO betAmountVO43 = nn40Var.P;
                                                    chipSlider12.setConfiguration(betAmountVO43 != null ? Double.valueOf(betAmountVO43.getMinAmount()) : null, Double.valueOf(nn40Var.W), Double.valueOf(nn40Var.Y));
                                                    Unit unit410 = Unit.a;
                                                }
                                                xo40Var37 = (xo40) nn40Var.b;
                                                if (xo40Var37 != null) {
                                                    xo40Var37.e.setBetAmount(Double.valueOf(nn40Var.Y), nn40Var.U);
                                                    Unit unit55 = Unit.a;
                                                }
                                                xo40Var38 = (xo40) nn40Var.b;
                                                if (xo40Var38 != null) {
                                                    xo40Var38.X.setBetAmount(nn40Var.Y, nn40Var.U);
                                                    Unit unit56 = Unit.a;
                                                }
                                                nn40Var.C0().d.m(Double.valueOf(nn40Var.Y));
                                            }
                                        }
                                    }
                                    nn40Var.Z = 0;
                                    nn40Var.a0 = 0;
                                }
                            }
                        }
                    }
                    nn40Var.K0();
                    Unit unit57 = Unit.a;
                } else if (i5 != 3) {
                    Unit unit58 = Unit.a;
                } else {
                    e activity4 = nn40Var.getActivity();
                    if (activity4 != null) {
                        if (!nn40Var.m0 && (xo40Var39 = (xo40) nn40Var.b) != null) {
                            xo40Var39.V.O(100);
                            Unit unit59 = Unit.a;
                        }
                        xo40 xo40Var82 = (xo40) nn40Var.b;
                        if (xo40Var82 != null) {
                            xo40Var82.A.setVisibility(0);
                            Unit unit60 = Unit.a;
                        }
                        ResultWrapper.GenericError error = loadingState.getError();
                        if (error == null || (code = error.getCode()) == null || code.intValue() != 403 || nn40Var.e0) {
                            jl40 jl40Var = jl40.e;
                            if (nn40Var.z == null) {
                                Intrinsics.n("soundViewModel");
                                throw null;
                            }
                            jcg.d(jl40Var, activity4, "Red-Black", loadingState.getError(), new wjr(nn40Var, i6), new xjr(nn40Var, i6), null, 0, activity4.getColor(R.color.try_again_color), null, null, null, new x6w(nn40Var, 1), null, 97728);
                        } else {
                            SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                            nn40Var.e0 = true;
                        }
                        nn40Var.K0();
                        Unit unit61 = Unit.a;
                    }
                }
                return Unit.a;
            }
        }));
        C0().i.f(getViewLifecycleOwner(), new e(new q3w(this, i3)));
        w0().b.f(getViewLifecycleOwner(), new e(new Function1() { // from class: rl40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PagingFetchType type;
                fo2 fo2Var;
                fo2 fo2Var2;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = nn40.a.a[loadingState.getStatus().ordinal()];
                final nn40 nn40Var = this.a;
                int i6 = 1;
                if (i5 != 1) {
                    if (i5 == 2) {
                        fo2 fo2Var3 = nn40Var.G;
                        if (fo2Var3 != null) {
                            fo2Var3.k(true);
                        }
                    } else {
                        if (i5 != 3) {
                            uhc.a();
                            return null;
                        }
                        xbg xbgVar = nn40Var.S;
                        if (xbgVar == null) {
                            Intrinsics.n("errorDialog");
                            throw null;
                        }
                        if (!xbgVar.isShowing()) {
                            e activity4 = nn40Var.getActivity();
                            if (activity4 != null) {
                                jl40 jl40Var = jl40.e;
                                if (nn40Var.z == null) {
                                    Intrinsics.n("soundViewModel");
                                    throw null;
                                }
                                jcg.d(jl40Var, activity4, "Red-Black", loadingState.getError(), new Function0() { // from class: dn40
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        nn40Var.u0();
                                        return Unit.a;
                                    }
                                }, new z64(nn40Var, i6), new Function0() { // from class: fn40
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        nn40Var.P0();
                                        return Unit.a;
                                    }
                                }, 0, activity4.getColor(R.color.try_again_color), null, null, null, new Function1() { // from class: gn40
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj2) {
                                        String str2 = (String) obj2;
                                        str2.getClass();
                                        nn40Var.v0(str2);
                                        return Unit.a;
                                    }
                                }, null, 97664);
                            }
                            fo2 fo2Var4 = nn40Var.G;
                            if (fo2Var4 != null) {
                                fo2Var4.dismiss();
                            }
                        }
                    }
                } else if (loadingState.getData() != null) {
                    fo2 fo2Var5 = nn40Var.G;
                    if (fo2Var5 != null) {
                        fo2Var5.k(false);
                    }
                    List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                    if ((list != null ? list.size() : 0) <= 0) {
                        Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                        if ((total != null ? total.intValue() : 0) <= 0 && (fo2Var = nn40Var.G) != null && fo2Var.f().getChildCount() == 0 && (fo2Var2 = nn40Var.G) != null) {
                            fo2Var2.l();
                        }
                    }
                    fo2 fo2Var6 = nn40Var.G;
                    if (fo2Var6 != null) {
                        List list2 = (List) ((HTTPResponse) loadingState.getData()).getData();
                        Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                        PagingState pagingStateD = nn40Var.w0().c.d();
                        int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                        PagingState pagingStateD2 = nn40Var.w0().c.d();
                        int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                        PagingState pagingStateD3 = nn40Var.w0().c.d();
                        if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                            type = PagingFetchType.VIEW_MORE;
                        }
                        ArrayList arrayList2 = fo2Var6.E;
                        type.getClass();
                        if (list2 != null) {
                            fo2Var6.B.addAll(list2);
                            arrayList2.addAll(list2);
                        }
                        fo2Var6.K = offset;
                        fo2Var6.J = limit;
                        fo2Var6.h(type, total2, list2 != null ? list2.size() : 0);
                        if (list2 != null) {
                            RecyclerView.f adapter = fo2Var6.f().getAdapter();
                            adapter.getClass();
                            xo2 xo2Var = (xo2) adapter;
                            ArrayList arrayListC0 = CollectionsKt.C0(arrayList2);
                            fo2.b bVar = fo2Var6.L;
                            fo2.b bVar2 = fo2.b.b;
                            ej5.c(xo2Var.d, null, null, new ap2(arrayListC0, bVar == bVar2, fo2Var6.M == bVar2, xo2Var, null), 3);
                        }
                        RecyclerView.f adapter2 = fo2Var6.f().getAdapter();
                        if (adapter2 != null) {
                            adapter2.notifyDataSetChanged();
                        }
                    }
                }
                return Unit.a;
            }
        }));
        z0().b.f(getViewLifecycleOwner(), new e(new Function1() { // from class: am40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                PromotionGiftsResponse promotionGiftsResponse;
                List<GiftItem> entityList;
                GiftItem giftItem;
                String currency;
                List<GiftItem> entityList2;
                LoadingState loadingState = (LoadingState) obj;
                int i5 = nn40.a.a[loadingState.getStatus().ordinal()];
                nn40 nn40Var = this.a;
                if (i5 == 1) {
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                        nn40Var.f0 = promotionGiftsResponse;
                        if (nn40Var.d0 == 1) {
                            nn40Var.O0();
                        }
                        PromotionGiftsResponse promotionGiftsResponse2 = nn40Var.f0;
                        if (promotionGiftsResponse2 == null || (entityList2 = promotionGiftsResponse2.getEntityList()) == null || !entityList2.isEmpty() || nn40Var.d0 != 1) {
                            PromotionGiftsResponse promotionGiftsResponse3 = nn40Var.f0;
                            if (promotionGiftsResponse3 != null && (entityList = promotionGiftsResponse3.getEntityList()) != null && (!entityList.isEmpty()) && nn40Var.d0 == 1) {
                                PromotionGiftsResponse promotionGiftsResponse4 = nn40Var.f0;
                                List<GiftItem> entityList3 = promotionGiftsResponse4 != null ? promotionGiftsResponse4.getEntityList() : null;
                                if (entityList3 != null && !entityList3.isEmpty()) {
                                    PromotionGiftsResponse promotionGiftsResponse5 = nn40Var.f0;
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
                                    PromotionGiftsResponse promotionGiftsResponse6 = nn40Var.f0;
                                    List<GiftItem> entityList5 = promotionGiftsResponse6 != null ? promotionGiftsResponse6.getEntityList() : null;
                                    if (entityList5 != null && (giftItem = entityList5.get(0)) != null && (currency = giftItem.getCurrency()) != null) {
                                        xo40 xo40Var32 = (xo40) nn40Var.b;
                                        if (xo40Var32 != null) {
                                            GiftToast.setToastText$default(xo40Var32.F, currency, curBal, null, 4, null);
                                        }
                                        xo40 xo40Var33 = (xo40) nn40Var.b;
                                        if (xo40Var33 != null) {
                                            xo40Var33.F.setClickable(true);
                                        }
                                        jbh.a.j(new FbgData(true, Double.valueOf(curBal), currency));
                                    }
                                    xo40 xo40Var34 = (xo40) nn40Var.b;
                                    if (xo40Var34 != null) {
                                        xo40Var34.F.setVisibility(0);
                                    }
                                    xo40 xo40Var35 = (xo40) nn40Var.b;
                                    if (xo40Var35 != null) {
                                        xo40Var35.F.startAnimation(AnimationUtils.loadAnimation(nn40Var.getContext(), R.anim.fade_in_fade_out_toast));
                                    }
                                }
                                ej5.c(ebs.a(nn40Var.getLifecycle()), null, null, new on40(nn40Var, null), 3);
                                nn40Var.d0 = 0;
                            }
                        } else {
                            nn40Var.d0 = 0;
                        }
                        PromotionGiftsResponse promotionGiftsResponse7 = nn40Var.f0;
                        List<GiftItem> entityList6 = promotionGiftsResponse7 != null ? promotionGiftsResponse7.getEntityList() : null;
                        if (entityList6 == null || entityList6.isEmpty()) {
                            xo40 xo40Var36 = (xo40) nn40Var.b;
                            if (xo40Var36 != null) {
                                xo40Var36.f.F(nn40Var.U);
                            }
                        } else {
                            xo40 xo40Var37 = (xo40) nn40Var.b;
                            if (xo40Var37 != null) {
                                BetChipContainer betChipContainer = xo40Var37.f;
                                ArrayList<Double> arrayList2 = nn40Var.U;
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
                    if (nn40Var.d0 == 1) {
                        nn40Var.O0();
                    }
                    nn40Var.d0 = 0;
                }
                return Unit.a;
            }
        }));
        z0().c.f(getViewLifecycleOwner(), new e(new x1w(this, i3)));
        xo40 xo40Var32 = (xo40) this.b;
        if (xo40Var32 != null) {
            xo40Var32.V.E(this.D, this.l0, this.k0, this.o0);
        }
        ypa0 ypa0Var = this.z;
        if (ypa0Var == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        GameDetails gameDetails2 = this.H;
        String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
        if (name2 == null) {
            name2 = "";
        }
        ypa0Var.e = name2;
    }

    public final void p0(String str, BetCardDecision betCardDecision) {
        Context context;
        String string;
        String strB;
        String strB2;
        String string2;
        String string3;
        this.p0 = str;
        ypa0 ypa0Var = this.z;
        if (ypa0Var == null) {
            Intrinsics.n("soundViewModel");
            throw null;
        }
        String string4 = requireContext().getString(R.string.click_main_menu);
        string4.getClass();
        ypa0Var.A1(0L, string4);
        SharedPreferences sharedPreferences = this.Q;
        int i2 = 1;
        if (sharedPreferences == null || sharedPreferences.getBoolean("ONE_TAP", false)) {
            N0(false);
            RoundInitializeResponse roundInitializeResponseD = C0().c.d();
            Integer numValueOf = roundInitializeResponseD != null ? Integer.valueOf(roundInitializeResponseD.getTurnId() + 1) : null;
            int i3 = this.b0;
            if (numValueOf != null && numValueOf.intValue() == i3) {
                if (numValueOf.intValue() != 5) {
                    g060 g060VarC0 = C0();
                    RoundInitializeResponse roundInitializeResponseD2 = C0().c.d();
                    g060VarC0.y1(new RoundRequest(roundInitializeResponseD2 != null ? Long.valueOf(roundInitializeResponseD2.getRoundId()) : null));
                    return;
                } else {
                    g060 g060VarC1 = C0();
                    RoundInitializeResponse roundInitializeResponseD3 = C0().c.d();
                    g060VarC1.x1(new RoundRequest(roundInitializeResponseD3 != null ? Long.valueOf(roundInitializeResponseD3.getRoundId()) : null));
                    C0().z1();
                    return;
                }
            }
            if (yju.a("br")) {
                ynh0 ynh0VarD0 = D0();
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                Double d2 = C0().d.d();
                RoundInitializeResponse roundInitializeResponseD4 = C0().c.d();
                Long lValueOf = roundInitializeResponseD4 != null ? Long.valueOf(roundInitializeResponseD4.getRoundId()) : null;
                g060.b bVarD = C0().e.d();
                String giftId = bVarD != null ? bVarD.a.getGiftId() : null;
                g060.b bVarD2 = C0().e.d();
                ynh0VarD0.y1(new PlaceBetRequest(iIntValue, d2, betCardDecision, lValueOf, giftId, bVarD2 != null ? Double.valueOf(bVarD2.b) : null, this.t0, null, 128, null), getActivity());
                return;
            }
            ynh0 ynh0VarD1 = D0();
            int iIntValue2 = numValueOf != null ? numValueOf.intValue() : 0;
            Double d3 = C0().d.d();
            RoundInitializeResponse roundInitializeResponseD5 = C0().c.d();
            Long lValueOf2 = roundInitializeResponseD5 != null ? Long.valueOf(roundInitializeResponseD5.getRoundId()) : null;
            g060.b bVarD3 = C0().e.d();
            String giftId2 = bVarD3 != null ? bVarD3.a.getGiftId() : null;
            g060.b bVarD4 = C0().e.d();
            ynh0VarD1.x1(new PlaceBetRequest(iIntValue2, d3, betCardDecision, lValueOf2, giftId2, bVarD4 != null ? Double.valueOf(bVarD4.b) : null, this.t0, null, 128, null), false);
            this.b0 = this.M;
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#,###.00", SportyGamesManager.decimalFormatSymbols);
        Double d4 = C0().d.d();
        if ((d4 != null ? d4.doubleValue() : 0.0d) < 1.0d) {
            decimalFormat = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols);
        }
        Double d5 = C0().d.d();
        if (d5 != null) {
            double dDoubleValue = d5.doubleValue();
            op5 op5Var = op5.a;
            String str2 = this.c0;
            op5Var.getClass();
            String string5 = getString(R.string.redblack_confirm_txt, op5.i(str2), decimalFormat.format(dDoubleValue), str);
            if (string5 == null || (context = getContext()) == null) {
                return;
            }
            if (Intrinsics.g(str, getString(R.string.red))) {
                string = getString(R.string.place_bet_confirm_red_cms);
                string.getClass();
            } else {
                string = getString(R.string.place_bet_confirm_black_cms);
                string.getClass();
            }
            HashMap map = new HashMap();
            map.put(getString(R.string.currency_cms), op5.i(this.c0));
            map.put(getString(R.string.amount_cms), decimalFormat.format(C0().d.d()));
            HashMap map2 = new HashMap();
            map2.put(getString(R.string.currency_cms), op5.i(this.c0));
            map2.put(getString(R.string.amount_cms), "_AMOUNT_");
            FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
            supportFragmentManager.getClass();
            if (this.z == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            String strB3 = op5.b(string, string5, map);
            String string6 = getString(R.string.redblack_confirm_txt, op5.i(this.c0), "_AMOUNT_", str);
            string6.getClass();
            String strB4 = op5.b(string, string6, map2);
            androidx.fragment.app.e activity = getActivity();
            if (activity == null || (string3 = activity.getString(R.string.confirm_btn_cms)) == null) {
                strB = null;
            } else {
                String string7 = getString(R.string.confirm_bet);
                string7.getClass();
                strB = op5.b(string3, string7, null);
            }
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 == null || (string2 = activity2.getString(R.string.cancel_btn_cms)) == null) {
                strB2 = null;
            } else {
                String string8 = getString(R.string.cancel_bet);
                string8.getClass();
                strB2 = op5.b(string2, string8, null);
            }
            this.c = com.sportygames.commons.components.a.C0437a.a("Red-Black", "place bet", strB3, strB4, strB, strB2, new kp00(i2, this, betCardDecision), new hm40(), context.getColor(R.color.redblack_confirm_dialog_left_button), context.getColor(R.color.redblack_confirm_dialog_right_button), 12288);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            com.sportygames.commons.components.a aVar2 = this.c;
            if (aVar2 == null) {
                Intrinsics.n("sgConfirmDialogFragment");
                throw null;
            }
            aVar.f(R.id.flContent, aVar2, null);
            aVar.c("CONFIRM_DIALOG_FRAGMENT");
            aVar.d();
        }
    }

    public final void q0() {
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.G.setClickable(false);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.D.setListener(false);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.X.setEnabled(false);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.X.b(false);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            xo40Var5.f.setChipsClick(false);
        }
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.b.setClickable(false);
        }
    }

    public final void r0() {
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.f.setEnabled(true);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.f.setAlpha(1.0f);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.f.E(1.0f, true);
        }
    }

    public final void s0() {
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.G.setClickable(true);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.D.setListener(true);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.X.setEnabled(true);
        }
        xo40 xo40Var4 = (xo40) this.b;
        if (xo40Var4 != null) {
            xo40Var4.X.b(true);
        }
        xo40 xo40Var5 = (xo40) this.b;
        if (xo40Var5 != null) {
            xo40Var5.f.setChipsClick(true);
        }
        xo40 xo40Var6 = (xo40) this.b;
        if (xo40Var6 != null) {
            xo40Var6.b.setClickable(true);
        }
    }

    public final void t0() {
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            xo40Var.X.setEnabled(true);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.X.setAlpha(1.0f);
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.X.b(true);
        }
    }

    public final void u0() {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    public final void v0(String str) {
        Integer numValueOf;
        svg svgVar;
        String name;
        Integer id;
        if ((this.n0 || !this.j0) && str == null) {
            androidx.fragment.app.e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        int i2 = 1;
        if (this.I != null) {
            if (getContext() == null) {
                numValueOf = null;
            } else {
                List<GameDetails> list = this.I;
                if (list != null) {
                    GameDetails gameDetails = this.H;
                    int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
                    GameDetails gameDetails2 = this.H;
                    if (gameDetails2 == null || (name = gameDetails2.getName()) == null) {
                        name = "";
                    }
                    svgVar = new svg();
                    svgVar.c = list;
                    svgVar.d = Integer.valueOf(iIntValue);
                    svgVar.e = name;
                    svgVar.i = str;
                } else {
                    svgVar = null;
                }
                androidx.fragment.app.e activity2 = getActivity();
                if (activity2 != null) {
                    FragmentManager supportFragmentManager = activity2.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    if (svgVar != null) {
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                        aVar.f(R.id.flContent, svgVar, null);
                        aVar.c("CONFIRM_DIALOG_FRAGMENT");
                        numValueOf = Integer.valueOf(aVar.k(false, true));
                    } else {
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
            if (numValueOf != null) {
                return;
            }
        }
        if (str != null) {
            Context context = getContext();
            if (context != null) {
                xbg xbgVar = this.S;
                if (xbgVar == null) {
                    Intrinsics.n("errorDialog");
                    throw null;
                }
                String string = getString(R.string.label_dialog_exit);
                string.getClass();
                xbg.c(xbgVar, str, string, new Function0() { // from class: im40
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        e activity3 = this.a.getActivity();
                        if (activity3 == null) {
                            return null;
                        }
                        activity3.finish();
                        return Unit.a;
                    }
                }, new tm40(0), context.getColor(R.color.try_again_color), 224);
                xbgVar.a();
                return;
            }
            return;
        }
        q0();
        Context context2 = getContext();
        if (context2 != null) {
            if (this.z == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            op5 op5Var = op5.a;
            String string2 = getString(R.string.exit_confirm_msg_cms);
            string2.getClass();
            String string3 = getString(R.string.exit_text);
            string3.getClass();
            op5Var.getClass();
            String strB = op5.b(string2, string3, null);
            String string4 = getString(R.string.stay_btn_cms);
            string4.getClass();
            String string5 = getString(R.string.stay);
            string5.getClass();
            String strB2 = op5.b(string4, string5, null);
            String string6 = getString(R.string.exit_btn_cms);
            string6.getClass();
            String string7 = getString(R.string.label_dialog_exit);
            string7.getClass();
            this.d = com.sportygames.commons.components.a.C0437a.a("Red-Black", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string6, string7, null), new p2w(this, i2), new bm40(), context2.getColor(R.color.redblack_confirm_dialog_left_button), context2.getColor(R.color.redblack_confirm_dialog_right_button), 4096);
            androidx.fragment.app.e activity3 = getActivity();
            if (activity3 != null) {
                FragmentManager supportFragmentManager2 = activity3.getSupportFragmentManager();
                supportFragmentManager2.getClass();
                com.sportygames.commons.components.a aVar2 = this.d;
                if (aVar2 != null) {
                    androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager2);
                    aVar3.f(R.id.flContent, aVar2, null);
                    aVar3.c("CONFIRM_DIALOG_FRAGMENT");
                    aVar3.k(false, true);
                }
            }
        }
    }

    public final bu2 w0() {
        return (bu2) this.C.getValue();
    }

    public final fuj y0() {
        return (fuj) this.u0.getValue();
    }

    public final q530 z0() {
        return (q530) this.E.getValue();
    }

    public final void E0() {
        boolean z2;
        Boolean boolValueOf;
        Integer numValueOf = Integer.valueOf(R.color.redblack_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.redblack_toggle_on_color);
        op5 op5Var = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        o2w o2wVar = new o2w(1);
        SharedPreferences sharedPreferences = this.Q;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, o2wVar, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("MUSIC", true)) : null, numValueOf2, numValueOf, null, false, new Function1() { // from class: vl40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                xo40 xo40Var;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                nn40 nn40Var = this.a;
                SharedPreferences.Editor editor = nn40Var.R;
                if (zBooleanValue) {
                    if (editor != null) {
                        editor.putBoolean("MUSIC", true);
                    }
                    SharedPreferences.Editor editor2 = nn40Var.R;
                    if (editor2 != null) {
                        editor2.apply();
                    }
                    SharedPreferences sharedPreferences2 = nn40Var.Q;
                    Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("MUSIC", true)) : null;
                    SharedPreferences sharedPreferences3 = nn40Var.Q;
                    Boolean boolValueOf3 = sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean("SOUND", true)) : null;
                    if (nn40Var.getContext() != null && (xo40Var = (xo40) nn40Var.b) != null) {
                        ProgressMeterComponent progressMeterComponent = xo40Var.V;
                        String string3 = nn40Var.getString(R.string.redblack_name);
                        string3.getClass();
                        rk60.b bVar = rk60.b.c;
                        GameDetails gameDetails = nn40Var.H;
                        Context contextRequireContext = nn40Var.requireContext();
                        contextRequireContext.getClass();
                        ypa0 ypa0Var = nn40Var.z;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string4 = nn40Var.getString(R.string.bg_music);
                        string4.getClass();
                        progressMeterComponent.I("Black/", string3, boolValueOf3, bVar, gameDetails, contextRequireContext, ypa0Var, boolValueOf2, string4);
                    }
                } else {
                    if (editor != null) {
                        editor.putBoolean("MUSIC", false);
                    }
                    if (((xo40) nn40Var.b) != null) {
                        ypa0 ypa0Var2 = nn40Var.z;
                        if (ypa0Var2 == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        ypa0Var2.I1();
                    }
                }
                SharedPreferences.Editor editor3 = nn40Var.R;
                if (editor3 != null) {
                    editor3.apply();
                }
                return Unit.a;
            }
        }, 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        wl40 wl40Var = new wl40();
        SharedPreferences sharedPreferences2 = this.Q;
        if (sharedPreferences2 != null) {
            z2 = true;
            boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("SOUND", true));
        } else {
            z2 = true;
            boolValueOf = null;
        }
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, wl40Var, true, boolValueOf, numValueOf2, numValueOf, null, false, new xl40(this, 0), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        int i2 = 1;
        nqm nqmVar = new nqm(1);
        SharedPreferences sharedPreferences3 = this.Q;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, nqmVar, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean(tYcQsJyaojE.uWHpU, false)) : null, numValueOf2, numValueOf, null, false, new kuc(this, i2), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new s34(this, 2), false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new Function0() { // from class: yl40
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                nn40 nn40Var = this.a;
                if (!(nn40Var.requireActivity().getSupportFragmentManager().G(R.id.flContent) instanceof a)) {
                    nn40Var.P0();
                }
                return Unit.a;
            }
        }, false, null, null, null, null, false, null, 3072, null));
        xo40 xo40Var = (xo40) this.b;
        if (xo40Var != null) {
            SGHamburgerMenu sGHamburgerMenu = xo40Var.G;
            ypa0 ypa0Var = this.z;
            if (ypa0Var == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            SGHamburgerMenu.b bVar = new SGHamburgerMenu.b(ypa0Var, R.string.redblack_name, this.e, this.f, listK, new bp00(this, 1), new zl40());
            androidx.fragment.app.e eVarRequireActivity = requireActivity();
            eVarRequireActivity.getClass();
            SGHamburgerMenu.setup$default(sGHamburgerMenu, bVar, eVarRequireActivity, false, null, null, 28, null);
        }
        xo40 xo40Var2 = (xo40) this.b;
        if (xo40Var2 != null) {
            xo40Var2.G.setRBImage();
        }
        xo40 xo40Var3 = (xo40) this.b;
        if (xo40Var3 != null) {
            xo40Var3.G.setRedBlackBottomImage();
        }
    }
}
