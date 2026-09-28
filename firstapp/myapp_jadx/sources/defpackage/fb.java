package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class fb implements wqm {
    public final lzm a;
    public final msm b;
    public final itm c;
    public final v5b d;
    public final yxm e;
    public int f;

    public fb(lzm lzmVar, msm msmVar, itm itmVar, v5b v5bVar, yxm yxmVar) {
        lzmVar.getClass();
        msmVar.getClass();
        itmVar.getClass();
        v5bVar.getClass();
        yxmVar.getClass();
        this.a = lzmVar;
        this.b = msmVar;
        this.c = itmVar;
        this.d = v5bVar;
        this.e = yxmVar;
        this.f = -1;
    }

    @Override // defpackage.wqm
    public final void a(int i) {
        this.f = i;
    }

    @Override // defpackage.wqm
    public final Unit b() {
        ej5.c(this.d, null, null, new eb(this, null), 3);
        return Unit.a;
    }
}
