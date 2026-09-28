package defpackage;

import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", l = {362, 363, 368}, m = "invokeSuspend")
public final class o8f extends ji50 implements Function2<vp1, v1b<? super Unit>, Object> {
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ aaf d;
    public final /* synthetic */ baf e;
    public final /* synthetic */ caf f;
    public final /* synthetic */ Function2<m020, gly, Unit> i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8f(aaf aafVar, baf bafVar, caf cafVar, Function2 function2, v1b v1bVar) {
        super(2, v1bVar);
        this.d = aafVar;
        this.e = bafVar;
        this.f = cafVar;
        this.i = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o8f o8fVar = new o8f(this.d, this.e, this.f, this.i, v1bVar);
        o8fVar.c = obj;
        return o8fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vp1 vp1Var, v1b<? super Unit> v1bVar) {
        return ((o8f) create(vp1Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a A[Catch: CancellationException -> 0x001a, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0016, B:33:0x007b, B:35:0x0083, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0083 A[Catch: CancellationException -> 0x001a, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0016, B:33:0x007b, B:35:0x0083, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x008f A[Catch: CancellationException -> 0x001a, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0016, B:33:0x007b, B:35:0x0083, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:39:0x009b A[Catch: CancellationException -> 0x001a, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0016, B:33:0x007b, B:35:0x0083, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7 A[Catch: CancellationException -> 0x001a, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x001a, blocks: (B:8:0x0016, B:33:0x007b, B:35:0x0083, B:37:0x008f, B:39:0x009b, B:40:0x009e, B:41:0x00a1, B:42:0x00a7, B:15:0x0028, B:27:0x0056, B:29:0x005a, B:18:0x0030, B:24:0x0047, B:21:0x003c), top: B:47:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x009e A[SYNTHETIC] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        vp1 vp1Var;
        m020 m020Var;
        vp1 vp1Var2;
        List<m020> list;
        int size;
        m020 m020Var2;
        y5b y5bVar = y5b.a;
        int i = this.b;
        int i2 = 0;
        caf cafVar = this.f;
        try {
            if (i == 0) {
                uj50.b(obj);
                vp1Var = (vp1) this.c;
                this.c = vp1Var;
                this.b = 1;
                obj = u4f0.b(vp1Var, this, 2);
                if (obj == y5bVar) {
                }
                return y5bVar;
            }
            if (i == 1) {
                vp1Var = (vp1) this.c;
                uj50.b(obj);
            } else {
                if (i == 2) {
                    vp1Var = (vp1) this.c;
                    uj50.b(obj);
                    m020Var = (m020) obj;
                    if (m020Var != null) {
                        this.d.invoke(new gly(m020Var.c));
                        long j = m020Var.a;
                        n8f n8fVar = new n8f(this.i, i2);
                        this.c = vp1Var;
                        this.b = 3;
                        obj = y8f.h(vp1Var, j, n8fVar, this);
                        if (obj != y5bVar) {
                            vp1Var2 = vp1Var;
                        }
                        return y5bVar;
                    }
                    return Unit.a;
                }
                if (i != 3) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                vp1Var2 = (vp1) this.c;
                uj50.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                list = vp1Var2.U0().a;
                size = list.size();
                while (i2 < size) {
                    m020Var2 = list.get(i2);
                    if (ovo.d(m020Var2)) {
                        m020Var2.a();
                    }
                    i2++;
                }
                this.e.invoke();
            } else {
                cafVar.invoke();
            }
            return Unit.a;
            long j2 = ((m020) obj).a;
            this.c = vp1Var;
            this.b = 2;
            obj = y8f.c(vp1Var, j2, this);
            if (obj != y5bVar) {
                m020Var = (m020) obj;
                if (m020Var != null) {
                    this.d.invoke(new gly(m020Var.c));
                    long j3 = m020Var.a;
                    n8f n8fVar2 = new n8f(this.i, i2);
                    this.c = vp1Var;
                    this.b = 3;
                    obj = y8f.h(vp1Var, j3, n8fVar2, this);
                    if (obj != y5bVar) {
                        vp1Var2 = vp1Var;
                        if (((Boolean) obj).booleanValue()) {
                            list = vp1Var2.U0().a;
                            size = list.size();
                            while (i2 < size) {
                                m020Var2 = list.get(i2);
                                if (ovo.d(m020Var2)) {
                                    m020Var2.a();
                                }
                                i2++;
                            }
                            this.e.invoke();
                        } else {
                            cafVar.invoke();
                        }
                    }
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (CancellationException e) {
            cafVar.invoke();
            throw e;
        }
    }
}
