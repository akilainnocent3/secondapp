package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntranceFromButton;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsyp;", "Lj8i0;", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class syp extends j8i0 {
    public final odd a;
    public final wwd0 b;
    public final wwd0 c;
    public final ku90<akq> d;
    public final wwd0 e;
    public final v340 f;
    public final ku90<njq> i;
    public final v340 v;

    @c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$handleAction$1", f = "LNBetHistoryViewModel.kt", l = {131, 132}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return syp.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
        
            if (kotlin.Unit.a == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r6.a
                r2 = 0
                r3 = 2
                r4 = 1
                syp r5 = defpackage.syp.this
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                defpackage.uj50.b(r7)
                goto L3f
            L13:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r6)
                return r2
            L19:
                defpackage.uj50.b(r7)
                goto L31
            L1d:
                defpackage.uj50.b(r7)
                wwd0 r7 = r5.c
                ojq r1 = defpackage.ojq.SETTLED
                r6.a = r4
                r7.getClass()
                r7.k(r2, r1)
                kotlin.Unit r7 = kotlin.Unit.a
                if (r7 != r0) goto L31
                goto L3e
            L31:
                wwd0 r7 = r5.e
                rjq$a r1 = rjq.a.a
                r6.a = r3
                r7.setValue(r1)
                kotlin.Unit r6 = kotlin.Unit.a
                if (r6 != r0) goto L3f
            L3e:
                return r0
            L3f:
                ojq r6 = defpackage.ojq.SETTLED
                r5.y1(r6)
                kotlin.Unit r6 = kotlin.Unit.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: syp.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @c0d(c = "com.sportybet.feature.luckynumber.bethistory.presentation.LNBetHistoryViewModel$handleAction$2", f = "LNBetHistoryViewModel.kt", l = {137, 138}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ tgq c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(tgq tgqVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.c = tgqVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return syp.this.new b(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (kotlin.Unit.a == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 0
                tgq r3 = r7.c
                r4 = 2
                r5 = 1
                syp r6 = defpackage.syp.this
                if (r1 == 0) goto L1f
                if (r1 == r5) goto L1b
                if (r1 != r4) goto L15
                defpackage.uj50.b(r8)
                goto L44
            L15:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r2
            L1b:
                defpackage.uj50.b(r8)
                goto L36
            L1f:
                defpackage.uj50.b(r8)
                wwd0 r8 = r6.c
                r1 = r3
                tgq$k r1 = (tgq.k) r1
                ojq r1 = r1.a
                r7.a = r5
                r8.getClass()
                r8.k(r2, r1)
                kotlin.Unit r8 = kotlin.Unit.a
                if (r8 != r0) goto L36
                goto L43
            L36:
                wwd0 r8 = r6.e
                rjq$a r1 = rjq.a.a
                r7.a = r4
                r8.setValue(r1)
                kotlin.Unit r7 = kotlin.Unit.a
                if (r7 != r0) goto L44
            L43:
                return r0
            L44:
                tgq$k r3 = (tgq.k) r3
                ojq r7 = r3.a
                r6.y1(r7)
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: syp.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public syp(i6u i6uVar, m3k m3kVar, rdd0 rdd0Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        i6uVar.getClass();
        rdd0Var.getClass();
        this.a = oddVar;
        n1a0 n1a0Var = n1a0.c;
        wwd0 wwd0VarA = xwd0.a(n1a0Var);
        this.b = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(ojq.ALL);
        this.c = wwd0VarA2;
        ku90<akq> ku90Var = new ku90<>();
        this.d = ku90Var;
        wwd0 wwd0VarA3 = xwd0.a(rjq.a.a);
        this.e = wwd0VarA3;
        v340 v340VarZ1 = z1(new n1i(wwd0VarA2, wwd0VarA3, new uyp(3, null)), new pjq(0));
        v340 v340VarZ2 = z1(new n1i(wwd0VarA2, wwd0VarA3, new wyp(3, null)), new pjq(0));
        this.f = z1(i6uVar.k.d, n1a0Var);
        v340 v340VarZ3 = z1(new n1i(new or60(new k3k(ku90Var, m3kVar, null)), wwd0VarA, new typ(3, null)), qxq.d.a);
        this.i = new ku90<>();
        this.v = z1(r1i.b(v340VarZ1, v340VarZ2, wwd0VarA3, v340VarZ3, new vyp(5, null)), new qyp(0));
        djr.a(rdd0Var, cjr.c.a);
        kzh.d(ozh.c(new g1i(wwd0VarA2, new ryp(this, null)), oddVar), o8i0.d(this));
    }

    public final void x1(tgq tgqVar) {
        Object value;
        ArrayList arrayListC0;
        tgqVar.getClass();
        boolean zEquals = tgqVar.equals(tgq.h.a);
        wwd0 wwd0Var = this.c;
        wwd0 wwd0Var2 = this.e;
        LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton = null;
        if (zEquals) {
            ojq ojqVar = (ojq) wwd0Var.getValue();
            ojqVar.getClass();
            rjq.b bVar = new rjq.b(a4h.a(acr.a(ojq.SETTLED, ojqVar), acr.a(ojq.UNSETTLED, ojqVar), acr.a(ojq.ALL, ojqVar)));
            wwd0Var2.getClass();
            wwd0Var2.k(null, bVar);
            return;
        }
        if (tgqVar.equals(tgq.i.a)) {
            ojq ojqVar2 = (ojq) wwd0Var.getValue();
            ojqVar2.getClass();
            rjq.d dVar = new rjq.d(a4h.a(tjr.a(ojq.SETTLED_WIN, ojqVar2), tjr.a(ojq.SETTLED_LOSE, ojqVar2), tjr.a(ojq.SETTLED_VOID, ojqVar2), qjq.a.a));
            wwd0Var2.getClass();
            wwd0Var2.k(null, dVar);
            return;
        }
        if (tgqVar.equals(tgq.b.a)) {
            ej5.c(o8i0.d(this), null, null, new a(null), 3);
            return;
        }
        if (tgqVar instanceof tgq.k) {
            ej5.c(o8i0.d(this), null, null, new b(tgqVar, null), 3);
            return;
        }
        if (tgqVar.equals(tgq.c.a)) {
            wwd0Var2.setValue(rjq.a.a);
            return;
        }
        if (tgqVar.equals(tgq.e.a)) {
            this.d.a(akq.a.a);
            return;
        }
        if (tgqVar.equals(tgq.f.a)) {
            y1((ojq) wwd0Var.getValue());
            return;
        }
        boolean zEquals2 = tgqVar.equals(tgq.a.a);
        ku90<njq> ku90Var = this.i;
        if (zEquals2) {
            ku90Var.a(new njq.a(new nvp.f(3, (uf00) null)));
            return;
        }
        if (tgqVar instanceof tgq.g) {
            ku90Var.a(new njq.a(new nvp.c(new h8r(((tgq.g) tgqVar).a, true))));
            return;
        }
        if (!(tgqVar instanceof tgq.j)) {
            if (!(tgqVar instanceof tgq.d)) {
                uhc.a();
                return;
            }
            String str = ((tgq.d) tgqVar).a;
            wwd0 wwd0Var3 = this.b;
            if (((qcn) wwd0Var3.getValue()).contains(str)) {
                return;
            }
            do {
                value = wwd0Var3.getValue();
                arrayListC0 = CollectionsKt.C0((qcn) value);
                arrayListC0.add(str);
            } while (!wwd0Var3.g(value, a4h.f(arrayListC0)));
            StringUiText stringUiText = vch0.a;
            ku90Var.a(new njq.c(new ResourceUiText(R.string.page_lucky_numbers__delete_ticket_succeed)));
            return;
        }
        Iterable iterable = (Iterable) this.f.a.getValue();
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                tgq.j jVar = (tgq.j) tgqVar;
                if (Intrinsics.g(((dsq) it.next()).a, jVar.a)) {
                    String str2 = jVar.a;
                    LNPlaceBetEntrance lNPlaceBetEntrance = LNPlaceBetEntrance.HISTORY;
                    int iOrdinal = jVar.c.ordinal();
                    if (iOrdinal == 1) {
                        lNPlaceBetEntranceFromButton = LNPlaceBetEntranceFromButton.RE_BET_WIN;
                    } else if (iOrdinal == 2) {
                        lNPlaceBetEntranceFromButton = LNPlaceBetEntranceFromButton.RE_BET_LOST;
                    } else if (iOrdinal == 3) {
                        lNPlaceBetEntranceFromButton = LNPlaceBetEntranceFromButton.RE_BET_VOID;
                    }
                    ku90Var.a(new njq.a(new nvp.c(new q8r(str2, lNPlaceBetEntrance, null, lNPlaceBetEntranceFromButton, null, jVar.b, 52))));
                    return;
                }
            }
        }
        StringUiText stringUiText2 = vch0.a;
        ku90Var.a(new njq.a(new nvp.j(new ResourceUiText(R.string.page_lucky_numbers__draw_is_currently_unavailable), false)));
    }

    public final void y1(ojq ojqVar) {
        this.d.a(new akq.b(ojqVar));
        this.i.a(njq.b.a);
    }

    public final v340 z1(lyh lyhVar, Object obj) {
        return e1i.e(ozh.c(lyhVar, this.a), o8i0.d(this), q490.a.a, obj);
    }
}
