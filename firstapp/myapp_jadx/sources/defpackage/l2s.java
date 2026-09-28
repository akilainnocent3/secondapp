package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.LeaderboardViewModelKt$buildTimeBadgeFlow$3", f = "LeaderboardViewModel.kt", l = {202, 204}, m = "invokeSuspend", v = 2)
public final class l2s extends tje0 implements Function2<myh<? super UiText>, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0<Long> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2s(long j, Function0<Long> function0, v1b<? super l2s> v1bVar) {
        super(2, v1bVar);
        this.d = j;
        this.e = function0;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        l2s l2sVar = new l2s(this.d, this.e, v1bVar);
        l2sVar.c = obj;
        return l2sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super UiText> myhVar, v1b<? super Unit> v1bVar) {
        return ((l2s) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:13:0x002b  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e A[PHI: r5
      0x005e: PHI (r5v2 long) = (r5v1 long), (r5v3 long) binds: [B:14:0x005b, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0078 -> B:11:0x0021). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r9.b
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 == r4) goto L18
            if (r2 != r3) goto L11
            goto L1e
        L11:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r9)
            r9 = 0
            return r9
        L18:
            long r5 = r9.a
            defpackage.uj50.b(r10)
            goto L5e
        L1e:
            defpackage.uj50.b(r10)
        L21:
            kotlin.coroutines.CoroutineContext r10 = r9.getContext()
            boolean r10 = defpackage.i9p.h(r10)
            if (r10 == 0) goto L7b
            kotlin.jvm.functions.Function0<java.lang.Long> r10 = r9.e
            java.lang.Object r10 = r10.invoke()
            java.lang.Number r10 = (java.lang.Number) r10
            long r5 = r10.longValue()
            long r7 = r9.d
            long r5 = r7 - r5
            com.sporty.android.common_ui.uitext.ConcatUiText r10 = defpackage.w250.b(r5)
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
            java.util.List r10 = defpackage.ay0.S(r10)
            r7 = 2132022013(0x7f1412fd, float:1.9682434E38)
            r2.<init>(r7, r10)
            r9.c = r0
            r9.a = r5
            r9.b = r4
            java.lang.Object r10 = r0.emit(r2, r9)
            if (r10 != r1) goto L5e
            goto L7a
        L5e:
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L7b
            kotlin.time.b$a r10 = kotlin.time.b.b
            r7 = 1000(0x3e8, double:4.94E-321)
            rgf r10 = defpackage.rgf.MILLISECONDS
            long r7 = kotlin.time.c.i(r7, r10)
            r9.c = r0
            r9.a = r5
            r9.b = r3
            java.lang.Object r10 = defpackage.hkd.c(r7, r9)
            if (r10 != r1) goto L21
        L7a:
            return r1
        L7b:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l2s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
