package com.sporty.android.platform.features.security.newdevicelogin.loginalert;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import defpackage.bm50;
import defpackage.c0d;
import defpackage.ib5;
import defpackage.ku90;
import defpackage.lk50;
import defpackage.myh;
import defpackage.tje0;
import defpackage.uj50;
import defpackage.v1b;
import defpackage.v5b;
import defpackage.vch0;
import defpackage.x1b;
import defpackage.x5a0;
import defpackage.y5b;
import defpackage.yzh;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertViewModel$logoutAllDevices$1", f = "LoginAlertViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ g b;

    public static final class a<T> implements myh {
        public final /* synthetic */ g a;

        /* JADX INFO: renamed from: com.sporty.android.platform.features.security.newdevicelogin.loginalert.f$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.security.newdevicelogin.loginalert.LoginAlertViewModel$logoutAllDevices$1$1", f = "LoginAlertViewModel.kt", l = {74}, m = "emit", v = 2)
        public static final class C0212a extends x1b {
            public g a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0212a(a<? super T> aVar, v1b<? super C0212a> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        public a(g gVar) {
            this.a = gVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(lk50<Unit> lk50Var, v1b<? super Unit> v1bVar) {
            C0212a c0212a;
            g gVar;
            d aVar;
            if (v1bVar instanceof C0212a) {
                c0212a = (C0212a) v1bVar;
                int i = c0212a.d;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0212a.d = i - Integer.MIN_VALUE;
                } else {
                    c0212a = new C0212a(this, v1bVar);
                }
            } else {
                c0212a = new C0212a(this, v1bVar);
            }
            Object obj = c0212a.b;
            y5b y5bVar = y5b.a;
            int i2 = c0212a.d;
            if (i2 == 0) {
                uj50.b(obj);
                boolean z = lk50Var instanceof lk50.c;
                gVar = this.a;
                if (z) {
                    LastLoginDeviceInfo lastLoginDeviceInfo = gVar.d;
                    if (lastLoginDeviceInfo != null) {
                        ku90<b> ku90Var = gVar.f;
                        b.C0210b c0210b = new b.C0210b(lastLoginDeviceInfo);
                        c0212a.a = gVar;
                        c0212a.d = 1;
                        if (ku90Var.a.emit(c0210b, c0212a) == y5bVar) {
                            return y5bVar;
                        }
                    }
                } else if (lk50Var instanceof lk50.a) {
                    Throwable th = ((lk50.a) lk50Var).a;
                    aVar = th instanceof SprThrowable ? new d.a(new StringUiText(((SprThrowable) th).getE())) : new d.a(vch0.b);
                } else {
                    aVar = d.c.a;
                }
                ((x5a0) gVar.e).setValue(aVar);
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gVar = c0212a.a;
            uj50.b(obj);
            aVar = d.b.a;
            ((x5a0) gVar.e).setValue(aVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, v1b<? super f> v1bVar) {
        super(2, v1bVar);
        this.b = gVar;
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
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            g gVar = this.b;
            yzh yzhVarA = bm50.a(gVar.a.X());
            a aVar = new a(gVar);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
