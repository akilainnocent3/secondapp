package defpackage;

import android.os.Trace;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class lo8 {
    public final List<kn8<?>> a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (final kn8<?> kn8Var : componentRegistrar.getComponents()) {
            final String str = kn8Var.a;
            if (str != null) {
                kn8Var = new kn8<>(str, kn8Var.b, kn8Var.c, kn8Var.d, kn8Var.e, new do8() { // from class: ko8
                    @Override // defpackage.do8
                    public final Object a(hi50 hi50Var) {
                        String str2 = str;
                        kn8 kn8Var2 = kn8Var;
                        try {
                            Trace.beginSection(str2);
                            return kn8Var2.f.a(hi50Var);
                        } finally {
                            Trace.endSection();
                        }
                    }
                }, kn8Var.g);
            }
            arrayList.add(kn8Var);
        }
        return arrayList;
    }
}
