package com.sportybet.android.globalpay.pixBtg.depositQrCode;

import defpackage.c0d;
import defpackage.ej5;
import defpackage.fsa0;
import defpackage.hkd;
import defpackage.ib5;
import defpackage.s9e0;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.wwd0;
import defpackage.y5b;
import defpackage.zi50;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeViewModel$initializeRequiredData$2", f = "PixBtgQrCodeViewModel.kt", l = {131}, m = "invokeSuspend", v = 2)
public final class g extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d c;
    public final /* synthetic */ PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams d;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeViewModel$initializeRequiredData$2$2$1", f = "PixBtgQrCodeViewModel.kt", l = {143}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ d b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = dVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(500L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            this.b.x1(b.a.a);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams, v1b<? super g> v1bVar) {
        super(2, v1bVar);
        this.c = dVar;
        this.d = pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g gVar = new g(this.c, this.d, v1bVar);
        gVar.b = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object objB1;
        Object value;
        String strD;
        String strP;
        String str;
        Object value2;
        d dVar = this.c;
        wwd0 wwd0Var = dVar.a;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams = this.d;
        if (i == 0) {
            uj50.b(obj);
            this.b = v5bVar;
            this.a = 1;
            objB1 = dVar.B1(pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams, this);
            if (objB1 == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            objB1 = ((zi50) obj).a;
        }
        if (zi50.a(objB1) != null) {
            do {
                value2 = wwd0Var.getValue();
            } while (!wwd0Var.g(value2, c.b.a));
            return Unit.a;
        }
        if (!(objB1 instanceof zi50.b)) {
            String str2 = (String) objB1;
            ej5.c(v5bVar, null, null, new a(dVar, null), 3);
            double d = Double.parseDouble(pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams.c) / 10000.0d;
            do {
                value = wwd0Var.getValue();
                str2.getClass();
                strD = fsa0.d(3, 2, str2);
                s9e0 s9e0Var = s9e0.a;
                String strI = dVar.i.i(d, false);
                s9e0Var.getClass();
                strP = kotlin.text.c.p(strI, " ", "", false);
                String strValueOf = String.valueOf(dVar.D.b / 1000);
                if ((24 & 1) != 0) {
                    strD = "";
                }
                if ((2 & 24) != 0) {
                    strP = "";
                }
                str = (24 & 4) != 0 ? "" : strValueOf;
            } while (!wwd0Var.g(value, new c.C0238c(strD, strP, str, false, new c.a(127))));
        }
        return Unit.a;
    }
}
