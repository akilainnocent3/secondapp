package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class djx<T> {
    public static final fwo b = new fwo(false);
    public static final a c = new a(false);
    public static final tvo d = new tvo(true);
    public static final cwo e = new cwo(true);
    public static final ekt f = new ekt(false);
    public static final njt g = new njt(true);
    public static final ckt h = new ckt(true);
    public static final dxh i = new dxh(false);
    public static final twh j = new twh(true);
    public static final bxh k = new bxh(true);
    public static final p15 l = new p15(false);
    public static final n15 m = new n15(true);
    public static final o15 n = new o15(true);
    public static final cae0 o = new cae0(true);
    public static final h9e0 p = new h9e0(true);
    public static final y9e0 q = new y9e0(true);
    public final boolean a;

    public static final class a extends djx<Integer> {
        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return Integer.valueOf(hv60.b(str, bundle));
        }

        @Override // defpackage.djx
        public final String b() {
            return "reference";
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Integer h(String str) {
            str.getClass();
            return Integer.valueOf(kotlin.text.c.u(str, "0x", false) ? Integer.parseInt(str.substring(2), CharsKt.checkRadix(16)) : Integer.parseInt(str));
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            str.getClass();
            bundle.putInt(str, iIntValue);
        }
    }

    public static final class b {
        public static djx a(String str, String str2) {
            djx djxVar;
            boolean zEquals = "integer".equals(str);
            cae0 cae0Var = djx.o;
            if (zEquals) {
                djxVar = djx.b;
            } else if ("integer[]".equals(str)) {
                djxVar = djx.d;
            } else if ("List<Int>".equals(str)) {
                djxVar = djx.e;
            } else if ("long".equals(str)) {
                djxVar = djx.f;
            } else if ("long[]".equals(str)) {
                djxVar = djx.g;
            } else if ("List<Long>".equals(str)) {
                djxVar = djx.h;
            } else if ("boolean".equals(str)) {
                djxVar = djx.l;
            } else if ("boolean[]".equals(str)) {
                djxVar = djx.m;
            } else if ("List<Boolean>".equals(str)) {
                djxVar = djx.n;
            } else if ("string".equals(str)) {
                djxVar = cae0Var;
            } else if ("string[]".equals(str)) {
                djxVar = djx.p;
            } else if ("List<String>".equals(str)) {
                djxVar = djx.q;
            } else if ("float".equals(str)) {
                djxVar = djx.i;
            } else if ("float[]".equals(str)) {
                djxVar = djx.j;
            } else {
                djxVar = "List<Float>".equals(str) ? djx.k : null;
            }
            if (djxVar != null) {
                return djxVar;
            }
            if ("reference".equals(str)) {
                return djx.c;
            }
            if (str.length() == 0) {
                return cae0Var;
            }
            try {
                String strConcat = (!kotlin.text.c.u(str, ".", false) || str2 == null) ? str : str2.concat(str);
                boolean zK = kotlin.text.c.k(str, _UrlKt.PATH_SEGMENT_ENCODE_SET_URI, false);
                if (zK) {
                    strConcat = strConcat.substring(0, strConcat.length() - 2);
                }
                djx djxVarB = b(Class.forName(strConcat), zK);
                if (djxVarB != null) {
                    return djxVarB;
                }
                throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e) {
                gqm.a(e);
                return null;
            }
        }

        public static djx b(Class cls, boolean z) {
            if (Parcelable.class.isAssignableFrom(cls)) {
                return z ? new d(cls) : new e(cls);
            }
            if (Enum.class.isAssignableFrom(cls) && !z) {
                return new c(cls);
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                return z ? new f(cls) : new g(cls);
            }
            return null;
        }
    }

    public static final class c<D extends Enum<?>> extends g<D> {
        public final Class<D> s;

        public c(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.s = cls;
            } else {
                ndv.b(cls, " is not an Enum type.");
                throw null;
            }
        }

        @Override // djx.g, defpackage.djx
        public final String b() {
            return this.s.getName();
        }

        @Override // djx.g
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D h(String str) {
            D d;
            str.getClass();
            Class<D> cls = this.s;
            D[] enumConstants = cls.getEnumConstants();
            enumConstants.getClass();
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (kotlin.text.c.l(d.name(), str, true)) {
                    break;
                }
                i++;
            }
            D d2 = d;
            if (d2 != null) {
                return d2;
            }
            StringBuilder sbA = he.a("Enum value ", str, " not found for type ");
            sbA.append(cls.getName());
            sbA.append('.');
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    public static final class d<D extends Parcelable> extends djx<D[]> {
        public final Class<D[]> r;

        public d(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                ndv.b(cls, " does not implement Parcelable.");
                throw null;
            }
            try {
                this.r = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                gqm.a(e);
                throw null;
            }
        }

        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return (Parcelable[]) bundle.get(str);
        }

        @Override // defpackage.djx
        public final String b() {
            return this.r.getName();
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            str.getClass();
            this.r.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.g(this.r, ((d) obj).r);
        }

        @Override // defpackage.djx
        public final boolean g(Object obj, Object obj2) {
            return wx0.b((Parcelable[]) obj, (Parcelable[]) obj2);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class e<D> extends djx<D> {
        public final Class<D> r;

        public e(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.r = cls;
            } else {
                ndv.b(cls, " does not implement Parcelable or Serializable.");
                throw null;
            }
        }

        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return bundle.get(str);
        }

        @Override // defpackage.djx
        public final String b() {
            return this.r.getName();
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final D h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, D d) {
            str.getClass();
            this.r.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !e.class.equals(obj.getClass())) {
                return false;
            }
            return this.r.equals(((e) obj).r);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public static final class f<D extends Serializable> extends djx<D[]> {
        public final Class<D[]> r;

        public f(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                ndv.b(cls, " does not implement Serializable.");
                throw null;
            }
            try {
                this.r = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                gqm.a(e);
                throw null;
            }
        }

        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return (Serializable[]) bundle.get(str);
        }

        @Override // defpackage.djx
        public final String b() {
            return this.r.getName();
        }

        @Override // defpackage.djx
        /* JADX INFO: renamed from: d */
        public final Object h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            ?? r3 = (Serializable[]) obj;
            str.getClass();
            this.r.cast(r3);
            bundle.putSerializable(str, r3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !f.class.equals(obj.getClass())) {
                return false;
            }
            return Intrinsics.g(this.r, ((f) obj).r);
        }

        @Override // defpackage.djx
        public final boolean g(Object obj, Object obj2) {
            return wx0.b((Serializable[]) obj, (Serializable[]) obj2);
        }

        public final int hashCode() {
            return this.r.hashCode();
        }
    }

    public djx(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return h(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract T h(String str);

    public abstract void e(Bundle bundle, String str, T t);

    public String f(T t) {
        return String.valueOf(t);
    }

    public boolean g(T t, T t2) {
        return Intrinsics.g(t, t2);
    }

    public final String toString() {
        return b();
    }

    public static class g<D extends Serializable> extends djx<D> {
        public final Class<D> r;

        public g(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                ndv.b(cls, " does not implement Serializable.");
                throw null;
            }
            if (cls.isEnum()) {
                ndv.b(cls, " is an Enum. You should use EnumType instead.");
                throw null;
            }
            this.r = cls;
        }

        @Override // defpackage.djx
        public final Object a(String str, Bundle bundle) {
            bundle.getClass();
            str.getClass();
            return (Serializable) bundle.get(str);
        }

        @Override // defpackage.djx
        public String b() {
            return this.r.getName();
        }

        @Override // defpackage.djx
        public final void e(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            str.getClass();
            serializable.getClass();
            this.r.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            return this.r.equals(((g) obj).r);
        }

        @Override // defpackage.djx
        public D h(String str) {
            str.getClass();
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.r.hashCode();
        }

        public g(Class cls, int i) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.r = cls;
            } else {
                ndv.b(cls, " does not implement Serializable.");
                throw null;
            }
        }
    }
}
