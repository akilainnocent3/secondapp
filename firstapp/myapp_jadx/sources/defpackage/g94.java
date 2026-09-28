package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.settings.BioAuthSettingsViewModel$prepareVerifiedDate$1", f = "BioAuthSettingsViewModel.kt", l = {168, 170}, m = "invokeSuspend", v = 2)
public final class g94 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i94 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ i94 a;

        public a(i94 i94Var) {
            this.a = i94Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            String str = (String) obj;
            wwd0 wwd0Var = this.a.v;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, d94.a((d94) value, str, null, false, false, null, false, null, 0, 254)));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g94(i94 i94Var, v1b<? super g94> v1bVar) {
        super(2, v1bVar);
        this.b = i94Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g94(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g94) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r2.a.putString("biometric_verified_date", r11, r20) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007d, code lost:
    
        if (((zed.d0) r2).collect(r3, r20) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return r4;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            i94 r1 = r0.b
            m2l r2 = r1.c
            d84 r3 = r1.i
            y5b r4 = defpackage.y5b.a
            int r5 = r0.a
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L20
            if (r5 == r7) goto L1c
            if (r5 != r6) goto L15
            goto L1c
        L15:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            r0 = 0
            return r0
        L1c:
            defpackage.uj50.b(r21)
            goto L80
        L20:
            defpackage.uj50.b(r21)
            long r8 = r3.b
            r10 = 0
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r8 = "biometric_verified_date"
            if (r5 == 0) goto L6a
            java.util.Date r5 = new java.util.Date
            long r9 = r3.a
            r5.<init>(r9)
            java.util.Locale r3 = java.util.Locale.US
            r3.getClass()
            java.lang.String r6 = "MM/dd/yyyy"
            r9 = 0
            java.lang.String r11 = defpackage.bwf0.l(r5, r6, r3, r9, r9)
            wwd0 r3 = r1.v
        L42:
            java.lang.Object r1 = r3.getValue()
            r10 = r1
            d94 r10 = (defpackage.d94) r10
            r18 = 0
            r19 = 254(0xfe, float:3.56E-43)
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            d94 r5 = defpackage.d94.a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r1 = r3.g(r1, r5)
            if (r1 == 0) goto L42
            r0.a = r7
            zed r1 = r2.a
            java.lang.Object r0 = r1.putString(r8, r11, r0)
            if (r0 != r4) goto L80
            goto L7f
        L6a:
            java.lang.String r3 = ""
            lyh r2 = r2.getStringByFlow(r8, r3)
            g94$a r3 = new g94$a
            r3.<init>(r1)
            r0.a = r6
            zed$d0 r2 = (zed.d0) r2
            java.lang.Object r0 = r2.collect(r3, r0)
            if (r0 != r4) goto L80
        L7f:
            return r4
        L80:
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g94.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
