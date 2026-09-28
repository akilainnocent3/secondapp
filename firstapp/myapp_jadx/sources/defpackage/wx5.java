package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class wx5 {
    public xx5 a;
    public List<Pair<CameraCharacteristics.Key, Object>> b;

    public static wx5 a(l26 l26Var) {
        if (l26Var instanceof kz5) {
            return null;
        }
        m26 m26VarM = ((m26) l26Var).m();
        km20.a("CameraInfo doesn't contain Camera2 implementation.", m26VarM instanceof xx5);
        wx5 wx5Var = ((xx5) m26VarM).c;
        if (!(l26Var instanceof rf) || ((rf) l26Var).c == null) {
            return wx5Var;
        }
        xx5 xx5Var = wx5Var.a;
        List<Pair<CameraCharacteristics.Key, Object>> list = Collections.EMPTY_LIST;
        wx5 wx5Var2 = new wx5();
        wx5Var2.a = xx5Var;
        wx5Var2.b = list;
        return wx5Var2;
    }
}
