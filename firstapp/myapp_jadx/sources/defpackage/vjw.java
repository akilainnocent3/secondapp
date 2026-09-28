package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vjw<Model, Data> implements i2w<Model, Data> {
    public final ArrayList a;
    public final b220<List<Throwable>> b;

    public static class a<Data> implements cpc<Data>, cpc.a<Data> {
        public final ArrayList a;
        public final b220<List<Throwable>> b;
        public int c;
        public lw20 d;
        public cpc.a<? super Data> e;
        public List<Throwable> f;
        public boolean i;

        public a(ArrayList arrayList, b220 b220Var) {
            this.b = b220Var;
            if (arrayList.isEmpty()) {
                hb5.a("Must not be empty.");
                throw null;
            }
            this.a = arrayList;
            this.c = 0;
        }

        @Override // defpackage.cpc
        public final Class<Data> a() {
            return ((cpc) this.a.get(0)).a();
        }

        @Override // defpackage.cpc
        public final void b() {
            List<Throwable> list = this.f;
            if (list != null) {
                this.b.a(list);
            }
            this.f = null;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((cpc) obj).b();
            }
        }

        @Override // cpc.a
        public final void c(Exception exc) {
            List<Throwable> list = this.f;
            gm20.c(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // defpackage.cpc
        public final void cancel() {
            this.i = true;
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((cpc) obj).cancel();
            }
        }

        @Override // defpackage.cpc
        public final void d(lw20 lw20Var, cpc.a<? super Data> aVar) {
            this.d = lw20Var;
            this.e = aVar;
            this.f = this.b.b();
            ((cpc) this.a.get(this.c)).d(lw20Var, this);
            if (this.i) {
                cancel();
            }
        }

        @Override // defpackage.cpc
        public final cqc e() {
            return ((cpc) this.a.get(0)).e();
        }

        @Override // cpc.a
        public final void f(Data data) {
            if (data != null) {
                this.e.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.i) {
                return;
            }
            if (this.c < this.a.size() - 1) {
                this.c++;
                d(this.d, this.e);
            } else {
                gm20.b(this.f);
                this.e.c(new xzk("Fetch failed", new ArrayList(this.f)));
            }
        }
    }

    public vjw(ArrayList arrayList, v7h.c cVar) {
        this.a = arrayList;
        this.b = cVar;
    }

    @Override // defpackage.i2w
    public final i2w.a<Data> a(Model model, int i, int i2, s2z s2zVar) {
        i2w.a<Data> aVarA;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        nlp nlpVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            i2w i2wVar = (i2w) arrayList.get(i3);
            if (i2wVar.b(model) && (aVarA = i2wVar.a(model, i, i2, s2zVar)) != null) {
                nlpVar = aVarA.a;
                arrayList2.add(aVarA.c);
            }
        }
        if (arrayList2.isEmpty() || nlpVar == null) {
            return null;
        }
        return new i2w.a<>(nlpVar, new a(arrayList2, this.b));
    }

    @Override // defpackage.i2w
    public final boolean b(Model model) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((i2w) obj).b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
