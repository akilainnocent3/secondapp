package com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import defpackage.aaq;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.k8m;
import defpackage.lyh;
import defpackage.m850;
import defpackage.myh;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t1k0;
import defpackage.t340;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.wae;
import defpackage.y5b;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/worldcuppass/WorldCupPassAnnouncementActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "a", "Ls1k0;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WorldCupPassAnnouncementActivity extends k8m implements rlf, bb40 {
    public static final /* synthetic */ int d = 0;
    public azm b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.c.class), new d(), new c(), new e());

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a {
        public static Intent a(Activity activity, t1k0 t1k0Var, Long l) {
            Intent intent = new Intent(activity, (Class<?>) WorldCupPassAnnouncementActivity.class);
            intent.putExtra(dqvOSm.ByN, t1k0Var.name());
            if (l != null) {
                intent.putExtra("purchase_pay_total", l.longValue());
            }
            return intent;
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity$onCreate$$inlined$collectWithLifecycle$default$1", f = "WorldCupPassAnnouncementActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WorldCupPassAnnouncementActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ WorldCupPassAnnouncementActivity d;

        @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity$onCreate$$inlined$collectWithLifecycle$default$1$1", f = "WorldCupPassAnnouncementActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ WorldCupPassAnnouncementActivity d;

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.WorldCupPassAnnouncementActivity$b$a$a, reason: collision with other inner class name */
            public static final class C0396a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ WorldCupPassAnnouncementActivity b;

                public C0396a(v5b v5bVar, WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity) {
                    this.b = worldCupPassAnnouncementActivity;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b bVar = (com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b) t;
                    int i = WorldCupPassAnnouncementActivity.d;
                    boolean zG = Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b.C0398b.a);
                    WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity = this.b;
                    if (zG) {
                        worldCupPassAnnouncementActivity.startActivity(new Intent(worldCupPassAnnouncementActivity, (Class<?>) SportyTvRedirectActivity.class));
                        worldCupPassAnnouncementActivity.finish();
                    } else if (Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b.c.a)) {
                        azm azmVar = worldCupPassAnnouncementActivity.b;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.f(wae.WORLDCUP_MISSION, kotlin.collections.a.c(new Pair("source", "invitation_popup")));
                        worldCupPassAnnouncementActivity.finish();
                    } else {
                        if (!Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.b.a.a)) {
                            uhc.a();
                            return null;
                        }
                        worldCupPassAnnouncementActivity.finish();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(lyh lyhVar, v1b v1bVar, WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = worldCupPassAnnouncementActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                a aVar = new a(this.c, v1bVar, this.d);
                aVar.b = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0396a c0396a = new C0396a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0396a, this) == y5bVar) {
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
        public b(WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity, lyh lyhVar, v1b v1bVar, WorldCupPassAnnouncementActivity worldCupPassAnnouncementActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = worldCupPassAnnouncementActivity;
            this.c = lyhVar;
            this.d = worldCupPassAnnouncementActivity2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            s9s.b bVar = s9s.b.a;
            return new b(this.b, this.c, v1bVar, this.d);
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
                a aVar = new a(this.c, null, this.d);
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

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return WorldCupPassAnnouncementActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return WorldCupPassAnnouncementActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return WorldCupPassAnnouncementActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        t340 t340Var = ((com.sportybet.feature.loyalty.impl.notifications.presentation.worldcuppass.c) this.c.getValue()).w;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new b(this, t340Var, null, this), 3);
        zn8.a(this, new op8(-1317808298, new aaq(this), true));
    }
}
