package defpackage;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface m26 extends l26 {
    Set<dhf> a();

    String d();

    Rect e();

    Object g();

    void h(Executor executor, qq20 qq20Var);

    yj30 i();

    List<Size> j(int i);

    default Set<Integer> k() {
        return Collections.EMPTY_SET;
    }

    void l(tz5 tz5Var);

    default boolean p(kg50 kg50Var, e6s e6sVar) {
        for (l8l l8lVar : kg50Var.a) {
            if (!l8lVar.b(this, e6sVar)) {
                pgt.a("CameraInfoInternal", l8lVar + " is not supported.");
                return false;
            }
        }
        try {
            qnh0.a(this, e6sVar, kg50Var);
            return true;
        } catch (IllegalArgumentException | v36.a e) {
            pgt.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e);
            return false;
        }
    }

    default void q(w36 w36Var) {
        w36Var.getClass();
        qnh0.a = w36Var;
    }

    Set<Integer> r();

    default m26 m() {
        return this;
    }
}
