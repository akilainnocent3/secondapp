package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class ysw<K, V> extends dou<K, V> implements ghp.a {
    public final ye00<K, V> c;
    public V d;

    public ysw(ye00<K, V> ye00Var, K k, V v) {
        super(k, v);
        this.c = ye00Var;
        this.d = v;
    }

    @Override // defpackage.dou, java.util.Map.Entry
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
    @Override // defpackage.dou, java.util.Map.Entry
    public final V setValue(V v) {
        V v2 = this.d;
        this.d = v;
        ue00<K, V, Map.Entry<K, V>> ue00Var = this.c.a;
        se00<K, V> se00Var = ue00Var.d;
        K k = this.a;
        if (!se00Var.containsKey(k)) {
            return v2;
        }
        boolean z = ue00Var.c;
        if (!z) {
            se00Var.put(k, v);
        } else {
            if (!z) {
                lrh0.a();
                return null;
            }
            dwg0 dwg0Var = ue00Var.a[ue00Var.b];
            Object obj = dwg0Var.a[dwg0Var.c];
            se00Var.put(k, v);
            ue00Var.d(obj != null ? obj.hashCode() : 0, se00Var.c, obj, 0, 0, false);
        }
        ue00Var.i = se00Var.e;
        return v2;
    }
}
