package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class tg50 implements dpc, cpc.a<Object> {
    public final u4d a;
    public final s4d<?> b;
    public int c;
    public int d = -1;
    public nlp e;
    public List<i2w<File, ?>> f;
    public int i;
    public volatile i2w.a<?> v;
    public File w;
    public ug50 y;

    public tg50(s4d s4dVar, u4d u4dVar) {
        this.b = s4dVar;
        this.a = u4dVar;
    }

    @Override // defpackage.dpc
    public final boolean b() {
        List<Class<?>> list;
        boolean z;
        List list2;
        boolean z2;
        ArrayList arrayListD;
        ArrayList arrayListA = this.b.a();
        if (arrayListA.isEmpty()) {
            return false;
        }
        s4d<?> s4dVar = this.b;
        x050 x050VarA = s4dVar.c.a();
        Class<?> cls = s4dVar.d.getClass();
        Class<?> cls2 = s4dVar.g;
        Class<?> cls3 = s4dVar.k;
        l2w l2wVar = x050VarA.h;
        y8w andSet = l2wVar.a.getAndSet(null);
        if (andSet == null) {
            andSet = new y8w(cls, cls2, cls3);
        } else {
            andSet.a = cls;
            andSet.b = cls2;
            andSet.c = cls3;
        }
        synchronized (l2wVar.b) {
            list = l2wVar.b.get(andSet);
        }
        l2wVar.a.set(andSet);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            k2w k2wVar = x050VarA.a;
            synchronized (k2wVar) {
                arrayListD = k2wVar.a.d(cls);
            }
            int size = arrayListD.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListD.get(i);
                i++;
                ArrayList arrayListB = x050VarA.c.b((Class) obj, cls2);
                int size2 = arrayListB.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = arrayListB.get(i2);
                    i2++;
                    Class cls4 = (Class) obj2;
                    if (!x050VarA.f.a(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            z = false;
            l2w l2wVar2 = x050VarA.h;
            List<Class<?>> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            synchronized (l2wVar2.b) {
                l2wVar2.b.put(new y8w(cls, cls2, cls3), listUnmodifiableList);
            }
            list2 = arrayList;
        } else {
            z = false;
            list2 = list;
        }
        if (list2.isEmpty()) {
            if (File.class.equals(this.b.k)) {
                return z;
            }
            StringBuilder sb = new StringBuilder("Failed to find any load path from ");
            sb.append(this.b.d.getClass());
            emy.a(sb, " to ", this.b.k);
            return z;
        }
        while (true) {
            List<i2w<File, ?>> list3 = this.f;
            if (list3 != null && this.i < list3.size()) {
                this.v = null;
                boolean z3 = z;
                while (!z3 && this.i < this.f.size()) {
                    List<i2w<File, ?>> list4 = this.f;
                    int i3 = this.i;
                    this.i = i3 + 1;
                    i2w<File, ?> i2wVar = list4.get(i3);
                    File file = this.w;
                    s4d<?> s4dVar2 = this.b;
                    this.v = i2wVar.a(file, s4dVar2.e, s4dVar2.f, s4dVar2.i);
                    if (this.v != null && this.b.c(this.v.c.a()) != null) {
                        this.v.c.d(this.b.o, this);
                        z3 = true;
                    }
                }
                return z3;
            }
            int i4 = this.d + 1;
            this.d = i4;
            if (i4 >= list2.size()) {
                int i5 = this.c + 1;
                this.c = i5;
                if (i5 >= arrayListA.size()) {
                    return z;
                }
                this.d = z ? 1 : 0;
            }
            nlp nlpVar = (nlp) arrayListA.get(this.c);
            Class cls5 = (Class) list2.get(this.d);
            nsg0<Z> nsg0VarE = this.b.e(cls5);
            s4d<?> s4dVar3 = this.b;
            this.y = new ug50(s4dVar3.c.a, nlpVar, s4dVar3.n, s4dVar3.e, s4dVar3.f, nsg0VarE, cls5, s4dVar3.i);
            File fileB = ((n6g.c) s4dVar3.h).a().b(this.y);
            this.w = fileB;
            if (fileB != null) {
                this.e = nlpVar;
                this.f = this.b.c.a().f(fileB);
                z2 = false;
                this.i = 0;
            } else {
                z2 = false;
            }
            z = z2;
        }
    }

    @Override // cpc.a
    public final void c(Exception exc) {
        this.a.a(this.y, exc, this.v.c, cqc.d);
    }

    @Override // defpackage.dpc
    public final void cancel() {
        i2w.a<?> aVar = this.v;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // cpc.a
    public final void f(Object obj) {
        this.a.c(this.e, obj, this.v.c, cqc.d, this.y);
    }
}
