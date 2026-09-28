package defpackage;

import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.a;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uwi implements Function1 {
    public final /* synthetic */ a a;
    public final /* synthetic */ Fragment b;
    public final /* synthetic */ ifx c;

    public /* synthetic */ uwi(a aVar, Fragment fragment, ifx ifxVar) {
        this.a = aVar;
        this.b = fragment;
        this.c = ifxVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ibs ibsVar = (ibs) obj;
        a aVar = this.a;
        ArrayList arrayList = aVar.g;
        Fragment fragment = this.b;
        boolean z = false;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                if (Intrinsics.g(((Pair) obj2).a, fragment.getTag())) {
                    z = true;
                    break;
                }
            }
        }
        if (ibsVar != null && !z) {
            s9s lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
            if (lifecycle.b().compareTo(s9s.b.c) >= 0) {
                lifecycle.a((hbs) aVar.i.invoke(this.c));
            }
        }
        return Unit.a;
    }
}
