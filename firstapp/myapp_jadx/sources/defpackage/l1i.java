package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class l1i implements lyh<Object> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ jaj b;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
    public static final class a extends tje0 implements gaj<myh<Object>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ jaj d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, jaj jajVar) {
            super(3, v1bVar);
            this.d = jajVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<Object> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            a aVar = new a(v1bVar, this.d);
            aVar.b = myhVar;
            aVar.c = objArr;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
        
            if (r1.emit(r13, r11) == r0) goto L15;
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L1e
                if (r1 == r4) goto L17
                if (r1 != r3) goto L11
                defpackage.uj50.b(r13)
                goto L48
            L11:
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r12)
                return r2
            L17:
                myh r1 = r12.b
                defpackage.uj50.b(r13)
                r11 = r12
                goto L3d
            L1e:
                defpackage.uj50.b(r13)
                myh r1 = r12.b
                java.lang.Object[] r13 = r12.c
                r5 = 0
                r7 = r13[r5]
                r8 = r13[r4]
                r9 = r13[r3]
                r5 = 3
                r10 = r13[r5]
                r12.b = r1
                r12.a = r4
                jaj r6 = r12.d
                r11 = r12
                java.lang.Object r13 = r6.l(r7, r8, r9, r10, r11)
                if (r13 != r0) goto L3d
                goto L47
            L3d:
                r11.b = r2
                r11.a = r3
                java.lang.Object r12 = r1.emit(r13, r11)
                if (r12 != r0) goto L48
            L47:
                return r0
            L48:
                kotlin.Unit r12 = kotlin.Unit.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: l1i.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public l1i(lyh[] lyhVarArr, jaj jajVar) {
        this.a = lyhVarArr;
        this.b = jajVar;
    }

    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b v1bVar) {
        Object objA = r78.a(v1bVar, myhVar, new a(null, this.b), q1i.a, this.a);
        return objA == y5b.a ? objA : Unit.a;
    }
}
