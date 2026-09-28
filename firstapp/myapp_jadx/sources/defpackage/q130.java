package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sportybet.android.gp.tz.R;
import com.sportybet.model.KYCReminderState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$getKYCReminder$1", f = "ProfileViewModel.kt", l = {468}, m = "invokeSuspend", v = 2)
public final class q130 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ a230 b;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ a230 b;

        /* JADX INFO: renamed from: q130$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.profile.ProfileViewModel$getKYCReminder$1$invokeSuspend$$inlined$collectApiResult$default$1", f = "ProfileViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0994a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0994a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ a230 b;

            /* JADX INFO: renamed from: q130$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.feature.profile.ProfileViewModel$getKYCReminder$1$invokeSuspend$$inlined$collectApiResult$default$1$2", f = "ProfileViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0995a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0995a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, a230 a230Var) {
                this.a = myhVar;
                this.b = a230Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0995a c0995a;
                wwd0 wwd0Var = this.b.E;
                if (v1bVar instanceof C0995a) {
                    c0995a = (C0995a) v1bVar;
                    int i = c0995a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0995a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0995a = new C0995a(v1bVar);
                    }
                } else {
                    c0995a = new C0995a(v1bVar);
                }
                Object obj2 = c0995a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0995a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        KYCReminderState.Success success = new KYCReminderState.Success((KYCReminder) ((lk50.c) lk50Var).a);
                        wwd0Var.getClass();
                        wwd0Var.k(null, success);
                    } else if (lk50Var instanceof lk50.a) {
                        wwd0Var.setValue(KYCReminderState.Failure.INSTANCE);
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        wwd0Var.setValue(KYCReminderState.Loading.INSTANCE);
                    }
                    Unit unit = Unit.a;
                    c0995a.b = 1;
                    if (this.a.emit(unit, c0995a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public a(yzh yzhVar, a230 a230Var) {
            this.a = yzhVar;
            this.b = a230Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C0994a c0994a;
            if (v1bVar instanceof C0994a) {
                c0994a = (C0994a) v1bVar;
                int i = c0994a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0994a.b = i - Integer.MIN_VALUE;
                } else {
                    c0994a = new C0994a(v1bVar);
                }
            } else {
                c0994a = new C0994a(v1bVar);
            }
            Object obj = c0994a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0994a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0994a.b = 1;
                if (this.a.collect(bVar, c0994a) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q130(a230 a230Var, v1b<? super q130> v1bVar) {
        super(2, v1bVar);
        this.b = a230Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new q130(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((q130) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a230 a230Var = this.b;
            lyh<BaseResponse<KYCReminder>> lyhVarD0 = a230Var.e.D0();
            StringUiText stringUiText = vch0.a;
            a aVar = new a(bm50.b(lyhVarD0, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), a230Var);
            this.a = 1;
            if (kzh.a(aVar, this) == y5bVar) {
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
