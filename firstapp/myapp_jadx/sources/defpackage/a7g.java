package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a7g implements nlp {
    public final Object b;
    public final int c;
    public final int d;
    public final Class<?> e;
    public final Class<?> f;
    public final nlp g;
    public final Map<Class<?>, nsg0<?>> h;
    public final s2z i;
    public int j;

    public a7g(Object obj, nlp nlpVar, int i, int i2, Map<Class<?>, nsg0<?>> map, Class<?> cls, Class<?> cls2, s2z s2zVar) {
        gm20.c(obj, "Argument must not be null");
        this.b = obj;
        gm20.c(nlpVar, "Signature must not be null");
        this.g = nlpVar;
        this.c = i;
        this.d = i2;
        gm20.c(map, "Argument must not be null");
        this.h = map;
        gm20.c(cls, "Resource class must not be null");
        this.e = cls;
        gm20.c(cls2, "Transcode class must not be null");
        this.f = cls2;
        gm20.c(s2zVar, "Argument must not be null");
        this.i = s2zVar;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof a7g) {
            a7g a7gVar = (a7g) obj;
            if (this.b.equals(a7gVar.b) && this.g.equals(a7gVar.g) && this.d == a7gVar.d && this.c == a7gVar.c && this.h.equals(a7gVar.h) && this.e.equals(a7gVar.e) && this.f.equals(a7gVar.f) && this.i.equals(a7gVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.b.hashCode();
        this.j = iHashCode;
        int iHashCode2 = ((((this.g.hashCode() + (iHashCode * 31)) * 31) + this.c) * 31) + this.d;
        this.j = iHashCode2;
        int iHashCode3 = this.h.hashCode() + (iHashCode2 * 31);
        this.j = iHashCode3;
        int iHashCode4 = this.e.hashCode() + (iHashCode3 * 31);
        this.j = iHashCode4;
        int iHashCode5 = this.f.hashCode() + (iHashCode4 * 31);
        this.j = iHashCode5;
        int iHashCode6 = this.i.b.hashCode() + (iHashCode5 * 31);
        this.j = iHashCode6;
        return iHashCode6;
    }

    public final String toString() {
        return "EngineKey{model=" + this.b + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + this.e + ", transcodeClass=" + this.f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
