package defpackage;

import android.util.Log;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class v4d<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends wg50<DataType, ResourceType>> b;
    public final qh50<ResourceType, Transcode> c;
    public final b220<List<Throwable>> d;
    public final String e;

    public v4d(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends wg50<DataType, ResourceType>> list, qh50<ResourceType, Transcode> qh50Var, b220<List<Throwable>> b220Var) {
        this.a = cls;
        this.b = list;
        this.c = qh50Var;
        this.d = b220Var;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final qg50 a(int i, int i2, u4d.a aVar, s2z s2zVar, a aVar2) {
        qg50 qg50VarA;
        nsg0 nsg0Var;
        c4g c4gVarA;
        zg50 zg50Var;
        qg50 qg50Var;
        boolean z;
        nlp oocVar;
        b220<List<Throwable>> b220Var = this.d;
        List<Throwable> listB = b220Var.b();
        gm20.c(listB, "Argument must not be null");
        try {
            qg50<ResourceType> qg50VarB = b(aVar2, i, i2, s2zVar, listB);
            b220Var.a(listB);
            u4d u4dVar = u4d.this;
            cqc cqcVar = aVar.a;
            s4d<R> s4dVar = u4dVar.a;
            Class<?> cls = qg50VarB.get().getClass();
            if (cqcVar != cqc.d) {
                nsg0 nsg0VarE = s4dVar.e((Class<Z>) cls);
                nsg0Var = nsg0VarE;
                qg50VarA = nsg0VarE.a(u4dVar.v, qg50VarB, u4dVar.A, u4dVar.B);
            } else {
                qg50VarA = qg50VarB;
                nsg0Var = null;
            }
            if (!qg50VarB.equals(qg50VarA)) {
                qg50VarB.c();
            }
            if (s4dVar.c.a().d.a(qg50VarA.d()) != null) {
                zg50 zg50VarA = s4dVar.c.a().d.a(qg50VarA.d());
                if (zg50VarA == null) {
                    throw new x050.d(qg50VarA.d());
                }
                c4gVarA = zg50VarA.a(u4dVar.D);
                zg50Var = zg50VarA;
            } else {
                c4gVarA = c4g.c;
                zg50Var = null;
            }
            nlp nlpVar = u4dVar.N;
            ArrayList arrayListB = s4dVar.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    qg50Var = null;
                    z = false;
                    break;
                }
                qg50Var = null;
                if (((i2w.a) arrayListB.get(i3)).a.equals(nlpVar)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = qg50VarA;
            if (u4dVar.C.d(!z, cqcVar, c4gVarA)) {
                if (zg50Var == null) {
                    throw new x050.d(qg50VarA.get().getClass());
                }
                int iOrdinal = c4gVarA.ordinal();
                if (iOrdinal == 0) {
                    oocVar = new ooc(u4dVar.N, u4dVar.w);
                } else {
                    if (iOrdinal != 1) {
                        z9l.a(c4gVarA, "Unknown strategy: ");
                        return qg50Var;
                    }
                    oocVar = new ug50(s4dVar.c.a, u4dVar.N, u4dVar.w, u4dVar.A, u4dVar.B, nsg0Var, cls, u4dVar.D);
                }
                bft<Z> bftVar = (bft) bft.e.b();
                bftVar.d = false;
                bftVar.c = 1;
                bftVar.b = qg50VarA;
                u4d.b<?> bVar = u4dVar.f;
                bVar.a = oocVar;
                bVar.b = zg50Var;
                bVar.c = bftVar;
                obj = bftVar;
            }
            return this.c.a(obj, s2zVar);
        } catch (Throwable th) {
            b220Var.a(listB);
            throw th;
        }
    }

    public final qg50<ResourceType> b(a<DataType> aVar, int i, int i2, s2z s2zVar, List<Throwable> list) throws xzk {
        List<? extends wg50<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        qg50<ResourceType> qg50VarB = null;
        for (int i3 = 0; i3 < size; i3++) {
            wg50<DataType, ResourceType> wg50Var = list2.get(i3);
            try {
                if (wg50Var.a(aVar.a(), s2zVar)) {
                    qg50VarB = wg50Var.b(aVar.a(), i, i2, s2zVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + wg50Var, e);
                }
                list.add(e);
            }
            if (qg50VarB != null) {
                break;
            }
        }
        if (qg50VarB != null) {
            return qg50VarB;
        }
        throw new xzk(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
