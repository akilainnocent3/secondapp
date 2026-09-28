package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {105, 106, 108}, m = "invokeSuspend")
public final class g2i extends tje0 implements Function2<ez20<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ njs<Object> c;

    @c0d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ njs<Object> a;
        public final /* synthetic */ f2i b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(njs njsVar, f2i f2iVar, v1b v1bVar) {
            super(2, v1bVar);
            this.a = njsVar;
            this.b = f2iVar;
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
            this.a.g(this.b);
            return Unit.a;
        }
    }

    @c0d(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ njs<Object> a;
        public final /* synthetic */ lfy<Object> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(njs<Object> njsVar, lfy<Object> lfyVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.a = njsVar;
            this.b = lfyVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.a, this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.a.k(this.b);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2i(njs<Object> njsVar, v1b<? super g2i> v1bVar) {
        super(2, v1bVar);
        this.c = njsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g2i g2iVar = new g2i(this.c, v1bVar);
        g2iVar.b = obj;
        return g2iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<Object> ez20Var, v1b<? super Unit> v1bVar) throws Throwable {
        ((g2i) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, lfy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f2i, java.lang.Object] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2;
        y5b y5bVar = y5b.a;
        ?? r1 = this.a;
        njs<Object> njsVar = this.c;
        try {
            if (r1 == 0) {
                uj50.b(obj);
                final ez20 ez20Var = (ez20) this.b;
                ?? r2 = new lfy() { // from class: f2i
                    @Override // defpackage.lfy
                    public final void u1(Object obj3) {
                        ez20Var.c(obj3);
                    }
                };
                pfd pfdVar = fse.a;
                vcl vclVarH0 = gku.a.h0();
                a aVar = new a(njsVar, r2, null);
                this.b = r2;
                this.a = 1;
                obj2 = r2;
                if (ej5.d(vclVarH0, aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (r1 != 1) {
                    if (r1 == 2) {
                        uj50.b(obj);
                        throw new zrp();
                    }
                    if (r1 != 3) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Throwable th = (Throwable) this.b;
                    uj50.b(obj);
                    throw th;
                }
                lfy lfyVar = (lfy) this.b;
                uj50.b(obj);
                obj2 = lfyVar;
            }
            this.b = obj2;
            this.a = 2;
            hkd.a(this);
            return y5bVar;
        } catch (Throwable th2) {
            pfd pfdVar2 = fse.a;
            CoroutineContext coroutineContextPlus = gku.a.h0().plus(kxx.a);
            b bVar = new b(njsVar, r1, null);
            this.b = th2;
            this.a = 3;
            if (ej5.d(coroutineContextPlus, bVar, this) != y5bVar) {
                throw th2;
            }
        }
    }
}
