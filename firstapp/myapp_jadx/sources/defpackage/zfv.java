package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class zfv implements lyh<List<? extends aev>> {
    public final /* synthetic */ lyh a;
    public final /* synthetic */ qfv b;

    @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$provideRows$$inlined$map$1", f = "MeScreenRowsProvider.kt", l = {109}, m = "collect", v = 2)
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
            return zfv.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ qfv b;

        @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$provideRows$$inlined$map$1$2", f = "MeScreenRowsProvider.kt", l = {114, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;
            public List e;
            public ArrayList f;
            public aev.b i;
            public ResourceUiText v;
            public ArrayList w;
            public int y;

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

        public b(myh myhVar, qfv qfvVar) {
            this.a = myhVar;
            this.b = qfvVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0237, code lost:
        
            if (r4.emit(r0, r5) == r6) goto L39;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r36, defpackage.v1b r37) {
            /*
                Method dump skipped, instruction units count: 573
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: zfv.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public zfv(lyh lyhVar, qfv qfvVar) {
        this.a = lyhVar;
        this.b = qfvVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super List<? extends aev>> myhVar, v1b v1bVar) {
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
            b bVar = new b(myhVar, this.b);
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
