package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class uo20<Z> extends ujc<Z> {
    public static final Handler e = new Handler(Looper.getMainLooper(), new a());
    public final xa50 d;

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            uo20 uo20Var = (uo20) message.obj;
            uo20Var.d.n(uo20Var);
            return true;
        }
    }

    public uo20(xa50 xa50Var) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.d = xa50Var;
    }

    @Override // defpackage.d5f0
    public final void e(Object obj) {
        ca50 ca50Var = this.c;
        if (ca50Var == null || !ca50Var.c()) {
            return;
        }
        e.obtainMessage(1, this).sendToTarget();
    }

    @Override // defpackage.d5f0
    public final void h(Drawable drawable) {
    }
}
