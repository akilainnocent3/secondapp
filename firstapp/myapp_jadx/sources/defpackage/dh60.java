package defpackage;

import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class dh60 extends xsq {
    public final r4r a;
    public final rdd0 b;

    public dh60(r4r r4rVar, rdd0 rdd0Var) {
        r4rVar.getClass();
        rdd0Var.getClass();
        this.a = r4rVar;
        this.b = rdd0Var;
    }

    @Override // defpackage.xsq
    public final v67 a(tsq tsqVar, qxp qxpVar, ssq ssqVar, b390 b390Var) {
        tsqVar.getClass();
        qxpVar.getClass();
        b390Var.getClass();
        return hzh.b(new ah60(ssqVar, this, b390Var, qxpVar, null));
    }

    @Override // defpackage.xsq
    public final v67 b(ssq ssqVar, tsq tsqVar, v340 v340Var, v340 v340Var2, v340 v340Var3, wwd0 wwd0Var, b390 b390Var) {
        v340Var.getClass();
        v340Var2.getClass();
        v340Var3.getClass();
        wwd0Var.getClass();
        b390Var.getClass();
        return hzh.b(new bh60(wwd0Var, v340Var2, v340Var, v340Var3, ssqVar, tsqVar, this, b390Var, null));
    }

    @Override // defpackage.xsq
    public final isq c(String str, String str2, qcn<Integer> qcnVar, qcn<Integer> qcnVar2, qcn<Integer> qcnVar3, qcn<Integer> qcnVar4) {
        String strValueOf;
        String strValueOf2;
        qcnVar.getClass();
        qcnVar2.getClass();
        qcnVar3.getClass();
        qcnVar4.getClass();
        Integer num = (Integer) CollectionsKt.firstOrNull(qcnVar);
        String str3 = "";
        if (num == null || (strValueOf = String.valueOf(num.intValue())) == null) {
            strValueOf = "";
        }
        jrq.b bVar = new jrq.b(strValueOf);
        Integer num2 = (Integer) CollectionsKt.firstOrNull(qcnVar3);
        if (num2 != null && (strValueOf2 = String.valueOf(num2.intValue())) != null) {
            str3 = strValueOf2;
        }
        return new isq(bVar, new jrq.b(str3));
    }
}
