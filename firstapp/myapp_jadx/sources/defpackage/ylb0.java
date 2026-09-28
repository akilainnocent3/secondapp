package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.crypto.IURC.iKBWavCysVP;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.OnboardingItem;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import com.sportygames.wheelanddeal.model.dX.vZBMKENANSz;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006@²\u0006\u000e\u0010\b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\t\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\u0019\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001a\u001a\u00020\f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001b\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001e\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001f\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010 \u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0018\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\f\u0010#\u001a\u00020!8\nX\u008a\u0084\u0002²\u0006\u000e\u0010$\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010%\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010'\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\u000e\u0010(\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010)\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010*\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010+\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010,\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010-\u001a\u0004\u0018\u00010\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010.\u001a\u00020&8\nX\u008a\u0084\u0002²\u0006\u000e\u0010/\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00100\u001a\u00020&8\n@\nX\u008a\u008e\u0002²\u0006\f\u00101\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u0002048\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006(\u0010:\u001a\u001e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f07j\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f`98\nX\u008a\u0084\u0002²\u0006(\u0010;\u001a\u001e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f07j\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f`98\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020\f8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u00178\nX\u008a\u0084\u0002²\u0006\f\u0010<\u001a\u0002048\nX\u008a\u0084\u0002²\u0006\f\u0010=\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006(\u0010>\u001a\u001e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f07j\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f`98\nX\u008a\u0084\u0002²\u0006(\u0010?\u001a\u001e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f07j\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020\f`98\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\f8\nX\u008a\u0084\u0002"}, d2 = {"Lylb0;", "Lobw;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "b", "a", "Ljava/io/File;", "speedoAtlas", "speedoJson", "Lcom/sportygames/crash/remote/models/MultiplierResponse;", "multiplierResponse", "", "spineSuspended", "bonusButtonVisible", "bonusRoundVisible", "resumeOngoingPreview", "", "Lcom/sportygames/multilevel/common/model/TopBonusWinsDto;", "topBonusWinList", "", "cheerMessage", "shownLevelRewards", "Ljph0;", "userProgressState", "showMultiLevelFbgNotification", "showNotification", "poweringAtlas", "poweringJson", "ongoingAtlas", "ongoingJson", "carAtlas", "carJson", "Lcom/sportygames/crash/models/bet/BetContainerState;", "betState", "betState2", "buildingLevelFourAtlas", "buildingLevelFourJson", "", "stagedTierLevel", "stagedPoweringAtlas", "stagedPoweringJson", "stagedOngoingAtlas", "stagedOngoingJson", "stagedBuildingLevelFourAtlas", "stagedBuildingLevelFourJson", "spineDisplayLevel", "previousSpineLevelForBgMusic", "lastPrefetchedNextLevel", "forceReplay", "giftResponseReceived", "userLevelProgressState", "Ly6s;", "levelConfigStateForBetUi", "multiplierForBonusUi", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "cashoutDoneMap1", "cashoutDoneMap2", "levelConfigStateForBetUi2", "multiplierForBonusUi2", "cashoutDoneMap1ForBet2", "cashoutDoneMap2ForBet2", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ylb0 extends obw {
    public boolean F2;
    public boolean G2;
    public boolean H2;
    public boolean I2;
    public Long J2;
    public boolean K2;
    public boolean L2;
    public long M2;
    public final ytw<Boolean> N2;
    public final ytw<Boolean> O2;
    public final ytw<Boolean> P2;
    public final ttr Q2;
    public final ttr R2;
    public final a0 S2;
    public final ytw<Integer> T2;
    public final vbw U2;
    public int V2;

    /* JADX INFO: loaded from: classes7.dex */
    public static final class a {
        public final File a;
        public final File b;
        public final File c;

        public a(File file, File file2, File file3) {
            this.a = file;
            this.b = file2;
            this.c = file3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && Intrinsics.g(this.c, aVar.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
            File file = this.c;
            return iHashCode + (file == null ? 0 : file.hashCode());
        }

        public final String toString() {
            return "LoadedSpineFiles(atlas=" + this.a + ", json=" + this.b + ", png=" + this.c + ")";
        }
    }

    public static final class a0 implements pbw {
        public final udw a = new udw();

        public a0() {
        }

        @Override // defpackage.pbw
        public final void a() {
            ylb0 ylb0Var = ylb0.this;
            if (((Boolean) ((x5a0) ylb0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ylb0Var.i0).getValue()).booleanValue() && !ylb0Var.l0) {
                ypa0 ypa0VarL1 = ylb0Var.l1();
                String string = ylb0Var.getString(R.string.level_unlock);
                string.getClass();
                ypa0VarL1.A1(0L, string);
            }
        }

        @Override // defpackage.pbw
        public final int b(int i) {
            int iE = kotlin.ranges.f.e(i, 1, 5);
            if (iE == 1) {
                return R.string.sporty_cars_level_name_1;
            }
            if (iE == 2) {
                return R.string.sporty_cars_level_name_2;
            }
            if (iE != 3) {
                return iE != 4 ? R.string.sporty_cars_level_name_5 : R.string.sporty_cars_level_name_4;
            }
            return R.string.sporty_cars_level_name_3;
        }

        @Override // defpackage.pbw
        public final void c(int i) {
            ylb0.this.T3(i);
        }

        @Override // defpackage.pbw
        public final void d(int i) {
            ylb0.this.A3(i, false);
        }

        @Override // defpackage.pbw
        public final String e(int i) {
            int iE = kotlin.ranges.f.e(i, 1, 5);
            if (iE == 1) {
                return op5.c(op5.a, "car_image_bg_level_1:sg_game_name", "https://s.sporty.net/cms/Mask_group_1_7e2af0297b.png");
            }
            if (iE == 2) {
                return op5.c(op5.a, iKBWavCysVP.oZAqc, "https://s.sporty.net/cms/Mask_group_3_c4a14f6a2f.png");
            }
            if (iE == 3) {
                return op5.c(op5.a, "car_image_bg_level_3:sg_game_name", "https://s.sporty.net/cms/Mask_group_2_10257e9a7a.png");
            }
            if (iE != 4) {
                return iE != 5 ? op5.c(op5.a, "car_image_bg_level_1:sg_game_name", "https://s.sporty.net/cms/Mask_group_1_7e2af0297b.png") : op5.c(op5.a, "car_image_bg_level_5:sg_game_name", "https://s.sporty.net/cms/Mask_group_4_a28b75a7c7.png");
            }
            return op5.c(op5.a, "car_image_bg_level_4:sg_game_name", "https://s.sporty.net/cms/Mask_group_e78d7312e4.png");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes7.dex */
    public static final class b {
        public static final b a;
        public static final b b;
        public static final b c;
        public static final /* synthetic */ b[] d;

        static {
            b bVar = new b("ACTIVE", 0);
            a = bVar;
            b bVar2 = new b("STAGED", 1);
            b = bVar2;
            b bVar3 = new b("CACHE_ONLY", 2);
            c = bVar3;
            d = new b[]{bVar, bVar2, bVar3};
        }

        public b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) d.clone();
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$stageNextTierSpinesForUnlock$1", f = "SportyCarFragment.kt", l = {227}, m = "invokeSuspend", v = 1)
    public static final class b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(int i, v1b<? super b0> v1bVar) {
            super(2, v1bVar);
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new b0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b bVar = b.b;
                this.a = 1;
                if (ylb0.this.u3(this.c, bVar, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$downloadLevelMultiplierSpines$1", f = "SportyCarFragment.kt", l = {217}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, boolean z, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = i;
            this.d = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new c(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b bVar = this.d ? b.a : b.c;
                this.a = 1;
                if (ylb0.this.u3(this.c, bVar, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$syncSpineDisplayLevelImmediately$applied$1", f = "SportyCarFragment.kt", l = {428}, m = "invokeSuspend", v = 1)
    public static final class c0 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(int i, v1b<? super c0> v1bVar) {
            super(2, v1bVar);
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new c0(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((c0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
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
            b bVar = b.a;
            this.a = 1;
            Object objU3 = ylb0.this.u3(this.c, bVar, this);
            return objU3 == y5bVar ? y5bVar : objU3;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onAccountChanged$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0.this.Q3();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class e implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ ylb0 b;

        public e(View view, ylb0 ylb0Var) {
            this.a = view;
            this.b = ylb0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ylb0 ylb0Var = this.b;
            ytw<Integer> ytwVar = ylb0Var.T2;
            ((x5a0) ytwVar).setValue(Integer.valueOf(this.a.getHeight()));
            Integer num = (Integer) ((x5a0) ytwVar).getValue();
            Float f = (Float) si8.a(num != null ? num.intValue() : 0, ylb0Var.getResources().getDisplayMetrics().widthPixels).get("sporty-cars");
            float fFloatValue = f != null ? f.floatValue() : 0.29375f;
            gvi gviVar = ylb0Var.z;
            ComposeView composeView = gviVar != null ? gviVar.i : null;
            ViewGroup.LayoutParams layoutParams = composeView != null ? composeView.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.S = fFloatValue;
                composeView.setLayoutParams(layoutParams2);
            }
            gvi gviVar2 = ylb0Var.z;
            ComposeView composeView2 = gviVar2 != null ? gviVar2.e : null;
            ViewGroup.LayoutParams layoutParams3 = composeView2 != null ? composeView2.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams4 = layoutParams3 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.S = fFloatValue;
                composeView2.setLayoutParams(layoutParams4);
            }
            gvi gviVar3 = ylb0Var.z;
            BlurView blurView = gviVar3 != null ? gviVar3.v : null;
            ViewGroup.LayoutParams layoutParams5 = blurView != null ? blurView.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams6 = layoutParams5 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams5 : null;
            if (layoutParams6 != null) {
                layoutParams6.S = fFloatValue;
                blurView.setLayoutParams(layoutParams6);
            }
            gvi gviVar4 = ylb0Var.z;
            BlurView blurView2 = gviVar4 != null ? gviVar4.w : null;
            ViewGroup.LayoutParams layoutParams7 = blurView2 != null ? blurView2.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams8 = layoutParams7 instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams7 : null;
            if (layoutParams8 != null) {
                layoutParams8.S = fFloatValue;
                blurView2.setLayoutParams(layoutParams8);
            }
            boolean z = ylb0Var.I2;
            if (z && z) {
                ylb0.W3(ylb0Var, null, null, 3);
            }
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$10$1$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ UserLevelProgressDto b;
        public final /* synthetic */ ytw<Boolean> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(UserLevelProgressDto userLevelProgressDto, ytw<Boolean> ytwVar, v1b<? super f> v1bVar) {
            super(2, v1bVar);
            this.b = userLevelProgressDto;
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new f(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SharedPreferences.Editor editorEdit;
            SharedPreferences.Editor editorRemove;
            SharedPreferences.Editor editorEdit2;
            SharedPreferences.Editor editorPutBoolean;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0 ylb0Var = ylb0.this;
            if (ylb0Var.y3() == 1) {
                UserLevelProgressDto userLevelProgressDto = this.b;
                Boolean boolValueOf = userLevelProgressDto != null ? Boolean.valueOf(userLevelProgressDto.getLastLevelReset()) : null;
                Boolean bool = Boolean.TRUE;
                if (Intrinsics.g(boolValueOf, bool)) {
                    SharedPreferences sharedPreferences = ylb0Var.H;
                    if (!(sharedPreferences != null ? sharedPreferences.getBoolean("sporty_cars_progress_reset_notification_shown", false) : false)) {
                        this.c.setValue(bool);
                        SharedPreferences sharedPreferences2 = ylb0Var.H;
                        if (sharedPreferences2 != null && (editorEdit2 = sharedPreferences2.edit()) != null && (editorPutBoolean = editorEdit2.putBoolean("sporty_cars_progress_reset_notification_shown", true)) != null) {
                            editorPutBoolean.apply();
                        }
                    }
                } else if (Intrinsics.g(boolValueOf, Boolean.FALSE)) {
                    SharedPreferences sharedPreferences3 = ylb0Var.H;
                    if (sharedPreferences3 != null && (editorEdit = sharedPreferences3.edit()) != null && (editorRemove = editorEdit.remove("sporty_cars_progress_reset_notification_shown")) != null) {
                        editorRemove.apply();
                    }
                } else if (boolValueOf != null) {
                    uhc.a();
                    return null;
                }
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$10$2$1", f = "SportyCarFragment.kt", l = {737}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw<Boolean> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ytw<Boolean> ytwVar, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            ytw<Boolean> ytwVar = this.b;
            if (i == 0) {
                uj50.b(obj);
                if (ytwVar.getValue().booleanValue()) {
                    this.a = 1;
                    if (hkd.b(8000L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            ytwVar.setValue(Boolean.FALSE);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$10$3$1", f = "SportyCarFragment.kt", l = {744}, m = "invokeSuspend", v = 1)
    public static final class h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ytw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new h(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                if (((Boolean) this.c.getValue()).booleanValue()) {
                    this.a = 1;
                    if (hkd.b(4000L, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            wwd0 wwd0Var = ylb0.this.f1().v;
            Boolean bool = Boolean.FALSE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$11$1$1$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class i extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public i(v1b<? super i> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new i(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((i) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0 ylb0Var = ylb0.this;
            ytw<Boolean> ytwVar = ylb0Var.i0;
            String messageType = ((MultiplierResponse) ((x5a0) ylb0Var.R0().b).getValue()).getMessageType();
            int iHashCode = messageType.hashCode();
            if (iHashCode != -1111393803) {
                if (iHashCode != 2896988) {
                    if (iHashCode == 1862985098 && messageType.equals("ROUND_ONGOING")) {
                        ylb0Var.N3();
                    } else {
                        ylb0Var.U3();
                        ylb0Var.b2();
                    }
                } else if (messageType.equals("ROUND_WAITING")) {
                    ylb0Var.U3();
                    if (((Boolean) ((x5a0) ylb0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() && !ylb0Var.l0) {
                        ypa0 ypa0VarL1 = ylb0Var.l1();
                        int iE = kotlin.ranges.f.e(ylb0Var.y3(), 1, 5);
                        int i = R.string.car1_rev;
                        if (iE != 1) {
                            if (iE == 2) {
                                i = R.string.car2_rev;
                            } else if (iE == 3) {
                                i = R.string.car3_rev;
                            } else if (iE == 4) {
                                i = R.string.car4_rev;
                            } else if (iE == 5) {
                                i = R.string.car5_rev;
                            }
                        }
                        String string = ylb0Var.getString(i);
                        string.getClass();
                        ypa0VarL1.A1(0L, string);
                    }
                } else {
                    ylb0Var.U3();
                    ylb0Var.b2();
                }
            } else if (messageType.equals("ROUND_PRE_START")) {
                ylb0Var.U3();
                if (((Boolean) ((x5a0) ylb0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() && !ylb0Var.l0) {
                    ypa0 ypa0VarL2 = ylb0Var.l1();
                    int iE2 = kotlin.ranges.f.e(ylb0Var.y3(), 1, 5);
                    int i2 = R.string.car1_takeoff;
                    if (iE2 != 1) {
                        if (iE2 == 2) {
                            i2 = R.string.car2_takeoff;
                        } else if (iE2 == 3) {
                            i2 = R.string.car3_takeoff;
                        } else if (iE2 == 4) {
                            i2 = R.string.car4_takeoff;
                        } else if (iE2 == 5) {
                            i2 = R.string.car5_takeoff;
                        }
                    }
                    String string2 = ylb0Var.getString(i2);
                    string2.getClass();
                    ypa0VarL2.A1(0L, string2);
                }
            } else {
                ylb0Var.U3();
                ylb0Var.b2();
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$11$1$2$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class j extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ jph0 b;
        public final /* synthetic */ x5a0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(jph0 jph0Var, x5a0 x5a0Var, v1b v1bVar) {
            super(2, v1bVar);
            this.b = jph0Var;
            this.c = x5a0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new j(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((j) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00ba, code lost:
        
            if (r0.equals("ROUND_ONGOING") == false) goto L53;
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00d5, code lost:
        
            if (r0.equals("ROUND_PRE_START") != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x00d7, code lost:
        
            if (r8 <= r15) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d9, code lost:
        
            r1.V3(r8);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00dc, code lost:
        
            r14.setValue(java.lang.Boolean.FALSE);
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ylb0.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$11$1$3$1", f = "SportyCarFragment.kt", l = {919}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ u5a0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(u5a0 u5a0Var, v1b v1bVar) {
            super(2, v1bVar);
            this.c = u5a0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new k(this.c, v1bVar);
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
                ylb0 ylb0Var = ylb0.this;
                int iD = ylb0Var.y1() ? this.c.D() : 1;
                if (iD < 1) {
                    return Unit.a;
                }
                Map<Integer, String> map = imb0.a;
                if (imb0.a(iD, (File) ((x5a0) ylb0Var.E3().V).getValue(), (File) ((x5a0) ylb0Var.E3().W).getValue(), (File) ((x5a0) ylb0Var.E3().Y).getValue(), (File) ((x5a0) ylb0Var.E3().Z).getValue(), (File) ((x5a0) ylb0Var.E3().h0).getValue(), (File) ((x5a0) ylb0Var.E3().i0).getValue())) {
                    return Unit.a;
                }
                b bVar = b.a;
                this.a = 1;
                if (ylb0Var.u3(iD, bVar, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$11$1$4$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ int b;
        public final /* synthetic */ osw c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(int i, osw oswVar, v1b<? super l> v1bVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = oswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new l(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            int i;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0 ylb0Var = ylb0.this;
            if (!ylb0Var.y1() || (i = this.b) < 1) {
                return Unit.a;
            }
            osw oswVar = this.c;
            if (oswVar.D() > 0 && i != oswVar.D() && ((Boolean) ((x5a0) ylb0Var.c1().t0).getValue()).booleanValue()) {
                try {
                    if (ylb0Var.l1().a != null) {
                        String string = ylb0Var.getString(ylb0.w3(kotlin.ranges.f.e(i, 1, 5)));
                        string.getClass();
                        ylb0Var.l1().I1();
                        ylb0Var.l1().A1(0L, string);
                    }
                } catch (Exception unused) {
                }
            }
            oswVar.k(i);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$11$1$5$1", f = "SportyCarFragment.kt", l = {947}, m = "invokeSuspend", v = 1)
    public static final class m extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ jph0 c;
        public final /* synthetic */ u5a0 d;
        public final /* synthetic */ osw e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(jph0 jph0Var, u5a0 u5a0Var, osw oswVar, v1b v1bVar) {
            super(2, v1bVar);
            this.c = jph0Var;
            this.d = u5a0Var;
            this.e = oswVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new m(this.c, this.d, this.e, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((m) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UserLevelProgressDto userLevelProgressDto;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ylb0 ylb0Var = ylb0.this;
                if (!ylb0Var.y1()) {
                    return Unit.a;
                }
                jph0 jph0Var = this.c;
                jph0.d dVar = jph0Var instanceof jph0.d ? (jph0.d) jph0Var : null;
                if (dVar == null || (userLevelProgressDto = dVar.a) == null) {
                    return Unit.a;
                }
                int iD = this.d.D();
                if (iD < 1) {
                    iD = 1;
                }
                int i2 = iD + 1;
                if (i2 > 5) {
                    return Unit.a;
                }
                if (userLevelProgressDto.getNormalRounds() <= 0) {
                    return Unit.a;
                }
                if (userLevelProgressDto.getCompletedNormalRounds() / userLevelProgressDto.getNormalRounds() < 0.7f) {
                    return Unit.a;
                }
                osw oswVar = this.e;
                if (oswVar.D() == i2) {
                    return Unit.a;
                }
                oswVar.k(i2);
                b bVar = b.c;
                this.a = 1;
                if (ylb0Var.u3(i2, bVar, this) == y5bVar) {
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

    /* JADX INFO: loaded from: classes7.dex */
    public static final class n implements Function2<String, j58, Unit> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public n(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            ylb0 ylb0Var = ylb0.this;
            boolean zBooleanValue = ((Boolean) ((x5a0) ylb0Var.d1).getValue()).booleanValue();
            String str3 = this.b;
            if (!zBooleanValue || str2.equals(str3)) {
                ((x5a0) ylb0Var.c1().H).setValue(str2);
                ((x5a0) ylb0Var.c1().K).setValue(j58Var2);
                ((x5a0) ylb0Var.c1().L).setValue(new j58(j58.f));
                String str4 = this.c;
                if (str2.equals(str4) || str2.equals(str3)) {
                    ((x5a0) ylb0Var.c1().M).setValue(2);
                } else {
                    ((x5a0) ylb0Var.c1().M).setValue(1);
                }
                ((x5a0) ylb0Var.c1().Q).setValue(Integer.valueOf((str2.equals(str4) || str2.equals(str3)) ? 3000 : 2000));
                ((x5a0) ylb0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(ylb0Var);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$14$1$1$17$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class o extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ vaw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(vaw vawVar, v1b<? super o> v1bVar) {
            super(2, v1bVar);
            this.b = vawVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new o(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((o) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0.W3(ylb0.this, Boolean.valueOf(this.b.a), null, 2);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$14$1$1$18$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class p extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public p(v1b<? super p> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new p(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((p) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0.this.L3();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class q implements Function2<String, j58, Unit> {
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public q(String str, String str2) {
            this.b = str;
            this.c = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            ylb0 ylb0Var = ylb0.this;
            boolean zBooleanValue = ((Boolean) ((x5a0) ylb0Var.d1).getValue()).booleanValue();
            String str3 = this.b;
            if (!zBooleanValue || str2.equals(str3)) {
                ((x5a0) ylb0Var.c1().H).setValue(str2);
                ((x5a0) ylb0Var.c1().K).setValue(j58Var2);
                ((x5a0) ylb0Var.c1().L).setValue(new j58(j58.f));
                String str4 = this.c;
                if (str2.equals(str4) || str2.equals(str3)) {
                    ((x5a0) ylb0Var.c1().M).setValue(2);
                } else {
                    ((x5a0) ylb0Var.c1().M).setValue(1);
                }
                ((x5a0) ylb0Var.c1().Q).setValue(Integer.valueOf((str2.equals(str4) || str2.equals(str3)) ? 3000 : 2000));
                ((x5a0) ylb0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(ylb0Var);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$15$1$1$17$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class r extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ vaw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(vaw vawVar, v1b<? super r> v1bVar) {
            super(2, v1bVar);
            this.b = vawVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new r(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((r) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0.W3(ylb0.this, null, Boolean.valueOf(this.b.a), 1);
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$15$1$1$18$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class s extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public s(v1b<? super s> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new s(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((s) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ylb0.this.L3();
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.multilevel.sportycar.views.SportyCarFragment$onViewCreated$9$1$1", f = "SportyCarFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class t extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(ytw ytwVar, v1b v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ylb0.this.new t(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((t) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (((List) this.b.getValue()).isEmpty()) {
                ((x5a0) ylb0.this.O2).setValue(Boolean.FALSE);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class u extends saj implements Function1<lk40, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk40 lk40Var) {
            vbw vbwVar = (vbw) this.receiver;
            ((x5a0) vbwVar.a).setValue(lk40Var);
            ytw ytwVar = vbwVar.c;
            ((x5a0) ytwVar).setValue(Integer.valueOf(((Number) ((x5a0) ytwVar).getValue()).intValue() + 1));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final /* synthetic */ class v extends saj implements Function1<lk40, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(lk40 lk40Var) {
            vbw vbwVar = (vbw) this.receiver;
            ((x5a0) vbwVar.b).setValue(lk40Var);
            ytw ytwVar = vbwVar.c;
            ((x5a0) ytwVar).setValue(Integer.valueOf(((Number) ((x5a0) ytwVar).getValue()).intValue() + 1));
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class w implements Function0<Fragment> {
        public w() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ylb0.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class x implements Function0<dnb0> {
        public final /* synthetic */ w b;

        public x(w wVar) {
            this.b = wVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [dnb0, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final dnb0 invoke() {
            v8i0 viewModelStore = ylb0.this.getViewModelStore();
            ylb0 ylb0Var = ylb0.this;
            cyb defaultViewModelCreationExtras = ylb0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(dnb0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(ylb0Var), null);
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class y implements Function0<Fragment> {
        public y() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ylb0.this;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static final class z implements Function0<hmb0> {
        public final /* synthetic */ y b;

        public z(y yVar) {
            this.b = yVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [hmb0, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final hmb0 invoke() {
            v8i0 viewModelStore = ylb0.this.getViewModelStore();
            ylb0 ylb0Var = ylb0.this;
            cyb defaultViewModelCreationExtras = ylb0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(hmb0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(ylb0Var), null);
        }
    }

    public ylb0() {
        Boolean bool = Boolean.FALSE;
        this.N2 = androidx.compose.runtime.m.b(bool);
        this.O2 = androidx.compose.runtime.m.b(bool);
        this.P2 = androidx.compose.runtime.m.b(bool);
        w wVar = new w();
        a1s a1sVar = a1s.c;
        this.Q2 = hwr.a(a1sVar, new x(wVar));
        this.R2 = hwr.a(a1sVar, new z(new y()));
        this.S2 = new a0();
        this.T2 = androidx.compose.runtime.m.b(null);
        this.U2 = new vbw();
    }

    public static void B3(ylb0 ylb0Var, String str, String str2, String str3, ytw ytwVar, ytw ytwVar2, ytw ytwVar3) {
        ytwVar.getClass();
        ytwVar2.getClass();
        ytwVar3.getClass();
        ibs viewLifecycleOwner = ylb0Var.getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new bmb0(ylb0Var, str, str2, str3, ytwVar, ytwVar2, ytwVar3, null), 3);
    }

    public static void W3(ylb0 ylb0Var, Boolean bool, Boolean bool2, int i2) {
        if ((i2 & 1) != 0) {
            bool = null;
        }
        if ((i2 & 2) != 0) {
            bool2 = null;
        }
        if (bool != null) {
            ylb0Var.G2 = bool.booleanValue();
        }
        if (bool2 != null) {
            ylb0Var.H2 = bool2.booleanValue();
        }
        if (ylb0Var.H3() || ((Boolean) ((x5a0) ylb0Var.c1().i0).getValue()).booleanValue()) {
            ylb0Var.I2 = false;
            return;
        }
        if (ylb0Var.F2) {
            return;
        }
        Object value = ((x5a0) ylb0Var.R0().T).getValue();
        z83 z83Var = z83.b;
        boolean z2 = value == z83Var && ylb0Var.G2;
        boolean z3 = ((x5a0) ylb0Var.S0().T).getValue() == z83Var && ylb0Var.H2;
        if (!z2 && !z3) {
            ylb0Var.I2 = false;
            return;
        }
        if (((x5a0) ylb0Var.T2).getValue() == null) {
            ylb0Var.I2 = true;
            return;
        }
        ylb0Var.I2 = false;
        gvi gviVar = ylb0Var.z;
        if (gviVar != null) {
            gviVar.V.setVisibility(0);
        }
        ylb0Var.R3(z2, z3);
    }

    public static int w3(int i2) {
        int iE = kotlin.ranges.f.e(i2, 1, 5);
        if (iE == 1) {
            return R.string.bg_music_car_1;
        }
        if (iE == 2) {
            return R.string.bg_music_car_2;
        }
        if (iE == 3) {
            return R.string.bg_music_car_3;
        }
        if (iE != 4) {
            return iE != 5 ? R.string.bg_music_car_1 : R.string.bg_music_car_5;
        }
        return R.string.bg_music_car_4;
    }

    public final void A3(int i2, boolean z2) {
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new c(i2, z2, null), 3);
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPORTY_CAR_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPORTY_CAR_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_sporty_cars);
            string.getClass();
            progressMeterComponent.setSoundManager("SPORTY_CARS/", string, boolValueOf, boolValueOf2, rk60.b.H, this.i, context);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.I(l1());
        }
    }

    public final void C3() {
        ((u5a0) E3().c).k(1);
        ((u5a0) E3().d).k(0);
        ((u5a0) E3().e).k(-1);
        A3(1, true);
    }

    @Override // defpackage.fgb
    public final void D2(Coefficients coefficients) {
        long j2;
        long j3;
        coefficients.getClass();
        if (((Boolean) ((x5a0) Y0().i).getValue()).booleanValue()) {
            coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
            double houseCoefficient = coefficients.getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j2 = new wg60().k1;
            } else if (houseCoefficient <= 4.9d) {
                j2 = new wg60().l1;
            } else if (houseCoefficient <= 9.9d) {
                j2 = new wg60().m1;
            } else {
                j2 = houseCoefficient <= 18.9d ? new wg60().n1 : new wg60().o1;
            }
            coefficients.m97setCoeffColor8_81llA(j2);
            Y0().x1(coefficients);
            return;
        }
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
        double houseCoefficient2 = coefficients.getHouseCoefficient();
        if (houseCoefficient2 <= 1.5d) {
            j3 = new wg60().k1;
        } else if (houseCoefficient2 <= 4.9d) {
            j3 = new wg60().l1;
        } else if (houseCoefficient2 <= 9.9d) {
            j3 = new wg60().m1;
        } else {
            j3 = houseCoefficient2 <= 18.9d ? new wg60().n1 : new wg60().o1;
        }
        coefficients.m97setCoeffColor8_81llA(j3);
        coefficients.setNew(true);
        Y0().y1(coefficients);
        Y0().x1(coefficients);
    }

    public final hmb0 D3() {
        return (hmb0) this.R2.getValue();
    }

    @Override // defpackage.fgb
    public final void E0() {
        ((x5a0) this.N2).setValue(Boolean.TRUE);
    }

    @Override // defpackage.fgb
    public final void E2(PreviousMultiplierResponse previousMultiplierResponse) {
        long j2;
        Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
        int size = previousMultiplierResponse.getCoefficients().size();
        for (int i2 = 0; i2 < size; i2++) {
            previousMultiplierResponse.getCoefficients().get(i2).m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            previousMultiplierResponse.getCoefficients().get(i2).m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
            Coefficients coefficients = previousMultiplierResponse.getCoefficients().get(i2);
            double houseCoefficient = previousMultiplierResponse.getCoefficients().get(i2).getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j2 = new wg60().k1;
            } else if (houseCoefficient <= 4.9d) {
                j2 = new wg60().l1;
            } else if (houseCoefficient > 9.9d && houseCoefficient > 18.9d) {
                j2 = new wg60().o1;
            } else {
                wg60 wg60Var = new wg60();
                j2 = wg60Var.m1;
            }
            coefficients.m97setCoeffColor8_81llA(j2);
        }
        Y0().B1(previousMultiplierResponse);
    }

    public final dnb0 E3() {
        return (dnb0) this.Q2.getValue();
    }

    @Override // defpackage.fgb
    public final void F2(boolean z2) {
        if (z2) {
            wwd0 wwd0Var = E3().A0;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return;
        }
        if (((Boolean) ((x5a0) E3().b).getValue()).booleanValue()) {
            return;
        }
        wwd0 wwd0Var2 = E3().A0;
        if (((Boolean) wwd0Var2.getValue()).booleanValue()) {
            wwd0Var2.k(null, Boolean.FALSE);
        }
    }

    public final boolean F3() {
        Context context = getContext();
        if (context == null) {
            return true;
        }
        ArrayList<OnboardingItem> arrayListA = sny.a(context, (String) ((x5a0) c1().z).getValue());
        return !arrayListA.isEmpty() && Intrinsics.g(arrayListA.get(0).getIsView(), Boolean.TRUE);
    }

    public final void G3(BlurView blurView, ConstraintLayout constraintLayout) {
        eg4 a850Var;
        Context context;
        if (Build.VERSION.SDK_INT >= 31) {
            a850Var = new o750();
        } else {
            a850Var = (constraintLayout == null || (context = constraintLayout.getContext()) == null) ? null : new a850(context);
        }
        if (constraintLayout != null) {
            ha20 ha20VarB = blurView.b(constraintLayout, a850Var);
            ha20VarB.a = 20.0f;
            ha20VarB.e(true);
            long j2 = j58.l;
            ha20VarB.b(r58.l(j2));
            ha20VarB.l = new ColorDrawable(r58.l(j2));
        }
    }

    public final boolean H3() {
        SharedPreferences sharedPreferences = this.H;
        return sharedPreferences != null && sharedPreferences.getBoolean("sporty_cars_bonus_cashout_onboarding_shown", false);
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
        gvi gviVar;
        O3();
        if (!this.F2 || (gviVar = this.z) == null) {
            return;
        }
        gviVar.V.setVisibility(0);
    }

    @Override // defpackage.fgb
    public final void I0() {
        if (!y1()) {
            C3();
        }
        B3(this, "cars_1_5_spine:sg_sporty_cars", "https://s.sporty.net/common/main/res/935871314106b8d65fa3b7100b64f5ad.zip", "cars_1_5_spine", E3().b0, E3().c0, E3().d0);
        B3(this, "speedometer_spine:sg_sporty_cars", "https://s.sporty.net/common/main/res/33c757debd13e4cc85840e6b777c4460.zip", "speedometer_spine", E3().e0, E3().f0, E3().g0);
    }

    public final boolean I3() {
        if (!y1() || ((Boolean) ((x5a0) c1().r0).getValue()).booleanValue()) {
            return false;
        }
        if (y3() == 1) {
            return !F3();
        }
        if (!F3()) {
            K3();
        }
        return false;
    }

    @Override // defpackage.fgb
    public final void J0() {
        ((x5a0) this.N2).setValue(Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007d A[PHI: r2 r4 r5 r6 r7 r8
      0x007d: PHI (r2v10 int) = (r2v2 int), (r2v12 int) binds: [B:23:0x007a, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r4v11 ??) = (r4v20 ??), (r4v21 ??) binds: [B:23:0x007a, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r5v9 android.content.Context) = (r5v1 android.content.Context), (r5v11 android.content.Context) binds: [B:23:0x007a, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r6v10 java.lang.String) = (r6v1 java.lang.String), (r6v12 java.lang.String) binds: [B:23:0x007a, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r7v10 java.lang.String) = (r7v1 java.lang.String), (r7v12 java.lang.String) binds: [B:23:0x007a, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r8v7 java.lang.String) = (r8v1 java.lang.String), (r8v8 java.lang.String) binds: [B:23:0x007a, B:45:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00da  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e7 A[Catch: Exception -> 0x014b, TryCatch #3 {Exception -> 0x014b, blocks: (B:42:0x00e3, B:44:0x00e7, B:48:0x0107, B:50:0x010d, B:54:0x0116, B:57:0x011d, B:59:0x012b, B:63:0x0139, B:65:0x013f, B:67:0x0145, B:70:0x014d), top: B:94:0x00e3 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12, types: [bq40] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [bq40] */
    /* JADX WARN: Type inference failed for: r2v19, types: [bq40] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r4v10, types: [bq40] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13, types: [bq40] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0102 -> B:32:0x00ae). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object J3(java.lang.String r21, java.lang.String r22, java.lang.String r23, defpackage.x1b r24) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ylb0.J3(java.lang.String, java.lang.String, java.lang.String, x1b):java.lang.Object");
    }

    @Override // defpackage.fgb
    public final boolean K2() {
        return I3();
    }

    public final void K3() {
        Context context = getContext();
        if (context == null) {
            return;
        }
        String str = (String) ((x5a0) c1().z).getValue();
        boolean zIsEmpty = sny.a(context, str).isEmpty();
        SharedPreferences.Editor editor = this.J;
        if (zIsEmpty) {
            sny.b(editor, kotlin.collections.b.f(new OnboardingItem(0, Boolean.TRUE)), str);
        } else {
            sny.c(context, editor, 0, str);
        }
    }

    @Override // defpackage.fgb
    public final void L1() {
        dnb0 dnb0VarE3 = E3();
        ytw<Boolean> ytwVar = dnb0VarE3.b;
        Boolean bool = Boolean.FALSE;
        ((x5a0) ytwVar).setValue(bool);
        ((x5a0) dnb0VarE3.a).setValue(bool);
        wwd0 wwd0Var = E3().A0;
        if (((Boolean) wwd0Var.getValue()).booleanValue()) {
            wwd0Var.k(null, bool);
        }
        O3();
    }

    public final void L3() {
        Long l2;
        if (this.F2) {
            MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) R0().b).getValue();
            long j2 = this.M2;
            boolean zG = Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT");
            boolean z2 = false;
            boolean z3 = j2 > 0 && multiplierResponse.getRoundId() != j2;
            if (!zG && !z3) {
                boolean z4 = this.K2 && Intrinsics.g(((HashMap) ((x5a0) R0().d).getValue()).get(Long.valueOf(j2)), Boolean.TRUE);
                if (this.L2 && Intrinsics.g(((HashMap) ((x5a0) S0().d).getValue()).get(Long.valueOf(j2)), Boolean.TRUE)) {
                    z2 = true;
                }
                if (z4 || z2) {
                    z3(true);
                    return;
                }
                return;
            }
            if (!H3() && (l2 = this.J2) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - l2.longValue();
                if ((this.K2 && this.e) || ((this.L2 && this.f) || jCurrentTimeMillis >= 3000)) {
                    z2 = true;
                }
            }
            z3(z2);
        }
    }

    public final void M3(int i2) {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutInt;
        SharedPreferences sharedPreferences = this.H;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorPutInt = editorEdit.putInt("sporty_cars_multiplier_spine_display_level", i2)) == null) {
            return;
        }
        editorPutInt.apply();
    }

    public final void N3() {
        if (!((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() || !((Boolean) ((x5a0) this.i0).getValue()).booleanValue() || this.l0) {
            U3();
            return;
        }
        int iE = kotlin.ranges.f.e(y3(), 1, 5);
        int i2 = R.string.car1_ongoing;
        if (iE != 1) {
            if (iE == 2) {
                i2 = R.string.car2_ongoing;
            } else if (iE == 3) {
                i2 = R.string.car3_ongoing;
            } else if (iE == 4) {
                i2 = R.string.car4_ongoing;
            } else if (iE == 5) {
                i2 = R.string.car5_ongoing;
            }
        }
        String string = getString(i2);
        string.getClass();
        if (this.V2 != 0) {
            l1().H1(this.V2);
            this.V2 = 0;
        }
        this.V2 = l1().C1(string);
    }

    public final void O3() {
        if (I3()) {
            gvi gviVar = this.z;
            if (gviVar != null) {
                gviVar.V.setVisibility(0);
            }
            S3(0);
        }
    }

    public final void P3() {
        int iD;
        if (y1()) {
            dnb0 dnb0VarE3 = E3();
            osw oswVar = dnb0VarE3.k0;
            osw oswVar2 = dnb0VarE3.c;
            int iD2 = ((u5a0) oswVar).D();
            u5a0 u5a0Var = (u5a0) oswVar2;
            int iD3 = u5a0Var.D();
            if (1 <= iD2 && iD2 < 6 && iD2 > iD3) {
                Map<Integer, String> map = imb0.a;
                if (imb0.a(iD2, (File) ((x5a0) dnb0VarE3.l0).getValue(), (File) ((x5a0) dnb0VarE3.m0).getValue(), (File) ((x5a0) dnb0VarE3.o0).getValue(), (File) ((x5a0) dnb0VarE3.p0).getValue(), (File) ((x5a0) dnb0VarE3.r0).getValue(), (File) ((x5a0) dnb0VarE3.s0).getValue())) {
                    u5a0Var.k(iD2);
                    ((u5a0) dnb0VarE3.d).k(0);
                    ((u5a0) dnb0VarE3.e).k(-1);
                    M3(iD2);
                    return;
                }
            }
            if (y1() && 1 <= (iD = ((u5a0) E3().v).D()) && iD < 6 && iD > ((u5a0) E3().c).D()) {
                V3(iD);
            }
        }
    }

    public final void R3(final boolean z2, final boolean z3) {
        if (this.F2) {
            return;
        }
        if (z2 || z3) {
            this.F2 = true;
            this.l0 = true;
            ((x5a0) this.P2).setValue(Boolean.TRUE);
            this.K2 = z2;
            this.L2 = z3;
            this.M2 = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getRoundId();
            if (this.J2 == null) {
                this.J2 = Long.valueOf(System.currentTimeMillis());
            }
            if (this.d == null) {
                this.d = Long.valueOf(System.currentTimeMillis());
            }
            op5 op5Var = op5.a;
            String string = getString(R.string.sporty_cars_extra_cashout_onboarding_text);
            string.getClass();
            final String strC = op5.c(op5Var, "extra_cashout_onboarding:sg_crash_games", string);
            Integer num = (Integer) ((x5a0) this.T2).getValue();
            if (num != null) {
                final int iIntValue = num.intValue();
                gvi gviVar = this.z;
                if (gviVar != null) {
                    ComposeView composeView = gviVar.V;
                    composeView.setViewCompositionStrategy(u6i0.c.a);
                    composeView.setContent(new op8(643220756, new Function2() { // from class: elb0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            a aVar = (a) obj;
                            int iIntValue2 = ((Integer) obj2).intValue();
                            if (aVar.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                ylb0 ylb0Var = this.a;
                                x6a.b((String) ((x5a0) ylb0Var.c1().z).getValue(), (String) ((x5a0) ylb0Var.c1().v).getValue(), ylb0Var.b1(), z2, z3, ((Boolean) ((x5a0) ylb0Var.c1().i0).getValue()).booleanValue(), iIntValue, ylb0Var.R0().b, strC, true, aVar, 805306368, 0);
                            } else {
                                aVar.G();
                            }
                            return Unit.a;
                        }
                    }, true));
                }
            }
        }
    }

    @Override // defpackage.obw, defpackage.fgb
    public final void S1(MultiplierResponse multiplierResponse) {
        q3(multiplierResponse.getMessageType());
        String messageType = multiplierResponse.getMessageType();
        int iHashCode = messageType.hashCode();
        if (iHashCode != -1111393803) {
            if (iHashCode == 2896988) {
                if (messageType.equals("ROUND_WAITING")) {
                    P3();
                    return;
                }
                return;
            } else {
                if (iHashCode == 1599022634 && messageType.equals("ROUND_END_WAIT")) {
                    int iD = ((u5a0) E3().v).D();
                    int iD2 = ((u5a0) E3().c).D();
                    if (1 > iD || iD >= 6 || iD <= iD2) {
                        return;
                    }
                    T3(iD);
                    return;
                }
                return;
            }
        }
        if (messageType.equals("ROUND_PRE_START")) {
            dnb0 dnb0VarE3 = E3();
            int iD3 = ((u5a0) dnb0VarE3.k0).D();
            if (1 > iD3 || iD3 >= 6) {
                return;
            }
            File file = (File) ((x5a0) dnb0VarE3.l0).getValue();
            if (file != null) {
                ((x5a0) dnb0VarE3.V).setValue(file);
            }
            File file2 = (File) ((x5a0) dnb0VarE3.m0).getValue();
            if (file2 != null) {
                ((x5a0) dnb0VarE3.W).setValue(file2);
            }
            File file3 = (File) ((x5a0) dnb0VarE3.n0).getValue();
            if (file3 != null) {
                ((x5a0) dnb0VarE3.X).setValue(file3);
            }
            File file4 = (File) ((x5a0) dnb0VarE3.o0).getValue();
            if (file4 != null) {
                ((x5a0) dnb0VarE3.Y).setValue(file4);
            }
            File file5 = (File) ((x5a0) dnb0VarE3.p0).getValue();
            if (file5 != null) {
                ((x5a0) dnb0VarE3.Z).setValue(file5);
            }
            File file6 = (File) ((x5a0) dnb0VarE3.q0).getValue();
            if (file6 != null) {
                ((x5a0) dnb0VarE3.a0).setValue(file6);
            }
            File file7 = (File) ((x5a0) dnb0VarE3.r0).getValue();
            if (file7 != null) {
                ((x5a0) dnb0VarE3.h0).setValue(file7);
            }
            File file8 = (File) ((x5a0) dnb0VarE3.s0).getValue();
            if (file8 != null) {
                ((x5a0) dnb0VarE3.i0).setValue(file8);
            }
            File file9 = (File) ((x5a0) dnb0VarE3.t0).getValue();
            if (file9 != null) {
                ((x5a0) dnb0VarE3.j0).setValue(file9);
            }
            x3();
        }
    }

    public final void S3(final int i2) {
        gvi gviVar = this.z;
        if (gviVar != null) {
            ComposeView composeView = gviVar.V;
            composeView.setViewCompositionStrategy(u6i0.c.a);
            composeView.setContent(new op8(-1997008765, new Function2() { // from class: clb0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    FragmentManager supportFragmentManager;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ylb0 ylb0Var = this.a;
                        ytw<Integer> ytwVar = ylb0Var.T2;
                        vbw vbwVar = ylb0Var.U2;
                        Integer num = (Integer) ((x5a0) ytwVar).getValue();
                        d dVarE = j.e(d.a.b, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarE);
                        yka.k.getClass();
                        tsr.a aVar2 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar2);
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
                        int i3 = i2;
                        if (i3 == 0 && num != null && ylb0Var.I3()) {
                            aVar.N(-166585872);
                            ytw ytwVarC = wyh.c(ylb0Var.D3().v, aVar, 0, 7);
                            Integer numValueOf = Integer.valueOf(((Number) ((x5a0) vbwVar.c).getValue()).intValue());
                            Object objY = aVar.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (objY == c0042a) {
                                objY = new fmb0(2, null);
                                aVar.r(objY);
                            }
                            xvf.e(aVar, numValueOf, (Function2) objY);
                            String str = (String) ((x5a0) ylb0Var.c1().v).getValue();
                            mz1 mz1VarB1 = ylb0Var.b1();
                            int iIntValue2 = num.intValue();
                            boolean zBooleanValue = ((Boolean) ytwVarC.getValue()).booleanValue();
                            lk40 lk40Var = (lk40) ((x5a0) vbwVar.a).getValue();
                            lk40 lk40Var2 = (lk40) ((x5a0) vbwVar.b).getValue();
                            boolean zA = aVar.A(ylb0Var);
                            Object objY2 = aVar.y();
                            if (zA || objY2 == c0042a) {
                                objY2 = new ne2(ylb0Var, 3);
                                aVar.r(objY2);
                            }
                            qga.b(str, mz1VarB1, iIntValue2, zBooleanValue, lk40Var, lk40Var2, (Function0) objY2, aVar, 0);
                            aVar.H();
                        } else {
                            if (i3 != 1 || num == null) {
                                aVar.N(-284143111);
                            } else {
                                aVar.N(-165110241);
                                Object value = ((x5a0) ylb0Var.R0().T).getValue();
                                z83 z83Var = z83.b;
                                if (value == z83Var || ((x5a0) ylb0Var.S0().T).getValue() == z83Var) {
                                    aVar.N(-164899534);
                                    e activity = ylb0Var.getActivity();
                                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                                        supportFragmentManager.G(R.id.flContent);
                                    }
                                    x6a.b((String) ((x5a0) ylb0Var.c1().z).getValue(), (String) ((x5a0) ylb0Var.c1().v).getValue(), ylb0Var.b1(), ylb0Var.B1, ylb0Var.C1, ((Boolean) ((x5a0) ylb0Var.c1().i0).getValue()).booleanValue(), num.intValue(), ylb0Var.R0().b, null, false, aVar, 0, 768);
                                    aVar = aVar;
                                } else {
                                    aVar.N(-284143111);
                                }
                                aVar.H();
                            }
                            aVar.H();
                        }
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    public final void T3(int i2) {
        if (!y1() || 1 > i2 || i2 >= 6) {
            return;
        }
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new b0(i2, null), 3);
    }

    public final void U3() {
        if (this.V2 != 0) {
            l1().H1(this.V2);
            this.V2 = 0;
        }
    }

    public final boolean V3(int i2) {
        if (y1() && 1 <= i2 && i2 < 6) {
            dnb0 dnb0VarE3 = E3();
            if (i2 <= ((u5a0) dnb0VarE3.c).D()) {
                return true;
            }
            x3();
            if (((Boolean) dj5.a(kotlin.coroutines.e.a, new c0(i2, null))).booleanValue()) {
                ((u5a0) dnb0VarE3.c).k(i2);
                ((u5a0) dnb0VarE3.d).k(0);
                ((u5a0) dnb0VarE3.e).k(-1);
                M3(i2);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fgb
    public final void Z1() {
        N3();
    }

    @Override // defpackage.fgb
    public final void a2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            if (((Boolean) ((x5a0) E3().y0).getValue()).booleanValue() || ((Boolean) ((x5a0) E3().z0).getValue()).booleanValue()) {
                ypa0 ypa0VarL1 = l1();
                String string = getString(R.string.bonus_cashout);
                string.getClass();
                ypa0VarL1.A1(0L, string);
                return;
            }
            ypa0 ypa0VarL2 = l1();
            String string2 = getString(R.string.car_cashout_sound);
            string2.getClass();
            ypa0VarL2.A1(0L, string2);
        }
    }

    @Override // defpackage.fgb
    public final void b2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.crashed_sound);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void c2() {
        gvi gviVar;
        Boolean bool = (Boolean) ((x5a0) c1().t0).getValue();
        bool.getClass();
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_car_id);
        string.getClass();
        rk60.b bVar = rk60.b.H;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        String string2 = getString(w3(y3()));
        string2.getClass();
        progressMeterComponent.J("sporty-cars", string, bool, bVar, gameDetails, context, ypa0VarL1, bool, string2);
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
        U3();
    }

    @Override // defpackage.fgb
    public final void d2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            if (((Boolean) ((x5a0) E3().y0).getValue()).booleanValue() || ((Boolean) ((x5a0) E3().z0).getValue()).booleanValue()) {
                ypa0 ypa0VarL1 = l1();
                String string = getString(R.string.bonus_place_bet);
                string.getClass();
                ypa0VarL1.A1(0L, string);
                return;
            }
            ypa0 ypa0VarL2 = l1();
            String string2 = getString(R.string.car_place_bet);
            string2.getClass();
            ypa0VarL2.A1(0L, string2);
        }
    }

    @Override // defpackage.fgb
    public final void e2() {
    }

    @Override // defpackage.fgb
    public final void f2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_car_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.H;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_valentine);
        string2.getClass();
        progressMeterComponent.J("sporty-cars", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void g2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_car_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.H;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_christmas);
        string2.getClass();
        progressMeterComponent.J("sporty-cars", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void h2() {
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
    }

    @Override // defpackage.obw, defpackage.fgb, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((x5a0) c1().i0).setValue(Boolean.FALSE);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (((Boolean) ((x5a0) E3().a).getValue()).booleanValue()) {
            dnb0 dnb0VarE3 = E3();
            ytw<Boolean> ytwVar = dnb0VarE3.b;
            Boolean bool = Boolean.TRUE;
            ((x5a0) ytwVar).setValue(bool);
            ((x5a0) dnb0VarE3.a).setValue(bool);
        }
    }

    @Override // defpackage.obw, defpackage.fgb, androidx.fragment.app.Fragment
    public final void onStop() {
        U3();
        if (!this.t0) {
            ytw<Boolean> ytwVar = E3().a;
            Boolean bool = Boolean.TRUE;
            ((x5a0) ytwVar).setValue(bool);
            ((x5a0) E3().u0).setValue(bool);
        }
        super.onStop();
        if (this.t0) {
            return;
        }
        ((x5a0) c1().a0).setValue(Boolean.FALSE);
        ytw<Boolean> ytwVar2 = c1().Y;
        Boolean bool2 = Boolean.TRUE;
        ((x5a0) ytwVar2).setValue(bool2);
        wwd0 wwd0Var = E3().A0;
        wwd0Var.getClass();
        wwd0Var.k(null, bool2);
    }

    @Override // defpackage.fgb
    public final void r2(z83 z83Var, ul2 ul2Var) {
        ul2Var.getClass();
        super.r2(z83Var, ul2Var);
    }

    @Override // defpackage.obw
    public final hmb0 r3() {
        return D3();
    }

    @Override // defpackage.obw
    public final dnb0 s3() {
        return E3();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0109  */
    /* JADX WARN: Code duplicated, block: B:38:0x010c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0114  */
    /* JADX WARN: Code duplicated, block: B:43:0x012c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0133  */
    /* JADX WARN: Code duplicated, block: B:48:0x013d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:57:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0155 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0159  */
    /* JADX WARN: Code duplicated, block: B:62:0x015d  */
    /* JADX WARN: Code duplicated, block: B:64:0x019c  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    public final Object u3(int i2, b bVar, x1b x1bVar) {
        zlb0 zlb0Var;
        int iE;
        b bVar2;
        Object objJ3;
        a aVar;
        Object objJ4;
        a aVar2;
        a aVar3;
        a aVar4;
        b bVar3;
        dnb0 dnb0VarE3;
        int iOrdinal;
        int i3 = i2;
        if (x1bVar instanceof zlb0) {
            zlb0Var = (zlb0) x1bVar;
            int i4 = zlb0Var.v;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                zlb0Var.v = i4 - Integer.MIN_VALUE;
            } else {
                zlb0Var = new zlb0(this, x1bVar);
            }
        } else {
            zlb0Var = new zlb0(this, x1bVar);
        }
        Object objJ5 = zlb0Var.f;
        Object obj = y5b.a;
        int i5 = zlb0Var.v;
        a aVar5 = null;
        if (i5 == 0) {
            uj50.b(objJ5);
            Map<Integer, String> map = imb0.a;
            iE = kotlin.ranges.f.e(i3, 1, 5);
            String strB = pe4.b(kotlin.ranges.f.e(iE, 1, 5), "car", "_powering_spine:sg_sporty_cars");
            Map<Integer, String> map2 = imb0.a;
            String str = map2.get(Integer.valueOf(kotlin.ranges.f.e(iE, 1, 5)));
            if (str == null) {
                str = (String) kpu.c(1, map2);
            }
            String strB2 = pe4.b(kotlin.ranges.f.e(iE, 1, 5), "car", "_powering_spine");
            bVar2 = bVar;
            zlb0Var.c = bVar2;
            zlb0Var.a = i3;
            zlb0Var.b = iE;
            zlb0Var.v = 1;
            objJ3 = J3(strB, str, strB2, zlb0Var);
            if (objJ3 != obj) {
            }
            return obj;
        }
        if (i5 == 1) {
            int i6 = zlb0Var.b;
            int i7 = zlb0Var.a;
            bVar2 = zlb0Var.c;
            uj50.b(objJ5);
            iE = i6;
            i3 = i7;
            objJ3 = objJ5;
        } else {
            if (i5 == 2) {
                int i8 = zlb0Var.b;
                int i9 = zlb0Var.a;
                aVar = zlb0Var.d;
                b bVar4 = zlb0Var.c;
                uj50.b(objJ5);
                iE = i8;
                i3 = i9;
                objJ4 = objJ5;
                aVar5 = null;
                bVar2 = bVar4;
                aVar2 = (a) objJ4;
                if (aVar2 == null) {
                    return Boolean.FALSE;
                }
                Map<Integer, String> map3 = imb0.a;
                if (kotlin.ranges.f.e(i3, 1, 5) == 4) {
                    zlb0Var.c = bVar2;
                    zlb0Var.d = aVar;
                    zlb0Var.e = aVar2;
                    zlb0Var.a = i3;
                    zlb0Var.b = iE;
                    zlb0Var.v = 3;
                    objJ5 = J3("car4_building_spine", "https://s.sporty.net/common/main/res/5b7d0ed9c3b66f5b01c245e1b6ba2aa0.zip", "car4_building_spine", zlb0Var);
                    if (objJ5 != obj) {
                        aVar4 = aVar;
                        bVar3 = bVar2;
                    }
                    return obj;
                }
                aVar3 = aVar5;
                Map<Integer, String> map4 = imb0.a;
                if (kotlin.ranges.f.e(i3, 1, 5) != 4 && aVar3 == null) {
                    return Boolean.FALSE;
                }
                if (bVar2 == b.c) {
                    return Boolean.TRUE;
                }
                dnb0VarE3 = E3();
                iOrdinal = bVar2.ordinal();
                if (iOrdinal == 0) {
                    ((x5a0) dnb0VarE3.V).setValue(aVar.a);
                    ((x5a0) dnb0VarE3.W).setValue(aVar.b);
                    ((x5a0) dnb0VarE3.X).setValue(aVar.c);
                    ((x5a0) dnb0VarE3.Y).setValue(aVar2.a);
                    ((x5a0) dnb0VarE3.Z).setValue(aVar2.b);
                    ((x5a0) dnb0VarE3.a0).setValue(aVar2.c);
                    if (aVar3 != null) {
                        ((x5a0) dnb0VarE3.h0).setValue(aVar3.a);
                        ((x5a0) dnb0VarE3.i0).setValue(aVar3.b);
                        ((x5a0) dnb0VarE3.j0).setValue(aVar3.c);
                    }
                } else if (iOrdinal == 1) {
                    ((u5a0) dnb0VarE3.k0).k(i3);
                    ((x5a0) dnb0VarE3.l0).setValue(aVar.a);
                    ((x5a0) dnb0VarE3.m0).setValue(aVar.b);
                    ((x5a0) dnb0VarE3.n0).setValue(aVar.c);
                    ((x5a0) dnb0VarE3.o0).setValue(aVar2.a);
                    ((x5a0) dnb0VarE3.p0).setValue(aVar2.b);
                    ((x5a0) dnb0VarE3.q0).setValue(aVar2.c);
                    if (aVar3 != null) {
                        ((x5a0) dnb0VarE3.r0).setValue(aVar3.a);
                        ((x5a0) dnb0VarE3.s0).setValue(aVar3.b);
                        ((x5a0) dnb0VarE3.t0).setValue(aVar3.c);
                    }
                } else if (iOrdinal != 2) {
                    uhc.a();
                    return aVar5;
                }
                return Boolean.TRUE;
            }
            if (i5 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = zlb0Var.a;
            aVar2 = zlb0Var.e;
            aVar4 = zlb0Var.d;
            bVar3 = zlb0Var.c;
            uj50.b(objJ5);
            aVar5 = null;
        }
        aVar3 = (a) objJ5;
        bVar2 = bVar3;
        aVar = aVar4;
        Map<Integer, String> map5 = imb0.a;
        if (kotlin.ranges.f.e(i3, 1, 5) != 4) {
        }
        if (bVar2 == b.c) {
            return Boolean.TRUE;
        }
        dnb0VarE3 = E3();
        iOrdinal = bVar2.ordinal();
        if (iOrdinal == 0) {
            ((x5a0) dnb0VarE3.V).setValue(aVar.a);
            ((x5a0) dnb0VarE3.W).setValue(aVar.b);
            ((x5a0) dnb0VarE3.X).setValue(aVar.c);
            ((x5a0) dnb0VarE3.Y).setValue(aVar2.a);
            ((x5a0) dnb0VarE3.Z).setValue(aVar2.b);
            ((x5a0) dnb0VarE3.a0).setValue(aVar2.c);
            if (aVar3 != null) {
                ((x5a0) dnb0VarE3.h0).setValue(aVar3.a);
                ((x5a0) dnb0VarE3.i0).setValue(aVar3.b);
                ((x5a0) dnb0VarE3.j0).setValue(aVar3.c);
            }
        } else if (iOrdinal == 1) {
            ((u5a0) dnb0VarE3.k0).k(i3);
            ((x5a0) dnb0VarE3.l0).setValue(aVar.a);
            ((x5a0) dnb0VarE3.m0).setValue(aVar.b);
            ((x5a0) dnb0VarE3.n0).setValue(aVar.c);
            ((x5a0) dnb0VarE3.o0).setValue(aVar2.a);
            ((x5a0) dnb0VarE3.p0).setValue(aVar2.b);
            ((x5a0) dnb0VarE3.q0).setValue(aVar2.c);
            if (aVar3 != null) {
                ((x5a0) dnb0VarE3.r0).setValue(aVar3.a);
                ((x5a0) dnb0VarE3.s0).setValue(aVar3.b);
                ((x5a0) dnb0VarE3.t0).setValue(aVar3.c);
            }
        } else if (iOrdinal != 2) {
            uhc.a();
            return aVar5;
        }
        return Boolean.TRUE;
        aVar = (a) objJ3;
        if (aVar == null) {
            return Boolean.FALSE;
        }
        Map<Integer, String> map6 = imb0.a;
        String strB3 = pe4.b(kotlin.ranges.f.e(iE, 1, 5), "car", "_ongoing_spine:sg_sporty_cars");
        Map<Integer, String> map7 = imb0.b;
        String str2 = map7.get(Integer.valueOf(kotlin.ranges.f.e(iE, 1, 5)));
        if (str2 == null) {
            str2 = (String) kpu.c(1, map7);
        }
        String strB4 = pe4.b(kotlin.ranges.f.e(iE, 1, 5), "car", "_ongoing_spine");
        zlb0Var.c = bVar2;
        zlb0Var.d = aVar;
        zlb0Var.a = i3;
        zlb0Var.b = iE;
        zlb0Var.v = 2;
        objJ4 = J3(strB3, str2, strB4, zlb0Var);
        if (objJ4 != obj) {
            aVar2 = (a) objJ4;
            if (aVar2 == null) {
                return Boolean.FALSE;
            }
            Map<Integer, String> map8 = imb0.a;
            if (kotlin.ranges.f.e(i3, 1, 5) == 4) {
                zlb0Var.c = bVar2;
                zlb0Var.d = aVar;
                zlb0Var.e = aVar2;
                zlb0Var.a = i3;
                zlb0Var.b = iE;
                zlb0Var.v = 3;
                objJ5 = J3("car4_building_spine", "https://s.sporty.net/common/main/res/5b7d0ed9c3b66f5b01c245e1b6ba2aa0.zip", "car4_building_spine", zlb0Var);
                if (objJ5 != obj) {
                    aVar4 = aVar;
                    bVar3 = bVar2;
                    aVar3 = (a) objJ5;
                    bVar2 = bVar3;
                    aVar = aVar4;
                }
            } else {
                aVar3 = aVar5;
            }
            Map<Integer, String> map9 = imb0.a;
            if (kotlin.ranges.f.e(i3, 1, 5) != 4) {
            }
            if (bVar2 == b.c) {
                return Boolean.TRUE;
            }
            dnb0VarE3 = E3();
            iOrdinal = bVar2.ordinal();
            if (iOrdinal == 0) {
                ((x5a0) dnb0VarE3.V).setValue(aVar.a);
                ((x5a0) dnb0VarE3.W).setValue(aVar.b);
                ((x5a0) dnb0VarE3.X).setValue(aVar.c);
                ((x5a0) dnb0VarE3.Y).setValue(aVar2.a);
                ((x5a0) dnb0VarE3.Z).setValue(aVar2.b);
                ((x5a0) dnb0VarE3.a0).setValue(aVar2.c);
                if (aVar3 != null) {
                    ((x5a0) dnb0VarE3.h0).setValue(aVar3.a);
                    ((x5a0) dnb0VarE3.i0).setValue(aVar3.b);
                    ((x5a0) dnb0VarE3.j0).setValue(aVar3.c);
                }
            } else if (iOrdinal == 1) {
                ((u5a0) dnb0VarE3.k0).k(i3);
                ((x5a0) dnb0VarE3.l0).setValue(aVar.a);
                ((x5a0) dnb0VarE3.m0).setValue(aVar.b);
                ((x5a0) dnb0VarE3.n0).setValue(aVar.c);
                ((x5a0) dnb0VarE3.o0).setValue(aVar2.a);
                ((x5a0) dnb0VarE3.p0).setValue(aVar2.b);
                ((x5a0) dnb0VarE3.q0).setValue(aVar2.c);
                if (aVar3 != null) {
                    ((x5a0) dnb0VarE3.r0).setValue(aVar3.a);
                    ((x5a0) dnb0VarE3.s0).setValue(aVar3.b);
                    ((x5a0) dnb0VarE3.t0).setValue(aVar3.c);
                }
            } else if (iOrdinal != 2) {
                uhc.a();
                return aVar5;
            }
            return Boolean.TRUE;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object v3(String str, String str2, String str3, ytw ytwVar, ytw ytwVar2, ytw ytwVar3, boolean z2, x1b x1bVar) {
        amb0 amb0Var;
        if (x1bVar instanceof amb0) {
            amb0Var = (amb0) x1bVar;
            int i2 = amb0Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                amb0Var.i = i2 - Integer.MIN_VALUE;
            } else {
                amb0Var = new amb0(this, x1bVar);
            }
        } else {
            amb0Var = new amb0(this, x1bVar);
        }
        Object objJ3 = amb0Var.e;
        Object obj = y5b.a;
        int i3 = amb0Var.i;
        if (i3 == 0) {
            uj50.b(objJ3);
            amb0Var.a = ytwVar;
            amb0Var.b = ytwVar2;
            amb0Var.c = ytwVar3;
            amb0Var.d = z2;
            amb0Var.i = 1;
            objJ3 = J3(str, str2, str3, amb0Var);
            if (objJ3 == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = amb0Var.d;
            ytwVar3 = amb0Var.c;
            ytwVar2 = amb0Var.b;
            ytwVar = amb0Var.a;
            uj50.b(objJ3);
        }
        a aVar = (a) objJ3;
        if (aVar == null) {
            return Unit.a;
        }
        if (z2) {
            ytwVar.setValue(aVar.a);
            ytwVar2.setValue(aVar.b);
            File file = aVar.c;
            if (file != null) {
                ytwVar3.setValue(file);
            }
        }
        return Unit.a;
    }

    public final void x3() {
        dnb0 dnb0VarE3 = E3();
        ((u5a0) dnb0VarE3.k0).k(-1);
        ((x5a0) dnb0VarE3.l0).setValue(null);
        ((x5a0) dnb0VarE3.m0).setValue(null);
        ((x5a0) dnb0VarE3.n0).setValue(null);
        ((x5a0) dnb0VarE3.o0).setValue(null);
        ((x5a0) dnb0VarE3.p0).setValue(null);
        ((x5a0) dnb0VarE3.q0).setValue(null);
        ((x5a0) dnb0VarE3.r0).setValue(null);
        ((x5a0) dnb0VarE3.s0).setValue(null);
        ((x5a0) dnb0VarE3.t0).setValue(null);
    }

    public final int y3() {
        int iD = ((u5a0) E3().c).D();
        if (iD >= 1) {
            return kotlin.ranges.f.e(iD, 1, 5);
        }
        int iD2 = ((u5a0) E3().v).D();
        if (iD2 >= 1) {
            return kotlin.ranges.f.e(iD2, 1, 5);
        }
        return 1;
    }

    public final void z3(boolean z2) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorPutBoolean;
        if (this.F2) {
            if (z2 && !H3() && (sharedPreferences = this.H) != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutBoolean = editorEdit.putBoolean("sporty_cars_bonus_cashout_onboarding_shown", true)) != null) {
                editorPutBoolean.apply();
            }
            this.F2 = false;
            this.I2 = false;
            this.J2 = null;
            this.K2 = false;
            this.L2 = false;
            this.M2 = 0L;
            this.l0 = false;
            ((x5a0) this.P2).setValue(Boolean.FALSE);
            gvi gviVar = this.z;
            if (gviVar != null) {
                gviVar.V.setVisibility(8);
            }
        }
    }

    @Override // defpackage.fgb, defpackage.bb
    public final void Q(xnh0 xnh0Var) {
        int i2;
        int i3;
        int i4;
        int i5;
        super.Q(xnh0Var);
        if (!y1()) {
            C3();
            gvi gviVar = this.z;
            if (gviVar != null) {
                gviVar.T.setVisibility(8);
                return;
            }
            return;
        }
        dnb0 dnb0VarE3 = E3();
        SharedPreferences sharedPreferences = this.H;
        udw udwVar = this.S2.a;
        dnb0VarE3.getClass();
        if (sharedPreferences != null) {
            i2 = sharedPreferences.getInt("sporty_cars_round_bar_level", -1);
        } else {
            i2 = -1;
        }
        if (sharedPreferences != null) {
            i3 = sharedPreferences.getInt(vZBMKENANSz.kPS, -1);
        } else {
            i3 = -1;
        }
        if (sharedPreferences != null) {
            i4 = sharedPreferences.getInt("sporty_cars_round_bar_completed_normal_rounds", -1);
        } else {
            i4 = -1;
        }
        if (i2 >= 1 && i3 >= 0) {
            if (i4 < 0) {
                i4 = 0;
            }
            if (i4 > i3) {
                i4 = i3;
            }
            ((u5a0) dnb0VarE3.v).k(i2);
            ((u5a0) dnb0VarE3.i).k(i3);
            ((u5a0) dnb0VarE3.f).k(i4);
            ((v5a0) dnb0VarE3.z).K(-1L);
        }
        SharedPreferences sharedPreferences2 = this.H;
        if (sharedPreferences2 != null) {
            i5 = sharedPreferences2.getInt("sporty_cars_multiplier_spine_display_level", 0);
        } else {
            i5 = 0;
        }
        if (1 <= i5 && i5 < 6) {
            ((u5a0) E3().c).k(i5);
            ((u5a0) E3().d).k(0);
            ((u5a0) E3().e).k(-1);
            A3(i5, true);
        }
        if (((u5a0) E3().c).D() < 1) {
            A3(1, true);
        }
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new d(null), 3);
    }

    public final void Q3() {
        if (!y1()) {
            gvi gviVar = this.z;
            if (gviVar != null) {
                gviVar.T.setVisibility(8);
                return;
            }
            return;
        }
        vbw vbwVar = this.U2;
        final u uVar = new u(1, vbwVar, vbw.class, oAudzpbdOhCI.IuMQAJliUpX, "updateRoundBarBounds(Landroidx/compose/ui/geometry/Rect;)V", 0);
        final v vVar = new v(1, vbwVar, vbw.class, "updateBonusButtonBounds", "updateBonusButtonBounds(Landroidx/compose/ui/geometry/Rect;)V", 0);
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.T.setVisibility(0);
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.T.setViewCompositionStrategy(u6i0.c.a);
        }
        op5 op5Var = op5.a;
        String string = getString(R.string.bet_cancel_cms);
        string.getClass();
        String string2 = getString(R.string.cancel);
        string2.getClass();
        String strC = op5.c(op5Var, string, string2);
        Locale locale = Locale.getDefault();
        locale.getClass();
        final String upperCase = strC.toUpperCase(locale);
        upperCase.getClass();
        String string3 = getString(R.string.waiting_next_round_cms);
        string3.getClass();
        String string4 = getString(R.string.waiting_for_next_round);
        string4.getClass();
        final String strC2 = op5.c(op5Var, string3, string4);
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.T.setContent(new op8(1442635823, new Function2() { // from class: jbw
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final ylb0 ylb0Var = this.a;
                        hmb0 hmb0VarD3 = ylb0Var.D3();
                        dnb0 dnb0VarE3 = ylb0Var.E3();
                        dnb0 dnb0VarE4 = ylb0Var.E3();
                        dnb0 dnb0VarE5 = ylb0Var.E3();
                        ylb0.a0 a0Var = ylb0Var.S2;
                        ul2 ul2VarR0 = ylb0Var.R0();
                        ul2 ul2VarS0 = ylb0Var.S0();
                        goj gojVarC1 = ylb0Var.c1();
                        SnapshotStateList<ps6> snapshotStateList = ylb0Var.g0;
                        boolean zA = aVar.A(ylb0Var);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new y2n(ylb0Var, i2);
                            aVar.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar.A(ylb0Var);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new kbw(ylb0Var, 0);
                            aVar.r(objY2);
                        }
                        Function0 function1 = (Function0) objY2;
                        boolean zA3 = aVar.A(ylb0Var);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new Function2() { // from class: lbw
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    boolean zBooleanValue = ((Boolean) obj4).booleanValue();
                                    if (iIntValue2 > 0) {
                                        ylb0 ylb0Var2 = ylb0Var;
                                        if (zBooleanValue || ylb0Var2.z2 != iIntValue2) {
                                            ylb0Var2.z2 = iIntValue2;
                                            ylb0Var2.n1().x1();
                                        }
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        }
                        Function2 function2 = (Function2) objY3;
                        boolean zA4 = aVar.A(ylb0Var);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new mbw(ylb0Var, 0);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        GameDetails gameDetails = ylb0Var.i;
                        String name = gameDetails != null ? gameDetails.getName() : null;
                        boolean zA5 = aVar.A(ylb0Var);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new p3n(ylb0Var, 2);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(ylb0Var);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new nbw(ylb0Var, 0);
                            aVar.r(objY6);
                        }
                        Function0 function5 = (Function0) objY6;
                        boolean zA7 = aVar.A(ylb0Var);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function0() { // from class: gbw
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ylb0 ylb0Var2 = ylb0Var;
                                    if (!ylb0Var2.isRemoving()) {
                                        ylb0Var2.y2((z83) ((x5a0) ylb0Var2.R0().T).getValue(), ylb0Var2.R0());
                                        ylb0Var2.y2((z83) ((x5a0) ylb0Var2.S0().T).getValue(), ylb0Var2.S0());
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function0 function6 = (Function0) objY7;
                        boolean zA8 = aVar.A(ylb0Var);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new gaj() { // from class: hbw
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    SharedPreferences.Editor editorEdit;
                                    SharedPreferences.Editor editorPutInt;
                                    SharedPreferences.Editor editorPutInt2;
                                    SharedPreferences.Editor editorPutInt3;
                                    int iIntValue2 = ((Integer) obj3).intValue();
                                    int iIntValue3 = ((Integer) obj4).intValue();
                                    int iIntValue4 = ((Integer) obj5).intValue();
                                    ylb0 ylb0Var2 = ylb0Var;
                                    SharedPreferences sharedPreferences = ylb0Var2.H;
                                    udw udwVar = ylb0Var2.S2.a;
                                    if (sharedPreferences != null && (editorEdit = sharedPreferences.edit()) != null && (editorPutInt = editorEdit.putInt("sporty_cars_round_bar_level", iIntValue2)) != null && (editorPutInt2 = editorPutInt.putInt("sporty_cars_round_bar_normal_rounds", iIntValue3)) != null && (editorPutInt3 = editorPutInt2.putInt("sporty_cars_round_bar_completed_normal_rounds", iIntValue4)) != null) {
                                        editorPutInt3.apply();
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY8);
                        }
                        scw.a(hmb0VarD3, dnb0VarE3, dnb0VarE4, dnb0VarE5, a0Var, ul2VarR0, ul2VarS0, gojVarC1, snapshotStateList, function0, function1, function2, function3, name, upperCase, strC2, function4, function5, function6, (gaj) objY8, uVar, vVar, aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        gvi gviVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setGameName("sporty_cars");
        op5.a.getClass();
        String str = dLRYz.rOFwKjG;
        op5.c = str;
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = androidx.compose.runtime.m.b("sporty-cars");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2(str, "games/sporty-cars/v1/game");
        int i2 = 1;
        ConstraintLayout constraintLayout = null;
        if (Build.VERSION.SDK_INT <= 24 && (gviVar = this.z) != null) {
            gviVar.F.setLayerType(1, null);
        }
        goj gojVarC2 = c1();
        osw oswVarA = androidx.compose.runtime.k.a(R.string.sporty_car_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = androidx.compose.runtime.m.b("SPORTY CARS");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = androidx.compose.runtime.m.b("sporty-cars");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = androidx.compose.runtime.m.b("Sporty Cars");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.sc_toggle_on_color;
        c1().G = R.color.sc_toggle_off_color;
        qry.a(view, new e(view, this));
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"SPORTY_CAR_MUSIC", "SPORTY_CAR_SOUND", "SPORTY_CAR_ONE_TAP", "SPORTY_CAR_THEME"});
        }
        SharedPreferences sharedPreferences = this.H;
        int i3 = 0;
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
        D3().x1();
        if (y1()) {
            D3().y1();
        } else {
            C3();
        }
        loa0 loa0VarK1 = k1();
        ibs viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        fbw fbwVar = new fbw(this);
        ibw ibwVar = new ibw(this);
        final lzc lzcVar = new lzc(this, 1);
        loa0VarK1.getClass();
        loa0VarK1.E.f(viewLifecycleOwner, new zdw(new t1i(fbwVar, 1)));
        loa0VarK1.F.f(viewLifecycleOwner, new zdw(new xdw(0, ibwVar)));
        loa0VarK1.G.f(viewLifecycleOwner, new zdw(new Function1() { // from class: ydw
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                String str2 = (String) obj;
                if (str2 == null) {
                    str2 = "";
                }
                lzcVar.invoke(str2);
                return Unit.a;
            }
        }));
        if (y1() && ((u5a0) E3().c).D() < 1) {
            A3(1, true);
        }
        k1().i.f(getViewLifecycleOwner(), new gmb0(new pd7(this, 2)));
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.A.setVisibility(0);
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.m0.setVisibility(0);
        }
        Q3();
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.C.post(new Runnable() { // from class: glb0
                @Override // java.lang.Runnable
                public final void run() {
                    ylb0 ylb0Var = this.a;
                    float f2 = ylb0Var.getResources().getConfiguration().screenWidthDp * ylb0Var.getResources().getDisplayMetrics().density;
                    Integer num = (Integer) ((x5a0) ylb0Var.T2).getValue();
                    fnb0 fnb0VarA = vi8.a(num != null ? num.intValue() : 0, f2);
                    gvi gviVar5 = ylb0Var.z;
                    if (gviVar5 != null) {
                        ComposeView composeView = gviVar5.C;
                        ViewGroup.LayoutParams layoutParams3 = composeView.getLayoutParams();
                        if (layoutParams3 == null) {
                            bmy.a("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                            return;
                        }
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
                        int i5 = fnb0VarA.d;
                        Context contextRequireContext = ylb0Var.requireContext();
                        contextRequireContext.getClass();
                        ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = (int) (i5 * contextRequireContext.getResources().getDisplayMetrics().density);
                        composeView.setLayoutParams(layoutParams4);
                    }
                }
            });
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            gviVar5.C.setVisibility(0);
        }
        gvi gviVar6 = this.z;
        u6i0.c cVar = u6i0.c.a;
        if (gviVar6 != null) {
            gviVar6.C.setViewCompositionStrategy(cVar);
        }
        gvi gviVar7 = this.z;
        if (gviVar7 != null) {
            gviVar7.C.setContent(new op8(-1589947448, new h0g(this, i2), true));
        }
        gvi gviVar8 = this.z;
        if (gviVar8 != null) {
            gviVar8.z.setContent(new op8(-600906502, new plb0(this, i3), true));
        }
        gvi gviVar9 = this.z;
        if (gviVar9 != null) {
            gviVar9.S.setContent(new op8(-419173253, new yeb(this, i2), true));
        }
        gvi gviVar10 = this.z;
        if (gviVar10 != null) {
            layoutParams = gviVar10.W.getLayoutParams();
        } else {
            layoutParams = null;
        }
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams3.S = 1.0f;
        layoutParams3.i = 0;
        layoutParams3.j = -1;
        gvi gviVar11 = this.z;
        if (gviVar11 != null) {
            gviVar11.W.setLayoutParams(layoutParams3);
        }
        gvi gviVar12 = this.z;
        if (gviVar12 != null) {
            ComposeView composeView = gviVar12.W;
            composeView.setViewCompositionStrategy(cVar);
            composeView.setContent(new op8(308901387, new efb(this, composeView, i2), true));
        }
        gvi gviVar13 = this.z;
        if (gviVar13 != null) {
            layoutParams2 = gviVar13.V.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        layoutParams2.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams2;
        layoutParams4.S = 1.0f;
        gvi gviVar14 = this.z;
        if (gviVar14 != null) {
            gviVar14.V.setLayoutParams(layoutParams4);
        }
        wf7 wf7Var = new wf7(this, i4);
        gfb gfbVar = new gfb(this, i2);
        this.J1 = wf7Var;
        this.K1 = gfbVar;
        ibs viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        int i5 = 3;
        ej5.c(ebs.a(viewLifecycleOwner2.getLifecycle()), null, null, new emb0(this, null), 3);
        gvi gviVar15 = this.z;
        if (gviVar15 != null) {
            constraintLayout = gviVar15.y;
        }
        if (gviVar15 != null) {
            G3(gviVar15.v, constraintLayout);
        }
        gvi gviVar16 = this.z;
        if (gviVar16 != null) {
            G3(gviVar16.w, constraintLayout);
        }
        gvi gviVar17 = this.z;
        if (gviVar17 != null) {
            gviVar17.v.setVisibility(0);
        }
        gvi gviVar18 = this.z;
        if (gviVar18 != null) {
            gviVar18.w.setVisibility(0);
        }
        gvi gviVar19 = this.z;
        if (gviVar19 != null) {
            ComposeView composeView2 = gviVar19.i;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(672367885, new yf2(i5, this, composeView2), true));
        }
        gvi gviVar20 = this.z;
        if (gviVar20 != null) {
            ComposeView composeView3 = gviVar20.e;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(854101134, new y2g(i2, this, composeView3), true));
        }
    }
}
