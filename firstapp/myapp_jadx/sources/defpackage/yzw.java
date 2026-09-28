package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yzw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yzw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int iD;
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                vu90<wyf0> vu90Var = ((c0x) obj3).z;
                String str = (String) obj2;
                lk50 lk50Var = (lk50) obj;
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    if (((BaseResponse) ((lk50.c) lk50Var).a).bizCode != 10000) {
                        vu90Var.m(new wyf0(new vyf0.c(str)));
                    }
                } else if (lk50Var instanceof lk50.a) {
                    vu90Var.m(new wyf0(new vyf0.c(str)));
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    vu90Var.m(new wyf0(vyf0.a.a));
                }
                return Unit.a;
            default:
                gt7 gt7Var = (gt7) obj3;
                j040 j040Var = (j040) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                float f = gt7Var.a;
                float fFloatValue2 = Float.valueOf(f).floatValue();
                float f2 = gt7Var.b;
                float fD = f.d(fFloatValue, fFloatValue2, Float.valueOf(f2).floatValue());
                int iD2 = j040Var.d();
                isw iswVar = j040Var.d;
                isw iswVar2 = j040Var.c;
                boolean z = false;
                if (iD2 > 0 && (iD = j040Var.d() + 1) >= 0) {
                    float fAbs = fD;
                    float f3 = fAbs;
                    int i2 = 0;
                    while (true) {
                        float fB = vcv.b(Float.valueOf(f).floatValue(), Float.valueOf(f2).floatValue(), i2 / (j040Var.d() + 1));
                        float f4 = fB - fD;
                        if (Math.abs(f4) <= fAbs) {
                            fAbs = Math.abs(f4);
                            f3 = fB;
                        }
                        if (i2 != iD) {
                            i2++;
                        } else {
                            fD = f3;
                        }
                    }
                }
                t5a0 t5a0Var = (t5a0) iswVar2;
                if (fD != t5a0Var.j()) {
                    t5a0 t5a0Var2 = (t5a0) iswVar;
                    long jH = d0a0.h(fD, t5a0Var2.j());
                    long jH2 = d0a0.h(t5a0Var.j(), t5a0Var2.j());
                    int i3 = s0a0.c;
                    if (jH != jH2) {
                        Function1<? super s0a0, Unit> function1 = j040Var.e;
                        if (function1 != null) {
                            function1.invoke(new s0a0(jH));
                        } else {
                            j040Var.h(s0a0.b(jH));
                            j040Var.g(s0a0.a(jH));
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
