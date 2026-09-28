package defpackage;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.showoff.presentation.LNShowOffViewModel$clearCacheDeferred$1", f = "LNShowOffViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class cer extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ber b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cer(ber berVar, v1b<? super cer> v1bVar) {
        super(2, v1bVar);
        this.b = berVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cer cerVar = new cer(this.b, v1bVar);
        cerVar.a = obj;
        return cerVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cer) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ber berVar = this.b;
        try {
            zi50.a aVar = zi50.b;
            File file = new File(berVar.c, "lucky_number_show_off");
            if (file.exists() && file.isDirectory()) {
                qlh.j(file);
            }
            Unit unit = Unit.a;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        return Unit.a;
    }
}
