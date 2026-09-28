package defpackage;

import androidx.compose.foundation.lazy.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dxr {
    public final et60 a;
    public final nj4 b;
    public final rtw<Object, a> c = fz60.b();

    public final class a {
        public final Object a;
        public final Object b;
        public int c;
        public op8 d;

        public a(int i, Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
        }
    }

    public dxr(et60 et60Var, nj4 nj4Var) {
        this.a = et60Var;
        this.b = nj4Var;
    }

    public final Function2<androidx.compose.runtime.a, Integer, Unit> a(int i, Object obj, Object obj2) {
        rtw<Object, a> rtwVar = this.c;
        a aVarD = rtwVar.d(obj);
        if (aVarD != null && aVarD.c == i && Intrinsics.g(aVarD.b, obj2)) {
            op8 op8Var = aVarD.d;
            if (op8Var != null) {
                return op8Var;
            }
            op8 op8Var2 = new op8(818252804, new cxr(dxr.this, aVarD), true);
            aVarD.d = op8Var2;
            return op8Var2;
        }
        a aVar = new a(i, obj, obj2);
        rtwVar.m(obj, aVar);
        op8 op8Var3 = aVar.d;
        if (op8Var3 != null) {
            return op8Var3;
        }
        op8 op8Var4 = new op8(818252804, new cxr(this, aVar), true);
        aVar.d = op8Var4;
        return op8Var4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVarD = this.c.d(obj);
        if (aVarD != null) {
            return aVarD.b;
        }
        c cVar = (c) this.b.invoke();
        int iC = cVar.c(obj);
        if (iC != -1) {
            return cVar.e(iC);
        }
        return null;
    }
}
