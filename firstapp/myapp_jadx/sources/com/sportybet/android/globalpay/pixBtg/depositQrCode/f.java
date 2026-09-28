package com.sportybet.android.globalpay.pixBtg.depositQrCode;

import defpackage.c0d;
import defpackage.f810;
import defpackage.ib5;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.yd10;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeViewModel$initDepositPollingIfNotRunning$3", f = "PixBtgQrCodeViewModel.kt", l = {186}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.b = dVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object objB;
        Object value2;
        Object objB2;
        Object value3;
        Object objB3;
        d dVar = this.b;
        wwd0 wwd0Var = dVar.a;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            yd10 yd10Var = dVar.z;
            f810 f810Var = dVar.D;
            String str = dVar.B;
            if (str == null) {
                Intrinsics.n("tradeId");
                throw null;
            }
            this.a = 1;
            obj = yd10Var.b(f810Var, str, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int iOrdinal = ((yd10.a) obj).ordinal();
        if (iOrdinal == 0) {
            dVar.D1();
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                wwd0Var.getClass();
                do {
                    value2 = wwd0Var.getValue();
                    objB2 = (c) value2;
                    if (objB2 instanceof c.C0238c) {
                        c.C0238c c0238c = (c.C0238c) objB2;
                        objB2 = c.C0238c.b(c0238c, null, c.a.a(c0238c.e, false, false, true, false, false, 111), 15);
                    }
                } while (!wwd0Var.g(value2, objB2));
            } else {
                if (iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                wwd0Var.getClass();
                do {
                    value3 = wwd0Var.getValue();
                    objB3 = (c) value3;
                    if (objB3 instanceof c.C0238c) {
                        c.C0238c c0238c2 = (c.C0238c) objB3;
                        objB3 = c.C0238c.b(c0238c2, null, c.a.a(c0238c2.e, false, false, false, true, false, 95), 15);
                    }
                } while (!wwd0Var.g(value3, objB3));
            }
        }
        wwd0Var.getClass();
        do {
            value = wwd0Var.getValue();
            objB = (c) value;
            if (objB instanceof c.C0238c) {
                c.C0238c c0238c3 = (c.C0238c) objB;
                objB = c.C0238c.b(c0238c3, null, c.a.a(c0238c3.e, false, false, false, false, false, 123), 15);
            }
        } while (!wwd0Var.g(value, objB));
        dVar.G.set(false);
        return Unit.a;
    }
}
