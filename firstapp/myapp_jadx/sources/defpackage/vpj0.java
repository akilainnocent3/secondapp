package defpackage;

import com.sporty.android.common_ui.uitext.StringUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.withdraw.presentation.viewmodel.WithdrawTransferViewModel$coolDownRemainedTimeUiTextFlow$1", f = "WithdrawTransferViewModel.kt", l = {165, 178, 183}, m = "invokeSuspend", v = 2)
public final class vpj0 extends tje0 implements Function2<myh<? super StringUiText>, v1b<? super Unit>, Object> {
    public int a;
    public long b;
    public long c;
    public long d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ hqj0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vpj0(hqj0 hqj0Var, v1b<? super vpj0> v1bVar) {
        super(2, v1bVar);
        this.i = hqj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vpj0 vpj0Var = new vpj0(this.i, v1bVar);
        vpj0Var.f = obj;
        return vpj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super StringUiText> myhVar, v1b<? super Unit> v1bVar) {
        ((vpj0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x007a  */
    /* JADX WARN: Code duplicated, block: B:19:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0086  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ec A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x00f9  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if (defpackage.bm50.p(r3, r26) == r2) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010e, code lost:
    
        if (defpackage.hkd.b(r8, r26) == r2) goto L38;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x010e -> B:39:0x0111). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vpj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
