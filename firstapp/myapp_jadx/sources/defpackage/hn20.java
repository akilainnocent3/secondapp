package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class hn20 implements lyh<Boolean> {
    public final /* synthetic */ yzh a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ String b;
        public final /* synthetic */ boolean c;

        /* JADX INFO: renamed from: hn20$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportygames.common.framework.datastore.PreferenceDataStoreImpl$getBooleanByFlow$$inlined$map$1$2", f = "PreferenceDataStoreImpl.kt", l = {50}, m = "emit", v = 1)
        public static final class C0647a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0647a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(myh myhVar, String str, boolean z) {
            this.a = myhVar;
            this.b = str;
            this.c = z;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            C0647a c0647a;
            if (v1bVar instanceof C0647a) {
                c0647a = (C0647a) v1bVar;
                int i = c0647a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0647a.b = i - Integer.MIN_VALUE;
                } else {
                    c0647a = new C0647a(v1bVar);
                }
            } else {
                c0647a = new C0647a(v1bVar);
            }
            Object obj2 = c0647a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0647a.b;
            if (i2 == 0) {
                uj50.b(obj2);
                Boolean bool = (Boolean) ((zn20) obj).c(new zn20.a<>(this.b));
                Boolean boolValueOf = Boolean.valueOf(bool != null ? bool.booleanValue() : this.c);
                c0647a.b = 1;
                if (this.a.emit(boolValueOf, c0647a) == y5bVar) {
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

    public hn20(yzh yzhVar, String str, boolean z) {
        this.a = yzhVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) {
        Object objCollect = this.a.collect(new a(myhVar, this.b, this.c), v1bVar);
        return objCollect == y5b.a ? objCollect : Unit.a;
    }
}
