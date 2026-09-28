package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.primaryphone.VerifyIdentityBody;
import com.sporty.android.core.model.primaryphone.VerifyIdentityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.primaryphone.verifyidentity.PrimaryPhoneVerifyIdentityViewModel$verifyIdentity$1", f = "PrimaryPhoneVerifyIdentityViewModel.kt", l = {84}, m = "invokeSuspend", v = 2)
public final class tv20 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ sv20 b;
    public final /* synthetic */ fjf0 c;
    public final /* synthetic */ fjf0 d;

    public static final class a<T> implements myh {
        public final /* synthetic */ sv20 a;
        public final /* synthetic */ fjf0 b;
        public final /* synthetic */ fjf0 c;

        public a(sv20 sv20Var, fjf0 fjf0Var, fjf0 fjf0Var2) {
            this.a = sv20Var;
            this.b = fjf0Var;
            this.c = fjf0Var2;
        }

        /* JADX WARN: Code duplicated, block: B:56:? A[SYNTHETIC] */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            Object value5;
            Object value6;
            Object value7;
            Object value8;
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            sv20 sv20Var = this.a;
            if (z) {
                wwd0 wwd0Var = sv20Var.e;
                do {
                    value8 = wwd0Var.getValue();
                } while (!wwd0Var.g(value8, d0i0.a((d0i0) value8, false, null, 10000, false, null, null, 58)));
                return sv20Var.i.emit(((VerifyIdentityResult) ((lk50.c) lk50Var).a).getToken(), v1bVar);
            }
            if (lk50Var instanceof lk50.a) {
                wwd0 wwd0Var2 = sv20Var.e;
                do {
                    value2 = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value2, d0i0.a((d0i0) value2, false, null, 0, false, null, null, 62)));
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    SprThrowable sprThrowable = (SprThrowable) th;
                    do {
                        value4 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value4, d0i0.a((d0i0) value4, false, sprThrowable.getE(), sprThrowable.getD(), false, null, null, 57)));
                    int d = sprThrowable.getD();
                    if (d == 11601) {
                        do {
                            value5 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value5, d0i0.a((d0i0) value5, false, null, 0, true, null, null, 55)));
                    } else if (d == 11628) {
                        do {
                            value6 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value6, d0i0.a((d0i0) value6, false, null, 0, false, this.b.a().a.b, null, 47)));
                    } else if (d == 11631) {
                        do {
                            value7 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value7, d0i0.a((d0i0) value7, false, null, 0, false, null, this.c.a().a.b, 31)));
                    } else if (d == 19000) {
                        do {
                            value5 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value5, d0i0.a((d0i0) value5, false, null, 0, true, null, null, 55)));
                    }
                } else {
                    do {
                        value3 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value3, d0i0.a((d0i0) value3, false, null, 0, true, null, null, 55)));
                }
            } else {
                wwd0 wwd0Var3 = sv20Var.e;
                do {
                    value = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value, d0i0.a((d0i0) value, true, null, 0, false, null, null, 62)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv20(sv20 sv20Var, fjf0 fjf0Var, fjf0 fjf0Var2, v1b<? super tv20> v1bVar) {
        super(2, v1bVar);
        this.b = sv20Var;
        this.c = fjf0Var;
        this.d = fjf0Var2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tv20(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((tv20) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            sv20 sv20Var = this.b;
            lyz lyzVar = sv20Var.a;
            fjf0 fjf0Var = this.c;
            String str = fjf0Var.a().a.b;
            fjf0 fjf0Var2 = this.d;
            yzh yzhVarB = bm50.b(lyzVar.K(new VerifyIdentityBody(str, uel.c(fjf0Var2.a().a.b))), vch0.b);
            a aVar = new a(sv20Var, fjf0Var, fjf0Var2);
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
