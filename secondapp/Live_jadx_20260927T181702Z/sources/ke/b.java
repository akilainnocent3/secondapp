package ke;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i10, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) throws Throwable {
        TResult tresultApply;
        if (i10 < 1) {
            return aVar.apply(tinput);
        }
        do {
            tresultApply = aVar.apply(tinput);
            tinput = cVar.a(tinput, tresultApply);
            if (tinput == null) {
                break;
            }
            i10--;
        } while (i10 >= 1);
        return tresultApply;
    }
}
