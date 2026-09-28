package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;

/* JADX INFO: loaded from: classes8.dex */
public final class nnp extends rtu {
    public static final byte[] d = new byte[0];
    public static final nnp[] e = new nnp[0];
    public final byte[] b;
    public final ktu c;

    public class a implements BiConsumer<e21<?>, Object> {
        public int a = 0;
        public final /* synthetic */ nnp[] b;

        public a(nnp[] nnpVarArr) {
            this.b = nnpVarArr;
        }

        @Override // java.util.function.BiConsumer
        public final void accept(e21<?> e21Var, Object obj) {
            byte[] bytes;
            nnp nnpVar;
            e21<?> e21Var2 = e21Var;
            int i = this.a;
            this.a = i + 1;
            if (e21Var2.getKey().isEmpty()) {
                bytes = nnp.d;
            } else if (e21Var2 instanceof kyo) {
                kyo kyoVar = (kyo) e21Var2;
                byte[] bytes2 = kyoVar.d;
                if (bytes2 == null) {
                    bytes2 = kyoVar.b.getBytes(StandardCharsets.UTF_8);
                    kyoVar.d = bytes2;
                }
                bytes = bytes2;
            } else {
                bytes = e21Var2.getKey().getBytes(StandardCharsets.UTF_8);
            }
            switch (e21Var2.getType().ordinal()) {
                case 0:
                    nnpVar = new nnp(bytes, new f9e0(qtu.k((String) obj)));
                    break;
                case 1:
                    nnpVar = new nnp(bytes, new m15(((Boolean) obj).booleanValue()));
                    break;
                case 2:
                    nnpVar = new nnp(bytes, new nvo(((Long) obj).longValue()));
                    break;
                case 3:
                    nnpVar = new nnp(bytes, new xye(((Double) obj).doubleValue()));
                    break;
                case 4:
                    nnpVar = new nnp(bytes, sw0.d((List) obj, new ow0()));
                    break;
                case 5:
                    nnpVar = new nnp(bytes, sw0.d((List) obj, new pw0()));
                    break;
                case 6:
                    nnpVar = new nnp(bytes, sw0.d((List) obj, new qw0()));
                    break;
                case 7:
                    nnpVar = new nnp(bytes, sw0.d((List) obj, new rw0()));
                    break;
                default:
                    hb5.a("Unsupported attribute type.");
                    return;
            }
            this.b[i] = nnpVar;
        }
    }

    public nnp(byte[] bArr, rtu rtuVar) {
        super(qtu.f(hnp.b, rtuVar) + qtu.b(hnp.a, bArr));
        this.b = bArr;
        this.c = rtuVar;
    }

    public static nnp[] d(m21 m21Var) {
        if (m21Var.isEmpty()) {
            return e;
        }
        nnp[] nnpVarArr = new nnp[m21Var.size()];
        m21Var.forEach(new a(nnpVarArr));
        return nnpVarArr;
    }

    @Override // defpackage.ktu
    public final void c(me80 me80Var) {
        me80Var.J(hnp.a, this.b);
        me80Var.l(hnp.b, this.c);
    }
}
