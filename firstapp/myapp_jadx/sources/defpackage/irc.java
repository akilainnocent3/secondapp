package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
public final class irc extends tje0 implements Function2<Boolean, v1b<? super ioc<Object>>, Object> {
    public Object a;
    public int b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ yqc<Object> d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public irc(yqc<Object> yqcVar, int i, v1b<? super irc> v1bVar) {
        super(2, v1bVar);
        this.d = yqcVar;
        this.e = i;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        irc ircVar = new irc(this.d, this.e, v1bVar);
        ircVar.c = ((Boolean) obj).booleanValue();
        return ircVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, v1b<? super ioc<Object>> v1bVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((irc) create(bool2, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int iIntValue;
        Object obj2;
        int iHashCode;
        y5b y5bVar = y5b.a;
        int i = this.b;
        yqc<Object> yqcVar = this.d;
        if (i == 0) {
            uj50.b(obj);
            z = this.c;
            this.c = z;
            this.b = 1;
            obj = ((l1e0) yqcVar.j.getValue()).d(new m1e0(3, null), this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            z = this.c;
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.a;
            uj50.b(obj);
        }
        iIntValue = ((Number) obj).intValue();
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new ioc(iHashCode, iIntValue, obj2);
        if (z) {
            wxo wxoVarB = yqcVar.b();
            this.a = obj;
            this.b = 2;
            Object objD = wxoVarB.d(this);
            if (objD != y5bVar) {
                Object obj3 = obj;
                obj = objD;
                obj2 = obj3;
                iIntValue = ((Number) obj).intValue();
            }
            return y5bVar;
        }
        Object obj4 = obj;
        iIntValue = this.e;
        obj2 = obj4;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new ioc(iHashCode, iIntValue, obj2);
    }
}
