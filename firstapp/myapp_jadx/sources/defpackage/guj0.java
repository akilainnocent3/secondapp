package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.manager.WonPopupSharingManagerImpl$clearWonPopupShareCache$2", f = "WonPopupSharingManagerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class guj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ euj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public guj0(euj0 euj0Var, v1b<? super guj0> v1bVar) {
        super(2, v1bVar);
        this.b = euj0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        guj0 guj0Var = new guj0(this.b, v1bVar);
        guj0Var.a = obj;
        return guj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((guj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        File fileF = this.b.f();
        if (!fileF.exists()) {
            return Unit.a;
        }
        if (fileF.delete()) {
            return Unit.a;
        }
        try {
            zi50.a aVar = zi50.b;
            FileOutputStream fileOutputStream = new FileOutputStream(fileF);
            try {
                Unit unit = Unit.a;
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    ft7.a(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
        }
        return Unit.a;
    }
}
