package defpackage;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes8.dex */
public final class vkd0 implements php<rkd0> {
    public static final vkd0 a = new vkd0();
    public static final gw20 b = vd80.a("StableBigDecimal", bw20.i.a);

    @Override // defpackage.tae
    public final Object deserialize(b5d b5dVar) {
        return new rkd0(new BigDecimal(b5dVar.A()));
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return b;
    }

    @Override // defpackage.he80
    public final void serialize(f4g f4gVar, Object obj) {
        BigDecimal bigDecimal = ((rkd0) obj).a;
        bigDecimal.getClass();
        String plainString = bigDecimal.toPlainString();
        plainString.getClass();
        f4gVar.E(plainString);
    }
}
