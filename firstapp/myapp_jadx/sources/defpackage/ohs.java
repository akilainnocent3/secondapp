package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ohs {
    public static final a a = new a();
    public static final b b = new b();

    public static final class a extends ohs {
        public static final Class<?> c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        public static <L> List<L> d(Object obj, long j, int i) {
            List<L> listMutableCopyWithCapacity;
            List<L> list = (List) chh0.j(obj, j);
            if (list.isEmpty()) {
                if (list instanceof y0s) {
                    listMutableCopyWithCapacity = new x0s(i);
                } else {
                    listMutableCopyWithCapacity = ((list instanceof cw20) && (list instanceof gyo.c)) ? ((gyo.c) list).mutableCopyWithCapacity(i) : new ArrayList<>(i);
                }
                chh0.q(obj, j, listMutableCopyWithCapacity);
                return listMutableCopyWithCapacity;
            }
            if (c.isAssignableFrom(list.getClass())) {
                ArrayList arrayList = new ArrayList(list.size() + i);
                arrayList.addAll(list);
                chh0.q(obj, j, arrayList);
                return arrayList;
            }
            if (list instanceof mgh0) {
                mgh0 mgh0Var = (mgh0) list;
                x0s x0sVar = new x0s(mgh0Var.a.size() + i);
                x0sVar.addAll(mgh0Var);
                chh0.q(obj, j, x0sVar);
                return x0sVar;
            }
            if ((list instanceof cw20) && (list instanceof gyo.c)) {
                gyo.c cVar = (gyo.c) list;
                if (!cVar.isModifiable()) {
                    gyo.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(list.size() + i);
                    chh0.q(obj, j, cVarMutableCopyWithCapacity);
                    return cVarMutableCopyWithCapacity;
                }
            }
            return list;
        }

        @Override // defpackage.ohs
        public final void a(Object obj, long j) {
            Object objUnmodifiableList;
            List list = (List) chh0.j(obj, j);
            if (list instanceof y0s) {
                objUnmodifiableList = ((y0s) list).getUnmodifiableView();
            } else {
                if (c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof cw20) && (list instanceof gyo.c)) {
                    gyo.c cVar = (gyo.c) list;
                    if (cVar.isModifiable()) {
                        cVar.makeImmutable();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            chh0.q(obj, j, objUnmodifiableList);
        }

        @Override // defpackage.ohs
        public final <E> void b(Object obj, Object obj2, long j) {
            List list = (List) chh0.j(obj2, j);
            List listD = d(obj, j, list.size());
            int size = listD.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                listD.addAll(list);
            }
            if (size > 0) {
                list = listD;
            }
            chh0.q(obj, j, list);
        }

        @Override // defpackage.ohs
        public final <L> List<L> c(Object obj, long j) {
            return d(obj, j, 10);
        }
    }

    public static final class b extends ohs {
        @Override // defpackage.ohs
        public final void a(Object obj, long j) {
            ((gyo.c) chh0.j(obj, j)).makeImmutable();
        }

        @Override // defpackage.ohs
        public final <E> void b(Object obj, Object obj2, long j) {
            gyo.c cVarMutableCopyWithCapacity = (gyo.c) chh0.j(obj, j);
            gyo.c cVar = (gyo.c) chh0.j(obj2, j);
            int size = cVarMutableCopyWithCapacity.size();
            int size2 = cVar.size();
            if (size > 0 && size2 > 0) {
                if (!cVarMutableCopyWithCapacity.isModifiable()) {
                    cVarMutableCopyWithCapacity = cVarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
                }
                cVarMutableCopyWithCapacity.addAll(cVar);
            }
            if (size > 0) {
                cVar = cVarMutableCopyWithCapacity;
            }
            chh0.q(obj, j, cVar);
        }

        @Override // defpackage.ohs
        public final <L> List<L> c(Object obj, long j) {
            gyo.c cVar = (gyo.c) chh0.j(obj, j);
            if (cVar.isModifiable()) {
                return cVar;
            }
            int size = cVar.size();
            gyo.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
            chh0.q(obj, j, cVarMutableCopyWithCapacity);
            return cVarMutableCopyWithCapacity;
        }
    }

    public abstract void a(Object obj, long j);

    public abstract <L> void b(Object obj, Object obj2, long j);

    public abstract <L> List<L> c(Object obj, long j);
}
