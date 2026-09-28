package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nz5 {
    public final Object a = new Object();
    public final List<wg80> b;

    public nz5(qf6 qf6Var, ArrayList arrayList) {
        km20.a("CaptureSession state must be OPENED. Current state:" + qf6Var.j, qf6Var.j == qf6.a.v);
        this.b = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
