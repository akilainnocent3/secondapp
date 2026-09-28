package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.compose.ui.richtext.RichTextKt$rememberParsedNodes$2$1", f = "RichText.kt", l = {137}, m = "invokeSuspend", v = 2)
public final class at50 extends tje0 implements Function2<bz20<List<? extends y0p>>, v1b<? super Unit>, Object> {
    public bz20 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ String d;

    @c0d(c = "com.sporty.android.compose.ui.richtext.RichTextKt$rememberParsedNodes$2$1$1", f = "RichText.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super List<? extends y0p>>, Object> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = str;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super List<? extends y0p>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return bt50.b(this.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at50(String str, v1b<? super at50> v1bVar) {
        super(2, v1bVar);
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        at50 at50Var = new at50(this.d, v1bVar);
        at50Var.c = obj;
        return at50Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(bz20<List<? extends y0p>> bz20Var, v1b<? super Unit> v1bVar) {
        return ((at50) create(bz20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        bz20 bz20Var = (bz20) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            pfd pfdVar = fse.a;
            a aVar = new a(this.d, null);
            this.c = null;
            this.a = bz20Var;
            this.b = 1;
            obj = ej5.d(pfdVar, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bz20Var = this.a;
            uj50.b(obj);
        }
        bz20Var.setValue(obj);
        return Unit.a;
    }
}
