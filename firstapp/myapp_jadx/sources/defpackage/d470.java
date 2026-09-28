package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d470 {
    public static qgy a(ad70 ad70Var, boolean z, List list) {
        qgy.a aVar;
        if (z || !ad70Var.f) {
            aVar = qgy.a.v;
        } else if (list.isEmpty()) {
            aVar = qgy.a.f;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (Intrinsics.g(((bi70) it.next()).f, ad70Var)) {
                    aVar = qgy.a.i;
                }
            }
            aVar = qgy.a.f;
        }
        String string = ad70Var.b.toString();
        string.getClass();
        return new qgy(null, gky.a.a(string, false), aVar);
    }
}
