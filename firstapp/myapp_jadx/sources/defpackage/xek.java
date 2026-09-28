package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.domain.GetStreamScheduleUseCase$getStreamSchedule$1", f = "GetStreamScheduleUseCase.kt", l = {40, DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class xek extends tje0 implements Function2<myh<? super fgr>, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ bfk d;
    public final /* synthetic */ qcn<esq> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xek(bfk bfkVar, qcn<esq> qcnVar, v1b<? super xek> v1bVar) {
        super(2, v1bVar);
        this.d = bfkVar;
        this.e = qcnVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xek xekVar = new xek(this.d, this.e, v1bVar);
        xekVar.c = obj;
        return xekVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super fgr> myhVar, v1b<? super Unit> v1bVar) {
        return ((xek) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f2 A[PHI: r8 r16
      0x00f2: PHI (r8v0 long) = (r8v1 long), (r8v2 long) binds: [B:51:0x00ee, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]
      0x00f2: PHI (r16v0 qcn<esq>) = (r16v3 qcn<esq>), (r16v6 qcn<esq>) binds: [B:51:0x00ee, B:9:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:56:0x0101  */
    /* JADX WARN: Code duplicated, block: B:58:0x0113  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x0145  */
    /* JADX WARN: Code duplicated, block: B:76:0x0150  */
    /* JADX WARN: Code duplicated, block: B:81:0x0163  */
    /* JADX WARN: Code duplicated, block: B:83:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00fb A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015b, code lost:
    
        if (defpackage.hkd.b(r3, r17) == r2) goto L79;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x015b -> B:80:0x015e). Please report as a decompilation issue!!! */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xek.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
