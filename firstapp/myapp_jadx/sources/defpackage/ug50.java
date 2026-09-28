package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ug50 implements nlp {
    public static final r4u<Class<?>, byte[]> j = new r4u<>(50);
    public final px0 b;
    public final nlp c;
    public final nlp d;
    public final int e;
    public final int f;
    public final Class<?> g;
    public final s2z h;
    public final nsg0<?> i;

    public ug50(px0 px0Var, nlp nlpVar, nlp nlpVar2, int i, int i2, nsg0<?> nsg0Var, Class<?> cls, s2z s2zVar) {
        this.b = px0Var;
        this.c = nlpVar;
        this.d = nlpVar2;
        this.e = i;
        this.f = i2;
        this.i = nsg0Var;
        this.g = cls;
        this.h = s2zVar;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        px0 px0Var = this.b;
        byte[] bArr = (byte[]) px0Var.d();
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.b(messageDigest);
        this.c.b(messageDigest);
        messageDigest.update(bArr);
        nsg0<?> nsg0Var = this.i;
        if (nsg0Var != null) {
            nsg0Var.b(messageDigest);
        }
        this.h.b(messageDigest);
        r4u<Class<?>, byte[]> r4uVar = j;
        Class<?> cls = this.g;
        byte[] bArrA = r4uVar.a(cls);
        if (bArrA == null) {
            bArrA = cls.getName().getBytes(nlp.a);
            r4uVar.d(cls, bArrA);
        }
        messageDigest.update(bArrA);
        px0Var.put(bArr);
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof ug50) {
            ug50 ug50Var = (ug50) obj;
            if (this.f == ug50Var.f && this.e == ug50Var.e && erh0.b(this.i, ug50Var.i) && this.g.equals(ug50Var.g) && this.c.equals(ug50Var.c) && this.d.equals(ug50Var.d) && this.h.equals(ug50Var.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        int iHashCode = ((((this.d.hashCode() + (this.c.hashCode() * 31)) * 31) + this.e) * 31) + this.f;
        nsg0<?> nsg0Var = this.i;
        if (nsg0Var != null) {
            iHashCode = (iHashCode * 31) + nsg0Var.hashCode();
        }
        int iHashCode2 = this.g.hashCode();
        return this.h.b.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.c + ", signature=" + this.d + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + this.g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}
