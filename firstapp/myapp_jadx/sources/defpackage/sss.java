package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.livescore.LiveScoreTimer$startRunning$1", f = "LiveScoreTimer.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class sss extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ rss c;

    @c0d(c = "com.sportybet.android.instantwin.presentation.kickoff.livescore.LiveScoreTimer$startRunning$1$1", f = "LiveScoreTimer.kt", l = {33, DescriptorProtos.MethodOptions.IDEMPOTENCY_LEVEL_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<myh<? super Integer>, v1b<? super Unit>, Object> {
        public int a;
        public int b;
        public /* synthetic */ Object c;
        public final /* synthetic */ int d;
        public final /* synthetic */ rss e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, rss rssVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = i;
            this.e = rssVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.d, this.e, v1bVar);
            aVar.c = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super Integer> myhVar, v1b<? super Unit> v1bVar) {
            return ((a) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:16:0x0041  */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        
            if (defpackage.hkd.b(1000, r8) == r1) goto L19;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004e -> B:20:0x0051). Please report as a decompilation issue!!! */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.c
                myh r0 = (defpackage.myh) r0
                y5b r1 = defpackage.y5b.a
                int r2 = r8.b
                int r3 = r8.d
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L25
                if (r2 == r5) goto L1f
                if (r2 != r4) goto L18
                int r2 = r8.a
                defpackage.uj50.b(r9)
                goto L51
            L18:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r8)
                r8 = 0
                return r8
            L1f:
                int r2 = r8.a
                defpackage.uj50.b(r9)
                goto L42
            L25:
                defpackage.uj50.b(r9)
                if (r3 < 0) goto L56
                r9 = 0
            L2b:
                rss r2 = r8.e
                r2.c = r9
                java.lang.Integer r2 = new java.lang.Integer
                r2.<init>(r9)
                r8.c = r0
                r8.a = r9
                r8.b = r5
                java.lang.Object r2 = r0.emit(r2, r8)
                if (r2 != r1) goto L41
                goto L50
            L41:
                r2 = r9
            L42:
                r8.c = r0
                r8.a = r2
                r8.b = r4
                r6 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r9 = defpackage.hkd.b(r6, r8)
                if (r9 != r1) goto L51
            L50:
                return r1
            L51:
                if (r2 == r3) goto L56
                int r9 = r2 + 1
                goto L2b
            L56:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: sss.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ rss a;

        public b(rss rssVar) {
            this.a = rssVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int iIntValue = ((Number) obj).intValue();
            Iterator<rss.a> it = this.a.b.iterator();
            it.getClass();
            while (it.hasNext()) {
                it.next().a(iIntValue);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sss(int i, rss rssVar, v1b<? super sss> v1bVar) {
        super(2, v1bVar);
        this.b = i;
        this.c = rssVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sss(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sss) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            int i2 = this.b;
            rss rssVar = this.c;
            or60 or60Var = new or60(new a(i2, rssVar, null));
            b bVar = new b(rssVar);
            this.a = 1;
            if (or60Var.collect(bVar, this) == y5bVar) {
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
