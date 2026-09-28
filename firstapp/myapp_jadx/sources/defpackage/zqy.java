package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.runtime.k;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import com.sportygames.crashInitiated.model.response.GameAvailableResponse;
import com.sportygames.crashInitiated.model.response.UserValidateResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lzqy;", "Lenb;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zqy extends enb {

    public static final class a implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ zqy b;

        public a(View view, zqy zqyVar) {
            this.a = view;
            this.b = zqyVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zqy zqyVar = this.b;
            ytw<Integer> ytwVar = zqyVar.z0;
            ((x5a0) ytwVar).setValue(Integer.valueOf(this.a.getHeight()));
            hvi hviVar = zqyVar.a;
            ViewGroup.LayoutParams layoutParams = hviVar != null ? hviVar.c.getLayoutParams() : null;
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            Integer num = (Integer) ((x5a0) ytwVar).getValue();
            float fIntValue = (num != null ? num.intValue() : 0) / zqyVar.getResources().getDisplayMetrics().widthPixels;
            float f = 0.298f;
            if (fIntValue < 2.2f && fIntValue < 2.0f) {
                if (fIntValue >= 1.89f) {
                    f = 0.305f;
                } else {
                    f = 0.30625f;
                    if (fIntValue < 1.8f && fIntValue < 1.7f) {
                        f = fIntValue >= 1.5f ? 0.36f : 0.32f;
                    }
                }
            }
            layoutParams2.S = f;
            layoutParams2.i = -1;
            layoutParams2.j = -1;
            layoutParams2.l = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = zqyVar.getResources().getDimensionPixelSize(R.dimen._6sdp);
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = zqyVar.getResources().getDimensionPixelSize(R.dimen._6sdp);
            hvi hviVar2 = zqyVar.a;
            if (hviVar2 != null) {
                hviVar2.c.setLayoutParams(layoutParams2);
            }
            hvi hviVar3 = zqyVar.a;
            if (hviVar3 != null) {
                ComposeView composeView = hviVar3.c;
                composeView.setViewCompositionStrategy(u6i0.c.a);
                composeView.setContent(new op8(1738885749, zqyVar.new c(composeView), true));
            }
        }
    }

    public static final class b implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public b() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            File file;
            File file2;
            File file3;
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                zqy zqyVar = zqy.this;
                zqyVar.n0(R.color.sb_black_100, 0, aVar2);
                androidx.compose.ui.d dVarB = androidx.compose.foundation.a.b(j.g(androidx.compose.ui.d.a.b, 1.0f), j58.l, zk40.a);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(aVar2.m());
                ne00 ne00VarO = aVar2.o();
                androidx.compose.ui.d dVarC = androidx.compose.ui.c.c(aVar2, dVarB);
                yka.k.getClass();
                tsr.a aVar3 = yka.a.b;
                if (aVar2.k() == null) {
                    l2a.b();
                    throw null;
                }
                aVar2.D();
                if (aVar2.g()) {
                    aVar2.F(aVar3);
                } else {
                    aVar2.p();
                }
                hlh0.a(aVar2, aivVarC, yka.a.f);
                hlh0.a(aVar2, ne00VarO, yka.a.e);
                yka.a.C1350a c1350a = yka.a.g;
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                    j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                if (((x5a0) zqyVar.p0().w).getValue() == null || (file = (File) ((x5a0) zqyVar.p0().w).getValue()) == null || !file.exists() || ((x5a0) zqyVar.p0().y).getValue() == null || (file2 = (File) ((x5a0) zqyVar.p0().y).getValue()) == null || !file2.exists() || ((x5a0) zqyVar.p0().z).getValue() == null || (file3 = (File) ((x5a0) zqyVar.p0().z).getValue()) == null || !file3.exists()) {
                    aVar2.N(506894770);
                } else {
                    aVar2.N(514974238);
                    boolean zBooleanValue = ((Boolean) ((x5a0) zqyVar.p0().e).getValue()).booleanValue();
                    File file4 = (File) ((x5a0) zqyVar.p0().w).getValue();
                    File file5 = (File) ((x5a0) zqyVar.p0().y).getValue();
                    String str = (String) ((x5a0) zqyVar.p0().V).getValue();
                    double dDoubleValue = ((Number) ((x5a0) zqyVar.p0().U).getValue()).doubleValue();
                    double dDoubleValue2 = ((Number) ((x5a0) zqyVar.p0().T).getValue()).doubleValue();
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) zqyVar.p0().g0).getValue()).booleanValue();
                    int iIntValue2 = 0;
                    mz1 mz1VarT0 = zqyVar.t0();
                    Integer num2 = (Integer) ((x5a0) zqyVar.z0).getValue();
                    if (num2 != null) {
                        iIntValue2 = num2.intValue();
                    }
                    qow.b(zBooleanValue, file4, file5, str, dDoubleValue, dDoubleValue2, zBooleanValue2, mz1VarT0, iIntValue2, ((Boolean) ((x5a0) zqyVar.R).getValue()).booleanValue(), aVar2, 0);
                }
                aVar2.H();
                aVar2.s();
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final class c implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ ComposeView b;

        public c(ComposeView composeView) {
            this.b = composeView;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2;
            androidx.compose.runtime.a aVar3 = aVar;
            int iIntValue = num.intValue();
            if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                zqy zqyVar = zqy.this;
                if (((DetailResponse) ((x5a0) zqyVar.p0().d0).getValue()).getDefaultAmount() > 0.0d) {
                    aVar3.N(1545350056);
                    Integer num2 = (Integer) ((x5a0) zqyVar.z0).getValue();
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    ytw<HashMap<Double, Double>> ytwVar = zqyVar.k0;
                    HashMap map = ytwVar != null ? (HashMap) ((x5a0) ytwVar).getValue() : null;
                    DetailResponse detailResponse = (DetailResponse) ((x5a0) zqyVar.p0().d0).getValue();
                    boolean zBooleanValue = ((Boolean) ((x5a0) zqyVar.u0().T).getValue()).booleanValue();
                    String strValueOf = String.valueOf(((DetailResponse) ((x5a0) zqyVar.p0().d0).getValue()).getDefaultAmount());
                    String str = (String) ((x5a0) zqyVar.p0().f0).getValue();
                    HashMap map2 = map;
                    tl2 tl2VarP0 = zqyVar.p0();
                    boolean zBooleanValue2 = ((Boolean) ((x5a0) zqyVar.e0).getValue()).booleanValue();
                    mz1 mz1VarT0 = zqyVar.t0();
                    int iIntValue3 = ((Number) ((x5a0) zqyVar.p0().P).getValue()).intValue();
                    int iIntValue4 = ((Number) ((x5a0) zqyVar.p0().K).getValue()).intValue();
                    boolean zBooleanValue3 = ((Boolean) ((x5a0) zqyVar.p0().N).getValue()).booleanValue();
                    boolean zBooleanValue4 = ((Boolean) ((x5a0) zqyVar.p0().W).getValue()).booleanValue();
                    cj5 cj5VarR0 = zqyVar.r0();
                    boolean zA = aVar3.A(zqyVar);
                    Object objY = aVar3.y();
                    androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new cry(zqyVar);
                        aVar3.r(objY);
                    }
                    Function1 function1 = (Function1) objY;
                    boolean zA2 = aVar3.A(zqyVar);
                    Object objY2 = aVar3.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new hry(zqyVar);
                        aVar3.r(objY2);
                    }
                    Function1 function2 = (Function1) objY2;
                    boolean zA3 = aVar3.A(zqyVar);
                    ComposeView composeView = this.b;
                    boolean zA4 = zA3 | aVar3.A(composeView);
                    Object objY3 = aVar3.y();
                    if (zA4 || objY3 == c0042a) {
                        objY3 = new iry(zqyVar, composeView);
                        aVar3.r(objY3);
                    }
                    Function1 function3 = (Function1) objY3;
                    boolean zA5 = aVar3.A(zqyVar);
                    Object objY4 = aVar3.y();
                    if (zA5 || objY4 == c0042a) {
                        objY4 = new jry(zqyVar);
                        aVar3.r(objY4);
                    }
                    Function2 function4 = (Function2) objY4;
                    boolean zA6 = aVar3.A(zqyVar);
                    Object objY5 = aVar3.y();
                    if (zA6 || objY5 == c0042a) {
                        objY5 = new kry(zqyVar);
                        aVar3.r(objY5);
                    }
                    Function2 function5 = (Function2) objY5;
                    boolean zA7 = aVar3.A(zqyVar);
                    Object objY6 = aVar3.y();
                    if (zA7 || objY6 == c0042a) {
                        objY6 = new lry(zqyVar);
                        aVar3.r(objY6);
                    }
                    Function1 function6 = (Function1) objY6;
                    boolean zA8 = aVar3.A(zqyVar);
                    Object objY7 = aVar3.y();
                    if (zA8 || objY7 == c0042a) {
                        objY7 = new mry(zqyVar);
                        aVar3.r(objY7);
                    }
                    Function1 function7 = (Function1) objY7;
                    boolean zA9 = aVar3.A(zqyVar);
                    Object objY8 = aVar3.y();
                    if (zA9 || objY8 == c0042a) {
                        objY8 = new nry(zqyVar);
                        aVar3.r(objY8);
                    }
                    Function0 function0 = (Function0) objY8;
                    boolean zA10 = aVar3.A(zqyVar);
                    Object objY9 = aVar3.y();
                    if (zA10 || objY9 == c0042a) {
                        objY9 = new ory(zqyVar);
                        aVar3.r(objY9);
                    }
                    Function0 function8 = (Function0) objY9;
                    boolean zA11 = aVar3.A(zqyVar);
                    Object objY10 = aVar3.y();
                    if (zA11 || objY10 == c0042a) {
                        objY10 = new dry(zqyVar);
                        aVar3.r(objY10);
                    }
                    Function0 function9 = (Function0) objY10;
                    boolean zA12 = aVar3.A(zqyVar);
                    Object objY11 = aVar3.y();
                    if (zA12 || objY11 == c0042a) {
                        objY11 = new ery(zqyVar);
                        aVar3.r(objY11);
                    }
                    Function0 function10 = (Function0) objY11;
                    boolean zA13 = aVar3.A(zqyVar);
                    Object objY12 = aVar3.y();
                    if (zA13 || objY12 == c0042a) {
                        objY12 = new fry(zqyVar);
                        aVar3.r(objY12);
                    }
                    Function0 function11 = (Function0) objY12;
                    boolean zA14 = aVar3.A(zqyVar);
                    Object objY13 = aVar3.y();
                    if (zA14 || objY13 == c0042a) {
                        objY13 = new gry(zqyVar);
                        aVar3.r(objY13);
                    }
                    x5a.e(iIntValue2, map2, detailResponse, tl2VarP0, zBooleanValue, "2X", strValueOf, str, true, function1, function2, function3, mz1VarT0, zBooleanValue4, iIntValue4, iIntValue3, zBooleanValue3, zBooleanValue2, function4, function5, function6, function7, function0, function8, function9, function10, function11, (Function0) objY13, cj5VarR0, aVar3, 806879616);
                    aVar2 = aVar3;
                } else {
                    aVar2 = aVar3;
                    aVar2.N(1534019277);
                }
                aVar2.H();
            } else {
                aVar3.G();
            }
            return Unit.a;
        }
    }

    public static final class d implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ zqy b;
        public final /* synthetic */ ComposeView c;

        public d(View view, zqy zqyVar, ComposeView composeView) {
            this.a = view;
            this.b = zqyVar;
            this.c = composeView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            zqy zqyVar = this.b;
            ytw<Integer> ytwVar = zqyVar.z0;
            ((x5a0) ytwVar).setValue(Integer.valueOf(this.a.getHeight()));
            Integer num = (Integer) ((x5a0) ytwVar).getValue();
            float fIntValue = (num != null ? num.intValue() : 0) / this.c.getResources().getDisplayMetrics().widthPixels;
            float f = 0.298f;
            if (fIntValue < 2.2f && fIntValue < 2.0f) {
                if (fIntValue >= 1.89f) {
                    f = 0.305f;
                } else {
                    f = 0.30625f;
                    if (fIntValue < 1.8f && fIntValue < 1.7f) {
                        f = fIntValue >= 1.5f ? 0.36f : 0.32f;
                    }
                }
            }
            hvi hviVar = zqyVar.a;
            ViewGroup.LayoutParams layoutParams = hviVar != null ? hviVar.C.getLayoutParams() : null;
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.S = 1.0f - f;
            layoutParams2.i = 0;
            layoutParams2.j = -1;
            hvi hviVar2 = zqyVar.a;
            if (hviVar2 != null) {
                hviVar2.C.setLayoutParams(layoutParams2);
            }
            hvi hviVar3 = zqyVar.a;
            if (hviVar3 != null) {
                ComposeView composeView = hviVar3.C;
                composeView.setViewCompositionStrategy(u6i0.c.a);
                composeView.setContent(new op8(-699224458, zqyVar.new b(), true));
            }
        }
    }

    @Override // defpackage.enb
    public final void I0() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("ONE_PUNCH_ONE_SOUND", true)) {
            return;
        }
        ypa0 ypa0VarV0 = v0();
        String string = getString(R.string.sfx_auto_bet_on);
        string.getClass();
        ypa0VarV0.A1(0L, string);
    }

    @Override // defpackage.enb
    public final void J0() {
        Context context;
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("ONE_PUNCH_ONE_SOUND", true) || (context = getContext()) == null) {
            return;
        }
        ypa0 ypa0VarV0 = v0();
        String string = context.getString(R.string.sfx_boxer_punch);
        string.getClass();
        ypa0VarV0.A1(0L, string);
    }

    @Override // defpackage.enb
    public final void L0() {
        hvi hviVar;
        SharedPreferences sharedPreferences = this.b;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("ONE_PUNCH_ONE_MUSIC", true)) : null;
        Context context = getContext();
        if (context == null || (hviVar = this.a) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = hviVar.E;
        String string = getString(R.string.one_punch_id);
        string.getClass();
        rk60.b bVar = rk60.b.E;
        GameDetails gameDetails = this.G;
        ypa0 ypa0VarV0 = v0();
        String string2 = getString(R.string.bg_music);
        string2.getClass();
        progressMeterComponent.I("one-punch", string, boolValueOf, bVar, gameDetails, context, ypa0VarV0, boolValueOf, string2);
    }

    @Override // defpackage.enb
    public final void M0() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("ONE_PUNCH_ONE_SOUND", true)) {
            return;
        }
        ypa0 ypa0VarV0 = v0();
        String string = getString(R.string.sfx_place_bet);
        string.getClass();
        ypa0VarV0.A1(0L, string);
    }

    public final void V0(final androidx.compose.ui.d dVar, final Object obj, final boolean z, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        e eVarZ;
        Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> k77Var;
        dVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-855590032);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        d0b.a.C0470a c0470a = d0b.a.a;
        if (i3 == 0) {
            i2 |= bVarI.M(c0470a) ? 32 : 16;
        }
        int i4 = i & 384;
        n54 n54Var = ht.a.h;
        if (i4 == 0) {
            i2 |= bVarI.M(n54Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(obj) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            String str = obj instanceof String ? (String) obj : null;
            if (str == null || StringsKt.U(str)) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    k77Var = new Function2() { // from class: uqy
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            this.a.V0(dVar, obj, z, (a) obj2, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                }
            } else {
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
                aVar3.c = z ? (String) obj : "https://s.sporty.net/sportygames/cms/assets/background_image_1754225488187.png";
                nan nanVarA = aVar3.a();
                Object objY = bVarI.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new vqy();
                    bVarI.r(objY);
                }
                fn80.a(nanVarA, "BG1", androidx.compose.foundation.layout.d.a.b(j.g(j.c(androidx.compose.ui.graphics.a.a(androidx.compose.ui.d.a.b, (Function1) objY), 1.0f), 1.0f), n54Var), c0470a, null, 0.0f, null, null, null, bVarI, ((i2 << 6) & 7168) | 48, 2032);
                bVarI.X(true);
            }
            eVarZ.d = k77Var;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            k77Var = new k77(this, dVar, obj, z, i);
            eVarZ.d = k77Var;
        }
    }

    public final void X0(int i, androidx.compose.runtime.a aVar) {
        zqy zqyVar;
        androidx.compose.runtime.b bVarI = aVar.i(549223702);
        int i2 = (bVarI.A(this) ? 4 : 2) | i;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
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
            zqyVar = this;
            zqyVar.V0(j.g(j.c(aVar2, 1.0f), 1.0f), op5.c(op5.a, "background_image_png:sg_game_name", "https://s.sporty.net/sportygames/cms/assets/background_image_1754225488187.png"), ((Boolean) ((x5a0) u0().O).getValue()).booleanValue(), bVarI, ((i2 << 15) & 458752) | 438);
            bVarI.X(true);
        } else {
            zqyVar = this;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new sqf(i, 1, zqyVar);
        }
    }

    public final void Y0() {
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences == null || !sharedPreferences.getBoolean("ONE_PUNCH_ONE_SOUND", true)) {
            return;
        }
        ypa0 ypa0VarV0 = v0();
        String string = getString(R.string.sfx_auto_bet_off);
        string.getClass();
        ypa0VarV0.A1(0L, string);
    }

    @Override // defpackage.enb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String name;
        mz1 mz1Var;
        cj5 cj5Var;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setGameName("one-punch");
        op5.a.getClass();
        op5.c = "sg_1_punch";
        u0().a = m.b("one-punch");
        try {
            String str = (String) ((x5a0) u0().a).getValue();
            str.getClass();
            Function0<mz1> function0 = vij.a.get(str);
            if (function0 == null || (mz1Var = function0.invoke()) == null) {
                mz1Var = new mz1();
            }
            this.d = mz1Var;
            String str2 = (String) ((x5a0) u0().a).getValue();
            str2.getClass();
            Function0<z52> function1 = vij.c.get(str2);
            if (function1 == null || function1.invoke() == null) {
                new z52();
            }
            String str3 = (String) ((x5a0) u0().a).getValue();
            str3.getClass();
            Function0<cj5> function2 = vij.b.get(str3);
            if (function2 == null || (cj5Var = function2.invoke()) == null) {
                cj5Var = new cj5();
            }
            this.e = cj5Var;
            ((x5a0) u0().M).setValue(t0());
            ((x5a0) u0().N).setValue(r0());
        } catch (Exception e) {
            e.printStackTrace();
        }
        zob zobVarW0 = w0();
        GameDetails gameDetails = this.G;
        if (gameDetails == null || (name = gameDetails.getName()) == null) {
            name = "";
        }
        zobVarW0.getClass();
        ej5.c(o8i0.d(zobVarW0), null, null, new xob(zobVarW0, name, null), 3);
        N0();
        ArrayList arrayList = this.f;
        int i = 0;
        arrayList.add(0, "sg_1_punch");
        List listA0 = CollectionsKt.A0(arrayList);
        listA0.getClass();
        ArrayList<String> arrayList2 = (ArrayList) listA0;
        ((x5a0) u0().O).setValue(Boolean.FALSE);
        hvi hviVar = this.a;
        q8i0 q8i0Var = this.c;
        if (hviVar != null) {
            hviVar.E.E((fq5) q8i0Var.getValue(), arrayList2, "sg_1_punch", this.J);
        }
        ((fq5) q8i0Var.getValue()).c.f(getViewLifecycleOwner(), new enb.q(new lkb(this, i)));
        try {
            w0().A.f(getViewLifecycleOwner(), new enb.q(new okb(this, i)));
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            v91.c.f(getViewLifecycleOwner(), new enb.q(new pkb(this, i)));
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        try {
            w0().v.f(getViewLifecycleOwner(), new enb.q(new rkb(this, i)));
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        try {
            w0().B.f(getViewLifecycleOwner(), new enb.q(new skb(this, i)));
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        int i2 = 1;
        try {
            w0().C.f(getViewLifecycleOwner(), new enb.q(new lo2(this, i2)));
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        try {
            q0().b.f(getViewLifecycleOwner(), new enb.q(new tkb(this, i)));
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        try {
            w0().i.f(getViewLifecycleOwner(), new enb.q(new ukb(this)));
        } catch (Exception unused) {
        }
        try {
            w0().y.f(getViewLifecycleOwner(), new enb.q(new Function1() { // from class: vkb
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
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    UserValidateResponse userValidateResponse;
                    UserValidateResponse userValidateResponse2;
                    UserValidateResponse userValidateResponse3;
                    xbg xbgVar;
                    final Context context;
                    hvi hviVar2;
                    Integer code;
                    LoadingState loadingState = (LoadingState) obj;
                    int i3 = enb.b.a[loadingState.getStatus().ordinal()];
                    final zqy zqyVar = this.a;
                    u6i0.c cVar = u6i0.c.a;
                    String userId = null;
                    userId = null;
                    if (i3 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if (hTTPResponse != null && (userValidateResponse = (UserValidateResponse) hTTPResponse.getData()) != null) {
                            if (userValidateResponse.getInsufficientBalanceMessage() == null || (xbgVar = zqyVar.H) == null || xbgVar.isShowing()) {
                                zqyVar.a0 = userValidateResponse;
                                HTTPResponse hTTPResponse2 = (HTTPResponse) loadingState.getData();
                                String nickName = (hTTPResponse2 == null || (userValidateResponse3 = (UserValidateResponse) hTTPResponse2.getData()) == null) ? null : userValidateResponse3.getNickName();
                                String avatarUrl = userValidateResponse.getAvatarUrl();
                                HTTPResponse hTTPResponse3 = (HTTPResponse) loadingState.getData();
                                if (hTTPResponse3 != null && (userValidateResponse2 = (UserValidateResponse) hTTPResponse3.getData()) != null) {
                                    userId = userValidateResponse2.getUserId();
                                }
                                zqyVar.P0(nickName, avatarUrl, userId);
                            } else {
                                final androidx.fragment.app.e activity = zqyVar.getActivity();
                                if (activity != null && (context = zqyVar.getContext()) != null) {
                                    hvi hviVar3 = zqyVar.a;
                                    if (hviVar3 != null) {
                                        hviVar3.E.O(100);
                                    }
                                    hvi hviVar4 = zqyVar.a;
                                    if (hviVar4 != null) {
                                        final ComposeView composeView = hviVar4.f;
                                        composeView.setViewCompositionStrategy(cVar);
                                        composeView.setContent(new op8(-262315087, new Function2() { // from class: emb
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
                                                int i4 = 0;
                                                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                    if (composeView.getContext() == null) {
                                                        aVar.N(-2083100963);
                                                    } else {
                                                        aVar.N(-2083100962);
                                                        mhb mhbVar = mhb.d;
                                                        zqy zqyVar2 = zqyVar;
                                                        String str4 = (String) ((x5a0) zqyVar2.u0().i).getValue();
                                                        ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(80001, new HTTPResponse(80001, zqyVar2.getString(R.string.redblack_err_80001), null, null, null, null, null, 64, null));
                                                        context.getColor(R.color.try_again_color);
                                                        cj5 cj5VarR0 = zqyVar2.r0();
                                                        Object objY = aVar.y();
                                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                                        if (objY == c0042a) {
                                                            objY = new wmb();
                                                            aVar.r(objY);
                                                        }
                                                        Function0 function3 = (Function0) objY;
                                                        Object objY2 = aVar.y();
                                                        if (objY2 == c0042a) {
                                                            objY2 = new xmb();
                                                            aVar.r(objY2);
                                                        }
                                                        Function0 function4 = (Function0) objY2;
                                                        Object objY3 = aVar.y();
                                                        if (objY3 == c0042a) {
                                                            objY3 = new ymb();
                                                            aVar.r(objY3);
                                                        }
                                                        Function0 function5 = (Function0) objY3;
                                                        Object objY4 = aVar.y();
                                                        if (objY4 == c0042a) {
                                                            objY4 = new zmb(0);
                                                            aVar.r(objY4);
                                                        }
                                                        Function1 function6 = (Function1) objY4;
                                                        boolean zA = aVar.A(zqyVar2);
                                                        Object objY5 = aVar.y();
                                                        if (zA || objY5 == c0042a) {
                                                            objY5 = new anb(zqyVar2, i4);
                                                            aVar.r(objY5);
                                                        }
                                                        Function1 function7 = (Function1) objY5;
                                                        Object objY6 = aVar.y();
                                                        if (objY6 == c0042a) {
                                                            objY6 = new bnb();
                                                            aVar.r(objY6);
                                                        }
                                                        Function1 function8 = (Function1) objY6;
                                                        Object objY7 = aVar.y();
                                                        if (objY7 == c0042a) {
                                                            objY7 = new shb();
                                                            aVar.r(objY7);
                                                        }
                                                        mhbVar.a(activity, str4, genericError, function3, function4, function5, function6, function7, function8, (Function0) objY7, cj5VarR0, aVar, 14380032, 54);
                                                        ((x5a0) mhbVar.b).setValue(Boolean.TRUE);
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
                        }
                    } else if (i3 != 2) {
                        if (i3 != 3) {
                            uhc.a();
                            return null;
                        }
                        hvi hviVar5 = zqyVar.a;
                        if (hviVar5 != null) {
                            hviVar5.E.O(100);
                        }
                        Context context2 = zqyVar.getContext();
                        if (context2 != null) {
                            if (loadingState.getError() != null) {
                                Integer code2 = loadingState.getError().getCode();
                                if (code2 != null && code2.intValue() == 403) {
                                    if (((Boolean) ((x5a0) zqyVar.p0().e).getValue()).booleanValue()) {
                                        v91.b.j("0");
                                        ytw<Boolean> ytwVar = zqyVar.p0().e;
                                        Boolean bool = Boolean.FALSE;
                                        ((x5a0) ytwVar).setValue(bool);
                                        ((x5a0) zqyVar.p0().B).setValue(0);
                                        ((x5a0) zqyVar.p0().g0).setValue(bool);
                                    }
                                    SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                                } else {
                                    ResultWrapper.GenericError error = loadingState.getError();
                                    if (error == null || (code = error.getCode()) == null || code.intValue() != 403) {
                                        xbg xbgVar2 = zqyVar.H;
                                        Boolean boolValueOf = xbgVar2 != null ? Boolean.valueOf(xbgVar2.isShowing()) : null;
                                        boolValueOf.getClass();
                                        if (!boolValueOf.booleanValue() && (hviVar2 = zqyVar.a) != null) {
                                            ComposeView composeView2 = hviVar2.f;
                                            composeView2.setViewCompositionStrategy(cVar);
                                            composeView2.setContent(new op8(-1582394420, new Function2(context2, zqyVar, loadingState, context2) { // from class: fmb
                                                public final /* synthetic */ zqy a;
                                                public final /* synthetic */ LoadingState b;
                                                public final /* synthetic */ Context c;

                                                {
                                                    this.a = zqyVar;
                                                    this.b = loadingState;
                                                    this.c = context2;
                                                }

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
                                                    int i4 = 0;
                                                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                        aVar.N(449007420);
                                                        mhb mhbVar = mhb.d;
                                                        final zqy zqyVar2 = this.a;
                                                        String str4 = (String) ((x5a0) zqyVar2.u0().i).getValue();
                                                        ResultWrapper.GenericError error2 = this.b.getError();
                                                        Context context3 = this.c;
                                                        context3.getColor(R.color.sh_error_btn_color);
                                                        cj5 cj5VarR0 = zqyVar2.r0();
                                                        boolean zA = aVar.A(zqyVar2);
                                                        Object objY = aVar.y();
                                                        a.C0041a.C0042a c0042a = a.C0041a.a;
                                                        if (zA || objY == c0042a) {
                                                            objY = new Function0() { // from class: thb
                                                                @Override // kotlin.jvm.functions.Function0
                                                                public final Object invoke() {
                                                                    androidx.fragment.app.e activity2 = zqyVar2.getActivity();
                                                                    if (activity2 != null) {
                                                                        activity2.finish();
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            };
                                                            aVar.r(objY);
                                                        }
                                                        Function0 function3 = (Function0) objY;
                                                        Object objY2 = aVar.y();
                                                        if (objY2 == c0042a) {
                                                            objY2 = new uhb();
                                                            aVar.r(objY2);
                                                        }
                                                        Function0 function4 = (Function0) objY2;
                                                        boolean zA2 = aVar.A(zqyVar2);
                                                        Object objY3 = aVar.y();
                                                        if (zA2 || objY3 == c0042a) {
                                                            objY3 = new vhb(zqyVar2, i4);
                                                            aVar.r(objY3);
                                                        }
                                                        Function0 function5 = (Function0) objY3;
                                                        Object objY4 = aVar.y();
                                                        if (objY4 == c0042a) {
                                                            objY4 = new whb();
                                                            aVar.r(objY4);
                                                        }
                                                        Function1 function6 = (Function1) objY4;
                                                        boolean zA3 = aVar.A(zqyVar2);
                                                        Object objY5 = aVar.y();
                                                        if (zA3 || objY5 == c0042a) {
                                                            objY5 = new xhb(zqyVar2, i4);
                                                            aVar.r(objY5);
                                                        }
                                                        Function1 function7 = (Function1) objY5;
                                                        Object objY6 = aVar.y();
                                                        if (objY6 == c0042a) {
                                                            objY6 = new yhb();
                                                            aVar.r(objY6);
                                                        }
                                                        Function1 function8 = (Function1) objY6;
                                                        Object objY7 = aVar.y();
                                                        if (objY7 == c0042a) {
                                                            objY7 = new zhb();
                                                            aVar.r(objY7);
                                                        }
                                                        mhbVar.a(context3, str4, error2, function3, function4, function5, function6, function7, function8, (Function0) objY7, cj5VarR0, aVar, 14180352, 54);
                                                        ((x5a0) mhbVar.b).setValue(Boolean.TRUE);
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
                            } else {
                                zqyVar.T0(context2, null);
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception unused2) {
        }
        try {
            w0().w.f(getViewLifecycleOwner(), new enb.q(new Function1() { // from class: wkb
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    GameAvailableResponse gameAvailableResponse;
                    xbg xbgVar;
                    LoadingState loadingState = (LoadingState) obj;
                    int i3 = enb.b.a[loadingState.getStatus().ordinal()];
                    final zqy zqyVar = this.a;
                    if (i3 == 1) {
                        HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                        if ((hTTPResponse == null || (gameAvailableResponse = (GameAvailableResponse) hTTPResponse.getData()) == null) ? false : Intrinsics.g(gameAvailableResponse.isAvailable(), Boolean.FALSE)) {
                            final androidx.fragment.app.e activity = zqyVar.getActivity();
                            if (activity != null) {
                                hvi hviVar2 = zqyVar.a;
                                if (hviVar2 != null) {
                                    hviVar2.E.O(100);
                                }
                                hvi hviVar3 = zqyVar.a;
                                if (hviVar3 != null) {
                                    final ComposeView composeView = hviVar3.f;
                                    composeView.setViewCompositionStrategy(u6i0.c.a);
                                    composeView.setContent(new op8(1746504426, new Function2() { // from class: zlb
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
                                            int i4 = 0;
                                            if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                                                if (composeView.getContext() == null) {
                                                    aVar.N(879658478);
                                                } else {
                                                    aVar.N(879658479);
                                                    mhb mhbVar = mhb.d;
                                                    final zqy zqyVar2 = zqyVar;
                                                    String str4 = (String) ((x5a0) zqyVar2.u0().i).getValue();
                                                    ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(8002, new HTTPResponse(8002, zqyVar2.getString(R.string.game_not_available), null, null, null, null, null, 64, null));
                                                    androidx.fragment.app.e eVar = activity;
                                                    eVar.getColor(R.color.try_again_color);
                                                    cj5 cj5VarR0 = zqyVar2.r0();
                                                    boolean zA = aVar.A(zqyVar2);
                                                    Object objY = aVar.y();
                                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                                    if (zA || objY == c0042a) {
                                                        objY = new Function0() { // from class: pib
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                iny onBackPressedDispatcher;
                                                                zqy zqyVar3 = zqyVar2;
                                                                zqyVar3.G0();
                                                                androidx.fragment.app.e activity2 = zqyVar3.getActivity();
                                                                if (activity2 != null && (onBackPressedDispatcher = activity2.getOnBackPressedDispatcher()) != null) {
                                                                    onBackPressedDispatcher.d();
                                                                }
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar.r(objY);
                                                    }
                                                    Function0 function3 = (Function0) objY;
                                                    Object objY2 = aVar.y();
                                                    if (objY2 == c0042a) {
                                                        objY2 = new qib();
                                                        aVar.r(objY2);
                                                    }
                                                    Function0 function4 = (Function0) objY2;
                                                    Object objY3 = aVar.y();
                                                    if (objY3 == c0042a) {
                                                        objY3 = new rib();
                                                        aVar.r(objY3);
                                                    }
                                                    Function0 function5 = (Function0) objY3;
                                                    Object objY4 = aVar.y();
                                                    if (objY4 == c0042a) {
                                                        objY4 = new sib();
                                                        aVar.r(objY4);
                                                    }
                                                    Function1 function6 = (Function1) objY4;
                                                    boolean zA2 = aVar.A(zqyVar2);
                                                    Object objY5 = aVar.y();
                                                    if (zA2 || objY5 == c0042a) {
                                                        objY5 = new tib(zqyVar2, i4);
                                                        aVar.r(objY5);
                                                    }
                                                    Function1 function7 = (Function1) objY5;
                                                    Object objY6 = aVar.y();
                                                    if (objY6 == c0042a) {
                                                        objY6 = new uib();
                                                        aVar.r(objY6);
                                                    }
                                                    Function1 function8 = (Function1) objY6;
                                                    Object objY7 = aVar.y();
                                                    if (objY7 == c0042a) {
                                                        objY7 = new vib();
                                                        aVar.r(objY7);
                                                    }
                                                    mhbVar.a(eVar, str4, genericError, function3, function4, function5, function6, function7, function8, (Function0) objY7, cj5VarR0, aVar, 14376960, 54);
                                                    ((x5a0) mhbVar.b).setValue(Boolean.TRUE);
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
                            return Unit.a;
                        }
                        hvi hviVar4 = zqyVar.a;
                        if (hviVar4 != null) {
                            hviVar4.E.P();
                        }
                        zqyVar.w0().z1();
                    } else if (i3 != 2) {
                        if (i3 != 3) {
                            uhc.a();
                            return null;
                        }
                        Context context = zqyVar.getContext();
                        if (context != null) {
                            hvi hviVar5 = zqyVar.a;
                            if (hviVar5 != null) {
                                hviVar5.E.O(100);
                            }
                            if (loadingState.getError() != null) {
                                Integer code = loadingState.getError().getCode();
                                if ((code == null || code.intValue() != 403) && (xbgVar = zqyVar.H) != null && !xbgVar.isShowing()) {
                                    zqyVar.T0(context, loadingState.getError());
                                }
                            } else {
                                zqyVar.T0(context, null);
                            }
                        }
                    }
                    return Unit.a;
                }
            }));
        } catch (Exception unused3) {
        }
        try {
            w0().z.f(getViewLifecycleOwner(), new enb.q(new mkb(this)));
        } catch (Exception unused4) {
        }
        w0().E.f(getViewLifecycleOwner(), new enb.q(new nkb(this, i)));
        w0().F.f(getViewLifecycleOwner(), new enb.q(new mp7(this, i2)));
        u0().f = k.a(R.string.sporty_jet_id);
        u0().i = m.b("ONE PUNCH");
        u0().d = m.b("one-punch");
        u0().b = m.b("1 Punch");
        u0().w = R.color.sj_toggle_on_color;
        u0().y = R.color.one_punch_toggle_off_color;
        if (((Boolean) ((x5a0) p0().g0).getValue()).booleanValue()) {
            K0();
        } else {
            v0().H1(this.S);
        }
        if (this.b != null) {
            ((x5a0) u0().e).setValue(new String[]{"ONE_PUNCH_ONE_MUSIC", "ONE_PUNCH_ONE_SOUND", "ONE_PUNCH_ONE_TAP"});
        }
        SharedPreferences sharedPreferences = this.b;
        if (sharedPreferences != null) {
            u0().x1(sharedPreferences.getBoolean(((String[]) ((x5a0) u0().e).getValue())[2], false));
        }
        hvi hviVar2 = this.a;
        if (hviVar2 != null) {
            ComposeView composeView = hviVar2.K;
            qry.a(view, new d(view, this, composeView));
            composeView.setContent(new op8(1734483643, new p5u(this, i2), true));
        }
        hvi hviVar3 = this.a;
        ViewGroup.LayoutParams layoutParams = hviVar3 != null ? hviVar3.B.getLayoutParams() : null;
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.S = 1.0f;
        hvi hviVar4 = this.a;
        if (hviVar4 != null) {
            hviVar4.B.setLayoutParams(layoutParams2);
        }
        this.m0 = new s9b(this, i2);
        qry.a(view, new a(view, this));
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
    }
}
