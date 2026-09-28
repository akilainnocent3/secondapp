package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class wmk0 {
    public qmk0 a;
    public qmk0 b;
    public final ArrayList c;

    public wmk0() {
        this.a = new qmk0("", 0L, null);
        this.b = new qmk0("", 0L, null);
        this.c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        wmk0 wmk0Var = new wmk0(this.a.clone());
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            wmk0Var.c.add(((qmk0) obj).clone());
        }
        return wmk0Var;
    }

    public wmk0(qmk0 qmk0Var) {
        this.a = qmk0Var;
        this.b = qmk0Var.clone();
        this.c = new ArrayList();
    }
}
