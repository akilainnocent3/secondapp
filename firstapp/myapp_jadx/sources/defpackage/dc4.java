package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.verifyidentity.BioAuthVerifyIdentityViewModel$validatePassword$1", f = "BioAuthVerifyIdentityViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class dc4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cc4 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0<Unit> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ cc4 a;
        public final /* synthetic */ Function0<Unit> b;

        public a(cc4 cc4Var, Function0<Unit> function0) {
            this.a = cc4Var;
            this.b = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            SprThrowable sprThrowable;
            Object value5;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            cc4 cc4Var = this.a;
            if (z) {
                wwd0 wwd0Var = cc4Var.f;
                do {
                    value5 = wwd0Var.getValue();
                } while (!wwd0Var.g(value5, bc4.a((bc4) value5, false, null, 0, false, 14)));
                this.b.invoke();
            } else if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var2 = cc4Var.f;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, bc4.a((bc4) value2, false, null, 0, false, 14)));
                Throwable th = ((lk50.a) lk50Var).a;
                boolean z2 = th instanceof SprThrowable;
                wwd0 wwd0Var3 = cc4Var.f;
                if (z2) {
                    do {
                        value4 = wwd0Var3.getValue();
                        sprThrowable = (SprThrowable) th;
                    } while (!wwd0Var3.g(value4, bc4.a((bc4) value4, false, sprThrowable.getE(), sprThrowable.getD(), false, 9)));
                } else {
                    do {
                        value3 = wwd0Var3.getValue();
                    } while (!wwd0Var3.g(value3, bc4.a((bc4) value3, false, "", 0, true, 5)));
                }
            } else {
                wwd0 wwd0Var4 = cc4Var.f;
                do {
                    value = wwd0Var4.getValue();
                } while (!wwd0Var4.g(value, bc4.a((bc4) value, true, null, 0, false, 14)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc4(cc4 cc4Var, String str, Function0<Unit> function0, v1b<? super dc4> v1bVar) {
        super(2, v1bVar);
        this.b = cc4Var;
        this.c = str;
        this.d = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dc4(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dc4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            cc4 cc4Var = this.b;
            w74 w74Var = cc4Var.a;
            String strP = cc4Var.c.P();
            String phoneNumber = cc4Var.b.getPhoneNumber();
            phoneNumber.getClass();
            yzh yzhVarB = bm50.b(w74Var.f(strP, phoneNumber, uel.c(this.c)), vch0.b);
            a aVar = new a(cc4Var, this.d);
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
