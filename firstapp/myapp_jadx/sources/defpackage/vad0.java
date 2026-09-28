package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import coil3.compose.internal.CBvK.lobGSRIlnSGJY;
import com.esotericsoftware.spine.android.SpineView;
import com.esotericsoftware.spine.android.b;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.crash.models.BetData;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.Coefficients;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.PreviousMultiplierResponse;
import com.sportygames.crash.remote.models.RoundResponse;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import com.sportygames.lobby.remote.models.GameDetails;
import eightbitlab.com.blurview.BlurView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import vad0.i;
import vad0.j;
import vad0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lvad0;", "Lfgb;", "Lcom/sportygames/commons/views/GameMainActivity$b;", "<init>", "()V", "", "isWorldCupThemeEnabled", "giftResponseReceived", "", "latestMessageType", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class vad0 extends fgb {
    public final ytw<Boolean> y2 = androidx.compose.runtime.m.b(Boolean.FALSE);
    public final ttr z2 = hwr.a(a1s.c, new m(new l()));
    public final ytw<Integer> A2 = androidx.compose.runtime.m.b(null);

    public static final class c implements tse {
        public final /* synthetic */ s9s a;
        public final /* synthetic */ sad0 b;

        public c(s9s s9sVar, sad0 sad0Var) {
            this.a = s9sVar;
            this.b = sad0Var;
        }

        @Override // defpackage.tse
        public final void dispose() {
            this.a.d(this.b);
        }
    }

    @c0d(c = "com.sportygames.sportyskills.SportySkillsFragment$StadiumComponent$1$1", f = "SportySkillsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> a;
        public final /* synthetic */ ytw b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ytw ytwVar, ytw ytwVar2, v1b v1bVar) {
            super(2, v1bVar);
            this.a = ytwVar;
            this.b = ytwVar2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            vad0.p3(this.a, this.b);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyskills.SportySkillsFragment$StadiumComponent$2$1", f = "SportySkillsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ytw<com.esotericsoftware.spine.android.b> ytwVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = ytwVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vad0.this.new e(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            vad0.u3(this.b.getValue());
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyskills.SportySkillsFragment$downloadSpineSingleData$1$1", f = "SportySkillsFragment.kt", l = {1321, 1350, 1354, 1358, 1363}, m = "invokeSuspend", v = 1)
    public static final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ ytw<File> A;
        public int a;
        public int b;
        public int c;
        public int d;
        public final /* synthetic */ ytw<File> e;
        public final /* synthetic */ ytw<File> f;
        public final /* synthetic */ vad0 i;
        public final /* synthetic */ Context v;
        public final /* synthetic */ String w;
        public final /* synthetic */ String y;
        public final /* synthetic */ String z;

        @c0d(c = "com.sportygames.sportyskills.SportySkillsFragment$downloadSpineSingleData$1$1$spineData$1", f = "SportySkillsFragment.kt", l = {1322}, m = "invokeSuspend", v = 1)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super jcb0>, Object> {
            public int a;
            public final /* synthetic */ vad0 b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ String d;
            public final /* synthetic */ String e;
            public final /* synthetic */ String f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(vad0 vad0Var, Context context, String str, String str2, String str3, v1b<? super a> v1bVar) {
                super(2, v1bVar);
                this.b = vad0Var;
                this.c = context;
                this.d = str;
                this.e = str2;
                this.f = str3;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                return new a(this.b, this.c, this.d, this.e, this.f, v1bVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super jcb0> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
                String strC = op5.c(op5.a, this.d, this.e);
                this.a = 1;
                Object objY1 = fq5VarV0.y1(this.c, strC, this.f, this);
                return objY1 == y5bVar ? y5bVar : objY1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ytw<File> ytwVar, ytw<File> ytwVar2, vad0 vad0Var, Context context, String str, String str2, String str3, ytw<File> ytwVar3, v1b<? super g> v1bVar) {
            super(2, v1bVar);
            this.e = ytwVar;
            this.f = ytwVar2;
            this.i = vad0Var;
            this.v = context;
            this.w = str;
            this.y = str2;
            this.z = str3;
            this.A = ytwVar3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new g(this.e, this.f, this.i, this.v, this.w, this.y, this.z, this.A, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(5:68|69|93|70|(1:72)(1:73)) */
        /* JADX WARN: Can't wrap try/catch for region: R(5:74|75|91|76|(1:79)) */
        /* JADX WARN: Can't wrap try/catch for region: R(7:28|97|29|95|30|(1:32)(2:33|(2:35|(7:37|39|68|69|93|70|(1:72)(1:73))(5:68|69|93|70|(1:72)(1:73)))(5:74|75|91|76|(1:79)))|83) */
        /* JADX WARN: Code duplicated, block: B:35:0x009d A[Catch: Exception -> 0x00c7, TryCatch #3 {Exception -> 0x00c7, blocks: (B:30:0x007a, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:41:0x00ac, B:44:0x00b3, B:46:0x00c1, B:50:0x00cc, B:52:0x00d2, B:54:0x00d8, B:56:0x00e4, B:61:0x00ee, B:65:0x00fa, B:68:0x010b), top: B:95:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:68:0x010b A[Catch: Exception -> 0x00c7, TRY_LEAVE, TryCatch #3 {Exception -> 0x00c7, blocks: (B:30:0x007a, B:33:0x0099, B:35:0x009d, B:37:0x00a3, B:41:0x00ac, B:44:0x00b3, B:46:0x00c1, B:50:0x00cc, B:52:0x00d2, B:54:0x00d8, B:56:0x00e4, B:61:0x00ee, B:65:0x00fa, B:68:0x010b), top: B:95:0x007a }] */
        /* JADX WARN: Code duplicated, block: B:72:0x011c  */
        /* JADX WARN: Code duplicated, block: B:73:0x011d  */
        /* JADX WARN: Code duplicated, block: B:74:0x0121 A[Catch: Exception -> 0x00c8, TRY_LEAVE, TryCatch #2 {Exception -> 0x00c8, blocks: (B:70:0x0114, B:74:0x0121), top: B:93:0x0114 }] */
        /* JADX WARN: Code duplicated, block: B:79:0x0134  */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        
            r3 = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x0137, code lost:
        
            r3 = r5;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0147, code lost:
        
            if (defpackage.hkd.b(500, r22) == r1) goto L83;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x00f4 -> B:64:0x00f7). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0147 -> B:84:0x014a). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instruction units count: 337
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: vad0.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class h implements Runnable {
        public final /* synthetic */ View a;
        public final /* synthetic */ vad0 b;

        public h(View view, vad0 vad0Var) {
            this.a = view;
            this.b = vad0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            vad0 vad0Var = this.b;
            ytw<Integer> ytwVar = vad0Var.A2;
            ((x5a0) ytwVar).setValue(Integer.valueOf(this.a.getHeight()));
            Integer num = (Integer) ((x5a0) ytwVar).getValue();
            Float f = (Float) si8.a(num != null ? num.intValue() : 0, vad0Var.getResources().getDisplayMetrics().widthPixels).get("sporty-skills");
            float fFloatValue = f != null ? f.floatValue() : 0.29f;
            gvi gviVar = vad0Var.z;
            ComposeView composeView = gviVar != null ? gviVar.i : null;
            ViewGroup.LayoutParams layoutParams = composeView != null ? composeView.getLayoutParams() : null;
            layoutParams.getClass();
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.S = fFloatValue;
            composeView.setLayoutParams(layoutParams2);
            gvi gviVar2 = vad0Var.z;
            ComposeView composeView2 = gviVar2 != null ? gviVar2.e : null;
            ViewGroup.LayoutParams layoutParams3 = composeView2 != null ? composeView2.getLayoutParams() : null;
            layoutParams3.getClass();
            ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams3;
            layoutParams4.S = fFloatValue;
            composeView2.setLayoutParams(layoutParams4);
            gvi gviVar3 = vad0Var.z;
            BlurView blurView = gviVar3 != null ? gviVar3.v : null;
            ViewGroup.LayoutParams layoutParams5 = blurView != null ? blurView.getLayoutParams() : null;
            layoutParams5.getClass();
            ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams5;
            layoutParams6.S = fFloatValue;
            blurView.setLayoutParams(layoutParams6);
            gvi gviVar4 = vad0Var.z;
            BlurView blurView2 = gviVar4 != null ? gviVar4.w : null;
            ViewGroup.LayoutParams layoutParams7 = blurView2 != null ? blurView2.getLayoutParams() : null;
            layoutParams7.getClass();
            ConstraintLayout.LayoutParams layoutParams8 = (ConstraintLayout.LayoutParams) layoutParams7;
            layoutParams8.S = fFloatValue;
            blurView2.setLayoutParams(layoutParams8);
        }
    }

    public static final class i implements Function2<String, j58, Unit> {
        public i() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            vad0 vad0Var = vad0.this;
            if (!((Boolean) ((x5a0) vad0Var.d1).getValue()).booleanValue()) {
                ((x5a0) vad0Var.c1().H).setValue(str2);
                ((x5a0) vad0Var.c1().K).setValue(j58Var2);
                ((x5a0) vad0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) vad0Var.c1().Q).setValue(2000);
                ((x5a0) vad0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(vad0Var);
            }
            return Unit.a;
        }
    }

    public static final class j implements Function2<String, j58, Unit> {
        public j() {
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(String str, j58 j58Var) {
            String str2 = str;
            j58 j58Var2 = j58Var;
            long j = j58Var2.a;
            str2.getClass();
            vad0 vad0Var = vad0.this;
            if (!((Boolean) ((x5a0) vad0Var.d1).getValue()).booleanValue()) {
                ((x5a0) vad0Var.c1().H).setValue(str2);
                ((x5a0) vad0Var.c1().K).setValue(j58Var2);
                ((x5a0) vad0Var.c1().L).setValue(new j58(j58.f));
                ((x5a0) vad0Var.c1().Q).setValue(2000);
                ((x5a0) vad0Var.c1().O).setValue(Boolean.TRUE);
                fgb.a3(vad0Var);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.sportyskills.SportySkillsFragment$onViewCreated$7$1$1$1", f = "SportySkillsFragment.kt", l = {189}, m = "invokeSuspend", v = 1)
    public static final class k extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public k(v1b<? super k> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return vad0.this.new k(v1bVar);
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
                this.a = 1;
                if (hkd.b(8000L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            wwd0 wwd0Var = vad0.this.s3().a;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return Unit.a;
        }
    }

    public static final class l implements Function0<Fragment> {
        public l() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return vad0.this;
        }
    }

    public static final class m implements Function0<xad0> {
        public final /* synthetic */ l b;

        public m(l lVar) {
            this.b = lVar;
        }

        /* JADX WARN: Type inference failed for: r7v3, types: [j8i0, xad0] */
        @Override // kotlin.jvm.functions.Function0
        public final xad0 invoke() {
            v8i0 viewModelStore = vad0.this.getViewModelStore();
            vad0 vad0Var = vad0.this;
            cyb defaultViewModelCreationExtras = vad0Var.getDefaultViewModelCreationExtras();
            defaultViewModelCreationExtras.getClass();
            return sgk.a(jq40.a(xad0.class), viewModelStore, defaultViewModelCreationExtras, null, e80.a(vad0Var), null);
        }
    }

    public static void t3(BlurView blurView, ConstraintLayout constraintLayout) {
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
            long j2 = j58.l;
            ha20VarB.b(r58.l(j2));
            ha20VarB.l = new ColorDrawable(r58.l(j2));
        }
    }

    public static void u3(com.esotericsoftware.spine.android.b bVar) {
        if (bVar != null) {
            try {
                mx90 mx90VarB = bVar.b();
                String country = SportyGamesManager.getInstance().getCountry();
                country.getClass();
                Locale locale = Locale.ROOT;
                String lowerCase = country.toLowerCase(locale);
                lowerCase.getClass();
                String str = "BENNI";
                if (!lowerCase.equalsIgnoreCase("za")) {
                    String country2 = SportyGamesManager.getInstance().getCountry();
                    country2.getClass();
                    String lowerCase2 = country2.toLowerCase(locale);
                    lowerCase2.getClass();
                    if (!lowerCase2.equalsIgnoreCase("ke")) {
                        str = "Sporty bet";
                    }
                }
                mx90VarB.c(str);
                mx90VarB.d();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public static Pair v3(androidx.compose.runtime.a aVar) {
        mmd mmdVar = (mmd) aVar.O(kna.h);
        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
        dnn dnnVarC = r8j0.c(q8j0.a.a(aVar).g, aVar);
        aVar.N(-531969844);
        chf chfVar = AndroidCompositionLocals_androidKt.a;
        float fC1 = mmdVar.C1(((Configuration) aVar.O(chfVar)).screenWidthDp);
        aVar.H();
        aVar.N(-531966035);
        float fC2 = mmdVar.C1(((Configuration) aVar.O(chfVar)).screenHeightDp);
        aVar.H();
        asr asrVar = asr.a;
        return new Pair(Integer.valueOf((int) ((fC1 - mmdVar.C1(dnnVarC.b(asrVar))) - mmdVar.C1(dnnVarC.c(asrVar)))), Integer.valueOf((int) ((fC2 - mmdVar.C1(dnnVarC.d())) - mmdVar.C1(dnnVarC.a()))));
    }

    @Override // defpackage.fgb
    public final void B2(MultiplierResponse multiplierResponse) {
    }

    @Override // defpackage.fgb
    public final void C1() {
        gvi gviVar;
        SharedPreferences sharedPreferences = this.H;
        Boolean boolValueOf = sharedPreferences != null ? Boolean.valueOf(sharedPreferences.getBoolean("SPORTY_SKILLS_SOUND", true)) : null;
        SharedPreferences sharedPreferences2 = this.H;
        Boolean boolValueOf2 = sharedPreferences2 != null ? Boolean.valueOf(sharedPreferences2.getBoolean("SPORTY_SKILLS_MUSIC", true)) : null;
        Context context = getContext();
        if (context != null && (gviVar = this.z) != null) {
            ProgressMeterComponent progressMeterComponent = gviVar.Y;
            String string = getString(R.string.sg_sporty_skills);
            string.getClass();
            progressMeterComponent.setSoundManager("SPORTY_SKILLS/", string, boolValueOf, boolValueOf2, rk60.b.G, this.i, context);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.Y.I(l1());
        }
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
                j2 = new lq60().l1;
            } else if (houseCoefficient <= 4.9d) {
                j2 = new lq60().m1;
            } else if (houseCoefficient <= 9.9d) {
                j2 = new lq60().n1;
            } else {
                j2 = houseCoefficient <= 18.9d ? new lq60().o1 : new lq60().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j2);
            Y0().x1(coefficients);
            return;
        }
        coefficients.m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
        coefficients.m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
        double houseCoefficient2 = coefficients.getHouseCoefficient();
        if (houseCoefficient2 <= 1.5d) {
            j3 = new lq60().l1;
        } else if (houseCoefficient2 <= 4.9d) {
            j3 = new lq60().m1;
        } else if (houseCoefficient2 <= 9.9d) {
            j3 = new lq60().n1;
        } else {
            j3 = houseCoefficient2 <= 18.9d ? new lq60().o1 : new lq60().p1;
        }
        coefficients.m97setCoeffColor8_81llA(j3);
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
        long j2;
        Y0().B1(new PreviousMultiplierResponse(0, new ArrayList()));
        int size = previousMultiplierResponse.getCoefficients().size();
        for (int i2 = 0; i2 < size; i2++) {
            previousMultiplierResponse.getCoefficients().get(i2).m96setBgColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).L());
            previousMultiplierResponse.getCoefficients().get(i2).m98setRoundHistoryChipColor8_81llA(((mz1) ((x5a0) c1().e0).getValue()).B0());
            Coefficients coefficients = previousMultiplierResponse.getCoefficients().get(i2);
            double houseCoefficient = previousMultiplierResponse.getCoefficients().get(i2).getHouseCoefficient();
            if (houseCoefficient <= 1.5d) {
                j2 = new lq60().l1;
            } else if (houseCoefficient <= 4.9d) {
                j2 = new lq60().m1;
            } else if (houseCoefficient <= 9.9d) {
                j2 = new lq60().n1;
            } else {
                j2 = houseCoefficient <= 18.9d ? new lq60().o1 : new lq60().p1;
            }
            coefficients.m97setCoeffColor8_81llA(j2);
        }
        Y0().B1(previousMultiplierResponse);
    }

    @Override // defpackage.fgb
    public final void F2(boolean z) {
        if (z) {
            wwd0 wwd0Var = s3().a;
            Boolean bool = Boolean.TRUE;
            wwd0Var.getClass();
            wwd0Var.k(null, bool);
            return;
        }
        wwd0 wwd0Var2 = s3().a;
        if (((Boolean) wwd0Var2.getValue()).booleanValue()) {
            wwd0Var2.k(null, Boolean.FALSE);
        }
        gvi gviVar = this.z;
        if (gviVar != null) {
            gviVar.w.setVisibility(0);
        }
        gvi gviVar2 = this.z;
        if (gviVar2 != null) {
            gviVar2.v.setVisibility(0);
        }
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void I() {
    }

    @Override // defpackage.fgb
    public final void I0() {
        r3("crowd_zip:sg_sporty_skills", "https://test.sporty.net/common/main/res/3ca1ed15182198478eda63909e89abbd.zip", "spine_crowd_sporty_skills", R0().z, R0().A, R0().B);
        r3("juggling_zip:sg_sporty_skills", "https://test.sporty.net/common/main/res/889dcb1f6c0b7e7310aaddfcd5fe55a2.zip", "spine_juggling_sporty_skills", R0().C, R0().D, R0().E);
        r3("idle_zip:sg_sporty_skills", "https://test.sporty.net/common/main/res/bdb645ac98f7ed6b75992ea8e892657a.zip", "spine_idle_sporty_skills", R0().I, R0().J, R0().K);
        r3("spine_flashing_lights_sporty_skills:sg_sporty_skills", "https://s.sporty.net/common/main/res/b79f139a09e73e50fa9372af860a4e17.zip", "spine_flashing_lights_sporty_skills", R0().F, R0().G, R0().H);
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
        String string = getString(R.string.sg_sporty_skills);
        string.getClass();
        rk60.b bVar = rk60.b.G;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        String string2 = getString(R.string.bg_music);
        string2.getClass();
        progressMeterComponent.J("sporty-skills", string, bool, bVar, gameDetails, context, ypa0VarL1, bool, string2);
    }

    @Override // defpackage.fgb, com.sportygames.commons.views.GameMainActivity.b
    public final void d0() {
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
    }

    @Override // defpackage.fgb
    public final void f2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sporty_skills_id);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.G;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_valentine);
        string2.getClass();
        progressMeterComponent.J("sporty-skills", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void g2() {
        gvi gviVar;
        Context context = getContext();
        if (context == null || (gviVar = this.z) == null) {
            return;
        }
        ProgressMeterComponent progressMeterComponent = gviVar.Y;
        String string = getString(R.string.sg_sporty_skills);
        string.getClass();
        Boolean bool = (Boolean) ((x5a0) c1().u0).getValue();
        rk60.b bVar = rk60.b.G;
        GameDetails gameDetails = this.i;
        ypa0 ypa0VarL1 = l1();
        Boolean bool2 = Boolean.TRUE;
        String string2 = getString(R.string.bg_music_christmas);
        string2.getClass();
        progressMeterComponent.J("sporty-skills", string, bool, bVar, gameDetails, context, ypa0VarL1, bool2, string2);
    }

    @Override // defpackage.fgb
    public final void h2() {
    }

    @Override // defpackage.fgb
    public final void n0(RoundResponse roundResponse) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n3(final androidx.compose.ui.d dVar, final File file, final File file2, final ytw<com.esotericsoftware.spine.android.b> ytwVar, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        int iIntValue;
        Object obj;
        final float f2;
        float f3;
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(1768780619);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= bVarI.A(file) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.A(file2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.M(ytwVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= bVarI.A(this) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i3 & 1, (i3 & 9363) != 9362)) {
            final ibs ibsVar = (ibs) bVarI.O(ndt.a);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.m.b(new Pair(0, 0));
                bVarI.r(objY);
            }
            final ytw ytwVar2 = (ytw) objY;
            final float fFloatValue = ((Number) v3(bVarI).a).floatValue() / 2.0f;
            Integer num = (Integer) ((x5a0) this.A2).getValue();
            if (num == null) {
                bVarI.N(-1008858927);
                iIntValue = ((Number) v3(bVarI).b).intValue();
                bVarI.X(false);
            } else {
                bVarI.N(-1008860911);
                bVarI.X(false);
                iIntValue = num.intValue();
            }
            final float f4 = (iIntValue * 0.385f) / 2.2f;
            final float f5 = Build.VERSION.SDK_INT > 28 ? 0.52f : 0.95f;
            int i4 = i3 & 7168;
            boolean zC = (i4 == 2048) | bVarI.c(fFloatValue) | bVarI.c(f4) | bVarI.c(f5) | bVarI.A(ibsVar);
            Object objY2 = bVarI.y();
            if (zC || objY2 == c0042a) {
                obj = new Function1() { // from class: nad0
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v0, types: [hbs, sad0] */
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        ((use) obj2).getClass();
                        final float f6 = f5;
                        final float f7 = fFloatValue;
                        final float f8 = f4;
                        final ytw ytwVar3 = ytwVar;
                        final ytw ytwVar4 = ytwVar2;
                        ?? r0 = new cbs() { // from class: sad0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.cbs
                            public final void F0(ibs ibsVar2, s9s.a aVar2) {
                                if (aVar2 == s9s.a.ON_RESUME) {
                                    ytw ytwVar5 = ytwVar3;
                                    b bVar = (b) ytwVar5.getValue();
                                    float f9 = f6;
                                    if (bVar != null) {
                                        bVar.a().b(new vad0.a(f7, f8, f9, ytwVar4, ytwVar5));
                                    }
                                    b bVar2 = (b) ytwVar5.getValue();
                                    if (bVar2 != null) {
                                        bVar2.a().a(0, "animation", false);
                                    }
                                    b bVar3 = (b) ytwVar5.getValue();
                                    if (bVar3 != null) {
                                        bVar3.a().h = f9;
                                    }
                                }
                            }
                        };
                        s9s lifecycle = ibsVar.getLifecycle();
                        lifecycle.a(r0);
                        return new vad0.c(lifecycle, r0);
                    }
                };
                f2 = fFloatValue;
                f3 = f4;
                bVarI.r(obj);
            } else {
                f3 = f4;
                obj = objY2;
                f2 = fFloatValue;
            }
            xvf.c(ibsVar, (Function1) obj, bVarI);
            aiv aivVarC = g75.c(ht.a.e, false);
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
            androidx.compose.ui.d dVarA = androidx.compose.foundation.layout.c.a(androidx.compose.ui.d.a.b, 1.0f);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                z = true;
                objY3 = new l910(ytwVar2, 1);
                bVarI.r(objY3);
            } else {
                z = true;
            }
            androidx.compose.ui.d dVarA2 = androidx.compose.ui.graphics.a.a(dVarA, (Function1) objY3);
            boolean zA = bVarI.A(file) | bVarI.A(file2) | (i4 == 2048 ? z : false) | bVarI.c(f2) | bVarI.c(f3) | bVarI.c(f5);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                final float f6 = f3;
                Function1 function1 = new Function1() { // from class: oad0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        Context context = (Context) obj2;
                        context.getClass();
                        final float f7 = f5;
                        final float f8 = f2;
                        final float f9 = f6;
                        final ytw ytwVar3 = ytwVar;
                        final ytw ytwVar4 = ytwVar2;
                        SpineView spineViewA = SpineView.a(file, file2, context, new b(new hcb0() { // from class: qad0
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // defpackage.hcb0
                            public final void b(b bVar) {
                                ytw ytwVar5 = ytwVar3;
                                ytwVar5.setValue(bVar);
                                b bVar2 = (b) ytwVar5.getValue();
                                float f10 = f7;
                                if (bVar2 != null) {
                                    bVar2.a().b(new vad0.b(f8, f9, f10, ytwVar4, ytwVar5));
                                }
                                b bVar3 = (b) ytwVar5.getValue();
                                if (bVar3 != null) {
                                    bVar3.a().a(0, "animation", false);
                                }
                                b bVar4 = (b) ytwVar5.getValue();
                                if (bVar4 != null) {
                                    bVar4.a().h = f10;
                                }
                            }
                        }));
                        spineViewA.setContentMode(zza.a);
                        spineViewA.setClipToOutline(true);
                        return spineViewA;
                    }
                };
                bVarI.r(function1);
                objY4 = function1;
            }
            androidx.compose.ui.viewinterop.b.a((Function1) objY4, dVarA2, null, bVarI, 48, 4);
            bVarI.X(z);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: pad0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    this.a.n3(dVar, file, file2, ytwVar, (a) obj2, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 17941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:99)
        */
    public final void o3(java.lang.String r42, java.io.File r43, java.io.File r44, defpackage.ytw<com.esotericsoftware.spine.android.b> r45, java.io.File r46, java.io.File r47, defpackage.ytw<com.esotericsoftware.spine.android.b> r48, defpackage.ytw<java.lang.Boolean> r49, androidx.compose.runtime.a r50, int r51) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vad0.o3(java.lang.String, java.io.File, java.io.File, ytw, java.io.File, java.io.File, ytw, ytw, androidx.compose.runtime.a, int):void");
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
        ((x5a0) s3().e).setValue(null);
        wwd0 wwd0Var = s3().a;
        wwd0Var.getClass();
        wwd0Var.k(null, bool);
    }

    public final void q3(final int i2, androidx.compose.runtime.a aVar) {
        final vad0 vad0Var;
        File file;
        File file2;
        File file3;
        File file4;
        File file5;
        File file6;
        androidx.compose.runtime.b bVarI = aVar.i(1737544331);
        int i3 = (bVarI.A(this) ? 4 : 2) | i2;
        if (bVarI.q(i3 & 1, (i3 & 3) != 2)) {
            String messageType = ((MultiplierResponse) ((x5a0) R0().b).getValue()).getMessageType();
            File file7 = (File) ((x5a0) R0().z).getValue();
            File file8 = (File) ((x5a0) R0().A).getValue();
            File file9 = (File) ((x5a0) R0().F).getValue();
            File file10 = (File) ((x5a0) R0().G).getValue();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = androidx.compose.runtime.m.b(null);
                bVarI.r(objY);
            }
            ytw<com.esotericsoftware.spine.android.b> ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = androidx.compose.runtime.m.b(null);
                bVarI.r(objY2);
            }
            ytw<com.esotericsoftware.spine.android.b> ytwVar2 = (ytw) objY2;
            if (((x5a0) R0().z).getValue() == null || (file = (File) ((x5a0) R0().z).getValue()) == null || !file.exists() || ((x5a0) R0().A).getValue() == null || (file2 = (File) ((x5a0) R0().A).getValue()) == null || !file2.exists() || ((x5a0) R0().B).getValue() == null || (file3 = (File) ((x5a0) R0().B).getValue()) == null || !file3.exists() || ((x5a0) R0().F).getValue() == null || (file4 = (File) ((x5a0) R0().F).getValue()) == null || !file4.exists() || ((x5a0) R0().G).getValue() == null || (file5 = (File) ((x5a0) R0().G).getValue()) == null || !file5.exists() || ((x5a0) R0().H).getValue() == null || (file6 = (File) ((x5a0) R0().H).getValue()) == null || !file6.exists()) {
                vad0Var = this;
                bVarI.N(194310231);
            } else {
                bVarI.N(238679074);
                vad0Var = this;
                vad0Var.o3(messageType, file7, file8, ytwVar2, file9, file10, ytwVar, c1().m0, bVarI, ((i3 << 24) & 234881024) | 1575936);
            }
            bVarI.X(false);
        } else {
            vad0Var = this;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i2) { // from class: z9d0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.q3(iA, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public final void r3(String str, String str2, String str3, ytw<File> ytwVar, ytw<File> ytwVar2, ytw<File> ytwVar3) {
        ytwVar.getClass();
        ytwVar2.getClass();
        ytwVar3.getClass();
        Context context = getContext();
        if (context != null) {
            ibs viewLifecycleOwner = getViewLifecycleOwner();
            viewLifecycleOwner.getClass();
            ej5.c(ebs.a(viewLifecycleOwner.getLifecycle()), null, null, new g(ytwVar, ytwVar2, this, context, str, str2, str3, ytwVar3, null), 3);
        }
    }

    public final xad0 s3() {
        return (xad0) this.z2.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p3(ytw ytwVar, ytw ytwVar2) {
        zi0.e eVarJ;
        com.esotericsoftware.spine.android.b bVar;
        lh0 lh0Var;
        zi0.e eVarJ2;
        com.esotericsoftware.spine.android.b bVar2;
        lh0 lh0Var2;
        String str = "";
        String str2 = null;
        if (!Intrinsics.g((String) ytwVar2.getValue(), lobGSRIlnSGJY.BosNEG)) {
            com.esotericsoftware.spine.android.b bVar3 = (com.esotericsoftware.spine.android.b) ytwVar.getValue();
            if (bVar3 != null) {
                eVarJ2 = bVar3.a().j();
            } else {
                eVarJ2 = null;
            }
            if (eVarJ2 != null && (lh0Var2 = eVarJ2.a) != null) {
                str2 = lh0Var2.a;
            }
            if (str2 != null) {
                str = str2;
            }
            if (!str.equals("animation") && (bVar2 = (com.esotericsoftware.spine.android.b) ytwVar.getValue()) != null) {
                bVar2.a().m(0, "animation", false);
                return;
            }
            return;
        }
        com.esotericsoftware.spine.android.b bVar4 = (com.esotericsoftware.spine.android.b) ytwVar.getValue();
        if (bVar4 != null) {
            eVarJ = bVar4.a().j();
        } else {
            eVarJ = null;
        }
        if (eVarJ != null && (lh0Var = eVarJ.a) != null) {
            str2 = lh0Var.a;
        }
        if (str2 != null) {
            str = str2;
        }
        if (!str.equals("image") && (bVar = (com.esotericsoftware.spine.android.b) ytwVar.getValue()) != null) {
            bVar.a().a(0, "image", false);
        }
    }

    @Override // defpackage.fgb, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        gvi gviVar;
        view.getClass();
        super.onViewCreated(view, bundle);
        SportyGamesManager.setGameName(dLRYz.rkpDBkzFe);
        op5.a.getClass();
        op5.c = "sg_sporty_skills";
        goj gojVarC1 = c1();
        ytw<String> ytwVarB = androidx.compose.runtime.m.b("sporty-skills");
        gojVarC1.getClass();
        gojVarC1.v = ytwVarB;
        t2("sg_sporty_skills", "games/sporty-skills/v1/game");
        int i2 = 1;
        ConstraintLayout constraintLayout = null;
        if (Build.VERSION.SDK_INT <= 24 && (gviVar = this.z) != null) {
            gviVar.F.setLayerType(1, null);
        }
        goj gojVarC2 = c1();
        osw oswVarA = androidx.compose.runtime.k.a(R.string.sporty_skills_id);
        gojVarC2.getClass();
        gojVarC2.C = oswVarA;
        goj gojVarC3 = c1();
        ytw<String> ytwVarB2 = androidx.compose.runtime.m.b("SPORTY SKILLS");
        gojVarC3.getClass();
        gojVarC3.D = ytwVarB2;
        goj gojVarC4 = c1();
        ytw<String> ytwVarB3 = androidx.compose.runtime.m.b("sporty-skills");
        gojVarC4.getClass();
        gojVarC4.z = ytwVarB3;
        goj gojVarC5 = c1();
        ytw<String> ytwVarB4 = androidx.compose.runtime.m.b("Sporty skills");
        gojVarC5.getClass();
        gojVarC5.w = ytwVarB4;
        c1().F = R.color.sk_toggle_on_color;
        c1().G = R.color.sk_toggle_off_color;
        qry.a(view, new h(view, this));
        if (this.H != null) {
            ((x5a0) c1().B).setValue(new String[]{"SPORTY_SKILLS_MUSIC", "SPORTY_SKILLS_SOUND", "SPORTY_SKILLS_ONE_TAP", "SPORTY_SKILLS_THEME"});
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
        int i3 = 2;
        if (sharedPreferences3 != null) {
            c1().G1(sharedPreferences3.getBoolean(((String[]) ((x5a0) c1().B).getValue())[2], false));
        }
        gvi gviVar2 = this.z;
        u6i0.c cVar = u6i0.c.a;
        if (gviVar2 != null) {
            ComposeView composeView = gviVar2.v0;
            composeView.setViewCompositionStrategy(cVar);
            composeView.setContent(new op8(-1746560002, new tvw(this, i3), true));
        }
        gvi gviVar3 = this.z;
        if (gviVar3 != null) {
            layoutParams = gviVar3.U.getLayoutParams();
        } else {
            layoutParams = null;
        }
        layoutParams.getClass();
        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams4.S = 1.0f;
        layoutParams4.i = 0;
        layoutParams4.j = -1;
        gvi gviVar4 = this.z;
        if (gviVar4 != null) {
            gviVar4.U.setLayoutParams(layoutParams4);
        }
        gvi gviVar5 = this.z;
        if (gviVar5 != null) {
            layoutParams2 = gviVar5.W.getLayoutParams();
        } else {
            layoutParams2 = null;
        }
        layoutParams2.getClass();
        ConstraintLayout.LayoutParams layoutParams5 = (ConstraintLayout.LayoutParams) layoutParams2;
        layoutParams5.S = 1.0f;
        layoutParams5.i = 0;
        layoutParams5.j = -1;
        gvi gviVar6 = this.z;
        if (gviVar6 != null) {
            gviVar6.W.setLayoutParams(layoutParams5);
        }
        gvi gviVar7 = this.z;
        if (gviVar7 != null) {
            ComposeView composeView2 = gviVar7.W;
            composeView2.setViewCompositionStrategy(cVar);
            composeView2.setContent(new op8(-658971263, new Function2() { // from class: o9d0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i4;
                    File file;
                    File file2;
                    File file3;
                    int iIntValue;
                    File file4;
                    File file5;
                    File file6;
                    int iIntValue2;
                    a aVar = (a) obj;
                    int iIntValue3 = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                        Unit unit = Unit.a;
                        vad0 vad0Var = this.a;
                        boolean zA = aVar.A(vad0Var);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = vad0Var.new k(null);
                            aVar.r(objY);
                        }
                        xvf.e(aVar, unit, (Function2) objY);
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
                        d dVarE = j.e(aVar2, 1.0f);
                        aiv aivVarC2 = g75.c(ht.a.a, false);
                        int iHashCode2 = Long.hashCode(aVar.m());
                        ne00 ne00VarO2 = aVar.o();
                        d dVarC2 = c.c(aVar, dVarE);
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
                        hlh0.a(aVar, dVarC2, cVar2);
                        ul2 ul2VarR0 = vad0Var.R0();
                        ytw<Boolean> ytwVar = vad0Var.l1;
                        ytw<Boolean> ytwVar2 = vad0Var.i0;
                        ytw<Integer> ytwVar3 = vad0Var.A2;
                        String messageType = ((MultiplierResponse) ((x5a0) ul2VarR0.b).getValue()).getMessageType();
                        ytw<Boolean> ytwVar4 = vad0Var.c1().m0;
                        String str = "ROUND_WAITING";
                        if (((x5a0) vad0Var.R0().I).getValue() == null || (file4 = (File) ((x5a0) vad0Var.R0().I).getValue()) == null || !file4.exists() || ((x5a0) vad0Var.R0().J).getValue() == null || (file5 = (File) ((x5a0) vad0Var.R0().J).getValue()) == null || !file5.exists() || ((x5a0) vad0Var.R0().K).getValue() == null || (file6 = (File) ((x5a0) vad0Var.R0().K).getValue()) == null || !file6.exists()) {
                            messageType = messageType;
                            ytwVar3 = ytwVar3;
                            ytwVar4 = ytwVar4;
                            str = "ROUND_WAITING";
                            i4 = 1738075757;
                            aVar.N(1738075757);
                        } else {
                            aVar.N(1748003755);
                            if (((Boolean) ((x5a0) vad0Var.c1().h0).getValue()).booleanValue()) {
                                aVar.N(1748081751);
                                d dVarA = dw.a(aVar2, Intrinsics.g(messageType, "ROUND_WAITING") ? 1.0f : 0.0f);
                                File file7 = (File) ((x5a0) vad0Var.R0().I).getValue();
                                File file8 = (File) ((x5a0) vad0Var.R0().J).getValue();
                                ytw<b> ytwVar5 = vad0Var.s3().c;
                                Integer num = (Integer) ((x5a0) ytwVar3).getValue();
                                if (num == null) {
                                    aVar.N(1303332507);
                                    iIntValue2 = ((Number) vad0.v3(aVar).b).intValue();
                                    aVar.H();
                                } else {
                                    aVar.N(1303329283);
                                    aVar.H();
                                    iIntValue2 = num.intValue();
                                }
                                int iIntValue4 = ((Number) vad0.v3(aVar).a).intValue();
                                int i5 = iIntValue2;
                                i4 = 1738075757;
                                doi.a(dVarA, file7, file8, ytwVar5, i5, iIntValue4, aVar, 0);
                                aVar = aVar;
                            } else {
                                i4 = 1738075757;
                                aVar.N(1738075757);
                            }
                            aVar.H();
                        }
                        aVar.H();
                        if (((x5a0) vad0Var.R0().C).getValue() == null || (file = (File) ((x5a0) vad0Var.R0().C).getValue()) == null || !file.exists() || ((x5a0) vad0Var.R0().D).getValue() == null || (file2 = (File) ((x5a0) vad0Var.R0().D).getValue()) == null || !file2.exists() || ((x5a0) vad0Var.R0().E).getValue() == null || (file3 = (File) ((x5a0) vad0Var.R0().E).getValue()) == null || !file3.exists()) {
                            aVar.N(i4);
                        } else {
                            aVar.N(1749343079);
                            if (((Boolean) ((x5a0) vad0Var.c1().h0).getValue()).booleanValue()) {
                                aVar.N(1749421075);
                                d dVarA2 = dw.a(aVar2, !Intrinsics.g(messageType, str) ? 1.0f : 0.0f);
                                File file9 = (File) ((x5a0) vad0Var.R0().C).getValue();
                                File file10 = (File) ((x5a0) vad0Var.R0().D).getValue();
                                ytw<b> ytwVar6 = vad0Var.s3().e;
                                Integer num2 = (Integer) ((x5a0) ytwVar3).getValue();
                                if (num2 == null) {
                                    aVar.N(1303377339);
                                    iIntValue = ((Number) vad0.v3(aVar).b).intValue();
                                    aVar.H();
                                } else {
                                    aVar.N(1303374115);
                                    aVar.H();
                                    iIntValue = num2.intValue();
                                }
                                int iIntValue5 = ((Number) vad0.v3(aVar).a).intValue();
                                boolean zBooleanValue = ((Boolean) ((x5a0) ytwVar4).getValue()).booleanValue();
                                boolean zA2 = aVar.A(vad0Var);
                                Object objY2 = aVar.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new ly4(vad0Var, 2);
                                    aVar.r(objY2);
                                }
                                a aVar4 = aVar;
                                doi.b(dVarA2, file9, file10, ytwVar6, messageType, iIntValue, iIntValue5, zBooleanValue, (Function1) objY2, aVar4, 0);
                                aVar = aVar4;
                            } else {
                                aVar.N(i4);
                            }
                            aVar.H();
                        }
                        aVar.H();
                        aVar.s();
                        if (Intrinsics.g(((MultiplierResponse) ((x5a0) vad0Var.R0().b).getValue()).getMessageType(), str) && ((Boolean) ((x5a0) vad0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue() && !vad0Var.l0) {
                            ypa0 ypa0VarL1 = vad0Var.l1();
                            String string = vad0Var.getString(R.string.powering_up_sound);
                            string.getClass();
                            ypa0VarL1.A1(0L, string);
                        }
                        if (Intrinsics.g(((MultiplierResponse) ((x5a0) vad0Var.R0().b).getValue()).getMessageType(), "ROUND_PRE_START") && ((Boolean) ((x5a0) vad0Var.c1().u0).getValue()).booleanValue() && ((Boolean) ((x5a0) ytwVar2).getValue()).booleanValue() && !vad0Var.l0) {
                            ej5.c(ebs.a(vad0Var.getLifecycle()), null, null, new wad0(vad0Var, null), 3);
                        }
                        x5a0 x5a0Var = (x5a0) ytwVar;
                        if (((Boolean) x5a0Var.getValue()).booleanValue()) {
                            aVar.N(-902162809);
                        } else {
                            aVar.N(-889254812);
                            y18.a(vad0Var.c1(), vad0Var.R0().b, vad0Var.c1().j0, ((Boolean) x5a0Var.getValue()).booleanValue(), aVar, 0);
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
        gvi gviVar8 = this.z;
        if (gviVar8 != null) {
            layoutParams3 = gviVar8.V.getLayoutParams();
        } else {
            layoutParams3 = null;
        }
        layoutParams3.getClass();
        ConstraintLayout.LayoutParams layoutParams6 = (ConstraintLayout.LayoutParams) layoutParams3;
        layoutParams6.S = 1.0f;
        gvi gviVar9 = this.z;
        if (gviVar9 != null) {
            gviVar9.V.setLayoutParams(layoutParams6);
        }
        wt90 wt90Var = new wt90(this, i2);
        wb50 wb50Var = new wb50(this, i2);
        this.J1 = wt90Var;
        this.K1 = wb50Var;
        gvi gviVar10 = this.z;
        if (gviVar10 != null) {
            constraintLayout = gviVar10.y;
        }
        if (gviVar10 != null) {
            t3(gviVar10.v, constraintLayout);
        }
        gvi gviVar11 = this.z;
        if (gviVar11 != null) {
            t3(gviVar11.w, constraintLayout);
        }
        gvi gviVar12 = this.z;
        if (gviVar12 != null) {
            gviVar12.v.setVisibility(0);
        }
        gvi gviVar13 = this.z;
        if (gviVar13 != null) {
            gviVar13.w.setVisibility(0);
        }
        gvi gviVar14 = this.z;
        if (gviVar14 != null) {
            final ComposeView composeView3 = gviVar14.i;
            composeView3.setViewCompositionStrategy(cVar);
            composeView3.setContent(new op8(-1365567869, new Function2() { // from class: jad0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final vad0 vad0Var = this.a;
                        final BetContainerState betContainerState = (BetContainerState) wyh.c(vad0Var.R0().a, aVar, 0, 7).getValue();
                        BetContainerState betContainerState2 = (BetContainerState) wyh.c(vad0Var.S0().a, aVar, 0, 7).getValue();
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
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) vad0Var.R0().d).getValue()).get(Long.valueOf(betContainerState.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        ytw<Boolean> ytwVar = vad0Var.f1().e;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) vad0Var.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) vad0Var.c1().e0).getValue(), (cj5) ((x5a0) vad0Var.c1().f0).getValue());
                        Integer num = (Integer) ((x5a0) vad0Var.A2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) vad0Var.R0().b).getValue();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) vad0Var.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) vad0Var.y2).getValue()).booleanValue();
                        boolean resetChips = betContainerState.getResetChips();
                        t290 t290VarJ1 = vad0Var.j1();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) vad0Var.c1().v).getValue();
                        boolean z = egb.a(betContainerState2) > 0;
                        l1z l1zVarE1 = vad0Var.e1();
                        osw oswVar = vad0Var.R0().M;
                        boolean zA = aVar.A(vad0Var);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function1() { // from class: tad0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    if (vad0Var2.j0) {
                                        ((BetContainerState) vad0Var2.R0().a.getValue()).setBetData(betData);
                                        goj.A1(vad0Var2.c1(), betData, vad0Var2.z0, vad0Var2.U0, vad0Var2.h2, 0, "MANUAL", new iad0(), new hz4(vad0Var2, 2), null, null, null, 1792);
                                    } else {
                                        vad0Var2.p0(vad0Var2.R0(), betData, null);
                                    }
                                    vad0Var2.S0().S1(true);
                                    ((x5a0) vad0Var2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(vad0Var);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new Function1() { // from class: j9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    z83 z83Var = (z83) obj3;
                                    z83Var.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.r2(z83Var, vad0Var2.R0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(vad0Var);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new cs90(vad0Var, 1);
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(vad0Var);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new bki(vad0Var, 1);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(vad0Var);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new ohd(vad0Var, 1);
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(vad0Var) | aVar.A(betContainerState);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new Function1() { // from class: k9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    boolean zBooleanValue5 = ((Boolean) obj3).booleanValue();
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.S0().S1(true);
                                    ytw<Boolean> ytwVar2 = vad0Var2.j1;
                                    Boolean bool2 = Boolean.FALSE;
                                    x5a0 x5a0Var = (x5a0) ytwVar2;
                                    x5a0Var.setValue(bool2);
                                    BetContainerState betContainerState3 = betContainerState;
                                    if (zBooleanValue5) {
                                        vad0Var2.p1 = 1;
                                        vad0Var2.R0().P1(1);
                                        vad0Var2.R0().Q1(-1);
                                        Boolean bool3 = Boolean.TRUE;
                                        x5a0Var.setValue(bool3);
                                        ((u5a0) vad0Var2.n1).k(15);
                                        vad0Var2.R0().M1(!betContainerState3.getExtraKey());
                                        vad0Var2.R0().R1(true);
                                        vad0Var2.R0().S1(false);
                                        ((x5a0) vad0Var2.R0().c).setValue(bool3);
                                    } else {
                                        x5a0Var.setValue(bool2);
                                        vad0Var2.R0().R1(false);
                                        vad0Var2.R0().Q1(-1);
                                        vad0Var2.R0().M1(!betContainerState3.getExtraKey());
                                        ((x5a0) vad0Var2.R0().c).setValue(bool2);
                                    }
                                    vad0Var2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(vad0Var) | aVar.A(betContainerState);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: l9d0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    ((x5a0) vad0Var2.c1().J).setValue(betData);
                                    ((BetContainerState) vad0Var2.R0().a.getValue()).setBetData(betData);
                                    if (zBooleanValue5) {
                                        vad0Var2.S0().S1(true);
                                        vad0Var2.R0().G1(true);
                                        if (!betContainerState.getBetPlaced()) {
                                            if (vad0Var2.j0) {
                                                ((BetContainerState) vad0Var2.R0().a.getValue()).setBetData(betData);
                                                goj.A1(vad0Var2.c1(), betData, vad0Var2.z0, vad0Var2.U0, vad0Var2.h2, 0, "MANUAL", new kad0(), new f910(vad0Var2, 2), null, null, null, 1792);
                                            } else {
                                                vad0Var2.p0(vad0Var2.R0(), betData, null);
                                            }
                                        }
                                    } else {
                                        vad0Var2.R0().G1(false);
                                    }
                                    vad0Var2.S0().S1(true);
                                    vad0Var2.S0().P1(0);
                                    ((x5a0) vad0Var2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(vad0Var);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new Function1() { // from class: m9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ((Boolean) obj3).getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.S0().S1(true);
                                    x5a0 x5a0Var = (x5a0) vad0Var2.j1;
                                    x5a0Var.setValue(Boolean.FALSE);
                                    vad0Var2.p1 = 1;
                                    ((u5a0) vad0Var2.n1).k(2);
                                    vad0Var2.R0().Q1(-1);
                                    x5a0Var.setValue(Boolean.TRUE);
                                    vad0Var2.R0().P1(2);
                                    vad0Var2.R0().R1(true);
                                    vad0Var2.R0().S1(false);
                                    vad0Var2.S0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(vad0Var);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new iki(vad0Var, 1);
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(vad0Var);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = vad0Var.new i();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(vad0Var);
                        final ComposeView composeView4 = composeView3;
                        boolean zA12 = zA11 | aVar.A(composeView4);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: n9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    ((x5a0) vad0Var2.c1().J).setValue(betData);
                                    ((BetContainerState) vad0Var2.R0().a.getValue()).setBetData(betData);
                                    ((x5a0) vad0Var2.c1().T).setValue(Boolean.TRUE);
                                    ytw<String> ytwVar2 = vad0Var2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView5 = composeView4;
                                    String strB = w68.b(composeView5, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView5.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) vad0Var2.c1().R).setValue(f78.a(composeView5, R.string.yes_bet, w68.b(composeView5, R.string.yes_btn_cms), null));
                                    ((x5a0) vad0Var2.c1().S).setValue(f78.a(composeView5, R.string.cancel_bet, w68.b(composeView5, R.string.cancel_btn_cms), null));
                                    vad0Var2.H1();
                                    vad0Var2.c1().E1(vad0Var2.R0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(vad0Var);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new Function1() { // from class: uad0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    ((BetContainerState) vad0Var2.R0().a.getValue()).setBetData(betData);
                                    ((x5a0) vad0Var2.E1).setValue(Boolean.TRUE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(vad0Var);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new pun(vad0Var, 1);
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(vad0Var);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new qun(vad0Var, 2);
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA16 = aVar.A(vad0Var);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new sv4(vad0Var, 3);
                            aVar.r(objY15);
                        }
                        x2a.a(iIntValue2, sl2Var, betContainerState, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str, function12, function13, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
        gvi gviVar15 = this.z;
        if (gviVar15 != null) {
            final ComposeView composeView4 = gviVar15.e;
            composeView4.setViewCompositionStrategy(cVar);
            composeView4.setContent(new op8(1688605841, new Function2() { // from class: rad0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i4 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final vad0 vad0Var = this.a;
                        BetContainerState betContainerState = (BetContainerState) wyh.c(vad0Var.R0().a, aVar, 0, 7).getValue();
                        final BetContainerState betContainerState2 = (BetContainerState) wyh.c(vad0Var.S0().a, aVar, 0, 7).getValue();
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
                        Boolean bool = (Boolean) ((HashMap) ((x5a0) vad0Var.S0().d).getValue()).get(Long.valueOf(betContainerState2.getRoundId()));
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        sl2 sl2Var = new sl2(betContainerState.getResetWholeContainer(), ((Boolean) ((x5a0) vad0Var.c1().b0).getValue()).booleanValue(), (mz1) ((x5a0) vad0Var.c1().e0).getValue(), (cj5) ((x5a0) vad0Var.c1().f0).getValue());
                        ytw<Boolean> ytwVar = vad0Var.f1().e;
                        Integer num = (Integer) ((x5a0) vad0Var.A2).getValue();
                        int iIntValue2 = num != null ? num.intValue() : 0;
                        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) vad0Var.S0().b).getValue();
                        t290 t290VarJ1 = vad0Var.j1();
                        boolean zBooleanValue2 = ((Boolean) ((x5a0) vad0Var.c1().q0).getValue()).booleanValue();
                        boolean zBooleanValue3 = ((Boolean) ((x5a0) vad0Var.y2).getValue()).booleanValue();
                        boolean resetChips = betContainerState2.getResetChips();
                        boolean zBooleanValue4 = ((Boolean) ((x5a0) ytwVar).getValue()).booleanValue();
                        String str = (String) ((x5a0) vad0Var.c1().v).getValue();
                        boolean z = egb.a(betContainerState) > 0;
                        l1z l1zVarE1 = vad0Var.e1();
                        osw oswVar = vad0Var.S0().M;
                        boolean zA = aVar.A(vad0Var);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function1() { // from class: p9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    final vad0 vad0Var2 = vad0Var;
                                    if (vad0Var2.j0) {
                                        ((BetContainerState) vad0Var2.S0().a.getValue()).setBetData(betData);
                                        goj.A1(vad0Var2.c1(), betData, vad0Var2.z0, vad0Var2.U0, vad0Var2.h2, 1, "MANUAL", new bds(vad0Var2), new Function1() { // from class: lad0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj4) {
                                                vad0 vad0Var3 = vad0Var2;
                                                cgb.a(vad0Var3.e1(), (String) ((x5a0) vad0Var3.c1().v).getValue(), "placeBet", (String) obj4);
                                                return Unit.a;
                                            }
                                        }, null, null, null, 1792);
                                    } else {
                                        vad0Var2.p0(vad0Var2.S0(), betData, null);
                                    }
                                    vad0Var2.R0().S1(true);
                                    ((x5a0) vad0Var2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function1 function1 = (Function1) objY;
                        boolean zA2 = aVar.A(vad0Var);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new i810(vad0Var, i4);
                            aVar.r(objY2);
                        }
                        Function1 function2 = (Function1) objY2;
                        boolean zA3 = aVar.A(vad0Var);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: s9d0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    vad0 vad0Var2 = vad0Var;
                                    int i5 = 1;
                                    vad0Var2.f = true;
                                    if (vad0Var2.j0) {
                                        MultiplierResponse multiplierResponse2 = vad0Var2.x0;
                                        if (multiplierResponse2 != null) {
                                            vad0Var2.c1().B1(multiplierResponse2, vad0Var2.l2(), vad0Var2.y0, vad0Var2.h2, 1, new ic50(vad0Var2, i5), null);
                                        }
                                    } else {
                                        vad0Var2.v0(vad0Var2.S0(), null);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        }
                        Function0 function0 = (Function0) objY3;
                        boolean zA4 = aVar.A(vad0Var);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new Function0() { // from class: t9d0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.R0().T1(true);
                                    vad0Var2.S0().T1(false);
                                    ((x5a0) vad0Var2.j1).setValue(Boolean.FALSE);
                                    vad0Var2.R0().R1(false);
                                    vad0Var2.S0().R1(false);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(vad0Var);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new Function0() { // from class: u9d0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.p1 = 2;
                                    ul2 ul2VarS0 = vad0Var2.S0();
                                    boolean zBooleanValue5 = ((Boolean) ((x5a0) vad0Var2.y2).getValue()).booleanValue();
                                    Integer num2 = (Integer) ((x5a0) vad0Var2.A2).getValue();
                                    vad0Var2.Y2(ul2VarS0, zBooleanValue5, num2 != null ? num2.intValue() : 0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY5);
                        }
                        Function0 function4 = (Function0) objY5;
                        boolean zA6 = aVar.A(vad0Var) | aVar.A(betContainerState2);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new nww(1, vad0Var, betContainerState2);
                            aVar.r(objY6);
                        }
                        Function1 function5 = (Function1) objY6;
                        boolean zA7 = aVar.A(vad0Var) | aVar.A(betContainerState2);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new Function2() { // from class: v9d0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj3, Object obj4) {
                                    BetData betData = (BetData) obj3;
                                    boolean zBooleanValue5 = ((Boolean) obj4).booleanValue();
                                    betData.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    ((x5a0) vad0Var2.c1().J).setValue(betData);
                                    if (zBooleanValue5) {
                                        vad0Var2.S0().G1(true);
                                        if (!betContainerState2.getBetPlaced()) {
                                            if (vad0Var2.j0) {
                                                ((BetContainerState) vad0Var2.S0().a.getValue()).setBetData(betData);
                                                goj.A1(vad0Var2.c1(), betData, vad0Var2.z0, vad0Var2.U0, vad0Var2.h2, 1, "MANUAL", new zy4(vad0Var2), new sli(vad0Var2, 2), null, null, null, 1792);
                                            } else {
                                                vad0Var2.p0(vad0Var2.S0(), betData, null);
                                            }
                                        }
                                    } else {
                                        vad0Var2.S0().G1(false);
                                    }
                                    vad0Var2.R0().S1(true);
                                    vad0Var2.R0().P1(0);
                                    ((x5a0) vad0Var2.j1).setValue(Boolean.FALSE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        Function2 function6 = (Function2) objY7;
                        boolean zA8 = aVar.A(vad0Var);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new Function1() { // from class: w9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    ((Boolean) obj3).getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.R0().S1(true);
                                    x5a0 x5a0Var = (x5a0) vad0Var2.j1;
                                    x5a0Var.setValue(Boolean.FALSE);
                                    vad0Var2.p1 = 2;
                                    x5a0Var.setValue(Boolean.TRUE);
                                    vad0Var2.S0().Q1(-1);
                                    vad0Var2.S0().R1(true);
                                    vad0Var2.S0().P1(2);
                                    vad0Var2.S0().S1(false);
                                    vad0Var2.R0().P1(0);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY8);
                        }
                        Function1 function7 = (Function1) objY8;
                        boolean zA9 = aVar.A(vad0Var);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new Function0() { // from class: x9d0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    vad0 vad0Var2 = vad0Var;
                                    vad0Var2.S0().O1(new GiftItem(0.0d, "", "", "", 0.0d, 0L, 0, Double.valueOf(0.0d), null));
                                    ((x5a0) vad0Var2.y2).setValue(Boolean.FALSE);
                                    ((x5a0) vad0Var2.S0().R).setValue(Boolean.TRUE);
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY9);
                        }
                        Function0 function8 = (Function0) objY9;
                        boolean zA10 = aVar.A(vad0Var);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = vad0Var.new j();
                            aVar.r(objY10);
                        }
                        Function2 function9 = (Function2) objY10;
                        boolean zA11 = aVar.A(vad0Var);
                        final ComposeView composeView5 = composeView4;
                        boolean zA12 = zA11 | aVar.A(composeView5);
                        Object objY11 = aVar.y();
                        if (zA12 || objY11 == c0042a) {
                            objY11 = new Function1() { // from class: y9d0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    BetData betData = (BetData) obj3;
                                    betData.getClass();
                                    vad0 vad0Var2 = vad0Var;
                                    ((x5a0) vad0Var2.c1().T).setValue(Boolean.TRUE);
                                    ((x5a0) vad0Var2.c1().J).setValue(betData);
                                    ((BetContainerState) vad0Var2.S0().a.getValue()).setBetData(betData);
                                    ytw<String> ytwVar2 = vad0Var2.c1().I;
                                    op5 op5Var = op5.a;
                                    ComposeView composeView6 = composeView5;
                                    String strB = w68.b(composeView6, R.string.auto_bet_requirement_message_cms);
                                    String string = composeView6.getContext().getString(R.string.auto_bet_one_tap);
                                    string.getClass();
                                    ((x5a0) ytwVar2).setValue(op5.c(op5Var, strB, string));
                                    ((x5a0) vad0Var2.c1().R).setValue(f78.a(composeView6, R.string.yes_bet, w68.b(composeView6, R.string.yes_btn_cms), null));
                                    ((x5a0) vad0Var2.c1().S).setValue(f78.a(composeView6, R.string.cancel_bet, w68.b(composeView6, R.string.cancel_btn_cms), null));
                                    vad0Var2.H1();
                                    vad0Var2.c1().E1(vad0Var2.S0());
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY11);
                        }
                        Function1 function10 = (Function1) objY11;
                        boolean zA13 = aVar.A(vad0Var);
                        Object objY12 = aVar.y();
                        if (zA13 || objY12 == c0042a) {
                            objY12 = new yqn(vad0Var, 2);
                            aVar.r(objY12);
                        }
                        Function1 function11 = (Function1) objY12;
                        boolean zA14 = aVar.A(vad0Var);
                        Object objY13 = aVar.y();
                        if (zA14 || objY13 == c0042a) {
                            objY13 = new q9d0(vad0Var, 0);
                            aVar.r(objY13);
                        }
                        Function0 function12 = (Function0) objY13;
                        boolean zA15 = aVar.A(vad0Var);
                        Object objY14 = aVar.y();
                        if (zA15 || objY14 == c0042a) {
                            objY14 = new Function0() { // from class: r9d0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    vad0Var.V1();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY14);
                        }
                        Function0 function13 = (Function0) objY14;
                        boolean zA16 = aVar.A(vad0Var);
                        Object objY15 = aVar.y();
                        if (zA16 || objY15 == c0042a) {
                            objY15 = new h810(vad0Var, 1);
                            aVar.r(objY15);
                        }
                        x2a.a(iIntValue2, sl2Var, betContainerState2, t290VarJ1, multiplierResponse, function1, function2, function0, function3, resetChips, function4, function5, function6, function7, function8, zBooleanValue2, zBooleanValue, zBooleanValue3, function9, function10, function11, zBooleanValue4, str, function12, function13, (Function1) objY15, l1zVarE1, z, oswVar, null, false, 0, false, 0.0f, 0.0f, null, aVar, 0, 254);
                        aVar.s();
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    public static final class a implements zi0.b {
        public final /* synthetic */ ytw<Pair<Integer, Integer>> a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> d;
        public final /* synthetic */ float e;

        public a(float f, float f2, float f3, ytw ytwVar, ytw ytwVar2) {
            this.a = ytwVar;
            this.b = f;
            this.c = f2;
            this.d = ytwVar2;
            this.e = f3;
        }

        @Override // zi0.b
        public final void a(zi0.e eVar, whg whgVar) {
            if (whgVar != null) {
                System.out.print((Object) ("Animation state event " + whgVar));
            }
        }

        @Override // zi0.b
        public final void b(zi0.e eVar) {
            List listK = kotlin.collections.b.k(-1, 1);
            lx30.Companion companion = lx30.INSTANCE;
            double dDoubleValue = ((Number) CollectionsKt.k0(listK, companion)).doubleValue();
            companion.getClass();
            p4 p4Var = lx30.b;
            this.a.setValue(new Pair<>(Integer.valueOf((int) (p4Var.b() * ((double) this.b) * dDoubleValue)), Integer.valueOf((int) (p4Var.b() * ((double) this.c) * ((Number) CollectionsKt.k0(listK, companion)).doubleValue()))));
            ytw<com.esotericsoftware.spine.android.b> ytwVar = this.d;
            com.esotericsoftware.spine.android.b value = ytwVar.getValue();
            if (value != null) {
                value.a().a(0, "animation", false);
            }
            com.esotericsoftware.spine.android.b value2 = ytwVar.getValue();
            if (value2 != null) {
                value2.a().h = this.e;
            }
        }

        @Override // zi0.b
        public final void c(zi0.e eVar) {
        }
    }

    public static final class b implements zi0.b {
        public final /* synthetic */ ytw<Pair<Integer, Integer>> a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> d;
        public final /* synthetic */ float e;

        public b(float f, float f2, float f3, ytw ytwVar, ytw ytwVar2) {
            this.a = ytwVar;
            this.b = f;
            this.c = f2;
            this.d = ytwVar2;
            this.e = f3;
        }

        @Override // zi0.b
        public final void a(zi0.e eVar, whg whgVar) {
            if (whgVar != null) {
                System.out.print((Object) ("Animation state event " + whgVar));
            }
        }

        @Override // zi0.b
        public final void b(zi0.e eVar) {
            List listK = kotlin.collections.b.k(-1, 1);
            lx30.Companion companion = lx30.INSTANCE;
            double dDoubleValue = ((Number) CollectionsKt.k0(listK, companion)).doubleValue();
            companion.getClass();
            p4 p4Var = lx30.b;
            this.a.setValue(new Pair<>(Integer.valueOf((int) (p4Var.b() * ((double) this.b) * dDoubleValue)), Integer.valueOf((int) (p4Var.b() * ((double) this.c) * ((Number) CollectionsKt.k0(listK, companion)).doubleValue()))));
            ytw<com.esotericsoftware.spine.android.b> ytwVar = this.d;
            com.esotericsoftware.spine.android.b value = ytwVar.getValue();
            if (value != null) {
                value.a().a(0, "animation", false);
            }
            com.esotericsoftware.spine.android.b value2 = ytwVar.getValue();
            if (value2 != null) {
                value2.a().h = this.e;
            }
        }

        @Override // zi0.b
        public final void c(zi0.e eVar) {
        }
    }

    public static final class f implements zi0.b {
        public final /* synthetic */ ytw<com.esotericsoftware.spine.android.b> a;
        public final /* synthetic */ float b;
        public final /* synthetic */ ytw c;

        public f(float f, ytw ytwVar, ytw ytwVar2) {
            this.a = ytwVar;
            this.b = f;
            this.c = ytwVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // zi0.b
        public final void b(zi0.e eVar) {
            lh0 lh0Var = eVar.a;
            String str = lh0Var != null ? lh0Var.a : null;
            if (str == null) {
                str = "";
            }
            if (Intrinsics.g((String) this.c.getValue(), "ROUND_WAITING") || !str.equals("animation")) {
                return;
            }
            ytw<com.esotericsoftware.spine.android.b> ytwVar = this.a;
            com.esotericsoftware.spine.android.b value = ytwVar.getValue();
            if (value != null) {
                value.a().a(0, "animation", false);
            }
            com.esotericsoftware.spine.android.b value2 = ytwVar.getValue();
            if (value2 != null) {
                value2.a().h = this.b;
            }
        }

        @Override // zi0.b
        public final void c(zi0.e eVar) {
        }

        @Override // zi0.b
        public final void a(zi0.e eVar, whg whgVar) {
        }
    }
}
