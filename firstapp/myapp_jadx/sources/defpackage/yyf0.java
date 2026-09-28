package defpackage;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class yyf0 {
    public static final mpe0 a = hwr.b(new xyf0());

    @c0d(c = "com.sportygames.commons.tw_commons.utils.ToastUtils$show$1", f = "ToastUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, String str, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = context;
            this.b = str;
            this.c = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            Toast.makeText(this.a, this.b, this.c).show();
            return Unit.a;
        }
    }

    public static final void a(int i, Context context, String str) {
        context.getClass();
        if (str == null || StringsKt.U(str)) {
            return;
        }
        ej5.c((v5b) a.getValue(), null, null, new a(context, str, i, null), 3);
    }
}
