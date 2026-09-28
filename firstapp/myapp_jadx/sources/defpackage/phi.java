package defpackage;

import java.lang.reflect.Type;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class phi implements lyh<Boolean> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ qhi b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.android.instantwin.data.repository.FootballFamilySpeedControllerRepoImpl$shouldShowTooltipFlow$$inlined$map$1", f = "FootballFamilySpeedControllerRepoImpl.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return phi.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ qhi b;
        public final /* synthetic */ String c;

        @c0d(c = "com.sportybet.android.instantwin.data.repository.FootballFamilySpeedControllerRepoImpl$shouldShowTooltipFlow$$inlined$map$1$2", f = "FootballFamilySpeedControllerRepoImpl.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, qhi qhiVar, String str) {
            this.a = myhVar;
            this.b = qhiVar;
            this.c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            Object bVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                String str = (String) obj;
                qhi qhiVar = this.b;
                try {
                    zi50.a aVar2 = zi50.b;
                    bVar = (Map) qhiVar.b.fromJson(str, (Type) Map.class);
                    if (bVar == null) {
                        bVar = o2g.a;
                        bVar.getClass();
                    }
                } catch (Throwable th) {
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Object obj3 = o2g.a;
                obj3.getClass();
                if (bVar instanceof zi50.b) {
                    bVar = obj3;
                }
                Boolean bool = (Boolean) ((Map) bVar).get(this.c);
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
                aVar.b = 1;
                if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public phi(lyh lyhVar, qhi qhiVar, String str) {
        this.a = lyhVar;
        this.b = qhiVar;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b, this.c);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
