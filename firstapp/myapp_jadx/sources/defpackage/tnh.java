package defpackage;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltnh;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class tnh extends j8i0 {
    public final mgb0 a;
    public final wwd0 b;

    @c0d(c = "com.sporty.android.platform.features.account.findaccount.FindAccountViewModel$1", f = "FindAccountViewModel.kt", l = {24}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return tnh.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            y5b y5bVar = y5b.a;
            int i = this.a;
            tnh tnhVar = tnh.this;
            if (i == 0) {
                uj50.b(obj);
                mgb0 mgb0Var = tnhVar.a;
                this.a = 1;
                obj = mgb0Var.getLastAccount(this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            String str = (String) obj;
            if (str != null && !StringsKt.U(str)) {
                wwd0 wwd0Var = tnhVar.b;
                do {
                    value = wwd0Var.getValue();
                    ((snh) value).getClass();
                } while (!wwd0Var.g(value, new snh(str)));
            }
            return Unit.a;
        }
    }

    public tnh(mgb0 mgb0Var) {
        mgb0Var.getClass();
        this.a = mgb0Var;
        this.b = xwd0.a(new snh(null));
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public final void x1(String str) {
        wwd0 wwd0Var;
        Object value;
        if (StringsKt.U(str)) {
            return;
        }
        do {
            wwd0Var = this.b;
            value = wwd0Var.getValue();
            ((snh) value).getClass();
        } while (!wwd0Var.g(value, new snh(str)));
    }
}
