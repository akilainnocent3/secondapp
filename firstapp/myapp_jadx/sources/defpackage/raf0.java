package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.account.telegram.BindTelegramBody;
import com.sportybet.android.gp.tz.R;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$bindTelegramAccount$1", f = "TelegramBindingViewModel.kt", l = {202}, m = "invokeSuspend", v = 2)
public final class raf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ HashMap<String, Object> b;
    public final /* synthetic */ vaf0 c;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ vaf0 b;

        /* JADX INFO: renamed from: raf0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$bindTelegramAccount$1$invokeSuspend$$inlined$handleApiUnitResult$default$1", f = "TelegramBindingViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1044a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1044a(v1b v1bVar) {
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
            public final /* synthetic */ vaf0 b;

            /* JADX INFO: renamed from: raf0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$bindTelegramAccount$1$invokeSuspend$$inlined$handleApiUnitResult$default$1$2", f = "TelegramBindingViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1045a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1045a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, vaf0 vaf0Var) {
                this.a = myhVar;
                this.b = vaf0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C1045a c1045a;
                Object value;
                Object value2;
                Object value3;
                Object value4;
                vaf0 vaf0Var = this.b;
                wwd0 wwd0Var = vaf0Var.w;
                if (v1bVar instanceof C1045a) {
                    c1045a = (C1045a) v1bVar;
                    int i = c1045a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1045a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1045a = new C1045a(v1bVar);
                    }
                } else {
                    c1045a = new C1045a(v1bVar);
                }
                Object obj2 = c1045a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1045a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        wwd0 wwd0Var2 = vaf0Var.i;
                        do {
                            value3 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value3, qaf0.a((qaf0) value3, null, true, 1)));
                        do {
                            value4 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value4, null));
                    } else if (lk50Var instanceof lk50.a) {
                        lk50.a aVar = (lk50.a) lk50Var;
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, new oaf0.a(aVar.b)));
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        do {
                            value = wwd0Var.getValue();
                        } while (!wwd0Var.g(value, oaf0.b.a));
                    }
                    Unit unit = Unit.a;
                    c1045a.b = 1;
                    if (this.a.emit(unit, c1045a) == y5bVar) {
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

        public a(yzh yzhVar, vaf0 vaf0Var) {
            this.a = yzhVar;
            this.b = vaf0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C1044a c1044a;
            if (v1bVar instanceof C1044a) {
                c1044a = (C1044a) v1bVar;
                int i = c1044a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1044a.b = i - Integer.MIN_VALUE;
                } else {
                    c1044a = new C1044a(v1bVar);
                }
            } else {
                c1044a = new C1044a(v1bVar);
            }
            Object obj = c1044a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1044a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c1044a.b = 1;
                if (this.a.collect(bVar, c1044a) == y5bVar) {
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
    public raf0(HashMap<String, Object> map, vaf0 vaf0Var, v1b<? super raf0> v1bVar) {
        super(2, v1bVar);
        this.b = map;
        this.c = vaf0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new raf0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((raf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            vaf0 vaf0Var = this.c;
            String phoneNumber = vaf0Var.b.getPhoneNumber();
            phoneNumber.getClass();
            lyh<BaseResponse<Unit>> lyhVarQ = vaf0Var.a.q(new BindTelegramBody(this.b, phoneNumber, vaf0Var.c.P()));
            StringUiText stringUiText = vch0.a;
            a aVar = new a(bm50.c(lyhVarQ, new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again)), vaf0Var);
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
