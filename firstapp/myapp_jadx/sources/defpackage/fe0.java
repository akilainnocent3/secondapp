package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fe0 implements se0 {
    public final Object a;

    public /* synthetic */ fe0(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.se0
    public u12 b() {
        ArrayList arrayList = (ArrayList) this.a;
        return ((cpp) arrayList.get(0)).c() ? new zz10(arrayList) : new mxz(arrayList);
    }

    @Override // defpackage.se0
    public List c() {
        return (ArrayList) this.a;
    }

    @Override // defpackage.se0
    public boolean d() {
        ArrayList arrayList = (ArrayList) this.a;
        return arrayList.size() == 1 && ((cpp) arrayList.get(0)).c();
    }
}
