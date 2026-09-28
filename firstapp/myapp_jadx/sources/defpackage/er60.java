package defpackage;

import android.os.SystemClock;
import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class er60 implements View.OnClickListener {
    public final int a = 1000;
    public final fr60 b;
    public long c;

    public er60(fr60 fr60Var) {
        this.b = fr60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (SystemClock.elapsedRealtime() - this.c < this.a) {
            return;
        }
        this.c = SystemClock.elapsedRealtime();
        this.b.invoke(view);
    }
}
