package defpackage;

import androidx.compose.runtime.d;

/* JADX INFO: loaded from: classes.dex */
public final class me00 extends pe00<d, avh0<Object>> implements ne00 {
    public static final me00 i = new me00(bwg0.e, 0);

    public static final class a extends te00<d, avh0<Object>> {
        public me00 i;

        @Override // defpackage.te00, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof d) {
                return super.containsKey((d) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof avh0) {
                return super.containsValue((avh0) obj);
            }
            return false;
        }

        @Override // defpackage.te00, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof d) {
                return (avh0) super.get((d) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof d) ? obj2 : (avh0) super.getOrDefault((d) obj, (avh0) obj2);
        }

        @Override // defpackage.te00
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final me00 f() {
            Object obj = this.c;
            me00 me00Var = this.i;
            if (obj != me00Var.d) {
                this.b = new yrw();
                me00Var = new me00(this.c, this.f);
            }
            this.i = me00Var;
            return me00Var;
        }

        @Override // defpackage.te00, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof d) {
                return (avh0) super.remove((d) obj);
            }
            return null;
        }
    }

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
    @Override // defpackage.ne00
    public final me00 C(d dVar, avh0 avh0Var) {
        bwg0.a aVarU = this.d.u(dVar, dVar.hashCode(), 0, avh0Var);
        return aVarU == null ? this : new me00(aVarU.a, this.e + aVarU.b);
    }

    @Override // defpackage.ina
    public final <T> T b(d dVar) {
        return (T) jna.a(this, dVar);
    }

    @Override // defpackage.pe00, defpackage.vf00, defpackage.ne00
    public final a builder() {
        a aVar = new a(this);
        aVar.i = this;
        return aVar;
    }

    @Override // defpackage.pe00, defpackage.v3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof d) {
            return super.containsKey((d) obj);
        }
        return false;
    }

    @Override // defpackage.v3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof avh0) {
            return super.containsValue((avh0) obj);
        }
        return false;
    }

    @Override // defpackage.pe00, defpackage.v3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof d) {
            return (avh0) super.get((d) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof d) ? obj2 : (avh0) super.getOrDefault((d) obj, (avh0) obj2);
    }

    @Override // defpackage.pe00
    /* JADX INFO: renamed from: i */
    public final te00<d, avh0<Object>> builder() {
        a aVar = new a(this);
        aVar.i = this;
        return aVar;
    }

    @Override // defpackage.pe00, defpackage.vf00, defpackage.ne00
    public final vf00.a builder() {
        a aVar = new a(this);
        aVar.i = this;
        return aVar;
    }
}
