package com.sporty.android.core.model.luckywheel;

import com.sportybet.android.instantwin.presentation.buildandgo.sTE.siPCzPFw;
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
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sporty/android/core/model/luckywheel/LuckyWheelTicketPushData.$serializer", "Lo1k;", "Lcom/sporty/android/core/model/luckywheel/LuckyWheelTicketPushData;", "<init>", "()V", "Lf4g;", "encoder", "value", "", "serialize", "(Lf4g;Lcom/sporty/android/core/model/luckywheel/LuckyWheelTicketPushData;)V", "Lb5d;", "decoder", "deserialize", "(Lb5d;)Lcom/sporty/android/core/model/luckywheel/LuckyWheelTicketPushData;", "", "Lphp;", "childSerializers", "()[Lphp;", "Lpd80;", "descriptor", "Lpd80;", "getDescriptor", "()Lpd80;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public final /* synthetic */ class LuckyWheelTicketPushData$$serializer implements o1k<LuckyWheelTicketPushData> {
    public static final LuckyWheelTicketPushData$$serializer INSTANCE;
    private static final pd80 descriptor;

    private LuckyWheelTicketPushData$$serializer() {
    }

    @Override // defpackage.o1k
    public final php<?>[] childSerializers() {
        gae0 gae0Var = gae0.a;
        hxo hxoVar = hxo.a;
        return new php[]{gae0Var, hxoVar, gae0Var, hxoVar};
    }

    @Override // defpackage.tae
    public final LuckyWheelTicketPushData deserialize(b5d decoder) {
        decoder.getClass();
        pd80 pd80Var = descriptor;
        dma dmaVarC = decoder.c(pd80Var);
        boolean z = true;
        int i = 0;
        int iM = 0;
        int iM2 = 0;
        String strJ = null;
        String strJ2 = null;
        while (z) {
            int iV = dmaVarC.v(pd80Var);
            if (iV == -1) {
                z = false;
            } else if (iV == 0) {
                strJ = dmaVarC.j(pd80Var, 0);
                i |= 1;
            } else if (iV == 1) {
                iM = dmaVarC.m(pd80Var, 1);
                i |= 2;
            } else if (iV == 2) {
                strJ2 = dmaVarC.j(pd80Var, 2);
                i |= 4;
            } else {
                if (iV != 3) {
                    jtf0.a(iV);
                    return null;
                }
                iM2 = dmaVarC.m(pd80Var, 3);
                i |= 8;
            }
        }
        dmaVarC.b(pd80Var);
        return new LuckyWheelTicketPushData(i, strJ, iM, strJ2, iM2, null);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.he80
    public final void serialize(f4g encoder, LuckyWheelTicketPushData value) {
        encoder.getClass();
        value.getClass();
        pd80 pd80Var = descriptor;
        fma fmaVarC = encoder.c(pd80Var);
        LuckyWheelTicketPushData.write$Self$model(value, fmaVarC, pd80Var);
        fmaVarC.b(pd80Var);
    }

    @Override // defpackage.o1k
    public /* bridge */ php<?>[] typeParametersSerializers() {
        return mr10.a;
    }

    static {
        LuckyWheelTicketPushData$$serializer luckyWheelTicketPushData$$serializer = new LuckyWheelTicketPushData$$serializer();
        INSTANCE = luckyWheelTicketPushData$$serializer;
        kr10 kr10Var = new kr10("com.sporty.android.core.model.luckywheel.LuckyWheelTicketPushData", luckyWheelTicketPushData$$serializer, 4);
        kr10Var.j("userId", false);
        kr10Var.j("ticketAmount", false);
        kr10Var.j("distributionName", false);
        kr10Var.j(siPCzPFw.bZLtJ, false);
        descriptor = kr10Var;
    }
}
