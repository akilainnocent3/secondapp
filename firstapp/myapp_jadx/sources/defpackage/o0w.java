package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0w implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o0w(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                wd0 wd0Var = (wd0) obj2;
                a7l a7lVar = (a7l) obj;
                float fJ = ((t5a0) ((j590) obj3).e.j).j();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (a7lVar.d() & 4294967295L));
                if (!Float.isNaN(fJ) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) wd0Var.d()).floatValue();
                    a7lVar.k(v1w.e(a7lVar, fFloatValue));
                    a7lVar.v(v1w.f(a7lVar, fFloatValue));
                    a7lVar.z0(n09.a(0.5f, (fJ + fIntBitsToFloat) / fIntBitsToFloat));
                }
                break;
            default:
                jlv jlvVar = (jlv) obj3;
                yp40 yp40Var = (yp40) obj2;
                T tD = jlvVar.d();
                if (yp40Var.a || ((tD == 0 && obj != null) || (tD != 0 && !tD.equals(obj)))) {
                    yp40Var.a = false;
                    jlvVar.m(obj);
                }
                break;
        }
        return Unit.a;
    }
}
