package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.historydetail.presentation.LNHistoryDetailViewModel$deleteOrder$2", f = "LNHistoryDetailViewModel.kt", l = {104, 108}, m = "invokeSuspend", v = 2)
public final class gjq extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kjq c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gjq(kjq kjqVar, String str, v1b<? super gjq> v1bVar) {
        super(2, v1bVar);
        this.c = kjqVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gjq gjqVar = new gjq(this.c, this.d, v1bVar);
        gjqVar.b = obj;
        return gjqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((gjq) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (kotlin.Unit.a == r3) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (kotlin.Unit.a == r3) goto L20;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kjq r0 = r8.c
            ku90<lhq> r1 = r0.B
            wwd0 r0 = r0.v
            java.lang.Object r2 = r8.b
            lk50 r2 = (defpackage.lk50) r2
            y5b r3 = defpackage.y5b.a
            int r4 = r8.a
            r5 = 1
            r6 = 2
            r7 = 0
            if (r4 == 0) goto L25
            if (r4 == r5) goto L21
            if (r4 != r6) goto L1b
            defpackage.uj50.b(r9)
            goto L89
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r7
        L21:
            defpackage.uj50.b(r9)
            goto L3a
        L25:
            defpackage.uj50.b(r9)
            boolean r9 = r2 instanceof lk50.a
            if (r9 == 0) goto L4f
            chq$a r9 = chq.a.a
            r8.b = r7
            r8.a = r5
            r0.setValue(r9)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r3) goto L3a
            goto L64
        L3a:
            lhq$b r8 = new lhq$b
            com.sporty.android.common_ui.uitext.StringUiText r9 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r9 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r0 = 2132022376(0x7f141468, float:1.968317E38)
            r9.<init>(r0)
            r8.<init>(r9)
            b390 r9 = r1.a
            r9.a(r8)
            goto L89
        L4f:
            lk50$b r9 = lk50.b.a
            boolean r9 = kotlin.jvm.internal.Intrinsics.g(r2, r9)
            if (r9 == 0) goto L65
            c5q$a r9 = c5q.a.a
            r8.b = r7
            r8.a = r6
            r0.setValue(r9)
            kotlin.Unit r8 = kotlin.Unit.a
            if (r8 != r3) goto L89
        L64:
            return r3
        L65:
            boolean r9 = r2 instanceof lk50.c
            if (r9 == 0) goto L8c
            nvp$f r9 = new nvp$f
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r2 = "lucky_number_deleted_order"
            java.lang.String r8 = r8.d
            r0.<init>(r2, r8)
            kotlin.Pair[] r8 = new kotlin.Pair[]{r0}
            uf00 r8 = defpackage.a4h.a(r8)
            r9.<init>(r6, r8)
            lhq$a r8 = new lhq$a
            r8.<init>(r9)
            r1.a(r8)
            kotlin.Unit r8 = kotlin.Unit.a
        L89:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        L8c:
            defpackage.uhc.a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gjq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
