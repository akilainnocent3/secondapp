package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class utu {
    public final ArrayList a;
    public final ArrayList b;
    public final List<stu> c;

    public utu(List<stu> list) {
        this.c = list;
        this.a = new ArrayList(list.size());
        this.b = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            this.a.add(new dy80((List) list.get(i).b.b));
            this.b.add(list.get(i).c.b());
        }
    }
}
