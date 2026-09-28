package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.animation.DoubleOrNothingKickVisualUtilsKt$playPhase$2", f = "DoubleOrNothingKickVisualUtils.kt", l = {110}, m = "invokeSuspend", v = 2)
public final class u2f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ List<Pair<fmt, xmt>> c;
    public final /* synthetic */ boolean d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.animation.DoubleOrNothingKickVisualUtilsKt$playPhase$2$1$1", f = "DoubleOrNothingKickVisualUtils.kt", l = {96, HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ fmt b;
        public final /* synthetic */ xmt c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fmt fmtVar, xmt xmtVar, boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = fmtVar;
            this.c = xmtVar;
            this.d = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            if (fmt.a.a(r13.b, r13.c, r3, false, 0.0f, null, 0.0f, r13, 2042) == r0) goto L18;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r13.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r14)
                goto L4a
            L10:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                r13 = 0
                return r13
            L17:
                defpackage.uj50.b(r14)
                goto L2e
            L1b:
                defpackage.uj50.b(r14)
                r13.a = r3
                fmt r14 = r13.b
                xmt r1 = r13.c
                r4 = 0
                r5 = 12
                java.lang.Object r14 = fmt.a.b(r14, r1, r4, r13, r5)
                if (r14 != r0) goto L2e
                goto L49
            L2e:
                boolean r14 = r13.d
                if (r14 == 0) goto L35
                r3 = 2147483647(0x7fffffff, float:NaN)
            L35:
                r6 = r3
                r13.a = r2
                fmt r4 = r13.b
                xmt r5 = r13.c
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r12 = 2042(0x7fa, float:2.861E-42)
                r11 = r13
                java.lang.Object r13 = fmt.a.a(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r13 != r0) goto L4a
            L49:
                return r0
            L4a:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: u2f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public u2f(List<? extends Pair<? extends fmt, ? extends xmt>> list, boolean z, v1b<? super u2f> v1bVar) {
        super(2, v1bVar);
        this.c = list;
        this.d = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        u2f u2fVar = new u2f(this.c, this.d, v1bVar);
        u2fVar.b = obj;
        return u2fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u2f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            List<Pair<fmt, xmt>> list = this.c;
            ArrayList arrayList = new ArrayList(l48.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                arrayList.add(ej5.c(v5bVar, null, null, new a((fmt) pair.a, (xmt) pair.b, this.d, null), 3));
            }
            this.b = null;
            this.a = 1;
            if (up1.c(arrayList, this) == y5bVar) {
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
