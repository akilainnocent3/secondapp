package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.navigation.compose.NavHostKt$NavHost$25$1", f = "NavHost.kt", l = {534}, m = "invokeSuspend")
public final class kix extends tje0 implements Function2<lyh<? extends sr1>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ sga c;
    public final /* synthetic */ ytw d;
    public final /* synthetic */ isw e;
    public final /* synthetic */ ytw<Boolean> f;

    public static final class a<T> implements myh {
        public final /* synthetic */ ytw a;
        public final /* synthetic */ ytw<Boolean> b;
        public final /* synthetic */ isw c;

        public a(ytw ytwVar, ytw ytwVar2, isw iswVar) {
            this.a = ytwVar;
            this.b = ytwVar2;
            this.c = iswVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            sr1 sr1Var = (sr1) obj;
            if (((List) this.a.getValue()).size() > 1) {
                this.b.setValue(Boolean.TRUE);
                this.c.A(sr1Var.c);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kix(sga sgaVar, ytw ytwVar, isw iswVar, ytw ytwVar2, v1b v1bVar) {
        super(2, v1bVar);
        this.c = sgaVar;
        this.d = ytwVar;
        this.e = iswVar;
        this.f = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        kix kixVar = new kix(this.c, this.d, this.e, this.f, v1bVar);
        kixVar.b = obj;
        return kixVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lyh<? extends sr1> lyhVar, v1b<? super Unit> v1bVar) {
        return ((kix) create(lyhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ifx ifxVar;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ifx ifxVar2 = null;
        ytw<Boolean> ytwVar = this.f;
        sga sgaVar = this.c;
        ytw ytwVar2 = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                lyh lyhVar = (lyh) this.b;
                int size = ((List) ytwVar2.getValue()).size();
                isw iswVar = this.e;
                if (size > 1) {
                    iswVar.A(0.0f);
                    ifxVar2 = (ifx) CollectionsKt.d0((List) ytwVar2.getValue());
                    ifxVar2.getClass();
                    sgaVar.b().f(ifxVar2);
                    sgaVar.b().f((ifx) ((List) ytwVar2.getValue()).get(((List) ytwVar2.getValue()).size() - 2));
                }
                a aVar = new a(ytwVar2, ytwVar, iswVar);
                this.b = ifxVar2;
                this.a = 1;
                if (lyhVar.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
                ifxVar = ifxVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ifxVar = (ifx) this.b;
                uj50.b(obj);
            }
            if (((List) ytwVar2.getValue()).size() > 1) {
                ytwVar.setValue(Boolean.FALSE);
                ifxVar.getClass();
                sgaVar.i(ifxVar, false);
            }
        } catch (CancellationException unused) {
            if (((List) ytwVar2.getValue()).size() > 1) {
                ytwVar.setValue(Boolean.FALSE);
            }
        }
        return Unit.a;
    }
}
