package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.matchalert.presentation.MatchAlertViewModel$subscribeEvent$1", f = "MatchAlertViewModel.kt", l = {196, 211, 219}, m = "invokeSuspend", v = 2)
public final class vvu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public rvu b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ rvu e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vvu(rvu rvuVar, String str, v1b<? super vvu> v1bVar) {
        super(2, v1bVar);
        this.e = rvuVar;
        this.f = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vvu vvuVar = new vvu(this.e, this.f, v1bVar);
        vvuVar.d = obj;
        return vvuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vvu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:53:0x013c  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007f, code lost:
    
        if (r0 == r11) goto L44;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
