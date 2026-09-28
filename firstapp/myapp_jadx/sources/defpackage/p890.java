package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.settings.shortcutwidget.ShortcutWidgetConfigureViewModel$initShortcutsList$1", f = "ShortcutWidgetConfigureViewModel.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class p890 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r890 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ r890 a;

        public a(r890 r890Var) {
            this.a = r890Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            this.a.b.setValue((uf00) obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p890(r890 r890Var, v1b<? super p890> v1bVar) {
        super(2, v1bVar);
        this.b = r890Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p890(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p890) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            r890 r890Var = this.b;
            yzh yzhVarA = r890Var.a.a();
            a aVar = new a(r890Var);
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
