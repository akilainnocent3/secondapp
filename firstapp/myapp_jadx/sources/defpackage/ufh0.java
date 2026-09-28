package defpackage;

import com.google.gson.reflect.TypeToken;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.util.UniversalSpecifierHandlerImpl$fetchLocalData$1", f = "UniversalSpecifierHandler.kt", l = {224}, m = "invokeSuspend", v = 2)
public final class ufh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vfh0 b;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002$\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\u00040\u0001¨\u0006\u0005"}, d2 = {"ufh0$a", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a extends TypeToken<HashMap<String, String>> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufh0(vfh0 vfh0Var, v1b<? super ufh0> v1bVar) {
        super(2, v1bVar);
        this.b = vfh0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ufh0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ufh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        vfh0 vfh0Var = this.b;
        try {
            if (i == 0) {
                uj50.b(obj);
                m2l m2lVar = vfh0Var.e;
                String strC = vfh0Var.c();
                this.a = 1;
                obj = m2lVar.a.getString(strC, "", this);
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
            String str = (String) obj;
            HashMap map = (HashMap) ((eal) vfh0Var.f.getValue()).f(str, new a().getType());
            if (map != null) {
                vfh0Var.d.putAll(map);
            }
            itf0.a aVar = itf0.a;
            aVar.q(vfh0Var.c());
            aVar.a("fetching local data: " + str, new Object[0]);
        } catch (Exception unused) {
            itf0.a aVar2 = itf0.a;
            aVar2.q(vfh0Var.c());
            aVar2.a("fetching local data: exception!", new Object[0]);
        }
        return Unit.a;
    }
}
