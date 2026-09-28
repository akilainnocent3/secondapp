package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.a;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ndf implements nsg0<Drawable> {
    public final nsg0<Bitmap> b;
    public final boolean c;

    public ndf(nsg0<Bitmap> nsg0Var, boolean z) {
        this.b = nsg0Var;
        this.c = z;
    }

    @Override // defpackage.nsg0
    public final qg50<Drawable> a(Context context, qg50<Drawable> qg50Var, int i, int i2) {
        ue4 ue4Var = a.a(context).a;
        Drawable drawable = qg50Var.get();
        we4 we4VarA = mdf.a(ue4Var, drawable, i, i2);
        if (we4VarA == null) {
            if (!this.c) {
                return qg50Var;
            }
            zqh0.a(drawable, "Unable to convert ", " to a Bitmap");
            return null;
        }
        qg50<Bitmap> qg50VarA = this.b.a(context, we4VarA, i, i2);
        if (!qg50VarA.equals(we4VarA)) {
            return new vtr(context.getResources(), qg50VarA);
        }
        qg50VarA.c();
        return qg50Var;
    }

    @Override // defpackage.nlp
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
    }

    @Override // defpackage.nlp
    public final boolean equals(Object obj) {
        if (obj instanceof ndf) {
            return this.b.equals(((ndf) obj).b);
        }
        return false;
    }

    @Override // defpackage.nlp
    public final int hashCode() {
        return this.b.hashCode();
    }
}
