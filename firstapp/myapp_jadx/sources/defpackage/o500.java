package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class o500 {
    public final yqm a;
    public final v5b b;
    public final String c;

    @c0d(c = "com.sportybet.feature.gift.payday.data.PaydayPromoAnTestTracker$reportConversion$1$1", f = "PaydayPromoAnTestTracker.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return o500.this.new a(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yqm yqmVar = o500.this.a;
                this.a = 1;
                if (yqmVar.c(this.c, this.d, null, this) == y5bVar) {
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

    public o500(@ApplicationScope v5b v5bVar, yqm yqmVar, psm psmVar) {
        psmVar.getClass();
        yqmVar.getClass();
        v5bVar.getClass();
        this.a = yqmVar;
        this.b = v5bVar;
        x66 x66Var = (x66) z76.p.get(psmVar.getCountryCode());
        this.c = x66Var != null ? x66Var.a : null;
    }

    public final void a(String str) {
        String str2 = this.c;
        if (str2 != null) {
            ej5.c(this.b, null, null, new a(str2, str, null), 3);
        }
    }
}
