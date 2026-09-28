package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.OngoingComponentKt$FlyingBallAnimation$2$1", f = "OngoingComponent.kt", l = {734}, m = "invokeSuspend", v = 1)
public final class nwy extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ List<c8n> d;
    public final /* synthetic */ ytw<List<c8n>> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nwy(String str, boolean z, List<? extends c8n> list, ytw<List<c8n>> ytwVar, v1b<? super nwy> v1bVar) {
        super(2, v1bVar);
        this.b = str;
        this.c = z;
        this.d = list;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nwy(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nwy) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        List<c8n> list = this.d;
        ytw<List<c8n>> ytwVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            boolean zG = Intrinsics.g(this.b, "ROUND_PRE_START");
            boolean z = this.c;
            if (zG && z) {
                m2g m2gVar = m2g.a;
                int i2 = bxy.a;
                ytwVar.setValue(m2gVar);
                this.a = 1;
                if (hkd.b(50L, this) == y5bVar) {
                    return y5bVar;
                }
            } else if (z) {
                int i3 = bxy.a;
                ytwVar.setValue(list);
            } else {
                m2g m2gVar2 = m2g.a;
                int i4 = bxy.a;
                ytwVar.setValue(m2gVar2);
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        int i5 = bxy.a;
        ytwVar.setValue(list);
        return Unit.a;
    }
}
