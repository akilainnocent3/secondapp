package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.sporty.android.core.model.MyLog;

/* JADX INFO: loaded from: classes4.dex */
public final class luj0 implements j5f0<Bitmap> {
    public final /* synthetic */ bc6 a;

    public luj0(bc6 bc6Var) {
        this.a = bc6Var;
    }

    @Override // defpackage.j5f0
    public final void a(Drawable drawable) {
        Bitmap bitmap;
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(null);
            return;
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_COMMON);
        aVar2.n("Continuation not active, resume not perform.", new Object[0]);
        if (drawable == null || !(drawable instanceof BitmapDrawable) || (bitmap = ((BitmapDrawable) drawable).getBitmap()) == null) {
            return;
        }
        bitmap.recycle();
    }

    @Override // defpackage.j5f0
    public final void b(Bitmap bitmap) {
        bc6 bc6Var = this.a;
        if (bc6Var.p() instanceof bzx) {
            zi50.a aVar = zi50.b;
            bc6Var.resumeWith(bitmap);
        } else {
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_COMMON);
            aVar2.n("Continuation not active, resume not perform.", new Object[0]);
            bitmap.recycle();
        }
    }
}
