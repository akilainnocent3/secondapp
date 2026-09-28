package defpackage;

import com.sportybet.android.globalpay.pixBtg.withdraw.b;
import com.sportybet.android.globalpay.pixBtg.withdraw.d;
import com.sportybet.android.globalpay.pixBtg.withdraw.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jc10 extends saj implements Function1<b, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(b bVar) {
        b bVar2 = bVar;
        bVar2.getClass();
        h hVar = (h) this.receiver;
        hVar.getClass();
        if (bVar2.equals(b.d.a)) {
            hVar.D1(new ad10());
        } else if (bVar2.equals(b.a.a)) {
            if (hVar.z.a()) {
                hVar.x1(d.h.a);
            } else {
                hVar.z1();
            }
        } else if (bVar2.equals(b.f.a)) {
            hVar.D1(new zc10());
        } else if (bVar2.equals(b.C0239b.a)) {
            hVar.D1(new bd10());
        } else if (bVar2.equals(b.c.a)) {
            hVar.D1(new kzn(1));
            hVar.z1();
        } else if (bVar2.equals(b.e.a)) {
            hVar.D1(new f75(1));
        } else if (bVar2.equals(b.g.a)) {
            hVar.D1(new h75(1));
        } else if (bVar2.equals(b.h.a)) {
            hVar.D1(new cd10());
        } else if (bVar2.equals(b.i.a)) {
            hVar.D1(new w2x(1));
            hVar.x1(d.e.a);
        } else {
            if (!(bVar2 instanceof b.j)) {
                uhc.a();
                return null;
            }
            hVar.D1(new tyn(1));
            int iOrdinal = ((b.j) bVar2).a.ordinal();
            if (iOrdinal == 0) {
                hVar.x1(d.b.a);
            } else {
                if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                hVar.x1(d.j.a);
            }
        }
        return Unit.a;
    }
}
