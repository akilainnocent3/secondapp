package com.sportybet.android.globalpay.pixBtg.depositQrCode;

import com.sporty.android.core.model.pocket.banktrade.BankTradeData;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.globalpay.pixBtg.antest.BrDepositHotButtonConversionData;
import defpackage.avw;
import defpackage.c0d;
import defpackage.d0n;
import defpackage.dbk;
import defpackage.ej5;
import defpackage.f00;
import defpackage.f3k;
import defpackage.f810;
import defpackage.ib5;
import defpackage.mgk;
import defpackage.o8i0;
import defpackage.pa10;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v4c;
import defpackage.v5b;
import defpackage.v75;
import defpackage.vgb0;
import defpackage.vu60;
import defpackage.wwd0;
import defpackage.x1b;
import defpackage.xsm;
import defpackage.y5b;
import defpackage.yd10;
import defpackage.zi50;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/depositQrCode/d;", "Lavw;", "Lcom/sportybet/android/globalpay/pixBtg/depositQrCode/c;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d extends avw<c> {
    public final v75 A;
    public final String B;
    public final String C;
    public f810 D;
    public boolean E;
    public final BrDepositHotButtonConversionData F;
    public final AtomicBoolean G;
    public final vu60 e;
    public final mgk f;
    public final xsm i;
    public final d0n v;
    public final dbk w;
    public final f3k y;
    public final yd10 z;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.depositQrCode.PixBtgQrCodeViewModel$fetchDepositStatusOnce$2", f = "PixBtgQrCodeViewModel.kt", l = {210}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return d.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object value;
            Object objB;
            Object value2;
            Object objB2;
            Object value3;
            Object objB3;
            Object value4;
            Object objB4;
            d dVar = d.this;
            wwd0 wwd0Var = dVar.a;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                f3k f3kVar = dVar.y;
                String str = dVar.B;
                if (str == null) {
                    Intrinsics.n("tradeId");
                    throw null;
                }
                this.a = 1;
                objA = f3kVar.a(str, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            zi50.a aVar = zi50.b;
            if (!(objA instanceof zi50.b)) {
                int i2 = ((BankTradeData) objA).status;
                if (i2 == 10) {
                    wwd0Var.getClass();
                    do {
                        value3 = wwd0Var.getValue();
                        objB3 = (c) value3;
                        if (objB3 instanceof c.C0238c) {
                            c.C0238c c0238c = (c.C0238c) objB3;
                            objB3 = c.C0238c.b(c0238c, null, c.a.a(c0238c.e, false, false, false, false, true, 63), 15);
                        }
                    } while (!wwd0Var.g(value3, objB3));
                } else if (i2 != 20) {
                    wwd0Var.getClass();
                    do {
                        value4 = wwd0Var.getValue();
                        objB4 = (c) value4;
                        if (objB4 instanceof c.C0238c) {
                            c.C0238c c0238c2 = (c.C0238c) objB4;
                            objB4 = c.C0238c.b(c0238c2, null, c.a.a(c0238c2.e, false, false, true, false, false, 111), 15);
                        }
                    } while (!wwd0Var.g(value4, objB4));
                } else {
                    dVar.D1();
                }
            }
            if (zi50.a(objA) != null) {
                wwd0Var.getClass();
                do {
                    value2 = wwd0Var.getValue();
                    objB2 = (c) value2;
                    if (objB2 instanceof c.C0238c) {
                        c.C0238c c0238c3 = (c.C0238c) objB2;
                        objB2 = c.C0238c.b(c0238c3, null, c.a.a(c0238c3.e, false, false, false, true, false, 95), 15);
                    }
                } while (!wwd0Var.g(value2, objB2));
            }
            wwd0Var.getClass();
            do {
                value = wwd0Var.getValue();
                objB = (c) value;
                if (objB instanceof c.C0238c) {
                    c.C0238c c0238c4 = (c.C0238c) objB;
                    objB = c.C0238c.b(c0238c4, null, c.a.a(c0238c4.e, false, false, false, false, false, 123), 15);
                }
            } while (!wwd0Var.g(value, objB));
            dVar.G.set(false);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(vu60 vu60Var, mgk mgkVar, d0n d0nVar, dbk dbkVar, f3k f3kVar, yd10 yd10Var, v75 v75Var) {
        Object value;
        super(c.d.a);
        v4c v4cVar = v4c.a;
        vu60Var.getClass();
        d0nVar.getClass();
        this.e = vu60Var;
        this.f = mgkVar;
        this.i = v4cVar;
        this.v = d0nVar;
        this.w = dbkVar;
        this.y = f3kVar;
        this.z = yd10Var;
        this.A = v75Var;
        this.D = f810.c;
        this.G = new AtomicBoolean(false);
        PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams = (PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams) vu60Var.b("PIX_QR_CODE_PARAMS_KEY");
        if (pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams == null) {
            wwd0 wwd0Var = this.a;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, c.b.a));
        } else {
            this.B = pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams.a;
            this.C = pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams.b;
            this.F = pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams.e;
            ej5.c(o8i0.d(this), null, null, new g(this, pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams, null), 3);
        }
        ej5.c(o8i0.d(this), null, null, new e(this, null), 3);
    }

    public final void A1() {
        Object value;
        Object objB;
        this.G.set(true);
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        do {
            value = wwd0Var.getValue();
            objB = (c) value;
            if (objB instanceof c.C0238c) {
                c.C0238c c0238c = (c.C0238c) objB;
                c.a aVar = c0238c.e;
                aVar.getClass();
                objB = c.C0238c.b(c0238c, null, c.a.a(aVar, true, false, false, false, false, 123), 15);
            }
        } while (!wwd0Var.g(value, objB));
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object B1(PixBtgQrCodeActivity$Companion$PixBtgQrCodeParams pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams, x1b x1bVar) {
        pa10 pa10Var;
        if (x1bVar instanceof pa10) {
            pa10Var = (pa10) x1bVar;
            int i = pa10Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                pa10Var.c = i - Integer.MIN_VALUE;
            } else {
                pa10Var = new pa10(this, x1bVar);
            }
        } else {
            pa10Var = new pa10(this, x1bVar);
        }
        Object obj = pa10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = pa10Var.c;
        if (i2 != 0) {
            if (i2 == 1) {
                uj50.b(obj);
                return ((zi50) obj).a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        String str = pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams.d;
        if (str != null && !StringsKt.U(str)) {
            zi50.a aVar = zi50.b;
            return pixBtgQrCodeActivity$Companion$PixBtgQrCodeParams.d;
        }
        pa10Var.c = 1;
        Serializable serializableA = this.f.a(pa10Var);
        return serializableA == y5bVar ? y5bVar : serializableA;
    }

    public final void C1() {
        Object value;
        Object objB;
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        do {
            value = wwd0Var.getValue();
            objB = (c) value;
            if (objB instanceof c.C0238c) {
                c.C0238c c0238c = (c.C0238c) objB;
                c.a aVar = c0238c.e;
                aVar.getClass();
                objB = c.C0238c.b(c0238c, null, c.a.a(aVar, false, true, false, false, false, 119), 15);
            }
        } while (!wwd0Var.g(value, objB));
    }

    public final void D1() {
        BrDepositHotButtonConversionData brDepositHotButtonConversionData = this.F;
        if (brDepositHotButtonConversionData != null) {
            vu60 vu60Var = this.e;
            Object objB = vu60Var.b("AN_TEST_CONVERSIONS_REPORTED_KEY");
            Boolean bool = Boolean.TRUE;
            if (!Intrinsics.g(objB, bool)) {
                vu60Var.e(bool, "AN_TEST_CONVERSIONS_REPORTED_KEY");
                v75 v75Var = this.A;
                v75Var.getClass();
                v75Var.a("deposit_completed");
                if (brDepositHotButtonConversionData.a) {
                    v75Var.a("ftd_conversion");
                }
                if (brDepositHotButtonConversionData.b) {
                    v75Var.a("preset_deposit_completed");
                }
            }
        }
        f00 f00Var = vgb0.a;
        vgb0.a(AnalyticsEvent.DEPOSIT);
        x1(b.c.a);
    }

    public final void z1() {
        Object value;
        Object objB;
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        do {
            value = wwd0Var.getValue();
            objB = (c) value;
            if (objB instanceof c.C0238c) {
                c.C0238c c0238c = (c.C0238c) objB;
                c.a aVar = c0238c.e;
                aVar.getClass();
                objB = c.C0238c.b(c0238c, null, c.a.a(aVar, false, false, false, false, false, 95), 15);
            }
        } while (!wwd0Var.g(value, objB));
    }
}
