package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.ObserveLNFeatureMatchConfigVerificationUseCase$invoke$1$observeConfig$3", f = "ObserveLNFeatureMatchConfigVerificationUseCase.kt", l = {58, 153}, m = "invokeSuspend", v = 2)
public final class mey extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public quw b;
    public dq40 c;
    public jey.a d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ quw i;
    public final /* synthetic */ jey.a v;
    public final /* synthetic */ jey w;
    public final /* synthetic */ dq40<jey.a> y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mey(quw quwVar, jey.a aVar, jey jeyVar, dq40<jey.a> dq40Var, v1b<? super mey> v1bVar) {
        super(2, v1bVar);
        this.i = quwVar;
        this.v = aVar;
        this.w = jeyVar;
        this.y = dq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mey meyVar = new mey(this.i, this.v, this.w, this.y, v1bVar);
        meyVar.f = obj;
        return meyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mey) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007b A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[Catch: all -> 0x0081, TRY_ENTER, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0093 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0096 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a0 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3 A[Catch: all -> 0x0081, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a9 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:25:0x0077, B:27:0x007b, B:32:0x0083, B:34:0x008b, B:36:0x0093, B:38:0x0098, B:40:0x00a0, B:42:0x00a5, B:41:0x00a3, B:37:0x0096, B:43:0x00a9), top: B:48:0x0077 }] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object obj2;
        quw quwVar;
        jey.a aVar;
        dq40<jey.a> dq40Var;
        e8q bVar2;
        vaq vaqVar;
        vaq vaqVar2;
        y5b y5bVar = y5b.a;
        int i = this.e;
        jey.a aVar2 = this.v;
        try {
            if (i == 0) {
                uj50.b(obj);
                jey jeyVar = this.w;
                zi50.a aVar3 = zi50.b;
                or60 or60Var = new or60(new h5u(jeyVar.a, null));
                this.f = null;
                this.a = null;
                this.e = 1;
                obj = s0i.a(or60Var, this);
                if (obj == y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                uj50.b(obj);
            } else {
                if (i != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aVar = this.d;
                dq40Var = this.c;
                quwVar = this.b;
                obj2 = this.a;
                uj50.b(obj);
            }
            try {
                if (dq40Var.a != aVar) {
                    Unit unit = Unit.a;
                    quwVar.f(null);
                    return unit;
                }
                dq40Var.a = null;
                if (zi50.a(obj2) == null) {
                    avq avqVar = (avq) obj2;
                    if (aVar.a) {
                        vaqVar = vaq.a;
                    } else {
                        vaqVar = vaq.b;
                    }
                    q7q.b bVarB = oey.b(avqVar, vaqVar);
                    if (aVar.a) {
                        vaqVar2 = vaq.a;
                    } else {
                        vaqVar2 = vaq.b;
                    }
                    bVar2 = new e8q.b(bVarB, vaqVar2);
                } else {
                    bVar2 = e8q.a.a;
                }
                quwVar.f(null);
                aVar2.b.G(bVar2);
                return Unit.a;
            } catch (Throwable th) {
                quwVar.f(null);
                throw th;
            }
            bVar = (avq) obj;
            zi50.a aVar4 = zi50.b;
        } catch (Throwable th2) {
            zi50.a aVar5 = zi50.b;
            bVar = new zi50.b(th2);
        }
        this.f = null;
        this.a = bVar;
        quw quwVar2 = this.i;
        this.b = quwVar2;
        dq40<jey.a> dq40Var2 = this.y;
        this.c = dq40Var2;
        this.d = aVar2;
        this.e = 2;
        if (quwVar2.d(this) != y5bVar) {
            obj2 = bVar;
            quwVar = quwVar2;
            aVar = aVar2;
            dq40Var = dq40Var2;
            if (dq40Var.a != aVar) {
                Unit unit2 = Unit.a;
                quwVar.f(null);
                return unit2;
            }
            dq40Var.a = null;
            if (zi50.a(obj2) == null) {
                avq avqVar2 = (avq) obj2;
                if (aVar.a) {
                    vaqVar = vaq.a;
                } else {
                    vaqVar = vaq.b;
                }
                q7q.b bVarB2 = oey.b(avqVar2, vaqVar);
                if (aVar.a) {
                    vaqVar2 = vaq.a;
                } else {
                    vaqVar2 = vaq.b;
                }
                bVar2 = new e8q.b(bVarB2, vaqVar2);
            } else {
                bVar2 = e8q.a.a;
            }
            quwVar.f(null);
            aVar2.b.G(bVar2);
            return Unit.a;
        }
        return y5bVar;
    }
}
