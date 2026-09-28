package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$processRewardDataUriShowOff$1", f = "FootballViewModel.kt", l = {398, 408}, m = "invokeSuspend", v = 2)
public final class eni extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ dni b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eni(dni dniVar, String str, v1b<? super eni> v1bVar) {
        super(2, v1bVar);
        this.b = dniVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new eni(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((eni) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        if (r5.C1(r1, r7, r6) == r0) goto L33;
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
            r2 = 2
            r3 = 1
            r4 = 0
            dni r5 = r6.b
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L16
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L14
            goto La5
        L14:
            r6 = move-exception
            goto L72
        L16:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r4
        L1c:
            defpackage.uj50.b(r7)     // Catch: java.lang.Throwable -> L14
            goto L3c
        L20:
            defpackage.uj50.b(r7)
            wwd0 r7 = r5.I
            plh0$c r1 = plh0.c.a
            r7.setValue(r1)
            java.lang.String r7 = r6.c     // Catch: java.lang.Throwable -> L14
            odd r1 = r5.c     // Catch: java.lang.Throwable -> L14
            r6.a = r3     // Catch: java.lang.Throwable -> L14
            kmw r3 = new kmw     // Catch: java.lang.Throwable -> L14
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L14
            java.lang.Object r7 = defpackage.ej5.d(r1, r3, r6)     // Catch: java.lang.Throwable -> L14
            if (r7 != r0) goto L3c
            goto L6e
        L3c:
            okhttp3.MultipartBody$Part r7 = (okhttp3.MultipartBody.Part) r7     // Catch: java.lang.Throwable -> L14
            wwd0 r1 = r5.D     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            boolean r3 = r1 instanceof smi.a     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L49
            r1 = r4
        L49:
            smi$a r1 = (smi.a) r1     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L51
            com.sporty.android.core.model.loyalty.RewardShowOffData r1 = r1.e     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L62
        L51:
            wwd0 r1 = r5.D     // Catch: java.lang.Throwable -> L14
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L14
            boolean r3 = r1 instanceof smi.c     // Catch: java.lang.Throwable -> L14
            if (r3 != 0) goto L5c
            r1 = r4
        L5c:
            smi$c r1 = (smi.c) r1     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L6f
            com.sporty.android.core.model.loyalty.RewardShowOffData r1 = r1.b     // Catch: java.lang.Throwable -> L14
        L62:
            java.lang.String r1 = r1.getBatchId()     // Catch: java.lang.Throwable -> L14
            r6.a = r2     // Catch: java.lang.Throwable -> L14
            java.lang.Object r6 = r5.C1(r1, r7, r6)     // Catch: java.lang.Throwable -> L14
            if (r6 != r0) goto La5
        L6e:
            return r0
        L6f:
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L14
            return r6
        L72:
            itf0$a r7 = defpackage.itf0.a
            r7.e(r6)
            wwd0 r7 = r5.I
            plh0$b r0 = new plh0$b
            r0.<init>(r6)
            r7.getClass()
            r7.k(r4, r0)
            wwd0 r6 = r5.D
        L86:
            java.lang.Object r7 = r6.getValue()
            r0 = r7
            smi r0 = (defpackage.smi) r0
            boolean r1 = r0 instanceof smi.c
            if (r1 != 0) goto L93
            r1 = r4
            goto L94
        L93:
            r1 = r0
        L94:
            smi$c r1 = (smi.c) r1
            if (r1 == 0) goto L9f
            uxs r0 = defpackage.uxs.ENABLE
            r2 = 3
            smi$c r0 = smi.c.a(r1, r4, r0, r2)
        L9f:
            boolean r7 = r6.g(r7, r0)
            if (r7 == 0) goto L86
        La5:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eni.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
