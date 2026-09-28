package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class vhk implements nsg0<thk> {
    public final nsg0<Bitmap> b;

    public vhk(nsg0<Bitmap> nsg0Var) {
        gm20.c(nsg0Var, "Argument must not be null");
        this.b = nsg0Var;
    }

    @Override // defpackage.nsg0
    public final qg50<thk> a(Context context, qg50<thk> qg50Var, int i, int i2) {
        thk thkVar = qg50Var.get();
        we4 we4Var = new we4(a.a(context).a, thkVar.a.a.l);
        nsg0<Bitmap> nsg0Var = this.b;
        qg50<Bitmap> qg50VarA = nsg0Var.a(context, we4Var, i, i2);
        if (we4Var != qg50VarA) {
            we4Var.c();
        }
        thkVar.a.a.c(nsg0Var, qg50VarA.get());
        return qg50Var;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof vhk) {
            return this.b.equals(((vhk) obj).b);
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
