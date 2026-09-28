package defpackage;

import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.d;
import androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class a70 implements View.OnDragListener, n7f {
    public final q7f a = new q7f(null);
    public final tx0<s7f> b = new tx0<>(0);
    public final AndroidDragAndDropManager$modifier$1 c = new p3w<q7f>() { // from class: androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1
        @Override // defpackage.p3w
        public final d.c a() {
            return this.b.a;
        }

        @Override // defpackage.p3w
        public final void d(d.c cVar) {
        }

        public final boolean equals(Object obj) {
            return obj == this;
        }

        public final int hashCode() {
            return this.b.a.hashCode();
        }
    };

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.draganddrop.AndroidDragAndDropManager$modifier$1] */
    public a70(AndroidComposeView.h hVar) {
    }

    @Override // defpackage.n7f
    public final boolean a(q7f q7fVar) {
        return this.b.contains(q7fVar);
    }

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        m7f m7fVar = new m7f(dragEvent);
        int action = dragEvent.getAction();
        tx0<s7f> tx0Var = this.b;
        q7f q7fVar = this.a;
        switch (action) {
            case 1:
                q7fVar.getClass();
                yp40 yp40Var = new yp40();
                p7f p7fVar = new p7f(m7fVar, q7fVar, yp40Var);
                if (p7fVar.invoke(q7fVar) == gvg0.a) {
                    obl0.d(q7fVar, p7fVar);
                }
                boolean z = yp40Var.a;
                tx0Var.getClass();
                tx0.a aVar = new tx0.a();
                while (aVar.hasNext()) {
                    ((s7f) aVar.next()).u0(m7fVar);
                }
                return z;
            case 2:
                q7fVar.L1(m7fVar);
                return false;
            case 3:
                return q7fVar.K0(m7fVar);
            case 4:
                q7fVar.a0(m7fVar);
                tx0Var.clear();
                return false;
            case 5:
                q7fVar.T(m7fVar);
                return false;
            case 6:
                q7fVar.D1(m7fVar);
                return false;
            default:
                return false;
        }
    }
}
