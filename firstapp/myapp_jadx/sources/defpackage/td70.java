package defpackage;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class td70 {
    public final mg70 a;
    public final rdd0 b;
    public final b390 c;
    public final wwd0 d;
    public jvd0 e;
    public final b390 f;
    public final wwd0 g;
    public jvd0 h;
    public final wwd0 i;
    public final wwd0 j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("INITIAL_LOAD", 0);
            a = aVar;
            a aVar2 = new a("RELOAD", 1);
            b = aVar2;
            a aVar3 = new a("CLEAR", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public td70(mg70 mg70Var, rdd0 rdd0Var) {
        this.a = mg70Var;
        this.b = rdd0Var;
        pb5 pb5Var = pb5.b;
        this.c = d390.b(0, 1, pb5Var, 1);
        this.d = xwd0.a(null);
        this.f = d390.b(0, 1, pb5Var, 1);
        this.g = xwd0.a(null);
        this.i = xwd0.a(null);
        this.j = xwd0.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, x1b x1bVar) {
        ud70 ud70Var;
        Object value;
        Object objF;
        Object value2;
        Object value3;
        if (x1bVar instanceof ud70) {
            ud70Var = (ud70) x1bVar;
            int i = ud70Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud70Var.d = i - Integer.MIN_VALUE;
            } else {
                ud70Var = new ud70(this, x1bVar);
            }
        } else {
            ud70Var = new ud70(this, x1bVar);
        }
        Object obj = ud70Var.b;
        y5b y5bVar = y5b.a;
        int i2 = ud70Var.d;
        Object obj2 = null;
        wwd0 wwd0Var = this.d;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, je70.b.a));
            ud70Var.a = str2;
            ud70Var.d = 1;
            objF = this.a.f(str, str2, ud70Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = ud70Var.a;
            uj50.b(obj);
            objF = ((zi50) obj).a;
        }
        Throwable thA = zi50.a(objF);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new je70.a(new ie70(thA))));
            return Unit.a;
        }
        for (Object obj3 : (Iterable) objF) {
            if (((r770) obj3).a.equals(str2)) {
                obj2 = obj3;
                break;
            }
        }
        r770 r770Var = (r770) obj2;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, new je70.c(r770Var)));
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, x1b x1bVar) {
        vd70 vd70Var;
        Object value;
        Object objG;
        Object value2;
        Object value3;
        if (x1bVar instanceof vd70) {
            vd70Var = (vd70) x1bVar;
            int i = vd70Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd70Var.c = i - Integer.MIN_VALUE;
            } else {
                vd70Var = new vd70(this, x1bVar);
            }
        } else {
            vd70Var = new vd70(this, x1bVar);
        }
        Object obj = vd70Var.a;
        y5b y5bVar = y5b.a;
        int i2 = vd70Var.c;
        wwd0 wwd0Var = this.g;
        if (i2 == 0) {
            uj50.b(obj);
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, te70.b.a));
            vd70Var.c = 1;
            objG = this.a.g(str, str2, vd70Var);
            if (objG == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objG = ((zi50) obj).a;
        }
        Throwable thA = zi50.a(objG);
        if (thA != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, new te70.a(new se70(thA))));
            return Unit.a;
        }
        List list = (List) objG;
        do {
            value3 = wwd0Var.getValue();
        } while (!wwd0Var.g(value3, new te70.c(list)));
        return Unit.a;
    }
}
