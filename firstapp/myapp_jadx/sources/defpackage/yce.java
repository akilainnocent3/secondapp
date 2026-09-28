package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.push.DeviceInfo$awaitUserIdentifiers$3$2", f = "DeviceInfo.kt", l = {54, 55}, m = "invokeSuspend", v = 2)
public final class yce extends tje0 implements Function2<v5b, v1b<? super ysm.a>, Object> {
    public String a;
    public int b;
    public final /* synthetic */ cde c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yce(cde cdeVar, v1b<? super yce> v1bVar) {
        super(2, v1bVar);
        this.c = cdeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yce(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super ysm.a> v1bVar) {
        return ((yce) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str;
        y5b y5bVar = y5b.a;
        int i = this.b;
        cde cdeVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            this.b = 1;
            obj = cdeVar.e(this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = this.a;
            uj50.b(obj);
        }
        return new ysm.a(str, (String) obj);
        String str2 = (String) obj;
        this.a = str2;
        this.b = 2;
        Object objF = cdeVar.f(this);
        if (objF != y5bVar) {
            obj = objF;
            str = str2;
            return new ysm.a(str, (String) obj);
        }
        return y5bVar;
    }
}
