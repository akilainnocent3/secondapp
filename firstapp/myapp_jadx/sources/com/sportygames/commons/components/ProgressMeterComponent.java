package com.sportygames.commons.components;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.components.ProgressMeterComponent;
import com.sportygames.lobby.remote.models.GameDetails;
import defpackage.b430;
import defpackage.bl60;
import defpackage.c0d;
import defpackage.dq40;
import defpackage.e9p;
import defpackage.ej5;
import defpackage.fq5;
import defpackage.fse;
import defpackage.gku;
import defpackage.i9p;
import defpackage.ib5;
import defpackage.j1b;
import defpackage.jvd0;
import defpackage.kpu;
import defpackage.o9n;
import defpackage.odd;
import defpackage.op5;
import defpackage.pfd;
import defpackage.r9n;
import defpackage.rk60;
import defpackage.s4u;
import defpackage.ssw;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v330;
import defpackage.v5b;
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
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JK\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010.\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b\u0013\u0010-R\"\u00102\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u001eR$\u0010:\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010=\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/sportygames/commons/components/ProgressMeterComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "gameNameSplit", JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, "", "isSoundOn", "isMusicOn", "Lrk60$b;", "fileType", "Lcom/sportygames/lobby/remote/models/GameDetails;", "gameDetails", "", "setSoundManager", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lrk60$b;Lcom/sportygames/lobby/remote/models/GameDetails;Landroid/content/Context;)V", "", "getBrandImageCMSArray", "()Ljava/util/Map;", "", "F", "I", "getCurrentProgress", "()I", "setCurrentProgress", "(I)V", "currentProgress", "Lssw;", "G", "Lssw;", "getLiveData", "()Lssw;", "setLiveData", "(Lssw;)V", "liveData", "Lrk60;", "H", "Lrk60;", "getSoundManager", "()Lrk60;", "(Lrk60;)V", "soundManager", "K", "getProgressForApi", "setProgressForApi", "progressForApi", "Lb430;", "L", "Lb430;", "getBinding", "()Lb430;", "setBinding", "(Lb430;)V", "binding", "M", "Z", "isProgressMeterVisible", "()Z", "setProgressMeterVisible", "(Z)V", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ProgressMeterComponent extends ConstraintLayout {
    public static final /* synthetic */ int N = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public int currentProgress;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public ssw<Integer> liveData;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public rk60 soundManager;
    public e9p I;
    public j1b J;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public int progressForApi;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public b430 binding;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public boolean isProgressMeterVisible;

    @c0d(c = "com.sportygames.commons.components.ProgressMeterComponent$imageDownload$1", f = "ProgressMeterComponent.kt", l = {281}, m = "invokeSuspend", v = 1)
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

    @c0d(c = "com.sportygames.commons.components.ProgressMeterComponent$imageDownloadGenericBy$1", f = "ProgressMeterComponent.kt", l = {302}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public dq40 a;
        public String[] b;
        public String c;
        public int d;
        public int e;
        public int f;
        public final /* synthetic */ e i;
        public final /* synthetic */ String v;
        public final /* synthetic */ String[] w;
        public final /* synthetic */ boolean y;
        public final /* synthetic */ ProgressMeterComponent z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, String str, String[] strArr, boolean z, ProgressMeterComponent progressMeterComponent, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.i = eVar;
            this.v = str;
            this.w = strArr;
            this.y = z;
            this.z = progressMeterComponent;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.i, this.v, this.w, this.y, this.z, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x004b  */
        /* JADX WARN: Code duplicated, block: B:16:0x006a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:25:0x007f A[Catch: Exception -> 0x00e0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00e0, blocks: (B:23:0x0079, B:25:0x007f), top: B:42:0x0079 }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00ea  */
        /* JADX WARN: Code duplicated, block: B:42:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v0, types: [T, xbg] */
        /* JADX WARN: Type inference failed for: r8v3, types: [T, xbg] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0068 -> B:6:0x0021). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
                Method dump skipped, instruction units count: 272
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.components.ProgressMeterComponent.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportygames.commons.components.ProgressMeterComponent$updateTime$1", f = "ProgressMeterComponent.kt", l = {55}, m = "invokeSuspend", v = 1)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public ProgressMeterComponent c;
        public int d;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return ProgressMeterComponent.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002a  */
        /* JADX WARN: Code duplicated, block: B:12:0x003a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x0043  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0038 -> B:13:0x003b). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.d
                r2 = 1
                if (r1 == 0) goto L1a
                if (r1 != r2) goto L13
                int r1 = r7.b
                int r3 = r7.a
                com.sportygames.commons.components.ProgressMeterComponent r4 = r7.c
                defpackage.uj50.b(r8)
                goto L3b
            L13:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                r7 = 0
                return r7
            L1a:
                defpackage.uj50.b(r8)
                com.sportygames.commons.components.ProgressMeterComponent r8 = com.sportygames.commons.components.ProgressMeterComponent.this
                int r1 = r8.getProgressForApi()
                r3 = 0
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r8
            L28:
                if (r1 >= r3) goto L54
                r7.c = r4
                r7.a = r3
                r7.b = r1
                r7.d = r2
                r5 = 200(0xc8, double:9.9E-322)
                java.lang.Object r8 = defpackage.hkd.b(r5, r7)
                if (r8 != r0) goto L3b
                return r0
            L3b:
                int r8 = r4.getCurrentProgress()
                r5 = 100
                if (r8 >= r5) goto L52
                int r8 = r4.getCurrentProgress()
                int r8 = r8 + r2
                r4.setCurrentProgress(r8)
                int r8 = r4.getCurrentProgress()
                r4.O(r8)
            L52:
                int r1 = r1 + r2
                goto L28
            L54:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sportygames.commons.components.ProgressMeterComponent.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressMeterComponent(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.liveData = new ssw<>();
        this.isProgressMeterVisible = true;
        this.binding = b430.a(LayoutInflater.from(context), this);
        L();
    }

    public static void M(ypa0 ypa0Var, Context context) {
        ypa0Var.getClass();
        String string = context.getString(R.string.sg_rush_rush_start_drum_roll);
        string.getClass();
        if (ypa0Var.a != null) {
            rk60 rk60VarY1 = ypa0Var.y1();
            try {
                MediaPlayer mediaPlayer = rk60VarY1.i;
                if (mediaPlayer != null) {
                    mediaPlayer.reset();
                    MediaPlayer mediaPlayer2 = rk60VarY1.i;
                    if (mediaPlayer2 == null) {
                        Intrinsics.n("infiniteSoundMediaPlayer");
                        throw null;
                    }
                    mediaPlayer2.setLooping(false);
                    String str = rk60VarY1.j;
                    if (str == null || str.length() == 0) {
                        pfd pfdVar = fse.a;
                        ej5.c(w5b.a(odd.b), null, null, new bl60(rk60VarY1, string, null), 3);
                    } else {
                        jvd0 jvd0Var = rk60VarY1.l;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                    }
                    String str2 = rk60VarY1.j;
                    if (str2 != null && str2.length() != 0) {
                        MediaPlayer mediaPlayerCreate = MediaPlayer.create(rk60VarY1.a, Uri.parse(rk60VarY1.j));
                        mediaPlayerCreate.getClass();
                        rk60VarY1.i = mediaPlayerCreate;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final Map<String, String> getBrandImageCMSArray() {
        return kpu.g(new Pair(getContext().getString(R.string.onboarding_brand_left_full_cms), "https://s.sporty.net/sportygames/cms/assets/militao_left_full_1721651992176.png"), new Pair(getContext().getString(R.string.onboarding_brand_right_full_cms), "https://s.sporty.net/sportygames/cms/assets/militao_right_full_1721652245969.png"), new Pair(getContext().getString(R.string.onboarding_brand_up_full_cms), "https://s.sporty.net/sportygames/cms/assets/militao_up_full_1721652336716.png"), new Pair(getContext().getString(R.string.onboarding_brand_left_half_cms), "https://s.sporty.net/sportygames/cms/assets/militao_left_half_1721652139005.png"), new Pair(getContext().getString(R.string.onboarding_brand_right_half_cms), "https://s.sporty.net/sportygames/cms/assets/militao_right_half_1721652291642.png"));
    }

    public final void E(fq5 fq5Var, ArrayList<String> arrayList, String str, String str2) {
        arrayList.getClass();
        str.getClass();
        str2.getClass();
        op5.a.getClass();
        op5.c = str;
        if (fq5Var != null) {
            Context context = getContext();
            context.getClass();
            fq5Var.x1(context, arrayList, str2);
        }
    }

    public final void F(Context context, String str) {
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

    public final void G(e eVar, String[] strArr, String str, boolean z) {
        strArr.getClass();
        pfd pfdVar = fse.a;
        ej5.c(w5b.a(gku.a), null, null, new b(eVar, str, strArr, z, this, null), 3);
    }

    public final void H(ypa0 ypa0Var) {
        ypa0Var.getClass();
        rk60 rk60Var = this.soundManager;
        if (rk60Var != null) {
            ypa0Var.F1(rk60Var, new v330());
        }
        P();
    }

    public final void I(String str, String str2, Boolean bool, rk60.b bVar, GameDetails gameDetails, Context context, final ypa0 ypa0Var, final Boolean bool2, final String str3) {
        str2.getClass();
        context.getClass();
        ypa0Var.getClass();
        str3.getClass();
        setSoundManager(str, str2, bool, bool2, bVar, gameDetails, context);
        rk60 rk60Var = this.soundManager;
        if (rk60Var != null) {
            ypa0Var.F1(rk60Var, new Function0() { // from class: t330
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i = ProgressMeterComponent.N;
                    Boolean bool3 = bool2;
                    if (bool3 == null || bool3.equals(Boolean.TRUE)) {
                        ypa0Var.A1(0L, str3);
                    }
                    return Unit.a;
                }
            });
        }
    }

    public final void J(String str, Boolean bool, Boolean bool2, GameDetails gameDetails, Context context, final ypa0 ypa0Var) {
        final ProgressMeterComponent progressMeterComponent;
        final Boolean bool3;
        final Context context2;
        rk60.b bVar = rk60.b.i;
        str.getClass();
        ypa0Var.getClass();
        try {
            if (bool2.booleanValue()) {
                progressMeterComponent = this;
                bool3 = bool2;
                context2 = context;
                progressMeterComponent.setSoundManager("Rush/", str, bool, bool3, bVar, gameDetails, context2);
            } else {
                progressMeterComponent = this;
                bool3 = bool2;
                context2 = context;
            }
            rk60 rk60Var = progressMeterComponent.soundManager;
            if (rk60Var != null) {
                ypa0Var.F1(rk60Var, new Function0(bool3, ypa0Var, context2, progressMeterComponent) { // from class: x330
                    public final /* synthetic */ Boolean a;
                    public final /* synthetic */ ypa0 b;
                    public final /* synthetic */ Context c;

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i = ProgressMeterComponent.N;
                        boolean zBooleanValue = this.a.booleanValue();
                        ypa0 ypa0Var2 = this.b;
                        Context context3 = this.c;
                        if (zBooleanValue) {
                            String string = context3.getString(R.string.sg_rush_rush_start_drum_roll);
                            string.getClass();
                            String string2 = context3.getString(R.string.sg_rush_rush_bg_music);
                            string2.getClass();
                            ypa0Var2.D1(string, string2);
                        } else {
                            ProgressMeterComponent.M(ypa0Var2, context3);
                        }
                        return Unit.a;
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    public final void K(ypa0 ypa0Var, Boolean bool, String str) {
        ypa0Var.getClass();
        str.getClass();
        if (bool == null || bool.equals(Boolean.TRUE)) {
            ypa0Var.A1(0L, str);
        }
    }

    public final void L() {
        e9p e9pVarA = i9p.a();
        this.I = e9pVarA;
        pfd pfdVar = fse.a;
        this.J = w5b.a(gku.a.plus(e9pVarA));
    }

    public final void N() {
        e9p e9pVar = this.I;
        if (e9pVar != null) {
            e9pVar.cancel((CancellationException) null);
        }
    }

    public final void O(int i) {
        b430 b430Var = this.binding;
        if (b430Var != null) {
            b430Var.b.setProgress(i);
        }
        b430 b430Var2 = this.binding;
        if (b430Var2 != null) {
            b430Var2.c.setText(i + "%");
        }
        this.currentProgress = i;
        this.liveData.j(Integer.valueOf(i));
    }

    public final void P() {
        j1b j1bVar = this.J;
        if (j1bVar != null) {
            ej5.c(j1bVar, null, null, new c(null), 3);
        }
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
        this.isProgressMeterVisible = z;
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
