package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class s2z implements nlp {
    public final fs5 b = new fs5();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            fs5 fs5Var = this.b;
            if (i >= fs5Var.c) {
                return;
            }
            h2z h2zVar = (h2z) fs5Var.g(i);
            V vK = this.b.k(i);
            h2z.b<T> bVar = h2zVar.b;
            if (h2zVar.d == null) {
                h2zVar.d = h2zVar.c.getBytes(nlp.a);
            }
            bVar.a(h2zVar.d, vK, messageDigest);
            i++;
        }
    }

    public final <T> T c(h2z<T> h2zVar) {
        fs5 fs5Var = this.b;
        return fs5Var.containsKey(h2zVar) ? (T) fs5Var.get(h2zVar) : h2zVar.a;
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof s2z) {
            return this.b.equals(((s2z) obj).b);
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
