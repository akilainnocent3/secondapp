package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;
import com.sporty.android.book.domain.entity.MarketGroup;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.book.data.repository.marketGroups.MarketGroupsRepositoryImpl$getSortedMarketGroups$1", f = "MarketGroupsRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER, RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
public final class aqu extends tje0 implements Function2<myh<? super List<? extends MarketGroup>>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bqu c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqu(bqu bquVar, String str, v1b<? super aqu> v1bVar) {
        super(2, v1bVar);
        this.c = bquVar;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        aqu aquVar = new aqu(this.c, this.d, v1bVar);
        aquVar.b = obj;
        return aquVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends MarketGroup>> myhVar, v1b<? super Unit> v1bVar) {
        return ((aqu) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01c9, code lost:
    
        if (r0.emit(r4, r11) == r1) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqu.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
