package com.sportybet.feature.loyalty.impl.notifications.presentation.challenge;

import android.os.Bundle;
import com.google.protobuf.DescriptorProtos;
import defpackage.azm;
import defpackage.bb40;
import defpackage.c0d;
import defpackage.cyb;
import defpackage.ebs;
import defpackage.ej5;
import defpackage.i37;
import defpackage.ib5;
import defpackage.jq40;
import defpackage.k00;
import defpackage.ku90;
import defpackage.lyh;
import defpackage.m850;
import defpackage.myh;
import defpackage.op8;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s9s;
import defpackage.saj;
import defpackage.t340;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.v8i0;
import defpackage.wae;
import defpackage.xnl;
import defpackage.y5b;
import defpackage.yw6;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/notifications/presentation/challenge/ChallengeAnnouncementBottomSheetActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "<init>", "()V", "Lfx6;", "state", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ChallengeAnnouncementBottomSheetActivity extends xnl implements rlf, bb40 {
    public static final /* synthetic */ int d = 0;
    public azm b;
    public final q8i0 c = new q8i0(jq40.a(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.d.class), new d(), new c(), new e());

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.ChallengeAnnouncementBottomSheetActivity$onCreate$$inlined$collectWithLifecycle$default$1", f = "ChallengeAnnouncementBottomSheetActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ChallengeAnnouncementBottomSheetActivity b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ChallengeAnnouncementBottomSheetActivity d;

        /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.ChallengeAnnouncementBottomSheetActivity$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.ChallengeAnnouncementBottomSheetActivity$onCreate$$inlined$collectWithLifecycle$default$1$1", f = "ChallengeAnnouncementBottomSheetActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
        public static final class C0386a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ lyh c;
            public final /* synthetic */ ChallengeAnnouncementBottomSheetActivity d;

            /* JADX INFO: renamed from: com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.ChallengeAnnouncementBottomSheetActivity$a$a$a, reason: collision with other inner class name */
            public static final class C0387a<T> implements myh {
                public final /* synthetic */ v5b a;
                public final /* synthetic */ ChallengeAnnouncementBottomSheetActivity b;

                public C0387a(v5b v5bVar, ChallengeAnnouncementBottomSheetActivity challengeAnnouncementBottomSheetActivity) {
                    this.b = challengeAnnouncementBottomSheetActivity;
                    this.a = v5bVar;
                }

                @Override // defpackage.myh
                public final Object emit(T t, v1b<? super Unit> v1bVar) {
                    com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b bVar = (com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b) t;
                    boolean zG = Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b.a.a);
                    ChallengeAnnouncementBottomSheetActivity challengeAnnouncementBottomSheetActivity = this.b;
                    if (zG) {
                        challengeAnnouncementBottomSheetActivity.finish();
                    } else if (Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b.C0389b.a)) {
                        azm azmVar = challengeAnnouncementBottomSheetActivity.b;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.CHALLENGE);
                        challengeAnnouncementBottomSheetActivity.finish();
                    } else {
                        if (!Intrinsics.g(bVar, com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b.c.a)) {
                            uhc.a();
                            return null;
                        }
                        azm azmVar2 = challengeAnnouncementBottomSheetActivity.b;
                        if (azmVar2 == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar2.d(wae.ME_GIFTS);
                        challengeAnnouncementBottomSheetActivity.finish();
                    }
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0386a(lyh lyhVar, v1b v1bVar, ChallengeAnnouncementBottomSheetActivity challengeAnnouncementBottomSheetActivity) {
                super(2, v1bVar);
                this.c = lyhVar;
                this.d = challengeAnnouncementBottomSheetActivity;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0386a c0386a = new C0386a(this.c, v1bVar, this.d);
                c0386a.b = obj;
                return c0386a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
                return ((C0386a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                v5b v5bVar = (v5b) this.b;
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    C0387a c0387a = new C0387a(v5bVar, this.d);
                    this.b = null;
                    this.a = 1;
                    if (this.c.collect(c0387a, this) == y5bVar) {
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
        public a(ChallengeAnnouncementBottomSheetActivity challengeAnnouncementBottomSheetActivity, lyh lyhVar, v1b v1bVar, ChallengeAnnouncementBottomSheetActivity challengeAnnouncementBottomSheetActivity2) {
            super(2, v1bVar);
            s9s.b bVar = s9s.b.a;
            this.b = challengeAnnouncementBottomSheetActivity;
            this.c = lyhVar;
            this.d = challengeAnnouncementBottomSheetActivity2;
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
                C0386a c0386a = new C0386a(this.c, null, this.d);
                this.a = 1;
                if (m850.a(lifecycle, bVar, c0386a, this) == y5bVar) {
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

    public static final /* synthetic */ class b extends saj implements Function1<com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.a aVar) {
            com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.a aVar2 = aVar;
            aVar2.getClass();
            com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.d dVar = (com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.d) this.receiver;
            ku90<com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b> ku90Var = dVar.d;
            if (aVar2.equals(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.a.C0388a.a)) {
                if (dVar.b != null) {
                    dVar.a.a(i37.m.a, k00.d);
                    ku90Var.a(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b.C0389b.a);
                } else {
                    ku90Var.a(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b.c.a);
                }
            } else {
                if (!aVar2.equals(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.a.b.a)) {
                    uhc.a();
                    return null;
                }
                ku90Var.a(com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.b.a.a);
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
            return ChallengeAnnouncementBottomSheetActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ChallengeAnnouncementBottomSheetActivity.this.getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ChallengeAnnouncementBottomSheetActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zn8.a(this, new op8(-335941790, new yw6(this, 0), true));
        t340 t340Var = ((com.sportybet.feature.loyalty.impl.notifications.presentation.challenge.d) this.c.getValue()).e;
        s9s.b bVar = s9s.b.a;
        ej5.c(ebs.a(getLifecycle()), null, null, new a(this, t340Var, null, this), 3);
    }
}
