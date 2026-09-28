package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface glt {
    urr e(urr urrVar);

    default long g(urr urrVar, urr urrVar2) {
        urr urrVarE = e(urrVar);
        urr urrVarE2 = e(urrVar2);
        if (urrVarE instanceof zkt) {
            return ((zkt) urrVarE).Q(urrVarE2, 0L, true);
        }
        return urrVarE2 instanceof zkt ? ((zkt) urrVarE2).Q(urrVarE, 0L, true) ^ (-9223372034707292160L) : urrVarE.Q(urrVarE, 0L, true);
    }
}
