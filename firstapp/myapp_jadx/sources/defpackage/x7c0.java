package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import x7c0.c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lx7c0;", "Lfgb;", "<init>", "()V", "", "giftResponseReceived", "", "containerWidth", "brightness", "isActive", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x7c0 extends fgb {
    public CampaignParticipateV2 A2;
    public String B2;
    public Long C2;
    public final ytw<Boolean> y2 = m.b(Boolean.FALSE);
    public final ytw<Integer> z2 = m.b(null);

    @c0d(c = "com.sportygames.sportyjet.views.SportyJetFragment$downloadSpineData$1$1", f = "SportyJetFragment.kt", l = {1150, 1180, 1184, 1189, 1195}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public int c;
        public int d;
        public final /* synthetic */ Context f;

        /* JADX INFO: renamed from: x7c0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.sportyjet.views.SportyJetFragment$downloadSpineData$1$1$spineData$1", f = "SportyJetFragment.kt", l = {1151}, m = "invokeSuspend", v = 1)
        public static final class C1279a extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
            public int a;
            public final /* synthetic */ x7c0 b;
            public final /* synthetic */ Context c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1279a(x7c0 x7c0Var, Context context, v1b<? super C1279a> v1bVar) {
                super(2, v1bVar);
                this.b = x7c0Var;
                this.c = context;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C1279a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
                return ((C1279a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                String strC = op5.c(op5.a, "sj_wc_spine_android:sg_sporty_jet", "https://s.sporty.net/common/main/res/66a788dd52fc7857cc051803da7752d0.zip");
                this.a = 1;
                Object objY1 = fq5VarV0.y1(this.c, strC, "sporty_jet_spine_data", this);
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
            return x7c0.this.new a(this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:42|78|43|(1:45)(1:46)|47|(2:61|(1:63)(2:64|60))(4:51|(3:53|(1:55)(1:56)|(1:58))|59|82)) */
        /* JADX WARN: Code duplicated, block: B:27:0x0068 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:28:0x006a, B:31:0x0085, B:33:0x0089, B:35:0x008f, B:39:0x0098, B:13:0x0035, B:17:0x0043, B:20:0x004d, B:23:0x005a), top: B:80:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x009e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0122 A[PHI: r2 r12 r13 r16
          0x0122: PHI (r2v3 int) = (r2v4 int), (r2v4 int), (r2v4 int), (r2v11 int) binds: [B:69:0x015a, B:66:0x0133, B:62:0x011f, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0122: PHI (r12v3 int) = (r12v5 int), (r12v6 int), (r12v7 int), (r12v13 int) binds: [B:69:0x015a, B:66:0x0133, B:62:0x011f, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0122: PHI (r13v2 int) = (r13v3 int), (r13v3 int), (r13v3 int), (r13v9 int) binds: [B:69:0x015a, B:66:0x0133, B:62:0x011f, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0122: PHI (r16v2 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v9 int) binds: [B:69:0x015a, B:66:0x0133, B:62:0x011f, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x0135  */
        /* JADX WARN: Code duplicated, block: B:68:0x0136 A[Catch: Exception -> 0x015d, TRY_LEAVE, TryCatch #0 {Exception -> 0x015d, blocks: (B:43:0x00a4, B:45:0x00b2, B:47:0x00b9, B:49:0x00bf, B:51:0x00c5, B:53:0x00e2, B:58:0x00ec, B:61:0x00fd, B:65:0x0125, B:68:0x0136), top: B:78:0x00a4 }] */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x015a, code lost:
        
            if (defpackage.hkd.b(500, r17) == r1) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x017d, code lost:
        
            if (defpackage.hkd.b(500, r17) == r1) goto L73;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:68:0x0136, please report this as an issue */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x017d -> B:74:0x0180). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 391
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: x7c0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ x7c0 b;

        public b(View view, x7c0 x7c0Var) {
            this.a = view;
            this.b = x7c0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ((x5a0) this.b.z2).setValue(Integer.valueOf(this.a.getHeight()));
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
            x7c0 x7c0Var = x7c0.this;
            if (!((Boolean) ((x5a0) x7c0Var.d1).getValue()).booleanValue()) {
                ((x5a0) x7c0Var.c1().H).setValue(str2);
                ((x5a0) x7c0Var.c1().K).setValue(j58Var2);
                ((x5a0) x7c0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) x7c0Var.c1().Q).setValue(2000);
                ((x5a0) x7c0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(x7c0Var);
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
            x7c0 x7c0Var = x7c0.this;
            if (!((Boolean) ((x5a0) x7c0Var.d1).getValue()).booleanValue()) {
                ((x5a0) x7c0Var.c1().H).setValue(str2);
                ((x5a0) x7c0Var.c1().K).setValue(j58Var2);
                ((x5a0) x7c0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) x7c0Var.c1().Q).setValue(2000);
                ((x5a0) x7c0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(x7c0Var);
            }
            return Unit.a;
        }
    }

    public static void s3(String str) {
        zj60 bridge;
        Bundle bundleA = mll0.a("spine_reason", str);
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager == null || (bridge = sportyGamesManager.getBridge()) == null) {
            return;
        }
        ((bk60) bridge).a("spine_download", bundleA);
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
        boolean z = this.p0;
        gvi gviVar = this.z;
        if (z) {
            if (gviVar != null) {
                gviVar.k0.setBackgroundColor(Color.parseColor("#181a1b"));
            }
            gvi gviVar2 = this.z;
            if (gviVar2 != null) {
                gviVar2.w0.setVisibility(0);
                return;
            }
            return;
        }
        if (gviVar != null) {
            gviVar.k0.setBackgroundColor(Color.parseColor("#000000"));
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            gviVar3.w0.setVisibility(8);
        }
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPORTY_JET_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPORTY_JET_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_sporty_jet);
            string.getClass();
            progressMeterComponent.setSoundManager("Sporty_Jet/", string, boolValueOf, boolValueOf2, rk60.b.B, this.i, context);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.I(l1());
        }
    }

    @Override // defpackage.fgb
    public final void D2(Coefficients coefficients) {
        long jK;
        long jK2;
        coefficients.getClass();
        if (((Boolean) ((x5a0) Y0().i).getValue()).booleanValue()) {
            coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            double houseCoefficient = coefficients.getHouseCoefficient();
            mz1 mz1VarB1 = b1();
            if (houseCoefficient <= 1.5d) {
                jK = mz1VarB1.H();
            } else if (houseCoefficient <= 4.9d) {
                jK = mz1VarB1.I();
            } else if (houseCoefficient <= 9.9d) {
                jK = mz1VarB1.J();
            } else {
                jK = houseCoefficient <= 18.9d ? mz1VarB1.K() : new yn60().w1;
            }
            coefficients.m97setCoeffColor8_81llA(jK);
            Y0().x1(coefficients);
            return;
        }
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        double houseCoefficient2 = coefficients.getHouseCoefficient();
        mz1 mz1VarB2 = b1();
        if (houseCoefficient2 <= 1.5d) {
            jK2 = mz1VarB2.H();
        } else if (houseCoefficient2 <= 4.9d) {
            jK2 = mz1VarB2.I();
        } else if (houseCoefficient2 <= 9.9d) {
            jK2 = mz1VarB2.J();
        } else {
            jK2 = houseCoefficient2 <= 18.9d ? mz1VarB2.K() : new yn60().w1;
        }
        coefficients.m97setCoeffColor8_81llA(jK2);
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
        long jK;
        Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
        int size = previousMultiplierResponse.getCoefficients().size();
        for (int i = 0; i < size; i++) {
            previousMultiplierResponse.getCoefficients().get(i).m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            previousMultiplierResponse.getCoefficients().get(i).m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            Coefficients coefficients = previousMultiplierResponse.getCoefficients().get(i);
            double houseCoefficient = previousMultiplierResponse.getCoefficients().get(i).getHouseCoefficient();
            mz1 mz1VarB1 = b1();
            if (houseCoefficient <= 1.5d) {
                jK = mz1VarB1.H();
            } else if (houseCoefficient <= 4.9d) {
                jK = mz1VarB1.I();
            } else if (houseCoefficient <= 9.9d) {
                jK = mz1VarB1.J();
            } else {
                jK = houseCoefficient <= 18.9d ? mz1VarB1.K() : new yn60().w1;
            }
            coefficients.m97setCoeffColor8_81llA(jK);
        }
        Y0().B1(previousMultiplierResponse);
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
        return r3();
    }

    @Override // defpackage.fgb
    public final boolean R2() {
        return r3();
    }

    @Override // defpackage.fgb
    public final boolean S2() {
        return r3();
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
            String string = getString(R.string.fly_away);
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
        String string = getString(R.string.sporty_jet_id);
        string.getClass();
        rk60.b bVar = rk60.b.B;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        String string2 = getString(R.string.bg_music);
        string2.getClass();
        progressMeterComponent.J("Jet", string, bool, bVar, gameDetails, context, ypa0VarL1, bool, string2);
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
    public final void e2() {
        if (!((Boolean) ((x5a0) c1().u0).getValue()).booleanValue() || ((Boolean) ((x5a0) c1().m0).getValue()).booleanValue() || !((Boolean) ((x5a0) this.i0).getValue()).booleanValue() || this.l0) {
            return;
        }
        ypa0 ypa0VarL1 = l1();
        String string = getString(R.string.powering_up_beep);
        string.getClass();
        ypa0VarL1.A1(0L, string);
    }

    @Override // defpackage.fgb
    public final void f2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_jet_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.B;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_valentine);
        string2.getClass();
        progressMeterComponent.J("Jet", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void g2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_jet_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.B;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = (Boolean) ((x5a0) c1().t0).getValue();
        String string2 = getString(R.string.bg_music_xmas);
        string2.getClass();
        progressMeterComponent.J("Jet", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    /* JADX INFO: renamed from: i2, reason: from getter */
    public final String getB2() {
        return this.B2;
    }

    @Override // defpackage.fgb
    /* JADX INFO: renamed from: j2, reason: from getter */
    public final CampaignParticipateV2 getA2() {
        return this.A2;
    }

    public final void n3(final androidx.compose.ui.d dVar, xpf0 xpf0Var, androidx.compose.runtime.a aVar, final int i) {
        final xpf0 xpf0Var2;
        xpf0 xpf0Var3;
        xpf0 xpf0Var4;
        Object obj;
        androidx.compose.runtime.b bVarI = aVar.i(-1421831713);
        int i2 = i | 16;
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                xpf0Var3 = (xpf0) p8i0.a(jq40.a(xpf0.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                xpf0Var3 = xpf0Var;
            }
            bVarI.Y();
            final ytw ytwVarB = n95.b(xpf0Var3.d, bVarI);
            Configuration configuration = (Configuration) bVarI.O(AndroidCompositionLocals_androidKt.a);
            float density = ((mmd) bVarI.O(kna.h)).getDensity();
            float f = configuration.screenWidthDp * density;
            float f2 = configuration.screenHeightDp * density;
            final float f3 = f - (f / 1.11f);
            final float f4 = (f2 / 2.4f) * 1.05f;
            double radians = Math.toRadians(45.0d);
            float fCos = (float) Math.cos(radians);
            float fSin = (float) Math.sin(radians);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                int i3 = 75;
                ArrayList arrayList = new ArrayList(75);
                int i4 = 0;
                while (i4 < i3) {
                    lx30.INSTANCE.getClass();
                    p4 p4Var = lx30.b;
                    arrayList.add(new s7c0((i4 * 2700) / 75, (p4Var.d() * f) + f, (-p4Var.d()) * f2));
                    i4++;
                    i3 = i3;
                    f2 = f2;
                    xpf0Var3 = xpf0Var3;
                }
                xpf0Var4 = xpf0Var3;
                bVarI.r(arrayList);
                obj = arrayList;
            } else {
                xpf0Var4 = xpf0Var3;
                obj = objY;
            }
            final List list = (List) obj;
            egn egnVarB = kgn.b(null, bVarI, 1);
            bVarI.N(-580617623);
            final ArrayList arrayList2 = new ArrayList(l48.r(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s7c0 s7c0Var = (s7c0) it.next();
                s7c0Var.getClass();
                egnVarB = egnVarB;
                arrayList2.add(kgn.a(egnVarB, 0.0f, 1.0f, yi0.a(new gzg0(2700, s7c0Var.c, xkf.d), l850.a, 0L, 4), null, bVarI, 4536, 8));
                fSin = fSin;
                fCos = fCos;
                it = it;
                c0042a = c0042a;
            }
            final float f5 = fCos;
            final float f6 = fSin;
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = c0042a;
            bVarI.X(false);
            androidx.compose.ui.d dVarA = s3w.a(dVar, "sj_rain");
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
            androidx.compose.ui.d dVarE = j.e(androidx.compose.ui.d.a.b, 1.0f);
            boolean zA = bVarI.A(list) | bVarI.A(arrayList2) | bVarI.c(f3) | bVarI.c(f5) | bVarI.c(f4) | bVarI.c(f6) | bVarI.M(ytwVarB);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a2) {
                Function1 function1 = new Function1() { // from class: e7c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        tcf tcfVar = (tcf) obj2;
                        tcfVar.getClass();
                        int i5 = 0;
                        for (Object obj3 : list) {
                            int i6 = i5 + 1;
                            if (i5 < 0) {
                                b.q();
                                throw null;
                            }
                            s7c0 s7c0Var2 = (s7c0) obj3;
                            float fFloatValue = ((Number) ((twd0) arrayList2.get(i5)).getValue()).floatValue();
                            float f7 = s7c0Var2.a;
                            float f8 = s7c0Var2.b;
                            float f9 = f7 - f3;
                            float f10 = f5;
                            float f11 = f4 - f8;
                            float f12 = f6;
                            float fMin = Math.min(f9 / f10, f11 / f12);
                            float fA = w6.a(f10, fMin, fFloatValue, s7c0Var2.a);
                            float f13 = (fMin * f12 * fFloatValue) + f8;
                            float f14 = (f10 * 100.0f) + fA;
                            float f15 = f13 - (f12 * 100.0f);
                            long j = j58.f;
                            twd0 twd0Var = ytwVarB;
                            tcf.M0(tcfVar, new hfs(b.k(new j58(j58.c(((Number) twd0Var.getValue()).floatValue() * 0.4f, j)), new j58(j58.c(((Number) twd0Var.getValue()).floatValue() * 0.15f, j)), new j58(j58.l)), null, (((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(f13)) & 4294967295L), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 0), (((long) Float.floatToRawIntBits(f13)) & 4294967295L) | (Float.floatToRawIntBits(fA) << 32), (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L), 3.0f, 0.0f, 480);
                            i5 = i6;
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                objY2 = function1;
            }
            rxo.b(dVarE, (Function1) objY2, bVarI, 6);
            bVarI.X(true);
            xpf0Var2 = xpf0Var4;
        } else {
            bVarI.G();
            xpf0Var2 = xpf0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, xpf0Var2, i) { // from class: f7c0
                public final /* synthetic */ d b;
                public final /* synthetic */ xpf0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(7);
                    this.a.n3(this.b, this.c, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void o3(xpf0 xpf0Var, final androidx.compose.ui.d dVar, final String str, final int i, final n54 n54Var, final Object obj, androidx.compose.runtime.a aVar, final int i2) {
        final xpf0 xpf0Var2;
        boolean z;
        int i3;
        xpf0 xpf0Var3;
        Object objC;
        n54.a aVar2;
        dVar.getClass();
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-793237170);
        int i4 = (i2 & 6) == 0 ? i2 | 2 : i2;
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.d(i) ? 2048 : 1024;
        }
        int i5 = i2 & 24576;
        d0b.a.c cVar = d0b.a.c;
        if (i5 == 0) {
            i4 |= bVarI.M(cVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= bVarI.M(n54Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= bVarI.A(obj) ? 1048576 : 524288;
        }
        if (bVarI.q(i4 & 1, (599187 & i4) != 599186)) {
            bVarI.A0();
            if ((i2 & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    z = true;
                    i3 = i4 & (-15);
                    xpf0Var3 = (xpf0) p8i0.a(jq40.a(xpf0.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
                }
            } else {
                bVarI.G();
                z = true;
                i3 = i4 & (-15);
                xpf0Var3 = xpf0Var;
            }
            bVarI.Y();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(1.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.runtime.j.a(0.0f);
                bVarI.r(objY2);
            }
            final isw iswVar = (isw) objY2;
            String str2 = obj instanceof String ? (String) obj : null;
            boolean zM = str2 != null ? StringsKt.M(str2, "stars", z) : false;
            final ytw ytwVarB = n95.b(xpf0Var3.d, bVarI);
            if (zM) {
                objC = ((Number) ytwVarB.getValue()).floatValue() > 1.0f ? op5.c(op5.a, "lightning_stars_png:sg_game_name", "") : op5.c(op5.a, "stars_png:sg_game_name", "");
            } else {
                objC = obj;
            }
            xpf0 xpf0Var4 = xpf0Var3;
            boolean zA = bVarI.A(wd0Var) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                aVar2 = null;
                objY3 = new t7c0(str, wd0Var, i, null);
                bVarI.r(objY3);
            } else {
                aVar2 = null;
            }
            xvf.e(bVarI, str, (Function2) objY3);
            androidx.compose.ui.d dVarD = j.D(j.c(dVar, 1.0f), aVar2, 1);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = new Function1() { // from class: g7c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        urr urrVar = (urr) obj2;
                        urrVar.getClass();
                        iswVar.A(((int) (urrVar.a() & 4294967295L)) * 1.3432835f);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            androidx.compose.ui.d dVarA = v.a(dVarD, (Function1) objY4);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(bVarI, dVarA);
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
            float fV1 = ((mmd) bVarI.O(kna.h)).v1(iswVar.j());
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            nan.a aVar4 = new nan.a((Context) bVarI.O(qyd0Var));
            aVar4.c = objC;
            nan nanVarA = aVar4.a();
            Object objY5 = bVarI.y();
            if (objY5 == c0042a) {
                objY5 = new ll3(1);
                bVarI.r(objY5);
            }
            androidx.compose.ui.d.a aVar5 = androidx.compose.ui.d.a.b;
            androidx.compose.ui.d dVarD2 = g.d(j.g(j.c(androidx.compose.ui.graphics.a.a(aVar5, (Function1) objY5), 1.0f), 1.0f), ((Number) wd0Var.d()).floatValue() * fV1, 0.0f, 2);
            androidx.compose.foundation.layout.d dVar2 = androidx.compose.foundation.layout.d.a;
            androidx.compose.ui.d dVarB = dVar2.b(dVarD2, n54Var);
            boolean zM2 = bVarI.M(ytwVarB);
            Object objY6 = bVarI.y();
            if (zM2 || objY6 == c0042a) {
                objY6 = new ubm(ytwVarB, 2);
                bVarI.r(objY6);
            }
            int i6 = ((i3 >> 3) & 7168) | 48;
            fn80.a(nanVarA, "BG1", androidx.compose.ui.draw.a.c(dVarB, (Function1) objY6), cVar, null, 0.0f, null, null, null, bVarI, i6, 2032);
            nan.a aVar6 = new nan.a((Context) bVarI.O(qyd0Var));
            aVar6.c = objC;
            nan nanVarA2 = aVar6.a();
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new h7c0();
                bVarI.r(objY7);
            }
            androidx.compose.ui.d dVarB2 = dVar2.b(g.d(j.g(j.c(androidx.compose.ui.graphics.a.a(aVar5, (Function1) objY7), 1.0f), 1.0f), (((Number) wd0Var.d()).floatValue() * fV1) - fV1, 0.0f, 2), n54Var);
            boolean zM3 = bVarI.M(ytwVarB);
            Object objY8 = bVarI.y();
            if (zM3 || objY8 == c0042a) {
                objY8 = new Function1() { // from class: i7c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        lza lzaVar = (lza) obj2;
                        lzaVar.getClass();
                        float[] fArrA = t58.a();
                        twd0 twd0Var = ytwVarB;
                        t58.b(((Number) twd0Var.getValue()).floatValue(), ((Number) twd0Var.getValue()).floatValue(), ((Number) twd0Var.getValue()).floatValue(), fArrA);
                        b90 b90VarA = c90.a();
                        b90VarA.k(new u58(fArrA));
                        lc6 lc6VarA = lzaVar.F1().a();
                        try {
                            lc6VarA.s(pk40.b(0L, lzaVar.F1().d()), b90VarA);
                            lzaVar.b2();
                            return Unit.a;
                        } finally {
                            lc6VarA.f();
                        }
                    }
                };
                bVarI.r(objY8);
            }
            fn80.a(nanVarA2, "BG2", androidx.compose.ui.draw.a.c(dVarB2, (Function1) objY8), cVar, null, 0.0f, null, null, null, bVarI, i6, 2032);
            bVarI = bVarI;
            bVarI.X(true);
            xpf0Var2 = xpf0Var4;
        } else {
            bVarI.G();
            xpf0Var2 = xpf0Var;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j7c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.a.o3(xpf0Var2, dVar, str, i, n54Var, obj, (a) obj2, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        this.C2 = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onStop() {
        Double dValueOf;
        double dRint;
        xnh0 user;
        Long l = this.C2;
        if (l != null) {
            if (!r3()) {
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
        this.C2 = null;
        super.onStop();
        if (this.t0) {
            return;
        }
        ((x5a0) c1().a0).setValue(Boolean.FALSE);
        ((x5a0) c1().Y).setValue(Boolean.TRUE);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        double d2;
        double d3;
        view.getClass();
        super.onViewCreated(view, bundle);
        gvi gviVar = this.z;
        if (gviVar != null) {
            ConstraintLayout constraintLayout = gviVar.F;
            Resources resources = constraintLayout.getResources();
            gvi gviVar2 = this.z;
            if (gviVar2 != null) {
                gviVar2.B.setVisibility(8);
            }
            float dimension = resources.getDimension(R.dimen.z_depth_low);
            float dimension2 = resources.getDimension(R.dimen.z_depth_high);
            gvi gviVar3 = this.z;
            if (gviVar3 != null) {
                gviVar3.W.setTranslationZ(dimension);
            }
            gvi gviVar4 = this.z;
            if (gviVar4 != null) {
                gviVar4.c.setTranslationZ(dimension);
            }
            gvi gviVar5 = this.z;
            if (gviVar5 != null) {
                gviVar5.d.setTranslationZ(dimension);
            }
            gvi gviVar6 = this.z;
            if (gviVar6 != null) {
                gviVar6.L.setTranslationZ(dimension2);
            }
            androidx.constraintlayout.widget.b bVar = new androidx.constraintlayout.widget.b();
            bVar.f(constraintLayout);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen._6sdp);
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            float f = displayMetrics.heightPixels / displayMetrics.density;
            bVar.e(R.id.bottom_spacer_view, 4);
            bVar.g(R.id.bottom_spacer_view, 4, R.id.space2, 3);
            bVar.l(R.id.bottom_spacer_view, 0);
            bVar.i(R.id.bottom_spacer_view, 0);
            int i = displayMetrics.heightPixels;
            if (f > 800.0f) {
                d2 = i;
                d3 = 0.05d;
            } else if (f > 600.0f) {
                d2 = i;
                d3 = 0.09d;
            } else {
                d2 = i;
                d3 = 0.1d;
            }
            int i2 = (int) (d2 * d3);
            bVar.i(R.id.bottom_spacer_view, i2);
            bVar.i(R.id.bottom_spacer_view, i2);
            bVar.g(R.id.bottom_spacer_view, 6, 0, 6);
            bVar.g(R.id.bottom_spacer_view, 7, 0, 7);
            bVar.e(R.id.bet_view1, 3);
            bVar.g(R.id.bet_view1, 4, R.id.bottom_spacer_view, 3);
            bVar.l(R.id.bet_view1, 0);
            bVar.i(R.id.bet_view1, 0);
            bVar.j(R.id.bet_view1, 0.19f);
            bVar.g(R.id.bet_view1, 6, 0, 6);
            bVar.g(R.id.bet_view1, 7, 0, 7);
            bVar.z(R.id.bet_view1, 6, dimensionPixelSize);
            bVar.z(R.id.bet_view1, 7, dimensionPixelSize);
            bVar.g.remove(Integer.valueOf(R.id.space));
            bVar.g(R.id.space, 4, R.id.bet_view1, 3);
            bVar.l(R.id.space, 0);
            bVar.i(R.id.space, 0);
            bVar.j(R.id.space, 0.01f);
            bVar.g(R.id.space, 6, 0, 6);
            bVar.g(R.id.space, 7, 0, 7);
            bVar.e(R.id.bet_view, 3);
            bVar.g(R.id.bet_view, 4, R.id.space, 3);
            bVar.l(R.id.bet_view, 0);
            bVar.i(R.id.bet_view, 0);
            bVar.j(R.id.bet_view, 0.19f);
            bVar.g(R.id.bet_view, 6, 0, 6);
            bVar.g(R.id.bet_view, 7, 0, 7);
            bVar.z(R.id.bet_view, 6, dimensionPixelSize);
            bVar.z(R.id.bet_view, 7, dimensionPixelSize);
            bVar.e(R.id.multiplier_view, 3);
            bVar.g(R.id.multiplier_view, 4, R.id.bet_view, 3);
            bVar.l(R.id.multiplier_view, 0);
            bVar.i(R.id.multiplier_view, 0);
            bVar.j(R.id.multiplier_view, 0.49f);
            bVar.g(R.id.multiplier_view, 6, 0, 6);
            bVar.g(R.id.multiplier_view, 7, 0, 7);
            bVar.b(constraintLayout);
        }
        SportyGamesManager.setGameName("jet");
        op5.a.getClass();
        op5.c = "sg_sporty_jet";
        SportyGamesManager.getInstance().setScreenName("sportygames/sporty-jet");
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = m.b("sporty-jet");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2("sg_sporty_jet", "games/sporty-jet/v1/game");
        goj gojVarC2 = c1();
        osw oswVarA = k.a(R.string.sporty_jet_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = m.b("Sporty JET");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = m.b("sporty-jet");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = m.b("Sporty Jet");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.sj_toggle_on_color;
        c1().G = R.color.sj_toggle_off_color;
        qry.a(view, new b(view, this));
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"SPORTY_JET_MUSIC", "SPORTY_JET_SOUND", "SPORTY_JET_ONE_TAP", "SPORTY_JET_THEME"});
        }
        SharedPreferences sharedPreferences = this.H;
        int i3 = 1;
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
        goj gojVarC6 = c1();
        ytw<String[]> ytwVarB5 = m.b(getResources().getStringArray(R.array.sporty_jet_array));
        gojVarC6.getClass();
        gojVarC6.A = ytwVarB5;
        gvi gviVar7 = this.z;
        if (gviVar7 != null) {
            gviVar7.v0.setContent(new op8(-1842183457, new Function2() { // from class: o6c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarA = androidx.compose.foundation.a.a(j.e(d.a.b, 1.0f), new hfs(b.k(new j58(r58.d(4279637526L)), new j58(r58.d(4278190080L))), null, 0L, 9187343241974906880L, 0), null, 0.0f, 6);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarA);
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
                        aVar.s();
                        x7c0 x7c0Var = this.a;
                        xpf0 xpf0Var = (xpf0) x7c0Var.G1.getValue();
                        Boolean bool = (Boolean) ((x5a0) x7c0Var.c1().b0).getValue();
                        bool.getClass();
                        wwd0 wwd0Var = xpf0Var.a;
                        wwd0Var.getClass();
                        wwd0Var.k(null, bool);
                        x7c0Var.q3(null, aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar8 = this.z;
        u6i0.c cVar = u6i0.c.a;
        if (gviVar8 != null) {
            ComposeView composeView = gviVar8.W;
            composeView.setViewCompositionStrategy(cVar);
            composeView.setContent(new op8(-719904258, new Function2() { // from class: s6c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    yka.a.d dVar;
                    yka.a.b bVar2;
                    int i4;
                    yka.a.d dVar2;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x7c0 x7c0Var = this.a;
                        Integer num = (Integer) ((x5a0) x7c0Var.z2).getValue();
                        d.a aVar2 = d.a.b;
                        d dVarG = j.g(aVar2, 1.0f);
                        long j = j58.l;
                        zk40.a aVar3 = zk40.a;
                        d dVarB = androidx.compose.foundation.a.b(dVarG, j, aVar3);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = c.c(aVar, dVarB);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar4);
                        } else {
                            aVar.p();
                        }
                        yka.a.b bVar3 = yka.a.f;
                        hlh0.a(aVar, aivVarC, bVar3);
                        yka.a.d dVar3 = yka.a.e;
                        hlh0.a(aVar, ne00VarO, dVar3);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar, iHashCode, c1350a);
                        }
                        yka.a.c cVar2 = yka.a.d;
                        hlh0.a(aVar, dVarC, cVar2);
                        d dVarB2 = androidx.compose.foundation.a.b(j.c(j.g(aVar2, 1.0f), 1.0f), j, aVar3);
                        n54 n54Var = ht.a.a;
                        aiv aivVarC2 = g75.c(n54Var, false);
                        int iHashCode2 = Long.hashCode(aVar.m());
                        ne00 ne00VarO2 = aVar.o();
                        d dVarC2 = c.c(aVar, dVarB2);
                        if (aVar.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar.D();
                        if (aVar.g()) {
                            aVar.F(aVar4);
                        } else {
                            aVar.p();
                        }
                        hlh0.a(aVar, aivVarC2, bVar3);
                        hlh0.a(aVar, ne00VarO2, dVar3);
                        if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode2))) {
                            j3c.a(iHashCode2, aVar, iHashCode2, c1350a);
                        }
                        hlh0.a(aVar, dVarC2, cVar2);
                        if (((Boolean) ((x5a0) x7c0Var.c1().k0).getValue()).booleanValue() && (Intrinsics.g(((MultiplierResponse) ((x5a0) x7c0Var.R0().b).getValue()).getMessageType(), "ROUND_ONGOING") || Intrinsics.g(((MultiplierResponse) ((x5a0) x7c0Var.R0().b).getValue()).getMessageType(), "ROUND_END_WAIT"))) {
                            aVar.N(740007175);
                            dVar = dVar3;
                            sx30.b(j.c(j.g(aVar2, 1.0f), 0.6f), 1, 0.0f, 0.0f, aVar, 54);
                        } else {
                            dVar = dVar3;
                            aVar.N(730858424);
                        }
                        aVar.H();
                        aVar.s();
                        if (Intrinsics.g(((MultiplierResponse) ((x5a0) x7c0Var.R0().b).getValue()).getMessageType(), "ROUND_PRE_START") && ((Boolean) ((x5a0) x7c0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) x7c0Var.c1().m0).getValue()).booleanValue() && ((Boolean) ((x5a0) x7c0Var.i0).getValue()).booleanValue() && !x7c0Var.l0) {
                            ej5.c(ebs.a(x7c0Var.getLifecycle()), null, null, new y7c0(x7c0Var, null), 3);
                        }
                        if (((x5a0) x7c0Var.R0().e).getValue() != null) {
                            aVar.N(313393660);
                            if (num == null) {
                                aVar.N(1125268869);
                                aVar.H();
                                bVar2 = bVar3;
                                i4 = 1115429470;
                                dVar2 = dVar;
                            } else {
                                aVar.N(1125268870);
                                int iIntValue2 = num.intValue();
                                ytw<MultiplierResponse> ytwVar = x7c0Var.R0().b;
                                File file = (File) ((x5a0) x7c0Var.R0().e).getValue();
                                File file2 = (File) ((x5a0) x7c0Var.R0().f).getValue();
                                File file3 = (File) ((x5a0) x7c0Var.R0().i).getValue();
                                goj gojVarC7 = x7c0Var.c1();
                                boolean zA = aVar.A(x7c0Var);
                                Object objY = aVar.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new vi3(x7c0Var, 3);
                                    aVar.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zBooleanValue = ((Boolean) ((x5a0) x7c0Var.l1).getValue()).booleanValue();
                                bVar2 = bVar3;
                                dVar2 = dVar;
                                i4 = 1115429470;
                                aqw.b(ytwVar, file, file2, file3, gojVarC7, function0, iIntValue2, zBooleanValue, aVar, 0);
                                aVar = aVar;
                                Unit unit = Unit.a;
                                aVar.H();
                            }
                        } else {
                            bVar2 = bVar3;
                            i4 = 1115429470;
                            dVar2 = dVar;
                            aVar.N(1115429470);
                        }
                        aVar.H();
                        if (((Boolean) ((x5a0) x7c0Var.c1().b0).getValue()).booleanValue()) {
                            aVar.N(1125968323);
                            d dVarE = j.e(aVar2, 1.0f);
                            aiv aivVarC3 = g75.c(n54Var, false);
                            int iHashCode3 = Long.hashCode(aVar.m());
                            ne00 ne00VarO3 = aVar.o();
                            d dVarC3 = c.c(aVar, dVarE);
                            if (aVar.k() == null) {
                                l2a.b();
                                throw null;
                            }
                            aVar.D();
                            if (aVar.g()) {
                                aVar.F(aVar4);
                            } else {
                                aVar.p();
                            }
                            hlh0.a(aVar, aivVarC3, bVar2);
                            hlh0.a(aVar, ne00VarO3, dVar2);
                            if (aVar.g() || !Intrinsics.g(aVar.y(), Integer.valueOf(iHashCode3))) {
                                j3c.a(iHashCode3, aVar, iHashCode3, c1350a);
                            }
                            hlh0.a(aVar, dVarC3, cVar2);
                            x7c0Var.n3(j.e(aVar2, 1.0f), null, aVar, 6);
                            x7c0Var.n3(j.e(aVar2, 1.0f), null, aVar, 6);
                            aVar.s();
                        } else {
                            aVar.N(i4);
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
        if (gviVar9 != null) {
            gviVar9.U.setContent(new op8(402374941, new Function2() { // from class: y6c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        x7c0 x7c0Var = this.a;
                        if (((Boolean) ((x5a0) x7c0Var.c1().k0).getValue()).booleanValue()) {
                            aVar.N(-101795880);
                            x7c0Var.p3("main_bg_xmas_png:sg_game_name", "https://s.sporty.net/common/main/res/c3cff4ed3cacb2ad46118dd4a0b28563.png", aVar, 54);
                            aVar.H();
                        } else {
                            aVar.N(-101555010);
                            x7c0Var.p3("main_bg_png:sg_game_name", "https://s.sporty.net/sportygames/cms/assets/main_bg_v2_1749028630974.png", aVar, 54);
                            aVar.H();
                        }
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar10 = this.z;
        if (gviVar10 != null) {
            ComposeView composeView2 = gviVar10.V;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(1524654140, new gc00(this, composeView2), true));
        }
        yk80 yk80Var = new yk80(this, i3);
        Function1<? super Integer, Unit> function1 = new Function1() { // from class: p7c0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                ((Integer) obj).getClass();
                x7c0 x7c0Var = this.a;
                gvi gviVar11 = x7c0Var.z;
                if (gviVar11 != null) {
                    gviVar11.g0.setVisibility(0);
                }
                gvi gviVar12 = x7c0Var.z;
                if (gviVar12 != null) {
                    gviVar12.V.setVisibility(0);
                }
                return Unit.a;
            }
        };
        this.J1 = yk80Var;
        this.K1 = function1;
        gvi gviVar11 = this.z;
        if (gviVar11 != null) {
            final ComposeView composeView3 = gviVar11.c;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(-1648033957, new Function2() { // from class: q7c0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final x7c0 x7c0Var = this.a;
                        BetContainerState betContainerState = (BetContainerState) wyh.c(x7c0Var.R0().a, aVar, 0, 7).getValue();
                        BetContainerState betContainerState2 = (BetContainerState) wyh.c(x7c0Var.S0().a, aVar, 0, 7).getValue();
                        ytw<Boolean> ytwVar = x7c0Var.f1().e;
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            Resources resources2 = x7c0Var.getResources();
                            resources2.getClass();
                            objY = o6a.b(resources2, resources2.getDisplayMetrics().heightPixels, resources2.getDisplayMetrics().widthPixels);
                            aVar.r(objY);
                        }
                        n6a n6aVar = (n6a) objY;
                        boolean zBooleanValue = ((Boolean) ((x5a0) x7c0Var.c1().g0).getValue()).booleanValue();
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
                        HashMap map = (HashMap) ((x5a0) x7c0Var.R0().d).getValue();
                        Boolean bool = map != null ? (Boolean) map.get(Long.valueOf(betContainerState.getRoundId())) : null;
                        boolean zBooleanValue2 = bool != null ? bool.booleanValue() : false;
                        String str = (String) ((x5a0) x7c0Var.c1().v).getValue();
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) x7c0Var.R0().b).getValue();
                        l1z l1zVarE1 = x7c0Var.e1();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        boolean z = egb.a(betContainerState2) > 0;
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) x7c0Var.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue5 = ((Boolean) ((x5a0) x7c0Var.y2).getValue()).booleanValue();
                        t290 t290VarJ1 = x7c0Var.j1();
                        boolean zBooleanValue6 = ((Boolean) ((x5a0) x7c0Var.c1().b0).getValue()).booleanValue();
                        osw oswVar = x7c0Var.R0().M;
                        boolean zBooleanValue7 = ((Boolean) ((x5a0) x7c0Var.c1().m0).getValue()).booleanValue();
                        boolean zA = aVar.A(x7c0Var);
                        Object objY2 = aVar.y();
                        if (zA || objY2 == c0042a) {
                            objY2 = new fzq(x7c0Var, i4);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA2 = aVar.A(x7c0Var);
                        Object objY3 = aVar.y();
                        if (zA2 || objY3 == c0042a) {
                            objY3 = new hzq(x7c0Var, i4);
                            aVar.r(objY3);
                        }
                        Function1 function3 = (Function1) objY3;
                        boolean zA3 = aVar.A(x7c0Var);
                        Object objY4 = aVar.y();
                        if (zA3 || objY4 == c0042a) {
                            objY4 = new Function0() { // from class: q6c0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    x7c0 x7c0Var2 = x7c0Var;
                                    Long lY0 = x7c0Var2.y0();
                                    if (x7c0Var2.j0) {
                                        MultiplierResponse multiplierResponse2 = x7c0Var2.x0;
                                        if (multiplierResponse2 != null) {
                                            x7c0Var2.c1().B1(multiplierResponse2, x7c0Var2.l2(), x7c0Var2.y0, x7c0Var2.h2, 0, new b7h(x7c0Var2, 1), lY0);
                                        }
                                    } else {
                                        x7c0Var2.v0(x7c0Var2.R0(), lY0);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY4);
                        }
                        Function0 function0 = (Function0) objY4;
                        boolean zA4 = aVar.A(x7c0Var);
                        boolean z2 = z;
                        Object objY5 = aVar.y();
                        if (zA4 || objY5 == c0042a) {
                            objY5 = new Function0() { // from class: r6c0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    x7c0 x7c0Var2 = x7c0Var;
                                    x7c0Var2.S0().T1(true);
                                    x7c0Var2.R0().T1(false);
                                    ((x5a0) x7c0Var2.j1).setValue(Boolean.FALSE);
                                    x7c0Var2.R0().R1(false);
                                    x7c0Var2.S0().R1(false);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA5 = aVar.A(x7c0Var);
                        Object objY6 = aVar.y();
                        if (zA5 || objY6 == c0042a) {
                            objY6 = new no8(x7c0Var, 2);
                            aVar.r(objY6);
                        }
                        Function0 function5 = (Function0) objY6;
                        boolean zA6 = aVar.A(x7c0Var);
                        Object objY7 = aVar.y();
                        if (zA6 || objY7 == c0042a) {
                            objY7 = new kzq(x7c0Var, 1);
                            aVar.r(objY7);
                        }
                        Function1 function6 = (Function1) objY7;
                        boolean zA7 = aVar.A(x7c0Var) | aVar.A(betContainerState);
                        Object objY8 = aVar.y();
                        if (zA7 || objY8 == c0042a) {
                            objY8 = new k9m(1, x7c0Var, betContainerState);
                            aVar.r(objY8);
                        }
                        Function2 function7 = (Function2) objY8;
                        boolean zA8 = aVar.A(x7c0Var);
                        Object objY9 = aVar.y();
                        if (zA8 || objY9 == c0042a) {
                            objY9 = new Function1() { // from class: t6c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ((Boolean) obj3).getClass();
                                    x7c0 x7c0Var2 = x7c0Var;
                                    x7c0Var2.S0().S1(true);
                                    x5a0 x5a0Var = (x5a0) x7c0Var2.j1;
                                    x5a0Var.setValue(Boolean.FALSE);
                                    x7c0Var2.p1 = 1;
                                    ((u5a0) x7c0Var2.n1).k(2);
                                    x7c0Var2.R0().Q1(-1);
                                    x5a0Var.setValue(Boolean.TRUE);
                                    x7c0Var2.R0().P1(2);
                                    x7c0Var2.R0().R1(true);
                                    x7c0Var2.R0().S1(false);
                                    x7c0Var2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY9);
                        }
                        Function1 function8 = (Function1) objY9;
                        boolean zA9 = aVar.A(x7c0Var);
                        Object objY10 = aVar.y();
                        if (zA9 || objY10 == c0042a) {
                            objY10 = new nzq(x7c0Var, 1);
                            aVar.r(objY10);
                        }
                        Function0 function9 = (Function0) objY10;
                        boolean zA10 = aVar.A(x7c0Var);
                        Object objY11 = aVar.y();
                        if (zA10 || objY11 == c0042a) {
                            objY11 = x7c0Var.new c();
                            aVar.r(objY11);
                        }
                        Function2 function10 = (Function2) objY11;
                        boolean zA11 = aVar.A(x7c0Var);
                        final ComposeView composeView4 = composeView3;
                        boolean zA12 = zA11 | aVar.A(composeView4);
                        Object objY12 = aVar.y();
                        if (zA12 || objY12 == c0042a) {
                            objY12 = new Function1() { // from class: u6c0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    x7c0 x7c0Var2 = x7c0Var;
                                    ((x5a0) x7c0Var2.c1().J).setValue(betData);
                                    ((BetContainerState) x7c0Var2.R0().a.getValue()).setBetData(betData);
                                    ytw<Boolean> ytwVar2 = x7c0Var2.c1().T;
                                    Boolean bool2 = Boolean.TRUE;
                                    ((x5a0) ytwVar2).setValue(bool2);
                                    ytw<String> ytwVar3 = x7c0Var2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView5 = composeView4;
                                    String strB = w68.b(composeView5, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView5.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar3).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) x7c0Var2.c1().R).setValue(f78.a(composeView5, R.string.yes_bet, w68.b(composeView5, R.string.yes_btn_cms), null));
                                    ((x5a0) x7c0Var2.c1().S).setValue(f78.a(composeView5, R.string.cancel_bet, w68.b(composeView5, R.string.cancel_btn_cms), null));
                                    ((x5a0) x7c0Var2.m1).setValue(bool2);
                                    x7c0Var2.c1().E1(x7c0Var2.R0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA13 = aVar.A(x7c0Var);
                        Object objY13 = aVar.y();
                        if (zA13 || objY13 == c0042a) {
                            objY13 = new f140(x7c0Var, 1);
                            aVar.r(objY13);
                        }
                        Function1 function12 = (Function1) objY13;
                        boolean zA14 = aVar.A(x7c0Var);
                        Object objY14 = aVar.y();
                        if (zA14 || objY14 == c0042a) {
                            objY14 = new l900(x7c0Var, 1);
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA15 = aVar.A(x7c0Var);
                        Object objY15 = aVar.y();
                        if (zA15 || objY15 == c0042a) {
                            objY15 = new jbc(x7c0Var, 2);
                            aVar.r(objY15);
                        }
                        m6a.a(multiplierResponse, betContainerState, l1zVarE1, zBooleanValue3, z2, zBooleanValue6, t290VarJ1, function2, function3, function0, function4, function5, function6, function7, function8, function9, null, null, zBooleanValue4, zBooleanValue2, zBooleanValue5, function10, function11, function12, function13, (Function0) objY15, oswVar, zBooleanValue7, false, str, n6aVar, zBooleanValue, false, false, false, false, aVar, 0, 100663296, 384, 1074462720, 120);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar12 = this.z;
        if (gviVar12 != null) {
            ComposeView composeView4 = gviVar12.h0;
            composeView4.setViewCompositionStrategy(cVar);
            composeView4.setContent(new op8(-525754758, new Function2() { // from class: r7c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    List listK;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        if (((Boolean) ((x5a0) this.a.c1().k0).getValue()).booleanValue()) {
                            op5 op5Var = op5.a;
                            listK = b.k(new a7a0(op5.c(op5Var, "xmas_snow_1:sg_game_name", "https://s.sporty.net/common/main/res/307efb122ce8d0a153723501a6391382.webp"), 0.16f, 22.0f, ht.a.a), new a7a0(op5.c(op5Var, "xmas_snow_2:sg_game_name", "https://s.sporty.net/common/main/res/910c4f5283c24b2aae4c70c5d733300a.webp"), 0.11f, 18.0f, ht.a.c), new a7a0(op5.c(op5Var, "xmas_snow_3:sg_game_name", "https://s.sporty.net/common/main/res/e7769a815acd8541c8c523168c3dc421.webp"), 0.05f, 12.0f, new n54(0.75f, -1.0f)));
                        } else {
                            listK = m2g.a;
                        }
                        c7a0.a(listK, aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar13 = this.z;
        if (gviVar13 != null) {
            ComposeView composeView5 = gviVar13.d;
            composeView5.setViewCompositionStrategy(cVar);
            composeView5.setContent(new op8(1866992428, new cfc(this, composeView5), true));
        }
        gvi gviVar14 = this.z;
        if (gviVar14 != null) {
            ComposeView composeView6 = gviVar14.i0;
            composeView6.setViewCompositionStrategy(cVar);
            composeView6.setContent(new op8(-1305695669, new vm3(this), true));
        }
    }

    public final void p3(final String str, final String str2, androidx.compose.runtime.a aVar, final int i) {
        final x7c0 x7c0Var;
        x7c0 x7c0Var2 = this;
        androidx.compose.runtime.b bVarI = aVar.i(1864995452);
        int i2 = (bVarI.A(x7c0Var2) ? 256 : 128) | i;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
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
            androidx.compose.ui.d dVarA = s3w.a(j.g(j.c(aVar2, 1.0f), 1.0f), "sj_main_bg");
            String messageType = ((MultiplierResponse) ((x5a0) x7c0Var2.R0().b).getValue()).getMessageType();
            op5 op5Var = op5.a;
            int i3 = ((i2 << 15) & 29360128) | 224256;
            x7c0Var2.o3(null, dVarA, messageType, 10000, ht.a.h, op5.c(op5Var, str, str2), bVarI, i3);
            x7c0 x7c0Var3 = this;
            x7c0Var3.o3(null, s3w.a(j.g(j.c(aVar2, 0.5f), 1.0f), "sj_stars_bg"), ((MultiplierResponse) ((x5a0) R0().b).getValue()).getMessageType(), 30000, ht.a.b, op5.c(op5Var, "stars_png:sg_game_name", ""), bVarI, i3);
            bVarI.X(true);
            x7c0Var = x7c0Var3;
        } else {
            bVarI.G();
            x7c0Var = x7c0Var2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, str2, i) { // from class: p6c0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(55);
                    this.a.p3(this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void q3(final xpf0 xpf0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(907003305);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                xpf0Var = (xpf0) p8i0.a(jq40.a(xpf0.class), w8i0VarA, null, null, w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
            }
            bVarI.Y();
            ytw ytwVarB = n95.b(xpf0Var.b, bVarI);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(1.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            Boolean bool = (Boolean) ytwVarB.getValue();
            bool.getClass();
            boolean zM = bVarI.M(ytwVarB) | bVarI.A(xpf0Var) | bVarI.A(wd0Var);
            Object objY2 = bVarI.y();
            if (zM || objY2 == c0042a) {
                objY2 = new u7c0(xpf0Var, wd0Var, ytwVarB, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, bool, (Function2) objY2);
            boolean zA = bVarI.A(wd0Var) | bVarI.A(xpf0Var);
            Object objY3 = bVarI.y();
            if (zA || objY3 == c0042a) {
                objY3 = new w7c0(wd0Var, xpf0Var, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, wd0Var, (Function2) objY3);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(xpf0Var, i) { // from class: d7c0
                public final /* synthetic */ xpf0 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.q3(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final boolean r3() {
        CampaignParticipateV2 campaignParticipateV2 = this.A2;
        return campaignParticipateV2 != null && campaignParticipateV2.getCanConvert();
    }

    @Override // defpackage.fgb
    public final void h2() {
    }

    @Override // defpackage.fgb
    public final void F2(boolean z) {
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
    }
}
