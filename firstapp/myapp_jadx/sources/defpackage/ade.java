package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.push.DeviceInfo$getDeviceIdWithDefault$1", f = "DeviceInfo.kt", l = {138}, m = "invokeSuspend", v = 2)
public final class ade extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
    public int a;
    public final /* synthetic */ cde b;

    @c0d(c = "com.sportybet.android.push.DeviceInfo$getDeviceIdWithDefault$1$1", f = "DeviceInfo.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super String>, Object> {
        public int a;
        public final /* synthetic */ cde b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(cde cdeVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = cdeVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                obj = this.b.d(this);
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
            return ((ysm.a) obj).a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ade(cde cdeVar, v1b v1bVar) {
        super(2, v1bVar);
        this.b = cdeVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ade(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super String> v1bVar) {
        return ((ade) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        a aVar = new a(this.b, null);
        this.a = 1;
        Object objC = vxf0.c(250L, aVar, this);
        return objC == y5bVar ? y5bVar : objC;
    }
}
