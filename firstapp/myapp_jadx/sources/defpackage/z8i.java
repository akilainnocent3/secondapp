package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class z8i implements qya<a9i.a> {
    public final /* synthetic */ String a;

    public z8i(String str) {
        this.a = str;
    }

    @Override // defpackage.qya
    public final void accept(a9i.a aVar) {
        a9i.a aVar2 = aVar;
        synchronized (a9i.c) {
            try {
                nj90<String, ArrayList<qya<a9i.a>>> nj90Var = a9i.d;
                ArrayList<qya<a9i.a>> arrayList = nj90Var.get(this.a);
                if (arrayList == null) {
                    return;
                }
                nj90Var.remove(this.a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).accept(aVar2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
