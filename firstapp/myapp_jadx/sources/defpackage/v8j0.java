package defpackage;

import android.view.View;
import androidx.compose.ui.d;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class v8j0 {

    public static final class a implements gaj<d, androidx.compose.runtime.a, Integer, d> {
        @Override // defpackage.gaj
        public final d invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(359872873);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            q8j0 q8j0VarA = q8j0.a.a(aVar2);
            boolean zM = aVar2.M(q8j0VarA);
            Object objY = aVar2.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new cnn(q8j0VarA.c);
                aVar2.r(objY);
            }
            cnn cnnVar = (cnn) objY;
            aVar2.H();
            return cnnVar;
        }
    }

    public static final class b implements gaj<d, androidx.compose.runtime.a, Integer, d> {
        @Override // defpackage.gaj
        public final d invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(359872873);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            q8j0 q8j0VarA = q8j0.a.a(aVar2);
            boolean zM = aVar2.M(q8j0VarA);
            Object objY = aVar2.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new cnn(q8j0VarA.e);
                aVar2.r(objY);
            }
            cnn cnnVar = (cnn) objY;
            aVar2.H();
            return cnnVar;
        }
    }

    public static final class c implements gaj<d, androidx.compose.runtime.a, Integer, d> {
        @Override // defpackage.gaj
        public final d invoke(d dVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(359872873);
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            q8j0 q8j0VarA = q8j0.a.a(aVar2);
            boolean zM = aVar2.M(q8j0VarA);
            Object objY = aVar2.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new cnn(q8j0VarA.f);
                aVar2.r(objY);
            }
            cnn cnnVar = (cnn) objY;
            aVar2.H();
            return cnnVar;
        }
    }

    public static final d a(d dVar) {
        return androidx.compose.ui.c.a(dVar, gnn.a, new a());
    }

    public static final d b(d dVar) {
        return androidx.compose.ui.c.a(dVar, gnn.a, new b());
    }

    public static final d c(d dVar) {
        return androidx.compose.ui.c.a(dVar, gnn.a, new c());
    }
}
