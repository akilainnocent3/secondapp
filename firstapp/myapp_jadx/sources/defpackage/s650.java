package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class s650<Key, Value> implements x650<Key, Value> {
    public final v5b a;
    public final r650<Key, Value> b;
    public final n7<Key, Value> c;
    public final uv90 d;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[kxs.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public static final class b extends qlr implements Function1<m7<Key, Value>, Unit> {
        public static final b a = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            m7 m7Var = (m7) obj;
            m7Var.getClass();
            m7Var.d = true;
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function1<m7<Key, Value>, Boolean> {
        public final /* synthetic */ kxs a;
        public final /* synthetic */ xqz<Key, Value> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kxs kxsVar, xqz<Key, Value> xqzVar) {
            super(1);
            this.a = kxsVar;
            this.b = xqzVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Object obj) {
            m7.b<Key, Value> next;
            m7 m7Var = (m7) obj;
            m7Var.getClass();
            kxs kxsVar = this.a;
            kxsVar.getClass();
            gx0<m7.b<Key, Value>> gx0Var = m7Var.c;
            Iterator<m7.b<Key, Value>> it = gx0Var.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (next.a != kxsVar);
            m7.b<Key, Value> bVar = next;
            xqz<Key, Value> xqzVar = this.b;
            boolean z = false;
            if (bVar != null) {
                bVar.b = xqzVar;
            } else {
                m7.a aVar = m7Var.a[kxsVar.ordinal()];
                m7.a aVar2 = m7.a.c;
                kxs kxsVar2 = kxs.a;
                if (aVar == aVar2 && kxsVar != kxsVar2) {
                    gx0Var.addLast(new m7.b<>(kxsVar, xqzVar));
                } else if (aVar == m7.a.a || kxsVar == kxsVar2) {
                    if (kxsVar == kxsVar2) {
                        m7Var.e(kxsVar2, null);
                    }
                    if (m7Var.b[kxsVar.ordinal()] == null) {
                        gx0Var.addLast(new m7.b<>(kxsVar, xqzVar));
                        z = true;
                    }
                }
            }
            return Boolean.valueOf(z);
        }
    }

    public static final class d extends qlr implements Function1<m7<Key, Value>, Unit> {
        public final /* synthetic */ s650<Key, Value> a;
        public final /* synthetic */ xqz<Key, Value> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(s650<Key, Value> s650Var, xqz<Key, Value> xqzVar) {
            super(1);
            this.a = s650Var;
            this.b = xqzVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            m7 m7Var = (m7) obj;
            m7Var.getClass();
            if (m7Var.d) {
                m7Var.d = false;
                s650<Key, Value> s650Var = this.a;
                s650Var.f(s650Var.c, kxs.a, this.b);
            }
            return Unit.a;
        }
    }

    public static final class e extends qlr implements Function1<m7<Key, Value>, Unit> {
        public final /* synthetic */ ArrayList a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ArrayList arrayList) {
            super(1);
            this.a = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Object obj) {
            m7 m7Var = (m7) obj;
            m7Var.getClass();
            kxs kxsVar = kxs.a;
            hxs hxsVarB = m7Var.b(kxsVar);
            kxs kxsVar2 = kxs.c;
            hxs hxsVarB2 = m7Var.b(kxsVar2);
            kxs kxsVar3 = kxs.b;
            jxs jxsVar = new jxs(hxsVarB, m7Var.b(kxsVar3), hxsVarB2);
            boolean z = hxsVarB instanceof hxs.a;
            hxs.a[] aVarArr = m7Var.b;
            int length = aVarArr.length;
            for (int i = 0; i < length; i++) {
                aVarArr[i] = null;
            }
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(kxsVar);
                m7Var.d(kxsVar, m7.a.a);
            }
            if (jxsVar.c instanceof hxs.a) {
                if (!z) {
                    arrayList.add(kxsVar2);
                }
                m7Var.a(kxsVar2);
            }
            if (jxsVar.b instanceof hxs.a) {
                if (!z) {
                    arrayList.add(kxsVar3);
                }
                m7Var.a(kxsVar3);
            }
            return Unit.a;
        }
    }

    public s650(v5b v5bVar, r650<Key, Value> r650Var) {
        v5bVar.getClass();
        r650Var.getClass();
        this.a = v5bVar;
        this.b = r650Var;
        this.c = new n7<>();
        this.d = new uv90(false);
    }

    @Override // defpackage.y650
    public final void a(xqz<Key, Value> xqzVar) {
        this.c.a(new d(this, xqzVar));
    }

    @Override // defpackage.y650
    public final void b() {
        this.c.a(b.a);
    }

    @Override // defpackage.y650
    public final void c(kxs kxsVar, xqz<Key, Value> xqzVar) {
        kxsVar.getClass();
        f(this.c, kxsVar, xqzVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.x650
    public final Object d(x1b x1bVar) {
        t650 t650Var;
        if (x1bVar instanceof t650) {
            t650Var = (t650) x1bVar;
            int i = t650Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                t650Var.d = i - Integer.MIN_VALUE;
            } else {
                t650Var = new t650(this, x1bVar);
            }
        } else {
            t650Var = new t650(this, x1bVar);
        }
        Object objA = t650Var.b;
        y5b y5bVar = y5b.a;
        int i2 = t650Var.d;
        if (i2 == 0) {
            uj50.b(objA);
            t650Var.a = this;
            t650Var.d = 1;
            objA = this.b.a();
            if (objA == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = t650Var.a;
            uj50.b(objA);
        }
        if (((r650.a) objA) == r650.a.a) {
            this.c.a(u650.a);
        }
        return objA;
    }

    @Override // defpackage.y650
    public final void e(xqz<Key, Value> xqzVar) {
        ArrayList arrayList = new ArrayList();
        this.c.a(new e(arrayList));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            c((kxs) obj, xqzVar);
        }
    }

    public final void f(n7<Key, Value> n7Var, kxs kxsVar, xqz<Key, Value> xqzVar) {
        if (((Boolean) n7Var.a(new c(kxsVar, xqzVar))).booleanValue()) {
            int i = a.a[kxsVar.ordinal()];
            v5b v5bVar = this.a;
            if (i == 1) {
                ej5.c(v5bVar, null, null, new w650(this, null), 3);
            } else {
                ej5.c(v5bVar, null, null, new v650(this, null), 3);
            }
        }
    }

    @Override // defpackage.x650
    public final wwd0 getState() {
        return this.c.b;
    }
}
