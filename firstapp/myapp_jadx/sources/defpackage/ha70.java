package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.ScheduledFootballOpenBetsActivity;
import com.sportybet.android.instantwin.router.bethistory2.InstantWinBetHistoryInput;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.ScheduledFootballOpenBetsActivity$setupViewModel$$inlined$collectWithLifecycle$1", f = "ScheduledFootballOpenBetsActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class ha70 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ScheduledFootballOpenBetsActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ ScheduledFootballOpenBetsActivity d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootballopenbets.ScheduledFootballOpenBetsActivity$setupViewModel$$inlined$collectWithLifecycle$1$1", f = "ScheduledFootballOpenBetsActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ ScheduledFootballOpenBetsActivity d;

        /* JADX INFO: renamed from: ha70$a$a, reason: collision with other inner class name */
        public static final class C0631a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ ScheduledFootballOpenBetsActivity b;

            public C0631a(v5b v5bVar, ScheduledFootballOpenBetsActivity scheduledFootballOpenBetsActivity) {
                this.b = scheduledFootballOpenBetsActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                vc70 vc70Var = (vc70) t;
                int i = ScheduledFootballOpenBetsActivity.d;
                boolean z = vc70Var instanceof tc70;
                ScheduledFootballOpenBetsActivity scheduledFootballOpenBetsActivity = this.b;
                if (z) {
                    scheduledFootballOpenBetsActivity.finish();
                } else {
                    if (!(vc70Var instanceof uc70)) {
                        uhc.a();
                        return null;
                    }
                    InstantWinBetHistoryInput instantWinBetHistoryInput = new InstantWinBetHistoryInput(((uc70) vc70Var).a);
                    jlo jloVar = scheduledFootballOpenBetsActivity.c;
                    if (jloVar == null) {
                        Intrinsics.n("instantWinRouter");
                        throw null;
                    }
                    scheduledFootballOpenBetsActivity.startActivity(jloVar.t(scheduledFootballOpenBetsActivity, instantWinBetHistoryInput));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, ScheduledFootballOpenBetsActivity scheduledFootballOpenBetsActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = scheduledFootballOpenBetsActivity;
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
                C0631a c0631a = new C0631a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0631a, this) == y5bVar) {
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
    public ha70(ScheduledFootballOpenBetsActivity scheduledFootballOpenBetsActivity, lyh lyhVar, v1b v1bVar, ScheduledFootballOpenBetsActivity scheduledFootballOpenBetsActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = scheduledFootballOpenBetsActivity;
        this.c = lyhVar;
        this.d = scheduledFootballOpenBetsActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new ha70(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ha70) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
