package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sportybet.android.gp.tz.R;
import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import m9c0.c;
import m9c0.e;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000e\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lm9c0;", "Lfgb;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "Lgly;", "ballPosition", "", "showDropAnim", "forceReplay", "giftResponseReceived", "", "animatedScaleY", "animatedOriginX", "animatedOriginY", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m9c0 extends fgb {
    public CampaignParticipateV2 B2;
    public String C2;
    public Long D2;
    public final ytw<Boolean> y2 = m.b(Boolean.FALSE);
    public final ttr z2 = hwr.a(a1s.c, new g(new f()));
    public final ytw<Integer> A2 = m.b(null);

    @c0d(c = "com.sportygames.sportykick.views.SportyKickFragment$downloadSpineData$1$1", f = "SportyKickFragment.kt", l = {1046, 1075, 1079, 1083, 1088}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public int c;
        public int d;
        public final /* synthetic */ Context f;

        /* JADX INFO: renamed from: m9c0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.sportykick.views.SportyKickFragment$downloadSpineData$1$1$spineData$1", f = "SportyKickFragment.kt", l = {1047}, m = "invokeSuspend", v = 1)
        public static final class C0863a extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
            public int a;
            public final /* synthetic */ m9c0 b;
            public final /* synthetic */ Context c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0863a(m9c0 m9c0Var, Context context, v1b<? super C0863a> v1bVar) {
                super(2, v1bVar);
                this.b = m9c0Var;
                this.c = context;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0863a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
                return ((C0863a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                fq5 fq5VarV0 = this.b.V0();
                String strC = op5.c(op5.a, "militao_sporty_kick_v1:sg_sporty_kick", "https://s.sporty.net/common/main/res/45d6148d5ec06babed25fbf0b2198465.zip");
                this.a = 1;
                Object objY1 = fq5VarV0.y1(this.c, strC, "militao_sporty_kick_v1", this);
                return objY1 == y5bVar ? y5bVar : objY1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.f = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m9c0.this.new a(this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:42|83|43|(1:45)(1:46)|47|(3:65|66|(1:68)(2:69|63))(7:51|(3:53|(1:55)(1:56)|(1:58))|87|59|(1:61)|62|89)) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:51|(3:53|(1:55)(1:56)|(1:58))|87|59|(1:61)|62|89) */
        /* JADX WARN: Code duplicated, block: B:27:0x0068 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:28:0x006a, B:31:0x0085, B:33:0x0089, B:35:0x008f, B:39:0x0098, B:13:0x0035, B:17:0x0043, B:20:0x004d, B:23:0x005a), top: B:85:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x009e  */
        /* JADX WARN: Code duplicated, block: B:69:0x0129 A[PHI: r2 r12 r13 r16
          0x0129: PHI (r2v2 int) = (r2v4 int), (r2v4 int), (r2v4 int), (r2v13 int) binds: [B:74:0x014d, B:71:0x013a, B:67:0x0126, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0129: PHI (r12v1 int) = (r12v5 int), (r12v6 int), (r12v7 int), (r12v13 int) binds: [B:74:0x014d, B:71:0x013a, B:67:0x0126, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0129: PHI (r13v1 int) = (r13v3 int), (r13v3 int), (r13v3 int), (r13v9 int) binds: [B:74:0x014d, B:71:0x013a, B:67:0x0126, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0129: PHI (r16v1 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v9 int) binds: [B:74:0x014d, B:71:0x013a, B:67:0x0126, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:72:0x013c  */
        /* JADX WARN: Code duplicated, block: B:73:0x013d A[Catch: Exception -> 0x0150, TRY_LEAVE, TryCatch #0 {Exception -> 0x0150, blocks: (B:43:0x00a4, B:45:0x00b2, B:47:0x00b9, B:49:0x00bf, B:51:0x00c5, B:53:0x00dd, B:58:0x00e7, B:66:0x011a, B:70:0x012c, B:73:0x013d), top: B:83:0x00a4 }] */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0115, code lost:
        
            r2 = r16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x014d, code lost:
        
            if (defpackage.hkd.b(500, r17) == r1) goto L78;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x015f, code lost:
        
            if (defpackage.hkd.b(500, r17) == r1) goto L78;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x015f -> B:79:0x0162). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 361
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m9c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ m9c0 b;

        public b(View view, m9c0 m9c0Var) {
            this.a = view;
            this.b = m9c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((x5a0) this.b.A2).setValue(Integer.valueOf(this.a.getHeight()));
        }
    }

    public static final class c implements Function2<String, j58, Unit> {
        public c() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            m9c0 m9c0Var = m9c0.this;
            if (!((Boolean) ((x5a0) m9c0Var.d1).getValue()).booleanValue()) {
                ((x5a0) m9c0Var.c1().H).setValue(str2);
                ((x5a0) m9c0Var.c1().K).setValue(j58Var2);
                ((x5a0) m9c0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) m9c0Var.c1().Q).setValue(2000);
                ((x5a0) m9c0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(m9c0Var);
            }
            return Unit.a;
        }
    }

    public static final class d implements Function2<String, j58, Unit> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            m9c0 m9c0Var = m9c0.this;
            if (!((Boolean) ((x5a0) m9c0Var.d1).getValue()).booleanValue()) {
                ((x5a0) m9c0Var.c1().H).setValue(str2);
                ((x5a0) m9c0Var.c1().K).setValue(j58Var2);
                ((x5a0) m9c0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) m9c0Var.c1().Q).setValue(2000);
                ((x5a0) m9c0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(m9c0Var);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportykick.views.SportyKickFragment$onViewCreated$6$1$1$1", f = "SportyKickFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return m9c0.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            m9c0 m9c0Var = m9c0.this;
            osa0.a(Intrinsics.g(((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType(), "ROUND_END_WAIT"), m9c0Var.q3().F, null);
            return Unit.a;
        }
    }

    public static final class f implements Function0<Fragment> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return m9c0.this;
        }
    }

    public static final class g implements Function0<q9c0> {
        public final /* synthetic */ f b;

        public g(f fVar) {
            this.b = fVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, q9c0] */
        @Override // kotlin.jvm.functions.Function0
        public final q9c0 invoke() {
            v8i0 viewModelStore = m9c0.this.getViewModelStore();
            m9c0 m9c0Var = m9c0.this;
            cyb defaultViewModelCreationExtras = m9c0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(q9c0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(m9c0Var), null);
        }
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPORTY_KICK_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPORTY_KICK_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_sporty_kick);
            string.getClass();
            progressMeterComponent.setSoundManager("SPORTY_KICK/", string, boolValueOf, boolValueOf2, rk60.b.D, this.i, context);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.I(l1());
        }
    }

    @Override // defpackage.fgb
    public final void D2(Coefficients coefficients) {
        long j;
        long j2;
        coefficients.getClass();
        if (((Boolean) ((x5a0) Y0().i).getValue()).booleanValue()) {
            coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
            double houseCoefficient = coefficients.getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j = new co60().l1;
            } else if (houseCoefficient <= 4.9d) {
                j = new co60().m1;
            } else if (houseCoefficient <= 9.9d) {
                j = new co60().n1;
            } else {
                j = houseCoefficient <= 18.9d ? new co60().o1 : new co60().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j);
            Y0().x1(coefficients);
            return;
        }
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
        double houseCoefficient2 = coefficients.getHouseCoefficient();
        if (houseCoefficient2 <= 1.5d) {
            j2 = new co60().l1;
        } else if (houseCoefficient2 <= 4.9d) {
            j2 = new co60().m1;
        } else if (houseCoefficient2 <= 9.9d) {
            j2 = new co60().n1;
        } else {
            j2 = houseCoefficient2 <= 18.9d ? new co60().o1 : new co60().p1;
        }
        coefficients.m97setCoeffColor8_81llA(j2);
        coefficients.setNew(true);
        Y0().y1(coefficients);
        Y0().x1(coefficients);
    }

    @Override // defpackage.fgb
    public final void E0() {
        ((x5a0) this.y2).setValue(Boolean.TRUE);
    }

    @Override // defpackage.fgb
    public final void E2(PreviousMultiplierResponse previousMultiplierResponse) {
        long j;
        Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
        int size = previousMultiplierResponse.getCoefficients().size();
        for (int i = 0; i < size; i++) {
            previousMultiplierResponse.getCoefficients().get(i).m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            previousMultiplierResponse.getCoefficients().get(i).m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
            Coefficients coefficients = previousMultiplierResponse.getCoefficients().get(i);
            double houseCoefficient = previousMultiplierResponse.getCoefficients().get(i).getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j = new co60().l1;
            } else if (houseCoefficient <= 4.9d) {
                j = new co60().m1;
            } else if (houseCoefficient <= 9.9d) {
                j = new co60().n1;
            } else {
                j = houseCoefficient <= 18.9d ? new co60().o1 : new co60().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j);
        }
        Y0().B1(previousMultiplierResponse);
    }

    @Override // defpackage.fgb
    public final void F2(boolean z) {
        if (z) {
            wwd0 wwd0Var = q3().H;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return;
        }
        wwd0 wwd0Var2 = q3().H;
        if (((Boolean) wwd0Var2.getValue()).booleanValue()) {
            wwd0Var2.k(null, Boolean.FALSE);
        }
    }

    @Override // defpackage.fgb
    public final void I0() {
        Context context = getContext();
        if (context != null) {
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new a(context, null), 3);
        }
    }

    @Override // defpackage.fgb
    public final void J0() {
        ((x5a0) this.y2).setValue(Boolean.FALSE);
    }

    @Override // defpackage.fgb
    public final boolean Q0() {
        return true;
    }

    @Override // defpackage.fgb
    public final boolean Q2() {
        return s3();
    }

    @Override // defpackage.fgb
    public final boolean R2() {
        return s3();
    }

    @Override // defpackage.fgb
    public final boolean S2() {
        return s3();
    }

    @Override // defpackage.fgb
    public final void a2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.cashout_sound);
            string.getClass();
            ypa0VarL1.A1(0L, string);
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
        String string = getString(R.string.sporty_kick_id);
        string.getClass();
        rk60.b bVar = rk60.b.D;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        String string2 = getString(R.string.bg_music);
        string2.getClass();
        progressMeterComponent.J("sporty-kick", string, bool, bVar, gameDetails, context, ypa0VarL1, bool, string2);
    }

    @Override // defpackage.fgb
    public final void d2() {
        if (((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) this.i0).getValue()).booleanValue() && !this.l0) {
            ypa0 ypa0VarL1 = l1();
            String string = getString(R.string.place_bet);
            string.getClass();
            ypa0VarL1.A1(0L, string);
        }
    }

    @Override // defpackage.fgb
    public final void f2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_kick_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.D;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_valentine);
        string2.getClass();
        progressMeterComponent.J("sporty-kick", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void g2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_kick_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.D;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_christmas);
        string2.getClass();
        progressMeterComponent.J("sporty-kick", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void h2() {
        q9c0 q9c0VarQ3 = q3();
        if (((Boolean) q9c0VarQ3.C.getValue()).booleanValue()) {
            return;
        }
        et7 et7VarD = o8i0.d(q9c0VarQ3);
        pfd pfdVar = fse.a;
        ej5.c(et7VarD, odd.b, null, new o9c0(q9c0VarQ3, null), 2);
    }

    @Override // defpackage.fgb
    /* JADX INFO: renamed from: i2, reason: from getter */
    public final String getA2() {
        return this.C2;
    }

    @Override // defpackage.fgb
    /* JADX INFO: renamed from: j2, reason: from getter */
    public final CampaignParticipateV2 getZ2() {
        return this.B2;
    }

    public final void n3(final androidx.compose.ui.d dVar, final Object obj, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2;
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1813477623);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.b(z2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(this) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599043 & i2) != 599042)) {
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || StringsKt.U(str)) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: e9c0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            this.a.n3(dVar, obj, z, z2, (a) obj2, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                }
            } else {
                String messageType = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getMessageType();
                boolean z3 = Intrinsics.g(messageType, "ROUND_PRE_START") || Intrinsics.g(messageType, "ROUND_ONGOING") || Intrinsics.g(messageType, "ROUND_END_WAIT");
                float f2 = 1.8f;
                if (!z2) {
                    if (Intrinsics.g(messageType, "ROUND_PRE_START") || Intrinsics.g(messageType, "ROUND_ONGOING") || Intrinsics.g(messageType, "ROUND_END_WAIT")) {
                        f2 = 3.0f;
                    } else if (Intrinsics.g(messageType, "ROUND_WAITING")) {
                        f2 = 2.0f;
                    }
                }
                float f3 = (!z2 && z3) ? 1.0f : 0.0f;
                float f4 = (!z2 && z3) ? 0.28f : 1.0f;
                gzg0 gzg0VarE = yi0.e((!Intrinsics.g(messageType, "ROUND_PRE_START") || z2) ? 0 : 800, (!Intrinsics.g(messageType, "ROUND_PRE_START") || z2) ? 0 : 550, null, 4);
                final twd0 twd0VarB = xe0.b(f2, gzg0VarE, null, null, bVarI, 0, 28);
                final twd0 twd0VarB2 = xe0.b(f3, gzg0VarE, null, null, bVarI, 0, 28);
                final twd0 twd0VarB3 = xe0.b(f4, gzg0VarE, null, null, bVarI, 0, 28);
                aiv aivVarC = g75.c(ht.a.a, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVar);
                yka.k.getClass();
                tsr.a aVar2 = yka.a.b;
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, yka.a.f);
                hlh0.a(bVarI, ne00VarS, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                    n30.a(iHashCode, bVarI, iHashCode, c1350a);
                }
                hlh0.a(bVarI, dVarC, yka.a.d);
                nan.a aVar3 = new nan.a((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                aVar3.c = z ? (String) obj : null;
                abn.a(aVar3, false);
                nan nanVarA = aVar3.a();
                androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
                boolean zM = bVarI.M(twd0VarB) | bVarI.M(twd0VarB2) | bVarI.M(twd0VarB3);
                Object objY = bVarI.y();
                if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new Function1() { // from class: f9c0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            a7l a7lVar = (a7l) obj2;
                            a7lVar.getClass();
                            a7lVar.k(3.2f);
                            a7lVar.v(((Number) twd0VarB.getValue()).floatValue());
                            a7lVar.z0(n09.a(((Number) twd0VarB2.getValue()).floatValue(), ((Number) twd0VarB3.getValue()).floatValue()));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                fn80.a(nanVarA, "BG1", androidx.compose.ui.graphics.a.a(dVarE, (Function1) objY), d0b.a.g, ht.a.h, 0.0f, null, null, null, bVarI, 199728, 2000);
                bVarI = bVarI;
                bVarI.X(true);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: g9c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.a.n3(dVar, obj, z, z2, (a) obj2, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    public final void o3(boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final m9c0 m9c0Var;
        final boolean z2;
        androidx.compose.runtime.b bVarI = aVar.i(-16609223);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(this) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.d.a aVar2 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarE = j.e(aVar2, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            int i3 = i2 << 15;
            m9c0Var = this;
            z2 = z;
            m9c0Var.n3(j.g(j.c(aVar2, 1.0f), 1.0f), op5.c(op5.a, "main_bg_png:sg_game_name", pwo.e(R.string.main_bg_url, bVarI)), ((Boolean) ((x5a0) c1().g0).getValue()).booleanValue(), z2, bVarI, (458752 & i3) | 438 | (i3 & 3670016));
            if ((Intrinsics.g(((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType(), "ROUND_END_WAIT")) && !z2) {
                bVarI.N(1512432012);
                uie.a(0, 0, bVarI);
            } else {
                bVarI.N(1463772707);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            m9c0Var = this;
            z2 = z;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: w8c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.o3(z2, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.D2 = Long.valueOf(SystemClock.elapsedRealtime());
        ((x5a0) c1().i0).setValue(Boolean.FALSE);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onStop() {
        Double dValueOf;
        double dRint;
        xnh0 user;
        Long l = this.D2;
        if (l != null) {
            if (!s3()) {
                l = null;
            }
            if (l != null) {
                long jLongValue = l.longValue();
                l1z l1zVarE1 = e1();
                long jElapsedRealtime = SystemClock.elapsedRealtime() - jLongValue;
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
        this.D2 = null;
        super.onStop();
        if (this.t0) {
            return;
        }
        ((x5a0) c1().a0).setValue(Boolean.FALSE);
        ytw<Boolean> ytwVar = c1().Y;
        Boolean bool = Boolean.TRUE;
        ((x5a0) ytwVar).setValue(bool);
        wwd0 wwd0Var = q3().H;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        gvi gviVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setGameName("sporty_kick");
        op5.a.getClass();
        op5.c = "sg_sporty_kick";
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = m.b("sporty-kick");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2("sg_sporty_kick", "games/sporty-kick/v1/game");
        int i = 1;
        if (Build.VERSION.SDK_INT <= 24 && (gviVar = this.z) != null) {
            gviVar.F.setLayerType(1, null);
        }
        goj gojVarC2 = c1();
        osw oswVarA = k.a(R.string.galaxy_go_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = m.b("SPORTY KICK");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = m.b("sporty-kick");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = m.b("Sporty Kick");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.sk_toggle_on_color;
        c1().G = R.color.sk_toggle_off_color;
        qry.a(view, new b(view, this));
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"SPORTY_KICK_MUSIC", "SPORTY_KICK_SOUND", "SPORTY_KICK_ONE_TAP", "SPORTY_KICK_THEME"});
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
        if (sharedPreferences3 != null) {
            c1().G1(sharedPreferences3.getBoolean(((String[]) ((x5a0) c1().B).getValue())[2], false));
        }
        gvi gviVar2 = this.z;
        u6i0.c cVar = u6i0.c.a;
        if (gviVar2 != null) {
            ComposeView composeView = gviVar2.v0;
            composeView.setViewCompositionStrategy(cVar);
            composeView.setContent(new op8(1908617402, new Function2() { // from class: z7c0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        m9c0 m9c0Var = this.a;
                        gvi gviVar3 = m9c0Var.z;
                        if (gviVar3 != null) {
                            gviVar3.v0.setVisibility(0);
                        }
                        ytw ytwVarC = wyh.c(m9c0Var.q3().E, aVar, 0, 7);
                        ytw ytwVarC2 = wyh.c(m9c0Var.q3().G, aVar, 0, 7);
                        ytw ytwVarC3 = wyh.c(m9c0Var.q3().I, aVar, 0, 7);
                        String messageType = ((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType();
                        boolean zA = aVar.A(m9c0Var);
                        Object objY = aVar.y();
                        if (zA || objY == a.C0041a.a) {
                            objY = m9c0Var.new e(null);
                            aVar.r(objY);
                        }
                        xvf.e(aVar, messageType, (Function2) objY);
                        m9c0Var.p3(((gly) ytwVarC.getValue()).a, ((Boolean) ytwVarC2.getValue()).booleanValue(), ((Boolean) ytwVarC3.getValue()).booleanValue(), aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar3 = this.z;
        ViewGroup.LayoutParams layoutParams = gviVar3 != null ? gviVar3.U.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 1.0f;
        layoutParams2.i = 0;
        layoutParams2.j = -1;
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.U.setLayoutParams(layoutParams2);
        }
        gvi gviVar5 = this.z;
        ViewGroup.LayoutParams layoutParams3 = gviVar5 != null ? gviVar5.W.getLayoutParams() : null;
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.S = 0.8f;
        layoutParams4.i = 0;
        layoutParams4.j = -1;
        gvi gviVar6 = this.z;
        if (gviVar6 != null) {
            gviVar6.W.setLayoutParams(layoutParams4);
        }
        gvi gviVar7 = this.z;
        if (gviVar7 != null) {
            ComposeView composeView2 = gviVar7.W;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(-1298761155, new Function2() { // from class: g8c0
                /* JADX WARN: Code duplicated, block: B:90:0x02cf  */
                /* JADX WARN: Code duplicated, block: B:95:0x02de  */
                /* JADX WARN: Code duplicated, block: B:98:0x02e6  */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    MultiplierResponse multiplierResponse;
                    double d2;
                    String currentMultiplier;
                    File file;
                    File file2;
                    File file3;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    boolean z = false;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final m9c0 m9c0Var = this.a;
                        ytw<Integer> ytwVar = m9c0Var.A2;
                        ytw<Boolean> ytwVar2 = m9c0Var.l1;
                        ytw<Boolean> ytwVar3 = m9c0Var.i0;
                        Integer num = (Integer) ((x5a0) ytwVar).getValue();
                        ytw ytwVarC = wyh.c(m9c0Var.q3().I, aVar, 0, 7);
                        d dVarG = j.g(d.a.b, 1.0f);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarG);
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
                        if (((x5a0) m9c0Var.R0().e).getValue() == null || ((x5a0) m9c0Var.R0().f).getValue() == null || ((x5a0) m9c0Var.R0().i).getValue() == null) {
                            aVar.N(181558027);
                        } else {
                            aVar.N(191322717);
                            if (Intrinsics.g(((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType(), "ROUND_WAITING") && ((Boolean) ((x5a0) m9c0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue() && !m9c0Var.l0) {
                                ypa0 ypa0VarL1 = m9c0Var.l1();
                                String string = m9c0Var.getString(R.string.powering_up_sound);
                                string.getClass();
                                ypa0VarL1.A1(0L, string);
                            }
                            if (Intrinsics.g(((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType(), "ROUND_PRE_START") && ((Boolean) ((x5a0) m9c0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue() && !m9c0Var.l0) {
                                ej5.c(ebs.a(m9c0Var.getLifecycle()), null, null, new n9c0(m9c0Var, null), 3);
                            }
                            if (((x5a0) m9c0Var.R0().e).getValue() == null || (file = (File) ((x5a0) m9c0Var.R0().e).getValue()) == null || !file.exists() || ((x5a0) m9c0Var.R0().f).getValue() == null || (file2 = (File) ((x5a0) m9c0Var.R0().f).getValue()) == null || !file2.exists() || ((x5a0) m9c0Var.R0().i).getValue() == null || (file3 = (File) ((x5a0) m9c0Var.R0().i).getValue()) == null || !file3.exists() || !((Boolean) ((x5a0) ytwVar3).getValue()).booleanValue()) {
                                aVar.N(181558027);
                            } else {
                                aVar.N(192182130);
                                rwi0.a((File) ((x5a0) m9c0Var.R0().e).getValue(), (File) ((x5a0) m9c0Var.R0().f).getValue(), ((MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue()).getMessageType(), ((Boolean) ((x5a0) m9c0Var.c1().l0).getValue()).booleanValue(), aVar, 384);
                            }
                            aVar.H();
                        }
                        aVar.H();
                        if (num == null) {
                            aVar.N(192699302);
                        } else {
                            aVar.N(192699303);
                            int iIntValue2 = num.intValue();
                            goj gojVarC6 = m9c0Var.c1();
                            q9c0 q9c0VarQ3 = m9c0Var.q3();
                            ytw<MultiplierResponse> ytwVar4 = m9c0Var.R0().b;
                            boolean zBooleanValue = ((Boolean) ytwVarC.getValue()).booleanValue();
                            boolean zA = aVar.A(m9c0Var);
                            Object objY = aVar.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zA || objY == c0042a) {
                                objY = new Function0() { // from class: i9c0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        m9c0 m9c0Var2 = m9c0Var;
                                        if (((Boolean) ((x5a0) m9c0Var2.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) m9c0Var2.i0).getValue()).booleanValue() && !m9c0Var2.l0) {
                                            ypa0 ypa0VarL2 = m9c0Var2.l1();
                                            String string2 = m9c0Var2.getString(R.string.fire_transition_sound);
                                            string2.getClass();
                                            ypa0VarL2.A1(0L, string2);
                                        }
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY);
                            }
                            Function0 function0 = (Function0) objY;
                            boolean zA2 = aVar.A(m9c0Var);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new Function1() { // from class: j9c0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        gly glyVar = (gly) obj3;
                                        q9c0 q9c0VarQ4 = m9c0Var.q3();
                                        long j = glyVar.a;
                                        wwd0 wwd0Var = q9c0VarQ4.D;
                                        wwd0Var.getClass();
                                        wwd0Var.k(null, glyVar);
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY2);
                            }
                            Function1 function1 = (Function1) objY2;
                            MultiplierResponse multiplierResponse2 = m9c0Var.x0;
                            if (Intrinsics.g(multiplierResponse2 != null ? multiplierResponse2.getMessageType() : null, "ROUND_ONGOING")) {
                                multiplierResponse = m9c0Var.x0;
                                if (multiplierResponse != null || (currentMultiplier = multiplierResponse.getCurrentMultiplier()) == null) {
                                    d2 = 0.0d;
                                } else {
                                    d2 = Double.parseDouble(currentMultiplier);
                                }
                                if (d2 > 5.0d) {
                                    z = true;
                                }
                            } else {
                                MultiplierResponse multiplierResponse3 = m9c0Var.x0;
                                if (Intrinsics.g(multiplierResponse3 != null ? multiplierResponse3.getMessageType() : null, "ROUND_END_WAIT")) {
                                    multiplierResponse = m9c0Var.x0;
                                    if (multiplierResponse != null) {
                                        d2 = 0.0d;
                                    } else {
                                        d2 = 0.0d;
                                    }
                                    if (d2 > 5.0d) {
                                        z = true;
                                    }
                                }
                            }
                            bxy.c(gojVarC6, q9c0VarQ3, ytwVar4, zBooleanValue, function0, function1, z, iIntValue2, ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue(), aVar, 0);
                            aVar = aVar;
                        }
                        aVar.H();
                        x18.a(m9c0Var.R0().b, ((Boolean) ytwVarC.getValue()).booleanValue(), m9c0Var.c1().j0, ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue(), aVar, 0);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar8 = this.z;
        if (gviVar8 != null) {
            ComposeView composeView3 = gviVar8.a0;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(495424190, new Function2() { // from class: o8c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d.a aVar2 = d.a.b;
                        d dVarG = j.g(aVar2, 1.0f);
                        aiv aivVarC = g75.c(ht.a.h, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarG);
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
                        yka.a.b bVar = yka.a.f;
                        hlh0.a(aVar, aivVarC, bVar);
                        yka.a.d dVar = yka.a.e;
                        hlh0.a(aVar, ne00VarO, dVar);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar, dVarC, cVar2);
                        m9c0 m9c0Var = this.a;
                        if (((Boolean) ((x5a0) m9c0Var.i0).getValue()).booleanValue()) {
                            aVar.N(-101170275);
                            if (((Boolean) ((x5a0) m9c0Var.c1().b0).getValue()).booleanValue()) {
                                aVar.N(-101134470);
                                if (((x5a0) m9c0Var.R0().v).getValue() == null || ((x5a0) m9c0Var.R0().w).getValue() == null || ((x5a0) m9c0Var.R0().y).getValue() == null) {
                                    aVar.N(-114175798);
                                } else {
                                    aVar.N(-100966140);
                                    nv30.a((File) ((x5a0) m9c0Var.R0().v).getValue(), (File) ((x5a0) m9c0Var.R0().w).getValue(), m9c0Var.R0().b, aVar, 0);
                                }
                                aVar.H();
                            } else {
                                aVar.N(-114175798);
                            }
                            aVar.H();
                            Integer num = (Integer) ((x5a0) m9c0Var.A2).getValue();
                            if (num == null) {
                                aVar.N(-100427144);
                            } else {
                                aVar.N(-100427143);
                                float fA = fw20.a(R.dimen._9sdp, aVar);
                                d dVarC2 = g.c(aVar2, fA, lla.b(num.intValue() * 0.103f, aVar) + fA);
                                androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
                                n54 n54Var = ht.a.a;
                                d dVarB = dVar2.b(dVarC2, n54Var);
                                aiv aivVarC2 = g75.c(n54Var, false);
                                int iHashCode2 = Long.hashCode(aVar.m());
                                ne00 ne00VarO2 = aVar.o();
                                d dVarC3 = c.c(aVar, dVarB);
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
                                hlh0.a(aVar, aivVarC2, bVar);
                                hlh0.a(aVar, ne00VarO2, dVar);
                                if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                                    j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                                }
                                hlh0.a(aVar, dVarC3, cVar2);
                                goj gojVarC6 = m9c0Var.c1();
                                boolean zA = aVar.A(m9c0Var);
                                Object objY = aVar.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new rdm(m9c0Var, i2);
                                    aVar.r(objY);
                                }
                                hv30.a(gojVarC6, (Function0) objY, false, aVar, 0, 4);
                                aVar.s();
                            }
                            aVar.H();
                        } else {
                            aVar.N(-114175798);
                        }
                        aVar.H();
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar9 = this.z;
        ViewGroup.LayoutParams layoutParams5 = gviVar9 != null ? gviVar9.V.getLayoutParams() : null;
        layoutParams5.getClass();
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
        layoutParams6.S = 1.0f;
        gvi gviVar10 = this.z;
        if (gviVar10 != null) {
            gviVar10.V.setLayoutParams(layoutParams6);
        }
        Function0<Unit> function0 = new Function0() { // from class: v8c0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gvi gviVar11 = this.a.z;
                if (gviVar11 != null) {
                    gviVar11.V.setVisibility(8);
                }
                return Unit.a;
            }
        };
        yah yahVar = new yah(this, 3);
        this.J1 = function0;
        this.K1 = yahVar;
        gvi gviVar11 = this.z;
        ConstraintLayout constraintLayout = gviVar11 != null ? gviVar11.y : null;
        if (gviVar11 != null) {
            r3(gviVar11.v, constraintLayout);
        }
        gvi gviVar12 = this.z;
        if (gviVar12 != null) {
            r3(gviVar12.w, constraintLayout);
        }
        gvi gviVar13 = this.z;
        if (gviVar13 != null) {
            gviVar13.v.setVisibility(0);
        }
        gvi gviVar14 = this.z;
        if (gviVar14 != null) {
            gviVar14.w.setVisibility(0);
        }
        gvi gviVar15 = this.z;
        if (gviVar15 != null) {
            final ComposeView composeView4 = gviVar15.i;
            composeView4.setViewCompositionStrategy(cVar);
            composeView4.setContent(new op8(1048815949, new Function2() { // from class: h9c0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final m9c0 m9c0Var = this.a;
                        final BetContainerState betContainerState = (BetContainerState) wyh.c(m9c0Var.R0().a, aVar, 0, 7).getValue();
                        BetContainerState betContainerState2 = (BetContainerState) wyh.c(m9c0Var.S0().a, aVar, 0, 7).getValue();
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarB);
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
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) m9c0Var.R0().d).getValue()).get(Long.valueOf(betContainerState.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        ytw<Boolean> ytwVar = m9c0Var.f1().e;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) m9c0Var.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) m9c0Var.c1().e0).getValue(), (cj5) ((x5a0) m9c0Var.c1().f0).getValue());
                        Integer num = (Integer) ((x5a0) m9c0Var.A2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) m9c0Var.R0().b).getValue();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) m9c0Var.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) m9c0Var.y2).getValue()).booleanValue();
                        boolean resetChips = betContainerState.getResetChips();
                        t290 t290VarJ1 = m9c0Var.j1();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) m9c0Var.c1().v).getValue();
                        boolean z = egb.a(betContainerState2) > 0;
                        l1z l1zVarE1 = m9c0Var.e1();
                        osw oswVar = m9c0Var.R0().M;
                        boolean zA = aVar.A(m9c0Var);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function1() { // from class: a8c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    m9c0 m9c0Var2 = m9c0Var;
                                    Long lQ0 = m9c0Var2.q0();
                                    int i2 = 1;
                                    if (m9c0Var2.j0) {
                                        ((BetContainerState) m9c0Var2.R0().a.getValue()).setBetData(betData);
                                        goj.A1(m9c0Var2.c1(), betData, m9c0Var2.z0, m9c0Var2.U0, m9c0Var2.h2, 0, "MANUAL", new d9c0(), new abh(m9c0Var2, i2), lQ0, null, null, 1536);
                                    } else {
                                        m9c0Var2.p0(m9c0Var2.R0(), betData, lQ0);
                                    }
                                    m9c0Var2.S0().S1(true);
                                    ((x5a0) m9c0Var2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(m9c0Var);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new j440(m9c0Var, 1);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(m9c0Var);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new d8c0(m9c0Var, 0);
                            aVar.r(objY3);
                        }
                        Function0 function3 = (Function0) objY3;
                        boolean zA4 = aVar.A(m9c0Var);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new Function0() { // from class: e8c0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    m9c0 m9c0Var2 = m9c0Var;
                                    m9c0Var2.S0().T1(true);
                                    m9c0Var2.R0().T1(false);
                                    ((x5a0) m9c0Var2.j1).setValue(Boolean.FALSE);
                                    m9c0Var2.R0().R1(false);
                                    m9c0Var2.S0().R1(false);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY4);
                        }
                        Function0 function4 = (Function0) objY4;
                        boolean zA5 = aVar.A(m9c0Var);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new c4r(m9c0Var, 2);
                            aVar.r(objY5);
                        }
                        Function0 function5 = (Function0) objY5;
                        boolean zA6 = aVar.A(m9c0Var) | aVar.A(betContainerState);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new f8c0(0, m9c0Var, betContainerState);
                            aVar.r(objY6);
                        }
                        Function1 function6 = (Function1) objY6;
                        boolean zA7 = aVar.A(m9c0Var) | aVar.A(betContainerState);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: h8c0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    m9c0 m9c0Var2 = m9c0Var;
                                    ((x5a0) m9c0Var2.c1().J).setValue(betData);
                                    ((BetContainerState) m9c0Var2.R0().a.getValue()).setBetData(betData);
                                    if (zBooleanValue5) {
                                        m9c0Var2.S0().S1(true);
                                        m9c0Var2.R0().G1(true);
                                        if (!betContainerState.getBetPlaced()) {
                                            if (m9c0Var2.j0) {
                                                ((BetContainerState) m9c0Var2.R0().a.getValue()).setBetData(betData);
                                                goj.A1(m9c0Var2.c1(), betData, m9c0Var2.z0, m9c0Var2.U0, m9c0Var2.h2, 0, "MANUAL", new a9c0(), new vgc(m9c0Var2, 1), null, null, null, 1792);
                                            } else {
                                                m9c0Var2.p0(m9c0Var2.R0(), betData, null);
                                            }
                                        }
                                    } else {
                                        m9c0Var2.R0().G1(false);
                                    }
                                    m9c0Var2.S0().S1(true);
                                    m9c0Var2.S0().P1(0);
                                    ((x5a0) m9c0Var2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function7 = (Function2) objY7;
                        boolean zA8 = aVar.A(m9c0Var);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new Function1() { // from class: i8c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ((Boolean) obj3).getClass();
                                    m9c0 m9c0Var2 = m9c0Var;
                                    m9c0Var2.S0().S1(true);
                                    x5a0 x5a0Var = (x5a0) m9c0Var2.j1;
                                    x5a0Var.setValue(Boolean.FALSE);
                                    m9c0Var2.p1 = 1;
                                    ((u5a0) m9c0Var2.n1).k(2);
                                    m9c0Var2.R0().Q1(-1);
                                    x5a0Var.setValue(Boolean.TRUE);
                                    m9c0Var2.R0().P1(2);
                                    m9c0Var2.R0().R1(true);
                                    m9c0Var2.R0().S1(false);
                                    m9c0Var2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY8);
                        }
                        Function1 function8 = (Function1) objY8;
                        boolean zA9 = aVar.A(m9c0Var);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new mn3(m9c0Var, 2);
                            aVar.r(objY9);
                        }
                        Function0 function9 = (Function0) objY9;
                        boolean zA10 = aVar.A(m9c0Var);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = m9c0Var.new c();
                            aVar.r(objY10);
                        }
                        Function2 function10 = (Function2) objY10;
                        boolean zA11 = aVar.A(m9c0Var);
                        final ComposeView composeView5 = composeView4;
                        boolean zA12 = zA11 | aVar.A(composeView5);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: j8c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    m9c0 m9c0Var2 = m9c0Var;
                                    ((x5a0) m9c0Var2.c1().J).setValue(betData);
                                    ((BetContainerState) m9c0Var2.R0().a.getValue()).setBetData(betData);
                                    ((x5a0) m9c0Var2.c1().T).setValue(Boolean.TRUE);
                                    ytw<String> ytwVar2 = m9c0Var2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView6 = composeView5;
                                    String strB = w68.b(composeView6, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView6.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) m9c0Var2.c1().R).setValue(f78.a(composeView6, R.string.yes_bet, w68.b(composeView6, R.string.yes_btn_cms), null));
                                    ((x5a0) m9c0Var2.c1().S).setValue(f78.a(composeView6, R.string.cancel_bet, w68.b(composeView6, R.string.cancel_btn_cms), null));
                                    m9c0Var2.H1();
                                    m9c0Var2.c1().E1(m9c0Var2.R0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function11 = (Function1) objY11;
                        boolean zA13 = aVar.A(m9c0Var);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new dm80(m9c0Var, 1);
                            aVar.r(objY12);
                        }
                        Function1 function12 = (Function1) objY12;
                        boolean zA14 = aVar.A(m9c0Var);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new Function0() { // from class: b8c0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(m9c0Var.z1());
                                }
                            };
                            aVar.r(objY13);
                        }
                        Function0 function13 = (Function0) objY13;
                        boolean zA15 = aVar.A(m9c0Var);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new Function0() { // from class: c8c0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    m9c0Var.V1();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY14);
                        }
                        Function0 function14 = (Function0) objY14;
                        boolean zA16 = aVar.A(m9c0Var);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new i440(m9c0Var, 1);
                            aVar.r(objY15);
                        }
                        x2a.a(iIntValue2, sl2Var, betContainerState, t290VarJ1, multiplierResponse, function1, function2, function3, function4, resetChips, function5, function6, function7, function8, function9, zBooleanValue2, zBooleanValue, zBooleanValue3, function10, function11, function12, zBooleanValue4, str, function13, function14, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar16 = this.z;
        if (gviVar16 != null) {
            ComposeView composeView5 = gviVar16.e;
            composeView5.setViewCompositionStrategy(cVar);
            composeView5.setContent(new op8(-1451966002, new hq3(i, this, composeView5), true));
        }
    }

    public final void p3(final long j, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-920551502);
        int i2 = i | (bVarI.e(j) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.b(z2) ? 256 : 128) | (bVarI.A(this) ? 2048 : 1024);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            o3(z2, bVarI, (i2 >> 6) & WebSocketProtocol.PAYLOAD_SHORT);
            if (!z || gly.c(j, 0L) || z2) {
                bVarI.N(-1000976854);
            } else {
                bVarI.N(-953698537);
                ckd.a(op5.c(op5.a, "deflated_ball_dull_png:sg_game_name", pwo.e(R.string.deflated_ball_url, bVarI)), j, 0, 0, 0, 0.0f, bVarI, (i2 << 3) & 112);
            }
            bVarI.X(false);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(j, z, z2, i) { // from class: k8c0
                public final /* synthetic */ long b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.p3(this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final q9c0 q3() {
        return (q9c0) this.z2.getValue();
    }

    public final void r3(BlurView blurView, ConstraintLayout constraintLayout) {
        eg4 a850Var;
        Context context;
        if (Build.VERSION.SDK_INT >= 31) {
            a850Var = new o750();
        } else {
            a850Var = (constraintLayout == null || (context = constraintLayout.getContext()) == null) ? null : new a850(context);
        }
        if (constraintLayout != null) {
            ha20 ha20VarB = blurView.b(constraintLayout, a850Var);
            ha20VarB.a = 5.0f;
            ha20VarB.e(true);
            long j = j58.l;
            ha20VarB.b(r58.l(j));
            ha20VarB.l = new ColorDrawable(r58.l(j));
        }
    }

    public final boolean s3() {
        CampaignParticipateV2 campaignParticipateV2 = this.B2;
        return campaignParticipateV2 != null && campaignParticipateV2.getCanConvert();
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }

    @Override // defpackage.fgb
    public final void e2() {
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
    }
}
