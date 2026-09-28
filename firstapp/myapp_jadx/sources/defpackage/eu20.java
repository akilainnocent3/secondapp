package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberBody;
import com.sporty.android.core.model.primaryphone.UpdatePrimaryPhoneNumberResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.updatephonenumber.PrimaryPhoneUpdatePhoneNumberViewModel$updatePhoneNumber$1", f = "PrimaryPhoneUpdatePhoneNumberViewModel.kt", l = {97}, m = "invokeSuspend", v = 2)
public final class eu20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cu20 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public static final class a<T> implements myh {
        public final /* synthetic */ cu20 a;

        public a(cu20 cu20Var) {
            this.a = cu20Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            cu20 cu20Var = this.a;
            if (z) {
                UpdatePrimaryPhoneNumberResult updatePrimaryPhoneNumberResult = (UpdatePrimaryPhoneNumberResult) ((lk50.c) lk50Var).a;
                wwd0 wwd0Var = cu20Var.i;
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, tkh0.a((tkh0) value5, updatePrimaryPhoneNumberResult.getDepositPhone(), false, false, 0, null, false, 61)));
                String token = updatePrimaryPhoneNumberResult.getToken();
                if (token != null) {
                    cu20Var.x1(new mt20.c(token));
                }
            } else if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var2 = cu20Var.i;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, tkh0.a((tkh0) value2, false, true, false, 0, null, false, 59)));
                Throwable th = ((lk50.a) lk50Var).a;
                boolean z2 = th instanceof SprThrowable;
                wwd0 wwd0Var3 = cu20Var.i;
                if (z2) {
                    SprThrowable sprThrowable = (SprThrowable) th;
                    do {
                        value4 = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value4, tkh0.a((tkh0) value4, false, false, false, sprThrowable.getD(), sprThrowable.getE(), false, 79)));
                } else {
                    do {
                        value3 = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value3, tkh0.a((tkh0) value3, false, false, false, 19999, "", false, 79)));
                }
            } else {
                wwd0 wwd0Var4 = cu20Var.i;
                do {
                    value = wwd0Var4.getValue();
                } while (!wwd0Var4.g(value, tkh0.a((tkh0) value, false, false, false, 0, null, true, 63)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu20(cu20 cu20Var, String str, String str2, v1b<? super eu20> v1bVar) {
        super(2, v1bVar);
        this.b = cu20Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eu20(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eu20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cu20 cu20Var = this.b;
            yzh yzhVarB = bm50.b(cu20Var.c.N(new UpdatePrimaryPhoneNumberBody(this.c, this.d)), vch0.b);
            a aVar = new a(cu20Var);
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
