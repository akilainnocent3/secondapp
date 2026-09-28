package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LNBottomSheetKt$LNBottomSheet$3$1", f = "LNBottomSheet.kt", l = {181}, m = "invokeSuspend", v = 2)
public final class a4q extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ytw<h4q> b;
    public final /* synthetic */ i20<m4q> c;
    public final /* synthetic */ ytw<Boolean> d;
    public final /* synthetic */ ytw<Object> e;
    public final /* synthetic */ osw f;
    public final /* synthetic */ ytw i;

    public static final class a<T> implements myh {
        public final /* synthetic */ ytw<h4q> a;
        public final /* synthetic */ ytw<Boolean> b;
        public final /* synthetic */ ytw<T> c;
        public final /* synthetic */ osw d;
        public final /* synthetic */ ytw e;

        public a(ytw ytwVar, ytw ytwVar2, ytw ytwVar3, osw oswVar, ytw ytwVar4) {
            this.a = ytwVar;
            this.b = ytwVar2;
            this.c = ytwVar3;
            this.d = oswVar;
            this.e = ytwVar4;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((m4q) obj) == m4q.a) {
                ytw<h4q> ytwVar = this.a;
                if (ytwVar.getValue() == h4q.c) {
                    this.b.setValue(Boolean.FALSE);
                    this.c.setValue(null);
                    this.d.k(0);
                    ytwVar.setValue(h4q.a);
                    ((Function0) this.e.getValue()).invoke();
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4q(ytw ytwVar, i20 i20Var, ytw ytwVar2, ytw ytwVar3, osw oswVar, ytw ytwVar4, v1b v1bVar) {
        super(2, v1bVar);
        this.b = ytwVar;
        this.c = i20Var;
        this.d = ytwVar2;
        this.e = ytwVar3;
        this.f = oswVar;
        this.i = ytwVar4;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a4q(this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a4q) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ytw<h4q> ytwVar = this.b;
            if (ytwVar.getValue() != h4q.c) {
                return Unit.a;
            }
            lyh lyhVarB = uzh.b(n95.c(new d5g(this.c, 1)));
            a aVar = new a(ytwVar, this.d, this.e, this.f, this.i);
            this.a = 1;
            if (lyhVarB.collect(aVar, this) == y5bVar) {
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
