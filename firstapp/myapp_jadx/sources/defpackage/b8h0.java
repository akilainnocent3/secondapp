package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.DocumentAudit;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$special$$inlined$transform$2", f = "TxListViewModel.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class b8h0 extends tje0 implements Function2<myh<? super zsp>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b77 c;
    public final /* synthetic */ o7h0 d;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh<zsp> a;
        public final /* synthetic */ o7h0 b;

        public a(myh myhVar, o7h0 o7h0Var) {
            this.b = o7h0Var;
            this.a = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(T t, v1b<? super Unit> v1bVar) {
            zsp zspVar;
            lk50 lk50Var = (lk50) t;
            psm psmVar = this.b.v;
            if (psmVar.x() || psmVar.n()) {
                lk50Var.getClass();
                if (lk50Var instanceof lk50.c) {
                    NameConfirmationStatus nameConfirmationStatus = (NameConfirmationStatus) ((lk50.c) lk50Var).a;
                    nameConfirmationStatus.getClass();
                    int i = nameConfirmationStatus.status;
                    DocumentAudit documentAudit = nameConfirmationStatus.documentAudit;
                    zspVar = btp.a(i, documentAudit != null ? documentAudit.status : 0, documentAudit != null ? documentAudit.rejectTitle : null, documentAudit != null ? documentAudit.rejectReason : null);
                } else {
                    zspVar = new zsp(null, 7);
                }
            } else {
                zspVar = new zsp(null, 7);
            }
            Object objEmit = this.a.emit(zspVar, v1bVar);
            return objEmit == y5b.a ? objEmit : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8h0(b77 b77Var, v1b v1bVar, o7h0 o7h0Var) {
        super(2, v1bVar);
        this.c = b77Var;
        this.d = o7h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        b8h0 b8h0Var = new b8h0(this.c, v1bVar, this.d);
        b8h0Var.b = obj;
        return b8h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super zsp> myhVar, v1b<? super Unit> v1bVar) {
        return ((b8h0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            a aVar = new a((myh) this.b, this.d);
            this.b = null;
            this.a = 1;
            if (this.c.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
