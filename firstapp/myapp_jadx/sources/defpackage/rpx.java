package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.newCode.compose.NewCustomCodeBottomSheetKt$NewCustomCodeBottomSheet$2$1", f = "NewCustomCodeBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rpx extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ cqx a;
    public final /* synthetic */ gdc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpx(cqx cqxVar, gdc gdcVar, v1b<? super rpx> v1bVar) {
        super(2, v1bVar);
        this.a = cqxVar;
        this.b = gdcVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new rpx(this.a, this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((rpx) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        cqx cqxVar = this.a;
        cqxVar.y1(new xpx(cqxVar, this.b, null));
        return Unit.a;
    }
}
