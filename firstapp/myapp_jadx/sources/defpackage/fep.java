package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class fep implements php<bep> {
    public static final fep a = new fep();
    public static final sd80 b = vd80.c("kotlinx.serialization.json.JsonPrimitive", bw20.i.a, new pd80[0]);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        scp scpVarH = cdp.a(b5dVar).h();
        if (scpVarH instanceof bep) {
            return (bep) scpVarH;
        }
        throw jdp.c(-1, scpVarH.toString(), "Unexpected JSON element, expected JsonPrimitive, had " + jq40.a(scpVarH.getClass()));
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        bep bepVar = (bep) obj;
        bepVar.getClass();
        cdp.b(f4gVar);
        if (bepVar instanceof sdp) {
            f4gVar.x(udp.a, sdp.INSTANCE);
        } else {
            f4gVar.x(odp.a, (ndp) bepVar);
        }
    }
}
