package com.sporty.android.core.model.patron;

import defpackage.b5d;
import defpackage.dma;
import defpackage.f4g;
import defpackage.fae;
import defpackage.fma;
import defpackage.gae0;
import defpackage.hj5;
import defpackage.jtf0;
import defpackage.kr10;
import defpackage.mr10;
import defpackage.o1k;
import defpackage.okt;
import defpackage.pd80;
import defpackage.php;
import defpackage.x15;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/sporty/android/core/model/patron/LoginResponse.SelfExclusion.$serializer", "Lo1k;", "Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "<init>", "()V", "Lf4g;", "encoder", "value", "", "serialize", "(Lf4g;Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;)V", "Lb5d;", "decoder", "deserialize", "(Lb5d;)Lcom/sporty/android/core/model/patron/LoginResponse$SelfExclusion;", "", "Lphp;", "childSerializers", "()[Lphp;", "Lpd80;", "descriptor", "Lpd80;", "getDescriptor", "()Lpd80;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fae
public final /* synthetic */ class LoginResponse$SelfExclusion$$serializer implements o1k<LoginResponse.SelfExclusion> {
    public static final LoginResponse$SelfExclusion$$serializer INSTANCE;
    private static final pd80 descriptor;

    static {
        LoginResponse$SelfExclusion$$serializer loginResponse$SelfExclusion$$serializer = new LoginResponse$SelfExclusion$$serializer();
        INSTANCE = loginResponse$SelfExclusion$$serializer;
        kr10 kr10Var = new kr10("com.sporty.android.core.model.patron.LoginResponse.SelfExclusion", loginResponse$SelfExclusion$$serializer, 6);
        kr10Var.j("cooldown", false);
        kr10Var.j("endDate", false);
        kr10Var.j("selfExclusionType", false);
        kr10Var.j("remainingTimeForNextBlocking", false);
        kr10Var.j("remainingTimeForUnblocking", false);
        kr10Var.j("startDate", false);
        descriptor = kr10Var;
    }

    private LoginResponse$SelfExclusion$$serializer() {
    }

    @Override // defpackage.o1k
    public final php<?>[] childSerializers() {
        php<?> phpVarA = hj5.a(gae0.a);
        okt oktVar = okt.a;
        return new php[]{x15.a, oktVar, phpVarA, oktVar, oktVar, oktVar};
    }

    @Override // defpackage.tae
    public final LoginResponse.SelfExclusion deserialize(b5d decoder) {
        decoder.getClass();
        pd80 pd80Var = descriptor;
        dma dmaVarC = decoder.c(pd80Var);
        int i = 0;
        boolean zE = false;
        long jR = 0;
        long jR2 = 0;
        long jR3 = 0;
        long jR4 = 0;
        String str = null;
        boolean z = true;
        while (z) {
            int iV = dmaVarC.v(pd80Var);
            switch (iV) {
                case -1:
                    z = false;
                    break;
                case 0:
                    zE = dmaVarC.E(pd80Var, 0);
                    i |= 1;
                    break;
                case 1:
                    jR = dmaVarC.r(pd80Var, 1);
                    i |= 2;
                    break;
                case 2:
                    str = (String) dmaVarC.n(pd80Var, 2, gae0.a, str);
                    i |= 4;
                    break;
                case 3:
                    jR2 = dmaVarC.r(pd80Var, 3);
                    i |= 8;
                    break;
                case 4:
                    jR3 = dmaVarC.r(pd80Var, 4);
                    i |= 16;
                    break;
                case 5:
                    jR4 = dmaVarC.r(pd80Var, 5);
                    i |= 32;
                    break;
                default:
                    jtf0.a(iV);
                    return null;
            }
        }
        dmaVarC.b(pd80Var);
        return new LoginResponse.SelfExclusion(i, zE, jR, str, jR2, jR3, jR4, null);
    }

    @Override // defpackage.he80, defpackage.tae
    public final pd80 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.he80
    public final void serialize(f4g encoder, LoginResponse.SelfExclusion value) {
        encoder.getClass();
        value.getClass();
        pd80 pd80Var = descriptor;
        fma fmaVarC = encoder.c(pd80Var);
        LoginResponse.SelfExclusion.write$Self$model(value, fmaVarC, pd80Var);
        fmaVarC.b(pd80Var);
    }

    @Override // defpackage.o1k
    public /* bridge */ php<?>[] typeParametersSerializers() {
        return mr10.a;
    }
}
