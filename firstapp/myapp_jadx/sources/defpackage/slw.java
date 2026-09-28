package defpackage;

import android.content.Context;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class slw<T> implements nsg0<T> {
    public final List b;

    @SafeVarargs
    public slw(nsg0<T>... nsg0VarArr) {
        if (nsg0VarArr.length != 0) {
            this.b = Arrays.asList(nsg0VarArr);
        } else {
            hb5.a("MultiTransformation must contain at least one Transformation");
            throw null;
        }
    }

    @Override // defpackage.nsg0
    public final qg50<T> a(Context context, qg50<T> qg50Var, int i, int i2) {
        Iterator it = this.b.iterator();
        qg50<T> qg50Var2 = qg50Var;
        while (it.hasNext()) {
            qg50<T> qg50VarA = ((nsg0) it.next()).a(context, qg50Var2, i, i2);
            if (qg50Var2 != null && !qg50Var2.equals(qg50Var) && !qg50Var2.equals(qg50VarA)) {
                qg50Var2.c();
            }
            qg50Var2 = qg50VarA;
        }
        return qg50Var2;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((nsg0) it.next()).b(messageDigest);
        }
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof slw) {
            return this.b.equals(((slw) obj).b);
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
