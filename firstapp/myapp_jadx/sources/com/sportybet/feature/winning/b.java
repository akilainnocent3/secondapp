package com.sportybet.feature.winning;

import com.sporty.android.core.model.MyLog;
import defpackage.c0d;
import defpackage.e1i;
import defpackage.ej5;
import defpackage.h990;
import defpackage.i2i;
import defpackage.ib5;
import defpackage.ib90;
import defpackage.itf0;
import defpackage.j8i0;
import defpackage.lj7;
import defpackage.mwd0;
import defpackage.o8i0;
import defpackage.osa0;
import defpackage.p9j0;
import defpackage.r5b;
import defpackage.tje0;
import defpackage.u350;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v340;
import defpackage.v5b;
import defpackage.wm20;
import defpackage.wwd0;
import defpackage.xwd0;
import defpackage.y5b;
import java.io.File;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/winning/b;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b extends j8i0 {
    public final p9j0 a;
    public final lj7 b;
    public final u350 c;
    public final wwd0 d;
    public final v340 e;
    public final wwd0 f;
    public final r5b i;

    @c0d(c = "com.sportybet.feature.winning.WinningViewModel$1", f = "WinningViewModel.kt", l = {35}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return b.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            com.sportybet.feature.winning.a aVar;
            y5b y5bVar = y5b.a;
            int i = this.a;
            boolean z = false;
            b bVar = b.this;
            if (i == 0) {
                uj50.b(obj);
                p9j0 p9j0Var = bVar.a;
                wm20 wm20VarA = p9j0Var.b.a(p9j0Var, p9j0.c[0]);
                this.a = 1;
                obj = wm20VarA.f(this);
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
            Boolean bool = (Boolean) obj;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (((Boolean) bVar.f.getValue()).booleanValue()) {
                File fileA = bVar.b.a.a();
                boolean zExists = fileA.exists();
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_WINNING_POPUP);
                aVar2.a("WinningPopupSound: path=" + fileA.getAbsolutePath() + ", exists=" + zExists, new Object[0]);
                if (zExists) {
                    z = true;
                }
            }
            wwd0 wwd0Var = bVar.d;
            do {
                value = wwd0Var.getValue();
                aVar = (com.sportybet.feature.winning.a) value;
                aVar.a.getClass();
            } while (!wwd0Var.g(value, com.sportybet.feature.winning.a.a(aVar, new com.sportybet.feature.winning.a.C0417a(!zBooleanValue, z), false, false, false, 30)));
            return Unit.a;
        }
    }

    public b(ib90 ib90Var, p9j0 p9j0Var, lj7 lj7Var, u350 u350Var) {
        u350Var.getClass();
        this.a = p9j0Var;
        this.b = lj7Var;
        this.c = u350Var;
        wwd0 wwd0VarA = xwd0.a(new com.sportybet.feature.winning.a(0));
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        this.f = xwd0.a(Boolean.FALSE);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        this.i = i2i.c(e1i.e(ib90Var.a(h990.RATINGS), o8i0.d(this), new mwd0(0L, Long.MAX_VALUE), Boolean.TRUE), null, 3);
    }

    public final void x1(boolean z) {
        wwd0 wwd0Var;
        Object value;
        com.sportybet.feature.winning.a aVar;
        boolean z2;
        osa0.a(z, this.f, null);
        do {
            wwd0Var = this.d;
            value = wwd0Var.getValue();
            aVar = (com.sportybet.feature.winning.a) value;
            com.sportybet.feature.winning.a.C0417a c0417a = aVar.a;
            z2 = c0417a.a;
            c0417a.getClass();
        } while (!wwd0Var.g(value, com.sportybet.feature.winning.a.a(aVar, new com.sportybet.feature.winning.a.C0417a(z2, z), false, false, false, 30)));
    }
}
