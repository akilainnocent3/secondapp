package defpackage;

import com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout$hidePop$1$1", f = "InstantWinFooterLayout.kt", l = {871, 873}, m = "invokeSuspend", v = 2)
public final class dfo extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ InstantWinFooterLayout b;
    public final /* synthetic */ seo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfo(InstantWinFooterLayout instantWinFooterLayout, seo seoVar, v1b<? super dfo> v1bVar) {
        super(2, v1bVar);
        this.b = instantWinFooterLayout;
        this.c = seoVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dfo(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dfo) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r7.a.putBoolean("instant_virtual_flex_bet", r1, r6) == r0) goto L17;
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
            java.lang.String r2 = "instant_virtual_flex_bet"
            com.sportybet.android.virtual.presentation.widget.InstantWinFooterLayout r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L14
            defpackage.uj50.b(r7)
            goto L57
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L1b:
            defpackage.uj50.b(r7)
            goto L33
        L1f:
            defpackage.uj50.b(r7)
            m2l r7 = r3.getDataStore()
            eo20[] r1 = defpackage.eo20.a
            r6.a = r5
            zed r7 = r7.a
            java.lang.Object r7 = r7.getBoolean(r2, r5, r6)
            if (r7 != r0) goto L33
            goto L56
        L33:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L57
            seo r7 = r6.c
            com.sportybet.android.widget.BubbleView r7 = r7.B
            r1 = 8
            r7.setVisibility(r1)
            m2l r7 = r3.getDataStore()
            eo20[] r1 = defpackage.eo20.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r6.a = r4
            zed r7 = r7.a
            java.lang.Object r6 = r7.putBoolean(r2, r1, r6)
            if (r6 != r0) goto L57
        L56:
            return r0
        L57:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dfo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
