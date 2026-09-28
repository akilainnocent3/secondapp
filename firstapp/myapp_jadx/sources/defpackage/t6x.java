package defpackage;

import android.accounts.Account;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.nin.SubmitNINBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.kyc.nin.NINVerificationViewModel$submitNIN$2", f = "NINVerificationViewModel.kt", l = {139}, m = "invokeSuspend", v = 2)
public final class t6x extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ s6x c;
    public final /* synthetic */ Function0<Unit> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ s6x b;
        public final /* synthetic */ Function0<Unit> c;

        public a(boolean z, s6x s6xVar, Function0<Unit> function0) {
            this.a = z;
            this.b = s6xVar;
            this.c = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            p6x p6xVar;
            Object value4;
            lk50 lk50Var = (lk50) obj;
            s6x s6xVar = this.b;
            ytw ytwVar = s6xVar.e;
            wwd0 wwd0Var = s6xVar.v;
            boolean z = lk50Var instanceof lk50.c;
            boolean z2 = this.a;
            if (z) {
                if (z2) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, p6x.a((p6x) value4, null, null, 0, false, false, false, 0, null, 415)));
                } else if (z2 || ((p6x) wwd0Var.getValue()).c != 100) {
                    ((x5a0) ytwVar).setValue(Boolean.TRUE);
                } else {
                    ((x5a0) ytwVar).setValue(Boolean.FALSE);
                    this.c.invoke();
                }
            } else if (lk50Var instanceof lk50.a) {
                if (z2) {
                    Throwable th = ((lk50.a) lk50Var).a;
                    if (th instanceof SprThrowable) {
                        SprThrowable sprThrowable = (SprThrowable) th;
                        do {
                            value3 = wwd0Var.getValue();
                            p6xVar = (p6x) value3;
                        } while (!wwd0Var.g(value3, p6x.a(p6xVar, null, new ijf0(p6xVar.a.a.b, 0L, 6), 0, false, false, false, sprThrowable.getD(), sprThrowable.getE(), 93)));
                    } else {
                        do {
                            value2 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value2, p6x.a((p6x) value2, null, null, 0, false, true, false, 0, null, 463)));
                    }
                } else {
                    ((x5a0) ytwVar).setValue(Boolean.TRUE);
                }
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                if (z2) {
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, p6x.a((p6x) value, null, null, 0, false, false, true, 0, null, 479)));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6x(boolean z, s6x s6xVar, Function0<Unit> function0, v1b<? super t6x> v1bVar) {
        super(2, v1bVar);
        this.b = z;
        this.c = s6xVar;
        this.d = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new t6x(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((t6x) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        SubmitNINBody submitNINBody;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s6x s6xVar = this.c;
            String str = s6xVar.c;
            boolean z = this.b;
            if (z) {
                submitNINBody = new SubmitNINBody(str, s6xVar.d, ((p6x) s6xVar.v.getValue()).a.a.b, 1);
            } else {
                String str2 = s6xVar.d;
                String str3 = ((Account) s6xVar.f.getValue()).name;
                str3.getClass();
                submitNINBody = new SubmitNINBody(str, str2, str3, 2);
            }
            yzh yzhVarA = bm50.a(s6xVar.a.R(submitNINBody));
            a aVar = new a(z, s6xVar, this.d);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
