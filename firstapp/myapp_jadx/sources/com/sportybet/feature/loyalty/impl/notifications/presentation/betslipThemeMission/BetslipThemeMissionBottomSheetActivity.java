package com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission;

import android.os.Bundle;
import android.util.Pair;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.gp.tz.R;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.gan;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.ku90;
import defpackage.lyh;
import defpackage.m850;
import defpackage.m9n;
import defpackage.myh;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.qw90;
import defpackage.qx3;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.vml;
import defpackage.wae;
import defpackage.y5b;
import defpackage.zn8;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/betslipThemeMission/BetslipThemeMissionBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "Lay3;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BetslipThemeMissionBottomSheetActivity extends vml implements rlf, bb40 {
    public static final /* synthetic */ int d = 0;
    public azm b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.c.class), new c(), new b(), new d());

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity$onCreate$$inlined$collectWithLifecycle$default$1", f = "BetslipThemeMissionBottomSheetActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ BetslipThemeMissionBottomSheetActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ BetslipThemeMissionBottomSheetActivity d;

        /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity$onCreate$$inlined$collectWithLifecycle$default$1$1", f = "BetslipThemeMissionBottomSheetActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C0382a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ BetslipThemeMissionBottomSheetActivity d;

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.BetslipThemeMissionBottomSheetActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0383a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ BetslipThemeMissionBottomSheetActivity b;

                public C0383a(v5b v5bVar, BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity) {
                    this.b = betslipThemeMissionBottomSheetActivity;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.b bVar = (com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.b) t;
                    int i = BetslipThemeMissionBottomSheetActivity.d;
                    boolean zG = Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.b.d.a);
                    BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity = this.b;
                    if (zG) {
                        betslipThemeMissionBottomSheetActivity.A1("mission");
                    } else if (Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.b.C0385b.a)) {
                        betslipThemeMissionBottomSheetActivity.A1("benefit");
                    } else if (Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.b.c.a)) {
                        azm azmVar = betslipThemeMissionBottomSheetActivity.b;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.ME_GIFTS);
                        betslipThemeMissionBottomSheetActivity.finish();
                    } else {
                        if (!Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.b.a.a)) {
                            uhc.a();
                            return null;
                        }
                        betslipThemeMissionBottomSheetActivity.finish();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0382a(lyh lyhVar, v1b v1bVar, BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = betslipThemeMissionBottomSheetActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0382a c0382a = new C0382a(this.c, v1bVar, this.d);
                c0382a.b = obj;
                return c0382a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0382a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0383a c0383a = new C0383a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0383a, this) == y5bVar) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity, lyh lyhVar, v1b v1bVar, BetslipThemeMissionBottomSheetActivity betslipThemeMissionBottomSheetActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = betslipThemeMissionBottomSheetActivity;
            this.c = lyhVar;
            this.d = betslipThemeMissionBottomSheetActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new a(this.b, this.c, v1bVar, this.d);
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
                C0382a c0382a = new C0382a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0382a, this) == y5bVar) {
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

    public static final class b extends qlr implements Function0<r8i0.c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return BetslipThemeMissionBottomSheetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return BetslipThemeMissionBottomSheetActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return BetslipThemeMissionBottomSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1(String str) {
        azm azmVar = this.b;
        if (azmVar == null) {
            Intrinsics.n("router");
            throw null;
        }
        azmVar.k(wae.LOYALTY, new Pair[]{new Pair("tab", str), new Pair("scrollToBetslip", "true")}, null);
        finish();
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m9n m9nVarA = qw90.a(this);
        List listK = kotlin.collections.b.k(getCMSString(R.string.page_loyalty__popup_betslip_mission_invite_img, new Object[0]), getCMSString(R.string.page_loyalty__popup_betslip_mission_complete_img, new Object[0]));
        listK.getClass();
        Iterator it = CollectionsKt.A0(CollectionsKt.D0(listK)).iterator();
        while (it.hasNext()) {
            gan.d(m9nVarA, this, it.next(), true);
        }
        ku90 ku90Var = z1().c;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, ku90Var, null, this), 3);
        zn8.a(this, new op8(-339978875, new qx3(this), true));
    }

    public final com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.c z1() {
        return (com.sportybet.feature.loyalty.impl.notifications.presentation.betslipThemeMission.c) this.c.getValue();
    }
}
