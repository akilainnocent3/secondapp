package defpackage;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class noc implements dpc, cpc.a<Object> {
    public final List<nlp> a;
    public final s4d<?> b;
    public final dpc.a c;
    public int d = -1;
    public nlp e;
    public List<i2w<File, ?>> f;
    public int i;
    public volatile i2w.a<?> v;
    public File w;

    public noc(List<nlp> list, s4d<?> s4dVar, dpc.a aVar) {
        this.a = list;
        this.b = s4dVar;
        this.c = aVar;
    }

    @Override // defpackage.dpc
    public final boolean b() {
        while (true) {
            List<i2w<File, ?>> list = this.f;
            boolean z = false;
            if (list != null && this.i < list.size()) {
                this.v = null;
                while (!z && this.i < this.f.size()) {
                    List<i2w<File, ?>> list2 = this.f;
                    int i = this.i;
                    this.i = i + 1;
                    i2w<File, ?> i2wVar = list2.get(i);
                    File file = this.w;
                    s4d<?> s4dVar = this.b;
                    this.v = i2wVar.a(file, s4dVar.e, s4dVar.f, s4dVar.i);
                    if (this.v != null && this.b.c(this.v.c.a()) != null) {
                        this.v.c.d(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.d + 1;
            this.d = i2;
            if (i2 >= this.a.size()) {
                return false;
            }
            nlp nlpVar = this.a.get(this.d);
            s4d<?> s4dVar2 = this.b;
            File fileB = ((n6g.c) s4dVar2.h).a().b(new ooc(nlpVar, s4dVar2.n));
            this.w = fileB;
            if (fileB != null) {
                this.e = nlpVar;
                this.f = this.b.c.a().f(fileB);
                this.i = 0;
            }
        }
    }

    @Override // cpc.a
    public final void c(Exception exc) {
        this.c.a(this.e, exc, this.v.c, cqc.c);
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
        this.c.c(this.e, obj, this.v.c, cqc.c, this.e);
    }
}
