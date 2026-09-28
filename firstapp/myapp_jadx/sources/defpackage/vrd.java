package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.base.deposit.DepositBaseViewModel$onAmountChanged$1", f = "DepositBaseViewModel.kt", l = {270}, m = "invokeSuspend", v = 2)
public final class vrd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ wrd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrd(CharSequence charSequence, wrd wrdVar, v1b<? super vrd> v1bVar) {
        super(2, v1bVar);
        this.b = charSequence;
        this.c = wrdVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vrd(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vrd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        boolean z = true;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(100L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        String string = StringsKt.t0(this.b.toString()).toString();
        int length = string.length();
        final wrd wrdVar = this.c;
        if (length > 0) {
            if (wrdVar.C) {
                wrdVar.O1().h(string);
            }
            wrdVar.D = null;
            l0e l0eVarO1 = wrdVar.O1();
            l0eVarO1.getClass();
            g0l g0lVarE = l0eVarO1.c().e(string);
            if (Intrinsics.g(g0lVarE, g0l.a.a)) {
                StringUiText stringUiText = vch0.a;
                stringUiText.getClass();
                qxd0<z900> qxd0VarY1 = wrdVar.y1();
                if (qxd0VarY1 != null) {
                    qxd0VarY1.a(new z900((UiText) stringUiText, false));
                }
            } else if (g0lVarE instanceof g0l.b) {
                g0l.b bVar = (g0l.b) g0lVarE;
                final wae waeVar = bVar.b;
                UiText uiText = bVar.a;
                z = waeVar != null;
                uiText.getClass();
                qxd0<z900> qxd0VarY2 = wrdVar.y1();
                if (qxd0VarY2 != null) {
                    qxd0VarY2.a(new z900(uiText, z));
                }
                if (waeVar != null) {
                    wrdVar.D = new Function0() { // from class: mrd
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            wrdVar.x1(new h000.c(waeVar));
                            return Unit.a;
                        }
                    };
                }
            } else {
                if (!Intrinsics.g(g0lVarE, g0l.c.a)) {
                    uhc.a();
                    return null;
                }
                StringUiText stringUiText2 = vch0.a;
                stringUiText2.getClass();
                qxd0<z900> qxd0VarY3 = wrdVar.y1();
                if (qxd0VarY3 != null) {
                    qxd0VarY3.a(new z900((UiText) stringUiText2, false));
                }
                if (!wrdVar.O1().a()) {
                }
                wrdVar.w2(z);
            }
            z = false;
            wrdVar.w2(z);
        } else {
            wrdVar.O1().h("");
            qxd0<z900> qxd0VarY4 = wrdVar.y1();
            if (qxd0VarY4 != null) {
                qxd0VarY4.a(new z900(3, (StringUiText) null));
            }
            wrdVar.w2(false);
        }
        return Unit.a;
    }
}
