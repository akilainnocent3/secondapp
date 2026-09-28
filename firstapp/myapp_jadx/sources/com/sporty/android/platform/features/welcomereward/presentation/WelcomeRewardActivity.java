package com.sporty.android.platform.features.welcomereward.presentation;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.welcomereward.NonFtdRewardType;
import com.sporty.android.core.model.welcomereward.NonFtdTaskType;
import com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.c5j0;
import defpackage.ce;
import defpackage.cyb;
import defpackage.d5j0;
import defpackage.e5j0;
import defpackage.ebs;
import defpackage.ee;
import defpackage.ej5;
import defpackage.f5j0;
import defpackage.ib5;
import defpackage.j4j0;
import defpackage.jq40;
import defpackage.k00;
import defpackage.k4j0;
import defpackage.ku90;
import defpackage.l2j0;
import defpackage.lyh;
import defpackage.m850;
import defpackage.myh;
import defpackage.o7m;
import defpackage.o8i0;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rdd0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.saj;
import defpackage.t340;
import defpackage.t5j0;
import defpackage.tje0;
import defpackage.ud;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.w4j0;
import defpackage.wae;
import defpackage.x0j0;
import defpackage.x1b;
import defpackage.y5b;
import defpackage.z4j0;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sporty/android/platform/features/welcomereward/presentation/WelcomeRewardActivity;", "Lpy1;", "Lbb40;", "Lrlf;", "Lzux;", "<init>", "()V", "Lr4j0;", "uiStatus", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class WelcomeRewardActivity extends o7m implements bb40, rlf, zux {
    public static final /* synthetic */ int f = 0;
    public azm c;
    public l2j0 d;
    public final q8i0 b = new q8i0(jq40.a(w4j0.class), new d(), new c(), new e());
    public final ee<Intent> e = registerForActivityResult(new ce(), new ud() { // from class: z0j0
        @Override // defpackage.ud
        public final void a(Object obj) {
            ActivityResult activityResult = (ActivityResult) obj;
            int i = WelcomeRewardActivity.f;
            activityResult.getClass();
            if (activityResult.a == -1) {
                this.a.z1().y1();
            }
        }
    });

    @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity$onCreate$$inlined$collectWithLifecycle$1", f = "WelcomeRewardActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ WelcomeRewardActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ WelcomeRewardActivity d;

        /* JADX INFO: renamed from: com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity$onCreate$$inlined$collectWithLifecycle$1$1", f = "WelcomeRewardActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C0213a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ WelcomeRewardActivity d;

            /* JADX INFO: renamed from: com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes2.dex */
            public static final class C0214a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ WelcomeRewardActivity b;

                /* JADX INFO: renamed from: com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: loaded from: classes5.dex */
                @c0d(c = "com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity$onCreate$$inlined$collectWithLifecycle$1$1$1", f = "WelcomeRewardActivity.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 50}, m = "emit", v = 2)
                public static final class C0215a extends x1b {
                    public /* synthetic */ Object a;
                    public int b;

                    public C0215a(v1b v1bVar) {
                        super(v1bVar);
                    }

                    @Override // defpackage.pz1
                    public final Object invokeSuspend(Object obj) {
                        this.a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return C0214a.this.emit(null, this);
                    }
                }

                public C0214a(v5b v5bVar, WelcomeRewardActivity welcomeRewardActivity) {
                    this.b = welcomeRewardActivity;
                    this.a = v5bVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
                
                    if (r8 == r1) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:47:0x00c0, code lost:
                
                    if (r7.c(r6, r8, r0) == r1) goto L48;
                 */
                @Override // defpackage.myh
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(T r7, defpackage.v1b<? super kotlin.Unit> r8) {
                    /*
                        Method dump skipped, instruction units count: 202
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sporty.android.platform.features.welcomereward.presentation.WelcomeRewardActivity.a.C0213a.C0214a.emit(java.lang.Object, v1b):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0213a(lyh lyhVar, v1b v1bVar, WelcomeRewardActivity welcomeRewardActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = welcomeRewardActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0213a c0213a = new C0213a(this.c, v1bVar, this.d);
                c0213a.b = obj;
                return c0213a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0213a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0214a c0214a = new C0214a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0214a, this) == y5bVar) {
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
        public a(WelcomeRewardActivity welcomeRewardActivity, lyh lyhVar, v1b v1bVar, WelcomeRewardActivity welcomeRewardActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = welcomeRewardActivity;
            this.c = lyhVar;
            this.d = welcomeRewardActivity2;
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
                C0213a c0213a = new C0213a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0213a, this) == y5bVar) {
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

    public static final /* synthetic */ class b extends saj implements Function1<j4j0, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(j4j0 j4j0Var) {
            j4j0 j4j0Var2 = j4j0Var;
            j4j0Var2.getClass();
            w4j0 w4j0Var = (w4j0) this.receiver;
            rdd0 rdd0Var = w4j0Var.e;
            ku90<k4j0> ku90Var = w4j0Var.I;
            if (j4j0Var2.equals(j4j0.d.a)) {
                ku90Var.a(k4j0.a.a);
                rdd0Var.a(new x0j0.h(0), k00.d, k00.c);
            } else if (j4j0Var2.equals(j4j0.a.a)) {
                ku90Var.a(new k4j0.c(wae.LOYALTY, c5j0.a("tab", AnalyticsEvent.BI_TRACKING_KIND_EVENT)));
            } else if (j4j0Var2 instanceof j4j0.b) {
                j4j0.b bVar = (j4j0.b) j4j0Var2;
                NonFtdRewardType nonFtdRewardType = bVar.b;
                if (bVar.a) {
                    int i = w4j0.a.a[nonFtdRewardType.ordinal()];
                    if (i == 1) {
                        ku90Var.a.a(new k4j0.c(wae.LOYALTY, c5j0.a("tab", AnalyticsEvent.BI_TRACKING_KIND_EVENT)));
                    } else if (i == 2) {
                        ej5.c(o8i0.d(w4j0Var), null, null, new d5j0(w4j0Var, j4j0Var2, null), 3);
                    } else if (i == 3) {
                        ku90Var.a.a(new k4j0.c(wae.LOYALTY, c5j0.a("tab", "mission")));
                    } else {
                        if (i != 4) {
                            uhc.a();
                            return null;
                        }
                        ku90Var.a.a(new k4j0.c(wae.LIVE_HOST, null));
                    }
                    rdd0Var.a(new x0j0.p(nonFtdRewardType.getValue()), k00.d, k00.c);
                }
            } else if (j4j0Var2 instanceof j4j0.c) {
                j4j0.c cVar = (j4j0.c) j4j0Var2;
                NonFtdTaskType nonFtdTaskType = cVar.b;
                boolean z = cVar.a;
                x0j0.d dVar = z ? x0j0.d.COMPLETED : x0j0.d.PENDING;
                int i2 = w4j0.a.b[nonFtdTaskType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            uhc.a();
                            return null;
                        }
                        if (!z) {
                            ku90Var.a(new k4j0.c(wae.DEPOSIT, null));
                        }
                    } else if (!z) {
                        if (cVar.c) {
                            ej5.c(o8i0.d(w4j0Var), null, null, new e5j0(null, w4j0Var), 3);
                        } else {
                            ku90Var.a.a(new k4j0.b(w4j0Var.f.getCountryCode()));
                        }
                    }
                }
                if (nonFtdTaskType != NonFtdTaskType.REGISTER) {
                    rdd0Var.a(new x0j0.g(nonFtdTaskType.getValue(), dVar), k00.d, k00.c);
                }
            } else if (j4j0Var2.equals(j4j0.f.a)) {
                rdd0Var.a(new x0j0.q(0), k00.d, k00.c);
            } else {
                if (!j4j0Var2.equals(j4j0.e.a)) {
                    uhc.a();
                    return null;
                }
                ej5.c(o8i0.d(w4j0Var), null, null, new f5j0(null, w4j0Var), 3);
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
            return WelcomeRewardActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return WelcomeRewardActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return WelcomeRewardActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        w4j0 w4j0VarZ1 = z1();
        ej5.c(o8i0.d(w4j0VarZ1), null, null, new z4j0(null, w4j0VarZ1), 3);
        w4j0 w4j0VarZ2 = z1();
        ej5.c(o8i0.d(w4j0VarZ2), null, null, new t5j0(null, w4j0VarZ2), 3);
        zn8.a(this, new op8(13586100, new Function2() { // from class: y0j0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = WelcomeRewardActivity.f;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final WelcomeRewardActivity welcomeRewardActivity = this.a;
                    final ytw ytwVarC = wyh.c(welcomeRewardActivity.z1().F, aVar, 0, 7);
                    o0z.a(null, null, null, null, null, pp8.b(1373501413, new Function2() { // from class: a1j0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = WelcomeRewardActivity.f;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                r4j0 r4j0Var = (r4j0) ytwVarC.getValue();
                                w4j0 w4j0VarZ3 = welcomeRewardActivity.z1();
                                boolean zA = aVar2.A(w4j0VarZ3);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    WelcomeRewardActivity.b bVar = new WelcomeRewardActivity.b(1, w4j0VarZ3, w4j0.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/welcomereward/WelcomeRewardUiAction;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                w3j0.n(r4j0Var, (Function1) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        t340 t340Var = z1().J;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, t340Var, null, this), 3);
    }

    public final w4j0 z1() {
        return (w4j0) this.b.getValue();
    }
}
