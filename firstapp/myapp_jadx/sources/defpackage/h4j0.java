package defpackage;

import com.sportybet.plugin.sportystories.domain.entity.Story;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final class h4j0 implements lyh<Story> {
    public final /* synthetic */ u9k a;
    public final /* synthetic */ f4j0 b;

    @c0d(c = "com.sportybet.plugin.sportystories.data.WelcomeRewardStoryProvider$getStory$$inlined$map$1", f = "WelcomeRewardStoryProvider.kt", l = {109}, m = "collect", v = 2)
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
            return h4j0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ f4j0 b;

        @c0d(c = "com.sportybet.plugin.sportystories.data.WelcomeRewardStoryProvider$getStory$$inlined$map$1$2", f = "WelcomeRewardStoryProvider.kt", l = {51, 50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;
            public myh d;

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

        public b(myh myhVar, f4j0 f4j0Var) {
            this.a = myhVar;
            this.b = f4j0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x013f, code lost:
        
            if (r0.emit(r10, r2) == r3) goto L48;
         */
        @Override // defpackage.myh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r21, defpackage.v1b r22) {
            /*
                Method dump skipped, instruction units count: 325
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: h4j0.b.emit(java.lang.Object, v1b):java.lang.Object");
        }
    }

    public h4j0(u9k u9kVar, f4j0 f4j0Var) {
        this.a = u9kVar;
        this.b = f4j0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Story> myhVar, v1b v1bVar) {
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
