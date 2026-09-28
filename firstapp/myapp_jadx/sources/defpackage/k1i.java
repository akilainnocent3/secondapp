package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class k1i implements lyh<Object> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ iaj b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<myh<Object>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ iaj d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, iaj iajVar) {
            super(3, v1bVar);
            this.d = iajVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<Object> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            a aVar = new a(v1bVar, this.d);
            aVar.b = myhVar;
            aVar.c = objArr;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r1.emit(r8, r7) == r0) goto L15;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                y5b r0 = defpackage.y5b.a
                int r1 = r7.a
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1d
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r8)
                goto L43
            L11:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r2
            L17:
                myh r1 = r7.b
                defpackage.uj50.b(r8)
                goto L38
            L1d:
                defpackage.uj50.b(r8)
                myh r1 = r7.b
                java.lang.Object[] r8 = r7.c
                r5 = 0
                r5 = r8[r5]
                r6 = r8[r4]
                r8 = r8[r3]
                r7.b = r1
                r7.a = r4
                iaj r4 = r7.d
                java.lang.Object r8 = r4.d(r5, r6, r8, r7)
                if (r8 != r0) goto L38
                goto L42
            L38:
                r7.b = r2
                r7.a = r3
                java.lang.Object r7 = r1.emit(r8, r7)
                if (r7 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k1i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k1i(lyh[] lyhVarArr, iaj iajVar) {
        this.a = lyhVarArr;
        this.b = iajVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objA = r78.a(v1bVar, myhVar, new a(null, this.b), q1i.a, this.a);
        return objA == y5b.a ? objA : Unit.a;
    }
}
