package defpackage;

import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.io.Closeable;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class all implements r8i0.c {
    public static final a d = new a();
    public final Map<Class<?>, Boolean> a;
    public final r8i0.c b;
    public final b c;

    /* JADX INFO: loaded from: classes.dex */
    public class a implements cyb.b<Function1<Object, j8i0>> {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b implements r8i0.c {
        public final /* synthetic */ qmc a;

        public b(qmc qmcVar) {
            this.a = qmcVar;
        }

        @Override // r8i0.c
        public final j8i0 a(Class cls, dsw dswVar) {
            j8i0 j8i0Var;
            final nn50 nn50Var = new nn50();
            vu60 vu60VarA = dv60.a(dswVar);
            qmc qmcVar = this.a;
            qmcVar.getClass();
            zmc zmcVar = new zmc(qmcVar.a, qmcVar.b, new rc5(), new ce5(), new w53(), new lci(), new jhi(), new lo9(), new ktn(), new qo9(), new iyn(), new xzn(), new sw9(), new uw9(), new c4o(), new abo(), new mfo(), new cgo(), new pno(), new lqo(), new r1v(), new w2v(), new f4v(), new tuy(), new vuy(), new l170(), new qvy(), new tvy(), new auf(), new k570(), new qvf(), new q770(), new oxf(), new y2z(), new ezf(), new xzf(), new e2g(), new c3g(), new of70(), new q9g(), new qj70(), new bm2(), new pcg(), new u250(), new s3s(), new tj9(), new hm9(), new lta0(), new nac0(), new bbc0(), new kbc0(), new zbc0(), new uec0(), new jgc0(), new a39(), new a54(), new wxm(), new js00(), new hoc0(), new ff4(), new vvc0(), new zvc0(), new txc0(), new hzc0(), new gxr(), new dh9(), new eh9(), new t3s(), new egi(), new xjo(), new sji0(), vu60VarA);
            m730 m730Var = (m730) ((d) jm2.a(zmcVar, d.class)).a().get(cls);
            Function1 function1 = (Function1) dswVar.a.get(all.d);
            Object obj = ((d) jm2.a(zmcVar, d.class)).b().get(cls);
            if (obj == null) {
                if (function1 != null) {
                    ds1.a(cls.getName(), "Found creation callback but class ", " does not have an assisted factory specified in @HiltViewModel.");
                    return null;
                }
                if (m730Var == null) {
                    ds1.a(cls.getName(), "Expected the @HiltViewModel-annotated class ", " to be available in the multi-binding of @HiltViewModelMap but none was found.");
                    return null;
                }
                j8i0Var = (j8i0) m730Var.get();
            } else {
                if (m730Var != null) {
                    throw new AssertionError(dLRYz.eMhGuOdeO + cls.getName() + " in both the multi-bindings of @HiltViewModelMap and @HiltViewModelAssistedMap.");
                }
                if (function1 == null) {
                    ds1.a(cls.getName(), "Found @HiltViewModel-annotated class ", " using @AssistedInject but no creation callback was provided in CreationExtras.");
                    return null;
                }
                j8i0Var = (j8i0) function1.invoke(obj);
            }
            j8i0Var.addCloseable(new Closeable() { // from class: bll
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    nn50Var.a();
                }
            });
            return j8i0Var;
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public interface c {
        wtr E();

        qmc P2();
    }

    public interface d {
        wtr a();

        wtr b();
    }

    public all(Map<Class<?>, Boolean> map, r8i0.c cVar, qmc qmcVar) {
        this.a = map;
        this.b = cVar;
        this.c = new b(qmcVar);
    }

    @Override // r8i0.c
    public final j8i0 a(Class cls, dsw dswVar) {
        return this.a.containsKey(cls) ? this.c.a(cls, dswVar) : this.b.a(cls, dswVar);
    }

    @Override // r8i0.c
    public final <T extends j8i0> T c(Class<T> cls) {
        if (!this.a.containsKey(cls)) {
            return (T) this.b.c(cls);
        }
        zkh.a("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        return null;
    }
}
