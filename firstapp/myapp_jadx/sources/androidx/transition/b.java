package androidx.transition;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ a e;

    public b(a aVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = aVar;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // androidx.transition.d, androidx.transition.Transition.f
    public final void g(Transition transition) {
        a aVar = this.e;
        Object obj = this.a;
        if (obj != null) {
            aVar.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            aVar.z(obj2, this.d, null);
        }
    }

    @Override // androidx.transition.d, androidx.transition.Transition.f
    public final void j(Transition transition) {
        transition.B(this);
    }
}
