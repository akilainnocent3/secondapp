package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationView;
import com.sporty.android.core.model.cashout.CashoutMetricsPayload;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.chat.views.ChatActivity;
import com.sportygames.commons.components.GiftToast;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.components.SGHamburgerMenu;
import com.sportygames.commons.components.SgCommonHeaderContainer;
import com.sportygames.commons.components.SgCommonToastContainer;
import com.sportygames.commons.components.SgErrorToastContainer;
import com.sportygames.commons.components.a;
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
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.crash.components.header.DepositTooltipComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.rush.components.SgRushWaveLoader;
import com.sportygames.rush.model.entity.DetailResponseEntity;
import com.sportygames.rush.model.response.ChatRoomResponse;
import com.sportygames.rush.model.response.RushPlaceBetResponse;
import com.sportygames.rush.model.response.UserValidateResponse;
import com.sportygames.rush.model.response.WalletInfoResponse;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import com.sportygames.sportyherov2.utils.FadingEdgeLayout;
import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ll560;", "Landroidx/fragment/app/Fragment;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "Lbb;", "", "Lxjj;", "<init>", "()V", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l560 extends Fragment implements GameMainActivity.b, bb, xjj {
    public double A;
    public final c A0;
    public int B;
    public final ee<Intent> B0;
    public long C0;
    public boolean D;
    public ObjectAnimator D0;
    public boolean F;
    public boolean G;
    public boolean H;
    public int J;
    public boolean K;
    public xbg N;
    public SharedPreferences O;
    public SharedPreferences.Editor P;
    public com.sportygames.commons.components.a Q;
    public com.sportygames.commons.components.a R;
    public GameDetails S;
    public DetailResponseEntity T;
    public WalletInfoResponse U;
    public List<ChatRoomResponse> V;
    public fo2 W;
    public sp80 X;
    public PromotionGiftsResponse Y;
    public xi60 Z;
    public UserValidateResponse a0;
    public boolean b;
    public HashMap<Double, Double> b0;
    public Double c;
    public final q8i0 c0;
    public int d;
    public final q8i0 d0;
    public double e;
    public final q8i0 e0;
    public double f;
    public fq5 f0;
    public List<GameDetails> g0;
    public z66 h0;
    public double i;
    public boolean i0;
    public final q8i0 j0;
    public final q8i0 k0;
    public eo80 l0;
    public boolean m0;
    public boolean n0;
    public a o0;
    public final String p0;
    public final ArrayList<String> q0;
    public boolean r0;
    public boolean s0;
    public String t0;
    public nle u0;
    public double v;
    public mke v0;
    public double w;
    public final ytw<Boolean> w0;
    public int x0;
    public boolean y0;
    public double z;
    public final f z0;
    public final ttr a = hwr.a(a1s.a, new m());
    public double y = 1.0d;
    public String C = "";
    public final ssw<Boolean> E = new ssw<>();
    public String I = "";
    public LinkedHashMap L = new LinkedHashMap();
    public LinkedHashMap M = new LinkedHashMap();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes6.dex */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("CHAT", 1);
            b = aVar2;
            a aVar3 = new a("BET_HISTORY", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class b {
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
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar = a.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar2 = a.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class c implements TextWatcher {
        public c() {
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
            double d;
            CharSequence text;
            String string;
            charSequence.getClass();
            try {
                int length = charSequence.length();
                l560 l560Var = l560.this;
                if (length == 0) {
                    l560Var.u0(false);
                    return;
                }
                double d2 = Double.parseDouble(charSequence.toString());
                eo80 eo80Var = l560Var.l0;
                boolean z = true;
                if (eo80Var == null || (text = eo80Var.C0.getText()) == null || (string = text.toString()) == null) {
                    d = 0.0d;
                } else {
                    eo80 eo80Var2 = l560Var.l0;
                    d = Double.parseDouble(string.substring(0, String.valueOf(eo80Var2 != null ? eo80Var2.C0.getText() : null).length() - 1));
                }
                double d3 = l560Var.e;
                if (d2 <= d3) {
                    l560Var.u0(false);
                    l560Var.s0(true);
                } else if (d2 > d3 && d2 < l560Var.f) {
                    l560Var.u0(true);
                    l560Var.s0(true);
                } else if (d2 >= l560Var.f) {
                    l560Var.u0(true);
                    l560Var.s0(false);
                }
                if (d2 * d > l560Var.w) {
                    l560Var.l1();
                } else {
                    eo80 eo80Var3 = l560Var.l0;
                    if (eo80Var3 != null && eo80Var3.l0.getVisibility() == 0) {
                        l560Var.K0(d, d2);
                    }
                }
                Double d4 = l560Var.c;
                double dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
                DetailResponseEntity detailResponseEntity = l560Var.T;
                boolean z2 = dDoubleValue <= (detailResponseEntity != null ? detailResponseEntity.getMaxAmount() : 0.0d);
                if ((dDoubleValue - d2) / dDoubleValue >= 0.2d) {
                    z = false;
                }
                if ((d2 > dDoubleValue || (z2 && z)) && l560Var.M0() && !l560Var.y0) {
                    eo80 eo80Var4 = l560Var.l0;
                    if (eo80Var4 != null) {
                        eo80Var4.b.setVisibility(0);
                    }
                } else {
                    eo80 eo80Var5 = l560Var.l0;
                    if (eo80Var5 != null) {
                        eo80Var5.b.setVisibility(8);
                    }
                }
                l560Var.I0(d2, d);
                l560Var.H0(d, d2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class e implements x82<mth, String> {
        public e() {
        }

        @Override // defpackage.x82
        public final void a(mth mthVar) {
            ro80 binding;
            ro80 binding2;
            ro80 binding3;
            ro80 binding4;
            ro80 binding5;
            boolean z = mthVar == mth.NO_DEPOSIT;
            l560 l560Var = l560.this;
            l560Var.y0 = z;
            String strC = op5.c(op5.a, "first_time_user_deposit_text:sg_common", "");
            boolean z2 = l560Var.y0;
            eo80 eo80Var = l560Var.l0;
            if (z2) {
                if (eo80Var != null && (binding5 = eo80Var.W.getBinding()) != null) {
                    binding5.c.setVisibility(4);
                }
                eo80 eo80Var2 = l560Var.l0;
                if (eo80Var2 != null && (binding4 = eo80Var2.W.getBinding()) != null) {
                    binding4.B.setVisibility(0);
                }
                eo80 eo80Var3 = l560Var.l0;
                if (eo80Var3 != null && (binding3 = eo80Var3.W.getBinding()) != null) {
                    gr60.a(binding3.B, new q560());
                }
                int length = strC.length();
                eo80 eo80Var4 = l560Var.l0;
                if (length > 0) {
                    if (eo80Var4 != null) {
                        eo80Var4.q0.setVisibility(0);
                    }
                    eo80 eo80Var5 = l560Var.l0;
                    if (eo80Var5 != null) {
                        eo80Var5.q0.setText(strC);
                    }
                } else if (eo80Var4 != null) {
                    eo80Var4.q0.setVisibility(4);
                }
            } else {
                if (eo80Var != null && (binding2 = eo80Var.W.getBinding()) != null) {
                    binding2.c.setVisibility(0);
                }
                eo80 eo80Var6 = l560Var.l0;
                if (eo80Var6 != null && (binding = eo80Var6.W.getBinding()) != null) {
                    binding.B.setVisibility(4);
                }
                eo80 eo80Var7 = l560Var.l0;
                if (eo80Var7 != null) {
                    eo80Var7.q0.setVisibility(4);
                }
            }
            if (l560Var.s0) {
                return;
            }
            eo80 eo80Var8 = l560Var.l0;
            float height = eo80Var8 != null ? eo80Var8.m0.getHeight() : 0.0f;
            eo80 eo80Var9 = l560Var.l0;
            l560Var.O0(height, eo80Var9 != null ? eo80Var9.m0.getWidth() : 0.0f);
        }

        @Override // defpackage.x82
        public final void onError(String str) {
            ro80 binding;
            ro80 binding2;
            str.getClass();
            l560 l560Var = l560.this;
            eo80 eo80Var = l560Var.l0;
            if (eo80Var != null && (binding2 = eo80Var.W.getBinding()) != null) {
                binding2.c.setVisibility(0);
            }
            eo80 eo80Var2 = l560Var.l0;
            if (eo80Var2 != null && (binding = eo80Var2.W.getBinding()) != null) {
                binding.B.setVisibility(4);
            }
            eo80 eo80Var3 = l560Var.l0;
            if (eo80Var3 != null) {
                eo80Var3.q0.setVisibility(4);
            }
            if (l560Var.s0) {
                return;
            }
            eo80 eo80Var4 = l560Var.l0;
            float height = eo80Var4 != null ? eo80Var4.m0.getHeight() : 0.0f;
            eo80 eo80Var5 = l560Var.l0;
            l560Var.O0(height, eo80Var5 != null ? eo80Var5.m0.getWidth() : 0.0f);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class f implements TextWatcher {
        public f() {
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
            charSequence.getClass();
            try {
                int length = charSequence.length();
                l560 l560Var = l560.this;
                if (length != 0 && !charSequence.equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X) && charSequence.toString().substring(0, charSequence.toString().length() - 1).length() != 0) {
                    double d = Double.parseDouble(charSequence.toString().substring(0, charSequence.toString().length() - 1));
                    eo80 eo80Var = l560Var.l0;
                    double d2 = Double.parseDouble(String.valueOf(eo80Var != null ? eo80Var.r0.getText() : null));
                    double d3 = l560Var.i;
                    if (d <= d3) {
                        l560Var.v0(false);
                        l560Var.t0(true);
                    } else if (d > d3 && d < l560Var.v) {
                        l560Var.v0(true);
                        l560Var.t0(true);
                    } else if (d >= l560Var.v) {
                        l560Var.v0(true);
                        l560Var.t0(false);
                    }
                    if (d2 * d > l560Var.w) {
                        l560Var.l1();
                    } else {
                        eo80 eo80Var2 = l560Var.l0;
                        if (eo80Var2 != null && eo80Var2.l0.getVisibility() == 0) {
                            l560Var.K0(d, d2);
                        }
                    }
                    l560Var.H0(d, d2);
                    l560Var.I0(d2, d);
                    l560Var.c1(d, Double.valueOf(l560Var.y));
                    return;
                }
                l560Var.c1(l560Var.v, Double.valueOf(l560Var.y));
                l560Var.v0(false);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class g extends qlr implements Function0<v8i0> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return l560.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class h extends qlr implements Function0<cyb> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return l560.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return l560.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return l560.this.requireActivity().getViewModelStore();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return l560.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class l extends qlr implements Function0<r8i0.c> {
        public l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return l560.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class m implements Function0<l1z> {
        public m() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            bb bbVar = l560.this;
            if (bbVar instanceof rrp) {
                qn70VarJ = ((rrp) bbVar).j();
                dq7VarA = jq40.a(l1z.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(l1z.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? l560.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class o extends qlr implements Function0<Fragment> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return l560.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? l560.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class t extends qlr implements Function0<Fragment> {
        public t() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return l560.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
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

    /* JADX INFO: loaded from: classes6.dex */
    public static final class x extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? l560.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class y extends qlr implements Function0<Fragment> {
        public y() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return l560.this;
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class z extends qlr implements Function0<w8i0> {
        public final /* synthetic */ y a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(y yVar) {
            super(0);
            this.a = yVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public l560() {
        t tVar = new t();
        a1s a1sVar = a1s.c;
        ttr ttrVarA = hwr.a(a1sVar, new u(tVar));
        this.c0 = new q8i0(jq40.a(ypa0.class), new v(ttrVarA), new x(ttrVarA), new w(ttrVarA));
        ttr ttrVarA2 = hwr.a(a1sVar, new z(new y()));
        this.d0 = new q8i0(jq40.a(c760.class), new a0(ttrVarA2), new n(ttrVarA2), new b0(ttrVarA2));
        ttr ttrVarA3 = hwr.a(a1sVar, new p(new o()));
        this.e0 = new q8i0(jq40.a(cu2.class), new q(ttrVarA3), new s(ttrVarA3), new r(ttrVarA3));
        this.j0 = new q8i0(jq40.a(fuj.class), new g(), new i(), new h());
        this.k0 = new q8i0(jq40.a(db6.class), new j(), new l(), new k());
        this.m0 = true;
        new DecimalFormat("###,##0.00", SportyGamesManager.decimalFormatSymbols);
        this.o0 = a.a;
        this.p0 = "sg_rush";
        this.q0 = kotlin.collections.b.f("sg_rush", "sg_common_dialog_message", "sg_chat", "sg_fbg_dialog", "sg_ham_menu", "sg_input_dialog", "sg_bethistory", "sg_common", "sg_exit_dialog", "sg_game_common", "currency_symbols", "sg_onboarding", "common_functions", "sg_campaign");
        this.t0 = "en";
        this.w0 = androidx.compose.runtime.m.b(Boolean.FALSE);
        this.z0 = new f();
        this.A0 = new c();
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: f460
            @Override // defpackage.ud
            public final void a(Object obj) {
                ((ActivityResult) obj).getClass();
                l560 l560Var = this.a;
                l560Var.E.j(Boolean.FALSE);
                if (!l560Var.F || l560Var.getContext() == null) {
                    return;
                }
                ScaleAnimation scaleAnimation = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, 1, 0.5f, 1, 0.5f);
                scaleAnimation.setDuration(500L);
                scaleAnimation.setAnimationListener(new m560());
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null) {
                    eo80Var.f.startAnimation(scaleAnimation);
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.B0 = eeVarRegisterForActivityResult;
    }

    public static HashMap G0(double d2, double d3) {
        HashMap map = new HashMap();
        double dDoubleValue = 0.0d;
        for (double d4 = 1.01d; d4 <= d3; d4 += 0.01d) {
            map.put(Double.valueOf(Double.parseDouble(krh0.l(d4))), Double.valueOf((Math.pow(d4, -2.0d) * d2 * 0.01d) + dDoubleValue));
            Double d5 = (Double) map.get(Double.valueOf(Double.parseDouble(krh0.l(d4))));
            dDoubleValue = d5 != null ? d5.doubleValue() : 0.0d;
        }
        return map;
    }

    public static void P0(TextView textView) {
        CharSequence text;
        String string;
        CharSequence text2;
        if (Intrinsics.g((textView == null || (text2 = textView.getText()) == null) ? null : text2.toString(), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) {
            return;
        }
        String strSubstring = String.valueOf((textView == null || (text = textView.getText()) == null || (string = text.toString()) == null) ? null : pl2.a(textView, 1, string, 0)).substring(0, String.valueOf(textView != null ? textView.getText() : null).length() - 2);
        if (strSubstring.length() == 0 && textView != null) {
            textView.setText(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
        }
        if (strSubstring.length() > 0) {
            if (textView != null) {
                textView.setText(strSubstring.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
            }
        } else if (textView != null) {
            textView.setText(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
        }
    }

    public final cu2 C0() {
        return (cu2) this.e0.getValue();
    }

    public final fuj D0() {
        return (fuj) this.j0.getValue();
    }

    public final ypa0 E0() {
        return (ypa0) this.c0.getValue();
    }

    public final c760 F0() {
        return (c760) this.d0.getValue();
    }

    public final void H0(double d2, double d3) {
        double d4 = this.f;
        double d5 = d2 * d4;
        double d6 = this.w;
        eo80 eo80Var = this.l0;
        if (d5 > d6) {
            if (eo80Var != null) {
                eo80Var.C.setEnabled(false);
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.w0.setEnabled(false);
                return;
            }
            return;
        }
        if (d3 < d4) {
            if (eo80Var != null) {
                eo80Var.C.setEnabled(true);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.w0.setEnabled(true);
                return;
            }
            return;
        }
        if (eo80Var != null) {
            eo80Var.C.setEnabled(false);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.w0.setEnabled(false);
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    public final void I0(double d2, double d3) {
        double d4 = this.v;
        double d5 = d2 * d4;
        double d6 = this.w;
        eo80 eo80Var = this.l0;
        if (d5 > d6) {
            if (eo80Var != null) {
                eo80Var.D.setEnabled(false);
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.x0.setEnabled(false);
                return;
            }
            return;
        }
        if (d3 < d4) {
            if (eo80Var != null) {
                eo80Var.D.setEnabled(true);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.x0.setEnabled(true);
                return;
            }
            return;
        }
        if (eo80Var != null) {
            eo80Var.D.setEnabled(false);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.x0.setEnabled(false);
        }
    }

    public final void J0() {
        String string = getString(R.string.sg_rush_auto_off);
        string.getClass();
        T0(string);
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.n0.U();
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.i0.setVisibility(4);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.G0.setVisibility(0);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.F0.setVisibility(0);
        }
        eo80 eo80Var5 = this.l0;
        if (eo80Var5 != null) {
            eo80Var5.p0.setVisibility(0);
        }
    }

    public final void K0(double d2, double d3) {
        eo80 eo80Var;
        androidx.constraintlayout.widget.b bVarK;
        androidx.constraintlayout.widget.b bVarK2;
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.l0.setVisibility(8);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.m0.setEnabled(true);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.e.setEnabled(true);
        }
        double d4 = this.f;
        eo80 eo80Var5 = this.l0;
        if (d3 < d4) {
            if (eo80Var5 != null) {
                eo80Var5.I.setEnabled(true);
            }
            eo80 eo80Var6 = this.l0;
            if (eo80Var6 != null) {
                eo80Var6.D0.setEnabled(true);
            }
        } else {
            if (eo80Var5 != null) {
                eo80Var5.I.setEnabled(false);
            }
            eo80 eo80Var7 = this.l0;
            if (eo80Var7 != null) {
                eo80Var7.D0.setEnabled(false);
            }
        }
        double d5 = this.v;
        eo80 eo80Var8 = this.l0;
        if (d2 < d5) {
            if (eo80Var8 != null) {
                eo80Var8.J.setEnabled(true);
            }
            eo80 eo80Var9 = this.l0;
            if (eo80Var9 != null) {
                eo80Var9.E0.setEnabled(true);
            }
        } else {
            if (eo80Var8 != null) {
                eo80Var8.J.setEnabled(false);
            }
            eo80 eo80Var10 = this.l0;
            if (eo80Var10 != null) {
                eo80Var10.E0.setEnabled(false);
            }
        }
        eo80 eo80Var11 = this.l0;
        if (eo80Var11 != null && (bVarK2 = eo80Var11.n0.K(R.id.start)) != null) {
            bVarK2.w(R.id.place_bet_btn, 1.0f);
            eo80 eo80Var12 = this.l0;
            bVarK2.b(eo80Var12 != null ? eo80Var12.n0 : null);
        }
        String str = F0().e;
        if ((str != null && str.length() != 0) || (eo80Var = this.l0) == null || (bVarK = eo80Var.n0.K(R.id.start)) == null) {
            return;
        }
        bVarK.w(R.id.auto_bet_btn, 1.0f);
        eo80 eo80Var13 = this.l0;
        bVarK.b(eo80Var13 != null ? eo80Var13.n0 : null);
    }

    public final boolean M0() {
        return !N0();
    }

    public final boolean N0() {
        F0();
        return SportyGamesManager.getInstance().getUser() == null;
    }

    public final void O0(float f2, float f3) {
        Context context;
        int i2;
        boolean zBooleanValue;
        ro80 binding;
        if (N0() || (M0() && this.y0)) {
            this.n0 = true;
            boolean z2 = M0() && this.y0;
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new x560(z2, true, this, null), 3);
        }
        if (N0() || this.y0) {
            return;
        }
        eo80 eo80Var = this.l0;
        if ((eo80Var == null || eo80Var.o0.getVisibility() != 0) && (context = getContext()) != null) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "rush");
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
            this.n0 = true;
            if (zBooleanValue) {
                this.s0 = false;
                boolean zM0 = M0();
                pfd pfdVar2 = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new x560(zM0, false, this, null), 3);
                return;
            }
            this.s0 = true;
            if (this.S != null) {
                Map<String, Float> mapF = kpu.f(new Pair("RUSH_BET_BUTTON_HEIGHT", Float.valueOf(f2)), new Pair("RUSH_BET_BUTTON_WIDTH", Float.valueOf(f3)));
                eo80 eo80Var2 = this.l0;
                boolean z3 = (eo80Var2 == null || (binding = eo80Var2.W.getBinding()) == null || binding.f.getVisibility() != 0) ? false : true;
                FragmentManager childFragmentManager = getChildFragmentManager();
                androidx.fragment.app.a aVarA = oke.a(childFragmentManager, childFragmentManager);
                op5.a.getClass();
                List<? extends File> list = op5.b;
                com.sportygames.commons.views.a aVar = new com.sportygames.commons.views.a();
                aVar.c = "rush";
                aVar.d = i2;
                aVar.w = list;
                aVar.z = mapF;
                aVar.A = z3;
                aVarA.f(R.id.onboarding_images, aVar, null);
                aVarA.d();
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.k0.setVisibility(0);
            }
        }
    }

    @Override // defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        String name;
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
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.o0.O(0);
        }
        this.r0 = false;
        try {
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.O.d();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        Context context = getContext();
        int length = ((context == null || (resources = context.getResources()) == null || (stringArray = resources.getStringArray(R.array.rush_images_array)) == null) ? 0 : stringArray.length) + 7;
        int i2 = 100 / length;
        int i3 = 100 - (length * i2);
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.o0.setProgressForApi(i2);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.o0.L();
        }
        eo80 eo80Var5 = this.l0;
        if (eo80Var5 != null) {
            eo80Var5.o0.O(i3);
        }
        eo80 eo80Var6 = this.l0;
        if (eo80Var6 != null) {
            eo80Var6.o0.setVisibility(0);
        }
        GameDetails gameDetails = this.S;
        if (gameDetails != null && (name = gameDetails.getName()) != null) {
            c760 c760VarF0 = F0();
            ej5.c(o8i0.d(c760VarF0), null, null, new a760(c760VarF0, name, null), 3);
        }
        if (getContext() != null) {
            b1();
            eo80 eo80Var7 = this.l0;
            if (eo80Var7 != null) {
                eo80Var7.o0.E(this.f0, this.q0, this.p0, this.t0);
            }
        }
        this.m0 = true;
    }

    public final void Q0() {
        GameDetails gameDetails = this.S;
        String name = gameDetails != null ? gameDetails.getName() : null;
        if (name == null) {
            name = "";
        }
        wz.a("PopupAction", name, "Logged in", "error_alert", "Exit");
        l1z l1zVar = (l1z) this.a.getValue();
        GameDetails gameDetails2 = this.S;
        Integer id = gameDetails2 != null ? gameDetails2.getId() : null;
        GameDetails gameDetails3 = this.S;
        l1zVar.h(id, gameDetails3 != null ? gameDetails3.getName() : null);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void R0(boolean z2) {
        FragmentManager supportFragmentManager;
        GameDetails gameDetails = this.S;
        Fragment fragmentG = null;
        wz.a("BetHistoryClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            fragmentG = supportFragmentManager.G(R.id.flContent);
        }
        if (z2 || !(fragmentG instanceof com.sportygames.commons.components.a)) {
            f1();
        }
    }

    public final void S0() {
        List<ChatRoomResponse> list;
        ChatRoomResponse chatRoomResponse;
        ChatRoomResponse chatRoomResponse2;
        Context context = getContext();
        if (context == null || (list = this.V) == null || list.isEmpty()) {
            return;
        }
        GameDetails gameDetails = this.S;
        wz.a("ChatClicked", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        if (this.F) {
            this.E.j(Boolean.TRUE);
        }
        Intent intent = new Intent(context, (Class<?>) ChatActivity.class);
        String string = getString(R.string.room_id);
        List<ChatRoomResponse> list2 = this.V;
        String chatRoomId = (list2 == null || (chatRoomResponse2 = list2.get(0)) == null) ? null : chatRoomResponse2.getChatRoomId();
        if (chatRoomId == null) {
            chatRoomId = "";
        }
        intent.putExtra(string, chatRoomId);
        String string2 = getString(R.string.bot_id);
        List<ChatRoomResponse> list3 = this.V;
        String botUserId = (list3 == null || (chatRoomResponse = list3.get(0)) == null) ? null : chatRoomResponse.getBotUserId();
        if (botUserId == null) {
            botUserId = "";
        }
        intent.putExtra(string2, botUserId);
        intent.putExtra(getString(R.string.color), R.color.toolbar_strip_bottle);
        String string3 = getString(R.string.game_name);
        GameDetails gameDetails2 = this.S;
        String name = gameDetails2 != null ? gameDetails2.getName() : null;
        if (name == null) {
            name = "";
        }
        intent.putExtra(string3, name);
        intent.putExtra(getString(R.string.sound), this.S);
        op5 op5Var = op5.a;
        WalletInfoResponse walletInfoResponse = this.U;
        String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
        String str = currency != null ? currency : "";
        op5Var.getClass();
        intent.putExtra("currency", op5.i(str));
        String string4 = getString(R.string.sound_on);
        SharedPreferences sharedPreferences = this.O;
        intent.putExtra(string4, sharedPreferences != null ? sharedPreferences.getBoolean("rush_sound", true) : false);
        intent.putExtra("autobetCount", String.valueOf(this.x0));
        if (this.F) {
            intent.putExtra("fragment_to_load", "fragment_rush_component");
        }
        this.B0.b(intent);
    }

    public final void T0(String str) {
        if (isVisible() && !isHidden() && this.H) {
            E0().A1(0L, str);
        }
    }

    public final void U0() {
        eo80 eo80Var = this.l0;
        ViewGroup.LayoutParams layoutParams = eo80Var != null ? eo80Var.r0.getLayoutParams() : null;
        ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.setMarginStart(0);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.r0.setLayoutParams(layoutParams2);
        }
    }

    public final void V0() {
        this.J = 0;
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.p0.setText(String.valueOf(0));
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.p0.setVisibility(4);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.p0.clearAnimation();
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.i0.setVisibility(0);
        }
        eo80 eo80Var5 = this.l0;
        if (eo80Var5 != null) {
            eo80Var5.h0.setVisibility(4);
        }
        eo80 eo80Var6 = this.l0;
        if (eo80Var6 != null) {
            eo80Var6.G0.setVisibility(4);
        }
        eo80 eo80Var7 = this.l0;
        if (eo80Var7 != null) {
            eo80Var7.F0.setVisibility(4);
        }
        GameDetails gameDetails = this.S;
        String name = gameDetails != null ? gameDetails.getName() : null;
        if (name == null) {
            name = "";
        }
        wz.a("StopAutoBet", name, String.valueOf(this.J));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object X0(x1b x1bVar) {
        a660 a660Var;
        CharSequence text;
        String string;
        CharSequence text2;
        if (x1bVar instanceof a660) {
            a660Var = (a660) x1bVar;
            int i2 = a660Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a660Var.c = i2 - Integer.MIN_VALUE;
            } else {
                a660Var = new a660(this, x1bVar);
            }
        } else {
            a660Var = new a660(this, x1bVar);
        }
        Object obj = a660Var.a;
        y5b y5bVar = y5b.a;
        int i3 = a660Var.c;
        CharSequence charSequenceSubstring = null;
        if (i3 == 0) {
            uj50.b(obj);
            Context context = getContext();
            if (context != null) {
                eo80 eo80Var = this.l0;
                if (eo80Var != null) {
                    eo80Var.v0.setText("1.00X");
                }
                eo80 eo80Var2 = this.l0;
                if (eo80Var2 != null) {
                    eo80Var2.v0.setShadowLayer(5.0f, 0.0f, 0.0f, context.getColor(R.color.sg_rush_shadow_house_coeff));
                }
                eo80 eo80Var3 = this.l0;
                if (eo80Var3 != null) {
                    eo80Var3.v0.setTextColor(context.getColor(R.color.white));
                }
                eo80 eo80Var4 = this.l0;
                if (eo80Var4 != null) {
                    eo80Var4.L.clearAnimation();
                }
                eo80 eo80Var5 = this.l0;
                if (eo80Var5 != null) {
                    eo80Var5.L.setScaleX(0.0f);
                }
                eo80 eo80Var6 = this.l0;
                if (eo80Var6 != null) {
                    eo80Var6.L.setScaleY(0.0f);
                }
                eo80 eo80Var7 = this.l0;
                if (eo80Var7 != null) {
                    eo80Var7.M.setProgress(0.0f);
                }
                eo80 eo80Var8 = this.l0;
                if (eo80Var8 != null) {
                    eo80Var8.j0.setVisibility(4);
                }
                ObjectAnimator objectAnimator = this.D0;
                if (objectAnimator != null) {
                    objectAnimator.cancel();
                }
                n1();
                if (this.J == this.x0) {
                    this.x0 = 0;
                }
                if (this.F) {
                    a660Var.c = 1;
                    if (hkd.b(1200L, a660Var) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    eo80 eo80Var9 = this.l0;
                    if (eo80Var9 != null && eo80Var9.f.getVisibility() == 0) {
                        String string2 = getString(R.string.sg_rush_auto_off);
                        string2.getClass();
                        T0(string2);
                        eo80 eo80Var10 = this.l0;
                        if (eo80Var10 != null) {
                            eo80Var10.n0.U();
                        }
                        eo80 eo80Var11 = this.l0;
                        if (eo80Var11 != null) {
                            eo80Var11.i0.setVisibility(4);
                        }
                        eo80 eo80Var12 = this.l0;
                        if (eo80Var12 != null) {
                            eo80Var12.G0.setVisibility(0);
                        }
                        eo80 eo80Var13 = this.l0;
                        if (eo80Var13 != null) {
                            eo80Var13.F0.setVisibility(0);
                        }
                        eo80 eo80Var14 = this.l0;
                        if (eo80Var14 != null) {
                            eo80Var14.p0.setVisibility(0);
                        }
                    }
                    y0();
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        WalletInfoResponse walletInfoResponse = this.U;
        String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
        eo80 eo80Var15 = this.l0;
        String string3 = (eo80Var15 == null || (text2 = eo80Var15.r0.getText()) == null) ? null : text2.toString();
        eo80 eo80Var16 = this.l0;
        if (eo80Var16 != null && (text = eo80Var16.C0.getText()) != null && (string = text.toString()) != null) {
            eo80 eo80Var17 = this.l0;
            charSequenceSubstring = string.substring(0, String.valueOf(eo80Var17 != null ? eo80Var17.C0.getText() : null).length() - 1);
        }
        String str = charSequenceSubstring;
        F0().c = string3;
        if (currency != null && currency.length() != 0 && string3 != null && string3.length() != 0 && str != 0 && str.length() != 0) {
            h1();
            o1();
            if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                c760 c760VarF0 = F0();
                String str2 = F0().c;
                c760VarF0.A1(getActivity(), F0().b, currency, str2 == null ? "" : str2, str, F0().e, this.i0);
            } else {
                String str3 = currency;
                c760 c760VarF1 = F0();
                String str4 = F0().c;
                c760VarF1.z1(str3, str4 == null ? "" : str4, str, F0().e, F0().b, this.i0, null, false);
            }
        }
        return Unit.a;
    }

    public final void Y0() {
        CharSequence text;
        int i2 = this.B;
        eo80 eo80Var = this.l0;
        String str = "0.00";
        String string = null;
        string = null;
        if (i2 == 2) {
            String strValueOf = String.valueOf(eo80Var != null ? eo80Var.C0.getText() : null);
            if (strValueOf.length() != 0) {
                eo80 eo80Var2 = this.l0;
                if (!String.valueOf(eo80Var2 != null ? eo80Var2.C0.getText() : null).equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) {
                    eo80 eo80Var3 = this.l0;
                    double d2 = Double.parseDouble(strValueOf.substring(0, String.valueOf(eo80Var3 != null ? eo80Var3.C0.getText() : null).length() - 1));
                    double d3 = this.v;
                    eo80 eo80Var4 = this.l0;
                    if (d2 >= d3) {
                        if (eo80Var4 != null) {
                            TextView textView = eo80Var4.C0;
                            try {
                                String str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d3);
                                str2.getClass();
                                str = str2;
                            } catch (Exception unused) {
                            }
                            textView.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                            return;
                        }
                        return;
                    }
                    double d4 = Double.parseDouble(strValueOf.substring(0, String.valueOf(eo80Var4 != null ? eo80Var4.C0.getText() : null).length() - 1));
                    double d5 = this.i;
                    eo80 eo80Var5 = this.l0;
                    if (d4 <= d5) {
                        if (eo80Var5 != null) {
                            TextView textView2 = eo80Var5.C0;
                            try {
                                String str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d5);
                                str3.getClass();
                                str = str3;
                            } catch (Exception unused2) {
                            }
                            textView2.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                            return;
                        }
                        return;
                    }
                    if (eo80Var5 != null) {
                        TextView textView3 = eo80Var5.C0;
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(strValueOf.substring(0, String.valueOf(textView3.getText()).length() - 1)));
                            str4.getClass();
                            str = str4;
                        } catch (Exception unused3) {
                        }
                        textView3.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                        return;
                    }
                    return;
                }
            }
            eo80 eo80Var6 = this.l0;
            if (eo80Var6 != null) {
                TextView textView4 = eo80Var6.C0;
                try {
                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.i);
                    str5.getClass();
                    str = str5;
                } catch (Exception unused4) {
                }
                textView4.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                return;
            }
            return;
        }
        if (eo80Var != null && (text = eo80Var.r0.getText()) != null) {
            string = text.toString();
        }
        if (string == null || string.length() == 0) {
            eo80 eo80Var7 = this.l0;
            if (eo80Var7 != null) {
                TextView textView5 = eo80Var7.r0;
                try {
                    String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.e);
                    str6.getClass();
                    str = str6;
                } catch (Exception unused5) {
                }
                textView5.setText(str);
                return;
            }
            return;
        }
        double d6 = Double.parseDouble(string);
        double d7 = this.f;
        if (d6 >= d7) {
            eo80 eo80Var8 = this.l0;
            if (eo80Var8 != null) {
                TextView textView6 = eo80Var8.r0;
                try {
                    String str7 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d7);
                    str7.getClass();
                    str = str7;
                } catch (Exception unused6) {
                }
                textView6.setText(str);
                return;
            }
            return;
        }
        double d8 = Double.parseDouble(string);
        double d9 = this.e;
        eo80 eo80Var9 = this.l0;
        if (d8 <= d9) {
            if (eo80Var9 != null) {
                TextView textView7 = eo80Var9.r0;
                try {
                    String str8 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d9);
                    str8.getClass();
                    str = str8;
                } catch (Exception unused7) {
                }
                textView7.setText(str);
                return;
            }
            return;
        }
        if (eo80Var9 != null) {
            TextView textView8 = eo80Var9.r0;
            try {
                String str9 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(string));
                str9.getClass();
                str = str9;
            } catch (Exception unused8) {
            }
            textView8.setText(str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z0(ImageView imageView, String str, x1b x1bVar) {
        b660 b660Var;
        if (x1bVar instanceof b660) {
            b660Var = (b660) x1bVar;
            int i2 = b660Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b660Var.d = i2 - Integer.MIN_VALUE;
            } else {
                b660Var = new b660(this, x1bVar);
            }
        } else {
            b660Var = new b660(this, x1bVar);
        }
        Object objC = b660Var.b;
        y5b y5bVar = y5b.a;
        int i3 = b660Var.d;
        if (i3 == 0) {
            uj50.b(objC);
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = getContext();
            b660Var.a = imageView;
            b660Var.d = 1;
            objC = r9n.c(b660Var, context, str);
            if (objC == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imageView = b660Var.a;
            uj50.b(objC);
        }
        imageView.setImageBitmap((Bitmap) objC);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a1(View view, String str, x1b x1bVar) {
        c660 c660Var;
        if (x1bVar instanceof c660) {
            c660Var = (c660) x1bVar;
            int i2 = c660Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c660Var.d = i2 - Integer.MIN_VALUE;
            } else {
                c660Var = new c660(this, x1bVar);
            }
        } else {
            c660Var = new c660(this, x1bVar);
        }
        Object objB = c660Var.b;
        y5b y5bVar = y5b.a;
        int i3 = c660Var.d;
        if (i3 == 0) {
            uj50.b(objB);
            s4u<String, Bitmap> s4uVar = r9n.a;
            Context context = getContext();
            c660Var.a = view;
            c660Var.d = 1;
            objB = r9n.b(context, str, c660Var);
            if (objB == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            view = c660Var.a;
            uj50.b(objB);
        }
        view.setBackground((Drawable) objB);
        return Unit.a;
    }

    public final void b1() {
        try {
            Map<String, ArrayList<String>> map = vlr.a;
            ArrayList<String> arrayList = vlr.a.get("rush");
            if (arrayList == null || !arrayList.contains(SportyGamesManager.getInstance().getLanguageCode())) {
                return;
            }
            String languageCode = SportyGamesManager.getInstance().getLanguageCode();
            languageCode.getClass();
            this.t0 = languageCode;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void c1(double d2, Double d3) {
        Double d4;
        HashMap<Double, Double> map = this.b0;
        double dDoubleValue = d3.doubleValue();
        double d5 = this.i;
        String strConcat = "0.01%";
        if (d2 >= d5) {
            if (d2 == d5) {
                strConcat = "99.5%";
            } else if (d2 >= 1000.0d && d2 < 2000.0d) {
                strConcat = "0.09%";
            } else if (d2 >= 2000.0d && d2 < 3000.0d) {
                strConcat = "0.04%";
            } else if (d2 >= 3000.0d && d2 < 5000.0d) {
                strConcat = "0.02%";
            } else if (d2 < 5000.0d) {
                double dDoubleValue2 = ((dDoubleValue - ((map == null || (d4 = map.get(Double.valueOf(Double.parseDouble(krh0.l(d2 - 0.01d))))) == null) ? 1.0d : d4.doubleValue())) / dDoubleValue) * 100.0d;
                if (Double.isNaN(dDoubleValue2) || dDoubleValue2 >= 0.01d) {
                    strConcat = krh0.l(dDoubleValue2).concat("%");
                }
            }
        }
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.J0.setVisibility(4);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.I0.setText(strConcat);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.I0.setVisibility(0);
        }
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    public final void d1(String str, String str2, String str3) {
        String nickName;
        String avatarUrl;
        UserValidateResponse userValidateResponse = this.a0;
        String str4 = "";
        if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
            nickName = "";
        }
        UserValidateResponse userValidateResponse2 = this.a0;
        if (userValidateResponse2 != null && (avatarUrl = userValidateResponse2.getAvatarUrl()) != null) {
            str4 = avatarUrl;
        }
        L0(nickName, str4);
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.V.setUserDetails(str, str2);
        }
        SportyGamesManager.getInstance().setUserId(str3);
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.o0.P();
        }
        c760 c760VarF0 = F0();
        ej5.c(o8i0.d(c760VarF0), null, null, new b760(c760VarF0, null), 3);
    }

    public final void e1(DetailResponseEntity detailResponseEntity) {
        CharSequence text;
        String string;
        try {
            Double d2 = this.c;
            double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
            eo80 eo80Var = this.l0;
            double d3 = (eo80Var == null || (text = eo80Var.r0.getText()) == null || (string = text.toString()) == null) ? 0.0d : Double.parseDouble(string);
            boolean z2 = true;
            boolean z3 = dDoubleValue <= (detailResponseEntity != null ? detailResponseEntity.getMaxAmount() : 0.0d);
            if ((dDoubleValue - d3) / dDoubleValue >= 0.2d) {
                z2 = false;
            }
            if ((d3 > dDoubleValue || (z3 && z2)) && M0() && !this.y0) {
                eo80 eo80Var2 = this.l0;
                if (eo80Var2 != null) {
                    eo80Var2.b.setVisibility(0);
                    return;
                }
                return;
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.b.setVisibility(8);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
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
        this.m0 = true;
    }

    public final void f1() {
        Context context;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || (context = getContext()) == null) {
            return;
        }
        final fo2 fo2Var = new fo2(activity, "Rush");
        fo2Var.H = new Function2() { // from class: p260
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                cu2 cu2VarC0 = this.a.C0();
                PagingFetchType pagingFetchType = PagingFetchType.VIEW_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(cu2VarC0), null, null, new rt2(cu2VarC0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                return Unit.a;
            }
        };
        fo2Var.I = new Function2() { // from class: q260
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                cu2 cu2VarC0 = this.a.C0();
                PagingFetchType pagingFetchType = PagingFetchType.ARCHIVE_MORE;
                pagingFetchType.getClass();
                ej5.c(o8i0.d(cu2VarC0), null, null, new rt2(cu2VarC0, pagingFetchType, iIntValue, iIntValue2, null), 3);
                return Unit.a;
            }
        };
        fo2Var.d();
        gp80 gp80Var = new gp80();
        gp80Var.e = context;
        fo2Var.e().setBackground(fo2Var.getContext().getDrawable(R.drawable.rush_bet_history_bg));
        RecyclerView recyclerViewF = fo2Var.f();
        fo2Var.getContext();
        recyclerViewF.setLayoutManager(new LinearLayoutManager());
        en2 en2Var = new en2(fo2Var, 0);
        Function0<Unit> function0 = new Function0() { // from class: fn2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                fo2 fo2Var2 = fo2Var;
                if (fo2Var2.M == fo2.b.b) {
                    Function2<? super Integer, ? super Integer, Unit> function2 = fo2Var2.I;
                    if (function2 == null) {
                        Intrinsics.n("betHistoryArchiveFetchManager");
                        throw null;
                    }
                    function2.invoke(Integer.valueOf(fo2Var2.K + fo2Var2.J), Integer.valueOf(fo2Var2.J));
                }
                return Unit.a;
            }
        };
        gp80Var.b = en2Var;
        gp80Var.c = function0;
        fo2Var.f().setAdapter(gp80Var);
        fo2Var.b();
        this.W = fo2Var;
        fo2Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: r260
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l560 l560Var = this.a;
                GameDetails gameDetails = l560Var.S;
                String name = gameDetails != null ? gameDetails.getName() : null;
                if (name == null) {
                    name = "";
                }
                wz.a("PopupAction", name, "Logged in", "Bet History", "Close");
                fo2 fo2Var2 = l560Var.W;
                if (fo2Var2 != null) {
                    fo2Var2.c();
                }
            }
        });
    }

    public final void g1() {
        boolean z2;
        try {
            z2 = this.C0 != 0 && System.currentTimeMillis() - this.C0 < 30000;
            this.C0 = System.currentTimeMillis();
        } catch (Exception e2) {
            e2.printStackTrace();
            z2 = false;
        }
        if (z2) {
            return;
        }
        try {
            eo80 eo80Var = this.l0;
            if (eo80Var != null) {
                eo80Var.U.setCampaignCompletedText();
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.U.setVisibility(0);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.U.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in_fade_out_toast));
            }
            ej5.c(ebs.a(getLifecycle()), null, null, new e660(this, null), 3);
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    public final void h1() {
        String string = getString(R.string.sg_rush_rush_place_bet);
        string.getClass();
        T0(string);
        String string2 = getString(R.string.sg_rush_car_move_pickup);
        string2.getClass();
        T0(string2);
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.j0.setVisibility(0);
        }
        eo80 eo80Var2 = this.l0;
        ConstraintLayout constraintLayout = eo80Var2 != null ? eo80Var2.j0 : null;
        if (constraintLayout != null) {
            constraintLayout.setPivotY(0.0f);
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(constraintLayout, "scaleY", 0.5f, 1.5f);
        this.D0 = objectAnimatorOfFloat;
        if (objectAnimatorOfFloat != null) {
            objectAnimatorOfFloat.setRepeatCount(-1);
        }
        ObjectAnimator objectAnimator = this.D0;
        if (objectAnimator != null) {
            objectAnimator.setRepeatMode(2);
        }
        ObjectAnimator objectAnimator2 = this.D0;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(90L);
        }
        ObjectAnimator objectAnimator3 = this.D0;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
    }

    public final void i1(Context context, ResultWrapper.GenericError genericError) {
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            l260 l260Var = l260.e;
            E0();
            jcg.d(l260Var, activity, "Rush", genericError, new qu10(this, 1), null, null, 0, context.getColor(R.color.try_again_color), null, null, null, new s260(this, 0), null, 97760);
        }
    }

    public final void j0(int i2) {
        if (getContext() != null) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.5f, 1.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            scaleAnimation.setDuration(500L);
            scaleAnimation.setAnimationListener(new d(i2, scaleAnimation));
            eo80 eo80Var = this.l0;
            if (eo80Var != null) {
                eo80Var.p0.startAnimation(scaleAnimation);
            }
        }
    }

    public final void j1() {
        ro80 binding;
        ro80 binding2;
        ro80 binding3;
        eo80 eo80Var = this.l0;
        boolean z2 = (eo80Var == null || (binding3 = eo80Var.W.getBinding()) == null || binding3.f.getVisibility() != 0) ? false : true;
        boolean z3 = this.D;
        eo80 eo80Var2 = this.l0;
        if (z3) {
            if (eo80Var2 != null && (binding2 = eo80Var2.W.getBinding()) != null) {
                binding2.f.setVisibility(0);
            }
        } else if (eo80Var2 != null && (binding = eo80Var2.W.getBinding()) != null) {
            binding.f.setVisibility(8);
        }
        if (z2 != this.D) {
            eo80 eo80Var3 = this.l0;
            FrameLayout frameLayout = eo80Var3 != null ? eo80Var3.k0 : null;
            FragmentManager childFragmentManager = getChildFragmentManager();
            childFragmentManager.getClass();
            if (frameLayout == null || frameLayout.getVisibility() != 0 || childFragmentManager.G(R.id.onboarding_images) == null) {
                return;
            }
            if (!yju.a("br")) {
                O0(0.0f, 0.0f);
                return;
            }
            nle nleVar = this.u0;
            if (nleVar == null || nleVar.isShowing()) {
                return;
            }
            O0(0.0f, 0.0f);
        }
    }

    public final void k1(boolean z2, Function0<Unit> function0) {
        Context context = getContext();
        if (context != null) {
            GameDetails gameDetails = this.S;
            nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, Integer.valueOf(context.getColor(R.color.htp_rush_bg)), null, function0, 8);
            this.u0 = nleVar;
            nleVar.show();
            nle nleVar2 = this.u0;
            if (nleVar2 != null) {
                nleVar2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: n260
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        GameDetails gameDetails2 = this.a.S;
                        String name = gameDetails2 != null ? gameDetails2.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        wz.a("PopupAction", name, "Logged in", "How to play", "Close");
                    }
                });
            }
            if (z2) {
                GameDetails gameDetails2 = this.S;
                wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
            }
        }
    }

    public final void l1() {
        androidx.constraintlayout.widget.b bVarK;
        androidx.constraintlayout.widget.b bVarK2;
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.l0.setVisibility(0);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.m0.setEnabled(false);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.e.setEnabled(false);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.I.setEnabled(false);
        }
        eo80 eo80Var5 = this.l0;
        if (eo80Var5 != null) {
            eo80Var5.D0.setEnabled(false);
        }
        eo80 eo80Var6 = this.l0;
        if (eo80Var6 != null) {
            eo80Var6.J.setEnabled(false);
        }
        eo80 eo80Var7 = this.l0;
        if (eo80Var7 != null) {
            eo80Var7.E0.setEnabled(false);
        }
        eo80 eo80Var8 = this.l0;
        if (eo80Var8 != null && (bVarK2 = eo80Var8.n0.K(R.id.start)) != null) {
            bVarK2.w(R.id.place_bet_btn, 0.5f);
            eo80 eo80Var9 = this.l0;
            bVarK2.b(eo80Var9 != null ? eo80Var9.n0 : null);
        }
        eo80 eo80Var10 = this.l0;
        if (eo80Var10 == null || (bVarK = eo80Var10.n0.K(R.id.start)) == null) {
            return;
        }
        bVarK.w(R.id.auto_bet_btn, 0.5f);
        eo80 eo80Var11 = this.l0;
        bVarK.b(eo80Var11 != null ? eo80Var11.n0 : null);
    }

    public final void m0(WalletInfoResponse walletInfoResponse) {
        Double dValueOf;
        ro80 binding;
        ro80 binding2;
        ro80 binding3;
        Double balance;
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            SgCommonHeaderContainer sgCommonHeaderContainer = eo80Var.W;
            String strValueOf = String.valueOf((walletInfoResponse == null || (balance = walletInfoResponse.getBalance()) == null) ? 0.0d : balance.doubleValue());
            op5 op5Var = op5.a;
            String currency = walletInfoResponse != null ? walletInfoResponse.getCurrency() : null;
            if (currency == null) {
                currency = "";
            }
            op5Var.getClass();
            sgCommonHeaderContainer.setAmount(strValueOf, op5.i(currency));
        }
        if (walletInfoResponse == null || (dValueOf = walletInfoResponse.getBalance()) == null) {
            dValueOf = Double.valueOf(0.0d);
        }
        this.c = dValueOf;
        if (M0()) {
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null && (binding3 = eo80Var2.W.getBinding()) != null) {
                binding3.c.setVisibility(0);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null && (binding2 = eo80Var3.W.getBinding()) != null) {
                binding2.b.setVisibility(0);
            }
            eo80 eo80Var4 = this.l0;
            if (eo80Var4 != null && (binding = eo80Var4.W.getBinding()) != null) {
                binding.v.setVisibility(0);
            }
            new SportyGamesManager().fetchFirstDepositState(ebs.a(getLifecycle()), new e());
        }
    }

    public final void m1() {
        ro80 binding;
        eo80 eo80Var;
        ro80 binding2;
        Double d2 = this.c;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        double d3 = this.e * 2.0d;
        eo80 eo80Var2 = this.l0;
        if (dDoubleValue < d3) {
            if (eo80Var2 != null) {
                eo80Var2.V.F(R.drawable.hamberger_add_more_red);
            }
            if (!M0() || (eo80Var = this.l0) == null || (binding2 = eo80Var.W.getBinding()) == null) {
                return;
            }
            binding2.i.setVisibility(0);
            return;
        }
        if (eo80Var2 != null && (binding = eo80Var2.W.getBinding()) != null) {
            binding.i.setVisibility(8);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.V.F(R.drawable.hamberger_add_more_bg);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object n0(TextView textView, double d2, String str, x1b x1bVar) {
        s560 s560Var;
        String str2;
        TranslateAnimation translateAnimation;
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        TextView textView2 = textView;
        if (x1bVar instanceof s560) {
            s560Var = (s560) x1bVar;
            int i2 = s560Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s560Var.d = i2 - Integer.MIN_VALUE;
            } else {
                s560Var = new s560(this, x1bVar);
            }
        } else {
            s560Var = new s560(this, x1bVar);
        }
        Object obj = s560Var.b;
        y5b y5bVar = y5b.a;
        int i3 = s560Var.d;
        if (i3 == 0) {
            uj50.b(obj);
            if (d2 > 0.0d) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setAlpha(1.0f);
                }
                if (Intrinsics.g(str, "up")) {
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, -2.5f);
                    str2 = "+ ";
                } else {
                    str2 = "- ";
                    translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.8f);
                }
                if (textView2 != null) {
                    TreeMap treeMap = pw.a;
                    textView2.setText(str2.concat(pw.g(new Double(d2))));
                }
                AnimationSet animationSet = new AnimationSet(true);
                translateAnimation.setDuration(1800L);
                animationSet.addAnimation(translateAnimation);
                if (textView2 != null) {
                    textView2.startAnimation(translateAnimation);
                }
                s560Var.a = textView2;
                s560Var.d = 1;
                if (hkd.b(900L, s560Var) == y5bVar) {
                    return y5bVar;
                }
            }
            return Unit.a;
        }
        if (i3 != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        textView2 = s560Var.a;
        uj50.b(obj);
        if (textView2 != null && (viewPropertyAnimatorAnimate = textView2.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(0.0f)) != null) {
            viewPropertyAnimatorAlpha.setDuration(1500L);
        }
        return Unit.a;
    }

    public final void n1() {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorScaleX;
        ViewPropertyAnimator viewPropertyAnimatorScaleY;
        ViewPropertyAnimator duration;
        final Context context = getContext();
        if (context != null) {
            eo80 eo80Var = this.l0;
            if (eo80Var != null) {
                eo80Var.L.setScaleX(0.0f);
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.L.setScaleY(0.0f);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 == null || (viewPropertyAnimatorAnimate = eo80Var3.L.animate()) == null || (viewPropertyAnimatorScaleX = viewPropertyAnimatorAnimate.scaleX(0.87f)) == null || (viewPropertyAnimatorScaleY = viewPropertyAnimatorScaleX.scaleY(0.87f)) == null || (duration = viewPropertyAnimatorScaleY.setDuration(300L)) == null) {
                return;
            }
            duration.withEndAction(new Runnable() { // from class: z260
                @Override // java.lang.Runnable
                public final void run() {
                    ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                    ViewPropertyAnimator viewPropertyAnimatorScaleX2;
                    ViewPropertyAnimator viewPropertyAnimatorScaleY2;
                    ViewPropertyAnimator duration2;
                    final l560 l560Var = this.a;
                    eo80 eo80Var4 = l560Var.l0;
                    if (eo80Var4 == null || (viewPropertyAnimatorAnimate2 = eo80Var4.L.animate()) == null || (viewPropertyAnimatorScaleX2 = viewPropertyAnimatorAnimate2.scaleX(0.77f)) == null || (viewPropertyAnimatorScaleY2 = viewPropertyAnimatorScaleX2.scaleY(0.77f)) == null || (duration2 = viewPropertyAnimatorScaleY2.setDuration(300L)) == null) {
                        return;
                    }
                    final Context context2 = context;
                    duration2.withEndAction(new Runnable() { // from class: r460
                        @Override // java.lang.Runnable
                        public final void run() {
                            eo80 eo80Var5 = l560Var.l0;
                            if (eo80Var5 != null) {
                                eo80Var5.L.startAnimation(AnimationUtils.loadAnimation(context2, R.anim.rush_car_shake));
                            }
                        }
                    });
                }
            });
        }
    }

    public final void o0() {
        androidx.constraintlayout.widget.b bVarK;
        androidx.constraintlayout.widget.b bVarK2;
        ro80 binding;
        ro80 binding2;
        eo80 eo80Var = this.l0;
        ConstraintLayout constraintLayout = eo80Var != null ? eo80Var.d0 : null;
        if (constraintLayout != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt != null) {
                    childAt.setEnabled(false);
                }
            }
            constraintLayout.setEnabled(false);
        }
        eo80 eo80Var2 = this.l0;
        ConstraintLayout constraintLayout2 = eo80Var2 != null ? eo80Var2.Z : null;
        if (constraintLayout2 != null) {
            int childCount2 = constraintLayout2.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = constraintLayout2.getChildAt(i3);
                if (childAt2 != null) {
                    childAt2.setEnabled(false);
                }
            }
            constraintLayout2.setEnabled(false);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.g0.setVisibility(0);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.C0.setVisibility(8);
        }
        eo80 eo80Var5 = this.l0;
        if (eo80Var5 != null) {
            eo80Var5.f0.setVisibility(0);
        }
        eo80 eo80Var6 = this.l0;
        if (eo80Var6 != null) {
            eo80Var6.r0.setVisibility(8);
        }
        eo80 eo80Var7 = this.l0;
        if (eo80Var7 != null) {
            eo80Var7.m0.setEnabled(false);
        }
        eo80 eo80Var8 = this.l0;
        if (eo80Var8 != null) {
            eo80Var8.e.setEnabled(false);
        }
        eo80 eo80Var9 = this.l0;
        if (eo80Var9 != null && (binding2 = eo80Var9.W.getBinding()) != null) {
            binding2.f.setVisibility(8);
        }
        eo80 eo80Var10 = this.l0;
        if (eo80Var10 != null && (binding = eo80Var10.W.getBinding()) != null) {
            binding.z.setVisibility(8);
        }
        eo80 eo80Var11 = this.l0;
        if (eo80Var11 != null && (bVarK2 = eo80Var11.n0.K(R.id.start)) != null) {
            bVarK2.w(R.id.place_bet_btn, 0.5f);
            eo80 eo80Var12 = this.l0;
            bVarK2.b(eo80Var12 != null ? eo80Var12.n0 : null);
        }
        eo80 eo80Var13 = this.l0;
        if (eo80Var13 == null || (bVarK = eo80Var13.n0.K(R.id.start)) == null) {
            return;
        }
        bVarK.w(R.id.auto_bet_btn, 0.5f);
        eo80 eo80Var14 = this.l0;
        bVarK.b(eo80Var14 != null ? eo80Var14.n0 : null);
    }

    public final void o1() {
        if (this.F) {
            eo80 eo80Var = this.l0;
            if (eo80Var != null) {
                eo80Var.G0.setVisibility(0);
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.F0.setVisibility(0);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.p0.setVisibility(0);
            }
            eo80 eo80Var4 = this.l0;
            if (eo80Var4 != null) {
                eo80Var4.i0.setVisibility(4);
            }
            eo80 eo80Var5 = this.l0;
            if (eo80Var5 != null) {
                eo80Var5.h0.setVisibility(4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (context instanceof mke) {
            this.v0 = (mke) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.sg_fragment_rush, viewGroup, false);
        int i2 = R.id.add_money;
        TextView textView = (TextView) h5e.a(R.id.add_money, viewInflate);
        if (textView != null) {
            i2 = R.id.amt_group_one;
            Group group = (Group) h5e.a(R.id.amt_group_one, viewInflate);
            if (group != null) {
                i2 = R.id.amt_group_two;
                Group group2 = (Group) h5e.a(R.id.amt_group_two, viewInflate);
                if (group2 != null) {
                    i2 = R.id.auto_bet_btn;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.auto_bet_btn, viewInflate);
                    if (constraintLayout != null) {
                        i2 = R.id.auto_bet_red_btn;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.auto_bet_red_btn, viewInflate);
                        if (constraintLayout2 != null) {
                            i2 = R.id.autobet_compose_view;
                            ComposeView composeView = (ComposeView) h5e.a(R.id.autobet_compose_view, viewInflate);
                            if (composeView != null) {
                                i2 = R.id.backgroundImage1;
                                ImageView imageView = (ImageView) h5e.a(R.id.backgroundImage1, viewInflate);
                                if (imageView != null) {
                                    i2 = R.id.backgroundImage2;
                                    ImageView imageView2 = (ImageView) h5e.a(R.id.backgroundImage2, viewInflate);
                                    if (imageView2 != null) {
                                        i2 = R.id.backgroundImage3;
                                        ImageView imageView3 = (ImageView) h5e.a(R.id.backgroundImage3, viewInflate);
                                        if (imageView3 != null) {
                                            i2 = R.id.backgroundImage4;
                                            ImageView imageView4 = (ImageView) h5e.a(R.id.backgroundImage4, viewInflate);
                                            if (imageView4 != null) {
                                                i2 = R.id.bg;
                                                ImageView imageView5 = (ImageView) h5e.a(R.id.bg, viewInflate);
                                                if (imageView5 != null) {
                                                    i2 = R.id.bgCrossAmt;
                                                    Button button = (Button) h5e.a(R.id.bgCrossAmt, viewInflate);
                                                    if (button != null) {
                                                        i2 = R.id.bgMaxAmt;
                                                        Button button2 = (Button) h5e.a(R.id.bgMaxAmt, viewInflate);
                                                        if (button2 != null) {
                                                            i2 = R.id.bgMaxMulti;
                                                            Button button3 = (Button) h5e.a(R.id.bgMaxMulti, viewInflate);
                                                            if (button3 != null) {
                                                                i2 = R.id.bgMinAmt;
                                                                Button button4 = (Button) h5e.a(R.id.bgMinAmt, viewInflate);
                                                                if (button4 != null) {
                                                                    i2 = R.id.bgMinMulti;
                                                                    Button button5 = (Button) h5e.a(R.id.bgMinMulti, viewInflate);
                                                                    if (button5 != null) {
                                                                        i2 = R.id.bgMinusAmt;
                                                                        Button button6 = (Button) h5e.a(R.id.bgMinusAmt, viewInflate);
                                                                        if (button6 != null) {
                                                                            i2 = R.id.bgMinusMulti;
                                                                            Button button7 = (Button) h5e.a(R.id.bgMinusMulti, viewInflate);
                                                                            if (button7 != null) {
                                                                                i2 = R.id.bgPlusAmt;
                                                                                Button button8 = (Button) h5e.a(R.id.bgPlusAmt, viewInflate);
                                                                                if (button8 != null) {
                                                                                    i2 = R.id.bgPlusMulti;
                                                                                    Button button9 = (Button) h5e.a(R.id.bgPlusMulti, viewInflate);
                                                                                    if (button9 != null) {
                                                                                        i2 = R.id.car;
                                                                                        ImageView imageView6 = (ImageView) h5e.a(R.id.car, viewInflate);
                                                                                        if (imageView6 != null) {
                                                                                            i2 = R.id.car_frame;
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.car_frame, viewInflate);
                                                                                            if (constraintLayout3 != null) {
                                                                                                i2 = R.id.car_motion_layout;
                                                                                                MotionLayout motionLayout = (MotionLayout) h5e.a(R.id.car_motion_layout, viewInflate);
                                                                                                if (motionLayout != null) {
                                                                                                    i2 = R.id.coeff_list;
                                                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.coeff_list, viewInflate);
                                                                                                    if (recyclerView != null) {
                                                                                                        i2 = R.id.cordLayout;
                                                                                                        if (((CoordinatorLayout) h5e.a(R.id.cordLayout, viewInflate)) != null) {
                                                                                                            i2 = R.id.drawer_layout;
                                                                                                            DrawerLayout drawerLayout = (DrawerLayout) h5e.a(R.id.drawer_layout, viewInflate);
                                                                                                            if (drawerLayout != null) {
                                                                                                                i2 = R.id.error_toast;
                                                                                                                SgErrorToastContainer sgErrorToastContainer = (SgErrorToastContainer) h5e.a(R.id.error_toast, viewInflate);
                                                                                                                if (sgErrorToastContainer != null) {
                                                                                                                    i2 = R.id.fade;
                                                                                                                    if (((FadingEdgeLayout) h5e.a(R.id.fade, viewInflate)) != null) {
                                                                                                                        i2 = R.id.fire_1;
                                                                                                                        ImageView imageView7 = (ImageView) h5e.a(R.id.fire_1, viewInflate);
                                                                                                                        if (imageView7 != null) {
                                                                                                                            i2 = R.id.fire_2;
                                                                                                                            ImageView imageView8 = (ImageView) h5e.a(R.id.fire_2, viewInflate);
                                                                                                                            if (imageView8 != null) {
                                                                                                                                i2 = R.id.flContent;
                                                                                                                                if (((FrameLayout) h5e.a(R.id.flContent, viewInflate)) != null) {
                                                                                                                                    i2 = R.id.games_campaign_progress;
                                                                                                                                    ComposeView composeView2 = (ComposeView) h5e.a(R.id.games_campaign_progress, viewInflate);
                                                                                                                                    if (composeView2 != null) {
                                                                                                                                        i2 = R.id.gift_box;
                                                                                                                                        ImageView imageView9 = (ImageView) h5e.a(R.id.gift_box, viewInflate);
                                                                                                                                        if (imageView9 != null) {
                                                                                                                                            i2 = R.id.gift_toast_bar;
                                                                                                                                            GiftToast giftToast = (GiftToast) h5e.a(R.id.gift_toast_bar, viewInflate);
                                                                                                                                            if (giftToast != null) {
                                                                                                                                                i2 = R.id.hamburger_menu;
                                                                                                                                                SGHamburgerMenu sGHamburgerMenu = (SGHamburgerMenu) h5e.a(R.id.hamburger_menu, viewInflate);
                                                                                                                                                if (sGHamburgerMenu != null) {
                                                                                                                                                    i2 = R.id.header;
                                                                                                                                                    SgCommonHeaderContainer sgCommonHeaderContainer = (SgCommonHeaderContainer) h5e.a(R.id.header, viewInflate);
                                                                                                                                                    if (sgCommonHeaderContainer != null) {
                                                                                                                                                        i2 = R.id.ic_fbg;
                                                                                                                                                        FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.ic_fbg, viewInflate);
                                                                                                                                                        if (frameLayout != null) {
                                                                                                                                                            i2 = R.id.keypad;
                                                                                                                                                            SHKeypadContainer sHKeypadContainer = (SHKeypadContainer) h5e.a(R.id.keypad, viewInflate);
                                                                                                                                                            if (sHKeypadContainer != null) {
                                                                                                                                                                i2 = R.id.layoutAmount;
                                                                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.layoutAmount, viewInflate);
                                                                                                                                                                if (constraintLayout4 != null) {
                                                                                                                                                                    i2 = R.id.layout_black;
                                                                                                                                                                    View viewA = h5e.a(R.id.layout_black, viewInflate);
                                                                                                                                                                    if (viewA != null) {
                                                                                                                                                                        i2 = R.id.layout_empty_2;
                                                                                                                                                                        View viewA2 = h5e.a(R.id.layout_empty_2, viewInflate);
                                                                                                                                                                        if (viewA2 != null) {
                                                                                                                                                                            i2 = R.id.layout_empty_fire;
                                                                                                                                                                            View viewA3 = h5e.a(R.id.layout_empty_fire, viewInflate);
                                                                                                                                                                            if (viewA3 != null) {
                                                                                                                                                                                i2 = R.id.layout_game;
                                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.layout_game, viewInflate)) != null) {
                                                                                                                                                                                    i2 = R.id.layoutMultiplier;
                                                                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.layoutMultiplier, viewInflate);
                                                                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                                                                        i2 = R.id.layout_payout_error;
                                                                                                                                                                                        if (((ConstraintLayout) h5e.a(R.id.layout_payout_error, viewInflate)) != null) {
                                                                                                                                                                                            i2 = R.id.layout_place_bet;
                                                                                                                                                                                            ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.layout_place_bet, viewInflate);
                                                                                                                                                                                            if (constraintLayout6 != null) {
                                                                                                                                                                                                i2 = R.id.layout_toasts;
                                                                                                                                                                                                if (((ConstraintLayout) h5e.a(R.id.layout_toasts, viewInflate)) != null) {
                                                                                                                                                                                                    i2 = R.id.loader_amt;
                                                                                                                                                                                                    SgRushWaveLoader sgRushWaveLoader = (SgRushWaveLoader) h5e.a(R.id.loader_amt, viewInflate);
                                                                                                                                                                                                    if (sgRushWaveLoader != null) {
                                                                                                                                                                                                        i2 = R.id.loader_coeff;
                                                                                                                                                                                                        SgRushWaveLoader sgRushWaveLoader2 = (SgRushWaveLoader) h5e.a(R.id.loader_coeff, viewInflate);
                                                                                                                                                                                                        if (sgRushWaveLoader2 != null) {
                                                                                                                                                                                                            i2 = R.id.loader_place_bet;
                                                                                                                                                                                                            SgRushWaveLoader sgRushWaveLoader3 = (SgRushWaveLoader) h5e.a(R.id.loader_place_bet, viewInflate);
                                                                                                                                                                                                            if (sgRushWaveLoader3 != null) {
                                                                                                                                                                                                                i2 = R.id.loader_red_btn;
                                                                                                                                                                                                                SgRushWaveLoader sgRushWaveLoader4 = (SgRushWaveLoader) h5e.a(R.id.loader_red_btn, viewInflate);
                                                                                                                                                                                                                if (sgRushWaveLoader4 != null) {
                                                                                                                                                                                                                    i2 = R.id.motion_fire_layout;
                                                                                                                                                                                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.motion_fire_layout, viewInflate);
                                                                                                                                                                                                                    if (constraintLayout7 != null) {
                                                                                                                                                                                                                        i2 = R.id.navigationView;
                                                                                                                                                                                                                        if (((NavigationView) h5e.a(R.id.navigationView, viewInflate)) != null) {
                                                                                                                                                                                                                            i2 = R.id.onboarding_images;
                                                                                                                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) h5e.a(R.id.onboarding_images, viewInflate);
                                                                                                                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                                                                                                                i2 = R.id.payout_error;
                                                                                                                                                                                                                                TextView textView2 = (TextView) h5e.a(R.id.payout_error, viewInflate);
                                                                                                                                                                                                                                if (textView2 != null) {
                                                                                                                                                                                                                                    i2 = R.id.place_bet_btn;
                                                                                                                                                                                                                                    MaterialButton materialButton = (MaterialButton) h5e.a(R.id.place_bet_btn, viewInflate);
                                                                                                                                                                                                                                    if (materialButton != null) {
                                                                                                                                                                                                                                        i2 = R.id.place_bet_motion_layout;
                                                                                                                                                                                                                                        MotionLayout motionLayout2 = (MotionLayout) h5e.a(R.id.place_bet_motion_layout, viewInflate);
                                                                                                                                                                                                                                        if (motionLayout2 != null) {
                                                                                                                                                                                                                                            i2 = R.id.progress_meter_component;
                                                                                                                                                                                                                                            ProgressMeterComponent progressMeterComponent = (ProgressMeterComponent) h5e.a(R.id.progress_meter_component, viewInflate);
                                                                                                                                                                                                                                            if (progressMeterComponent != null) {
                                                                                                                                                                                                                                                i2 = R.id.rl1;
                                                                                                                                                                                                                                                if (((RelativeLayout) h5e.a(R.id.rl1, viewInflate)) != null) {
                                                                                                                                                                                                                                                    i2 = R.id.rl2;
                                                                                                                                                                                                                                                    if (((RelativeLayout) h5e.a(R.id.rl2, viewInflate)) != null) {
                                                                                                                                                                                                                                                        i2 = R.id.rounds_played_count;
                                                                                                                                                                                                                                                        TextView textView3 = (TextView) h5e.a(R.id.rounds_played_count, viewInflate);
                                                                                                                                                                                                                                                        if (textView3 != null) {
                                                                                                                                                                                                                                                            i2 = R.id.subParentBets;
                                                                                                                                                                                                                                                            if (((ConstraintLayout) h5e.a(R.id.subParentBets, viewInflate)) != null) {
                                                                                                                                                                                                                                                                i2 = R.id.tooltip;
                                                                                                                                                                                                                                                                DepositTooltipComponent depositTooltipComponent = (DepositTooltipComponent) h5e.a(R.id.tooltip, viewInflate);
                                                                                                                                                                                                                                                                if (depositTooltipComponent != null) {
                                                                                                                                                                                                                                                                    i2 = R.id.tvAmt;
                                                                                                                                                                                                                                                                    TextView textView4 = (TextView) h5e.a(R.id.tvAmt, viewInflate);
                                                                                                                                                                                                                                                                    if (textView4 != null) {
                                                                                                                                                                                                                                                                        i2 = R.id.tv_auto_btn;
                                                                                                                                                                                                                                                                        TextView textView5 = (TextView) h5e.a(R.id.tv_auto_btn, viewInflate);
                                                                                                                                                                                                                                                                        if (textView5 != null) {
                                                                                                                                                                                                                                                                            i2 = R.id.tvBetAmt;
                                                                                                                                                                                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.tvBetAmt, viewInflate);
                                                                                                                                                                                                                                                                            if (textView6 != null) {
                                                                                                                                                                                                                                                                                i2 = R.id.tvCrossAmt;
                                                                                                                                                                                                                                                                                ImageView imageView10 = (ImageView) h5e.a(R.id.tvCrossAmt, viewInflate);
                                                                                                                                                                                                                                                                                if (imageView10 != null) {
                                                                                                                                                                                                                                                                                    i2 = R.id.tv_house_coefficient;
                                                                                                                                                                                                                                                                                    TextView textView7 = (TextView) h5e.a(R.id.tv_house_coefficient, viewInflate);
                                                                                                                                                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                                                                                                                                                        i2 = R.id.tvMaxAmt;
                                                                                                                                                                                                                                                                                        TextView textView8 = (TextView) h5e.a(R.id.tvMaxAmt, viewInflate);
                                                                                                                                                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                                                                                                                                                            i2 = R.id.tvMaxMulti;
                                                                                                                                                                                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.tvMaxMulti, viewInflate);
                                                                                                                                                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                                                                                                                                                i2 = R.id.tvMinAmt;
                                                                                                                                                                                                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.tvMinAmt, viewInflate);
                                                                                                                                                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                                                                                                                                                    i2 = R.id.tvMinMulti;
                                                                                                                                                                                                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.tvMinMulti, viewInflate);
                                                                                                                                                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                                                                                                                                                        i2 = R.id.tvMinusAmt;
                                                                                                                                                                                                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.tvMinusAmt, viewInflate);
                                                                                                                                                                                                                                                                                                        if (textView12 != null) {
                                                                                                                                                                                                                                                                                                            i2 = R.id.tvMinusMulti;
                                                                                                                                                                                                                                                                                                            TextView textView13 = (TextView) h5e.a(R.id.tvMinusMulti, viewInflate);
                                                                                                                                                                                                                                                                                                            if (textView13 != null) {
                                                                                                                                                                                                                                                                                                                i2 = R.id.tvMulti;
                                                                                                                                                                                                                                                                                                                TextView textView14 = (TextView) h5e.a(R.id.tvMulti, viewInflate);
                                                                                                                                                                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                                                                                                                                                                    i2 = R.id.tvPlusAmt;
                                                                                                                                                                                                                                                                                                                    TextView textView15 = (TextView) h5e.a(R.id.tvPlusAmt, viewInflate);
                                                                                                                                                                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                                                                                                                                                                        i2 = R.id.tvPlusMulti;
                                                                                                                                                                                                                                                                                                                        TextView textView16 = (TextView) h5e.a(R.id.tvPlusMulti, viewInflate);
                                                                                                                                                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                                                                                                                                                            i2 = R.id.tv_rounds_played;
                                                                                                                                                                                                                                                                                                                            TextView textView17 = (TextView) h5e.a(R.id.tv_rounds_played, viewInflate);
                                                                                                                                                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                                                                                                                                                i2 = R.id.tv_stop_bet;
                                                                                                                                                                                                                                                                                                                                TextView textView18 = (TextView) h5e.a(R.id.tv_stop_bet, viewInflate);
                                                                                                                                                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                                                                                                                                                    i2 = R.id.tvTargetMulti;
                                                                                                                                                                                                                                                                                                                                    TextView textView19 = (TextView) h5e.a(R.id.tvTargetMulti, viewInflate);
                                                                                                                                                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                                                                                                                                                        i2 = R.id.tv_win_chance;
                                                                                                                                                                                                                                                                                                                                        TextView textView20 = (TextView) h5e.a(R.id.tv_win_chance, viewInflate);
                                                                                                                                                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                                                                                                                                                            i2 = R.id.tv_win_chance_loader;
                                                                                                                                                                                                                                                                                                                                            SgRushWaveLoader sgRushWaveLoader5 = (SgRushWaveLoader) h5e.a(R.id.tv_win_chance_loader, viewInflate);
                                                                                                                                                                                                                                                                                                                                            if (sgRushWaveLoader5 != null) {
                                                                                                                                                                                                                                                                                                                                                i2 = R.id.tv_win_chance_text;
                                                                                                                                                                                                                                                                                                                                                TextView textView21 = (TextView) h5e.a(R.id.tv_win_chance_text, viewInflate);
                                                                                                                                                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                                                                                                                                                    i2 = R.id.win_toast_bar;
                                                                                                                                                                                                                                                                                                                                                    SgCommonToastContainer sgCommonToastContainer = (SgCommonToastContainer) h5e.a(R.id.win_toast_bar, viewInflate);
                                                                                                                                                                                                                                                                                                                                                    if (sgCommonToastContainer != null) {
                                                                                                                                                                                                                                                                                                                                                        this.l0 = new eo80((ConstraintLayout) viewInflate, textView, group, group2, constraintLayout, constraintLayout2, composeView, imageView, imageView2, imageView3, imageView4, imageView5, button, button2, button3, button4, button5, button6, button7, button8, button9, imageView6, constraintLayout3, motionLayout, recyclerView, drawerLayout, sgErrorToastContainer, imageView7, imageView8, composeView2, imageView9, giftToast, sGHamburgerMenu, sgCommonHeaderContainer, frameLayout, sHKeypadContainer, constraintLayout4, viewA, viewA2, viewA3, constraintLayout5, constraintLayout6, sgRushWaveLoader, sgRushWaveLoader2, sgRushWaveLoader3, sgRushWaveLoader4, constraintLayout7, frameLayout2, textView2, materialButton, motionLayout2, progressMeterComponent, textView3, depositTooltipComponent, textView4, textView5, textView6, imageView10, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19, textView20, sgRushWaveLoader5, textView21, sgCommonToastContainer);
                                                                                                                                                                                                                                                                                                                                                        eo80 eo80Var = this.l0;
                                                                                                                                                                                                                                                                                                                                                        if (eo80Var != null) {
                                                                                                                                                                                                                                                                                                                                                            return eo80Var.a;
                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                        return null;
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
    public final void onDestroy() {
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.v.clearAnimation();
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.w.clearAnimation();
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.y.clearAnimation();
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.z.clearAnimation();
        }
        eo80 eo80Var5 = this.l0;
        if (eo80Var5 != null) {
            eo80Var5.L.clearAnimation();
        }
        eo80 eo80Var6 = this.l0;
        if (eo80Var6 != null) {
            eo80Var6.M.clearAnimation();
        }
        eo80 eo80Var7 = this.l0;
        if (eo80Var7 != null) {
            eo80Var7.v0.clearAnimation();
        }
        eo80 eo80Var8 = this.l0;
        if (eo80Var8 != null) {
            eo80Var8.j0.clearAnimation();
        }
        eo80 eo80Var9 = this.l0;
        if (eo80Var9 != null) {
            eo80Var9.g0.F();
        }
        eo80 eo80Var10 = this.l0;
        if (eo80Var10 != null) {
            eo80Var10.J0.F();
        }
        eo80 eo80Var11 = this.l0;
        if (eo80Var11 != null) {
            eo80Var11.f0.F();
        }
        eo80 eo80Var12 = this.l0;
        if (eo80Var12 != null) {
            eo80Var12.i0.F();
        }
        eo80 eo80Var13 = this.l0;
        if (eo80Var13 != null) {
            eo80Var13.h0.F();
        }
        l260.e.a = null;
        getViewModelStore().a();
        SportyGamesManager.getInstance().removeAccountUpdatedListener(this);
        eo80 eo80Var14 = this.l0;
        if (eo80Var14 != null) {
            eo80Var14.o0.N();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        try {
            D0().e.l(getViewLifecycleOwner());
            D0().d.l(getViewLifecycleOwner());
            D0().y1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        String name;
        String name2;
        q8i0 q8i0Var = this.k0;
        super.onResume();
        this.H = true;
        try {
            GameDetails gameDetails = this.S;
            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                name = "";
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ra6.c(name, viewLifecycleOwner, (db6) q8i0Var.getValue(), D0());
            GameDetails gameDetails2 = this.S;
            if (gameDetails2 == null || (name2 = gameDetails2.getName()) == null) {
                name2 = "";
            }
            androidx.fragment.app.e activity = getActivity();
            ibs viewLifecycleOwner2 = getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            eo80 eo80Var = this.l0;
            ra6.b(name2, activity, viewLifecycleOwner2, eo80Var != null ? eo80Var.S : null, this.h0, D0(), (db6) q8i0Var.getValue(), p58.a, null, new tld0(this.S), new Function1() { // from class: q360
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    l560 l560Var = this.a;
                    CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) obj;
                    try {
                        l560Var.i0 = campaignTopicResponse != null;
                        if (campaignTopicResponse != null && !Intrinsics.g(campaignTopicResponse.getMessageType(), "ACTIVITY_INIT") && campaignTopicResponse.getCampaignCompletedJustNow()) {
                            l560Var.g1();
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    return Unit.a;
                }
            }, new l9a(this, 2), null, 17920);
            D0().x1();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (!this.b) {
            GameDetails gameDetails3 = this.S;
            wz.a("GameForeground", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
        }
        if (this.n0) {
            SharedPreferences sharedPreferences = this.O;
            Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_music", true)) : null;
            if (boolValueOf == null || (boolValueOf.equals(Boolean.TRUE) && this.m0)) {
                ypa0 ypa0VarE0 = E0();
                String string = getString(R.string.sg_rush_rush_start_drum_roll);
                string.getClass();
                String string2 = getString(R.string.sg_rush_rush_bg_music);
                string2.getClass();
                ypa0VarE0.D1(string, string2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        GameDetails gameDetails = this.S;
        wz.a("GameBackground", gameDetails != null ? gameDetails.getName() : null, new String[0]);
        this.H = false;
        E0().G1();
        Context context = getContext();
        if (context != null && this.l0 != null) {
            ProgressMeterComponent.M(E0(), context);
        }
        super.onStop();
        if (this.F) {
            this.F = false;
            V0();
            eo80 eo80Var = this.l0;
            if (eo80Var != null) {
                eo80Var.n0.U();
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.i0.setVisibility(4);
            }
            eo80 eo80Var3 = this.l0;
            if (eo80Var3 != null) {
                eo80Var3.G0.setVisibility(0);
            }
            eo80 eo80Var4 = this.l0;
            if (eo80Var4 != null) {
                eo80Var4.F0.setVisibility(0);
            }
            eo80 eo80Var5 = this.l0;
            if (eo80Var5 != null) {
                eo80Var5.p0.setVisibility(0);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ro80 binding;
        ssw<LoadingState<List<File>>> sswVar;
        eo80 eo80Var;
        String name;
        ssw<Integer> liveData;
        Resources resources;
        String[] stringArray;
        ro80 binding2;
        ro80 binding3;
        ro80 binding4;
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
        this.f0 = (fq5) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
        SportyGamesManager.getInstance().setScreenName("sportygames/rush");
        androidx.fragment.app.e activity = getActivity();
        if (activity != null) {
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            qlf.d(activity);
            qlf.c(window, activity.getColor(R.color.sb_black_100));
        }
        b1();
        androidx.fragment.app.e activity2 = getActivity();
        ssw<Boolean> sswVar2 = this.E;
        int i2 = 0;
        if (activity2 != null) {
            Context context = getContext();
            if (context != null) {
                E0();
                this.N = new xbg(activity2, "Rush");
                try {
                    androidx.fragment.app.e activity3 = getActivity();
                    if (activity3 != null) {
                        String str = ((db6) this.k0.getValue()).c;
                        if (str == null) {
                            str = "Ongoing";
                        }
                        this.h0 = new z66(activity3, str);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                SharedPreferences sharedPreferencesA = un20.a(context);
                this.O = sharedPreferencesA;
                this.P = sharedPreferencesA != null ? sharedPreferencesA.edit() : null;
                op5.a.getClass();
                String str2 = this.p0;
                op5.c = str2;
                boolean zN0 = N0();
                eo80 eo80Var2 = this.l0;
                if (zN0) {
                    if (eo80Var2 != null && (binding4 = eo80Var2.W.getBinding()) != null) {
                        binding4.c.setVisibility(4);
                    }
                    eo80 eo80Var3 = this.l0;
                    if (eo80Var3 != null && (binding3 = eo80Var3.W.getBinding()) != null) {
                        binding3.B.setVisibility(4);
                    }
                    eo80 eo80Var4 = this.l0;
                    if (eo80Var4 != null) {
                        eo80Var4.q0.setVisibility(4);
                    }
                } else if (eo80Var2 != null && (binding2 = eo80Var2.W.getBinding()) != null) {
                    gr60.a(binding2.B, new i560(0));
                }
                SportyGamesManager.getInstance().addAccountUpdatedListener(this);
                sswVar2.j(Boolean.FALSE);
                eo80 eo80Var5 = this.l0;
                if (eo80Var5 != null) {
                    eo80Var5.g0.E();
                }
                eo80 eo80Var6 = this.l0;
                if (eo80Var6 != null) {
                    eo80Var6.J0.E();
                }
                eo80 eo80Var7 = this.l0;
                if (eo80Var7 != null) {
                    eo80Var7.f0.E();
                }
                eo80 eo80Var8 = this.l0;
                if (eo80Var8 != null) {
                    eo80Var8.i0.E();
                }
                eo80 eo80Var9 = this.l0;
                if (eo80Var9 != null) {
                    eo80Var9.h0.E();
                }
                eo80 eo80Var10 = this.l0;
                if (eo80Var10 != null) {
                    eo80Var10.o0.E(this.f0, this.q0, str2, this.t0);
                }
            }
            Context context2 = getContext();
            int length = ((context2 == null || (resources = context2.getResources()) == null || (stringArray = resources.getStringArray(R.array.rush_images_array)) == null) ? 0 : stringArray.length) + 7;
            eo80 eo80Var11 = this.l0;
            if (eo80Var11 != null) {
                eo80Var11.o0.setVisibility(0);
            }
            eo80 eo80Var12 = this.l0;
            if (eo80Var12 != null) {
                eo80Var12.o0.setProgressForApi(100 / length);
            }
            eo80 eo80Var13 = this.l0;
            if (eo80Var13 != null) {
                eo80Var13.o0.setCurrentProgress(100 - ((100 / length) * length));
            }
            eo80 eo80Var14 = this.l0;
            if (eo80Var14 != null && (liveData = eo80Var14.o0.getLiveData()) != null) {
                liveData.f(getViewLifecycleOwner(), new lfy() { // from class: x260
                    @Override // defpackage.lfy
                    public final void u1(Object obj) {
                        Integer num = (Integer) obj;
                        l560 l560Var = this.a;
                        if (num != null && num.intValue() == 70) {
                            pfd pfdVar = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new y560(l560Var, null), 3);
                        }
                        if (num != null && num.intValue() == 100) {
                            pfd pfdVar2 = fse.a;
                            ej5.c(w5b.a(gku.a), null, null, new z560(l560Var, null), 3);
                        }
                    }
                });
            }
        }
        int i3 = 1;
        this.b = true;
        GameDetails gameDetails = this.S;
        if (gameDetails != null && (name = gameDetails.getName()) != null) {
            c760 c760VarF0 = F0();
            ej5.c(o8i0.d(c760VarF0), null, null, new a760(c760VarF0, name, null), 3);
        }
        eo80 eo80Var15 = this.l0;
        if (eo80Var15 != null) {
            ComposeView composeView = eo80Var15.i;
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(-1827188612, new gge(this), true));
        }
        Context context3 = getContext();
        if (context3 != null && (eo80Var = this.l0) != null) {
            SgCommonHeaderContainer sgCommonHeaderContainer = eo80Var.W;
            String string = getString(R.string.sg_rush);
            string.getClass();
            sgCommonHeaderContainer.setTitleAndColor(string, context3.getColor(R.color.color_b3118c));
        }
        fq5 fq5Var = this.f0;
        if (fq5Var != null && (sswVar = fq5Var.c) != null) {
            sswVar.f(getViewLifecycleOwner(), new i660(new x360(this, 0)));
        }
        try {
            u91.c.f(getViewLifecycleOwner(), new i660(new Function1() { // from class: b460
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        l560 l560Var = this.a;
                        l560Var.F = false;
                        l560Var.V0();
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            sswVar2.f(getViewLifecycleOwner(), new i660(new c460(this, 0)));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            F0().i.f(getViewLifecycleOwner(), new i660(new d460(this, i2)));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        try {
            F0().B.f(getViewLifecycleOwner(), new i660(new Function1() { // from class: e460
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    RushPlaceBetResponse rushPlaceBetResponse;
                    Double giftAmount;
                    Double userCoefficient;
                    Double houseCoefficient;
                    b bVarK;
                    b bVarK2;
                    Context context4;
                    ResultWrapper.GenericError error;
                    Integer code;
                    Integer code2;
                    Integer code3;
                    LoadingState loadingState = (LoadingState) obj;
                    int i4 = l560.b.a[loadingState.getStatus().ordinal()];
                    int i5 = 2;
                    final l560 l560Var = this.a;
                    int i6 = 0;
                    char c2 = 1;
                    char c3 = 1;
                    if (i4 == 1) {
                        l560Var.E0().G1();
                        String string2 = l560Var.getString(R.string.sg_rush_car_pass_away);
                        string2.getClass();
                        l560Var.T0(string2);
                        eo80 eo80Var16 = l560Var.l0;
                        if (eo80Var16 != null) {
                            eo80Var16.M.T();
                        }
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        RushPlaceBetResponse rushPlaceBetResponse2 = hTTPResponse != null ? (RushPlaceBetResponse) hTTPResponse.getData() : null;
                        double dDoubleValue = (rushPlaceBetResponse2 == null || (houseCoefficient = rushPlaceBetResponse2.getHouseCoefficient()) == null) ? 0.0d : houseCoefficient.doubleValue();
                        double dDoubleValue2 = (rushPlaceBetResponse2 == null || (userCoefficient = rushPlaceBetResponse2.getUserCoefficient()) == null) ? 0.0d : userCoefficient.doubleValue();
                        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, (float) dDoubleValue);
                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: t260
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                String str3 = "0.00";
                                valueAnimator.getClass();
                                eo80 eo80Var17 = l560Var.l0;
                                if (eo80Var17 != null) {
                                    TextView textView = eo80Var17.v0;
                                    try {
                                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(valueAnimatorOfFloat.getAnimatedValue().toString()));
                                        str4.getClass();
                                        str3 = str4;
                                    } catch (Exception unused) {
                                    }
                                    textView.setText(str3.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                                }
                            }
                        });
                        valueAnimatorOfFloat.setDuration(1500L);
                        valueAnimatorOfFloat.start();
                        valueAnimatorOfFloat.addListener(new n560(l560Var, rushPlaceBetResponse2, dDoubleValue, dDoubleValue2));
                        HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                        ej5.c(ebs.a(l560Var.getLifecycle()), null, null, new p560(hTTPResponse2 != null ? (RushPlaceBetResponse) hTTPResponse2.getData() : null, l560Var, null), 3);
                        l560Var.G = false;
                        int i7 = yju.a("br") ? l560Var.x0 : 100;
                        if (l560Var.F) {
                            int i8 = l560Var.J + 1;
                            l560Var.J = i8;
                            if (i8 <= i7 - 1) {
                                String str3 = l560Var.F0().c;
                                double d2 = str3 != null ? Double.parseDouble(str3) : 0.0d;
                                Double d3 = l560Var.c;
                                if ((d3 != null ? d3.doubleValue() : 0.0d) < d2) {
                                    l560Var.F = false;
                                    l560Var.V0();
                                } else {
                                    l560Var.j0(l560Var.J);
                                    ssw<RushPlaceBetResponse> sswVar3 = u91.a;
                                    HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                                    sswVar3.j(hTTPResponse3 != null ? (RushPlaceBetResponse) hTTPResponse3.getData() : null);
                                    u91.b.j(String.valueOf(l560Var.J));
                                    l560Var.o1();
                                }
                            } else {
                                l560Var.F = false;
                                ej5.c(ebs.a(l560Var.getLifecycle()), null, null, new v560(l560Var, null), 3);
                                l560Var.j0(l560Var.J);
                                ssw<RushPlaceBetResponse> sswVar4 = u91.a;
                                HTTPResponse hTTPResponse4 = (HTTPResponse) loadingState.getData();
                                sswVar4.j(hTTPResponse4 != null ? (RushPlaceBetResponse) hTTPResponse4.getData() : null);
                                u91.b.j(String.valueOf(l560Var.J));
                            }
                            GameDetails gameDetails2 = l560Var.S;
                            wz.a("BetPlaced", gameDetails2 != null ? gameDetails2.getName() : null, "On", "Auto", String.valueOf(l560Var.J));
                        } else {
                            HTTPResponse hTTPResponse5 = (HTTPResponse) loadingState.getData();
                            if (((hTTPResponse5 == null || (rushPlaceBetResponse = (RushPlaceBetResponse) hTTPResponse5.getData()) == null || (giftAmount = rushPlaceBetResponse.getGiftAmount()) == null) ? 0.0d : giftAmount.doubleValue()) > 0.0d) {
                                l560Var.F0().x1();
                            }
                        }
                        c760 c760VarF1 = l560Var.F0();
                        c760VarF1.e = null;
                        c760VarF1.b = null;
                        l560Var.K = false;
                        CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
                        Pair pair = new Pair("isManualBet", Boolean.valueOf(!l560Var.F));
                        GameDetails gameDetails3 = l560Var.S;
                        Pair pair2 = new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, gameDetails3 != null ? gameDetails3.getName() : null);
                        SharedPreferences sharedPreferences = l560Var.O;
                        casinoLogger.logEventToCasino("BetPlaced", vj5.a(pair, pair2, new Pair("isOneTapBet", sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_one_tap", false)) : null), new Pair("Platform", "ANDROID")));
                    } else if (i4 == 2) {
                        eo80 eo80Var17 = l560Var.l0;
                        if (eo80Var17 != null) {
                            eo80Var17.X.setEnabled(false);
                        }
                        eo80 eo80Var18 = l560Var.l0;
                        if (eo80Var18 != null) {
                            eo80Var18.X.setAlpha(0.5f);
                        }
                        boolean z2 = l560Var.G;
                        eo80 eo80Var19 = l560Var.l0;
                        ConstraintLayout constraintLayout = eo80Var19 != null ? eo80Var19.d0 : null;
                        if (constraintLayout != null) {
                            int childCount = constraintLayout.getChildCount();
                            for (int i9 = 0; i9 < childCount; i9++) {
                                View childAt = constraintLayout.getChildAt(i9);
                                if (childAt != null) {
                                    childAt.setEnabled(false);
                                }
                            }
                            constraintLayout.setEnabled(false);
                        }
                        eo80 eo80Var20 = l560Var.l0;
                        ConstraintLayout constraintLayout2 = eo80Var20 != null ? eo80Var20.Z : null;
                        if (constraintLayout2 != null) {
                            int childCount2 = constraintLayout2.getChildCount();
                            for (int i10 = 0; i10 < childCount2; i10++) {
                                View childAt2 = constraintLayout2.getChildAt(i10);
                                if (childAt2 != null) {
                                    childAt2.setEnabled(false);
                                }
                            }
                            constraintLayout2.setEnabled(false);
                        }
                        eo80 eo80Var21 = l560Var.l0;
                        if (eo80Var21 != null) {
                            eo80Var21.K0.setEnabled(false);
                        }
                        eo80 eo80Var22 = l560Var.l0;
                        if (eo80Var22 != null) {
                            eo80Var22.m0.setEnabled(false);
                        }
                        eo80 eo80Var23 = l560Var.l0;
                        if (eo80Var23 != null) {
                            eo80Var23.e.setEnabled(false);
                        }
                        eo80 eo80Var24 = l560Var.l0;
                        if (eo80Var24 != null) {
                            eo80Var24.r0.setAlpha(0.5f);
                        }
                        eo80 eo80Var25 = l560Var.l0;
                        if (eo80Var25 != null) {
                            eo80Var25.C0.setAlpha(0.5f);
                        }
                        eo80 eo80Var26 = l560Var.l0;
                        if (eo80Var26 != null) {
                            eo80Var26.K0.setAlpha(0.5f);
                        }
                        eo80 eo80Var27 = l560Var.l0;
                        if (z2) {
                            if (eo80Var27 != null) {
                                eo80Var27.h0.setVisibility(0);
                            }
                        } else if (eo80Var27 != null) {
                            eo80Var27.h0.setVisibility(4);
                        }
                        eo80 eo80Var28 = l560Var.l0;
                        if (eo80Var28 != null && (bVarK2 = eo80Var28.n0.K(R.id.start)) != null) {
                            bVarK2.w(R.id.place_bet_btn, 0.5f);
                            eo80 eo80Var29 = l560Var.l0;
                            bVarK2.b(eo80Var29 != null ? eo80Var29.n0 : null);
                        }
                        eo80 eo80Var30 = l560Var.l0;
                        if (eo80Var30 != null && (bVarK = eo80Var30.n0.K(R.id.start)) != null) {
                            bVarK.w(R.id.auto_bet_btn, 0.5f);
                            eo80 eo80Var31 = l560Var.l0;
                            bVarK.b(eo80Var31 != null ? eo80Var31.n0 : null);
                        }
                        boolean z3 = l560Var.F;
                        eo80 eo80Var32 = l560Var.l0;
                        if (z3) {
                            if (eo80Var32 != null) {
                                eo80Var32.n0.T();
                            }
                        } else if (eo80Var32 != null) {
                            eo80Var32.m0.setText("");
                        }
                        eo80 eo80Var33 = l560Var.l0;
                        if (eo80Var33 != null && eo80Var33.d.getVisibility() == 0) {
                            eo80 eo80Var34 = l560Var.l0;
                            if (eo80Var34 != null) {
                                eo80Var34.T.setAlpha(0.5f);
                            }
                            eo80 eo80Var35 = l560Var.l0;
                            if (eo80Var35 != null) {
                                eo80Var35.B.setAlpha(0.5f);
                            }
                            eo80 eo80Var36 = l560Var.l0;
                            if (eo80Var36 != null) {
                                eo80Var36.u0.setAlpha(0.5f);
                            }
                            eo80 eo80Var37 = l560Var.l0;
                            if (eo80Var37 != null) {
                                eo80Var37.r0.setAlpha(0.5f);
                            }
                        }
                    } else {
                        if (i4 != 3) {
                            uhc.a();
                            return null;
                        }
                        if (l560Var.getContext() != null && l560Var.getActivity() != null && !l560Var.isRemoving()) {
                            l560Var.F0().x1();
                            c760 c760VarF2 = l560Var.F0();
                            c760VarF2.e = null;
                            c760VarF2.b = null;
                            l560Var.K = false;
                            l560Var.U0();
                            eo80 eo80Var38 = l560Var.l0;
                            if (eo80Var38 != null) {
                                eo80Var38.c.setVisibility(0);
                            }
                            eo80 eo80Var39 = l560Var.l0;
                            if (eo80Var39 != null) {
                                eo80Var39.d.setVisibility(8);
                            }
                            l560Var.w0();
                            eo80 eo80Var40 = l560Var.l0;
                            if (eo80Var40 != null) {
                                eo80Var40.T.setAlpha(1.0f);
                            }
                            eo80 eo80Var41 = l560Var.l0;
                            if (eo80Var41 != null) {
                                eo80Var41.B.setAlpha(1.0f);
                            }
                            eo80 eo80Var42 = l560Var.l0;
                            if (eo80Var42 != null) {
                                eo80Var42.u0.setAlpha(1.0f);
                            }
                            eo80 eo80Var43 = l560Var.l0;
                            if (eo80Var43 != null) {
                                eo80Var43.r0.setAlpha(1.0f);
                            }
                            l560Var.y0();
                            eo80 eo80Var44 = l560Var.l0;
                            if (eo80Var44 != null) {
                                eo80Var44.j0.setVisibility(4);
                            }
                            ObjectAnimator objectAnimator = l560Var.D0;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                            }
                            eo80 eo80Var45 = l560Var.l0;
                            if (eo80Var45 != null && eo80Var45.l0.getVisibility() == 0) {
                                l560Var.l1();
                            }
                            e activity4 = l560Var.getActivity();
                            if (activity4 != null && (context4 = l560Var.getContext()) != null) {
                                ResultWrapper.GenericError error2 = loadingState.getError();
                                if (error2 == null || (code3 = error2.getCode()) == null || code3.intValue() != 403) {
                                    ResultWrapper.GenericError error3 = loadingState.getError();
                                    if ((error3 == null || (code2 = error3.getCode()) == null || code2.intValue() != 123450) && ((error = loadingState.getError()) == null || (code = error.getCode()) == null || code.intValue() != 123451)) {
                                        l260 l260Var = l260.e;
                                        l560Var.E0();
                                        jcg.d(l260Var, activity4, "Rush", loadingState.getError(), new zba(l560Var, i5), new e560(), new bca(l560Var, context4), 0, context4.getColor(R.color.try_again_color), new cca(l560Var, c3 == true ? 1 : 0), new z46(l560Var, c2 == true ? 1 : 0), null, new o6t(l560Var, i5), new f560(l560Var, i6), 29056);
                                    } else {
                                        e activity5 = l560Var.getActivity();
                                        GameMainActivity gameMainActivity = activity5 instanceof GameMainActivity ? (GameMainActivity) activity5 : null;
                                        if (gameMainActivity != null) {
                                            Integer code4 = loadingState.getError().getCode();
                                            gameMainActivity.b2(code4 != null && code4.intValue() == 123450);
                                        }
                                        if (!l560Var.isRemoving()) {
                                            l560Var.F = false;
                                            l560Var.J0();
                                            l560Var.y0();
                                        }
                                    }
                                } else {
                                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                                }
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            F0().E.f(getViewLifecycleOwner(), new i660(new Function1() { // from class: g460
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ro80 binding5;
                    ro80 binding6;
                    ro80 binding7;
                    LoadingState loadingState = (LoadingState) obj;
                    int i4 = l560.b.a[loadingState.getStatus().ordinal()];
                    l560 l560Var = this.a;
                    if (i4 == 1) {
                        eo80 eo80Var16 = l560Var.l0;
                        if (eo80Var16 != null && (binding5 = eo80Var16.W.getBinding()) != null) {
                            binding5.A.setVisibility(4);
                        }
                        ej5.c(ebs.a(l560Var.getLifecycle()), null, null, new w560(l560Var, loadingState, null), 3);
                    } else if (i4 == 2) {
                        eo80 eo80Var17 = l560Var.l0;
                        if (eo80Var17 != null && (binding6 = eo80Var17.W.getBinding()) != null) {
                            binding6.A.setVisibility(0);
                        }
                    } else {
                        if (i4 != 3) {
                            uhc.a();
                            return null;
                        }
                        eo80 eo80Var18 = l560Var.l0;
                        if (eo80Var18 != null && (binding7 = eo80Var18.W.getBinding()) != null) {
                            binding7.A.setVisibility(0);
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            F0().z.f(getViewLifecycleOwner(), new i660(new qp0(this, i3)));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        try {
            F0().f.f(getViewLifecycleOwner(), new i660(new dw10(this, i3)));
        } catch (Exception unused) {
        }
        try {
            F0().v.f(getViewLifecycleOwner(), new i660(new h460(this, i2)));
        } catch (Exception unused2) {
        }
        int i4 = 2;
        try {
            F0().w.f(getViewLifecycleOwner(), new i660(new eaa(this, i4)));
        } catch (Exception unused3) {
        }
        try {
            F0().y.f(getViewLifecycleOwner(), new i660(new xv10(this, i3)));
        } catch (Exception unused4) {
        }
        try {
            C0().b.f(getViewLifecycleOwner(), new i660(new Function1() { // from class: y360
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PagingFetchType type;
                    fo2 fo2Var;
                    fo2 fo2Var2;
                    Context context4;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = l560.b.a[loadingState.getStatus().ordinal()];
                    int i6 = 3;
                    final l560 l560Var = this.a;
                    if (i5 != 1) {
                        int i7 = 2;
                        if (i5 == 2) {
                            fo2 fo2Var3 = l560Var.W;
                            if (fo2Var3 != null) {
                                fo2Var3.k(true);
                            }
                        } else {
                            if (i5 != 3) {
                                uhc.a();
                                return null;
                            }
                            xbg xbgVar = l560Var.N;
                            if (xbgVar != null && !xbgVar.isShowing() && !l560Var.isRemoving()) {
                                e activity4 = l560Var.getActivity();
                                if (activity4 != null && (context4 = l560Var.getContext()) != null) {
                                    l260 l260Var = l260.e;
                                    l560Var.E0();
                                    jcg.d(l260Var, activity4, "Rush", loadingState.getError(), new hfj(l560Var, i7), new l46(1), new Function0() { // from class: z460
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            l560Var.f1();
                                            return Unit.a;
                                        }
                                    }, 0, context4.getColor(R.color.try_again_color), null, null, null, new tba(l560Var, i6), null, 97664);
                                }
                                fo2 fo2Var4 = l560Var.W;
                                if (fo2Var4 != null) {
                                    fo2Var4.dismiss();
                                }
                            }
                        }
                    } else if (loadingState.getData() != null) {
                        fo2 fo2Var5 = l560Var.W;
                        if (fo2Var5 != null) {
                            fo2Var5.k(false);
                        }
                        List list = (List) ((HTTPResponse) loadingState.getData()).getData();
                        if ((list != null ? list.size() : 0) <= 0) {
                            Integer total = ((HTTPResponse) loadingState.getData()).getTotal();
                            if ((total != null ? total.intValue() : 0) <= 0 && (fo2Var = l560Var.W) != null && fo2Var.f().getChildCount() == 0) {
                                fo2 fo2Var6 = l560Var.W;
                                if (fo2Var6 != null) {
                                    fo2Var6.l();
                                }
                                Context context5 = l560Var.getContext();
                                if (context5 != null && (fo2Var2 = l560Var.W) != null) {
                                    fo2Var2.m(context5.getColor(R.color.color_111111));
                                }
                            }
                        }
                        fo2 fo2Var7 = l560Var.W;
                        if (fo2Var7 != null) {
                            List list2 = (List) ((HTTPResponse) loadingState.getData()).getData();
                            Integer total2 = ((HTTPResponse) loadingState.getData()).getTotal();
                            PagingState pagingStateD = l560Var.C0().c.d();
                            int offset = pagingStateD != null ? pagingStateD.getOffset() : 0;
                            PagingState pagingStateD2 = l560Var.C0().c.d();
                            int limit = pagingStateD2 != null ? pagingStateD2.getLimit() : 0;
                            PagingState pagingStateD3 = l560Var.C0().c.d();
                            if (pagingStateD3 == null || (type = pagingStateD3.getType()) == null) {
                                type = PagingFetchType.VIEW_MORE;
                            }
                            ArrayList arrayList = fo2Var7.F;
                            type.getClass();
                            if (list2 != null) {
                                fo2Var7.B.addAll(list2);
                                arrayList.addAll(list2);
                            }
                            fo2Var7.K = offset;
                            fo2Var7.J = limit;
                            fo2Var7.h(type, total2, list2 != null ? list2.size() : 0);
                            if (list2 != null) {
                                RecyclerView.f adapter = fo2Var7.f().getAdapter();
                                adapter.getClass();
                                gp80 gp80Var = (gp80) adapter;
                                ArrayList arrayListC0 = CollectionsKt.C0(arrayList);
                                fo2.b bVar = fo2Var7.L;
                                fo2.b bVar2 = fo2.b.b;
                                ej5.c(gp80Var.d, null, null, new jp2(arrayListC0, bVar == bVar2, fo2Var7.M == bVar2, gp80Var, null), 3);
                            }
                            RecyclerView.f adapter2 = fo2Var7.f().getAdapter();
                            if (adapter2 != null) {
                                adapter2.notifyDataSetChanged();
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            F0().A.f(getViewLifecycleOwner(), new i660(new Function1() { // from class: z360
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    List list;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = l560.b.a[loadingState.getStatus().ordinal()];
                    if (i5 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                            ArrayList arrayList = new ArrayList(9);
                            if (list.size() > 9) {
                                for (int i6 = 0; i6 < 9; i6++) {
                                    arrayList.add(list.get(i6));
                                }
                            } else {
                                arrayList.addAll(list);
                            }
                            n28 n28Var = new n28(arrayList);
                            l560 l560Var = this.a;
                            eo80 eo80Var16 = l560Var.l0;
                            RecyclerView recyclerView = eo80Var16 != null ? eo80Var16.N : null;
                            if (recyclerView != null) {
                                recyclerView.setOnTouchListener(new m260());
                            }
                            if (recyclerView != null) {
                                recyclerView.setAdapter(n28Var);
                            }
                            if (recyclerView != null) {
                                recyclerView.getContext();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1, true));
                            }
                            eo80 eo80Var17 = l560Var.l0;
                            if (eo80Var17 != null) {
                                eo80Var17.N.o0(0);
                            }
                        }
                    } else if (i5 != 2 && i5 != 3) {
                        uhc.a();
                        return null;
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        try {
            F0().C.f(getViewLifecycleOwner(), new i660(new zv10(this, i3)));
        } catch (Exception unused5) {
        }
        try {
            F0().D.f(getViewLifecycleOwner(), new i660(new Function1() { // from class: a460
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    PromotionGiftsResponse promotionGiftsResponse;
                    List<GiftItem> entityList;
                    LoadingState loadingState = (LoadingState) obj;
                    int i5 = l560.b.a[loadingState.getStatus().ordinal()];
                    l560 l560Var = this.a;
                    if (i5 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null && (promotionGiftsResponse = (PromotionGiftsResponse) hTTPResponse.getData()) != null) {
                            eo80 eo80Var16 = l560Var.l0;
                            if (eo80Var16 != null) {
                                eo80Var16.o0.P();
                            }
                            List<GiftItem> entityList2 = promotionGiftsResponse.getEntityList();
                            ArrayList arrayList = entityList2 instanceof ArrayList ? (ArrayList) entityList2 : null;
                            if (arrayList != null) {
                                PromotionGiftsResponse promotionGiftsResponseCopy$default = PromotionGiftsResponse.copy$default(promotionGiftsResponse, arrayList, 0, 0, 0, 14, null);
                                l560Var.Y = promotionGiftsResponseCopy$default;
                                if (promotionGiftsResponseCopy$default == null || (entityList = promotionGiftsResponseCopy$default.getEntityList()) == null || !entityList.isEmpty()) {
                                    eo80 eo80Var17 = l560Var.l0;
                                    if (eo80Var17 != null) {
                                        eo80Var17.X.setVisibility(0);
                                    }
                                } else {
                                    eo80 eo80Var18 = l560Var.l0;
                                    if (eo80Var18 != null) {
                                        eo80Var18.X.setVisibility(8);
                                    }
                                }
                            }
                        }
                    } else if (i5 != 2) {
                        if (i5 != 3) {
                            uhc.a();
                            return null;
                        }
                        eo80 eo80Var19 = l560Var.l0;
                        if (eo80Var19 != null) {
                            eo80Var19.o0.P();
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        F0().F.f(getViewLifecycleOwner(), new i660(new jp0(this, i4)));
        eo80 eo80Var16 = this.l0;
        if (eo80Var16 != null) {
            eo80Var16.n0.setTransitionListener(new d660(this));
        }
        eo80 eo80Var17 = this.l0;
        if (eo80Var17 != null) {
            gr60.a(eo80Var17.f, new Function1() { // from class: a360
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ((View) obj).getClass();
                    l560 l560Var = this.a;
                    l560Var.F = false;
                    l560Var.V0();
                    return Unit.a;
                }
            });
        }
        eo80 eo80Var18 = this.l0;
        if (eo80Var18 != null) {
            gr60.a(eo80Var18.e, new Function1() { // from class: k360
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    eo80 eo80Var19;
                    String strI2;
                    String strI3;
                    String currency;
                    String currency2;
                    String nickName;
                    String avatarUrl;
                    String currency3;
                    zn80 binding5;
                    zn80 binding6;
                    zn80 binding7;
                    String str3 = "0.00";
                    ((View) obj).getClass();
                    final l560 l560Var = this.a;
                    if (l560Var.N0()) {
                        l560Var.F0();
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    } else {
                        if (l560Var.K) {
                            Context context4 = l560Var.getContext();
                            if (context4 != null) {
                                eo80 eo80Var20 = l560Var.l0;
                                if (eo80Var20 != null) {
                                    eo80Var20.P.setVisibility(0);
                                }
                                eo80 eo80Var21 = l560Var.l0;
                                if (eo80Var21 != null && (binding7 = eo80Var21.P.getBinding()) != null) {
                                    binding7.b.setBackgroundColor(context4.getColor(R.color.warn_toast));
                                }
                                eo80 eo80Var22 = l560Var.l0;
                                if (eo80Var22 != null && (binding6 = eo80Var22.P.getBinding()) != null) {
                                    TextView textView = binding6.c;
                                    op5 op5Var = op5.a;
                                    String string2 = l560Var.getString(R.string.fbg_auto_bet_warning2_cms);
                                    string2.getClass();
                                    String string3 = l560Var.getString(R.string.fbg_applied_auto_bet);
                                    string3.getClass();
                                    textView.setText(op5.c(op5Var, string2, string3));
                                }
                                eo80 eo80Var23 = l560Var.l0;
                                if (eo80Var23 != null && (binding5 = eo80Var23.P.getBinding()) != null) {
                                    binding5.c.setTextColor(context4.getColor(R.color.white));
                                }
                                pfd pfdVar = fse.a;
                                ej5.c(w5b.a(gku.a), null, null, new g660(l560Var, null), 3);
                            }
                            return Unit.a;
                        }
                        SharedPreferences sharedPreferences = l560Var.O;
                        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_one_tap", false)) : null;
                        WalletInfoResponse walletInfoResponse = l560Var.U;
                        String str4 = "";
                        String str5 = (walletInfoResponse == null || (currency3 = walletInfoResponse.getCurrency()) == null) ? "" : currency3;
                        eo80 eo80Var24 = l560Var.l0;
                        final String strValueOf = String.valueOf(eo80Var24 != null ? eo80Var24.r0.getText() : null);
                        eo80 eo80Var25 = l560Var.l0;
                        String strValueOf2 = String.valueOf(eo80Var25 != null ? eo80Var25.C0.getText() : null);
                        if ((strValueOf2.length() == 0 || strValueOf2.equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) && (eo80Var19 = l560Var.l0) != null) {
                            TextView textView2 = eo80Var19.C0;
                            try {
                                String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.A);
                                str6.getClass();
                                str3 = str6;
                            } catch (Exception unused6) {
                            }
                            textView2.setText(str3.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                        }
                        eo80 eo80Var26 = l560Var.l0;
                        String strValueOf3 = String.valueOf(eo80Var26 != null ? eo80Var26.C0.getText() : null);
                        eo80 eo80Var27 = l560Var.l0;
                        final String strSubstring = strValueOf3.substring(0, String.valueOf(eo80Var27 != null ? eo80Var27.C0.getText() : null).length() - 1);
                        l560Var.F = true;
                        l560Var.F0().c = strValueOf;
                        Boolean bool = Boolean.TRUE;
                        if (!Intrinsics.g(boolValueOf, bool)) {
                            final String str7 = str5;
                            try {
                                Context context5 = l560Var.getContext();
                                if (context5 != null) {
                                    String string4 = l560Var.getString(R.string.place_bet_auto_message_cms);
                                    string4.getClass();
                                    String string5 = l560Var.getString(R.string.one_tap_bet_note_cms);
                                    string5.getClass();
                                    HashMap map = new HashMap();
                                    String string6 = l560Var.getString(R.string.currency_cms);
                                    WalletInfoResponse walletInfoResponse2 = l560Var.U;
                                    if (walletInfoResponse2 == null || (currency2 = walletInfoResponse2.getCurrency()) == null) {
                                        strI2 = null;
                                    } else {
                                        op5.a.getClass();
                                        strI2 = op5.i(currency2);
                                    }
                                    map.put(string6, String.valueOf(strI2));
                                    String string7 = l560Var.getString(R.string.amount_cms);
                                    TreeMap treeMap = pw.a;
                                    eo80 eo80Var28 = l560Var.l0;
                                    String strA = pw.a(String.valueOf(eo80Var28 != null ? eo80Var28.r0.getText() : null));
                                    if (strA == null) {
                                        strA = "";
                                    }
                                    map.put(string7, strA);
                                    String string8 = l560Var.getString(R.string.cashout_at_cms);
                                    eo80 eo80Var29 = l560Var.l0;
                                    String strValueOf4 = String.valueOf(eo80Var29 != null ? eo80Var29.C0.getText() : null);
                                    eo80 eo80Var30 = l560Var.l0;
                                    String strA2 = pw.a(strValueOf4.substring(0, String.valueOf(eo80Var30 != null ? eo80Var30.C0.getText() : null).length() - 1));
                                    if (strA2 != null) {
                                        str4 = strA2;
                                    }
                                    map.put(string8, str4);
                                    WalletInfoResponse walletInfoResponse3 = l560Var.U;
                                    if (walletInfoResponse3 == null || (currency = walletInfoResponse3.getCurrency()) == null) {
                                        strI3 = null;
                                    } else {
                                        op5.a.getClass();
                                        strI3 = op5.i(currency);
                                    }
                                    eo80 eo80Var31 = l560Var.l0;
                                    String str8 = strI3 + " " + pw.a(String.valueOf(eo80Var31 != null ? eo80Var31.r0.getText() : null));
                                    eo80 eo80Var32 = l560Var.l0;
                                    String strValueOf5 = String.valueOf(eo80Var32 != null ? eo80Var32.C0.getText() : null);
                                    eo80 eo80Var33 = l560Var.l0;
                                    String string9 = context5.getString(R.string.sg_rush_place_auto_bet_text_rush, str8, pw.a(strValueOf5.substring(0, String.valueOf(eo80Var33 != null ? eo80Var33.C0.getText() : null).length() - 1)) + "x");
                                    string9.getClass();
                                    op5.a.getClass();
                                    String strB = op5.b(string4, string9, map);
                                    String string10 = l560Var.getString(R.string.your_one_tap_will_be_on);
                                    string10.getClass();
                                    String str9 = "<br>  <small><font color=\"#333333\">" + op5.b(string5, string10, null) + "</font></small>";
                                    l560Var.E0();
                                    String strConcat = strB.concat(str9);
                                    String string11 = l560Var.getString(R.string.confirm_btn_cms);
                                    string11.getClass();
                                    String string12 = l560Var.getString(R.string.confirm_bet);
                                    string12.getClass();
                                    String strB2 = op5.b(string11, string12, null);
                                    String string13 = l560Var.getString(R.string.cancel_btn_cms);
                                    string13.getClass();
                                    String string14 = l560Var.getString(R.string.cancel_bet);
                                    string14.getClass();
                                    l560Var.Q = a.C0437a.a("Rush", "auto bet", strConcat, "", strB2, op5.b(string13, string14, null), new Function1() { // from class: x460
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj2) {
                                            String nickName2;
                                            String avatarUrl2;
                                            boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                            l560 l560Var2 = l560Var;
                                            if (zBooleanValue) {
                                                SharedPreferences.Editor editor = l560Var2.P;
                                                if (editor != null) {
                                                    editor.putBoolean("rush_one_tap", true);
                                                }
                                                SharedPreferences.Editor editor2 = l560Var2.P;
                                                if (editor2 != null) {
                                                    editor2.apply();
                                                }
                                                UserValidateResponse userValidateResponse = l560Var2.a0;
                                                if (userValidateResponse == null || (nickName2 = userValidateResponse.getNickName()) == null) {
                                                    nickName2 = "";
                                                }
                                                UserValidateResponse userValidateResponse2 = l560Var2.a0;
                                                if (userValidateResponse2 == null || (avatarUrl2 = userValidateResponse2.getAvatarUrl()) == null) {
                                                    avatarUrl2 = "";
                                                }
                                                l560Var2.L0(nickName2, avatarUrl2);
                                                if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                                                    ((x5a0) l560Var2.w0).setValue(Boolean.TRUE);
                                                } else {
                                                    String str10 = str7;
                                                    if (str10.length() > 0 && strValueOf.length() > 0) {
                                                        String str11 = strSubstring;
                                                        if (str11.length() > 0) {
                                                            l560Var2.h1();
                                                            l560Var2.G = false;
                                                            String string15 = l560Var2.getString(R.string.sg_rush_auto_on);
                                                            string15.getClass();
                                                            l560Var2.T0(string15);
                                                            if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                                                                c760 c760VarF1 = l560Var2.F0();
                                                                String str12 = l560Var2.F0().c;
                                                                c760VarF1.A1(l560Var2.getActivity(), l560Var2.F0().b, str10, str12 == null ? "" : str12, str11, l560Var2.F0().e, l560Var2.i0);
                                                            } else {
                                                                c760 c760VarF2 = l560Var2.F0();
                                                                String str13 = l560Var2.F0().c;
                                                                c760VarF2.z1(str10, str13 == null ? "" : str13, str11, l560Var2.F0().e, l560Var2.F0().b, l560Var2.i0, null, false);
                                                            }
                                                            GameDetails gameDetails2 = l560Var2.S;
                                                            wz.a("AutoBetOn", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                                                        }
                                                    }
                                                }
                                            } else {
                                                l560Var2.F = false;
                                            }
                                            l560Var2.p0();
                                            return Unit.a;
                                        }
                                    }, new y460(), context5.getColor(R.color.redblack_confirm_dialog_left_button), context5.getColor(R.color.redblack_confirm_dialog_right_button), 8192);
                                    e activity4 = l560Var.getActivity();
                                    FragmentManager supportFragmentManager = activity4 != null ? activity4.getSupportFragmentManager() : null;
                                    a aVar = l560Var.Q;
                                    if (aVar != null && supportFragmentManager != null) {
                                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
                                        aVar2.f(R.id.flContent, aVar, null);
                                        aVar2.c("CONFIRM_DIALOG_FRAGMENT");
                                        aVar2.k(false, true);
                                    }
                                }
                            } catch (Exception unused7) {
                                Unit unit = Unit.a;
                            }
                        } else {
                            if (yju.a("br")) {
                                ((x5a0) l560Var.w0).setValue(bool);
                                return Unit.a;
                            }
                            if (str5.length() != 0 && strValueOf.length() != 0 && strSubstring.length() != 0) {
                                SharedPreferences.Editor editor = l560Var.P;
                                if (editor != null) {
                                    editor.putBoolean("rush_one_tap", true);
                                }
                                SharedPreferences.Editor editor2 = l560Var.P;
                                if (editor2 != null) {
                                    editor2.apply();
                                }
                                l560Var.G = false;
                                UserValidateResponse userValidateResponse = l560Var.a0;
                                if (userValidateResponse == null || (nickName = userValidateResponse.getNickName()) == null) {
                                    nickName = "";
                                }
                                UserValidateResponse userValidateResponse2 = l560Var.a0;
                                if (userValidateResponse2 == null || (avatarUrl = userValidateResponse2.getAvatarUrl()) == null) {
                                    avatarUrl = "";
                                }
                                l560Var.L0(nickName, avatarUrl);
                                l560Var.h1();
                                String string15 = l560Var.getString(R.string.sg_rush_auto_on);
                                string15.getClass();
                                l560Var.T0(string15);
                                if ("br".equalsIgnoreCase(new SportyGamesManager().getSubCountry())) {
                                    c760 c760VarF1 = l560Var.F0();
                                    String str10 = l560Var.F0().c;
                                    c760VarF1.A1(l560Var.getActivity(), l560Var.F0().b, str5, str10 == null ? "" : str10, strSubstring, l560Var.F0().e, l560Var.i0);
                                } else {
                                    String str11 = str5;
                                    c760 c760VarF2 = l560Var.F0();
                                    String str12 = l560Var.F0().c;
                                    c760VarF2.z1(str11, str12 == null ? "" : str12, strSubstring, l560Var.F0().e, l560Var.F0().b, l560Var.i0, null, false);
                                }
                                GameDetails gameDetails2 = l560Var.S;
                                wz.a("AutoBetOn", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                            }
                        }
                    }
                    return Unit.a;
                }
            });
        }
        eo80 eo80Var19 = this.l0;
        if (eo80Var19 != null) {
            eo80Var19.W.setBackListener(new icj(this, 1));
        }
        eo80 eo80Var20 = this.l0;
        if (eo80Var20 != null) {
            eo80Var20.W.setNavigationListener(new jcj(this, 1));
        }
        eo80 eo80Var21 = this.l0;
        if (eo80Var21 != null) {
            eo80Var21.b.setOnClickListener(new View.OnClickListener() { // from class: r360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    GameDetails gameDetails2 = this.a.S;
                    wz.a("AddMoneyClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    SportyGamesManager.getInstance().gotoSportyBet(xae.c, null);
                }
            });
        }
        eo80 eo80Var22 = this.l0;
        if (eo80Var22 != null) {
            eo80Var22.E.setOnClickListener(new View.OnClickListener() { // from class: s360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3 = "0.00";
                    l560 l560Var = this.a;
                    eo80 eo80Var23 = l560Var.l0;
                    if (eo80Var23 != null) {
                        TextView textView = eo80Var23.r0;
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.e);
                            str4.getClass();
                            str3 = str4;
                        } catch (Exception unused6) {
                        }
                        textView.setText(str3);
                    }
                    GameDetails gameDetails2 = l560Var.S;
                    wz.a("MinBetAmountClicked", gameDetails2 != null ? gameDetails2.getName() : null, String.valueOf(l560Var.e));
                }
            });
        }
        eo80 eo80Var23 = this.l0;
        if (eo80Var23 != null) {
            eo80Var23.C.setOnClickListener(new View.OnClickListener() { // from class: t360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3 = "0.00";
                    l560 l560Var = this.a;
                    eo80 eo80Var24 = l560Var.l0;
                    if (eo80Var24 != null) {
                        TextView textView = eo80Var24.r0;
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.f);
                            str4.getClass();
                            str3 = str4;
                        } catch (Exception unused6) {
                        }
                        textView.setText(str3);
                    }
                    GameDetails gameDetails2 = l560Var.S;
                    wz.a("MaxBetAmountClicked", gameDetails2 != null ? gameDetails2.getName() : null, String.valueOf(l560Var.f));
                }
            });
        }
        eo80 eo80Var24 = this.l0;
        if (eo80Var24 != null) {
            eo80Var24.D.setOnClickListener(new View.OnClickListener() { // from class: u360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3 = "0.00";
                    l560 l560Var = this.a;
                    eo80 eo80Var25 = l560Var.l0;
                    if (eo80Var25 != null) {
                        TextView textView = eo80Var25.C0;
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.v);
                            str4.getClass();
                            str3 = str4;
                        } catch (Exception unused6) {
                        }
                        textView.setText(str3.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                    }
                    GameDetails gameDetails2 = l560Var.S;
                    wz.a("MaxTargetCoefficientClicked", gameDetails2 != null ? gameDetails2.getName() : null, String.valueOf(l560Var.v));
                }
            });
        }
        eo80 eo80Var25 = this.l0;
        if (eo80Var25 != null) {
            eo80Var25.F.setOnClickListener(new View.OnClickListener() { // from class: v360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    String str3 = "0.00";
                    l560 l560Var = this.a;
                    eo80 eo80Var26 = l560Var.l0;
                    if (eo80Var26 != null) {
                        TextView textView = eo80Var26.C0;
                        try {
                            String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.i);
                            str4.getClass();
                            str3 = str4;
                        } catch (Exception unused6) {
                        }
                        textView.setText(str3.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                    }
                    GameDetails gameDetails2 = l560Var.S;
                    wz.a("MinTargetCoefficientClicked", gameDetails2 != null ? gameDetails2.getName() : null, String.valueOf(l560Var.i));
                }
            });
        }
        eo80 eo80Var26 = this.l0;
        if (eo80Var26 != null) {
            eo80Var26.I.setOnClickListener(new View.OnClickListener() { // from class: w360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    try {
                        eo80 eo80Var27 = l560Var.l0;
                        double d2 = Double.parseDouble(String.valueOf(eo80Var27 != null ? eo80Var27.r0.getText() : null));
                        boolean zContainsValue = l560Var.L.containsValue(Double.valueOf(d2));
                        LinkedHashMap linkedHashMap = l560Var.L;
                        String str3 = "0.00";
                        if (zContainsValue) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (((Number) entry.getValue()).doubleValue() == d2) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            int iIntValue = ((Number) CollectionsKt.S(linkedHashMap2.keySet())).intValue();
                            eo80 eo80Var28 = l560Var.l0;
                            if (eo80Var28 != null) {
                                TextView textView = eo80Var28.r0;
                                Double d3 = (Double) l560Var.L.get(Integer.valueOf(iIntValue + 1));
                                if (d3 != null) {
                                    try {
                                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d3.doubleValue());
                                        str4.getClass();
                                        str3 = str4;
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    str3 = null;
                                }
                                textView.setText(String.valueOf(str3));
                            }
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (((Number) entry2.getValue()).doubleValue() > d2) {
                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Object obj = (Double) CollectionsKt.U(linkedHashMap3.values());
                            if (obj == null) {
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.z);
                                    str5.getClass();
                                    str3 = str5;
                                } catch (Exception unused7) {
                                }
                                obj = str3;
                            }
                            eo80 eo80Var29 = l560Var.l0;
                            if (eo80Var29 != null) {
                                eo80Var29.r0.setText(obj.toString());
                            }
                        }
                        GameDetails gameDetails2 = l560Var.S;
                        wz.a("AddBetAmountClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            });
        }
        eo80 eo80Var27 = this.l0;
        if (eo80Var27 != null) {
            eo80Var27.G.setOnClickListener(new View.OnClickListener() { // from class: b360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    try {
                        eo80 eo80Var28 = l560Var.l0;
                        double d2 = Double.parseDouble(String.valueOf(eo80Var28 != null ? eo80Var28.r0.getText() : null));
                        boolean zContainsValue = l560Var.L.containsValue(Double.valueOf(d2));
                        LinkedHashMap linkedHashMap = l560Var.L;
                        String str3 = DZsoPoBl.SULISxcOZjc;
                        if (zContainsValue) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (((Number) entry.getValue()).doubleValue() == d2) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            int iIntValue = ((Number) CollectionsKt.S(linkedHashMap2.keySet())).intValue();
                            eo80 eo80Var29 = l560Var.l0;
                            if (eo80Var29 != null) {
                                TextView textView = eo80Var29.r0;
                                Double d3 = (Double) l560Var.L.get(Integer.valueOf(iIntValue - 1));
                                if (d3 != null) {
                                    try {
                                        String str4 = new DecimalFormat(str3, SportyGamesManager.decimalFormatSymbols).format(d3.doubleValue());
                                        str4.getClass();
                                        str3 = str4;
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    str3 = null;
                                }
                                textView.setText(String.valueOf(str3));
                            }
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (((Number) entry2.getValue()).doubleValue() < d2) {
                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Object obj = (Double) CollectionsKt.c0(linkedHashMap3.values());
                            if (obj == null) {
                                try {
                                    String str5 = new DecimalFormat(str3, SportyGamesManager.decimalFormatSymbols).format(l560Var.z);
                                    str5.getClass();
                                    str3 = str5;
                                } catch (Exception unused7) {
                                }
                                obj = str3;
                            }
                            eo80 eo80Var30 = l560Var.l0;
                            if (eo80Var30 != null) {
                                eo80Var30.r0.setText(obj.toString());
                            }
                        }
                        GameDetails gameDetails2 = l560Var.S;
                        wz.a("ReduceBetAmountClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            });
        }
        eo80 eo80Var28 = this.l0;
        if (eo80Var28 != null) {
            eo80Var28.H.setOnClickListener(new View.OnClickListener() { // from class: c360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    try {
                        eo80 eo80Var29 = l560Var.l0;
                        String strValueOf = String.valueOf(eo80Var29 != null ? eo80Var29.C0.getText() : null);
                        eo80 eo80Var30 = l560Var.l0;
                        double d2 = Double.parseDouble(strValueOf.substring(0, String.valueOf(eo80Var30 != null ? eo80Var30.C0.getText() : null).length() - 1));
                        boolean zContainsValue = l560Var.M.containsValue(Double.valueOf(d2));
                        LinkedHashMap linkedHashMap = l560Var.M;
                        String str3 = "0.00";
                        if (zContainsValue) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (((Number) entry.getValue()).doubleValue() == d2) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            int iIntValue = ((Number) CollectionsKt.S(linkedHashMap2.keySet())).intValue();
                            eo80 eo80Var31 = l560Var.l0;
                            if (eo80Var31 != null) {
                                TextView textView = eo80Var31.C0;
                                Double d3 = (Double) l560Var.M.get(Integer.valueOf(iIntValue - 1));
                                if (d3 != null) {
                                    try {
                                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d3.doubleValue());
                                        str4.getClass();
                                        str3 = str4;
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    str3 = null;
                                }
                                textView.setText(str3 + AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                            }
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (((Number) entry2.getValue()).doubleValue() < d2) {
                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Object obj = (Double) CollectionsKt.c0(linkedHashMap3.values());
                            if (obj == null) {
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.A);
                                    str5.getClass();
                                    str3 = str5;
                                } catch (Exception unused7) {
                                }
                                obj = str3;
                            }
                            eo80 eo80Var32 = l560Var.l0;
                            if (eo80Var32 != null) {
                                eo80Var32.C0.setText(obj + AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                            }
                        }
                        GameDetails gameDetails2 = l560Var.S;
                        wz.a("ReduceTargetCoefficientClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            });
        }
        eo80 eo80Var29 = this.l0;
        if (eo80Var29 != null) {
            eo80Var29.J.setOnClickListener(new View.OnClickListener() { // from class: d360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    try {
                        eo80 eo80Var30 = l560Var.l0;
                        String strValueOf = String.valueOf(eo80Var30 != null ? eo80Var30.C0.getText() : null);
                        eo80 eo80Var31 = l560Var.l0;
                        double d2 = Double.parseDouble(strValueOf.substring(0, String.valueOf(eo80Var31 != null ? eo80Var31.C0.getText() : null).length() - 1));
                        boolean zContainsValue = l560Var.M.containsValue(Double.valueOf(d2));
                        LinkedHashMap linkedHashMap = l560Var.M;
                        String str3 = "0.00";
                        if (zContainsValue) {
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry : linkedHashMap.entrySet()) {
                                if (((Number) entry.getValue()).doubleValue() == d2) {
                                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                                }
                            }
                            int iIntValue = ((Number) CollectionsKt.S(linkedHashMap2.keySet())).intValue();
                            eo80 eo80Var32 = l560Var.l0;
                            if (eo80Var32 != null) {
                                TextView textView = eo80Var32.C0;
                                Double d3 = (Double) l560Var.M.get(Integer.valueOf(iIntValue + 1));
                                if (d3 != null) {
                                    try {
                                        String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d3.doubleValue());
                                        str4.getClass();
                                        str3 = str4;
                                    } catch (Exception unused6) {
                                    }
                                } else {
                                    str3 = null;
                                }
                                textView.setText(str3 + AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                            }
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                if (((Number) entry2.getValue()).doubleValue() > d2) {
                                    linkedHashMap3.put(entry2.getKey(), entry2.getValue());
                                }
                            }
                            Object obj = (Double) CollectionsKt.U(linkedHashMap3.values());
                            if (obj == null) {
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(l560Var.A);
                                    str5.getClass();
                                    str3 = str5;
                                } catch (Exception unused7) {
                                }
                                obj = str3;
                            }
                            eo80 eo80Var33 = l560Var.l0;
                            if (eo80Var33 != null) {
                                eo80Var33.C0.setText(obj + AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                            }
                        }
                        GameDetails gameDetails2 = l560Var.S;
                        wz.a("AddTargetCoefficientClicked", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            });
        }
        eo80 eo80Var30 = this.l0;
        if (eo80Var30 != null && (binding = eo80Var30.W.getBinding()) != null) {
            binding.f.setOnClickListener(new View.OnClickListener() { // from class: e360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    try {
                        if (!l560Var.N0()) {
                            l560Var.S0();
                            return;
                        }
                        l560Var.o0 = l560.a.b;
                        l560Var.F0();
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                }
            });
        }
        eo80 eo80Var31 = this.l0;
        if (eo80Var31 != null) {
            eo80Var31.Y.setDoneClick(new Function0() { // from class: f360
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    eo80 eo80Var32;
                    l560 l560Var = this.a;
                    try {
                        l560Var.Y0();
                        eo80Var32 = l560Var.l0;
                        if (eo80Var32 != null) {
                            SHKeypadContainer sHKeypadContainer = eo80Var32.Y;
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                        eo80Var32 = l560Var.l0;
                        if (eo80Var32 != null) {
                        }
                    } finally {
                        eo80 eo80Var33 = l560Var.l0;
                        if (eo80Var33 != null) {
                            eo80Var33.Y.setVisibility(8);
                        }
                        l560Var.B = 0;
                    }
                    return Unit.a;
                }
            });
        }
        eo80 eo80Var32 = this.l0;
        if (eo80Var32 != null) {
            eo80Var32.Y.setClearClick(new o8a(this, 1));
        }
        eo80 eo80Var33 = this.l0;
        if (eo80Var33 != null) {
            eo80Var33.Y.setCrossClick(new Function0() { // from class: g360
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    CharSequence text;
                    String string2;
                    CharSequence text2;
                    l560 l560Var = this.a;
                    try {
                        int i5 = l560Var.B;
                        eo80 eo80Var34 = l560Var.l0;
                        String strA = null;
                        strA = null;
                        strA = null;
                        if (i5 == 2) {
                            l560.P0(eo80Var34 != null ? eo80Var34.C0 : null);
                        } else {
                            TextView textView = eo80Var34 != null ? eo80Var34.r0 : null;
                            String string3 = (textView == null || (text2 = textView.getText()) == null) ? null : text2.toString();
                            if (string3 != null && string3.length() != 0) {
                                if (textView != null && (text = textView.getText()) != null && (string2 = text.toString()) != null) {
                                    strA = pl2.a(textView, 1, string2, 0);
                                }
                                if (strA != null && strA.length() == 0) {
                                    textView.setText("");
                                }
                                if (strA != null && strA.length() > 0) {
                                    textView.setText(strA);
                                } else if (textView != null) {
                                    textView.setText("");
                                }
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    return Unit.a;
                }
            });
        }
        final dq40 dq40Var = new dq40();
        dq40Var.a = "";
        final dq40 dq40Var2 = new dq40();
        dq40Var2.a = "";
        eo80 eo80Var34 = this.l0;
        if (eo80Var34 != null) {
            eo80Var34.Y.setDoubleZeroClick(new Function0() { // from class: h360
                /* JADX WARN: Code duplicated, block: B:24:0x005d  */
                /* JADX WARN: Code duplicated, block: B:26:0x0063  */
                /* JADX WARN: Code duplicated, block: B:28:0x0069  */
                /* JADX WARN: Code duplicated, block: B:29:0x0071  */
                /* JADX WARN: Code duplicated, block: B:31:0x0075  */
                /* JADX WARN: Code duplicated, block: B:43:0x00bb A[DONT_INVERT] */
                /* JADX WARN: Code duplicated, block: B:45:0x00be  */
                /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
                /* JADX WARN: Code duplicated, block: B:73:0x012b  */
                /* JADX WARN: Code duplicated, block: B:75:0x0131  */
                /* JADX WARN: Code duplicated, block: B:77:0x0137  */
                /* JADX WARN: Code duplicated, block: B:78:0x013d  */
                /* JADX WARN: Code duplicated, block: B:80:0x0141  */
                /* JADX WARN: Code duplicated, block: B:92:0x018b  */
                /* JADX WARN: Code duplicated, block: B:94:0x0195  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v1 */
                /* JADX WARN: Type inference failed for: r1v15 */
                /* JADX WARN: Type inference failed for: r1v16, types: [T, java.lang.CharSequence, java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.CharSequence, java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v29 */
                /* JADX WARN: Type inference failed for: r1v3, types: [T, java.lang.CharSequence, java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v30 */
                /* JADX WARN: Type inference failed for: r1v4, types: [T, java.lang.CharSequence, java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.String] */
                /* JADX WARN: Type inference failed for: r6v2 */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    ?? A;
                    eo80 eo80Var35;
                    eo80 eo80Var36;
                    eo80 eo80Var37;
                    CharSequence text;
                    ?? Substring;
                    ?? r6;
                    eo80 eo80Var38;
                    eo80 eo80Var39;
                    eo80 eo80Var40;
                    CharSequence text2;
                    String string2;
                    l560 l560Var = this.a;
                    int i5 = l560Var.B;
                    eo80 eo80Var41 = l560Var.l0;
                    String str3 = "0.00";
                    if (i5 == 2) {
                        if (eo80Var41 == null || (text2 = eo80Var41.C0.getText()) == null || (string2 = text2.toString()) == null) {
                            Substring = 0;
                        } else {
                            eo80 eo80Var42 = l560Var.l0;
                            Substring = string2.substring(0, String.valueOf(eo80Var42 != null ? eo80Var42.C0.getText() : null).length() - 1);
                        }
                        dq40 dq40Var3 = dq40Var2;
                        if (Substring == 0 || Substring.length() != 0) {
                            if (Intrinsics.c(Substring != 0 ? Double.valueOf(Double.parseDouble(Substring)) : null, 0.0d)) {
                                if (!StringsKt.M(Substring, ".", false)) {
                                    dq40Var3.a = "0";
                                    eo80Var40 = l560Var.l0;
                                    if (eo80Var40 != null) {
                                        eo80Var40.C0.setText("0X");
                                    }
                                } else if (Substring != 0 || !StringsKt.M(Substring, ".", false)) {
                                    r6 = Substring != 0 ? Substring : "0";
                                    dq40Var3.a = r6;
                                    eo80Var38 = l560Var.l0;
                                    if (eo80Var38 != null) {
                                        k560.a(eo80Var38.C0, r6, "00X");
                                    }
                                } else if (((String) StringsKt__StringsKt.split$default(Substring, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
                                    dq40Var3.a = Substring;
                                    eo80 eo80Var43 = l560Var.l0;
                                    if (eo80Var43 != null) {
                                        k560.a(eo80Var43.C0, Substring, AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X);
                                    }
                                } else if (((CharSequence) StringsKt__StringsKt.split$default(Substring, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
                                    dq40Var3.a = Substring;
                                    eo80 eo80Var44 = l560Var.l0;
                                    if (eo80Var44 != null) {
                                        k560.a(eo80Var44.C0, Substring, "00X");
                                    }
                                }
                            } else if (Substring != 0) {
                                if (Substring != 0) {
                                }
                                dq40Var3.a = r6;
                                eo80Var38 = l560Var.l0;
                                if (eo80Var38 != null) {
                                    k560.a(eo80Var38.C0, r6, "00X");
                                }
                            } else {
                                if (Substring != 0) {
                                }
                                dq40Var3.a = r6;
                                eo80Var38 = l560Var.l0;
                                if (eo80Var38 != null) {
                                    k560.a(eo80Var38.C0, r6, "00X");
                                }
                            }
                        } else if (!StringsKt.M(Substring, ".", false)) {
                            dq40Var3.a = "0";
                            eo80Var40 = l560Var.l0;
                            if (eo80Var40 != null) {
                                eo80Var40.C0.setText("0X");
                            }
                        } else if (Substring != 0) {
                            if (Substring != 0) {
                            }
                            dq40Var3.a = r6;
                            eo80Var38 = l560Var.l0;
                            if (eo80Var38 != null) {
                                k560.a(eo80Var38.C0, r6, "00X");
                            }
                        } else {
                            if (Substring != 0) {
                            }
                            dq40Var3.a = r6;
                            eo80Var38 = l560Var.l0;
                            if (eo80Var38 != null) {
                                k560.a(eo80Var38.C0, r6, "00X");
                            }
                        }
                        if (((CharSequence) dq40Var3.a).length() > 0) {
                            double d2 = Double.parseDouble((String) dq40Var3.a);
                            double d3 = l560Var.v;
                            if (d2 >= d3 && (eo80Var39 = l560Var.l0) != null) {
                                TextView textView = eo80Var39.C0;
                                try {
                                    String str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d3);
                                    str4.getClass();
                                    str3 = str4;
                                } catch (Exception unused6) {
                                }
                                textView.setText(str3.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                            }
                        }
                    } else {
                        ?? string3 = (eo80Var41 == null || (text = eo80Var41.r0.getText()) == null) ? 0 : text.toString();
                        dq40 dq40Var4 = dq40Var;
                        if (string3 == 0 || string3.length() != 0) {
                            if (Intrinsics.c(string3 != 0 ? Double.valueOf(Double.parseDouble(string3)) : null, 0.0d)) {
                                if (!StringsKt.M(string3, ".", false)) {
                                    dq40Var4.a = "0";
                                    eo80Var37 = l560Var.l0;
                                    if (eo80Var37 != null) {
                                        eo80Var37.r0.setText("0");
                                    }
                                } else if (string3 != 0 || !StringsKt.M(string3, ".", false)) {
                                    A = yk10.a(string3, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                                    dq40Var4.a = A;
                                    eo80Var35 = l560Var.l0;
                                    if (eo80Var35 != null) {
                                        eo80Var35.r0.setText((CharSequence) A);
                                    }
                                } else if (((String) StringsKt__StringsKt.split$default(string3, new String[]{"."}, false, 0, 6, null).get(1)).length() == 1) {
                                    dq40Var4.a = string3;
                                    eo80 eo80Var45 = l560Var.l0;
                                    if (eo80Var45 != null) {
                                        eo80Var45.r0.setText((CharSequence) string3);
                                    }
                                } else if (((CharSequence) StringsKt__StringsKt.split$default(string3, new String[]{"."}, false, 0, 6, null).get(1)).length() == 0) {
                                    ?? Concat = string3.concat(CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                                    dq40Var4.a = Concat;
                                    eo80 eo80Var46 = l560Var.l0;
                                    if (eo80Var46 != null) {
                                        eo80Var46.r0.setText((CharSequence) Concat);
                                    }
                                }
                            } else if (string3 != 0) {
                                A = yk10.a(string3, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                                dq40Var4.a = A;
                                eo80Var35 = l560Var.l0;
                                if (eo80Var35 != null) {
                                    eo80Var35.r0.setText((CharSequence) A);
                                }
                            } else {
                                A = yk10.a(string3, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                                dq40Var4.a = A;
                                eo80Var35 = l560Var.l0;
                                if (eo80Var35 != null) {
                                    eo80Var35.r0.setText((CharSequence) A);
                                }
                            }
                        } else if (!StringsKt.M(string3, ".", false)) {
                            dq40Var4.a = "0";
                            eo80Var37 = l560Var.l0;
                            if (eo80Var37 != null) {
                                eo80Var37.r0.setText("0");
                            }
                        } else if (string3 != 0) {
                            A = yk10.a(string3, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                            dq40Var4.a = A;
                            eo80Var35 = l560Var.l0;
                            if (eo80Var35 != null) {
                                eo80Var35.r0.setText((CharSequence) A);
                            }
                        } else {
                            A = yk10.a(string3, CashoutMetricsPayload.Metric.KeyValueMap.SUCCESS);
                            dq40Var4.a = A;
                            eo80Var35 = l560Var.l0;
                            if (eo80Var35 != null) {
                                eo80Var35.r0.setText((CharSequence) A);
                            }
                        }
                        CharSequence charSequence = (CharSequence) dq40Var4.a;
                        if (charSequence != null && charSequence.length() != 0) {
                            double d4 = Double.parseDouble((String) dq40Var4.a);
                            double d5 = l560Var.f;
                            if (d4 >= d5 && (eo80Var36 = l560Var.l0) != null) {
                                TextView textView2 = eo80Var36.r0;
                                try {
                                    String str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d5);
                                    str5.getClass();
                                    str3 = str5;
                                } catch (Exception unused7) {
                                }
                                textView2.setText(str3);
                            }
                        }
                    }
                    return Unit.a;
                }
            });
        }
        eo80 eo80Var35 = this.l0;
        if (eo80Var35 != null) {
            eo80Var35.Y.setNumberClick(new i360(this, 0));
        }
        eo80 eo80Var36 = this.l0;
        if (eo80Var36 != null) {
            eo80Var36.Y.setPointClick(new Function0() { // from class: j360
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    eo80 eo80Var37;
                    CharSequence text;
                    String strSubstring;
                    CharSequence text2;
                    String string2;
                    l560 l560Var = this.a;
                    try {
                        int i5 = l560Var.B;
                        eo80 eo80Var38 = l560Var.l0;
                        String string3 = null;
                        string3 = null;
                        if (i5 == 2) {
                            if (eo80Var38 == null || (text2 = eo80Var38.C0.getText()) == null || (string2 = text2.toString()) == null) {
                                strSubstring = null;
                            } else {
                                eo80 eo80Var39 = l560Var.l0;
                                strSubstring = string2.substring(0, String.valueOf(eo80Var39 != null ? eo80Var39.C0.getText() : null).length() - 1);
                            }
                            if (strSubstring != null && strSubstring.length() != 0 && !StringsKt.M(strSubstring, ".", false)) {
                                eo80 eo80Var40 = l560Var.l0;
                                String strValueOf = String.valueOf(eo80Var40 != null ? eo80Var40.C0.getText() : null);
                                eo80 eo80Var41 = l560Var.l0;
                                String strSubstring2 = strValueOf.substring(0, String.valueOf(eo80Var41 != null ? eo80Var41.C0.getText() : null).length() - 1);
                                eo80 eo80Var42 = l560Var.l0;
                                if (eo80Var42 != null) {
                                    eo80Var42.C0.setText(strSubstring2.concat(".X"));
                                }
                            }
                        } else {
                            if (eo80Var38 != null && (text = eo80Var38.r0.getText()) != null) {
                                string3 = text.toString();
                            }
                            if (string3 != null && string3.length() != 0 && !StringsKt.M(string3, ".", false) && (eo80Var37 = l560Var.l0) != null) {
                                eo80Var37.r0.setText(string3.concat("."));
                            }
                        }
                    } catch (Exception e12) {
                        e12.printStackTrace();
                    }
                    return Unit.a;
                }
            });
        }
        eo80 eo80Var37 = this.l0;
        if (eo80Var37 != null) {
            eo80Var37.C0.setOnClickListener(new View.OnClickListener() { // from class: l360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    eo80 eo80Var38 = l560Var.l0;
                    if (eo80Var38 != null && eo80Var38.Y.getVisibility() == 0) {
                        eo80 eo80Var39 = l560Var.l0;
                        if (eo80Var39 != null) {
                            eo80Var39.Y.setVisibility(8);
                            return;
                        }
                        return;
                    }
                    l560Var.B = 2;
                    eo80 eo80Var40 = l560Var.l0;
                    if (eo80Var40 != null) {
                        eo80Var40.Y.setVisibility(0);
                    }
                    eo80 eo80Var41 = l560Var.l0;
                    l560Var.C = String.valueOf(eo80Var41 != null ? eo80Var41.C0.getText() : null);
                }
            });
        }
        eo80 eo80Var38 = this.l0;
        if (eo80Var38 != null) {
            eo80Var38.r0.setOnClickListener(new View.OnClickListener() { // from class: m360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    String str3 = l560Var.F0().e;
                    if (str3 == null || str3.length() == 0) {
                        eo80 eo80Var39 = l560Var.l0;
                        if (eo80Var39 != null && eo80Var39.Y.getVisibility() == 0) {
                            eo80 eo80Var40 = l560Var.l0;
                            if (eo80Var40 != null) {
                                eo80Var40.Y.setVisibility(8);
                                return;
                            }
                            return;
                        }
                        l560Var.B = 1;
                        eo80 eo80Var41 = l560Var.l0;
                        if (eo80Var41 != null) {
                            eo80Var41.Y.setVisibility(0);
                        }
                        eo80 eo80Var42 = l560Var.l0;
                        l560Var.I = String.valueOf(eo80Var42 != null ? eo80Var42.r0.getText() : null);
                    }
                }
            });
        }
        eo80 eo80Var39 = this.l0;
        if (eo80Var39 != null) {
            eo80Var39.Y.setOnClickListener(new View.OnClickListener() { // from class: n360
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    l560 l560Var = this.a;
                    eo80 eo80Var40 = l560Var.l0;
                    if (eo80Var40 == null || eo80Var40.Y.getVisibility() != 0) {
                        return;
                    }
                    eo80 eo80Var41 = l560Var.l0;
                    if (eo80Var41 != null) {
                        eo80Var41.Y.setVisibility(8);
                    }
                    int i5 = l560Var.B;
                    eo80 eo80Var42 = l560Var.l0;
                    if (i5 == 2) {
                        if (eo80Var42 != null) {
                            eo80Var42.C0.setText(l560Var.C);
                        }
                    } else if (eo80Var42 != null) {
                        eo80Var42.r0.setText(l560Var.I);
                    }
                }
            });
        }
        eo80 eo80Var40 = this.l0;
        if (eo80Var40 != null) {
            gr60.a(eo80Var40.m0, new o360(this, i2));
        }
        eo80 eo80Var41 = this.l0;
        if (eo80Var41 != null) {
            gr60.a(eo80Var41.X, new p360(this, i2));
        }
        eo80 eo80Var42 = this.l0;
        if (eo80Var42 != null) {
            gr60.a(eo80Var42.B, new r3t(this, i4));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.setDuration(3000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o460
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) flk.a(valueAnimator)).floatValue();
                l560 l560Var = this.a;
                eo80 eo80Var43 = l560Var.l0;
                float height = eo80Var43 != null ? eo80Var43.v.getHeight() : 0.0f;
                float f2 = fFloatValue * height;
                eo80 eo80Var44 = l560Var.l0;
                if (eo80Var44 != null) {
                    eo80Var44.v.setTranslationY(f2);
                }
                eo80 eo80Var45 = l560Var.l0;
                if (eo80Var45 != null) {
                    eo80Var45.w.setTranslationY(f2 - height);
                }
            }
        });
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setRepeatCount(-1);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.setDuration(3000L);
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: p460
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) flk.a(valueAnimator)).floatValue();
                l560 l560Var = this.a;
                eo80 eo80Var43 = l560Var.l0;
                float height = eo80Var43 != null ? eo80Var43.y.getHeight() : 0.0f;
                float f2 = fFloatValue * height;
                eo80 eo80Var44 = l560Var.l0;
                if (eo80Var44 != null) {
                    eo80Var44.y.setTranslationY(f2);
                }
                eo80 eo80Var45 = l560Var.l0;
                if (eo80Var45 != null) {
                    eo80Var45.z.setTranslationY(f2 - height);
                }
            }
        });
        valueAnimatorOfFloat2.start();
        n1();
        ypa0 ypa0VarE0 = E0();
        GameDetails gameDetails2 = this.S;
        String name2 = gameDetails2 != null ? gameDetails2.getName() : null;
        ypa0VarE0.e = name2 != null ? name2 : "";
    }

    public final void p0() {
        FragmentManager supportFragmentManager;
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null) {
            return;
        }
        if (supportFragmentManager.L() > 0) {
            supportFragmentManager.b0(-1, 1, "CONFIRM_DIALOG_FRAGMENT");
        }
        this.R = null;
        this.Q = null;
    }

    public final void q0() {
        androidx.constraintlayout.widget.b bVarK;
        eo80 eo80Var = this.l0;
        if (eo80Var == null || (bVarK = eo80Var.n0.K(R.id.start)) == null) {
            return;
        }
        bVarK.w(R.id.auto_bet_btn, 1.0f);
        eo80 eo80Var2 = this.l0;
        bVarK.b(eo80Var2 != null ? eo80Var2.n0 : null);
    }

    public final void r0(boolean z2) {
        ro80 binding;
        eo80 eo80Var = this.l0;
        if (eo80Var == null || (binding = eo80Var.W.getBinding()) == null) {
            return;
        }
        binding.z.setEnabled(z2);
    }

    public final void s0(boolean z2) {
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.C.setEnabled(z2);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.w0.setEnabled(z2);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.I.setEnabled(z2);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.D0.setEnabled(z2);
        }
    }

    public final void t0(boolean z2) {
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.D.setEnabled(z2);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.x0.setEnabled(z2);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.J.setEnabled(z2);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.E0.setEnabled(z2);
        }
    }

    public final void u0(boolean z2) {
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.E.setEnabled(z2);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.y0.setEnabled(z2);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.G.setEnabled(z2);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.A0.setEnabled(z2);
        }
    }

    public final void v0(boolean z2) {
        eo80 eo80Var = this.l0;
        if (eo80Var != null) {
            eo80Var.F.setEnabled(z2);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.z0.setEnabled(z2);
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.H.setEnabled(z2);
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 != null) {
            eo80Var4.B0.setEnabled(z2);
        }
    }

    public final void w0() {
        try {
            eo80 eo80Var = this.l0;
            if (eo80Var != null) {
                eo80Var.X.setEnabled(true);
            }
            eo80 eo80Var2 = this.l0;
            if (eo80Var2 != null) {
                eo80Var2.X.setAlpha(1.0f);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void y0() {
        String str;
        androidx.constraintlayout.widget.b bVarK;
        androidx.constraintlayout.widget.b bVarK2;
        eo80 eo80Var;
        CharSequence text;
        String str2;
        String str3;
        String str4;
        eo80 eo80Var2 = this.l0;
        ConstraintLayout constraintLayout = eo80Var2 != null ? eo80Var2.d0 : null;
        if (constraintLayout != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt != null) {
                    childAt.setEnabled(true);
                }
            }
            constraintLayout.setEnabled(true);
        }
        eo80 eo80Var3 = this.l0;
        ConstraintLayout constraintLayout2 = eo80Var3 != null ? eo80Var3.Z : null;
        if (constraintLayout2 != null) {
            int childCount2 = constraintLayout2.getChildCount();
            for (int i3 = 0; i3 < childCount2; i3++) {
                View childAt2 = constraintLayout2.getChildAt(i3);
                if (childAt2 != null) {
                    childAt2.setEnabled(true);
                }
            }
            constraintLayout2.setEnabled(true);
        }
        eo80 eo80Var4 = this.l0;
        String strValueOf = String.valueOf(eo80Var4 != null ? eo80Var4.C0.getText() : null);
        String str5 = "0.00";
        if (strValueOf.length() == 0 || strValueOf.equals(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X)) {
            eo80 eo80Var5 = this.l0;
            if (eo80Var5 != null) {
                TextView textView = eo80Var5.C0;
                try {
                    str = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.i);
                    str.getClass();
                } catch (Exception unused) {
                    str = "0.00";
                }
                textView.setText(str.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
            }
        } else {
            double dA = j560.a(1, 0, strValueOf);
            double d2 = this.v;
            if (dA >= d2) {
                eo80 eo80Var6 = this.l0;
                if (eo80Var6 != null) {
                    TextView textView2 = eo80Var6.C0;
                    try {
                        str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d2);
                        str4.getClass();
                    } catch (Exception unused2) {
                        str4 = "0.00";
                    }
                    textView2.setText(str4.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                }
            } else {
                double dA2 = j560.a(1, 0, strValueOf);
                double d3 = this.i;
                eo80 eo80Var7 = this.l0;
                if (dA2 <= d3) {
                    if (eo80Var7 != null) {
                        TextView textView3 = eo80Var7.C0;
                        try {
                            str3 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d3);
                            str3.getClass();
                        } catch (Exception unused3) {
                            str3 = "0.00";
                        }
                        textView3.setText(str3.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                    }
                } else if (eo80Var7 != null) {
                    TextView textView4 = eo80Var7.C0;
                    try {
                        str2 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(j560.a(1, 0, strValueOf));
                        str2.getClass();
                    } catch (Exception unused4) {
                        str2 = "0.00";
                    }
                    textView4.setText(str2.concat(AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X));
                }
            }
        }
        eo80 eo80Var8 = this.l0;
        String string = (eo80Var8 == null || (text = eo80Var8.r0.getText()) == null) ? null : text.toString();
        if (string == null || string.length() == 0) {
            eo80 eo80Var9 = this.l0;
            if (eo80Var9 != null) {
                TextView textView5 = eo80Var9.r0;
                try {
                    String str6 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(this.e);
                    str6.getClass();
                    str5 = str6;
                } catch (Exception unused5) {
                }
                textView5.setText(str5);
            }
        } else {
            double d4 = Double.parseDouble(string);
            double d5 = this.f;
            if (d4 >= d5) {
                eo80 eo80Var10 = this.l0;
                if (eo80Var10 != null) {
                    TextView textView6 = eo80Var10.r0;
                    try {
                        String str7 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d5);
                        str7.getClass();
                        str5 = str7;
                    } catch (Exception unused6) {
                    }
                    textView6.setText(str5);
                }
            } else {
                double d6 = Double.parseDouble(string);
                double d7 = this.e;
                eo80 eo80Var11 = this.l0;
                if (d6 <= d7) {
                    if (eo80Var11 != null) {
                        TextView textView7 = eo80Var11.r0;
                        try {
                            String str8 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(d7);
                            str8.getClass();
                            str5 = str8;
                        } catch (Exception unused7) {
                        }
                        textView7.setText(str5);
                    }
                } else if (eo80Var11 != null) {
                    TextView textView8 = eo80Var11.r0;
                    try {
                        String str9 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(Double.parseDouble(string));
                        str9.getClass();
                        str5 = str9;
                    } catch (Exception unused8) {
                    }
                    textView8.setText(str5);
                }
            }
        }
        eo80 eo80Var12 = this.l0;
        if (eo80Var12 != null) {
            eo80Var12.K0.setEnabled(true);
        }
        eo80 eo80Var13 = this.l0;
        if (eo80Var13 != null) {
            eo80Var13.m0.setEnabled(true);
        }
        eo80 eo80Var14 = this.l0;
        if (eo80Var14 != null) {
            eo80Var14.e.setEnabled(true);
        }
        eo80 eo80Var15 = this.l0;
        if (eo80Var15 != null) {
            eo80Var15.r0.setAlpha(1.0f);
        }
        eo80 eo80Var16 = this.l0;
        if (eo80Var16 != null) {
            eo80Var16.C0.setAlpha(1.0f);
        }
        eo80 eo80Var17 = this.l0;
        if (eo80Var17 != null) {
            eo80Var17.K0.setAlpha(1.0f);
        }
        Context context = getContext();
        if (context != null && isAdded() && (eo80Var = this.l0) != null) {
            MaterialButton materialButton = eo80Var.m0;
            op5 op5Var = op5.a;
            String strValueOf2 = String.valueOf(materialButton.getTag());
            String string2 = context.getString(R.string.sg_place_bet);
            string2.getClass();
            materialButton.setText(op5.c(op5Var, strValueOf2, string2));
        }
        eo80 eo80Var18 = this.l0;
        if (eo80Var18 != null) {
            eo80Var18.h0.setVisibility(4);
        }
        eo80 eo80Var19 = this.l0;
        if (eo80Var19 != null && (bVarK2 = eo80Var19.n0.K(R.id.start)) != null) {
            bVarK2.w(R.id.place_bet_btn, 1.0f);
            eo80 eo80Var20 = this.l0;
            bVarK2.b(eo80Var20 != null ? eo80Var20.n0 : null);
        }
        eo80 eo80Var21 = this.l0;
        if (eo80Var21 == null || (bVarK = eo80Var21.n0.K(R.id.start)) == null) {
            return;
        }
        bVarK.w(R.id.auto_bet_btn, 1.0f);
        eo80 eo80Var22 = this.l0;
        bVarK.b(eo80Var22 != null ? eo80Var22.n0 : null);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00c4  */
    public final void z0(String str) {
        svg svgVar;
        Integer numValueOf;
        androidx.fragment.app.e activity;
        String name;
        Integer id;
        FragmentManager supportFragmentManager;
        FragmentManager supportFragmentManager2;
        if (M0() && ((this.s0 || !this.n0) && str == null)) {
            androidx.fragment.app.e activity2 = getActivity();
            if (activity2 != null) {
                activity2.finish();
                return;
            }
            return;
        }
        fo2 fo2Var = this.W;
        if (fo2Var != null && fo2Var.isShowing()) {
            fo2 fo2Var2 = this.W;
            if (fo2Var2 != null) {
                fo2Var2.dismiss();
                return;
            }
            return;
        }
        sp80 sp80Var = this.X;
        if (sp80Var != null && sp80Var.isShowing()) {
            sp80 sp80Var2 = this.X;
            if (sp80Var2 != null) {
                sp80Var2.dismiss();
                return;
            }
            return;
        }
        androidx.fragment.app.e activity3 = getActivity();
        if (((activity3 == null || (supportFragmentManager2 = activity3.getSupportFragmentManager()) == null) ? 0 : supportFragmentManager2.L()) > 0) {
            androidx.fragment.app.e activity4 = getActivity();
            if (activity4 == null || (supportFragmentManager = activity4.getSupportFragmentManager()) == null) {
                return;
            }
            supportFragmentManager.a0();
            return;
        }
        List<GameDetails> list = this.g0;
        if (list != null) {
            GameDetails gameDetails = this.S;
            int iIntValue = (gameDetails == null || (id = gameDetails.getId()) == null) ? 0 : id.intValue();
            GameDetails gameDetails2 = this.S;
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
        androidx.fragment.app.e activity5 = getActivity();
        if (activity5 != null) {
            FragmentManager supportFragmentManager3 = activity5.getSupportFragmentManager();
            supportFragmentManager3.getClass();
            if (svgVar != null) {
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager3);
                aVar.f(R.id.flContent, svgVar, null);
                aVar.c("CONFIRM_DIALOG_FRAGMENT");
                numValueOf = Integer.valueOf(aVar.k(false, true));
            } else {
                numValueOf = null;
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null || (activity = getActivity()) == null) {
            return;
        }
        GameDetails gameDetails3 = this.S;
        wz.a("BackInGame", gameDetails3 != null ? gameDetails3.getName() : null, new String[0]);
        if (str != null) {
            xbg xbgVar = this.N;
            if (xbgVar != null) {
                String string = getString(R.string.label_dialog_exit);
                string.getClass();
                xbg.c(xbgVar, str, string, new j46(this, 3), new d560(), activity.getColor(R.color.try_again_color), 224);
                xbgVar.a();
                return;
            }
            return;
        }
        E0();
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
        this.Q = com.sportygames.commons.components.a.C0437a.a("Rush", JsPluginCommon.GAMES_EXIT, strB, "", strB2, op5.b(string6, string7, null), new m460(this, 0), new t460(), activity.getColor(R.color.redblack_confirm_dialog_left_button), activity.getColor(R.color.redblack_confirm_dialog_right_button), 4096);
        androidx.fragment.app.e activity6 = getActivity();
        FragmentManager supportFragmentManager4 = activity6 != null ? activity6.getSupportFragmentManager() : null;
        com.sportygames.commons.components.a aVar2 = this.Q;
        if (aVar2 == null || supportFragmentManager4 == null) {
            return;
        }
        androidx.fragment.app.a aVar3 = new androidx.fragment.app.a(supportFragmentManager4);
        aVar3.f(R.id.flContent, aVar2, null);
        aVar3.c("CONFIRM_DIALOG_FRAGMENT");
        aVar3.k(false, true);
    }

    public final void L0(String str, String str2) {
        op5 op5Var;
        qo80 binding;
        qo80 binding2;
        eo80 eo80Var;
        Integer numValueOf = Integer.valueOf(R.color.sg_rush_toggle_off_color);
        Integer numValueOf2 = Integer.valueOf(R.color.sg_rush_toggle_on_color);
        op5 op5Var2 = op5.a;
        String string = getString(R.string.music_cms);
        string.getClass();
        String string2 = getString(R.string.music_menu);
        string2.getClass();
        op5Var2.getClass();
        String strB = op5.b(string, string2, null);
        MenuIconSize menuIconSize = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        u260 u260Var = new u260();
        SharedPreferences sharedPreferences = this.O;
        LeftMenuButton leftMenuButton = new LeftMenuButton(0, strB, R.drawable.music, menuIconSize, u260Var, true, sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("rush_music", true)) : null, numValueOf2, numValueOf, null, false, new wu10(this, 1), 1536, null);
        String string3 = getString(R.string.sound_cms);
        string3.getClass();
        String string4 = getString(R.string.sound_menu);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        MenuIconSize menuIconSize2 = new MenuIconSize(R.dimen._15sdp, R.dimen._12sdp);
        ljx ljxVar = new ljx(1);
        SharedPreferences sharedPreferences2 = this.O;
        LeftMenuButton leftMenuButton2 = new LeftMenuButton(0, strB2, R.drawable.ic_sound, menuIconSize2, ljxVar, true, sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("rush_sound", true)) : null, numValueOf2, numValueOf, null, false, new yu10(this, 1), 1536, null);
        String string5 = getString(R.string.one_tap_bet_cms);
        string5.getClass();
        String string6 = getString(R.string.onetap_bet_menu);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        MenuIconSize menuIconSize3 = new MenuIconSize(R.dimen._15sdp, R.dimen._10sdp);
        v260 v260Var = new v260();
        SharedPreferences sharedPreferences3 = this.O;
        LeftMenuButton leftMenuButton3 = new LeftMenuButton(0, strB3, R.drawable.ic_one_tap_bet, menuIconSize3, v260Var, true, sharedPreferences3 != null ? Boolean.valueOf(sharedPreferences3.getBoolean(sgwpmp.FmBI, false)) : null, numValueOf2, numValueOf, null, false, new w260(this, 0), 1536, null);
        String string7 = getString(R.string.how_to_play_nav_cms);
        string7.getClass();
        String string8 = getString(R.string.how_to_play_menu);
        string8.getClass();
        int i2 = 1;
        LeftMenuButton leftMenuButton4 = new LeftMenuButton(0, op5.b(string7, string8, null), R.drawable.ic_how_to_play, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new bv10(this, i2), false, null, null, null, null, false, null, 3072, null);
        String string9 = getString(R.string.bet_history_cms);
        string9.getClass();
        String string10 = getString(R.string.bethistory_menu);
        string10.getClass();
        LeftMenuButton leftMenuButton5 = new LeftMenuButton(0, op5.b(string9, string10, null), R.drawable.ic_bethistory, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new a8a(this, i2), false, null, null, null, null, false, null, 3072, null);
        String string11 = getString(R.string.game_limits_nav_cms);
        string11.getClass();
        String string12 = getString(R.string.game_limits);
        string12.getClass();
        List listK = kotlin.collections.b.k(leftMenuButton, leftMenuButton2, leftMenuButton3, leftMenuButton4, leftMenuButton5, new LeftMenuButton(0, op5.b(string11, string12, null), R.drawable.game_limit, new MenuIconSize(R.dimen._17sdp, R.dimen._17sdp), new o2t(this, i2), false, null, null, null, null, false, null, 3072, null));
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (eo80Var = this.l0) != null) {
            SGHamburgerMenu.setup$default(eo80Var.V, new SGHamburgerMenu.b(E0(), R.string.sg_rush, str2, str, listK, new ehe(this, 1), new bio(this, 2)), activity, false, null, new vu10(this, 1), 8, null);
        }
        eo80 eo80Var2 = this.l0;
        if (eo80Var2 != null) {
            eo80Var2.V.setRushImage();
        }
        eo80 eo80Var3 = this.l0;
        if (eo80Var3 != null) {
            eo80Var3.V.setRushBottomImage();
        }
        eo80 eo80Var4 = this.l0;
        if (eo80Var4 == null || (binding = eo80Var4.V.getBinding()) == null) {
            op5Var = op5Var2;
        } else {
            TextView textView = binding.c;
            eo80 eo80Var5 = this.l0;
            String strValueOf = String.valueOf((eo80Var5 == null || (binding2 = eo80Var5.V.getBinding()) == null) ? null : binding2.c.getTag());
            String string13 = getString(R.string.label_dialog_add_money);
            string13.getClass();
            op5Var = op5Var2;
            textView.setText("+ ".concat(op5.c(op5Var, strValueOf, string13)));
        }
        eo80 eo80Var6 = this.l0;
        if (eo80Var6 != null) {
            TextView textView2 = eo80Var6.b;
            String strValueOf2 = String.valueOf(textView2.getTag());
            String string14 = getString(R.string.label_dialog_add_money);
            string14.getClass();
            textView2.setText("+ ".concat(op5.c(op5Var, strValueOf2, string14)));
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class d implements Animation.AnimationListener {
        public final /* synthetic */ int b;
        public final /* synthetic */ ScaleAnimation c;

        public d(int i, ScaleAnimation scaleAnimation) {
            this.b = i;
            this.c = scaleAnimation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.c.setDuration(500L);
            eo80 eo80Var = l560.this.l0;
            if (eo80Var != null) {
                eo80Var.p0.startAnimation(scaleAnimation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            l560 l560Var = l560.this;
            boolean z = l560Var.F;
            eo80 eo80Var = l560Var.l0;
            if (!z) {
                if (eo80Var != null) {
                    eo80Var.p0.setVisibility(4);
                }
            } else {
                if (eo80Var != null) {
                    eo80Var.p0.setVisibility(0);
                }
                eo80 eo80Var2 = l560Var.l0;
                if (eo80Var2 != null) {
                    eo80Var2.p0.setText(String.valueOf(this.b));
                }
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
