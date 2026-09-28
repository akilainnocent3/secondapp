package com.sportybet.feature.inappreview;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.a;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.platform.features.userfeedback.UserFeedbackActivity;
import com.sportybet.android.auth.AccountHelperEntryPointImpl;
import com.sportybet.feature.inappreview.InAppReviewDialogActivity;
import com.sportybet.feature.inappreview.d;
import com.sportybet.feature.inappreview.e;
import com.sportybet.feature.inappreview.f;
import defpackage.arr;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.f00;
import defpackage.g1i;
import defpackage.itf0;
import defpackage.jpu;
import defpackage.jq40;
import defpackage.k9j;
import defpackage.ksl;
import defpackage.ku90;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.saj;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.uq50;
import defpackage.v1b;
import defpackage.v8i0;
import defpackage.vgb0;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.yrh0;
import defpackage.zcn;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/inappreview/InAppReviewDialogActivity;", "Lpy1;", "Lk9j;", "Lbb40;", "Lrlf;", "<init>", "()V", "Lcom/sportybet/feature/inappreview/e;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class InAppReviewDialogActivity extends ksl implements k9j, bb40, rlf {
    public static final /* synthetic */ int d = 0;
    public uq50 b;
    public final q8i0 c = new q8i0(jq40.a(f.class), new d(), new c(), new e());

    @c0d(c = "com.sportybet.feature.inappreview.InAppReviewDialogActivity$onCreate$1", f = "InAppReviewDialogActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<com.sportybet.feature.inappreview.b, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = InAppReviewDialogActivity.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.sportybet.feature.inappreview.b bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            com.sportybet.feature.inappreview.b bVar = (com.sportybet.feature.inappreview.b) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean zG = Intrinsics.g(bVar, com.sportybet.feature.inappreview.b.a.a);
            final InAppReviewDialogActivity inAppReviewDialogActivity = InAppReviewDialogActivity.this;
            if (zG) {
                inAppReviewDialogActivity.finish();
            } else if (Intrinsics.g(bVar, com.sportybet.feature.inappreview.b.C0374b.a)) {
                final uq50 uq50Var = inAppReviewDialogActivity.b;
                if (uq50Var == null) {
                    Intrinsics.n("reviewManager");
                    throw null;
                }
                final zcn zcnVar = new zcn();
                AccountHelperEntryPointImpl accountHelperEntryPointImpl = yrh0.a;
                try {
                    uq50Var.a().addOnCompleteListener(new OnCompleteListener() { // from class: orh0
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            if (task.isSuccessful()) {
                                Task<Void> taskB = uq50Var.b(inAppReviewDialogActivity, (ReviewInfo) task.getResult());
                                final zcn zcnVar2 = zcnVar;
                                taskB.addOnCompleteListener(new OnCompleteListener() { // from class: qrh0
                                    @Override // com.google.android.gms.tasks.OnCompleteListener
                                    public final void onComplete(Task task2) {
                                        zcnVar2.run();
                                    }
                                });
                            }
                        }
                    });
                } catch (Exception e) {
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_COMMON);
                    aVar.f(e, "Failed to launch in-app review", new Object[0]);
                }
                inAppReviewDialogActivity.finish();
            } else {
                if (!Intrinsics.g(bVar, com.sportybet.feature.inappreview.b.c.a)) {
                    uhc.a();
                    return null;
                }
                inAppReviewDialogActivity.startActivity(new Intent(inAppReviewDialogActivity, (Class<?>) UserFeedbackActivity.class));
                inAppReviewDialogActivity.finish();
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<com.sportybet.feature.inappreview.c, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sportybet.feature.inappreview.c cVar) {
            Object value;
            com.sportybet.feature.inappreview.c cVar2 = cVar;
            cVar2.getClass();
            f fVar = (f) this.receiver;
            ku90<com.sportybet.feature.inappreview.b> ku90Var = fVar.b;
            fVar.a.getCountryCode();
            if (cVar2.equals(com.sportybet.feature.inappreview.c.b.a)) {
                f00 f00Var = vgb0.a;
                vgb0.c(AnalyticsEvent.IN_APP_REVIEW_ENJOY_APP, jpu.b(new Pair("data", Boolean.TRUE)), false);
                ku90Var.a(com.sportybet.feature.inappreview.b.C0374b.a);
            } else if (cVar2.equals(com.sportybet.feature.inappreview.c.C0375c.a)) {
                f00 f00Var2 = vgb0.a;
                vgb0.c(AnalyticsEvent.IN_APP_REVIEW_ENJOY_APP, jpu.b(new Pair("data", Boolean.FALSE)), false);
                wwd0 wwd0Var = fVar.d;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, new com.sportybet.feature.inappreview.e(((com.sportybet.feature.inappreview.e) value).a, com.sportybet.feature.inappreview.a.b.a)));
            } else {
                boolean zEquals = cVar2.equals(com.sportybet.feature.inappreview.c.d.a);
                com.sportybet.feature.inappreview.b.a aVar = com.sportybet.feature.inappreview.b.a.a;
                if (zEquals) {
                    f00 f00Var3 = vgb0.a;
                    vgb0.c(AnalyticsEvent.IN_APP_REVIEW_FEEDBACK, jpu.b(new Pair("data", Boolean.FALSE)), false);
                    ku90Var.a(aVar);
                } else if (cVar2.equals(com.sportybet.feature.inappreview.c.e.a)) {
                    f00 f00Var4 = vgb0.a;
                    vgb0.c(AnalyticsEvent.IN_APP_REVIEW_FEEDBACK, jpu.b(new Pair("data", Boolean.TRUE)), false);
                    ku90Var.a(com.sportybet.feature.inappreview.b.c.a);
                } else {
                    if (!cVar2.equals(com.sportybet.feature.inappreview.c.a.a)) {
                        uhc.a();
                        return null;
                    }
                    ku90Var.a(aVar);
                }
            }
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return InAppReviewDialogActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return InAppReviewDialogActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return InAppReviewDialogActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f00 f00Var = vgb0.a;
        vgb0.a(AnalyticsEvent.IN_APP_SHOW_CUSTOM_DIALOG);
        g1i g1iVar = new g1i(((f) this.c.getValue()).c, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        zn8.a(this, new op8(-2038856647, new Function2() { // from class: ycn
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                q8i0 q8i0Var = this.a.c;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = InAppReviewDialogActivity.d;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    e eVar = (e) wyh.c(((f) q8i0Var.getValue()).e, aVar, 0, 7).getValue();
                    f fVar = (f) q8i0Var.getValue();
                    boolean zA = aVar.A(fVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        InAppReviewDialogActivity.b bVar = new InAppReviewDialogActivity.b(1, fVar, f.class, "handleEvent", "handleEvent(Lcom/sportybet/feature/inappreview/InAppReviewEvent;)V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    }
                    d.c(eVar, (Function1) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.r1k, defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public final void onStart() {
        super.onStart();
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
    }
}
