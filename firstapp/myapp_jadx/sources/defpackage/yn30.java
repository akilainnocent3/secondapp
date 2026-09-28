package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportygames.refscall.domain.usecase.RCFetchInitDataUseCaseImpl$getOldCMSPagesFlow$3", f = "RCFetchInitDataUseCaseImpl.kt", l = {157, 162}, m = "invokeSuspend", v = 1)
public final class yn30 extends tje0 implements Function2<myh<? super List<? extends File>>, v1b<? super Unit>, Object> {
    public zn30 a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zn30 d;
    public final /* synthetic */ String[] e;

    public static final class a implements Function1<ArrayList<File>, Unit> {
        public final /* synthetic */ nr60 a;

        public a(nr60 nr60Var) {
            this.a = nr60Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ArrayList<File> arrayList) {
            ArrayList<File> arrayList2 = arrayList;
            arrayList2.getClass();
            zi50.a aVar = zi50.b;
            this.a.resumeWith(arrayList2);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn30(zn30 zn30Var, String[] strArr, v1b<? super yn30> v1bVar) {
        super(2, v1bVar);
        this.d = zn30Var;
        this.e = strArr;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        yn30 yn30Var = new yn30(this.d, this.e, v1bVar);
        yn30Var.c = obj;
        return yn30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends File>> myhVar, v1b<? super Unit> v1bVar) {
        return ((yn30) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r0.emit((java.util.List) r9, r8) == r1) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.Object r0 = r8.c
            myh r0 = (defpackage.myh) r0
            y5b r1 = defpackage.y5b.a
            int r2 = r8.b
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L23
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            zn30 r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            defpackage.uj50.b(r9)
            goto L64
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r8)
            return r5
        L1f:
            defpackage.uj50.b(r9)
            goto L55
        L23:
            defpackage.uj50.b(r9)
            r8.c = r0
            zn30 r9 = r8.d
            r8.a = r9
            r8.b = r4
            nr60 r2 = new nr60
            v1b r4 = defpackage.yzo.b(r8)
            r2.<init>(r4)
            vmy r4 = r9.g
            java.lang.String[] r6 = r8.e
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.util.ArrayList r6 = kotlin.collections.b.f(r6)
            yn30$a r7 = new yn30$a
            r7.<init>(r2)
            android.content.Context r9 = r9.f
            r4.a(r6, r7, r9)
            java.lang.Object r9 = r2.a()
            if (r9 != r1) goto L55
            goto L63
        L55:
            java.util.List r9 = (java.util.List) r9
            r8.c = r5
            r8.a = r5
            r8.b = r3
            java.lang.Object r8 = r0.emit(r9, r8)
            if (r8 != r1) goto L64
        L63:
            return r1
        L64:
            kotlin.Unit r8 = kotlin.Unit.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn30.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
