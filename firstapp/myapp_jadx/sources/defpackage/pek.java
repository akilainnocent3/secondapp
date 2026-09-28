package defpackage;

import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.domain.usecase.GetStoriesUseCase$invoke$apiStoriesFlow$1", f = "GetStoriesUseCase.kt", l = {22, 24}, m = "invokeSuspend", v = 2)
public final class pek extends tje0 implements Function2<myh<? super List<? extends Story>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ rek c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pek(rek rekVar, v1b<? super pek> v1bVar) {
        super(2, v1bVar);
        this.c = rekVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pek pekVar = new pek(this.c, v1bVar);
        pekVar.b = obj;
        return pekVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends Story>> myhVar, v1b<? super Unit> v1bVar) {
        return ((pek) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (r0.emit(r2, r10) == r1) goto L23;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r10.a
            r3 = 0
            rek r4 = r10.c
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L21
            if (r2 == r6) goto L1d
            if (r2 != r5) goto L17
            defpackage.uj50.b(r11)
            goto L77
        L17:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r10)
            return r3
        L1d:
            defpackage.uj50.b(r11)
            goto L36
        L21:
            defpackage.uj50.b(r11)
            acd0 r11 = r4.a
            r10.b = r0
            r10.a = r6
            zbd0 r2 = new zbd0
            r2.<init>(r11, r3)
            java.lang.Object r11 = defpackage.w5b.d(r2, r10)
            if (r11 != r1) goto L36
            goto L76
        L36:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r11 = r11.iterator()
        L41:
            boolean r6 = r11.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r11.next()
            r7 = r6
            com.sportybet.plugin.sportystories.domain.entity.Story r7 = (com.sportybet.plugin.sportystories.domain.entity.Story) r7
            kotlin.time.d r8 = r7.getStartTime()
            kotlin.time.d r7 = r7.getEndTime()
            us7 r9 = r4.c
            kotlin.time.d r9 = r9.a()
            int r8 = r9.compareTo(r8)
            if (r8 < 0) goto L41
            int r7 = r9.compareTo(r7)
            if (r7 > 0) goto L41
            r2.add(r6)
            goto L41
        L6c:
            r10.b = r3
            r10.a = r5
            java.lang.Object r10 = r0.emit(r2, r10)
            if (r10 != r1) goto L77
        L76:
            return r1
        L77:
            kotlin.Unit r10 = kotlin.Unit.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pek.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
