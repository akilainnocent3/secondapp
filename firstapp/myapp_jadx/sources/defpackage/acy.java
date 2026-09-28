package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class acy implements nlp {
    public final Object b;

    public acy(Object obj) {
        gm20.c(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(nlp.a));
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof acy) {
            return this.b.equals(((acy) obj).b);
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ekw.a(new StringBuilder("ObjectKey{object="), this.b, '}');
    }
}
