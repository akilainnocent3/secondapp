package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.book.domain.entity.SportLists;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.SportyBookRepositoryImpl$getSportListAndPopulars$1", f = "SportyBookRepositoryImpl.kt", l = {40, DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class vkb0 extends tje0 implements Function2<myh<? super SportLists>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pkb0 c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ Long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vkb0(pkb0 pkb0Var, Long l, Long l2, Long l3, v1b<? super vkb0> v1bVar) {
        super(2, v1bVar);
        this.c = pkb0Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vkb0 vkb0Var = new vkb0(this.c, this.d, this.e, this.f, v1bVar);
        vkb0Var.b = obj;
        return vkb0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super SportLists> myhVar, v1b<? super Unit> v1bVar) {
        return ((vkb0) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r0.emit(r12, r11) == r1) goto L17;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            r12 = this;
            java.lang.Object r0 = r12.b
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r12.a
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L20
            if (r2 == r5) goto L1b
            if (r2 != r4) goto L15
            defpackage.uj50.b(r13)
            goto L57
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r12)
            return r3
        L1b:
            defpackage.uj50.b(r13)
            r11 = r12
            goto L3f
        L20:
            defpackage.uj50.b(r13)
            pkb0 r13 = r12.c
            jkb0 r6 = r13.a
            com.sporty.android.book.domain.entity.ProductType r13 = com.sporty.android.book.domain.entity.ProductType.PRE_MATCH
            int r7 = r13.getValue()
            r12.b = r0
            r12.a = r5
            java.lang.Long r8 = r12.d
            java.lang.Long r9 = r12.e
            java.lang.Long r10 = r12.f
            r11 = r12
            java.lang.Object r13 = r6.b(r7, r8, r9, r10, r11)
            if (r13 != r1) goto L3f
            goto L56
        L3f:
            com.sporty.android.common.network.data.BaseResponse r13 = (com.sporty.android.common.network.data.BaseResponse) r13
            boolean r12 = r13.hasData()
            if (r12 == 0) goto L5a
            T r12 = r13.data
            r12.getClass()
            r11.b = r3
            r11.a = r4
            java.lang.Object r12 = r0.emit(r12, r11)
            if (r12 != r1) goto L57
        L56:
            return r1
        L57:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L5a:
            java.lang.Exception r12 = new java.lang.Exception
            java.lang.String r13 = r13.message
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
