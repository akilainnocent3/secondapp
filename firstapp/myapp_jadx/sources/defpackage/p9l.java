package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p9l implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p9l(hfs hfsVar, int i) {
        this.a = 0;
        this.b = hfsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 0;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                v9l.a((hfs) obj3, (a) obj, qj40.a(1));
                return Unit.a;
            case 1:
                final huu huuVar = (huu) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zA = aVar.A(huuVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        objY = new fuu(huuVar, i2);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(huuVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: guu
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                azm azmVar = huuVar.f;
                                if (azmVar != null) {
                                    azmVar.d(wae.HOME);
                                    return Unit.a;
                                }
                                Intrinsics.n("router");
                                throw null;
                            }
                        };
                        aVar.r(objY2);
                    }
                    pvu.b(function0, (Function0) objY2, null, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                return new iwo(((long) ((ht.b) obj3).a(0, (int) (((jxo) obj).a >> 32), (asr) obj2)) << 32);
        }
    }

    public /* synthetic */ p9l(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
