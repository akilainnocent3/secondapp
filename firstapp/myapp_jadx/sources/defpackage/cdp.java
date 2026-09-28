package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class cdp {
    public static cdp a;

    public static final ncp a(b5d b5dVar) {
        b5dVar.getClass();
        ncp ncpVar = b5dVar instanceof ncp ? (ncp) b5dVar : null;
        if (ncpVar != null) {
            return ncpVar;
        }
        uj5.a(jq40.a(b5dVar.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    public static final void b(f4g f4gVar) {
        f4gVar.getClass();
        if ((f4gVar instanceof edp ? (edp) f4gVar : null) != null) {
            return;
        }
        uj5.a(jq40.a(f4gVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }
}
