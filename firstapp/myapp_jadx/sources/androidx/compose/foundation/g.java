package androidx.compose.foundation;

import defpackage.chf;
import defpackage.gaj;
import defpackage.gnn;
import defpackage.ifn;
import defpackage.ivx;
import defpackage.jfn;
import defpackage.kfn;
import defpackage.mfn;
import defpackage.psw;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static final chf a = new chf(new jfn(0));

    public static final class a implements gaj<androidx.compose.ui.d, androidx.compose.runtime.a, Integer, androidx.compose.ui.d> {
        public final /* synthetic */ ifn a;
        public final /* synthetic */ psw b;

        public a(ifn ifnVar, psw pswVar) {
            this.a = ifnVar;
            this.b = pswVar;
        }

        @Override // defpackage.gaj
        public final androidx.compose.ui.d invoke(androidx.compose.ui.d dVar, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            num.intValue();
            aVar2.N(-353972293);
            this.a.getClass();
            aVar2.N(1257603829);
            aVar2.H();
            ivx ivxVar = ivx.a;
            boolean zM = aVar2.M(ivxVar);
            Object objY = aVar2.y();
            if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new kfn(ivxVar);
                aVar2.r(objY);
            }
            kfn kfnVar = (kfn) objY;
            aVar2.H();
            return kfnVar;
        }
    }

    public static final androidx.compose.ui.d a(androidx.compose.ui.d dVar, psw pswVar, ifn ifnVar) {
        if (ifnVar == null) {
            return dVar;
        }
        return ifnVar instanceof mfn ? dVar.n(new IndicationModifierElement(pswVar, (mfn) ifnVar)) : androidx.compose.ui.c.a(dVar, gnn.a, new a(ifnVar, pswVar));
    }
}
