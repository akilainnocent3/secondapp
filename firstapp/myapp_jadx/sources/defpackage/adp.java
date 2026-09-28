package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class adp implements php<scp> {
    public static final adp a = new adp();
    public static final sd80 b = vd80.b("kotlinx.serialization.json.JsonElement", f120.b.a, new pd80[0], new nbf(1));

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return cdp.a(b5dVar).h();
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        scp scpVar = (scp) obj;
        scpVar.getClass();
        cdp.b(f4gVar);
        if (scpVar instanceof bep) {
            f4gVar.x(fep.a, scpVar);
            return;
        }
        if (scpVar instanceof wdp) {
            f4gVar.x(ydp.a, scpVar);
        } else if (scpVar instanceof acp) {
            f4gVar.x(ccp.a, scpVar);
        } else {
            uhc.a();
        }
    }
}
