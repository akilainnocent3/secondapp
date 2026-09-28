package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.usecase.GetPendingDepositsUseCase$invoke$2$1", f = "GetPendingDepositsUseCase.kt", l = {38, 41, 51}, m = "invokeSuspend", v = 2)
public final class pak extends tje0 implements Function2<v5b, v1b<? super lak.b>, Object> {
    public ojd a;
    public pjd b;
    public Map c;
    public ArrayList d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ lak i;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pak(lak lakVar, int i, v1b<? super pak> v1bVar) {
        super(2, v1bVar);
        this.i = lakVar;
        this.v = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        pak pakVar = new pak(this.i, this.v, v1bVar);
        pakVar.f = obj;
        return pakVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super lak.b> v1bVar) {
        return ((pak) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (r0 == r2) goto L36;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pak.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
