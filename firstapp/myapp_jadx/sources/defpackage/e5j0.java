package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.welcomereward.WelcomeRewardViewModel$handleAction$2", f = "WelcomeRewardViewModel.kt", l = {509, 510}, m = "invokeSuspend", v = 2)
public final class e5j0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public int b;
    public final /* synthetic */ w4j0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5j0(v1b v1bVar, w4j0 w4j0Var) {
        super(2, v1bVar);
        this.c = w4j0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e5j0(v1bVar, this.c);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e5j0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        int iOrdinal;
        y5b y5bVar = y5b.a;
        int i2 = this.b;
        w4j0 w4j0Var = this.c;
        ftp ftpVar = null;
        if (i2 == 0) {
            uj50.b(obj);
            mgb0 mgb0Var = w4j0Var.c;
            this.b = 1;
            obj = mgb0Var.getUserCertStatus(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(obj);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            uj50.b(obj);
        }
        zsp.a aVar = btp.a(i, ((Number) obj).intValue(), null, null).a;
        aVar.getClass();
        iOrdinal = aVar.ordinal();
        if (iOrdinal != 3) {
            ftpVar = ftp.a;
        } else if (iOrdinal == 7) {
            ftpVar = ftp.b;
        }
        if (ftpVar == null) {
            ftpVar = ftp.b;
        }
        w4j0Var.I.a(new k4j0.e(ftpVar));
        return Unit.a;
        int iIntValue = ((Number) obj).intValue();
        mgb0 mgb0Var2 = w4j0Var.c;
        this.a = iIntValue;
        this.b = 2;
        Object documentAuditStatus = mgb0Var2.getDocumentAuditStatus(this);
        if (documentAuditStatus != y5bVar) {
            obj = documentAuditStatus;
            i = iIntValue;
            zsp.a aVar2 = btp.a(i, ((Number) obj).intValue(), null, null).a;
            aVar2.getClass();
            iOrdinal = aVar2.ordinal();
            if (iOrdinal != 3) {
                ftpVar = ftp.a;
            } else if (iOrdinal == 7) {
                ftpVar = ftp.b;
            }
            if (ftpVar == null) {
                ftpVar = ftp.b;
            }
            w4j0Var.I.a(new k4j0.e(ftpVar));
            return Unit.a;
        }
        return y5bVar;
    }
}
