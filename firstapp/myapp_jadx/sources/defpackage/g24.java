package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.BettingStreakMissionBottomSheetActivity;
import com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.BettingStreakMissionBottomSheetActivity$collectEffect$$inlined$collectWithLifecycle$default$1", f = "BettingStreakMissionBottomSheetActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class g24 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ BettingStreakMissionBottomSheetActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ BettingStreakMissionBottomSheetActivity d;

    @c0d(c = "com.sportybet.feature.loyalty.impl.notifications.presentation.streakMission.BettingStreakMissionBottomSheetActivity$collectEffect$$inlined$collectWithLifecycle$default$1$1", f = "BettingStreakMissionBottomSheetActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ BettingStreakMissionBottomSheetActivity d;

        /* JADX INFO: renamed from: g24$a$a, reason: collision with other inner class name */
        public static final class C0591a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ BettingStreakMissionBottomSheetActivity b;

            public C0591a(v5b v5bVar, BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity) {
                this.b = bettingStreakMissionBottomSheetActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                b bVar = (b) t;
                boolean zG = Intrinsics.g(bVar, b.C0395b.a);
                BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity = this.b;
                if (zG) {
                    azm azmVar = bettingStreakMissionBottomSheetActivity.c;
                    if (azmVar == null) {
                        Intrinsics.n("router");
                        throw null;
                    }
                    azmVar.d(wae.DAILY_STREAK);
                } else {
                    if (!Intrinsics.g(bVar, b.a.a)) {
                        uhc.a();
                        return null;
                    }
                    bettingStreakMissionBottomSheetActivity.finish();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = bettingStreakMissionBottomSheetActivity;
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
                C0591a c0591a = new C0591a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0591a, this) == y5bVar) {
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
    public g24(BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity, lyh lyhVar, v1b v1bVar, BettingStreakMissionBottomSheetActivity bettingStreakMissionBottomSheetActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = bettingStreakMissionBottomSheetActivity;
        this.c = lyhVar;
        this.d = bettingStreakMissionBottomSheetActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new g24(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g24) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
