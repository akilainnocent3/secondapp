package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class atw<K, V> extends cou<K, V> implements ghp.a {
    public final ze00<K, V> c;
    public V d;

    public atw(ze00<K, V> ze00Var, K k, V v) {
        super(k, v);
        this.c = ze00Var;
        this.d = v;
    }

    @Override // defpackage.cou, java.util.Map.Entry
    public final V getValue() {
        return this.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.cou, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.d;
        this.d = v;
        ve00<K, V, Map.Entry<K, V>> ve00Var = this.c.a;
        te00<K, V> te00Var = ve00Var.d;
        K k = this.a;
        if (!te00Var.containsKey(k)) {
            return v2;
        }
        boolean z = ve00Var.c;
        if (!z) {
            te00Var.put(k, v);
        } else {
            if (!z) {
                lrh0.a();
                return null;
            }
            ewg0 ewg0Var = ve00Var.a[ve00Var.b];
            Object obj = ewg0Var.a[ewg0Var.c];
            te00Var.put(k, v);
            ve00Var.d(obj != null ? obj.hashCode() : 0, te00Var.c, obj, 0);
        }
        ve00Var.i = te00Var.e;
        return v2;
    }
}
