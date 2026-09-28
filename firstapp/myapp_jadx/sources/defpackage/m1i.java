package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class m1i implements lyh<Object> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ kaj b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<myh<Object>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ kaj d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, kaj kajVar) {
            super(3, v1bVar);
            this.d = kajVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<Object> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            a aVar = new a(v1bVar, this.d);
            aVar.b = myhVar;
            aVar.c = objArr;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r1.emit(r14, r12) == r0) goto L15;
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r14)
                goto L4b
            L11:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r2
            L17:
                myh r1 = r13.b
                defpackage.uj50.b(r14)
                r12 = r13
                goto L40
            L1e:
                defpackage.uj50.b(r14)
                myh r1 = r13.b
                java.lang.Object[] r14 = r13.c
                r5 = 0
                r7 = r14[r5]
                r8 = r14[r4]
                r9 = r14[r3]
                r5 = 3
                r10 = r14[r5]
                r5 = 4
                r11 = r14[r5]
                r13.b = r1
                r13.a = r4
                kaj r6 = r13.d
                r12 = r13
                java.lang.Object r14 = r6.f(r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L40
                goto L4a
            L40:
                r12.b = r2
                r12.a = r3
                java.lang.Object r13 = r1.emit(r14, r12)
                if (r13 != r0) goto L4b
            L4a:
                return r0
            L4b:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: m1i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public m1i(lyh[] lyhVarArr, kaj kajVar) {
        this.a = lyhVarArr;
        this.b = kajVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objA = r78.a(v1bVar, myhVar, new a(null, this.b), q1i.a, this.a);
        return objA == y5b.a ? objA : Unit.a;
    }
}
