package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class h5w {
    public static final ArrayList d;
    public final List<ybp.a> a;
    public final ThreadLocal<c> b = new ThreadLocal<>();
    public final LinkedHashMap c = new LinkedHashMap();

    public static final class a {
        public final ArrayList a = new ArrayList();
    }

    public static final class b<T> extends ybp<T> {
        public final Type a;
        public final String b;
        public final Object c;
        public ybp<T> d;

        public b(Type type, String str, Object obj) {
            this.a = type;
            this.b = str;
            this.c = obj;
        }

        @Override // defpackage.ybp
        public final T a(jep jepVar) {
            ybp<T> ybpVar = this.d;
            if (ybpVar != null) {
                return ybpVar.a(jepVar);
            }
            ib5.a("JsonAdapter isn't ready");
            return null;
        }

        @Override // defpackage.ybp
        public final void c(rfp rfpVar, T t) {
            ybp<T> ybpVar = this.d;
            if (ybpVar != null) {
                ybpVar.c(rfpVar, t);
            } else {
                ib5.a("JsonAdapter isn't ready");
            }
        }

        public final String toString() {
            ybp<T> ybpVar = this.d;
            return ybpVar != null ? ybpVar.toString() : super.toString();
        }
    }

    public final class c {
        public final ArrayList a = new ArrayList();
        public final ArrayDeque b = new ArrayDeque();
        public boolean c;

        public c() {
        }

        public final IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
            if (!this.c) {
                this.c = true;
                ArrayDeque arrayDeque = this.b;
                if (arrayDeque.size() != 1 || ((b) arrayDeque.getFirst()).b != null) {
                    StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
                    Iterator itDescendingIterator = arrayDeque.descendingIterator();
                    while (itDescendingIterator.hasNext()) {
                        b bVar = (b) itDescendingIterator.next();
                        sb.append("\nfor ");
                        Type type = bVar.a;
                        String str = bVar.b;
                        sb.append(type);
                        if (str != null) {
                            sb.append(' ');
                            sb.append(str);
                        }
                    }
                    return new IllegalArgumentException(sb.toString(), illegalArgumentException);
                }
            }
            return illegalArgumentException;
        }

        public final void b(boolean z) {
            this.b.removeLast();
            if (this.b.isEmpty()) {
                h5w.this.b.remove();
                if (z) {
                    synchronized (h5w.this.c) {
                        try {
                            int size = this.a.size();
                            for (int i = 0; i < size; i++) {
                                b bVar = (b) this.a.get(i);
                                ybp<T> ybpVar = (ybp) h5w.this.c.put(bVar.c, bVar.d);
                                if (ybpVar != 0) {
                                    bVar.d = ybpVar;
                                    h5w.this.c.put(bVar.c, ybpVar);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        d = arrayList;
        arrayList.add(pvd0.a);
        arrayList.add(y38.b);
        arrayList.add(sou.c);
        arrayList.add(jx0.c);
        arrayList.add(dk40.a);
        arrayList.add(cq7.d);
    }

    public h5w(a aVar) {
        ArrayList arrayList = aVar.a;
        int size = arrayList.size();
        ArrayList arrayList2 = d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size);
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        this.a = Collections.unmodifiableList(arrayList3);
    }

    public final <T> ybp<T> a(Type type, Set<? extends Annotation> set, String str) {
        ybp<T> ybpVar = null;
        if (type == null) {
            bmy.a("type == null");
            return null;
        }
        if (set == null) {
            bmy.a("annotations == null");
            return null;
        }
        Type typeA = irh0.a(type);
        if (typeA instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) typeA;
            if (wildcardType.getLowerBounds().length == 0) {
                Type[] upperBounds = wildcardType.getUpperBounds();
                if (upperBounds.length != 1) {
                    d580.a();
                    return null;
                }
                typeA = upperBounds[0];
            }
        }
        Object objAsList = set.isEmpty() ? typeA : Arrays.asList(typeA, set);
        synchronized (this.c) {
            try {
                ybp<T> ybpVar2 = (ybp) this.c.get(objAsList);
                if (ybpVar2 != null) {
                    return ybpVar2;
                }
                c cVar = this.b.get();
                if (cVar == null) {
                    cVar = new c();
                    this.b.set(cVar);
                }
                ArrayDeque arrayDeque = cVar.b;
                ArrayList arrayList = cVar.a;
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        b bVar = new b(typeA, str, objAsList);
                        arrayList.add(bVar);
                        arrayDeque.add(bVar);
                        break;
                    }
                    b bVar2 = (b) arrayList.get(i);
                    if (bVar2.c.equals(objAsList)) {
                        arrayDeque.add(bVar2);
                        ybpVar = bVar2.d;
                        if (ybpVar != null) {
                            break;
                        }
                        ybpVar = bVar2;
                        break;
                    }
                    i++;
                }
                try {
                    if (ybpVar != null) {
                        cVar.b(false);
                        return ybpVar;
                    }
                    try {
                        int size2 = this.a.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            ybp<T> ybpVar3 = (ybp<T>) this.a.get(i2).a(typeA, set, this);
                            if (ybpVar3 != null) {
                                ((b) cVar.b.getLast()).d = ybpVar3;
                                cVar.b(true);
                                return ybpVar3;
                            }
                        }
                        throw new IllegalArgumentException("No JsonAdapter for " + irh0.g(typeA, set));
                    } catch (IllegalArgumentException e) {
                        throw cVar.a(e);
                    }
                } catch (Throwable th) {
                    cVar.b(false);
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
