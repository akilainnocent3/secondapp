package defpackage;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tz1 extends RecyclerView.n {
    public int a = Color.parseColor("#00000000");
    public int b = 80;
    public final boolean c = true;

    public tz1() {
        new Paint().setColor(Color.parseColor("#CCCCCC"));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public final void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
        super.f(rect, view, recyclerView, zVar);
        int iP = RecyclerView.P(view);
        if (j(iP) == null) {
            return;
        }
        if (iP != 0) {
            if (!(iP != 0 ? true ^ TextUtils.equals(j(iP - 1), j(iP)) : true)) {
                rect.top = 0;
                return;
            }
        }
        rect.top = this.b;
    }

    public abstract String j(int i);
}
