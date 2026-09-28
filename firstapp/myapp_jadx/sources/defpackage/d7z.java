package defpackage;

import com.sporty.android.platform.features.newotp.model.OtpAuthenticationData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.newotp.otpselector.OtpSelectorViewModel$handleInitOtpFlowSuccess$1", f = "OtpSelectorViewModel.kt", l = {206, 217}, m = "invokeSuspend", v = 2)
public final class d7z extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public uf00 a;
    public uf00 b;
    public uf00 c;
    public z6z.a d;
    public boolean e;
    public int f;
    public final /* synthetic */ OtpAuthenticationData i;
    public final /* synthetic */ c7z<OtpData> v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7z(OtpAuthenticationData otpAuthenticationData, c7z<OtpData> c7zVar, v1b<? super d7z> v1bVar) {
        super(2, v1bVar);
        this.i = otpAuthenticationData;
        this.v = c7zVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new d7z(this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((d7z) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0112  */
    /* JADX WARN: Code duplicated, block: B:41:0x011f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0127  */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0154  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:54:0x015d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0160  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f0, code lost:
    
        if (r12 == r3) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017f, code lost:
    
        if (r0 == r3) goto L58;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d7z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
