package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class b5b {
    public static nv5.d a(pjd pjdVar) {
        nv5.a aVar = new nv5.a();
        nv5.d<T> dVar = new nv5.d<>(aVar);
        aVar.b = dVar;
        aVar.a = ew5.class;
        try {
            pjdVar.invokeOnCompletion(new a5b(aVar, pjdVar));
            aVar.a = "Deferred.asListenableFuture";
        } catch (Exception e) {
            dVar.a(e);
        }
        return dVar;
    }
}
