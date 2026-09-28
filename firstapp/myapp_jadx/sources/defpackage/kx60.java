package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class kx60 {
    public static final uv60 a;
    public static final uv60 i;
    public static final uv60 m;
    public static final uv60 n;
    public static final uv60 q;
    public static final lx60 s;
    public static final uv60 b = new uv60(new uw60(), new iw60());
    public static final uv60 c = new uv60(new ax60(), new zw60());
    public static final uv60 d = new uv60(new dx60(), new cx60());
    public static final uv60 e = new uv60(new z8b(2), new ex60());
    public static final uv60 f = new uv60(new qw60(), new gw60());
    public static final uv60 g = new uv60(new fx60(), new bx60());
    public static final uv60 h = new uv60(new hx60(), new gx60());
    public static final uv60 j = new uv60(new yv60(), new jx60());
    public static final uv60 k = new uv60(new bw60(), new aw60());
    public static final uv60 l = new uv60(new dw60(), new cw60());
    public static final uv60 o = new uv60(new mbk(1), new hw60());
    public static final uv60 p = new uv60(new kw60(), new jw60());
    public static final lx60 r = new lx60(b.a, a.a);
    public static final lx60 t = new lx60(new rw60(), new pw60());
    public static final uv60 u = new uv60(new tw60(), new sw60());
    public static final uv60 v = new uv60(new ww60(), new vw60());
    public static final uv60 w = new uv60(new yw60(), new xw60());

    public static final class a implements Function2<wv60, j58, Object> {
        public static final a a = new a();

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(wv60 wv60Var, j58 j58Var) {
            long j = j58Var.a;
            return j == 16 ? Boolean.FALSE : Integer.valueOf(r58.l(j));
        }
    }

    public static final class b implements Function1<Object, j58> {
        public static final b a = new b();

        @Override // kotlin.jvm.functions.Function1
        public final j58 invoke(Object obj) {
            if (Intrinsics.g(obj, Boolean.FALSE)) {
                return new j58(j58.m);
            }
            obj.getClass();
            return new j58(r58.b(((Integer) obj).intValue()));
        }
    }

    static {
        int i2 = 0;
        a = new uv60(new zv60(i2), new xv60());
        int i3 = 1;
        i = new uv60(new efk(i3), new ix60());
        m = new uv60(new qak(i3), new ew60());
        n = new uv60(new zly(i3), new fw60());
        q = new uv60(new mw60(i2), new lw60());
        s = new lx60(new ow60(i2), new nw60());
    }

    public static final <T extends rv60<Original, Saveable>, Original, Saveable> Object a(Original original, T t2, wv60 wv60Var) {
        Object objA;
        return (original == null || (objA = t2.a(wv60Var, original)) == null) ? Boolean.FALSE : objA;
    }
}
