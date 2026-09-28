package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class xep extends tep {
    public String h;
    public boolean i;

    @Override // defpackage.tep, defpackage.p3
    public final scp n0() {
        return new wdp(this.g);
    }

    @Override // defpackage.tep, defpackage.p3
    public final void o0(scp scpVar, String str) {
        str.getClass();
        scpVar.getClass();
        if (!this.i) {
            String str2 = this.h;
            if (str2 == null) {
                Intrinsics.n("tag");
                throw null;
            }
            this.g.put(str2, scpVar);
            this.i = true;
            return;
        }
        if (scpVar instanceof bep) {
            this.h = ((bep) scpVar).b();
            this.i = false;
        } else {
            if (scpVar instanceof wdp) {
                throw jdp.b(ydp.b);
            }
            if (scpVar instanceof acp) {
                throw jdp.b(ccp.b);
            }
            uhc.a();
        }
    }
}
