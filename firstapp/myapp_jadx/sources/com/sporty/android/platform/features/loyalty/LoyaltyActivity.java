package com.sporty.android.platform.features.loyalty;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.platform.features.loyalty.LoyaltyActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.arr;
import defpackage.azm;
import defpackage.b3u;
import defpackage.bb40;
import defpackage.bnh0;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.f0u;
import defpackage.g1i;
import defpackage.jq40;
import defpackage.jvl;
import defpackage.k9j;
import defpackage.l48;
import defpackage.nym;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.tyt;
import defpackage.u420;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v420;
import defpackage.v8i0;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.zn8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/platform/features/loyalty/LoyaltyActivity;", "Lpy1;", "", "Lv420;", "Lk9j;", "Lbb40;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LoyaltyActivity extends jvl implements v420, k9j, bb40 {
    public static final /* synthetic */ int f = 0;
    public bnh0 b;
    public azm c;
    public nym d;
    public final q8i0 e = new q8i0(jq40.a(b3u.class), new c(), new b(), new d());

    @c0d(c = "com.sporty.android.platform.features.loyalty.LoyaltyActivity$onCreate$1", f = "LoyaltyActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return LoyaltyActivity.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            nym nymVar = LoyaltyActivity.this.d;
            if (nymVar != null) {
                nymVar.a();
                return Unit.a;
            }
            Intrinsics.n("iPersonalTopicManager");
            throw null;
        }
    }

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return LoyaltyActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return LoyaltyActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return LoyaltyActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.v420
    public final u420 E() {
        return u420.e.a;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        z1(intent);
        g1i g1iVar = new g1i(((b3u) this.e.getValue()).X, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.e);
        List listK = kotlin.collections.b.k(Integer.valueOf(R.string.page_loyalty__daily_streak_entry), Integer.valueOf(R.string.page_loyalty__challenge_entry_iron_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_copper_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_bronze_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_silver_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_gold_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_platinum_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_titanium_img_v2), Integer.valueOf(R.string.page_loyalty__challenge_entry_diamond_img_v2));
        final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(getCMSString(((Number) it.next()).intValue(), new Object[0]));
        }
        zn8.a(this, new op8(-1408436047, new Function2() { // from class: hqt
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = LoyaltyActivity.f;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final LoyaltyActivity loyaltyActivity = this.a;
                    final ArrayList arrayList2 = arrayList;
                    l0u.c(null, null, null, false, pp8.b(1115799653, new Function2() { // from class: iqt
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = LoyaltyActivity.f;
                            int i3 = 1;
                            int i4 = 2;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    objY = arrayList2;
                                    aVar2.r(objY);
                                }
                                gan.a((List) objY, true, 0.0f, 0, aVar2, 48);
                                final LoyaltyActivity loyaltyActivity2 = loyaltyActivity;
                                boolean zA = aVar2.A(loyaltyActivity2);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == c0042a) {
                                    objY2 = new s8f(loyaltyActivity2, i3);
                                    aVar2.r(objY2);
                                }
                                Function2 function2 = (Function2) objY2;
                                boolean zA2 = aVar2.A(loyaltyActivity2);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new t8f(loyaltyActivity2, i3);
                                    aVar2.r(objY3);
                                }
                                Function1 function1 = (Function1) objY3;
                                boolean zA3 = aVar2.A(loyaltyActivity2);
                                Object objY4 = aVar2.y();
                                if (zA3 || objY4 == c0042a) {
                                    objY4 = new yra(loyaltyActivity2, i3);
                                    aVar2.r(objY4);
                                }
                                Function0 function0 = (Function0) objY4;
                                boolean zA4 = aVar2.A(loyaltyActivity2);
                                Object objY5 = aVar2.y();
                                if (zA4 || objY5 == c0042a) {
                                    objY5 = new zra(loyaltyActivity2, i3);
                                    aVar2.r(objY5);
                                }
                                Function0 function3 = (Function0) objY5;
                                boolean zA5 = aVar2.A(loyaltyActivity2);
                                Object objY6 = aVar2.y();
                                if (zA5 || objY6 == c0042a) {
                                    objY6 = new gaj() { // from class: jqt
                                        @Override // defpackage.gaj
                                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                            WebViewClient webViewClient = (WebViewClient) obj6;
                                            WebChromeClient webChromeClient = (WebChromeClient) obj7;
                                            int i5 = LoyaltyActivity.f;
                                            webViewClient.getClass();
                                            webChromeClient.getClass();
                                            LoyaltyActivity loyaltyActivity3 = loyaltyActivity2;
                                            loyaltyActivity3.getWebViewWrapperService().installJsBridge(loyaltyActivity3, (WebView) obj5, webViewClient, webChromeClient);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY6);
                                }
                                gaj gajVar = (gaj) objY6;
                                boolean zA6 = aVar2.A(loyaltyActivity2);
                                Object objY7 = aVar2.y();
                                if (zA6 || objY7 == c0042a) {
                                    objY7 = new ve1(loyaltyActivity2, i4);
                                    aVar2.r(objY7);
                                }
                                kyt.a(function2, function1, function0, function3, gajVar, (Function1) objY7, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576, 15);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.rn8, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        z1(intent);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final void z1(Intent intent) {
        Object bVar;
        String stringExtra = intent.getStringExtra("tab");
        if (stringExtra == null) {
            bVar = null;
        } else {
            int iHashCode = stringExtra.hashCode();
            if (iHashCode != -222710633) {
                if (iHashCode != 96891546) {
                    if (iHashCode == 1069449612 && stringExtra.equals("mission")) {
                        bVar = new tyt.c(false);
                    } else {
                        bVar = null;
                    }
                } else if (stringExtra.equals(AnalyticsEvent.BI_TRACKING_KIND_EVENT)) {
                    bVar = tyt.a.d;
                } else {
                    bVar = null;
                }
            } else if (stringExtra.equals("benefit")) {
                bVar = new tyt.b(false);
            } else {
                bVar = null;
            }
        }
        boolean booleanExtra = intent.getBooleanExtra("scrollToBetslip", false);
        if (bVar != null) {
            b3u b3uVar = (b3u) this.e.getValue();
            f0u f0uVar = b3uVar.c;
            f0uVar.getClass();
            wwd0 wwd0Var = f0uVar.c;
            wwd0Var.getClass();
            wwd0Var.k(null, bVar);
            wwd0 wwd0Var2 = f0uVar.a;
            wwd0Var2.getClass();
            wwd0Var2.k(null, bVar);
            if (booleanExtra) {
                if (bVar instanceof tyt.c) {
                    wwd0 wwd0Var3 = b3uVar.L;
                    Boolean bool = Boolean.TRUE;
                    wwd0Var3.getClass();
                    wwd0Var3.k(null, bool);
                    return;
                }
                if (bVar instanceof tyt.b) {
                    wwd0 wwd0Var4 = b3uVar.K;
                    Boolean bool2 = Boolean.TRUE;
                    wwd0Var4.getClass();
                    wwd0Var4.k(null, bool2);
                }
            }
        }
    }
}
