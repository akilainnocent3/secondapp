package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bfp {
    public final v9e0 a;
    public int b;

    public bfp(fcp fcpVar, v9e0 v9e0Var) {
        this.a = v9e0Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final scp a() {
        scp wdpVar;
        Object obj;
        Object objInvoke;
        v9e0 v9e0Var = this.a;
        byte bP = v9e0Var.p();
        if (bP == 1) {
            return d(true);
        }
        if (bP == 0) {
            return d(false);
        }
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (bP != 6) {
            if (bP == 8) {
                return b();
            }
            v9e0.l(v9e0Var, "Cannot read Json element because of unexpected ".concat(uzh.d(bP)), 0, null, 6);
            throw null;
        }
        int i = this.b + 1;
        this.b = i;
        if (i == 200) {
            zep zepVar = new zep(this, null);
            Unit unit = Unit.a;
            y5b y5bVar = l8d.a;
            n8d n8dVar = new n8d(defaultConstructorMarker);
            n8dVar.a = zepVar;
            n8dVar.b = unit;
            n8dVar.c = n8dVar;
            y5b y5bVar2 = l8d.a;
            n8dVar.d = y5bVar2;
            while (true) {
                obj = n8dVar.d;
                v1b<? super scp> v1bVar = n8dVar.c;
                if (v1bVar == null) {
                    break;
                }
                zi50.a aVar = zi50.b;
                if (Intrinsics.g(y5bVar2, obj)) {
                    try {
                        zep zepVar2 = n8dVar.a;
                        Object obj2 = n8dVar.b;
                        if (zepVar2 == 0) {
                            zepVar2.getClass();
                            CoroutineContext context = v1bVar.getContext();
                            Object wzoVar = context == e.a ? new wzo(v1bVar) : new xzo(v1bVar, context);
                            y8h0.d(3, zepVar2);
                            objInvoke = zepVar2.invoke(n8dVar, obj2, wzoVar);
                        } else {
                            y8h0.d(3, zepVar2);
                            objInvoke = zepVar2.invoke(n8dVar, obj2, v1bVar);
                        }
                        if (objInvoke != y5b.a) {
                            v1bVar.resumeWith(objInvoke);
                        }
                    } catch (Throwable th) {
                        zi50.a aVar2 = zi50.b;
                        v1bVar.resumeWith(new zi50.b(th));
                    }
                } else {
                    n8dVar.d = y5bVar2;
                    v1bVar.resumeWith(obj);
                }
            }
            uj50.b(obj);
            wdpVar = (scp) obj;
        } else {
            byte bF = v9e0Var.f((byte) 6);
            if (v9e0Var.p() == 4) {
                v9e0.l(v9e0Var, "Unexpected leading comma", 0, null, 6);
                throw null;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (v9e0Var.b()) {
                String strI = v9e0Var.i();
                v9e0Var.f((byte) 5);
                linkedHashMap.put(strI, a());
                bF = v9e0Var.e();
                if (bF != 4) {
                    if (bF == 7) {
                        break;
                    }
                    v9e0.l(v9e0Var, "Expected end of the object or comma", 0, null, 6);
                    throw null;
                }
            }
            if (bF == 6) {
                v9e0Var.f((byte) 7);
            } else if (bF == 4) {
                jdp.f(v9e0Var);
                throw null;
            }
            wdpVar = new wdp(linkedHashMap);
        }
        this.b--;
        return wdpVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0094  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(m8d m8dVar, pz1 pz1Var) {
        afp afpVar;
        m8d m8dVar2;
        byte bE;
        LinkedHashMap linkedHashMap;
        bfp bfpVar;
        v9e0 v9e0Var;
        if (pz1Var instanceof afp) {
            afpVar = (afp) pz1Var;
            int i = afpVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                afpVar.v = i - Integer.MIN_VALUE;
            } else {
                afpVar = new afp(this, pz1Var);
            }
        } else {
            afpVar = new afp(this, pz1Var);
        }
        Object obj = afpVar.f;
        y5b y5bVar = y5b.a;
        int i2 = afpVar.v;
        int i3 = 0;
        if (i2 != 0) {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = afpVar.e;
            String str = afpVar.d;
            linkedHashMap = afpVar.c;
            bfpVar = afpVar.b;
            m8dVar2 = afpVar.a;
            uj50.b(obj);
            linkedHashMap.put(str, (scp) obj);
            bE = bfpVar.a.e();
            if (bE == 4) {
                i3 = i4;
                this = bfpVar;
            } else if (bE != 7) {
                v9e0.l(bfpVar.a, "Expected end of the object or comma", 0, null, 6);
                throw null;
            }
            v9e0Var = bfpVar.a;
            if (bE == 6) {
                v9e0Var.f((byte) 7);
            } else if (bE == 4) {
                jdp.f(v9e0Var);
                throw null;
            }
            return new wdp(linkedHashMap);
        }
        uj50.b(obj);
        v9e0 v9e0Var2 = this.a;
        byte bF = v9e0Var2.f((byte) 6);
        if (v9e0Var2.p() == 4) {
            v9e0.l(v9e0Var2, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        m8dVar2 = m8dVar;
        bE = bF;
        linkedHashMap = new LinkedHashMap();
        v9e0 v9e0Var3 = this.a;
        if (!v9e0Var3.b()) {
            bfpVar = this;
            v9e0Var = bfpVar.a;
            if (bE == 6) {
                v9e0Var.f((byte) 7);
            } else if (bE == 4) {
                jdp.f(v9e0Var);
                throw null;
            }
            return new wdp(linkedHashMap);
        }
        String strI = v9e0Var3.i();
        v9e0Var3.f((byte) 5);
        Unit unit = Unit.a;
        afpVar.a = m8dVar2;
        afpVar.b = this;
        afpVar.c = linkedHashMap;
        afpVar.d = strI;
        afpVar.e = i3;
        afpVar.v = 1;
        m8dVar2.a(unit, afpVar);
        return y5bVar;
    }

    public final bep d(boolean z) {
        v9e0 v9e0Var = this.a;
        String strJ = !z ? v9e0Var.j() : v9e0Var.i();
        return (z || !Intrinsics.g(strJ, "null")) ? new ndp(strJ, z, null) : sdp.INSTANCE;
    }

    public final acp b() {
        v9e0 v9e0Var = this.a;
        byte bE = v9e0Var.e();
        if (v9e0Var.p() == 4) {
            v9e0.l(v9e0Var, "Unexpected leading comma", 0, null, 6);
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        while (v9e0Var.b()) {
            arrayList.add(a());
            bE = v9e0Var.e();
            if (bE != 4) {
                boolean z = bE == 9;
                int i = v9e0Var.a;
                if (!z) {
                    v9e0.l(v9e0Var, CaxEybC.bWIyYbcsgd, i, null, 4);
                    throw null;
                }
            }
        }
        if (bE == 8) {
            v9e0Var.f((byte) 9);
        } else if (bE == 4) {
            jdp.e(v9e0Var, "array");
            throw null;
        }
        return new acp(arrayList);
    }
}
