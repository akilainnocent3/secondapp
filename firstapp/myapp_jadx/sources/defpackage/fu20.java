package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameBody;
import com.sporty.android.core.model.primaryphone.PrimaryPhoneVerifyNameResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.updatephonenumber.PrimaryPhoneUpdatePhoneNumberViewModel$verifyNameUnderNewPhone$1", f = "PrimaryPhoneUpdatePhoneNumberViewModel.kt", l = {152}, m = "invokeSuspend", v = 2)
public final class fu20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cu20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;

    public static final class a<T> implements myh {
        public final /* synthetic */ cu20 a;
        public final /* synthetic */ boolean b;

        public a(cu20 cu20Var, boolean z) {
            this.a = cu20Var;
            this.b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            lk50 lk50Var = (lk50) obj;
            cu20 cu20Var = this.a;
            wwd0 wwd0Var = cu20Var.i;
            if (lk50Var instanceof lk50.c) {
                do {
                    value4 = wwd0Var.getValue();
                } while (!wwd0Var.g(value4, tkh0.a((tkh0) value4, false, false, false, 0, null, false, 63)));
                String token = ((PrimaryPhoneVerifyNameResult) ((lk50.c) lk50Var).a).getToken();
                if (!this.b || token == null || ((tkh0) wwd0Var.getValue()).b) {
                    cu20Var.x1(mt20.e.a);
                } else {
                    cu20Var.x1(new mt20.d(cu20Var.y1().a().a.b, token));
                }
            } else if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    SprThrowable sprThrowable = (SprThrowable) th;
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, tkh0.a((tkh0) value3, false, false, true, sprThrowable.getD(), sprThrowable.getE(), false, 7)));
                } else {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, tkh0.a((tkh0) value2, false, false, true, 19999, "", false, 7)));
                }
            } else {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, tkh0.a((tkh0) value, false, false, false, 0, null, true, 63)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu20(cu20 cu20Var, String str, boolean z, v1b<? super fu20> v1bVar) {
        super(2, v1bVar);
        this.b = cu20Var;
        this.c = str;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fu20(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fu20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cu20 cu20Var = this.b;
            yzh yzhVarB = bm50.b(cu20Var.c.s0(new PrimaryPhoneVerifyNameBody(this.c)), vch0.b);
            a aVar = new a(cu20Var, this.d);
            this.a = 1;
            if (yzhVarB.collect(aVar, this) == y5bVar) {
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
