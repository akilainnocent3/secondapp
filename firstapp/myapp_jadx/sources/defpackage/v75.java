package defpackage;

import com.sporty.android.core.model.dispatcher.ApplicationScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v75 {
    public final yqm a;
    public final v5b b;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonAnTestReporter$reportConversion$1", f = "BrDepositHotButtonAnTestReporter.kt", l = {32}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return v75.this.new a(this.c, v1bVar);
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
                yqm yqmVar = v75.this.a;
                String str = z76.v.a;
                this.a = 1;
                if (yqmVar.c(str, this.c, null, this) == y5bVar) {
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

    public v75(yqm yqmVar, @ApplicationScope v5b v5bVar) {
        yqmVar.getClass();
        v5bVar.getClass();
        this.a = yqmVar;
        this.b = v5bVar;
    }

    public final void a(String str) {
        ej5.c(this.b, null, null, new a(str, null), 3);
    }
}
