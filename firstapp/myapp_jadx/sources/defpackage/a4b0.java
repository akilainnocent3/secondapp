package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class a4b0 {
    public final ArrayList a;

    public a4b0(z3b0 z3b0Var) {
        z3b0Var.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(z3b0Var.a);
        this.a = arrayList;
    }

    public final void a(int i) {
        this.a.add(Integer.valueOf(i));
    }

    public final z3b0 b(int i) {
        ArrayList arrayList = this.a;
        if (i < CollectionsKt.A0(CollectionsKt.D0(arrayList)).size()) {
            return null;
        }
        return new z3b0(a4h.f(arrayList));
    }
}
