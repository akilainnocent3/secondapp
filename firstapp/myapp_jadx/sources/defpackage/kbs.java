package defpackage;

import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kbs extends s9s {
    public final boolean b;
    public y9h<hbs, a> c = new y9h<>();
    public s9s.b d;
    public final WeakReference<ibs> e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList<s9s.b> i;
    public final wwd0 j;

    public static final class a {
        public s9s.b a;
        public cbs b;

        public final void a(ibs ibsVar, s9s.a aVar) {
            s9s.b bVarA = aVar.a();
            s9s.b bVar = this.a;
            bVar.getClass();
            if (bVarA.compareTo(bVar) < 0) {
                bVar = bVarA;
            }
            this.a = bVar;
            this.b.F0(ibsVar, aVar);
            this.a = bVarA;
        }
    }

    public kbs(ibs ibsVar, boolean z) {
        this.b = z;
        s9s.b bVar = s9s.b.b;
        this.d = bVar;
        this.i = new ArrayList<>();
        this.e = new WeakReference<>(ibsVar);
        this.j = xwd0.a(bVar);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.s9s
    public final void a(hbs hbsVar) {
        cbs oq40Var;
        a aVar;
        ibs ibsVar;
        s9s.a aVar2;
        hbsVar.getClass();
        f("addObserver");
        s9s.b bVar = this.d;
        s9s.b bVar2 = s9s.b.a;
        if (bVar != bVar2) {
            bVar2 = s9s.b.b;
        }
        a aVar3 = new a();
        HashMap map = tbs.a;
        boolean z = hbsVar instanceof cbs;
        boolean z2 = hbsVar instanceof rdd;
        if (z && z2) {
            oq40Var = new sdd((rdd) hbsVar, (cbs) hbsVar);
        } else if (z2) {
            oq40Var = new sdd((rdd) hbsVar, null);
        } else if (z) {
            oq40Var = (cbs) hbsVar;
        } else {
            Class<?> cls = hbsVar.getClass();
            if (tbs.b(cls) == 2) {
                Object obj = tbs.b.get(cls);
                obj.getClass();
                List list = (List) obj;
                if (list.size() == 1) {
                    oq40Var = new mu90(tbs.a((Constructor) list.get(0), hbsVar));
                } else {
                    int size = list.size();
                    g1k[] g1kVarArr = new g1k[size];
                    for (int i = 0; i < size; i++) {
                        g1kVarArr[i] = tbs.a((Constructor) list.get(i), hbsVar);
                    }
                    oq40Var = new hma(g1kVarArr);
                }
            } else {
                oq40Var = new oq40(hbsVar);
            }
        }
        aVar3.b = oq40Var;
        aVar3.a = bVar2;
        y9h<hbs, a> y9hVar = this.c;
        qr60.c<hbs, a> cVarA = y9hVar.a(hbsVar);
        if (cVarA != null) {
            aVar = cVarA.b;
        } else {
            HashMap<K, qr60.c<K, V>> map2 = y9hVar.e;
            qr60.c<K, V> cVar = new qr60.c<>(hbsVar, aVar3);
            y9hVar.d++;
            qr60.c<K, V> cVar2 = y9hVar.b;
            if (cVar2 == 0) {
                y9hVar.a = cVar;
                y9hVar.b = cVar;
            } else {
                cVar2.c = cVar;
                cVar.d = cVar2;
                y9hVar.b = cVar;
            }
            map2.put((K) hbsVar, cVar);
            aVar = null;
        }
        if (aVar == null && (ibsVar = this.e.get()) != null) {
            boolean z3 = this.f != 0 || this.g;
            s9s.b bVarE = e(hbsVar);
            this.f++;
            while (aVar3.a.compareTo(bVarE) < 0 && this.c.e.containsKey(hbsVar)) {
                s9s.b bVar3 = aVar3.a;
                ArrayList<s9s.b> arrayList = this.i;
                arrayList.add(bVar3);
                s9s.a.C1084a c1084a = s9s.a.Companion;
                s9s.b bVar4 = aVar3.a;
                c1084a.getClass();
                bVar4.getClass();
                int iOrdinal = bVar4.ordinal();
                if (iOrdinal == 1) {
                    aVar2 = s9s.a.ON_CREATE;
                } else if (iOrdinal != 2) {
                    aVar2 = iOrdinal != 3 ? null : s9s.a.ON_RESUME;
                } else {
                    aVar2 = s9s.a.ON_START;
                }
                if (aVar2 == null) {
                    uj5.a(aVar3.a, "no event up from ");
                    return;
                } else {
                    aVar3.a(ibsVar, aVar2);
                    arrayList.remove(arrayList.size() - 1);
                    bVarE = e(hbsVar);
                }
            }
            if (!z3) {
                j();
            }
            this.f--;
        }
    }

    @Override // defpackage.s9s
    public final s9s.b b() {
        return this.d;
    }

    @Override // defpackage.s9s
    public final v340 c() {
        return e1i.b(this.j);
    }

    @Override // defpackage.s9s
    public final void d(hbs hbsVar) {
        hbsVar.getClass();
        f("removeObserver");
        this.c.b(hbsVar);
    }

    public final s9s.b e(hbs hbsVar) {
        HashMap<hbs, qr60.c<hbs, a>> map = this.c.e;
        qr60.c<hbs, a> cVar = map.containsKey(hbsVar) ? map.get(hbsVar).d : null;
        s9s.b bVar = cVar != null ? cVar.b.a : null;
        ArrayList<s9s.b> arrayList = this.i;
        s9s.b bVar2 = arrayList.isEmpty() ? null : (s9s.b) rh6.a(1, arrayList);
        s9s.b bVar3 = this.d;
        bVar3.getClass();
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
    }

    public final void f(String str) {
        if (!this.b || fw0.X().Y()) {
            return;
        }
        q1b.a(tug.a("Method ", str, " must be called on the main thread"));
    }

    public final void g(s9s.a aVar) {
        aVar.getClass();
        f("handleLifecycleEvent");
        h(aVar.a());
    }

    public final void h(s9s.b bVar) {
        if (this.d == bVar) {
            return;
        }
        ibs ibsVar = this.e.get();
        s9s.b bVar2 = this.d;
        bVar2.getClass();
        bVar.getClass();
        if (bVar2 == s9s.b.b && bVar == s9s.b.a) {
            throw new IllegalStateException(("State must be at least '" + s9s.b.c + "' to be moved to '" + bVar + "' in component " + ibsVar).toString());
        }
        s9s.b bVar3 = s9s.b.a;
        if (bVar2 == bVar3 && bVar2 != bVar) {
            throw new IllegalStateException(("State is '" + bVar3 + "' and cannot be moved to `" + bVar + "` in component " + ibsVar).toString());
        }
        this.d = bVar;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        j();
        this.g = false;
        if (this.d == bVar3) {
            this.c = new y9h<>();
        }
    }

    public final void i(s9s.b bVar) {
        bVar.getClass();
        f("setCurrentState");
        h(bVar);
    }

    public final void j() {
        s9s.a aVar;
        ibs ibsVar = this.e.get();
        if (ibsVar == null) {
            ib5.a("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            y9h<hbs, a> y9hVar = this.c;
            if (y9hVar.d != 0) {
                qr60.c<hbs, a> cVar = y9hVar.a;
                cVar.getClass();
                s9s.b bVar = cVar.b.a;
                qr60.c<hbs, a> cVar2 = this.c.b;
                cVar2.getClass();
                s9s.b bVar2 = cVar2.b.a;
                if (bVar == bVar2 && this.d == bVar2) {
                    break;
                }
                this.h = false;
                s9s.b bVar3 = this.d;
                qr60.c<hbs, a> cVar3 = this.c.a;
                cVar3.getClass();
                int iCompareTo = bVar3.compareTo(cVar3.b.a);
                ArrayList<s9s.b> arrayList = this.i;
                if (iCompareTo < 0) {
                    y9h<hbs, a> y9hVar2 = this.c;
                    qr60.b bVar4 = new qr60.b(y9hVar2.b, y9hVar2.a);
                    y9hVar2.c.put(bVar4, Boolean.FALSE);
                    while (bVar4.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) bVar4.next();
                        entry.getClass();
                        hbs hbsVar = (hbs) entry.getKey();
                        a aVar2 = (a) entry.getValue();
                        while (aVar2.a.compareTo(this.d) > 0 && !this.h && this.c.e.containsKey(hbsVar)) {
                            s9s.a.C1084a c1084a = s9s.a.Companion;
                            s9s.b bVar5 = aVar2.a;
                            c1084a.getClass();
                            s9s.a aVarA = s9s.a.C1084a.a(bVar5);
                            if (aVarA == null) {
                                uj5.a(aVar2.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(aVarA.a());
                                aVar2.a(ibsVar, aVarA);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                qr60.c<hbs, a> cVar4 = this.c.b;
                if (!this.h && cVar4 != null && this.d.compareTo(cVar4.b.a) > 0) {
                    y9h<hbs, a> y9hVar3 = this.c;
                    y9hVar3.getClass();
                    qr60.d dVar = new qr60.d();
                    y9hVar3.c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        hbs hbsVar2 = (hbs) entry2.getKey();
                        a aVar3 = (a) entry2.getValue();
                        while (aVar3.a.compareTo(this.d) < 0 && !this.h && this.c.e.containsKey(hbsVar2)) {
                            arrayList.add(aVar3.a);
                            s9s.a.C1084a c1084a2 = s9s.a.Companion;
                            s9s.b bVar6 = aVar3.a;
                            c1084a2.getClass();
                            bVar6.getClass();
                            int iOrdinal = bVar6.ordinal();
                            if (iOrdinal == 1) {
                                aVar = s9s.a.ON_CREATE;
                            } else if (iOrdinal != 2) {
                                aVar = iOrdinal != 3 ? null : s9s.a.ON_RESUME;
                            } else {
                                aVar = s9s.a.ON_START;
                            }
                            if (aVar == null) {
                                uj5.a(aVar3.a, "no event up from ");
                                return;
                            } else {
                                aVar3.a(ibsVar, aVar);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.h = false;
        this.j.setValue(this.d);
    }
}
