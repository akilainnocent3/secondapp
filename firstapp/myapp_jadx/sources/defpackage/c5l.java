package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.integrity.GooglePlayIntegrityVerifier$1", f = "GooglePlayIntegrityVerifier.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class c5l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j5l b;

    public static final class a<T> implements myh {
        public final /* synthetic */ j5l a;

        public a(j5l j5lVar) {
            this.a = j5lVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((Boolean) obj).booleanValue()) {
                j5l j5lVar = this.a;
                ej5.c(j5lVar.e, null, null, new h5l(j5lVar, null), 3);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5l(j5l j5lVar, v1b<? super c5l> v1bVar) {
        super(2, v1bVar);
        this.b = j5lVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c5l(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((c5l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        j5l j5lVar = this.b;
        wwd0 wwd0Var = j5lVar.v;
        a aVar = new a(j5lVar);
        this.a = 1;
        wwd0Var.collect(aVar, this);
        return y5bVar;
    }
}
