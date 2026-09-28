package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$LNGroupTab$1$1", f = "LNGroupTab.kt", l = {73, 74}, m = "invokeSuspend", v = 2)
public final class fgq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ zzr c;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNGroupTabKt$LNGroupTab$1$1$2", f = "LNGroupTab.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
        public /* synthetic */ boolean a;

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(2, v1bVar);
            aVar.a = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgq(int i, v1b v1bVar, zzr zzrVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = zzrVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fgq(this.b, v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((fgq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (defpackage.egq.d(r3, r4, r7) == r0) goto L19;
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
            zzr r3 = r7.c
            int r4 = r7.b
            r5 = 1
            r6 = 2
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r6) goto L15
            defpackage.uj50.b(r8)
            goto L47
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1b:
            defpackage.uj50.b(r8)
            goto L3e
        L1f:
            defpackage.uj50.b(r8)
            if (r4 >= 0) goto L27
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L27:
            wy2 r8 = new wy2
            r8.<init>(r3, r5)
            or60 r8 = defpackage.n95.c(r8)
            fgq$a r1 = new fgq$a
            r1.<init>(r6, r2)
            r7.a = r5
            java.lang.Object r8 = defpackage.s0i.b(r8, r1, r7)
            if (r8 != r0) goto L3e
            goto L46
        L3e:
            r7.a = r6
            java.lang.Object r7 = defpackage.egq.d(r3, r4, r7)
            if (r7 != r0) goto L47
        L46:
            return r0
        L47:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
