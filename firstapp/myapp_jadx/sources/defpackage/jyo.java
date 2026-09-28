package defpackage;

import android.os.Bundle;
import java.io.Serializable;
import java.lang.Enum;
import kotlin.text.c;

/* JADX INFO: loaded from: classes.dex */
public final class jyo<D extends Enum<?>> extends djx<Object> {
    public final Class<Object> r;
    public final Class<D> s;

    public jyo(Class<D> cls) {
        super(true);
        this.r = cls;
        if (!Serializable.class.isAssignableFrom(cls)) {
            ndv.b(cls, " does not implement Serializable.");
            throw null;
        }
        if (cls.isEnum()) {
            this.s = cls;
        } else {
            ndv.b(cls, " is not an Enum type.");
            throw null;
        }
    }

    @Override // defpackage.djx
    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.djx
    public final String b() {
        return this.s.getName();
    }

    @Override // defpackage.djx
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        str.getClass();
        Enum r1 = null;
        if (!str.equals("null")) {
            Class<D> cls = this.s;
            D[] enumConstants = cls.getEnumConstants();
            enumConstants.getClass();
            for (D d : enumConstants) {
                D d2 = d;
                d2.getClass();
                if (c.l(d2.name(), str, true)) {
                    r1 = d;
                    break;
                }
            }
            r1 = r1;
            if (r1 == null) {
                StringBuilder sbA = he.a("Enum value ", str, " not found for type ");
                sbA.append(cls.getName());
                sbA.append('.');
                throw new IllegalArgumentException(sbA.toString());
            }
        }
        return r1;
    }

    @Override // defpackage.djx
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.r.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyo)) {
            return false;
        }
        return this.r.equals(((jyo) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
