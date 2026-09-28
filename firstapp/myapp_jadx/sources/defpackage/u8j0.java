package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.d;

/* JADX INFO: loaded from: classes.dex */
public final class u8j0 {
    public static final g730<g8j0> a = new g730<>(new gzj(1));

    public static final class a implements gaj<d, androidx.compose.runtime.a, Integer, d> {
        public final /* synthetic */ g8j0 a;

        public a(g8j0 g8j0Var) {
            this.a = g8j0Var;
        }

        @Override // defpackage.gaj
        public final d invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(-1415685722);
            g8j0 g8j0Var = this.a;
            boolean zM = aVar2.M(g8j0Var);
            Object objY = aVar2.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new cnn(g8j0Var);
                aVar2.r(objY);
            }
            cnn cnnVar = (cnn) objY;
            aVar2.H();
            return cnnVar;
        }
    }

    public static final d a(d dVar, g8j0 g8j0Var) {
        return c.a(dVar, gnn.a, new a(g8j0Var));
    }
}
