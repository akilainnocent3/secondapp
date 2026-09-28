package defpackage;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ooc implements nlp {
    public final nlp b;
    public final nlp c;

    public ooc(nlp nlpVar, nlp nlpVar2) {
        this.b = nlpVar;
        this.c = nlpVar2;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof ooc) {
            ooc oocVar = (ooc) obj;
            if (this.b.equals(oocVar.b) && this.c.equals(oocVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
