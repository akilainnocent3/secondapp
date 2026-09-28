package defpackage;

import android.content.Context;
import com.sporty.android.permission.location.KN.qUnCRF;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
public final class v6g extends tje0 implements Function2<v5b, v1b<? super dfe0>, Object> {
    public int a;
    public final /* synthetic */ p6g b;
    public final /* synthetic */ nan c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ u2z e;
    public final /* synthetic */ rpg f;
    public final /* synthetic */ vlv.b i;
    public final /* synthetic */ dyo.a v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6g(p6g p6gVar, nan nanVar, Object obj, u2z u2zVar, rpg rpgVar, vlv.b bVar, dyo.a aVar, v1b<? super v6g> v1bVar) {
        super(2, v1bVar);
        this.b = p6gVar;
        this.c = nanVar;
        this.d = obj;
        this.e = u2zVar;
        this.f = rpgVar;
        this.i = bVar;
        this.v = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v6g(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super dfe0> v1bVar) {
        return ((v6g) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v6g v6gVar;
        boolean z;
        vlv vlvVarD;
        vlv.b bVar = this.i;
        p6g p6gVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            p6g p6gVar2 = this.b;
            nan nanVar = this.c;
            Object obj2 = this.d;
            u2z u2zVar = this.e;
            rpg rpgVar = this.f;
            this.a = 1;
            v6gVar = this;
            obj = p6gVar2.c(nanVar, obj2, u2zVar, rpgVar, v6gVar);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            v6gVar = this;
        }
        p6g.a aVar = (p6g.a) obj;
        mb0 mb0Var = p6gVar.b;
        synchronized (mb0Var) {
            try {
                a840 a840Var = mb0Var.a.get();
                if (a840Var == null) {
                    mb0Var.a();
                } else if (mb0Var.d == null) {
                    Context context = a840Var.a.a;
                    mb0Var.d = context;
                    context.registerComponentCallbacks(mb0Var.c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        wlv wlvVar = p6gVar.e;
        nan nanVar2 = v6gVar.c;
        if (bVar == null || !nanVar2.k.b || !aVar.a.e() || (vlvVarD = wlvVar.a.d()) == null) {
            z = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(aVar.b));
            String str = aVar.d;
            if (str != null) {
                linkedHashMap.put(qUnCRF.iONraBqAlwsvHH, str);
            }
            vlvVarD.h(bVar, new vlv.c(aVar.a, linkedHashMap));
            z = true;
        }
        u7n u7nVar = aVar.a;
        nan nanVar3 = v6gVar.c;
        bqc bqcVar = aVar.c;
        vlv.b bVar2 = z ? bVar : null;
        v6g v6gVar2 = v6gVar;
        String str2 = aVar.d;
        boolean z2 = aVar.b;
        dyo.a aVar2 = v6gVar2.v;
        return new dfe0(u7nVar, nanVar3, bqcVar, bVar2, str2, z2, (aVar2 instanceof h840) && ((h840) aVar2).g);
    }
}
