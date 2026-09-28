package defpackage;

import androidx.recyclerview.widget.n;
import java.util.Collection;
import java.util.Iterator;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes.dex */
public final class ni10 {

    public static final class a extends n.b {
        public final /* synthetic */ mi10<T> a;
        public final /* synthetic */ mi10<T> b;
        public final /* synthetic */ n.e<T> c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public a(mi10<T> mi10Var, mi10<T> mi10Var2, n.e<T> eVar, int i, int i2) {
            this.a = mi10Var;
            this.b = mi10Var2;
            this.c = eVar;
            this.d = i;
            this.e = i2;
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
        @Override // androidx.recyclerview.widget.n.b
        public final boolean areContentsTheSame(int i, int i2) {
            Object item = this.a.getItem(i);
            Object item2 = this.b.getItem(i2);
            if (item == item2) {
                return true;
            }
            return this.c.areContentsTheSame(item, item2);
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
        @Override // androidx.recyclerview.widget.n.b
        public final boolean areItemsTheSame(int i, int i2) {
            Object item = this.a.getItem(i);
            Object item2 = this.b.getItem(i2);
            if (item == item2) {
                return true;
            }
            return this.c.areItemsTheSame(item, item2);
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
        @Override // androidx.recyclerview.widget.n.b
        public final Object getChangePayload(int i, int i2) {
            Object item = this.a.getItem(i);
            Object item2 = this.b.getItem(i2);
            return item == item2 ? Boolean.TRUE : this.c.getChangePayload(item, item2);
        }

        @Override // androidx.recyclerview.widget.n.b
        public final int getNewListSize() {
            return this.e;
        }

        @Override // androidx.recyclerview.widget.n.b
        public final int getOldListSize() {
            return this.d;
        }
    }

    public static final <T> li10 a(mi10<T> mi10Var, mi10<T> mi10Var2, n.e<T> eVar) {
        mi10Var.getClass();
        mi10Var2.getClass();
        eVar.getClass();
        a aVar = new a(mi10Var, mi10Var2, eVar, mi10Var.b(), mi10Var2.b());
        boolean z = true;
        n.d dVarA = n.a(aVar, true);
        Iterable iterableN = f.n(0, mi10Var.b());
        if ((iterableN instanceof Collection) && ((Collection) iterableN).isEmpty()) {
            z = false;
        } else {
            Iterator<Integer> it = iterableN.iterator();
            while (((mwo) it).c) {
                if (dVarA.a(((zvo) it).nextInt()) != -1) {
                }
            }
            z = false;
        }
        return new li10(dVarA, z);
    }

    public static final <T> void b(mi10<T> mi10Var, nis nisVar, mi10<T> mi10Var2, li10 li10Var) {
        mi10Var.getClass();
        mi10Var2.getClass();
        li10Var.getClass();
        if (li10Var.b) {
            kez kezVar = new kez(mi10Var, mi10Var2, nisVar);
            li10Var.a.b(kezVar);
            int iMin = Math.min(mi10Var.d(), kezVar.d);
            int iD = mi10Var2.d() - kezVar.d;
            vpe vpeVar = vpe.c;
            if (iD > 0) {
                if (iMin > 0) {
                    nisVar.onChanged(0, iMin, vpeVar);
                }
                nisVar.onInserted(0, iD);
            } else if (iD < 0) {
                nisVar.onRemoved(0, -iD);
                int i = iMin + iD;
                if (i > 0) {
                    nisVar.onChanged(0, i, vpeVar);
                }
            }
            kezVar.d = mi10Var2.d();
            int iMin2 = Math.min(mi10Var.f(), kezVar.e);
            int iF = mi10Var2.f();
            int i2 = kezVar.e;
            int i3 = iF - i2;
            int i4 = kezVar.d + kezVar.f + i2;
            int i5 = i4 - iMin2;
            boolean z = i5 != mi10Var.a() - iMin2;
            if (i3 > 0) {
                nisVar.onInserted(i4, i3);
            } else if (i3 < 0) {
                nisVar.onRemoved(i4 + i3, -i3);
                iMin2 += i3;
            }
            if (iMin2 > 0 && z) {
                nisVar.onChanged(i5, iMin2, vpeVar);
            }
            kezVar.e = mi10Var2.f();
            return;
        }
        int iMax = Math.max(mi10Var.d(), mi10Var2.d());
        int iMin3 = Math.min(mi10Var.b() + mi10Var.d(), mi10Var2.b() + mi10Var2.d());
        int i6 = iMin3 - iMax;
        if (i6 > 0) {
            nisVar.onRemoved(iMax, i6);
            nisVar.onInserted(iMax, i6);
        }
        int iMin4 = Math.min(iMax, iMin3);
        int iMax2 = Math.max(iMax, iMin3);
        int iD2 = mi10Var.d();
        int iA = mi10Var2.a();
        if (iD2 > iA) {
            iD2 = iA;
        }
        int iB = mi10Var.b() + mi10Var.d();
        int iA2 = mi10Var2.a();
        if (iB > iA2) {
            iB = iA2;
        }
        int i7 = iMin4 - iD2;
        vpe vpeVar2 = vpe.a;
        if (i7 > 0) {
            nisVar.onChanged(iD2, i7, vpeVar2);
        }
        int i8 = iB - iMax2;
        if (i8 > 0) {
            nisVar.onChanged(iMax2, i8, vpeVar2);
        }
        int iD3 = mi10Var2.d();
        int iA3 = mi10Var.a();
        if (iD3 > iA3) {
            iD3 = iA3;
        }
        int iB2 = mi10Var2.b() + mi10Var2.d();
        int iA4 = mi10Var.a();
        if (iB2 > iA4) {
            iB2 = iA4;
        }
        int i9 = iMin4 - iD3;
        vpe vpeVar3 = vpe.b;
        if (i9 > 0) {
            nisVar.onChanged(iD3, i9, vpeVar3);
        }
        int i10 = iB2 - iMax2;
        if (i10 > 0) {
            nisVar.onChanged(iMax2, i10, vpeVar3);
        }
        int iA5 = mi10Var2.a() - mi10Var.a();
        if (iA5 > 0) {
            nisVar.onInserted(mi10Var.a(), iA5);
        } else if (iA5 < 0) {
            nisVar.onRemoved(mi10Var.a() + iA5, -iA5);
        }
    }

    public static final int c(mi10<?> mi10Var, li10 li10Var, mi10<?> mi10Var2, int i) {
        int iA;
        mi10Var.getClass();
        mi10Var2.getClass();
        if (!li10Var.b) {
            return f.f(i, f.n(0, mi10Var2.a()));
        }
        int iD = i - mi10Var.d();
        int iB = mi10Var.b();
        if (iD >= 0 && iD < iB) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + iD;
                if (i3 >= 0 && i3 < mi10Var.b() && (iA = li10Var.a.a(i3)) != -1) {
                    return mi10Var2.d() + iA;
                }
            }
        }
        return f.f(i, f.n(0, mi10Var2.a()));
    }
}
