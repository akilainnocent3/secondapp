package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {115}, m = "invokeSuspend")
public final class zep extends ji50 implements gaj<m8d<Unit, scp>, Unit, v1b<? super scp>, Object> {
    public int b;
    public /* synthetic */ m8d c;
    public final /* synthetic */ bfp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zep(bfp bfpVar, v1b<? super zep> v1bVar) {
        super(3, v1bVar);
        this.d = bfpVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(m8d<Unit, scp> m8dVar, Unit unit, v1b<? super scp> v1bVar) {
        zep zepVar = new zep(this.d, v1bVar);
        zepVar.c = m8dVar;
        return zepVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        bfp bfpVar = this.d;
        v9e0 v9e0Var = bfpVar.a;
        m8d m8dVar = this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            byte bP = v9e0Var.p();
            if (bP == 1) {
                return bfpVar.d(true);
            }
            if (bP == 0) {
                return bfpVar.d(false);
            }
            if (bP != 6) {
                if (bP == 8) {
                    return bfpVar.b();
                }
                v9e0.l(v9e0Var, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.c = null;
            this.b = 1;
            obj = bfpVar.c(m8dVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return (scp) obj;
    }
}
