package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g6u implements Function1 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;

    public /* synthetic */ g6u(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        qcn qcnVar = (qcn) obj;
        ArrayList arrayList = qcnVar != null ? new ArrayList(qcnVar) : new ArrayList();
        boolean z = this.a;
        final String str = this.b;
        int i = 0;
        if (z) {
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i2 = 0;
                do {
                    if (i2 < size) {
                        obj2 = arrayList.get(i2);
                        i2++;
                    }
                } while (!Intrinsics.g(((g7q) obj2).a(), str));
            }
            arrayList.add(new g7q.b(str, SystemClock.elapsedRealtime()));
            return a4h.f(arrayList);
        }
        if (z || arrayList.isEmpty()) {
            return null;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj3 = arrayList.get(i);
            i++;
            if (Intrinsics.g(((g7q) obj3).a(), str)) {
                p48.A(arrayList, new Function1() { // from class: h6u
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        g7q g7qVar = (g7q) obj4;
                        g7qVar.getClass();
                        return Boolean.valueOf(Intrinsics.g(g7qVar.a(), str));
                    }
                });
                return a4h.f(arrayList);
            }
        }
        return null;
    }
}
