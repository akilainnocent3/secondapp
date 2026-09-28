package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class qa0 implements nlp {
    public final int b;
    public final nlp c;

    public qa0(int i, nlp nlpVar) {
        this.b = i;
        this.c = nlpVar;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (!(obj instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj;
        return this.b == qa0Var.b && this.c.equals(qa0Var.c);
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return erh0.h(this.b, this.c);
    }
}
