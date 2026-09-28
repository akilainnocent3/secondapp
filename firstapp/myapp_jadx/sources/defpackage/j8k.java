package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.featurematch.domain.GetLuckyNumberFeatureMatchUseCaseImpl$invoke$1", f = "GetLuckyNumberFeatureMatchUseCaseImpl.kt", l = {21, DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class j8k extends tje0 implements Function2<ez20<? super q7q>, v1b<? super Unit>, Object> {
    public dq40 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ku90 d;
    public final /* synthetic */ k8k e;

    public static final class a<T> implements myh {
        public final /* synthetic */ dq40<q7q.b> a;
        public final /* synthetic */ k8k b;
        public final /* synthetic */ ez20<q7q> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dq40<q7q.b> dq40Var, k8k k8kVar, ez20<? super q7q> ez20Var) {
            this.a = dq40Var;
            this.b = k8kVar;
            this.c = ez20Var;
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0084  */
        /* JADX WARN: Code duplicated, block: B:33:0x008a  */
        /* JADX WARN: Code duplicated, block: B:37:0x0095 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object c(v1b v1bVar) {
            i8k i8kVar;
            T t;
            Object objJ;
            if (v1bVar instanceof i8k) {
                i8kVar = (i8k) v1bVar;
                int i = i8kVar.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    i8kVar.c = i - Integer.MIN_VALUE;
                } else {
                    i8kVar = new i8k(this, v1bVar);
                }
            } else {
                i8kVar = new i8k(this, v1bVar);
            }
            Object objP = i8kVar.a;
            y5b y5bVar = y5b.a;
            int i2 = i8kVar.c;
            ez20<q7q> ez20Var = this.c;
            dq40<q7q.b> dq40Var = this.a;
            if (i2 == 0) {
                uj50.b(objP);
                q7q.b bVar = dq40Var.a;
                if (bVar != null) {
                    vaq vaqVar = vaq.a;
                    q7q.d dVar = new q7q.d(bVar);
                    i8kVar.c = 1;
                    if (ez20Var.j(i8kVar, dVar) != y5bVar) {
                    }
                }
                return y5bVar;
            }
            if (i2 == 1) {
                uj50.b(objP);
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        uj50.b(objP);
                        return objP;
                    }
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(objP);
            }
            t = (T) ((q7q.b) bm50.i((lk50) objP));
            if (t == null) {
                t = (T) q7q.a.a;
            }
            if (t instanceof q7q.b) {
                dq40Var.a = t;
            }
            i8kVar.c = 3;
            objJ = ez20Var.j(i8kVar, t);
            if (objJ != y5bVar) {
                return y5bVar;
            }
            return objJ;
            yzh yzhVarA = bm50.a(new h8k(new or60(new h5u(this.b.a, null))));
            i8kVar.c = 2;
            objP = bm50.p(yzhVarA, i8kVar);
            if (objP != y5bVar) {
                t = (T) ((q7q.b) bm50.i((lk50) objP));
                if (t == null) {
                    t = (T) q7q.a.a;
                }
                if (t instanceof q7q.b) {
                    dq40Var.a = t;
                }
                i8kVar.c = 3;
                objJ = ez20Var.j(i8kVar, t);
                if (objJ != y5bVar) {
                    return objJ;
                }
            }
            return y5bVar;
        }

        @Override // defpackage.myh
        public final /* bridge */ /* synthetic */ Object emit(Object obj, v1b v1bVar) {
            return c(v1bVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8k(ku90 ku90Var, k8k k8kVar, v1b v1bVar) {
        super(2, v1bVar);
        this.d = ku90Var;
        this.e = k8kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j8k j8kVar = new j8k(this.d, this.e, v1bVar);
        j8kVar.c = obj;
        return j8kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super q7q> ez20Var, v1b<? super Unit> v1bVar) {
        ((j8k) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        dq40 dq40VarA;
        ez20 ez20Var = (ez20) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            dq40VarA = j6w.a(obj);
            q7q.c cVar = q7q.c.a;
            this.c = ez20Var;
            this.a = dq40VarA;
            this.b = 1;
            if (ez20Var.j(this, cVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dq40VarA = this.a;
            uj50.b(obj);
        }
        a aVar = new a(dq40VarA, this.e, ez20Var);
        this.c = null;
        this.a = null;
        this.b = 2;
        this.d.collect(aVar, this);
        return y5bVar;
    }
}
