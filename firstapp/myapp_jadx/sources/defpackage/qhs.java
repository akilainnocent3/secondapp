package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class qhs implements phs {
    @Override // defpackage.phs
    public final void a(Object obj, long j) {
        ((fyo.c) bhh0.h(obj, j)).makeImmutable();
    }

    @Override // defpackage.phs
    public final <E> void b(Object obj, Object obj2, long j) {
        fyo.c cVarMutableCopyWithCapacity = (fyo.c) bhh0.h(obj, j);
        fyo.c cVar = (fyo.c) bhh0.h(obj2, j);
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
        bhh0.o(obj, j, cVar);
    }

    @Override // defpackage.phs
    public final fyo.c c(Object obj, long j) {
        fyo.c cVar = (fyo.c) bhh0.h(obj, j);
        if (cVar.isModifiable()) {
            return cVar;
        }
        int size = cVar.size();
        fyo.c cVarMutableCopyWithCapacity = cVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        bhh0.o(obj, j, cVarMutableCopyWithCapacity);
        return cVarMutableCopyWithCapacity;
    }
}
