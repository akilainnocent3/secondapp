package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.international.resetpwd.viewmodel.ResetPwdViewModel$launchFacialRecognitionFromChangePassword$1", f = "ResetPwdViewModel.kt", l = {142, ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
public final class mf50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nf50 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mf50(nf50 nf50Var, v1b<? super mf50> v1bVar) {
        super(2, v1bVar);
        this.b = nf50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mf50(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mf50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
    
        if (r1.emit(r4, r17) == r3) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            nf50 r1 = r0.b
            wwd0 r2 = r1.a
            y5b r3 = defpackage.y5b.a
            int r4 = r0.a
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L24
            if (r4 == r6) goto L1e
            if (r4 != r5) goto L18
            defpackage.uj50.b(r18)
            goto L8d
        L18:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r0)
            return r7
        L1e:
            defpackage.uj50.b(r18)
            r4 = r18
            goto L5d
        L24:
            defpackage.uj50.b(r18)
        L27:
            java.lang.Object r4 = r2.getValue()
            r8 = r4
            gxo r8 = (defpackage.gxo) r8
            r15 = 0
            r16 = 503(0x1f7, float:7.05E-43)
            r9 = 0
            r10 = 0
            r11 = 1
            r12 = 0
            r13 = 0
            r14 = 0
            gxo r8 = defpackage.gxo.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r4 = r2.g(r4, r8)
            if (r4 == 0) goto L27
            kgk r4 = r1.f
            r0.a = r6
            lyz r4 = r4.a
            lyh r4 = r4.j(r7)
            com.sporty.android.common_ui.uitext.ResourceUiText r6 = defpackage.vch0.b
            yzh r4 = defpackage.bm50.b(r4, r6)
            sl50 r6 = new sl50
            r6.<init>(r4)
            java.lang.Object r4 = defpackage.s0i.a(r6, r0)
            if (r4 != r3) goto L5d
            goto L8c
        L5d:
            lk50 r4 = (defpackage.lk50) r4
            boolean r6 = r4 instanceof lk50.c
            if (r6 == 0) goto L6d
            lk50$c r4 = (lk50.c) r4
            T r4 = r4.a
            com.sporty.android.core.model.account.CpfData r4 = (com.sporty.android.core.model.account.CpfData) r4
            java.lang.String r7 = r4.getCpf()
        L6d:
            if (r7 == 0) goto Laa
            int r4 = r7.length()
            if (r4 != 0) goto L76
            goto Laa
        L76:
            b390 r1 = r1.c
            zqr r4 = new zqr
            u6h r6 = new u6h
            q7h r8 = defpackage.q7h.PASSWORD_RESET
            r6.<init>(r7, r8)
            r4.<init>(r6)
            r0.a = r5
            java.lang.Object r0 = r1.emit(r4, r0)
            if (r0 != r3) goto L8d
        L8c:
            return r3
        L8d:
            java.lang.Object r0 = r2.getValue()
            r3 = r0
            gxo r3 = (defpackage.gxo) r3
            r10 = 0
            r11 = 503(0x1f7, float:7.05E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            gxo r1 = defpackage.gxo.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.g(r0, r1)
            if (r0 == 0) goto L8d
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        Laa:
            java.lang.Object r0 = r2.getValue()
            r3 = r0
            gxo r3 = (defpackage.gxo) r3
            r10 = 0
            r11 = 375(0x177, float:5.25E-43)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 1
            gxo r1 = defpackage.gxo.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = r2.g(r0, r1)
            if (r0 == 0) goto Laa
            kotlin.Unit r0 = kotlin.Unit.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mf50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
