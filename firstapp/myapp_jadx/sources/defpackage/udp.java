package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class udp implements php<sdp> {
    public static final udp a = new udp();
    public static final sd80 b = vd80.c("kotlinx.serialization.json.JsonNull", yd80.b.a, new pd80[0]);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        cdp.a(b5dVar);
        if (b5dVar.D()) {
            throw new pcp("Expected 'null' literal");
        }
        return sdp.INSTANCE;
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        ((sdp) obj).getClass();
        cdp.b(f4gVar);
        f4gVar.t();
    }
}
