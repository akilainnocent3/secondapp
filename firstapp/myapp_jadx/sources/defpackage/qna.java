package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class qna {
    public final ArrayList a = new ArrayList();

    public final void a(Path path) {
        ArrayList arrayList = this.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ywg0 ywg0Var = (ywg0) arrayList.get(size);
            Matrix matrix = srh0.a;
            if (ywg0Var != null && !ywg0Var.a) {
                srh0.a(path, ywg0Var.d.l() / 100.0f, ywg0Var.e.l() / 100.0f, ywg0Var.f.l() / 360.0f);
            }
        }
    }
}
