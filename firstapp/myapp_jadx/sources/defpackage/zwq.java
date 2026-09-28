package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.mynumbers.LNMyNumberViewModel$delete$1", f = "LNMyNumberViewModel.kt", l = {252, 253}, m = "invokeSuspend", v = 2)
public final class zwq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public bmd a;
    public String b;
    public int c;
    public int d;
    public final /* synthetic */ exq e;
    public final /* synthetic */ int f;

    public static final class a<T> implements myh {
        public final /* synthetic */ exq a;

        public a(exq exqVar) {
            this.a = exqVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            dvq.b bVar;
            Object value;
            ovq ovqVar;
            xwq xwqVar = (xwq) obj;
            dvq dvqVar = xwqVar.b;
            dvqVar.getClass();
            if (dvqVar.equals(dvq.a.a) || dvqVar.equals(dvq.c.a)) {
                bVar = null;
            } else {
                if (!(dvqVar instanceof dvq.b)) {
                    uhc.a();
                    return null;
                }
                bVar = (dvq.b) dvqVar;
            }
            exq exqVar = this.a;
            if (bVar != null) {
                exqVar.A.a(new pvq.b(bVar));
            }
            lk50<Unit> lk50Var = xwqVar.a;
            if (Intrinsics.g(lk50Var, lk50.b.a)) {
                wwd0 wwd0Var = exqVar.w;
                do {
                    value = wwd0Var.getValue();
                    ovq ovqVar2 = (ovq) value;
                    if (ovqVar2 != null) {
                        UiText uiText = ovqVar2.a;
                        UiText uiText2 = ovqVar2.b;
                        UiText uiText3 = ovqVar2.c;
                        evq evqVar = ovqVar2.e;
                        evq evqVar2 = ovqVar2.f;
                        evqVar2.getClass();
                        ovqVar = new ovq(uiText, uiText2, uiText3, true, evqVar, evqVar2);
                    } else {
                        ovqVar = null;
                    }
                } while (!wwd0Var.g(value, ovqVar));
            } else if (lk50Var instanceof lk50.a) {
                exqVar.w.setValue(null);
                ku90<pvq> ku90Var = exqVar.A;
                StringUiText stringUiText = vch0.a;
                ku90Var.a(new pvq.a(new nvp.j(new ResourceUiText(R.string.common_feedback__something_went_wrong_tip), false)));
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                exqVar.w.setValue(null);
                ku90<pvq> ku90Var2 = exqVar.A;
                StringUiText stringUiText2 = vch0.a;
                ku90Var2.a(new pvq.a(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__my_numbers_remove_success), false)));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwq(exq exqVar, int i, v1b<? super zwq> v1bVar) {
        super(2, v1bVar);
        this.e = exqVar;
        this.f = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zwq(this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zwq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        if (r5.collect(r11, r10) == r0) goto L16;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r10.d
            exq r2 = r10.e
            r3 = 0
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L24
            if (r1 == r5) goto L1a
            if (r1 != r4) goto L14
            defpackage.uj50.b(r11)
            goto L8f
        L14:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r3
        L1a:
            int r1 = r10.c
            java.lang.String r5 = r10.b
            bmd r6 = r10.a
            defpackage.uj50.b(r11)
            goto L48
        L24:
            defpackage.uj50.b(r11)
            bmd r6 = r2.a
            g1r r11 = r2.e
            java.lang.String r11 = r11.a
            wwd0 r1 = r2.i
            f1i r7 = new f1i
            r7.<init>(r1)
            r10.a = r6
            r10.b = r11
            int r1 = r10.f
            r10.c = r1
            r10.d = r5
            java.lang.Object r5 = defpackage.s0i.a(r7, r10)
            if (r5 != r0) goto L45
            goto L8e
        L45:
            r9 = r5
            r5 = r11
            r11 = r9
        L48:
            qxp r11 = (defpackage.qxp) r11
            qcn<tsq> r11 = r11.a
            r6.getClass()
            r5.getClass()
            r11.getClass()
            a7q r7 = r6.a
            t6q r8 = new t6q
            r8.<init>(r7, r1, r3)
            or60 r1 = new or60
            r1.<init>(r8)
            yld r7 = new yld
            r7.<init>(r1)
            yzh r1 = defpackage.bm50.a(r7)
            xld r7 = new xld
            r7.<init>(r3, r6, r5, r11)
            b77 r11 = defpackage.r0i.f(r1, r7)
            zld r1 = new zld
            r1.<init>(r4, r3)
            xzh r5 = new xzh
            r5.<init>(r11, r1)
            zwq$a r11 = new zwq$a
            r11.<init>(r2)
            r10.a = r3
            r10.b = r3
            r10.d = r4
            java.lang.Object r10 = r5.collect(r11, r10)
            if (r10 != r0) goto L8f
        L8e:
            return r0
        L8f:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
