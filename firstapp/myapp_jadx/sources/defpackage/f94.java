package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.biometric.BioAuthUsageResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.settings.BioAuthSettingsViewModel$modifyBioAuthUsage$1", f = "BioAuthSettingsViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class f94 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i94 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

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
            boolean z = lk50Var instanceof lk50.c;
            i94 i94Var = this.a;
            if (z) {
                BioAuthUsageResponse bioAuthUsageResponse = (BioAuthUsageResponse) ((lk50.c) lk50Var).a;
                wwd0 wwd0Var = i94Var.v;
                do {
                    value3 = wwd0Var.getValue();
                } while (!wwd0Var.g(value3, d94.a((d94) value3, null, null, bioAuthUsageResponse.getUseForLogin(), bioAuthUsageResponse.getUseForSportyPin(), null, false, null, 0, 243)));
            } else if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    wwd0 wwd0Var2 = i94Var.v;
                    do {
                        value2 = wwd0Var2.getValue();
                    } while (!wwd0Var2.g(value2, d94.a((d94) value2, null, null, false, false, null, false, ((SprThrowable) th).getE(), 0, 191)));
                }
                wwd0 wwd0Var3 = i94Var.v;
                do {
                    value = wwd0Var3.getValue();
                } while (!wwd0Var3.g(value, d94.a((d94) value, null, null, false, false, null, true, null, 0, 223)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f94(i94 i94Var, boolean z, boolean z2, v1b<? super f94> v1bVar) {
        super(2, v1bVar);
        this.b = i94Var;
        this.c = z;
        this.d = z2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f94(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f94) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            yzh yzhVarB = bm50.b(w74Var.b(strP, phoneNumber, i94Var.f.a().a, this.c, this.d), vch0.b);
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
