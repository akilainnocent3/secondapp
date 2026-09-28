package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.giftdialog.LNGiftDialogKt$Partial$1$1", f = "LNGiftDialog.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bdq extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ b5i b;
    public final /* synthetic */ k4i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bdq(boolean z, b5i b5iVar, k4i k4iVar, v1b<? super bdq> v1bVar) {
        super(2, v1bVar);
        this.a = z;
        this.b = b5iVar;
        this.c = k4iVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bdq(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bdq) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (this.a) {
            b5i.b(this.b);
        } else {
            this.c.t(false);
        }
        return Unit.a;
    }
}
