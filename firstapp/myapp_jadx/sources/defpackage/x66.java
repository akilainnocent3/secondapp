package defpackage;

import defpackage.csm;
import java.lang.Enum;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class x66<E extends Enum<E> & csm<E>> {
    public final String a;
    public final List<String> b;
    public final Class<E> c;
    public final List<E> d;

    public x66(String str, List<String> list, Class<E> cls) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = cls;
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        List<E> listS = enumArr != null ? ay0.S(enumArr) : null;
        this.d = listS == null ? m2g.a : listS;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;)TE; */
    public final Enum a(String str) {
        Object next;
        Iterator<T> it = this.d.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.g(((csm) ((Enum) next)).getValue(), str)) {
                return (Enum) next;
            }
        }
        next = null;
        return (Enum) next;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x66)) {
            return false;
        }
        x66 x66Var = (x66) obj;
        return Intrinsics.g(this.a, x66Var.a) && Intrinsics.g(this.b, x66Var.b) && this.c.equals(x66Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ai50.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CampaignDefinition(code=" + this.a + ", events=" + this.b + ", variantClass=" + this.c + ")";
    }
}
