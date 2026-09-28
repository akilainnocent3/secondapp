package defpackage;

import androidx.fragment.app.e;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jaf implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jaf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                float fFloatValue = ((Float) obj).floatValue();
                abf abfVar = ((naf) obj2).a;
                k230 k230Var = abfVar.m;
                zzr zzrVar = abfVar.a;
                isw iswVar = abfVar.g;
                ((t5a0) iswVar).A(((t5a0) iswVar).j() + fFloatValue);
                zyr zyrVarA = abfVar.a();
                if (zyrVarA != null) {
                    float fB = abfVar.b() + zyrVarA.getOffset();
                    kzr kzrVarJ = zzrVar.j();
                    i3z i3zVar = i3z.a;
                    int iIntValue = ((Number) l230.a(kzrVarJ).b).intValue();
                    if (k230Var.e == null) {
                        float fA = zyrVarA.a() + fB;
                        Iterator<T> it = zzrVar.j().k().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                zyr zyrVar = (zyr) next;
                                float fA2 = (zyrVar.a() / 2.0f) + zyrVar.getOffset();
                                if (fB <= fA2 && fA2 <= fA && zyrVarA.getIndex() != zyrVar.getIndex() && abfVar.l.contains(zyrVar.getKey()) && zyrVar.getOffset() >= 0) {
                                    if (zyrVar.a() + zyrVar.getOffset() <= iIntValue) {
                                    }
                                }
                            } else {
                                next = null;
                            }
                        }
                        zyr zyrVar2 = (zyr) next;
                        if (zyrVar2 != null) {
                            abfVar.d(zyrVarA, zyrVar2);
                        }
                    }
                    float fJ = fB + zzrVar.j().j() + abfVar.k;
                    float f = fJ - 0.0f;
                    float f2 = iIntValue - fJ;
                    float f3 = abfVar.d;
                    int i2 = 0;
                    if (f < f3) {
                        k230Var.a(new taf(abfVar, i2), k230.a.a, (1.0f - f.d((f + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f);
                    } else if (f2 < f3) {
                        k230Var.a(new uaf(abfVar, i2), k230.a.b, (1.0f - f.d((f2 + f3) / (f3 * 2.0f), 0.0f, 1.0f)) * 10.0f);
                    } else {
                        jvd0 jvd0Var = k230Var.f;
                        if (jvd0Var != null) {
                            jvd0Var.cancel((CancellationException) null);
                        }
                        k230Var.e = null;
                    }
                }
                return Unit.a;
            case 1:
                fbp.a aVar = (fbp.a) obj;
                aVar.getClass();
                return aVar.a((String) obj2);
            default:
                loe0 loe0Var = (loe0) obj2;
                une0 une0Var = (une0) obj;
                une0Var.getClass();
                if (une0Var instanceof une0.b) {
                    aoe0 aoe0Var = ((une0.b) une0Var).a;
                    if (aoe0Var instanceof aoe0.b) {
                        aoe0.b bVar = (aoe0.b) aoe0Var;
                        aoe0.b.a aVar2 = bVar.j;
                        int i3 = aVar2 == null ? -1 : loe0.a.a[aVar2.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2 || i3 == 3) {
                                d900 d900Var = loe0Var.w;
                                if (d900Var == null) {
                                    Intrinsics.n("paymentRouter");
                                    throw null;
                                }
                                e eVarRequireActivity = loe0Var.requireActivity();
                                eVarRequireActivity.getClass();
                                Object obj3 = bVar.a;
                                obj3.getClass();
                                d900Var.c(eVarRequireActivity, (Integer) obj3);
                            } else {
                                loe0Var.m0().z1(aoe0Var);
                            }
                        }
                    } else {
                        loe0Var.m0().z1(aoe0Var);
                    }
                } else {
                    if (!(une0Var instanceof une0.a)) {
                        uhc.a();
                        return null;
                    }
                    loe0Var.m0().d.a(new vne0.c(((une0.a) une0Var).a));
                }
                return Unit.a;
        }
    }
}
