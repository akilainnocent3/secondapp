package defpackage;

import android.content.Context;
import androidx.work.d;
import com.google.protobuf.DescriptorProtos;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.work.impl.utils.WorkForegroundKt$workForeground$2", f = "WorkForeground.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 50}, m = "invokeSuspend")
public final class evj0 extends tje0 implements Function2<v5b, v1b<? super Void>, Object> {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ owj0 c;
    public final /* synthetic */ hvj0 d;
    public final /* synthetic */ Context e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evj0(d dVar, owj0 owj0Var, hvj0 hvj0Var, Context context, v1b v1bVar) {
        super(2, v1bVar);
        this.b = dVar;
        this.c = owj0Var;
        this.d = hvj0Var;
        this.e = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new evj0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Void> v1bVar) {
        return ((evj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str = this.c.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        d dVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            nv5.d dVarA = dVar.a();
            this.a = 1;
            obj = gyj0.a(dVarA, dVar, this);
            if (obj != y5bVar) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        pti ptiVar = (pti) obj;
        if (ptiVar == null) {
            ib5.a(tug.a("Worker was marked important (", str, ") but did not provide ForegroundInfo"));
            return null;
        }
        String str2 = fvj0.a;
        jgt.e().a(str2, "Updating notification for " + str);
        UUID uuid = dVar.b.a;
        hvj0 hvj0Var = this.d;
        xd80 xd80Var = hvj0Var.a.a;
        final gvj0 gvj0Var = new gvj0(hvj0Var, uuid, ptiVar, this.e);
        xd80Var.getClass();
        final nv5.a aVar = new nv5.a();
        nv5.d<T> dVar2 = new nv5.d<>(aVar);
        aVar.b = dVar2;
        aVar.a = ew5.class;
        try {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            aVar.a(new s45(atomicBoolean, 1), kqe.a);
            xd80Var.execute(new Runnable() { // from class: tis
                @Override // java.lang.Runnable
                public final void run() {
                    nv5.a aVar2 = aVar;
                    gvj0 gvj0Var2 = gvj0Var;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    try {
                        gvj0Var2.invoke();
                        aVar2.b(null);
                    } catch (Throwable th) {
                        aVar2.d(th);
                    }
                }
            });
            aVar.a = "setForegroundAsync";
        } catch (Exception e) {
            dVar2.a(e);
        }
        this.a = 2;
        Object objA = xis.a(dVar2, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
