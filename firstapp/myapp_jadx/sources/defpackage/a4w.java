package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.patron.KYCBannerItem;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.domain.MonitorAppUsageUseCase$invoke$1", f = "MonitorAppUsageUseCase.kt", l = {KYCBannerItem.STATUS_DEPRECATE, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class a4w extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public long b;
    public int c;
    public final /* synthetic */ b4w d;
    public final /* synthetic */ int e;
    public final /* synthetic */ j1b f;
    public final /* synthetic */ int i;

    @c0d(c = "com.sportybet.android.limits.domain.MonitorAppUsageUseCase$invoke$1$1", f = "MonitorAppUsageUseCase.kt", l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ b4w b;
        public final /* synthetic */ long c;
        public final /* synthetic */ int d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b4w b4wVar, long j, int i, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = b4wVar;
            this.c = j;
            this.d = i;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                r950 r950Var = this.b.a;
                int i2 = (((int) this.c) / 1000) + this.d;
                this.a = 1;
                if (r950Var.a(i2, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4w(b4w b4wVar, int i, j1b j1bVar, int i2, v1b v1bVar) {
        super(2, v1bVar);
        this.d = b4wVar;
        this.e = i;
        this.f = j1bVar;
        this.i = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new a4w(this.d, this.e, this.f, this.i, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((a4w) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long jMin;
        long jCurrentTimeMillis;
        long j;
        long jCurrentTimeMillis2;
        y5b y5bVar = y5b.a;
        int i = this.c;
        b4w b4wVar = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                des desVar = b4wVar.b;
                this.c = 1;
                obj = desVar.a(this);
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
                j = this.b;
                jCurrentTimeMillis2 = this.a;
                try {
                    uj50.b(obj);
                } catch (CancellationException unused) {
                    jCurrentTimeMillis2 = System.currentTimeMillis() - j;
                }
            }
            ej5.c(this.f, null, null, new a(b4wVar, jCurrentTimeMillis2, this.i, null), 3);
            return Unit.a;
            this.a = jMin;
            this.b = jCurrentTimeMillis;
            this.c = 2;
            if (hkd.b(jMin, this) != y5bVar) {
                jCurrentTimeMillis2 = jMin;
                ej5.c(this.f, null, null, new a(b4wVar, jCurrentTimeMillis2, this.i, null), 3);
                return Unit.a;
            }
            return y5bVar;
        } catch (CancellationException unused2) {
            j = jCurrentTimeMillis;
            jCurrentTimeMillis2 = System.currentTimeMillis() - j;
        }
        jMin = ((long) Math.min(((Number) obj).intValue(), this.e)) * 1000;
        jCurrentTimeMillis = System.currentTimeMillis();
    }
}
