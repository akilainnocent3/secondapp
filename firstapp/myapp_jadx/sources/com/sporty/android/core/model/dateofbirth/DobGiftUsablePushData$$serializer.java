package com.sporty.android.core.model.dateofbirth;

import defpackage.b5d;
import defpackage.dma;
import defpackage.f4g;
import defpackage.fae;
import defpackage.fma;
import defpackage.gae0;
import defpackage.hxo;
import defpackage.jtf0;
import defpackage.kr10;
import defpackage.mr10;
import defpackage.o1k;
import defpackage.pd80;
import defpackage.php;
import defpackage.tae;
import defpackage.ttr;
import defpackage.x15;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sporty/android/core/model/dateofbirth/DobGiftUsablePushData.$serializer", "Lo1k;", "Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;", "<init>", "()V", "Lf4g;", "encoder", "value", "", "serialize", "(Lf4g;Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;)V", "Lb5d;", "decoder", "deserialize", "(Lb5d;)Lcom/sporty/android/core/model/dateofbirth/DobGiftUsablePushData;", "", "Lphp;", "childSerializers", "()[Lphp;", "Lpd80;", "descriptor", "Lpd80;", "getDescriptor", "()Lpd80;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public final /* synthetic */ class DobGiftUsablePushData$$serializer implements o1k<DobGiftUsablePushData> {
    public static final DobGiftUsablePushData$$serializer INSTANCE;
    private static final pd80 descriptor;

    static {
        DobGiftUsablePushData$$serializer dobGiftUsablePushData$$serializer = new DobGiftUsablePushData$$serializer();
        INSTANCE = dobGiftUsablePushData$$serializer;
        kr10 kr10Var = new kr10("com.sporty.android.core.model.dateofbirth.DobGiftUsablePushData", dobGiftUsablePushData$$serializer, 12);
        kr10Var.j("title", false);
        kr10Var.j("text", false);
        kr10Var.j("amount", false);
        kr10Var.j("currency", false);
        kr10Var.j("linkUrl", false);
        kr10Var.j("isMultiple", false);
        kr10Var.j("kind", false);
        kr10Var.j("leastOrderAmount", false);
        kr10Var.j("usableTime", false);
        kr10Var.j("expireTime", false);
        kr10Var.j("srcCtt", false);
        kr10Var.j("bizTypeScope", false);
        descriptor = kr10Var;
    }

    private DobGiftUsablePushData$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.o1k
    public final php<?>[] childSerializers() {
        ttr[] ttrVarArr = DobGiftUsablePushData.$childSerializers;
        gae0 gae0Var = gae0.a;
        hxo hxoVar = hxo.a;
        return new php[]{gae0Var, gae0Var, hxoVar, gae0Var, gae0Var, x15.a, hxoVar, hxoVar, gae0Var, gae0Var, gae0Var, ttrVarArr[11].getValue()};
    }

    @Override // defpackage.tae
    public final DobGiftUsablePushData deserialize(b5d decoder) {
        decoder.getClass();
        pd80 pd80Var = descriptor;
        dma dmaVarC = decoder.c(pd80Var);
        ttr[] ttrVarArr = DobGiftUsablePushData.$childSerializers;
        DobGiftUsablePushData dobGiftUsablePushData = null;
        boolean z = true;
        List list = null;
        String strJ = null;
        String strJ2 = null;
        String strJ3 = null;
        String strJ4 = null;
        String strJ5 = null;
        String strJ6 = null;
        String strJ7 = null;
        int i = 0;
        int iM = 0;
        boolean zE = false;
        int iM2 = 0;
        int iM3 = 0;
        while (z) {
            int iV = dmaVarC.v(pd80Var);
            switch (iV) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    strJ = dmaVarC.j(pd80Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strJ2 = dmaVarC.j(pd80Var, 1);
                    i |= 2;
                    break;
                case 2:
                    iM = dmaVarC.m(pd80Var, 2);
                    i |= 4;
                    break;
                case 3:
                    strJ3 = dmaVarC.j(pd80Var, 3);
                    i |= 8;
                    break;
                case 4:
                    strJ4 = dmaVarC.j(pd80Var, 4);
                    i |= 16;
                    break;
                case 5:
                    zE = dmaVarC.E(pd80Var, 5);
                    i |= 32;
                    break;
                case 6:
                    iM2 = dmaVarC.m(pd80Var, 6);
                    i |= 64;
                    break;
                case 7:
                    iM3 = dmaVarC.m(pd80Var, 7);
                    i |= 128;
                    break;
                case 8:
                    strJ5 = dmaVarC.j(pd80Var, 8);
                    i |= 256;
                    break;
                case 9:
                    strJ6 = dmaVarC.j(pd80Var, 9);
                    i |= 512;
                    break;
                case 10:
                    strJ7 = dmaVarC.j(pd80Var, 10);
                    i |= 1024;
                    break;
                case 11:
                    list = (List) dmaVarC.y(pd80Var, 11, (tae) ttrVarArr[11].getValue(), list);
                    i |= 2048;
                    break;
                default:
                    jtf0.a(iV);
                    return dobGiftUsablePushData;
            }
            dobGiftUsablePushData = null;
        }
        dmaVarC.b(pd80Var);
        return new DobGiftUsablePushData(i, strJ, strJ2, iM, strJ3, strJ4, zE, iM2, iM3, strJ5, strJ6, strJ7, list, null);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.he80
    public final void serialize(f4g encoder, DobGiftUsablePushData value) {
        encoder.getClass();
        value.getClass();
        pd80 pd80Var = descriptor;
        fma fmaVarC = encoder.c(pd80Var);
        DobGiftUsablePushData.write$Self$model(value, fmaVarC, pd80Var);
        fmaVarC.b(pd80Var);
    }

    @Override // defpackage.o1k
    public /* bridge */ php<?>[] typeParametersSerializers() {
        return mr10.a;
    }
}
