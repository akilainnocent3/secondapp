package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.common.framework.loading.LoadingTaskKt$loadingFlow$1", f = "LoadingTask.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 1)
public final class mzs extends tje0 implements Function2<myh<? super List<? extends kzs<?>>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Function1<v1b<? super List<? extends kzs<?>>>, Object> c;
    public final /* synthetic */ dq40<Map<kzs<?>, xxs<?>>> d;
    public final /* synthetic */ bq40 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mzs(Function1<? super v1b<? super List<? extends kzs<?>>>, ? extends Object> function1, dq40<Map<kzs<?>, xxs<?>>> dq40Var, bq40 bq40Var, v1b<? super mzs> v1bVar) {
        super(2, v1bVar);
        this.c = function1;
        this.d = dq40Var;
        this.e = bq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        mzs mzsVar = new mzs(this.c, this.d, this.e, v1bVar);
        mzsVar.b = obj;
        return mzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends kzs<?>>> myhVar, v1b<? super Unit> v1bVar) {
        return ((mzs) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L26;
     */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.util.LinkedHashMap] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r7.a
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L16
            defpackage.uj50.b(r8)
            goto L87
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r5
        L1c:
            defpackage.uj50.b(r8)
            goto L30
        L20:
            defpackage.uj50.b(r8)
            r7.b = r0
            r7.a = r4
            kotlin.jvm.functions.Function1<v1b<? super java.util.List<? extends kzs<?>>>, java.lang.Object> r8 = r7.c
            java.lang.Object r8 = r8.invoke(r7)
            if (r8 != r1) goto L30
            goto L86
        L30:
            java.util.List r8 = (java.util.List) r8
            r2 = 10
            int r2 = defpackage.l48.r(r8, r2)
            int r2 = defpackage.jpu.a(r2)
            r4 = 16
            if (r2 >= r4) goto L41
            r2 = r4
        L41:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r2)
            java.util.Iterator r2 = r8.iterator()
        L4a:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L5a
            java.lang.Object r6 = r2.next()
            kzs r6 = (defpackage.kzs) r6
            r4.put(r6, r5)
            goto L4a
        L5a:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r4)
            dq40<java.util.Map<kzs<?>, xxs<?>>> r4 = r7.d
            r4.a = r2
            java.util.Iterator r2 = r8.iterator()
            r4 = 0
        L68:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L78
            java.lang.Object r6 = r2.next()
            kzs r6 = (defpackage.kzs) r6
            int r6 = r6.b
            int r4 = r4 + r6
            goto L68
        L78:
            bq40 r2 = r7.e
            r2.a = r4
            r7.b = r5
            r7.a = r3
            java.lang.Object r7 = r0.emit(r8, r7)
            if (r7 != r1) goto L87
        L86:
            return r1
        L87:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mzs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
