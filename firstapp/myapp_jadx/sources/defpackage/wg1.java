package defpackage;

import android.hardware.camera2.CaptureRequest;

/* JADX INFO: loaded from: classes.dex */
public final class wg1<T> extends hoa.a<T> {
    public final String a;
    public final Class<T> b;
    public final Object c;

    public wg1(String str, Class cls, CaptureRequest.Key key) {
        this.a = str;
        if (cls == null) {
            bmy.a("Null valueClass");
            throw null;
        }
        this.b = cls;
        this.c = key;
    }

    @Override // hoa.a
    public final String b() {
        return this.a;
    }

    @Override // hoa.a
    public final Object c() {
        return this.c;
    }

    @Override // hoa.a
    public final Class<T> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hoa.a)) {
            return false;
        }
        hoa.a aVar = (hoa.a) obj;
        if (!this.a.equals(aVar.b()) || !this.b.equals(aVar.d())) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 == null) {
            return aVar.c() == null;
        }
        return obj2.equals(aVar.c());
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
