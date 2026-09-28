package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kt60 implements et60 {
    public static final uv60 e = new uv60(new gt60(), new jkf());
    public final Map<Object, Map<String, List<Object>>> a;
    public final rtw<Object, mt60> b;
    public mt60 c;
    public final ft60 d;

    public kt60(Map<Object, Map<String, List<Object>>> map) {
        this.a = map;
        this.b = fz60.b();
        this.d = new ft60(this, 0);
    }

    @Override // defpackage.et60
    public final void c(Object obj) {
        if (this.b.k(obj) == null) {
            this.a.remove(obj);
        }
    }

    @Override // defpackage.et60
    public final void f(final Object obj, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(533563200);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(this) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            bVarI.B(obj);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                ft60 ft60Var = this.d;
                if (!((Boolean) ft60Var.invoke(obj)).booleanValue()) {
                    kb5.a(aya.b(obj, "Type of the key ", " is not supported. On Android you can only use types which can be stored inside the Bundle."));
                    return;
                }
                Map<String, List<Object>> map = this.a.get(obj);
                qyd0 qyd0Var = pt60.a;
                rt60 rt60Var = new rt60(new nt60(map, ft60Var));
                bVarI.r(rt60Var);
                objY = rt60Var;
            }
            final rt60 rt60Var2 = (rt60) objY;
            hna.b(new j730[]{pt60.a.a(rt60Var2), udt.a.a(rt60Var2)}, op8Var, bVarI, (i2 & 112) | 8);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(this) | bVarI.A(obj) | bVarI.A(rt60Var2);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function1() { // from class: ht60
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        kt60 kt60Var = this.a;
                        rtw<Object, mt60> rtwVar = kt60Var.b;
                        Object obj3 = obj;
                        if (rtwVar.a(obj3)) {
                            kb5.a(aya.b(obj3, "Key ", " was used multiple times "));
                            return null;
                        }
                        kt60Var.a.remove(obj3);
                        rt60 rt60Var3 = rt60Var2;
                        rtwVar.m(obj3, rt60Var3);
                        return new jt60(kt60Var, obj3, rt60Var3);
                    }
                };
                bVarI.r(objY2);
            }
            xvf.c(unit, (Function1) objY2, bVarI);
            bVarI.w();
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: it60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iA = qj40.a(i | 1);
                    this.a.f(obj, op8Var, (a) obj2, iA);
                    return Unit.a;
                }
            };
        }
    }

    public kt60() {
        this(0);
    }

    public /* synthetic */ kt60(int i) {
        this(new LinkedHashMap());
    }
}
