package com.sportygames.commons.views;

import android.content.Intent;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.github.ybq.android.spinkit.SpinKitView;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.anTesting.data.model.CampaignParticipateV2;
import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.network.campaign.Campaign;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.commons.models.NetworkStateManager;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.commons.views.GameMainActivity;
import com.sportygames.compose.campaign.models.CampaignTopicResponse;
import com.sportygames.lobby.remote.models.GameDetails;
import com.sportygames.lobby.remote.models.LobbyMetaInfo;
import defpackage.a1b0;
import defpackage.a1s;
import defpackage.ae;
import defpackage.ay0;
import defpackage.b8b0;
import defpackage.bk60;
import defpackage.bmy;
import defpackage.bn80;
import defpackage.bri0;
import defpackage.bwb;
import defpackage.c0d;
import defpackage.c9u;
import defpackage.clj;
import defpackage.cyb;
import defpackage.db6;
import defpackage.dq7;
import defpackage.dug0;
import defpackage.e80;
import defpackage.eal;
import defpackage.ee;
import defpackage.ej5;
import defpackage.elf;
import defpackage.enb;
import defpackage.f3;
import defpackage.fgb;
import defpackage.fgg;
import defpackage.fm60;
import defpackage.fq5;
import defpackage.fse;
import defpackage.fuj;
import defpackage.g6i0;
import defpackage.g9i0;
import defpackage.gux;
import defpackage.gw30;
import defpackage.gz;
import defpackage.h5e;
import defpackage.hb5;
import defpackage.hua0;
import defpackage.hwr;
import defpackage.ib5;
import defpackage.ilj;
import defpackage.jej;
import defpackage.jq40;
import defpackage.kab0;
import defpackage.kc6;
import defpackage.kd8;
import defpackage.kej;
import defpackage.krh0;
import defpackage.l1z;
import defpackage.l560;
import defpackage.l8j0;
import defpackage.lfy;
import defpackage.m2g;
import defpackage.m410;
import defpackage.m9c0;
import defpackage.mk4;
import defpackage.mke;
import defpackage.n2j;
import defpackage.nn40;
import defpackage.noy;
import defpackage.nt4;
import defpackage.o0b;
import defpackage.odd;
import defpackage.oke;
import defpackage.op5;
import defpackage.op8;
import defpackage.pfd;
import defpackage.poy;
import defpackage.pr40;
import defpackage.q1c0;
import defpackage.q8i0;
import defpackage.qlf;
import defpackage.qlr;
import defpackage.qn70;
import defpackage.qnx;
import defpackage.qub0;
import defpackage.qve0;
import defpackage.r6i0;
import defpackage.r8i0;
import defpackage.rn30;
import defpackage.rrp;
import defpackage.s8i0;
import defpackage.sgk;
import defpackage.sjj;
import defpackage.ssw;
import defpackage.svg;
import defpackage.tgj;
import defpackage.tgp;
import defpackage.tje0;
import defpackage.tld0;
import defpackage.ttr;
import defpackage.txo;
import defpackage.u6j;
import defpackage.ud;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.umd0;
import defpackage.un20;
import defpackage.usx;
import defpackage.uu00;
import defpackage.uy1;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vad0;
import defpackage.vc60;
import defpackage.vj5;
import defpackage.vw4;
import defpackage.w5b;
import defpackage.whs;
import defpackage.wt4;
import defpackage.x7c0;
import defpackage.xc;
import defpackage.xjj;
import defpackage.xw4;
import defpackage.y5b;
import defpackage.ylb0;
import defpackage.ymn;
import defpackage.yo80;
import defpackage.ypa0;
import defpackage.yui0;
import defpackage.z8x;
import defpackage.zj60;
import defpackage.znf0;
import defpackage.zqy;
import defpackage.zy10;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/sportygames/commons/views/GameMainActivity;", "Luy1;", "Lyo80;", "Lcom/sportygames/commons/views/a$a;", "Lmke;", "Lxjj;", "<init>", "()V", "a", "b", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GameMainActivity extends uy1<yo80> implements com.sportygames.commons.views.a.InterfaceC0441a, mke, xjj {
    public static final /* synthetic */ int N = 0;
    public SharedPreferences A;
    public dug0 B;
    public qnx C;
    public kd8 D;
    public kej E;
    public g F;
    public h G;
    public defpackage.q H;
    public boolean I;
    public a J;
    public boolean K;
    public boolean L;
    public final ee<String[]> M;
    public final ttr c = hwr.a(a1s.c, new l());
    public final ttr d;
    public final q8i0 e;
    public final q8i0 f;
    public final ttr i;
    public b v;
    public tld0 w;
    public GameDetails y;
    public ypa0 z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("SPORTY_JET", 0);
            a = aVar;
            a aVar2 = new a("SPORTY_HERO", 1);
            b = aVar2;
            a aVar3 = new a("SPORTY_KICK", 2);
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

    public interface b {
        void I();

        void d0();

        void onActivityResult(int i, int i2, Intent intent);
    }

    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[wt4.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                wt4 wt4Var = wt4.UNKNOWN;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                wt4 wt4Var2 = wt4.UNKNOWN;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a aVar = a.a;
                iArr2[2] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a aVar2 = a.a;
                iArr2[0] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[Status.values().length];
            try {
                iArr3[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Status.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            a = iArr3;
        }
    }

    @c0d(c = "com.sportygames.commons.views.GameMainActivity$callAnTestApiForSH$1", f = "GameMainActivity.kt", l = {1262}, m = "invokeSuspend", v = 1)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return GameMainActivity.this.new d(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SharedPreferences.Editor editorEdit;
            SharedPreferences.Editor editorPutString;
            SharedPreferences.Editor editorEdit2;
            SharedPreferences.Editor editorPutString2;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                gz gzVar = new gz();
                this.a = 1;
                obj = gzVar.a("native_webview_test", this);
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
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                CampaignParticipateV2 campaignParticipateV2 = (CampaignParticipateV2) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                if (campaignParticipateV2 == null) {
                    return Unit.a;
                }
                int i2 = GameMainActivity.N;
                GameMainActivity gameMainActivity = GameMainActivity.this;
                SharedPreferences sharedPreferences = gameMainActivity.A;
                if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutString2 = editorEdit2.putString("sj_an_test_campaign_data", new eal().j(campaignParticipateV2))) != null) {
                    editorPutString2.apply();
                }
                String variantName = campaignParticipateV2.getVariantName();
                SharedPreferences sharedPreferences2 = gameMainActivity.A;
                if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null && (editorPutString = editorEdit.putString("sj_an_test_variant_name", variantName)) != null) {
                    editorPutString.apply();
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.views.GameMainActivity$callAnTestApiForSportyHero$1", f = "GameMainActivity.kt", l = {1308}, m = "invokeSuspend", v = 1)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return GameMainActivity.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SharedPreferences.Editor editorEdit;
            SharedPreferences.Editor editorPutString;
            SharedPreferences.Editor editorEdit2;
            SharedPreferences.Editor editorPutString2;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                gz gzVar = new gz();
                this.a = 1;
                obj = gzVar.a("native_webview_test_hero_kick", this);
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
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                CampaignParticipateV2 campaignParticipateV2 = (CampaignParticipateV2) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                if (campaignParticipateV2 == null) {
                    return Unit.a;
                }
                int i2 = GameMainActivity.N;
                GameMainActivity gameMainActivity = GameMainActivity.this;
                SharedPreferences sharedPreferences = gameMainActivity.A;
                if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutString2 = editorEdit2.putString("sh_an_test_campaign_data", new eal().j(campaignParticipateV2))) != null) {
                    editorPutString2.apply();
                }
                String variantName = campaignParticipateV2.getVariantName();
                SharedPreferences sharedPreferences2 = gameMainActivity.A;
                if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null && (editorPutString = editorEdit.putString("sh_an_test_variant_name", variantName)) != null) {
                    editorPutString.apply();
                }
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportygames.commons.views.GameMainActivity$callAnTestApiForSportyKick$1", f = "GameMainActivity.kt", l = {1354}, m = "invokeSuspend", v = 1)
    public static final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return GameMainActivity.this.new f(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            SharedPreferences.Editor editorEdit;
            SharedPreferences.Editor editorPutString;
            SharedPreferences.Editor editorEdit2;
            SharedPreferences.Editor editorPutString2;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                gz gzVar = new gz();
                this.a = 1;
                obj = gzVar.a("native_webview_test_hero_kick", this);
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
            ResultWrapper resultWrapper = (ResultWrapper) obj;
            if (resultWrapper instanceof ResultWrapper.Success) {
                CampaignParticipateV2 campaignParticipateV2 = (CampaignParticipateV2) ((HTTPResponse) ((ResultWrapper.Success) resultWrapper).getValue()).getData();
                if (campaignParticipateV2 == null) {
                    return Unit.a;
                }
                int i2 = GameMainActivity.N;
                GameMainActivity gameMainActivity = GameMainActivity.this;
                SharedPreferences sharedPreferences = gameMainActivity.A;
                if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutString2 = editorEdit2.putString("sk_an_test_campaign_data", new eal().j(campaignParticipateV2))) != null) {
                    editorPutString2.apply();
                }
                String variantName = campaignParticipateV2.getVariantName();
                SharedPreferences sharedPreferences2 = gameMainActivity.A;
                if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null && (editorPutString = editorEdit.putString("sk_an_test_variant_name", variantName)) != null) {
                    editorPutString.apply();
                }
            }
            return Unit.a;
        }
    }

    public static final class g implements poy {
        public final /* synthetic */ poy a;

        public g(poy poyVar) {
            this.a = poyVar;
        }

        @Override // defpackage.poy
        public final void a() {
            this.a.a();
        }
    }

    public static final class h implements noy {
        public final /* synthetic */ noy a;

        public h(noy noyVar) {
            this.a = noyVar;
        }

        @Override // defpackage.noy
        public final void a(boolean z) {
            this.a.a(z);
        }
    }

    public static final class i implements bn80.a {
        public i() {
        }

        @Override // bn80.a
        public final void a(xc xcVar) {
            GameMainActivity gameMainActivity = GameMainActivity.this;
            ttr ttrVar = gameMainActivity.i;
            xcVar.getClass();
            if (xcVar.equals(xc.b.a)) {
                int i = GameMainActivity.N;
                l1z l1zVar = (l1z) ttrVar.getValue();
                GameDetails gameDetails = gameMainActivity.y;
                if (gameDetails == null) {
                    Intrinsics.n("gameDetails");
                    throw null;
                }
                Integer id = gameDetails.getId();
                GameDetails gameDetails2 = gameMainActivity.y;
                if (gameDetails2 != null) {
                    l1zVar.e(id, gameDetails2.getName());
                    return;
                } else {
                    Intrinsics.n("gameDetails");
                    throw null;
                }
            }
            if (!xcVar.equals(xc.a.a)) {
                uhc.a();
                return;
            }
            int i2 = GameMainActivity.N;
            l1z l1zVar2 = (l1z) ttrVar.getValue();
            GameDetails gameDetails3 = gameMainActivity.y;
            if (gameDetails3 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            Integer id2 = gameDetails3.getId();
            GameDetails gameDetails4 = gameMainActivity.y;
            if (gameDetails4 != null) {
                l1zVar2.d(id2, gameDetails4.getName());
            } else {
                Intrinsics.n("gameDetails");
                throw null;
            }
        }
    }

    public static final class j implements Function0<f3> {
        public j() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [f3, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        public final f3 invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            mke mkeVar = GameMainActivity.this;
            if (mkeVar instanceof rrp) {
                qn70VarJ = ((rrp) mkeVar).j();
                dq7VarA = jq40.a(f3.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(f3.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    public static final class k implements Function0<l1z> {
        public k() {
        }

        /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, l1z] */
        @Override // kotlin.jvm.functions.Function0
        public final l1z invoke() {
            qn70 qn70VarJ;
            dq7 dq7VarA;
            mke mkeVar = GameMainActivity.this;
            if (mkeVar instanceof rrp) {
                qn70VarJ = ((rrp) mkeVar).j();
                dq7VarA = jq40.a(l1z.class);
                qn70VarJ.getClass();
            } else {
                qn70VarJ = sjj.b().c.d;
                dq7VarA = jq40.a(l1z.class);
            }
            return qn70VarJ.a(dq7VarA, null, null);
        }
    }

    public static final class l implements Function0<xw4> {
        public l() {
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [j8i0, xw4] */
        @Override // kotlin.jvm.functions.Function0
        public final xw4 invoke() {
            GameMainActivity gameMainActivity = GameMainActivity.this;
            return sgk.a(jq40.a(xw4.class), gameMainActivity.getViewModelStore(), gameMainActivity.getDefaultViewModelCreationExtras(), null, e80.a(gameMainActivity), null);
        }
    }

    public static final class m extends qlr implements Function0<r8i0.c> {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return GameMainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class n extends qlr implements Function0<v8i0> {
        public n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return GameMainActivity.this.getViewModelStore();
        }
    }

    public static final class o extends qlr implements Function0<cyb> {
        public o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return GameMainActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public static final class p extends qlr implements Function0<r8i0.c> {
        public p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return GameMainActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class q extends qlr implements Function0<v8i0> {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return GameMainActivity.this.getViewModelStore();
        }
    }

    public static final class r extends qlr implements Function0<cyb> {
        public r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return GameMainActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public GameMainActivity() {
        a1s a1sVar = a1s.a;
        this.d = hwr.a(a1sVar, new j());
        this.e = new q8i0(jq40.a(fuj.class), new n(), new m(), new o());
        this.f = new q8i0(jq40.a(db6.class), new q(), new p(), new r());
        this.i = hwr.a(a1sVar, new k());
        this.w = new tld0(null);
        this.J = a.a;
        this.K = true;
        this.M = registerForActivityResult(new ae(), new ud() { // from class: hlj
            @Override // defpackage.ud
            public final void a(Object obj) {
                Map map = (Map) obj;
                int i2 = GameMainActivity.N;
                map.getClass();
                boolean zIsEmpty = map.isEmpty();
                GameMainActivity gameMainActivity = this.a;
                if (!zIsEmpty) {
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                            GameMainActivity.h hVar = gameMainActivity.G;
                            if (hVar != null) {
                                hVar.a(false);
                                return;
                            }
                            return;
                        }
                    }
                }
                GameMainActivity.g gVar = gameMainActivity.F;
                if (gVar != null) {
                    gVar.a();
                }
            }
        });
    }

    public static final void A1(FrameLayout frameLayout) {
        ymn ymnVarG;
        clj cljVar = new clj();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        r6i0.d.n(frameLayout, cljVar);
        l8j0 l8j0VarA = r6i0.e.a(frameLayout);
        frameLayout.setPadding(0, 0, 0, (l8j0VarA == null || (ymnVarG = l8j0VarA.a.g(2)) == null) ? 0 : ymnVarG.d);
        r6i0.c.c(frameLayout);
    }

    public final void B1() {
        if (!this.I) {
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(odd.b), null, null, new d(null), 3);
        } else {
            defpackage.q qVar = this.H;
            if (qVar != null) {
                qVar.x1("native_webview_test");
            }
        }
    }

    public final void C1() {
        if (!this.I) {
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(odd.b), null, null, new e(null), 3);
        } else {
            defpackage.q qVar = this.H;
            if (qVar != null) {
                qVar.x1("native_webview_test_hero_kick");
            }
        }
    }

    public final void D1() {
        if (!this.I) {
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(odd.b), null, null, new f(null), 3);
        } else {
            defpackage.q qVar = this.H;
            if (qVar != null) {
                qVar.x1("native_webview_test_hero_kick");
            }
        }
    }

    public final void E1() {
        this.K = false;
    }

    public final void F1() {
        this.K = true;
    }

    public final xw4 G1() {
        return (xw4) this.c.getValue();
    }

    public final db6 H1() {
        return (db6) this.f.getValue();
    }

    public final kd8 I1() {
        kd8 kd8Var = this.D;
        if (kd8Var != null) {
            return kd8Var;
        }
        Intrinsics.n("gpsPermissionDialog");
        throw null;
    }

    public final void J1(poy poyVar, noy noyVar) {
        Object systemService = getSystemService(LastLoginDeviceInfo.KEY_LOCATION);
        systemService.getClass();
        if (!((LocationManager) systemService).isProviderEnabled("gps")) {
            noyVar.a(true);
            return;
        }
        for (int i2 = 0; i2 < 2; i2++) {
            String[] strArr = jej.a;
            if (o0b.a(this, strArr[i2]) != 0) {
                if (shouldShowRequestPermissionRationale("android.permission.ACCESS_FINE_LOCATION") || shouldShowRequestPermissionRationale("android.permission.ACCESS_COARSE_LOCATION")) {
                    noyVar.a(false);
                    return;
                }
                this.F = new g(poyVar);
                this.G = new h(noyVar);
                ee<String[]> eeVar = this.M;
                eeVar.getClass();
                eeVar.b(strArr);
                return;
            }
        }
        poyVar.a();
    }

    public final void K1(nt4 nt4Var) {
        ((f3) this.d.getValue()).a(new CommonGameDetails(null, null, null, nt4Var.a, null, null, null, null, nt4Var.f, Boolean.TRUE, null, null, null, null, null, null, null, null, null, null, null, false, false, null, 16776439, null), this, null);
    }

    public final void L1(String str, CampaignParticipateV2 campaignParticipateV2) {
        if (kotlin.text.c.l(str, "Native", true)) {
            R1(campaignParticipateV2);
        } else {
            V1(campaignParticipateV2 != null && campaignParticipateV2.getCanConvert(), campaignParticipateV2 != null ? Integer.valueOf(campaignParticipateV2.getCampaignId()) : null, campaignParticipateV2 != null ? Integer.valueOf(campaignParticipateV2.getVariantId()) : null, campaignParticipateV2 != null ? campaignParticipateV2.getVariantName() : null);
        }
    }

    public final void M1(String str, CampaignParticipateV2 campaignParticipateV2) {
        if (kotlin.text.c.l(str, "Native", true)) {
            S1(campaignParticipateV2);
        } else {
            V1(campaignParticipateV2 != null && campaignParticipateV2.getCanConvert(), campaignParticipateV2 != null ? Integer.valueOf(campaignParticipateV2.getCampaignId()) : null, campaignParticipateV2 != null ? Integer.valueOf(campaignParticipateV2.getVariantId()) : null, campaignParticipateV2 != null ? campaignParticipateV2.getVariantName() : null);
        }
    }

    public final void N1(String str, CampaignParticipateV2 campaignParticipateV2) {
        if (kotlin.text.c.l(str, "Native", true)) {
            T1(campaignParticipateV2);
        } else {
            V1(campaignParticipateV2 != null && campaignParticipateV2.getCanConvert(), campaignParticipateV2 != null ? Integer.valueOf(campaignParticipateV2.getCampaignId()) : null, campaignParticipateV2 != null ? Integer.valueOf(campaignParticipateV2.getVariantId()) : null, campaignParticipateV2 != null ? campaignParticipateV2.getVariantName() : null);
        }
    }

    public final void O1() {
        ssw<LoadingState<HTTPResponse<CampaignParticipateV2>>> sswVar;
        defpackage.q qVar = this.H;
        if (qVar == null || (sswVar = qVar.b) == null) {
            return;
        }
        sswVar.f(this, new lfy() { // from class: klj
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                SharedPreferences.Editor editorEdit;
                SharedPreferences.Editor editorPutString;
                SharedPreferences.Editor editorEdit2;
                SharedPreferences.Editor editorPutString2;
                SharedPreferences.Editor editorEdit3;
                SharedPreferences.Editor editorPutString3;
                SharedPreferences.Editor editorEdit4;
                SharedPreferences.Editor editorPutString4;
                SharedPreferences.Editor editorEdit5;
                SharedPreferences.Editor editorPutString5;
                SharedPreferences.Editor editorEdit6;
                SharedPreferences.Editor editorPutString6;
                LoadingState loadingState = (LoadingState) obj;
                int i2 = GameMainActivity.N;
                int i3 = GameMainActivity.c.a[loadingState.getStatus().ordinal()];
                GameMainActivity gameMainActivity = this.a;
                if (i3 == 1) {
                    if (gameMainActivity.I) {
                        gameMainActivity.c2(true);
                        return;
                    }
                    return;
                }
                if (i3 != 2) {
                    if (i3 != 3) {
                        uhc.a();
                        return;
                    }
                    if (gameMainActivity.I) {
                        gameMainActivity.c2(false);
                        int iOrdinal = gameMainActivity.J.ordinal();
                        if (iOrdinal == 0) {
                            gameMainActivity.S1(null);
                            return;
                        }
                        if (iOrdinal == 1) {
                            gameMainActivity.R1(null);
                            return;
                        } else if (iOrdinal == 2) {
                            gameMainActivity.T1(null);
                            return;
                        } else {
                            uhc.a();
                            return;
                        }
                    }
                    return;
                }
                if (gameMainActivity.I) {
                    gameMainActivity.c2(false);
                }
                HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
                CampaignParticipateV2 campaignParticipateV2 = hTTPResponse != null ? (CampaignParticipateV2) hTTPResponse.getData() : null;
                if (campaignParticipateV2 != null) {
                    int iOrdinal2 = gameMainActivity.J.ordinal();
                    if (iOrdinal2 == 0) {
                        SharedPreferences sharedPreferences = gameMainActivity.A;
                        if (sharedPreferences != null && (editorEdit2 = sharedPreferences.edit()) != null && (editorPutString2 = editorEdit2.putString("sj_an_test_campaign_data", new eal().j(campaignParticipateV2))) != null) {
                            editorPutString2.apply();
                        }
                        String variantName = campaignParticipateV2.getVariantName();
                        SharedPreferences sharedPreferences2 = gameMainActivity.A;
                        if (sharedPreferences2 != null && (editorEdit = sharedPreferences2.edit()) != null && (editorPutString = editorEdit.putString("sj_an_test_variant_name", variantName)) != null) {
                            editorPutString.apply();
                        }
                        if (gameMainActivity.I) {
                            gameMainActivity.M1(campaignParticipateV2.getVariantName(), campaignParticipateV2);
                            return;
                        }
                        return;
                    }
                    if (iOrdinal2 == 1) {
                        SharedPreferences sharedPreferences3 = gameMainActivity.A;
                        if (sharedPreferences3 != null && (editorEdit4 = sharedPreferences3.edit()) != null && (editorPutString4 = editorEdit4.putString("sh_an_test_campaign_data", new eal().j(campaignParticipateV2))) != null) {
                            editorPutString4.apply();
                        }
                        String variantName2 = campaignParticipateV2.getVariantName();
                        SharedPreferences sharedPreferences4 = gameMainActivity.A;
                        if (sharedPreferences4 != null && (editorEdit3 = sharedPreferences4.edit()) != null && (editorPutString3 = editorEdit3.putString("sh_an_test_variant_name", variantName2)) != null) {
                            editorPutString3.apply();
                        }
                        if (gameMainActivity.I) {
                            gameMainActivity.L1(campaignParticipateV2.getVariantName(), campaignParticipateV2);
                            return;
                        }
                        return;
                    }
                    if (iOrdinal2 != 2) {
                        uhc.a();
                        return;
                    }
                    SharedPreferences sharedPreferences5 = gameMainActivity.A;
                    if (sharedPreferences5 != null && (editorEdit6 = sharedPreferences5.edit()) != null && (editorPutString6 = editorEdit6.putString("sk_an_test_campaign_data", new eal().j(campaignParticipateV2))) != null) {
                        editorPutString6.apply();
                    }
                    String variantName3 = campaignParticipateV2.getVariantName();
                    SharedPreferences sharedPreferences6 = gameMainActivity.A;
                    if (sharedPreferences6 != null && (editorEdit5 = sharedPreferences6.edit()) != null && (editorPutString5 = editorEdit5.putString("sk_an_test_variant_name", variantName3)) != null) {
                        editorPutString5.apply();
                    }
                    if (gameMainActivity.I) {
                        gameMainActivity.N1(campaignParticipateV2.getVariantName(), campaignParticipateV2);
                    }
                }
            }
        });
    }

    public final void P1(nt4 nt4Var) {
        wt4 wt4Var = nt4Var.d;
        boolean z = nt4Var.j;
        String str = nt4Var.f;
        int iOrdinal = wt4Var.ordinal();
        if (iOrdinal == 0) {
            if (str.length() <= 0 || !z) {
                nt4Var = null;
            }
            if (nt4Var != null) {
                K1(nt4Var);
                return;
            } else {
                U1(G1().f);
                return;
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                uhc.a();
                return;
            }
            if (str.length() <= 0) {
                nt4Var = null;
            }
            if (nt4Var != null) {
                K1(nt4Var);
                return;
            }
            return;
        }
        if (str.length() <= 0 || !z) {
            nt4Var = null;
        }
        if (nt4Var != null) {
            K1(nt4Var);
            return;
        }
        CommonGameDetails commonGameDetails = G1().f;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        mk4 mk4Var = new mk4();
        Bundle bundle = new Bundle();
        bundle.putBundle("bonus_cup_bundle_key", vj5.a(new Pair("campaign_game_details_key", commonGameDetails)));
        mk4Var.setArguments(bundle);
        aVarA.f(R.id.main_game_container, mk4Var, null);
        aVarA.d();
    }

    public final void Q1() {
        GameDetails gameDetails = this.y;
        if (gameDetails == null) {
            Intrinsics.n("gameDetails");
            throw null;
        }
        u6j u6jVar = new u6j();
        u6jVar.c = gameDetails;
        this.v = u6jVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        b bVar = this.v;
        bVar.getClass();
        aVarA.f(R.id.main_game_container, (u6j) bVar, null);
        aVarA.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.Fragment, com.sportygames.commons.views.GameMainActivity$b] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.fragment.app.a, androidx.fragment.app.n] */
    public final void R1(CampaignParticipateV2 campaignParticipateV2) {
        ?? r2;
        double dV1 = uy1.v1(this);
        if (this.L) {
            GameDetails gameDetails = this.y;
            if (gameDetails == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            q1c0 q1c0Var = new q1c0();
            q1c0Var.W1 = gameDetails;
            q1c0Var.X1 = dV1;
            r2 = q1c0Var;
        } else {
            this.K = false;
            GameDetails gameDetails2 = this.y;
            if (gameDetails2 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            qub0 qub0Var = new qub0();
            qub0Var.i = gameDetails2;
            qub0Var.y2 = dV1;
            qub0Var.z2 = campaignParticipateV2;
            qub0Var.A2 = "native_webview_test_hero_kick";
            r2 = qub0Var;
        }
        this.v = r2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        ?? aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.main_game_container, r2, null);
        aVar.d();
    }

    @Override // defpackage.mke
    public final void S0(int i2) {
        krh0.k(this, i2);
    }

    public final void S1(CampaignParticipateV2 campaignParticipateV2) {
        GameDetails gameDetails = this.y;
        if (gameDetails == null) {
            Intrinsics.n("gameDetails");
            throw null;
        }
        x7c0 x7c0Var = new x7c0();
        x7c0Var.i = gameDetails;
        x7c0Var.A2 = campaignParticipateV2;
        x7c0Var.B2 = "native_webview_test";
        this.v = x7c0Var;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.main_game_container, x7c0Var, null);
        aVar.d();
    }

    public final void T1(CampaignParticipateV2 campaignParticipateV2) {
        GameDetails gameDetails = this.y;
        if (gameDetails == null) {
            Intrinsics.n("gameDetails");
            throw null;
        }
        m9c0 m9c0Var = new m9c0();
        m9c0Var.i = gameDetails;
        m9c0Var.B2 = campaignParticipateV2;
        m9c0Var.C2 = "native_webview_test_hero_kick";
        this.v = m9c0Var;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.f(R.id.main_game_container, m9c0Var, null);
        aVar.d();
    }

    public final void U1(CommonGameDetails commonGameDetails) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarA = oke.a(supportFragmentManager, supportFragmentManager);
        umd0 umd0Var = new umd0();
        Bundle bundle = new Bundle();
        bundle.putBundle("stacker_bundle_key", vj5.a(new Pair("campaign_game_details_key", commonGameDetails)));
        umd0Var.setArguments(bundle);
        aVarA.f(R.id.main_game_container, umd0Var, null);
        aVarA.d();
    }

    public final void V1(boolean z, Integer num, Integer num2, String str) {
        Serializable serializableValueOf;
        try {
            Intent intent = new Intent(this, (Class<?>) MainActivity.class);
            GameDetails gameDetails = this.y;
            if (gameDetails == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            intent.putExtra("url", gameDetails.getLaunchUrl());
            GameDetails gameDetails2 = this.y;
            if (gameDetails2 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            LobbyMetaInfo metaInfo = gameDetails2.getMetaInfo();
            if (metaInfo == null || (serializableValueOf = metaInfo.getToolbarColor()) == null) {
                serializableValueOf = Integer.valueOf(getColor(R.color.sb_black));
            }
            intent.putExtra("toolbar_clr", serializableValueOf);
            GameDetails gameDetails3 = this.y;
            if (gameDetails3 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            intent.putExtra("g_name", gameDetails3.getDisplayName());
            GameDetails gameDetails4 = this.y;
            if (gameDetails4 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            intent.putExtra("name", gameDetails4.getName());
            GameDetails gameDetails5 = this.y;
            if (gameDetails5 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            intent.putExtra("g_id", gameDetails5.getId());
            intent.putExtra("source", getIntent().getStringExtra("source"));
            intent.putExtra("is_an_test_latency_tracking_enabled", z);
            if (num != null) {
                intent.putExtra("campaign_id", num.intValue());
            }
            if (num2 != null) {
                intent.putExtra("variant_id", num2.intValue());
            }
            if (str != null) {
                intent.putExtra("variant", str);
            }
            startActivity(intent);
            finish();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final void W1() {
        String string;
        SharedPreferences sharedPreferences = this.A;
        if (sharedPreferences == null || (string = sharedPreferences.getString("sh_an_test_variant_name", "NOT_SET")) == null) {
            string = "NOT_SET";
        }
        if (string.equals("NOT_SET")) {
            this.I = true;
            this.J = a.b;
            C1();
            return;
        }
        this.I = false;
        CampaignParticipateV2 campaignParticipateV2 = null;
        try {
            SharedPreferences sharedPreferences2 = this.A;
            String string2 = sharedPreferences2 != null ? sharedPreferences2.getString("sh_an_test_campaign_data", null) : null;
            if (string2 != null && !StringsKt.U(string2)) {
                campaignParticipateV2 = (CampaignParticipateV2) new eal().e(string2, CampaignParticipateV2.class);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        L1(string, campaignParticipateV2);
        C1();
    }

    public final void X1() {
        String string;
        SharedPreferences sharedPreferences = this.A;
        if (sharedPreferences == null || (string = sharedPreferences.getString("sj_an_test_variant_name", "NOT_SET")) == null) {
            string = "NOT_SET";
        }
        if (string.equals("NOT_SET")) {
            this.I = true;
            this.J = a.a;
            B1();
            return;
        }
        this.I = false;
        CampaignParticipateV2 campaignParticipateV2 = null;
        try {
            SharedPreferences sharedPreferences2 = this.A;
            String string2 = sharedPreferences2 != null ? sharedPreferences2.getString("sj_an_test_campaign_data", null) : null;
            if (string2 != null && !StringsKt.U(string2)) {
                campaignParticipateV2 = (CampaignParticipateV2) new eal().e(string2, CampaignParticipateV2.class);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        M1(string, campaignParticipateV2);
        B1();
    }

    public final void Y1() {
        String string;
        SharedPreferences sharedPreferences = this.A;
        if (sharedPreferences == null || (string = sharedPreferences.getString("sk_an_test_variant_name", "NOT_SET")) == null) {
            string = "NOT_SET";
        }
        if (string.equals("NOT_SET")) {
            this.I = true;
            this.J = a.c;
            D1();
            return;
        }
        this.I = false;
        CampaignParticipateV2 campaignParticipateV2 = null;
        try {
            SharedPreferences sharedPreferences2 = this.A;
            String string2 = sharedPreferences2 != null ? sharedPreferences2.getString("sk_an_test_campaign_data", null) : null;
            if (string2 != null && !StringsKt.U(string2)) {
                campaignParticipateV2 = (CampaignParticipateV2) new eal().e(string2, CampaignParticipateV2.class);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        N1(string, campaignParticipateV2);
        D1();
    }

    public final void Z1() {
        getLifecycle().a(new bn80(this, new i()));
    }

    public final void a2(kd8 kd8Var) {
        this.D = kd8Var;
    }

    public final void b2(final boolean z) {
        kd8 kd8VarI1 = I1();
        op5 op5Var = op5.a;
        String string = getString(R.string.error_location_permission_title_cms);
        string.getClass();
        String string2 = getString(R.string.error_location_permission_title_text);
        string2.getClass();
        op5Var.getClass();
        String strB = op5.b(string, string2, null);
        String string3 = getString(R.string.error_location_permission_msg_cms);
        string3.getClass();
        String string4 = getString(R.string.error_location_permission_msg_text);
        string4.getClass();
        String strB2 = op5.b(string3, string4, null);
        String string5 = getString(R.string.action_open_settings_cms);
        string5.getClass();
        String string6 = getString(R.string.action_open_settings_text);
        string6.getClass();
        String strB3 = op5.b(string5, string6, null);
        String string7 = getString(R.string.cancel_btn_cms);
        string7.getClass();
        String string8 = getString(R.string.cancel_btn_text);
        string8.getClass();
        kd8.b(kd8VarI1, strB, strB2, strB3, op5.b(string7, string8, null), new Function0() { // from class: glj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = GameMainActivity.N;
                GameMainActivity gameMainActivity = this.a;
                Intent intent = z ? new Intent("android.settings.LOCATION_SOURCE_SETTINGS") : new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", gameMainActivity.getPackageName(), null));
                intent.addFlags(268435456);
                gameMainActivity.startActivity(intent);
                return Unit.a;
            }
        }, new ilj(), getColor(R.color.try_again_color), new Function0() { // from class: jlj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                SportyGamesManager sportyGamesManager;
                int i2 = GameMainActivity.N;
                GameMainActivity gameMainActivity = this.a;
                if (!gameMainActivity.x1() && (sportyGamesManager = SportyGamesManager.getInstance()) != null) {
                    sportyGamesManager.exit();
                }
                gameMainActivity.finish();
                return Unit.a;
            }
        });
        if (I1().isShowing()) {
            return;
        }
        I1().a();
    }

    public final void c2(boolean z) {
        int i2 = z ? 0 : 8;
        yo80 yo80Var = (yo80) this.a;
        if (yo80Var != null) {
            yo80Var.c.setVisibility(i2);
        }
        yo80 yo80Var2 = (yo80) this.a;
        if (yo80Var2 != null) {
            yo80Var2.d.setVisibility(i2);
        }
    }

    public final void d2() {
        FrameLayout frameLayout;
        yo80 yo80Var = (yo80) this.a;
        if (yo80Var == null || (frameLayout = yo80Var.a) == null) {
            return;
        }
        if (this.K) {
            qlf.b(frameLayout);
        } else {
            frameLayout.setPadding(0, 0, 0, 0);
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        ypa0 ypa0Var = this.z;
        if (ypa0Var != null) {
            if (ypa0Var == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            ypa0Var.I1();
            ypa0 ypa0Var2 = this.z;
            if (ypa0Var2 == null) {
                Intrinsics.n("soundViewModel");
                throw null;
            }
            ypa0Var2.G1();
        }
        super.finish();
    }

    @Override // androidx.fragment.app.e, defpackage.rn8, android.app.Activity
    public final void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        for (Fragment fragment : getSupportFragmentManager().c.f()) {
            b bVar = this.v;
            if (bVar != null) {
                bVar.onActivityResult(i2, i3, intent);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:84:0x0161  */
    @Override // defpackage.uy1
    public final boolean onBackPressedCompat() {
        zj60 bridge;
        Fragment fragmentG = getSupportFragmentManager().G(R.id.main_game_container);
        Fragment fragmentG2 = getSupportFragmentManager().G(R.id.flContent);
        int iL = getSupportFragmentManager().L();
        boolean z = true;
        if ((fragmentG instanceof nn40) && iL == 0) {
            ((nn40) fragmentG).v0(null);
        } else if ((fragmentG instanceof b8b0) && iL == 0) {
            ((b8b0) fragmentG).t0(null);
        } else if ((fragmentG instanceof fgg) && iL == 0) {
            ((fgg) fragmentG).t0(null);
        } else if ((fragmentG instanceof l560) && iL == 0) {
            ((l560) fragmentG).z0(null);
        } else if ((fragmentG instanceof q1c0) && iL == 0) {
            ((q1c0) fragmentG).a1(null);
        } else if ((fragmentG instanceof a1b0) && iL == 0) {
            ((a1b0) fragmentG).t0(null);
        } else if ((fragmentG instanceof kab0) && iL == 0) {
            ((kab0) fragmentG).r0(null);
        } else if ((fragmentG instanceof u6j) && iL == 0) {
            ((n2j) fragmentG).q0(null);
        } else if (fragmentG instanceof zy10) {
            ((zy10) fragmentG).S0(null);
        } else if (fragmentG instanceof m410) {
            ((m410) fragmentG).K0(null);
        } else if ((fragmentG instanceof c9u) && iL == 0) {
            ((yui0) ((c9u) fragmentG).b.getValue()).J1(new bri0.i(z));
        } else if ((fragmentG instanceof znf0) && iL == 0) {
            ((znf0) fragmentG).m0().z1(new qve0.h(null, true));
        } else if ((fragmentG instanceof usx) && iL == 0) {
            ((gux) ((usx) fragmentG).b.getValue()).z1(z8x.g.a);
        } else if ((fragmentG instanceof pr40) && iL == 0) {
            ((pr40) fragmentG).m0().A1(rn30.g.a);
        } else if ((fragmentG instanceof hua0) && iL == 0) {
            ((hua0) fragmentG).m0().A1(vc60.k.a);
        } else if ((fragmentG instanceof fgb) && iL == 0) {
            ((fgb) fragmentG).N0(null);
        } else if ((fragmentG instanceof enb) && iL == 0) {
            ((enb) fragmentG).o0(null);
        } else if (fragmentG2 instanceof com.sportygames.commons.components.a) {
            com.sportygames.commons.components.a aVar = (com.sportygames.commons.components.a) fragmentG2;
            if (aVar.e) {
                finish();
            } else if (!aVar.isAdded() || !aVar.isVisible() || (!Intrinsics.g(aVar.b, "one tap bet") && !Intrinsics.g(aVar.b, "place bet") && !Intrinsics.g(aVar.b, "auto bet"))) {
                z = false;
            }
        } else if (fragmentG2 instanceof fm60) {
            fm60 fm60Var = (fm60) fragmentG2;
            if (fm60Var.i) {
                finish();
            } else if (!fm60Var.isAdded() || !fm60Var.isVisible() || !Intrinsics.g(fm60Var.b, "one tap bet")) {
                z = false;
            }
        } else if (fragmentG2 instanceof com.sportygames.pingpong.components.a) {
            com.sportygames.pingpong.components.a aVar2 = (com.sportygames.pingpong.components.a) fragmentG2;
            if (aVar2.v) {
                finish();
            } else if (!aVar2.isAdded() || !aVar2.isVisible() || !Intrinsics.g(aVar2.b, "one tap bet")) {
                z = false;
            }
        } else if (fragmentG2 instanceof svg) {
            finish();
        } else {
            if (fragmentG2 instanceof gw30) {
                dug0 dug0Var = this.B;
                if (dug0Var == null) {
                    Intrinsics.n("transitionViewModel");
                    throw null;
                }
                dug0Var.a.m(Boolean.TRUE);
            }
            z = false;
        }
        GameDetails gameDetails = this.y;
        if (gameDetails == null) {
            Intrinsics.n("gameDetails");
            throw null;
        }
        Bundle bundleA = whs.a(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, gameDetails.getName(), "user_state", SportyGamesManager.getInstance().getUser() != null ? "logged-in" : "non logged-in");
        SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
        if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
            ((bk60) bridge).a("back_in_game", bundleA);
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.uy1, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        List listH;
        zj60 bridge;
        super.onCreate(bundle);
        elf.b(this, null, 3);
        F1();
        this.A = un20.a(this);
        SportyGamesManager.setApplicationContext(this);
        v8i0 viewModelStore = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
        viewModelStore.getClass();
        defaultViewModelProviderFactory.getClass();
        defaultViewModelCreationExtras.getClass();
        s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
        dq7 dq7VarD = tgp.d(ypa0.class);
        String strB = kc6.b(dq7VarD);
        if (strB == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.z = (ypa0) s8i0Var.a(dq7VarD, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB));
        v8i0 viewModelStore2 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory2 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras2 = getDefaultViewModelCreationExtras();
        viewModelStore2.getClass();
        defaultViewModelProviderFactory2.getClass();
        defaultViewModelCreationExtras2.getClass();
        s8i0 s8i0Var2 = new s8i0(viewModelStore2, defaultViewModelProviderFactory2, defaultViewModelCreationExtras2);
        dq7 dq7VarD2 = tgp.d(fq5.class);
        String strB2 = kc6.b(dq7VarD2);
        if (strB2 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        v8i0 viewModelStore3 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory3 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras3 = getDefaultViewModelCreationExtras();
        viewModelStore3.getClass();
        defaultViewModelProviderFactory3.getClass();
        defaultViewModelCreationExtras3.getClass();
        s8i0 s8i0Var3 = new s8i0(viewModelStore3, defaultViewModelProviderFactory3, defaultViewModelCreationExtras3);
        dq7 dq7VarD3 = tgp.d(dug0.class);
        String strB3 = kc6.b(dq7VarD3);
        if (strB3 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.B = (dug0) s8i0Var3.a(dq7VarD3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB3));
        v8i0 viewModelStore4 = getViewModelStore();
        r8i0.c defaultViewModelProviderFactory4 = getDefaultViewModelProviderFactory();
        cyb defaultViewModelCreationExtras4 = getDefaultViewModelCreationExtras();
        viewModelStore4.getClass();
        defaultViewModelProviderFactory4.getClass();
        defaultViewModelCreationExtras4.getClass();
        s8i0 s8i0Var4 = new s8i0(viewModelStore4, defaultViewModelProviderFactory4, defaultViewModelCreationExtras4);
        dq7 dq7VarD4 = tgp.d(defpackage.q.class);
        String strB4 = kc6.b(dq7VarD4);
        if (strB4 == null) {
            hb5.a("Local and anonymous classes can not be ViewModels");
            return;
        }
        this.H = (defpackage.q) s8i0Var4.a(dq7VarD4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strB4));
        Parcelable parcelableExtra = getIntent().getParcelableExtra("gameDetail");
        parcelableExtra.getClass();
        this.y = (GameDetails) parcelableExtra;
        Intent intent = getIntent();
        intent.getClass();
        this.L = txo.a(intent);
        getSupportFragmentManager().G(R.id.main_game_container);
        try {
            qnx qnxVar = new qnx(this);
            this.C = qnxVar;
            qnxVar.a();
            Unit unit = Unit.a;
            qnx qnxVar2 = this.C;
            if (qnxVar2 != null) {
                qnxVar2.b();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.E = new kej(this);
        a2(new kd8(this));
        Z1();
        O1();
        if (SportyGamesManager.getInstance().getCountry() == null) {
            Bundle bundle2 = new Bundle();
            GameDetails gameDetails = this.y;
            if (gameDetails == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            bundle2.putString(AnalyticsParam.GAMES_RECOMMENDATION_GAME_NAME, gameDetails.getName());
            SportyGamesManager sportyGamesManager = SportyGamesManager.getInstance();
            if (sportyGamesManager != null && (bridge = sportyGamesManager.getBridge()) != null) {
                ((bk60) bridge).a("game_background", bundle2);
            }
            finish();
        }
        try {
            GameDetails gameDetails2 = this.y;
            if (gameDetails2 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            String launchUrl = gameDetails2.getLaunchUrl();
            List listSplit$default = launchUrl != null ? StringsKt__StringsKt.split$default(launchUrl, new String[]{"sportygames/"}, false, 0, 6, null) : null;
            if (listSplit$default == null) {
                try {
                    listH = kotlin.collections.b.h();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } else {
                listH = listSplit$default;
            }
            CharSequence charSequence = (CharSequence) CollectionsKt.V(1, listH);
            if (charSequence == null || charSequence.length() == 0) {
                GameDetails gameDetails3 = this.y;
                if (gameDetails3 == null) {
                    Intrinsics.n("gameDetails");
                    throw null;
                }
                String launchUrl2 = gameDetails3.getLaunchUrl();
                listSplit$default = launchUrl2 != null ? StringsKt__StringsKt.split$default(launchUrl2, new String[]{"games/"}, false, 0, 6, null) : null;
            }
            op5 op5Var = op5.a;
            GameDetails gameDetails4 = this.y;
            if (gameDetails4 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            LobbyMetaInfo metaInfo = gameDetails4.getMetaInfo();
            Long minimumCMSVersionSupported = metaInfo != null ? metaInfo.getMinimumCMSVersionSupported() : null;
            op5Var.getClass();
            op5.d = minimumCMSVersionSupported;
            String str = listSplit$default != null ? (String) listSplit$default.get(1) : null;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1909157676:
                        if (str.equals("wheel-and-deal")) {
                            E1();
                            GameDetails gameDetails5 = this.y;
                            if (gameDetails5 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            c9u c9uVar = new c9u();
                            Bundle bundle3 = new Bundle();
                            bundle3.putParcelable("key_game_details", gameDetails5);
                            c9uVar.setArguments(bundle3);
                            this.v = c9uVar;
                            androidx.fragment.app.a aVarD = getSupportFragmentManager().d();
                            b bVar = this.v;
                            bVar.getClass();
                            aVarD.g((c9u) bVar);
                            aVarD.d();
                        }
                        break;
                    case -1790437656:
                        if (str.equals("pocket-rockets")) {
                            E1();
                            GameDetails gameDetails6 = this.y;
                            if (gameDetails6 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            zy10 zy10Var = new zy10();
                            zy10Var.B = gameDetails6;
                            this.v = zy10Var;
                            androidx.fragment.app.a aVarD2 = getSupportFragmentManager().d();
                            GameDetails gameDetails7 = this.y;
                            if (gameDetails7 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            zy10 zy10Var2 = new zy10();
                            zy10Var2.B = gameDetails7;
                            aVarD2.g(zy10Var2);
                            aVarD2.d();
                        }
                        break;
                    case -1785694847:
                        if (str.equals("piggy-bash")) {
                            GameDetails gameDetails8 = this.y;
                            if (gameDetails8 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            String name = gameDetails8.getName();
                            uu00 uu00Var = new uu00();
                            Bundle bundle4 = new Bundle();
                            bundle4.putString("key_game_name", name);
                            uu00Var.setArguments(bundle4);
                            this.v = uu00Var;
                            androidx.fragment.app.a aVarD3 = getSupportFragmentManager().d();
                            b bVar2 = this.v;
                            bVar2.getClass();
                            aVarD3.g((uu00) bVar2);
                            aVarD3.d();
                        }
                        break;
                    case -851464579:
                        if (str.equals("Bonus Cup")) {
                            androidx.fragment.app.a aVarD4 = getSupportFragmentManager().d();
                            mk4 mk4Var = new mk4();
                            Bundle bundle5 = new Bundle();
                            bundle5.putBundle("bonus_cup_bundle_key", vj5.a(new Pair("campaign_game_details_key", null)));
                            mk4Var.setArguments(bundle5);
                            aVarD4.g(mk4Var);
                            aVarD4.d();
                        }
                        break;
                    case -588142133:
                        if (str.equals("refs-call")) {
                            E1();
                            GameDetails gameDetails9 = this.y;
                            if (gameDetails9 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            pr40 pr40Var = new pr40();
                            Bundle bundle6 = new Bundle();
                            bundle6.putParcelable("key_game_details", gameDetails9);
                            pr40Var.setArguments(bundle6);
                            this.v = pr40Var;
                            androidx.fragment.app.a aVarD5 = getSupportFragmentManager().d();
                            b bVar3 = this.v;
                            bVar3.getClass();
                            aVarD5.g((pr40) bVar3);
                            aVarD5.d();
                        }
                        break;
                    case -472570225:
                        if (str.equals("the-goldmine")) {
                            E1();
                            GameDetails gameDetails10 = this.y;
                            if (gameDetails10 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            znf0 znf0Var = new znf0();
                            Bundle bundle7 = new Bundle();
                            bundle7.putParcelable("key_game_details", gameDetails10);
                            znf0Var.setArguments(bundle7);
                            this.v = znf0Var;
                            androidx.fragment.app.a aVarD6 = getSupportFragmentManager().d();
                            b bVar4 = this.v;
                            bVar4.getClass();
                            aVarD6.g((znf0) bVar4);
                            aVarD6.d();
                        }
                        break;
                    case -424980621:
                        if (str.equals("ping-pong")) {
                            GameDetails gameDetails11 = this.y;
                            if (gameDetails11 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            m410 m410Var = new m410();
                            m410Var.r1 = gameDetails11;
                            this.v = m410Var;
                            androidx.fragment.app.a aVarD7 = getSupportFragmentManager().d();
                            GameDetails gameDetails12 = this.y;
                            if (gameDetails12 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            m410 m410Var2 = new m410();
                            m410Var2.r1 = gameDetails12;
                            aVarD7.g(m410Var2);
                            aVarD7.d();
                        }
                        break;
                    case -232987371:
                        if (str.equals("Stacker") && vw4.a(this)) {
                            androidx.fragment.app.a aVarD8 = getSupportFragmentManager().d();
                            umd0 umd0Var = new umd0();
                            Bundle bundle8 = new Bundle();
                            bundle8.putBundle("stacker_bundle_key", vj5.a(new Pair("campaign_game_details_key", null)));
                            umd0Var.setArguments(bundle8);
                            aVarD8.g(umd0Var);
                            aVarD8.d();
                        }
                        break;
                    case -23008317:
                        if (str.equals("red-black")) {
                            GameDetails gameDetails13 = this.y;
                            if (gameDetails13 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            nn40 nn40Var = new nn40();
                            nn40Var.H = gameDetails13;
                            this.v = nn40Var;
                            androidx.fragment.app.a aVarD9 = getSupportFragmentManager().d();
                            GameDetails gameDetails14 = this.y;
                            if (gameDetails14 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            nn40 nn40Var2 = new nn40();
                            nn40Var2.H = gameDetails14;
                            aVarD9.g(nn40Var2);
                            aVarD9.d();
                        }
                        break;
                    case 3512280:
                        if (str.equals("rush")) {
                            GameDetails gameDetails15 = this.y;
                            if (gameDetails15 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            l560 l560Var = new l560();
                            l560Var.S = gameDetails15;
                            this.v = l560Var;
                            androidx.fragment.app.a aVarD10 = getSupportFragmentManager().d();
                            GameDetails gameDetails16 = this.y;
                            if (gameDetails16 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            l560 l560Var2 = new l560();
                            l560Var2.S = gameDetails16;
                            aVarD10.g(l560Var2);
                            aVarD10.d();
                        }
                        break;
                    case 13143121:
                        if (str.equals("sporty-jet")) {
                            E1();
                            X1();
                        }
                        break;
                    case 22313157:
                        if (str.equals("galaxy-go")) {
                            E1();
                            GameDetails gameDetails17 = this.y;
                            if (gameDetails17 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            tgj tgjVar = new tgj();
                            tgjVar.i = gameDetails17;
                            this.v = tgjVar;
                            androidx.fragment.app.a aVarD11 = getSupportFragmentManager().d();
                            GameDetails gameDetails18 = this.y;
                            if (gameDetails18 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            tgj tgjVar2 = new tgj();
                            tgjVar2.i = gameDetails18;
                            aVarD11.g(tgjVar2);
                            aVarD11.d();
                        }
                        break;
                    case 276018684:
                        if (str.equals("even-odd")) {
                            GameDetails gameDetails19 = this.y;
                            if (gameDetails19 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            fgg fggVar = new fgg();
                            fggVar.i = gameDetails19;
                            this.v = fggVar;
                            androidx.fragment.app.a aVarD12 = getSupportFragmentManager().d();
                            GameDetails gameDetails20 = this.y;
                            if (gameDetails20 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            fgg fggVar2 = new fgg();
                            fggVar2.i = gameDetails20;
                            aVarD12.g(fggVar2);
                            aVarD12.d();
                        }
                        break;
                    case 407224423:
                        if (str.equals("sporty-cars")) {
                            GameDetails gameDetails21 = this.y;
                            if (gameDetails21 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            ylb0 ylb0Var = new ylb0();
                            ylb0Var.i = gameDetails21;
                            this.v = ylb0Var;
                            androidx.fragment.app.a aVarD13 = getSupportFragmentManager().d();
                            GameDetails gameDetails22 = this.y;
                            if (gameDetails22 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            ylb0 ylb0Var2 = new ylb0();
                            ylb0Var2.i = gameDetails22;
                            aVarD13.g(ylb0Var2);
                            aVarD13.d();
                        }
                        break;
                    case 407377218:
                        if (str.equals("sporty-hero")) {
                            W1();
                        }
                        break;
                    case 407469966:
                        if (str.equals("sporty-kick")) {
                            E1();
                            Y1();
                        }
                        break;
                    case 510525191:
                        if (str.equals("one-punch")) {
                            GameDetails gameDetails23 = this.y;
                            if (gameDetails23 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            zqy zqyVar = new zqy();
                            zqyVar.G = gameDetails23;
                            this.v = zqyVar;
                            androidx.fragment.app.a aVarD14 = getSupportFragmentManager().d();
                            GameDetails gameDetails24 = this.y;
                            if (gameDetails24 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            zqy zqyVar2 = new zqy();
                            zqyVar2.G = gameDetails24;
                            aVarD14.g(zqyVar2);
                            aVarD14.d();
                        }
                        break;
                    case 605180235:
                        if (str.equals("spin-da-bottle")) {
                            GameDetails gameDetails25 = this.y;
                            if (gameDetails25 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            b8b0 b8b0Var = new b8b0();
                            b8b0Var.y = gameDetails25;
                            this.v = b8b0Var;
                            androidx.fragment.app.a aVarD15 = getSupportFragmentManager().d();
                            GameDetails gameDetails26 = this.y;
                            if (gameDetails26 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            b8b0 b8b0Var2 = new b8b0();
                            b8b0Var2.y = gameDetails26;
                            aVarD15.g(b8b0Var2);
                            aVarD15.d();
                        }
                        break;
                    case 967676810:
                        if (str.equals("sporty-skills")) {
                            E1();
                            GameDetails gameDetails27 = this.y;
                            if (gameDetails27 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            vad0 vad0Var = new vad0();
                            vad0Var.i = gameDetails27;
                            this.v = vad0Var;
                            androidx.fragment.app.a aVarD16 = getSupportFragmentManager().d();
                            GameDetails gameDetails28 = this.y;
                            if (gameDetails28 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            vad0 vad0Var2 = new vad0();
                            vad0Var2.i = gameDetails28;
                            aVarD16.g(vad0Var2);
                            aVarD16.d();
                        }
                        break;
                    case 1143942266:
                        if (str.equals("spin-match")) {
                            GameDetails gameDetails29 = this.y;
                            if (gameDetails29 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            kab0 kab0Var = new kab0();
                            kab0Var.b = gameDetails29;
                            this.v = kab0Var;
                            androidx.fragment.app.a aVarD17 = getSupportFragmentManager().d();
                            b bVar5 = this.v;
                            bVar5.getClass();
                            aVarD17.g((kab0) bVar5);
                            aVarD17.d();
                        }
                        break;
                    case 1313709429:
                        if (str.equals("spin-to-win")) {
                            GameDetails gameDetails30 = this.y;
                            if (gameDetails30 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            a1b0 a1b0Var = new a1b0();
                            a1b0Var.i = gameDetails30;
                            this.v = a1b0Var;
                            androidx.fragment.app.a aVarD18 = getSupportFragmentManager().d();
                            GameDetails gameDetails31 = this.y;
                            if (gameDetails31 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            a1b0 a1b0Var2 = new a1b0();
                            a1b0Var2.i = gameDetails31;
                            aVarD18.g(a1b0Var2);
                            aVarD18.d();
                        }
                        break;
                    case 1353819564:
                        if (str.equals("fruit-hunt")) {
                            Q1();
                        }
                        break;
                    case 1386747848:
                        if (str.equals("night-n-day")) {
                            E1();
                            GameDetails gameDetails32 = this.y;
                            if (gameDetails32 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            usx usxVar = new usx();
                            Bundle bundle9 = new Bundle();
                            bundle9.putParcelable("key_game_details", gameDetails32);
                            usxVar.setArguments(bundle9);
                            this.v = usxVar;
                            androidx.fragment.app.a aVarD19 = getSupportFragmentManager().d();
                            b bVar6 = this.v;
                            bVar6.getClass();
                            aVarD19.g((usx) bVar6);
                            aVarD19.d();
                        }
                        break;
                    case 1610410932:
                        if (str.equals("speedy-bingo")) {
                            E1();
                            GameDetails gameDetails33 = this.y;
                            if (gameDetails33 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            hua0 hua0Var = new hua0();
                            Bundle bundle10 = new Bundle();
                            bundle10.putParcelable("key_game_details", gameDetails33);
                            hua0Var.setArguments(bundle10);
                            this.v = hua0Var;
                            androidx.fragment.app.a aVarD20 = getSupportFragmentManager().d();
                            b bVar7 = this.v;
                            bVar7.getClass();
                            aVarD20.g((hua0) bVar7);
                            aVarD20.d();
                        }
                        break;
                    case 1618394686:
                        if (str.equals("crazy-rider")) {
                            E1();
                            GameDetails gameDetails34 = this.y;
                            if (gameDetails34 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            bwb bwbVar = new bwb();
                            bwbVar.i = gameDetails34;
                            this.v = bwbVar;
                            androidx.fragment.app.a aVarD21 = getSupportFragmentManager().d();
                            GameDetails gameDetails35 = this.y;
                            if (gameDetails35 == null) {
                                Intrinsics.n("gameDetails");
                                throw null;
                            }
                            bwb bwbVar2 = new bwb();
                            bwbVar2.i = gameDetails35;
                            aVarD21.g(bwbVar2);
                            aVarD21.d();
                        }
                        break;
                }
            }
            d2();
            z1(listSplit$default != null ? (String) listSplit$default.get(1) : null);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
        yo80 yo80Var = (yo80) this.a;
        if (yo80Var != null) {
            yo80Var.b.setContent(new op8(726931883, new Function2() { // from class: xkj
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i2 = GameMainActivity.N;
                    int i3 = 0;
                    int i4 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final GameMainActivity gameMainActivity = this.a;
                        nw4 nw4Var = (nw4) wyh.b(gameMainActivity.G1().y, nw4.c.a, aVar, 0, 14).getValue();
                        GameDetails gameDetails36 = gameMainActivity.y;
                        if (gameDetails36 == null) {
                            Intrinsics.n("gameDetails");
                            throw null;
                        }
                        String name2 = gameDetails36.getName();
                        if (name2 == null) {
                            name2 = "";
                        }
                        Campaign campaign = (Campaign) wyh.b(gameMainActivity.H1().w, null, aVar, 48, 14).getValue();
                        boolean z = !gameMainActivity.K;
                        boolean zA = aVar.A(gameMainActivity);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            objY = new Function0() { // from class: llj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5 = GameMainActivity.N;
                                    String str2 = gameMainActivity.H1().i;
                                    return str2 == null ? "" : str2;
                                }
                            };
                            aVar.r(objY);
                        }
                        Function0 function0 = (Function0) objY;
                        boolean zA2 = aVar.A(gameMainActivity);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new mlj(gameMainActivity, i3);
                            aVar.r(objY2);
                        }
                        Function0 function1 = (Function0) objY2;
                        boolean zA3 = aVar.A(gameMainActivity);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new Function0() { // from class: nlj
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    int i5 = GameMainActivity.N;
                                    gameMainActivity.G1().x1();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY3);
                        }
                        Function0 function2 = (Function0) objY3;
                        boolean zA4 = aVar.A(gameMainActivity);
                        Object objY4 = aVar.y();
                        if (zA4 || objY4 == c0042a) {
                            objY4 = new tha(gameMainActivity, i4);
                            aVar.r(objY4);
                        }
                        Function0 function3 = (Function0) objY4;
                        boolean zA5 = aVar.A(gameMainActivity);
                        Object objY5 = aVar.y();
                        if (zA5 || objY5 == c0042a) {
                            objY5 = new uha(gameMainActivity, i4);
                            aVar.r(objY5);
                        }
                        uw4.a(nw4Var, false, name2, campaign, function0, function1, function2, function3, (Function0) objY5, z, aVar, 48, 0);
                        boolean zBooleanValue = ((Boolean) wyh.c(gameMainActivity.G1().d, aVar, 0, 7).getValue()).booleanValue();
                        CampaignTopicResponse campaignTopicResponse = (CampaignTopicResponse) ts9.a(((fuj) gameMainActivity.e.getValue()).d, aVar).getValue();
                        Campaign campaign2 = (Campaign) wyh.b(gameMainActivity.H1().w, null, aVar, 48, 14).getValue();
                        boolean zA6 = aVar.A(gameMainActivity);
                        Object objY6 = aVar.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new olj(gameMainActivity, i3);
                            aVar.r(objY6);
                        }
                        Function0 function4 = (Function0) objY6;
                        boolean zA7 = aVar.A(gameMainActivity);
                        Object objY7 = aVar.y();
                        if (zA7 || objY7 == c0042a) {
                            objY7 = new gaj() { // from class: ykj
                                @Override // defpackage.gaj
                                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                    nt4 nt4Var = (nt4) obj3;
                                    Integer num = (Integer) obj4;
                                    num.intValue();
                                    Integer num2 = (Integer) obj5;
                                    num2.intValue();
                                    int i5 = GameMainActivity.N;
                                    nt4Var.getClass();
                                    vt4 vt4Var = nt4Var.c;
                                    vt4 vt4Var2 = vt4.d;
                                    GameMainActivity gameMainActivity2 = gameMainActivity;
                                    if (vt4Var == vt4Var2) {
                                        gameMainActivity2.P1(nt4Var);
                                    } else {
                                        gameMainActivity2.G1().x1();
                                        xw4 xw4VarG1 = gameMainActivity2.G1();
                                        xw4VarG1.z = nt4Var;
                                        xw4VarG1.i = num;
                                        xw4VarG1.v = num2;
                                        wwd0 wwd0Var = xw4VarG1.e;
                                        Boolean bool = Boolean.TRUE;
                                        wwd0Var.getClass();
                                        wwd0Var.k(null, bool);
                                    }
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY7);
                        }
                        gaj gajVar = (gaj) objY7;
                        boolean zA8 = aVar.A(gameMainActivity);
                        Object objY8 = aVar.y();
                        if (zA8 || objY8 == c0042a) {
                            objY8 = new cha(gameMainActivity, 1);
                            aVar.r(objY8);
                        }
                        mt4.a(false, zBooleanValue, campaignTopicResponse, campaign2, function4, gajVar, (Function0) objY8, aVar, 6, 0);
                        boolean zBooleanValue2 = ((Boolean) wyh.c(gameMainActivity.G1().e, aVar, 0, 7).getValue()).booleanValue();
                        cnj cnjVar = (cnj) wyh.c(gameMainActivity.G1().w, aVar, 0, 7).getValue();
                        nt4 nt4Var = gameMainActivity.G1().z;
                        boolean zA9 = aVar.A(gameMainActivity);
                        Object objY9 = aVar.y();
                        if (zA9 || objY9 == c0042a) {
                            objY9 = new Function1() { // from class: zkj
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj3) {
                                    int i5 = GameMainActivity.N;
                                    ((nt4) obj3).getClass();
                                    gameMainActivity.G1().z1();
                                    return Unit.a;
                                }
                            };
                            aVar.r(objY9);
                        }
                        Function1 function5 = (Function1) objY9;
                        boolean zA10 = aVar.A(gameMainActivity);
                        Object objY10 = aVar.y();
                        if (zA10 || objY10 == c0042a) {
                            objY10 = new alj(gameMainActivity, i3);
                            aVar.r(objY10);
                        }
                        Function1 function6 = (Function1) objY10;
                        boolean zA11 = aVar.A(gameMainActivity);
                        Object objY11 = aVar.y();
                        if (zA11 || objY11 == c0042a) {
                            objY11 = new qha(gameMainActivity, 1);
                            aVar.r(objY11);
                        }
                        ss4.a(zBooleanValue2, cnjVar, nt4Var, function5, function6, (Function0) objY11, aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
            Unit unit2 = Unit.a;
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        SportyGamesManager sportyGamesManager;
        super.onDestroy();
        qnx qnxVar = this.C;
        if (qnxVar != null) {
            try {
                ConnectivityManager connectivityManager = qnxVar.b;
                if (connectivityManager != null) {
                    connectivityManager.unregisterNetworkCallback(qnxVar.d);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        qnx qnxVar2 = this.C;
        if (qnxVar2 != null) {
            NetworkStateManager networkStateManager = qnxVar2.c;
            if (networkStateManager != null) {
                networkStateManager.resetInstance();
            }
            qnxVar2.a = null;
            qnxVar2.b = null;
            qnxVar2.c = null;
        }
        this.C = null;
        if (getIntent().hasExtra("source") && Intrinsics.g(getIntent().getStringExtra("source"), "featured_games")) {
            if (!x1() && (sportyGamesManager = SportyGamesManager.getInstance()) != null) {
                sportyGamesManager.exit();
            }
            SportyGamesManager.setCurrentLanguageCode("");
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        try {
            getWindow().clearFlags(128);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        b bVar = this.v;
        if (bVar != null) {
            bVar.d0();
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        try {
            super.onResume();
            GameDetails gameDetails = this.y;
            if (gameDetails == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            String launchUrl = gameDetails.getLaunchUrl();
            List listSplit$default = launchUrl != null ? StringsKt__StringsKt.split$default(launchUrl, new String[]{"sportygames/"}, false, 0, 6, null) : null;
            if (listSplit$default == null) {
                listSplit$default = m2g.a;
            }
            List list = listSplit$default;
            try {
                CharSequence charSequence = (CharSequence) CollectionsKt.V(1, list);
                if (charSequence == null || charSequence.length() == 0) {
                    GameDetails gameDetails2 = this.y;
                    if (gameDetails2 == null) {
                        Intrinsics.n("gameDetails");
                        throw null;
                    }
                    String launchUrl2 = gameDetails2.getLaunchUrl();
                    List listSplit$default2 = launchUrl2 != null ? StringsKt__StringsKt.split$default(launchUrl2, new String[]{"games/"}, false, 0, 6, null) : null;
                    list = listSplit$default2 == null ? m2g.a : listSplit$default2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            Set setV = ay0.V(new String[]{"sporty-hero", "spin-da-bottle", "red-black", "even-odd", "fruit-hunt", "spin-match", "ping-pong", "sporty-jet", "galaxy-go", "sporty-kick", "sporty-cars", "crazy-rider", "sporty-skills"});
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (setV.contains((String) it.next())) {
                        getWindow().addFlags(128);
                        b bVar = this.v;
                        if (bVar != null) {
                            bVar.I();
                            return;
                        }
                        return;
                    }
                }
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        List list;
        super.onStart();
        GameDetails gameDetails = this.y;
        if (gameDetails == null) {
            Intrinsics.n("gameDetails");
            throw null;
        }
        String launchUrl = gameDetails.getLaunchUrl();
        List listSplit$default = launchUrl != null ? StringsKt__StringsKt.split$default(launchUrl, new String[]{"sportygames/"}, false, 0, 6, null) : null;
        if (listSplit$default == null) {
            try {
                list = m2g.a;
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } else {
            list = listSplit$default;
        }
        CharSequence charSequence = (CharSequence) CollectionsKt.V(1, list);
        if (charSequence == null || charSequence.length() == 0) {
            GameDetails gameDetails2 = this.y;
            if (gameDetails2 == null) {
                Intrinsics.n("gameDetails");
                throw null;
            }
            String launchUrl2 = gameDetails2.getLaunchUrl();
            listSplit$default = launchUrl2 != null ? StringsKt__StringsKt.split$default(launchUrl2, new String[]{"games/"}, false, 0, 6, null) : null;
        }
        if (listSplit$default != null && listSplit$default.contains("rush")) {
            getWindow().addFlags(128);
            b bVar = this.v;
            if (bVar != null) {
                bVar.I();
                return;
            }
            return;
        }
        if (listSplit$default != null && listSplit$default.contains("even-odd")) {
            getWindow().addFlags(128);
            b bVar2 = this.v;
            if (bVar2 != null) {
                bVar2.I();
                return;
            }
            return;
        }
        if (listSplit$default != null && listSplit$default.contains("spin-to-win")) {
            getWindow().addFlags(128);
            b bVar3 = this.v;
            if (bVar3 != null) {
                bVar3.I();
                return;
            }
            return;
        }
        if (listSplit$default == null || !listSplit$default.contains("one-punch")) {
            return;
        }
        getWindow().addFlags(128);
        b bVar4 = this.v;
        if (bVar4 != null) {
            bVar4.I();
        }
    }

    @Override // defpackage.uy1
    public final g6i0 w1() {
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_main_game_activity, (ViewGroup) null, false);
        int i2 = R.id.bonus_vault;
        ComposeView composeView = (ComposeView) h5e.a(R.id.bonus_vault, viewInflate);
        if (composeView != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate;
            int i3 = R.id.spin_image;
            ImageView imageView = (ImageView) h5e.a(R.id.spin_image, viewInflate);
            if (imageView != null) {
                i3 = R.id.spin_kit;
                SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit, viewInflate);
                if (spinKitView != null) {
                    return new yo80(frameLayout, composeView, imageView, spinKitView);
                }
            }
            i2 = i3;
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i2)));
        return null;
    }

    public final void z1(String str) {
        yo80 yo80Var;
        final FrameLayout frameLayout;
        if (this.K || !CollectionsKt.M(ay0.V(new String[]{"sporty-jet", "galaxy-go", "sporty-kick", "sporty-skills", "crazy-rider", "sporty-hero", "pocket-rockets"}), str) || (yo80Var = (yo80) this.a) == null || (frameLayout = yo80Var.a) == null) {
            return;
        }
        A1(frameLayout);
        frameLayout.post(new Runnable() { // from class: blj
            @Override // java.lang.Runnable
            public final void run() {
                GameMainActivity.A1(frameLayout);
            }
        });
    }
}
