package defpackage;

import android.content.Context;
import com.sporty.android.common_ui.uitext.UiText;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class w900 {
    public final Context a;
    public final y900 b;
    public final c0e c;
    public f600 d;
    public ArrayList e;
    public et7 f;
    public jvd0 g;

    @c0d(c = "com.sportybet.android.globalpay.paymentproviders.PaymentTabSelectionAnalyticsDelegate$lastPaymentTabSelectionEventToReport$1", f = "PaymentTabSelectionAnalyticsDelegate.kt", l = {57}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ x900 b;
        public final /* synthetic */ w900 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x900 x900Var, w900 w900Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = x900Var;
            this.c = w900Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
            String str = this.b.a;
            itf0.a aVar = itf0.a;
            aVar.a(yv0.a(aVar, "DepositTabSelection", "sendEvent tabName = ", str), new Object[0]);
            w900 w900Var = this.c;
            y900 y900Var = w900Var.b;
            f600 f600Var = w900Var.d;
            rdd0 rdd0Var = y900Var.a;
            str.getClass();
            if (f600Var != null) {
                int iOrdinal = f600Var.ordinal();
                if (iOrdinal == 0) {
                    pnd pndVar = new pnd(str);
                    k00 k00Var = k00.d;
                    rdd0Var.a(pndVar, k00Var);
                    if (y900Var.b.O()) {
                        rdd0Var.a(new nnd(str), k00Var);
                    }
                } else {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return null;
                    }
                    rdd0Var.a(new ahj0(str), k00.d);
                }
            }
            w900Var.c.b();
            return Unit.a;
        }
    }

    public w900(Context context, y900 y900Var, c0e c0eVar) {
        y900Var.getClass();
        c0eVar.getClass();
        this.a = context;
        this.b = y900Var;
        this.c = c0eVar;
    }

    public final void a(int i, int i2) {
        o800 o800Var;
        itf0.a aVar = itf0.a;
        aVar.q("DepositTabSelection");
        aVar.a("onSelectedFromOuterTabs: outerTabIndex: " + i + ", innerTabIndex:" + i2, new Object[0]);
        ArrayList arrayList = this.e;
        if (arrayList == null || (o800Var = (o800) CollectionsKt.V(i, arrayList)) == null) {
            aVar.q("DepositTabSelection");
            aVar.a("onSelectedFromOuterTabs: outer tab not found", new Object[0]);
            return;
        }
        UiText uiText = o800Var.a;
        Context context = this.a;
        String string = uiText.e(context).toString();
        o800.a aVar2 = (o800.a) CollectionsKt.V(i2, o800Var.b.a);
        String string2 = aVar2 != null ? aVar2.a.e(context).toString() : null;
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() != 0) {
            string = string2;
        }
        b(new x900(string));
    }

    public final void b(x900 x900Var) {
        jvd0 jvd0Var = this.g;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        et7 et7Var = this.f;
        this.g = et7Var != null ? ej5.c(et7Var, null, null, new a(x900Var, this, null), 3) : null;
    }
}
