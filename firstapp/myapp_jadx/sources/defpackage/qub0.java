package defpackage;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.appsflyer.internal.b0;
import com.google.gson.reflect.TypeToken;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.campaign.data.model.PrizeInfo;
import com.sportygames.campaign.data.model.TournamentConfigVO;
import com.sportygames.campaign.data.model.TournamentHistoryResponse;
import com.sportygames.campaign.data.model.TournamentRankListResponse;
import com.sportygames.campaign.data.model.TournamentRankResponse;
import com.sportygames.campaign.data.model.UserPlayInfo;
import com.sportygames.campaign.presentation.TournamentBannerConfig;
import com.sportygames.campaign.presentation.TournamentEligibilityCriteria;
import com.sportygames.campaign.presentation.TournamentPrizeInfo;
import com.sportygames.campaign.presentation.TournamentUserPlayInfo;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.LeftMenuButton;
import com.sportygames.commons.models.MenuIconSize;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.tournament.model.TournamentStatusResponse;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.crash.models.BetComponentColors;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.CashoutException;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.DetailResponseData;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.RoundBetResponse;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import com.sportygames.sportyherocompose.utils.GlowView;
import com.sportygames.sportyherocompose.views.ShMultiplierContainer;
import com.sportygames.sportyherov2.components.SideBetTabContainer;
import com.sportygames.sportyherov2.remote.models.FetchUnderResponse;
import com.sportygames.vip.data.LastHeroStandingSocketResponse;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import com.sportygames.vip.data.TurboUsageCountResponse;
import com.sportygames.vip.data.VipStatusResponse;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.lang.reflect.Type;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;
import okhttp3.internal.http2.Http2;
import qub0.h;
import qub0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0016²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\f\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\r\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0010\u001a\u00020\u000b8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0013\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0015\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lqub0;", "Lfgb;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "", "giftResponseReceived", "Lwag0$a;", "multiplierUiState", "shouldPlayVipUiAnimation", "vipUiAnimationCompleted", "", "containerWidthPx", "containerHeightPx", "Lc8n;", "bgBitmap", "bgWidthPx", "", "bgScale", "bgTranslationX", "bgTranslationY", "bgAnimationRunning", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class qub0 extends fgb {
    public static float y3 = 0.385f;
    public static float z3 = 0.17f;
    public String A2;
    public Long B2;
    public final ytw C2 = androidx.compose.runtime.m.b(null);
    public final ytw D2 = androidx.compose.runtime.m.b(null);
    public ShMultiplierContainer E2;
    public final ytw<Boolean> F2;
    public final ytw<Boolean> G2;
    public final isw H2;
    public final ytw<Integer> I2;
    public final ytw<Integer> J2;
    public final ytw<lk40> K2;
    public final isw L2;
    public final ytw<Boolean> M2;
    public final ytw<lk40> N2;
    public final ytw<lk40> O2;
    public final qub0 P2;
    public final ttr Q2;
    public final ttr R2;
    public boolean S2;
    public final LinkedHashMap T2;
    public List<TournamentBannerConfig> U2;
    public List<TournamentUserPlayInfo> V2;
    public fpb0 W2;
    public long X2;
    public int Y2;
    public long Z2;
    public boolean a3;
    public boolean b3;
    public boolean c3;
    public a6c0 d3;
    public fd90 e3;
    public yw80 f3;
    public final osw g3;
    public b6c0 h3;
    public boolean i3;
    public float j3;
    public float k3;
    public ValueAnimator l3;
    public Boolean m3;
    public jvd0 n3;
    public boolean o3;
    public TurboUsageCountResponse p3;
    public jvd0 q3;
    public boolean r3;
    public final long s3;
    public final long t3;
    public int u3;
    public long v3;
    public final jsb0 w3;
    public final ksb0 x3;
    public double y2;
    public CampaignParticipateV2 z2;

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$SportyHeroMovingBackground$1$1", f = "SportyHeroCompose.kt", l = {3759}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ qub0 d;
        public final /* synthetic */ osw e;
        public final /* synthetic */ osw f;
        public final /* synthetic */ ytw<c8n> i;

        /* JADX INFO: renamed from: qub0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$SportyHeroMovingBackground$1$1$result$1", f = "SportyHeroCompose.kt", l = {3760}, m = "invokeSuspend", v = 1)
        public static final class C1022a extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
            public int a;
            public final /* synthetic */ a840 b;
            public final /* synthetic */ nan c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1022a(a840 a840Var, nan nanVar, v1b v1bVar) {
                super(2, v1bVar);
                this.b = a840Var;
                this.c = nanVar;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1022a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
                return ((C1022a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    this.a = 1;
                    Object objB = this.b.b(this.c, this);
                    return objB == y5bVar ? y5bVar : objB;
                }
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Context context, qub0 qub0Var, osw oswVar, osw oswVar2, ytw<c8n> ytwVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = str;
            this.c = context;
            this.d = qub0Var;
            this.e = oswVar;
            this.f = oswVar2;
            this.i = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            osw oswVar = this.f;
            y5b y5bVar = y5b.a;
            int i = this.a;
            Context context = this.c;
            osw oswVar2 = this.e;
            int i2 = 1;
            try {
                if (i == 0) {
                    uj50.b(obj);
                    if (oswVar2.D() <= 0 || (str = this.b) == null || StringsKt.U(str)) {
                        return Unit.a;
                    }
                    a840 a840VarA = new m9n.a(context).a();
                    nan.a aVar = new nan.a(context);
                    aVar.c = str;
                    abn.a(aVar, false);
                    nan nanVarA = aVar.a();
                    pfd pfdVar = fse.a;
                    odd oddVar = odd.b;
                    C1022a c1022a = new C1022a(a840VarA, nanVarA, null);
                    this.a = 1;
                    obj = ej5.d(oddVar, c1022a, this);
                    if (obj == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                dbn dbnVar = (dbn) obj;
                if (dbnVar instanceof dfe0) {
                    u7n u7nVar = ((dfe0) dbnVar).a;
                    Resources resources = context.getResources();
                    resources.getClass();
                    Drawable drawableA = zbn.a(u7nVar, resources);
                    int intrinsicWidth = drawableA.getIntrinsicWidth();
                    int intrinsicHeight = drawableA.getIntrinsicHeight();
                    if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                        int iB = ycv.b(intrinsicWidth * (oswVar2.D() / intrinsicHeight));
                        if (iB >= 1) {
                            i2 = iB;
                        }
                        oswVar.k(i2);
                        ytw<c8n> ytwVar = this.i;
                        int iD = oswVar.D();
                        int iD2 = oswVar2.D();
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iD, iD2, Bitmap.Config.ARGB_8888);
                        bitmapCreateBitmap.getClass();
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawableA.setBounds(0, 0, iD, iD2);
                        drawableA.draw(canvas);
                        ytwVar.setValue(new t70(bitmapCreateBitmap));
                    }
                    return Unit.a;
                }
            } catch (Exception unused) {
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$SportyHeroMovingBackground$2$1", f = "SportyHeroCompose.kt", l = {3791, 3792, 3793, 3803, 3804, 3811, 3812, 3824, 3826, 3841, 3842, 3846, 3847, 3854, 3859, 3860, 3861, 3885, 3886}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ osw A;
        public final /* synthetic */ osw B;
        public final /* synthetic */ ytw<Boolean> C;
        public final /* synthetic */ isw D;
        public final /* synthetic */ isw E;
        public final /* synthetic */ isw F;
        public int a;
        public float b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ boolean f;
        public final /* synthetic */ wd0<Float, ij0> i;
        public final /* synthetic */ wd0<Float, ij0> v;
        public final /* synthetic */ wd0<Float, ij0> w;
        public final /* synthetic */ String y;
        public final /* synthetic */ osw z;

        @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$SportyHeroMovingBackground$2$1$1", f = "SportyHeroCompose.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public /* synthetic */ Object a;
            public final /* synthetic */ wd0<Float, ij0> b;
            public final /* synthetic */ wd0<Float, ij0> c;

            /* JADX INFO: renamed from: qub0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$SportyHeroMovingBackground$2$1$1$1", f = "SportyHeroCompose.kt", l = {3863}, m = "invokeSuspend", v = 1)
            public static final class C1023a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1023a(wd0<Float, ij0> wd0Var, v1b<? super C1023a> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1023a(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1023a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(0.9f);
                        gzg0 gzg0VarE = yi0.e(850, 0, xkf.d, 2);
                        this.a = 1;
                        if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX INFO: renamed from: qub0$b$a$b, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$SportyHeroMovingBackground$2$1$1$2", f = "SportyHeroCompose.kt", l = {3872}, m = "invokeSuspend", v = 1)
            public static final class C1024b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
                public int a;
                public final /* synthetic */ wd0<Float, ij0> b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1024b(wd0<Float, ij0> wd0Var, v1b<? super C1024b> v1bVar) {
                    super(2, v1bVar);
                    this.b = wd0Var;
                }

                @Override // defpackage.pz1
                public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                    return new C1024b(this.b, v1bVar);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                    return ((C1024b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    y5b y5bVar = y5b.a;
                    int i = this.a;
                    if (i == 0) {
                        uj50.b(obj);
                        Float f = new Float(0.1f);
                        gzg0 gzg0VarE = yi0.e(850, 0, xkf.d, 2);
                        this.a = 1;
                        if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = wd0Var;
                this.c = wd0Var2;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.b, this.c, v1bVar);
                aVar.a = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                ej5.c(v5bVar, null, null, new C1023a(this.b, null), 3);
                ej5.c(v5bVar, null, null, new C1024b(this.c, null), 3);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, boolean z2, wd0<Float, ij0> wd0Var, wd0<Float, ij0> wd0Var2, wd0<Float, ij0> wd0Var3, String str, osw oswVar, osw oswVar2, osw oswVar3, ytw<Boolean> ytwVar, isw iswVar, isw iswVar2, isw iswVar3, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.e = z;
            this.f = z2;
            this.i = wd0Var;
            this.v = wd0Var2;
            this.w = wd0Var3;
            this.y = str;
            this.z = oswVar;
            this.A = oswVar2;
            this.B = oswVar3;
            this.C = ytwVar;
            this.D = iswVar;
            this.E = iswVar2;
            this.F = iswVar3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, v1bVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:42:0x00e1 A[PHI: r1
          0x00e1: PHI (r1v22 java.lang.Object) = (r1v20 java.lang.Object), (r1v24 java.lang.Object) binds: [B:40:0x00dd, B:21:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:66:0x014b  */
        /* JADX WARN: Code duplicated, block: B:67:0x014d A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:69:0x0153  */
        /* JADX WARN: Code duplicated, block: B:73:0x016b  */
        /* JADX WARN: Code duplicated, block: B:77:0x0194  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x0194 -> B:64:0x0145). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instruction units count: 888
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qub0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[uzd0.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                uzd0 uzd0Var = uzd0.a;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                uzd0 uzd0Var2 = uzd0.a;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Status.values().length];
            try {
                iArr2[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Status.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr2;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$downloadSpineData$1$1", f = "SportyHeroCompose.kt", l = {4383, 4421, 4425, 4429}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public int c;
        public int d;
        public final /* synthetic */ qub0 e;
        public final /* synthetic */ c6c0 f;
        public final /* synthetic */ Context i;

        @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$downloadSpineData$1$1$spineData$1", f = "SportyHeroCompose.kt", l = {4384}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
            public int a;
            public final /* synthetic */ qub0 b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ c6c0 d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, qub0 qub0Var, c6c0 c6c0Var, Context context) {
                super(2, v1bVar);
                this.b = qub0Var;
                this.c = context;
                this.d = c6c0Var;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                Context context = this.c;
                return new a(v1bVar, this.b, this.d, context);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                String str;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        uj50.b(obj);
                        return obj;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                qub0 qub0Var = this.b;
                fq5 fq5VarV0 = qub0Var.V0();
                op5 op5Var = op5.a;
                c6c0 c6c0Var = this.d;
                String str2 = c6c0Var.b.a;
                boolean z = c6c0Var.e;
                boolean zX3 = qub0Var.X3();
                ytw ytwVar = trw.a;
                if (zX3) {
                    str = z ? "https://s.sporty.net/common/main/res/521d7fc4c657fefe0fdf5b4eab47df50.zip" : "https://s.sporty.net/common/main/res/98f0586368b4e4c0222d9f3378f1c8e6.zip";
                } else {
                    str = z ? "https://s.sporty.net/common/main/res/145e1eae64c1628b44306fbae6d557e2.zip" : "https://s.sporty.net/common/main/res/49c40a9ce8daf61a08f0b099ecbac924.zip";
                }
                String strC = op5.c(op5Var, str2, str);
                this.a = 1;
                Object objY1 = fq5VarV0.y1(this.c, strC, "hero_fuggu", this);
                return objY1 == y5bVar ? y5bVar : objY1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, qub0 qub0Var, c6c0 c6c0Var, Context context) {
            super(2, v1bVar);
            this.e = qub0Var;
            this.f = c6c0Var;
            this.i = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(v1bVar, this.e, this.f, this.i);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0157  */
        /* JADX WARN: Code duplicated, block: B:102:0x0158 A[Catch: Exception -> 0x0169, TRY_LEAVE, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:26:0x0073 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0076  */
        /* JADX WARN: Code duplicated, block: B:29:0x0079 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x007f  */
        /* JADX WARN: Code duplicated, block: B:32:0x0081 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:34:0x0085 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:37:0x008d A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:39:0x0091 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x0097  */
        /* JADX WARN: Code duplicated, block: B:42:0x0098  */
        /* JADX WARN: Code duplicated, block: B:44:0x009b A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:48:0x00a6 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:50:0x00ac  */
        /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:53:0x00b0 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:54:0x00b6  */
        /* JADX WARN: Code duplicated, block: B:57:0x00bb A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:59:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:60:0x00c2  */
        /* JADX WARN: Code duplicated, block: B:62:0x00c5 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code duplicated, block: B:63:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:97:0x0143 A[PHI: r0 r2 r12 r13
          0x0143: PHI (r0v2 ??) = (r0v15 ??), (r0v16 ??), (r0v17 ??), (r0v18 ??) binds: [B:103:0x0166, B:100:0x0155, B:96:0x0142, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0143: PHI (r2v2 int) = (r2v3 int), (r2v3 int), (r2v4 int), (r2v10 int) binds: [B:103:0x0166, B:100:0x0155, B:96:0x0142, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0143: PHI (r12v2 int) = (r12v4 int), (r12v5 int), (r12v3 int), (r12v11 int) binds: [B:103:0x0166, B:100:0x0155, B:96:0x0142, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]
          0x0143: PHI (r13v1 int) = (r13v2 int), (r13v2 int), (r13v2 int), (r13v8 int) binds: [B:103:0x0166, B:100:0x0155, B:96:0x0142, B:13:0x0039] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:99:0x0147 A[Catch: Exception -> 0x0169, TryCatch #0 {Exception -> 0x0169, blocks: (B:21:0x0054, B:24:0x006f, B:26:0x0073, B:29:0x0079, B:32:0x0081, B:34:0x0085, B:37:0x008d, B:39:0x0091, B:44:0x009b, B:46:0x00a2, B:48:0x00a6, B:53:0x00b0, B:55:0x00b7, B:57:0x00bb, B:62:0x00c5, B:65:0x00ce, B:68:0x00d6, B:70:0x00dc, B:72:0x00e6, B:74:0x00e9, B:76:0x0101, B:81:0x010b, B:82:0x0116, B:84:0x011a, B:85:0x011d, B:87:0x0121, B:88:0x0124, B:90:0x0134, B:92:0x0138, B:93:0x013b, B:95:0x013f, B:99:0x0147, B:102:0x0158, B:13:0x0039, B:16:0x0044), top: B:110:0x0011 }] */
        /* JADX WARN: Code restructure failed: missing block: B:103:0x0166, code lost:
        
            if (r3 == r1) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:106:0x0177, code lost:
        
            if (r11 == r1) goto L107;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [qub0$d] */
        /* JADX WARN: Type inference failed for: r0v1, types: [qub0$d, v1b] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v11 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v14 */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v18 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3, types: [qub0$d, v1b] */
        /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Unit] */
        /* JADX WARN: Type inference failed for: r0v5, types: [qub0$d, v1b] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        /* JADX WARN: Type inference failed for: r0v9 */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.CharSequence] */
        /* JADX WARN: Type inference failed for: r14v13 */
        /* JADX WARN: Type inference failed for: r14v14, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v15 */
        /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v20 */
        /* JADX WARN: Type inference failed for: r14v21 */
        /* JADX WARN: Type inference failed for: r14v22 */
        /* JADX WARN: Type inference failed for: r15v0 */
        /* JADX WARN: Type inference failed for: r15v1, types: [java.io.File, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r3v18, types: [com.sportygames.sportyherocompose.views.ShMultiplierContainer] */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0177 -> B:98:0x0144). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:97:0x0143 -> B:98:0x0144). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 381
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: qub0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00050\u0001¨\u0006\u0006"}, d2 = {"qub0$e", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends TypeToken<HashMap<Long, String>> {
    }

    public static final class f implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ qub0 b;

        public f(View view, qub0 qub0Var) {
            this.a = view;
            this.b = qub0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            qub0 qub0Var = this.b;
            ytw<Integer> ytwVar = qub0Var.I2;
            View view = this.a;
            ((x5a0) ytwVar).setValue(Integer.valueOf(view.getHeight()));
            ((x5a0) qub0Var.J2).setValue(Integer.valueOf(view.getWidth()));
        }
    }

    public static final class g implements Function2<String, j58, Unit> {
        public g() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            qub0 qub0Var = qub0.this;
            if (!((Boolean) ((x5a0) qub0Var.d1).getValue()).booleanValue()) {
                ((x5a0) qub0Var.c1().H).setValue(str2);
                ((x5a0) qub0Var.c1().K).setValue(j58Var2);
                ((x5a0) qub0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) qub0Var.c1().Q).setValue(2000);
                ((x5a0) qub0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(qub0Var);
            }
            return Unit.a;
        }
    }

    public static final class h implements Function2<String, j58, Unit> {
        public h() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            qub0 qub0Var = qub0.this;
            if (!((Boolean) ((x5a0) qub0Var.d1).getValue()).booleanValue()) {
                ((x5a0) qub0Var.c1().H).setValue(str2);
                ((x5a0) qub0Var.c1().K).setValue(j58Var2);
                ((x5a0) qub0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) qub0Var.c1().Q).setValue(2000);
                ((x5a0) qub0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(qub0Var);
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class i extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            qub0 qub0Var = (qub0) this.receiver;
            Context context = qub0Var.getContext();
            if (context != null) {
                HashMap mapP3 = qub0.P3(context);
                HashSet hashSet = new HashSet();
                Iterator<T> it = qub0Var.U2.iterator();
                while (it.hasNext()) {
                    Long id = ((TournamentBannerConfig) it.next()).getId();
                    hashSet.add(Long.valueOf(id != null ? id.longValue() : 0L));
                }
                Set<Long> setKeySet = mapP3.keySet();
                setKeySet.getClass();
                for (Long l : setKeySet) {
                    if (Intrinsics.g(mapP3.get(l), "joined") && !hashSet.contains(l)) {
                        k6c0 k6c0VarN3 = qub0Var.N3();
                        l.getClass();
                        long jLongValue = l.longValue();
                        k6c0VarN3.getClass();
                        ej5.c(o8i0.d(k6c0VarN3), null, null, new e6c0(k6c0VarN3, jLongValue, null), 3);
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class j extends saj implements Function1<List<? extends TournamentUserPlayInfo>, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends TournamentUserPlayInfo> list) {
            List<? extends TournamentUserPlayInfo> list2 = list;
            Context context = ((qub0) this.receiver).getContext();
            if (context != null) {
                HashMap mapP3 = qub0.P3(context);
                if (list2 == null) {
                    list2 = m2g.a;
                }
                Iterator<T> it = list2.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
                    if (tournamentId != null && !Intrinsics.g(mapP3.get(tournamentId), "joined")) {
                        mapP3.put(tournamentId, "joined");
                        z = true;
                    }
                }
                if (z) {
                    qub0.m4(context, mapP3);
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$setTurboProgress$1$1$1$1", f = "SportyHeroCompose.kt", l = {2595}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ComposeView c;
        public final /* synthetic */ SharedPreferences d;
        public final /* synthetic */ twd0<Boolean> e;
        public final /* synthetic */ twd0<Boolean> f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComposeView composeView, SharedPreferences sharedPreferences, twd0<Boolean> twd0Var, twd0<Boolean> twd0Var2, v1b<? super k> v1bVar) {
            super(2, v1bVar);
            this.c = composeView;
            this.d = sharedPreferences;
            this.e = twd0Var;
            this.f = twd0Var2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return qub0.this.new k(this.c, this.d, this.e, this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((k) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                boolean zBooleanValue = this.e.getValue().booleanValue();
                boolean zBooleanValue2 = this.f.getValue().booleanValue();
                this.a = 1;
                if (qub0.this.l4(this.c, this.d, zBooleanValue, zBooleanValue2, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$showStakeSafeTooltip$2", f = "SportyHeroCompose.kt", l = {1623}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public l(v1b<? super l> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return qub0.this.new l(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(2500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            gvi gviVar = qub0.this.z;
            if (gviVar != null) {
                gviVar.t0.setVisibility(8);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyherocompose.views.SportyHeroCompose$showVipBottomSheet$1$1$1$1", f = "SportyHeroCompose.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ComposeView a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;
        public final /* synthetic */ qub0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComposeView composeView, String str, int i, qub0 qub0Var, v1b<? super m> v1bVar) {
            super(2, v1bVar);
            this.a = composeView;
            this.b = str;
            this.c = i;
            this.d = qub0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new m(this.a, this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            gvi gviVar;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.setVisibility(0);
            if (this.b.equals("VIP_ONBOARDING") && this.c == 1 && (gviVar = this.d.z) != null) {
                gviVar.H.d();
            }
            return Unit.a;
        }
    }

    public static final class n implements Function0<Fragment> {
        public n() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return qub0.this;
        }
    }

    public static final class o implements Function0<k6c0> {
        public final /* synthetic */ n b;

        public o(n nVar) {
            this.b = nVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, k6c0] */
        @Override // kotlin.jvm.functions.Function0
        public final k6c0 invoke() {
            v8i0 viewModelStore = qub0.this.getViewModelStore();
            qub0 qub0Var = qub0.this;
            cyb defaultViewModelCreationExtras = qub0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(k6c0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(qub0Var), null);
        }
    }

    public static final class p implements Function0<Fragment> {
        public p() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return qub0.this;
        }
    }

    public static final class q implements Function0<xdi0> {
        public final /* synthetic */ p b;

        public q(p pVar) {
            this.b = pVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, xdi0] */
        @Override // kotlin.jvm.functions.Function0
        public final xdi0 invoke() {
            v8i0 viewModelStore = qub0.this.getViewModelStore();
            qub0 qub0Var = qub0.this;
            cyb defaultViewModelCreationExtras = qub0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(xdi0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(qub0Var), null);
        }
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [jsb0] */
    public qub0() {
        Boolean bool = Boolean.FALSE;
        this.F2 = androidx.compose.runtime.m.b(bool);
        this.G2 = androidx.compose.runtime.m.b(bool);
        this.H2 = androidx.compose.runtime.j.a(-0.1f);
        this.I2 = androidx.compose.runtime.m.b(null);
        this.J2 = androidx.compose.runtime.m.b(null);
        this.K2 = androidx.compose.runtime.m.b(null);
        this.L2 = androidx.compose.runtime.j.a(0.0f);
        this.M2 = androidx.compose.runtime.m.b(bool);
        this.N2 = androidx.compose.runtime.m.b(null);
        this.O2 = androidx.compose.runtime.m.b(null);
        this.P2 = this;
        n nVar = new n();
        a1s a1sVar = a1s.c;
        this.Q2 = hwr.a(a1sVar, new o(nVar));
        this.R2 = hwr.a(a1sVar, new q(new p()));
        this.S2 = true;
        this.T2 = new LinkedHashMap();
        m2g m2gVar = m2g.a;
        this.U2 = m2gVar;
        this.V2 = m2gVar;
        this.g3 = androidx.compose.runtime.k.a(1);
        this.h3 = b6c0.a;
        this.i3 = true;
        this.j3 = y3;
        this.k3 = 0.2f;
        this.s3 = 5200L;
        this.t3 = 20000L;
        this.w3 = new View.OnLayoutChangeListener() { // from class: jsb0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                qub0 qub0Var = this.a;
                gvi gviVar = qub0Var.z;
                if (gviVar == null || gviVar.V.getVisibility() != 0) {
                    return;
                }
                qub0Var.z4();
            }
        };
        this.x3 = new ksb0();
    }

    public static boolean B3(ul2 ul2Var) {
        BetContainerState betContainerState = (BetContainerState) ul2Var.a.getValue();
        Boolean bool = (Boolean) ((HashMap) ((x5a0) ul2Var.d).getValue()).get(Long.valueOf(betContainerState.getRoundId()));
        return (!betContainerState.getBetPlaced() || (bool != null ? bool.booleanValue() : false) || (egb.a(betContainerState) > 0)) ? false : true;
    }

    public static final boolean B4(ul2 ul2Var) {
        BetContainerState betContainerState = (BetContainerState) ul2Var.a.getValue();
        if (betContainerState.isStakeSafeApplied()) {
            return true;
        }
        return betContainerState.getBetPlaced() && betContainerState.isStakeSafeBet();
    }

    public static void F3(ShMultiplierContainer shMultiplierContainer, boolean z, boolean z2, File file, File file2) {
        shMultiplierContainer.setLowRamHeroMode(z2);
        shMultiplierContainer.setAtlasName(file);
        shMultiplierContainer.setSkeletonName(file2);
        shMultiplierContainer.k(z);
        DisplayMetrics displayMetrics = shMultiplierContainer.getResources().getDisplayMetrics();
        shMultiplierContainer.setNestedDimens(displayMetrics.heightPixels, displayMetrics.widthPixels);
        if (z2) {
            if (file == null || file2 == null) {
                return;
            }
            shMultiplierContainer.setAssets();
            shMultiplierContainer.setSpine();
            return;
        }
        qu80 binding = shMultiplierContainer.getBinding();
        if (binding != null) {
            binding.c.setVisibility(8);
        }
        qu80 binding2 = shMultiplierContainer.getBinding();
        if (binding2 != null) {
            binding2.O.setVisibility(4);
        }
        qu80 binding3 = shMultiplierContainer.getBinding();
        if (binding3 != null) {
            binding3.K.setVisibility(4);
        }
    }

    public static void G3(GlowView glowView, boolean z) {
        if (glowView == null) {
            return;
        }
        glowView.setGlowVisible(z);
        if (z) {
            glowView.setGlowColor(Color.parseColor("#CCB37F33"));
            glowView.setCornerRadiusDp(8.0f);
            glowView.setContentInsetDp(16.0f);
            glowView.setGlowBlurDp(16.0f);
        }
    }

    public static final boolean M3(View view, Boolean bool) {
        return view.getVisibility() == 0 && Intrinsics.g(bool, Boolean.TRUE);
    }

    public static HashMap P3(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("tournament_state", 0);
        eal ealVar = new eal();
        String string = sharedPreferences.getString("tournamentMap", null);
        Type type = new e().getType();
        if (string == null) {
            return new HashMap();
        }
        Object objF = ealVar.f(string, type);
        objF.getClass();
        return (HashMap) objF;
    }

    public static void U3(BlurView blurView, ViewGroup viewGroup) {
        ha20 ha20VarB = blurView.b(viewGroup, Build.VERSION.SDK_INT >= 31 ? new o750() : new a850(viewGroup.getContext()));
        ha20VarB.a = 10.0f;
        ha20VarB.e(true);
        long j2 = j58.l;
        ha20VarB.b(r58.l(j2));
        ha20VarB.l = new ColorDrawable(r58.l(j2));
    }

    public static void c4(qub0 qub0Var) {
        if (qub0Var.A3()) {
            ((x5a0) gci0.C).setValue(Boolean.TRUE);
        }
    }

    public static lk40 d4(View view, View view2) {
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return null;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        view2.getLocationOnScreen(iArr2);
        float f2 = iArr[0] - iArr2[0];
        float f3 = iArr[1] - iArr2[1];
        return new lk40(f2, f3, view.getWidth() + f2, view.getHeight() + f3);
    }

    public static void m4(Context context, HashMap map) {
        context.getSharedPreferences("tournament_state", 0).edit().putString("tournamentMap", new eal().j(map)).apply();
    }

    public static void o3(final qub0 qub0Var, final float f2, final float f3, boolean z) {
        if (qub0Var.z != null) {
            ValueAnimator valueAnimator = qub0Var.l3;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            qub0Var.m3 = Boolean.valueOf(z);
            final float f4 = qub0Var.j3;
            final float f5 = qub0Var.k3;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(180L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tsb0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float fFloatValue = ((Float) flk.a(valueAnimator2)).floatValue();
                    float f6 = f2;
                    float f7 = f4;
                    float fA = hxa.a(f6, f7, fFloatValue, f7);
                    float f8 = f3;
                    float f9 = f5;
                    float fA2 = hxa.a(f8, f9, fFloatValue, f9);
                    qub0 qub0Var2 = qub0Var;
                    qub0Var2.j3 = fA;
                    qub0Var2.k3 = fA2;
                    qub0Var2.t3(fA, fA2);
                }
            });
            valueAnimatorOfFloat.addListener(new rub0(new yp40(), qub0Var, f2, f3, z));
            qub0Var.l3 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.start();
        }
    }

    public static void p3(androidx.constraintlayout.widget.b bVar, View view, boolean z) {
        androidx.constraintlayout.widget.b bVar2;
        Iterator it = kotlin.collections.b.k(Integer.valueOf(R.id.top_list), Integer.valueOf(R.id.top_list_blur_bg)).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            if (z) {
                bVar.e(iIntValue, 4);
                bVar.i(iIntValue, view.getResources().getDimensionPixelSize(R.dimen._180sdp));
                bVar2 = bVar;
            } else {
                int dimensionPixelSize = 0;
                bVar.i(iIntValue, 0);
                DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
                float f2 = displayMetrics.widthPixels;
                float f3 = displayMetrics.heightPixels;
                if (f2 > 0.0f && f3 > 0.0f) {
                    dimensionPixelSize = f3 / f2 >= 2.1f ? view.getResources().getDimensionPixelSize(R.dimen._8sdp) : view.getResources().getDimensionPixelSize(R.dimen._4sdp);
                }
                bVar2 = bVar;
                bVar2.h(iIntValue, 4, 0, 4, dimensionPixelSize);
            }
            bVar = bVar2;
        }
    }

    public static void r3(int i2, androidx.constraintlayout.widget.b bVar) {
        bVar.g(i2, 6, 0, 6);
        bVar.g(i2, 7, 0, 7);
        bVar.z(i2, 6, 0);
        bVar.z(i2, 7, 0);
        bVar.l(i2, 0);
        bVar.k(i2, 0.972f);
    }

    public static void s3(androidx.constraintlayout.widget.b bVar) {
        Iterator it = kotlin.collections.b.k(Integer.valueOf(R.id.bet_view), Integer.valueOf(R.id.bet_view1)).iterator();
        while (it.hasNext()) {
            r3(((Number) it.next()).intValue(), bVar);
        }
    }

    public static void v3(c6c0 c6c0Var) {
        boolean z = c6c0Var.c;
        ((x5a0) trw.a).setValue(Boolean.valueOf(z));
        boolean z2 = c6c0Var.d;
        ((x5a0) trw.b).setValue(Boolean.valueOf(z2));
        boolean z4 = c6c0Var.e;
        ((x5a0) trw.c).setValue(Boolean.valueOf(z4));
    }

    public static final void x3(double d2, ul2 ul2Var) {
        BetContainerState betContainerState = (BetContainerState) ul2Var.a.getValue();
        if (betContainerState.getBetPlaced() && betContainerState.isStakeSafeBet()) {
            ul2Var.L1(DetailResponse.copy$default(ul2Var.y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, d2, 0, 0, null, null, null, 8063, null));
            ul2Var.A1(true);
        }
    }

    @Override // defpackage.fgb
    public final boolean A1() {
        return this.h3 == b6c0.a;
    }

    public final boolean A3() {
        Context context;
        ytw<StakeSafeUsageCountResponse> ytwVar = gci0.a;
        Object value = ((x5a0) gci0.h).getValue();
        Boolean bool = Boolean.TRUE;
        boolean zG = false;
        if (!Intrinsics.g(value, bool) || !Intrinsics.g(((x5a0) gci0.r).getValue(), bool) || ((Boolean) ((x5a0) gci0.D).getValue()).booleanValue() || ((Boolean) ((x5a0) gci0.F).getValue()).booleanValue() || (context = getContext()) == null) {
            return false;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("vip_elite_data", 0);
            sharedPreferences.getClass();
            try {
                zG = Intrinsics.g(sharedPreferences.getString("one_time_fetch", null), "ui_animated");
            } catch (Exception unused) {
            }
            return !zG;
        } catch (Exception unused2) {
            return false;
        }
    }

    public final void A4() {
        gvi gviVar;
        gvi gviVar2;
        boolean zBooleanValue = ((Boolean) ((x5a0) gci0.j).getValue()).booleanValue();
        gvi gviVar3 = this.z;
        boolean z = false;
        G3(gviVar3 != null ? gviVar3.f : null, B4(R0()) && zBooleanValue && (gviVar2 = this.z) != null && gviVar2.c.getVisibility() == 0);
        gvi gviVar4 = this.z;
        GlowView glowView = gviVar4 != null ? gviVar4.b : null;
        if (B4(S0()) && zBooleanValue && (gviVar = this.z) != null && gviVar.d.getVisibility() == 0) {
            z = true;
        }
        G3(glowView, z);
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
        fpb0 fpb0Var;
        MultiplierResponse multiplierResponse2 = this.x0;
        String messageType = multiplierResponse2 != null ? multiplierResponse2.getMessageType() : null;
        int size = 0;
        if ((Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") || (Intrinsics.g(messageType, "ROUND_END_WAIT") && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_WAITING"))) && (fpb0Var = this.W2) != null) {
            uqb0 uqb0Var = fpb0Var.h;
            try {
                fpb0Var.n.clear();
                uqb0Var.y1(null);
                if (((xqb0) uqb0Var.b.getValue()).a == wqb0.a) {
                    uqb0Var.x1(m2g.a, false);
                }
            } catch (Exception unused) {
            }
        }
        ssw<List<TournamentConfigVO>> sswVar = wag0.a;
        ((x5a0) wag0.m).setValue(new wag0.a(multiplierResponse.getCurrentMultiplier(), multiplierResponse.getMessageType()));
        if (this.S2) {
            this.S2 = false;
            if (!Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
                ((x5a0) wag0.l).setValue(Boolean.FALSE);
            }
        }
        fpb0 fpb0Var2 = this.W2;
        if (fpb0Var2 != null) {
            boolean zG = Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING");
            fpb0Var2.p = zG;
            uqb0 uqb0Var2 = fpb0Var2.h;
            uqb0Var2.y1((!zG || fpb0Var2.n.isEmpty()) ? null : Integer.valueOf(fpb0Var2.n.size()));
            wwd0 wwd0Var = uqb0Var2.b;
            if (zG && !fpb0Var2.n.isEmpty() && ((xqb0) wwd0Var.getValue()).a == wqb0.a) {
                vqb0 vqb0Var = ((xqb0) wwd0Var.getValue()).b;
                vqb0.a aVar = vqb0Var instanceof vqb0.a ? (vqb0.a) vqb0Var : null;
                List<TopBets> list = aVar != null ? aVar.a : null;
                if (list == null) {
                    list = m2g.a;
                }
                if (!Intrinsics.g(list, fpb0Var2.n)) {
                    fpb0Var2.b();
                }
            }
        }
        if (multiplierResponse.getRoundId() != this.X2) {
            this.X2 = multiplierResponse.getRoundId();
            this.Y2 = 0;
            this.Z2 = 0L;
        }
        if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING")) {
            fpb0 fpb0Var3 = this.W2;
            if (fpb0Var3 != null && !fpb0Var3.n.isEmpty()) {
                size = fpb0Var3.n.size();
            }
            if (size <= 0 && this.Y2 < 3) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (jCurrentTimeMillis - this.Z2 >= 1500) {
                    this.Y2++;
                    this.Z2 = jCurrentTimeMillis;
                    k6c0 k6c0VarN3 = N3();
                    k6c0VarN3.getClass();
                    ej5.c(o8i0.d(k6c0VarN3), null, null, new f6c0(k6c0VarN3, null), 3);
                }
            }
        }
        if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
            ((x5a0) wag0.l).setValue(Boolean.TRUE);
        }
        ShMultiplierContainer shMultiplierContainer = this.E2;
        if (shMultiplierContainer != null) {
            shMultiplierContainer.setMultiplier(multiplierResponse);
        }
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPORTY_HERO_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPORTY_HERO_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_sporty_hero);
            string.getClass();
            progressMeterComponent.setSoundManager("SPORTY_HERO/", string, boolValueOf, boolValueOf2, rk60.b.f, this.i, context);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.I(l1());
        }
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b4  */
    public final ArrayList C3(ul2 ul2Var) {
        Object next;
        String lowerCase;
        List<TournamentEligibilityCriteria> eligibilityCriteria;
        TournamentEligibilityCriteria tournamentEligibilityCriteria;
        Iterable iterable = this.V2;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Long tournamentId = ((TournamentUserPlayInfo) it.next()).getTournamentId();
            Long l2 = null;
            if (tournamentId != null) {
                long jLongValue = tournamentId.longValue();
                Iterator<T> it2 = this.U2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    Long id = ((TournamentBannerConfig) next).getId();
                    if (id != null && id.longValue() == jLongValue) {
                        break;
                    }
                }
                TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) next;
                Double minimumStakeCriteria = (tournamentBannerConfig == null || (eligibilityCriteria = tournamentBannerConfig.getEligibilityCriteria()) == null || (tournamentEligibilityCriteria = (TournamentEligibilityCriteria) CollectionsKt.firstOrNull(eligibilityCriteria)) == null) ? null : tournamentEligibilityCriteria.getMinimumStakeCriteria();
                if (tournamentBannerConfig != null) {
                    String status = tournamentBannerConfig.getStatus();
                    if (status != null) {
                        lowerCase = status.toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                    } else {
                        lowerCase = null;
                    }
                    String startTime = tournamentBannerConfig.getStartTime();
                    if (startTime == null) {
                        startTime = "";
                    }
                    if (!k94.a(startTime) || Intrinsics.g(lowerCase, "stopped") || Intrinsics.g(lowerCase, "paused") || Intrinsics.g(lowerCase, "ended")) {
                        tournamentId = null;
                    } else {
                        if (ul2Var.O.getValue().doubleValue() < (minimumStakeCriteria != null ? minimumStakeCriteria.doubleValue() : 0.0d)) {
                            tournamentId = null;
                        }
                    }
                } else {
                    tournamentId = null;
                }
                l2 = tournamentId;
            }
            if (l2 != null) {
                arrayList.add(l2);
            }
        }
        return arrayList;
    }

    @Override // defpackage.fgb
    public final void D2(Coefficients coefficients) {
        coefficients.getClass();
        if (((Boolean) ((x5a0) Y0().i).getValue()).booleanValue()) {
            Y0().x1(coefficients);
            return;
        }
        coefficients.setNew(true);
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        Map<Double, Integer> map = l18.a;
        coefficients.m97setCoeffColor8_81llA(l18.a(coefficients.getHouseCoefficient(), b1()));
        Y0().y1(coefficients);
        Y0().x1(coefficients);
    }

    public final float D3() {
        Float f2;
        Context context = getContext();
        if (context == null) {
            return 0.00625f;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f3 = displayMetrics.heightPixels;
        float f4 = displayMetrics.widthPixels;
        if (f3 == 0.0f || f4 == 0.0f || (f2 = (Float) vu80.a(f3, f4).get("vertical_spacer")) == null) {
            return 0.00625f;
        }
        return f2.floatValue();
    }

    @Override // defpackage.fgb
    public final void E0() {
        ((x5a0) this.F2).setValue(Boolean.TRUE);
        fd90 fd90Var = this.e3;
        if (fd90Var != null) {
            fd90Var.m();
        }
    }

    @Override // defpackage.fgb
    public final void E1(ul2 ul2Var, TopBets topBets, boolean z) {
        ul2Var.getClass();
        topBets.getClass();
        if (z) {
            w3();
            A4();
        }
    }

    @Override // defpackage.fgb
    public final void E2(PreviousMultiplierResponse previousMultiplierResponse) {
        Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
        int size = previousMultiplierResponse.getCoefficients().size();
        for (int i2 = 0; i2 < size; i2++) {
            previousMultiplierResponse.getCoefficients().get(i2);
            previousMultiplierResponse.getCoefficients().get(i2).m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            previousMultiplierResponse.getCoefficients().get(i2).m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            Coefficients coefficients = previousMultiplierResponse.getCoefficients().get(i2);
            Map<Double, Integer> map = l18.a;
            coefficients.m97setCoeffColor8_81llA(l18.a(previousMultiplierResponse.getCoefficients().get(i2).getHouseCoefficient(), b1()));
        }
        Y0().B1(previousMultiplierResponse);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064 A[PHI: r6
      0x0064: PHI (r6v6 java.lang.Integer) = (r6v3 java.lang.Integer), (r6v8 java.lang.Integer) binds: [B:45:0x0097, B:25:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:38:0x0089  */
    /* JADX WARN: Code duplicated, block: B:40:0x008c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0096  */
    /* JADX WARN: Code duplicated, block: B:48:0x009c  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00b9  */
    /* JADX WARN: Instruction removed from duplicated block: B:27:0x0069, please report this as an issue */
    public final float E3(boolean z) {
        gvi gviVar;
        int bottom;
        gvi gviVar2;
        ViewGroup.LayoutParams layoutParams;
        ConstraintLayout.LayoutParams layoutParams2;
        int i2;
        Integer numValueOf;
        gvi gviVar3 = this.z;
        float fFloatValue = 0.45f;
        if (gviVar3 != null) {
            ConstraintLayout constraintLayout = gviVar3.F;
            DisplayMetrics displayMetrics = constraintLayout.getResources().getDisplayMetrics();
            Float f2 = (Float) vu80.d(displayMetrics.heightPixels, displayMetrics.widthPixels).get("ou_range_height_wo_tournament");
            fFloatValue = f2 != null ? f2.floatValue() : 0.45f;
            int height = constraintLayout.getHeight();
            if (height < 1) {
                height = 1;
            }
            float height2 = 0.0f;
            if (z) {
                gvi gviVar4 = this.z;
                fFloatValue = (fFloatValue - ((gviVar4 != null ? gviVar4.p0.getHeight() : 0.0f) / height)) - 0.008f;
                if (fFloatValue < 0.25f) {
                    fFloatValue = 0.25f;
                }
            }
            gvi gviVar5 = this.z;
            Float fValueOf = null;
            if (gviVar5 != null) {
                int top = gviVar5.c0.getTop();
                numValueOf = Integer.valueOf(top);
                if (top <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue = numValueOf.intValue();
                    if (z) {
                        gvi gviVar6 = this.z;
                        height2 = (gviVar6 != null ? gviVar6.p0.getHeight() : 0.0f) / height;
                    }
                    float f3 = ((1.0f - (iIntValue / height)) - height2) - 0.01f;
                    fValueOf = Float.valueOf(f3 >= 0.25f ? f3 : 0.25f);
                } else {
                    gviVar = this.z;
                    if (gviVar != null) {
                        bottom = gviVar.f0.getBottom();
                    } else {
                        bottom = 0;
                    }
                    gviVar2 = this.z;
                    if (gviVar2 != null) {
                        layoutParams = gviVar2.c0.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                        layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                    } else {
                        layoutParams2 = null;
                    }
                    i2 = bottom + (layoutParams2 != null ? ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin : 0);
                    numValueOf = Integer.valueOf(i2);
                    if (i2 <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        int iIntValue2 = numValueOf.intValue();
                        if (z) {
                            gvi gviVar7 = this.z;
                            height2 = (gviVar7 != null ? gviVar7.p0.getHeight() : 0.0f) / height;
                        }
                        float f4 = ((1.0f - (iIntValue2 / height)) - height2) - 0.01f;
                        fValueOf = Float.valueOf(f4 >= 0.25f ? f4 : 0.25f);
                    }
                }
            } else {
                gviVar = this.z;
                if (gviVar != null) {
                    bottom = gviVar.f0.getBottom();
                } else {
                    bottom = 0;
                }
                gviVar2 = this.z;
                if (gviVar2 != null) {
                    layoutParams = gviVar2.c0.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                    layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                } else {
                    layoutParams2 = null;
                }
                i2 = bottom + (layoutParams2 != null ? ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin : 0);
                numValueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    int iIntValue3 = numValueOf.intValue();
                    if (z) {
                        gvi gviVar8 = this.z;
                        height2 = (gviVar8 != null ? gviVar8.p0.getHeight() : 0.0f) / height;
                    }
                    float f5 = ((1.0f - (iIntValue3 / height)) - height2) - 0.01f;
                    fValueOf = Float.valueOf(f5 >= 0.25f ? f5 : 0.25f);
                }
            }
            if (fValueOf != null) {
                return Math.min(fFloatValue, fValueOf.floatValue());
            }
        }
        return fFloatValue;
    }

    @Override // defpackage.fgb
    public final void F0() {
        T3();
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.r0.setVisibility(8);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Q.setHamMenuVipChanges(false);
        }
        ((x5a0) gci0.I).setValue(Boolean.TRUE);
        ((x5a0) gci0.A).setValue(Boolean.FALSE);
        R0().A1(false);
        S0().A1(false);
        gvi gviVar3 = this.z;
        G3(gviVar3 != null ? gviVar3.f : null, false);
        gvi gviVar4 = this.z;
        G3(gviVar4 != null ? gviVar4.b : null, false);
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.q0.setVisibility(8);
        }
    }

    @Override // defpackage.fgb
    public final void F1(ul2 ul2Var, TopBets topBets, boolean z) {
        ul2Var.getClass();
        topBets.getClass();
        TurboUsageCountResponse turboUsageCountResponse = this.p3;
        if (turboUsageCountResponse != null && !S3()) {
            this.p3 = null;
            ((x5a0) gci0.c).setValue(turboUsageCountResponse);
            s4();
            R3(turboUsageCountResponse);
        }
        if (z) {
            q4();
            A4();
        }
    }

    @Override // defpackage.fgb
    public final void G1() {
        y3();
        w3();
    }

    @Override // defpackage.fgb
    public final boolean H0() {
        yw80 yw80Var = this.f3;
        if (yw80Var == null || !yw80Var.isShowing()) {
            return false;
        }
        yw80 yw80Var2 = this.f3;
        if (yw80Var2 != null) {
            yw80Var2.dismiss();
        }
        return true;
    }

    public final void H3() {
        if (this.r3) {
            this.r3 = false;
            b4();
        }
    }

    @Override // defpackage.fgb
    public final void I0() {
        c6c0 c6c0VarO3 = O3();
        if (c6c0VarO3 == null) {
            return;
        }
        K3(c6c0VarO3);
    }

    @Override // defpackage.fgb
    public final void I1() {
        Boolean bool = Boolean.FALSE;
        ((x5a0) this.M2).setValue(bool);
        ((x5a0) this.G2).setValue(bool);
        gvi gviVar = this.z;
        G3(gviVar != null ? gviVar.f : null, false);
        gvi gviVar2 = this.z;
        G3(gviVar2 != null ? gviVar2.b : null, false);
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.b0.setVisibility(0);
        }
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.U.setVisibility(0);
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.W.setVisibility(0);
        }
        gvi gviVar6 = this.z;
        if (gviVar6 != null) {
            gviVar6.a0.setVisibility(0);
        }
        a6c0 a6c0Var = this.d3;
        if (a6c0Var != null) {
            a6c0Var.e(b6c0.a);
        }
        ValueAnimator valueAnimator = this.l3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.m3 = null;
        ((u5a0) this.g3).k(1);
        float f2 = y3;
        this.j3 = f2;
        this.k3 = 0.2f;
        t3(f2, 0.2f);
        ((x5a0) wag0.i).setValue(bool);
        ((x5a0) wag0.h).setValue(bool);
        ((t5a0) wag0.j).A(0.37f);
        ((x5a0) wag0.k).setValue(Integer.valueOf(R.dimen._50ssp));
    }

    public final void I3() {
        if (isAdded() && !isRemoving() && Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE)) {
            if (!A3()) {
                a4();
                return;
            }
            jvd0 jvd0Var = this.q3;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            this.q3 = ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new cvb0(this, null), 3);
            c4(this);
        }
    }

    @Override // defpackage.fgb
    public final void J0() {
        ((x5a0) this.F2).setValue(Boolean.FALSE);
        fd90 fd90Var = this.e3;
        if (fd90Var != null) {
            fd90Var.m();
        }
    }

    @Override // defpackage.fgb
    public final void J1(MultiplierResponse multiplierResponse) {
        gvi gviVar;
        StakeSafeUsageCountResponse stakeSafeUsageCountResponse;
        Double maxCoefficientLimit;
        Double dH;
        Double turboValue;
        Double turboValue2;
        y3();
        x5a0 x5a0Var = (x5a0) gci0.d;
        double dDoubleValue = 0.0d;
        if (x5a0Var.getValue() != null) {
            TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) x5a0Var.getValue();
            TurboUsageCountResponse turboUsageCountResponse2 = (TurboUsageCountResponse) x5a0Var.getValue();
            L3(turboUsageCountResponse, ((turboUsageCountResponse2 == null || (turboValue2 = turboUsageCountResponse2.getTurboValue()) == null) ? 0.0d : turboValue2.doubleValue()) >= 100.0d);
        }
        if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
            if (Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE)) {
                o4(R0(), multiplierResponse);
                o4(S0(), multiplierResponse);
                x5a0 x5a0Var2 = (x5a0) gci0.b;
                StakeSafeUsageCountResponse stakeSafeUsageCountResponse2 = (StakeSafeUsageCountResponse) x5a0Var2.getValue();
                TurboUsageCountResponse turboUsageCountResponse3 = (TurboUsageCountResponse) x5a0Var.getValue();
                if (!((BetContainerState) R0().a.getValue()).isStakeSafeApplied() && !((BetContainerState) S0().a.getValue()).isStakeSafeApplied()) {
                    if ((stakeSafeUsageCountResponse2 != null ? stakeSafeUsageCountResponse2.getUsed() : 0) < (stakeSafeUsageCountResponse2 != null ? stakeSafeUsageCountResponse2.getMaxAllowed() : 0)) {
                        ul2 ul2VarR0 = R0();
                        ul2 ul2VarS0 = S0();
                        BetContainerState betContainerState = (BetContainerState) ul2VarR0.a.getValue();
                        BetContainerState betContainerState2 = (BetContainerState) ul2VarS0.a.getValue();
                        boolean z = betContainerState.getRoundId() == multiplierResponse.getRoundId() && B3(ul2VarR0);
                        boolean z2 = betContainerState2.getRoundId() == multiplierResponse.getRoundId() && B3(ul2VarS0);
                        if ((z || z2) && (stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) x5a0Var2.getValue()) != null && (maxCoefficientLimit = stakeSafeUsageCountResponse.getMaxCoefficientLimit()) != null) {
                            double dDoubleValue2 = maxCoefficientLimit.doubleValue();
                            String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                            String strP = currentMultiplier != null ? kotlin.text.c.p(kotlin.text.c.p(currentMultiplier, "x", "", false), AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X, "", false) : null;
                            if (strP != null && (dH = kotlin.text.b.h(strP)) != null && dH.doubleValue() < dDoubleValue2) {
                                if (turboUsageCountResponse3 != null && (turboValue = turboUsageCountResponse3.getTurboValue()) != null) {
                                    dDoubleValue = turboValue.doubleValue();
                                }
                                if (dDoubleValue < 100.0d) {
                                    op5.a.getClass();
                                    w4(op5.b("use_stakesafe:sg_vip", "Use stakesafe on your next bet to protect your stake", null));
                                }
                            }
                        }
                    }
                }
            } else {
                n4(R0(), multiplierResponse);
                n4(S0(), multiplierResponse);
            }
        }
        if (((Boolean) ((x5a0) this.M2).getValue()).booleanValue() || (gviVar = this.z) == null) {
            return;
        }
        gviVar.V.setVisibility(8);
    }

    public final n6a J3(float f2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f3 = displayMetrics.heightPixels;
        float f4 = displayMetrics.widthPixels;
        Resources resources = getResources();
        resources.getClass();
        n6a n6aVarB = o6a.b(resources, f3, f4);
        if (f3 == 0.0f || f4 == 0.0f) {
            return n6aVarB;
        }
        Map mapC = vu80.c(f3, f4);
        Float f5 = (Float) mapC.get("bet_button_text");
        float fFloatValue = f5 != null ? f5.floatValue() : 1.15f;
        Float f6 = (Float) mapC.get("bet_currency_text");
        float fFloatValue2 = f6 != null ? f6.floatValue() : 0.95f;
        Float f7 = (Float) mapC.get("bet_amount_text");
        float fFloatValue3 = f7 != null ? f7.floatValue() : 1.15f;
        Float f8 = (Float) mapC.get("bet_card_hint_amt_height");
        float fFloatValue4 = (f8 != null ? f8.floatValue() : 0.186f) / 0.186f;
        Float f9 = (Float) mapC.get("bet_card_space_vertical");
        float fFloatValue5 = f9 != null ? f9.floatValue() * 0.5f : n6aVarB.a;
        float fFloatValue6 = f9 != null ? f9.floatValue() * 1.5f : n6aVarB.n;
        Float f10 = (Float) mapC.get("bet_card_space_horizontal");
        if (f10 == null) {
            f10 = n6aVarB.o;
        }
        Float f11 = f10;
        Float f12 = (Float) mapC.get("bet_card_amount_box_width");
        float fFloatValue7 = f12 != null ? f12.floatValue() : n6aVarB.p;
        Float f13 = (Float) mapC.get("bet_card_bet_btn_layout_width");
        float fFloatValue8 = f13 != null ? f13.floatValue() : n6aVarB.q;
        Float f14 = (Float) mapC.get("bet_card_amount_box_height");
        float fFloatValue9 = f14 != null ? f14.floatValue() : n6aVarB.r;
        Float f15 = (Float) mapC.get("bet_card_hint_amt_height");
        float fFloatValue10 = f15 != null ? f15.floatValue() : n6aVarB.s;
        Float f16 = (Float) mapC.get("bet_card_spacer_3");
        if (f16 == null) {
            f16 = n6aVarB.t;
        }
        Float f17 = f16;
        float f18 = n6aVarB.B * fFloatValue4;
        Float f19 = (Float) mapC.get("bet_card_minus_height");
        float f20 = fFloatValue2 * 1.2f;
        float f21 = fFloatValue3 * 0.85714287f;
        return n6a.a(n6aVarB, fFloatValue5, 0.0f, 0.0f, null, 0.0f, 0.0f, fFloatValue6, f11, fFloatValue7, fFloatValue8, fFloatValue9, fFloatValue10, f17, f2, f18, f19 != null ? f19.floatValue() : 0.59f, mapC.containsKey("bet_card_minus_width") ? 1.0f : n6aVarB.D, fFloatValue * 0.6f, f20, f21, fFloatValue * 0.75f, f20, f21, 16793598, 0);
    }

    @Override // defpackage.fgb
    public final boolean K2() {
        Context context;
        boolean z;
        if (z1() || ((Boolean) ((x5a0) c1().r0).getValue()).booleanValue() || (context = getContext()) == null) {
            z = false;
        } else {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "sporty-hero");
            if (arrayListA.isEmpty()) {
                z = true;
            } else {
                OnboardingItem onboardingItem = (OnboardingItem) CollectionsKt.V(0, arrayListA);
                z = !(onboardingItem != null ? Intrinsics.g(onboardingItem.getIsView(), Boolean.TRUE) : false);
            }
        }
        return z || t4();
    }

    public final void K3(c6c0 c6c0Var) {
        Context context;
        if (L2() && (context = getContext()) != null) {
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new d(null, this, c6c0Var, context), 3);
        }
    }

    @Override // defpackage.fgb
    public final void L1() {
        gvi gviVar;
        ((x5a0) this.M2).setValue(Boolean.TRUE);
        gvi gviVar2 = this.z;
        if (gviVar2 != null && gviVar2.c.getVisibility() == 0 && (gviVar = this.z) != null && gviVar.d.getVisibility() == 0) {
            gvi gviVar3 = this.z;
            if (gviVar3 != null) {
                gviVar3.b0.setVisibility(0);
            }
            gvi gviVar4 = this.z;
            if (gviVar4 != null) {
                gviVar4.U.setVisibility(0);
            }
            gvi gviVar5 = this.z;
            if (gviVar5 != null) {
                gviVar5.W.setVisibility(0);
            }
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                gviVar6.a0.setVisibility(0);
            }
            gvi gviVar7 = this.z;
            if (gviVar7 != null) {
                gviVar7.F.post(new Runnable() { // from class: jrb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        gvi gviVar8;
                        gvi gviVar9;
                        gvi gviVar10;
                        qub0 qub0Var = this.a;
                        gvi gviVar11 = qub0Var.z;
                        ((x5a0) qub0Var.G2).setValue(Boolean.valueOf(gviVar11 != null && gviVar11.c.getVisibility() == 0 && (gviVar8 = qub0Var.z) != null && gviVar8.d.getVisibility() == 0 && (gviVar9 = qub0Var.z) != null && gviVar9.b0.getVisibility() == 0 && (gviVar10 = qub0Var.z) != null && gviVar10.W.getVisibility() == 0));
                    }
                });
            }
        }
        b6c0 b6c0Var = this.h3;
        if (b6c0Var != b6c0.a) {
            q3(b6c0Var);
        }
        A4();
        i4();
    }

    @Override // defpackage.fgb
    public final boolean L2() {
        return O3() != null;
    }

    public final void L3(TurboUsageCountResponse turboUsageCountResponse, boolean z) {
        MultiplierResponse multiplierResponse = this.x0;
        if (multiplierResponse != null) {
            long roundId = multiplierResponse.getRoundId();
            MultiplierResponse multiplierResponse2 = this.x0;
            String messageType = multiplierResponse2 != null ? multiplierResponse2.getMessageType() : null;
            if (!z || turboUsageCountResponse == null) {
                ytw<StakeSafeUsageCountResponse> ytwVar = gci0.a;
                ytw<Boolean> ytwVar2 = gci0.o;
                Boolean bool = Boolean.FALSE;
                ((x5a0) ytwVar2).setValue(bool);
                ((x5a0) gci0.k).setValue(bool);
                R0().D1(false);
                S0().D1(false);
                return;
            }
            Long activateAfterRoundId = turboUsageCountResponse.getActivateAfterRoundId();
            if (activateAfterRoundId != null) {
                long jLongValue = activateAfterRoundId.longValue();
                if (!(roundId == jLongValue && Intrinsics.g(messageType, "ROUND_END_WAIT")) && roundId <= jLongValue) {
                    ytw<StakeSafeUsageCountResponse> ytwVar3 = gci0.a;
                    ((x5a0) gci0.o).setValue(Boolean.FALSE);
                    R0().D1(false);
                    S0().D1(false);
                    return;
                }
                ytw<StakeSafeUsageCountResponse> ytwVar4 = gci0.a;
                ((x5a0) gci0.o).setValue(Boolean.TRUE);
                R0().D1(true);
                S0().D1(true);
            }
        }
    }

    @Override // defpackage.fgb
    public final void N1(CampaignTopicResponse campaignTopicResponse) {
        qu80 qu80Var;
        MotionLayout motionLayout;
        androidx.constraintlayout.widget.b bVarK;
        if (Intrinsics.g(campaignTopicResponse.getCampaignStatus(), "ENDED")) {
            return;
        }
        if (campaignTopicResponse.isLastCampaignTier() && Intrinsics.g(campaignTopicResponse.getUserActivityStatus(), "ACTIVE")) {
            return;
        }
        if (!X3()) {
            ((t5a0) this.H2).A(-0.055f);
            return;
        }
        ShMultiplierContainer shMultiplierContainer = this.E2;
        if (shMultiplierContainer == null || !shMultiplierContainer.J || (qu80Var = shMultiplierContainer.binding) == null || (bVarK = (motionLayout = qu80Var.c).K(R.id.end)) == null) {
            return;
        }
        bVarK.j(R.id.hero_view_2, 0.14f);
        motionLayout.V(R.id.end, bVarK);
        motionLayout.requestLayout();
    }

    public final k6c0 N3() {
        return (k6c0) this.Q2.getValue();
    }

    @Override // defpackage.fgb
    public final List<LeftMenuButton> O0() {
        op5 op5Var = op5.a;
        String string = getString(R.string.top_wins_cms);
        string.getClass();
        String string2 = getString(R.string.top_wins_default);
        string2.getClass();
        op5Var.getClass();
        return kotlin.collections.a.c(new LeftMenuButton(0, op5.b(string, string2, null), R.drawable.sg_top_recent_wins, new MenuIconSize(R.dimen._13sdp, R.dimen._13sdp), new io70(this, 1), false, null, null, null, null, false, null, 3072, null));
    }

    @Override // defpackage.fgb
    public final void O1() {
        u3();
    }

    public final c6c0 O3() {
        return (c6c0) ((x5a0) this.C2).getValue();
    }

    @Override // defpackage.fgb
    public final boolean Q0() {
        return true;
    }

    @Override // defpackage.fgb
    public final boolean Q2() {
        return V3();
    }

    public final xdi0 Q3() {
        return (xdi0) this.R2.getValue();
    }

    @Override // defpackage.fgb
    public final void R1(boolean z) {
        a6c0 a6c0Var = this.d3;
        if (a6c0Var != null) {
            ((x5a0) a6c0Var.i).setValue(Boolean.valueOf(z));
        }
        a6c0 a6c0Var2 = this.d3;
        if (a6c0Var2 != null) {
            a6c0Var2.f(z);
        }
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.e0.setVisibility(z ? 0 : 8);
        }
    }

    @Override // defpackage.fgb
    public final boolean R2() {
        return V3();
    }

    public final void R3(TurboUsageCountResponse turboUsageCountResponse) {
        if (turboUsageCountResponse != null) {
            Double turboValue = turboUsageCountResponse.getTurboValue();
            if ((turboValue != null ? turboValue.doubleValue() : 0.0d) >= 100.0d) {
                r4(turboUsageCountResponse);
                L3(turboUsageCountResponse, true);
                return;
            }
        }
        q4();
        L3(turboUsageCountResponse, false);
    }

    @Override // defpackage.fgb
    public final boolean S2() {
        return V3();
    }

    public final boolean S3() {
        BetContainerState betContainerState = (BetContainerState) R0().a.getValue();
        BetContainerState betContainerState2 = (BetContainerState) S0().a.getValue();
        return betContainerState.getBetPlaced() && betContainerState.isTurboBet() && betContainerState2.getBetPlaced() && betContainerState2.isTurboBet();
    }

    @Override // defpackage.fgb
    public final void T1(ynj ynjVar) {
        gcb0 gcb0Var;
        boolean zX3 = X3();
        hnj hnjVar = ynjVar.b;
        boolean z = zX3 && (hnjVar == hnj.e || hnjVar == hnj.c);
        boolean z2 = hnjVar == hnj.e;
        if (z) {
            gcb0Var = new gcb0("lowend_wc_spine:sg_sporty_hero", z2 ? "https://s.sporty.net/common/main/res/521d7fc4c657fefe0fdf5b4eab47df50.zip" : "https://s.sporty.net/common/main/res/98f0586368b4e4c0222d9f3378f1c8e6.zip");
        } else if (zX3) {
            gcb0Var = new gcb0("lowend_sh_spine:sg_sporty_hero", "https://s.sporty.net/common/main/res/98f0586368b4e4c0222d9f3378f1c8e6.zip");
        } else {
            gcb0Var = z2 ? new gcb0("highend_wc_spine_v2:sg_sporty_hero", "https://s.sporty.net/common/main/res/145e1eae64c1628b44306fbae6d557e2.zip") : new gcb0("highend_sh_spine_v2:sg_sporty_hero", "https://s.sporty.net/common/main/res/49c40a9ce8daf61a08f0b099ecbac924.zip");
        }
        c6c0 c6c0Var = new c6c0(ynjVar, gcb0Var);
        ((x5a0) this.C2).setValue(c6c0Var);
        boolean z4 = c6c0Var.c;
        this.p0 = z4;
        ((x5a0) c1().k0).setValue(Boolean.valueOf(z4));
        ((x5a0) c1().l0).setValue(Boolean.valueOf(c6c0Var.d));
        ((x5a0) c1().m0).setValue(Boolean.valueOf(c6c0Var.e));
        v3(c6c0Var);
        ytw ytwVar = this.D2;
        if (!Intrinsics.g((c6c0) ((x5a0) ytwVar).getValue(), c6c0Var)) {
            ((x5a0) ytwVar).setValue(null);
        }
        ShMultiplierContainer shMultiplierContainer = this.E2;
        if (shMultiplierContainer != null) {
            shMultiplierContainer.setLowRamHeroMode(X3());
        }
        ShMultiplierContainer shMultiplierContainer2 = this.E2;
        if (shMultiplierContainer2 != null) {
            shMultiplierContainer2.setAssets();
        }
        u3();
        if (L2()) {
            K3(c6c0Var);
        }
    }

    public final void T3() {
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.s0.setVisibility(8);
        }
        ShMultiplierContainer shMultiplierContainer = this.E2;
        if (shMultiplierContainer != null) {
            shMultiplierContainer.setCoefficientsHiddenByVipSheet(false);
        }
    }

    @Override // defpackage.fgb
    public final void U2(String str) {
        ssw<Boolean> sswVar;
        ssw<Boolean> sswVar2;
        ssw<Boolean> sswVar3;
        super.U2(str);
        ab8 ab8Var = this.w1;
        if (ab8Var != null && (sswVar3 = ab8Var.O) != null) {
            sswVar3.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: ctb0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ssw<Boolean> sswVar4;
                    if (Intrinsics.g((Boolean) obj, Boolean.TRUE)) {
                        qub0 qub0Var = this.a;
                        qub0Var.U2("OVER_UNDER");
                        ab8 ab8Var2 = qub0Var.w1;
                        if (ab8Var2 != null && (sswVar4 = ab8Var2.O) != null) {
                            sswVar4.m(Boolean.FALSE);
                        }
                    }
                    return Unit.a;
                }
            }));
        }
        ab8 ab8Var2 = this.w1;
        if (ab8Var2 != null && (sswVar2 = ab8Var2.P) != null) {
            sswVar2.f(getViewLifecycleOwner(), new dvb0(new dfg(this, 2)));
        }
        ab8 ab8Var3 = this.w1;
        if (ab8Var3 == null || (sswVar = ab8Var3.Q) == null) {
            return;
        }
        sswVar.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: dtb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ssw<Boolean> sswVar4;
                if (Intrinsics.g((Boolean) obj, Boolean.TRUE)) {
                    qub0 qub0Var = this.a;
                    qub0Var.U2("CLASSIC");
                    ab8 ab8Var4 = qub0Var.w1;
                    if (ab8Var4 != null && (sswVar4 = ab8Var4.Q) != null) {
                        sswVar4.m(Boolean.FALSE);
                    }
                }
                return Unit.a;
            }
        }));
    }

    public final boolean V3() {
        CampaignParticipateV2 campaignParticipateV2 = this.z2;
        return campaignParticipateV2 != null && campaignParticipateV2.getCanConvert();
    }

    public final boolean W3() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        ArrayList<OnboardingItem> arrayListA = sny.a(context, "sporty-hero");
        if (arrayListA.size() <= 1) {
            return true;
        }
        return !Intrinsics.g(arrayListA.get(1).getIsView(), Boolean.TRUE);
    }

    public final boolean X3() {
        double d2 = this.y2;
        return d2 > 0.0d && d2 <= 3.0d;
    }

    public final boolean Y3() {
        gvi gviVar = this.z;
        if (gviVar != null && gviVar.p0.getVisibility() == 0) {
            gvi gviVar2 = this.z;
            if ((gviVar2 != null ? gviVar2.p0.getHeight() : 0) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean Z3() {
        Context context = getContext();
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("vip_elite_data", 0);
            sharedPreferences.getClass();
            try {
                String string = sharedPreferences.getString("one_time_fetch", null);
                if (string == null || string.length() == 0) {
                    try {
                        sharedPreferences.edit().putString("one_time_fetch", "onboarding_seen").apply();
                        return true;
                    } catch (Exception unused) {
                        return true;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // defpackage.fgb
    public final void a2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.revamp_cashout);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    public final void a4() {
        if (!isAdded() || isRemoving()) {
            return;
        }
        Object value = ((x5a0) gci0.t).getValue();
        Boolean bool = Boolean.TRUE;
        if (!Intrinsics.g(value, bool)) {
            b4();
            return;
        }
        fpb0 fpb0Var = this.W2;
        if (fpb0Var != null) {
            ((x5a0) fpb0Var.m).setValue(bool);
        }
        Context context = getContext();
        if (context == null) {
            b4();
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("vip_elite_data", 0);
        sharedPreferences.getClass();
        try {
            Calendar calendar = Calendar.getInstance();
            int i2 = calendar.get(1);
            int i3 = calendar.get(3);
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            sb.append('-');
            sb.append(i3);
            String string = sb.toString();
            String string2 = sharedPreferences.getString("weekly_fetch_date", null);
            if ((string2 == null || !string2.equals(string)) && z3()) {
                this.r3 = true;
                lei0 lei0VarO1 = o1();
                lei0VarO1.getClass();
                ej5.c(o8i0.d(lei0VarO1), null, null, new iei0(lei0VarO1, null), 3);
                return;
            }
        } catch (Exception unused) {
        }
        b4();
    }

    @Override // defpackage.fgb
    public final void b2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.revamp_fly_away);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    public final void b4() {
        gvi gviVar;
        ConstraintLayout constraintLayout;
        if (z1() || ((Boolean) ((x5a0) c1().r0).getValue()).booleanValue() || (gviVar = this.z) == null || (constraintLayout = gviVar.a) == null) {
            return;
        }
        constraintLayout.post(new Runnable() { // from class: irb0
            @Override // java.lang.Runnable
            public final void run() {
                qub0 qub0Var = this.a;
                if (!qub0Var.isAdded() || qub0Var.isRemoving() || qub0Var.getView() == null || qub0Var.z == null || ((Boolean) ((x5a0) qub0Var.c1().r0).getValue()).booleanValue() || qub0Var.t4()) {
                    return;
                }
                qub0Var.M1(false);
                if (qub0Var.D1) {
                    ((x5a0) qub0Var.m1).setValue(Boolean.TRUE);
                }
            }
        });
    }

    @Override // defpackage.fgb
    public final void c2() {
        String string;
        Context context = getContext();
        if (context != null) {
            c6c0 c6c0VarO3 = O3();
            if ((c6c0VarO3 != null && c6c0VarO3.c) || this.p0) {
                string = context.getString(R.string.bg_music_christmas);
                string.getClass();
            } else if (this.q0) {
                string = context.getString(R.string.bg_music_valentine);
                string.getClass();
            } else {
                string = context.getString(R.string.revamp_bg_music);
                string.getClass();
            }
            f4(context, string);
        }
    }

    @Override // defpackage.fgb
    public final void d2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.revamp_place_bet);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void d3() {
        x4(1, "VIP_ONBOARDING");
    }

    @Override // defpackage.fgb
    public final void e2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = ((Boolean) ((x5a0) c1().m0).getValue()).booleanValue() ? getString(R.string.whistle_sound) : getString(R.string.powering_up);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    public final void e4(int i2, Function0<Unit> function0) {
        gvi gviVar;
        Context context;
        if (W3() && (gviVar = this.z) != null && gviVar.V.getVisibility() == 0) {
            if (i2 == 0) {
                this.e = true;
            } else {
                this.f = true;
            }
            if (W3() && (context = getContext()) != null) {
                sny.c(context, this.J, 1, "sporty-hero");
                gvi gviVar2 = this.z;
                if (gviVar2 != null) {
                    gviVar2.V.setVisibility(8);
                }
                this.l0 = false;
                this.d = null;
                this.e = false;
                this.f = false;
            }
        }
        function0.invoke();
    }

    @Override // defpackage.fgb
    public final void f2() {
        Context context = getContext();
        if (context != null) {
            String string = context.getString(R.string.bg_music_valentine);
            string.getClass();
            f4(context, string);
        }
    }

    public final void f4(Context context, String str) {
        gvi gviVar = this.z;
        if (gviVar != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = context.getString(R.string.sh_name);
            string.getClass();
            progressMeterComponent.J("Hero/", string, (Boolean) ((x5a0) c1().u0).getValue(), rk60.b.f, this.i, context, l1(), (Boolean) ((x5a0) c1().t0).getValue(), str);
        }
    }

    @Override // defpackage.fgb
    public final void g2() {
        Context context = getContext();
        if (context != null) {
            String string = context.getString(R.string.bg_music_christmas);
            string.getClass();
            f4(context, string);
        }
    }

    public final void g4(List<TopBets> list, Integer num) {
        fpb0 fpb0Var = this.W2;
        if (fpb0Var != null) {
            fpb0Var.a(new RoundBetResponse(list.get(0).getRoundId(), num, new ArrayList(list), "", 0L, null));
        }
    }

    @Override // defpackage.fgb
    public final void h2() {
        SHRangeComponent sHRangeComponent;
        qv80 binding;
        SHRangeComponent sHRangeComponent2;
        qv80 binding2;
        SHRangeComponent sHRangeComponent3;
        SHOverBetComponent sHOverBetComponent;
        su80 binding3;
        SHOverBetComponent sHOverBetComponent2;
        su80 binding4;
        SHOverBetComponent sHOverBetComponent3;
        SideBetTabContainer sideBetTabContainer;
        ShMultiplierContainer shMultiplierContainer = this.E2;
        if (shMultiplierContainer != null) {
            shMultiplierContainer.setAssets();
        }
        ShMultiplierContainer shMultiplierContainer2 = this.E2;
        if (shMultiplierContainer2 != null) {
            op5 op5Var = op5.a;
            qu80 qu80Var = shMultiplierContainer2.binding;
            op5.r(op5Var, kotlin.collections.b.f(qu80Var != null ? qu80Var.e : null, qu80Var != null ? qu80Var.I : null, qu80Var != null ? qu80Var.J : null, qu80Var != null ? qu80Var.C : null), null, 6);
        }
        h4();
        a6c0 a6c0Var = this.d3;
        if (a6c0Var != null && (sideBetTabContainer = a6c0Var.j) != null) {
            sideBetTabContainer.a();
        }
        a6c0 a6c0Var2 = this.d3;
        if (a6c0Var2 != null && (sHOverBetComponent3 = a6c0Var2.k) != null) {
            op5 op5Var2 = op5.a;
            hw80 hw80Var = sHOverBetComponent3.binding.e;
            op5.r(op5Var2, kotlin.collections.b.f(hw80Var.b, hw80Var.e), null, 6);
            String string = sHOverBetComponent3.binding.e.b.getText().toString();
            String string2 = sHOverBetComponent3.binding.e.e.getText().toString();
            sHOverBetComponent3.binding.e.b.setText(krh0.m(string).concat(" 1"));
            sHOverBetComponent3.binding.e.e.setText(krh0.m(string2).concat(" 2"));
        }
        a6c0 a6c0Var3 = this.d3;
        if (a6c0Var3 != null && (sHOverBetComponent2 = a6c0Var3.k) != null && (binding4 = sHOverBetComponent2.getBinding()) != null) {
            binding4.b.n();
        }
        a6c0 a6c0Var4 = this.d3;
        if (a6c0Var4 != null && (sHOverBetComponent = a6c0Var4.k) != null && (binding3 = sHOverBetComponent.getBinding()) != null) {
            binding3.c.n();
        }
        a6c0 a6c0Var5 = this.d3;
        if (a6c0Var5 != null && (sHRangeComponent3 = a6c0Var5.l) != null) {
            op5 op5Var3 = op5.a;
            hw80 hw80Var2 = sHRangeComponent3.binding.e;
            op5.r(op5Var3, kotlin.collections.b.f(hw80Var2.b, hw80Var2.e), null, 6);
            String string3 = sHRangeComponent3.binding.e.b.getText().toString();
            String string4 = sHRangeComponent3.binding.e.e.getText().toString();
            sHRangeComponent3.binding.e.b.setText(krh0.m(string3).concat(" 1"));
            sHRangeComponent3.binding.e.e.setText(krh0.m(string4).concat(" 2"));
        }
        a6c0 a6c0Var6 = this.d3;
        if (a6c0Var6 != null && (sHRangeComponent2 = a6c0Var6.l) != null && (binding2 = sHRangeComponent2.getBinding()) != null) {
            binding2.c.s();
        }
        a6c0 a6c0Var7 = this.d3;
        if (a6c0Var7 == null || (sHRangeComponent = a6c0Var7.l) == null || (binding = sHRangeComponent.getBinding()) == null) {
            return;
        }
        binding.d.s();
    }

    public final void h4() {
        fpb0 fpb0Var = this.W2;
        if (fpb0Var != null) {
            op5 op5Var = op5.a;
            String strM1 = m1(R.string.all_bets_cms);
            op5Var.getClass();
            String strB = op5.b(strM1, "All Bets", null);
            String strB2 = op5.b(m1(R.string.my_bets_cms), "My Bets", null);
            String strB3 = op5.b(m1(R.string.top_win_cms), "Top Wins", null);
            ((x5a0) fpb0Var.i).setValue(strB);
            ((x5a0) fpb0Var.j).setValue(strB2);
            ((x5a0) fpb0Var.k).setValue(strB3);
            ((x5a0) fpb0Var.l).setValue("Hero's Elite");
        }
    }

    @Override // defpackage.fgb
    /* JADX INFO: renamed from: i2, reason: from getter */
    public final String getB2() {
        return this.A2;
    }

    public final void i4() {
        Context context;
        if (!A1() || (context = getContext()) == null || z1()) {
            return;
        }
        gvi gviVar = this.z;
        if ((gviVar == null || gviVar.Y.getVisibility() != 0) && !t4()) {
            ArrayList<OnboardingItem> arrayListA = sny.a(context, "sporty-hero");
            int size = arrayListA.size();
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = 0;
                    z = true;
                    break;
                } else if (!Intrinsics.g(arrayListA.get(i2).getIsView(), Boolean.TRUE)) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z || i2 > 0) {
                c4(this);
            } else {
                u4(i2);
            }
        }
    }

    @Override // defpackage.fgb
    public final void j0(final int i2, final int i3, androidx.compose.runtime.a aVar, final Function0 function0) {
        function0.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-98184844);
        int i4 = (bVarI.d(i2) ? 4 : 2) | i3 | (bVarI.A(function0) ? 32 : 16) | (bVarI.A(this) ? 256 : 128);
        if (bVarI.q(i4 & 1, (i4 & 147) != 146)) {
            gvi gviVar = this.z;
            boolean z = gviVar != null && gviVar.f0.getVisibility() == 0;
            String str = (String) ((x5a0) c1().v).getValue();
            mz1 mz1VarB1 = b1();
            boolean zBooleanValue = ((Boolean) ((x5a0) c1().l0).getValue()).booleanValue();
            boolean zBooleanValue2 = false;
            double d2 = this.y2;
            Boolean bool = (Boolean) ((x5a0) gci0.h).getValue();
            if (bool != null) {
                zBooleanValue2 = bool.booleanValue();
            }
            afa.c(str, mz1VarB1, zBooleanValue, i2, function0, d2, z, zBooleanValue2, bVarI, 64512 & (i4 << 9), 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2, function0, i3) { // from class: lsb0
                public final /* synthetic */ int b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.j0(this.b, iA, (a) obj, this.c);
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.fgb
    /* JADX INFO: renamed from: j2, reason: from getter */
    public final CampaignParticipateV2 getA2() {
        return this.z2;
    }

    public final void j4() {
        gvi gviVar;
        a6c0 a6c0Var;
        SHOverBetComponent sHOverBetComponent;
        SHRangeComponent sHRangeComponent;
        boolean zY3 = Y3();
        fd90 fd90Var = this.e3;
        if (fd90Var != null && (sHOverBetComponent = (a6c0Var = fd90Var.b).k) != null && (sHRangeComponent = a6c0Var.l) != null) {
            DisplayMetrics displayMetrics = fd90Var.a.getResources().getDisplayMetrics();
            float f2 = displayMetrics.heightPixels;
            float f3 = displayMetrics.widthPixels;
            if (f2 != 0.0f && f3 != 0.0f) {
                sHOverBetComponent.setBetButtonsHeight(zY3, f2, f3);
                sHRangeComponent.setBetButtonsHeight(zY3, f2, f3);
            }
        }
        if (this.h3 == b6c0.a || (gviVar = this.z) == null) {
            return;
        }
        ConstraintLayout constraintLayout = gviVar.F;
        androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
        bVar.f(constraintLayout);
        bVar.e(R.id.side_bet_content_view, 4);
        bVar.j(R.id.side_bet_content_view, E3(zY3));
        bVar.b(constraintLayout);
        constraintLayout.requestLayout();
    }

    public final void k4() {
        ValueAnimator valueAnimator;
        if (Intrinsics.g(this.m3, Boolean.TRUE) && (valueAnimator = this.l3) != null && valueAnimator.isRunning()) {
            return;
        }
        u5a0 u5a0Var = (u5a0) this.g3;
        if (u5a0Var.D() == 1 && this.j3 == y3) {
            return;
        }
        u5a0Var.k(1);
        o3(this, y3, 0.2f, true);
        ((t5a0) wag0.j).A(0.37f);
        ((x5a0) wag0.k).setValue(Integer.valueOf(R.dimen._50ssp));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fe, code lost:
    
        if (r11.o() == r1) goto L43;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l4(android.view.View r10, android.content.SharedPreferences r11, boolean r12, boolean r13, defpackage.x1b r14) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qub0.l4(android.view.View, android.content.SharedPreferences, boolean, boolean, x1b):java.lang.Object");
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
        RoundResponse.WaitingRound ongoingRound;
        if (((roundResponse == null || (ongoingRound = roundResponse.getOngoingRound()) == null) ? null : Long.valueOf(ongoingRound.getId())) != null) {
            k6c0 k6c0VarN3 = N3();
            k6c0VarN3.getClass();
            ej5.c(o8i0.d(k6c0VarN3), null, null, new f6c0(k6c0VarN3, null), 3);
        } else {
            k6c0 k6c0VarN4 = N3();
            k6c0VarN4.getClass();
            ej5.c(o8i0.d(k6c0VarN4), null, null, new j6c0(k6c0VarN4, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:158:0x031c  */
    /* JADX WARN: Code duplicated, block: B:159:0x0320  */
    /* JADX WARN: Code duplicated, block: B:164:0x0341  */
    /* JADX WARN: Code duplicated, block: B:181:0x03c2  */
    public final void n3(final int i2, androidx.compose.runtime.a aVar, final String str, final String str2, final boolean z, final boolean z2) {
        Object obj;
        boolean z4;
        int i3;
        Object aVar2;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        final osw oswVar;
        boolean z5;
        String str3;
        androidx.compose.runtime.a.C0041a.C0042a c0042a2;
        final isw iswVar;
        final wd0 wd0Var;
        final wd0 wd0Var2;
        final wd0 wd0Var3;
        Object bVar;
        final osw oswVar2;
        final osw oswVar3;
        Object objY;
        Object obj2;
        int iHashCode;
        tsr.a aVar3;
        yka.a.C1350a c1350a;
        final c8n c8nVar;
        boolean z6;
        Object obj3;
        androidx.compose.runtime.b bVarI = aVar.i(280498649);
        int i4 = i2 | (bVarI.M(str) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.M(str2) ? 256 : 128) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.A(this) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        if (bVarI.q(i4 & 1, (i4 & 9363) != 9362)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object objY2 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a3 = androidx.compose.runtime.a.C0041a.a;
            if (objY2 == c0042a3) {
                obj = objY2;
                osw oswVarA = androidx.compose.runtime.k.a(0);
                bVarI.r(oswVarA);
                obj = oswVarA;
            }
            obj = objY2;
            osw oswVar4 = (osw) obj;
            Object objY3 = bVarI.y();
            Object obj4 = objY3;
            if (objY3 == c0042a3) {
                osw oswVarA2 = androidx.compose.runtime.k.a(0);
                bVarI.r(oswVarA2);
                obj4 = oswVarA2;
            }
            osw oswVar5 = (osw) obj4;
            int i5 = i4 & 14;
            if (i5 == 4) {
                i3 = 0;
                z4 = true;
            } else {
                z4 = false;
                i3 = 0;
            }
            Object objY4 = bVarI.y();
            Object obj5 = objY4;
            if (z4 || objY4 == c0042a3) {
                ytw ytwVarB = androidx.compose.runtime.m.b(null);
                bVarI.r(ytwVarB);
                obj5 = ytwVarB;
            }
            ytw ytwVar = (ytw) obj5;
            int i6 = i5 == 4 ? 1 : i3;
            Object objY5 = bVarI.y();
            Object obj6 = objY5;
            if (i6 != 0 || objY5 == c0042a3) {
                osw oswVarA3 = androidx.compose.runtime.k.a(i3);
                bVarI.r(oswVarA3);
                obj6 = oswVarA3;
            }
            osw oswVar6 = (osw) obj6;
            int i7 = i4 & 112;
            int i8 = (i5 == 4 ? 1 : i3) | (i7 == 32 ? 1 : i3);
            Object objY6 = bVarI.y();
            Object obj7 = objY6;
            if (i8 != 0 || objY6 == c0042a3) {
                wd0 wd0VarA = ee0.a(0.0f);
                bVarI.r(wd0VarA);
                obj7 = wd0VarA;
            }
            wd0 wd0Var4 = (wd0) obj7;
            int i9 = (i5 == 4 ? 1 : i3) | (i7 == 32 ? 1 : i3);
            Object objY7 = bVarI.y();
            Object obj8 = objY7;
            if (i9 != 0 || objY7 == c0042a3) {
                wd0 wd0VarA2 = ee0.a(0.0f);
                bVarI.r(wd0VarA2);
                obj8 = wd0VarA2;
            }
            wd0 wd0Var5 = (wd0) obj8;
            int i10 = (i7 == 32 ? 1 : i3) | (i5 == 4 ? 1 : i3);
            Object objY8 = bVarI.y();
            Object obj9 = objY8;
            if (i10 != 0 || objY8 == c0042a3) {
                wd0 wd0VarA3 = ee0.a(1.0f);
                bVarI.r(wd0VarA3);
                obj9 = wd0VarA3;
            }
            wd0 wd0Var6 = (wd0) obj9;
            int i11 = i7 == 32 ? 1 : i3;
            Object objY9 = bVarI.y();
            Object obj10 = objY9;
            if (i11 != 0 || objY9 == c0042a3) {
                isw iswVarA = androidx.compose.runtime.j.a(1.0f);
                bVarI.r(iswVarA);
                obj10 = iswVarA;
            }
            final isw iswVar2 = (isw) obj10;
            int i12 = i7 == 32 ? 1 : i3;
            Object objY10 = bVarI.y();
            Object obj11 = objY10;
            if (i12 != 0 || objY10 == c0042a3) {
                isw iswVarA2 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(iswVarA2);
                obj11 = iswVarA2;
            }
            isw iswVar3 = (isw) obj11;
            int i13 = i7 == 32 ? 1 : i3;
            Object objY11 = bVarI.y();
            Object obj12 = objY11;
            if (i13 != 0 || objY11 == c0042a3) {
                isw iswVarA3 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(iswVarA3);
                obj12 = iswVarA3;
            }
            isw iswVar4 = (isw) obj12;
            int i14 = (i5 == 4 ? 1 : i3) | (i7 == 32 ? 1 : i3);
            Object objY12 = bVarI.y();
            Object obj13 = objY12;
            if (i14 != 0 || objY12 == c0042a3) {
                ytw ytwVarB2 = androidx.compose.runtime.m.b(Boolean.FALSE);
                bVarI.r(ytwVarB2);
                obj13 = ytwVarB2;
            }
            ytw ytwVar2 = (ytw) obj13;
            Integer numValueOf = Integer.valueOf(oswVar5.D());
            boolean z7 = (((((i5 == 4 ? 1 : i3) | (bVarI.A(context) ? 1 : 0)) == true ? 1 : 0) | (bVarI.M(oswVar6) ? 1 : 0)) | (bVarI.M(ytwVar) ? 1 : 0) ? 1 : 0) | (bVarI.A(this) ? 1 : 0);
            Object objY13 = bVarI.y();
            if (z7 != 0 || objY13 == c0042a3) {
                c0042a = c0042a3;
                oswVar = oswVar6;
                z5 = true;
                aVar2 = new a(str, context, this, oswVar5, oswVar, ytwVar, null);
                str3 = str;
                bVarI.r(aVar2);
            } else {
                str3 = str;
                aVar2 = objY13;
                c0042a = c0042a3;
                oswVar = oswVar6;
                z5 = true;
            }
            xvf.g(str3, numValueOf, (Function2) aVar2, bVarI);
            boolean z8 = z5;
            Object[] objArr = {str2, Integer.valueOf(oswVar.D()), Integer.valueOf(oswVar4.D()), Integer.valueOf(oswVar5.D()), Boolean.valueOf(z), Boolean.valueOf(z2)};
            boolean zM = ((i4 & 7168) == 2048 ? z8 : false) | bVarI.M(oswVar) | bVarI.M(r26) | bVarI.M(iswVar2) | (i7 == 32 ? z8 : false);
            isw iswVar5 = iswVar3;
            boolean zM2 = ((i4 & 896) == 256) | zM | bVarI.M(iswVar5) | bVarI.M(iswVar4) | bVarI.A(wd0Var6) | bVarI.A(wd0Var4) | bVarI.A(wd0Var5);
            Object objY14 = bVarI.y();
            if (zM2) {
                c0042a2 = c0042a;
            } else {
                c0042a2 = c0042a;
                if (objY14 != c0042a2) {
                    iswVar = iswVar4;
                    wd0Var3 = wd0Var6;
                    wd0Var2 = wd0Var4;
                    wd0Var = wd0Var5;
                    bVar = objY14;
                    oswVar3 = oswVar5;
                    oswVar2 = oswVar4;
                }
                xvf.h(objArr, (Function2) bVar, bVarI);
                androidx.compose.ui.d.a aVar4 = androidx.compose.ui.d.a.b;
                androidx.compose.ui.d dVarB = ls7.b(androidx.compose.foundation.layout.j.e(aVar4, 1.0f));
                objY = bVarI.y();
                obj2 = objY;
                if (objY == c0042a2) {
                    Function1 function1 = new Function1() { // from class: ysb0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj14) {
                            urr urrVar = (urr) obj14;
                            urrVar.getClass();
                            oswVar2.k((int) (urrVar.a() >> 32));
                            oswVar3.k((int) (urrVar.a() & 4294967295L));
                            return Unit.a;
                        }
                    };
                    bVarI.r(function1);
                    obj2 = function1;
                }
                androidx.compose.ui.d dVarA = v.a(dVarB, (Function1) obj2);
                aiv aivVarC = g75.c(ht.a.a, false);
                final isw iswVar6 = iswVar5;
                iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
                yka.k.getClass();
                aVar3 = yka.a.b;
                bVarI.D();
                osw oswVar7 = oswVar3;
                if (bVarI.S) {
                    bVarI.F(aVar3);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                c8nVar = (c8n) ytwVar.getValue();
                if (c8nVar != null || oswVar.D() <= 0 || oswVar7.D() <= 0) {
                    z6 = false;
                    bVarI.N(1092609123);
                } else {
                    bVarI.N(1276320331);
                    androidx.compose.ui.d dVarE = androidx.compose.foundation.layout.j.e(aVar4, 1.0f);
                    boolean zA = bVarI.A(wd0Var3) | bVarI.M(iswVar2) | bVarI.M(iswVar6) | bVarI.M(iswVar);
                    Object objY15 = bVarI.y();
                    if (zA || objY15 == c0042a2) {
                        obj3 = objY15;
                        Function1 function2 = new Function1() { // from class: zsb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj14) {
                                a7l a7lVar = (a7l) obj14;
                                a7lVar.getClass();
                                a7lVar.b(((Number) wd0Var3.d()).floatValue());
                                isw iswVar7 = iswVar2;
                                a7lVar.k(iswVar7.j());
                                a7lVar.v(iswVar7.j());
                                a7lVar.B(iswVar6.j());
                                a7lVar.f(iswVar.j());
                                return Unit.a;
                            }
                        };
                        bVarI.r(function2);
                        obj3 = function2;
                    }
                    androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(dVarE, (Function1) obj3);
                    boolean zM3 = bVarI.M(oswVar) | bVarI.A(wd0Var2) | bVarI.A(wd0Var) | bVarI.A(c8nVar);
                    Object objY16 = bVarI.y();
                    Object obj14 = objY16;
                    if (zM3 || objY16 == c0042a2) {
                        Function1 function3 = new Function1() { // from class: atb0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj15) {
                                tcf tcfVar = (tcf) obj15;
                                tcfVar.getClass();
                                osw oswVar8 = oswVar;
                                float fFloatValue = ((Number) wd0Var2.d()).floatValue() * oswVar8.D();
                                float fFloatValue2 = ((Number) wd0Var.d()).floatValue() * Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L));
                                int iB = ycv.b(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                                long jB = (((long) ycv.b(fFloatValue)) << 32) | (((long) ycv.b(fFloatValue2)) & 4294967295L);
                                long j2 = ((long) iB) & 4294967295L;
                                long jD = (((long) oswVar8.D()) << 32) | j2;
                                c8n c8nVar2 = c8nVar;
                                tcf.J1(tcfVar, c8nVar2, 0L, 0L, jB, jD, 0.0f, null, null, 0, 0, 998);
                                tcf.J1(tcfVar, c8nVar2, 0L, 0L, (((long) ycv.b(fFloatValue - oswVar8.D())) << 32) | (((long) ycv.b(fFloatValue2)) & 4294967295L), (((long) oswVar8.D()) << 32) | j2, 0.0f, null, null, 0, 0, 998);
                                return Unit.a;
                            }
                        };
                        bVarI.r(function3);
                        obj14 = function3;
                    }
                    z6 = false;
                    rxo.b(dVarA2, (Function1) obj14, bVarI, 0);
                }
                bVarI.X(z6);
                bVarI.X(true);
            }
            wd0Var3 = wd0Var6;
            wd0Var2 = wd0Var4;
            wd0Var = wd0Var5;
            bVar = new b(z2, z, wd0Var3, wd0Var2, wd0Var, str2, oswVar, oswVar4, oswVar5, ytwVar2, iswVar2, iswVar5, iswVar4, null);
            oswVar2 = oswVar4;
            oswVar3 = oswVar5;
            iswVar2 = iswVar2;
            iswVar5 = iswVar5;
            iswVar = iswVar4;
            bVarI.r(bVar);
            xvf.h(objArr, (Function2) bVar, bVarI);
            androidx.compose.ui.d.a aVar5 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarB2 = ls7.b(androidx.compose.foundation.layout.j.e(aVar5, 1.0f));
            objY = bVarI.y();
            obj2 = objY;
            if (objY == c0042a2) {
                Function1 function4 = new Function1() { // from class: ysb0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj15) {
                        urr urrVar = (urr) obj15;
                        urrVar.getClass();
                        oswVar2.k((int) (urrVar.a() >> 32));
                        oswVar3.k((int) (urrVar.a() & 4294967295L));
                        return Unit.a;
                    }
                };
                bVarI.r(function4);
                obj2 = function4;
            }
            androidx.compose.ui.d dVarA3 = v.a(dVarB2, (Function1) obj2);
            aiv aivVarC2 = g75.c(ht.a.a, false);
            final isw iswVar7 = iswVar5;
            iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            androidx.compose.ui.d dVarC2 = androidx.compose.ui.c.c(bVarI, dVarA3);
            yka.k.getClass();
            aVar3 = yka.a.b;
            bVarI.D();
            osw oswVar8 = oswVar3;
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, yka.a.f);
            hlh0.a(bVarI, ne00VarS2, yka.a.e);
            c1350a = yka.a.g;
            if (bVarI.S) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            } else {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            c8nVar = (c8n) ytwVar.getValue();
            if (c8nVar != null) {
                z6 = false;
                bVarI.N(1092609123);
            } else {
                z6 = false;
                bVarI.N(1092609123);
            }
            bVarI.X(z6);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, z, str2, z2, i2) { // from class: btb0
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj15, Object obj16) {
                    ((Integer) obj16).getClass();
                    int iA = qj40.a(1);
                    this.a.n3(iA, (a) obj15, this.b, this.d, this.c, this.e);
                    return Unit.a;
                }
            };
        }
    }

    public final void n4(ul2 ul2Var, MultiplierResponse multiplierResponse) {
        if (((BetContainerState) ul2Var.a.getValue()).getRoundId() == multiplierResponse.getRoundId() && B3(ul2Var)) {
            ArrayList arrayListC3 = C3(ul2Var);
            ArrayList arrayList = new ArrayList(l48.r(arrayListC3, 10));
            int size = arrayListC3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayListC3.get(i2);
                i2++;
                arrayList.add(String.valueOf(((Number) obj).longValue()));
            }
            if (arrayList.isEmpty()) {
                return;
            }
            long jLongValue = ul2Var.L.getValue().longValue();
            loa0 loa0VarK1 = k1();
            loa0VarK1.getClass();
            if (jLongValue <= 0 || arrayList.isEmpty()) {
                return;
            }
            StringBuilder sbA = b0.a(jLongValue, "{\"betId\":", ",\"tournamentIds\":[", CollectionsKt.a0(arrayList, ",", null, null, new s6a(2), 30));
            sbA.append("]}");
            String string = sbA.toString();
            usm usmVar = loa0VarK1.b;
            brb brbVar = brb.E;
            usm.g(usmVar, brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6), string);
        }
    }

    public final void o4(ul2 ul2Var, MultiplierResponse multiplierResponse) {
        if (((BetContainerState) ul2Var.a.getValue()).getRoundId() == multiplierResponse.getRoundId() && B3(ul2Var)) {
            xdi0 xdi0VarQ3 = Q3();
            long jLongValue = ul2Var.L.getValue().longValue();
            Boolean boolValueOf = Boolean.valueOf(((BetContainerState) ul2Var.a.getValue()).isStakeSafeApplied());
            ArrayList arrayListC3 = C3(ul2Var);
            xdi0VarQ3.getClass();
            if (jLongValue <= 0) {
                return;
            }
            boolean zEquals = boolValueOf.equals(Boolean.TRUE);
            String strA0 = CollectionsKt.a0(arrayListC3, null, "[", "]", null, 57);
            StringBuilder sb = new StringBuilder("{\"betId\":");
            sb.append(jLongValue);
            sb.append(",\"stakeSafeUsed\":");
            sb.append(zEquals);
            String strA = pr0.a(sb, ",\"tournamentIds\":", strA0, "}");
            usm usmVar = xdi0VarQ3.b;
            brb brbVar = brb.M;
            usm.g(usmVar, brbVar, tzm.a(xdi0VarQ3.c, brbVar, null, 6), strA);
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        jvd0 jvd0Var = this.q3;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.q3 = null;
        this.r3 = false;
        ValueAnimator valueAnimator = this.l3;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        gvi gviVar = this.z;
        jsb0 jsb0Var = this.w3;
        if (gviVar != null) {
            gviVar.c.removeOnLayoutChangeListener(jsb0Var);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.d.removeOnLayoutChangeListener(jsb0Var);
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.V.removeOnLayoutChangeListener(jsb0Var);
        }
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.W.removeOnLayoutChangeListener(this.x3);
        }
        this.E2 = null;
        a6c0 a6c0Var = this.d3;
        if (a6c0Var != null) {
            a6c0Var.j = null;
            a6c0Var.k = null;
            a6c0Var.l = null;
            a6c0Var.m = null;
            a6c0Var.n = null;
            a6c0Var.o = null;
            a6c0Var.p = null;
            a6c0Var.r = false;
            a6c0Var.q = false;
        }
        this.d3 = null;
        this.a3 = false;
        this.b3 = false;
        this.c3 = false;
        yw80 yw80Var = this.f3;
        if (yw80Var != null) {
            yw80Var.dismiss();
        }
        this.f3 = null;
        this.T2.clear();
        ssw<List<TournamentConfigVO>> sswVar = wag0.a;
        m2g m2gVar = m2g.a;
        sswVar.m(m2gVar);
        wag0.b.m(null);
        wag0.c.m(m2gVar);
        wag0.d.m(null);
        wag0.e.m(new HashMap<>());
        ((x5a0) wag0.f).setValue(new HashMap());
        ((x5a0) wag0.g).setValue(new HashMap());
        ((x5a0) wag0.h).setValue(Boolean.FALSE);
        super.onDestroyView();
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onResume() {
        this.S2 = true;
        super.onResume();
        this.B2 = Long.valueOf(SystemClock.elapsedRealtime());
        Boolean bool = Boolean.FALSE;
        ((x5a0) this.G2).setValue(bool);
        b6c0 b6c0Var = this.h3;
        if (b6c0Var != b6c0.a) {
            q3(b6c0Var);
        }
        a6c0 a6c0Var = this.d3;
        if (a6c0Var != null) {
            a6c0Var.c();
        }
        ((x5a0) c1().i0).setValue(bool);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onStop() {
        Double dValueOf;
        double dRint;
        xnh0 user;
        Long l2 = this.B2;
        if (l2 != null) {
            if (!V3()) {
                l2 = null;
            }
            if (l2 != null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime() - l2.longValue();
                l1z l1zVarE1 = e1();
                GameDetails gameDetails = this.i;
                Integer id = gameDetails != null ? gameDetails.getId() : null;
                String str = (String) ((x5a0) c1().v).getValue();
                SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
                String str2 = (sportyGamesManager == null || (user = sportyGamesManager.getUser()) == null) ? null : user.b;
                Context context = getContext();
                if (context != null) {
                    Double d2 = fie.a;
                    if (d2 != null) {
                        dRint = d2.doubleValue();
                    } else {
                        Object systemService = context.getSystemService("activity");
                        systemService.getClass();
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) systemService).getMemoryInfo(memoryInfo);
                        dRint = Math.rint((memoryInfo.totalMem / 1.073741824E9d) * 100.0d) / 100.0d;
                        fie.a = Double.valueOf(dRint);
                    }
                    dValueOf = Double.valueOf(dRint);
                } else {
                    dValueOf = null;
                }
                Context context2 = getContext();
                l1zVarE1.n(jElapsedRealtime, id, str, str2, dValueOf, context2 != null ? krh0.j(context2) : null, "Native");
            }
        }
        this.B2 = null;
        ((x5a0) this.M2).setValue(Boolean.FALSE);
        super.onStop();
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e5  */
    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u6i0.c cVar;
        gvi gviVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        double dV1 = 0.0d;
        if (this.y2 <= 0.0d) {
            androidx.fragment.app.e activity = getActivity();
            if ((activity instanceof GameMainActivity ? (GameMainActivity) activity : null) != null) {
                Context contextRequireContext = requireContext();
                contextRequireContext.getClass();
                dV1 = uy1.v1(contextRequireContext);
            }
            this.y2 = dV1;
        }
        SportyGamesManager.setGameName("sporty_hero");
        op5.a.getClass();
        op5.c = "sg_sporty_hero";
        gvi gviVar2 = this.z;
        int i2 = 0;
        int i3 = 1;
        if (gviVar2 != null) {
            ConstraintLayout constraintLayout = gviVar2.F;
            Resources resources = constraintLayout.getResources();
            gvi gviVar3 = this.z;
            ViewGroup.LayoutParams layoutParams = gviVar3 != null ? gviVar3.l0.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.S = D3();
                gvi gviVar4 = this.z;
                if (gviVar4 != null) {
                    gviVar4.l0.setLayoutParams(layoutParams2);
                }
            }
            resources.getClass();
            float dimension = resources.getDimension(R.dimen.z_depth_low);
            float dimension2 = resources.getDimension(R.dimen.z_depth_high);
            float f2 = dimension - 1.0f;
            gvi gviVar5 = this.z;
            if (gviVar5 != null) {
                gviVar5.W.setTranslationZ(dimension);
            }
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                gviVar6.c.setTranslationZ(dimension);
            }
            gvi gviVar7 = this.z;
            if (gviVar7 != null) {
                gviVar7.d.setTranslationZ(dimension);
            }
            gvi gviVar8 = this.z;
            if (gviVar8 != null) {
                gviVar8.v.setTranslationZ(f2);
            }
            gvi gviVar9 = this.z;
            if (gviVar9 != null) {
                gviVar9.w.setTranslationZ(f2);
            }
            gvi gviVar10 = this.z;
            if (gviVar10 != null) {
                gviVar10.o0.setTranslationZ(f2);
            }
            gvi gviVar11 = this.z;
            if (gviVar11 != null) {
                gviVar11.e0.setTranslationZ(f2);
            }
            gvi gviVar12 = this.z;
            if (gviVar12 != null) {
                gviVar12.L.setTranslationZ(dimension2);
            }
            Context context = getContext();
            if (context != null) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f3 = displayMetrics.heightPixels;
                float f4 = displayMetrics.widthPixels;
                if (f3 != 0.0f && f4 != 0.0f) {
                    float f5 = f3 / f4;
                    Double dValueOf = Double.valueOf(0.39625d);
                    Map mapB = jpu.b(new Pair("hero_layout_height", dValueOf));
                    if (f5 >= 2.1f) {
                        mapB = jpu.b(new Pair("hero_layout_height", Double.valueOf(0.43525d)));
                    } else if (f5 >= 2.0f) {
                        mapB = jpu.b(new Pair("hero_layout_height", Double.valueOf(0.4338d)));
                    } else if (f5 >= 1.5f) {
                        mapB = jpu.b(new Pair("hero_layout_height", dValueOf));
                    }
                    Map mapA = vu80.a(f3, f4);
                    Double d2 = (Double) mapB.get("hero_layout_height");
                    float fDoubleValue = d2 != null ? (float) d2.doubleValue() : y3;
                    Float f6 = (Float) mapA.get("vertical_spacer");
                    float fFloatValue = fDoubleValue - (f6 != null ? f6.floatValue() : 0.00625f);
                    if (fFloatValue < 0.092f) {
                        fFloatValue = 0.092f;
                    }
                    y3 = fFloatValue;
                }
            }
            Context context2 = getContext();
            if (context2 != null) {
                DisplayMetrics displayMetrics2 = context2.getResources().getDisplayMetrics();
                float f7 = displayMetrics2.heightPixels;
                float f8 = displayMetrics2.widthPixels;
                if (f7 != r6 && f8 != 0) {
                    Float f9 = (Float) vu80.d(f7, f8).get("side_bet_tab_height");
                    float fFloatValue2 = f9 != null ? f9.floatValue() : 0.0375f;
                    gvi gviVar13 = this.z;
                    ViewGroup.LayoutParams layoutParams3 = gviVar13 != null ? gviVar13.f0.getLayoutParams() : null;
                    ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.S = fFloatValue2;
                        gvi gviVar14 = this.z;
                        if (gviVar14 != null) {
                            gviVar14.f0.setLayoutParams(layoutParams4);
                        }
                        gvi gviVar15 = this.z;
                        ViewGroup.LayoutParams layoutParams5 = gviVar15 != null ? gviVar15.e0.getLayoutParams() : null;
                        ConstraintLayout.LayoutParams layoutParams6 = layoutParams5 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams5 : null;
                        if (layoutParams6 != null) {
                            layoutParams6.S = fFloatValue2;
                            gvi gviVar16 = this.z;
                            if (gviVar16 != null) {
                                gviVar16.e0.setLayoutParams(layoutParams6);
                            }
                        }
                    }
                }
            }
            Context context3 = getContext();
            if (context3 != null) {
                DisplayMetrics displayMetrics3 = context3.getResources().getDisplayMetrics();
                float f10 = displayMetrics3.heightPixels;
                float f11 = displayMetrics3.widthPixels;
                if (f10 != r6 && f11 != r6) {
                    Float f12 = (Float) vu80.a(f10, f11).get("bet_card_height");
                    z3 = f12 != null ? f12.floatValue() : z3;
                }
            }
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.f(constraintLayout);
            bVar.e(R.id.multiplier_view, 3);
            bVar.g(R.id.multiplier_view, 3, R.id.round_view, 4);
            bVar.j(R.id.multiplier_view, y3);
            int height = constraintLayout.getHeight();
            Integer numValueOf = Integer.valueOf(height);
            if (height <= 0) {
                numValueOf = null;
            }
            int iB = ycv.b(D3() * (numValueOf != null ? numValueOf.intValue() : constraintLayout.getResources().getDisplayMetrics().heightPixels));
            bVar.e(R.id.bet_view, 3);
            bVar.h(R.id.bet_view, 3, R.id.side_bet_tab_strip_view, 4, iB);
            bVar.x(R.id.bet_view);
            bVar.z(R.id.side_bet_content_view, 3, iB);
            s3(bVar);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen._4sdp);
            bVar.e(R.id.blur_gradient_bg_view, 4);
            bVar.e(R.id.blur_gradient_bg_view, 7);
            bVar.h(R.id.blur_gradient_bg_view, 3, R.id.side_bet_tab_strip_view, 4, dimensionPixelSize);
            bVar.x(R.id.blur_gradient_bg_view);
            bVar.g(R.id.blur_gradient_bg_view, 6, 0, 6);
            bVar.g(R.id.blur_gradient_bg_view, 7, 0, 7);
            r3(R.id.blur_gradient_bg_view, bVar);
            bVar.j(R.id.blur_gradient_bg_view, z3);
            bVar.e(R.id.blur_gradient_bg_view1, 4);
            bVar.e(R.id.blur_gradient_bg_view1, 6);
            bVar.g(R.id.blur_gradient_bg_view1, 3, R.id.space, 4);
            bVar.g(R.id.blur_gradient_bg_view1, 6, 0, 6);
            bVar.g(R.id.blur_gradient_bg_view1, 7, 0, 7);
            r3(R.id.blur_gradient_bg_view1, bVar);
            bVar.j(R.id.blur_gradient_bg_view1, z3);
            bVar.b(constraintLayout);
            q3(b6c0.a);
            this.j3 = y3;
            this.k3 = 0.2f;
            ((u5a0) this.g3).k(1);
        }
        gvi gviVar17 = this.z;
        if (gviVar17 != null) {
            ConstraintLayout constraintLayout2 = gviVar17.y;
            BlurView blurView = gviVar17.v;
            blurView.setBackgroundResource(R.drawable.blur_view_bg_sh);
            U3(blurView, constraintLayout2);
            gvi gviVar18 = this.z;
            if (gviVar18 != null) {
                BlurView blurView2 = gviVar18.w;
                blurView2.setBackgroundResource(R.drawable.blur_view_bg_sh);
                U3(blurView2, constraintLayout2);
            }
            gvi gviVar19 = this.z;
            if (gviVar19 != null) {
                BlurView blurView3 = gviVar19.o0;
                blurView3.setBackgroundResource(R.drawable.blur_view_bg_sh);
                U3(blurView3, constraintLayout2);
            }
            gvi gviVar20 = this.z;
            if (gviVar20 != null) {
                BlurView blurView4 = gviVar20.e0;
                blurView4.setBackgroundResource(R.drawable.blur_view_bg_sh);
                U3(blurView4, constraintLayout2);
            }
        }
        float dimension3 = getResources().getDimension(R.dimen._8sdp);
        gvi gviVar21 = this.z;
        fgb.C0(gviVar21 != null ? gviVar21.v : null, dimension3);
        gvi gviVar22 = this.z;
        fgb.C0(gviVar22 != null ? gviVar22.w : null, dimension3);
        gvi gviVar23 = this.z;
        fgb.C0(gviVar23 != null ? gviVar23.o0 : null, dimension3);
        gvi gviVar24 = this.z;
        fgb.C0(gviVar24 != null ? gviVar24.e0 : null, dimension3);
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = androidx.compose.runtime.m.b("sporty-hero");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2("sg_sporty_hero", "games/sporty-hero/v1/game");
        if (Build.VERSION.SDK_INT <= 24 && (gviVar = this.z) != null) {
            gviVar.F.setLayerType(1, null);
        }
        gvi gviVar25 = this.z;
        if (gviVar25 != null) {
            gviVar25.F.setClipChildren(false);
        }
        gvi gviVar26 = this.z;
        if (gviVar26 != null) {
            gviVar26.F.setClipToPadding(false);
        }
        A4();
        goj gojVarC2 = c1();
        osw oswVarA = androidx.compose.runtime.k.a(R.string.galaxy_go_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = androidx.compose.runtime.m.b("Sporty Hero");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = androidx.compose.runtime.m.b("sg_sporty_hero");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = androidx.compose.runtime.m.b("Sporty hero");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.sh_toggle_on_color;
        c1().G = R.color.sh_toggle_off_color;
        qry.a(view, new f(view, this));
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"SPORTY_HERO_MUSIC", "SPORTY_HERO_SOUND", "SPORTY_HERO_ONE_TAP", "SPORTY_HERO_THEME"});
        }
        SharedPreferences sharedPreferences = this.H;
        if (sharedPreferences != null) {
            c1().F1(sharedPreferences.getBoolean(((String[]) ((x5a0) c1().B).getValue())[0], true));
        }
        SharedPreferences sharedPreferences2 = this.H;
        if (sharedPreferences2 != null) {
            c1().H1(sharedPreferences2.getBoolean(((String[]) ((x5a0) c1().B).getValue())[1], true));
        }
        SharedPreferences sharedPreferences3 = this.H;
        int i4 = 2;
        if (sharedPreferences3 != null) {
            c1().G1(sharedPreferences3.getBoolean(((String[]) ((x5a0) c1().B).getValue())[2], false));
        }
        final eal ealVar = new eal();
        ttr ttrVar = this.e2;
        ((i96) ttrVar.getValue()).B.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: usb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                qub0 qub0Var;
                eal ealVar2 = ealVar;
                HashMap<Long, String> map = (HashMap) obj;
                try {
                    map.getClass();
                    if (!map.isEmpty()) {
                        Iterator<Map.Entry<Long, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            if (Intrinsics.g(it.next().getValue(), AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                                return Unit.a;
                            }
                        }
                    }
                    if (map.isEmpty()) {
                        return Unit.a;
                    }
                    wag0.e.j(map);
                    ((x5a0) wag0.f).setValue(new HashMap(map));
                    Iterator<Map.Entry<Long, String>> it2 = map.entrySet().iterator();
                    while (true) {
                        boolean zHasNext = it2.hasNext();
                        qub0Var = this;
                        if (!zHasNext) {
                            break;
                        }
                        Map.Entry<Long, String> next = it2.next();
                        long jLongValue = next.getKey().longValue();
                        try {
                            TournamentRankResponse tournamentRankResponse = (TournamentRankResponse) ealVar2.e(next.getValue(), TournamentRankResponse.class);
                            Iterable iterable = qub0Var.V2;
                            if (iterable == null) {
                                iterable = m2g.a;
                            }
                            ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
                            Iterator it3 = iterable.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                TournamentUserPlayInfo tournamentUserPlayInfoCopy$default = (TournamentUserPlayInfo) it3.next();
                                Long tournamentId = tournamentUserPlayInfoCopy$default.getTournamentId();
                                if (tournamentId != null && tournamentId.longValue() == jLongValue) {
                                    Integer rank = tournamentRankResponse.getRank();
                                    Integer numValueOf2 = Integer.valueOf(rank != null ? rank.intValue() : 0);
                                    Double score = tournamentRankResponse.getScore();
                                    tournamentUserPlayInfoCopy$default = TournamentUserPlayInfo.copy$default(tournamentUserPlayInfoCopy$default, null, numValueOf2, Double.valueOf(score != null ? score.doubleValue() : 0.0d), 1, null);
                                }
                                arrayList.add(tournamentUserPlayInfoCopy$default);
                            }
                            if (!arrayList.isEmpty()) {
                                int size = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 < size) {
                                        Object obj2 = arrayList.get(i5);
                                        i5++;
                                        Long tournamentId2 = ((TournamentUserPlayInfo) obj2).getTournamentId();
                                        if (tournamentId2 != null && tournamentId2.longValue() == jLongValue) {
                                        }
                                    }
                                    qub0Var.V2 = arrayList;
                                }
                            }
                            Long lValueOf = Long.valueOf(jLongValue);
                            Integer rank2 = tournamentRankResponse.getRank();
                            Integer numValueOf3 = Integer.valueOf(rank2 != null ? rank2.intValue() : 0);
                            Double score2 = tournamentRankResponse.getScore();
                            arrayList = CollectionsKt.j0(arrayList, new TournamentUserPlayInfo(lValueOf, numValueOf3, Double.valueOf(score2 != null ? score2.doubleValue() : 0.0d)));
                            qub0Var.V2 = arrayList;
                        } catch (Exception unused) {
                        }
                    }
                    qub0Var.y4();
                    return Unit.a;
                } catch (Exception unused2) {
                }
            }
        }));
        ((i96) ttrVar.getValue()).D.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: vsb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String strA;
                LinkedHashMap linkedHashMap = this.T2;
                eal ealVar2 = ealVar;
                HashMap map = (HashMap) obj;
                map.getClass();
                for (Map.Entry entry : map.entrySet()) {
                    long jLongValue = ((Number) entry.getKey()).longValue();
                    String str = (String) entry.getValue();
                    try {
                        if (!Intrinsics.g(str, AnalyticsEvent.BI_TRACKING_KIND_ERROR) && (strA = w54.a(Base64.decode(str, 0))) != null) {
                            TournamentRankListResponse tournamentRankListResponse = (TournamentRankListResponse) ealVar2.e(strA, TournamentRankListResponse.class);
                            tournamentRankListResponse.setTournamentId(Long.valueOf(jLongValue));
                            linkedHashMap.put(Long.valueOf(jLongValue), tournamentRankListResponse);
                        }
                    } catch (Exception unused) {
                    }
                }
                ((x5a0) wag0.g).setValue(new HashMap(linkedHashMap));
                return Unit.a;
            }
        }));
        ((i96) ttrVar.getValue()).E.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: wsb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ArrayList arrayList;
                String str = (String) obj;
                if (str == null || str.length() == 0 || str.equals(AnalyticsEvent.BI_TRACKING_KIND_ERROR)) {
                    return Unit.a;
                }
                TournamentStatusResponse tournamentStatusResponse = (TournamentStatusResponse) ealVar.e(str, TournamentStatusResponse.class);
                if (tournamentStatusResponse == null) {
                    return Unit.a;
                }
                String messageType = tournamentStatusResponse.getMessageType();
                if (messageType == null) {
                    messageType = "";
                }
                String str2 = messageType;
                Long id = tournamentStatusResponse.getId();
                long jLongValue = id != null ? id.longValue() : 0L;
                qub0 qub0Var = this;
                List<TournamentBannerConfig> list = qub0Var.U2;
                ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
                for (TournamentBannerConfig tournamentBannerConfigCopy$default : list) {
                    Long id2 = tournamentBannerConfigCopy$default.getId();
                    if (id2 != null && id2.longValue() == jLongValue) {
                        arrayList = arrayList2;
                        tournamentBannerConfigCopy$default = TournamentBannerConfig.copy$default(tournamentBannerConfigCopy$default, null, null, null, str2, null, null, null, null, null, null, null, 2039, null);
                    } else {
                        arrayList = arrayList2;
                    }
                    arrayList.add(tournamentBannerConfigCopy$default);
                    arrayList2 = arrayList;
                    jLongValue = jLongValue;
                }
                qub0Var.U2 = arrayList2;
                return Unit.a;
            }
        }));
        N3().b.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: ktb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                HTTPResponse hTTPResponse;
                HashMap map;
                Object next;
                Long l2;
                List list;
                LoadingState loadingState = (LoadingState) obj;
                if (qub0.c.a[loadingState.getStatus().ordinal()] == 1 && (hTTPResponse = (HTTPResponse) loadingState.getData()) != null && (map = (HashMap) hTTPResponse.getData()) != null && !map.isEmpty()) {
                    Set setEntrySet = map.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) CollectionsKt.U(setEntrySet);
                    if (entry == null || (list = (List) entry.getValue()) == null || list.isEmpty()) {
                        ssw<TournamentHistoryResponse> sswVar = wag0.d;
                        Long lValueOf = Long.valueOf((entry == null || (l2 = (Long) entry.getKey()) == null) ? 0L : l2.longValue());
                        Iterator<T> it = this.a.U2.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.g(((TournamentBannerConfig) next).getId(), entry != null ? (Long) entry.getKey() : null));
                        TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) next;
                        String name = tournamentBannerConfig != null ? tournamentBannerConfig.getName() : null;
                        if (name == null) {
                            name = "";
                        }
                        sswVar.j(new TournamentHistoryResponse(lValueOf, name, Double.valueOf(0.0d)));
                    } else {
                        ssw<TournamentHistoryResponse> sswVar2 = wag0.d;
                        com.sportygames.commons.tournament.model.TournamentHistoryResponse tournamentHistoryResponse = (com.sportygames.commons.tournament.model.TournamentHistoryResponse) ((List) entry.getValue()).get(0);
                        sswVar2.j(new TournamentHistoryResponse(tournamentHistoryResponse.getTournamentId(), tournamentHistoryResponse.getName(), tournamentHistoryResponse.getWinAmount()));
                    }
                }
                return Unit.a;
            }
        }));
        N3().c.f(getViewLifecycleOwner(), new dvb0(new j4l(this, i4)));
        gvi gviVar27 = this.z;
        u6i0.c cVar2 = u6i0.c.a;
        if (gviVar27 != null) {
            ComposeView composeView = gviVar27.v0;
            composeView.setViewCompositionStrategy(cVar2);
            composeView.setContent(new op8(1340384828, new arb0(this), true));
        }
        gvi gviVar28 = this.z;
        if (gviVar28 != null) {
            ComposeView composeView2 = gviVar28.p0;
            composeView2.setViewCompositionStrategy(cVar2);
            composeView2.setContent(new op8(-469518757, new Function2() { // from class: aub0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String currentMultiplier;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final Context context4 = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
                        final qub0 qub0Var = this.a;
                        MultiplierResponse multiplierResponse = qub0Var.x0;
                        final Double dH = (multiplierResponse == null || (currentMultiplier = multiplierResponse.getCurrentMultiplier()) == null) ? null : b.h(currentMultiplier);
                        MultiplierResponse multiplierResponse2 = qub0Var.x0;
                        String messageType = multiplierResponse2 != null ? multiplierResponse2.getMessageType() : null;
                        final long j2 = (!Intrinsics.g(messageType, "ROUND_ONGOING") && Intrinsics.g(messageType, "ROUND_END_WAIT")) ? b6g0.g : b6g0.h;
                        orp.a(sjj.a(), pp8.b(-1598621604, new Function2() { // from class: eub0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                String name;
                                a.C0041a.C0042a c0042a;
                                String messageType2;
                                a aVar2 = (a) obj3;
                                int iIntValue2 = ((Integer) obj4).intValue();
                                int i5 = 1;
                                int i6 = 2;
                                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    final qub0 qub0Var2 = qub0Var;
                                    b5 b5Var = (b5) qub0Var2.v1.getValue();
                                    GameDetails gameDetails = qub0Var2.i;
                                    if (gameDetails == null || (name = gameDetails.getName()) == null) {
                                        name = "";
                                    }
                                    SnapshotStateList<ps6> snapshotStateList = qub0Var2.g0;
                                    MultiplierResponse multiplierResponse3 = qub0Var2.x0;
                                    String str = (multiplierResponse3 == null || (messageType2 = multiplierResponse3.getMessageType()) == null) ? "" : messageType2;
                                    boolean zA = aVar2.A(qub0Var2);
                                    Object objY = aVar2.y();
                                    a.C0041a.C0042a c0042a2 = a.C0041a.a;
                                    if (zA || objY == c0042a2) {
                                        c0042a = c0042a2;
                                        qub0.i iVar = new qub0.i(0, qub0Var2, qub0.class, "checkForShowingWinPopUp", "checkForShowingWinPopUp()V", 0);
                                        aVar2.r(iVar);
                                        objY = iVar;
                                    } else {
                                        c0042a = c0042a2;
                                    }
                                    chp chpVar = (chp) objY;
                                    boolean zA2 = aVar2.A(qub0Var2);
                                    Object objY2 = aVar2.y();
                                    if (zA2 || objY2 == c0042a) {
                                        qub0.j jVar = new qub0.j(1, qub0Var2, qub0.class, "setJoinTournamentInPref", "setJoinTournamentInPref(Ljava/util/List;)V", 0);
                                        aVar2.r(jVar);
                                        objY2 = jVar;
                                    }
                                    chp chpVar2 = (chp) objY2;
                                    Boolean bool = (Boolean) ((x5a0) gci0.h).getValue();
                                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                                    Object objY3 = aVar2.y();
                                    if (objY3 == c0042a) {
                                        objY3 = new nub0();
                                        aVar2.r(objY3);
                                    }
                                    Function1 function1 = (Function1) objY3;
                                    boolean zA3 = aVar2.A(qub0Var2);
                                    Object objY4 = aVar2.y();
                                    if (zA3 || objY4 == c0042a) {
                                        objY4 = new zjb(qub0Var2, i6);
                                        aVar2.r(objY4);
                                    }
                                    Function0 function0 = (Function0) objY4;
                                    boolean zA4 = aVar2.A(qub0Var2);
                                    Object objY5 = aVar2.y();
                                    if (zA4 || objY5 == c0042a) {
                                        objY5 = new xwk(qub0Var2, i5);
                                        aVar2.r(objY5);
                                    }
                                    Function0 function2 = (Function0) objY5;
                                    Object objY6 = aVar2.y();
                                    if (objY6 == c0042a) {
                                        objY6 = new ok70(1);
                                        aVar2.r(objY6);
                                    }
                                    Function1 function3 = (Function1) objY6;
                                    boolean zA5 = aVar2.A(qub0Var2);
                                    Object objY7 = aVar2.y();
                                    if (zA5 || objY7 == c0042a) {
                                        objY7 = new gaj() { // from class: crb0
                                            /* JADX WARN: Code duplicated, block: B:66:0x012d  */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
                                            @Override // defpackage.gaj
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                String str2;
                                                boolean z;
                                                int i7;
                                                String currentMultiplier2;
                                                String str3;
                                                int i8;
                                                String currentMultiplier3;
                                                Double pointsScore;
                                                Integer rank;
                                                Long tournamentId;
                                                final long jLongValue = ((Long) obj5).longValue();
                                                final TournamentBannerConfig tournamentBannerConfig = (TournamentBannerConfig) obj6;
                                                TournamentUserPlayInfo tournamentUserPlayInfo = (TournamentUserPlayInfo) obj7;
                                                tournamentBannerConfig.getClass();
                                                final qub0 qub0Var3 = qub0Var2;
                                                e activity2 = qub0Var3.getActivity();
                                                if (activity2 != null) {
                                                    Double totalPrize = tournamentBannerConfig.getTotalPrize();
                                                    double dDoubleValue = totalPrize != null ? totalPrize.doubleValue() : 0.0d;
                                                    op5 op5Var = op5.a;
                                                    String currency = tournamentBannerConfig.getCurrency();
                                                    if (currency == null) {
                                                        currency = "";
                                                    }
                                                    op5Var.getClass();
                                                    final String strI = op5.i(currency);
                                                    List<TournamentEligibilityCriteria> eligibilityCriteria = tournamentBannerConfig.getEligibilityCriteria();
                                                    TournamentEligibilityCriteria tournamentEligibilityCriteria = eligibilityCriteria != null ? (TournamentEligibilityCriteria) CollectionsKt.firstOrNull(eligibilityCriteria) : null;
                                                    List<TournamentPrizeInfo> prizeInfo = tournamentBannerConfig.getPrizeInfo();
                                                    if (prizeInfo == null) {
                                                        prizeInfo = m2g.a;
                                                    }
                                                    final ArrayList arrayList = new ArrayList(l48.r(prizeInfo, 10));
                                                    for (TournamentPrizeInfo tournamentPrizeInfo : prizeInfo) {
                                                        arrayList.add(new PrizeInfo(tournamentPrizeInfo.getStartRank(), tournamentPrizeInfo.getEndRank(), tournamentPrizeInfo.getPrize(), null));
                                                        tournamentUserPlayInfo = tournamentUserPlayInfo;
                                                    }
                                                    TournamentUserPlayInfo tournamentUserPlayInfo2 = tournamentUserPlayInfo;
                                                    String startTime = tournamentBannerConfig.getStartTime();
                                                    if (startTime == null) {
                                                        startTime = "";
                                                    }
                                                    if (k94.a(startTime)) {
                                                        final UserPlayInfo userPlayInfo = new UserPlayInfo(Long.valueOf((tournamentUserPlayInfo2 == null || (tournamentId = tournamentUserPlayInfo2.getTournamentId()) == null) ? jLongValue : tournamentId.longValue()), Integer.valueOf((tournamentUserPlayInfo2 == null || (rank = tournamentUserPlayInfo2.getRank()) == null) ? 0 : rank.intValue()), Double.valueOf((tournamentUserPlayInfo2 == null || (pointsScore = tournamentUserPlayInfo2.getPointsScore()) == null) ? 0.0d : pointsScore.doubleValue()));
                                                        try {
                                                            MultiplierResponse multiplierResponse4 = qub0Var3.x0;
                                                            final Double dH2 = (multiplierResponse4 == null || (currentMultiplier3 = multiplierResponse4.getCurrentMultiplier()) == null) ? null : b.h(currentMultiplier3);
                                                            MultiplierResponse multiplierResponse5 = qub0Var3.x0;
                                                            String messageType3 = multiplierResponse5 != null ? multiplierResponse5.getMessageType() : null;
                                                            long j3 = (!Intrinsics.g(messageType3, "ROUND_ONGOING") && Intrinsics.g(messageType3, "ROUND_END_WAIT")) ? b6g0.g : b6g0.h;
                                                            final long j4 = j3;
                                                            qub0Var3.a0 = true;
                                                            wub0 wub0Var = new wub0(0, qub0Var3, qub0.class, "onTournamentDialogDismissed", "onTournamentDialogDismissed()V", 0);
                                                            final TournamentEligibilityCriteria tournamentEligibilityCriteria2 = tournamentEligibilityCriteria;
                                                            str3 = "tournament_tnc_clicked";
                                                            final double d3 = dDoubleValue;
                                                            try {
                                                                gaj gajVar = new gaj() { // from class: asb0
                                                                    @Override // defpackage.gaj
                                                                    public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                                        String str4;
                                                                        String str5;
                                                                        boolean zBooleanValue2;
                                                                        Object obj11;
                                                                        TournamentPrizeInfo tournamentPrizeInfo2;
                                                                        Double prize;
                                                                        Double minimumThreshold;
                                                                        Double minimumStakeCriteria;
                                                                        Function0 function4 = (Function0) obj8;
                                                                        a aVar3 = (a) obj9;
                                                                        int iIntValue3 = ((Integer) obj10).intValue();
                                                                        function4.getClass();
                                                                        if ((iIntValue3 & 6) == 0) {
                                                                            iIntValue3 |= aVar3.A(function4) ? 4 : 2;
                                                                        }
                                                                        if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                                            TournamentBannerConfig tournamentBannerConfig2 = tournamentBannerConfig;
                                                                            String name2 = tournamentBannerConfig2.getName();
                                                                            if (name2 == null) {
                                                                                name2 = "";
                                                                            }
                                                                            TreeMap treeMap = pw.a;
                                                                            String string = pw.c(pw.n(d3)).toString();
                                                                            String endTime = tournamentBannerConfig2.getEndTime();
                                                                            if (endTime == null) {
                                                                                endTime = "";
                                                                            }
                                                                            TournamentEligibilityCriteria tournamentEligibilityCriteria3 = tournamentEligibilityCriteria2;
                                                                            String str6 = "0.00";
                                                                            if (tournamentEligibilityCriteria3 == null || (minimumStakeCriteria = tournamentEligibilityCriteria3.getMinimumStakeCriteria()) == null) {
                                                                                str4 = null;
                                                                            } else {
                                                                                try {
                                                                                    str4 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumStakeCriteria.doubleValue());
                                                                                    str4.getClass();
                                                                                } catch (Exception unused) {
                                                                                    str4 = "0.00";
                                                                                }
                                                                            }
                                                                            String string2 = pw.c(str4).toString();
                                                                            String startTime2 = tournamentBannerConfig2.getStartTime();
                                                                            if (startTime2 == null) {
                                                                                startTime2 = "";
                                                                            }
                                                                            if (tournamentEligibilityCriteria3 == null || (minimumThreshold = tournamentEligibilityCriteria3.getMinimumThreshold()) == null) {
                                                                                str5 = null;
                                                                            } else {
                                                                                try {
                                                                                    str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumThreshold.doubleValue());
                                                                                    str5.getClass();
                                                                                } catch (Exception unused2) {
                                                                                    str5 = "0.00";
                                                                                }
                                                                            }
                                                                            String str7 = str5 == null ? "" : str5;
                                                                            List<TournamentPrizeInfo> prizeInfo2 = tournamentBannerConfig2.getPrizeInfo();
                                                                            if (prizeInfo2 == null || (tournamentPrizeInfo2 = (TournamentPrizeInfo) CollectionsKt.firstOrNull(prizeInfo2)) == null || (prize = tournamentPrizeInfo2.getPrize()) == null) {
                                                                                str6 = null;
                                                                            } else {
                                                                                try {
                                                                                    String str8 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(prize.doubleValue());
                                                                                    str8.getClass();
                                                                                    str6 = str8;
                                                                                } catch (Exception unused3) {
                                                                                }
                                                                            }
                                                                            String string3 = pw.c(str6).toString();
                                                                            final qub0 qub0Var4 = qub0Var3;
                                                                            aig0 aig0Var = (aig0) qub0Var4.U.getValue();
                                                                            SnapshotStateList<ps6> snapshotStateList2 = qub0Var4.g0;
                                                                            boolean zA6 = aVar3.A(qub0Var4);
                                                                            Object objY8 = aVar3.y();
                                                                            int i9 = iIntValue3;
                                                                            a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                                                            Object obj12 = objY8;
                                                                            if (zA6 || objY8 == c0042a3) {
                                                                                Function0 function5 = new Function0() { // from class: fsb0
                                                                                    @Override // kotlin.jvm.functions.Function0
                                                                                    public final Object invoke() {
                                                                                        qub0 qub0Var5 = qub0Var4;
                                                                                        qub0Var5.v0(qub0Var5.R0(), null);
                                                                                        return Unit.a;
                                                                                    }
                                                                                };
                                                                                aVar3.r(function5);
                                                                                obj12 = function5;
                                                                            }
                                                                            Function0 function6 = (Function0) obj12;
                                                                            boolean zA7 = aVar3.A(qub0Var4);
                                                                            Object objY9 = aVar3.y();
                                                                            if (zA7 || objY9 == c0042a3) {
                                                                                zBooleanValue2 = false;
                                                                                hsb0 hsb0Var = new hsb0(qub0Var4, false ? 1 : 0);
                                                                                aVar3.r(hsb0Var);
                                                                                obj11 = hsb0Var;
                                                                            } else {
                                                                                zBooleanValue2 = false;
                                                                                obj11 = objY9;
                                                                            }
                                                                            Function0 function7 = (Function0) obj11;
                                                                            Boolean bool2 = (Boolean) ((x5a0) gci0.h).getValue();
                                                                            if (bool2 != null) {
                                                                                zBooleanValue2 = bool2.booleanValue();
                                                                            }
                                                                            ycg0.a(name2, jLongValue, strI, string, endTime, arrayList, userPlayInfo, function4, string2, startTime2, str7, string3, aig0Var, null, snapshotStateList2, dH2, j4, function6, function7, zBooleanValue2, aVar3, (UserPlayInfo.$stable << 18) | ((i9 << 21) & 29360128));
                                                                        } else {
                                                                            aVar3.G();
                                                                        }
                                                                        return Unit.a;
                                                                    }
                                                                };
                                                                qub0Var3 = qub0Var3;
                                                                try {
                                                                    sbg0.a(activity2, wub0Var, new op8(-1731903365, gajVar, true));
                                                                    i8 = 0;
                                                                } catch (Exception unused) {
                                                                    i8 = 0;
                                                                    qub0Var3.a0 = false;
                                                                }
                                                            } catch (Exception unused2) {
                                                                qub0Var3 = qub0Var3;
                                                            }
                                                        } catch (Exception unused3) {
                                                            str3 = "tournament_tnc_clicked";
                                                        }
                                                        op5.a.getClass();
                                                        String str4 = op5.c;
                                                        String strE = krh0.e(str4 != null ? str4 : "");
                                                        wz.a("tournament_bottom_sheet_view", strE, new String[i8]);
                                                        wz.a("tournament_leaderboard_viewed", strE, new String[i8]);
                                                        wz.a(str3, strE, new String[i8]);
                                                    } else {
                                                        try {
                                                            MultiplierResponse multiplierResponse6 = qub0Var3.x0;
                                                            Double dH3 = (multiplierResponse6 == null || (currentMultiplier2 = multiplierResponse6.getCurrentMultiplier()) == null) ? null : b.h(currentMultiplier2);
                                                            MultiplierResponse multiplierResponse7 = qub0Var3.x0;
                                                            String messageType4 = multiplierResponse7 != null ? multiplierResponse7.getMessageType() : null;
                                                            long j5 = (!Intrinsics.g(messageType4, "ROUND_ONGOING") && Intrinsics.g(messageType4, "ROUND_END_WAIT")) ? b6g0.g : b6g0.h;
                                                            final long j6 = j5;
                                                            qub0Var3.a0 = true;
                                                            try {
                                                                final Double d4 = dH3;
                                                                str2 = "tournament_tnc_clicked";
                                                                try {
                                                                    final TournamentEligibilityCriteria tournamentEligibilityCriteria3 = tournamentEligibilityCriteria;
                                                                    final double d5 = dDoubleValue;
                                                                    sbg0.a(activity2, new vub0(0, qub0Var3, qub0.class, "onTournamentDialogDismissed", "onTournamentDialogDismissed()V", 0), new op8(1365153444, new gaj() { // from class: zrb0
                                                                        @Override // defpackage.gaj
                                                                        public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                                            double d6;
                                                                            String str5;
                                                                            int i9;
                                                                            String str6;
                                                                            String str7;
                                                                            String str8;
                                                                            String str9;
                                                                            Double minimumThreshold;
                                                                            String str10;
                                                                            TournamentPrizeInfo tournamentPrizeInfo2;
                                                                            Double prize;
                                                                            Double minimumStakeCriteria;
                                                                            Function0 function4 = (Function0) obj8;
                                                                            a aVar3 = (a) obj9;
                                                                            int iIntValue3 = ((Integer) obj10).intValue();
                                                                            function4.getClass();
                                                                            if ((iIntValue3 & 6) == 0) {
                                                                                iIntValue3 |= aVar3.A(function4) ? 4 : 2;
                                                                            }
                                                                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                                                                                TournamentBannerConfig tournamentBannerConfig2 = tournamentBannerConfig;
                                                                                String name2 = tournamentBannerConfig2.getName();
                                                                                if (name2 == null) {
                                                                                    name2 = "";
                                                                                }
                                                                                TreeMap treeMap = pw.a;
                                                                                double d7 = d5;
                                                                                String strC = pw.c(pw.n(d7));
                                                                                String str11 = strI;
                                                                                String strA = oxc.a(str11, " ", strC);
                                                                                Integer maxParticipants = tournamentBannerConfig2.getMaxParticipants();
                                                                                String strValueOf = maxParticipants != null ? String.valueOf(maxParticipants.intValue()) : null;
                                                                                if (strValueOf == null) {
                                                                                    strValueOf = "";
                                                                                }
                                                                                TournamentEligibilityCriteria tournamentEligibilityCriteria4 = tournamentEligibilityCriteria3;
                                                                                if (tournamentEligibilityCriteria4 == null || (minimumStakeCriteria = tournamentEligibilityCriteria4.getMinimumStakeCriteria()) == null) {
                                                                                    d6 = d7;
                                                                                    str5 = null;
                                                                                } else {
                                                                                    d6 = d7;
                                                                                    try {
                                                                                        str5 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumStakeCriteria.doubleValue());
                                                                                        str5.getClass();
                                                                                    } catch (Exception unused4) {
                                                                                        str5 = "0.00";
                                                                                    }
                                                                                }
                                                                                String string = pw.c(str5).toString();
                                                                                String startTime2 = tournamentBannerConfig2.getStartTime();
                                                                                if (startTime2 == null) {
                                                                                    startTime2 = "";
                                                                                }
                                                                                String string2 = pw.c(pw.n(d6)).toString();
                                                                                String startTime3 = tournamentBannerConfig2.getStartTime();
                                                                                if (startTime3 == null) {
                                                                                    startTime3 = "";
                                                                                }
                                                                                String endTime = tournamentBannerConfig2.getEndTime();
                                                                                if (endTime == null) {
                                                                                    endTime = "";
                                                                                }
                                                                                List<TournamentPrizeInfo> prizeInfo2 = tournamentBannerConfig2.getPrizeInfo();
                                                                                if (prizeInfo2 == null || (tournamentPrizeInfo2 = (TournamentPrizeInfo) CollectionsKt.firstOrNull(prizeInfo2)) == null || (prize = tournamentPrizeInfo2.getPrize()) == null) {
                                                                                    i9 = iIntValue3;
                                                                                    str6 = name2;
                                                                                    str7 = string;
                                                                                    str8 = null;
                                                                                } else {
                                                                                    i9 = iIntValue3;
                                                                                    str6 = name2;
                                                                                    try {
                                                                                        str7 = string;
                                                                                        try {
                                                                                            str8 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(prize.doubleValue());
                                                                                            str8.getClass();
                                                                                        } catch (Exception unused5) {
                                                                                            str8 = "0.00";
                                                                                        }
                                                                                    } catch (Exception unused6) {
                                                                                        str7 = string;
                                                                                    }
                                                                                }
                                                                                String string3 = pw.c(str8).toString();
                                                                                if (tournamentEligibilityCriteria4 == null || (minimumThreshold = tournamentEligibilityCriteria4.getMinimumThreshold()) == null) {
                                                                                    str9 = null;
                                                                                } else {
                                                                                    try {
                                                                                        str10 = new DecimalFormat("0.00", SportyGamesManager.decimalFormatSymbols).format(minimumThreshold.doubleValue());
                                                                                        str10.getClass();
                                                                                    } catch (Exception unused7) {
                                                                                        str10 = "0.00";
                                                                                    }
                                                                                    str9 = str10;
                                                                                }
                                                                                String str12 = str9 != null ? str9 : "";
                                                                                final qub0 qub0Var4 = qub0Var3;
                                                                                String str13 = strValueOf;
                                                                                SnapshotStateList<ps6> snapshotStateList2 = qub0Var4.g0;
                                                                                aig0 aig0Var = (aig0) qub0Var4.U.getValue();
                                                                                Boolean bool2 = (Boolean) ((x5a0) gci0.h).getValue();
                                                                                boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                                                                                Object objY8 = aVar3.y();
                                                                                a.C0041a.C0042a c0042a3 = a.C0041a.a;
                                                                                if (objY8 == c0042a3) {
                                                                                    objY8 = new csb0();
                                                                                    aVar3.r(objY8);
                                                                                }
                                                                                Function1 function5 = (Function1) objY8;
                                                                                Object objY9 = aVar3.y();
                                                                                if (objY9 == c0042a3) {
                                                                                    objY9 = new dsb0();
                                                                                    aVar3.r(objY9);
                                                                                }
                                                                                Function1 function6 = (Function1) objY9;
                                                                                boolean zA6 = aVar3.A(qub0Var4);
                                                                                Object objY10 = aVar3.y();
                                                                                if (zA6 || objY10 == c0042a3) {
                                                                                    objY10 = new Function0() { // from class: esb0
                                                                                        @Override // kotlin.jvm.functions.Function0
                                                                                        public final Object invoke() {
                                                                                            qub0 qub0Var5 = qub0Var4;
                                                                                            qub0Var5.v0(qub0Var5.R0(), null);
                                                                                            return Unit.a;
                                                                                        }
                                                                                    };
                                                                                    aVar3.r(objY10);
                                                                                }
                                                                                Function0 function7 = (Function0) objY10;
                                                                                boolean zA7 = aVar3.A(qub0Var4);
                                                                                Object objY11 = aVar3.y();
                                                                                if (zA7 || objY11 == c0042a3) {
                                                                                    objY11 = new ydg(qub0Var4, 1);
                                                                                    aVar3.r(objY11);
                                                                                }
                                                                                d7g0.a(str6, strA, jLongValue, false, str13, str7, startTime2, str11, arrayList, snapshotStateList2, function4, function5, function6, string2, startTime3, endTime, string3, str12, null, d4, j6, null, null, function7, (Function0) objY11, aig0Var, zBooleanValue2, aVar3, 3072, (i9 & 14) | 432, 262144, 6553600);
                                                                            } else {
                                                                                aVar3.G();
                                                                            }
                                                                            return Unit.a;
                                                                        }
                                                                    }, true));
                                                                    i7 = 0;
                                                                } catch (Exception unused4) {
                                                                    z = false;
                                                                    qub0Var3.a0 = z;
                                                                    i7 = z;
                                                                }
                                                            } catch (Exception unused5) {
                                                                str2 = "tournament_tnc_clicked";
                                                                z = false;
                                                                qub0Var3.a0 = z;
                                                                i7 = z;
                                                                op5.a.getClass();
                                                                String str5 = op5.c;
                                                                wz.a(str2, krh0.e(str5 != null ? str5 : ""), new String[i7]);
                                                                return Unit.a;
                                                            }
                                                        } catch (Exception unused6) {
                                                            str2 = "tournament_tnc_clicked";
                                                        }
                                                        op5.a.getClass();
                                                        String str6 = op5.c;
                                                        wz.a(str2, krh0.e(str6 != null ? str6 : ""), new String[i7]);
                                                    }
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY7);
                                    }
                                    gaj gajVar = (gaj) objY7;
                                    Object objY8 = aVar2.y();
                                    if (objY8 == c0042a) {
                                        objY8 = new drb0();
                                        aVar2.r(objY8);
                                    }
                                    Function1 function4 = (Function1) objY8;
                                    boolean zA6 = aVar2.A(qub0Var2);
                                    Context context5 = context4;
                                    boolean zA7 = zA6 | aVar2.A(context5);
                                    Object objY9 = aVar2.y();
                                    if (zA7 || objY9 == c0042a) {
                                        objY9 = new ucz(qub0Var2, context5);
                                        aVar2.r(objY9);
                                    }
                                    Function1 function5 = (Function1) objY9;
                                    boolean zA8 = aVar2.A(qub0Var2) | aVar2.A(context5);
                                    Object objY10 = aVar2.y();
                                    if (zA8 || objY10 == c0042a) {
                                        objY10 = new erb0(qub0Var2, context5);
                                        aVar2.r(objY10);
                                    }
                                    Function1 function6 = (Function1) objY10;
                                    Object objY11 = aVar2.y();
                                    if (objY11 == c0042a) {
                                        objY11 = new frb0();
                                        aVar2.r(objY11);
                                    }
                                    Function2 function7 = (Function2) objY11;
                                    boolean zA9 = aVar2.A(qub0Var2);
                                    Object objY12 = aVar2.y();
                                    if (zA9 || objY12 == c0042a) {
                                        objY12 = new grb0();
                                        aVar2.r(objY12);
                                    }
                                    Function1 function8 = (Function1) objY12;
                                    boolean zA10 = aVar2.A(qub0Var2);
                                    Object objY13 = aVar2.y();
                                    if (zA10 || objY13 == c0042a) {
                                        objY13 = new oub0();
                                        aVar2.r(objY13);
                                    }
                                    Function2 function9 = (Function2) objY13;
                                    boolean zA11 = aVar2.A(qub0Var2);
                                    Object objY14 = aVar2.y();
                                    if (zA11 || objY14 == c0042a) {
                                        objY14 = new ou70(qub0Var2, 1);
                                        aVar2.r(objY14);
                                    }
                                    Function1 function10 = (Function1) objY14;
                                    boolean zA12 = aVar2.A(qub0Var2);
                                    Object objY15 = aVar2.y();
                                    if (zA12 || objY15 == c0042a) {
                                        objY15 = new Function2() { // from class: brb0
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj5, Object obj6) {
                                                gvi gviVar29;
                                                List<TournamentBannerConfig> list = (List) obj5;
                                                list.getClass();
                                                final qub0 qub0Var3 = qub0Var2;
                                                boolean z = !qub0Var3.U2.isEmpty();
                                                qub0Var3.U2 = list;
                                                qub0Var3.V2 = (List) obj6;
                                                qub0Var3.y4();
                                                if (z != (!list.isEmpty()) && (gviVar29 = qub0Var3.z) != null) {
                                                    gviVar29.F.post(new Runnable() { // from class: urb0
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            qub0 qub0Var4 = qub0Var3;
                                                            b6c0 b6c0Var = qub0Var4.h3;
                                                            b6c0 b6c0Var2 = b6c0.a;
                                                            if (b6c0Var == b6c0Var2) {
                                                                qub0Var4.q3(b6c0Var2);
                                                            } else {
                                                                qub0Var4.j4();
                                                            }
                                                        }
                                                    });
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        aVar2.r(objY15);
                                    }
                                    Function2 function11 = (Function2) objY15;
                                    Function0 function12 = (Function0) chpVar;
                                    Function1 function13 = (Function1) chpVar2;
                                    boolean zA13 = aVar2.A(qub0Var2);
                                    Object objY16 = aVar2.y();
                                    if (zA13 || objY16 == c0042a) {
                                        objY16 = new wwk(qub0Var2, 1);
                                        aVar2.r(objY16);
                                    }
                                    kag0.j(null, null, b5Var, name, null, function1, snapshotStateList, dH, j2, function0, function2, function3, str, gajVar, function4, function5, function6, function7, function8, function9, function10, function11, function12, function13, (Function1) objY16, zBooleanValue, aVar2, 1575936);
                                } else {
                                    aVar2.G();
                                }
                                return Unit.a;
                            }
                        }, aVar), aVar, 48);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar29 = this.z;
        ComposeView composeView3 = gviVar29 != null ? gviVar29.f0 : null;
        ComposeView composeView4 = gviVar29 != null ? gviVar29.c0 : null;
        ComposeView composeView5 = gviVar29 != null ? gviVar29.d0 : null;
        if (composeView3 == null || composeView4 == null || composeView5 == null) {
            cVar = cVar2;
        } else {
            ComposeView composeView6 = composeView3;
            ComposeView composeView7 = composeView5;
            ComposeView composeView8 = composeView4;
            cVar = cVar2;
            final a6c0 a6c0Var = new a6c0(this, composeView6, composeView8, composeView7, new gub0(this), new pub0(this), new vm2(this, i4), R0().a, S0().a, this.S1);
            composeView6.setViewCompositionStrategy(cVar);
            composeView8.setViewCompositionStrategy(cVar);
            composeView7.setViewCompositionStrategy(cVar);
            composeView6.setContent(new op8(-1298486227, new Function2() { // from class: k5c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        scv.b(null, null, null, pp8.b(375596249, new n1h(a6c0Var, 2), aVar), aVar, 3072, 7);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
            composeView8.setContent(new op8(-725368554, new rac(a6c0Var), true));
            composeView7.setContent(new op8(-940197707, new Function2() { // from class: s5c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        scv.b(null, null, null, pp8.b(1535293025, new zh80(a6c0Var, 1), aVar), aVar, 3072, 7);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
            composeView8.setVisibility(((b6c0) ((x5a0) a6c0Var.h).getValue()) == b6c0.a ? 8 : 0);
            a6c0Var.f(false);
            this.d3 = a6c0Var;
            k6c0 k6c0VarN3 = N3();
            ln1 ln1VarN1 = n1();
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            final fd90 fd90Var = new fd90(this, a6c0Var, ln1VarN1, k6c0VarN3, viewLifecycleOwner);
            ln1 ln1Var = fd90Var.c;
            ssw<LoadingState<HTTPResponse<DetailResponseData>>> sswVar = ln1Var.c;
            fd90.c cVar3 = new fd90.c(new eew(fd90Var, i3));
            ibs ibsVar = fd90Var.e;
            sswVar.f(ibsVar, cVar3);
            k6c0 k6c0Var = fd90Var.d;
            k6c0Var.i.f(ibsVar, new fd90.c(new Function1() { // from class: nc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    FetchUnderResponse fetchUnderResponse;
                    HashMap<Double, Double> data;
                    LoadingState loadingState = (LoadingState) obj;
                    if ((loadingState != null ? loadingState.getStatus() : null) != Status.SUCCESS) {
                        return Unit.a;
                    }
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                    if (hTTPResponse == null || (fetchUnderResponse = (FetchUnderResponse) hTTPResponse.getData()) == null || (data = fetchUnderResponse.getData()) == null) {
                        return Unit.a;
                    }
                    fd90 fd90Var2 = fd90Var;
                    fd90Var2.i = data;
                    fd90Var2.e();
                    return Unit.a;
                }
            }));
            san sanVar = new san(fd90Var, i3);
            qub0 qub0Var = fd90Var.a;
            qub0Var.f1().b.f(ibsVar, new fd90.c(new aw40(sanVar, i3)));
            qub0Var.f1().c.f(ibsVar, new fd90.c(new bd90(sanVar, i2)));
            qub0Var.k1().w.f(ibsVar, new fd90.c(new wb90(fd90Var, i2)));
            qub0Var.k1().z.f(ibsVar, new fd90.c(new Function1() { // from class: hc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    hd90 hd90Var;
                    try {
                        CashoutException cashoutException = (CashoutException) new eal().e((String) obj, CashoutException.class);
                        if (cashoutException.getBetId() != 0) {
                            return Unit.a;
                        }
                        String betTypeEnum = cashoutException.getBetTypeEnum();
                        boolean zG = Intrinsics.g(betTypeEnum, "OVER_UNDER");
                        fd90 fd90Var2 = fd90Var;
                        if (zG) {
                            hd90Var = fd90Var2.o;
                        } else {
                            hd90Var = Intrinsics.g(betTypeEnum, "RANGE") ? fd90Var2.p : null;
                        }
                        if (hd90Var == null) {
                            return Unit.a;
                        }
                        gd90 gd90VarE = hd90Var.e(cashoutException.getBetIndex() == 1);
                        gd90VarE.x();
                        gd90VarE.A(false);
                        gd90VarE.y();
                        gd90VarE.z();
                        gd90VarE.g();
                        gd90VarE.e(1.0f, true);
                        gd90VarE.f();
                        fd90Var2.v();
                        fd90Var2.u();
                        return Unit.a;
                    } catch (Exception unused) {
                        return Unit.a;
                    }
                }
            }));
            qub0Var.k1().i.f(ibsVar, new fd90.c(new Function1() { // from class: sc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    jg50.b bVar2;
                    fd90 fd90Var2 = fd90Var;
                    qub0 qub0Var2 = fd90Var2.a;
                    try {
                        MultiplierResponse multiplierResponse = (MultiplierResponse) new eal().e((String) obj, MultiplierResponse.class);
                        MultiplierResponse multiplierResponse2 = fd90Var2.q;
                        fd90Var2.q = multiplierResponse;
                        DetailResponseData detailResponseData = fd90Var2.g;
                        char c2 = 0;
                        if (!(detailResponseData != null ? Intrinsics.g(detailResponseData.getIsSideBetsEnabled(), Boolean.TRUE) : false)) {
                            return Unit.a;
                        }
                        multiplierResponse.getClass();
                        ArrayList arrayListV = ay0.v(new hd90[]{fd90Var2.o, fd90Var2.p});
                        ArrayList arrayList = new ArrayList();
                        int size = arrayListV.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj2 = arrayListV.get(i5);
                            i5++;
                            hd90 hd90Var = (hd90) obj2;
                            p48.w(kotlin.collections.b.k(hd90Var.a(), hd90Var.b()), arrayList);
                        }
                        int size2 = arrayList.size();
                        int i6 = 0;
                        while (i6 < size2) {
                            Object obj3 = arrayList.get(i6);
                            i6++;
                            gd90 gd90Var = (gd90) obj3;
                            long jN = gd90Var.n();
                            long jM = gd90Var.m();
                            int i7 = size2;
                            boolean z = jM > 0 && (multiplierResponse.getRoundId() > jM || (multiplierResponse.getRoundId() == jM && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")));
                            if (Intrinsics.g(multiplierResponse2 != null ? multiplierResponse2.getMessageType() : null, "ROUND_END_WAIT") && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_WAITING")) {
                                bVar2 = jN != multiplierResponse.getRoundId() ? jg50.b.c : jg50.b.b;
                            } else {
                                bVar2 = jg50.b.a;
                            }
                            if (z) {
                                qub0Var2.f1().x1();
                                gd90Var.q();
                                fd90Var2.m();
                                if (fd90Var2.n()) {
                                    qub0Var2.E0();
                                } else {
                                    qub0Var2.J0();
                                }
                            }
                            int iOrdinal = bVar2.ordinal();
                            if (iOrdinal == 0) {
                                c2 = 0;
                            } else if (iOrdinal == 1) {
                                c2 = 0;
                                gd90Var.B(false);
                            } else {
                                if (iOrdinal != 2) {
                                    uhc.a();
                                    return null;
                                }
                                gd90Var.G(0L);
                                c2 = 0;
                                gd90Var.A(false);
                                gd90Var.y();
                                gd90Var.z();
                                gd90Var.B(false);
                            }
                            size2 = i7;
                        }
                        if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) {
                            hd90.a aVar = fd90Var2.o;
                            hd90.b bVar3 = fd90Var2.p;
                            hd90[] hd90VarArr = new hd90[2];
                            hd90VarArr[c2] = aVar;
                            hd90VarArr[1] = bVar3;
                            ArrayList arrayListV2 = ay0.v(hd90VarArr);
                            ArrayList arrayList2 = new ArrayList();
                            int size3 = arrayListV2.size();
                            int i8 = 0;
                            while (i8 < size3) {
                                Object obj4 = arrayListV2.get(i8);
                                i8++;
                                hd90 hd90Var2 = (hd90) obj4;
                                p48.w(kotlin.collections.b.k(hd90Var2.a(), hd90Var2.b()), arrayList2);
                            }
                            ArrayList arrayList3 = new ArrayList();
                            int size4 = arrayList2.size();
                            int i9 = 0;
                            while (i9 < size4) {
                                Object obj5 = arrayList2.get(i9);
                                i9++;
                                if (((gd90) obj5).k()) {
                                    arrayList3.add(obj5);
                                }
                            }
                            int size5 = arrayList3.size();
                            int i10 = 0;
                            while (i10 < size5) {
                                Object obj6 = arrayList3.get(i10);
                                i10++;
                                gd90 gd90Var2 = (gd90) obj6;
                                gd90Var2.H(gd90Var2.h());
                                gd90Var2.s(gd90Var2.h());
                            }
                            if (Intrinsics.g(fd90Var2.j, Boolean.TRUE)) {
                                fd90Var2.m();
                            }
                        }
                        if (fd90Var2.g != null && fd90.r(multiplierResponse.getCurrentMultiplier()) != null) {
                            hd90.a aVar2 = fd90Var2.o;
                            if (aVar2 != null) {
                                gd90.a aVar3 = aVar2.c;
                                aVar3.getClass();
                                gd90.a aVar4 = aVar2.d;
                                aVar4.getClass();
                                fd90Var2.o(multiplierResponse, aVar3);
                                fd90Var2.o(multiplierResponse, aVar4);
                            }
                            hd90.b bVar4 = fd90Var2.p;
                            if (bVar4 != null) {
                                gd90.b bVar5 = bVar4.c;
                                bVar5.getClass();
                                gd90.b bVar6 = bVar4.d;
                                bVar6.getClass();
                                fd90Var2.p(multiplierResponse, bVar5);
                                fd90Var2.p(multiplierResponse, bVar6);
                            }
                        }
                        ArrayList arrayListV3 = ay0.v(new hd90[]{fd90Var2.o, fd90Var2.p});
                        int size6 = arrayListV3.size();
                        int i11 = 0;
                        while (i11 < size6) {
                            Object obj7 = arrayListV3.get(i11);
                            i11++;
                            hd90 hd90Var3 = (hd90) obj7;
                            fd90Var2.g(hd90Var3, true, multiplierResponse);
                            fd90Var2.g(hd90Var3, false, multiplierResponse);
                        }
                        fd90Var2.v();
                        fd90Var2.u();
                        return Unit.a;
                    } catch (Exception unused) {
                        return Unit.a;
                    }
                }
            }));
            ej5.c(o8i0.d(ln1Var), null, null, new nm1(ln1Var, null), 3);
            ej5.c(o8i0.d(k6c0Var), null, null, new i6c0(k6c0Var, null), 3);
            this.e3 = fd90Var;
        }
        gvi gviVar30 = this.z;
        if (gviVar30 != null) {
            ComposeView composeView9 = gviVar30.n0;
            vt2 vt2VarT0 = T0();
            m28 m28VarX0 = X0();
            lei0 lei0VarO1 = o1();
            gn2 gn2Var = new gn2(this, i3);
            rrb0 rrb0Var = new rrb0();
            q930 q930Var = new q930(1);
            xq2 xq2Var = new xq2(1);
            gsb0 gsb0Var = new gsb0();
            hbq hbqVar = new hbq(this, i3);
            qub0 qub0Var2 = this.P2;
            final fpb0 fpb0Var = new fpb0(qub0Var2, composeView9, vt2VarT0, m28VarX0, gn2Var, lei0VarO1, rrb0Var, q930Var, xq2Var, gsb0Var, hbqVar);
            composeView9.setViewCompositionStrategy(cVar);
            int i5 = 2;
            composeView9.setContent(new op8(547283899, new p4q(fpb0Var, i5), true));
            ibs viewLifecycleOwner2 = qub0Var2.getViewLifecycleOwner();
            viewLifecycleOwner2.getClass();
            vt2VarT0.d.f(viewLifecycleOwner2, new gpb0(new eib(fpb0Var, i5)));
            m28VarX0.f.f(viewLifecycleOwner2, new gpb0(new x230(fpb0Var, i3)));
            lei0VarO1.A.f(viewLifecycleOwner2, new gpb0(new chu(fpb0Var, i3)));
            lei0VarO1.w.f(viewLifecycleOwner2, new gpb0(new Function1() { // from class: epb0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    izs izsVar = (izs) obj;
                    izsVar.getClass();
                    fpb0 fpb0Var2 = fpb0Var;
                    uqb0 uqb0Var = fpb0Var2.h;
                    int iOrdinal = izsVar.a.ordinal();
                    if (iOrdinal == 1) {
                        com.sportygames.common.framework.network.HTTPResponse hTTPResponse = (com.sportygames.common.framework.network.HTTPResponse) izsVar.b;
                        uqb0Var.z1(fpb0Var2.o, hTTPResponse != null ? (List) hTTPResponse.getData() : null);
                    } else if (iOrdinal == 2) {
                        uqb0Var.z1(fpb0Var2.o, null);
                    }
                    return Unit.a;
                }
            }));
            h4();
            this.W2 = fpb0Var;
        }
        k1().A.f(getViewLifecycleOwner(), new dvb0(new ofg(this, 2)));
        N3().f.f(getViewLifecycleOwner(), new dvb0(new wez(this, i3)));
        N3().v.f(getViewLifecycleOwner(), new dvb0(new yez(this, i3)));
        gvi gviVar31 = this.z;
        if (gviVar31 != null) {
            ComposeView composeView10 = gviVar31.W;
            composeView10.setViewCompositionStrategy(cVar);
            composeView10.setContent(new op8(205641369, new psb0(this, i2), true));
        }
        gvi gviVar32 = this.z;
        if (gviVar32 != null) {
            gviVar32.W.addOnLayoutChangeListener(this.x3);
        }
        gvi gviVar33 = this.z;
        if (gviVar33 != null) {
            ComposeView composeView11 = gviVar33.c;
            composeView11.setViewCompositionStrategy(cVar);
            composeView11.setContent(new op8(-1486323350, new xsb0(this, composeView11), true));
        }
        gvi gviVar34 = this.z;
        if (gviVar34 != null) {
            final ComposeView composeView12 = gviVar34.d;
            composeView12.setViewCompositionStrategy(cVar);
            composeView12.setContent(new op8(998740361, new Function2() { // from class: htb0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Double turboValue;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i6 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final qub0 qub0Var3 = this.a;
                        BetContainerState betContainerState = (BetContainerState) wyh.c(qub0Var3.S0().a, aVar, 0, 7).getValue();
                        BetContainerState betContainerState2 = (BetContainerState) wyh.c(qub0Var3.R0().a, aVar, 0, 7).getValue();
                        ytw<Boolean> ytwVar = qub0Var3.f1().e;
                        n6a n6aVarJ3 = qub0Var3.J3(pi60.a(R.dimen._8sdp, 0, aVar));
                        boolean zBooleanValue = ((Boolean) ((x5a0) qub0Var3.c1().g0).getValue()).booleanValue();
                        d.a aVar2 = d.a.b;
                        d dVarN = androidx.compose.foundation.a.b(j.e(aVar2, 1.0f), j58.l, zk40.a).n(wje0.a(aVar2, qub0Var3.h3, new uub0(qub0Var3)));
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarN);
                        yka.k.getClass();
                        tsr.a aVar3 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar3);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC, yka.a.f);
                        hlh0.a(aVar, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        hlh0.a(aVar, dVarC, yka.a.d);
                        HashMap map = (HashMap) ((x5a0) qub0Var3.S0().d).getValue();
                        Boolean bool = map != null ? (Boolean) map.get(Long.valueOf(betContainerState.getRoundId())) : null;
                        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                        TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) gci0.d).getValue();
                        String str = (String) ((x5a0) qub0Var3.c1().v).getValue();
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) qub0Var3.S0().b).getValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        boolean z = egb.a(betContainerState2) > 0;
                        t290 t290VarJ1 = qub0Var3.j1();
                        BetComponentColors betComponentColors = jnb0.a;
                        cj5 cj5Var = (cj5) ((x5a0) qub0Var3.c1().f0).getValue();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) qub0Var3.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) ((x5a0) qub0Var3.F2).getValue()).booleanValue();
                        boolean zBooleanValue6 = ((Boolean) ((x5a0) qub0Var3.c1().b0).getValue()).booleanValue();
                        osw oswVar = qub0Var3.S0().M;
                        boolean zBooleanValue7 = ((Boolean) ((x5a0) qub0Var3.c1().m0).getValue()).booleanValue();
                        Boolean bool2 = (Boolean) ((x5a0) gci0.p).getValue();
                        boolean zBooleanValue8 = bool2 != null ? bool2.booleanValue() : false;
                        l1z l1zVarE1 = qub0Var3.e1();
                        x5a0 x5a0Var = (x5a0) gci0.l;
                        boolean zBooleanValue9 = ((Boolean) x5a0Var.getValue()).booleanValue();
                        boolean z2 = ((turboUsageCountResponse == null || (turboValue = turboUsageCountResponse.getTurboValue()) == null) ? 0.0d : turboValue.doubleValue()) >= 100.0d && !((Boolean) x5a0Var.getValue()).booleanValue();
                        boolean zIsStakeSafeApplied = ((BetContainerState) n95.b(qub0Var3.S0().a, aVar).getValue()).isStakeSafeApplied();
                        Boolean bool3 = (Boolean) ((x5a0) gci0.h).getValue();
                        boolean zBooleanValue10 = bool3 != null ? bool3.booleanValue() : false;
                        boolean zA = aVar.A(qub0Var3);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new wou(qub0Var3, i6);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(qub0Var3);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new hc30(qub0Var3, i6);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(qub0Var3);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new z2l(qub0Var3, 1);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(qub0Var3);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new osb0(qub0Var3, 0);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(qub0Var3);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new wfz(qub0Var3, 1);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(qub0Var3);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new Function1() { // from class: qsb0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    boolean zBooleanValue11 = ((Boolean) obj3).booleanValue();
                                    qub0 qub0Var4 = qub0Var3;
                                    qub0Var4.R0().S1(true);
                                    ytw<Boolean> ytwVar2 = qub0Var4.j1;
                                    Boolean bool4 = Boolean.FALSE;
                                    x5a0 x5a0Var2 = (x5a0) ytwVar2;
                                    x5a0Var2.setValue(bool4);
                                    if (zBooleanValue11) {
                                        qub0Var4.p1 = 2;
                                        Boolean bool5 = Boolean.TRUE;
                                        x5a0Var2.setValue(bool5);
                                        qub0Var4.S0().P1(1);
                                        qub0Var4.S0().Q1(-1);
                                        qub0Var4.S0().R1(true);
                                        qub0Var4.S0().S1(false);
                                        ((x5a0) qub0Var4.S0().c).setValue(bool5);
                                    } else {
                                        qub0Var4.S0().Q1(15);
                                        qub0Var4.S0().M1(!((BetContainerState) qub0Var4.S0().a.getValue()).getExtraKey());
                                        qub0Var4.S0().R1(false);
                                        ((x5a0) qub0Var4.S0().c).setValue(bool4);
                                    }
                                    qub0Var4.R0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(qub0Var3);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: rsb0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue11 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    final qub0 qub0Var4 = qub0Var3;
                                    ((x5a0) qub0Var4.c1().J).setValue(betData);
                                    int i7 = 1;
                                    if (zBooleanValue11) {
                                        qub0Var4.S0().G1(true);
                                        if (!((BetContainerState) qub0Var4.S0().a.getValue()).getBetPlaced()) {
                                            if (qub0Var4.j0) {
                                                ((BetContainerState) qub0Var4.S0().a.getValue()).setBetData(betData);
                                                MultiplierResponse multiplierResponse2 = qub0Var4.x0;
                                                String messageType = multiplierResponse2 != null ? multiplierResponse2.getMessageType() : null;
                                                if (messageType == null) {
                                                    messageType = "";
                                                }
                                                goj.A1(qub0Var4.c1(), betData, qub0Var4.z0, qub0Var4.U0, qub0Var4.h2, 1, "MANUAL", new ym2(qub0Var4, i7), new Function1() { // from class: hrb0
                                                    @Override // kotlin.jvm.functions.Function1
                                                    public final Object invoke(Object obj5) {
                                                        qub0 qub0Var5 = qub0Var4;
                                                        cgb.a(qub0Var5.e1(), (String) ((x5a0) qub0Var5.c1().v).getValue(), "placeBet", (String) obj5);
                                                        return Unit.a;
                                                    }
                                                }, null, Long.valueOf(qub0Var4.v3), messageType, 256);
                                            } else {
                                                qub0Var4.p0(qub0Var4.S0(), betData, null);
                                            }
                                        }
                                    } else {
                                        qub0Var4.S0().G1(false);
                                    }
                                    qub0Var4.R0().S1(true);
                                    qub0Var4.R0().P1(0);
                                    ((x5a0) qub0Var4.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(qub0Var3);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new reg(qub0Var3, 1);
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(qub0Var3);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new agz(qub0Var3, 1);
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(qub0Var3);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = qub0Var3.new h();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(qub0Var3);
                        final ComposeView composeView13 = composeView12;
                        boolean zA12 = zA11 | aVar.A(composeView13);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: ssb0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    qub0 qub0Var4 = qub0Var3;
                                    ytw<Boolean> ytwVar2 = qub0Var4.c1().T;
                                    Boolean bool4 = Boolean.TRUE;
                                    ((x5a0) ytwVar2).setValue(bool4);
                                    ((x5a0) qub0Var4.c1().J).setValue(betData);
                                    ((BetContainerState) qub0Var4.S0().a.getValue()).setBetData(betData);
                                    ytw<String> ytwVar3 = qub0Var4.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView14 = composeView13;
                                    String strB = w68.b(composeView14, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView14.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar3).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) qub0Var4.c1().R).setValue(f78.a(composeView14, R.string.yes_bet, w68.b(composeView14, R.string.yes_btn_cms), null));
                                    ((x5a0) qub0Var4.c1().S).setValue(f78.a(composeView14, R.string.cancel_bet, w68.b(composeView14, R.string.cancel_btn_cms), null));
                                    ((x5a0) qub0Var4.m1).setValue(bool4);
                                    qub0Var4.c1().E1(qub0Var4.S0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(qub0Var3);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new Function1() { // from class: msb0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    qub0 qub0Var4 = qub0Var3;
                                    ((BetContainerState) qub0Var4.S0().a.getValue()).setBetData(betData);
                                    ((x5a0) qub0Var4.F1).setValue(Boolean.TRUE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(qub0Var3);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new nsb0(qub0Var3, 0);
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(qub0Var3);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new nbq(qub0Var3, 1);
                            aVar.r(objY14);
                        }
                        m6a.a(multiplierResponse, betContainerState, l1zVarE1, zBooleanValue3, z, zBooleanValue6, t290VarJ1, function1, function2, function0, function3, function4, function5, function6, function7, function8, betComponentColors, cj5Var, zBooleanValue4, zBooleanValue2, zBooleanValue5, function9, function10, function11, function12, (Function0) objY14, oswVar, zBooleanValue7, zBooleanValue8, str, n6aVarJ3, zBooleanValue, zBooleanValue9, z2, zIsStakeSafeApplied, zBooleanValue10, aVar, 0, 102236160, 0, 524288, 0);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar35 = this.z;
        ViewGroup.LayoutParams layoutParams7 = gviVar35 != null ? gviVar35.V.getLayoutParams() : null;
        layoutParams7.getClass();
        ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
        layoutParams8.S = 1.0f;
        gvi gviVar36 = this.z;
        if (gviVar36 != null) {
            gviVar36.V.setLayoutParams(layoutParams8);
        }
        ltb0 ltb0Var = new ltb0(this, i2);
        cgg cggVar = new cgg(this, i3);
        this.J1 = ltb0Var;
        this.K1 = cggVar;
        gvi gviVar37 = this.z;
        jsb0 jsb0Var = this.w3;
        if (gviVar37 != null) {
            gviVar37.c.addOnLayoutChangeListener(jsb0Var);
        }
        gvi gviVar38 = this.z;
        if (gviVar38 != null) {
            gviVar38.d.addOnLayoutChangeListener(jsb0Var);
        }
        gvi gviVar39 = this.z;
        if (gviVar39 != null) {
            gviVar39.V.addOnLayoutChangeListener(jsb0Var);
        }
        o1().f.f(getViewLifecycleOwner(), new dvb0(new cub0()));
        o1().i.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: dub0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                izs izsVar = (izs) obj;
                int iOrdinal = izsVar.a.ordinal();
                qub0 qub0Var3 = this.a;
                if (iOrdinal == 1) {
                    ytw<TurboUsageCountResponse> ytwVar = gci0.c;
                    com.sportygames.common.framework.network.HTTPResponse hTTPResponse = (com.sportygames.common.framework.network.HTTPResponse) izsVar.b;
                    TurboUsageCountResponse turboUsageCountResponse = hTTPResponse != null ? (TurboUsageCountResponse) hTTPResponse.getData() : null;
                    ((x5a0) ytwVar).setValue(turboUsageCountResponse != null ? turboUsageCountResponse : null);
                    qub0Var3.s4();
                    qub0Var3.R3((TurboUsageCountResponse) ((x5a0) gci0.d).getValue());
                } else if (iOrdinal == 2) {
                    ((x5a0) gci0.c).setValue(null);
                    qub0Var3.s4();
                    qub0Var3.R3(null);
                }
                return Unit.a;
            }
        }));
        o1().z.f(getViewLifecycleOwner(), new dvb0(new qy7(this, i3)));
        o1().v.f(getViewLifecycleOwner(), new dvb0(new shg(this, i3)));
        this.C0.f(getViewLifecycleOwner(), new dvb0(new ge30(this, i3)));
        this.B0.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: vtb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TurboUsageCountResponse turboUsageCountResponse;
                Double turboValue;
                Long l2 = (Long) obj;
                l2.getClass();
                long jLongValue = l2.longValue();
                qub0 qub0Var3 = this.a;
                qub0Var3.v3 = jLongValue;
                Object value = ((x5a0) gci0.h).getValue();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.g(value, bool) && Intrinsics.g(((x5a0) gci0.r).getValue(), bool) && Intrinsics.g(((x5a0) gci0.x).getValue(), bool) && qub0Var3.y1() && (turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) gci0.d).getValue()) != null && (turboValue = turboUsageCountResponse.getTurboValue()) != null) {
                    double dDoubleValue = turboValue.doubleValue();
                    Long activateAfterRoundId = turboUsageCountResponse.getActivateAfterRoundId();
                    if (activateAfterRoundId != null) {
                        long jLongValue2 = activateAfterRoundId.longValue();
                        if (dDoubleValue >= 100.0d && qub0Var3.v3 > jLongValue2) {
                            ((x5a0) gci0.o).setValue(bool);
                            qub0Var3.R0().D1(true);
                            qub0Var3.S0().D1(true);
                        }
                    }
                }
                return Unit.a;
            }
        }));
        Q3().N.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: wtb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                qub0 qub0Var3 = this.a;
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    return Unit.a;
                }
                try {
                    LastHeroStandingSocketResponse lastHeroStandingSocketResponse = (LastHeroStandingSocketResponse) new eal().e(str, LastHeroStandingSocketResponse.class);
                    if (lastHeroStandingSocketResponse != null) {
                        ((x5a0) gci0.G).setValue(lastHeroStandingSocketResponse);
                        if (Intrinsics.g(lastHeroStandingSocketResponse.getMessageType(), "ENDED")) {
                            op5.a.getClass();
                            qub0Var3.b3(op5.b("lhs_end:sg_vip", "Last Hero Standing has Ended", null), "ended", "");
                        }
                    }
                } catch (Exception unused) {
                }
                return Unit.a;
            }
        }));
        Q3().O.f(getViewLifecycleOwner(), new dvb0(new qx7(this, i3)));
        Q3().P.f(getViewLifecycleOwner(), new dvb0(new ix2(this, i3)));
        Q3().Q.f(getViewLifecycleOwner(), new dvb0(new sx7(this, i3)));
        Q3().R.f(getViewLifecycleOwner(), new dvb0(new Function1() { // from class: xtb0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                final qub0 qub0Var3 = this.a;
                String str = (String) obj;
                if (str == null || str.length() == 0) {
                    return Unit.a;
                }
                try {
                    VipStatusResponse vipStatusResponse = (VipStatusResponse) new eal().e(str, VipStatusResponse.class);
                    if (vipStatusResponse != null) {
                        ((x5a0) gci0.e).setValue(vipStatusResponse);
                        VipStatusResponse vipStatusResponse2 = (VipStatusResponse) ((x5a0) gci0.f).getValue();
                        Object value = ((x5a0) gci0.h).getValue();
                        Boolean bool = Boolean.TRUE;
                        if (Intrinsics.g(value, bool) && Intrinsics.g(((x5a0) gci0.r).getValue(), bool) && qub0Var3.y1() && vipStatusResponse2 != null && !vipStatusResponse2.getVipStatus()) {
                            ((x5a0) q8b.d.b).setValue(bool);
                            gvi gviVar40 = qub0Var3.z;
                            if (gviVar40 != null) {
                                final ComposeView composeView13 = gviVar40.J;
                                composeView13.setViewCompositionStrategy(u6i0.c.a);
                                composeView13.setContent(new op8(141337905, new Function2() { // from class: iub0
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj2, Object obj3) {
                                        a aVar = (a) obj2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                            Context context4 = composeView13.getContext();
                                            if (context4 == null) {
                                                aVar.N(1529642938);
                                            } else {
                                                aVar.N(1529642939);
                                                q8b q8bVar = q8b.d;
                                                final qub0 qub0Var4 = qub0Var3;
                                                String str2 = (String) ((x5a0) qub0Var4.c1().D).getValue();
                                                ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(8046, new HTTPResponse(8046, qub0Var4.getString(R.string.vip_access_disabled), null, null, null, null, null, 64, null));
                                                context4.getColor(R.color.sh_error_btn_color_red);
                                                cj5 cj5VarU0 = qub0Var4.U0();
                                                boolean zA = aVar.A(qub0Var4);
                                                Object objY = aVar.y();
                                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                                if (zA || objY == c0042a) {
                                                    objY = new Function0() { // from class: mrb0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            qub0Var4.M0();
                                                            return Unit.a;
                                                        }
                                                    };
                                                    aVar.r(objY);
                                                }
                                                Function0 function0 = (Function0) objY;
                                                Object objY2 = aVar.y();
                                                if (objY2 == c0042a) {
                                                    objY2 = new nrb0();
                                                    aVar.r(objY2);
                                                }
                                                Function0 function1 = (Function0) objY2;
                                                Object objY3 = aVar.y();
                                                if (objY3 == c0042a) {
                                                    objY3 = new orb0();
                                                    aVar.r(objY3);
                                                }
                                                Function0 function2 = (Function0) objY3;
                                                Object objY4 = aVar.y();
                                                if (objY4 == c0042a) {
                                                    objY4 = new zl70(1);
                                                    aVar.r(objY4);
                                                }
                                                Function1 function3 = (Function1) objY4;
                                                Object objY5 = aVar.y();
                                                if (objY5 == c0042a) {
                                                    objY5 = new prb0(0);
                                                    aVar.r(objY5);
                                                }
                                                Function1 function4 = (Function1) objY5;
                                                Object objY6 = aVar.y();
                                                if (objY6 == c0042a) {
                                                    objY6 = new qrb0();
                                                    aVar.r(objY6);
                                                }
                                                q8bVar.a(context4, str2, genericError, function0, function1, function2, function3, function4, (Function1) objY6, cj5VarU0, aVar, 819683328);
                                                ((x5a0) q8bVar.b).setValue(Boolean.TRUE);
                                            }
                                            aVar.H();
                                        } else {
                                            aVar.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                return Unit.a;
            }
        }));
        Q3().S.f(getViewLifecycleOwner(), new dvb0(new jrb(this, i3)));
    }

    public final void p4() {
        int i2;
        Context context = getContext();
        if (context == null) {
            return;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f2 = displayMetrics.heightPixels;
        float f3 = displayMetrics.widthPixels;
        if (f2 == 0.0f || f3 == 0.0f) {
            return;
        }
        float f4 = f2 / f3;
        if (f4 >= 2.1f) {
            i2 = R.dimen._80sdp;
        } else if (f4 >= 2.0f) {
            i2 = R.dimen._60sdp;
        } else {
            i2 = f4 >= 1.82f ? R.dimen._46sdp : R.dimen._38sdp;
        }
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.Q.setShBottomImageMargin(i2);
        }
    }

    public final void q3(b6c0 b6c0Var) {
        int iB;
        gvi gviVar;
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            ConstraintLayout constraintLayout = gviVar2.F;
            boolean z = b6c0Var == b6c0.a;
            this.h3 = b6c0Var;
            int i2 = 8;
            if (z) {
                i4();
                Object value = ((x5a0) gci0.h).getValue();
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.g(value, bool) && Intrinsics.g(((x5a0) gci0.r).getValue(), bool)) {
                    ((x5a0) gci0.i).setValue(bool);
                    this.i3 = true;
                }
            } else {
                gviVar2.V.setVisibility(8);
                this.l0 = false;
                Object value2 = ((x5a0) gci0.h).getValue();
                Boolean bool2 = Boolean.TRUE;
                if (Intrinsics.g(value2, bool2)) {
                    if (Intrinsics.g(((x5a0) gci0.r).getValue(), bool2) && Intrinsics.g(((x5a0) gci0.z).getValue(), bool2) && this.i3) {
                        op5.a.getClass();
                        w4(op5.b("unavailable_in_sidebets:sg_vip", "Stakesafe not available in O/U & Range", null));
                    }
                    ((x5a0) gci0.i).setValue(Boolean.FALSE);
                    this.i3 = false;
                }
            }
            gvi gviVar3 = this.z;
            if (gviVar3 != null) {
                gviVar3.c.setVisibility(z ? 0 : 8);
            }
            gvi gviVar4 = this.z;
            if (gviVar4 != null) {
                gviVar4.j0.setVisibility(z ? 0 : 8);
            }
            gvi gviVar5 = this.z;
            if (gviVar5 != null) {
                gviVar5.d.setVisibility(z ? 0 : 8);
            }
            A4();
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                gviVar6.n0.setVisibility(z ? 0 : 8);
            }
            gvi gviVar7 = this.z;
            if (gviVar7 != null) {
                gviVar7.o0.setVisibility(z ? 0 : 8);
            }
            if (z && (gviVar = this.z) != null && gviVar.c.getVisibility() == 0) {
                i2 = 0;
            }
            gvi gviVar8 = this.z;
            if (gviVar8 != null) {
                gviVar8.v.setVisibility(i2);
            }
            gvi gviVar9 = this.z;
            if (gviVar9 != null) {
                gviVar9.w.setVisibility(i2);
            }
            gvi gviVar10 = this.z;
            if (gviVar10 != null) {
                gviVar10.o0.setVisibility(i2);
            }
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.f(constraintLayout);
            boolean zIsEmpty = this.U2.isEmpty();
            if (zIsEmpty) {
                iB = 0;
            } else {
                int height = constraintLayout.getHeight();
                Integer numValueOf = height > 0 ? Integer.valueOf(height) : null;
                iB = ycv.b((numValueOf != null ? numValueOf.intValue() : constraintLayout.getResources().getDisplayMetrics().heightPixels) * 0.00625f);
            }
            int dimensionPixelSize = !zIsEmpty ? iB : constraintLayout.getResources().getDimensionPixelSize(R.dimen._3sdp);
            if (z) {
                s3(bVar);
                bVar.j(R.id.bet_view, z3);
                bVar.j(R.id.space, 0.005f);
                bVar.j(R.id.bet_view1, z3);
                bVar.i(R.id.side_bet_content_view, 0);
                bVar.e(R.id.side_bet_content_view, 4);
                bVar.g(R.id.side_bet_content_view, 4, R.id.bet_view1, 4);
                bVar.e(R.id.tournament_view, 3);
                bVar.e(R.id.tournament_view, 4);
                bVar.h(R.id.tournament_view, 3, R.id.bet_view1, 4, iB);
                p3(bVar, constraintLayout, ((u5a0) this.g3).D() == 1);
                Iterator it = kotlin.collections.b.k(Integer.valueOf(R.id.top_list), Integer.valueOf(R.id.top_list_blur_bg)).iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    bVar.e(iIntValue, 3);
                    bVar.h(iIntValue, 3, R.id.tournament_view, 4, dimensionPixelSize);
                }
            } else {
                float fE3 = E3(Y3());
                bVar.e(R.id.side_bet_content_view, 4);
                bVar.j(R.id.side_bet_content_view, fE3);
                bVar.e(R.id.tournament_view, 3);
                bVar.e(R.id.tournament_view, 4);
                bVar.h(R.id.tournament_view, 3, R.id.side_bet_content_view, 4, constraintLayout.getResources().getDimensionPixelSize(R.dimen._3sdp));
            }
            bVar.b(constraintLayout);
            constraintLayout.requestLayout();
            if (!z) {
                k4();
            }
            constraintLayout.post(new Runnable() { // from class: isb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.j4();
                }
            });
        }
    }

    public final void q4() {
        List<DetailResponse> list = this.Z1;
        DetailResponse detailResponse = list != null ? (DetailResponse) CollectionsKt.V(0, list) : null;
        List<DetailResponse> list2 = this.Z1;
        DetailResponse detailResponse2 = list2 != null ? (DetailResponse) CollectionsKt.V(1, list2) : null;
        if (detailResponse != null) {
            R0().L1(detailResponse);
        }
        if (detailResponse2 != null) {
            S0().L1(detailResponse2);
        }
        R0().U1(true);
        S0().U1(true);
    }

    public final void r4(TurboUsageCountResponse turboUsageCountResponse) {
        Double stakeLimit;
        if (turboUsageCountResponse == null || (stakeLimit = turboUsageCountResponse.getStakeLimit()) == null) {
            return;
        }
        if (stakeLimit.doubleValue() <= 0.0d) {
            stakeLimit = null;
        }
        if (stakeLimit != null) {
            double dDoubleValue = stakeLimit.doubleValue();
            this.a2 = stakeLimit;
            DetailResponse detailResponseCopy$default = DetailResponse.copy$default(R0().y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue, 0, 0, null, null, null, 8063, null);
            DetailResponse detailResponseCopy$default2 = DetailResponse.copy$default(S0().y1(), 0.0d, 0.0d, 0.0d, null, null, null, 0.0d, dDoubleValue, 0, 0, null, null, null, 8063, null);
            R0().L1(detailResponseCopy$default);
            S0().L1(detailResponseCopy$default2);
            R0().U1(true);
            S0().U1(true);
        }
    }

    public final void s4() {
        gvi gviVar = this.z;
        if (gviVar != null) {
            final ComposeView composeView = gviVar.q0;
            boolean zG = false;
            final SharedPreferences sharedPreferences = composeView.getContext().getSharedPreferences("vip_elite_data", 0);
            sharedPreferences.getClass();
            try {
                zG = Intrinsics.g(sharedPreferences.getString("one_time_fetch", null), "ui_animated");
            } catch (Exception unused) {
            }
            if (!this.o3) {
                composeView.setTranslationX(zG ? 0.0f : composeView.getResources().getDisplayMetrics().widthPixels);
            }
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(2032409726, new Function2() { // from class: hub0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        twd0<Boolean> twd0Var = gci0.D;
                        twd0<Boolean> twd0Var2 = gci0.F;
                        x5a0 x5a0Var = (x5a0) twd0Var;
                        Boolean bool = (Boolean) x5a0Var.getValue();
                        bool.booleanValue();
                        x5a0 x5a0Var2 = (x5a0) twd0Var2;
                        Boolean bool2 = (Boolean) x5a0Var2.getValue();
                        bool2.booleanValue();
                        qub0 qub0Var = this;
                        boolean zA = aVar.A(qub0Var);
                        ComposeView composeView2 = composeView;
                        boolean zA2 = zA | aVar.A(composeView2);
                        SharedPreferences sharedPreferences2 = sharedPreferences;
                        boolean zA3 = aVar.A(sharedPreferences2) | zA2 | aVar.M(x5a0Var) | aVar.M(x5a0Var2);
                        Object objY = aVar.y();
                        if (zA3 || objY == a.C0041a.a) {
                            qub0.k kVar = qub0Var.new k(composeView2, sharedPreferences2, x5a0Var, x5a0Var2, null);
                            aVar.r(kVar);
                            objY = kVar;
                        }
                        xvf.g(bool, bool2, (Function2) objY, aVar);
                        lei0 lei0VarO1 = qub0Var.o1();
                        TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) gci0.d).getValue();
                        Boolean bool3 = (Boolean) ((x5a0) gci0.p).getValue();
                        lyg0.a(lei0VarO1, turboUsageCountResponse, null, 0.0f, 0.0f, 0L, 0L, 0L, 0L, bool3 != null ? bool3.booleanValue() : false, ((Boolean) ((x5a0) wag0.h).getValue()).booleanValue(), aVar, 8 | (TurboUsageCountResponse.$stable << 3));
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    public final void t3(float f2, float f3) {
        gvi gviVar = this.z;
        if (gviVar != null) {
            ConstraintLayout constraintLayout = gviVar.F;
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.f(constraintLayout);
            bVar.j(R.id.multiplier_view, f2);
            p3(bVar, constraintLayout, f3 <= 0.2f);
            bVar.b(constraintLayout);
        }
    }

    public final boolean t4() {
        if (!Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE)) {
            return false;
        }
        gvi gviVar = this.z;
        if (gviVar != null && gviVar.s0.getVisibility() == 0) {
            return true;
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null && gviVar2.s0.getVisibility() == 4) {
            return true;
        }
        gvi gviVar3 = this.z;
        if ((gviVar3 == null || gviVar3.r0.getVisibility() != 0) && !this.r3 && this.q3 == null) {
            return ((Boolean) ((x5a0) gci0.D).getValue()).booleanValue() && !((Boolean) ((x5a0) gci0.F).getValue()).booleanValue();
        }
        return true;
    }

    public final void u3() {
        float f2;
        c6c0 c6c0VarO3 = O3();
        boolean z = c6c0VarO3 != null ? c6c0VarO3.c : this.p0;
        boolean zBooleanValue = c6c0VarO3 != null ? c6c0VarO3.d : ((Boolean) ((x5a0) c1().l0).getValue()).booleanValue();
        boolean zBooleanValue2 = c6c0VarO3 != null ? c6c0VarO3.e : ((Boolean) ((x5a0) c1().m0).getValue()).booleanValue();
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.Q.setSHImage();
        }
        double d2 = this.y2;
        gvi gviVar2 = this.z;
        if (d2 <= 3.0d) {
            if (gviVar2 != null) {
                gviVar2.Q.setShBottomImage(z, zBooleanValue, zBooleanValue2);
            }
            if (zBooleanValue2) {
                p4();
            }
        } else if (zBooleanValue2) {
            if (gviVar2 != null) {
                gviVar2.Q.setShBottomImageScale(1.0f);
            }
            gvi gviVar3 = this.z;
            if (gviVar3 != null) {
                gviVar3.Q.setShBottomImage(z, zBooleanValue, true);
            }
            p4();
        } else {
            if (gviVar2 != null) {
                gviVar2.Q.setShBottomImageV2(z, zBooleanValue, false);
            }
            Context context = getContext();
            if (context != null) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                float f3 = displayMetrics.heightPixels;
                float f4 = displayMetrics.widthPixels;
                if (f3 != 0.0f && f4 != 0.0f) {
                    float f5 = f3 / f4;
                    if (f5 >= 2.1f) {
                        f2 = 1.6f;
                    } else if (f5 >= 1.9f) {
                        f2 = 1.5f;
                    } else {
                        f2 = f5 >= 1.8f ? 1.3f : 1.2f;
                    }
                    gvi gviVar4 = this.z;
                    if (gviVar4 != null) {
                        gviVar4.Q.setShBottomImageScale(f2);
                    }
                }
            }
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.Q.setShGameLogoImage();
        }
    }

    public final void u4(int i2) {
        gvi gviVar;
        if (!A1() || !((Boolean) ((x5a0) this.M2).getValue()).booleanValue()) {
            gvi gviVar2 = this.z;
            if (gviVar2 != null) {
                gviVar2.V.setVisibility(8);
                return;
            }
            return;
        }
        if (t4()) {
            gvi gviVar3 = this.z;
            if (gviVar3 != null) {
                gviVar3.V.setVisibility(8);
            }
            this.l0 = false;
            return;
        }
        if (i2 == 1 && !W3()) {
            gvi gviVar4 = this.z;
            if (gviVar4 != null) {
                gviVar4.V.setVisibility(8);
            }
            this.l0 = false;
            return;
        }
        this.l0 = true;
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.V.setVisibility(0);
        }
        if ((i2 == 0 || i2 == 1) && (gviVar = this.z) != null) {
            gviVar.c.post(new Runnable() { // from class: ytb0
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.z4();
                }
            });
        }
        gvi gviVar6 = this.z;
        if (gviVar6 != null) {
            ComposeView composeView = gviVar6.V;
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(4905520, new rbg(this, i2, composeView), true));
        }
    }

    public final void v4(boolean z) {
        if (((Boolean) ((x5a0) this.d1).getValue()).booleanValue()) {
            return;
        }
        op5 op5Var = op5.a;
        String string = getString(z ? R.string.range_max_payout_exceed_message_cms : R.string.over_under_max_payout_exceed_message_cms);
        string.getClass();
        String string2 = getString(R.string.exceed_max_payout_error);
        string2.getClass();
        op5Var.getClass();
        ((x5a0) c1().H).setValue(op5.b(string, string2, null));
        ((x5a0) c1().K).setValue(new j58(r58.d(4287000099L)));
        ((x5a0) c1().L).setValue(new j58(j58.f));
        ((x5a0) c1().Q).setValue(3000);
        ((x5a0) c1().M).setValue(2);
        ((x5a0) c1().O).setValue(Boolean.TRUE);
        fgb.a3(this);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026  */
    /* JADX WARN: Code duplicated, block: B:18:0x0035  */
    /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
    public final void w3() {
        Double d2;
        double dDoubleValue;
        Double stakeLimit;
        StakeSafeUsageCountResponse stakeSafeUsageCountResponse = (StakeSafeUsageCountResponse) ((x5a0) gci0.b).getValue();
        Double d3 = null;
        if (stakeSafeUsageCountResponse == null || (stakeLimit = stakeSafeUsageCountResponse.getStakeLimit()) == null) {
            d2 = this.b2;
            if (d2 != null && d2.doubleValue() > 0.0d) {
                d3 = d2;
            }
            if (d3 != null) {
                return;
            } else {
                dDoubleValue = d3.doubleValue();
            }
        } else {
            if (stakeLimit.doubleValue() <= 0.0d) {
                stakeLimit = null;
            }
            if (stakeLimit != null) {
                dDoubleValue = stakeLimit.doubleValue();
            } else {
                d2 = this.b2;
                if (d2 != null) {
                    d3 = d2;
                }
                if (d3 != null) {
                    return;
                } else {
                    dDoubleValue = d3.doubleValue();
                }
            }
        }
        this.b2 = Double.valueOf(dDoubleValue);
        x3(dDoubleValue, R0());
        x3(dDoubleValue, S0());
    }

    public final void w4(String str) {
        jvd0 jvd0Var = this.n3;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.t0.setVisibility(0);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.t0.setContent(new op8(-1578409417, new or70(str, 1), true));
        }
        this.n3 = ej5.c(ebs.a(getLifecycle()), null, null, new l(null), 3);
    }

    public final void x4(final int i2, final String str) {
        ShMultiplierContainer shMultiplierContainer = this.E2;
        if (shMultiplierContainer != null) {
            shMultiplierContainer.setCoefficientsHiddenByVipSheet(true);
        }
        gvi gviVar = this.z;
        if (gviVar != null) {
            final ComposeView composeView = gviVar.s0;
            composeView.setVisibility(4);
            this.u3++;
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(873347742, new Function2() { // from class: jub0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str2;
                    int i3;
                    Object mVar;
                    Integer num;
                    String str3;
                    qub0 qub0Var;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ytw<Boolean> ytwVar = wag0.h;
                        isw iswVar = wag0.j;
                        x5a0 x5a0Var = (x5a0) wag0.m;
                        String str4 = ((wag0.a) x5a0Var.getValue()).a;
                        Double dH = str4 != null ? b.h(str4) : null;
                        if (dH == null) {
                            str2 = "0.00x";
                        } else {
                            str2 = new DecimalFormat("0.00").format(dH.doubleValue()) + 'x';
                        }
                        String str5 = ((wag0.a) x5a0Var.getValue()).b;
                        long j2 = (!Intrinsics.g(str5, "ROUND_ONGOING") && Intrinsics.g(str5, "ROUND_END_WAIT")) ? abi0.j : abi0.k;
                        boolean zG = Intrinsics.g(((wag0.a) x5a0Var.getValue()).b, "ROUND_WAITING");
                        boolean zG2 = Intrinsics.g(((wag0.a) x5a0Var.getValue()).b, "ROUND_END_WAIT");
                        op5 op5Var = op5.a;
                        op5Var.getClass();
                        String strB = op5.b("flew_away:sg_sporty_hero", "FLEW AWAY!", null);
                        String strB2 = op5.b("sh_about_vip:sg_vip", "--", null);
                        qub0 qub0Var2 = this.a;
                        Integer numValueOf = Integer.valueOf(qub0Var2.u3);
                        ComposeView composeView2 = composeView;
                        boolean zA = aVar.A(composeView2);
                        String str6 = str;
                        boolean zM = zA | aVar.M(str6);
                        int i4 = i2;
                        boolean zD = zM | aVar.d(i4) | aVar.A(qub0Var2);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zD || objY == c0042a) {
                            i3 = i4;
                            num = numValueOf;
                            mVar = new qub0.m(composeView2, str6, i3, qub0Var2, null);
                            str3 = str6;
                            qub0Var = qub0Var2;
                            aVar.r(mVar);
                        } else {
                            mVar = objY;
                            qub0Var = qub0Var2;
                            str3 = str6;
                            num = numValueOf;
                            i3 = i4;
                        }
                        xvf.e(aVar, num, (Function2) mVar);
                        String strC = op5.c(op5Var, "last_round:sg_vip", "Last Round");
                        if (str3.equals("VIP_ONBOARDING")) {
                            aVar.N(-1007145565);
                            SnapshotStateList<ps6> snapshotStateList = qub0Var.g0;
                            float fFloatValue = iswVar.getValue().floatValue();
                            lei0 lei0VarO1 = qub0Var.o1();
                            boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                            int i5 = qub0Var.u3;
                            long jQ = ((cj5) ((x5a0) qub0Var.c1().f0).getValue()).q();
                            int totalMillis = ((MultiplierResponse) ((x5a0) qub0Var.R0().b).getValue()).getTotalMillis();
                            int millisLeft = ((MultiplierResponse) ((x5a0) qub0Var.R0().b).getValue()).getMillisLeft();
                            String strC2 = op5.c(op5Var, pwo.e(R.string.power_up_next_round_cms, aVar), pwo.e(R.string.powering_up_for_next_round, aVar));
                            j58 j58Var = new j58(j2);
                            boolean zA2 = aVar.A(qub0Var);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new kdz(qub0Var, 2);
                                aVar.r(objY2);
                            }
                            Function0 function0 = (Function0) objY2;
                            boolean zA3 = aVar.A(qub0Var);
                            Object objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a) {
                                objY3 = new ldz(qub0Var, 1);
                                aVar.r(objY3);
                            }
                            Function0 function1 = (Function0) objY3;
                            boolean zA4 = aVar.A(qub0Var);
                            Object objY4 = aVar.y();
                            if (zA4 || objY4 == c0042a) {
                                objY4 = new ndz(qub0Var, 1);
                                aVar.r(objY4);
                            }
                            Function0 function2 = (Function0) objY4;
                            boolean zA5 = aVar.A(qub0Var);
                            Object objY5 = aVar.y();
                            if (zA5 || objY5 == c0042a) {
                                objY5 = new zkb(qub0Var, 1);
                                aVar.r(objY5);
                            }
                            Function0 function3 = (Function0) objY5;
                            Object objY6 = aVar.y();
                            if (objY6 == c0042a) {
                                objY6 = new srb0();
                                aVar.r(objY6);
                            }
                            vdi0.f(strB2, str2, j58Var, snapshotStateList, zG2, strB, function0, function1, fFloatValue, lei0VarO1, zBooleanValue, i3, function2, function3, i5, zG, millisLeft, totalMillis, strC2, jQ, (Function1) objY6, aVar, 1073741824);
                            aVar.H();
                        } else if (str3.equals("LAST_HERO_STANDING_SHEET")) {
                            aVar.N(-1004487191);
                            SnapshotStateList<ps6> snapshotStateList2 = qub0Var.g0;
                            float fFloatValue2 = iswVar.getValue().floatValue();
                            String str7 = str2;
                            lei0 lei0VarO2 = qub0Var.o1();
                            boolean zBooleanValue2 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                            int i6 = qub0Var.u3;
                            long jQ2 = ((cj5) ((x5a0) qub0Var.c1().f0).getValue()).q();
                            int totalMillis2 = ((MultiplierResponse) ((x5a0) qub0Var.R0().b).getValue()).getTotalMillis();
                            int millisLeft2 = ((MultiplierResponse) ((x5a0) qub0Var.R0().b).getValue()).getMillisLeft();
                            String strC3 = op5.c(op5Var, pwo.e(R.string.power_up_next_round_cms, aVar), pwo.e(R.string.powering_up_for_next_round, aVar));
                            b5 b5Var = (b5) qub0Var.v1.getValue();
                            j58 j58Var2 = new j58(j2);
                            boolean zA6 = aVar.A(qub0Var);
                            Object objY7 = aVar.y();
                            if (zA6 || objY7 == c0042a) {
                                objY7 = new odz(qub0Var, 1);
                                aVar.r(objY7);
                            }
                            Function0 function4 = (Function0) objY7;
                            boolean zA7 = aVar.A(qub0Var);
                            Object objY8 = aVar.y();
                            if (zA7 || objY8 == c0042a) {
                                objY8 = new w9q(qub0Var, 1);
                                aVar.r(objY8);
                            }
                            Function0 function5 = (Function0) objY8;
                            boolean zA8 = aVar.A(qub0Var);
                            Object objY9 = aVar.y();
                            if (zA8 || objY9 == c0042a) {
                                objY9 = new dlb(qub0Var, 2);
                                aVar.r(objY9);
                            }
                            Function0 function6 = (Function0) objY9;
                            Object objY10 = aVar.y();
                            if (objY10 == c0042a) {
                                objY10 = new trb0();
                                aVar.r(objY10);
                            }
                            vnr.c(str7, j58Var2, zG2, strB, snapshotStateList2, function4, function5, fFloatValue2, lei0VarO2, zBooleanValue2, function6, (Function1) objY10, i6, zG, millisLeft2, totalMillis2, strC3, jQ2, b5Var, strC, aVar, 134217728);
                            aVar.H();
                        } else {
                            aVar.N(1768773538);
                            aVar.H();
                        }
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    public final void y3() {
        ytw<StakeSafeUsageCountResponse> ytwVar = gci0.a;
        TurboUsageCountResponse turboUsageCountResponse = (TurboUsageCountResponse) ((x5a0) gci0.d).getValue();
        if (turboUsageCountResponse != null) {
            Double turboValue = turboUsageCountResponse.getTurboValue();
            if ((turboValue != null ? turboValue.doubleValue() : 0.0d) >= 100.0d) {
                r4(turboUsageCountResponse);
            }
        }
    }

    public final void y4() {
        ssw<List<UserPlayInfo>> sswVar = wag0.c;
        Iterable<TournamentUserPlayInfo> iterable = this.V2;
        if (iterable == null) {
            iterable = m2g.a;
        }
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        for (TournamentUserPlayInfo tournamentUserPlayInfo : iterable) {
            arrayList.add(new UserPlayInfo(tournamentUserPlayInfo.getTournamentId(), tournamentUserPlayInfo.getRank(), tournamentUserPlayInfo.getPointsScore()));
        }
        sswVar.j(arrayList);
    }

    public final boolean z3() {
        gvi gviVar = this.z;
        return ((gviVar != null && gviVar.s0.getVisibility() == 0) || ((BetContainerState) R0().a.getValue()).getCashoutInProgress() || ((BetContainerState) S0().a.getValue()).getCashoutInProgress() || ((BetContainerState) R0().a.getValue()).getBetPlaced() || ((BetContainerState) S0().a.getValue()).getBetPlaced()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:65:0x0122  */
    public final void z4() {
        String lowerCase;
        yqb0.b bVar;
        float f2;
        gvi gviVar = this.z;
        if (gviVar != null) {
            ComposeView composeView = gviVar.V;
            if (composeView.getWidth() <= 0 || composeView.getHeight() <= 0) {
                return;
            }
            gvi gviVar2 = this.z;
            boolean z = gviVar2 != null && gviVar2.f0.getVisibility() == 0;
            String country = SportyGamesManager.getInstance().getCountry();
            if (country != null) {
                lowerCase = country.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            } else {
                lowerCase = null;
            }
            if (lowerCase == null) {
                lowerCase = "";
            }
            boolean z2 = (lowerCase.equals("gh") || lowerCase.equals("mx")) ? false : true;
            gvi gviVar3 = this.z;
            lk40 lk40VarD4 = gviVar3 != null ? d4(gviVar3.c, composeView) : null;
            gvi gviVar4 = this.z;
            lk40 lk40VarD5 = gviVar4 != null ? d4(gviVar4.d, composeView) : null;
            float width = composeView.getWidth();
            float height = composeView.getHeight();
            n6a n6aVarJ3 = J3(getResources().getDimensionPixelSize(R.dimen._8sdp) / getResources().getDisplayMetrics().density);
            float f3 = n6aVarJ3.m;
            float f4 = n6aVarJ3.l;
            float f5 = n6aVarJ3.b;
            float f6 = n6aVarJ3.a;
            float dimension = getResources().getDimension(R.dimen._2sdp);
            float dimension2 = getResources().getDimension(R.dimen._8sdp);
            if (lk40VarD4 != null) {
                float f7 = lk40VarD4.c;
                float f8 = lk40VarD4.b;
                boolean z4 = z;
                float f9 = lk40VarD4.d;
                if (f7 - lk40VarD4.a > 0.0f) {
                    float f10 = f9 - f8;
                    if (f10 <= 0.0f || width <= 0.0f || height <= 0.0f) {
                        bVar = null;
                    } else {
                        float f11 = f6 + f5;
                        float f12 = f11 + f4 + f3 + n6aVarJ3.n;
                        if (f12 <= 0.0f) {
                            bVar = null;
                        } else {
                            float f13 = f10 / height;
                            float f14 = ((f4 + f3) / f12) * f13;
                            float f15 = (f13 * (f11 / f12)) + (f8 / height);
                            if (z4) {
                                f2 = 0.0f;
                            } else {
                                f2 = z2 ? 0.046f : 0.018f;
                            }
                            float f16 = ((f14 + f15) + 0.006f) - f2;
                            float f17 = 0.015f * width;
                            float f18 = (((z4 ? 0.0f : -0.047f) + f15) * height) - dimension;
                            if (f18 < 0.0f) {
                                f18 = 0.0f;
                            }
                            float f19 = 0.985f * width;
                            float f20 = (f16 * height) + dimension;
                            if (f20 > height) {
                                f20 = height;
                            }
                            bVar = new yqb0.b(new lk40(f17, f18, f19, f20), f15);
                        }
                    }
                } else {
                    bVar = null;
                }
            } else {
                bVar = null;
            }
            ((x5a0) this.K2).setValue(bVar != null ? bVar.a : null);
            if (bVar != null) {
                ((t5a0) this.L2).A(bVar.b);
            }
            ((x5a0) this.N2).setValue(lk40VarD4 != null ? yqb0.b(lk40VarD4, width, height, n6aVarJ3, dimension2) : null);
            ((x5a0) this.O2).setValue(lk40VarD5 != null ? yqb0.b(lk40VarD5, width, height, n6aVarJ3, dimension2) : null);
        }
    }

    @Override // defpackage.fgb
    public final void F2(boolean z) {
    }
}
