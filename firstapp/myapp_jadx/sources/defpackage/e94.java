package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.biometric.BioAuthUsageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.settings.BioAuthSettingsViewModel$fetchBioAuthUsage$1", f = "BioAuthSettingsViewModel.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class e94 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i94 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ i94 a;

        public a(i94 i94Var) {
            this.a = i94Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            Object value3;
            lk50 lk50Var = (lk50) obj;
            i94 i94Var = this.a;
            wwd0 wwd0Var = i94Var.v;
            if (lk50Var instanceof lk50.c) {
                BioAuthUsageResponse bioAuthUsageResponse = (BioAuthUsageResponse) ((lk50.c) lk50Var).a;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, d94.a((d94) value3, null, null, bioAuthUsageResponse.getUseForLogin(), bioAuthUsageResponse.getUseForSportyPin(), null, false, null, 0, 243)));
                if (i94Var.i.b == 0) {
                    ej5.c(o8i0.d(i94Var), null, null, new h94(i94Var, null), 3);
                }
            } else if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, d94.a((d94) value2, null, null, false, false, null, false, ((SprThrowable) th).getE(), 0, 191)));
                }
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, d94.a((d94) value, null, null, false, false, null, true, null, 0, 223)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e94(i94 i94Var, v1b<? super e94> v1bVar) {
        super(2, v1bVar);
        this.b = i94Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e94(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e94) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            i94 i94Var = this.b;
            w74 w74Var = i94Var.a;
            String strP = i94Var.e.P();
            String phoneNumber = i94Var.d.getPhoneNumber();
            phoneNumber.getClass();
            yzh yzhVarB = bm50.b(w74Var.e(strP, phoneNumber, i94Var.f.a().a), vch0.b);
            a aVar = new a(i94Var);
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
