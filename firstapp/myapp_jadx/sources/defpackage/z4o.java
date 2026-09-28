package defpackage;

import kotlin.time.d;

/* JADX INFO: loaded from: classes8.dex */
public final class z4o implements php<d> {
    public static final z4o a = new z4o();
    public static final gw20 b = new gw20("kotlin.time.Instant", bw20.i.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        d dVar = d.c;
        return d.a.c(b5dVar.A());
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        d dVar = (d) obj;
        dVar.getClass();
        f4gVar.E(dVar.toString());
    }
}
