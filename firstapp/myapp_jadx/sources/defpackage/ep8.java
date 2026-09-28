package defpackage;

import android.media.metrics.TrackChangeEvent;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ep8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ep8(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

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
    @Override // java.lang.Runnable
    public final void run() {
        njd.a<T> aVar;
        switch (this.a) {
            case 0:
                q2z q2zVar = (q2z) this.b;
                n730<T> n730Var = (n730) this.c;
                if (q2zVar.b != q2z.d) {
                    ib5.a("provide() can be called only once.");
                    return;
                }
                synchronized (q2zVar) {
                    aVar = q2zVar.a;
                    q2zVar.a = null;
                    q2zVar.b = n730Var;
                    break;
                }
                aVar.a(n730Var);
                return;
            default:
                ((yjv) this.b).w((TrackChangeEvent) this.c);
                return;
        }
    }
}
