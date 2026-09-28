package com.sportybet.feature.loyalty.impl.worldcuppass;

import android.content.Intent;
import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.dag;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.elf;
import defpackage.g1k0;
import defpackage.i2k0;
import defpackage.i8m;
import defpackage.ib5;
import defpackage.itf0;
import defpackage.jq40;
import defpackage.k2k0;
import defpackage.k9j;
import defpackage.lyh;
import defpackage.m850;
import defpackage.myh;
import defpackage.p1a;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.t340;
import defpackage.tje0;
import defpackage.u420;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v420;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.wae;
import defpackage.y3k0;
import defpackage.y5b;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/worldcuppass/WorldCupPassActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lk9j;", "Lv420;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WorldCupPassActivity extends i8m implements rlf, bb40, k9j, v420 {
    public static final /* synthetic */ int e = 0;
    public azm b;
    public i2k0 c;
    public final q8i0 d = new q8i0(jq40.a(y3k0.class), new c(), new b(), new d());

    @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity$onCreate$$inlined$collectWithLifecycle$default$1", f = "WorldCupPassActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WorldCupPassActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ WorldCupPassActivity d;

        /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity$onCreate$$inlined$collectWithLifecycle$default$1$1", f = "WorldCupPassActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C0399a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ WorldCupPassActivity d;

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.worldcuppass.WorldCupPassActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0400a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ WorldCupPassActivity b;

                public C0400a(v5b v5bVar, WorldCupPassActivity worldCupPassActivity) {
                    this.b = worldCupPassActivity;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    k2k0 k2k0Var = (k2k0) t;
                    int i = WorldCupPassActivity.e;
                    boolean zG = Intrinsics.g(k2k0Var, k2k0.b.a);
                    WorldCupPassActivity worldCupPassActivity = this.b;
                    if (zG) {
                        worldCupPassActivity.finish();
                    } else if (Intrinsics.g(k2k0Var, k2k0.c.a)) {
                        worldCupPassActivity.z1().d(wae.HOME);
                    } else if (Intrinsics.g(k2k0Var, k2k0.d.a)) {
                        azm azmVarZ1 = worldCupPassActivity.z1();
                        wae waeVar = wae.DEPOSIT;
                        dag dagVar = dag.INSUFFICIENT_BALANCE;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("EXTRA_ENTRANCE", dagVar);
                        azmVarZ1.e(waeVar, bundle);
                    } else if (Intrinsics.g(k2k0Var, k2k0.e.a)) {
                        worldCupPassActivity.z1().d(wae.ME_GIFTS);
                    } else if (Intrinsics.g(k2k0Var, k2k0.g.a)) {
                        worldCupPassActivity.z1().d(wae.TERMS_AND_CONDITIONS);
                    } else if (Intrinsics.g(k2k0Var, k2k0.f.a)) {
                        worldCupPassActivity.z1().d(wae.CONTACT_US);
                    } else {
                        if (!Intrinsics.g(k2k0Var, k2k0.a.a)) {
                            uhc.a();
                            return null;
                        }
                        worldCupPassActivity.startActivity(new Intent(worldCupPassActivity, (Class<?>) SportyTvRedirectActivity.class));
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0399a(lyh lyhVar, v1b v1bVar, WorldCupPassActivity worldCupPassActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = worldCupPassActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0399a c0399a = new C0399a(this.c, v1bVar, this.d);
                c0399a.b = obj;
                return c0399a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0399a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0400a c0400a = new C0400a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0400a, this) == y5bVar) {
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
        public a(WorldCupPassActivity worldCupPassActivity, lyh lyhVar, v1b v1bVar, WorldCupPassActivity worldCupPassActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = worldCupPassActivity;
            this.c = lyhVar;
            this.d = worldCupPassActivity2;
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
                C0399a c0399a = new C0399a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0399a, this) == y5bVar) {
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
            return WorldCupPassActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return WorldCupPassActivity.this.getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return WorldCupPassActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.v420
    public final u420 E() {
        return u420.l.a;
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        String stringExtra = getIntent().getStringExtra("source");
        if (stringExtra != null) {
            itf0.a aVar = itf0.a;
            aVar.q("WorldCupPass");
            aVar.a("Entry source: %s", stringExtra);
        }
        t340 t340Var = ((y3k0) this.d.getValue()).y;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, t340Var, null, this), 3);
        zn8.a(this, p1a.b);
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        ((y3k0) this.d.getValue()).z1(g1k0.k.a);
        i2k0 i2k0Var = this.c;
        if (i2k0Var != null) {
            i2k0Var.a = null;
        } else {
            Intrinsics.n("depositGate");
            throw null;
        }
    }

    public final azm z1() {
        azm azmVar = this.b;
        if (azmVar != null) {
            return azmVar;
        }
        Intrinsics.n("router");
        throw null;
    }
}
