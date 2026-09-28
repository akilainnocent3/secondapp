package defpackage;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class hpp<T> implements mgf<T> {
    public final b<T> a;

    public static final class a<T> extends h6 {
        public a() {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return ((Float) aVar.a).equals((Float) this.a) && Intrinsics.g((tkf) aVar.b, (tkf) this.b);
        }

        public final int hashCode() {
            return ((tkf) this.b).hashCode() + gpp.a(0, ((Float) this.a).hashCode() * 31, 31);
        }
    }

    public static final class b<T> extends ipp<T, a<T>> {
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
        public final a a(int i, Float f) {
            wkf wkfVar = xkf.d;
            a aVar = new a();
            aVar.a = f;
            aVar.b = wkfVar;
            this.b.h(i, aVar);
            return aVar;
        }
    }

    public hpp(b<T> bVar) {
        this.a = bVar;
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
    @Override // defpackage.mgf, defpackage.xi0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final <V extends mj0> zwh0<V> a(f0h0<T, V> f0h0Var) {
        int[] iArr;
        Object[] objArr;
        b<T> bVar = this.a;
        gwo gwoVar = bVar.b;
        lsw lswVar = new lsw(gwoVar.e + 2);
        msw mswVar = new msw(gwoVar.e);
        int[] iArr2 = gwoVar.b;
        Object[] objArr2 = gwoVar.c;
        long[] jArr = gwoVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8;
                    int i3 = 8 - ((~(i - length)) >>> 31);
                    int i4 = 0;
                    while (i4 < i3) {
                        if ((255 & j) < 128) {
                            int i5 = (i << 3) + i4;
                            int i6 = iArr2[i5];
                            a aVar = (a) objArr2[i5];
                            lswVar.a(i6);
                            mswVar.h(i6, new ywh0((mj0) f0h0Var.a().invoke((Float) aVar.a), (tkf) aVar.b));
                        }
                        j >>= i2;
                        i4++;
                        i2 = i2;
                        iArr2 = iArr2;
                        objArr2 = objArr2;
                    }
                    iArr = iArr2;
                    objArr = objArr2;
                    if (i3 != i2) {
                        break;
                    }
                } else {
                    iArr = iArr2;
                    objArr = objArr2;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr2 = iArr;
                objArr2 = objArr;
            }
        }
        if (!gwoVar.a(0)) {
            int i7 = lswVar.b;
            if (i7 < 0) {
                mae0.a("Index must be between 0 and size");
                return null;
            }
            lswVar.b(i7 + 1);
            int[] iArr3 = lswVar.a;
            int i8 = lswVar.b;
            if (i8 != 0) {
                xx0.d(1, 0, i8, iArr3, iArr3);
            }
            iArr3[0] = 0;
            lswVar.b++;
        }
        if (!gwoVar.a(bVar.a)) {
            lswVar.a(bVar.a);
        }
        int i9 = lswVar.b;
        if (i9 != 0) {
            int[] iArr4 = lswVar.a;
            iArr4.getClass();
            Arrays.sort(iArr4, 0, i9);
        }
        return new zwh0<>(lswVar, mswVar, bVar.a, xkf.d);
    }
}
