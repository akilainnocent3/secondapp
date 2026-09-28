package com.sportygames.crash.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.crash.components.ProgressMeterComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import defpackage.b430;
import defpackage.c0d;
import defpackage.e9p;
import defpackage.ej5;
import defpackage.fq5;
import defpackage.fse;
import defpackage.gku;
import defpackage.i9p;
import defpackage.ib5;
import defpackage.kpu;
import defpackage.o9n;
import defpackage.odd;
import defpackage.op5;
import defpackage.pfd;
import defpackage.r9n;
import defpackage.rk60;
import defpackage.s330;
import defpackage.s4u;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.w330;
import defpackage.w5b;
import defpackage.y5b;
import defpackage.ypa0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b\u0013\u0010-R\"\u00102\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010;\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b;\u0010=\"\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lcom/sportygames/crash/components/ProgressMeterComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "gameNameSplit", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "", "isSoundOn", "isMusicOn", "Lrk60$b;", "fileType", "Lcom/sportygames/lobby/remote/models/GameDetails;", "gameDetails", "", "setSoundManager", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lrk60$b;Lcom/sportygames/lobby/remote/models/GameDetails;Landroid/content/Context;)V", "", "getBrandImageCMSArray", "()Ljava/util/Map;", "", "F", "I", "getCurrentProgress", "()I", "setCurrentProgress", "(I)V", "currentProgress", "Lssw;", "G", "Lssw;", "getLiveData", "()Lssw;", "setLiveData", "(Lssw;)V", "liveData", "Lrk60;", "H", "Lrk60;", "getSoundManager", "()Lrk60;", "(Lrk60;)V", "soundManager", "P", "getProgressForApi", "setProgressForApi", "progressForApi", "Lb430;", "Q", "Lb430;", "getBinding", "()Lb430;", "setBinding", "(Lb430;)V", "binding", "isProgressMeterVisible", "Z", "()Z", "setProgressMeterVisible", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressMeterComponent extends ConstraintLayout {
    public static final /* synthetic */ int R = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int currentProgress;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ssw<Integer> liveData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public rk60 soundManager;
    public e9p I;
    public int J;
    public float K;
    public float L;
    public boolean M;
    public long N;
    public final s330 O;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public int progressForApi;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public b430 binding;

    @c0d(c = "com.sportygames.crash.components.ProgressMeterComponent$imageDownload$1", f = "ProgressMeterComponent.kt", l = {388}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, Context context, String str) {
            super(2, v1bVar);
            this.b = context;
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(v1bVar, this.b, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2 = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s4u<String, Bitmap> s4uVar = r9n.a;
                this.a = 1;
                pfd pfdVar = fse.a;
                Object objD = ej5.d(odd.b, new o9n(null, this.b, this.c), this);
                if (objD != obj2) {
                    objD = Unit.a;
                }
                if (objD == obj2) {
                    return obj2;
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
    /* JADX WARN: Type inference failed for: r2v2, types: [s330] */
    public ProgressMeterComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.liveData = new ssw<>();
        this.O = new Choreographer.FrameCallback() { // from class: s330
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                ProgressMeterComponent progressMeterComponent = this.a;
                if (progressMeterComponent.M) {
                    long j2 = progressMeterComponent.N;
                    float fD = j2 == 0 ? 0.016666668f : f.d((j - j2) / 1.0E9f, 0.0f, 0.05f);
                    progressMeterComponent.N = j;
                    if (progressMeterComponent.J < 100) {
                        float f = progressMeterComponent.K;
                        if (f < 92.0f) {
                            progressMeterComponent.K = Math.min(92.0f, (12.0f * fD) + f);
                        }
                    }
                    float fMax = Math.max(progressMeterComponent.K, progressMeterComponent.J);
                    progressMeterComponent.K = fMax;
                    int i = progressMeterComponent.J;
                    if (i >= 100) {
                        progressMeterComponent.K = 100.0f;
                        fMax = 100.0f;
                    }
                    float f2 = progressMeterComponent.L;
                    if (f2 < fMax) {
                        float f3 = -((float) Math.expm1((-(i >= 100 ? 10.0f : 6.0f)) * fD));
                        float f4 = progressMeterComponent.L;
                        f2 = progressMeterComponent.K;
                        float fA = hxa.a(f2, f4, f3, f4);
                        progressMeterComponent.L = fA;
                        if (f2 - fA < 0.05f) {
                            progressMeterComponent.L = f2;
                        } else {
                            f2 = fA;
                        }
                    }
                    b430 b430Var = progressMeterComponent.binding;
                    if (b430Var != null) {
                        ProgressBar progressBar = b430Var.b;
                        progressBar.setProgress(f.e((int) (f2 * 10.0f), 0, 1000));
                        int iE = f.e((int) progressMeterComponent.L, 0, 100);
                        if (iE != progressMeterComponent.currentProgress) {
                            progressMeterComponent.E(iE);
                        }
                        if (progressMeterComponent.J >= 100 && progressMeterComponent.L >= 99.5f) {
                            progressMeterComponent.L = 100.0f;
                            progressBar.setProgress(1000);
                            progressMeterComponent.E(100);
                            progressMeterComponent.L();
                        }
                    }
                    if (progressMeterComponent.M) {
                        Choreographer.getInstance().postFrameCallback(progressMeterComponent.O);
                    }
                }
            }
        };
        b430 b430VarA = b430.a(LayoutInflater.from(context), this);
        this.binding = b430VarA;
        b430VarA.b.setMax(1000);
        K();
    }

    private final Map<String, String> getBrandImageCMSArray() {
        return kpu.g(new Pair(getContext().getString(R.string.onboarding_brand_left_full_cms), "https://s.sporty.net/sportygames/cms/assets/militao_left_full_1721651992176.png"), new Pair(getContext().getString(R.string.onboarding_brand_right_full_cms), "https://s.sporty.net/sportygames/cms/assets/militao_right_full_1721652245969.png"), new Pair(getContext().getString(R.string.onboarding_brand_up_full_cms), "https://s.sporty.net/sportygames/cms/assets/militao_up_full_1721652336716.png"), new Pair(getContext().getString(R.string.onboarding_brand_left_half_cms), "https://s.sporty.net/sportygames/cms/assets/militao_left_half_1721652139005.png"), new Pair(getContext().getString(R.string.onboarding_brand_right_half_cms), "https://s.sporty.net/sportygames/cms/assets/militao_right_half_1721652291642.png"));
    }

    public final void E(int i) {
        this.currentProgress = i;
        b430 b430Var = this.binding;
        if (b430Var != null) {
            b430Var.c.setText(i + "%");
        }
        this.liveData.m(Integer.valueOf(i));
    }

    public final void F(fq5 fq5Var, ArrayList<String> arrayList, String str, String str2) {
        arrayList.getClass();
        str.getClass();
        str2.getClass();
        op5.a.getClass();
        op5.c = str;
        if (this.J < 100) {
            this.K = Math.max(this.K, 8.0f);
            G();
        }
        if (fq5Var != null) {
            Context context = getContext();
            context.getClass();
            fq5Var.x1(context, arrayList, str2);
        }
    }

    public final void G() {
        if (this.M) {
            return;
        }
        this.M = true;
        this.N = 0L;
        Choreographer.getInstance().postFrameCallback(this.O);
    }

    public final void H(Context context, String str) {
        str.getClass();
        try {
            for (Map.Entry<String, String> entry : getBrandImageCMSArray().entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                op5.a.getClass();
                String strB = op5.b(key, value, null);
                if (strB.length() > 0) {
                    pfd pfdVar = fse.a;
                    ej5.c(w5b.a(gku.a), null, null, new a(null, context, strB), 3);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void I(ypa0 ypa0Var) {
        ypa0Var.getClass();
        rk60 rk60Var = this.soundManager;
        if (rk60Var != null) {
            ypa0Var.F1(rk60Var, new w330());
        }
        N();
    }

    public final void J(String str, String str2, Boolean bool, rk60.b bVar, GameDetails gameDetails, Context context, final ypa0 ypa0Var, final Boolean bool2, final String str3) {
        str2.getClass();
        ypa0Var.getClass();
        str3.getClass();
        setSoundManager(str, str2, bool, bool2, bVar, gameDetails, context);
        rk60 rk60Var = this.soundManager;
        if (rk60Var != null) {
            ypa0Var.F1(rk60Var, new Function0() { // from class: u330
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = ProgressMeterComponent.R;
                    Boolean bool3 = bool2;
                    if (bool3 == null || bool3.equals(Boolean.TRUE)) {
                        ypa0Var.A1(0L, str3);
                    }
                    return Unit.a;
                }
            });
        }
    }

    public final void K() {
        e9p e9pVar = this.I;
        if (e9pVar != null) {
            e9pVar.cancel((CancellationException) null);
        }
        e9p e9pVarA = i9p.a();
        this.I = e9pVarA;
        pfd pfdVar = fse.a;
        w5b.a(gku.a.plus(e9pVarA));
        int i = this.currentProgress;
        if (1 > i || i >= 100 || this.J >= i) {
            return;
        }
        this.J = i;
        this.K = Math.max(this.K, i);
        this.L = Math.max(this.L, this.currentProgress);
    }

    public final void L() {
        this.M = false;
        this.N = 0L;
        Choreographer.getInstance().removeFrameCallback(this.O);
    }

    public final void M(int i) {
        if (i <= 0) {
            L();
            this.J = 0;
            this.K = 0.0f;
            this.L = 0.0f;
            this.currentProgress = 0;
            b430 b430Var = this.binding;
            if (b430Var != null) {
                b430Var.b.setProgress(0);
            }
            b430 b430Var2 = this.binding;
            if (b430Var2 != null) {
                b430Var2.c.setText("0%");
            }
            this.liveData.j(0);
            this.K = 8.0f;
            G();
            return;
        }
        if (i >= 100) {
            this.J = 100;
            this.K = 100.0f;
            G();
            return;
        }
        L();
        this.J = i;
        float f = i;
        this.K = f;
        this.L = f;
        this.currentProgress = i;
        b430 b430Var3 = this.binding;
        if (b430Var3 != null) {
            b430Var3.b.setProgress(i * 10);
        }
        b430 b430Var4 = this.binding;
        if (b430Var4 != null) {
            b430Var4.c.setText(i + "%");
        }
        this.liveData.j(Integer.valueOf(this.currentProgress));
    }

    public final void N() {
        int i;
        int i2 = this.progressForApi;
        if (i2 <= 0 || (i = this.J) >= 100) {
            return;
        }
        int iMin = Math.min(100, i + i2);
        this.J = iMin;
        this.K = Math.max(this.K, iMin);
        G();
    }

    public final b430 getBinding() {
        return this.binding;
    }

    public final int getCurrentProgress() {
        return this.currentProgress;
    }

    public final ssw<Integer> getLiveData() {
        return this.liveData;
    }

    public final int getProgressForApi() {
        return this.progressForApi;
    }

    public final rk60 getSoundManager() {
        return this.soundManager;
    }

    public final void setBinding(b430 b430Var) {
        this.binding = b430Var;
    }

    public final void setCurrentProgress(int i) {
        this.currentProgress = i;
    }

    public final void setLiveData(ssw<Integer> sswVar) {
        sswVar.getClass();
        this.liveData = sswVar;
    }

    public final void setProgressForApi(int i) {
        this.progressForApi = i;
    }

    public final void setProgressMeterVisible(boolean z) {
    }

    public final void setSoundManager(String gameNameSplit, String gameName, Boolean isSoundOn, Boolean isMusicOn, rk60.b fileType, GameDetails gameDetails, Context context) {
        gameNameSplit.getClass();
        gameName.getClass();
        fileType.getClass();
        context.getClass();
        try {
            HashMap map = new HashMap();
            op5.a.getClass();
            for (Map.Entry entry : op5.a("sg_game_name").entrySet()) {
                rk60.b bVar = fileType;
                map.put(entry.getKey(), new rk60.a((String) entry.getValue(), (String) entry.getKey(), false, bVar, null));
                fileType = bVar;
            }
            op5.a.getClass();
            for (Map.Entry entry2 : op5.a("sg_common").entrySet()) {
                map.put(entry2.getKey(), new rk60.a((String) entry2.getValue(), (String) entry2.getKey(), false, rk60.b.b, null));
            }
            String lowerCase = gameName.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            this.soundManager = new rk60(context, lowerCase, map, isSoundOn != null ? isSoundOn.booleanValue() : false);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressMeterComponent(Context context) {
        this(context, null);
        context.getClass();
    }

    public final void setSoundManager(rk60 rk60Var) {
        this.soundManager = rk60Var;
    }
}
