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
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import bwb.c;
import bwb.d;
import com.sportybet.android.gp.tz.R;
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
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lbwb;", "Lfgb;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "", "forceReplay", "giftResponseReceived", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class bwb extends fgb {
    public final ytw<Boolean> y2 = m.b(Boolean.FALSE);
    public final ytw<Integer> z2 = m.b(null);
    public final ttr A2 = hwr.a(a1s.c, new g(new f()));

    @c0d(c = "com.sportygames.crazyrider.views.CrazyRiderFragment$downloadSpineData$1$1", f = "CrazyRiderFragment.kt", l = {762, 789, 793, 797, 802}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public int c;
        public int d;
        public final /* synthetic */ Context f;

        /* JADX INFO: renamed from: bwb$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.crazyrider.views.CrazyRiderFragment$downloadSpineData$1$1$spineData$1", f = "CrazyRiderFragment.kt", l = {763}, m = "invokeSuspend", v = 1)
        public static final class C0145a extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
            public int a;
            public final /* synthetic */ bwb b;
            public final /* synthetic */ Context c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0145a(bwb bwbVar, Context context, v1b<? super C0145a> v1bVar) {
                super(2, v1bVar);
                this.b = bwbVar;
                this.c = context;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new C0145a(this.b, this.c, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
                return ((C0145a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                String strC = op5.c(op5.a, "bike_and_boy_spine:sg_crazy_rider", "https://s.sporty.net/common/main/res/8e0c98072d5665c0c802fd64cc80b0ac.zip");
                this.a = 1;
                Object objY1 = fq5VarV0.y1(this.c, strC, "bike_and_boy_spine", this);
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
            return bwb.this.new a(this.f, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(6:42|78|43|(1:45)(1:46)|47|(2:61|(1:63)(2:64|60))(4:51|(3:53|(1:55)(1:56)|(1:58))|59|82)) */
        /* JADX WARN: Code duplicated, block: B:27:0x0068 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:33:0x0089 A[Catch: Exception -> 0x0039, TryCatch #1 {Exception -> 0x0039, blocks: (B:28:0x006a, B:31:0x0085, B:33:0x0089, B:35:0x008f, B:39:0x0098, B:13:0x0035, B:17:0x0043, B:20:0x004d, B:23:0x005a), top: B:80:0x0010 }] */
        /* JADX WARN: Code duplicated, block: B:41:0x009e  */
        /* JADX WARN: Code duplicated, block: B:64:0x0109 A[PHI: r2 r12 r13 r16
          0x0109: PHI (r2v3 int) = (r2v4 int), (r2v4 int), (r2v4 int), (r2v11 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0109: PHI (r12v3 int) = (r12v5 int), (r12v6 int), (r12v7 int), (r12v13 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0109: PHI (r13v2 int) = (r13v3 int), (r13v3 int), (r13v3 int), (r13v9 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
          0x0109: PHI (r16v2 int) = (r16v3 int), (r16v4 int), (r16v7 int), (r16v9 int) binds: [B:69:0x012d, B:66:0x011a, B:62:0x0106, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:67:0x011c  */
        /* JADX WARN: Code duplicated, block: B:68:0x011d A[Catch: Exception -> 0x0130, TRY_LEAVE, TryCatch #0 {Exception -> 0x0130, blocks: (B:43:0x00a4, B:45:0x00b2, B:47:0x00b9, B:49:0x00bf, B:51:0x00c5, B:53:0x00dd, B:58:0x00e7, B:61:0x00f8, B:65:0x010c, B:68:0x011d), top: B:78:0x00a4 }] */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x012d, code lost:
        
            if (defpackage.hkd.b(500, r17) == r1) goto L73;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x013f, code lost:
        
            if (defpackage.hkd.b(500, r17) == r1) goto L73;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:72:0x013f -> B:74:0x0142). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 329
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: bwb.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ bwb b;

        public b(View view, bwb bwbVar) {
            this.a = view;
            this.b = bwbVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            bwb bwbVar = this.b;
            ytw<Integer> ytwVar = bwbVar.z2;
            ((x5a0) ytwVar).setValue(Integer.valueOf(this.a.getHeight()));
            Integer num = (Integer) ((x5a0) ytwVar).getValue();
            Float f = (Float) si8.a(num != null ? num.intValue() : 0, bwbVar.getResources().getDisplayMetrics().widthPixels).get("crazy-rider");
            float fFloatValue = f != null ? f.floatValue() : 0.29f;
            gvi gviVar = bwbVar.z;
            ComposeView composeView = gviVar != null ? gviVar.i : null;
            ViewGroup.LayoutParams layoutParams = composeView != null ? composeView.getLayoutParams() : null;
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.S = fFloatValue;
            composeView.setLayoutParams(layoutParams2);
            gvi gviVar2 = bwbVar.z;
            ComposeView composeView2 = gviVar2 != null ? gviVar2.e : null;
            ViewGroup.LayoutParams layoutParams3 = composeView2 != null ? composeView2.getLayoutParams() : null;
            layoutParams3.getClass();
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.S = fFloatValue;
            composeView2.setLayoutParams(layoutParams4);
            gvi gviVar3 = bwbVar.z;
            BlurView blurView = gviVar3 != null ? gviVar3.v : null;
            ViewGroup.LayoutParams layoutParams5 = blurView != null ? blurView.getLayoutParams() : null;
            layoutParams5.getClass();
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.S = fFloatValue;
            blurView.setLayoutParams(layoutParams6);
            gvi gviVar4 = bwbVar.z;
            BlurView blurView2 = gviVar4 != null ? gviVar4.w : null;
            ViewGroup.LayoutParams layoutParams7 = blurView2 != null ? blurView2.getLayoutParams() : null;
            layoutParams7.getClass();
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.S = fFloatValue;
            blurView2.setLayoutParams(layoutParams8);
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
            bwb bwbVar = bwb.this;
            if (!((Boolean) ((x5a0) bwbVar.d1).getValue()).booleanValue()) {
                ((x5a0) bwbVar.c1().H).setValue(str2);
                ((x5a0) bwbVar.c1().K).setValue(j58Var2);
                ((x5a0) bwbVar.c1().L).setValue(new j58(j58.f));
                ((x5a0) bwbVar.c1().Q).setValue(2000);
                ((x5a0) bwbVar.c1().O).setValue(Boolean.TRUE);
                fgb.a3(bwbVar);
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
            bwb bwbVar = bwb.this;
            if (!((Boolean) ((x5a0) bwbVar.d1).getValue()).booleanValue()) {
                ((x5a0) bwbVar.c1().H).setValue(str2);
                ((x5a0) bwbVar.c1().K).setValue(j58Var2);
                ((x5a0) bwbVar.c1().L).setValue(new j58(j58.f));
                ((x5a0) bwbVar.c1().Q).setValue(2000);
                ((x5a0) bwbVar.c1().O).setValue(Boolean.TRUE);
                fgb.a3(bwbVar);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.crazyrider.views.CrazyRiderFragment$onViewCreated$7$1$1$1", f = "CrazyRiderFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return bwb.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bwb bwbVar = bwb.this;
            ytw<Boolean> ytwVar = bwbVar.i0;
            String messageType = ((MultiplierResponse) ((x5a0) bwbVar.R0().b).getValue()).getMessageType();
            if (Intrinsics.g(messageType, "ROUND_WAITING")) {
                if (((Boolean) ((x5a0) bwbVar.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() && !bwbVar.l0) {
                    ypa0 ypa0VarL1 = bwbVar.l1();
                    String string = bwbVar.getString(R.string.powering_up_sound);
                    string.getClass();
                    ypa0VarL1.A1(0L, string);
                }
            } else if (Intrinsics.g(messageType, "ROUND_PRE_START")) {
                if (((Boolean) ((x5a0) bwbVar.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() && !bwbVar.l0) {
                    ypa0 ypa0VarL2 = bwbVar.l1();
                    String string2 = bwbVar.getString(R.string.cr_bike_horn_sound);
                    string2.getClass();
                    ypa0VarL2.A1(0L, string2);
                }
                if (((Boolean) ((x5a0) bwbVar.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue() && !bwbVar.l0) {
                    ypa0 ypa0VarL3 = bwbVar.l1();
                    String string3 = bwbVar.getString(R.string.cr_bike_rev_sound);
                    string3.getClass();
                    ypa0VarL3.A1(0L, string3);
                }
            }
            return Unit.a;
        }
    }

    public static final class f implements Function0<Fragment> {
        public f() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return bwb.this;
        }
    }

    public static final class g implements Function0<cwb> {
        public final /* synthetic */ f b;

        public g(f fVar) {
            this.b = fVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [cwb, j8i0] */
        @Override // kotlin.jvm.functions.Function0
        public final cwb invoke() {
            v8i0 viewModelStore = bwb.this.getViewModelStore();
            bwb bwbVar = bwb.this;
            cyb defaultViewModelCreationExtras = bwbVar.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(cwb.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(bwbVar), null);
        }
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("CRAZY_RIDER_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("CRAZY_RIDER_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_crazy_rider);
            string.getClass();
            progressMeterComponent.setSoundManager("CRAZY_RIDER/", string, boolValueOf, boolValueOf2, rk60.b.F, this.i, context);
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
                j = new vq5().l1;
            } else if (houseCoefficient <= 4.9d) {
                j = new vq5().m1;
            } else if (houseCoefficient <= 9.9d) {
                j = new vq5().n1;
            } else {
                j = houseCoefficient <= 18.9d ? new vq5().o1 : new vq5().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j);
            Y0().x1(coefficients);
            return;
        }
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
        double houseCoefficient2 = coefficients.getHouseCoefficient();
        if (houseCoefficient2 <= 1.5d) {
            j2 = new vq5().l1;
        } else if (houseCoefficient2 <= 4.9d) {
            j2 = new vq5().m1;
        } else if (houseCoefficient2 <= 9.9d) {
            j2 = new vq5().n1;
        } else {
            j2 = houseCoefficient2 <= 18.9d ? new vq5().o1 : new vq5().p1;
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
                j = new vq5().l1;
            } else if (houseCoefficient <= 4.9d) {
                j = new vq5().m1;
            } else if (houseCoefficient <= 9.9d) {
                j = new vq5().n1;
            } else {
                j = houseCoefficient <= 18.9d ? new vq5().o1 : new vq5().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j);
        }
        Y0().B1(previousMultiplierResponse);
    }

    @Override // defpackage.fgb
    public final void F2(boolean z) {
        if (z) {
            wwd0 wwd0Var = n3().b;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return;
        }
        wwd0 wwd0Var2 = n3().b;
        if (((Boolean) wwd0Var2.getValue()).booleanValue()) {
            wwd0Var2.k(null, Boolean.FALSE);
        }
    }

    @Override // defpackage.fgb
    public final void I0() {
        ((Boolean) n3().a.getValue()).getClass();
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
        String string = getString(R.string.crazy_rider_id);
        string.getClass();
        rk60.b bVar = rk60.b.F;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        String string2 = getString(R.string.bg_music);
        string2.getClass();
        progressMeterComponent.J("crazy-rider", string, bool, bVar, gameDetails, context, ypa0VarL1, bool, string2);
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
        String string = getString(R.string.crazy_rider_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.F;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_valentine);
        string2.getClass();
        progressMeterComponent.J("crazy-rider", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void g2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.crazy_rider_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.F;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_christmas);
        string2.getClass();
        progressMeterComponent.J("crazy-rider", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    public final cwb n3() {
        return (cwb) this.A2.getValue();
    }

    public final void o3(BlurView blurView, ConstraintLayout constraintLayout) {
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
            long j = j58.l;
            ha20VarB.b(r58.l(j));
            ha20VarB.l = new ColorDrawable(r58.l(j));
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((x5a0) c1().i0).setValue(Boolean.FALSE);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.t0) {
            return;
        }
        ((x5a0) c1().a0).setValue(Boolean.FALSE);
        ytw<Boolean> ytwVar = c1().Y;
        Boolean bool = Boolean.TRUE;
        ((x5a0) ytwVar).setValue(bool);
        wwd0 wwd0Var = n3().b;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        gvi gviVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setGameName("crazy_rider");
        op5.a.getClass();
        op5.c = "sg_crazy_rider";
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = m.b("crazy-rider");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2("sg_crazy_rider", "games/crazy-rider/v1/game");
        if (Build.VERSION.SDK_INT <= 24 && (gviVar = this.z) != null) {
            gviVar.F.setLayerType(1, null);
        }
        goj gojVarC2 = c1();
        osw oswVarA = k.a(R.string.crazy_rider_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = m.b("CRAZY RIDER");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = m.b("crazy-rider");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = m.b("Crazy Rider");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.cr_toggle_on_color;
        c1().G = R.color.cr_toggle_off_color;
        qry.a(view, new b(view, this));
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"CRAZY_RIDER_MUSIC", "CRAZY_RIDER_SOUND", "CRAZY_RIDER_ONE_TAP", "CRAZY_RIDER_THEME"});
        }
        SharedPreferences sharedPreferences = this.H;
        int i = 0;
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
            composeView.setContent(new op8(-2086483332, new Function2() { // from class: dvb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ytw<MultiplierResponse> ytwVar;
                    MultiplierResponse multiplierResponse;
                    String currentMultiplier;
                    Double dH;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bwb bwbVar = this.a;
                        gvi gviVar3 = bwbVar.z;
                        if (gviVar3 != null) {
                            gviVar3.v0.setVisibility(0);
                        }
                        ytw ytwVarC = wyh.c(bwbVar.n3().c, aVar, 0, 7);
                        Integer num = (Integer) ((x5a0) bwbVar.z2).getValue();
                        if (num == null) {
                            aVar.N(-1657959596);
                        } else {
                            aVar.N(-1657959595);
                            int iIntValue2 = num.intValue();
                            ul2 ul2VarR0 = bwbVar.R0();
                            mt1.b((ul2VarR0 == null || (ytwVar = ul2VarR0.b) == null || (multiplierResponse = (MultiplierResponse) ((x5a0) ytwVar).getValue()) == null || (currentMultiplier = multiplierResponse.getCurrentMultiplier()) == null || (dH = b.h(currentMultiplier)) == null) ? 0.0d : dH.doubleValue(), ((Boolean) ytwVarC.getValue()).booleanValue() ? "ROUND_WAITING" : ((MultiplierResponse) ((x5a0) bwbVar.R0().b).getValue()).getMessageType(), bwbVar.c1(), iIntValue2, bwbVar.b1(), aVar, 6);
                        }
                        aVar.H();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar3 = this.z;
        ViewGroup.LayoutParams layoutParams = gviVar3 != null ? gviVar3.W.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 1.0f;
        layoutParams2.i = 0;
        layoutParams2.j = -1;
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.W.setLayoutParams(layoutParams2);
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            ComposeView composeView2 = gviVar5.W;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(1501887358, new mvb(this), true));
        }
        gvi gviVar6 = this.z;
        if (gviVar6 != null) {
            ComposeView composeView3 = gviVar6.P;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(-998894593, new Function2() { // from class: vvb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        bwb bwbVar = this.a;
                        Integer num = (Integer) ((x5a0) bwbVar.z2).getValue();
                        ytw ytwVarC = wyh.c(bwbVar.n3().c, aVar, 0, 7);
                        if (((Boolean) ((x5a0) bwbVar.i0).getValue()).booleanValue()) {
                            aVar.N(2134978515);
                            if (num == null) {
                                aVar.N(1759824526);
                            } else {
                                aVar.N(1759824527);
                                ihn.a(num.intValue(), bwbVar.n3(), ((Boolean) ytwVarC.getValue()).booleanValue(), Intrinsics.g(((MultiplierResponse) ((x5a0) bwbVar.R0().b).getValue()).getMessageType(), "ROUND_END_WAIT"), aVar, 0);
                            }
                            aVar.H();
                        } else {
                            aVar.N(1749921763);
                        }
                        aVar.H();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar7 = this.z;
        ViewGroup.LayoutParams layoutParams3 = gviVar7 != null ? gviVar7.V.getLayoutParams() : null;
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams4.S = 1.0f;
        gvi gviVar8 = this.z;
        if (gviVar8 != null) {
            gviVar8.V.setLayoutParams(layoutParams4);
        }
        wvb wvbVar = new wvb(this, i);
        xvb xvbVar = new xvb(this, i);
        this.J1 = wvbVar;
        this.K1 = xvbVar;
        gvi gviVar9 = this.z;
        ConstraintLayout constraintLayout = gviVar9 != null ? gviVar9.y : null;
        if (gviVar9 != null) {
            o3(gviVar9.v, constraintLayout);
        }
        gvi gviVar10 = this.z;
        if (gviVar10 != null) {
            o3(gviVar10.w, constraintLayout);
        }
        gvi gviVar11 = this.z;
        if (gviVar11 != null) {
            gviVar11.v.setVisibility(0);
        }
        gvi gviVar12 = this.z;
        if (gviVar12 != null) {
            gviVar12.w.setVisibility(0);
        }
        gvi gviVar13 = this.z;
        if (gviVar13 != null) {
            final ComposeView composeView4 = gviVar13.i;
            composeView4.setViewCompositionStrategy(cVar);
            composeView4.setContent(new op8(-1705491199, new Function2() { // from class: yvb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 1;
                    int i3 = 0;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final bwb bwbVar = this.a;
                        final BetContainerState betContainerState = (BetContainerState) wyh.c(bwbVar.R0().a, aVar, 0, 7).getValue();
                        BetContainerState betContainerState2 = (BetContainerState) wyh.c(bwbVar.S0().a, aVar, 0, 7).getValue();
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
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) bwbVar.R0().d).getValue()).get(Long.valueOf(betContainerState.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        ytw<Boolean> ytwVar = bwbVar.f1().e;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) bwbVar.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) bwbVar.c1().e0).getValue(), (cj5) ((x5a0) bwbVar.c1().f0).getValue());
                        Integer num = (Integer) ((x5a0) bwbVar.z2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) bwbVar.R0().b).getValue();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) bwbVar.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) bwbVar.y2).getValue()).booleanValue();
                        int i4 = iIntValue2;
                        boolean resetChips = betContainerState.getResetChips();
                        t290 t290VarJ1 = bwbVar.j1();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) bwbVar.c1().v).getValue();
                        boolean z = egb.a(betContainerState2) > 0;
                        l1z l1zVarE1 = bwbVar.e1();
                        osw oswVar = bwbVar.R0().M;
                        boolean zA = aVar.A(bwbVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new awb(bwbVar, i3);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(bwbVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new w28(bwbVar, i2);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(bwbVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new qub(bwbVar, 0);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(bwbVar);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new rub(bwbVar, 0);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(bwbVar);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new sub(bwbVar, 0);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(bwbVar) | aVar.A(betContainerState);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new Function1() { // from class: tub
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                    bwb bwbVar2 = bwbVar;
                                    bwbVar2.S0().S1(true);
                                    ytw<Boolean> ytwVar2 = bwbVar2.j1;
                                    Boolean bool2 = Boolean.FALSE;
                                    x5a0 x5a0Var = (x5a0) ytwVar2;
                                    x5a0Var.setValue(bool2);
                                    BetContainerState betContainerState3 = betContainerState;
                                    if (zBooleanValue5) {
                                        bwbVar2.p1 = 1;
                                        bwbVar2.R0().P1(1);
                                        bwbVar2.R0().Q1(-1);
                                        Boolean bool3 = Boolean.TRUE;
                                        x5a0Var.setValue(bool3);
                                        ((u5a0) bwbVar2.n1).k(15);
                                        bwbVar2.R0().M1(!betContainerState3.getExtraKey());
                                        bwbVar2.R0().R1(true);
                                        bwbVar2.R0().S1(false);
                                        ((x5a0) bwbVar2.R0().c).setValue(bool3);
                                    } else {
                                        x5a0Var.setValue(bool2);
                                        bwbVar2.R0().R1(false);
                                        bwbVar2.R0().Q1(-1);
                                        bwbVar2.R0().M1(!betContainerState3.getExtraKey());
                                        ((x5a0) bwbVar2.R0().c).setValue(bool2);
                                    }
                                    bwbVar2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(bwbVar) | aVar.A(betContainerState);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: uub
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    bwb bwbVar2 = bwbVar;
                                    ((x5a0) bwbVar2.c1().J).setValue(betData);
                                    ((BetContainerState) bwbVar2.R0().a.getValue()).setBetData(betData);
                                    int i5 = 0;
                                    if (zBooleanValue5) {
                                        bwbVar2.S0().S1(true);
                                        bwbVar2.R0().G1(true);
                                        if (!betContainerState.getBetPlaced()) {
                                            if (bwbVar2.j0) {
                                                ((BetContainerState) bwbVar2.R0().a.getValue()).setBetData(betData);
                                                goj.A1(bwbVar2.c1(), betData, bwbVar2.z0, bwbVar2.U0, bwbVar2.h2, 0, "MANUAL", new f68(bwbVar2), new pvb(bwbVar2, i5), null, null, null, 1792);
                                            } else {
                                                bwbVar2.p0(bwbVar2.R0(), betData, null);
                                            }
                                        }
                                    } else {
                                        bwbVar2.R0().G1(false);
                                    }
                                    bwbVar2.S0().S1(true);
                                    bwbVar2.S0().P1(0);
                                    ((x5a0) bwbVar2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(bwbVar);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new Function1() { // from class: vub
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ((Boolean) obj3).getClass();
                                    bwb bwbVar2 = bwbVar;
                                    bwbVar2.S0().S1(true);
                                    x5a0 x5a0Var = (x5a0) bwbVar2.j1;
                                    x5a0Var.setValue(Boolean.FALSE);
                                    bwbVar2.p1 = 1;
                                    ((u5a0) bwbVar2.n1).k(2);
                                    bwbVar2.R0().Q1(-1);
                                    x5a0Var.setValue(Boolean.TRUE);
                                    bwbVar2.R0().P1(2);
                                    bwbVar2.R0().R1(true);
                                    bwbVar2.R0().S1(false);
                                    bwbVar2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(bwbVar);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new i13(bwbVar, 1);
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(bwbVar);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = bwbVar.new c();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(bwbVar);
                        final ComposeView composeView5 = composeView4;
                        boolean zA12 = zA11 | aVar.A(composeView5);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: wub
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    bwb bwbVar2 = bwbVar;
                                    ((x5a0) bwbVar2.c1().J).setValue(betData);
                                    ((BetContainerState) bwbVar2.R0().a.getValue()).setBetData(betData);
                                    ((x5a0) bwbVar2.c1().T).setValue(Boolean.TRUE);
                                    ytw<String> ytwVar2 = bwbVar2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView6 = composeView5;
                                    String strB = w68.b(composeView6, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView6.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) bwbVar2.c1().R).setValue(f78.a(composeView6, R.string.yes_bet, w68.b(composeView6, R.string.yes_btn_cms), null));
                                    ((x5a0) bwbVar2.c1().S).setValue(f78.a(composeView6, R.string.cancel_bet, w68.b(composeView6, R.string.cancel_btn_cms), null));
                                    bwbVar2.H1();
                                    bwbVar2.c1().E1(bwbVar2.R0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(bwbVar);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new nub(bwbVar, 0);
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(bwbVar);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new Function0() { // from class: oub
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(bwbVar.z1());
                                }
                            };
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(bwbVar);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new Function0() { // from class: pub
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    bwbVar.V1();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA16 = aVar.A(bwbVar);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new v28(bwbVar, 1);
                            aVar.r(objY15);
                        }
                        x2a.a(i4, sl2Var, betContainerState, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str, function12, function13, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar14 = this.z;
        if (gviVar14 != null) {
            final ComposeView composeView5 = gviVar14.e;
            composeView5.setViewCompositionStrategy(cVar);
            composeView5.setContent(new op8(1348682511, new Function2() { // from class: zvb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final bwb bwbVar = this.a;
                        BetContainerState betContainerState = (BetContainerState) wyh.c(bwbVar.R0().a, aVar, 0, 7).getValue();
                        final BetContainerState betContainerState2 = (BetContainerState) wyh.c(bwbVar.S0().a, aVar, 0, 7).getValue();
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.l, zk40.a);
                        aiv aivVarC = g75.c(ht.a.e, false);
                        int iHashCode = Long.hashCode(aVar.m());
                        ne00 ne00VarO = aVar.o();
                        d dVarC = androidx.compose.ui.c.c(aVar, dVarB);
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
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) bwbVar.S0().d).getValue()).get(Long.valueOf(betContainerState2.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        ytw<Boolean> ytwVar = bwbVar.f1().e;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) bwbVar.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) bwbVar.c1().e0).getValue(), (cj5) ((x5a0) bwbVar.c1().f0).getValue());
                        Integer num = (Integer) ((x5a0) bwbVar.z2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) bwbVar.S0().b).getValue();
                        t290 t290VarJ1 = bwbVar.j1();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) bwbVar.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) bwbVar.y2).getValue()).booleanValue();
                        int i3 = iIntValue2;
                        boolean resetChips = betContainerState2.getResetChips();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) bwbVar.c1().v).getValue();
                        boolean z = egb.a(betContainerState) > 0;
                        l1z l1zVarE1 = bwbVar.e1();
                        osw oswVar = bwbVar.S0().M;
                        boolean zA = aVar.A(bwbVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new k38(bwbVar, i2);
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(bwbVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new Function1() { // from class: cvb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    z83 z83Var = (z83) obj3;
                                    z83Var.getClass();
                                    bwb bwbVar2 = bwbVar;
                                    bwbVar2.r2(z83Var, bwbVar2.S0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(bwbVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new evb(bwbVar, 0);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(bwbVar);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new s48(bwbVar, 1);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(bwbVar);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new fvb(bwbVar, 0);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(bwbVar) | aVar.A(betContainerState2);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new gvb(0, bwbVar, betContainerState2);
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(bwbVar) | aVar.A(betContainerState2);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: hvb
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    bwb bwbVar2 = bwbVar;
                                    ((x5a0) bwbVar2.c1().J).setValue(betData);
                                    int i4 = 0;
                                    if (zBooleanValue5) {
                                        bwbVar2.S0().G1(true);
                                        if (!betContainerState2.getBetPlaced()) {
                                            if (bwbVar2.j0) {
                                                ((BetContainerState) bwbVar2.S0().a.getValue()).setBetData(betData);
                                                goj.A1(bwbVar2.c1(), betData, bwbVar2.z0, bwbVar2.U0, bwbVar2.h2, 1, "MANUAL", new a23(bwbVar2), new lvb(bwbVar2, i4), null, null, null, 1792);
                                            } else {
                                                bwbVar2.p0(bwbVar2.S0(), betData, null);
                                            }
                                        }
                                    } else {
                                        bwbVar2.S0().G1(false);
                                    }
                                    bwbVar2.R0().S1(true);
                                    bwbVar2.R0().P1(0);
                                    ((x5a0) bwbVar2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(bwbVar);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new ivb(bwbVar, 0);
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(bwbVar);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new jvb(bwbVar, 0);
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(bwbVar);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = bwbVar.new d();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(bwbVar);
                        final ComposeView composeView6 = composeView5;
                        boolean zA12 = zA11 | aVar.A(composeView6);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: kvb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    bwb bwbVar2 = bwbVar;
                                    ((x5a0) bwbVar2.c1().T).setValue(Boolean.TRUE);
                                    ((x5a0) bwbVar2.c1().J).setValue(betData);
                                    ((BetContainerState) bwbVar2.S0().a.getValue()).setBetData(betData);
                                    ytw<String> ytwVar2 = bwbVar2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView7 = composeView6;
                                    String strB = w68.b(composeView7, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView7.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) bwbVar2.c1().R).setValue(f78.a(composeView7, R.string.yes_bet, w68.b(composeView7, R.string.yes_btn_cms), null));
                                    ((x5a0) bwbVar2.c1().S).setValue(f78.a(composeView7, R.string.cancel_bet, w68.b(composeView7, R.string.cancel_btn_cms), null));
                                    bwbVar2.H1();
                                    bwbVar2.c1().E1(bwbVar2.S0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(bwbVar);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new yub(bwbVar, 0);
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(bwbVar);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new zub(bwbVar, 0);
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(bwbVar);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new avb(bwbVar, 0);
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA16 = aVar.A(bwbVar);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new Function1() { // from class: bvb
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    bwb bwbVar2 = bwbVar;
                                    bwbVar2.e3(bwbVar2.S0(), betData);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY15);
                        }
                        x2a.a(i3, sl2Var, betContainerState2, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str, function12, function13, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    @Override // defpackage.fgb
    public final void e2() {
    }

    @Override // defpackage.fgb
    public final void h2() {
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
    }
}
