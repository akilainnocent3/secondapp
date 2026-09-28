package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sporty.android.core.model.gift.GiftGroup;
import java.util.Comparator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.plugin.common.gift.usecase.QuickBetSingleGiftSelectedUseCase$parseGiftDataAndGetFirstInternal$1", f = "QuickBetSingleGiftSelectedUseCase.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 63, 71}, m = "invokeSuspend", v = 2)
public final class nc30 extends tje0 implements Function2<myh<? super n780>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oc30 c;
    public final /* synthetic */ List<GiftGroup> d;

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return Long.valueOf(((GiftDetails) t2).getCurrentBalance()).compareTo(Long.valueOf(((GiftDetails) t).getCurrentBalance()));
        }
    }

    public static final class b<T> implements Comparator {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            int iCompare = this.a.compare(t, t2);
            return iCompare != 0 ? iCompare : Long.valueOf(((GiftDetails) t).getExpireTime()).compareTo(Long.valueOf(((GiftDetails) t2).getExpireTime()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nc30(oc30 oc30Var, List<GiftGroup> list, v1b<? super nc30> v1bVar) {
        super(2, v1bVar);
        this.c = oc30Var;
        this.d = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nc30 nc30Var = new nc30(this.c, this.d, v1bVar);
        nc30Var.b = obj;
        return nc30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super n780> myhVar, v1b<? super Unit> v1bVar) {
        return ((nc30) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x010d, code lost:
    
        if (r1.emit(r3, r62) == r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0222, code lost:
    
        if (r1.emit(r3, r62) == r2) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0242, code lost:
    
        if (r1.emit(r3, r62) == r2) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [m2g] */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r13v2, types: [m2g] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v1, types: [com.sporty.android.core.model.gift.GiftDetails] */
    /* JADX WARN: Type inference failed for: r8v1, types: [zpk] */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r63) {
        /*
            Method dump skipped, instruction units count: 584
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nc30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
