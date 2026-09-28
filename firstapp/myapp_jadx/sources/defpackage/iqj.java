package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.sportybet.ntespm.socket.protobuf.NP.tYcQsJyaojE;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1$1$4", f = "GameplayScreen.kt", l = {276}, m = "invokeSuspend", v = 1)
public final class iqj extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ooj c;
    public final /* synthetic */ Map<Long, gly> d;
    public final /* synthetic */ ytw e;
    public final /* synthetic */ Map<Long, s28> f;
    public final /* synthetic */ m6a0<Long, Boolean> i;
    public final /* synthetic */ SnapshotStateList<q28> v;
    public final /* synthetic */ long[] w;

    /* JADX INFO: loaded from: classes7.dex */
    @c0d(c = "com.sportygames.piggybash.presentation.screens.GameplayScreenKt$GameplayScreen$2$1$1$4$1$1", f = "GameplayScreen.kt", l = {285, 286}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ pr50 c;
        public final /* synthetic */ Map<Long, gly> d;
        public final /* synthetic */ ytw e;
        public final /* synthetic */ Map<Long, s28> f;
        public final /* synthetic */ m6a0<Long, Boolean> i;
        public final /* synthetic */ SnapshotStateList<q28> v;
        public final /* synthetic */ long[] w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, pr50 pr50Var, Map map, ytw ytwVar, Map map2, m6a0 m6a0Var, SnapshotStateList snapshotStateList, long[] jArr, v1b v1bVar) {
            super(2, v1bVar);
            this.b = i;
            this.c = pr50Var;
            this.d = map;
            this.e = ytwVar;
            this.f = map2;
            this.i = m6a0Var;
            this.v = snapshotStateList;
            this.w = jArr;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (defpackage.eqj.d(r12.d, r12.e, r12.f, r12.i, r12.v, r12.w, r12.c, true, r12) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r12.a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto L10
                defpackage.uj50.b(r13)
                goto L46
            L10:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                r12 = 0
                return r12
            L17:
                defpackage.uj50.b(r13)
                goto L2d
            L1b:
                defpackage.uj50.b(r13)
                int r13 = r12.b
                long r4 = (long) r13
                r6 = 300(0x12c, double:1.48E-321)
                long r4 = r4 * r6
                r12.a = r3
                java.lang.Object r13 = defpackage.hkd.b(r4, r12)
                if (r13 != r0) goto L2d
                goto L45
            L2d:
                r12.a = r2
                java.util.Map<java.lang.Long, gly> r3 = r12.d
                ytw r4 = r12.e
                java.util.Map<java.lang.Long, s28> r5 = r12.f
                m6a0<java.lang.Long, java.lang.Boolean> r6 = r12.i
                androidx.compose.runtime.snapshots.SnapshotStateList<q28> r7 = r12.v
                long[] r8 = r12.w
                pr50 r9 = r12.c
                r10 = 1
                r11 = r12
                java.lang.Object r12 = defpackage.eqj.d(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r12 != r0) goto L46
            L45:
                return r0
            L46:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: iqj.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqj(ooj oojVar, Map map, ytw ytwVar, Map map2, m6a0 m6a0Var, SnapshotStateList snapshotStateList, long[] jArr, v1b v1bVar) {
        super(2, v1bVar);
        this.c = oojVar;
        this.d = map;
        this.e = ytwVar;
        this.f = map2;
        this.i = m6a0Var;
        this.v = snapshotStateList;
        this.w = jArr;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        iqj iqjVar = new iqj(this.c, this.d, this.e, this.f, this.i, this.v, this.w, v1bVar);
        iqjVar.b = obj;
        return iqjVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((iqj) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ooj oojVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            long j = ((ooj.a) oojVar).b ? 300L : 400L;
            this.b = v5bVar;
            this.a = 1;
            if (hkd.b(j, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(tYcQsJyaojE.NDmrXFHbusZqKN);
                return null;
            }
            uj50.b(obj);
        }
        ArrayList arrayList = ((ooj.a) oojVar).a;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            int i4 = i3 + 1;
            if (i3 < 0) {
                b.q();
                throw null;
            }
            ej5.c(v5bVar, null, null, new a(i3, (pr50) obj2, this.d, this.e, this.f, this.i, this.v, this.w, null), 3);
            i3 = i4;
        }
        return Unit.a;
    }
}
