package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class zyf0 {
    public static final zyf0 a = new zyf0();
    public static final mpe0 b = hwr.b(new ewb0(1));

    @c0d(c = "com.sportybet.android.util.ToastUtils$show$1", f = "ToastUtils.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ CharSequence a;
        public final /* synthetic */ int b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CharSequence charSequence, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = charSequence;
            this.b = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Toast.makeText(yrh0.j(), this.a, this.b).show();
            return Unit.a;
        }
    }

    public static final void a(int i) {
        Context contextJ = yrh0.j();
        contextJ.getClass();
        c(1, sn5.b(contextJ, i, new Object[0]));
    }

    public static final void b(int i, int i2) {
        Context contextJ = yrh0.j();
        contextJ.getClass();
        c(i2, sn5.b(contextJ, i, new Object[0]));
    }

    public static final void c(int i, CharSequence charSequence) {
        if (charSequence == null || StringsKt.U(charSequence)) {
            return;
        }
        a.getClass();
        ej5.c((v5b) b.getValue(), null, null, new a(charSequence, i, null), 3);
    }

    public static final void d(String str) {
        if (str == null || StringsKt.U(str)) {
            Context contextJ = yrh0.j();
            contextJ.getClass();
            str = sn5.b(contextJ, R.string.common_feedback__sorry_something_went_wrong, new Object[0]);
        }
        c(0, str);
    }
}
