package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class ap8 {
    public final List<dyo> a;
    public final List<Pair<bpu<? extends Object, ? extends Object>, ygp<? extends Object>>> b;
    public final List<Pair<bpp<? extends Object>, ygp<? extends Object>>> c;
    public List<? extends Function0<? extends List<? extends Pair<? extends uih.a<? extends Object>, ? extends ygp<? extends Object>>>>> d;
    public List<? extends Function0<? extends List<? extends a5d.a>>> e;
    public final mpe0 f;
    public final mpe0 g;

    /* JADX WARN: Multi-variable type inference failed */
    public ap8(List<? extends dyo> list, List<? extends Pair<? extends bpu<? extends Object, ? extends Object>, ? extends ygp<? extends Object>>> list2, List<? extends Pair<? extends bpp<? extends Object>, ? extends ygp<? extends Object>>> list3, List<? extends Function0<? extends List<? extends Pair<? extends uih.a<? extends Object>, ? extends ygp<? extends Object>>>>> list4, List<? extends Function0<? extends List<? extends a5d.a>>> list5) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
        this.f = hwr.b(new no8(this, 0));
        this.g = hwr.b(new Function0() { // from class: po8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ap8 ap8Var = this.a;
                List<? extends Function0<? extends List<? extends a5d.a>>> list6 = ap8Var.e;
                ArrayList arrayList = new ArrayList();
                int size = list6.size();
                for (int i = 0; i < size; i++) {
                    p48.w(list6.get(i).invoke(), arrayList);
                }
                ap8Var.e = m2g.a;
                return arrayList;
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ap8() {
        m2g m2gVar = m2g.a;
        this(m2gVar, m2gVar, m2gVar, m2gVar, m2gVar);
    }

    public static final class a {
        public final ArrayList a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;

        public a(ap8 ap8Var) {
            int i;
            this.a = CollectionsKt.C0(ap8Var.a);
            this.b = CollectionsKt.C0(ap8Var.b);
            this.c = CollectionsKt.C0(ap8Var.c);
            List list = (List) ap8Var.f.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                } else {
                    arrayList.add(new wo8((Pair) it.next(), i));
                }
            }
            this.d = arrayList;
            List list2 = (List) ap8Var.g.getValue();
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(new xo8((a5d.a) it2.next(), i));
            }
            this.e = arrayList2;
        }

        public final void a(a5d.a aVar) {
            this.e.add(new zo8(aVar, 0));
        }

        public final void b(final uih.a aVar, final dq7 dq7Var) {
            this.d.add(new Function0() { // from class: yo8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.c(new Pair(aVar, dq7Var));
                }
            });
        }

        public final void c(bpu bpuVar, dq7 dq7Var) {
            this.b.add(new Pair(bpuVar, dq7Var));
        }

        public final ap8 d() {
            return new ap8(h58.a(this.a), h58.a(this.b), h58.a(this.c), h58.a(this.d), h58.a(this.e));
        }

        public a() {
            this.a = new ArrayList();
            this.b = new ArrayList();
            this.c = new ArrayList();
            this.d = new ArrayList();
            this.e = new ArrayList();
        }
    }
}
