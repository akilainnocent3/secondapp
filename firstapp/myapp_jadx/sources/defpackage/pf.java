package defpackage;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public class pf implements qaj, Serializable {
    public final Object a;
    public final Class b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final int i;

    public pf(int i, Object obj, Class cls, String str, String str2, int i2) {
        this.a = obj;
        this.b = cls;
        this.c = str;
        this.d = str2;
        this.e = (i2 & 1) == 1;
        this.f = i;
        this.i = i2 >> 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) obj;
        return this.e == pfVar.e && this.f == pfVar.f && this.i == pfVar.i && Intrinsics.g(this.a, pfVar.a) && Intrinsics.g(this.b, pfVar.b) && this.c.equals(pfVar.c) && this.d.equals(pfVar.d);
    }

    @Override // defpackage.qaj
    public final int getArity() {
        return this.f;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.b;
        return ((((gmf0.a(gmf0.a((iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + this.f) * 31) + this.i;
    }

    public final String toString() {
        jq40.a.getClass();
        return mq40.a(this);
    }

    public pf(int i, Class cls, String str, String str2, int i2) {
        this(i, fv5.NO_RECEIVER, cls, str, str2, i2);
    }
}
