package com.sportybet.feature.horseracing.view;

import android.accounts.Account;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sporty.android.core.model.MyLog;
import com.sportybet.feature.horseracing.model.BmSdkResult;
import com.sportybet.feature.horseracing.view.HorseRacingActivity;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import defpackage.a390;
import defpackage.bnh0;
import defpackage.bsl;
import defpackage.c0d;
import defpackage.ckm;
import defpackage.cyb;
import defpackage.dkm;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ekm;
import defpackage.fbh0;
import defpackage.fkd;
import defpackage.fkm;
import defpackage.ib5;
import defpackage.ikm;
import defpackage.itf0;
import defpackage.jkm;
import defpackage.jq40;
import defpackage.ku90;
import defpackage.l80;
import defpackage.m850;
import defpackage.myh;
import defpackage.o8i0;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.tit;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.wwd0;
import defpackage.xjm;
import defpackage.y5b;
import defpackage.yjm;
import defpackage.zjm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/feature/horseracing/view/HorseRacingActivity;", "Lcom/sportybet/plugin/webcontainer/activities/WebViewActivity;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class HorseRacingActivity extends bsl {
    public static final /* synthetic */ int e = 0;
    public fbh0 b;
    public bnh0 c;
    public final q8i0 d = new q8i0(jq40.a(fkm.class), new h(), new g(), new i());

    @c0d(c = "com.sportybet.feature.horseracing.view.HorseRacingActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1", f = "HorseRacingActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HorseRacingActivity b;
        public final /* synthetic */ HorseRacingActivity c;

        /* JADX INFO: renamed from: com.sportybet.feature.horseracing.view.HorseRacingActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.horseracing.view.HorseRacingActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$1$1", f = "HorseRacingActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class C0372a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ HorseRacingActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0372a(v1b v1bVar, HorseRacingActivity horseRacingActivity) {
                super(2, v1bVar);
                this.c = horseRacingActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0372a c0372a = new C0372a(v1bVar, this.c);
                c0372a.b = obj;
                return c0372a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((C0372a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    HorseRacingActivity horseRacingActivity = this.c;
                    a390<BmSdkResult> bmSdkResult = ((WebViewActivity) horseRacingActivity).webViewViewModel.getBmSdkResult();
                    d dVar = horseRacingActivity.new d();
                    this.b = null;
                    this.a = 1;
                    if (bmSdkResult.collect(dVar, this) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj);
                }
                fkd.a();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HorseRacingActivity horseRacingActivity, v1b v1bVar, HorseRacingActivity horseRacingActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = horseRacingActivity;
            this.c = horseRacingActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                C0372a c0372a = new C0372a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0372a, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.horseracing.view.HorseRacingActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$2", f = "HorseRacingActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HorseRacingActivity b;
        public final /* synthetic */ HorseRacingActivity c;

        @c0d(c = "com.sportybet.feature.horseracing.view.HorseRacingActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$2$1", f = "HorseRacingActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ HorseRacingActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, HorseRacingActivity horseRacingActivity) {
                super(2, v1bVar);
                this.c = horseRacingActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
                ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) throws Throwable {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        throw l80.a(obj);
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                int i2 = HorseRacingActivity.e;
                HorseRacingActivity horseRacingActivity = this.c;
                wwd0 wwd0Var = horseRacingActivity.H1().v;
                e eVar = horseRacingActivity.new e();
                this.b = null;
                this.a = 1;
                wwd0Var.collect(eVar, this);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HorseRacingActivity horseRacingActivity, v1b v1bVar, HorseRacingActivity horseRacingActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = horseRacingActivity;
            this.c = horseRacingActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, v1bVar, this.c);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.feature.horseracing.view.HorseRacingActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$3", f = "HorseRacingActivity.kt", l = {55}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ HorseRacingActivity b;
        public final /* synthetic */ HorseRacingActivity c;

        @c0d(c = "com.sportybet.feature.horseracing.view.HorseRacingActivity$onCreate$$inlined$launchAndRepeatWithLifecycle$default$3$1", f = "HorseRacingActivity.kt", l = {58}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ HorseRacingActivity c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v1b v1bVar, HorseRacingActivity horseRacingActivity) {
                super(2, v1bVar);
                this.c = horseRacingActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(v1bVar, this.c);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
                return y5b.a;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i != 0) {
                    if (i == 1) {
                        throw l80.a(obj);
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                int i2 = HorseRacingActivity.e;
                HorseRacingActivity horseRacingActivity = this.c;
                ku90 ku90Var = horseRacingActivity.H1().y;
                f fVar = horseRacingActivity.new f();
                this.b = null;
                this.a = 1;
                ku90Var.collect(fVar, this);
                return y5bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(HorseRacingActivity horseRacingActivity, v1b v1bVar, HorseRacingActivity horseRacingActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = horseRacingActivity;
            this.c = horseRacingActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new c(this.b, v1bVar, this.c);
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
                s9s lifecycle = this.b.getLifecycle();
                s9s.b bVar = s9s.b.d;
                a aVar = new a(null, this.c);
                this.a = 1;
                if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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

    public static final class d<T> implements myh {
        public d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            BmSdkResult bmSdkResult = (BmSdkResult) obj;
            int i = HorseRacingActivity.e;
            boolean z = bmSdkResult instanceof BmSdkResult.LaunchLogin;
            final HorseRacingActivity horseRacingActivity = HorseRacingActivity.this;
            if (z) {
                ((WebViewActivity) horseRacingActivity).accountHelper.demandAccount(horseRacingActivity, new tit() { // from class: akm
                    @Override // defpackage.tit
                    public final void w(Account account, boolean z2) {
                        int i2 = HorseRacingActivity.e;
                        if (account != null) {
                            fkm fkmVarH1 = horseRacingActivity.H1();
                            ej5.c(o8i0.d(fkmVarH1), null, null, new lkm(fkmVarH1, null), 3);
                        }
                    }
                });
            } else if (bmSdkResult instanceof BmSdkResult.SdkLoaded) {
                fkm fkmVarH1 = horseRacingActivity.H1();
                wwd0 wwd0Var = fkmVarH1.i;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, ekm.a(fkmVarH1.e, false, false, false, null, 30)));
                if (fkmVarH1.c.isLogin()) {
                    ej5.c(o8i0.d(fkmVarH1), null, null, new jkm(fkmVarH1, null), 3);
                }
            } else if (bmSdkResult instanceof BmSdkResult.UpdateBalance) {
                horseRacingActivity.H1().a.g();
            } else {
                if (!(bmSdkResult instanceof BmSdkResult.SdkError)) {
                    uhc.a();
                    return null;
                }
                fkm fkmVarH2 = horseRacingActivity.H1();
                BmSdkResult.a aVar = ((BmSdkResult.SdkError) bmSdkResult).a;
                aVar.getClass();
                ej5.c(o8i0.d(fkmVarH2), null, null, new ikm(aVar, fkmVarH2, null), 3);
            }
            return Unit.a;
        }
    }

    public static final class e<T> implements myh {
        public e() {
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int i = HorseRacingActivity.e;
            HorseRacingActivity.this.J1((dkm) obj);
            return Unit.a;
        }
    }

    public static final class f<T> implements myh {
        public f() {
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int i = HorseRacingActivity.e;
            HorseRacingActivity.this.I1((ckm) obj);
            return Unit.a;
        }
    }

    public static final class g extends qlr implements Function0<r8i0.c> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return HorseRacingActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return HorseRacingActivity.this.getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return HorseRacingActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final fkm H1() {
        return (fkm) this.d.getValue();
    }

    public final void I1(ckm ckmVar) {
        if (ckmVar instanceof ckm.c) {
            bnh0 bnh0Var = this.c;
            if (bnh0Var == null) {
                Intrinsics.n("urlCreator");
                throw null;
            }
            String strH = bnh0Var.h("/m/horse-racing-widget");
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_BET_MAKERS_HORSE_RACING);
            aVar.a("launch web view - ".concat(strH), new Object[0]);
            if (this.webView.getUrl() != null) {
                return;
            }
            this.webView.loadUrl(strH);
            return;
        }
        if (ckmVar instanceof ckm.e) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_BET_MAKERS_HORSE_RACING);
            String str = ((ckm.e) ckmVar).a;
            aVar2.a("update sdk data %s", str);
            this.webView.evaluateJavascript(str, null);
            return;
        }
        if (!(ckmVar instanceof ckm.d)) {
            if (!(ckmVar instanceof ckm.b)) {
                if (ckmVar instanceof ckm.a) {
                    finish();
                    return;
                } else {
                    uhc.a();
                    return;
                }
            }
            if (!this.webView.canGoBack()) {
                finish();
                return;
            } else {
                this.webView.goBack();
                this.webView.evaluateJavascript(((ckm.b) ckmVar).a, null);
                return;
            }
        }
        itf0.a aVar3 = itf0.a;
        aVar3.q(MyLog.TAG_BET_MAKERS_HORSE_RACING);
        ckm.d dVar = (ckm.d) ckmVar;
        String str2 = dVar.a;
        aVar3.a("toggle bet history %s", str2);
        this.webView.evaluateJavascript(str2, null);
        String str3 = dVar.b;
        if (str3 != null) {
            aVar3.q(MyLog.TAG_BET_MAKERS_HORSE_RACING);
            aVar3.a("hide bet slip %s", str3);
            this.webView.evaluateJavascript(str3, null);
        }
    }

    public final void J1(dkm dkmVar) {
        LoadingViewNew loadingViewNew = this.loadingView;
        loadingViewNew.getClass();
        boolean z = dkmVar.a;
        String str = dkmVar.c;
        loadingViewNew.setVisibility(z ? 0 : 8);
        ImageButton firstRightTitleImageButton = getFirstRightTitleImageButton();
        firstRightTitleImageButton.getClass();
        firstRightTitleImageButton.setVisibility(dkmVar.e ? 0 : 8);
        getFirstRightTitleImageButton().setImageResource(dkmVar.h);
        getSecondRightTitleImageButton().setImageResource(dkmVar.i);
        ImageButton secondRightTitleImageButton = getSecondRightTitleImageButton();
        secondRightTitleImageButton.getClass();
        secondRightTitleImageButton.setVisibility(0);
        getLeftCloseButton().setImageResource(dkmVar.g);
        setTitle(dkmVar.f);
        setTitleTextSize(dkmVar.d);
        if (str != null) {
            getRightTitleText().setText(str);
        }
        AppCompatTextView rightTitleText = getRightTitleText();
        rightTitleText.getClass();
        rightTitleText.setVisibility(str != null ? 0 : 8);
    }

    @Override // com.sportybet.plugin.webcontainer.activities.WebViewActivity, com.sportybet.plugin.webcontainer.activities.BaseWebViewActivity, defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new b(this, null, this), 3);
        ej5.c(ebs.a(getLifecycle()), null, null, new c(this, null, this), 3);
        getFirstRightTitleImageButton().setOnClickListener(new View.OnClickListener() { // from class: wjm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = HorseRacingActivity.e;
                fkm fkmVarH1 = this.a.H1();
                ej5.c(o8i0.d(fkmVarH1), null, null, new gkm(fkmVarH1, null), 3);
            }
        });
        int i2 = 0;
        getSecondRightTitleImageButton().setOnClickListener(new xjm(this, i2));
        getLeftCloseButton().setOnClickListener(new yjm(this, i2));
        getRightTitleText().setOnClickListener(new zjm(this, i2));
    }
}
